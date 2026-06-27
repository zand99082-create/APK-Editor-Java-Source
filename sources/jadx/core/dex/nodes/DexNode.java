package jadx.core.dex.nodes;

import com.p046a.p047a.C0484ab;
import com.p046a.p047a.C0485b;
import com.p046a.p047a.C0487d;
import com.p046a.p047a.C0488e;
import com.p046a.p047a.C0489f;
import com.p046a.p047a.C0492i;
import com.p046a.p047a.C0498o;
import com.p046a.p047a.C0506w;
import com.p046a.p047a.C0507x;
import com.p046a.p047a.C0508y;
import jadx.core.dex.info.ClassInfo;
import jadx.core.dex.info.FieldInfo;
import jadx.core.dex.info.InfoStorage;
import jadx.core.dex.info.MethodInfo;
import jadx.core.dex.instructions.args.ArgType;
import jadx.core.utils.files.InputFile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class DexNode {
    public static final int NO_INDEX = -1;
    private final C0492i dexBuf;
    private final InputFile file;
    private final RootNode root;
    private final List classes = new ArrayList();
    private final Map clsMap = new HashMap();
    private final Map constFields = new HashMap();
    private final InfoStorage infoStorage = new InfoStorage();

    public DexNode(RootNode rootNode, InputFile inputFile) {
        this.root = rootNode;
        this.file = inputFile;
        this.dexBuf = inputFile.getDexBuffer();
    }

    private MethodNode deepResolveMethod(ClassNode classNode, String str) {
        MethodNode methodNodeDeepResolveMethod;
        ClassNode classNodeResolveClass;
        MethodNode methodNodeDeepResolveMethod2;
        for (MethodNode methodNode : classNode.getMethods()) {
            if (methodNode.getMethodInfo().getShortId().startsWith(str)) {
                return methodNode;
            }
        }
        ArgType superClass = classNode.getSuperClass();
        if (superClass != null && (classNodeResolveClass = resolveClass(superClass)) != null && (methodNodeDeepResolveMethod2 = deepResolveMethod(classNodeResolveClass, str)) != null) {
            return methodNodeDeepResolveMethod2;
        }
        Iterator it = classNode.getInterfaces().iterator();
        while (it.hasNext()) {
            ClassNode classNodeResolveClass2 = resolveClass((ArgType) it.next());
            if (classNodeResolveClass2 != null && (methodNodeDeepResolveMethod = deepResolveMethod(classNodeResolveClass2, str)) != null) {
                return methodNodeDeepResolveMethod;
            }
        }
        return null;
    }

    public MethodNode deepResolveMethod(MethodInfo methodInfo) {
        ClassNode classNodeResolveClass = resolveClass(methodInfo.getDeclClass());
        if (classNodeResolveClass == null) {
            return null;
        }
        return deepResolveMethod(classNodeResolveClass, methodInfo.makeSignature(false));
    }

    public List getClasses() {
        return this.classes;
    }

    public Map getConstFields() {
        return this.constFields;
    }

    public C0506w getFieldId(int i) {
        return (C0506w) this.dexBuf.m629i().get(i);
    }

    public InfoStorage getInfoStorage() {
        return this.infoStorage;
    }

    public InputFile getInputFile() {
        return this.file;
    }

    public C0507x getMethodId(int i) {
        return (C0507x) this.dexBuf.m630j().get(i);
    }

    public C0508y getProtoId(int i) {
        return (C0508y) this.dexBuf.m628h().get(i);
    }

    public String getString(int i) {
        return (String) this.dexBuf.m625e().get(i);
    }

    public ArgType getType(int i) {
        return ArgType.parse(getString(((Integer) this.dexBuf.m626f().get(i)).intValue()));
    }

    void initInnerClasses() {
        ArrayList<ClassNode> arrayList = new ArrayList();
        for (ClassNode classNode : this.classes) {
            if (classNode.getClassInfo().isInner()) {
                arrayList.add(classNode);
            }
        }
        for (ClassNode classNode2 : arrayList) {
            ClassInfo classInfo = classNode2.getClassInfo();
            ClassNode classNodeResolveClass = resolveClass(classInfo.getParentClass());
            if (classNodeResolveClass == null) {
                this.clsMap.remove(classInfo);
                classInfo.notInner(classNode2.dex());
                this.clsMap.put(classInfo, classNode2);
            } else {
                classNodeResolveClass.addInnerClass(classNode2);
            }
        }
    }

    public void loadClasses() {
        Iterator it = this.dexBuf.m631k().iterator();
        while (it.hasNext()) {
            ClassNode classNode = new ClassNode(this, (C0488e) it.next());
            this.classes.add(classNode);
            this.clsMap.put(classNode.getClassInfo(), classNode);
        }
    }

    public C0498o openSection(int i) {
        return this.dexBuf.m616a(i);
    }

    public C0485b readClassData(C0488e c0488e) {
        return this.dexBuf.m614a(c0488e);
    }

    public C0489f readCode(C0487d c0487d) {
        return this.dexBuf.m615a(c0487d);
    }

    public List readParamList(int i) {
        C0484ab c0484abM621b = this.dexBuf.m621b(i);
        ArrayList arrayList = new ArrayList(c0484abM621b.m575a().length);
        short[] sArrM575a = c0484abM621b.m575a();
        for (short s : sArrM575a) {
            arrayList.add(getType(s));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public ClassNode resolveClass(ClassInfo classInfo) {
        return (ClassNode) this.clsMap.get(classInfo);
    }

    public ClassNode resolveClass(ArgType argType) {
        if (argType.isGeneric()) {
            argType = ArgType.object(argType.getObject());
        }
        return resolveClass(ClassInfo.fromType(this, argType));
    }

    public FieldNode resolveField(FieldInfo fieldInfo) {
        ClassNode classNodeResolveClass = resolveClass(fieldInfo.getDeclClass());
        if (classNodeResolveClass != null) {
            return classNodeResolveClass.searchField(fieldInfo);
        }
        return null;
    }

    public MethodNode resolveMethod(MethodInfo methodInfo) {
        ClassNode classNodeResolveClass = resolveClass(methodInfo.getDeclClass());
        if (classNodeResolveClass != null) {
            return classNodeResolveClass.searchMethod(methodInfo);
        }
        return null;
    }

    public RootNode root() {
        return this.root;
    }

    public String toString() {
        return "DEX";
    }
}
