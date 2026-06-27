package com.gmail.heagoo.apkeditor;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import com.gmail.heagoo.apkeditor.pro.R;
import java.lang.ref.WeakReference;
import java.util.Locale;
import p000a.p014d.C0089i;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.dh */
/* JADX INFO: loaded from: classes.dex */
public final class DialogC1215dh extends Dialog implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    private WeakReference f3537a;

    /* JADX INFO: renamed from: b */
    private String[] f3538b;

    /* JADX INFO: renamed from: c */
    private String[] f3539c;

    /* JADX INFO: renamed from: d */
    private View f3540d;

    /* JADX INFO: renamed from: e */
    private EditText f3541e;

    /* JADX INFO: renamed from: f */
    private boolean f3542f;

    @SuppressLint({"InflateParams"})
    public DialogC1215dh(ApkInfoActivity apkInfoActivity, String[] strArr, String[] strArr2) {
        super(apkInfoActivity);
        requestWindowFeature(1);
        this.f3539c = strArr;
        this.f3538b = strArr2;
        this.f3542f = this.f3539c != null;
        this.f3537a = new WeakReference(apkInfoActivity);
        this.f3540d = apkInfoActivity.getLayoutInflater().inflate(R.layout.dlg_selectlanguage, (ViewGroup) null, false);
        setContentView(this.f3540d);
        this.f3541e = (EditText) this.f3540d.findViewById(R.id.language_code);
        if (this.f3542f) {
            this.f3541e.setEnabled(false);
        }
        int iM228a = C0089i.m228a();
        if (this.f3538b == null || this.f3539c == null) {
            this.f3538b = new String[iM228a];
            this.f3539c = new String[iM228a];
            C0089i.m230a(this.f3538b, this.f3539c);
        }
        Spinner spinner = (Spinner) findViewById(R.id.language_spinner);
        ArrayAdapter arrayAdapter = new ArrayAdapter((Context) this.f3537a.get(), android.R.layout.simple_spinner_item, this.f3539c);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter((SpinnerAdapter) arrayAdapter);
        int iM3125a = m3125a("-" + Locale.getDefault().getLanguage());
        if (iM3125a != -1) {
            spinner.setSelection(iM3125a);
        }
        spinner.setOnItemSelectedListener(new C1216di(this));
        ((Button) this.f3540d.findViewById(R.id.btn_addlang_ok)).setOnClickListener(this);
        ((Button) this.f3540d.findViewById(R.id.btn_addlang_cancel)).setOnClickListener(this);
    }

    /* JADX INFO: renamed from: a */
    private int m3125a(String str) {
        for (int i = 0; i < this.f3538b.length; i++) {
            if (this.f3538b[i].startsWith(str)) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: a */
    protected final void m3126a(int i) {
        this.f3541e.setText(this.f3538b[i]);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z;
        int id = view.getId();
        if (id != R.id.btn_addlang_ok) {
            if (id == R.id.btn_addlang_cancel) {
                dismiss();
                return;
            }
            return;
        }
        String string = this.f3541e.getText().toString();
        if (this.f3542f) {
            ((ApkInfoActivity) this.f3537a.get()).m2717f(string);
            dismiss();
            return;
        }
        ApkInfoActivity apkInfoActivity = (ApkInfoActivity) this.f3537a.get();
        String strM2718g = apkInfoActivity.m2718g(string);
        if (strM2718g == null) {
            z = true;
        } else {
            Toast.makeText(apkInfoActivity, strM2718g, 0).show();
            z = false;
        }
        if (z) {
            dismiss();
        }
    }

    @Override // android.app.Dialog
    public final void setTitle(int i) {
        ((TextView) this.f3540d.findViewById(R.id.tv_title)).setText(i);
    }
}
