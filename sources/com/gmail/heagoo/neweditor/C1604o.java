package com.gmail.heagoo.neweditor;

import com.gmail.heagoo.apkeditor.InterfaceC1291fa;
import java.io.IOException;

/* JADX INFO: renamed from: com.gmail.heagoo.neweditor.o */
/* JADX INFO: loaded from: classes.dex */
final class C1604o implements InterfaceC1291fa {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ EditorActivity f4843a;

    C1604o(EditorActivity editorActivity) {
        this.f4843a = editorActivity;
    }

    @Override // com.gmail.heagoo.apkeditor.InterfaceC1291fa
    /* JADX INFO: renamed from: a */
    public final void mo2792a() throws IOException {
        this.f4843a.f4708P.m3905a(this.f4843a);
        this.f4843a.f4708P.m3911a(false);
        if (this.f4843a.f4705M != null) {
            this.f4843a.m3858c();
        }
        this.f4843a.setResult(1);
    }

    @Override // com.gmail.heagoo.apkeditor.InterfaceC1291fa
    /* JADX INFO: renamed from: b */
    public final void mo2793b() {
        this.f4843a.m3853a();
        this.f4843a.f4718c = true;
        this.f4843a.m3859d();
    }
}
