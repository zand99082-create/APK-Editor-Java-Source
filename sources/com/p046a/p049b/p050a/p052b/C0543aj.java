package com.p046a.p049b.p050a.p052b;

import android.support.v7.appcompat.C0327R;
import com.gmail.heagoo.p084a.p089c.C1067a;
import com.p046a.p049b.p066f.p068b.C0843m;
import com.p046a.p049b.p066f.p069c.AbstractC0857a;
import com.p046a.p049b.p066f.p069c.C0870l;
import com.p046a.p049b.p066f.p069c.C0872n;
import com.p046a.p049b.p066f.p069c.C0873o;
import com.p046a.p049b.p066f.p069c.C0880v;
import com.p046a.p049b.p066f.p069c.C0884z;
import com.p046a.p049b.p066f.p070d.C0885a;
import com.p046a.p049b.p066f.p070d.C0887c;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.a.b.a.b.aj */
/* JADX INFO: loaded from: classes.dex */
final class C0543aj implements InterfaceC0555k {

    /* JADX INFO: renamed from: a */
    private final InterfaceC0565u f858a;

    /* JADX INFO: renamed from: b */
    private C0558n f859b = null;

    /* JADX INFO: renamed from: c */
    private int f860c;

    /* JADX INFO: renamed from: d */
    private /* synthetic */ C0542ai f861d;

    public C0543aj(C0542ai c0542ai) {
        this.f861d = c0542ai;
        this.f858a = c0542ai.f854a;
    }

    /* JADX INFO: renamed from: a */
    private void m795a(C0887c c0887c) {
        C0887c c0887cM1926a = this.f858a.mo730a().m1926a();
        if (!C1067a.m2510b(c0887cM1926a, c0887c)) {
            throw new C0541ah("return type mismatch: prototype indicates " + c0887cM1926a.mo919d() + ", but encountered type " + c0887c.mo919d());
        }
    }

    @Override // com.p046a.p049b.p050a.p052b.InterfaceC0555k
    /* JADX INFO: renamed from: a */
    public final int mo796a() {
        return this.f860c;
    }

    @Override // com.p046a.p049b.p050a.p052b.InterfaceC0555k
    /* JADX INFO: renamed from: a */
    public final void mo797a(int i) {
        this.f860c = i;
    }

    @Override // com.p046a.p049b.p050a.p052b.InterfaceC0555k
    /* JADX INFO: renamed from: a */
    public final void mo798a(int i, int i2, int i3) {
        throw new C0541ah("invalid opcode " + C1067a.m2560x(i));
    }

    @Override // com.p046a.p049b.p050a.p052b.InterfaceC0555k
    /* JADX INFO: renamed from: a */
    public final void mo799a(int i, int i2, int i3, int i4) {
        switch (i) {
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case 158:
                this.f858a.mo737a(this.f859b, C0887c.f2347f);
                break;
            case 159:
            case 160:
            case 161:
            case 162:
            case 163:
            case 164:
                this.f858a.mo738a(this.f859b, C0887c.f2347f, C0887c.f2347f);
                break;
            case 165:
            case 166:
                this.f858a.mo738a(this.f859b, C0887c.f2355n, C0887c.f2355n);
                break;
            case 167:
            case 168:
            case 200:
            case 201:
                this.f858a.mo746b();
                break;
            case 169:
            case 170:
            case 171:
            case 172:
            case 173:
            case 174:
            case 175:
            case 176:
            case 177:
            case 178:
            case 179:
            case 180:
            case 181:
            case 182:
            case 183:
            case 184:
            case 185:
            case 186:
            case 187:
            case 188:
            case 189:
            case 190:
            case 191:
            case 192:
            case 193:
            case 194:
            case 195:
            case 196:
            case 197:
            default:
                mo798a(i, i2, i3);
                return;
            case 198:
            case 199:
                this.f858a.mo737a(this.f859b, C0887c.f2355n);
                break;
        }
        this.f858a.mo747b(i4);
        this.f858a.mo777a(this.f859b, i2, i);
    }

