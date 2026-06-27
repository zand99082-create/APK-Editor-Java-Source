package com.gmail.heagoo.apkeditor;

import android.os.AsyncTask;
import android.widget.Toast;
import com.gmail.heagoo.apkeditor.pro.R;
import com.gmail.heagoo.common.C1557f;
import com.gmail.heagoo.neweditor.C1594e;
import java.io.File;
import java.io.IOException;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.ip */
/* JADX INFO: loaded from: classes.dex */
final class AsyncTaskC1386ip extends AsyncTask {

    /* JADX INFO: renamed from: a */
    private String f4027a;

    /* JADX INFO: renamed from: b */
    private boolean f4028b;

    /* JADX INFO: renamed from: c */
    private String f4029c;

    /* JADX INFO: renamed from: d */
    private /* synthetic */ TextEditNormalActivity f4030d;

    private AsyncTaskC1386ip(TextEditNormalActivity textEditNormalActivity) {
        this.f4030d = textEditNormalActivity;
    }

    /* synthetic */ AsyncTaskC1386ip(TextEditNormalActivity textEditNormalActivity, byte b2) {
        this(textEditNormalActivity);
    }

    /* JADX INFO: renamed from: a */
    private Boolean m3445a() {
        C1594e c1594e = new C1594e(this.f4030d, new File(this.f4029c), this.f4027a);
        try {
            if (this.f4030d.f3917h != null) {
                c1594e.m3906a(this.f4030d, this.f4030d.f3917h, R.string.error_file_too_big);
                c1594e.m3911a(true);
                new File(this.f4030d.f3917h).delete();
                this.f4030d.f3917h = null;
            } else {
                c1594e.m3906a(this.f4030d, this.f4029c, R.string.error_file_too_big);
            }
            this.f4030d.f3919j = c1594e;
            this.f4028b = true;
        } catch (IOException e) {
            this.f4028b = false;
        }
        if (!AbstractActivityC1341gy.m3393e(this.f4029c)) {
            AbstractActivityC1341gy.m3388c(this.f4029c);
        }
        return null;
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return m3445a();
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(Object obj) {
        if (this.f4028b) {
            TextEditNormalActivity.m2868c(this.f4030d, true);
            this.f4030d.f3129l.removeTextChangedListener(this.f4030d.f3116X);
            this.f4030d.f3129l.setText(this.f4030d.f3919j.m3904a());
            this.f4030d.f3129l.m3863b(801639);
            this.f4030d.f3129l.addTextChangedListener(this.f4030d.f3116X);
            int length = this.f4030d.f3919j.m3904a().split("\n").length + 1;
            C1387iq c1387iq = this.f4030d.f3128k;
            TextEditNormalActivity.m2857a(this.f4030d, true, C1387iq.m3446a(length));
            this.f4030d.m2891a(true);
            this.f4030d.m2890a(-1, -1, false);
            this.f4030d.m2893d();
        } else {
            Toast.makeText(this.f4030d, "Failed to open " + this.f4029c, 1).show();
        }
        this.f4030d.f3121ac.setMaxWidth((((C1557f.m3763a(this.f4030d) - this.f4030d.f3122ad.getWidth()) - this.f4030d.f3123ae.getWidth()) - this.f4030d.f3124af.getWidth()) - ((int) (16.0f * this.f4030d.getResources().getDisplayMetrics().density)));
    }

    @Override // android.os.AsyncTask
    protected final void onPreExecute() {
        this.f4029c = (String) this.f4030d.f3911b.get(this.f4030d.f3914e);
        this.f4030d.f3125ag = ((Integer) this.f4030d.f3912c.get(this.f4030d.f3914e)).intValue();
        this.f4027a = (String) this.f4030d.f3913d.get(this.f4030d.f3914e);
        this.f4030d.m3400a(this.f4029c);
        this.f4030d.f3121ac.setText(this.f4030d.m3405f(this.f4029c));
        this.f4030d.f3124af.setVisibility((AbstractActivityC1341gy.m3388c(this.f4029c) || AbstractActivityC1341gy.m3391d(this.f4029c)) ? 0 : 8);
        if (this.f4030d.f3914e >= this.f4030d.f3911b.size() - 1) {
            this.f4030d.f3123ae.setVisibility(8);
        } else {
            this.f4030d.f3123ae.setVisibility(0);
        }
        if (this.f4030d.f3914e == 0) {
            this.f4030d.f3122ad.setVisibility(8);
        } else {
            this.f4030d.f3122ad.setVisibility(0);
        }
    }
}
