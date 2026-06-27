package ru.maximoff.apkeditor.translate;

import com.gmail.heagoo.apkeditor.translate.TranslateItem;

/* JADX INFO: renamed from: ru.maximoff.apkeditor.translate.o */
/* JADX INFO: loaded from: classes.dex */
class C1974o implements InterfaceC1963d {

    /* JADX INFO: renamed from: a */
    private final C1973n f5357a;

    /* JADX INFO: renamed from: b */
    private final TranslateItem f5358b;

    C1974o(C1973n c1973n, TranslateItem translateItem) {
        this.f5357a = c1973n;
        this.f5358b = translateItem;
    }

    @Override // ru.maximoff.apkeditor.translate.InterfaceC1963d
    /* JADX INFO: renamed from: a */
    public void mo4376a(String str) {
        this.f5358b.translatedValue = C1973n.m4379a(this.f5357a).m4335b(str);
        C1973n.m4379a(this.f5357a).m4337b(this.f5358b);
    }

    @Override // ru.maximoff.apkeditor.translate.InterfaceC1963d
    /* JADX INFO: renamed from: b */
    public void mo4377b(String str) {
        C1973n.m4379a(this.f5357a).m4337b(this.f5358b);
    }
}
