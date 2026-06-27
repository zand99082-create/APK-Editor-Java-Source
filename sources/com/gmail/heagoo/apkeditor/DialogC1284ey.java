package com.gmail.heagoo.apkeditor;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.gmail.heagoo.apkeditor.pro.R;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.ey */
/* JADX INFO: loaded from: classes.dex */
public final class DialogC1284ey extends Dialog implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    private WeakReference f3734a;

    /* JADX INFO: renamed from: b */
    private InterfaceC1291fa f3735b;

    /* JADX INFO: renamed from: c */
    private int f3736c;

    @SuppressLint({"InflateParams"})
    public DialogC1284ey(Activity activity, InterfaceC1291fa interfaceC1291fa, int i) {
        super(activity);
        this.f3734a = new WeakReference(activity);
        this.f3735b = interfaceC1291fa;
        this.f3736c = i;
        requestWindowFeature(1);
        super.setContentView(LayoutInflater.from(activity).inflate(R.layout.dlg_processing, (ViewGroup) null));
        super.setCancelable(false);
        new C1292fb(this).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m3258a() {
        try {
            dismiss();
        } catch (Exception e) {
        }
    }

    /* JADX INFO: renamed from: a */
    protected final void m3261a(int i) {
        Activity activity;
        if (i == -1 || (activity = (Activity) this.f3734a.get()) == null) {
            return;
        }
        Toast.makeText(activity, i, 0).show();
    }

    /* JADX INFO: renamed from: a */
    protected final void m3262a(String str) {
        Activity activity = (Activity) this.f3734a.get();
        if (activity != null) {
            activity.runOnUiThread(new RunnableC1285ez(this, str));
        }
    }

    /* JADX INFO: renamed from: b */
    protected final void m3263b(String str) {
        Activity activity = (Activity) this.f3734a.get();
        if (activity != null) {
            Toast.makeText(activity, str, 0).show();
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view.getId() == R.id.close_button) {
            m3258a();
        }
    }
}
