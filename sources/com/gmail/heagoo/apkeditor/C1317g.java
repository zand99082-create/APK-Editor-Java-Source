package com.gmail.heagoo.apkeditor;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.gmail.heagoo.apkeditor.pro.R;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1317g extends BaseAdapter {

    /* JADX INFO: renamed from: a */
    private WeakReference f3850a;

    /* JADX INFO: renamed from: c */
    private List f3851c = new ArrayList();

    public C1317g(ApkComposeActivity apkComposeActivity, String str) {
        this.f3850a = new WeakReference(apkComposeActivity);
        m3360a(str);
    }

    /* JADX INFO: renamed from: a */
    public final void m3360a(String str) {
        this.f3851c.clear();
        if (str != null) {
            for (String str2 : str.split("\\r?\\n")) {
                if (!"".equals(str2)) {
                    this.f3851c.add(str2);
                }
            }
        }
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f3851c.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.f3851c.get(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x009e  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C1370i c1370i;
        boolean z;
        int iIntValue;
        if (view == null) {
            view = LayoutInflater.from((Context) this.f3850a.get()).inflate(R.layout.item_failed_message, (ViewGroup) null);
            c1370i = new C1370i((byte) 0);
            c1370i.f4000a = (TextView) view.findViewById(R.id.message);
            c1370i.f4001b = (RelativeLayout) view.findViewById(R.id.btn_view);
            view.setTag(c1370i);
        } else {
            c1370i = (C1370i) view.getTag();
        }
        String str = (String) this.f3851c.get(i);
        int iIndexOf = str.indexOf(58);
        if (iIndexOf != -1) {
            String strSubstring = str.substring(0, iIndexOf);
            if (new File(strSubstring).exists()) {
                c1370i.f4001b.setVisibility(0);
                int iIndexOf2 = str.indexOf(58, iIndexOf + 1);
                if (iIndexOf2 != -1) {
                    try {
                        iIntValue = Integer.valueOf(str.substring(iIndexOf + 1, iIndexOf2)).intValue();
                    } catch (Exception e) {
                        iIntValue = -1;
                    }
                    c1370i.f4001b.setOnClickListener(new ViewOnClickListenerC1343h(this, strSubstring, iIntValue));
                    z = true;
                } else {
                    iIntValue = -1;
                    c1370i.f4001b.setOnClickListener(new ViewOnClickListenerC1343h(this, strSubstring, iIntValue));
                    z = true;
                }
            } else {
                z = false;
            }
        }
        if (!z) {
            c1370i.f4001b.setVisibility(4);
        }
        c1370i.f4000a.setText((CharSequence) this.f3851c.get(i));
        return view;
    }
}
