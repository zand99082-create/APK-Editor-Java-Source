package com.gmail.heagoo.apkeditor;

import android.content.DialogInterface;
import android.widget.CheckBox;
import android.widget.Toast;
import com.gmail.heagoo.apkeditor.p092ac.EditTextWithTip;
import com.gmail.heagoo.apkeditor.pro.R;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.aw */
/* JADX INFO: loaded from: classes.dex */
final class DialogInterfaceOnClickListenerC1140aw implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ EditTextWithTip f3355a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ CheckBox f3356b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ CheckBox f3357c;

    /* JADX INFO: renamed from: d */
    private /* synthetic */ ViewOnClickListenerC1139av f3358d;

    DialogInterfaceOnClickListenerC1140aw(ViewOnClickListenerC1139av viewOnClickListenerC1139av, EditTextWithTip editTextWithTip, CheckBox checkBox, CheckBox checkBox2) {
        this.f3358d = viewOnClickListenerC1139av;
        this.f3355a = editTextWithTip;
        this.f3356b = checkBox;
        this.f3357c = checkBox2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        String strTrim = this.f3355a.getText().toString().trim();
        if ("".equals(strTrim)) {
            Toast.makeText(this.f3358d.f3354a, R.string.empty_input_tip, 1).show();
            return;
        }
        this.f3358d.m3031a(strTrim, this.f3356b.isChecked(), this.f3357c.isChecked());
    }
}
