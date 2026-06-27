package jadx.core.dex.nodes.parser;

import com.gmail.heagoo.p084a.p089c.C1067a;
import com.p046a.p047a.C0498o;
import jadx.core.dex.attributes.annotations.Annotation;
import jadx.core.dex.attributes.annotations.AnnotationsList;
import jadx.core.dex.attributes.annotations.MethodParameters;
import jadx.core.dex.instructions.args.ArgType;
import jadx.core.dex.nodes.ClassNode;
import jadx.core.dex.nodes.DexNode;
import jadx.core.dex.nodes.MethodNode;
import jadx.core.utils.exceptions.DecodeException;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public class AnnotationsParser {
    private static final Annotation.Visibility[] VISIBILITIES = {Annotation.Visibility.BUILD, Annotation.Visibility.RUNTIME, Annotation.Visibility.SYSTEM};
    private final ClassNode cls;
    private final DexNode dex;

    public AnnotationsParser(ClassNode classNode) {
        this.cls = classNode;
        this.dex = classNode.dex();
    }

    public static Annotation readAnnotation(DexNode dexNode, C0498o c0498o, boolean z) throws DecodeException {
        EncValueParser encValueParser = new EncValueParser(dexNode, c0498o);
        Annotation.Visibility visibility = z ? VISIBILITIES[c0498o.mo568d()] : null;
        int iM2494b = C1067a.m2494b(c0498o);
        int iM2494b2 = C1067a.m2494b(c0498o);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM2494b2);
        for (int i = 0; i < iM2494b2; i++) {
            linkedHashMap.put(dexNode.getString(C1067a.m2494b(c0498o)), encValueParser.parseValue());
        }
        ArgType type = dexNode.getType(iM2494b);
        Annotation annotation = new Annotation(visibility, type, linkedHashMap);
        if (type.isObject()) {
            return annotation;
        }
        throw new DecodeException("Incorrect type for annotation: " + annotation);
    }

    private AnnotationsList readAnnotationSet(int i) {
        C0498o c0498oOpenSection;
        int iM647b;
        if (i != 0 && (iM647b = (c0498oOpenSection = this.dex.openSection(i)).m647b()) != 0) {
            ArrayList arrayList = new ArrayList(iM647b);
            for (int i2 = 0; i2 < iM647b; i2++) {
                arrayList.add(readAnnotation(this.dex, this.dex.openSection(c0498oOpenSection.m647b()), true));
            }
            return new AnnotationsList(arrayList);
        }
        return AnnotationsList.EMPTY;
    }

    public void parse(int i) {
        C0498o c0498oOpenSection = this.dex.openSection(i);
        int iM647b = c0498oOpenSection.m647b();
        int iM647b2 = c0498oOpenSection.m647b();
        int iM647b3 = c0498oOpenSection.m647b();
        int iM647b4 = c0498oOpenSection.m647b();
        if (iM647b != 0) {
            this.cls.addAttr(readAnnotationSet(iM647b));
        }
        for (int i2 = 0; i2 < iM647b2; i2++) {
            this.cls.searchFieldById(c0498oOpenSection.m647b()).addAttr(readAnnotationSet(c0498oOpenSection.m647b()));
        }
        for (int i3 = 0; i3 < iM647b3; i3++) {
            this.cls.searchMethodById(c0498oOpenSection.m647b()).addAttr(readAnnotationSet(c0498oOpenSection.m647b()));
        }
        for (int i4 = 0; i4 < iM647b4; i4++) {
            MethodNode methodNodeSearchMethodById = this.cls.searchMethodById(c0498oOpenSection.m647b());
            C0498o c0498oOpenSection2 = this.dex.openSection(c0498oOpenSection.m647b());
            int iM647b5 = c0498oOpenSection2.m647b();
            MethodParameters methodParameters = new MethodParameters(iM647b5);
            for (int i5 = 0; i5 < iM647b5; i5++) {
                methodParameters.getParamList().add(readAnnotationSet(c0498oOpenSection2.m647b()));
            }
            methodNodeSearchMethodById.addAttr(methodParameters);
        }
    }
}
