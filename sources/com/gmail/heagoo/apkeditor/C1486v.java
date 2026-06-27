package com.gmail.heagoo.apkeditor;

import com.gmail.heagoo.p084a.p089c.C1067a;
import java.util.Map;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.v */
/* JADX INFO: loaded from: classes.dex */
final class C1486v extends Thread {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ Map f4417a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ ApkInfoActivity f4418b;

    C1486v(ApkInfoActivity apkInfoActivity, Map map) {
        this.f4418b = apkInfoActivity;
        this.f4417a = map;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            String strM2525d = C1067a.m2525d(this.f4418b, "tmp");
            C1067a.m2487a(strM2525d + "allStringValues", this.f4418b.f2948d);
            C1067a.m2487a(strM2525d + "fileEntry2ZipEntry", this.f4417a);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
