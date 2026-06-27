package com.gmail.heagoo.apkeditor;

import com.gmail.heagoo.common.C1559h;
import com.gmail.heagoo.common.InterfaceC1560i;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.hm */
/* JADX INFO: loaded from: classes.dex */
final class C1356hm implements InterfaceC1291fa {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ InterfaceC1560i f3963a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ TextEditBigActivity f3964b;

    C1356hm(TextEditBigActivity textEditBigActivity, InterfaceC1560i interfaceC1560i) {
        this.f3964b = textEditBigActivity;
        this.f3963a = interfaceC1560i;
    }

    @Override // com.gmail.heagoo.apkeditor.InterfaceC1291fa
    /* JADX INFO: renamed from: a */
    public final void mo2792a() {
        C1559h.m3773a(this.f3964b.m3397a(), this.f3964b.f3071K.m3436e());
        this.f3964b.f3919j.m3911a(false);
    }

    @Override // com.gmail.heagoo.apkeditor.InterfaceC1291fa
    /* JADX INFO: renamed from: b */
    public final void mo2793b() {
        this.f3964b.m2853d();
        this.f3964b.f3916g = true;
        this.f3964b.m3402b();
        if (this.f3963a != null) {
            this.f3963a.mo3406a();
        }
    }
}
