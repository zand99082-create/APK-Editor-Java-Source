package com.gmail.heagoo.apkeditor;

import android.view.View;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.ng */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC1413ng implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final FileListActivity f4100a;

    public ViewOnClickListenerC1413ng(FileListActivity fileListActivity) {
        this.f4100a = fileListActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f4100a.finish();
    }
}
