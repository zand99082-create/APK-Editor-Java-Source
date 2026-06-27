package com.gmail.heagoo.sqliteutil;

import android.view.View;

/* JADX INFO: renamed from: com.gmail.heagoo.sqliteutil.j */
/* JADX INFO: loaded from: classes.dex */
final class ViewOnClickListenerC1639j implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ SqliteTableViewActivity f5003a;

    ViewOnClickListenerC1639j(SqliteTableViewActivity sqliteTableViewActivity) {
        this.f5003a = sqliteTableViewActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        SqliteTableViewActivity.m3994b(this.f5003a);
    }
}
