package com.gmail.heagoo.apkeditor;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.iu */
/* JADX INFO: loaded from: classes.dex */
final class C1391iu implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ UserAppActivity f4037a;

    C1391iu(UserAppActivity userAppActivity) {
        this.f4037a = userAppActivity;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.f4037a.f3144c.setVisibility(4);
        this.f4037a.f3152l.setVisibility(0);
        switch (i) {
            case 0:
                UserAppActivity.m2899a(this.f4037a, 0, this.f4037a.f3143b);
                break;
            case 1:
                UserAppActivity.m2899a(this.f4037a, 1, this.f4037a.f3143b);
                break;
            case 2:
                UserAppActivity.m2899a(this.f4037a, this.f4037a.f3142a, 0);
                break;
            case 3:
                UserAppActivity.m2899a(this.f4037a, this.f4037a.f3142a, 1);
                break;
        }
        if (this.f4037a.f3148g != null) {
            this.f4037a.f3148g.dismiss();
        }
    }
}
