package com.gmail.heagoo.apkeditor.p096e;

import com.gmail.heagoo.apkeditor.pro.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.e.ac */
/* JADX INFO: loaded from: classes.dex */
final class C1235ac {

    /* JADX INFO: renamed from: a */
    private List f3589a;

    C1235ac(InterfaceC1237b interfaceC1237b, String str, int i) {
        C1259x c1259x;
        this.f3589a = new ArrayList();
        String strM3178a = AbstractC1242g.m3178a(interfaceC1237b, str);
        str = strM3178a != null ? strM3178a : str;
        if (!str.startsWith("[") || !str.endsWith("]")) {
            if (str.contains("*")) {
                this.f3589a.add(new C1234ab(interfaceC1237b, str));
                return;
            } else {
                this.f3589a.add(new C1233aa(str));
                return;
            }
        }
        for (String str2 : m3151a(str)) {
            if ("APPLICATION".equals(str2)) {
                c1259x = new C1259x(interfaceC1237b, C1261z.f3656a);
            } else if ("ACTIVITIES".equals(str2)) {
                c1259x = new C1259x(interfaceC1237b, C1261z.f3657b);
            } else if ("LAUNCHER_ACTIVITIES".equals(str2)) {
                c1259x = new C1259x(interfaceC1237b, C1261z.f3658c);
            } else {
                interfaceC1237b.mo3162a(R.string.patch_error_invalid_target, Integer.valueOf(i));
                c1259x = null;
            }
            if (c1259x == null) {
                this.f3589a = null;
                return;
            }
            this.f3589a.add(c1259x);
        }
    }

    /* JADX INFO: renamed from: a */
    private static List m3151a(String str) {
        ArrayList arrayList = new ArrayList();
        int iIndexOf = 1;
        int iIndexOf2 = str.indexOf(93);
        while (iIndexOf > 0 && iIndexOf2 > iIndexOf) {
            arrayList.add(str.substring(iIndexOf, iIndexOf2));
            iIndexOf = str.indexOf(91, iIndexOf2) + 1;
            if (iIndexOf > 0) {
                iIndexOf2 = str.indexOf(93, iIndexOf);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    final boolean m3152a() {
        if (this.f3589a == null) {
            return false;
        }
        for (int i = 0; i < this.f3589a.size(); i++) {
            if (((AbstractC1258w) this.f3589a.get(i)).mo3149b()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    final String m3153b() {
        boolean z;
        if (this.f3589a == null) {
            return null;
        }
        String strMo3147a = ((AbstractC1258w) this.f3589a.get(0)).mo3147a();
        if (this.f3589a.size() <= 1) {
            return strMo3147a;
        }
        String strMo3147a2 = strMo3147a;
        while (strMo3147a2 != null) {
            int i = 1;
            while (true) {
                if (i >= this.f3589a.size()) {
                    z = true;
                    break;
                }
                if (!((AbstractC1258w) this.f3589a.get(i)).mo3148a(strMo3147a2)) {
                    z = false;
                    break;
                }
                i++;
            }
            if (z) {
                break;
            }
            strMo3147a2 = ((AbstractC1258w) this.f3589a.get(0)).mo3147a();
        }
        return strMo3147a2;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m3154c() {
        return this.f3589a != null;
    }

    /* JADX INFO: renamed from: d */
    final boolean m3155d() {
        if (this.f3589a == null) {
            return false;
        }
        Iterator it = this.f3589a.iterator();
        while (it.hasNext()) {
            if (!((AbstractC1258w) it.next()).mo3150c()) {
                return false;
            }
        }
        return true;
    }
}
