package p000a.p014d;

import android.support.v7.appcompat.C0327R;
import android.util.Log;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Locale;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: renamed from: a.d.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0088h implements XmlSerializer {

    /* JADX INFO: renamed from: b */
    private int f244b;

    /* JADX INFO: renamed from: c */
    private Writer f245c;

    /* JADX INFO: renamed from: d */
    private boolean f246d;

    /* JADX INFO: renamed from: e */
    private int f247e;

    /* JADX INFO: renamed from: f */
    private int f248f;

    /* JADX INFO: renamed from: k */
    private String f253k;

    /* JADX INFO: renamed from: a */
    private final char[] f243a = new char[8192];

    /* JADX INFO: renamed from: g */
    private String[] f249g = new String[12];

    /* JADX INFO: renamed from: h */
    private int[] f250h = new int[4];

    /* JADX INFO: renamed from: i */
    private String[] f251i = new String[8];

    /* JADX INFO: renamed from: j */
    private boolean[] f252j = new boolean[4];

    /* JADX INFO: renamed from: a */
    private final String m222a(String str, boolean z, boolean z2) throws IOException {
        String string;
        String str2;
        for (int i = (this.f250h[this.f248f + 1] << 1) - 2; i >= 0; i -= 2) {
            if (this.f251i[i + 1].equals(str) && (z || !this.f251i[i].isEmpty())) {
                String str3 = this.f251i[i];
                int i2 = i + 2;
                while (true) {
                    if (i2 >= (this.f250h[this.f248f + 1] << 1)) {
                        str2 = str3;
                        break;
                    }
                    if (this.f251i[i2].equals(str3)) {
                        str2 = null;
                        break;
                    }
                    i2++;
                }
                if (str2 != null) {
                    return str2;
                }
            }
        }
        if (!z2) {
            return null;
        }
        if (str.isEmpty()) {
            string = "";
        } else {
            do {
                StringBuilder sb = new StringBuilder("n");
                int i3 = this.f247e;
                this.f247e = i3 + 1;
                string = sb.append(i3).toString();
                int i4 = (this.f250h[this.f248f + 1] << 1) - 2;
                while (true) {
                    if (i4 < 0) {
                        break;
                    }
                    if (string.equals(this.f251i[i4])) {
                        string = null;
                        break;
                    }
                    i4 -= 2;
                }
            } while (string == null);
        }
        boolean z3 = this.f246d;
        this.f246d = false;
        setPrefix(string, str);
        this.f246d = z3;
        return string;
    }

    /* JADX INFO: renamed from: a */
    private final void m223a() throws IOException {
        if (this.f244b > 0) {
            this.f245c.write(this.f243a, 0, this.f244b);
            this.f245c.flush();
            this.f244b = 0;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m224a(char c) throws IOException {
        if (this.f244b >= 8192) {
            m223a();
        }
        char[] cArr = this.f243a;
        int i = this.f244b;
        this.f244b = i + 1;
        cArr[i] = c;
    }

    /* JADX INFO: renamed from: a */
    private void m225a(String str) throws IOException {
        int length = str.length();
        int i = 0;
        while (length > 0) {
            if (this.f244b == 8192) {
                m223a();
            }
            int i2 = 8192 - this.f244b;
            if (i2 > length) {
                i2 = length;
            }
            str.getChars(i, i + i2, this.f243a, this.f244b);
            i += i2;
            length -= i2;
            this.f244b = i2 + this.f244b;
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m226a(String str, int i) throws IOException {
        int i2 = 0;
        while (i2 < str.length()) {
            char cCharAt = str.charAt(i2);
            switch (cCharAt) {
                case '\t':
                case '\n':
                case '\r':
                    if (i != -1) {
                        m225a("&#" + ((int) cCharAt) + ';');
                    }
                    i2++;
                    break;
                case '&':
                    if (i2 + 4 < str.length() && str.charAt(i2 + 1) == 'a' && str.charAt(i2 + 2) == 'm' && str.charAt(i2 + 3) == 'p' && str.charAt(i2 + 4) == ';') {
                        i2 += 4;
                        m225a("&amp;");
                        continue;
                    } else if (i2 + 3 < str.length() && str.charAt(i2 + 1) == 'l' && str.charAt(i2 + 2) == 't' && str.charAt(i2 + 3) == ';') {
                        i2 += 3;
                        m225a("&lt;");
                    } else {
                        m225a("&amp;");
                    }
                    i2++;
                    break;
                case C0327R.styleable.AppCompatTheme_toolbarStyle /* 60 */:
                    m225a("&lt;");
                    continue;
                    i2++;
                    break;
                default:
                    if (cCharAt == i) {
                        m225a(cCharAt == '\"' ? "&quot;" : "&apos;");
                        continue;
                    }
                    i2++;
                    break;
            }
            m224a(cCharAt);
            i2++;
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m227a(boolean z) throws IOException {
        if (this.f246d) {
            this.f248f++;
            this.f246d = false;
            if (this.f252j.length <= this.f248f) {
                boolean[] zArr = new boolean[this.f248f + 4];
                System.arraycopy(this.f252j, 0, zArr, 0, this.f248f);
                this.f252j = zArr;
            }
            this.f252j[this.f248f] = this.f252j[this.f248f - 1];
            for (int i = this.f250h[this.f248f - 1]; i < this.f250h[this.f248f]; i++) {
                m225a(" xmlns");
                if (!this.f251i[i << 1].isEmpty()) {
                    m224a(':');
                    m225a(this.f251i[i << 1]);
                } else if (getNamespace().isEmpty() && !this.f251i[(i << 1) + 1].isEmpty()) {
                    throw new IllegalStateException("Cannot set default namespace for elements in no namespace");
                }
                m225a("=\"");
                m226a(this.f251i[(i << 1) + 1], 34);
                m224a('\"');
            }
            if (this.f250h.length <= this.f248f + 1) {
                int[] iArr = new int[this.f248f + 8];
                System.arraycopy(this.f250h, 0, iArr, 0, this.f248f + 1);
                this.f250h = iArr;
            }
            this.f250h[this.f248f + 1] = this.f250h[this.f248f];
            if (z) {
                m225a(" />");
            } else {
                m224a('>');
            }
        }
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final XmlSerializer attribute(String str, String str2, String str3) throws IOException {
        if (!this.f246d) {
            throw new IllegalStateException("illegal position for attribute");
        }
        if (str == null) {
            str = "";
        }
        String strM222a = str.isEmpty() ? "" : m222a(str, false, true);
        m224a(' ');
        if (!strM222a.isEmpty()) {
            m225a(strM222a);
            m224a(':');
        }
        m225a(str2);
        m224a('=');
        char c = str3.indexOf(34) == -1 ? '\"' : '\'';
        m224a(c);
        m226a(str3, c);
        m224a(c);
        return this;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void cdsect(String str) throws IOException {
        m227a(false);
        String strReplace = str.replace("]]>", "]]]]><![CDATA[>");
        m225a("<![CDATA[");
        int i = 0;
        while (i < strReplace.length()) {
            char cCharAt = strReplace.charAt(i);
            if ((cCharAt >= ' ' && cCharAt <= 55295) || cCharAt == '\t' || cCharAt == '\n' || cCharAt == '\r' || (cCharAt >= 57344 && cCharAt <= 65533)) {
                m224a(cCharAt);
            } else if (!Character.isHighSurrogate(cCharAt) || i >= strReplace.length() - 1) {
                Log.e("APKEDITOR", "Illegal character (U+" + Integer.toHexString(cCharAt) + ")");
            } else {
                m225a("]]>");
                i++;
                char cCharAt2 = strReplace.charAt(i);
                if (!Character.isLowSurrogate(cCharAt2)) {
                    throw new IllegalArgumentException("Bad surrogate pair (U+" + Integer.toHexString(cCharAt) + " U+" + Integer.toHexString(cCharAt2) + ")");
                }
                m225a("&#" + Character.toCodePoint(cCharAt, cCharAt2) + ";");
                m225a("<![CDATA[");
            }
            i++;
        }
        m225a("]]>");
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void comment(String str) throws IOException {
        m227a(false);
        m225a("<!--");
        m225a(str);
        m225a("-->");
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void docdecl(String str) throws IOException {
        m225a("<!DOCTYPE");
        m225a(str);
        m224a('>');
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void endDocument() throws IOException {
        while (this.f248f > 0) {
            endTag(this.f249g[(this.f248f * 3) - 3], this.f249g[(this.f248f * 3) - 1]);
        }
        flush();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final XmlSerializer endTag(String str, String str2) throws IOException {
        if (!this.f246d) {
            this.f248f--;
        }
        if ((str == null && this.f249g[this.f248f * 3] != null) || ((str != null && !str.equals(this.f249g[this.f248f * 3])) || !this.f249g[(this.f248f * 3) + 2].equals(str2))) {
            throw new IllegalArgumentException("</{" + str + "}" + str2 + "> does not match start");
        }
        if (this.f246d) {
            m227a(true);
            this.f248f--;
        } else {
            if (this.f252j[this.f248f + 1]) {
                m225a("\r\n");
                for (int i = 0; i < this.f248f; i++) {
                    m225a("  ");
                }
            }
            m225a("</");
            String str3 = this.f249g[(this.f248f * 3) + 1];
            if (!str3.isEmpty()) {
                m225a(str3);
                m224a(':');
            }
            m225a(str2);
            m224a('>');
        }
        this.f250h[this.f248f + 1] = this.f250h[this.f248f];
        return this;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void entityRef(String str) throws IOException {
        m227a(false);
        m224a('&');
        m225a(str);
        m224a(';');
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void flush() throws IOException {
        m227a(false);
        m223a();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final int getDepth() {
        return this.f246d ? this.f248f + 1 : this.f248f;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final boolean getFeature(String str) {
        if ("http://xmlpull.org/v1/doc/features.html#indent-output".equals(str)) {
            return this.f252j[this.f248f];
        }
        return false;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final String getName() {
        if (getDepth() == 0) {
            return null;
        }
        return this.f249g[(getDepth() * 3) - 1];
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final String getNamespace() {
        if (getDepth() == 0) {
            return null;
        }
        return this.f249g[(getDepth() * 3) - 3];
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final String getPrefix(String str, boolean z) {
        try {
            return m222a(str, false, z);
        } catch (IOException e) {
            throw new RuntimeException(e.toString());
        }
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final Object getProperty(String str) {
        throw new RuntimeException("Unsupported property");
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void ignorableWhitespace(String str) throws IOException {
        m227a(false);
        this.f252j[this.f248f] = false;
        m225a(str);
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void processingInstruction(String str) throws IOException {
        m227a(false);
        m225a("<?");
        m225a(str);
        m225a("?>");
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void setFeature(String str, boolean z) {
        if (!"http://xmlpull.org/v1/doc/features.html#indent-output".equals(str)) {
            throw new RuntimeException("Unsupported Feature");
        }
        this.f252j[this.f248f] = z;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void setOutput(OutputStream outputStream, String str) {
        if (outputStream == null) {
            throw new IllegalArgumentException("os == null");
        }
        setOutput(str == null ? new OutputStreamWriter(outputStream) : new OutputStreamWriter(outputStream, str));
        this.f253k = str;
        if (str != null) {
            str.toLowerCase(Locale.US).startsWith("utf");
        }
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void setOutput(Writer writer) {
        this.f245c = writer;
        this.f250h[0] = 2;
        this.f250h[1] = 2;
        this.f251i[0] = "";
        this.f251i[1] = "";
        this.f251i[2] = "xml";
        this.f251i[3] = "http://www.w3.org/XML/1998/namespace";
        this.f246d = false;
        this.f247e = 0;
        this.f248f = 0;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void setPrefix(String str, String str2) throws IOException {
        m227a(false);
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        if (str.equals(m222a(str2, true, false))) {
            return;
        }
        int[] iArr = this.f250h;
        int i = this.f248f + 1;
        int i2 = iArr[i];
        iArr[i] = i2 + 1;
        int i3 = i2 << 1;
        if (this.f251i.length < i3 + 1) {
            String[] strArr = new String[this.f251i.length + 16];
            System.arraycopy(this.f251i, 0, strArr, 0, i3);
            this.f251i = strArr;
        }
        this.f251i[i3] = str;
        this.f251i[i3 + 1] = str2;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void setProperty(String str, Object obj) {
        throw new RuntimeException("Unsupported Property:" + obj);
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void startDocument(String str, Boolean bool) throws IOException {
        m225a("<?xml version=\"1.0\" ");
        if (str != null) {
            this.f253k = str;
            str.toLowerCase(Locale.US).startsWith("utf");
        }
        if (this.f253k != null) {
            m225a("encoding=\"");
            m225a(this.f253k);
            m225a("\" ");
        }
        if (bool != null) {
            m225a("standalone='");
            m225a(bool.booleanValue() ? "yes" : "no");
            m225a("' ");
        }
        m225a("?>");
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final XmlSerializer startTag(String str, String str2) throws IOException {
        m227a(false);
        if (this.f252j[this.f248f]) {
            m225a("\r\n");
            for (int i = 0; i < this.f248f; i++) {
                m225a("  ");
            }
        }
        int i2 = this.f248f * 3;
        if (this.f249g.length < i2 + 3) {
            String[] strArr = new String[this.f249g.length + 12];
            System.arraycopy(this.f249g, 0, strArr, 0, i2);
            this.f249g = strArr;
        }
        String strM222a = str == null ? "" : m222a(str, true, true);
        if (str != null && str.isEmpty()) {
            for (int i3 = this.f250h[this.f248f]; i3 < this.f250h[this.f248f + 1]; i3++) {
                if (this.f251i[i3 << 1].isEmpty() && !this.f251i[(i3 << 1) + 1].isEmpty()) {
                    throw new IllegalStateException("Cannot set default namespace for elements in no namespace");
                }
            }
        }
        int i4 = i2 + 1;
        this.f249g[i2] = str;
        this.f249g[i4] = strM222a;
        this.f249g[i4 + 1] = str2;
        m224a('<');
        if (!strM222a.isEmpty()) {
            m225a(strM222a);
            m224a(':');
        }
        m225a(str2);
        this.f246d = true;
        return this;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final XmlSerializer text(String str) throws IOException {
        m227a(false);
        this.f252j[this.f248f] = false;
        m226a(str, -1);
        return this;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final XmlSerializer text(char[] cArr, int i, int i2) throws IOException {
        text(new String(cArr, i, i2));
        return this;
    }
}
