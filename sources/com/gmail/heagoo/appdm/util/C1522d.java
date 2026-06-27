package com.gmail.heagoo.appdm.util;

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
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: renamed from: com.gmail.heagoo.appdm.util.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1522d implements XmlSerializer {

    /* JADX INFO: renamed from: a */
    private static final String[] f4574a = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "&quot;", null, null, null, "&amp;", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "&lt;", null, "&gt;", null};

    /* JADX INFO: renamed from: c */
    private int f4576c;

    /* JADX INFO: renamed from: d */
    private Writer f4577d;

    /* JADX INFO: renamed from: e */
    private OutputStream f4578e;

    /* JADX INFO: renamed from: f */
    private CharsetEncoder f4579f;

    /* JADX INFO: renamed from: h */
    private boolean f4581h;

    /* JADX INFO: renamed from: b */
    private final char[] f4575b = new char[8192];

    /* JADX INFO: renamed from: g */
    private ByteBuffer f4580g = ByteBuffer.allocate(8192);

    /* JADX INFO: renamed from: a */
    private void m3715a() throws IOException {
        int iPosition = this.f4580g.position();
        if (iPosition > 0) {
            this.f4580g.flip();
            this.f4578e.write(this.f4580g.array(), 0, iPosition);
            this.f4580g.clear();
        }
    }

    /* JADX INFO: renamed from: a */
    private void m3716a(char c) throws IOException {
        int i = this.f4576c;
        if (i >= 8191) {
            flush();
            i = this.f4576c;
        }
        this.f4575b[i] = c;
        this.f4576c = i + 1;
    }

    /* JADX INFO: renamed from: a */
    private void m3717a(String str) throws IOException {
        m3718a(str, 0, str.length());
    }

    /* JADX INFO: renamed from: a */
    private void m3718a(String str, int i, int i2) throws IOException {
        if (i2 > 8192) {
            int i3 = i + i2;
            while (i < i3) {
                int i4 = i + 8192;
                m3718a(str, i, i4 < i3 ? 8192 : i3 - i);
                i = i4;
            }
            return;
        }
        int i5 = this.f4576c;
        if (i5 + i2 > 8192) {
            flush();
            i5 = this.f4576c;
        }
        str.getChars(i, i + i2, this.f4575b, i5);
        this.f4576c = i5 + i2;
    }

    /* JADX INFO: renamed from: a */
    private void m3719a(char[] cArr, int i, int i2) throws IOException {
        if (i2 > 8192) {
            int i3 = i + i2;
            while (i < i3) {
                int i4 = i + 8192;
                m3719a(cArr, i, i4 < i3 ? 8192 : i3 - i);
                i = i4;
            }
            return;
        }
        int i5 = this.f4576c;
        if (i5 + i2 > 8192) {
            flush();
            i5 = this.f4576c;
        }
        System.arraycopy(cArr, i, this.f4575b, i5, i2);
        this.f4576c = i5 + i2;
    }

    /* JADX INFO: renamed from: b */
    private void m3720b(String str) throws IOException {
        String str2;
        int i = 0;
        int length = str.length();
        String[] strArr = f4574a;
        int i2 = 0;
        while (i2 < length) {
            char cCharAt = str.charAt(i2);
            if (cCharAt < '@' && (str2 = strArr[cCharAt]) != null) {
                if (i < i2) {
                    m3718a(str, i, i2 - i);
                }
                i = i2 + 1;
                m3717a(str2);
            }
            i2++;
        }
        if (i < i2) {
            m3718a(str, i, i2 - i);
        }
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final XmlSerializer attribute(String str, String str2, String str3) throws IOException {
        m3716a(' ');
        if (str != null) {
            m3717a(str);
            m3716a(':');
        }
        m3717a(str2);
        m3717a("=\"");
        m3720b(str3);
        m3716a('\"');
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
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final XmlSerializer endTag(String str, String str2) throws IOException {
        if (this.f4581h) {
            m3717a(" />\n");
        } else {
            m3717a("</");
            if (str != null) {
                m3717a(str);
                m3716a(':');
            }
            m3717a(str2);
            m3717a(">\n");
        }
        this.f4581h = false;
        return this;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void entityRef(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void flush() throws IOException {
        if (this.f4576c > 0) {
            if (this.f4578e != null) {
                CharBuffer charBufferWrap = CharBuffer.wrap(this.f4575b, 0, this.f4576c);
                CoderResult coderResultEncode = this.f4579f.encode(charBufferWrap, this.f4580g, true);
                while (!coderResultEncode.isError()) {
                    if (coderResultEncode.isOverflow()) {
                        m3715a();
                        coderResultEncode = this.f4579f.encode(charBufferWrap, this.f4580g, true);
                    } else {
                        m3715a();
                        this.f4578e.flush();
                    }
                }
                throw new IOException(coderResultEncode.toString());
            }
            this.f4577d.write(this.f4575b, 0, this.f4576c);
            this.f4577d.flush();
            this.f4576c = 0;
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
            this.f4579f = Charset.forName(str).newEncoder();
            this.f4578e = outputStream;
        } catch (IllegalCharsetNameException e) {
            throw ((UnsupportedEncodingException) new UnsupportedEncodingException(str).initCause(e));
        } catch (UnsupportedCharsetException e2) {
            throw ((UnsupportedEncodingException) new UnsupportedEncodingException(str).initCause(e2));
        }
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void setOutput(Writer writer) {
        this.f4577d = writer;
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
        m3717a("<?xml version=\"1.0\" encoding=\"utf-8\" standalone=\"" + (bool.booleanValue() ? "yes" : "no") + "\" ?>\n");
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final XmlSerializer startTag(String str, String str2) throws IOException {
        if (this.f4581h) {
            m3717a(">\n");
        }
        m3716a('<');
        if (str != null) {
            m3717a(str);
            m3716a(':');
        }
        m3717a(str2);
        this.f4581h = true;
        return this;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final XmlSerializer text(String str) throws IOException {
        if (this.f4581h) {
            m3717a(">");
            this.f4581h = false;
        }
        m3720b(str);
        return this;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final XmlSerializer text(char[] cArr, int i, int i2) throws IOException {
        String str;
        if (this.f4581h) {
            m3717a(">");
            this.f4581h = false;
        }
        String[] strArr = f4574a;
        int i3 = i + i2;
        int i4 = i;
        while (i < i3) {
            char c = cArr[i];
            if (c < '@' && (str = strArr[c]) != null) {
                if (i4 < i) {
                    m3719a(cArr, i4, i - i4);
                }
                i4 = i + 1;
                m3717a(str);
            }
            i++;
        }
        if (i4 < i) {
            m3719a(cArr, i4, i - i4);
        }
        return this;
    }
}
