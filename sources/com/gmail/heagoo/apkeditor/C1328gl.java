package com.gmail.heagoo.apkeditor;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.gl */
/* JADX INFO: loaded from: classes.dex */
final class C1328gl implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ DialogC1327gk f3875a;

    C1328gl(DialogC1327gk dialogC1327gk) {
        this.f3875a = dialogC1327gk;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        this.f3875a.m3368a(i);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
