package com.gmail.heagoo.neweditor;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.gmail.heagoo.neweditor.w */
/* JADX INFO: loaded from: classes.dex */
public final class C1612w {

    /* JADX INFO: renamed from: a */
    public final int f4856a;

    /* JADX INFO: renamed from: b */
    public C1613x f4857b;

    /* JADX INFO: renamed from: c */
    public final char[] f4858c;

    /* JADX INFO: renamed from: d */
    public final int f4859d;

    /* JADX INFO: renamed from: e */
    public final C1612w f4860e;

    /* JADX INFO: renamed from: f */
    public final byte f4861f;

    /* JADX INFO: renamed from: g */
    public final char[] f4862g;

    /* JADX INFO: renamed from: h */
    public final int f4863h;

    /* JADX INFO: renamed from: i */
    public final Pattern f4864i;

    /* JADX INFO: renamed from: j */
    public final byte f4865j;

    /* JADX INFO: renamed from: k */
    public final char[] f4866k;

    /* JADX INFO: renamed from: l */
    public final char[] f4867l;

    private C1612w(int i, String str, int i2, char[] cArr, Pattern pattern, int i3, char[] cArr2, Pattern pattern2, C1613x c1613x, byte b2, byte b3, String str2) {
        C1612w c1612wM3927a = null;
        this.f4856a = i;
        this.f4866k = str == null ? null : str.toUpperCase().toCharArray();
        this.f4867l = null;
        this.f4863h = i2;
        this.f4862g = cArr;
        this.f4864i = pattern;
        this.f4859d = i3;
        this.f4858c = cArr2;
        this.f4857b = c1613x;
        this.f4865j = b2;
        this.f4861f = b3;
        if (str2 != null && str2.length() > 0) {
            c1612wM3927a = m3927a(str2);
        }
        this.f4860e = c1612wM3927a;
        if (this.f4857b != null || (i & 255) == 0) {
            return;
        }
        this.f4857b = C1613x.m3932a(b2);
    }

