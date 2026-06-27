package com.gmail.heagoo.apkeditor;

import com.gmail.heagoo.common.InterfaceC1560i;
import java.io.IOException;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.ik */
/* JADX INFO: loaded from: classes.dex */
final class C1381ik implements InterfaceC1291fa {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ InterfaceC1560i f4018a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ TextEditNormalActivity f4019b;

    C1381ik(TextEditNormalActivity textEditNormalActivity, InterfaceC1560i interfaceC1560i) {
        this.f4019b = textEditNormalActivity;
        this.f4018a = interfaceC1560i;
    }

    @Override // com.gmail.heagoo.apkeditor.InterfaceC1291fa
    /* JADX INFO: renamed from: a */
    public final void mo2792a() throws IOException {
        this.f4019b.f3919j.m3905a(this.f4019b);
        this.f4019b.f3919j.m3911a(false);
    }

    @Override // com.gmail.heagoo.apkeditor.InterfaceC1291fa
    /* JADX INFO: renamed from: b */
    public final void mo2793b() {
        this.f4019b.m2893d();
        this.f4019b.f3916g = true;
        this.f4019b.m3402b();
        if (this.f4018a != null) {
            this.f4018a.mo3406a();
        }
    }
}
