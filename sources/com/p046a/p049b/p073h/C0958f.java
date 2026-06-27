package com.p046a.p049b.p073h;

import android.support.v7.widget.ActivityChooserView;

/* JADX INFO: renamed from: com.a.b.h.f */
/* JADX INFO: loaded from: classes.dex */
final class C0958f {

    /* JADX INFO: renamed from: a */
    private final int f2567a;

    /* JADX INFO: renamed from: b */
    private int f2568b;

    /* JADX INFO: renamed from: c */
    private final String f2569c;

    public C0958f(int i, int i2, String str) {
        this.f2567a = i;
        this.f2568b = i2;
        this.f2569c = str;
    }

    public C0958f(int i, String str) {
        this(i, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, str);
    }

    /* JADX INFO: renamed from: a */
    public final int m2229a() {
        return this.f2567a;
    }

    /* JADX INFO: renamed from: a */
    public final void m2230a(int i) {
        if (this.f2568b == Integer.MAX_VALUE) {
            this.f2568b = i;
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m2231b() {
        return this.f2568b;
    }

    /* JADX INFO: renamed from: b */
    public final void m2232b(int i) {
        this.f2568b = i;
    }

    /* JADX INFO: renamed from: c */
    public final String m2233c() {
        return this.f2569c;
    }
}
