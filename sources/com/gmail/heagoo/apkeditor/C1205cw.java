package com.gmail.heagoo.apkeditor;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.gmail.heagoo.apkeditor.pro.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.cw */
/* JADX INFO: loaded from: classes.dex */
final class C1205cw extends BaseAdapter {

    /* JADX INFO: renamed from: a */
    private WeakReference f3520a;

    /* JADX INFO: renamed from: b */
    private List f3521b;

    /* JADX INFO: renamed from: c */
    private List f3522c = new ArrayList();

    C1205cw(Context context, List list) {
        this.f3520a = new WeakReference(context);
        this.f3521b = list;
    }

    /* JADX INFO: renamed from: a */
    public final void m3121a(List list) {
        this.f3522c = list;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f3521b.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.f3521b.get(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C1206cx c1206cx;
        if (view == null) {
            view = LayoutInflater.from((Context) this.f3520a.get()).inflate(R.layout.popup_item_big, (ViewGroup) null);
            c1206cx = new C1206cx();
            view.setTag(c1206cx);
            c1206cx.f3524b = (TextView) view.findViewById(R.id.groupItem);
            c1206cx.f3523a = (ImageView) view.findViewById(R.id.checkImage);
        } else {
            c1206cx = (C1206cx) view.getTag();
        }
        c1206cx.f3524b.setText((CharSequence) this.f3521b.get(i));
        c1206cx.f3523a.setVisibility(this.f3522c.contains(Integer.valueOf(i)) ? 0 : 4);
        return view;
    }
}
