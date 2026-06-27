package com.gmail.heagoo.apkeditor.p090a.p091a;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.a.a.g */
/* JADX INFO: loaded from: classes.dex */
final class C1088g implements InterfaceC1085d {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ C1086e f3184a;

    C1088g(C1086e c1086e) {
        this.f3184a = c1086e;
    }

    @Override // com.gmail.heagoo.apkeditor.p090a.p091a.InterfaceC1085d
    /* JADX INFO: renamed from: a */
    public final void mo2928a(C1105x c1105x) {
        if (c1105x.m3012b() == 3) {
            int[] iArrM2979b = this.f3184a.f3177g.m2979b();
            int iM3013c = c1105x.m3013c();
            if (iM3013c < 0 || iM3013c >= iArrM2979b.length) {
                return;
            }
            int i = iArrM2979b[iM3013c] + 1;
            C1086e.m2935a(c1105x.m3011a(), c1105x.f3265a + 8, i);
            C1086e.m2935a(c1105x.m3011a(), c1105x.f3265a + 16, i);
        }
    }
}
