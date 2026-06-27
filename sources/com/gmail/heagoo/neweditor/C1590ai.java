package com.gmail.heagoo.neweditor;

import org.xml.sax.Attributes;

/* JADX INFO: renamed from: com.gmail.heagoo.neweditor.ai */
/* JADX INFO: loaded from: classes.dex */
final class C1590ai {

    /* JADX INFO: renamed from: A */
    final /* synthetic */ C1589ah f4783A;

    /* JADX INFO: renamed from: a */
    public boolean f4784a;

    /* JADX INFO: renamed from: b */
    public boolean f4785b;

    /* JADX INFO: renamed from: c */
    public boolean f4786c;

    /* JADX INFO: renamed from: d */
    public byte f4787d;

    /* JADX INFO: renamed from: e */
    public C1613x f4788e;

    /* JADX INFO: renamed from: f */
    public String f4789f;

    /* JADX INFO: renamed from: g */
    public StringBuffer f4790g;

    /* JADX INFO: renamed from: h */
    public int f4791h;

    /* JADX INFO: renamed from: i */
    public boolean f4792i;

    /* JADX INFO: renamed from: j */
    public String f4793j;

    /* JADX INFO: renamed from: k */
    public String f4794k;

    /* JADX INFO: renamed from: l */
    public String f4795l;

    /* JADX INFO: renamed from: m */
    public boolean f4796m;

    /* JADX INFO: renamed from: n */
    public boolean f4797n;

    /* JADX INFO: renamed from: o */
    public StringBuffer f4798o;

    /* JADX INFO: renamed from: p */
    public byte f4799p;

    /* JADX INFO: renamed from: q */
    public boolean f4800q;

    /* JADX INFO: renamed from: r */
    public boolean f4801r;

    /* JADX INFO: renamed from: s */
    public String f4802s;

    /* JADX INFO: renamed from: t */
    public boolean f4803t;

    /* JADX INFO: renamed from: u */
    public String f4804u;

    /* JADX INFO: renamed from: v */
    public StringBuffer f4805v;

    /* JADX INFO: renamed from: w */
    public int f4806w;

    /* JADX INFO: renamed from: x */
    public byte f4807x;

    /* JADX INFO: renamed from: y */
    public String f4808y;

    /* JADX INFO: renamed from: z */
    public int f4809z;

    public C1590ai(C1589ah c1589ah, String str, Attributes attributes) {
        String strSubstring;
        String strSubstring2;
        boolean z = true;
        this.f4783A = c1589ah;
        this.f4787d = (byte) 0;
        this.f4797n = true;
        this.f4802s = "_";
        this.f4809z = -1;
        this.f4808y = str;
        c1589ah.f4779e = attributes.getValue("NAME");
        c1589ah.f4780f = attributes.getValue("VALUE");
        String value = attributes.getValue("TYPE");
        if (value != null) {
            this.f4807x = Token.stringToToken(value);
            if (this.f4807x == -1) {
                C1589ah.m3888a("token-invalid", value);
            }
        }
        this.f4799p = (byte) -2;
        String value2 = attributes.getValue("EXCLUDE_MATCH");
        if (value2 != null && "TRUE".equalsIgnoreCase(value2)) {
            this.f4799p = (byte) -1;
        }
        String value3 = attributes.getValue("MATCH_TYPE");
        if (value3 != null) {
            if ("CONTEXT".equals(value3)) {
                this.f4799p = (byte) -1;
            } else if ("RULE".equals(value3)) {
                this.f4799p = (byte) -2;
            } else {
                this.f4799p = Token.stringToToken(value3);
                if (this.f4799p == -1) {
                    C1589ah.m3888a("token-invalid", value3);
                }
            }
        }
        this.f4784a = "TRUE".equals(attributes.getValue("AT_LINE_START"));
        this.f4785b = "TRUE".equals(attributes.getValue("AT_WHITESPACE_END"));
        this.f4786c = "TRUE".equals(attributes.getValue("AT_WORD_START"));
        this.f4800q = "TRUE".equals(attributes.getValue("NO_LINE_BREAK"));
        this.f4801r = "TRUE".equals(attributes.getValue("NO_WORD_BREAK"));
        if (attributes.getValue("IGNORE_CASE") != null && !"TRUE".equals(attributes.getValue("IGNORE_CASE"))) {
            z = false;
        }
        this.f4797n = z;
        this.f4796m = "TRUE".equals(attributes.getValue("HIGHLIGHT_DIGITS"));
        this.f4803t = "TRUE".equals(attributes.getValue("REGEXP"));
        this.f4789f = attributes.getValue("DIGIT_RE");
        String value4 = attributes.getValue("NO_WORD_SEP");
        if (value4 != null) {
            this.f4802s = value4;
        }
        String value5 = attributes.getValue("AT_CHAR");
        if (value5 != null) {
            try {
                this.f4809z = Integer.parseInt(value5);
            } catch (NumberFormatException e) {
                C1589ah.m3888a("termchar-invalid", value5);
                this.f4809z = -1;
            }
        }
        this.f4793j = attributes.getValue("ESCAPE");
        this.f4804u = attributes.getValue("SET");
        String value6 = attributes.getValue("DELEGATE");
        if (value6 != null) {
            int iIndexOf = value6.indexOf("::");
            if (iIndexOf != -1) {
                strSubstring = value6.substring(0, iIndexOf);
                strSubstring2 = value6.substring(iIndexOf + 2);
            } else {
                strSubstring = c1589ah.f4778d;
                strSubstring2 = value6;
            }
            C1587af c1587afM3892a = c1589ah.m3892a();
            if (c1587afM3892a == null) {
                C1589ah.m3888a("delegate-invalid", value6);
            } else {
                this.f4788e = c1587afM3892a.m3880a(strSubstring2);
                if (c1587afM3892a == c1589ah.f4775a && this.f4788e == null) {
                    this.f4788e = new C1613x(strSubstring, strSubstring2);
                    this.f4788e.m3944b((byte) 7);
                    c1589ah.f4775a.m3881a(this.f4788e);
                } else if (this.f4788e == null) {
                    C1589ah.m3888a("delegate-invalid", value6);
                }
            }
        }
        String value7 = attributes.getValue("DEFAULT");
        if (value7 != null) {
            this.f4787d = Token.stringToToken(value7);
            if (this.f4787d == -1) {
                C1589ah.m3888a("token-invalid", value7);
                this.f4787d = (byte) 0;
            }
        }
        this.f4794k = attributes.getValue("HASH_CHAR");
        this.f4795l = attributes.getValue("HASH_CHARS");
        if (this.f4794k == null || this.f4795l == null) {
            return;
        }
        C1589ah.m3888a("hash-char-and-hash-chars-mutually-exclusive", (Object) null);
        this.f4795l = null;
    }
}
