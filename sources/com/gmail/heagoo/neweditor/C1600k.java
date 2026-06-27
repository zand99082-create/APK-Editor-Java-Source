package com.gmail.heagoo.neweditor;

import android.text.Editable;
import android.text.TextWatcher;

/* JADX INFO: renamed from: com.gmail.heagoo.neweditor.k */
/* JADX INFO: loaded from: classes.dex */
final class C1600k implements TextWatcher {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ EditorActivity f4839a;

    C1600k(EditorActivity editorActivity) {
        this.f4839a = editorActivity;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        C1594e c1594e = this.f4839a.f4708P;
        boolean zM3912b = c1594e.m3912b();
        if (!this.f4839a.f4729r) {
            c1594e.m3909a(charSequence, i, i2, i3);
        }
        this.f4839a.m3854a(Math.min(this.f4839a.f4722k, i), Math.max(i2, i3) + i, true);
        this.f4839a.m3856b();
        this.f4839a.m3855a(true);
        if (zM3912b || !c1594e.m3912b()) {
            return;
        }
        this.f4839a.m3853a();
    }
}
