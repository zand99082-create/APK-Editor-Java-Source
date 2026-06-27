package com.p046a.p049b.p058c.p062c;

import com.p046a.p049b.p073h.C0970r;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: renamed from: com.a.b.c.c.au */
/* JADX INFO: loaded from: classes.dex */
public final class C0705au {

    /* JADX INFO: renamed from: a */
    private final HashMap f1436a = new HashMap(50);

    /* JADX INFO: renamed from: a */
    public final String m1367a() {
        StringBuilder sb = new StringBuilder();
        sb.append("Statistics:\n");
        TreeMap treeMap = new TreeMap();
        for (C0706av c0706av : this.f1436a.values()) {
            treeMap.put(c0706av.f1437a, c0706av);
        }
        Iterator it = treeMap.values().iterator();
        while (it.hasNext()) {
            sb.append(((C0706av) it.next()).m1371a());
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public final void m1368a(AbstractC0688ad abstractC0688ad) {
        String strMo919d = abstractC0688ad.mo1302a().mo919d();
        C0706av c0706av = (C0706av) this.f1436a.get(strMo919d);
        if (c0706av == null) {
            this.f1436a.put(strMo919d, new C0706av(abstractC0688ad, strMo919d));
        } else {
            c0706av.m1372a(abstractC0688ad);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m1369a(C0970r c0970r) {
        if (this.f1436a.size() == 0) {
            return;
        }
        c0970r.m2272a(0, "\nstatistics:\n");
        TreeMap treeMap = new TreeMap();
        for (C0706av c0706av : this.f1436a.values()) {
            treeMap.put(c0706av.f1437a, c0706av);
        }
        Iterator it = treeMap.values().iterator();
        while (it.hasNext()) {
            c0970r.m2277a(((C0706av) it.next()).m1371a());
        }
    }
}
