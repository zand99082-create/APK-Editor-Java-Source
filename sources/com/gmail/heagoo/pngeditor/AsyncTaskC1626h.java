package com.gmail.heagoo.pngeditor;

import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.widget.LinearLayout;
import android.widget.Toast;
import com.gmail.heagoo.apkeditor.pro.R;
import com.p080c.p081a.C1022f;

/* JADX INFO: renamed from: com.gmail.heagoo.pngeditor.h */
/* JADX INFO: loaded from: classes.dex */
final class AsyncTaskC1626h extends AsyncTask {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ PngEditActivity f4928a;

    AsyncTaskC1626h(PngEditActivity pngEditActivity) {
        this.f4928a = pngEditActivity;
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        this.f4928a.f4905r = BitmapFactory.decodeFile(this.f4928a.f4889b);
        return Boolean.valueOf(this.f4928a.f4905r != null);
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(Object obj) {
        if (!((Boolean) obj).booleanValue()) {
            Toast.makeText(this.f4928a, String.format(this.f4928a.getString(R.string.cannot_open_file), this.f4928a.f4889b), 1).show();
            this.f4928a.finish();
            return;
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        this.f4928a.f4894g = new C1022f(this.f4928a, this.f4928a.f4905r);
        this.f4928a.f4894g.m2328a(this.f4928a);
        this.f4928a.f4894g.setLayoutParams(layoutParams);
        this.f4928a.f4894g.m2331b(1.0f);
        ((LinearLayout) this.f4928a.findViewById(R.id.image_layout)).addView(this.f4928a.f4894g);
        this.f4928a.mo2341a(this.f4928a.f4894g.m2335e());
    }
}
