package com.gmail.heagoo.sqliteutil;

import android.view.View;

/* JADX INFO: renamed from: com.gmail.heagoo.sqliteutil.o */
/* JADX INFO: loaded from: classes.dex */
final class ViewOnClickListenerC1644o implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ DialogC1640k f5022a;

    ViewOnClickListenerC1644o(DialogC1640k dialogC1640k) {
        this.f5022a = dialogC1640k;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f5022a.cancel();
    }
}
