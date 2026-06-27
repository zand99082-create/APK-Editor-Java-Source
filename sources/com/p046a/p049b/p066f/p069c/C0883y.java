package com.p046a.p049b.p066f.p069c;

import com.gmail.heagoo.p084a.p089c.C1067a;
import com.p046a.p049b.p066f.p070d.C0887c;
import com.p046a.p049b.p073h.C0955c;

/* JADX INFO: renamed from: com.a.b.f.c.y */
/* JADX INFO: loaded from: classes.dex */
public final class C0883y extends AbstractC0859ab {

    /* JADX INFO: renamed from: a */
    private final String f2268a;

    /* JADX INFO: renamed from: b */
    private final C0955c f2269b;

    static {
        new C0883y("");
    }

    public C0883y(C0955c c0955c) {
        if (c0955c == null) {
            throw new NullPointerException("bytes == null");
        }
        this.f2269b = c0955c;
        this.f2268a = m1908a(c0955c).intern();
    }

    public C0883y(String str) {
        if (str == null) {
            throw new NullPointerException("string == null");
        }
        this.f2268a = str.intern();
        this.f2269b = new C0955c(m1909a(str));
    }

    /* JADX INFO: renamed from: a */
    private static String m1907a(int i, int i2) {
        throw new IllegalArgumentException("bad utf-8 byte " + C1067a.m2560x(i) + " at offset " + C1067a.m2556t(i2));
    }

