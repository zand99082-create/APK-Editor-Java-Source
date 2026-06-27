package com.gmail.heagoo.pngeditor;

import android.content.DialogInterface;
import android.widget.EditText;
import android.widget.Toast;
import com.gmail.heagoo.apkeditor.pro.R;

/* JADX INFO: renamed from: com.gmail.heagoo.pngeditor.g */
/* JADX INFO: loaded from: classes.dex */
final class DialogInterfaceOnClickListenerC1625g implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ EditText f4925a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ EditText f4926b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ PngEditActivity f4927c;

    DialogInterfaceOnClickListenerC1625g(PngEditActivity pngEditActivity, EditText editText, EditText editText2) {
        this.f4927c = pngEditActivity;
        this.f4925a = editText;
        this.f4926b = editText2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        boolean z = false;
        String string = this.f4925a.getText().toString();
        String string2 = this.f4926b.getText().toString();
        try {
            int iIntValue = Integer.valueOf(string).intValue();
            int iIntValue2 = Integer.valueOf(string2).intValue();
            if (iIntValue > 0 && iIntValue2 > 0 && iIntValue < 32768 && iIntValue2 < 32768) {
                z = true;
            }
        } catch (Exception e) {
        }
        if (!z) {
            Toast.makeText(this.f4927c, R.string.invalid_input, 1).show();
        } else {
            this.f4927c.f4903p.setText(string);
            this.f4927c.f4904q.setText(string2);
        }
    }
}
