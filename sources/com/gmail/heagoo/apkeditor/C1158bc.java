package com.gmail.heagoo.apkeditor;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.LruCache;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.gmail.heagoo.apkeditor.pro.R;
import com.gmail.heagoo.common.C1552a;
import com.gmail.heagoo.common.C1553b;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.bc */
/* JADX INFO: loaded from: classes.dex */
public final class C1158bc extends BaseAdapter {

    /* JADX INFO: renamed from: b */
    private Context f3401b;

    /* JADX INFO: renamed from: a */
    List f3400a = new ArrayList();

    /* JADX INFO: renamed from: d */
    private LruCache f3402d = new C1159bd(this, 64);

    public C1158bc(Context context) {
        this.f3401b = context;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f3400a.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.f3400a.get(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    @SuppressLint({"InflateParams"})
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C1160be c1160be;
        String str = (String) this.f3400a.get(i);
        if (view == null) {
            view = LayoutInflater.from(this.f3401b).inflate(R.layout.item_file_founded, (ViewGroup) null);
            c1160be = new C1160be((byte) 0);
            c1160be.f3403a = (ImageView) view.findViewById(R.id.file_icon);
            c1160be.f3404b = (TextView) view.findViewById(R.id.filename);
            c1160be.f3405c = (TextView) view.findViewById(R.id.detail1);
            view.setTag(c1160be);
        } else {
            c1160be = (C1160be) view.getTag();
        }
        C1553b c1553b = (C1553b) this.f3402d.get(str);
        if (c1553b == null) {
            try {
                new C1552a();
                c1553b = C1552a.m3750a(this.f3401b, str);
            } catch (Throwable th) {
            }
            if (c1553b == null) {
                c1553b = new C1553b();
                c1553b.f4631c = this.f3401b.getResources().getDrawable(R.drawable.apk_icon);
            }
        }
        this.f3402d.put(str, c1553b);
        c1160be.f3403a.setImageDrawable(c1553b.f4631c);
        if (c1553b.f4629a != null) {
            c1160be.f3404b.setText(c1553b.f4629a);
            c1160be.f3405c.setText(str);
            c1160be.f3405c.setVisibility(0);
        } else {
            c1160be.f3404b.setText(str);
            c1160be.f3405c.setVisibility(8);
        }
        return view;
    }
}
