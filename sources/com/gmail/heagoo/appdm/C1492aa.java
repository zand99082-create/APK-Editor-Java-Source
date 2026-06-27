package com.gmail.heagoo.appdm;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import com.gmail.heagoo.appdm.util.C1527j;
import com.gmail.heagoo.p084a.p089c.C1068ax;
import com.gmail.heagoo.sqliteutil.SqliteTableListActivity;

/* JADX INFO: renamed from: com.gmail.heagoo.appdm.aa */
/* JADX INFO: loaded from: classes.dex */
final class C1492aa implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ PrefOverallActivity f4486a;

    C1492aa(PrefOverallActivity prefOverallActivity) {
        this.f4486a = prefOverallActivity;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        Intent intent = new Intent(this.f4486a, (Class<?>) SqliteTableListActivity.class);
        C1068ax.a_001(intent, "dbFilePath", ((C1527j) this.f4486a.f4472r.get(i)).f4588b);
        C1068ax.a_001(intent, "isRootMode", this.f4486a.f4446G ? "true" : "false");
        C1068ax.a_002(intent, "themeId", this.f4486a.f4453O);
        this.f4486a.startActivity(intent);
    }
}
