package com.gmail.heagoo.apkeditor;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.gmail.heagoo.apkeditor.pro.R;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.ca */
/* JADX INFO: loaded from: classes.dex */
public final class DialogC1186ca extends Dialog implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    private View f3470a;

    /* JADX INFO: renamed from: b */
    private InterfaceC1187cb f3471b;

    /* JADX INFO: renamed from: c */
    private String f3472c;

    public DialogC1186ca(Context context, InterfaceC1187cb interfaceC1187cb, String str) {
        this(context, interfaceC1187cb, str, null);
    }

    @SuppressLint({"InflateParams"})
    private DialogC1186ca(Context context, InterfaceC1187cb interfaceC1187cb, String str, String str2) {
        super(context);
        new WeakReference(context);
        this.f3471b = interfaceC1187cb;
        this.f3472c = str;
        requestWindowFeature(1);
        this.f3470a = LayoutInflater.from(context).inflate(R.layout.dlg_decodemode, (ViewGroup) null);
        setContentView(this.f3470a);
        TextView textView = (TextView) this.f3470a.findViewById(R.id.decode_all_files);
        TextView textView2 = (TextView) this.f3470a.findViewById(R.id.decode_partial_files);
        Button button = (Button) this.f3470a.findViewById(R.id.cancel);
        textView.setOnClickListener(this);
        textView2.setOnClickListener(this);
        button.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id = view.getId();
        if (id == R.id.decode_all_files) {
            this.f3471b.mo3096a(0);
        } else if (id == R.id.decode_partial_files) {
            this.f3471b.mo3096a(1);
        }
        dismiss();
    }
}
