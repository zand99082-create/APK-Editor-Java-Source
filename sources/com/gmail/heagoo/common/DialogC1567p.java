package com.gmail.heagoo.common;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.view.ViewGroup;
import android.widget.Toast;
import com.gmail.heagoo.apkeditor.InterfaceC1291fa;
import com.gmail.heagoo.apkeditor.pro.R;

/* JADX INFO: renamed from: com.gmail.heagoo.common.p */
/* JADX INFO: loaded from: classes.dex */
public final class DialogC1567p extends Dialog {

    /* JADX INFO: renamed from: a */
    private Activity f4651a;

    /* JADX INFO: renamed from: b */
    private InterfaceC1291fa f4652b;

    /* JADX INFO: renamed from: c */
    private int f4653c;

    @SuppressLint({"InflateParams"})
    public DialogC1567p(Activity activity, InterfaceC1291fa interfaceC1291fa, int i) {
        super(activity);
        this.f4651a = activity;
        this.f4652b = interfaceC1291fa;
        this.f4653c = i;
        requestWindowFeature(1);
        super.setContentView(activity.getLayoutInflater().inflate(R.layout.dlg_processing, (ViewGroup) null));
        super.setCancelable(false);
        new C1569r(this).start();
    }

    /* JADX INFO: renamed from: a */
    protected final void m3784a(int i) {
        Toast.makeText(this.f4651a, i, 0).show();
    }

    /* JADX INFO: renamed from: a */
    protected final void m3785a(String str) {
        this.f4651a.runOnUiThread(new RunnableC1568q(this, str));
    }

    /* JADX INFO: renamed from: b */
    protected final void m3786b(String str) {
        Toast.makeText(this.f4651a, str, 0).show();
    }
}
