package com.gmail.heagoo.apkeditor;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.util.LruCache;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.gmail.heagoo.apkeditor.pro.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.bl */
/* JADX INFO: loaded from: classes.dex */
public final class C1167bl extends BaseAdapter {

    /* JADX INFO: renamed from: b */
    private Context f3428b;

    /* JADX INFO: renamed from: c */
    private PackageManager f3429c;

    /* JADX INFO: renamed from: e */
    private int f3430e;

    /* JADX INFO: renamed from: a */
    private List f3427a = new ArrayList();

    /* JADX INFO: renamed from: f */
    private LruCache f3431f = new C1168bm(this, 32);

    public C1167bl(Context context) {
        this.f3428b = context;
        this.f3429c = context.getPackageManager();
    }

    /* JADX INFO: renamed from: a */
    public final void m3078a(List list, String str) {
        String[] stringArray = this.f3428b.getResources().getStringArray(R.array.order_value);
        if (str.equals(stringArray[0]) || !str.equals(stringArray[1])) {
            this.f3430e = C1172bq.f3434a;
        } else {
            this.f3430e = C1172bq.f3435b;
        }
        Locale locale = Locale.getDefault();
        Comparator c1170bo = null;
        switch (C1171bp.f3433a[this.f3430e - 1]) {
            case 1:
                c1170bo = new C1169bn(this, locale);
                break;
            case 2:
                c1170bo = new C1170bo(this);
                break;
        }
        Collections.sort(list, c1170bo);
        synchronized (this.f3427a) {
            this.f3427a.clear();
            this.f3427a.addAll(list);
        }
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        int size;
        synchronized (this.f3427a) {
            size = this.f3427a.size();
        }
        return size;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        Object obj;
        synchronized (this.f3427a) {
            obj = this.f3427a.get(i);
        }
        return obj;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    @SuppressLint({"InflateParams"})
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C1173br c1173br;
        View view2;
        C1166bk c1166bk = (C1166bk) getItem(i);
        if (c1166bk == null) {
            return null;
        }
        if (view == null) {
            View viewInflate = LayoutInflater.from(this.f3428b).inflate(R.layout.item_applist, (ViewGroup) null);
            C1173br c1173br2 = new C1173br();
            c1173br2.f3437a = (ImageView) viewInflate.findViewById(R.id.app_icon);
            c1173br2.f3439c = (TextView) viewInflate.findViewById(R.id.app_name);
            c1173br2.f3438b = (TextView) viewInflate.findViewById(R.id.app_desc1);
            viewInflate.findViewById(R.id.app_desc2);
            viewInflate.setTag(c1173br2);
            c1173br = c1173br2;
            view2 = viewInflate;
        } else {
            c1173br = (C1173br) view.getTag();
            view2 = view;
        }
        try {
            c1173br.f3439c.setText(c1166bk.f3425c);
            c1173br.f3438b.setText(c1166bk.f3424b);
            Drawable drawableLoadIcon = (Drawable) this.f3431f.get(c1166bk.f3424b);
            if (drawableLoadIcon == null) {
                drawableLoadIcon = c1166bk.f3423a.loadIcon(this.f3429c);
                this.f3431f.put(c1166bk.f3424b, drawableLoadIcon);
            }
            c1173br.f3437a.setImageDrawable(drawableLoadIcon);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return view2;
    }
}
