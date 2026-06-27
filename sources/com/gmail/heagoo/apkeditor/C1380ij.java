package com.gmail.heagoo.apkeditor;

import com.gmail.heagoo.common.InterfaceC1560i;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.ij */
/* JADX INFO: loaded from: classes.dex */
final class C1380ij implements InterfaceC1560i {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ DialogInterfaceOnClickListenerC1379ii f4017a;

    C1380ij(DialogInterfaceOnClickListenerC1379ii dialogInterfaceOnClickListenerC1379ii) {
        this.f4017a = dialogInterfaceOnClickListenerC1379ii;
    }

    @Override // com.gmail.heagoo.common.InterfaceC1560i
    /* JADX INFO: renamed from: a */
    public final void mo3406a() {
        this.f4017a.f4016b.f3914e += this.f4017a.f4015a;
        new AsyncTaskC1386ip(this.f4017a.f4016b, (byte) 0).execute(new Void[0]);
    }
}
