package com.gmail.heagoo.apkeditor;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.ev */
/* JADX INFO: loaded from: classes.dex */
final class C1281ev implements InterfaceC1204cu {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ DialogC1280eu f3728a;

    C1281ev(DialogC1280eu dialogC1280eu) {
        this.f3728a = dialogC1280eu;
    }

    @Override // com.gmail.heagoo.apkeditor.InterfaceC1204cu
    /* JADX INFO: renamed from: a */
    public final void mo2764a(String str, String str2, boolean z) throws Throwable {
        DialogC1280eu.m3247a(this.f3728a, str);
    }

    @Override // com.gmail.heagoo.apkeditor.InterfaceC1204cu
    /* JADX INFO: renamed from: a */
    public final boolean mo2765a(String str, String str2) {
        return str.endsWith(".zip");
    }

    @Override // com.gmail.heagoo.apkeditor.InterfaceC1204cu
    /* JADX INFO: renamed from: b */
    public final String mo2766b(String str, String str2) {
        return null;
    }
}
