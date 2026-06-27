package com.gmail.heagoo.apkeditor;

import android.os.AsyncTask;
import android.widget.Toast;
import com.gmail.heagoo.apkeditor.pro.R;
import com.gmail.heagoo.common.C1557f;
import com.gmail.heagoo.neweditor.C1594e;
import java.io.File;
import java.io.IOException;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.hr */
/* JADX INFO: loaded from: classes.dex */
final class AsyncTaskC1361hr extends AsyncTask {

    /* JADX INFO: renamed from: a */
    private String f3970a;

    /* JADX INFO: renamed from: b */
    private boolean f3971b;

    /* JADX INFO: renamed from: c */
    private String f3972c;

    /* JADX INFO: renamed from: d */
    private /* synthetic */ TextEditBigActivity f3973d;

    private AsyncTaskC1361hr(TextEditBigActivity textEditBigActivity) {
        this.f3973d = textEditBigActivity;
    }

    /* synthetic */ AsyncTaskC1361hr(TextEditBigActivity textEditBigActivity, byte b2) {
        this(textEditBigActivity);
    }

    /* JADX INFO: renamed from: a */
    private Boolean m3407a() {
        C1594e c1594e = new C1594e(this.f3973d, new File(this.f3972c), this.f3970a);
        try {
            if (this.f3973d.f3917h != null) {
                c1594e.m3906a(this.f3973d, this.f3973d.f3917h, R.string.error_file_too_big);
                c1594e.m3911a(true);
                new File(this.f3973d.f3917h).delete();
                this.f3973d.f3917h = null;
            } else {
                c1594e.m3906a(this.f3973d, this.f3972c, R.string.error_file_too_big);
            }
            this.f3973d.f3919j = c1594e;
            this.f3971b = true;
        } catch (IOException e) {
            this.f3971b = false;
        }
        if (!AbstractActivityC1341gy.m3393e(this.f3972c)) {
            AbstractActivityC1341gy.m3388c(this.f3972c);
        }
        return null;
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return m3407a();
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(Object obj) {
        if (this.f3971b) {
            this.f3973d.f3071K.m3426a(this.f3973d.f3919j);
            this.f3973d.f3071K.m3427a(this.f3973d.f3919j.m3904a());
            TextEditBigActivity.m2845f(this.f3973d);
            this.f3973d.m2853d();
        } else {
            Toast.makeText(this.f3973d, "Failed to open " + this.f3972c, 1).show();
        }
        this.f3973d.f3066F.setMaxWidth((((C1557f.m3763a(this.f3973d) - this.f3973d.f3067G.getWidth()) - this.f3973d.f3068H.getWidth()) - this.f3973d.f3069I.getWidth()) - ((int) (16.0f * this.f3973d.getResources().getDisplayMetrics().density)));
    }

    @Override // android.os.AsyncTask
    protected final void onPreExecute() {
        this.f3972c = (String) this.f3973d.f3911b.get(this.f3973d.f3914e);
        this.f3973d.f3070J = ((Integer) this.f3973d.f3912c.get(this.f3973d.f3914e)).intValue();
        this.f3970a = (String) this.f3973d.f3913d.get(this.f3973d.f3914e);
        this.f3973d.m3400a(this.f3972c);
        this.f3973d.f3066F.setText(this.f3973d.m3405f(this.f3972c));
        this.f3973d.f3069I.setVisibility((AbstractActivityC1341gy.m3388c(this.f3972c) || AbstractActivityC1341gy.m3391d(this.f3972c)) ? 0 : 8);
        if (this.f3973d.f3914e >= this.f3973d.f3911b.size() - 1) {
            this.f3973d.f3068H.setVisibility(8);
        } else {
            this.f3973d.f3068H.setVisibility(0);
        }
        if (this.f3973d.f3914e == 0) {
            this.f3973d.f3067G.setVisibility(8);
        } else {
            this.f3973d.f3067G.setVisibility(0);
        }
    }
}
