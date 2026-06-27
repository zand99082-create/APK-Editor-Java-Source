package com.gmail.heagoo.apkeditor;

import android.view.View;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.ci */
/* JADX INFO: loaded from: classes.dex */
final class ViewOnClickListenerC1194ci implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ FileListActivity f3496a;

    ViewOnClickListenerC1194ci(FileListActivity fileListActivity) {
        this.f3496a = fileListActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        try {
            FileListActivity.m2768a(this.f3496a);
        } catch (Exception e) {
        }
    }
}
