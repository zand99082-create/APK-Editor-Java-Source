package com.gmail.heagoo.apkeditor.prj;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.gmail.heagoo.apkeditor.ApkInfoExActivity;
import com.gmail.heagoo.apkeditor.pro.R;
import com.gmail.heagoo.p084a.p089c.C1067a;
import java.io.File;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.prj.d */
/* JADX INFO: loaded from: classes.dex */
final class C1419d extends BaseAdapter implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: b */
    private WeakReference f4127b;

    /* JADX INFO: renamed from: c */
    private final List f4128c = new ArrayList();

    /* JADX INFO: renamed from: d */
    private SimpleDateFormat f4129d;

    C1419d(ProjectListActivity projectListActivity, List list) {
        this.f4127b = new WeakReference(projectListActivity);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.f4128c.add((C1421f) it.next());
        }
    }

    /* JADX INFO: renamed from: a */
    private String m3487a(C1421f c1421f) {
        return !new File(c1421f.f4136b).exists() ? String.format(((ProjectListActivity) this.f4127b.get()).getString(R.string.prj_error_apk_notfound), c1421f.f4136b) : new File(c1421f.f4137c).exists() ? null : String.format(((ProjectListActivity) this.f4127b.get()).getString(R.string.prj_error_decode_dir_notfound), c1421f.f4137c);
    }

    /* JADX INFO: renamed from: a */
    final int m3488a() {
        return this.f4128c.size();
    }

    /* JADX INFO: renamed from: a */
    final void m3489a(List list) {
        Iterator it = this.f4128c.iterator();
        while (it.hasNext()) {
            if (!list.contains(it.next())) {
                it.remove();
            }
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C1421f c1421f = (C1421f) it2.next();
            if (!this.f4128c.contains(c1421f)) {
                this.f4128c.add(c1421f);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    final void m3490a(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            for (C1421f c1421f : this.f4128c) {
                if (str.equals(c1421f.f4136b)) {
                    c1421f.f4139e = (Drawable) entry.getValue();
                }
            }
        }
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f4128c.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.f4128c.get(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C1420e c1420e;
        C1421f c1421f = (C1421f) this.f4128c.get(i);
        if (view == null) {
            view = LayoutInflater.from((Context) this.f4127b.get()).inflate(R.layout.item_project, (ViewGroup) null);
            c1420e = new C1420e((byte) 0);
            c1420e.f4130a = (ImageView) view.findViewById(R.id.app_icon);
            c1420e.f4131b = (TextView) view.findViewById(R.id.app_name);
            c1420e.f4132c = (TextView) view.findViewById(R.id.app_desc1);
            c1420e.f4133d = (TextView) view.findViewById(R.id.app_desc2);
            c1420e.f4134e = view.findViewById(R.id.menu_delete);
            view.setTag(c1420e);
        } else {
            c1420e = (C1420e) view.getTag();
        }
        if (c1421f.f4139e != null) {
            c1420e.f4130a.setImageDrawable(c1421f.f4139e);
        }
        c1420e.f4131b.setText(c1421f.f4135a);
        String strM3487a = m3487a(c1421f);
        String str = strM3487a != null ? strM3487a : c1421f.f4136b;
        if ("".equals(str)) {
            c1420e.f4132c.setVisibility(8);
        } else {
            c1420e.f4132c.setVisibility(0);
            c1420e.f4132c.setText(str);
        }
        if (strM3487a != null) {
            if (c1420e.f4132c.getTag() == null) {
                c1420e.f4132c.setTag(Integer.valueOf(c1420e.f4132c.getCurrentTextColor()));
            }
            c1420e.f4132c.setTextColor(-48060);
        } else {
            Integer num = (Integer) c1420e.f4132c.getTag();
            if (num != null) {
                c1420e.f4132c.setTextColor(num.intValue());
            }
        }
        TextView textView = c1420e.f4133d;
        long j = c1421f.f4138d;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        if (this.f4129d == null) {
            this.f4129d = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        }
        textView.setText(this.f4129d.format(calendar.getTime()));
        c1420e.f4133d.setVisibility(0);
        c1420e.f4134e.setVisibility(0);
        c1420e.f4134e.setTag(Integer.valueOf(i));
        c1420e.f4134e.setOnClickListener((View.OnClickListener) this.f4127b.get());
        return view;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        String strM3487a = m3487a((C1421f) this.f4128c.get(i));
        if (strM3487a != null) {
            Toast.makeText((Context) this.f4127b.get(), strM3487a, 1).show();
            return;
        }
        Intent intent = new Intent((Context) this.f4127b.get(), (Class<?>) ApkInfoExActivity.class);
        C1067a.m2442a(intent, "projectName", ((C1421f) this.f4128c.get(i)).f4135a);
        ((ProjectListActivity) this.f4127b.get()).startActivity(intent);
    }
}
