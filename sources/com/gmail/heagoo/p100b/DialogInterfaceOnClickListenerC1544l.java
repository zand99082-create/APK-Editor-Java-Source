package com.gmail.heagoo.p100b;

import android.content.DialogInterface;
import android.widget.EditText;
import android.widget.Toast;
import com.gmail.heagoo.apkeditor.pro.R;
import java.io.File;
import java.io.IOException;

/* JADX INFO: renamed from: com.gmail.heagoo.b.l */
/* JADX INFO: loaded from: classes.dex */
final class DialogInterfaceOnClickListenerC1544l implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ EditText f4620a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ String f4621b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ C1537e f4622c;

    DialogInterfaceOnClickListenerC1544l(C1537e c1537e, EditText editText, String str) {
        this.f4622c = c1537e;
        this.f4620a = editText;
        this.f4621b = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        boolean zCreateNewFile;
        String strTrim = this.f4620a.getText().toString().trim();
        if ("".equals(strTrim)) {
            Toast.makeText(this.f4622c.f4605a, R.string.empty_input_tip, 1).show();
            return;
        }
        String string = null;
        try {
            zCreateNewFile = new File(new File(this.f4621b), strTrim).createNewFile();
        } catch (IOException e) {
            e = e;
            zCreateNewFile = false;
        }
        try {
            if (zCreateNewFile) {
                this.f4622c.f4609e.m3733a(this.f4621b);
            } else {
                string = this.f4622c.f4605a.getString(R.string.failed_create_file);
            }
        } catch (IOException e2) {
            e = e2;
            string = String.format(this.f4622c.f4605a.getString(R.string.general_error), e.getMessage());
        }
        if (zCreateNewFile) {
            return;
        }
        Toast.makeText(this.f4622c.f4605a, string, 1).show();
    }
}
