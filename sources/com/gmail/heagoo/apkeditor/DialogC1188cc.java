package com.gmail.heagoo.apkeditor;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.gmail.heagoo.apkeditor.pro.R;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.cc */
/* JADX INFO: loaded from: classes.dex */
public final class DialogC1188cc extends Dialog implements View.OnClickListener {

    /* JADX INFO: renamed from: e */
    private static Boolean f3473e;

    /* JADX INFO: renamed from: a */
    private View f3474a;

    /* JADX INFO: renamed from: b */
    private InterfaceC1189cd f3475b;

    /* JADX INFO: renamed from: c */
    private String f3476c;

    /* JADX INFO: renamed from: d */
    private String f3477d;

    /* JADX INFO: renamed from: f */
    private boolean f3478f;

    public DialogC1188cc(Context context, InterfaceC1189cd interfaceC1189cd, String str) {
        this(context, interfaceC1189cd, str, null);
    }

    @SuppressLint({"InflateParams"})
    public DialogC1188cc(Context context, InterfaceC1189cd interfaceC1189cd, String str, String str2) {
        super(context);
        new WeakReference(context);
        this.f3475b = interfaceC1189cd;
        this.f3476c = str;
        this.f3477d = str2;
        this.f3478f = true;
        requestWindowFeature(1);
        this.f3474a = LayoutInflater.from(context).inflate(R.layout.dlg_editmode, (ViewGroup) null);
        setContentView(this.f3474a);
        TextView textView = (TextView) this.f3474a.findViewById(R.id.simple_edit);
        TextView textView2 = (TextView) this.f3474a.findViewById(R.id.full_edit);
        TextView textView3 = (TextView) this.f3474a.findViewById(R.id.common_edit);
        TextView textView4 = (TextView) this.f3474a.findViewById(R.id.xml_edit);
        textView.setOnClickListener(this);
        textView2.setOnClickListener(this);
        textView3.setOnClickListener(this);
        textView4.setOnClickListener(this);
        if (this.f3477d != null && this.f3478f) {
            TextView textView5 = (TextView) this.f3474a.findViewById(R.id.data_edit);
            textView5.setVisibility(0);
            textView5.setOnClickListener(this);
        }
        if (f3473e == null) {
            f3473e = Boolean.valueOf(MainActivity.isX86() != 0);
        }
        if (f3473e.booleanValue() || Build.VERSION.SDK_INT < 21) {
            this.f3474a.findViewById(R.id.xml_edit_layout).setVisibility(8);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id = view.getId();
        dismiss();
        if (id == R.id.simple_edit) {
            this.f3475b.mo2740a(1, this.f3476c);
            return;
        }
        if (id == R.id.full_edit) {
            this.f3475b.mo2740a(0, this.f3476c);
            return;
        }
        if (id == R.id.common_edit) {
            this.f3475b.mo2740a(2, this.f3476c);
        } else if (id == R.id.xml_edit) {
            this.f3475b.mo2740a(4, this.f3476c);
        } else if (id == R.id.data_edit) {
            this.f3475b.mo2740a(3, this.f3477d);
        }
    }
}
