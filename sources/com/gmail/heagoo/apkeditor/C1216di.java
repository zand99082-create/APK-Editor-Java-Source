package com.gmail.heagoo.apkeditor;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.di */
/* JADX INFO: loaded from: classes.dex */
final class C1216di implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ DialogC1215dh f3543a;

    C1216di(DialogC1215dh dialogC1215dh) {
        this.f3543a = dialogC1215dh;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        this.f3543a.m3126a(i);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
