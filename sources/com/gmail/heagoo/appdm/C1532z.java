package com.gmail.heagoo.appdm;

import android.content.Intent;
import android.support.v4.view.PointerIconCompat;
import android.view.View;
import android.widget.AdapterView;
import com.gmail.heagoo.appdm.util.C1527j;
import com.gmail.heagoo.p084a.p089c.C1068ax;

/* JADX INFO: renamed from: com.gmail.heagoo.appdm.z */
/* JADX INFO: loaded from: classes.dex */
final class C1532z implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ PrefOverallActivity f4593a;

    C1532z(PrefOverallActivity prefOverallActivity) {
        this.f4593a = prefOverallActivity;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.f4593a.f4449K = System.currentTimeMillis();
        this.f4593a.f4452N++;
        Intent intent = new Intent(this.f4593a, (Class<?>) PrefDetailActivity.class);
        C1068ax.a_001(intent, "appName", (String) this.f4593a.f4467m.loadLabel(this.f4593a.f4466l));
        C1068ax.a_001(intent, "xmlFilePath", ((C1527j) this.f4593a.f4471q.get(i)).f4588b);
        C1068ax.a_001(intent, "packagePath", this.f4593a.f4457c);
        C1068ax.b_012(intent, "isRootMode", this.f4593a.f4446G);
        C1068ax.a_002(intent, "themeId", this.f4593a.f4453O);
        this.f4593a.startActivityForResult(intent, PointerIconCompat.TYPE_CONTEXT_MENU);
    }
}
