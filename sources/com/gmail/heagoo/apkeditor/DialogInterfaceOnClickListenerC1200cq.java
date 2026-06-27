package com.gmail.heagoo.apkeditor;

import android.content.DialogInterface;
import android.widget.EditText;
import android.widget.Toast;
import com.gmail.heagoo.apkeditor.pro.R;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.cq */
/* JADX INFO: loaded from: classes.dex */
final class DialogInterfaceOnClickListenerC1200cq implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ EditText f3514a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ String f3515b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ DialogC1197cn f3516c;

    DialogInterfaceOnClickListenerC1200cq(DialogC1197cn dialogC1197cn, EditText editText, String str) {
        this.f3516c = dialogC1197cn;
        this.f3514a = editText;
        this.f3515b = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        String strTrim = this.f3514a.getText().toString().trim();
        if ("".equals(strTrim)) {
            Toast.makeText(this.f3516c.f3511j, R.string.empty_input_tip, 1).show();
        } else {
            this.f3516c.f3502a.m3309b(this.f3515b, strTrim);
        }
    }
}
