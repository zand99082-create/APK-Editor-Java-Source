package com.p046a.p049b.p058c.p060b;

import android.support.v7.appcompat.C0327R;
import com.gmail.heagoo.p084a.p089c.C1067a;
import com.p046a.p049b.p063d.C0798e;

/* JADX INFO: renamed from: com.a.b.c.b.n */
/* JADX INFO: loaded from: classes.dex */
public final class C0671n {

    /* JADX INFO: renamed from: a */
    private final int f1124a;

    /* JADX INFO: renamed from: b */
    private final int f1125b;

    /* JADX INFO: renamed from: c */
    private final int f1126c;

    /* JADX INFO: renamed from: d */
    private final AbstractC0675r f1127d;

    /* JADX INFO: renamed from: e */
    private final boolean f1128e;

    public C0671n(int i, int i2, int i3, AbstractC0675r abstractC0675r, boolean z) {
        if (!C1067a.m2532e(i)) {
            throw new IllegalArgumentException("bogus opcode");
        }
        if (!C1067a.m2532e(i2)) {
            throw new IllegalArgumentException("bogus family");
        }
        if (!C1067a.m2532e(i3)) {
            throw new IllegalArgumentException("bogus nextOpcode");
        }
        if (abstractC0675r == null) {
            throw new NullPointerException("format == null");
        }
        this.f1124a = i;
        this.f1125b = i2;
        this.f1126c = i3;
        this.f1127d = abstractC0675r;
        this.f1128e = z;
    }

    /* JADX INFO: renamed from: a */
    public final int m1236a() {
        return this.f1124a;
    }

    /* JADX INFO: renamed from: b */
    public final int m1237b() {
        return this.f1125b;
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC0675r m1238c() {
        return this.f1127d;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m1239d() {
        return this.f1128e;
    }

    /* JADX INFO: renamed from: e */
    public final String m1240e() {
        return C0798e.m1599a(this.f1124a);
    }

    /* JADX INFO: renamed from: f */
    public final int m1241f() {
        return this.f1126c;
    }

    /* JADX INFO: renamed from: g */
    public final C0671n m1242g() {
        switch (this.f1124a) {
            case 50:
                return C0672o.f1145Q;
            case C0327R.styleable.AppCompatTheme_actionButtonStyle /* 51 */:
                return C0672o.f1144P;
            case C0327R.styleable.AppCompatTheme_buttonBarStyle /* 52 */:
                return C0672o.f1147S;
            case C0327R.styleable.AppCompatTheme_buttonBarButtonStyle /* 53 */:
                return C0672o.f1146R;
            case C0327R.styleable.AppCompatTheme_selectableItemBackground /* 54 */:
                return C0672o.f1149U;
            case C0327R.styleable.AppCompatTheme_selectableItemBackgroundBorderless /* 55 */:
                return C0672o.f1148T;
            case C0327R.styleable.AppCompatTheme_borderlessButtonStyle /* 56 */:
                return C0672o.f1151W;
            case C0327R.styleable.AppCompatTheme_dividerVertical /* 57 */:
                return C0672o.f1150V;
            case C0327R.styleable.AppCompatTheme_dividerHorizontal /* 58 */:
                return C0672o.f1153Y;
            case C0327R.styleable.AppCompatTheme_activityChooserViewStyle /* 59 */:
                return C0672o.f1152X;
            case C0327R.styleable.AppCompatTheme_toolbarStyle /* 60 */:
                return C0672o.f1182aa;
            case C0327R.styleable.AppCompatTheme_toolbarNavigationButtonStyle /* 61 */:
                return C0672o.f1154Z;
            default:
                throw new IllegalArgumentException("bogus opcode: " + this);
        }
    }

    public final String toString() {
        return C0798e.m1599a(this.f1124a);
    }
}
