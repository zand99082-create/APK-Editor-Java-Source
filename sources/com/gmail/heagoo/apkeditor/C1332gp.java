package com.gmail.heagoo.apkeditor;

import android.app.Activity;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import com.gmail.heagoo.apkeditor.pro.R;
import com.gmail.heagoo.common.C1557f;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.gp */
/* JADX INFO: loaded from: classes.dex */
public final class C1332gp {

    /* JADX INFO: renamed from: a */
    private WeakReference f3881a;

    /* JADX INFO: renamed from: b */
    private PopupWindow f3882b;

    /* JADX INFO: renamed from: c */
    private String f3883c;

    public C1332gp(InterfaceC1334gr interfaceC1334gr) {
        this.f3881a = new WeakReference(interfaceC1334gr);
    }

    /* JADX INFO: renamed from: a */
    static void m3370a(C1332gp c1332gp, Activity activity, String str, List list) {
        c1332gp.f3883c = str;
        View viewInflate = ((LayoutInflater) activity.getSystemService("layout_inflater")).inflate(R.layout.popup_list, (ViewGroup) null);
        ListView listView = (ListView) viewInflate.findViewById(R.id.lvGroup);
        listView.setAdapter((ListAdapter) new C1329gm(activity, list));
        c1332gp.f3882b = new PopupWindow(viewInflate, C1557f.m3763a(activity), -2);
        listView.setOnItemClickListener(new C1333gq(c1332gp, list));
    }

    /* JADX INFO: renamed from: a */
    public final String m3372a() {
        return this.f3883c;
    }

    /* JADX INFO: renamed from: a */
    public final void m3373a(Activity activity, String str, String str2, View view) {
        new AsyncTaskC1335gs(this, activity, str, str2, view).execute(new Void[0]);
    }

    /* JADX INFO: renamed from: a */
    public final void m3374a(View view) {
        if (this.f3882b != null) {
            this.f3882b.setFocusable(true);
            this.f3882b.setOutsideTouchable(true);
            this.f3882b.setBackgroundDrawable(new BitmapDrawable());
            this.f3882b.showAsDropDown(view, 0, 0);
        }
    }
}
