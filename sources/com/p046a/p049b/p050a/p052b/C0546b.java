package com.p046a.p049b.p050a.p052b;

import android.support.v7.appcompat.C0327R;
import com.gmail.heagoo.p084a.p089c.C1067a;
import com.p046a.p049b.p066f.p069c.AbstractC0857a;
import com.p046a.p049b.p066f.p069c.AbstractC0879u;
import com.p046a.p049b.p066f.p069c.C0883y;
import com.p046a.p049b.p066f.p069c.C0884z;
import com.p046a.p049b.p066f.p070d.C0887c;
import com.p046a.p049b.p073h.C0962j;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.a.b.a.b.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0546b implements InterfaceC0555k {

    /* JADX INFO: renamed from: a */
    private final C0556l f865a;

    /* JADX INFO: renamed from: b */
    private final int[] f866b;

    /* JADX INFO: renamed from: c */
    private final int[] f867c;

    /* JADX INFO: renamed from: d */
    private final int[] f868d;

    /* JADX INFO: renamed from: e */
    private final C0962j[] f869e;

    /* JADX INFO: renamed from: f */
    private final C0549e[] f870f;

    /* JADX INFO: renamed from: g */
    private int f871g;

    private C0546b(C0556l c0556l) {
        if (c0556l == null) {
            throw new NullPointerException("method == null");
        }
        this.f865a = c0556l;
        int iM842b = c0556l.m855k().m842b() + 1;
        this.f866b = C1067a.m2555s(iM842b);
        this.f867c = C1067a.m2555s(iM842b);
        this.f868d = C1067a.m2555s(iM842b);
        this.f869e = new C0962j[iM842b];
        this.f870f = new C0549e[iM842b];
        this.f871g = -1;
    }

    /* JADX INFO: renamed from: a */
    public static C0548d m816a(C0556l c0556l) {
        C0546b c0546b = new C0546b(c0556l);
        C0552h c0552hM855k = c0546b.f865a.m855k();
        C0549e c0549eM856l = c0546b.f865a.m856l();
        int iD_ = c0549eM856l.m2239d_();
        C1067a.m2508b(c0546b.f866b, 0);
        C1067a.m2508b(c0546b.f868d, 0);
        while (!C1067a.m2512b(c0546b.f866b)) {
            try {
                int[] iArr = c0546b.f866b;
                if (c0546b == null) {
                    throw new NullPointerException("visitor == null");
                }
                while (true) {
                    int iM2524d = C1067a.m2524d(iArr, 0);
                    if (iM2524d < 0) {
                        break;
                    }
                    C1067a.m2521c(iArr, iM2524d);
                    c0552hM855k.m839a(iM2524d, c0546b);
                    c0546b.mo797a(iM2524d);
                }
                for (int i = 0; i < iD_; i++) {
                    C0550f c0550fM828a = c0549eM856l.m828a(i);
                    int iM832a = c0550fM828a.m832a();
                    int iM834b = c0550fM828a.m834b();
                    if (C1067a.m2490a(c0546b.f867c, iM832a, iM834b)) {
                        C1067a.m2508b(c0546b.f868d, iM832a);
                        C1067a.m2508b(c0546b.f868d, iM834b);
                        c0546b.m818a(c0550fM828a.m835c(), true);
                    }
                }
            } catch (IllegalArgumentException e) {
                throw new C0541ah("flow of control falls off end of method", e);
            }
        }
        return c0546b.m819b();
    }

    /* JADX INFO: renamed from: a */
    private void m817a(int i, int i2, boolean z) {
        C1067a.m2508b(this.f867c, i);
        if (z) {
            m818a(i + i2, false);
        } else {
            C1067a.m2508b(this.f868d, i + i2);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m818a(int i, boolean z) {
        if (!C1067a.m2489a(this.f867c, i)) {
            C1067a.m2508b(this.f866b, i);
        }
        if (z) {
            C1067a.m2508b(this.f868d, i);
        }
    }

    /* JADX INFO: renamed from: b */
    private C0548d m819b() {
        int i;
        C0549e c0549e;
        C0547c[] c0547cArr = new C0547c[this.f865a.m855k().m842b()];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int iM2524d = C1067a.m2524d(this.f868d, i2 + 1);
            if (iM2524d < 0) {
                break;
            }
            if (C1067a.m2489a(this.f867c, i2)) {
                C0962j c0962jM2244a = null;
                int i4 = iM2524d - 1;
                while (true) {
                    if (i4 < i2) {
                        i4 = -1;
                        break;
                    }
                    c0962jM2244a = this.f869e[i4];
                    if (c0962jM2244a != null) {
                        break;
                    }
                    i4--;
                }
                if (c0962jM2244a == null) {
                    c0962jM2244a = C0962j.m2244a(iM2524d);
                    c0549e = C0549e.f877a;
                } else {
                    c0549e = this.f870f[i4];
                    if (c0549e == null) {
                        c0549e = C0549e.f877a;
                    }
                }
                c0547cArr[i3] = new C0547c(i2, i2, iM2524d, c0962jM2244a, c0549e);
                i = i3 + 1;
            } else {
                i = i3;
            }
            i2 = iM2524d;
            i3 = i;
        }
        C0548d c0548d = new C0548d(i3);
        for (int i5 = 0; i5 < i3; i5++) {
            c0548d.m827a(i5, c0547cArr[i5]);
        }
        return c0548d;
    }

    /* JADX INFO: renamed from: b */
    private void m820b(int i, int i2, boolean z) {
        C0962j c0962jM2244a;
        int i3 = i + i2;
        if (z) {
            m818a(i3, true);
        }
        C0549e c0549eM831b = this.f865a.m856l().m831b(i);
        this.f870f[i] = c0549eM831b;
        C0962j[] c0962jArr = this.f869e;
        int i4 = z ? i3 : -1;
        if (i4 < -1) {
            throw new IllegalArgumentException("noException < -1");
        }
        boolean z2 = i4 >= 0;
        int iD_ = c0549eM831b.m2239d_();
        if (iD_ == 0) {
            c0962jM2244a = z2 ? C0962j.m2244a(i4) : C0962j.f2577a;
        } else {
            C0962j c0962j = new C0962j((z2 ? 1 : 0) + iD_);
            for (int i5 = 0; i5 < iD_; i5++) {
                c0962j.m2250c(c0549eM831b.m828a(i5).m835c());
            }
            if (z2) {
                c0962j.m2250c(i4);
            }
            c0962j.mo811b_();
            c0962jM2244a = c0962j;
        }
        c0962jArr[i] = c0962jM2244a;
    }

    @Override // com.p046a.p049b.p050a.p052b.InterfaceC0555k
    /* JADX INFO: renamed from: a */
    public final int mo796a() {
        return this.f871g;
    }

    @Override // com.p046a.p049b.p050a.p052b.InterfaceC0555k
    /* JADX INFO: renamed from: a */
    public final void mo797a(int i) {
        this.f871g = i;
    }

    @Override // com.p046a.p049b.p050a.p052b.InterfaceC0555k
    /* JADX INFO: renamed from: a */
    public final void mo798a(int i, int i2, int i3) {
        m817a(i2, i3, true);
    }

    @Override // com.p046a.p049b.p050a.p052b.InterfaceC0555k
    /* JADX INFO: renamed from: a */
    public final void mo799a(int i, int i2, int i3, int i4) {
        switch (i) {
            case 167:
                m817a(i2, i3, false);
                this.f869e[i2] = C0962j.m2244a(i4);
                break;
            case 168:
                m818a(i2, true);
            default:
                int i5 = i2 + i3;
                m817a(i2, i3, true);
                m818a(i5, true);
                this.f869e[i2] = C0962j.m2245a(i5, i4);
                break;
        }
        m818a(i4, true);
    }

    @Override // com.p046a.p049b.p050a.p052b.InterfaceC0555k
    /* JADX INFO: renamed from: a */
    public final void mo800a(int i, int i2, int i3, int i4, C0887c c0887c, int i5) {
        if (i != 169) {
            m817a(i2, i3, true);
        } else {
            m817a(i2, i3, false);
            this.f869e[i2] = C0962j.f2577a;
        }
    }

    @Override // com.p046a.p049b.p050a.p052b.InterfaceC0555k
    /* JADX INFO: renamed from: a */
    public final void mo801a(int i, int i2, int i3, C0544ak c0544ak, int i4) {
        m817a(i2, i3, false);
        m818a(c0544ak.m809b(), true);
        int iM806a = c0544ak.m806a();
        for (int i5 = 0; i5 < iM806a; i5++) {
            m818a(c0544ak.m810b(i5), true);
        }
        this.f869e[i2] = c0544ak.m813d();
    }

    @Override // com.p046a.p049b.p050a.p052b.InterfaceC0555k
    /* JADX INFO: renamed from: a */
    public final void mo802a(int i, int i2, int i3, AbstractC0857a abstractC0857a, int i4) {
        m817a(i2, i3, true);
        if ((abstractC0857a instanceof AbstractC0879u) || (abstractC0857a instanceof C0884z) || (abstractC0857a instanceof C0883y)) {
            m820b(i2, i3, true);
        }
    }

    @Override // com.p046a.p049b.p050a.p052b.InterfaceC0555k
    /* JADX INFO: renamed from: a */
    public final void mo803a(int i, int i2, int i3, C0887c c0887c) {
        switch (i) {
            case 46:
            case 47:
            case C0327R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 48 */:
            case C0327R.styleable.AppCompatTheme_spinnerDropDownItemStyle /* 49 */:
            case 50:
            case C0327R.styleable.AppCompatTheme_actionButtonStyle /* 51 */:
            case C0327R.styleable.AppCompatTheme_buttonBarStyle /* 52 */:
            case C0327R.styleable.AppCompatTheme_buttonBarButtonStyle /* 53 */:
            case C0327R.styleable.AppCompatTheme_textAppearanceListItemSecondary /* 79 */:
            case C0327R.styleable.AppCompatTheme_textAppearanceListItemSmall /* 80 */:
            case 81:
            case C0327R.styleable.AppCompatTheme_panelMenuListWidth /* 82 */:
            case C0327R.styleable.AppCompatTheme_panelMenuListTheme /* 83 */:
            case C0327R.styleable.AppCompatTheme_listChoiceBackgroundIndicator /* 84 */:
            case C0327R.styleable.AppCompatTheme_colorPrimary /* 85 */:
            case C0327R.styleable.AppCompatTheme_colorPrimaryDark /* 86 */:
            case 190:
            case 194:
            case 195:
                m817a(i2, i3, true);
                m820b(i2, i3, true);
                break;
            case 108:
            case C0327R.styleable.AppCompatTheme_ratingBarStyleSmall /* 112 */:
                m817a(i2, i3, true);
                if (c0887c == C0887c.f2347f || c0887c == C0887c.f2348g) {
                    m820b(i2, i3, true);
                }
                break;
            case 172:
            case 177:
                m817a(i2, i3, false);
                this.f869e[i2] = C0962j.f2577a;
                break;
            case 191:
                m817a(i2, i3, false);
                m820b(i2, i3, false);
                break;
            default:
                m817a(i2, i3, true);
                break;
        }
    }

    @Override // com.p046a.p049b.p050a.p052b.InterfaceC0555k
    /* JADX INFO: renamed from: a */
    public final void mo804a(int i, int i2, C0884z c0884z, ArrayList arrayList) {
        m817a(i, i2, true);
        m820b(i, i2, true);
    }
}
