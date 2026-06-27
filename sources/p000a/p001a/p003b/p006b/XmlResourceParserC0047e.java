package p000a.p001a.p003b.p006b;

import android.content.res.XmlResourceParser;
import android.support.v4.internal.view.SupportMenu;
import android.util.TypedValue;
import com.gmail.heagoo.p084a.p089c.C1067a;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.xmlpull.v1.XmlPullParserException;
import p000a.p001a.C0000a;
import p000a.p001a.p003b.p004a.C0028b;
import p000a.p014d.C0086f;

/* JADX INFO: renamed from: a.a.b.b.e */
/* JADX INFO: loaded from: classes.dex */
public class XmlResourceParserC0047e implements XmlResourceParser {

    /* JADX INFO: renamed from: t */
    private static final Logger f129t = Logger.getLogger(XmlResourceParserC0047e.class.getName());

    /* JADX INFO: renamed from: b */
    private String f131b;

    /* JADX INFO: renamed from: c */
    private C0086f f132c;

    /* JADX INFO: renamed from: d */
    private C0051i f133d;

    /* JADX INFO: renamed from: e */
    private C0000a f134e;

    /* JADX INFO: renamed from: g */
    private C0056n f136g;

    /* JADX INFO: renamed from: h */
    private int[] f137h;

    /* JADX INFO: renamed from: k */
    private boolean f140k;

    /* JADX INFO: renamed from: l */
    private int f141l;

    /* JADX INFO: renamed from: m */
    private int f142m;

    /* JADX INFO: renamed from: n */
    private int f143n;

    /* JADX INFO: renamed from: o */
    private int f144o;

    /* JADX INFO: renamed from: p */
    private int[] f145p;

    /* JADX INFO: renamed from: q */
    private int f146q;

    /* JADX INFO: renamed from: r */
    private int f147r;

    /* JADX INFO: renamed from: s */
    private int f148s;

    /* JADX INFO: renamed from: a */
    private boolean f130a = false;

    /* JADX INFO: renamed from: f */
    private boolean f135f = false;

    /* JADX INFO: renamed from: i */
    private C0048f f138i = new C0048f();

    /* JADX INFO: renamed from: j */
    private String f139j = "http://schemas.android.com/apk/res/android";

    public XmlResourceParserC0047e() {
        m117a();
    }

    /* JADX INFO: renamed from: a */
    private final int m115a(int i) {
        if (this.f141l != 2) {
            throw new IndexOutOfBoundsException("Current event is not START_TAG.");
        }
        int i2 = i * 5;
        if (i2 >= this.f145p.length) {
            throw new IndexOutOfBoundsException("Invalid attribute index (" + i + ").");
        }
        return i2;
    }

