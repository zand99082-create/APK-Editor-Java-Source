package com.gmail.heagoo.apkeditor;

import androidx.versionedparcelable.InterfaceC0404d;
import com.gmail.heagoo.p084a.p089c.C1067a;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.xmlpull.v1.XmlPullParserException;
import p000a.p001a.C0000a;
import p000a.p001a.p003b.p004a.C0031e;
import p000a.p001a.p003b.p006b.C0051i;
import p000a.p001a.p003b.p006b.InterfaceC0053k;
import p000a.p001a.p003b.p006b.XmlResourceParserC0047e;
import p000a.p014d.C0087g;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.ix */
/* JADX INFO: loaded from: classes.dex */
public final class C1394ix implements InterfaceC0053k {

    /* JADX INFO: renamed from: b */
    private XmlResourceParserC0047e f4046b;

    /* JADX INFO: renamed from: c */
    private boolean f4047c = false;

    /* JADX INFO: renamed from: a */
    private C0087g f4045a = new C0087g();

    static {
        float[] fArr = {0.00390625f, 3.051758E-5f, 1.192093E-7f, 4.656613E-10f};
        String[] strArr = {"px", "dip", "sp", "pt", "in", "mm", "", ""};
        String[] strArr2 = {"%", "%p", "", "", "", "", "", ""};
    }

    public C1394ix(InterfaceC0404d interfaceC0404d, C0031e c0031e) {
        C0051i c0051i = new C0051i();
        c0051i.m141a(c0031e);
        this.f4046b = new XmlResourceParserC0047e();
        this.f4046b.m119a(c0051i);
    }

    /* JADX INFO: renamed from: a */
    private void m3450a(XmlResourceParserC0047e xmlResourceParserC0047e, int i) throws XmlPullParserException, IOException {
        switch (i) {
            case 0:
                this.f4045a.startDocument(xmlResourceParserC0047e.getInputEncoding(), null);
                break;
            case 1:
                this.f4045a.endDocument();
                break;
            case 2:
                this.f4045a.m221a(xmlResourceParserC0047e);
                for (int i2 = 0; i2 < xmlResourceParserC0047e.getAttributeCount(); i2++) {
                    this.f4045a.attribute(xmlResourceParserC0047e.getAttributeNamespace(i2), xmlResourceParserC0047e.getAttributeName(i2), xmlResourceParserC0047e.getAttributeValue(i2));
                }
                break;
            case 3:
                this.f4045a.endTag(xmlResourceParserC0047e.getNamespace(), xmlResourceParserC0047e.getName());
                break;
            case 4:
                this.f4045a.text(C1067a.m2516c(xmlResourceParserC0047e.getText()));
                break;
            case 5:
                this.f4045a.cdsect(xmlResourceParserC0047e.getText());
                break;
            case 6:
                this.f4045a.entityRef(xmlResourceParserC0047e.getName());
                break;
            case 7:
                this.f4045a.ignorableWhitespace(xmlResourceParserC0047e.getText());
                break;
            case 8:
                this.f4045a.processingInstruction(xmlResourceParserC0047e.getText());
                break;
            case 9:
                this.f4045a.comment(xmlResourceParserC0047e.getText());
                break;
            case 10:
                this.f4045a.docdecl(xmlResourceParserC0047e.getText());
                break;
        }
    }

    @Override // p000a.p001a.p003b.p006b.InterfaceC0053k
    /* JADX INFO: renamed from: a */
    public final void mo137a(InputStream inputStream, OutputStream outputStream) throws C0000a {
        try {
            this.f4045a.setOutput(outputStream, "utf-8");
            this.f4046b.setInput(inputStream, "utf-8");
            while (this.f4046b.nextToken() != 1) {
                try {
                    m3450a(this.f4046b, this.f4046b.getEventType());
                } catch (Exception e) {
                    throw new C0000a(e.getMessage());
                }
            }
            this.f4045a.endDocument();
        } catch (Exception e2) {
            throw new C0000a(e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m3451a(boolean z) {
        this.f4047c = true;
        this.f4046b.m120a(this.f4047c);
    }

    /* JADX INFO: renamed from: b */
    public final String m3452b(InputStream inputStream, OutputStream outputStream) throws C0000a {
        try {
            this.f4045a.setOutput(outputStream, "utf-8");
            this.f4046b.setInput(inputStream, "utf-8");
            while (this.f4046b.nextToken() != 1) {
                try {
                    int eventType = this.f4046b.getEventType();
                    if (eventType != 2) {
                        m3450a(this.f4046b, eventType);
                    } else if ("manifest".equals(this.f4046b.getName())) {
                        this.f4045a.m221a(this.f4046b);
                        int attributeCount = this.f4046b.getAttributeCount();
                        if (attributeCount >= 2) {
                            String[] strArr = new String[attributeCount];
                            String[] strArr2 = new String[attributeCount];
                            String[] strArr3 = new String[attributeCount];
                            for (int i = 0; i < attributeCount; i++) {
                                strArr[i] = this.f4046b.getAttributeNamespace(i);
                                strArr2[i] = this.f4046b.getAttributeName(i);
                                strArr3[i] = this.f4046b.getAttributeValue(i);
                                if ("package".equals(strArr2[i])) {
                                    String str = strArr3[i];
                                }
                            }
                            this.f4045a.m220a(strArr, strArr2, strArr3);
                        } else {
                            for (int i2 = 0; i2 < attributeCount; i2++) {
                                String attributeName = this.f4046b.getAttributeName(i2);
                                String attributeValue = this.f4046b.getAttributeValue(i2);
                                if ("package".equals(attributeName)) {
                                }
                                this.f4045a.attribute(this.f4046b.getAttributeNamespace(i2), attributeName, attributeValue);
                            }
                        }
                    } else {
                        this.f4045a.m221a(this.f4046b);
                        int attributeCount2 = this.f4046b.getAttributeCount();
                        if (attributeCount2 >= 2) {
                            String[] strArr4 = new String[attributeCount2];
                            String[] strArr5 = new String[attributeCount2];
                            String[] strArr6 = new String[attributeCount2];
                            for (int i3 = 0; i3 < attributeCount2; i3++) {
                                strArr4[i3] = this.f4046b.getAttributeNamespace(i3);
                                strArr5[i3] = this.f4046b.getAttributeName(i3);
                                strArr6[i3] = this.f4046b.getAttributeValue(i3);
                            }
                            this.f4045a.m220a(strArr4, strArr5, strArr6);
                        } else {
                            for (int i4 = 0; i4 < attributeCount2; i4++) {
                                this.f4045a.attribute(this.f4046b.getAttributeNamespace(i4), this.f4046b.getAttributeName(i4), this.f4046b.getAttributeValue(i4));
                            }
                        }
                    }
                } catch (Exception e) {
                    throw new C0000a(e.getMessage());
                }
            }
            this.f4045a.flush();
            return null;
        } catch (Exception e2) {
            throw new C0000a(e2.getMessage());
        }
    }
}
