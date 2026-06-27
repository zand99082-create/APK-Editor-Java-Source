package com.gmail.heagoo.apkeditor;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.widget.Button;
import com.gmail.heagoo.apkeditor.pro.R;
import p000a.p001a.p003b.p004a.C0037k;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.ex */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1283ex implements Runnable {

    /* JADX INFO: renamed from: a */
    private DialogC1280eu f3733a;

    RunnableC1283ex(DialogC1280eu dialogC1280eu) {
        this.f3733a = dialogC1280eu;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Button button = this.f3733a.f3721g;
        button.setText(R.string.abc_action_mode_done);
        button.setVisibility(0);
        Context context = button.getContext();
        button.setTextColor(ContextCompat.getColor(context, C0037k.mdPatched(C0037k.m89a(context))));
        DialogC1280eu.progressPatch(this.f3733a).setVisibility(8);
    }
}
