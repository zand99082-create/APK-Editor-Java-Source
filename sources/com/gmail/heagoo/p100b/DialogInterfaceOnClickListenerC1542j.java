package com.gmail.heagoo.p100b;

import android.content.DialogInterface;
import android.widget.EditText;
import java.util.Iterator;

/* JADX INFO: renamed from: com.gmail.heagoo.b.j */
/* JADX INFO: loaded from: classes.dex */
final class DialogInterfaceOnClickListenerC1542j implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ EditText f4616a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ String f4617b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ String f4618c;

    /* JADX INFO: renamed from: d */
    private /* synthetic */ C1537e f4619d;

    DialogInterfaceOnClickListenerC1542j(C1537e c1537e, EditText editText, String str, String str2) {
        this.f4619d = c1537e;
        this.f4616a = editText;
        this.f4617b = str;
        this.f4618c = str2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        String string = this.f4616a.getText().toString();
        if (this.f4619d.m3747a(this.f4617b, this.f4618c, string)) {
            C1535c c1535c = this.f4619d.f4609e;
            String str = this.f4618c;
            synchronized (c1535c.f4597a) {
                Iterator it = c1535c.f4597a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C1533a c1533a = (C1533a) it.next();
                    if (c1533a.f4594a.equals(str)) {
                        c1533a.f4594a = string;
                        break;
                    }
                }
            }
            c1535c.notifyDataSetChanged();
        }
    }
}
