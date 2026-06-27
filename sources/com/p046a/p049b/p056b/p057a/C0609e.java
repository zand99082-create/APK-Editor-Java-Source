package com.p046a.p049b.p056b.p057a;

import com.p046a.p049b.p050a.p054d.InterfaceC0580i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.a.b.b.a.e */
/* JADX INFO: loaded from: classes.dex */
final class C0609e implements InterfaceC0580i {

    /* JADX INFO: renamed from: a */
    private Map f1009a = new HashMap();

    public C0609e() {
        Iterator it = C0605a.f1001l.iterator();
        while (it.hasNext()) {
            String strM1080f = C0605a.m1080f((String) it.next());
            String strM1089b = m1089b(strM1080f);
            List arrayList = (List) this.f1009a.get(strM1089b);
            if (arrayList == null) {
                arrayList = new ArrayList(1);
                this.f1009a.put(strM1089b, arrayList);
            }
            arrayList.add(strM1080f);
        }
    }

    /* JADX INFO: renamed from: b */
    private static String m1089b(String str) {
        int iLastIndexOf = str.lastIndexOf(47);
        return iLastIndexOf >= 0 ? str.substring(iLastIndexOf + 1) : str;
    }

    @Override // com.p046a.p049b.p050a.p054d.InterfaceC0580i
    /* JADX INFO: renamed from: a */
    public final boolean mo992a(String str) {
        if (!str.endsWith(".class")) {
            return true;
        }
        String strM1080f = C0605a.m1080f(str);
        List list = (List) this.f1009a.get(m1089b(strM1080f));
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (strM1080f.endsWith((String) it.next())) {
                    return true;
                }
            }
        }
        return false;
    }
}
