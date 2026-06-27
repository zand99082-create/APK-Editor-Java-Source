package com.gmail.heagoo.apkeditor;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.gmail.heagoo.apkeditor.pro.R;
import com.gmail.heagoo.p084a.p089c.C1067a;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.gx */
/* JADX INFO: loaded from: classes.dex */
public final class DialogC1340gx extends Dialog implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    private WeakReference f3903a;

    /* JADX INFO: renamed from: b */
    private C1338gv f3904b;

    /* JADX INFO: renamed from: c */
    private int f3905c;

    /* JADX INFO: renamed from: d */
    private View f3906d;

    /* JADX INFO: renamed from: e */
    private TextView f3907e;

    /* JADX INFO: renamed from: f */
    private EditText f3908f;

    @SuppressLint({"InflateParams"})
    public DialogC1340gx(Context context, C1338gv c1338gv, int i) {
        super(context);
        requestWindowFeature(1);
        getWindow().setSoftInputMode(4);
        this.f3903a = new WeakReference(context);
        this.f3904b = c1338gv;
        this.f3905c = i;
        this.f3906d = LayoutInflater.from(context).inflate(R.layout.dlg_stringvalue, (ViewGroup) null);
        setContentView(this.f3906d);
        TextView textView = (TextView) this.f3906d.findViewById(R.id.key);
        textView.setOnClickListener(this);
        this.f3907e = textView;
        this.f3908f = (EditText) this.f3906d.findViewById(R.id.value);
        ((Button) this.f3906d.findViewById(R.id.btn_editstring_ok)).setOnClickListener(this);
        ((Button) this.f3906d.findViewById(R.id.btn_editstring_cancel)).setOnClickListener(this);
    }

    /* JADX INFO: renamed from: a */
    public final void m3381a(String str, String str2) {
        this.f3907e.setText(str);
        this.f3908f.setText(str2);
        this.f3908f.setSelection(str2 != null ? str2.length() : 0);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id = view.getId();
        if (id == R.id.btn_editstring_ok) {
            this.f3904b.m3378a(this.f3905c, this.f3908f.getText().toString());
            dismiss();
        } else if (id == R.id.btn_editstring_cancel) {
            cancel();
        } else if (id == R.id.key) {
            Context context = (Context) this.f3903a.get();
            String string = this.f3907e.getText().toString();
            C1067a.m2519c(context, string);
            Toast.makeText(context, String.format(context.getString(R.string.copied_to_clipboard), string), 0).show();
        }
    }
}
