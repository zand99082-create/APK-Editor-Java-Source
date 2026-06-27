package com.gmail.heagoo.apkeditor.p096e;

import com.gmail.heagoo.apkeditor.ApkInfoActivity;
import com.gmail.heagoo.apkeditor.pro.R;
import java.util.List;
import java.util.zip.ZipFile;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.e.f */
/* JADX INFO: loaded from: classes.dex */
final class C1241f extends Thread {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ List f3600a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ ZipFile f3601b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ C1240e f3602c;

    C1241f(C1240e c1240e, List list, ZipFile zipFile) {
        this.f3602c = c1240e;
        this.f3600a = list;
        this.f3601b = zipFile;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        int iM3172a = 0;
        while (iM3172a < this.f3600a.size()) {
            AbstractC1242g abstractC1242g = (AbstractC1242g) this.f3600a.get(iM3172a);
            this.f3602c.f3597c.mo3161a(R.string.patch_start_apply, true, Integer.valueOf(abstractC1242g.f3603a));
            String strMo3186a = abstractC1242g.mo3191a(this.f3602c.f3597c) ? abstractC1242g.mo3186a((ApkInfoActivity) this.f3602c.f3595a.get(), this.f3601b, this.f3602c.f3597c) : null;
            iM3172a = strMo3186a != null ? C1240e.m3172a(this.f3602c, this.f3600a, strMo3186a) : iM3172a + 1;
        }
        this.f3602c.f3597c.mo3161a(R.string.all_rules_applied, true, new Object[0]);
        this.f3602c.f3597c.mo3160a();
    }
}
