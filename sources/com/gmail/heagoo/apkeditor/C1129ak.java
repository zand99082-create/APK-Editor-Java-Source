package com.gmail.heagoo.apkeditor;

import java.util.List;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.ak */
/* JADX INFO: loaded from: classes.dex */
final class C1129ak implements InterfaceC1204cu {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ List f3336a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ ApkInfoActivity f3337b;

    C1129ak(ApkInfoActivity apkInfoActivity, List list) {
        this.f3337b = apkInfoActivity;
        this.f3336a = list;
    }

    @Override // com.gmail.heagoo.apkeditor.InterfaceC1204cu
    /* JADX INFO: renamed from: a */
    public final void mo2764a(String str, String str2, boolean z) {
        new DialogC1190ce(this.f3337b, this.f3337b.f2914a, this.f3337b.f2946b, this.f3337b.f2955k, this.f3336a, str).show();
    }

    @Override // com.gmail.heagoo.apkeditor.InterfaceC1204cu
    /* JADX INFO: renamed from: a */
    public final boolean mo2765a(String str, String str2) {
        return true;
    }

    @Override // com.gmail.heagoo.apkeditor.InterfaceC1204cu
    /* JADX INFO: renamed from: b */
    public final String mo2766b(String str, String str2) {
        return null;
    }
}
