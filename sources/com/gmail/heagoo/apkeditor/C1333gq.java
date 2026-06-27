package com.gmail.heagoo.apkeditor;

import android.view.View;
import android.widget.AdapterView;
import java.util.List;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.gq */
/* JADX INFO: loaded from: classes.dex */
final class C1333gq implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ List f3884a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ C1332gp f3885b;

    C1333gq(C1332gp c1332gp, List list) {
        this.f3885b = c1332gp;
        this.f3884a = list;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        if (i < this.f3884a.size()) {
            C1331go c1331go = (C1331go) this.f3884a.get(i);
            if (this.f3885b.f3881a.get() != null) {
                ((InterfaceC1334gr) this.f3885b.f3881a.get()).mo2851b(c1331go.f3880b + 1);
            }
        }
        if (this.f3885b.f3882b != null) {
            this.f3885b.f3882b.dismiss();
        }
    }
}
