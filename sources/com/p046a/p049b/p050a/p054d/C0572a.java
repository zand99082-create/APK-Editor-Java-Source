package com.p046a.p049b.p050a.p054d;

import android.support.v7.appcompat.C0327R;
import com.gmail.heagoo.p084a.p089c.C1067a;
import com.p046a.p049b.p050a.p055e.C0596i;
import com.p046a.p049b.p050a.p055e.InterfaceC0597j;
import com.p046a.p049b.p066f.p067a.C0822a;
import com.p046a.p049b.p066f.p067a.C0824c;
import com.p046a.p049b.p066f.p067a.C0825d;
import com.p046a.p049b.p066f.p067a.C0826e;
import com.p046a.p049b.p066f.p067a.EnumC0823b;
import com.p046a.p049b.p066f.p069c.AbstractC0857a;
import com.p046a.p049b.p066f.p069c.C0861c;
import com.p046a.p049b.p066f.p069c.C0862d;
import com.p046a.p049b.p066f.p069c.C0863e;
import com.p046a.p049b.p066f.p069c.C0865g;
import com.p046a.p049b.p066f.p069c.C0866h;
import com.p046a.p049b.p066f.p069c.C0867i;
import com.p046a.p049b.p066f.p069c.C0868j;
import com.p046a.p049b.p066f.p069c.C0869k;
import com.p046a.p049b.p066f.p069c.C0871m;
import com.p046a.p049b.p066f.p069c.C0872n;
import com.p046a.p049b.p066f.p069c.C0878t;
import com.p046a.p049b.p066f.p069c.C0881w;
import com.p046a.p049b.p066f.p069c.C0882x;
import com.p046a.p049b.p066f.p069c.C0883y;
import com.p046a.p049b.p066f.p069c.C0884z;
import com.p046a.p049b.p066f.p069c.InterfaceC0860b;
import com.p046a.p049b.p066f.p070d.C0887c;
import com.p046a.p049b.p073h.C0955c;
import com.p046a.p049b.p073h.C0956d;
import java.io.IOException;

