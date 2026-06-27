package jadx.core.dex.nodes.parser;

import com.gmail.heagoo.p084a.p089c.C1067a;
import com.p046a.p047a.C0498o;
import jadx.core.dex.nodes.DexNode;
import jadx.core.dex.nodes.FieldNode;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class StaticValuesParser extends EncValueParser {
    public StaticValuesParser(DexNode dexNode, C0498o c0498o) {
        super(dexNode, c0498o);
    }

    public int processFields(List list) {
        int iM2494b = C1067a.m2494b(this.f5174in);
        for (int i = 0; i < iM2494b; i++) {
            Object value = parseValue();
            if (i < list.size()) {
                ((FieldNode) list.get(i)).addAttr(FieldInitAttr.constValue(value));
            }
        }
        return iM2494b;
    }
}
