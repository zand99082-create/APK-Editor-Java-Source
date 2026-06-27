package com.gmail.heagoo.apkeditor;

import android.content.DialogInterface;
import android.widget.CheckBox;
import com.gmail.heagoo.apkeditor.p092ac.C1119a;
import com.gmail.heagoo.apkeditor.p092ac.EditTextWithTip;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.ej */
/* JADX INFO: loaded from: classes.dex */
final class DialogInterfaceOnClickListenerC1271ej implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ EditTextWithTip f3690a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ CheckBox f3691b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ C1119a f3692c;

    /* JADX INFO: renamed from: d */
    private /* synthetic */ int f3693d;

    /* JADX INFO: renamed from: e */
    private /* synthetic */ ViewOnClickListenerC1270ei f3694e;

    DialogInterfaceOnClickListenerC1271ej(ViewOnClickListenerC1270ei viewOnClickListenerC1270ei, EditTextWithTip editTextWithTip, CheckBox checkBox, C1119a c1119a, int i) {
        this.f3694e = viewOnClickListenerC1270ei;
        this.f3690a = editTextWithTip;
        this.f3691b = checkBox;
        this.f3692c = c1119a;
        this.f3693d = i;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) throws Throwable {
        this.f3694e.f3689n = this.f3690a.getText().toString();
        if (this.f3691b.isChecked()) {
            ViewOnClickListenerC1270ei.m3233a(this.f3694e, true);
        }
        if (!"".equals(this.f3694e.f3689n.trim())) {
            this.f3692c.m3026a(this.f3694e.f3689n);
        }
        this.f3694e.m3234d(this.f3693d);
    }
}
