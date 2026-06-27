package com.gmail.heagoo.apkeditor;

import android.text.Editable;
import android.text.TextWatcher;
import com.gmail.heagoo.neweditor.C1594e;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.io */
/* JADX INFO: loaded from: classes.dex */
final class C1385io implements TextWatcher {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ TextEditNormalActivity f4026a;

    private C1385io(TextEditNormalActivity textEditNormalActivity) {
        this.f4026a = textEditNormalActivity;
    }

    /* synthetic */ C1385io(TextEditNormalActivity textEditNormalActivity, byte b2) {
        this(textEditNormalActivity);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        C1594e c1594e = this.f4026a.f3919j;
        if (c1594e == null) {
            return;
        }
        boolean zM3912b = c1594e.m3912b();
        if (!TextEditNormalActivity.m2884m(this.f4026a)) {
            c1594e.m3909a(charSequence, i, i2, i3);
        }
        this.f4026a.m2890a(Math.min(this.f4026a.f3134u, i), Math.max(i2, i3) + i, true);
        this.f4026a.m2894e();
        this.f4026a.m2891a(true);
        if (zM3912b || !c1594e.m3912b()) {
            return;
        }
        this.f4026a.m2893d();
    }
}
