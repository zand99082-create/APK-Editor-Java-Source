package com.p046a.p049b.p058c.p062c;

import com.p046a.p047a.C0503t;
import com.p046a.p049b.p056b.p057a.C0605a;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.a.b.c.c.ah */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0692ah extends AbstractC0714bc {
    public AbstractC0692ah(String str, C0732r c0732r) {
        super(str, c0732r, 4);
    }

    /* JADX INFO: renamed from: d */
    private String m1323d() {
        TreeMap treeMap = new TreeMap();
        Iterator it = mo1308a().iterator();
        while (it.hasNext()) {
            String strM1911j = ((AbstractC0691ag) it.next()).m1310d().m1918j().m1911j();
            int iLastIndexOf = strM1911j.lastIndexOf(47);
            String strReplace = iLastIndexOf == -1 ? "default" : strM1911j.substring(strM1911j.lastIndexOf(91) + 2, iLastIndexOf).replace('/', '.');
            AtomicInteger atomicInteger = (AtomicInteger) treeMap.get(strReplace);
            if (atomicInteger == null) {
                atomicInteger = new AtomicInteger();
                treeMap.put(strReplace, atomicInteger);
            }
            atomicInteger.incrementAndGet();
        }
        Formatter formatter = new Formatter();
        try {
            formatter.format("Too many %s references: %d; max is %d.%n" + C0605a.m1062a() + "%nReferences by package:", this instanceof C0695ak ? "method" : "field", Integer.valueOf(mo1308a().size()), 65536);
            for (Map.Entry entry : treeMap.entrySet()) {
                formatter.format("%n%6d %s", Integer.valueOf(((AtomicInteger) entry.getValue()).get()), entry.getKey());
            }
            return formatter.toString();
        } finally {
            formatter.close();
        }
    }

    @Override // com.p046a.p049b.p058c.p062c.AbstractC0714bc
    /* JADX INFO: renamed from: b */
    protected final void mo1309b() {
        int i = 0;
        if (mo1308a().size() > 65536) {
            throw new C0503t(m1323d());
        }
        Iterator it = mo1308a().iterator();
        while (true) {
            int i2 = i;
            if (!it.hasNext()) {
                return;
            }
            ((AbstractC0691ag) it.next()).m1311a(i2);
            i = i2 + 1;
        }
    }
}
