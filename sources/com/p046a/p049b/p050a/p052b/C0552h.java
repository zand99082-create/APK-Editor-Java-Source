package com.p046a.p049b.p050a.p052b;

import android.support.v7.appcompat.C0327R;
import com.gmail.heagoo.p084a.p089c.C1067a;
import com.p046a.p049b.p050a.p055e.C0596i;
import com.p046a.p049b.p066f.p069c.AbstractC0857a;
import com.p046a.p049b.p066f.p069c.AbstractC0877s;
import com.p046a.p049b.p066f.p069c.C0868j;
import com.p046a.p049b.p066f.p069c.C0871m;
import com.p046a.p049b.p066f.p069c.C0872n;
import com.p046a.p049b.p066f.p069c.C0874p;
import com.p046a.p049b.p066f.p069c.C0878t;
import com.p046a.p049b.p066f.p069c.C0884z;
import com.p046a.p049b.p066f.p069c.InterfaceC0860b;
import com.p046a.p049b.p066f.p070d.C0887c;
import com.p046a.p049b.p073h.C0955c;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.a.b.a.b.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0552h {

    /* JADX INFO: renamed from: a */
    private static InterfaceC0555k f884a = new C0553i();

    /* JADX INFO: renamed from: b */
    private final C0955c f885b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC0860b f886c;

    public C0552h(C0955c c0955c, InterfaceC0860b interfaceC0860b) {
        if (c0955c == null) {
            throw new NullPointerException("bytes == null");
        }
        if (interfaceC0860b == null) {
            throw new NullPointerException("pool == null");
        }
        this.f885b = c0955c;
        this.f886c = interfaceC0860b;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0776  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m839a(int i, InterfaceC0555k interfaceC0555k) {
        C0884z c0884z;
        int i2;
        InterfaceC0555k interfaceC0555k2 = interfaceC0555k == null ? f884a : interfaceC0555k;
        try {
            int iM2227e = this.f885b.m2227e(i);
            C0551g.m838b(iM2227e);
            switch (iM2227e) {
                case 0:
                    interfaceC0555k2.mo803a(iM2227e, i, 1, C0887c.f2350i);
                    return 1;
                case 1:
                    interfaceC0555k2.mo802a(18, i, 1, C0874p.f2257a, 0);
                    return 1;
                case 2:
                    interfaceC0555k2.mo802a(18, i, 1, C0872n.f2248a, -1);
                    return 1;
                case 3:
                    interfaceC0555k2.mo802a(18, i, 1, C0872n.f2249b, 0);
                    return 1;
                case 4:
                    interfaceC0555k2.mo802a(18, i, 1, C0872n.f2250c, 1);
                    return 1;
                case 5:
                    interfaceC0555k2.mo802a(18, i, 1, C0872n.f2251d, 2);
                    return 1;
                case 6:
                    interfaceC0555k2.mo802a(18, i, 1, C0872n.f2252e, 3);
                    return 1;
                case 7:
                    interfaceC0555k2.mo802a(18, i, 1, C0872n.f2253f, 4);
                    return 1;
                case 8:
                    interfaceC0555k2.mo802a(18, i, 1, C0872n.f2254g, 5);
                    return 1;
                case 9:
                    interfaceC0555k2.mo802a(18, i, 1, C0878t.f2260a, 0);
                    return 1;
                case 10:
                    interfaceC0555k2.mo802a(18, i, 1, C0878t.f2261b, 0);
                    return 1;
                case 11:
                    interfaceC0555k2.mo802a(18, i, 1, C0871m.f2245a, 0);
                    return 1;
                case 12:
                    interfaceC0555k2.mo802a(18, i, 1, C0871m.f2246b, 0);
                    return 1;
                case 13:
                    interfaceC0555k2.mo802a(18, i, 1, C0871m.f2247c, 0);
                    return 1;
                case 14:
                    interfaceC0555k2.mo802a(18, i, 1, C0868j.f2242a, 0);
                    return 1;
                case 15:
                    interfaceC0555k2.mo802a(18, i, 1, C0868j.f2243b, 0);
                    return 1;
                case 16:
                    int iM2220a = this.f885b.m2220a(i + 1);
                    interfaceC0555k2.mo802a(18, i, 2, C0872n.m1891a(iM2220a), iM2220a);
                    return 2;
                case 17:
                    int iM2223b = this.f885b.m2223b(i + 1);
                    interfaceC0555k2.mo802a(18, i, 3, C0872n.m1891a(iM2223b), iM2223b);
                    return 3;
                case 18:
                    AbstractC0857a abstractC0857aMo1869a = this.f886c.mo1869a(this.f885b.m2227e(i + 1));
                    interfaceC0555k2.mo802a(18, i, 2, abstractC0857aMo1869a, abstractC0857aMo1869a instanceof C0872n ? ((C0872n) abstractC0857aMo1869a).mo1894j() : 0);
                    return 2;
                case 19:
                    AbstractC0857a abstractC0857aMo1869a2 = this.f886c.mo1869a(this.f885b.m2228f(i + 1));
                    interfaceC0555k2.mo802a(18, i, 3, abstractC0857aMo1869a2, abstractC0857aMo1869a2 instanceof C0872n ? ((C0872n) abstractC0857aMo1869a2).mo1894j() : 0);
                    return 3;
                case 20:
                    interfaceC0555k2.mo802a(20, i, 3, this.f886c.mo1869a(this.f885b.m2228f(i + 1)), 0);
                    return 3;
                case 21:
                    interfaceC0555k2.mo800a(21, i, 2, this.f885b.m2227e(i + 1), C0887c.f2347f, 0);
                    return 2;
                case 22:
                    interfaceC0555k2.mo800a(21, i, 2, this.f885b.m2227e(i + 1), C0887c.f2348g, 0);
                    return 2;
                case 23:
                    interfaceC0555k2.mo800a(21, i, 2, this.f885b.m2227e(i + 1), C0887c.f2346e, 0);
                    return 2;
                case 24:
                    interfaceC0555k2.mo800a(21, i, 2, this.f885b.m2227e(i + 1), C0887c.f2345d, 0);
                    return 2;
                case 25:
                    interfaceC0555k2.mo800a(21, i, 2, this.f885b.m2227e(i + 1), C0887c.f2355n, 0);
                    return 2;
                case 26:
                case 27:
                case 28:
                case 29:
                    interfaceC0555k2.mo800a(21, i, 1, iM2227e - 26, C0887c.f2347f, 0);
                    return 1;
                case 30:
                case 31:
                case 32:
                case 33:
                    interfaceC0555k2.mo800a(21, i, 1, iM2227e - 30, C0887c.f2348g, 0);
                    return 1;
                case 34:
                case 35:
                case 36:
                case 37:
                    interfaceC0555k2.mo800a(21, i, 1, iM2227e - 34, C0887c.f2346e, 0);
                    return 1;
                case 38:
                case 39:
                case 40:
                case 41:
                    interfaceC0555k2.mo800a(21, i, 1, iM2227e - 38, C0887c.f2345d, 0);
                    return 1;
                case 42:
                case 43:
                case 44:
                case 45:
                    interfaceC0555k2.mo800a(21, i, 1, iM2227e - 42, C0887c.f2355n, 0);
                    return 1;
                case 46:
                    interfaceC0555k2.mo803a(46, i, 1, C0887c.f2347f);
                    return 1;
                case 47:
                    interfaceC0555k2.mo803a(46, i, 1, C0887c.f2348g);
                    return 1;
                case C0327R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 48 */:
                    interfaceC0555k2.mo803a(46, i, 1, C0887c.f2346e);
                    return 1;
                case C0327R.styleable.AppCompatTheme_spinnerDropDownItemStyle /* 49 */:
                    interfaceC0555k2.mo803a(46, i, 1, C0887c.f2345d);
                    return 1;
                case 50:
                    interfaceC0555k2.mo803a(46, i, 1, C0887c.f2355n);
                    return 1;
                case C0327R.styleable.AppCompatTheme_actionButtonStyle /* 51 */:
                    interfaceC0555k2.mo803a(46, i, 1, C0887c.f2343b);
                    return 1;
                case C0327R.styleable.AppCompatTheme_buttonBarStyle /* 52 */:
                    interfaceC0555k2.mo803a(46, i, 1, C0887c.f2344c);
                    return 1;
                case C0327R.styleable.AppCompatTheme_buttonBarButtonStyle /* 53 */:
                    interfaceC0555k2.mo803a(46, i, 1, C0887c.f2349h);
                    return 1;
                case C0327R.styleable.AppCompatTheme_selectableItemBackground /* 54 */:
                    interfaceC0555k2.mo800a(54, i, 2, this.f885b.m2227e(i + 1), C0887c.f2347f, 0);
                    return 2;
                case C0327R.styleable.AppCompatTheme_selectableItemBackgroundBorderless /* 55 */:
                    interfaceC0555k2.mo800a(54, i, 2, this.f885b.m2227e(i + 1), C0887c.f2348g, 0);
                    return 2;
                case C0327R.styleable.AppCompatTheme_borderlessButtonStyle /* 56 */:
                    interfaceC0555k2.mo800a(54, i, 2, this.f885b.m2227e(i + 1), C0887c.f2346e, 0);
                    return 2;
                case C0327R.styleable.AppCompatTheme_dividerVertical /* 57 */:
                    interfaceC0555k2.mo800a(54, i, 2, this.f885b.m2227e(i + 1), C0887c.f2345d, 0);
                    return 2;
                case C0327R.styleable.AppCompatTheme_dividerHorizontal /* 58 */:
                    interfaceC0555k2.mo800a(54, i, 2, this.f885b.m2227e(i + 1), C0887c.f2355n, 0);
                    return 2;
                case C0327R.styleable.AppCompatTheme_activityChooserViewStyle /* 59 */:
                case C0327R.styleable.AppCompatTheme_toolbarStyle /* 60 */:
                case C0327R.styleable.AppCompatTheme_toolbarNavigationButtonStyle /* 61 */:
                case C0327R.styleable.AppCompatTheme_popupMenuStyle /* 62 */:
                    interfaceC0555k2.mo800a(54, i, 1, iM2227e - 59, C0887c.f2347f, 0);
                    return 1;
                case 63:
                case 64:
                case C0327R.styleable.AppCompatTheme_editTextBackground /* 65 */:
                case C0327R.styleable.AppCompatTheme_imageButtonStyle /* 66 */:
                    interfaceC0555k2.mo800a(54, i, 1, iM2227e - 63, C0887c.f2348g, 0);
                    return 1;
                case C0327R.styleable.AppCompatTheme_textAppearanceSearchResultTitle /* 67 */:
                case C0327R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle /* 68 */:
                case C0327R.styleable.AppCompatTheme_textColorSearchUrl /* 69 */:
                case C0327R.styleable.AppCompatTheme_searchViewStyle /* 70 */:
                    interfaceC0555k2.mo800a(54, i, 1, iM2227e - 67, C0887c.f2346e, 0);
                    return 1;
                case C0327R.styleable.AppCompatTheme_listPreferredItemHeight /* 71 */:
                case C0327R.styleable.AppCompatTheme_listPreferredItemHeightSmall /* 72 */:
                case C0327R.styleable.AppCompatTheme_listPreferredItemHeightLarge /* 73 */:
                case C0327R.styleable.AppCompatTheme_listPreferredItemPaddingLeft /* 74 */:
                    interfaceC0555k2.mo800a(54, i, 1, iM2227e - 71, C0887c.f2345d, 0);
                    return 1;
                case C0327R.styleable.AppCompatTheme_listPreferredItemPaddingRight /* 75 */:
                case C0327R.styleable.AppCompatTheme_dropDownListViewStyle /* 76 */:
                case C0327R.styleable.AppCompatTheme_listPopupWindowStyle /* 77 */:
                case C0327R.styleable.AppCompatTheme_textAppearanceListItem /* 78 */:
                    interfaceC0555k2.mo800a(54, i, 1, iM2227e - 75, C0887c.f2355n, 0);
                    return 1;
                case C0327R.styleable.AppCompatTheme_textAppearanceListItemSecondary /* 79 */:
                    interfaceC0555k2.mo803a(79, i, 1, C0887c.f2347f);
                    return 1;
                case C0327R.styleable.AppCompatTheme_textAppearanceListItemSmall /* 80 */:
                    interfaceC0555k2.mo803a(79, i, 1, C0887c.f2348g);
                    return 1;
                case 81:
                    interfaceC0555k2.mo803a(79, i, 1, C0887c.f2346e);
                    return 1;
                case C0327R.styleable.AppCompatTheme_panelMenuListWidth /* 82 */:
                    interfaceC0555k2.mo803a(79, i, 1, C0887c.f2345d);
                    return 1;
                case C0327R.styleable.AppCompatTheme_panelMenuListTheme /* 83 */:
                    interfaceC0555k2.mo803a(79, i, 1, C0887c.f2355n);
                    return 1;
                case C0327R.styleable.AppCompatTheme_listChoiceBackgroundIndicator /* 84 */:
                    interfaceC0555k2.mo803a(79, i, 1, C0887c.f2343b);
                    return 1;
                case C0327R.styleable.AppCompatTheme_colorPrimary /* 85 */:
                    interfaceC0555k2.mo803a(79, i, 1, C0887c.f2344c);
                    return 1;
                case C0327R.styleable.AppCompatTheme_colorPrimaryDark /* 86 */:
                    interfaceC0555k2.mo803a(79, i, 1, C0887c.f2349h);
                    return 1;
                case C0327R.styleable.AppCompatTheme_colorAccent /* 87 */:
                case C0327R.styleable.AppCompatTheme_colorControlNormal /* 88 */:
                case C0327R.styleable.AppCompatTheme_colorControlActivated /* 89 */:
                case C0327R.styleable.AppCompatTheme_colorControlHighlight /* 90 */:
                case C0327R.styleable.AppCompatTheme_colorButtonNormal /* 91 */:
                case C0327R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 92 */:
                case C0327R.styleable.AppCompatTheme_controlBackground /* 93 */:
                case C0327R.styleable.AppCompatTheme_colorBackgroundFloating /* 94 */:
                case C0327R.styleable.AppCompatTheme_alertDialogStyle /* 95 */:
                    interfaceC0555k2.mo803a(iM2227e, i, 1, C0887c.f2350i);
                    return 1;
                case C0327R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 96 */:
                case C0327R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 100 */:
                case C0327R.styleable.AppCompatTheme_buttonStyle /* 104 */:
                case 108:
                case C0327R.styleable.AppCompatTheme_ratingBarStyleSmall /* 112 */:
                case C0327R.styleable.AppCompatTheme_listMenuViewStyle /* 116 */:
                case 120:
                case 122:
                case 124:
                case 126:
                case 128:
                case 130:
                    interfaceC0555k2.mo803a(iM2227e, i, 1, C0887c.f2347f);
                    return 1;
                case C0327R.styleable.AppCompatTheme_alertDialogCenterButtons /* 97 */:
                case C0327R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 101 */:
                case C0327R.styleable.AppCompatTheme_buttonStyleSmall /* 105 */:
                case 109:
                case C0327R.styleable.AppCompatTheme_seekBarStyle /* 113 */:
                case C0327R.styleable.AppCompatTheme_tooltipFrameBackground /* 117 */:
                case 121:
                case 123:
                case 125:
                case 127:
                case 129:
                case 131:
                    interfaceC0555k2.mo803a(iM2227e - 1, i, 1, C0887c.f2348g);
                    return 1;
                case C0327R.styleable.AppCompatTheme_alertDialogTheme /* 98 */:
                case C0327R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 102 */:
                case C0327R.styleable.AppCompatTheme_checkboxStyle /* 106 */:
                case C0327R.styleable.AppCompatTheme_ratingBarStyle /* 110 */:
                case C0327R.styleable.AppCompatTheme_spinnerStyle /* 114 */:
                case C0327R.styleable.AppCompatTheme_tooltipForegroundColor /* 118 */:
                    interfaceC0555k2.mo803a(iM2227e - 2, i, 1, C0887c.f2346e);
                    return 1;
                case C0327R.styleable.AppCompatTheme_textColorAlertDialogListItem /* 99 */:
                case C0327R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 103 */:
                case C0327R.styleable.AppCompatTheme_checkedTextViewStyle /* 107 */:
                case C0327R.styleable.AppCompatTheme_ratingBarStyleIndicator /* 111 */:
                case C0327R.styleable.AppCompatTheme_switchStyle /* 115 */:
                case C0327R.styleable.AppCompatTheme_colorError /* 119 */:
                    interfaceC0555k2.mo803a(iM2227e - 3, i, 1, C0887c.f2345d);
                    return 1;
                case 132:
                    interfaceC0555k2.mo800a(iM2227e, i, 3, this.f885b.m2227e(i + 1), C0887c.f2347f, this.f885b.m2220a(i + 2));
                    return 3;
                case 133:
                case 140:
                case 143:
                    interfaceC0555k2.mo803a(iM2227e, i, 1, C0887c.f2348g);
                    return 1;
                case 134:
                case 137:
                case 144:
                    interfaceC0555k2.mo803a(iM2227e, i, 1, C0887c.f2346e);
                    return 1;
                case 135:
                case 138:
                case 141:
                    interfaceC0555k2.mo803a(iM2227e, i, 1, C0887c.f2345d);
                    return 1;
                case 136:
                case 139:
                case 142:
                case 145:
                case 146:
                case 147:
                case 148:
                case 149:
                case 150:
                case 151:
                case 152:
                case 190:
                    interfaceC0555k2.mo803a(iM2227e, i, 1, C0887c.f2347f);
                    return 1;
                case 153:
                case 154:
                case 155:
                case 156:
                case 157:
                case 158:
                case 159:
                case 160:
                case 161:
                case 162:
                case 163:
                case 164:
                case 165:
                case 166:
                case 167:
                case 168:
                case 198:
                case 199:
                    interfaceC0555k2.mo799a(iM2227e, i, 3, this.f885b.m2223b(i + 1) + i);
                    return 3;
                case 169:
                    interfaceC0555k2.mo800a(iM2227e, i, 2, this.f885b.m2227e(i + 1), C0887c.f2352k, 0);
                    return 2;
                case 170:
                    int i3 = (i + 4) & (-4);
                    int iM2227e2 = 0;
                    for (int i4 = i + 1; i4 < i3; i4++) {
                        iM2227e2 = (iM2227e2 << 8) | this.f885b.m2227e(i4);
                    }
                    int iM2225c = i + this.f885b.m2225c(i3);
                    int iM2225c2 = this.f885b.m2225c(i3 + 4);
                    int iM2225c3 = this.f885b.m2225c(i3 + 8);
                    int i5 = (iM2225c3 - iM2225c2) + 1;
                    int i6 = i3 + 12;
                    if (iM2225c2 > iM2225c3) {
                        throw new C0541ah("low / high inversion");
                    }
                    C0544ak c0544ak = new C0544ak(i5);
                    for (int i7 = 0; i7 < i5; i7++) {
                        int iM2225c4 = this.f885b.m2225c(i6) + i;
                        i6 += 4;
                        c0544ak.m808a(iM2225c2 + i7, iM2225c4);
                    }
                    c0544ak.m812c(iM2225c);
                    c0544ak.m815f();
                    c0544ak.mo811b_();
                    int i8 = i6 - i;
                    interfaceC0555k2.mo801a(171, i, i8, c0544ak, iM2227e2);
                    return i8;
                case 171:
                    int i9 = (i + 4) & (-4);
                    int iM2227e3 = 0;
                    for (int i10 = i + 1; i10 < i9; i10++) {
                        iM2227e3 = (iM2227e3 << 8) | this.f885b.m2227e(i10);
                    }
                    int iM2225c5 = i + this.f885b.m2225c(i9);
                    int iM2225c6 = this.f885b.m2225c(i9 + 4);
                    int i11 = i9 + 8;
                    C0544ak c0544ak2 = new C0544ak(iM2225c6);
                    for (int i12 = 0; i12 < iM2225c6; i12++) {
                        int iM2225c7 = this.f885b.m2225c(i11);
                        int iM2225c8 = this.f885b.m2225c(i11 + 4) + i;
                        i11 += 8;
                        c0544ak2.m808a(iM2225c7, iM2225c8);
                    }
                    c0544ak2.m812c(iM2225c5);
                    c0544ak2.m815f();
                    c0544ak2.mo811b_();
                    int i13 = i11 - i;
                    interfaceC0555k2.mo801a(171, i, i13, c0544ak2, iM2227e3);
                    return i13;
                case 172:
                    interfaceC0555k2.mo803a(172, i, 1, C0887c.f2347f);
                    return 1;
                case 173:
                    interfaceC0555k2.mo803a(172, i, 1, C0887c.f2348g);
                    return 1;
                case 174:
                    interfaceC0555k2.mo803a(172, i, 1, C0887c.f2346e);
                    return 1;
                case 175:
                    interfaceC0555k2.mo803a(172, i, 1, C0887c.f2345d);
                    return 1;
                case 176:
                    interfaceC0555k2.mo803a(172, i, 1, C0887c.f2355n);
                    return 1;
                case 177:
                case 191:
                case 194:
                case 195:
                    interfaceC0555k2.mo803a(iM2227e, i, 1, C0887c.f2350i);
                    return 1;
                case 178:
                case 179:
                case 180:
                case 181:
                case 182:
                case 183:
                case 184:
                case 187:
                case 189:
                case 192:
                case 193:
                    interfaceC0555k2.mo802a(iM2227e, i, 3, this.f886c.mo1869a(this.f885b.m2228f(i + 1)), 0);
                    return 3;
                case 185:
                    interfaceC0555k2.mo802a(iM2227e, i, 5, this.f886c.mo1869a(this.f885b.m2228f(i + 1)), this.f885b.m2227e(i + 3) | (this.f885b.m2227e(i + 4) << 8));
                    return 5;
                case 186:
                    throw new C0596i("invokedynamic not supported");
                case 188:
                    int iM2227e4 = this.f885b.m2227e(i + 1);
                    switch (iM2227e4) {
                        case 4:
                            c0884z = C0884z.f2271b;
                            break;
                        case 5:
                            c0884z = C0884z.f2273d;
                            break;
                        case 6:
                            c0884z = C0884z.f2275f;
                            break;
                        case 7:
                            c0884z = C0884z.f2274e;
                            break;
                        case 8:
                            c0884z = C0884z.f2272c;
                            break;
                        case 9:
                            c0884z = C0884z.f2278i;
                            break;
                        case 10:
                            c0884z = C0884z.f2277h;
                            break;
                        case 11:
                            c0884z = C0884z.f2276g;
                            break;
                        default:
                            throw new C0541ah("bad newarray code " + C1067a.m2560x(iM2227e4));
                    }
                    int iMo796a = interfaceC0555k2.mo796a();
                    C0554j c0554j = new C0554j(this);
                    if (iMo796a >= 0) {
                        m839a(iMo796a, c0554j);
                        i2 = ((c0554j.f888a instanceof C0872n) && iMo796a + c0554j.f889b == i) ? c0554j.f890c : 0;
                    }
                    int i14 = 0;
                    int i15 = i + 2;
                    ArrayList arrayList = new ArrayList();
                    if (i2 != 0) {
                        int i16 = i15;
                        while (true) {
                            boolean z = false;
                            int i17 = i16 + 1;
                            if (this.f885b.m2227e(i16) == 89) {
                                m839a(i17, c0554j);
                                if (c0554j.f889b != 0 && (c0554j.f888a instanceof C0872n) && c0554j.f890c == i14) {
                                    int i18 = c0554j.f889b + i17;
                                    m839a(i18, c0554j);
                                    if (c0554j.f889b != 0 && (c0554j.f888a instanceof AbstractC0877s)) {
                                        int i19 = c0554j.f889b + i18;
                                        arrayList.add(c0554j.f888a);
                                        i16 = i19 + 1;
                                        int iM2227e5 = this.f885b.m2227e(i19);
                                        switch (iM2227e4) {
                                            case 4:
                                            case 8:
                                                if (iM2227e5 != 84) {
                                                    z = true;
                                                }
                                                break;
                                            case 5:
                                                if (iM2227e5 != 85) {
                                                    z = true;
                                                }
                                                break;
                                            case 6:
                                                if (iM2227e5 != 81) {
                                                    z = true;
                                                }
                                                break;
                                            case 7:
                                                if (iM2227e5 != 82) {
                                                    z = true;
                                                }
                                                break;
                                            case 9:
                                                if (iM2227e5 != 86) {
                                                    z = true;
                                                }
                                                break;
                                            case 10:
                                                if (iM2227e5 != 79) {
                                                    z = true;
                                                }
                                                break;
                                            case 11:
                                                if (iM2227e5 != 80) {
                                                    z = true;
                                                }
                                                break;
                                            default:
                                                z = true;
                                                break;
                                        }
                                        if (!z) {
                                            i14++;
                                            i15 = i16;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (i14 < 2 || i14 != i2) {
                        interfaceC0555k2.mo804a(i, 2, c0884z, (ArrayList) null);
                        return 2;
                    }
                    interfaceC0555k2.mo804a(i, i15 - i, c0884z, arrayList);
                    return i15 - i;
                case 196:
                    int iM2227e6 = this.f885b.m2227e(i + 1);
                    int iM2228f = this.f885b.m2228f(i + 2);
                    switch (iM2227e6) {
                        case 21:
                            interfaceC0555k2.mo800a(21, i, 4, iM2228f, C0887c.f2347f, 0);
                            return 4;
                        case 22:
                            interfaceC0555k2.mo800a(21, i, 4, iM2228f, C0887c.f2348g, 0);
                            return 4;
                        case 23:
                            interfaceC0555k2.mo800a(21, i, 4, iM2228f, C0887c.f2346e, 0);
                            return 4;
                        case 24:
                            interfaceC0555k2.mo800a(21, i, 4, iM2228f, C0887c.f2345d, 0);
                            return 4;
                        case 25:
                            interfaceC0555k2.mo800a(21, i, 4, iM2228f, C0887c.f2355n, 0);
                            return 4;
                        case C0327R.styleable.AppCompatTheme_selectableItemBackground /* 54 */:
                            interfaceC0555k2.mo800a(54, i, 4, iM2228f, C0887c.f2347f, 0);
                            return 4;
                        case C0327R.styleable.AppCompatTheme_selectableItemBackgroundBorderless /* 55 */:
                            interfaceC0555k2.mo800a(54, i, 4, iM2228f, C0887c.f2348g, 0);
                            return 4;
                        case C0327R.styleable.AppCompatTheme_borderlessButtonStyle /* 56 */:
                            interfaceC0555k2.mo800a(54, i, 4, iM2228f, C0887c.f2346e, 0);
                            return 4;
                        case C0327R.styleable.AppCompatTheme_dividerVertical /* 57 */:
                            interfaceC0555k2.mo800a(54, i, 4, iM2228f, C0887c.f2345d, 0);
                            return 4;
                        case C0327R.styleable.AppCompatTheme_dividerHorizontal /* 58 */:
                            interfaceC0555k2.mo800a(54, i, 4, iM2228f, C0887c.f2355n, 0);
                            return 4;
                        case 132:
                            interfaceC0555k2.mo800a(iM2227e6, i, 6, iM2228f, C0887c.f2347f, this.f885b.m2223b(i + 4));
                            return 6;
                        case 169:
                            interfaceC0555k2.mo800a(iM2227e6, i, 4, iM2228f, C0887c.f2352k, 0);
                            return 4;
                        default:
                            interfaceC0555k2.mo798a(196, i, 1);
                            return 1;
                    }
                case 197:
                    interfaceC0555k2.mo802a(iM2227e, i, 4, this.f886c.mo1869a(this.f885b.m2228f(i + 1)), this.f885b.m2227e(i + 3));
                    return 4;
                case 200:
                case 201:
                    interfaceC0555k2.mo799a(iM2227e == 200 ? 167 : 168, i, 5, this.f885b.m2225c(i + 1) + i);
                    return 5;
                default:
                    interfaceC0555k2.mo798a(iM2227e, i, 1);
                    return 1;
            }
        } catch (C0541ah e) {
            e.m573a("...at bytecode offset " + C1067a.m2556t(i));
            throw e;
        } catch (RuntimeException e2) {
            C0541ah c0541ah = new C0541ah(e2);
            c0541ah.m573a("...at bytecode offset " + C1067a.m2556t(i));
            throw c0541ah;
        }
    }

    /* JADX INFO: renamed from: a */
    public final C0955c m840a() {
        return this.f885b;
    }

    /* JADX INFO: renamed from: a */
    public final void m841a(InterfaceC0555k interfaceC0555k) {
        int iM2219a = this.f885b.m2219a();
        int iM839a = 0;
        while (iM839a < iM2219a) {
            iM839a += m839a(iM839a, interfaceC0555k);
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m842b() {
        return this.f885b.m2219a();
    }

    /* JADX INFO: renamed from: c */
    public final int m843c() {
        return this.f885b.m2219a() + 4;
    }
}
