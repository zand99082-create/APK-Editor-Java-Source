package com.gmail.heagoo.pngeditor;

import android.view.View;
import com.gmail.heagoo.apkeditor.pro.R;

/* JADX INFO: renamed from: com.gmail.heagoo.pngeditor.e */
/* JADX INFO: loaded from: classes.dex */
final class ViewOnClickListenerC1623e implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ PngEditActivity f4923a;

    ViewOnClickListenerC1623e(PngEditActivity pngEditActivity) {
        this.f4923a = pngEditActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        float fM2324a = 1.0f;
        int id = view.getId();
        if (id == R.id.btn_scale_fit) {
            fM2324a = this.f4923a.f4894g.m2324a();
        } else if (id != R.id.btn_scale_100) {
            if (id == R.id.btn_scale_200) {
                fM2324a = 2.0f;
            } else if (id == R.id.btn_scale_400) {
                fM2324a = 4.0f;
            }
        }
        this.f4923a.f4894g.m2325a(fM2324a);
        this.f4923a.f4894g.postInvalidate();
        this.f4923a.mo2341a(fM2324a);
        this.f4923a.f4909v.dismiss();
    }
}