    /* JADX INFO: renamed from: a */
    private static String m1908a(C0955c c0955c) {
        int i;
        char c;
        int iM2219a = c0955c.m2219a();
        char[] cArr = new char[iM2219a];
        int i2 = 0;
        int i3 = 0;
        while (iM2219a > 0) {
            int iM2227e = c0955c.m2227e(i2);
            switch (iM2227e >> 4) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    iM2219a--;
                    if (iM2227e == 0) {
                        return m1907a(iM2227e, i2);
                    }
                    c = (char) iM2227e;
                    i2++;
                    break;
                case 8:
                case 9:
                case 10:
                case 11:
                default:
                    return m1907a(iM2227e, i2);
                case 12:
                case 13:
                    iM2219a -= 2;
                    if (iM2219a < 0) {
                        return m1907a(iM2227e, i2);
                    }
                    int iM2227e2 = c0955c.m2227e(i2 + 1);
                    if ((iM2227e2 & 192) != 128) {
                        return m1907a(iM2227e2, i2 + 1);
                    }
                    int i4 = ((iM2227e & 31) << 6) | (iM2227e2 & 63);
                    if (i4 != 0 && i4 < 128) {
                        return m1907a(iM2227e2, i2 + 1);
                    }
                    c = (char) i4;
                    i2 += 2;
                    break;
                    break;
                case 14:
                    iM2219a -= 3;
                    if (iM2219a < 0) {
                        return m1907a(iM2227e, i2);
                    }
                    int iM2227e3 = c0955c.m2227e(i2 + 1);
                    if ((iM2227e3 & 192) != 128) {
                        return m1907a(iM2227e3, i2 + 1);
                    }
                    int iM2227e4 = c0955c.m2227e(i2 + 2);
                    if ((iM2227e3 & 192) == 128 && (i = ((iM2227e & 15) << 12) | ((iM2227e3 & 63) << 6) | (iM2227e4 & 63)) >= 2048) {
                        c = (char) i;
                        i2 += 3;
                        break;
                    }
                    return m1907a(iM2227e4, i2 + 2);
            }
            cArr[i3] = c;
            i3++;
        }
        return new String(cArr, 0, i3);
    }

    /* JADX INFO: renamed from: a */
    private static byte[] m1909a(String str) {
        int length = str.length();
        byte[] bArr = new byte[length * 3];
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt != 0 && cCharAt < 128) {
                bArr[i] = (byte) cCharAt;
                i++;
            } else if (cCharAt < 2048) {
                bArr[i] = (byte) (((cCharAt >> 6) & 31) | 192);
                bArr[i + 1] = (byte) ((cCharAt & '?') | 128);
                i += 2;
            } else {
                bArr[i] = (byte) (((cCharAt >> '\f') & 15) | 224);
                bArr[i + 1] = (byte) (((cCharAt >> 6) & 63) | 128);
                bArr[i + 2] = (byte) ((cCharAt & '?') | 128);
                i += 3;
            }
        }
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, i);
        return bArr2;
    }

    @Override // com.p046a.p049b.p066f.p070d.InterfaceC0888d
    /* JADX INFO: renamed from: a */
    public final C0887c mo925a() {
        return C0887c.f2357p;
    }

    @Override // com.p046a.p049b.p066f.p069c.AbstractC0857a
    /* JADX INFO: renamed from: b */
    protected final int mo1864b(AbstractC0857a abstractC0857a) {
        return this.f2268a.compareTo(((C0883y) abstractC0857a).f2268a);
    }

    @Override // com.p046a.p049b.p073h.InterfaceC0971s
    /* JADX INFO: renamed from: d */
    public final String mo919d() {
        int length = this.f2268a.length();
        StringBuilder sb = new StringBuilder((length * 3) / 2);
        int i = 0;
        while (i < length) {
            char cCharAt = this.f2268a.charAt(i);
            if (cCharAt >= ' ' && cCharAt < 127) {
                if (cCharAt == '\'' || cCharAt == '\"' || cCharAt == '\\') {
                    sb.append('\\');
                }
                sb.append(cCharAt);
            } else if (cCharAt <= 127) {
                switch (cCharAt) {
                    case '\t':
                        sb.append("\\t");
                        break;
                    case '\n':
                        sb.append("\\n");
                        break;
                    case 11:
                    case '\f':
                    default:
                        char cCharAt2 = i < length + (-1) ? this.f2268a.charAt(i + 1) : (char) 0;
                        boolean z = cCharAt2 >= '0' && cCharAt2 <= '7';
                        sb.append('\\');
                        for (int i2 = 6; i2 >= 0; i2 -= 3) {
                            char c = (char) (((cCharAt >> i2) & 7) + 48);
                            if (c != '0' || z) {
                                sb.append(c);
                                z = true;
                            }
                        }
                        if (!z) {
                            sb.append('0');
                        }
                        break;
                    case '\r':
                        sb.append("\\r");
                        break;
                }
            } else {
                sb.append("\\u");
                sb.append(Character.forDigit(cCharAt >> '\f', 16));
                sb.append(Character.forDigit((cCharAt >> '\b') & 15, 16));
                sb.append(Character.forDigit((cCharAt >> 4) & 15, 16));
                sb.append(Character.forDigit(cCharAt & 15, 16));
            }
            i++;
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0883y) {
            return this.f2268a.equals(((C0883y) obj).f2268a);
        }
        return false;
    }

    @Override // com.p046a.p049b.p066f.p069c.AbstractC0857a
    /* JADX INFO: renamed from: g */
    public final boolean mo1865g() {
        return false;
    }

    @Override // com.p046a.p049b.p066f.p069c.AbstractC0857a
    /* JADX INFO: renamed from: h */
    public final String mo1866h() {
        return "utf8";
    }

    public final int hashCode() {
        return this.f2268a.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public final String m1910i() {
        return "\"" + mo919d() + '\"';
    }

    /* JADX INFO: renamed from: j */
    public final String m1911j() {
        return this.f2268a;
    }

    /* JADX INFO: renamed from: k */
    public final C0955c m1912k() {
        return this.f2269b;
    }

    /* JADX INFO: renamed from: l */
    public final int m1913l() {
        return this.f2269b.m2219a();
    }

    /* JADX INFO: renamed from: m */
    public final int m1914m() {
        return this.f2268a.length();
    }

    public final String toString() {
        return "string{\"" + mo919d() + "\"}";
    }
}
