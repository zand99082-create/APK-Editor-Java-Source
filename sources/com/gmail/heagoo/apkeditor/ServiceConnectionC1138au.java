package com.gmail.heagoo.apkeditor;

import android.app.AlertDialog;
import android.content.ComponentName;
import android.content.DialogInterface;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.gmail.heagoo.apkeditor.pro.R;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.au */
/* JADX INFO: loaded from: classes.dex */
final class ServiceConnectionC1138au implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    private boolean f3352a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ ApkInfoActivity f3353b;

    public ServiceConnectionC1138au(ApkInfoActivity apkInfoActivity, boolean z) {
        this.f3353b = apkInfoActivity;
        this.f3352a = z;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (((BinderC1401k) iBinder).m3454b()) {
            new AlertDialog.Builder(this.f3353b).setMessage(R.string.build_in_progress_tip).setTitle(R.string.please_note).setPositiveButton(android.R.string.ok, (DialogInterface.OnClickListener) null).show();
        } else {
            this.f3353b.m2668e(this.f3352a);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
