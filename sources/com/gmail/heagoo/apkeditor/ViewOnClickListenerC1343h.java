package com.gmail.heagoo.apkeditor;

import android.content.Intent;
import android.view.View;
import com.gmail.heagoo.p084a.p089c.C1067a;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.h */
/* JADX INFO: loaded from: classes.dex */
final class ViewOnClickListenerC1343h implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ String f3937a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ int f3938b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ C1317g f3939c;

    ViewOnClickListenerC1343h(C1317g c1317g, String str, int i) {
        this.f3939c = c1317g;
        this.f3937a = str;
        this.f3938b = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ApkComposeActivity apkComposeActivity = (ApkComposeActivity) this.f3939c.f3850a.get();
        Intent intentM2439a = C1067a.m2439a(apkComposeActivity, this.f3937a, apkComposeActivity.f2830a);
        if (this.f3938b > 0) {
            C1067a.m2442a(intentM2439a, "startLine", new StringBuilder().append(this.f3938b).toString());
        }
        apkComposeActivity.startActivity(intentM2439a);
    }
}
