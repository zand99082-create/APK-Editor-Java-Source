package com.gmail.heagoo.apkeditor;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.gmail.heagoo.apkeditor.pro.R;
import com.gmail.heagoo.common.C1566o;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.er */
/* JADX INFO: loaded from: classes.dex */
final class C1277er extends BaseAdapter {

    /* JADX INFO: renamed from: a */
    private Context f3707a;

    /* JADX INFO: renamed from: b */
    private List f3708b = new ArrayList();

    /* JADX INFO: renamed from: c */
    private List f3709c = new ArrayList();

    C1277er(Context context, String str) {
        this.f3707a = context;
        if (AbstractActivityC1341gy.m3388c(str) || AbstractActivityC1341gy.m3393e(str)) {
            this.f3709c.add(new C1566o(Integer.valueOf(R.drawable.ic_www), Integer.valueOf(R.string.html)));
            this.f3708b.add(0);
        }
        this.f3709c.add(new C1566o(Integer.valueOf(R.drawable.ic_colorize), Integer.valueOf(R.string.colorpad)));
        this.f3708b.add(1);
        if (AbstractActivityC1341gy.m3388c(str) || AbstractActivityC1341gy.m3393e(str)) {
            this.f3709c.add(new C1566o(Integer.valueOf(R.drawable.ic_btn_4), Integer.valueOf(R.string.templates)));
            this.f3708b.add(6);
        }
        this.f3709c.add(new C1566o(Integer.valueOf(R.drawable.ic_delete_lines), Integer.valueOf(R.string.delete_lines)));
        this.f3708b.add(2);
        if (AbstractActivityC1341gy.m3388c(str)) {
            this.f3709c.add(new C1566o(Integer.valueOf(R.drawable.ic_eye), Integer.valueOf(R.string.comment_lines)));
            this.f3708b.add(5);
            this.f3709c.add(new C1566o(Integer.valueOf(R.drawable.ic_java), Integer.valueOf(R.string.java_code)));
            this.f3708b.add(7);
        }
        this.f3709c.add(new C1566o(Integer.valueOf(R.drawable.ic_btn_9), Integer.valueOf(R.string.settings)));
        this.f3708b.add(3);
        this.f3709c.add(new C1566o(Integer.valueOf(R.drawable.ic_help), Integer.valueOf(R.string.help)));
        this.f3708b.add(4);
    }

    /* JADX INFO: renamed from: a */
    public final int m3243a() {
        return this.f3709c.size();
    }

    /* JADX INFO: renamed from: a */
    public final int m3244a(int i) {
        if (i < this.f3708b.size()) {
            return ((Integer) this.f3708b.get(i)).intValue();
        }
        return -1;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f3709c.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.f3709c.get(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C1278es c1278es;
        if (view == null) {
            view = LayoutInflater.from(this.f3707a).inflate(R.layout.item_more_option, (ViewGroup) null);
            C1278es c1278es2 = new C1278es((byte) 0);
            c1278es2.f3710a = (ImageView) view.findViewById(R.id.menu_icon);
            c1278es2.f3711b = (TextView) view.findViewById(R.id.menu_title);
            view.setTag(c1278es2);
            c1278es = c1278es2;
        } else {
            c1278es = (C1278es) view.getTag();
        }
        C1566o c1566o = (C1566o) this.f3709c.get(i);
        if (((Integer) c1566o.f4649a).intValue() > 0) {
            c1278es.f3710a.setImageResource(((Integer) c1566o.f4649a).intValue());
        } else {
            c1278es.f3710a.setImageBitmap(null);
        }
        c1278es.f3711b.setText(((Integer) c1566o.f4650b).intValue());
        return view;
    }
}
