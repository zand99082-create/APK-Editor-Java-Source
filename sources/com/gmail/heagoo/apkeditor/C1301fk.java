package com.gmail.heagoo.apkeditor;

import com.gmail.heagoo.p084a.p089c.C1067a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.fk */
/* JADX INFO: loaded from: classes.dex */
public final class C1301fk {

    /* JADX INFO: renamed from: a */
    List f3794a;

    /* JADX INFO: renamed from: b */
    String f3795b;

    /* JADX INFO: renamed from: c */
    boolean f3796c;

    public C1301fk() {
        this.f3795b = "";
        this.f3796c = false;
    }

    private C1301fk(String str, boolean z) {
        this.f3795b = str;
        this.f3796c = z;
    }

    /* JADX INFO: renamed from: a */
    private C1301fk m3324a(String str) {
        if (this.f3794a != null) {
            for (C1301fk c1301fk : this.f3794a) {
                if (str.equals(c1301fk.f3795b)) {
                    return c1301fk;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    private C1301fk m3325a(String str, boolean z) {
        if (this.f3794a == null) {
            if (!z) {
                return null;
            }
            this.f3794a = new ArrayList();
        }
        for (C1301fk c1301fk : this.f3794a) {
            if (!c1301fk.f3796c && str.equals(c1301fk.f3795b)) {
                return c1301fk;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    private List m3326a() {
        if (this.f3794a == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (C1301fk c1301fk : this.f3794a) {
            if (c1301fk.f3796c) {
                arrayList.add(c1301fk.f3795b);
            } else {
                List listM3326a = c1301fk.m3326a();
                if (listM3326a != null) {
                    Iterator it = listM3326a.iterator();
                    while (it.hasNext()) {
                        arrayList.add(c1301fk.f3795b + "/" + ((String) it.next()));
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    private void m3327a(C1301fk c1301fk) {
        if (this.f3794a == null) {
            this.f3794a = new ArrayList();
        }
        this.f3794a.add(c1301fk);
    }

    /* JADX INFO: renamed from: b */
    private boolean m3328b(C1301fk c1301fk) {
        if (this.f3794a != null) {
            return this.f3794a.remove(c1301fk);
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public final C1301fk m3329a(String[] strArr) {
        for (String str : strArr) {
            this = this.m3325a(str, false);
            if (this == null) {
                return null;
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: a */
    public final void m3330a(String[] strArr, boolean z) {
        for (int i = 0; i < strArr.length - 1; i++) {
            C1301fk c1301fkM3325a = this.m3325a(strArr[i], true);
            if (c1301fkM3325a == null) {
                c1301fkM3325a = new C1301fk(strArr[i], false);
                this.m3327a(c1301fkM3325a);
            }
            this = c1301fkM3325a;
        }
        this.m3327a(new C1301fk(strArr[strArr.length - 1], z));
    }

    /* JADX INFO: renamed from: b */
    public final C1301fk m3331b(String[] strArr) {
        for (int i = 0; i < strArr.length - 1; i++) {
            this = this.m3325a(strArr[i], false);
            if (this == null) {
                return null;
            }
        }
        return this.m3324a(strArr[strArr.length - 1]);
    }

    /* JADX INFO: renamed from: c */
    public final List m3332c(String[] strArr) {
        C1301fk c1301fkM3324a;
        if (strArr.length > 1) {
            String[] strArr2 = new String[strArr.length - 1];
            for (int i = 0; i < strArr.length - 1; i++) {
                strArr2[i] = strArr[i];
            }
            this = m3329a(strArr2);
        }
        if (this != null && (c1301fkM3324a = this.m3324a(strArr[strArr.length - 1])) != null) {
            if (c1301fkM3324a.f3796c) {
                this.m3328b(c1301fkM3324a);
                ArrayList arrayList = new ArrayList();
                arrayList.add(C1067a.m2461a("/", strArr));
                return arrayList;
            }
            List listM3326a = c1301fkM3324a.m3326a();
            if (listM3326a != null) {
                String strM2461a = C1067a.m2461a("/", strArr);
                for (int i2 = 0; i2 < listM3326a.size(); i2++) {
                    listM3326a.set(i2, strM2461a + "/" + ((String) listM3326a.get(i2)));
                }
                this.m3328b(c1301fkM3324a);
                return listM3326a;
            }
            this.m3328b(c1301fkM3324a);
        }
        return null;
    }
}
