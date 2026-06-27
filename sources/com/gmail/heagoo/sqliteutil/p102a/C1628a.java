package com.gmail.heagoo.sqliteutil.p102a;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SimpleAdapter;
import com.gmail.heagoo.apkeditor.pro.R;
import java.util.List;

/* JADX INFO: renamed from: com.gmail.heagoo.sqliteutil.a.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1628a extends SimpleAdapter {

    /* JADX INFO: renamed from: a */
    private int f4971a;

    /* JADX INFO: renamed from: b */
    private int f4972b;

    public C1628a(Context context, List list, int i, String[] strArr, int[] iArr, boolean z) {
        super(context, list, R.layout.item_sql_raw, strArr, iArr);
        if (z) {
            this.f4971a = -3355444;
            this.f4972b = -5592406;
        } else {
            this.f4971a = -13421773;
            this.f4972b = -11184811;
        }
    }

    @Override // android.widget.SimpleAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        return view2;
    }
}
