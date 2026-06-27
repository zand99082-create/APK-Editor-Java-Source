package com.p080c.p081a;

/* JADX INFO: renamed from: com.c.a.l */
/* JADX INFO: loaded from: classes.dex */
final class C1028l implements InterfaceC1034r {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ ViewOnTouchListenerC1026j f2722a;

    C1028l(ViewOnTouchListenerC1026j viewOnTouchListenerC1026j) {
        this.f2722a = viewOnTouchListenerC1026j;
    }

    @Override // com.p080c.p081a.InterfaceC1034r
    /* JADX INFO: renamed from: a */
    public final void mo2353a() {
        ViewOnTouchListenerC1026j.m2343a(this.f2722a, false);
        this.f2722a.m2348a();
    }

    @Override // com.p080c.p081a.InterfaceC1034r
    /* JADX INFO: renamed from: a */
    public final void mo2354a(float f, float f2, float f3) {
        if (f > this.f2722a.f2711q || f < this.f2722a.f2712r) {
            return;
        }
        this.f2722a.m2350a(f, f2, f3);
    }
}
