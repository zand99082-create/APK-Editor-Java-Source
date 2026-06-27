package com.gmail.heagoo.neweditor;

import android.support.v7.appcompat.C0327R;
import com.gmail.heagoo.p084a.p089c.C1067a;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.gmail.heagoo.neweditor.af */
/* JADX INFO: loaded from: classes.dex */
public class C1587af {

    /* JADX INFO: renamed from: m */
    private static /* synthetic */ boolean f4756m;

    /* JADX INFO: renamed from: b */
    private C1613x f4758b;

    /* JADX INFO: renamed from: c */
    private InterfaceC1586ae f4759c;

    /* JADX INFO: renamed from: d */
    private C1615z f4760d;

    /* JADX INFO: renamed from: e */
    private C1588ag f4761e;

    /* JADX INFO: renamed from: f */
    private C1609t f4762f;

    /* JADX INFO: renamed from: h */
    private int f4764h;

    /* JADX INFO: renamed from: i */
    private int f4765i;

    /* JADX INFO: renamed from: j */
    private int f4766j;

    /* JADX INFO: renamed from: k */
    private int f4767k;

    /* JADX INFO: renamed from: l */
    private boolean f4768l;

    /* JADX INFO: renamed from: a */
    private final Map f4757a = new Hashtable(64);

    /* JADX INFO: renamed from: g */
    private final C1615z f4763g = new C1615z();

    static {
        f4756m = !C1587af.class.desiredAssertionStatus();
    }

