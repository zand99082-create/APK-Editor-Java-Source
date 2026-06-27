package com.p046a.p049b.p050a.p052b;

import android.support.v7.appcompat.C0327R;
import com.gmail.heagoo.p084a.p089c.C1067a;
import com.p046a.p049b.p050a.p055e.InterfaceC0594g;
import com.p046a.p049b.p050a.p055e.InterfaceC0595h;
import com.p046a.p049b.p066f.p068b.AbstractC0839i;
import com.p046a.p049b.p066f.p068b.C0828aa;
import com.p046a.p049b.p066f.p068b.C0829ab;
import com.p046a.p049b.p066f.p068b.C0830ac;
import com.p046a.p049b.p066f.p068b.C0838h;
import com.p046a.p049b.p066f.p068b.C0846p;
import com.p046a.p049b.p066f.p068b.C0847q;
import com.p046a.p049b.p066f.p068b.C0848r;
import com.p046a.p049b.p066f.p068b.C0850t;
import com.p046a.p049b.p066f.p068b.C0853w;
import com.p046a.p049b.p066f.p068b.C0855y;
import com.p046a.p049b.p066f.p068b.C0856z;
import com.p046a.p049b.p066f.p068b.InterfaceC0831ad;
import com.p046a.p049b.p066f.p069c.AbstractC0857a;
import com.p046a.p049b.p066f.p069c.C0870l;
import com.p046a.p049b.p066f.p069c.C0872n;
import com.p046a.p049b.p066f.p069c.C0880v;
import com.p046a.p049b.p066f.p069c.C0881w;
import com.p046a.p049b.p066f.p069c.C0883y;
import com.p046a.p049b.p066f.p069c.C0884z;
import com.p046a.p049b.p066f.p070d.C0887c;
import com.p046a.p049b.p066f.p070d.InterfaceC0888d;
import com.p046a.p049b.p066f.p070d.InterfaceC0889e;
import com.p046a.p049b.p073h.C0962j;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.a.b.a.b.ag */
/* JADX INFO: loaded from: classes.dex */
final class C0540ag extends C0545al {

    /* JADX INFO: renamed from: a */
    private static final C0884z f836a = new C0884z(C0887c.m1944c("java/lang/reflect/Array"));

    /* JADX INFO: renamed from: b */
    private static final C0880v f837b = new C0880v(f836a, new C0881w(new C0883y("newInstance"), new C0883y("(Ljava/lang/Class;[I)Ljava/lang/Object;")));

    /* JADX INFO: renamed from: c */
    private final C0568x f838c;

    /* JADX INFO: renamed from: d */
    private final C0556l f839d;

    /* JADX INFO: renamed from: e */
    private final InterfaceC0595h f840e;

    /* JADX INFO: renamed from: f */
    private final InterfaceC0831ad f841f;

    /* JADX INFO: renamed from: g */
    private final int f842g;

    /* JADX INFO: renamed from: h */
    private final ArrayList f843h;

    /* JADX INFO: renamed from: i */
    private InterfaceC0889e f844i;

    /* JADX INFO: renamed from: j */
    private boolean f845j;

    /* JADX INFO: renamed from: k */
    private boolean f846k;

    /* JADX INFO: renamed from: l */
    private int f847l;

    /* JADX INFO: renamed from: m */
    private int f848m;

    /* JADX INFO: renamed from: n */
    private boolean f849n;

    /* JADX INFO: renamed from: o */
    private boolean f850o;

    /* JADX INFO: renamed from: p */
    private C0567w f851p;

    /* JADX INFO: renamed from: q */
    private C0853w f852q;

    /* JADX INFO: renamed from: r */
    private C0856z f853r;

