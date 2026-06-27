package com.gmail.heagoo.apkeditor;

import com.gmail.heagoo.common.InterfaceC1560i;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.hl */
/* JADX INFO: loaded from: classes.dex */
final class C1355hl implements InterfaceC1560i {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ DialogInterfaceOnClickListenerC1354hk f3962a;

    C1355hl(DialogInterfaceOnClickListenerC1354hk dialogInterfaceOnClickListenerC1354hk) {
        this.f3962a = dialogInterfaceOnClickListenerC1354hk;
    }

    @Override // com.gmail.heagoo.common.InterfaceC1560i
    /* JADX INFO: renamed from: a */
    public final void mo3406a() {
        this.f3962a.f3961b.f3914e += this.f3962a.f3960a;
        new AsyncTaskC1361hr(this.f3962a.f3961b, (byte) 0).execute(new Void[0]);
    }
}