    /* JADX INFO: renamed from: a */
    private byte m3871a(C1612w c1612w, C1612w c1612w2) {
        switch (c1612w.f4861f) {
            case -2:
                return c1612w2.f4865j;
            case -1:
                return this.f4761e.f4772c.m3954j();
            default:
                return c1612w.f4861f;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m3872a() {
        C1612w c1612w;
        if (this.f4761e.f4770a == null || (c1612w = this.f4761e.f4770a.f4771b) == null || (this.f4761e.f4770a.f4771b.f4856a & 1024) == 0) {
            return;
        }
        if (this.f4766j != this.f4764h) {
            this.f4759c.mo3870a(c1612w.f4865j, this.f4764h - this.f4760d.f4886c, this.f4766j - this.f4764h, this.f4761e);
        }
        this.f4764h = this.f4766j;
        this.f4761e = this.f4761e.f4770a;
        this.f4762f = this.f4761e.f4772c.m3950f();
        this.f4761e.m3883a(null);
    }

    /* JADX INFO: renamed from: a */
    private void m3873a(InterfaceC1586ae interfaceC1586ae, byte b2, int i, int i2, C1588ag c1588ag) {
        int i3 = i + i2;
        int i4 = i;
        while (i < i3) {
            if (Character.isWhitespace(this.f4760d.f4884a[this.f4760d.f4886c + i])) {
                if (i4 != i) {
                    interfaceC1586ae.mo3870a(b2, i4, i - i4, c1588ag);
                }
                interfaceC1586ae.mo3870a(b2, i, 1, c1588ag);
                i4 = i + 1;
            }
            i++;
        }
        if (i4 != i3) {
            interfaceC1586ae.mo3870a(b2, i4, i3 - i4, c1588ag);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m3874a(boolean z) {
        byte bM3917a;
        int i = this.f4766j - this.f4764h;
        if (i == 0) {
            return;
        }
        if (this.f4761e.f4772c.m3951g()) {
            boolean z2 = false;
            boolean zMatches = false;
            for (int i2 = this.f4764h; i2 < this.f4766j; i2++) {
                if (Character.isDigit(this.f4760d.f4884a[i2])) {
                    zMatches = true;
                } else {
                    z2 = true;
                }
            }
            if (z2) {
                Pattern patternM3952h = this.f4761e.f4772c.m3952h();
                if (zMatches) {
                    if (patternM3952h == null) {
                        zMatches = false;
                    } else {
                        int i3 = this.f4760d.f4885b;
                        int i4 = this.f4760d.f4886c;
                        this.f4760d.f4886c = this.f4764h;
                        this.f4760d.f4885b = i;
                        zMatches = patternM3952h.matcher(new C1582aa(this.f4760d)).matches();
                        this.f4760d.f4886c = i4;
                        this.f4760d.f4885b = i3;
                    }
                }
            }
            if (zMatches) {
                this.f4759c.mo3870a((byte) 5, this.f4764h - this.f4760d.f4886c, i, this.f4761e);
                this.f4764h = this.f4766j;
                return;
            }
        }
        if (this.f4762f == null || (bM3917a = this.f4762f.m3917a(this.f4760d, this.f4764h, i)) == 0) {
            if (z) {
                this.f4759c.mo3870a(this.f4761e.f4772c.m3954j(), this.f4764h - this.f4760d.f4886c, i, this.f4761e);
                this.f4764h = this.f4766j;
            }
        } else {
            this.f4759c.mo3870a(bM3917a, this.f4764h - this.f4760d.f4886c, i, this.f4761e);
            this.f4764h = this.f4766j;
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m3875a(int i, int i2) {
        if ((i2 & 2) == 2) {
            if (i != this.f4760d.f4886c) {
                return false;
            }
        } else if ((i2 & 4) == 4) {
            if (i != this.f4767k) {
                return false;
            }
        } else if ((i2 & 8) == 8 && i != this.f4764h) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    private boolean m3876a(C1612w c1612w) {
        int iEnd;
        Matcher matcher;
        C1582aa c1582aa;
        boolean z;
        char[] cArrM3877a = null;
        if (c1612w.f4867l == null) {
            if (c1612w.f4866k != null && this.f4766j + c1612w.f4866k.length < this.f4760d.f4884a.length) {
                int i = 0;
                while (true) {
                    if (i >= c1612w.f4866k.length) {
                        z = true;
                        break;
                    }
                    if (Character.toUpperCase(this.f4760d.f4884a[this.f4766j + i]) != c1612w.f4866k[i]) {
                        z = false;
                        break;
                    }
                    i++;
                }
                if (!z) {
                    return false;
                }
            }
        } else if (-1 == Arrays.binarySearch(c1612w.f4867l, Character.toUpperCase(this.f4760d.f4884a[this.f4766j]))) {
            return false;
        }
        if (!m3875a((c1612w.f4856a & 4) != 0 ? this.f4764h : this.f4766j, c1612w.f4863h)) {
            return false;
        }
        if ((c1612w.f4856a & 8192) == 0) {
            this.f4763g.f4884a = c1612w.f4862g;
            this.f4763g.f4886c = 0;
            this.f4763g.f4885b = this.f4763g.f4884a.length;
            iEnd = this.f4763g.f4885b;
            if (!C1067a.m2488a(this.f4761e.f4772c.m3949e(), this.f4760d, this.f4766j, this.f4763g.f4884a)) {
                return false;
            }
            matcher = null;
            c1582aa = null;
        } else {
            C1582aa c1582aa2 = new C1582aa(this.f4760d, this.f4766j - this.f4760d.f4886c, this.f4760d.f4885b - (this.f4766j - this.f4760d.f4886c));
            Matcher matcher2 = c1612w.f4864i.matcher(c1582aa2);
            if (!matcher2.lookingAt()) {
                return false;
            }
            if (matcher2.start() != 0) {
                throw new InternalError("Can't happen");
            }
            iEnd = matcher2.end();
            if (iEnd == 0) {
                matcher = matcher2;
                c1582aa = c1582aa2;
                iEnd = 1;
            } else {
                matcher = matcher2;
                c1582aa = c1582aa2;
            }
        }
        if ((c1612w.f4856a & 2048) == 2048) {
            this.f4766j += this.f4763g.f4885b;
        } else {
            if (this.f4761e.f4771b != null) {
                m3878b(this.f4761e.f4771b);
            }
            m3874a((c1612w.f4856a & 4) != 4);
            switch (c1612w.f4856a & 255) {
                case 0:
                    this.f4761e.f4773d = null;
                    if ((c1612w.f4856a & 8192) != 0) {
                        m3873a(this.f4759c, c1612w.f4865j, this.f4766j - this.f4760d.f4886c, iEnd, this.f4761e);
                    } else {
                        this.f4759c.mo3870a(c1612w.f4865j, this.f4766j - this.f4760d.f4886c, iEnd, this.f4761e);
                    }
                    if (c1612w.f4857b != null) {
                        this.f4761e = new C1588ag(c1612w.f4857b, this.f4761e.f4770a);
                        this.f4762f = this.f4761e.f4772c.m3950f();
                    }
                    break;
                case 2:
                case 16:
                    this.f4761e.m3883a(c1612w);
                    byte bM3871a = m3871a(c1612w, this.f4761e.f4771b);
                    if ((c1612w.f4856a & 8192) != 0) {
                        m3873a(this.f4759c, bM3871a, this.f4766j - this.f4760d.f4886c, iEnd, this.f4761e);
                    } else {
                        this.f4759c.mo3870a(bM3871a, this.f4766j - this.f4760d.f4886c, iEnd, this.f4761e);
                    }
                    if (c1582aa != null && c1612w.f4858c != null) {
                        cArrM3877a = m3877a(matcher, c1612w.f4858c);
                    }
                    this.f4761e.f4773d = cArrM3877a;
                    this.f4761e = new C1588ag(c1612w.f4857b, this.f4761e);
                    this.f4762f = this.f4761e.f4772c.m3950f();
                    break;
                case 4:
                    this.f4761e.f4773d = null;
                    if (this.f4766j != this.f4764h) {
                        this.f4759c.mo3870a(c1612w.f4865j, this.f4764h - this.f4760d.f4886c, this.f4766j - this.f4764h, this.f4761e);
                    }
                    this.f4759c.mo3870a(m3871a(c1612w, c1612w), this.f4766j - this.f4760d.f4886c, this.f4763g.f4885b, this.f4761e);
                    break;
                case 8:
                    this.f4759c.mo3870a(m3871a(c1612w, c1612w), this.f4766j - this.f4760d.f4886c, this.f4763g.f4885b, this.f4761e);
                    this.f4761e.f4773d = null;
                    this.f4761e.m3883a(c1612w);
                    break;
                default:
                    throw new InternalError("Unhandled major action");
            }
            this.f4766j += iEnd - 1;
            this.f4764h = this.f4766j + 1;
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    private static char[] m3877a(Matcher matcher, char[] cArr) {
        char cCharAt;
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < cArr.length) {
            char c = cArr[i];
            if (c != '$' && c != '~') {
                sb.append(c);
            } else if (i == cArr.length - 1) {
                sb.append(c);
            } else {
                char c2 = cArr[i + 1];
                if (Character.isDigit(c2)) {
                    if (c == '$') {
                        sb.append(matcher.group(c2 - '0'));
                    } else {
                        String strGroup = matcher.group(c2 - '0');
                        if (strGroup.length() == 1) {
                            switch (strGroup.charAt(0)) {
                                case '(':
                                    cCharAt = ')';
                                    break;
                                case ')':
                                    cCharAt = '(';
                                    break;
                                case C0327R.styleable.AppCompatTheme_toolbarStyle /* 60 */:
                                    cCharAt = '>';
                                    break;
                                case C0327R.styleable.AppCompatTheme_popupMenuStyle /* 62 */:
                                    cCharAt = '<';
                                    break;
                                case C0327R.styleable.AppCompatTheme_colorButtonNormal /* 91 */:
                                    cCharAt = ']';
                                    break;
                                case C0327R.styleable.AppCompatTheme_controlBackground /* 93 */:
                                    cCharAt = '[';
                                    break;
                                case '{':
                                    cCharAt = '}';
                                    break;
                                case '}':
                                    cCharAt = '{';
                                    break;
                                default:
                                    cCharAt = 0;
                                    break;
                            }
                            if (cCharAt == 0) {
                                cCharAt = strGroup.charAt(0);
                            }
                            sb.append(cCharAt);
                        } else {
                            sb.append(c);
                        }
                    }
                    i++;
                } else {
                    sb.append(c);
                }
            }
            i++;
        }
        char[] cArr2 = new char[sb.length()];
        sb.getChars(0, sb.length(), cArr2, 0);
        return cArr2;
    }

    /* JADX INFO: renamed from: b */
    private boolean m3878b(C1612w c1612w) {
        if (!m3875a((c1612w.f4856a & 4) != 0 ? this.f4764h : this.f4766j, c1612w.f4859d)) {
            return false;
        }
        if ((c1612w.f4856a & 8) == 0) {
            if (this.f4761e.f4773d != null) {
                this.f4763g.f4884a = this.f4761e.f4773d;
            } else {
                this.f4763g.f4884a = c1612w.f4858c;
            }
            this.f4763g.f4886c = 0;
            this.f4763g.f4885b = this.f4763g.f4884a.length;
            if (!C1067a.m2488a(this.f4761e.f4772c.m3949e(), this.f4760d, this.f4766j, this.f4763g.f4884a)) {
                return false;
            }
        }
        if (!f4756m && (c1612w.f4856a & 2048) != 0) {
            throw new AssertionError();
        }
        if ((this.f4761e.f4771b.f4856a & 8) != 0) {
            if (this.f4766j != this.f4764h) {
                this.f4759c.mo3870a(this.f4761e.f4771b.f4865j, this.f4764h - this.f4760d.f4886c, this.f4766j - this.f4764h, this.f4761e);
            }
            this.f4764h = this.f4766j;
            this.f4761e.m3883a(null);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x012a A[Catch: all -> 0x0179, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x001b, B:7:0x002d, B:8:0x004b, B:11:0x0053, B:14:0x005c, B:15:0x007c, B:17:0x0082, B:38:0x0155, B:19:0x008c, B:21:0x0092, B:23:0x009a, B:25:0x00a4, B:27:0x00c8, B:29:0x00ce, B:30:0x00d5, B:37:0x0152, B:32:0x012a, B:33:0x0140, B:35:0x0146, B:45:0x017e, B:47:0x0188, B:49:0x018c, B:50:0x0192, B:52:0x0198, B:53:0x019f, B:55:0x01ac, B:56:0x01c3, B:57:0x01de, B:59:0x01e2, B:61:0x01ec, B:63:0x01fe, B:65:0x0209, B:67:0x020f, B:68:0x0216, B:69:0x0238, B:71:0x0242, B:72:0x0249, B:73:0x0250, B:75:0x0256, B:77:0x025e, B:80:0x0268, B:81:0x027f, B:39:0x015e), top: B:85:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x017c  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized C1588ag m3879a(C1588ag c1588ag, InterfaceC1586ae interfaceC1586ae, C1615z c1615z) {
        C1612w c1612w;
        boolean z;
        boolean z2;
        this.f4759c = interfaceC1586ae;
        this.f4760d = c1615z;
        this.f4764h = c1615z.f4886c;
        this.f4765i = c1615z.f4885b + c1615z.f4886c;
        this.f4761e = new C1588ag();
        if (c1588ag == null) {
            this.f4761e.f4772c = this.f4758b;
            this.f4761e.f4774e = this.f4761e.f4772c.m3953i();
        } else {
            this.f4761e.f4770a = c1588ag.f4770a;
            this.f4761e.m3883a(c1588ag.f4771b);
            this.f4761e.f4772c = c1588ag.f4772c;
            this.f4761e.f4773d = c1588ag.f4773d;
        }
        this.f4762f = this.f4761e.f4772c.m3950f();
        this.f4768l = false;
        this.f4767k = c1615z.f4886c;
        int iM3948d = this.f4761e.f4772c.m3948d();
        this.f4766j = c1615z.f4886c;
        boolean z3 = false;
        while (this.f4766j < this.f4765i) {
            if (iM3948d < 0 || this.f4766j - c1615z.f4886c < iM3948d || z3) {
                z = z3;
            } else {
                this.f4761e = new C1588ag(C1613x.m3932a(this.f4761e.f4772c.m3954j()), this.f4761e);
                this.f4762f = this.f4761e.f4772c.m3950f();
                z = true;
            }
            if (this.f4761e.f4774e == null || !m3876a(this.f4761e.f4774e)) {
                if (this.f4761e.f4770a == null || this.f4761e.f4770a.f4771b == null) {
                    Character chValueOf = Character.valueOf(c1615z.f4884a[this.f4766j]);
                    Iterator it = this.f4761e.f4772c.m3934a(chValueOf).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (m3876a((C1612w) it.next())) {
                                break;
                            }
                        } else if (Character.isWhitespace(chValueOf.charValue())) {
                            if (!this.f4768l) {
                                this.f4767k = this.f4766j + 1;
                            }
                            if (this.f4761e.f4771b != null) {
                                m3878b(this.f4761e.f4771b);
                            }
                            m3872a();
                            m3874a(false);
                            if (this.f4764h != this.f4766j) {
                                interfaceC1586ae.mo3870a(this.f4761e.f4772c.m3954j(), this.f4764h - c1615z.f4886c, this.f4766j - this.f4764h, this.f4761e);
                            }
                            interfaceC1586ae.mo3870a(this.f4761e.f4772c.m3954j(), this.f4766j - c1615z.f4886c, 1, this.f4761e);
                            this.f4764h = this.f4766j + 1;
                        } else if (this.f4762f != null || this.f4761e.f4772c.m3947c() != 0) {
                            String strM3955k = this.f4761e.f4772c.m3955k();
                            if (!Character.isLetterOrDigit(chValueOf.charValue()) && strM3955k.indexOf(chValueOf.charValue()) == -1) {
                                if (this.f4761e.f4771b != null) {
                                    m3878b(this.f4761e.f4771b);
                                }
                                m3872a();
                                m3874a(true);
                                interfaceC1586ae.mo3870a(this.f4761e.f4772c.m3954j(), this.f4764h - c1615z.f4886c, 1, this.f4761e);
                                this.f4764h = this.f4766j + 1;
                            }
                        }
                    }
                    this.f4768l = true;
                } else {
                    C1612w c1612w2 = this.f4761e.f4770a.f4771b;
                    if (c1612w2.f4858c != null) {
                        C1588ag c1588ag2 = this.f4761e;
                        this.f4761e = this.f4761e.f4770a;
                        this.f4762f = this.f4761e.f4772c.m3950f();
                        boolean zM3878b = m3878b(c1612w2);
                        this.f4761e = c1588ag2;
                        this.f4762f = this.f4761e.f4772c.m3950f();
                        if (zM3878b) {
                            if (this.f4761e.f4771b != null) {
                                m3878b(this.f4761e.f4771b);
                            }
                            m3874a(true);
                            this.f4761e = (C1588ag) this.f4761e.f4770a.clone();
                            this.f4759c.mo3870a(m3871a(this.f4761e.f4771b, this.f4761e.f4771b), this.f4766j - this.f4760d.f4886c, this.f4763g.f4885b, this.f4761e);
                            this.f4762f = this.f4761e.f4772c.m3950f();
                            this.f4761e.m3883a(null);
                            this.f4764h = this.f4766j + this.f4763g.f4885b;
                            this.f4766j += this.f4763g.f4885b - 1;
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            this.f4768l = true;
                        }
                    }
                }
            }
            this.f4766j++;
            z3 = z;
        }
        this.f4766j = this.f4765i;
        if (this.f4761e.f4771b != null) {
            m3878b(this.f4761e.f4771b);
        }
        m3872a();
        m3874a(true);
        while (this.f4761e.f4770a != null && (((c1612w = this.f4761e.f4770a.f4771b) != null && (c1612w.f4856a & 512) == 512) || z3)) {
            this.f4761e = this.f4761e.f4770a;
            this.f4762f = this.f4761e.f4772c.m3950f();
            this.f4761e.m3883a(null);
        }
        interfaceC1586ae.mo3870a(Token.END, this.f4766j - c1615z.f4886c, 0, this.f4761e);
        this.f4761e = this.f4761e.m3882a();
        this.f4759c = null;
        this.f4760d = null;
        return this.f4761e;
    }

    /* JADX INFO: renamed from: a */
    public final C1613x m3880a(String str) {
        return (C1613x) this.f4757a.get(str);
    }

    /* JADX INFO: renamed from: a */
    public final void m3881a(C1613x c1613x) {
        this.f4757a.put(c1613x.m3943b(), c1613x);
        if (c1613x.m3943b().equals("MAIN")) {
            this.f4758b = c1613x;
        }
    }
}