    /* JADX INFO: renamed from: a */
    private final int m116a(String str, String str2) {
        int iM153a;
        if (this.f136g == null || str2 == null || (iM153a = this.f136g.m153a(str2)) == -1) {
            return -1;
        }
        int iM153a2 = str != null ? this.f136g.m153a(str) : -1;
        for (int i = 0; i != this.f145p.length; i += 5) {
            if (iM153a == this.f145p[i + 1] && (iM153a2 == -1 || iM153a2 == this.f145p[i])) {
                return i / 5;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: a */
    private final void m117a() {
        this.f141l = -1;
        this.f142m = -1;
        this.f143n = -1;
        this.f144o = -1;
        this.f145p = null;
        this.f146q = -1;
        this.f147r = -1;
        this.f148s = -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a4, code lost:
    
        throw new java.io.IOException("Invalid resource ids size (" + r1 + ").");
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00da, code lost:
    
        throw new java.io.IOException("Invalid chunk type (" + r1 + ").");
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m118b() throws IOException {
        if (this.f136g == null) {
            int i = this.f132c.readInt();
            if (i != 524291) {
                throw new IOException(String.format("Expected: 0x%08x, got: 0x%08x", 524291, Integer.valueOf(i)));
            }
            this.f132c.skipBytes(4);
            this.f136g = C0056n.m145a(this.f132c);
            this.f138i.m132e();
            this.f135f = true;
        }
        if (this.f141l == 1) {
            return;
        }
        int i2 = this.f141l;
        m117a();
        while (true) {
            if (this.f140k) {
                this.f140k = false;
                this.f138i.m133f();
            }
            if (i2 == 3 && this.f138i.m130d() == 1 && this.f138i.m126b() == 0) {
                this.f141l = 1;
                return;
            }
            int i3 = i2 == 0 ? 1048834 : this.f132c.readInt();
            if (i3 == 524672) {
                int i4 = this.f132c.readInt();
                if (i4 < 8 || i4 % 4 != 0) {
                    break;
                } else {
                    this.f137h = this.f132c.m211a((i4 / 4) - 2);
                }
            } else {
                if (i3 < 1048832 || i3 > 1048836) {
                    break;
                }
                if (i3 == 1048834 && i2 == -1) {
                    this.f141l = 0;
                    return;
                }
                this.f132c.skipBytes(4);
                int i5 = this.f132c.readInt();
                this.f132c.skipBytes(4);
                if (i3 != 1048832 && i3 != 1048833) {
                    this.f142m = i5;
                    if (i3 == 1048834) {
                        this.f144o = this.f132c.readInt();
                        this.f143n = this.f132c.readInt();
                        this.f132c.skipBytes(4);
                        int i6 = this.f132c.readInt();
                        this.f146q = (i6 >>> 16) - 1;
                        int i7 = i6 & SupportMenu.USER_MASK;
                        this.f147r = this.f132c.readInt();
                        this.f148s = (this.f147r >>> 16) - 1;
                        this.f147r = (this.f147r & SupportMenu.USER_MASK) - 1;
                        this.f145p = this.f132c.m211a(i7 * 5);
                        for (int i8 = 3; i8 < this.f145p.length; i8 += 5) {
                            this.f145p[i8] = this.f145p[i8] >>> 24;
                        }
                        this.f138i.m132e();
                        this.f141l = 2;
                        return;
                    }
                    if (i3 == 1048835) {
                        this.f144o = this.f132c.readInt();
                        this.f143n = this.f132c.readInt();
                        this.f141l = 3;
                        this.f140k = true;
                        return;
                    }
                    if (i3 == 1048836) {
                        this.f143n = this.f132c.readInt();
                        this.f132c.skipBytes(4);
                        this.f132c.skipBytes(4);
                        this.f141l = 4;
                        return;
                    }
                } else if (i3 == 1048832) {
                    this.f138i.m125a(this.f132c.readInt(), this.f132c.readInt());
                } else {
                    this.f132c.skipBytes(4);
                    this.f132c.skipBytes(4);
                    this.f138i.m129c();
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m119a(C0051i c0051i) {
        this.f133d = c0051i;
    }

    /* JADX INFO: renamed from: a */
    public final void m120a(boolean z) {
        this.f130a = z;
    }

    @Override // android.content.res.XmlResourceParser, java.lang.AutoCloseable
    public void close() {
        if (this.f135f) {
            this.f135f = false;
            this.f132c = null;
            this.f136g = null;
            this.f137h = null;
            this.f138i.m124a();
            m117a();
        }
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public void defineEntityReplacementText(String str, String str2) throws XmlPullParserException {
        throw new XmlPullParserException("Method is not supported.");
    }

    @Override // android.util.AttributeSet
    public boolean getAttributeBooleanValue(int i, boolean z) {
        return getAttributeIntValue(i, z ? 1 : 0) != 0;
    }

    @Override // android.util.AttributeSet
    public boolean getAttributeBooleanValue(String str, String str2, boolean z) {
        int iM116a = m116a(str, str2);
        return iM116a == -1 ? z : getAttributeBooleanValue(iM116a, z);
    }

    @Override // org.xmlpull.v1.XmlPullParser, android.util.AttributeSet
    public int getAttributeCount() {
        if (this.f141l != 2) {
            return -1;
        }
        return this.f145p.length / 5;
    }

    @Override // android.util.AttributeSet
    public float getAttributeFloatValue(int i, float f) {
        int iM115a = m115a(i);
        return this.f145p[iM115a + 3] == 4 ? Float.intBitsToFloat(this.f145p[iM115a + 4]) : f;
    }

    @Override // android.util.AttributeSet
    public float getAttributeFloatValue(String str, String str2, float f) {
        int iM116a = m116a(str, str2);
        return iM116a == -1 ? f : getAttributeFloatValue(iM116a, f);
    }

    @Override // android.util.AttributeSet
    public int getAttributeIntValue(int i, int i2) {
        int iM115a = m115a(i);
        int i3 = this.f145p[iM115a + 3];
        return (i3 < 16 || i3 > 31) ? i2 : this.f145p[iM115a + 4];
    }

    @Override // android.util.AttributeSet
    public int getAttributeIntValue(String str, String str2, int i) {
        int iM116a = m116a(str, str2);
        return iM116a == -1 ? i : getAttributeIntValue(iM116a, i);
    }

    @Override // android.util.AttributeSet
    public int getAttributeListValue(int i, String[] strArr, int i2) {
        return 0;
    }

    @Override // android.util.AttributeSet
    public int getAttributeListValue(String str, String str2, String[] strArr, int i) {
        return 0;
    }

    @Override // org.xmlpull.v1.XmlPullParser, android.util.AttributeSet
    public String getAttributeName(int i) {
        int i2 = this.f145p[m115a(i) + 1];
        if (i2 == -1) {
            return "";
        }
        try {
            int attributeNameResource = getAttributeNameResource(i);
            if (attributeNameResource != 0) {
                return this.f133d.m139a(attributeNameResource);
            }
        } catch (C0000a e) {
        } catch (NullPointerException e2) {
        }
        return this.f136g.m154a(i2);
    }

    @Override // android.util.AttributeSet
    public int getAttributeNameResource(int i) {
        int i2 = this.f145p[m115a(i) + 1];
        if (this.f137h == null || i2 < 0 || i2 >= this.f137h.length) {
            return 0;
        }
        return this.f137h[i2];
    }

    @Override // android.content.res.XmlResourceParser, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet
    public String getAttributeNamespace(int i) {
        int iM115a = m115a(i);
        int i2 = this.f145p[iM115a];
        if (i2 == -1) {
            return "";
        }
        String strM154a = this.f136g.m154a(i2);
        if (strM154a != null && strM154a.length() != 0) {
            return strM154a;
        }
        int i3 = this.f145p[iM115a + 1];
        if (this.f137h == null || i3 < 0 || i3 >= this.f137h.length || (this.f137h[i3] & 2130706432) != 2130706432) {
            return this.f136g.m154a(i3).length() == 0 ? this.f139j : strM154a;
        }
        if (this.f131b == null) {
            int i4 = 0;
            while (true) {
                if (i4 < this.f136g.m152a()) {
                    String strM154a2 = this.f136g.m154a(i4);
                    if (strM154a2 != null && strM154a2.startsWith("http://") && !strM154a2.equals(this.f139j)) {
                        this.f131b = strM154a2;
                        break;
                    }
                    i4++;
                } else {
                    break;
                }
            }
        }
        String str = this.f131b;
        if (str == null) {
            str = strM154a;
        }
        return str;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public String getAttributePrefix(int i) {
        int iM131d = this.f138i.m131d(this.f145p[m115a(i)]);
        return iM131d == -1 ? "" : this.f136g.m154a(iM131d);
    }

    @Override // android.util.AttributeSet
    public int getAttributeResourceValue(int i, int i2) {
        int iM115a = m115a(i);
        return this.f145p[iM115a + 3] == 1 ? this.f145p[iM115a + 4] : i2;
    }

    @Override // android.util.AttributeSet
    public int getAttributeResourceValue(String str, String str2, int i) {
        int iM116a = m116a(str, str2);
        return iM116a == -1 ? i : getAttributeResourceValue(iM116a, i);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public String getAttributeType(int i) {
        return "CDATA";
    }

    @Override // android.util.AttributeSet
    public int getAttributeUnsignedIntValue(int i, int i2) {
        return getAttributeIntValue(i, i2);
    }

    @Override // android.util.AttributeSet
    public int getAttributeUnsignedIntValue(String str, String str2, int i) {
        int iM116a = m116a(str, str2);
        return iM116a == -1 ? i : getAttributeUnsignedIntValue(iM116a, i);
    }

    @Override // org.xmlpull.v1.XmlPullParser, android.util.AttributeSet
    public String getAttributeValue(int i) {
        String strM2460a;
        int iM115a = m115a(i);
        int i2 = this.f145p[iM115a + 3];
        int i3 = this.f145p[iM115a + 4];
        int i4 = this.f145p[iM115a + 2];
        if (this.f133d != null) {
            if (i4 == -1) {
                strM2460a = null;
            } else {
                try {
                    strM2460a = C1067a.m2460a(this.f136g.m154a(i4));
                } catch (C0000a e) {
                    if (this.f134e == null) {
                        this.f134e = e;
                    }
                    f129t.log(Level.WARNING, String.format("Could not decode attr value, using raw value instead: ns=%s, name=%s, value=0x%08x", getAttributePrefix(i), getAttributeName(i), Integer.valueOf(i3)), (Throwable) e);
                }
            }
            return this.f133d.m140a(i2, i3, (this.f130a && (i3 & 2130706432) == 2130706432) ? null : strM2460a, getAttributeNameResource(i));
        }
        return TypedValue.coerceToString(i2, i3);
    }

    @Override // org.xmlpull.v1.XmlPullParser, android.util.AttributeSet
    public String getAttributeValue(String str, String str2) {
        int iM116a = m116a(str, str2);
        return iM116a == -1 ? "" : getAttributeValue(iM116a);
    }

    @Override // android.util.AttributeSet
    public String getClassAttribute() {
        if (this.f147r == -1) {
            return null;
        }
        return this.f136g.m154a(this.f145p[m115a(this.f147r) + 2]);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public int getColumnNumber() {
        return -1;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public int getDepth() {
        return this.f138i.m130d() - 1;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public int getEventType() {
        return this.f141l;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public boolean getFeature(String str) {
        return false;
    }

    @Override // android.util.AttributeSet
    public String getIdAttribute() {
        if (this.f146q == -1) {
            return null;
        }
        return this.f136g.m154a(this.f145p[m115a(this.f146q) + 2]);
    }

    @Override // android.util.AttributeSet
    public int getIdAttributeResourceValue(int i) {
        if (this.f146q == -1) {
            return i;
        }
        int iM115a = m115a(this.f146q);
        return this.f145p[iM115a + 3] == 1 ? this.f145p[iM115a + 4] : i;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public String getInputEncoding() {
        return null;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public int getLineNumber() {
        return this.f142m;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public String getName() {
        if (this.f143n == -1 || !(this.f141l == 2 || this.f141l == 3)) {
            return null;
        }
        return this.f136g.m154a(this.f143n);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public String getNamespace() {
        return this.f136g.m154a(this.f144o);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public String getNamespace(String str) {
        throw new RuntimeException("Method is not supported.");
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public int getNamespaceCount(int i) {
        return this.f138i.m123a(i);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public String getNamespacePrefix(int i) {
        return this.f136g.m154a(this.f138i.m127b(i));
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public String getNamespaceUri(int i) {
        return this.f136g.m154a(this.f138i.m128c(i));
    }

    @Override // org.xmlpull.v1.XmlPullParser, android.util.AttributeSet
    public String getPositionDescription() {
        return "XML line #" + getLineNumber();
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public String getPrefix() {
        return this.f136g.m154a(this.f138i.m131d(this.f144o));
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public Object getProperty(String str) {
        return null;
    }

    @Override // android.util.AttributeSet
    public int getStyleAttribute() {
        if (this.f148s == -1) {
            return 0;
        }
        return this.f145p[m115a(this.f148s) + 4];
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public String getText() {
        if (this.f143n == -1 || this.f141l != 4) {
            return null;
        }
        return this.f136g.m154a(this.f143n);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public char[] getTextCharacters(int[] iArr) {
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
    public boolean isAttributeDefault(int i) {
        return false;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public boolean isEmptyElementTag() {
        return false;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public boolean isWhitespace() {
        return false;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public int next() throws XmlPullParserException, IOException {
        if (this.f132c == null) {
            throw new XmlPullParserException("Parser is null.", this, null);
        }
        try {
            m118b();
            return this.f141l;
        } catch (IOException e) {
            close();
            throw e;
        }
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public int nextTag() throws XmlPullParserException, IOException {
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
    public String nextText() throws XmlPullParserException, IOException {
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
    public int nextToken() {
        return next();
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public void require(int i, String str, String str2) throws XmlPullParserException {
        if (i != getEventType() || ((str != null && !str.equals(getNamespace())) || (str2 != null && !str2.equals(getName())))) {
            throw new XmlPullParserException(TYPES[i] + " is expected.", this, null);
        }
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public void setFeature(String str, boolean z) throws XmlPullParserException {
        throw new XmlPullParserException("Method is not supported.");
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public void setInput(InputStream inputStream, String str) {
        close();
        if (inputStream != null) {
            this.f132c = new C0086f(new C0028b(inputStream));
        }
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public void setInput(Reader reader) throws XmlPullParserException {
        throw new XmlPullParserException("Method is not supported.");
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public void setProperty(String str, Object obj) throws XmlPullParserException {
        throw new XmlPullParserException("Method is not supported.");
    }
}