    private C1612w(char[] cArr, int i, int i2, char[] cArr2, Pattern pattern, int i3, char[] cArr3, Pattern pattern2, C1613x c1613x, byte b2, byte b3, String str) {
        this.f4856a = i;
        this.f4866k = null;
        HashSet hashSet = new HashSet();
        for (char c : cArr) {
            hashSet.add(Character.valueOf(Character.toUpperCase(c)));
        }
        this.f4867l = new char[hashSet.size()];
        Iterator it = hashSet.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            this.f4867l[i4] = ((Character) it.next()).charValue();
            i4++;
        }
        Arrays.sort(this.f4867l);
        this.f4863h = i2;
        this.f4862g = null;
        this.f4864i = pattern;
        this.f4859d = i3;
        this.f4858c = cArr3;
        this.f4857b = c1613x;
        this.f4865j = b2;
        this.f4861f = b3;
        this.f4860e = (str == null || str.length() <= 0) ? null : m3927a(str);
        if (this.f4857b != null || (i & 255) == 0) {
            return;
        }
        this.f4857b = C1613x.m3932a(b2);
    }

    /* JADX INFO: renamed from: a */
    public static C1612w m3920a(int i, String str, byte b2, byte b3) {
        return new C1612w(8, str.substring(0, 1), i, str.toCharArray(), (Pattern) null, 0, (char[]) null, (Pattern) null, (C1613x) null, b2, b3, (String) null);
    }

    /* JADX INFO: renamed from: a */
    public static C1612w m3921a(int i, String str, int i2, String str2, C1613x c1613x, byte b2, byte b3, boolean z, boolean z2, String str3) {
        return new C1612w((z2 ? 1024 : 0) | (z ? 512 : 0) | 2, str.substring(0, 1), i, str.toCharArray(), (Pattern) null, i2, str2.toCharArray(), (Pattern) null, c1613x, b2, b3, str3);
    }

    /* JADX INFO: renamed from: a */
    public static C1612w m3922a(int i, String str, C1613x c1613x, byte b2) {
        return new C1612w(0, str.substring(0, 1), i, str.toCharArray(), (Pattern) null, 0, (char[]) null, (Pattern) null, c1613x, b2, (byte) -1, (String) null);
    }

    /* JADX INFO: renamed from: a */
    public static C1612w m3923a(int i, String str, C1613x c1613x, byte b2, byte b3) {
        return new C1612w(528, str.substring(0, 1), i, str.toCharArray(), (Pattern) null, 0, (char[]) null, (Pattern) null, c1613x, b2, b3, (String) null);
    }

    /* JADX INFO: renamed from: a */
    public static C1612w m3924a(int i, char[] cArr, String str, int i2, String str2, C1613x c1613x, byte b2, byte b3, boolean z, boolean z2, boolean z3, String str3, boolean z4) {
        Pattern patternCompile;
        char[] charArray;
        int i3 = (z ? 512 : 0) | 8194 | (z2 ? 1024 : 0);
        if (z4) {
            i3 |= 16384;
            patternCompile = Pattern.compile(str2, z3 ? 2 : 0);
            charArray = null;
        } else {
            patternCompile = null;
            charArray = str2.toCharArray();
        }
        return new C1612w(cArr, i3, i, (char[]) null, Pattern.compile(str, z3 ? 2 : 0), i2, charArray, patternCompile, c1613x, b2, b3, str3);
    }

    /* JADX INFO: renamed from: a */
    public static C1612w m3925a(int i, char[] cArr, String str, C1613x c1613x, byte b2, byte b3, boolean z) {
        return new C1612w(cArr, 8720, i, (char[]) null, Pattern.compile(str, z ? 2 : 0), 0, (char[]) null, (Pattern) null, c1613x, b2, b3, (String) null);
    }

    /* JADX INFO: renamed from: a */
    public static C1612w m3926a(int i, char[] cArr, String str, C1613x c1613x, byte b2, boolean z) {
        return new C1612w(cArr, 8192, i, (char[]) null, Pattern.compile(str, z ? 2 : 0), 0, (char[]) null, (Pattern) null, c1613x, b2, (byte) -1, (String) null);
    }

    /* JADX INFO: renamed from: a */
    public static C1612w m3927a(String str) {
        return new C1612w(2048, str.substring(0, 1), 0, str.toCharArray(), (Pattern) null, 0, (char[]) null, (Pattern) null, (C1613x) null, (byte) 0, (byte) -1, (String) null);
    }

    /* JADX INFO: renamed from: a */
    public static C1612w m3928a(String str, int i, String str2, int i2, String str3, C1613x c1613x, byte b2, byte b3, boolean z, boolean z2, boolean z3, String str4, boolean z4) {
        Pattern patternCompile;
        char[] charArray;
        int i3 = (z ? 512 : 0) | 8194 | (z2 ? 1024 : 0);
        if (z4) {
            i3 |= 16384;
            patternCompile = Pattern.compile(str3, z3 ? 2 : 0);
            charArray = null;
        } else {
            patternCompile = null;
            charArray = str3.toCharArray();
        }
        return new C1612w(i3, str, i, (char[]) null, Pattern.compile(str2, z3 ? 2 : 0), i2, charArray, patternCompile, c1613x, b2, b3, str4);
    }

    /* JADX INFO: renamed from: a */
    public static C1612w m3929a(String str, int i, String str2, C1613x c1613x, byte b2, byte b3, boolean z) {
        return new C1612w(8720, str, i, (char[]) null, Pattern.compile(str2, z ? 2 : 0), 0, (char[]) null, (Pattern) null, c1613x, b2, b3, (String) null);
    }

    /* JADX INFO: renamed from: a */
    public static C1612w m3930a(String str, int i, String str2, C1613x c1613x, byte b2, boolean z) {
        return new C1612w(8192, str, i, (char[]) null, Pattern.compile(str2, z ? 2 : 0), 0, (char[]) null, (Pattern) null, c1613x, b2, (byte) -1, (String) null);
    }

    /* JADX INFO: renamed from: b */
    public static C1612w m3931b(int i, String str, byte b2, byte b3) {
        return new C1612w(4, str.substring(0, 1), i, str.toCharArray(), (Pattern) null, 0, (char[]) null, (Pattern) null, (C1613x) null, b2, b3, (String) null);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName()).append("[action=");
        switch (this.f4856a & 255) {
            case 0:
                sb.append("SEQ");
                break;
            case 2:
                sb.append("SPAN");
                break;
            case 4:
                sb.append("MARK_PREVIOUS");
                break;
            case 8:
                sb.append("MARK_FOLLOWING");
                break;
            case 16:
                sb.append("EOL_SPAN");
                break;
            default:
                sb.append("UNKNOWN");
                break;
        }
        int i = 65280 & this.f4856a;
        sb.append("[matchType=").append(this.f4861f == -1 ? "MATCH_TYPE_CONTEXT" : this.f4861f == -2 ? "MATCH_TYPE_RULE" : Token.tokenToString(this.f4861f));
        sb.append(",NO_LINE_BREAK=").append((i & 512) != 0);
        sb.append(",NO_WORD_BREAK=").append((i & 1024) != 0);
        sb.append(",IS_ESCAPE=").append((i & 2048) != 0);
        sb.append(",REGEXP=").append((i & 8192) != 0);
        sb.append("],upHashChar=").append(new String(this.f4866k));
        sb.append(",upHashChars=").append(Arrays.toString(this.f4867l));
        sb.append(",startPosMatch=");
        sb.append("[AT_LINE_START=").append((this.f4863h & 2) != 0);
        sb.append(",AT_WHITESPACE_END=").append((this.f4863h & 4) != 0);
        sb.append(",AT_WORD_START=").append((this.f4863h & 8) != 0);
        sb.append("],start=").append(this.f4862g == null ? null : String.valueOf(this.f4862g));
        sb.append(",startRegexp=").append(this.f4864i);
        sb.append(",endPosMatch=");
        sb.append("[AT_LINE_START=").append((this.f4859d & 2) != 0);
        sb.append(",AT_WHITESPACE_END=").append((this.f4859d & 4) != 0);
        sb.append(",AT_WORD_START=").append((this.f4859d & 8) != 0);
        sb.append("],end=").append(this.f4858c != null ? String.valueOf(this.f4858c) : null);
        sb.append(",delegate=").append(this.f4857b);
        sb.append(",escapeRule=").append(this.f4860e);
        sb.append(",token=").append(Token.tokenToString(this.f4865j)).append(']');
        return sb.toString();
    }
}