/* JADX INFO: renamed from: com.a.b.a.d.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0572a {

    /* JADX INFO: renamed from: a */
    private final InterfaceC0860b f939a;

    /* JADX INFO: renamed from: b */
    private final C0955c f940b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC0597j f941c;

    /* JADX INFO: renamed from: d */
    private final C0956d f942d;

    /* JADX INFO: renamed from: e */
    private int f943e;

    public C0572a(C0582k c0582k, int i, int i2, InterfaceC0597j interfaceC0597j) {
        if (c0582k == null) {
            throw new NullPointerException("cf == null");
        }
        this.f939a = c0582k.m1012g();
        this.f941c = interfaceC0597j;
        this.f940b = c0582k.m1007b().m2221a(i, i + i2);
        this.f942d = this.f940b.m2224b();
        this.f943e = 0;
    }

    /* JADX INFO: renamed from: a */
    private void m973a(int i) {
        if (this.f942d.available() < i) {
            throw new C0596i("truncated annotation attribute");
        }
    }

    /* JADX INFO: renamed from: a */
    private void m974a(int i, String str) {
        this.f943e += i;
    }

    /* JADX INFO: renamed from: b */
    private AbstractC0857a m975b() {
        int unsignedByte = this.f942d.readUnsignedByte();
        if (this.f941c != null) {
            m974a(1, "tag: " + new C0883y(Character.toString((char) unsignedByte)).m1910i());
        }
        switch (unsignedByte) {
            case 64:
                return new C0861c(m978d(EnumC0823b.EMBEDDED));
            case C0327R.styleable.AppCompatTheme_imageButtonStyle /* 66 */:
                return C0866h.m1884a(((C0872n) m977c()).mo1894j());
            case C0327R.styleable.AppCompatTheme_textAppearanceSearchResultTitle /* 67 */:
                C0872n c0872n = (C0872n) m977c();
                c0872n.mo1894j();
                return C0867i.m1886a(c0872n.mo1894j());
            case C0327R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle /* 68 */:
                return (C0868j) m977c();
            case C0327R.styleable.AppCompatTheme_searchViewStyle /* 70 */:
                return (C0871m) m977c();
            case C0327R.styleable.AppCompatTheme_listPreferredItemHeightLarge /* 73 */:
                return (C0872n) m977c();
            case C0327R.styleable.AppCompatTheme_listPreferredItemPaddingLeft /* 74 */:
                return (C0878t) m977c();
            case C0327R.styleable.AppCompatTheme_panelMenuListTheme /* 83 */:
                return C0882x.m1905a(((C0872n) m977c()).mo1894j());
            case C0327R.styleable.AppCompatTheme_colorControlHighlight /* 90 */:
                return C0865g.m1881a(((C0872n) m977c()).mo1894j());
            case C0327R.styleable.AppCompatTheme_colorButtonNormal /* 91 */:
                m973a(2);
                int unsignedShort = this.f942d.readUnsignedShort();
                C0863e c0863e = new C0863e(unsignedShort);
                if (this.f941c != null) {
                    m974a(2, "num_values: " + unsignedShort);
                }
                for (int i = 0; i < unsignedShort; i++) {
                    if (this.f941c != null) {
                        m974a(0, "element_value[" + i + "]:");
                    }
                    c0863e.m1877a(i, m975b());
                }
                c0863e.mo811b_();
                return new C0862d(c0863e);
            case C0327R.styleable.AppCompatTheme_textColorAlertDialogListItem /* 99 */:
                C0887c c0887cM1943b = C0887c.m1943b(((C0883y) this.f939a.mo1869a(this.f942d.readUnsignedShort())).m1911j());
                if (this.f941c != null) {
                    m974a(2, "class_info: " + c0887cM1943b.mo919d());
                }
                return new C0884z(c0887cM1943b);
            case C0327R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 101 */:
                m973a(4);
                int unsignedShort2 = this.f942d.readUnsignedShort();
                int unsignedShort3 = this.f942d.readUnsignedShort();
                C0883y c0883y = (C0883y) this.f939a.mo1869a(unsignedShort2);
                C0883y c0883y2 = (C0883y) this.f939a.mo1869a(unsignedShort3);
                if (this.f941c != null) {
                    m974a(2, "type_name: " + c0883y.mo919d());
                    m974a(2, "const_name: " + c0883y2.mo919d());
                }
                return new C0869k(new C0881w(c0883y2, c0883y));
            case C0327R.styleable.AppCompatTheme_switchStyle /* 115 */:
                return m977c();
            default:
                throw new C0596i("unknown annotation tag: " + C1067a.m2560x(unsignedByte));
        }
    }

    /* JADX INFO: renamed from: c */
    private C0824c m976c(EnumC0823b enumC0823b) {
        int unsignedShort = this.f942d.readUnsignedShort();
        if (this.f941c != null) {
            m974a(2, "num_annotations: " + C1067a.m2558v(unsignedShort));
        }
        C0824c c0824c = new C0824c();
        for (int i = 0; i < unsignedShort; i++) {
            if (this.f941c != null) {
                m974a(0, "annotations[" + i + "]:");
            }
            c0824c.m1710a(m978d(enumC0823b));
        }
        c0824c.mo811b_();
        return c0824c;
    }

    /* JADX INFO: renamed from: c */
    private AbstractC0857a m977c() {
        AbstractC0857a abstractC0857aMo1869a = this.f939a.mo1869a(this.f942d.readUnsignedShort());
        if (this.f941c != null) {
            m974a(2, "constant_value: " + (abstractC0857aMo1869a instanceof C0883y ? ((C0883y) abstractC0857aMo1869a).m1910i() : abstractC0857aMo1869a.mo919d()));
        }
        return abstractC0857aMo1869a;
    }

    /* JADX INFO: renamed from: d */
    private C0822a m978d(EnumC0823b enumC0823b) {
        m973a(4);
        int unsignedShort = this.f942d.readUnsignedShort();
        int unsignedShort2 = this.f942d.readUnsignedShort();
        C0884z c0884z = new C0884z(C0887c.m1941a(((C0883y) this.f939a.mo1869a(unsignedShort)).m1911j()));
        if (this.f941c != null) {
            m974a(2, "type: " + c0884z.mo919d());
            m974a(2, "num_elements: " + unsignedShort2);
        }
        C0822a c0822a = new C0822a(c0884z, enumC0823b);
        for (int i = 0; i < unsignedShort2; i++) {
            if (this.f941c != null) {
                m974a(0, "elements[" + i + "]:");
            }
            m973a(5);
            C0883y c0883y = (C0883y) this.f939a.mo1869a(this.f942d.readUnsignedShort());
            if (this.f941c != null) {
                m974a(2, "element_name: " + c0883y.mo919d());
                m974a(0, "value: ");
            }
            c0822a.m1702b(new C0826e(c0883y, m975b()));
        }
        c0822a.mo811b_();
        return c0822a;
    }

    /* JADX INFO: renamed from: a */
    public final C0825d m979a(EnumC0823b enumC0823b) {
        try {
            int unsignedByte = this.f942d.readUnsignedByte();
            if (this.f941c != null) {
                m974a(1, "num_parameters: " + C1067a.m2560x(unsignedByte));
            }
            C0825d c0825d = new C0825d(unsignedByte);
            for (int i = 0; i < unsignedByte; i++) {
                if (this.f941c != null) {
                    m974a(0, "parameter_annotations[" + i + "]:");
                }
                c0825d.m1715a(i, m976c(enumC0823b));
            }
            c0825d.mo811b_();
            if (this.f942d.available() != 0) {
                throw new C0596i("extra data in attribute");
            }
            return c0825d;
        } catch (IOException e) {
            throw new RuntimeException("shouldn't happen", e);
        }
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC0857a m980a() {
        try {
            AbstractC0857a abstractC0857aM975b = m975b();
            if (this.f942d.available() != 0) {
                throw new C0596i("extra data in attribute");
            }
            return abstractC0857aM975b;
        } catch (IOException e) {
            throw new RuntimeException("shouldn't happen", e);
        }
    }

    /* JADX INFO: renamed from: b */
    public final C0824c m981b(EnumC0823b enumC0823b) {
        try {
            C0824c c0824cM976c = m976c(enumC0823b);
            if (this.f942d.available() != 0) {
                throw new C0596i("extra data in attribute");
            }
            return c0824cM976c;
        } catch (IOException e) {
            throw new RuntimeException("shouldn't happen", e);
        }
    }
}
