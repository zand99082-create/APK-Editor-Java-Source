package com.gmail.heagoo.apkeditor;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.an */
/* JADX INFO: loaded from: classes.dex */
final class C1132an implements InterfaceC1204cu {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ ApkInfoActivity f3342a;

    C1132an(ApkInfoActivity apkInfoActivity) {
        this.f3342a = apkInfoActivity;
    }

    @Override // com.gmail.heagoo.apkeditor.InterfaceC1204cu
    /* JADX INFO: renamed from: a */
    public final void mo2764a(String str, String str2, boolean z) throws Throwable {
        this.f3342a.f2949e.m3304a(str2 + "/" + str.substring(str.lastIndexOf("/") + 1), str);
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
