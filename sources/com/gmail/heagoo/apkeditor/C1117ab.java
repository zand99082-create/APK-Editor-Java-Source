package com.gmail.heagoo.apkeditor;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.ab */
/* JADX INFO: loaded from: classes.dex */
final class C1117ab implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ ApkInfoActivity f3319a;

    C1117ab(ApkInfoActivity apkInfoActivity) {
        this.f3319a = apkInfoActivity;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        this.f3319a.f2892D = (String) this.f3319a.f2893E.get(i);
        this.f3319a.m2685u();
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
