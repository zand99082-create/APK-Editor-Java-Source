package com.gmail.heagoo.p084a.p085a.p086a.p087a;

import android.content.res.XmlResourceParser;
import android.support.v4.internal.view.SupportMenu;
import jadx.core.deobf.Deobfuscator;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: com.gmail.heagoo.a.a.a.a.a */
/* JADX INFO: loaded from: classes.dex */
public final class XmlResourceParserC1052a implements XmlResourceParser {

    /* JADX INFO: renamed from: a */
    private C1054c f2766a;

    /* JADX INFO: renamed from: c */
    private C1055d f2768c;

    /* JADX INFO: renamed from: d */
    private int[] f2769d;

    /* JADX INFO: renamed from: f */
    private boolean f2771f;

    /* JADX INFO: renamed from: g */
    private int f2772g;

    /* JADX INFO: renamed from: h */
    private int f2773h;

    /* JADX INFO: renamed from: i */
    private int f2774i;

    /* JADX INFO: renamed from: j */
    private int f2775j;

    /* JADX INFO: renamed from: k */
    private int[] f2776k;

    /* JADX INFO: renamed from: l */
    private int f2777l;

    /* JADX INFO: renamed from: m */
    private int f2778m;

    /* JADX INFO: renamed from: n */
    private int f2779n;

    /* JADX INFO: renamed from: b */
    private boolean f2767b = false;

    /* JADX INFO: renamed from: e */
    private C1053b f2770e = new C1053b();

    public XmlResourceParserC1052a() {
        m2384a();
    }

