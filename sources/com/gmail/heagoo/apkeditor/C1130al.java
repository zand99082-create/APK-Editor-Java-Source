package com.gmail.heagoo.apkeditor;

import android.support.v4.view.PointerIconCompat;
import com.gmail.heagoo.p084a.p089c.C1067a;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.al */
/* JADX INFO: loaded from: classes.dex */
final class C1130al implements InterfaceC1204cu {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ InterfaceC1337gu f3338a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ String f3339b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ ApkInfoActivity f3340c;

    C1130al(ApkInfoActivity apkInfoActivity, InterfaceC1337gu interfaceC1337gu, String str) {
        this.f3340c = apkInfoActivity;
        this.f3338a = interfaceC1337gu;
        this.f3339b = str;
    }

    @Override // com.gmail.heagoo.apkeditor.InterfaceC1204cu
    /* JADX INFO: renamed from: a */
    public final void mo2764a(String str, String str2, boolean z) {
        if (z) {
            this.f3340c.m2696a(str, str2, this.f3338a);
            C1067a.m2465a(this.f3340c, str, PointerIconCompat.TYPE_CONTEXT_MENU);
        } else {
            this.f3340c.f2949e.m3318d(str2, str);
            if (this.f3338a != null) {
                this.f3338a.mo3344a();
            }
        }
    }

    @Override // com.gmail.heagoo.apkeditor.InterfaceC1204cu
    /* JADX INFO: renamed from: a */
    public final boolean mo2765a(String str, String str2) {
        if (this.f3339b != null) {
            return str.endsWith(this.f3339b);
        }
        return true;
    }

    @Override // com.gmail.heagoo.apkeditor.InterfaceC1204cu
    /* JADX INFO: renamed from: b */
    public final String mo2766b(String str, String str2) {
        return null;
    }
}
