package com.gmail.heagoo.neweditor;

import android.util.Log;
import java.util.Hashtable;
import java.util.Stack;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

/* JADX INFO: renamed from: com.gmail.heagoo.neweditor.ah */
/* JADX INFO: loaded from: classes.dex */
public final class C1589ah extends DefaultHandler {

    /* JADX INFO: renamed from: b */
    private C1609t f4776b;

    /* JADX INFO: renamed from: c */
    private C1613x f4777c;

    /* JADX INFO: renamed from: e */
    private String f4779e;

    /* JADX INFO: renamed from: f */
    private String f4780f;

    /* JADX INFO: renamed from: g */
    private Stack f4781g;

    /* JADX INFO: renamed from: h */
    private Hashtable f4782h;

    /* JADX INFO: renamed from: d */
    private String f4778d = "xml";

    /* JADX INFO: renamed from: a */
    private C1587af f4775a = new C1587af();

    public C1589ah() {
        this.f4775a.m3881a(new C1613x("xml", "MAIN"));
        this.f4781g = new Stack();
        this.f4782h = new Hashtable();
        m3885a((String) null, (Attributes) null);
    }

    /* JADX INFO: renamed from: a */
    private C1590ai m3884a(String str) {
        for (int size = this.f4781g.size() - 1; size >= 0; size--) {
            C1590ai c1590ai = (C1590ai) this.f4781g.get(size);
            if (c1590ai.f4808y.equals(str)) {
                return c1590ai;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    private C1590ai m3885a(String str, Attributes attributes) {
        C1590ai c1590ai = str != null ? new C1590ai(this, str, attributes) : null;
        this.f4781g.push(c1590ai);
        return c1590ai;
    }

    /* JADX INFO: renamed from: a */
    protected static void m3888a(String str, Object obj) {
        Log.d("DEBUG", "error occurred: " + str + ", " + obj.toString());
    }

    /* JADX INFO: renamed from: b */
    private C1590ai m3890b() {
        return (C1590ai) this.f4781g.peek();
    }

    /* JADX INFO: renamed from: a */
    public final C1587af m3892a() {
        return this.f4775a;
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void characters(char[] cArr, int i, int i2) {
        C1590ai c1590aiM3890b = m3890b();
        if (c1590aiM3890b.f4808y.equals("EOL_SPAN") || c1590aiM3890b.f4808y.equals("EOL_SPAN_REGEXP") || c1590aiM3890b.f4808y.equals("MARK_PREVIOUS") || c1590aiM3890b.f4808y.equals("MARK_FOLLOWING") || c1590aiM3890b.f4808y.equals("SEQ") || c1590aiM3890b.f4808y.equals("SEQ_REGEXP") || c1590aiM3890b.f4808y.equals("BEGIN")) {
            C1590ai c1590ai = c1590aiM3890b.f4808y.equals("BEGIN") ? (C1590ai) c1590aiM3890b.f4783A.f4781g.get(c1590aiM3890b.f4783A.f4781g.size() - 2) : c1590aiM3890b;
            if (c1590ai.f4805v != null) {
                c1590ai.f4805v.append(cArr, i, i2);
                return;
            }
            c1590ai.f4805v = new StringBuffer();
            c1590ai.f4805v.append(cArr, i, i2);
            c1590ai.f4806w = (c1590ai.f4786c ? 8 : 0) | (!c1590ai.f4785b ? 0 : 4) | (!c1590ai.f4784a ? 0 : 2);
            c1590ai.f4784a = false;
            c1590ai.f4786c = false;
            c1590ai.f4785b = false;
            return;
        }
        if (!c1590aiM3890b.f4808y.equals("END")) {
            if (c1590aiM3890b.f4798o == null) {
                c1590aiM3890b.f4798o = new StringBuffer();
            }
            c1590aiM3890b.f4798o.append(cArr, i, i2);
            return;
        }
        C1590ai c1590ai2 = (C1590ai) c1590aiM3890b.f4783A.f4781g.get(c1590aiM3890b.f4783A.f4781g.size() - 2);
        if (c1590ai2.f4790g != null) {
            c1590ai2.f4790g.append(cArr, i, i2);
            return;
        }
        c1590ai2.f4790g = new StringBuffer();
        c1590ai2.f4790g.append(cArr, i, i2);
        c1590ai2.f4791h = (c1590aiM3890b.f4784a ? 2 : 0) | (c1590aiM3890b.f4785b ? 4 : 0) | (c1590aiM3890b.f4786c ? 8 : 0);
        c1590ai2.f4792i = c1590aiM3890b.f4803t;
        c1590ai2.f4784a = false;
        c1590ai2.f4786c = false;
        c1590ai2.f4785b = false;
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void endElement(String str, String str2, String str3) {
        byte bStringToToken;
        C1590ai c1590ai = (C1590ai) this.f4781g.pop();
        if (!str3.equals(c1590ai.f4808y)) {
            throw new InternalError();
        }
        if (c1590ai.f4808y.equals("PROPERTY")) {
            this.f4782h.put(this.f4779e, this.f4780f);
            return;
        }
        if (c1590ai.f4808y.equals("PROPS")) {
            if (m3890b().f4808y.equals("RULES")) {
                this.f4777c.m3940a(this.f4782h);
            }
            this.f4782h = new Hashtable();
            return;
        }
        if (c1590ai.f4808y.equals("RULES")) {
            this.f4777c.m3936a(this.f4776b);
            this.f4776b = null;
            this.f4777c = null;
            return;
        }
        if (c1590ai.f4808y.equals("IMPORT")) {
            if (this.f4777c.equals(c1590ai.f4788e)) {
                return;
            }
            this.f4777c.m3938a(c1590ai.f4788e);
            return;
        }
        if (c1590ai.f4808y.equals("TERMINATE")) {
            this.f4777c.m3935a(c1590ai.f4809z);
            return;
        }
        if (c1590ai.f4808y.equals("SEQ")) {
            if (c1590ai.f4805v == null) {
                m3888a("empty-tag", "SEQ");
                return;
            } else {
                this.f4777c.m3937a(C1612w.m3922a(c1590ai.f4806w, c1590ai.f4805v.toString(), c1590ai.f4788e, c1590ai.f4807x));
                return;
            }
        }
        if (c1590ai.f4808y.equals("SEQ_REGEXP")) {
            if (c1590ai.f4805v == null) {
                m3888a("empty-tag", "SEQ_REGEXP");
                return;
            }
            try {
                if (c1590ai.f4795l != null) {
                    this.f4777c.m3937a(C1612w.m3926a(c1590ai.f4806w, c1590ai.f4795l.toCharArray(), c1590ai.f4805v.toString(), c1590ai.f4788e, c1590ai.f4807x, m3884a("RULES").f4797n));
                } else {
                    this.f4777c.m3937a(C1612w.m3930a(c1590ai.f4794k, c1590ai.f4806w, c1590ai.f4805v.toString(), c1590ai.f4788e, c1590ai.f4807x, m3884a("RULES").f4797n));
                }
                return;
            } catch (PatternSyntaxException e) {
                m3888a("regexp", e);
                return;
            }
        }
        if (c1590ai.f4808y.equals("SPAN")) {
            if (c1590ai.f4805v == null) {
                m3888a("empty-tag", "BEGIN");
                return;
            } else if (c1590ai.f4790g == null) {
                m3888a("empty-tag", "END");
                return;
            } else {
                this.f4777c.m3937a(C1612w.m3921a(c1590ai.f4806w, c1590ai.f4805v.toString(), c1590ai.f4791h, c1590ai.f4790g.toString(), c1590ai.f4788e, c1590ai.f4807x, c1590ai.f4799p, c1590ai.f4800q, c1590ai.f4801r, c1590ai.f4793j));
                return;
            }
        }
        if (c1590ai.f4808y.equals("SPAN_REGEXP")) {
            if (c1590ai.f4805v == null) {
                m3888a("empty-tag", "BEGIN");
                return;
            }
            if (c1590ai.f4790g == null) {
                m3888a("empty-tag", "END");
                return;
            }
            try {
                if (c1590ai.f4795l != null) {
                    this.f4777c.m3937a(C1612w.m3924a(c1590ai.f4806w, c1590ai.f4795l.toCharArray(), c1590ai.f4805v.toString(), c1590ai.f4791h, c1590ai.f4790g.toString(), c1590ai.f4788e, c1590ai.f4807x, c1590ai.f4799p, c1590ai.f4800q, c1590ai.f4801r, m3884a("RULES").f4797n, c1590ai.f4793j, c1590ai.f4792i));
                } else {
                    this.f4777c.m3937a(C1612w.m3928a(c1590ai.f4794k, c1590ai.f4806w, c1590ai.f4805v.toString(), c1590ai.f4791h, c1590ai.f4790g.toString(), c1590ai.f4788e, c1590ai.f4807x, c1590ai.f4799p, c1590ai.f4800q, c1590ai.f4801r, m3884a("RULES").f4797n, c1590ai.f4793j, c1590ai.f4792i));
                }
                return;
            } catch (PatternSyntaxException e2) {
                m3888a("regexp", e2);
                return;
            }
        }
        if (c1590ai.f4808y.equals("EOL_SPAN")) {
            if (c1590ai.f4805v == null) {
                m3888a("empty-tag", "EOL_SPAN");
                return;
            } else {
                this.f4777c.m3937a(C1612w.m3923a(c1590ai.f4806w, c1590ai.f4805v.toString(), c1590ai.f4788e, c1590ai.f4807x, c1590ai.f4799p));
                return;
            }
        }
        if (c1590ai.f4808y.equals("EOL_SPAN_REGEXP")) {
            if (c1590ai.f4805v == null) {
                m3888a("empty-tag", "EOL_SPAN_REGEXP");
                return;
            }
            try {
                if (c1590ai.f4795l != null) {
                    this.f4777c.m3937a(C1612w.m3925a(c1590ai.f4806w, c1590ai.f4795l.toCharArray(), c1590ai.f4805v.toString(), c1590ai.f4788e, c1590ai.f4807x, c1590ai.f4799p, m3884a("RULES").f4797n));
                } else {
                    this.f4777c.m3937a(C1612w.m3929a(c1590ai.f4794k, c1590ai.f4806w, c1590ai.f4805v.toString(), c1590ai.f4788e, c1590ai.f4807x, c1590ai.f4799p, m3884a("RULES").f4797n));
                }
                return;
            } catch (PatternSyntaxException e3) {
                m3888a("regexp", e3);
                return;
            }
        }
        if (c1590ai.f4808y.equals("MARK_FOLLOWING")) {
            if (c1590ai.f4805v == null) {
                m3888a("empty-tag", "MARK_FOLLOWING");
                return;
            } else {
                this.f4777c.m3937a(C1612w.m3920a(c1590ai.f4806w, c1590ai.f4805v.toString(), c1590ai.f4807x, c1590ai.f4799p));
                return;
            }
        }
        if (c1590ai.f4808y.equals("MARK_PREVIOUS")) {
            if (c1590ai.f4805v == null) {
                m3888a("empty-tag", "MARK_PREVIOUS");
                return;
            } else {
                this.f4777c.m3937a(C1612w.m3931b(c1590ai.f4806w, c1590ai.f4805v.toString(), c1590ai.f4807x, c1590ai.f4799p));
                return;
            }
        }
        if (c1590ai.f4808y.equals("END") || c1590ai.f4808y.equals("BEGIN") || c1590ai.f4808y.equals("KEYWORDS") || c1590ai.f4808y.equals("MODE") || (bStringToToken = Token.stringToToken(c1590ai.f4808y)) == -1) {
            return;
        }
        if (c1590ai.f4798o == null || c1590ai.f4798o.length() == 0) {
            m3888a("empty-keyword", (Object) null);
            return;
        }
        String string = c1590ai.f4798o.toString();
        if (this.f4776b != null) {
            this.f4776b.m3919a(string, bStringToToken);
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void startElement(String str, String str2, String str3, Attributes attributes) {
        C1590ai c1590aiM3885a = m3885a(str3, attributes);
        if (str3.equals("WHITESPACE")) {
            return;
        }
        if (str3.equals("KEYWORDS")) {
            this.f4776b = new C1609t(this.f4777c.m3949e());
            return;
        }
        if (str3.equals("RULES")) {
            if (c1590aiM3885a.f4804u == null) {
                c1590aiM3885a.f4804u = "MAIN";
            }
            this.f4777c = this.f4775a.m3880a(c1590aiM3885a.f4804u);
            if (this.f4777c == null) {
                this.f4777c = new C1613x(this.f4778d, c1590aiM3885a.f4804u);
                this.f4775a.m3881a(this.f4777c);
            }
            this.f4777c.m3942a(c1590aiM3885a.f4797n);
            this.f4777c.m3946b(c1590aiM3885a.f4796m);
            if (c1590aiM3885a.f4789f != null) {
                try {
                    this.f4777c.m3941a(Pattern.compile(c1590aiM3885a.f4789f, c1590aiM3885a.f4797n ? 2 : 0));
                } catch (Exception e) {
                    m3888a("regexp", e);
                }
            }
            if (c1590aiM3885a.f4793j != null) {
                this.f4777c.m3945b(C1612w.m3927a(c1590aiM3885a.f4793j));
            }
            this.f4777c.m3944b(c1590aiM3885a.f4787d);
            this.f4777c.m3939a(c1590aiM3885a.f4802s);
        }
    }
}
