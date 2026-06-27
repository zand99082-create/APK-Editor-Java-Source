package com.gmail.heagoo.appdm;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: com.gmail.heagoo.appdm.ab */
/* JADX INFO: loaded from: classes.dex */
final class C1493ab implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ PrefOverallActivity f4487a;

    C1493ab(PrefOverallActivity prefOverallActivity) {
        this.f4487a = prefOverallActivity;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.f4487a.m3684a(i);
    }
}
