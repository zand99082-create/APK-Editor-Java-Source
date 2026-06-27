package jadx.core.dex.nodes;

import android.support.v4.app.FragmentTransaction;
import com.p046a.p047a.C0485b;
import com.p046a.p047a.C0486c;
import com.p046a.p047a.C0487d;
import com.p046a.p047a.C0488e;
import jadx.core.Consts;
import jadx.core.codegen.CodeWriter;
import jadx.core.deobf.Deobfuscator;
import jadx.core.dex.attributes.AType;
import jadx.core.dex.attributes.annotations.Annotation;
import jadx.core.dex.attributes.nodes.JadxErrorAttr;
import jadx.core.dex.attributes.nodes.LineAttrNode;
import jadx.core.dex.attributes.nodes.SourceFileAttr;
import jadx.core.dex.info.AccessInfo;
import jadx.core.dex.info.ClassInfo;
import jadx.core.dex.info.FieldInfo;
import jadx.core.dex.info.MethodInfo;
import jadx.core.dex.instructions.args.ArgType;
import jadx.core.dex.instructions.args.LiteralArg;
import jadx.core.dex.instructions.args.PrimitiveType;
import jadx.core.dex.nodes.parser.AnnotationsParser;
import jadx.core.dex.nodes.parser.FieldInitAttr;
import jadx.core.dex.nodes.parser.SignatureParser;
import jadx.core.dex.nodes.parser.StaticValuesParser;
import jadx.core.utils.exceptions.DecodeException;
import jadx.core.utils.exceptions.JadxRuntimeException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class ClassNode extends LineAttrNode implements ILoadable {
    private final AccessInfo accessFlags;
    private final ClassInfo clsInfo;
    private CodeWriter code;
    private Map constFields;
    private final Set dependencies;
    private final DexNode dex;
    private final List fields;
    private Map genericMap;
    private List innerClasses;
    private List interfaces;
    private final List methods;
    private Map mthInfoMap;
    private ClassNode parentClass;
    private ProcessState state;
    private ArgType superClass;

    public ClassNode(DexNode dexNode, C0488e c0488e) throws DecodeException {
        this.constFields = Collections.emptyMap();
        this.innerClasses = Collections.emptyList();
        this.state = ProcessState.NOT_LOADED;
        this.dependencies = new HashSet();
        this.mthInfoMap = Collections.emptyMap();
        this.dex = dexNode;
        this.clsInfo = ClassInfo.fromDex(dexNode, c0488e.m586b());
        try {
            if (c0488e.m587c() == -1) {
                this.superClass = null;
            } else {
                this.superClass = dexNode.getType(c0488e.m587c());
            }
            this.interfaces = new ArrayList(c0488e.m589e().length);
            for (short s : c0488e.m589e()) {
                this.interfaces.add(dexNode.getType(s));
            }
            if (c0488e.m593i() != 0) {
                C0485b classData = dexNode.readClassData(c0488e);
                int length = classData.m578c().length + classData.m579d().length;
                int length2 = classData.m576a().length + classData.m577b().length;
                this.methods = new ArrayList(length);
                this.fields = new ArrayList(length2);
                for (C0487d c0487d : classData.m578c()) {
                    this.methods.add(new MethodNode(this, c0487d, false));
                }
                for (C0487d c0487d2 : classData.m579d()) {
                    this.methods.add(new MethodNode(this, c0487d2, true));
                }
                for (C0486c c0486c : classData.m576a()) {
                    this.fields.add(new FieldNode(this, c0486c));
                }
                loadStaticValues(c0488e, this.fields);
                for (C0486c c0486c2 : classData.m577b()) {
                    this.fields.add(new FieldNode(this, c0486c2));
                }
            } else {
                this.methods = Collections.emptyList();
                this.fields = Collections.emptyList();
            }
            loadAnnotations(c0488e);
            parseClassSignature();
            setFieldsTypesFromSignature();
            int iM591g = c0488e.m591g();
            if (iM591g != -1) {
                addSourceFilenameAttr(dexNode.getString(iM591g));
            }
            Annotation annotation = getAnnotation(Consts.DALVIK_INNER_CLASS);
            this.accessFlags = new AccessInfo(annotation != null ? ((Integer) annotation.getValues().get("accessFlags")).intValue() : c0488e.m590f(), AccessInfo.AFType.CLASS);
            buildCache();
        } catch (Exception e) {
            throw new DecodeException("Error decode class: " + this.clsInfo, e);
        }
    }

    public ClassNode(DexNode dexNode, ClassInfo classInfo) {
        this.constFields = Collections.emptyMap();
        this.innerClasses = Collections.emptyList();
        this.state = ProcessState.NOT_LOADED;
        this.dependencies = new HashSet();
        this.mthInfoMap = Collections.emptyMap();
        this.dex = dexNode;
        this.clsInfo = classInfo;
        this.interfaces = Collections.emptyList();
        this.methods = Collections.emptyList();
        this.fields = Collections.emptyList();
        this.accessFlags = new AccessInfo(FragmentTransaction.TRANSIT_FRAGMENT_OPEN, AccessInfo.AFType.CLASS);
        this.parentClass = this;
    }

    private void addSourceFilenameAttr(String str) {
        if (str == null) {
            return;
        }
        if (str.endsWith(".java")) {
            str = str.substring(0, str.length() - 5);
        }
        if (str.isEmpty() || str.equals("SourceFile") || str.equals("\"")) {
            return;
        }
        if (this.clsInfo != null) {
            String shortName = this.clsInfo.getShortName();
            if (str.equals(shortName)) {
                return;
            }
            if (str.contains(Deobfuscator.INNER_CLASS_SEPARATOR) && str.endsWith(Deobfuscator.INNER_CLASS_SEPARATOR + shortName)) {
                return;
            }
            ClassInfo topParentClass = this.clsInfo.getTopParentClass();
            if (topParentClass != null && str.equals(topParentClass.getShortName())) {
                return;
            }
        }
        addAttr(new SourceFileAttr(str));
    }

    private void buildCache() {
        this.mthInfoMap = new HashMap(this.methods.size());
        for (MethodNode methodNode : this.methods) {
            this.mthInfoMap.put(methodNode.getMethodInfo(), methodNode);
        }
    }

    private void loadAnnotations(C0488e c0488e) {
        int iM592h = c0488e.m592h();
        if (iM592h != 0) {
            try {
                new AnnotationsParser(this).parse(iM592h);
            } catch (Exception e) {
            }
        }
    }

    private void loadStaticValues(C0488e c0488e, List list) {
        int iProcessFields;
        FieldInitAttr fieldInitAttr;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            FieldNode fieldNode = (FieldNode) it.next();
            if (fieldNode.getAccessFlags().isFinal()) {
                fieldNode.addAttr(FieldInitAttr.NULL_VALUE);
            }
        }
        int iM594j = c0488e.m594j();
        if (iM594j == 0 || (iProcessFields = new StaticValuesParser(this.dex, this.dex.openSection(iM594j)).processFields(list)) == 0) {
            return;
        }
        this.constFields = new LinkedHashMap(iProcessFields);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            FieldNode fieldNode2 = (FieldNode) it2.next();
            AccessInfo accessFlags = fieldNode2.getAccessFlags();
            if (accessFlags.isStatic() && accessFlags.isFinal() && (fieldInitAttr = (FieldInitAttr) fieldNode2.get(AType.FIELD_INIT)) != null && fieldInitAttr.getValue() != null && fieldInitAttr.getValueType() == FieldInitAttr.InitType.CONST) {
                if (accessFlags.isPublic()) {
                    this.dex.getConstFields().put(fieldInitAttr.getValue(), fieldNode2);
                }
                this.constFields.put(fieldInitAttr.getValue(), fieldNode2);
            }
        }
    }

    private void parseClassSignature() {
        ArgType argTypeConsumeType;
        SignatureParser signatureParserFromNode = SignatureParser.fromNode(this);
        if (signatureParserFromNode == null) {
            return;
        }
        try {
            this.genericMap = signatureParserFromNode.consumeGenericMap();
            this.superClass = signatureParserFromNode.consumeType();
            for (int i = 0; i < this.interfaces.size() && (argTypeConsumeType = signatureParserFromNode.consumeType()) != null; i++) {
                this.interfaces.set(i, argTypeConsumeType);
            }
        } catch (JadxRuntimeException e) {
        }
    }

    private void setFieldsTypesFromSignature() {
        for (FieldNode fieldNode : this.fields) {
            SignatureParser signatureParserFromNode = SignatureParser.fromNode(fieldNode);
            if (signatureParserFromNode != null) {
                try {
                    ArgType argTypeConsumeType = signatureParserFromNode.consumeType();
                    if (argTypeConsumeType != null) {
                        fieldNode.setType(argTypeConsumeType);
                    }
                } catch (JadxRuntimeException e) {
                }
            }
        }
    }

    public void addInnerClass(ClassNode classNode) {
        if (this.innerClasses.isEmpty()) {
            this.innerClasses = new ArrayList(3);
        }
        this.innerClasses.add(classNode);
    }

    public DexNode dex() {
        return this.dex;
    }

    public AccessInfo getAccessFlags() {
        return this.accessFlags;
    }

    public ClassInfo getAlias() {
        return this.clsInfo.getAlias();
    }

    public ClassInfo getClassInfo() {
        return this.clsInfo;
    }

    public MethodNode getClassInitMth() {
        return searchMethodByName("<clinit>()V");
    }

    public CodeWriter getCode() {
        return this.code;
    }

    public FieldNode getConstField(Object obj) {
        return getConstField(obj, true);
    }

    public FieldNode getConstField(Object obj, boolean z) {
        FieldNode fieldNode;
        String str;
        ClassNode classNodeResolveClass = this;
        do {
            fieldNode = (FieldNode) classNodeResolveClass.constFields.get(obj);
            if (fieldNode != null || classNodeResolveClass.clsInfo.getParentClass() == null) {
                break;
            }
            classNodeResolveClass = this.dex.resolveClass(classNodeResolveClass.clsInfo.getParentClass());
        } while (classNodeResolveClass != null);
        FieldNode fieldNode2 = (fieldNode == null && z) ? (FieldNode) this.dex.getConstFields().get(obj) : fieldNode;
        if ((obj instanceof Integer) && (str = (String) this.dex.root().getResourcesNames().get(obj)) != null) {
            ResRefField resRefField = new ResRefField(this.dex, str.replace('/', '.'));
            if (fieldNode2 == null) {
                return resRefField;
            }
            if (!fieldNode2.getName().equals(resRefField.getName())) {
                fieldNode2 = resRefField;
            }
        }
        return fieldNode2;
    }

    public FieldNode getConstFieldByLiteralArg(LiteralArg literalArg) {
        PrimitiveType primitiveType = literalArg.getType().getPrimitiveType();
        if (primitiveType == null) {
            return null;
        }
        long literal = literalArg.getLiteral();
        switch (primitiveType) {
            case BOOLEAN:
                break;
            case CHAR:
                break;
            case BYTE:
                break;
            case SHORT:
                break;
            case INT:
                break;
            case LONG:
                break;
            case FLOAT:
                float fIntBitsToFloat = Float.intBitsToFloat((int) literal);
                break;
            case DOUBLE:
                double dLongBitsToDouble = Double.longBitsToDouble(literal);
                break;
        }
        return null;
    }

    public MethodNode getDefaultConstructor() {
        for (MethodNode methodNode : this.methods) {
            if (methodNode.isDefaultConstructor()) {
                return methodNode;
            }
        }
        return null;
    }

    public Set getDependencies() {
        return this.dependencies;
    }

    public List getFields() {
        return this.fields;
    }

    public String getFullName() {
        return this.clsInfo.getAlias().getFullName();
    }

    public Map getGenericMap() {
        return this.genericMap;
    }

    public List getInnerClasses() {
        return this.innerClasses;
    }

    public List getInterfaces() {
        return this.interfaces;
    }

    public List getMethods() {
        return this.methods;
    }

    public String getPackage() {
        return this.clsInfo.getAlias().getPackage();
    }

    public ClassNode getParentClass() {
        if (this.parentClass == null) {
            if (this.clsInfo.isInner()) {
                ClassNode classNodeResolveClass = dex().resolveClass(this.clsInfo.getParentClass());
                if (classNodeResolveClass == null) {
                    classNodeResolveClass = this;
                }
                this.parentClass = classNodeResolveClass;
            } else {
                this.parentClass = this;
            }
        }
        return this.parentClass;
    }

    public String getRawName() {
        return this.clsInfo.getRawName();
    }

    public String getShortName() {
        return this.clsInfo.getAlias().getShortName();
    }

    public ProcessState getState() {
        return this.state;
    }

    public ArgType getSuperClass() {
        return this.superClass;
    }

    public ClassNode getTopParentClass() {
        ClassNode parentClass = getParentClass();
        return parentClass == this ? this : parentClass.getParentClass();
    }

    public boolean isAnonymous() {
        return this.clsInfo.isInner() && this.clsInfo.getAlias().getShortName().startsWith(Consts.ANONYMOUS_CLASS_PREFIX) && getDefaultConstructor() != null;
    }

    public boolean isEnum() {
        return getAccessFlags().isEnum() && getSuperClass() != null && getSuperClass().getObject().equals(ArgType.ENUM.getObject());
    }

    @Override // jadx.core.dex.nodes.ILoadable
    public void load() {
        for (MethodNode methodNode : getMethods()) {
            try {
                methodNode.load();
            } catch (Exception e) {
                methodNode.addAttr(new JadxErrorAttr(e));
            }
        }
        Iterator it = getInnerClasses().iterator();
        while (it.hasNext()) {
            ((ClassNode) it.next()).load();
        }
    }

    public FieldNode searchField(FieldInfo fieldInfo) {
        for (FieldNode fieldNode : this.fields) {
            if (fieldNode.getFieldInfo().equals(fieldInfo)) {
                return fieldNode;
            }
        }
        return null;
    }

    public FieldNode searchFieldById(int i) {
        return searchField(FieldInfo.fromDex(this.dex, i));
    }

    public FieldNode searchFieldByName(String str) {
        for (FieldNode fieldNode : this.fields) {
            if (fieldNode.getName().equals(str)) {
                return fieldNode;
            }
        }
        return null;
    }

    public MethodNode searchMethod(MethodInfo methodInfo) {
        return (MethodNode) this.mthInfoMap.get(methodInfo);
    }

    public MethodNode searchMethodById(int i) {
        return searchMethodByName(MethodInfo.fromDex(this.dex, i).getShortId());
    }

    public MethodNode searchMethodByName(String str) {
        for (MethodNode methodNode : this.methods) {
            if (methodNode.getMethodInfo().getShortId().equals(str)) {
                return methodNode;
            }
        }
        return null;
    }

    public void setCode(CodeWriter codeWriter) {
        this.code = codeWriter;
    }

    public void setState(ProcessState processState) {
        this.state = processState;
    }

    public String toString() {
        return this.clsInfo.getFullName();
    }

    @Override // jadx.core.dex.nodes.ILoadable
    public void unload() {
        Iterator it = getMethods().iterator();
        while (it.hasNext()) {
            ((MethodNode) it.next()).unload();
        }
        Iterator it2 = getInnerClasses().iterator();
        while (it2.hasNext()) {
            ((ClassNode) it2.next()).unload();
        }
    }
}
