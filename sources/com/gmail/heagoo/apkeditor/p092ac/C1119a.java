package com.gmail.heagoo.apkeditor.p092ac;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;
import com.gmail.heagoo.apkeditor.pro.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.ac.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1119a extends BaseAdapter implements Filterable {

    /* JADX INFO: renamed from: a */
    public List f3320a;

    /* JADX INFO: renamed from: b */
    private Context f3321b;

    /* JADX INFO: renamed from: c */
    private String f3322c;

    /* JADX INFO: renamed from: d */
    private String[] f3323d;

    /* JADX INFO: renamed from: e */
    private C1121c f3324e;

    public C1119a(Context context, String str) {
        this.f3321b = context;
        this.f3322c = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    private void m3024a() {
        this.f3324e = new C1121c(this, 0 == true ? 1 : 0);
        String string = PreferenceManager.getDefaultSharedPreferences(this.f3321b).getString(this.f3322c, "");
        if (string.equals("")) {
            this.f3323d = new String[0];
        } else {
            this.f3323d = string.split("\n");
        }
        this.f3320a = new ArrayList();
        for (String str : this.f3323d) {
            this.f3320a.add(str);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m3026a(String str) {
        if (this.f3320a == null) {
            m3024a();
        }
        SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(this.f3321b).edit();
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        for (String str2 : this.f3323d) {
            if (!str2.equals(str)) {
                arrayList.add(str2);
                sb.append("\n");
                sb.append(str2);
                if (arrayList.size() >= 32) {
                    break;
                }
            }
        }
        this.f3323d = (String[]) arrayList.toArray(new String[arrayList.size()]);
        editorEdit.putString(this.f3322c, sb.toString());
        editorEdit.commit();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        if (this.f3320a == null) {
            m3024a();
        }
        return this.f3320a.size();
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.f3324e == null) {
            m3024a();
        }
        return this.f3324e;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        if (this.f3320a == null) {
            m3024a();
        }
        return this.f3320a.get(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C1120b c1120b;
        View viewInflate;
        String str = (String) this.f3320a.get(i);
        if (view == null) {
            viewInflate = LayoutInflater.from(this.f3321b).inflate(R.layout.item_autocomplete, (ViewGroup) null);
            C1120b c1120b2 = new C1120b();
            c1120b2.f3325a = (TextView) viewInflate.findViewById(R.id.filename);
            viewInflate.setTag(c1120b2);
            c1120b = c1120b2;
        } else {
            c1120b = (C1120b) view.getTag();
            viewInflate = view;
        }
        c1120b.f3325a.setText(str);
        return viewInflate;
    }
}
