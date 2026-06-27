package com.gmail.heagoo.apkeditor;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.gmail.heagoo.apkeditor.pro.R;
import java.util.List;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.gm */
/* JADX INFO: loaded from: classes.dex */
public final class C1329gm extends BaseAdapter {

    /* JADX INFO: renamed from: a */
    private Context f3876a;

    /* JADX INFO: renamed from: b */
    private List f3877b;

    public C1329gm(Context context, List list) {
        this.f3876a = context;
        this.f3877b = list;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f3877b.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.f3877b.get(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C1330gn c1330gn;
        if (view == null) {
            view = LayoutInflater.from(this.f3876a).inflate(R.layout.popup_item_small, (ViewGroup) null);
            C1330gn c1330gn2 = new C1330gn();
            c1330gn2.f3878a = (TextView) view.findViewById(R.id.groupItem);
            view.setTag(c1330gn2);
            c1330gn = c1330gn2;
        } else {
            c1330gn = (C1330gn) view.getTag();
        }
        c1330gn.f3878a.setText(((C1331go) this.f3877b.get(i)).f3879a);
        return view;
    }
}
