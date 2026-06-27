package com.gmail.heagoo.apkeditor;

import android.os.Bundle;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.q */
/* JADX INFO: loaded from: classes.dex */
final class C1424q implements InterfaceC1291fa {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ Bundle f4150a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ ApkInfoActivity f4151b;

    C1424q(ApkInfoActivity apkInfoActivity, Bundle bundle) {
        this.f4151b = apkInfoActivity;
        this.f4150a = bundle;
    }

    @Override // com.gmail.heagoo.apkeditor.InterfaceC1291fa
    /* JADX INFO: renamed from: a */
    public final void mo2792a() {
        ApkInfoActivity.m2646a(this.f4151b, this.f4150a);
    }

    @Override // com.gmail.heagoo.apkeditor.InterfaceC1291fa
    /* JADX INFO: renamed from: b */
    public final void mo2793b() {
        ApkInfoActivity.m2645a(this.f4151b);
    }
}
