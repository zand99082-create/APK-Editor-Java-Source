package com.gmail.heagoo.apkeditor.util;

import android.R;
import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import com.gmail.heagoo.common.C1557f;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.util.a */
/* JADX INFO: loaded from: classes.dex */
public class C1459a {

    /* JADX INFO: renamed from: a */
    private WeakReference f4333a;

    /* JADX INFO: renamed from: b */
    private int f4334b;

    /* JADX INFO: renamed from: c */
    private int f4335c;

    /* JADX INFO: renamed from: d */
    private View f4336d;

    /* JADX INFO: renamed from: e */
    private int f4337e;

    private C1459a(Activity activity) {
        this.f4333a = new WeakReference(activity);
        this.f4334b = C1557f.m3765b(activity);
        this.f4335c = C1557f.m3763a(activity);
        this.f4336d = ((FrameLayout) activity.findViewById(R.id.content)).getChildAt(0);
        this.f4336d.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC1461b(this));
        this.f4336d.getLayoutParams();
    }

    /* JADX INFO: renamed from: a */
    public static void m3572a(Activity activity) {
        new C1459a(activity);
    }

    /* JADX INFO: renamed from: a */
    static /* synthetic */ void m3573a(C1459a c1459a) {
        Rect rect = new Rect();
        c1459a.f4336d.getWindowVisibleDisplayFrame(rect);
        int i = rect.bottom - rect.top;
        if (i != c1459a.f4337e) {
            if (i >= ((((Activity) c1459a.f4333a.get()).getResources().getConfiguration().orientation == 1 ? c1459a.f4334b : c1459a.f4335c) * 85) / 100) {
                Window window = ((Activity) c1459a.f4333a.get()).getWindow();
                window.addFlags(1024);
                window.clearFlags(2048);
            } else {
                Window window2 = ((Activity) c1459a.f4333a.get()).getWindow();
                window2.addFlags(2048);
                window2.clearFlags(1024);
            }
            c1459a.f4337e = i;
        }
    }
}
