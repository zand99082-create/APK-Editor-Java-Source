package com.gmail.heagoo.appdm;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;
import com.gmail.heagoo.apkeditor.pro.R;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: renamed from: com.gmail.heagoo.appdm.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1503e extends BaseAdapter {

    /* JADX INFO: renamed from: a */
    private WeakReference f4516a;

    /* JADX INFO: renamed from: b */
    private List f4517b;

    /* JADX INFO: renamed from: c */
    private boolean f4518c;

    public C1503e(Activity activity, List list, boolean z) {
        this.f4516a = new WeakReference(activity);
        this.f4517b = list;
        this.f4518c = z;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f4517b.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.f4517b.get(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C1504f c1504f;
        C1505g c1505g = (C1505g) getItem(i);
        if (c1505g == null) {
            return null;
        }
        if (view == null) {
            view = LayoutInflater.from((Context) this.f4516a.get()).inflate(R.layout.appdm_item_basicinfo, (ViewGroup) null);
            C1504f c1504f2 = new C1504f();
            c1504f2.f4519a = (TextView) view.findViewById(R.id.tv_title);
            c1504f2.f4520b = (TextView) view.findViewById(R.id.tv_value);
            c1504f2.f4521c = (Button) view.findViewById(R.id.btn_operation);
            view.setTag(c1504f2);
            c1504f = c1504f2;
        } else {
            c1504f = (C1504f) view.getTag();
        }
        c1504f.f4519a.setText(c1505g.f4522a);
        c1504f.f4520b.setText(c1505g.f4523b);
        if (c1505g.f4525d == null) {
            c1504f.f4521c.setVisibility(8);
            return view;
        }
        c1504f.f4521c.setVisibility(0);
        c1504f.f4521c.setText(c1505g.f4524c);
        c1504f.f4521c.setOnClickListener(c1505g.f4525d);
        return view;
    }
}
