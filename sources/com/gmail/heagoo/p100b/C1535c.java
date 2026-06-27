package com.gmail.heagoo.p100b;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Environment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.gmail.heagoo.apkeditor.pro.R;
import com.gmail.heagoo.p084a.p089c.C1067a;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.gmail.heagoo.b.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1535c extends BaseAdapter {

    /* JADX INFO: renamed from: a */
    List f4597a = new ArrayList();

    /* JADX INFO: renamed from: b */
    private Context f4598b;

    /* JADX INFO: renamed from: c */
    private String f4599c;

    /* JADX INFO: renamed from: d */
    private String f4600d;

    /* JADX INFO: renamed from: e */
    private InterfaceC1547o f4601e;

    public C1535c(Context context, String str, String str2, InterfaceC1547o interfaceC1547o) {
        this.f4598b = context;
        this.f4599c = str;
        this.f4600d = str2;
        this.f4601e = interfaceC1547o;
        m3731c(str2);
    }

    /* JADX INFO: renamed from: c */
    private void m3731c(String str) {
        synchronized (this.f4597a) {
            File file = new File(str);
            if (!file.exists()) {
                str = this.f4599c;
                file = new File(str);
            }
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null) {
                this.f4597a.clear();
                for (File file2 : fileArrListFiles) {
                    C1533a c1533a = new C1533a();
                    c1533a.f4594a = file2.getName();
                    c1533a.f4595b = file2.isDirectory();
                    if (!c1533a.f4595b) {
                        file2.length();
                    }
                    this.f4597a.add(c1533a);
                }
                Collections.sort(this.f4597a, new C1534b());
                if (!str.equals(this.f4599c)) {
                    C1533a c1533a2 = new C1533a();
                    c1533a2.f4594a = "..";
                    c1533a2.f4595b = true;
                    this.f4597a.add(0, c1533a2);
                }
                this.f4600d = str;
            } else if (C1067a.m2522c(str, Environment.getExternalStorageDirectory().getPath())) {
                this.f4597a.clear();
                Environment.getExternalStorageDirectory().getPath();
                C1533a c1533a3 = new C1533a();
                c1533a3.f4594a = C1067a.m2526d(str, Environment.getExternalStorageDirectory().getPath());
                c1533a3.f4595b = true;
                this.f4597a.add(c1533a3);
                if (!str.equals(this.f4599c)) {
                    C1533a c1533a4 = new C1533a();
                    c1533a4.f4594a = "..";
                    c1533a4.f4595b = true;
                    this.f4597a.add(0, c1533a4);
                }
                this.f4600d = str;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m3732a(List list) {
        String str;
        synchronized (this.f4597a) {
            if (list != null) {
                list.addAll(this.f4597a);
                str = this.f4600d;
            } else {
                str = this.f4600d;
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: a */
    public final void m3733a(String str) {
        if (!this.f4599c.startsWith(str) || str.equals(this.f4599c)) {
            m3731c(str);
            notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m3734b(String str) {
        synchronized (this.f4597a) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= this.f4597a.size()) {
                    break;
                }
                if (((C1533a) this.f4597a.get(i2)).f4594a.equals(str)) {
                    this.f4597a.remove(i2);
                    break;
                }
                i = i2 + 1;
            }
        }
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f4597a.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.f4597a.get(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    @SuppressLint({"InflateParams"})
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C1536d c1536d;
        C1533a c1533a = (C1533a) this.f4597a.get(i);
        if (view == null) {
            view = LayoutInflater.from(this.f4598b).inflate(R.layout.item_file, (ViewGroup) null);
            C1536d c1536d2 = new C1536d((byte) 0);
            c1536d2.f4602a = (ImageView) view.findViewById(R.id.file_icon);
            c1536d2.f4603b = (TextView) view.findViewById(R.id.filename);
            c1536d2.f4604c = (TextView) view.findViewById(R.id.detail1);
            view.setTag(c1536d2);
            c1536d = c1536d2;
        } else {
            c1536d = (C1536d) view.getTag();
        }
        c1536d.f4603b.setText(c1533a.f4594a);
        if (c1533a.f4594a.equals("..")) {
            c1536d.f4602a.setImageResource(R.drawable.ic_file_up);
        } else if (c1533a.f4595b) {
            c1536d.f4602a.setImageResource(R.drawable.ic_file_folder);
        } else {
            Drawable drawableMo2777a = this.f4601e.mo2777a(this.f4600d, c1533a);
            if (drawableMo2777a == null) {
                c1536d.f4602a.setImageResource(R.drawable.ic_file_unknown);
            } else {
                c1536d.f4602a.setImageDrawable(drawableMo2777a);
            }
        }
        String strMo2779b = this.f4601e.mo2779b(this.f4600d, c1533a);
        if (strMo2779b != null) {
            c1536d.f4604c.setText(strMo2779b);
            c1536d.f4604c.setVisibility(0);
        } else {
            c1536d.f4604c.setVisibility(8);
        }
        return view;
    }
}
