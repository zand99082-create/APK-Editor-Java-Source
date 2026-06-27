package com.gmail.heagoo.apkeditor;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.gmail.heagoo.apkeditor.pro.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.ef */
/* JADX INFO: loaded from: classes.dex */
public final class C1267ef extends BaseAdapter implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: a */
    private WeakReference f3665a;

    /* JADX INFO: renamed from: b */
    private WeakReference f3666b;

    /* JADX INFO: renamed from: c */
    private String f3667c;

    /* JADX INFO: renamed from: d */
    private ArrayList f3668d;

    /* JADX INFO: renamed from: e */
    private Set f3669e = new HashSet();

    /* JADX INFO: renamed from: f */
    private int f3670f = R.layout.item_file_selectable;

    public C1267ef(ApkInfoActivity apkInfoActivity, InterfaceC1304fn interfaceC1304fn, String str, ArrayList arrayList) {
        this.f3665a = new WeakReference(apkInfoActivity);
        this.f3666b = new WeakReference(interfaceC1304fn);
        this.f3667c = str;
        this.f3668d = arrayList;
    }

    /* JADX INFO: renamed from: a */
    private static int m3222a(List list, int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < list.size() && ((Integer) list.get(i3)).intValue() < i; i3++) {
            i2++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: a */
    public final List m3223a() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f3669e);
        Collections.sort(arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public final void m3224a(ArrayList arrayList, List list) {
        Collections.sort(list);
        HashSet hashSet = new HashSet();
        Iterator it = this.f3669e.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            if (!list.contains(Integer.valueOf(iIntValue))) {
                hashSet.add(Integer.valueOf(iIntValue - m3222a(list, iIntValue)));
            }
        }
        this.f3669e = hashSet;
        this.f3668d = arrayList;
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: b */
    public final void m3225b() {
        for (int i = 0; i < this.f3668d.size(); i++) {
            this.f3669e.add(Integer.valueOf(i));
        }
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: c */
    public final void m3226c() {
        this.f3669e.clear();
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m3227d() {
        return this.f3669e.size() == this.f3668d.size();
    }

    /* JADX INFO: renamed from: e */
    public final boolean m3228e() {
        return this.f3669e.isEmpty();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f3668d.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.f3668d.get(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0109  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C1268eg c1268eg;
        String str;
        int i2;
        Bitmap bitmap = null;
        String str2 = (String) this.f3668d.get(i);
        String strSubstring = str2.substring(this.f3667c.length() + 1);
        if (view == null) {
            view = LayoutInflater.from((Context) this.f3665a.get()).inflate(this.f3670f, (ViewGroup) null);
            c1268eg = new C1268eg((byte) 0);
            c1268eg.f3671a = (ImageView) view.findViewById(R.id.file_icon);
            c1268eg.f3672b = (TextView) view.findViewById(R.id.filename);
            c1268eg.f3673c = (TextView) view.findViewById(R.id.detail1);
            c1268eg.f3674d = (CheckBox) view.findViewById(R.id.checkBox);
            c1268eg.f3672b.setSingleLine(false);
            c1268eg.f3672b.setMaxLines(2);
            view.setTag(c1268eg);
        } else {
            c1268eg = (C1268eg) view.getTag();
        }
        c1268eg.f3672b.setText(strSubstring);
        String strSubstring2 = str2.substring(str2.lastIndexOf(47) + 1);
        int iLastIndexOf = strSubstring2.lastIndexOf(46);
        if (iLastIndexOf != -1) {
            String strSubstring3 = strSubstring2.substring(iLastIndexOf + 1);
            if ("xml".equals(strSubstring3)) {
                i2 = R.drawable.ic_file_xml;
                str = null;
            } else if ("png".equals(strSubstring3) || "jpg".equals(strSubstring3)) {
                C1211dd c1211ddM3298a = ((ApkInfoActivity) this.f3665a.get()).f2949e.m3298a(str2);
                bitmap = c1211ddM3298a.f3528a;
                str = c1211ddM3298a.f3529b;
                i2 = R.drawable.ic_file_unknown;
            } else {
                str = null;
                i2 = R.drawable.ic_file_unknown;
            }
        }
        if (bitmap != null) {
            c1268eg.f3671a.setImageBitmap(bitmap);
        } else {
            c1268eg.f3671a.setImageResource(i2);
        }
        if (str != null) {
            c1268eg.f3673c.setVisibility(0);
            c1268eg.f3673c.setText(str);
        } else {
            c1268eg.f3673c.setVisibility(8);
        }
        c1268eg.f3674d.setId(i);
        if (this.f3669e.contains(Integer.valueOf(i))) {
            c1268eg.f3674d.setChecked(true);
        } else {
            c1268eg.f3674d.setChecked(false);
        }
        c1268eg.f3674d.setOnCheckedChangeListener(this);
        return view;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int id = compoundButton.getId();
        if (z) {
            this.f3669e.add(Integer.valueOf(id));
        } else {
            this.f3669e.remove(Integer.valueOf(id));
        }
        if (this.f3666b != null) {
            ((InterfaceC1304fn) this.f3666b.get()).mo2707b(this.f3669e);
        }
    }
}