    @Override // com.p046a.p049b.p050a.p052b.InterfaceC0555k
    /* JADX INFO: renamed from: a */
    public final void mo800a(int i, int i2, int i3, int i4, C0887c c0887c, int i5) {
        C0887c c0887c2;
        C0562r c0562rM897a = this.f861d.f856c.m897a(i == 54 ? i2 + i3 : i2, i4);
        if (c0562rM897a != null) {
            C0887c c0887cM904b = c0562rM897a.m904b();
            if (c0887cM904b.mo928e() != c0887c.mo928e()) {
                AbstractC0533a.m729a(c0887c, c0887cM904b);
                return;
            }
            c0887c2 = c0887cM904b;
        } else {
            c0887c2 = c0887c;
        }
        switch (i) {
            case 21:
            case 169:
                this.f858a.mo748b(this.f859b, i4);
                this.f858a.mo744a(c0562rM897a != null);
                this.f858a.mo741a(c0887c);
                break;
            case C0327R.styleable.AppCompatTheme_selectableItemBackground /* 54 */:
                C0843m c0843mM901a = c0562rM897a == null ? null : c0562rM897a.m901a();
                this.f858a.mo737a(this.f859b, c0887c);
                this.f858a.mo741a(c0887c);
                this.f858a.mo732a(i4, c0887c2, c0843mM901a);
                break;
            case 132:
                C0843m c0843mM901a2 = c0562rM897a != null ? c0562rM897a.m901a() : null;
                this.f858a.mo748b(this.f859b, i4);
                this.f858a.mo732a(i4, c0887c2, c0843mM901a2);
                this.f858a.mo741a(c0887c);
                this.f858a.mo731a(i5);
                this.f858a.mo740a(C0872n.m1891a(i5));
                break;
            default:
                mo798a(i, i2, i3);
                return;
        }
        this.f858a.mo777a(this.f859b, i2, i);
    }

    @Override // com.p046a.p049b.p050a.p052b.InterfaceC0555k
    /* JADX INFO: renamed from: a */
    public final void mo801a(int i, int i2, int i3, C0544ak c0544ak, int i4) {
        this.f858a.mo737a(this.f859b, C0887c.f2347f);
        this.f858a.mo731a(i4);
        this.f858a.mo733a(c0544ak);
        this.f858a.mo777a(this.f859b, i2, 171);
    }

    @Override // com.p046a.p049b.p050a.p052b.InterfaceC0555k
    /* JADX INFO: renamed from: a */
    public final void mo802a(int i, int i2, int i3, AbstractC0857a abstractC0857a, int i4) {
        AbstractC0857a abstractC0857aM1892j;
        switch (i) {
            case 179:
                this.f858a.mo737a(this.f859b, ((C0870l) abstractC0857a).mo925a());
                break;
            case 180:
            case 192:
            case 193:
                this.f858a.mo737a(this.f859b, C0887c.f2355n);
                break;
            case 181:
                this.f858a.mo738a(this.f859b, C0887c.f2355n, ((C0870l) abstractC0857a).mo925a());
                break;
            case 182:
            case 183:
                abstractC0857aM1892j = abstractC0857a;
                this.f858a.mo736a(this.f859b, ((C0880v) abstractC0857aM1892j).m1878a(false));
                abstractC0857a = abstractC0857aM1892j;
                break;
            case 184:
                this.f858a.mo736a(this.f859b, ((C0880v) abstractC0857a).m1878a(true));
                break;
            case 185:
                abstractC0857aM1892j = ((C0873o) abstractC0857a).m1892j();
                this.f858a.mo736a(this.f859b, ((C0880v) abstractC0857aM1892j).m1878a(false));
                abstractC0857a = abstractC0857aM1892j;
                break;
            case 186:
            case 187:
            case 188:
            case 190:
            case 191:
            case 194:
            case 195:
            case 196:
            default:
                this.f858a.mo746b();
                break;
            case 189:
                this.f858a.mo737a(this.f859b, C0887c.f2347f);
                break;
            case 197:
                this.f858a.mo736a(this.f859b, C0885a.m1919a(C0887c.f2350i, i4));
                break;
        }
        this.f858a.mo731a(i4);
        this.f858a.mo740a(abstractC0857a);
        this.f858a.mo777a(this.f859b, i2, i);
    }

