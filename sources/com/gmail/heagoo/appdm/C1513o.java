package com.gmail.heagoo.appdm;

import android.view.View;
import android.widget.AdapterView;
import com.gmail.heagoo.appdm.util.C1523e;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.gmail.heagoo.appdm.o */
/* JADX INFO: loaded from: classes.dex */
final class C1513o implements AdapterView.OnItemLongClickListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ PrefOverallActivity f4549a;

    C1513o(PrefOverallActivity prefOverallActivity) {
        this.f4549a = prefOverallActivity;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public final boolean onItemLongClick(AdapterView adapterView, View view, int i, long j) {
        ArrayList arrayList = new ArrayList();
        String strM3707a = this.f4549a.f4470p.m3707a(arrayList);
        C1523e c1523e = (C1523e) arrayList.get(i);
        if (c1523e.f4584c) {
            return true;
        }
        adapterView.setOnCreateContextMenuListener(new ViewOnCreateContextMenuListenerC1514p(this, strM3707a, c1523e));
        return false;
    }
}
