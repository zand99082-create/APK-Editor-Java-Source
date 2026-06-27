package com.gmail.heagoo.appdm;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.gmail.heagoo.apkeditor.pro.R;
import com.gmail.heagoo.appdm.util.C1526i;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.gmail.heagoo.appdm.a */
/* JADX INFO: loaded from: classes.dex */
public final class DialogC1491a extends Dialog {

    /* JADX INFO: renamed from: a */
    private View f4481a;

    /* JADX INFO: renamed from: b */
    private WeakReference f4482b;

    /* JADX INFO: renamed from: c */
    private String f4483c;

    /* JADX INFO: renamed from: d */
    private String f4484d;

    /* JADX INFO: renamed from: e */
    private String f4485e;

    @SuppressLint({"InflateParams"})
    public DialogC1491a(Activity activity, String str, String str2) {
        super(activity);
        requestWindowFeature(1);
        setCancelable(false);
        this.f4482b = new WeakReference(activity);
        this.f4483c = str;
        this.f4484d = str2;
        this.f4481a = LayoutInflater.from(activity).inflate(R.layout.appdm_dlg_saveapk, (ViewGroup) null);
        setContentView(this.f4481a);
    }

    /* JADX INFO: renamed from: b */
    private void m3692b(String str) {
        Activity activity = (Activity) this.f4482b.get();
        if (activity != null) {
            activity.runOnUiThread(new RunnableC1502d(this, activity, str));
        }
    }

    /* JADX INFO: renamed from: c */
    private void m3693c() {
        Activity activity = (Activity) this.f4482b.get();
        if (activity != null) {
            activity.runOnUiThread(new RunnableC1501c(this));
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m3694a() {
        show();
        if (C1526i.m3726a()) {
            this.f4485e = C1526i.m3725a((Context) this.f4482b.get()) + "/" + this.f4484d + ".apk";
            new C1500b(this, this.f4483c, this.f4485e).start();
        } else {
            Activity activity = (Activity) this.f4482b.get();
            if (activity != null) {
                Toast.makeText(activity, "Cannot find SD card to save the APK.", 0).show();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    protected final void m3695a(String str) {
        m3692b("Failed: " + str);
        m3693c();
    }

    /* JADX INFO: renamed from: b */
    protected final void m3696b() {
        m3692b(String.format(((Activity) this.f4482b.get()).getResources().getString(R.string.apk_saved_tip), this.f4485e));
        m3693c();
    }
}