    @Override // com.p046a.p049b.p050a.p052b.InterfaceC0555k
    /* JADX INFO: renamed from: a */
    public final void mo803a(int i, int i2, int i3, C0887c c0887c) {
        int i4;
        switch (i) {
            case 0:
                this.f858a.mo746b();
                break;
            case 46:
                C0887c c0887cM792a = C0542ai.m792a(c0887c, this.f859b.m884d().m869c(1));
                c0887c = c0887cM792a.m1959s();
                this.f858a.mo738a(this.f859b, c0887cM792a, C0887c.f2347f);
                break;
            case C0327R.styleable.AppCompatTheme_textAppearanceListItemSecondary /* 79 */:
                C0557m c0557mM884d = this.f859b.m884d();
                int i5 = c0887c.m1950j() ? 2 : 3;
                C0887c c0887cM869c = c0557mM884d.m869c(i5);
                boolean zM868b = c0557mM884d.m868b(i5);
                C0887c c0887cM792a2 = C0542ai.m792a(c0887c, c0887cM869c);
                if (zM868b) {
                    c0887c = c0887cM792a2.m1959s();
                }
                this.f858a.mo739a(this.f859b, c0887cM792a2, C0887c.f2347f, c0887c);
                break;
            case C0327R.styleable.AppCompatTheme_colorAccent /* 87 */:
                if (this.f859b.m884d().m869c(0).m1951k()) {
                    throw C0542ai.m790a();
                }
                this.f858a.mo735a(this.f859b, 1);
                break;
            case C0327R.styleable.AppCompatTheme_colorControlNormal /* 88 */:
            case C0327R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 92 */:
                C0557m c0557mM884d2 = this.f859b.m884d();
                if (c0557mM884d2.m869c(0).m1951k()) {
                    this.f858a.mo735a(this.f859b, 1);
                    i4 = 17;
                } else {
                    if (!c0557mM884d2.m869c(1).m1950j()) {
                        throw C0542ai.m790a();
                    }
                    this.f858a.mo735a(this.f859b, 2);
                    i4 = 8481;
                }
                if (i == 92) {
                    this.f858a.mo731a(i4);
                }
                break;
            case C0327R.styleable.AppCompatTheme_colorControlActivated /* 89 */:
                if (this.f859b.m884d().m869c(0).m1951k()) {
                    throw C0542ai.m790a();
                }
                this.f858a.mo735a(this.f859b, 1);
                this.f858a.mo731a(17);
                break;
            case C0327R.styleable.AppCompatTheme_colorControlHighlight /* 90 */:
                C0557m c0557mM884d3 = this.f859b.m884d();
                if (!c0557mM884d3.m869c(0).m1950j() || !c0557mM884d3.m869c(1).m1950j()) {
                    throw C0542ai.m790a();
                }
                this.f858a.mo735a(this.f859b, 2);
                this.f858a.mo731a(530);
                break;
                break;
            case C0327R.styleable.AppCompatTheme_colorButtonNormal /* 91 */:
                C0557m c0557mM884d4 = this.f859b.m884d();
                if (c0557mM884d4.m869c(0).m1951k()) {
                    throw C0542ai.m790a();
                }
                if (c0557mM884d4.m869c(1).m1951k()) {
                    this.f858a.mo735a(this.f859b, 2);
                    this.f858a.mo731a(530);
                } else {
                    if (!c0557mM884d4.m869c(2).m1950j()) {
                        throw C0542ai.m790a();
                    }
                    this.f858a.mo735a(this.f859b, 3);
                    this.f858a.mo731a(12819);
                }
                break;
                break;
            case C0327R.styleable.AppCompatTheme_controlBackground /* 93 */:
                C0557m c0557mM884d5 = this.f859b.m884d();
                if (!c0557mM884d5.m869c(0).m1951k()) {
                    if (c0557mM884d5.m869c(1).m1951k() || c0557mM884d5.m869c(2).m1951k()) {
                        throw C0542ai.m790a();
                    }
                    this.f858a.mo735a(this.f859b, 3);
                    this.f858a.mo731a(205106);
                } else {
                    if (c0557mM884d5.m869c(2).m1951k()) {
                        throw C0542ai.m790a();
                    }
                    this.f858a.mo735a(this.f859b, 2);
                    this.f858a.mo731a(530);
                }
                break;
            case C0327R.styleable.AppCompatTheme_colorBackgroundFloating /* 94 */:
                C0557m c0557mM884d6 = this.f859b.m884d();
                if (!c0557mM884d6.m869c(0).m1951k()) {
                    if (!c0557mM884d6.m869c(1).m1950j()) {
                        throw C0542ai.m790a();
                    }
                    if (c0557mM884d6.m869c(2).m1951k()) {
                        this.f858a.mo735a(this.f859b, 3);
                        this.f858a.mo731a(205106);
                    } else {
                        if (!c0557mM884d6.m869c(3).m1950j()) {
                            throw C0542ai.m790a();
                        }
                        this.f858a.mo735a(this.f859b, 4);
                        this.f858a.mo731a(4399427);
                    }
                } else if (c0557mM884d6.m869c(2).m1951k()) {
                    this.f858a.mo735a(this.f859b, 2);
                    this.f858a.mo731a(530);
                } else {
                    if (!c0557mM884d6.m869c(3).m1950j()) {
                        throw C0542ai.m790a();
                    }
                    this.f858a.mo735a(this.f859b, 3);
                    this.f858a.mo731a(12819);
                }
                break;
            case C0327R.styleable.AppCompatTheme_alertDialogStyle /* 95 */:
                C0557m c0557mM884d7 = this.f859b.m884d();
                if (!c0557mM884d7.m869c(0).m1950j() || !c0557mM884d7.m869c(1).m1950j()) {
                    throw C0542ai.m790a();
                }
                this.f858a.mo735a(this.f859b, 2);
                this.f858a.mo731a(18);
                break;
                break;
            case C0327R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 96 */:
            case C0327R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 100 */:
            case C0327R.styleable.AppCompatTheme_buttonStyle /* 104 */:
            case 108:
            case C0327R.styleable.AppCompatTheme_ratingBarStyleSmall /* 112 */:
            case 126:
            case 128:
            case 130:
                this.f858a.mo738a(this.f859b, c0887c, c0887c);
                break;
            case C0327R.styleable.AppCompatTheme_listMenuViewStyle /* 116 */:
                this.f858a.mo737a(this.f859b, c0887c);
                break;
            case 120:
            case 122:
            case 124:
                this.f858a.mo738a(this.f859b, c0887c, C0887c.f2347f);
                break;
            case 133:
            case 134:
            case 135:
            case 145:
            case 146:
            case 147:
                this.f858a.mo737a(this.f859b, C0887c.f2347f);
                break;
            case 136:
            case 137:
            case 138:
                this.f858a.mo737a(this.f859b, C0887c.f2348g);
                break;
            case 139:
            case 140:
            case 141:
                this.f858a.mo737a(this.f859b, C0887c.f2346e);
                break;
            case 142:
            case 143:
            case 144:
                this.f858a.mo737a(this.f859b, C0887c.f2345d);
                break;
            case 148:
                this.f858a.mo738a(this.f859b, C0887c.f2348g, C0887c.f2348g);
                break;
            case 149:
            case 150:
                this.f858a.mo738a(this.f859b, C0887c.f2346e, C0887c.f2346e);
                break;
            case 151:
            case 152:
                this.f858a.mo738a(this.f859b, C0887c.f2345d, C0887c.f2345d);
                break;
            case 172:
                C0887c c0887cM869c2 = c0887c == C0887c.f2355n ? this.f859b.m884d().m869c(0) : c0887c;
                this.f858a.mo737a(this.f859b, c0887c);
                m795a(c0887cM869c2);
                break;
            case 177:
                this.f858a.mo746b();
                m795a(C0887c.f2350i);
                break;
            case 190:
                C0887c c0887cM869c3 = this.f859b.m884d().m869c(0);
                if (!(c0887cM869c3.m1955o() || c0887cM869c3.equals(C0887c.f2351j))) {
                    throw new C0541ah("type mismatch: expected array type but encountered " + c0887cM869c3.mo919d());
                }
                this.f858a.mo737a(this.f859b, C0887c.f2355n);
                break;
                break;
            case 191:
            case 194:
            case 195:
                this.f858a.mo737a(this.f859b, C0887c.f2355n);
                break;
            default:
                mo798a(i, i2, i3);
                return;
        }
        this.f858a.mo741a(c0887c);
        this.f858a.mo777a(this.f859b, i2, i);
    }

    @Override // com.p046a.p049b.p050a.p052b.InterfaceC0555k
    /* JADX INFO: renamed from: a */
    public final void mo804a(int i, int i2, C0884z c0884z, ArrayList arrayList) {
        this.f858a.mo737a(this.f859b, C0887c.f2347f);
        this.f858a.mo743a(arrayList);
        this.f858a.mo740a(c0884z);
        this.f858a.mo777a(this.f859b, i, 188);
    }

    /* JADX INFO: renamed from: a */
    public final void m805a(C0558n c0558n) {
        if (c0558n == null) {
            throw new NullPointerException("frame == null");
        }
        this.f859b = c0558n;
    }
}
