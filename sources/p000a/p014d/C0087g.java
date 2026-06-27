package p000a.p014d;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: renamed from: a.d.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0087g implements XmlSerializer {

    /* JADX INFO: renamed from: a */
    private static final String[] f231a = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "&quot;", null, null, null, "&amp;", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "&lt;", null, "&gt;", null};

    /* JADX INFO: renamed from: c */
    private int f233c;

    /* JADX INFO: renamed from: d */
    private Writer f234d;

    /* JADX INFO: renamed from: e */
    private OutputStream f235e;

    /* JADX INFO: renamed from: f */
    private CharsetEncoder f236f;

    /* JADX INFO: renamed from: h */
    private boolean f238h;

    /* JADX INFO: renamed from: j */
    private C0090j f240j;

    /* JADX INFO: renamed from: k */
    private boolean f241k;

    /* JADX INFO: renamed from: l */
    private boolean f242l;
    private boolean tab;

    /* JADX INFO: renamed from: b */
    private final char[] f232b = new char[8192];

    /* JADX INFO: renamed from: g */
    private ByteBuffer f237g = ByteBuffer.allocate(8192);

    /* JADX INFO: renamed from: i */
    private int f239i = 0;

    /* JADX INFO: renamed from: a */
    private void m214a() throws IOException {
        int iPosition = this.f237g.position();
        if (iPosition > 0) {
            this.f237g.flip();
            this.f235e.write(this.f237g.array(), 0, iPosition);
            this.f237g.clear();
        }
    }

    /* JADX INFO: renamed from: a */
    private void m215a(char c) throws IOException {
        int i = this.f233c;
        if (i >= 8191) {
            flush();
            i = this.f233c;
        }
        this.f232b[i] = c;
        this.f233c = i + 1;
    }

    /* JADX INFO: renamed from: a */
    private void m216a(String str) throws IOException {
        m217a(str, 0, str.length());
    }

    /* JADX INFO: renamed from: a */
    private void m217a(String str, int i, int i2) throws IOException {
        if (i2 > 8192) {
            int i3 = i + i2;
            while (i < i3) {
                int i4 = i + 8192;
                m217a(str, i, i4 < i3 ? 8192 : i3 - i);
                i = i4;
            }
            return;
        }
        int i5 = this.f233c;
        if (i5 + i2 > 8192) {
            flush();
            i5 = this.f233c;
        }
        str.getChars(i, i + i2, this.f232b, i5);
        this.f233c = i5 + i2;
    }

    /* JADX INFO: renamed from: a */
    private void m218a(char[] cArr, int i, int i2) throws IOException {
        if (i2 > 8192) {
            int i3 = i + i2;
            while (i < i3) {
                int i4 = i + 8192;
                m218a(cArr, i, i4 < i3 ? 8192 : i3 - i);
                i = i4;
            }
            return;
        }
        int i5 = this.f233c;
        if (i5 + i2 > 8192) {
            flush();
            i5 = this.f233c;
        }
        System.arraycopy(cArr, i, this.f232b, i5, i2);
        this.f233c = i5 + i2;
    }

    /* JADX INFO: renamed from: b */
    private void m219b(String str) throws IOException {
        String str2;
        int i = 0;
        int length = str.length();
        String[] strArr = f231a;
        int i2 = 0;
        while (i2 < length) {
            char cCharAt = str.charAt(i2);
            if (cCharAt < '@' && (str2 = strArr[cCharAt]) != null) {
                if (i < i2) {
                    m217a(str, i, i2 - i);
                }
                i = i2 + 1;
                m216a(str2);
            }
            i2++;
        }
        if (i < i2) {
            m217a(str, i, i2 - i);
        }
    }

    private String replace(String str) {
        return str.replace("\\\"", "\"");
    }

    /* JADX INFO: renamed from: a */
    public final XmlSerializer m220a(String[] strArr, String[] strArr2, String[] strArr3) throws IOException {
        String strM232a;
        int i = 0;
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < strArr.length; i2++) {
            String str = strArr[i2];
            String str2 = strArr2[i2];
            String str3 = strArr3[i2];
            if (str != null && !str.equals("") && (strM232a = this.f240j.m232a(this.f239i, str)) != null) {
                str2 = strM232a + ":" + str2;
            }
            arrayList.add(str2);
            map.put(str2, str3);
        }
        Collections.sort(arrayList);
        while (true) {
            int i3 = i;
            if (i3 >= arrayList.size()) {
                return this;
            }
            String str4 = (String) arrayList.get(i3);
            String str5 = (String) map.get(str4);
            m215a(' ');
            m216a(str4);
            m216a("=\"");
            m219b(str5);
            m215a('\"');
            i = i3 + 1;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m221a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        startTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
        int namespaceCount = xmlPullParser.getNamespaceCount(xmlPullParser.getDepth());
        for (int namespaceCount2 = xmlPullParser.getNamespaceCount(xmlPullParser.getDepth() - 1); namespaceCount2 != namespaceCount; namespaceCount2++) {
            String namespacePrefix = xmlPullParser.getNamespacePrefix(namespaceCount2);
            String namespaceUri = xmlPullParser.getNamespaceUri(namespaceCount2);
            if (!"".equals(namespacePrefix)) {
                this.f240j.m234a(this.f239i, namespacePrefix, namespaceUri);
                m216a(String.format(" xmlns:%s=\"%s\"", namespacePrefix, namespaceUri));
            }
        }
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final XmlSerializer attribute(String str, String str2, String str3) throws IOException {
        if (str3 != null) {
            m215a(' ');
            if (str != null && !str.equals("")) {
                String strM232a = this.f240j.m232a(this.f239i, str);
                if (strM232a != null) {
                    m216a(strM232a);
                    m215a(':');
                } else {
                    int iLastIndexOf = str.lastIndexOf(47);
                    String strSubstring = (iLastIndexOf == -1 || iLastIndexOf == str.length() + (-1)) ? "ns" + new Random(System.currentTimeMillis()).nextInt() : str.substring(iLastIndexOf + 1);
                    this.f240j.m234a(this.f239i, strSubstring, str);
                    m216a("xmlns:");
                    m216a(strSubstring);
                    m216a("=\"");
                    m216a(str);
                    m216a("\" ");
                    m216a(strSubstring);
                    m215a(':');
                }
            }
            m216a(str2);
            m216a("=\"");
            m216a(str3);
            m215a('\"');
        }
        return this;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void cdsect(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void comment(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void docdecl(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void endDocument() throws IOException {
        flush();
        this.f235e = null;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final XmlSerializer endTag(String str, String str2) throws IOException {
        String strM232a;
        this.f240j.m233a(this.f239i);
        this.f239i--;
        if (this.f238h) {
            m216a(" />\n");
        } else {
            if (!this.tab) {
                for (int i = 0; i < this.f239i; i++) {
                    m215a('\t');
                }
            }
            this.tab = false;
            m216a("</");
            if (str != null && (strM232a = this.f240j.m232a(this.f239i, str)) != null) {
                m216a(strM232a);
                m215a(':');
            }
            m216a(str2);
            m216a(">\n");
        }
        this.f238h = false;
        return this;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void entityRef(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void flush() throws IOException {
        if (this.f233c > 0) {
            if (this.f235e != null) {
                CharBuffer charBufferWrap = CharBuffer.wrap(this.f232b, 0, this.f233c);
                CoderResult coderResultEncode = this.f236f.encode(charBufferWrap, this.f237g, true);
                while (!coderResultEncode.isError()) {
                    if (coderResultEncode.isOverflow()) {
                        m214a();
                        coderResultEncode = this.f236f.encode(charBufferWrap, this.f237g, true);
                    } else {
                        m214a();
                        this.f235e.flush();
                    }
                }
                throw new IOException(coderResultEncode.toString());
            }
            this.f234d.write(this.f232b, 0, this.f233c);
            this.f234d.flush();
            this.f233c = 0;
        }
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final int getDepth() {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final boolean getFeature(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final String getName() {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final String getNamespace() {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final String getPrefix(String str, boolean z) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final Object getProperty(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void ignorableWhitespace(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void processingInstruction(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void setFeature(String str, boolean z) {
        if (!str.equals("http://xmlpull.org/v1/doc/features.html#indent-output")) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void setOutput(OutputStream outputStream, String str) throws UnsupportedEncodingException {
        if (outputStream == null) {
            throw new IllegalArgumentException();
        }
        try {
            this.f236f = Charset.forName(str).newEncoder();
            this.f235e = outputStream;
        } catch (IllegalCharsetNameException e) {
            throw ((UnsupportedEncodingException) new UnsupportedEncodingException(str).initCause(e));
        } catch (UnsupportedCharsetException e2) {
            throw ((UnsupportedEncodingException) new UnsupportedEncodingException(str).initCause(e2));
        }
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void setOutput(Writer writer) {
        this.f234d = writer;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void setPrefix(String str, String str2) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void setProperty(String str, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void startDocument(String str, Boolean bool) throws IOException {
        this.tab = false;
        this.f242l = false;
        this.f241k = false;
        this.f240j = new C0090j();
        this.f239i = 0;
        this.f233c = 0;
        this.f238h = false;
        if (bool != null) {
            m216a("<?xml version=\"1.0\" encoding=\"utf-8\" standalone=\"" + (bool.booleanValue() ? "yes" : "no") + "\" ?>\n");
        } else {
            m216a("<?xml version=\"1.0\" encoding=\"utf-8\" ?>\n");
        }
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final XmlSerializer startTag(String str, String str2) throws IOException {
        String strM232a;
        if (this.f238h) {
            m216a(">\n");
        }
        for (int i = 0; i < this.f239i; i++) {
            m215a('\t');
        }
        m215a('<');
        if (str != null && (strM232a = this.f240j.m232a(this.f239i, str)) != null) {
            m216a(strM232a);
            m215a(':');
        }
        m216a(str2);
        this.f238h = true;
        this.f239i++;
        return this;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final XmlSerializer text(String str) throws IOException {
        String strReplace = replace(str);
        this.tab = true;
        if (this.f238h) {
            m216a(">");
            this.f238h = false;
        }
        this.f242l = false;
        this.f241k = false;
        int i = 0;
        for (int i2 = 0; i2 < strReplace.length(); i2++) {
            char cCharAt = strReplace.charAt(i2);
            if (cCharAt != ']') {
                if (cCharAt == '&') {
                    if (i2 >= strReplace.length() - 3 || strReplace.charAt(i2 + 1) != 'l' || strReplace.charAt(i2 + 2) != 't' || strReplace.charAt(i2 + 3) != ';') {
                        if (i2 > i) {
                            m216a(strReplace.substring(i, i2));
                        }
                        m216a("&amp;");
                        i = i2 + 1;
                    }
                } else if (cCharAt == '<') {
                    if (i2 > i) {
                        m216a(strReplace.substring(i, i2));
                    }
                    m216a("&lt;");
                    i = i2 + 1;
                } else if (this.f242l && cCharAt == '>') {
                    if (i2 > i) {
                        m216a(strReplace.substring(i, i2));
                    }
                    m216a("&gt;");
                    i = i2 + 1;
                }
                if (this.f241k) {
                    this.f241k = false;
                    this.f242l = false;
                }
            } else if (this.f241k) {
                this.f242l = true;
            } else {
                this.f241k = true;
            }
        }
        if (i > 0) {
            m216a(strReplace.substring(i));
        } else {
            m216a(strReplace);
        }
        return this;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final XmlSerializer text(char[] cArr, int i, int i2) throws IOException {
        if (this.f238h) {
            m216a(">");
            this.f238h = false;
        }
        this.f242l = false;
        this.f241k = false;
        int i3 = i + i2;
        int i4 = i;
        while (i < i3) {
            char c = cArr[i];
            if (c != ']') {
                if (c == '&') {
                    if (i > i4) {
                        m218a(cArr, i4, i - i4);
                    }
                    m216a("&amp;");
                    i4 = i + 1;
                } else if (c == '<') {
                    if (i > i4) {
                        m218a(cArr, i4, i - i4);
                    }
                    m216a("&lt;");
                    i4 = i + 1;
                } else if (this.f242l && c == '>') {
                    if (i > i4) {
                        m218a(cArr, i4, i - i4);
                    }
                    m216a("&gt;");
                    i4 = i + 1;
                }
                if (this.f241k) {
                    this.f241k = false;
                    this.f242l = false;
                }
            } else if (this.f241k) {
                this.f242l = true;
            } else {
                this.f241k = true;
            }
            i++;
        }
        if (i3 > i4) {
            m218a(cArr, i4, i3 - i4);
        }
        return this;
    }
}
