package com.p080c.p081a;

/* JADX INFO: renamed from: com.c.a.m */
/* JADX INFO: loaded from: classes.dex */
final class C1029m implements InterfaceC1031o {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ C1022f f2723a;

    C1029m(ViewOnTouchListenerC1026j viewOnTouchListenerC1026j, C1022f c1022f) {
        this.f2723a = c1022f;
    }

    @Override // com.p080c.p081a.InterfaceC1031o
    /* JADX INFO: renamed from: a */
    public final void mo2355a(float f, float f2) {
        this.f2723a.m2326a(f, f2);
        this.f2723a.postInvalidate();
    }
}
