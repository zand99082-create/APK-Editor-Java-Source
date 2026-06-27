package com.gmail.heagoo.sqliteutil;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import com.gmail.heagoo.p084a.p089c.C1068ax;

/* JADX INFO: renamed from: com.gmail.heagoo.sqliteutil.h */
/* JADX INFO: loaded from: classes.dex */
final class C1637h implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ SqliteTableListActivity f5001a;

    C1637h(SqliteTableListActivity sqliteTableListActivity) {
        this.f5001a = sqliteTableListActivity;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        String str = (String) this.f5001a.f4941c.get(i);
        Intent intent = new Intent(this.f5001a, (Class<?>) SqliteTableViewActivity.class);
        C1068ax.a_001(intent, "originDbFilePath", this.f5001a.f4939a);
        C1068ax.a_001(intent, "dbFilePath", this.f5001a.f4940b);
        C1068ax.a_001(intent, "tableName", str);
        C1068ax.a_002(intent, "themeId", this.f5001a.f4943e);
        this.f5001a.startActivity(intent);
    }
}
