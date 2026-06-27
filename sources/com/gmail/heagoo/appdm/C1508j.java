package com.gmail.heagoo.appdm;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.gmail.heagoo.apkeditor.pro.R;
import com.gmail.heagoo.appdm.util.C1527j;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: renamed from: com.gmail.heagoo.appdm.j */
/* JADX INFO: loaded from: classes.dex */
public final class C1508j extends BaseAdapter {

    /* JADX INFO: renamed from: a */
    private WeakReference f4540a;

    /* JADX INFO: renamed from: b */
    private List f4541b;

    /* JADX INFO: renamed from: c */
    private boolean f4542c;

    public C1508j(Activity activity, List list, boolean z) {
        this.f4540a = new WeakReference(activity);
        this.f4541b = list;
        this.f4542c = z;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f4541b.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.f4541b.get(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C1509k c1509k;
        C1527j c1527j = (C1527j) getItem(i);
        if (c1527j == null) {
            return null;
        }
        if (view == null) {
            view = LayoutInflater.from((Context) this.f4540a.get()).inflate(R.layout.appdm_item_nameandpath, (ViewGroup) null);
            C1509k c1509k2 = new C1509k();
            c1509k2.f4543a = (TextView) view.findViewById(R.id.tv_first);
            c1509k2.f4544b = (TextView) view.findViewById(R.id.tv_second);
            view.setTag(c1509k2);
            c1509k = c1509k2;
        } else {
            c1509k = (C1509k) view.getTag();
        }
        c1509k.f4543a.setText(c1527j.f4587a);
        c1509k.f4544b.setText(c1527j.f4588b);
        return view;
    }
}
