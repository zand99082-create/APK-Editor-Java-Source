package com.gmail.heagoo.apkeditor;

import android.text.Editable;
import android.text.TextWatcher;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.ht */
/* JADX INFO: loaded from: classes.dex */
final class C1363ht implements TextWatcher {

    /* JADX INFO: renamed from: a */
    private int f3985a;

    /* JADX INFO: renamed from: b */
    private boolean f3986b = true;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ C1362hs f3987c;

    public C1363ht(C1362hs c1362hs, int i) {
        this.f3987c = c1362hs;
        this.f3985a = i;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (this.f3986b) {
            this.f3986b = false;
            return;
        }
        if (this.f3985a < this.f3987c.f3975b.size()) {
            this.f3987c.f3975b.set(this.f3985a, editable.toString());
        }
        if (this.f3987c.f3982i != null) {
            this.f3987c.f3982i.afterTextChanged(editable);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
