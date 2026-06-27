package com.gmail.heagoo.apkeditor;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;
import com.gmail.heagoo.apkeditor.pro.R;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.dk */
/* JADX INFO: loaded from: classes.dex */
public final class C1218dk {

    /* JADX INFO: renamed from: a */
    private Context f3552a;

    /* JADX INFO: renamed from: b */
    private InterfaceC1221dn f3553b;

    /* JADX INFO: renamed from: c */
    private EditText f3554c;

    /* JADX INFO: renamed from: d */
    private EditText f3555d;

    /* JADX INFO: renamed from: e */
    private AlertDialog f3556e;

    /* JADX INFO: renamed from: b */
    static /* synthetic */ void m3129b(C1218dk c1218dk) {
        String string = c1218dk.f3554c.getText().toString();
        String string2 = c1218dk.f3555d.getText().toString();
        if ("".equals(string)) {
            Toast.makeText(c1218dk.f3552a, R.string.empty_input_tip, 1).show();
            c1218dk.f3554c.requestFocus();
            return;
        }
        if ("".equals(string2)) {
            Toast.makeText(c1218dk.f3552a, R.string.empty_input_tip, 1).show();
            c1218dk.f3555d.requestFocus();
            return;
        }
        try {
            int iIntValue = Integer.valueOf(string).intValue();
            int iIntValue2 = Integer.valueOf(string2).intValue();
            if (iIntValue > iIntValue2) {
                Toast.makeText(c1218dk.f3552a, R.string.err_from_greater_than_to, 1).show();
                c1218dk.f3554c.requestFocus();
            } else if (c1218dk.f3553b != null) {
                c1218dk.f3553b.mo2850a(iIntValue, iIntValue2);
                c1218dk.f3556e.dismiss();
            }
        } catch (Exception e) {
            Toast.makeText(c1218dk.f3552a, R.string.unknown_error, 1).show();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m3130a(Context context, int i, InterfaceC1221dn interfaceC1221dn) {
        this.f3552a = context;
        this.f3553b = interfaceC1221dn;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.dlg_lines_op, (ViewGroup) null);
        this.f3554c = (EditText) viewInflate.findViewById(R.id.et_from);
        this.f3555d = (EditText) viewInflate.findViewById(R.id.et_to);
        this.f3556e = new AlertDialog.Builder(context).setView(viewInflate).setTitle(i).setPositiveButton(android.R.string.ok, (DialogInterface.OnClickListener) null).setNegativeButton(android.R.string.cancel, (DialogInterface.OnClickListener) null).create();
        this.f3556e.setOnShowListener(new DialogInterfaceOnShowListenerC1219dl(this));
        this.f3556e.show();
    }
}
