package com.gmail.heagoo.sqliteutil;

import android.view.View;

/* JADX INFO: renamed from: com.gmail.heagoo.sqliteutil.i */
/* JADX INFO: loaded from: classes.dex */
final class ViewOnClickListenerC1638i implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ SqliteTableViewActivity f5002a;

    ViewOnClickListenerC1638i(SqliteTableViewActivity sqliteTableViewActivity) {
        this.f5002a = sqliteTableViewActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        SqliteTableViewActivity.m3991a(this.f5002a);
    }
}