    public C0540ag(C0568x c0568x, C0556l c0556l, InterfaceC0831ad interfaceC0831ad, InterfaceC0595h interfaceC0595h) {
        super(c0556l.mo851g());
        if (interfaceC0595h == null) {
            throw new NullPointerException("methods == null");
        }
        if (c0568x == null) {
            throw new NullPointerException("ropper == null");
        }
        if (interfaceC0831ad == null) {
            throw new NullPointerException("advice == null");
        }
        this.f838c = c0568x;
        this.f839d = c0556l;
        this.f840e = interfaceC0595h;
        this.f841f = interfaceC0831ad;
        this.f842g = c0556l.m854j();
        this.f843h = new ArrayList(25);
        this.f844i = null;
        this.f845j = false;
        this.f846k = false;
        this.f847l = -1;
        this.f848m = 0;
        this.f850o = false;
        this.f852q = null;
        this.f853r = null;
    }

    /* JADX INFO: renamed from: a */
    private int m776a(int i, AbstractC0857a abstractC0857a) {
        switch (i) {
            case 0:
                return 1;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 19:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 47:
            case C0327R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 48 */:
            case C0327R.styleable.AppCompatTheme_spinnerDropDownItemStyle /* 49 */:
            case 50:
            case C0327R.styleable.AppCompatTheme_actionButtonStyle /* 51 */:
            case C0327R.styleable.AppCompatTheme_buttonBarStyle /* 52 */:
            case C0327R.styleable.AppCompatTheme_buttonBarButtonStyle /* 53 */:
            case C0327R.styleable.AppCompatTheme_selectableItemBackgroundBorderless /* 55 */:
            case C0327R.styleable.AppCompatTheme_borderlessButtonStyle /* 56 */:
            case C0327R.styleable.AppCompatTheme_dividerVertical /* 57 */:
            case C0327R.styleable.AppCompatTheme_dividerHorizontal /* 58 */:
            case C0327R.styleable.AppCompatTheme_activityChooserViewStyle /* 59 */:
            case C0327R.styleable.AppCompatTheme_toolbarStyle /* 60 */:
            case C0327R.styleable.AppCompatTheme_toolbarNavigationButtonStyle /* 61 */:
            case C0327R.styleable.AppCompatTheme_popupMenuStyle /* 62 */:
            case 63:
            case 64:
            case C0327R.styleable.AppCompatTheme_editTextBackground /* 65 */:
            case C0327R.styleable.AppCompatTheme_imageButtonStyle /* 66 */:
            case C0327R.styleable.AppCompatTheme_textAppearanceSearchResultTitle /* 67 */:
            case C0327R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle /* 68 */:
            case C0327R.styleable.AppCompatTheme_textColorSearchUrl /* 69 */:
            case C0327R.styleable.AppCompatTheme_searchViewStyle /* 70 */:
            case C0327R.styleable.AppCompatTheme_listPreferredItemHeight /* 71 */:
            case C0327R.styleable.AppCompatTheme_listPreferredItemHeightSmall /* 72 */:
            case C0327R.styleable.AppCompatTheme_listPreferredItemHeightLarge /* 73 */:
            case C0327R.styleable.AppCompatTheme_listPreferredItemPaddingLeft /* 74 */:
            case C0327R.styleable.AppCompatTheme_listPreferredItemPaddingRight /* 75 */:
            case C0327R.styleable.AppCompatTheme_dropDownListViewStyle /* 76 */:
            case C0327R.styleable.AppCompatTheme_listPopupWindowStyle /* 77 */:
            case C0327R.styleable.AppCompatTheme_textAppearanceListItem /* 78 */:
            case C0327R.styleable.AppCompatTheme_textAppearanceListItemSmall /* 80 */:
            case 81:
            case C0327R.styleable.AppCompatTheme_panelMenuListWidth /* 82 */:
            case C0327R.styleable.AppCompatTheme_panelMenuListTheme /* 83 */:
            case C0327R.styleable.AppCompatTheme_listChoiceBackgroundIndicator /* 84 */:
            case C0327R.styleable.AppCompatTheme_colorPrimary /* 85 */:
            case C0327R.styleable.AppCompatTheme_colorPrimaryDark /* 86 */:
            case C0327R.styleable.AppCompatTheme_colorAccent /* 87 */:
            case C0327R.styleable.AppCompatTheme_colorControlNormal /* 88 */:
            case C0327R.styleable.AppCompatTheme_colorControlActivated /* 89 */:
            case C0327R.styleable.AppCompatTheme_colorControlHighlight /* 90 */:
            case C0327R.styleable.AppCompatTheme_colorButtonNormal /* 91 */:
            case C0327R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 92 */:
            case C0327R.styleable.AppCompatTheme_controlBackground /* 93 */:
            case C0327R.styleable.AppCompatTheme_colorBackgroundFloating /* 94 */:
            case C0327R.styleable.AppCompatTheme_alertDialogStyle /* 95 */:
            case C0327R.styleable.AppCompatTheme_alertDialogCenterButtons /* 97 */:
            case C0327R.styleable.AppCompatTheme_alertDialogTheme /* 98 */:
            case C0327R.styleable.AppCompatTheme_textColorAlertDialogListItem /* 99 */:
            case C0327R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 101 */:
            case C0327R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 102 */:
            case C0327R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 103 */:
            case C0327R.styleable.AppCompatTheme_buttonStyleSmall /* 105 */:
            case C0327R.styleable.AppCompatTheme_checkboxStyle /* 106 */:
            case C0327R.styleable.AppCompatTheme_checkedTextViewStyle /* 107 */:
            case 109:
            case C0327R.styleable.AppCompatTheme_ratingBarStyle /* 110 */:
            case C0327R.styleable.AppCompatTheme_ratingBarStyleIndicator /* 111 */:
            case C0327R.styleable.AppCompatTheme_seekBarStyle /* 113 */:
            case C0327R.styleable.AppCompatTheme_spinnerStyle /* 114 */:
            case C0327R.styleable.AppCompatTheme_switchStyle /* 115 */:
            case C0327R.styleable.AppCompatTheme_tooltipFrameBackground /* 117 */:
            case C0327R.styleable.AppCompatTheme_tooltipForegroundColor /* 118 */:
            case C0327R.styleable.AppCompatTheme_colorError /* 119 */:
            case 121:
            case 123:
            case 125:
            case 127:
            case 129:
            case 131:
            case 168:
            case 169:
            case 170:
            case 173:
            case 174:
            case 175:
            case 176:
            case 186:
            case 196:
            case 197:
            default:
                throw new RuntimeException("shouldn't happen");
            case 18:
            case 20:
                return 5;
            case 21:
            case C0327R.styleable.AppCompatTheme_selectableItemBackground /* 54 */:
                return 2;
            case 46:
                return 38;
            case C0327R.styleable.AppCompatTheme_textAppearanceListItemSecondary /* 79 */:
                return 39;
            case C0327R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 96 */:
            case 132:
                return 14;
            case C0327R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 100 */:
                return 15;
            case C0327R.styleable.AppCompatTheme_buttonStyle /* 104 */:
                return 16;
            case 108:
                return 17;
            case C0327R.styleable.AppCompatTheme_ratingBarStyleSmall /* 112 */:
                return 18;
            case C0327R.styleable.AppCompatTheme_listMenuViewStyle /* 116 */:
                return 19;
            case 120:
                return 23;
            case 122:
                return 24;
            case 124:
                return 25;
            case 126:
                return 20;
            case 128:
                return 21;
            case 130:
                return 22;
            case 133:
            case 134:
            case 135:
            case 136:
            case 137:
            case 138:
            case 139:
            case 140:
            case 141:
            case 142:
            case 143:
            case 144:
                return 29;
            case 145:
                return 30;
            case 146:
                return 31;
            case 147:
                return 32;
            case 148:
            case 149:
            case 151:
                return 27;
            case 150:
            case 152:
                return 28;
            case 153:
            case 159:
            case 165:
            case 198:
                return 7;
            case 154:
            case 160:
            case 166:
            case 199:
                return 8;
            case 155:
            case 161:
                return 9;
            case 156:
            case 162:
                return 10;
            case 157:
            case 163:
                return 12;
            case 158:
            case 164:
                return 11;
            case 167:
                return 6;
            case 171:
                return 13;
            case 172:
            case 177:
                return 33;
            case 178:
                return 46;
            case 179:
                return 48;
            case 180:
                return 45;
            case 181:
                return 47;
            case 182:
                C0880v c0880v = (C0880v) abstractC0857a;
                if (c0880v.m1898k().equals(this.f839d.mo850f())) {
                    for (int i2 = 0; i2 < this.f840e.m1054d_(); i2++) {
                        InterfaceC0594g interfaceC0594gMo1053a = this.f840e.mo1053a(i2);
                        if (C1067a.m2545k(interfaceC0594gMo1053a.mo848d()) && c0880v.m1899l().equals(interfaceC0594gMo1053a.mo845a())) {
                            return 52;
                        }
                    }
                }
                return 50;
            case 183:
                C0880v c0880v2 = (C0880v) abstractC0857a;
                return (c0880v2.m1899l().m1903e() || c0880v2.m1898k().equals(this.f839d.mo850f()) || !this.f839d.m852h()) ? 52 : 51;
            case 184:
                return 49;
            case 185:
                return 53;
            case 187:
                return 40;
            case 188:
            case 189:
                return 41;
            case 190:
                return 34;
            case 191:
                return 35;
            case 192:
                return 43;
            case 193:
                return 44;
            case 194:
                return 36;
            case 195:
                return 37;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0446  */
    @Override // com.p046a.p049b.p050a.p052b.C0545al, com.p046a.p049b.p050a.p052b.InterfaceC0565u
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo777a(C0558n c0558n, int i, int i2) {
        C0850t c0850t;
        C0850t c0850t2;
        C0850t c0850tM1820f;
        C0847q c0847q;
        C0848r c0848r;
        C0853w c0853wM1847a;
        AbstractC0857a abstractC0857aM1916b;
        AbstractC0857a abstractC0857aM1891a;
        int i3;
        AbstractC0839i c0847q2;
        int iM867b = c0558n.m884d().m867b() + this.f842g;
        int iC = m750c();
        if (iC == 0) {
            c0850t2 = C0850t.f2003a;
        } else {
            int iJ = m759j();
            if (iJ < 0) {
                c0850t = new C0850t(iC);
                int iM1799k = iM867b;
                for (int i4 = 0; i4 < iC; i4++) {
                    C0848r c0848rM1778a = C0848r.m1778a(iM1799k, m751c(i4));
                    c0850t.m1814a(i4, c0848rM1778a);
                    iM1799k += c0848rM1778a.m1799k();
                }
                switch (i2) {
                    case C0327R.styleable.AppCompatTheme_textAppearanceListItemSecondary /* 79 */:
                        if (iC != 3) {
                            throw new RuntimeException("shouldn't happen");
                        }
                        C0848r c0848rM1815b = c0850t.m1815b(0);
                        C0848r c0848rM1815b2 = c0850t.m1815b(1);
                        c0850t.m1814a(0, c0850t.m1815b(2));
                        c0850t.m1814a(1, c0848rM1815b);
                        c0850t.m1814a(2, c0848rM1815b2);
                        break;
                        break;
                    case 181:
                        if (iC != 2) {
                            throw new RuntimeException("shouldn't happen");
                        }
                        C0848r c0848rM1815b3 = c0850t.m1815b(0);
                        c0850t.m1814a(0, c0850t.m1815b(1));
                        c0850t.m1814a(1, c0848rM1815b3);
                        break;
                        break;
                }
            } else {
                c0850t = new C0850t(1);
                c0850t.m1814a(0, C0848r.m1778a(iJ, m751c(0)));
            }
            c0850t.mo811b_();
            c0850t2 = c0850t;
        }
        int iD_ = c0850t2.m2239d_();
        super.mo777a(c0558n, i, i2);
        C0856z c0856zM844a = this.f839d.m844a(i);
        C0848r c0848rB = m745b(i2 == 54);
        int iL = m761l();
        if (iL == 0) {
            c0848rB = null;
            switch (i2) {
                case C0327R.styleable.AppCompatTheme_colorAccent /* 87 */:
                case C0327R.styleable.AppCompatTheme_colorControlNormal /* 88 */:
                    return;
            }
        }
        if (c0848rB == null) {
            if (iL != 1) {
                int iM964a = this.f838c.m964a();
                C0848r[] c0848rArr = new C0848r[iD_];
                for (int i5 = 0; i5 < iD_; i5++) {
                    C0848r c0848rM1815b4 = c0850t2.m1815b(i5);
                    InterfaceC0888d interfaceC0888dM1796h = c0848rM1815b4.m1796h();
                    C0848r c0848rM1787a = c0848rM1815b4.m1787a(iM964a);
                    this.f843h.add(new C0847q(C0855y.m1849a(interfaceC0888dM1796h), c0856zM844a, c0848rM1787a, c0848rM1815b4));
                    c0848rArr[i5] = c0848rM1787a;
                    iM964a += c0848rM1815b4.m1799k();
                }
                for (int iE = m754e(); iE != 0; iE >>= 4) {
                    C0848r c0848r2 = c0848rArr[(iE & 15) - 1];
                    InterfaceC0888d interfaceC0888dM1796h2 = c0848r2.m1796h();
                    this.f843h.add(new C0847q(C0855y.m1849a(interfaceC0888dM1796h2), c0856zM844a, c0848r2.m1787a(iM867b), c0848r2));
                    iM867b += interfaceC0888dM1796h2.mo925a().m1949i();
                }
                return;
            }
            c0848rB = C0848r.m1778a(iM867b, m753d(0));
        }
        InterfaceC0888d interfaceC0888d = c0848rB != null ? c0848rB : C0887c.f2350i;
        AbstractC0857a abstractC0857aF = m755f();
        if (i2 == 197) {
            this.f850o = true;
            this.f848m = 6;
            C0848r c0848rM1778a2 = C0848r.m1778a(c0848rB.m1798j(), C0887c.f2337F);
            this.f843h.add(new C0829ab(C0855y.m1850a(C0887c.f2337F, iD_), c0856zM844a, c0850t2, this.f844i, C0884z.f2277h));
            this.f843h.add(new C0847q(C0855y.m1856d(C0887c.f2337F), c0856zM844a, c0848rM1778a2, C0850t.f2003a));
            int i6 = 0;
            C0887c c0887cM1917i = ((C0884z) abstractC0857aF).m1917i();
            while (i6 < iD_) {
                i6++;
                c0887cM1917i = c0887cM1917i.m1959s();
            }
            C0848r c0848rM1778a3 = C0848r.m1778a(c0848rB.m1795g(), C0887c.f2353l);
            this.f843h.add(c0887cM1917i.m1953m() ? new C0829ab(C0855y.f2115bN, c0856zM844a, C0850t.f2003a, this.f844i, C0870l.m1889a(c0887cM1917i)) : new C0829ab(C0855y.f2219q, c0856zM844a, C0850t.f2003a, this.f844i, new C0884z(c0887cM1917i)));
            this.f843h.add(new C0847q(C0855y.m1857e(c0848rM1778a3.mo925a()), c0856zM844a, c0848rM1778a3, C0850t.f2003a));
            C0848r c0848rM1778a4 = C0848r.m1778a(c0848rB.m1795g(), C0887c.f2355n);
            this.f843h.add(new C0829ab(C0855y.m1848a(f837b.m1880i()), c0856zM844a, C0850t.m1809a(c0848rM1778a3, c0848rM1778a2), this.f844i, f837b));
            this.f843h.add(new C0847q(C0855y.m1856d(f837b.m1880i().m1926a()), c0856zM844a, c0848rM1778a4, C0850t.f2003a));
            i2 = 192;
            c0850tM1820f = C0850t.m1808a(c0848rM1778a4);
        } else if (i2 == 168) {
            this.f849n = true;
            return;
        } else {
            if (i2 == 169) {
                try {
                    this.f851p = (C0567w) m751c(0);
                    return;
                } catch (ClassCastException e) {
                    throw new RuntimeException("Argument to RET was not a ReturnAddress", e);
                }
            }
            c0850tM1820f = c0850t2;
        }
        int iM776a = m776a(i2, abstractC0857aF);
        C0853w c0853wM1847a2 = C0855y.m1847a(iM776a, interfaceC0888d, c0850tM1820f, abstractC0857aF);
        if (c0848rB != null && c0853wM1847a2.m1840e()) {
            this.f848m++;
            c0847q = new C0847q(C0855y.m1856d(((C0880v) abstractC0857aF).m1880i().m1926a()), c0856zM844a, c0848rB, C0850t.f2003a);
            c0848r = null;
        } else if (c0848rB == null || !c0853wM1847a2.m1843h()) {
            c0847q = null;
            c0848r = c0848rB;
        } else {
            this.f848m++;
            c0847q = new C0847q(C0855y.m1857e(c0848rB.m1796h()), c0856zM844a, c0848rB, C0850t.f2003a);
            c0848r = null;
        }
        if (iM776a == 41) {
            c0853wM1847a = c0853wM1847a2;
            abstractC0857aM1916b = C0884z.m1916b(c0853wM1847a2.m1837b());
        } else if (abstractC0857aF == null && iD_ == 2) {
            InterfaceC0888d interfaceC0888dM1796h3 = c0850tM1820f.m1815b(0).m1796h();
            InterfaceC0888d interfaceC0888dM1796h4 = c0850tM1820f.m1815b(1).m1796h();
            if ((interfaceC0888dM1796h4.mo929f() || interfaceC0888dM1796h3.mo929f()) && this.f841f.mo1735a(c0853wM1847a2, c0850tM1820f.m1815b(0), c0850tM1820f.m1815b(1))) {
                if (interfaceC0888dM1796h4.mo929f()) {
                    AbstractC0857a abstractC0857a = (AbstractC0857a) interfaceC0888dM1796h4;
                    c0850tM1820f = c0850tM1820f.m1821g();
                    if (c0853wM1847a2.m1836a() == 15) {
                        i3 = 14;
                        abstractC0857aM1891a = C0872n.m1891a(-((C0872n) interfaceC0888dM1796h4).mo1894j());
                    } else {
                        abstractC0857aM1891a = abstractC0857a;
                        i3 = iM776a;
                    }
                } else {
                    c0850tM1820f = c0850tM1820f.m1820f();
                    abstractC0857aM1891a = (AbstractC0857a) interfaceC0888dM1796h3;
                    i3 = iM776a;
                }
                abstractC0857aM1916b = abstractC0857aM1891a;
                c0853wM1847a = C0855y.m1847a(i3, interfaceC0888d, c0850tM1820f, abstractC0857aM1891a);
                iM776a = i3;
            }
        } else {
            c0853wM1847a = c0853wM1847a2;
            abstractC0857aM1916b = abstractC0857aF;
        }
        C0544ak c0544akH = m757h();
        ArrayList arrayListI = m758i();
        boolean zM1843h = c0853wM1847a.m1843h();
        this.f850o |= zM1843h;
        if (c0544akH != null) {
            if (c0544akH.m806a() == 0) {
                c0847q2 = new C0847q(C0855y.f2221s, c0856zM844a, (C0848r) null, C0850t.f2003a);
                this.f847l = 0;
            } else {
                C0962j c0962jM814e = c0544akH.m814e();
                c0847q2 = new C0828aa(c0853wM1847a, c0856zM844a, c0848r, c0850tM1820f, c0962jM814e);
                this.f847l = c0962jM814e.m2247b();
            }
        } else if (iM776a == 33) {
            if (c0850tM1820f.m2239d_() != 0) {
                C0848r c0848rM1815b5 = c0850tM1820f.m1815b(0);
                InterfaceC0888d interfaceC0888dM1796h5 = c0848rM1815b5.m1796h();
                if (c0848rM1815b5.m1795g() != 0) {
                    this.f843h.add(new C0847q(C0855y.m1849a(interfaceC0888dM1796h5), c0856zM844a, C0848r.m1778a(0, interfaceC0888dM1796h5), c0848rM1815b5));
                }
            }
            c0847q2 = new C0847q(C0855y.f2221s, c0856zM844a, (C0848r) null, C0850t.f2003a);
            this.f847l = 0;
            if (c0853wM1847a == null) {
                throw new NullPointerException("op == null");
            }
            if (c0856zM844a == null) {
                throw new NullPointerException("pos == null");
            }
            if (this.f852q == null) {
                this.f852q = c0853wM1847a;
                this.f853r = c0856zM844a;
            } else {
                if (this.f852q != c0853wM1847a) {
                    throw new C0541ah("return op mismatch: " + c0853wM1847a + ", " + this.f852q);
                }
                if (c0856zM844a.m1861a() > this.f853r.m1861a()) {
                    this.f853r = c0856zM844a;
                }
            }
            this.f846k = true;
        } else if (abstractC0857aM1916b != null) {
            if (zM1843h) {
                AbstractC0839i c0829ab = new C0829ab(c0853wM1847a, c0856zM844a, c0850tM1820f, this.f844i, abstractC0857aM1916b);
                this.f845j = true;
                this.f847l = this.f844i.mo1021d_();
                c0847q2 = c0829ab;
            } else {
                c0847q2 = new C0846p(c0853wM1847a, c0856zM844a, c0848r, c0850tM1820f, abstractC0857aM1916b);
            }
        } else if (zM1843h) {
            c0847q2 = new C0830ac(c0853wM1847a, c0856zM844a, c0850tM1820f, this.f844i);
            this.f845j = true;
            if (i2 == 191) {
                this.f847l = -1;
            } else {
                this.f847l = this.f844i.mo1021d_();
            }
        } else {
            c0847q2 = new C0847q(c0853wM1847a, c0856zM844a, c0848r, c0850tM1820f);
        }
        this.f843h.add(c0847q2);
        if (c0847q != null) {
            this.f843h.add(c0847q);
        }
        if (arrayListI != null) {
            this.f848m++;
            this.f843h.add(new C0838h(C0855y.f2124bW, c0856zM844a, C0850t.m1808a(c0847q.m1754h()), arrayListI, abstractC0857aM1916b));
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m778a(InterfaceC0889e interfaceC0889e) {
        this.f844i = interfaceC0889e;
        this.f843h.clear();
        this.f845j = false;
        this.f846k = false;
        this.f847l = 0;
        this.f848m = 0;
        this.f850o = false;
        this.f849n = false;
        this.f851p = null;
    }

    /* JADX INFO: renamed from: m */
    public final ArrayList m779m() {
        return this.f843h;
    }

    /* JADX INFO: renamed from: n */
    public final C0853w m780n() {
        return this.f852q;
    }

    /* JADX INFO: renamed from: o */
    public final C0856z m781o() {
        return this.f853r;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m782p() {
        return this.f845j;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m783q() {
        return this.f846k;
    }

    /* JADX INFO: renamed from: r */
    public final int m784r() {
        return this.f847l;
    }

    /* JADX INFO: renamed from: s */
    public final int m785s() {
        return this.f848m;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m786t() {
        return this.f850o;
    }

    /* JADX INFO: renamed from: u */
    public final boolean m787u() {
        return this.f849n;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m788v() {
        return this.f851p != null;
    }

    /* JADX INFO: renamed from: w */
    public final C0567w m789w() {
        return this.f851p;
    }
}