    /* JADX INFO: renamed from: a */
    private final int m2383a(String str, String str2) {
        int iM2415a;
        if (this.f2768c == null || str2 == null || (iM2415a = this.f2768c.m2415a(str2)) == -1) {
            return -1;
        }
        int iM2415a2 = str != null ? this.f2768c.m2415a(str) : -1;
        for (int i = 0; i != this.f2776k.length; i++) {
            if (iM2415a == this.f2776k[i + 1] && (iM2415a2 == -1 || iM2415a2 == this.f2776k[i])) {
                return i / 5;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: a */
    private final void m2384a() {
        this.f2772g = -1;
        this.f2773h = -1;
        this.f2774i = -1;
        this.f2775j = -1;
        this.f2776k = null;
        this.f2777l = -1;
        this.f2778m = -1;
        this.f2779n = -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b6, code lost:
    
        throw new java.io.IOException("Invalid resource ids size (" + r1 + ").");
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ec, code lost:
    
        throw new java.io.IOException("Invalid chunk type (" + r1 + ").");
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m2385b() throws IOException {
        if (this.f2768c == null) {
            int iM2409c = this.f2766a.m2409c();
            if (iM2409c != 524291) {
                throw new IOException("Expected chunk of type 0x" + Integer.toHexString(524291) + ", read 0x" + Integer.toHexString(iM2409c) + Deobfuscator.CLASS_NAME_SEPARATOR);
            }
            this.f2766a.m2410d();
            this.f2768c = C1055d.m2412a(this.f2766a);
            this.f2770e.m2401e();
            this.f2767b = true;
        }
        if (this.f2772g == 1) {
            return;
        }
        int i = this.f2772g;
        m2384a();
        while (true) {
            if (this.f2771f) {
                this.f2771f = false;
                this.f2770e.m2402f();
            }
            if (i == 3 && this.f2770e.m2399d() == 1 && this.f2770e.m2395b() == 0) {
                this.f2772g = 1;
                return;
            }
            int iM2409c2 = i == 0 ? 1048834 : this.f2766a.m2409c();
            if (iM2409c2 == 524672) {
                int iM2409c3 = this.f2766a.m2409c();
                if (iM2409c3 < 8 || iM2409c3 % 4 != 0) {
                    break;
                } else {
                    this.f2769d = this.f2766a.m2407a((iM2409c3 / 4) - 2);
                }
            } else {
                if (iM2409c2 < 1048832 || iM2409c2 > 1048836) {
                    break;
                }
                if (iM2409c2 == 1048834 && i == -1) {
                    this.f2772g = 0;
                    return;
                }
                this.f2766a.m2410d();
                int iM2409c4 = this.f2766a.m2409c();
                this.f2766a.m2410d();
                if (iM2409c2 != 1048832 && iM2409c2 != 1048833) {
                    this.f2773h = iM2409c4;
                    if (iM2409c2 == 1048834) {
                        this.f2775j = this.f2766a.m2409c();
                        this.f2774i = this.f2766a.m2409c();
                        this.f2766a.m2410d();
                        int iM2409c5 = this.f2766a.m2409c();
                        this.f2777l = (iM2409c5 >>> 16) - 1;
                        int i2 = iM2409c5 & SupportMenu.USER_MASK;
                        this.f2778m = this.f2766a.m2409c();
                        this.f2779n = (this.f2778m >>> 16) - 1;
                        this.f2778m = (this.f2778m & SupportMenu.USER_MASK) - 1;
                        this.f2776k = this.f2766a.m2407a(i2 * 5);
                        for (int i3 = 3; i3 < this.f2776k.length; i3 += 5) {
                            this.f2776k[i3] = this.f2776k[i3] >>> 24;
                        }
                        this.f2770e.m2401e();
                        this.f2772g = 2;
                        return;
                    }
                    if (iM2409c2 == 1048835) {
                        this.f2775j = this.f2766a.m2409c();
                        this.f2774i = this.f2766a.m2409c();
                        this.f2772g = 3;
                        this.f2771f = true;
                        return;
                    }
                    if (iM2409c2 == 1048836) {
                        this.f2774i = this.f2766a.m2409c();
                        this.f2766a.m2410d();
                        this.f2766a.m2410d();
                        this.f2772g = 4;
                        return;
                    }
                } else if (iM2409c2 == 1048832) {
                    this.f2770e.m2394a(this.f2766a.m2409c(), this.f2766a.m2409c());
                } else {
                    this.f2766a.m2410d();
                    this.f2766a.m2410d();
                    this.f2770e.m2398c();
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private final int m2386c(int i) {
        if (this.f2772g != 2) {
            throw new IndexOutOfBoundsException("Current event is not START_TAG.");
        }
        int i2 = i * 5;
        if (i2 >= this.f2776k.length) {
            throw new IndexOutOfBoundsException("Invalid attribute index (" + i + ").");
        }
        return i2;
    }

    /* JADX INFO: renamed from: a */
    public final int m2387a(int i) {
        return this.f2776k[m2386c(i) + 3];
    }

    /* JADX INFO: renamed from: a */
    public final void m2388a(InputStream inputStream) {
        close();
        if (inputStream != null) {
            this.f2766a = new C1054c(inputStream, false);
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m2389b(int i) {
        return this.f2776k[m2386c(i) + 4];
    }

    @Override // android.content.res.XmlResourceParser, java.lang.AutoCloseable
    public final void close() {
        if (this.f2767b) {
            this.f2767b = false;
            this.f2766a.m2405a();
            this.f2766a = null;
            this.f2768c = null;
            this.f2769d = null;
            this.f2770e.m2393a();
            m2384a();
        }
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final void defineEntityReplacementText(String str, String str2) throws XmlPullParserException {
        throw new XmlPullParserException("Method is not supported.");
    }

    @Override // android.util.AttributeSet
    public final boolean getAttributeBooleanValue(int i, boolean z) {
        return getAttributeIntValue(i, z ? 1 : 0) != 0;
    }

    @Override // android.util.AttributeSet
    public final boolean getAttributeBooleanValue(String str, String str2, boolean z) {
        int iM2383a = m2383a(str, str2);
        return iM2383a == -1 ? z : getAttributeBooleanValue(iM2383a, z);
    }

    @Override // org.xmlpull.v1.XmlPullParser, android.util.AttributeSet
    public final int getAttributeCount() {
        if (this.f2772g != 2) {
            return -1;
        }
        return this.f2776k.length / 5;
    }

    @Override // android.util.AttributeSet
    public final float getAttributeFloatValue(int i, float f) {
        int iM2386c = m2386c(i);
        return this.f2776k[iM2386c + 3] == 4 ? Float.intBitsToFloat(this.f2776k[iM2386c + 4]) : f;
    }

    @Override // android.util.AttributeSet
    public final float getAttributeFloatValue(String str, String str2, float f) {
        int iM2383a = m2383a(str, str2);
        return iM2383a == -1 ? f : getAttributeFloatValue(iM2383a, f);
    }

    @Override // android.util.AttributeSet
    public final int getAttributeIntValue(int i, int i2) {
        int iM2386c = m2386c(i);
        int i3 = this.f2776k[iM2386c + 3];
        return (i3 < 16 || i3 > 31) ? i2 : this.f2776k[iM2386c + 4];
    }

    @Override // android.util.AttributeSet
    public final int getAttributeIntValue(String str, String str2, int i) {
        int iM2383a = m2383a(str, str2);
        return iM2383a == -1 ? i : getAttributeIntValue(iM2383a, i);
    }

    @Override // android.util.AttributeSet
    public final int getAttributeListValue(int i, String[] strArr, int i2) {
        return 0;
    }

    @Override // android.util.AttributeSet
    public final int getAttributeListValue(String str, String str2, String[] strArr, int i) {
        return 0;
    }

    @Override // org.xmlpull.v1.XmlPullParser, android.util.AttributeSet
    public final String getAttributeName(int i) {
        int i2 = this.f2776k[m2386c(i) + 1];
        return i2 == -1 ? "" : this.f2768c.m2416a(i2);
    }

    @Override // android.util.AttributeSet
    public final int getAttributeNameResource(int i) {
        int i2 = this.f2776k[m2386c(i) + 1];
        if (this.f2769d == null || i2 < 0 || i2 >= this.f2769d.length) {
            return 0;
        }
        return this.f2769d[i2];
    }

    @Override // android.content.res.XmlResourceParser, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet
    public final String getAttributeNamespace(int i) {
        int i2 = this.f2776k[m2386c(i)];
        return i2 == -1 ? "" : this.f2768c.m2416a(i2);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String getAttributePrefix(int i) {
        int iM2400d = this.f2770e.m2400d(this.f2776k[m2386c(i)]);
        return iM2400d == -1 ? "" : this.f2768c.m2416a(iM2400d);
    }

    @Override // android.util.AttributeSet
    public final int getAttributeResourceValue(int i, int i2) {
        int iM2386c = m2386c(i);
        return this.f2776k[iM2386c + 3] == 1 ? this.f2776k[iM2386c + 4] : i2;
    }

    @Override // android.util.AttributeSet
    public final int getAttributeResourceValue(String str, String str2, int i) {
        int iM2383a = m2383a(str, str2);
        return iM2383a == -1 ? i : getAttributeResourceValue(iM2383a, i);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String getAttributeType(int i) {
        return "CDATA";
    }

    @Override // android.util.AttributeSet
    public final int getAttributeUnsignedIntValue(int i, int i2) {
        return getAttributeIntValue(i, i2);
    }

    @Override // android.util.AttributeSet
    public final int getAttributeUnsignedIntValue(String str, String str2, int i) {
        int iM2383a = m2383a(str, str2);
        return iM2383a == -1 ? i : getAttributeUnsignedIntValue(iM2383a, i);
    }

    @Override // org.xmlpull.v1.XmlPullParser, android.util.AttributeSet
    public final String getAttributeValue(int i) {
        int iM2386c = m2386c(i);
        if (this.f2776k[iM2386c + 3] != 3) {
            return "";
        }
        return this.f2768c.m2416a(this.f2776k[iM2386c + 2]);
    }

    @Override // org.xmlpull.v1.XmlPullParser, android.util.AttributeSet
    public final String getAttributeValue(String str, String str2) {
        int iM2383a = m2383a(str, str2);
        if (iM2383a == -1) {
            return null;
        }
        return getAttributeValue(iM2383a);
    }

    @Override // android.util.AttributeSet
    public final String getClassAttribute() {
        if (this.f2778m == -1) {
            return null;
        }
        return this.f2768c.m2416a(this.f2776k[m2386c(this.f2778m) + 2]);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final int getColumnNumber() {
        return -1;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final int getDepth() {
        return this.f2770e.m2399d() - 1;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final int getEventType() {
        return this.f2772g;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final boolean getFeature(String str) {
        return false;
    }

    @Override // android.util.AttributeSet
    public final String getIdAttribute() {
        if (this.f2777l == -1) {
            return null;
        }
        return this.f2768c.m2416a(this.f2776k[m2386c(this.f2777l) + 2]);
    }

    @Override // android.util.AttributeSet
    public final int getIdAttributeResourceValue(int i) {
        if (this.f2777l == -1) {
            return i;
        }
        int iM2386c = m2386c(this.f2777l);
        return this.f2776k[iM2386c + 3] == 1 ? this.f2776k[iM2386c + 4] : i;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String getInputEncoding() {
        return null;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final int getLineNumber() {
        return this.f2773h;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String getName() {
        if (this.f2774i == -1 || !(this.f2772g == 2 || this.f2772g == 3)) {
            return null;
        }
        return this.f2768c.m2416a(this.f2774i);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String getNamespace() {
        return this.f2768c.m2416a(this.f2775j);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String getNamespace(String str) {
        throw new RuntimeException("Method is not supported.");
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final int getNamespaceCount(int i) {
        return this.f2770e.m2392a(i);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String getNamespacePrefix(int i) {
        return this.f2768c.m2416a(this.f2770e.m2396b(i));
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String getNamespaceUri(int i) {
        return this.f2768c.m2416a(this.f2770e.m2397c(i));
    }

    @Override // org.xmlpull.v1.XmlPullParser, android.util.AttributeSet
    public final String getPositionDescription() {
        return "XML line #" + getLineNumber();
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String getPrefix() {
        return this.f2768c.m2416a(this.f2770e.m2400d(this.f2775j));
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final Object getProperty(String str) {
        return null;
    }

    @Override // android.util.AttributeSet
    public final int getStyleAttribute() {
        if (this.f2779n == -1) {
            return 0;
        }
        return this.f2776k[m2386c(this.f2779n) + 4];
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String getText() {
        if (this.f2774i == -1 || this.f2772g != 4) {
            return null;
        }
        return this.f2768c.m2416a(this.f2774i);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final char[] getTextCharacters(int[] iArr) {
        String text = getText();
        if (text == null) {
            return null;
        }
        iArr[0] = 0;
        iArr[1] = text.length();
        char[] cArr = new char[text.length()];
        text.getChars(0, text.length(), cArr, 0);
        return cArr;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final boolean isAttributeDefault(int i) {
        return false;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final boolean isEmptyElementTag() {
        return false;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final boolean isWhitespace() {
        return false;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final int next() throws XmlPullParserException, IOException {
        if (this.f2766a == null) {
            throw new XmlPullParserException("Parser is not opened.", this, null);
        }
        try {
            m2385b();
            return this.f2772g;
        } catch (IOException e) {
            close();
            throw e;
        }
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final int nextTag() throws XmlPullParserException, IOException {
        int next = next();
        if (next == 4 && isWhitespace()) {
            next = next();
        }
        if (next == 2 || next == 3) {
            return next;
        }
        throw new XmlPullParserException("Expected start or end tag.", this, null);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String nextText() throws XmlPullParserException, IOException {
        if (getEventType() != 2) {
            throw new XmlPullParserException("Parser must be on START_TAG to read next text.", this, null);
        }
        int next = next();
        if (next != 4) {
            if (next == 3) {
                return "";
            }
            throw new XmlPullParserException("Parser must be on START_TAG or TEXT to read text.", this, null);
        }
        String text = getText();
        if (next() != 3) {
            throw new XmlPullParserException("Event TEXT must be immediately followed by END_TAG.", this, null);
        }
        return text;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final int nextToken() {
        return next();
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final void require(int i, String str, String str2) throws XmlPullParserException {
        if (i != getEventType() || ((str != null && !str.equals(getNamespace())) || (str2 != null && !str2.equals(getName())))) {
            throw new XmlPullParserException(TYPES[i] + " is expected.", this, null);
        }
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final void setFeature(String str, boolean z) throws XmlPullParserException {
        throw new XmlPullParserException("Method is not supported.");
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final void setInput(InputStream inputStream, String str) throws XmlPullParserException {
        throw new XmlPullParserException("Method is not supported.");
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final void setInput(Reader reader) throws XmlPullParserException {
        throw new XmlPullParserException("Method is not supported.");
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final void setProperty(String str, Object obj) throws XmlPullParserException {
        throw new XmlPullParserException("Method is not supported.");
    }
}
