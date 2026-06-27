package com.gmail.heagoo.apkeditor;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.gmail.heagoo.apkeditor.pro.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.fl */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC1302fl implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    private WeakReference f3797a;

    /* JADX INFO: renamed from: b */
    private String f3798b;

    /* JADX INFO: renamed from: c */
    private LinearLayout f3799c;

    /* JADX INFO: renamed from: d */
    private HorizontalScrollView f3800d;

    /* JADX INFO: renamed from: e */
    private List f3801e = new ArrayList();

    public ViewOnClickListenerC1302fl(ApkInfoActivity apkInfoActivity, String str, LinearLayout linearLayout, HorizontalScrollView horizontalScrollView) {
        this.f3797a = new WeakReference(apkInfoActivity);
        this.f3798b = str;
        this.f3799c = linearLayout;
        this.f3800d = horizontalScrollView;
    }

    /* JADX INFO: renamed from: a */
    public final void m3334a(String str) {
        if (str.endsWith("/")) {
            str = str.substring(0, str.length() - 1);
        }
        if (str.equals(this.f3798b)) {
            return;
        }
        if (str.startsWith(this.f3798b + "/")) {
            for (String str2 : str.substring(this.f3798b.length() + 1).split("/")) {
                String str3 = this.f3798b + "/" + str2;
                View viewInflate = LayoutInflater.from((Context) this.f3797a.get()).inflate(R.layout.item_navigation_dir, (ViewGroup) null);
                View viewFindViewById = viewInflate.findViewById(R.id.menu_dirtab);
                viewFindViewById.setTag(str3);
                viewFindViewById.setOnClickListener(this);
                ((TextView) viewInflate.findViewById(R.id.dirname)).setText(str3.substring(str3.lastIndexOf(47) + 1));
                this.f3799c.addView(viewInflate);
                this.f3801e.add(viewInflate);
                this.f3798b = str3;
            }
        } else if (this.f3798b.startsWith(str + "/")) {
            for (int length = this.f3798b.substring(str.length() + 1).split("/").length - 1; length >= 0; length--) {
                int size = this.f3801e.size() - 1;
                View view = (View) this.f3801e.get(size);
                this.f3801e.remove(size);
                this.f3799c.removeView(view);
            }
            this.f3798b = str;
        }
        this.f3800d.postDelayed(new RunnableC1303fm(this), 100L);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str = (String) view.getTag();
        if (str == null) {
            return;
        }
        String str2 = this.f3798b;
        m3334a(str);
        if (this.f3797a.get() != null) {
            ((ApkInfoActivity) this.f3797a.get()).m2693a(str, str2.startsWith(new StringBuilder().append(str).append("/").toString()) ? str2.substring(str.length() + 1).split("/").length : 0);
        }
    }
}
