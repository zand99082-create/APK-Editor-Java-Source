package com.p078b.p079a;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.gmail.heagoo.apkeditor.pro.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.b.a.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1015h extends BaseAdapter {

    /* JADX INFO: renamed from: a */
    private WeakReference f2635a;

    /* JADX INFO: renamed from: b */
    private List f2636b = new ArrayList();

    public C1015h(Activity activity, List list) {
        this.f2635a = new WeakReference(activity);
        this.f2636b.addAll(list);
    }

    /* JADX INFO: renamed from: a */
    public final void m2309a(ArrayList arrayList) {
        this.f2636b.clear();
        this.f2636b.addAll(arrayList);
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f2636b.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.f2636b.get(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    @SuppressLint({"InflateParams"})
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C1016i c1016i;
        C1014g c1014g = (C1014g) this.f2636b.get(i);
        if (view == null) {
            view = LayoutInflater.from((Context) this.f2635a.get()).inflate(R.layout.item_color_value, (ViewGroup) null);
            C1016i c1016i2 = new C1016i((byte) 0);
            c1016i2.f2637a = view.findViewById(R.id.color_view);
            c1016i2.f2638b = (TextView) view.findViewById(R.id.tv_name);
            c1016i2.f2639c = (TextView) view.findViewById(R.id.tv_value);
            view.setTag(c1016i2);
            c1016i = c1016i2;
        } else {
            c1016i = (C1016i) view.getTag();
        }
        try {
            c1016i.f2638b.setText(c1014g.f2631a);
            c1016i.f2639c.setText(c1014g.f2632b);
            if (c1014g.f2634d) {
                c1016i.f2637a.setBackgroundColor(c1014g.f2633c);
            } else {
                c1016i.f2637a.setBackgroundColor(-1);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return view;
    }
}
