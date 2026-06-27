package com.gmail.heagoo.p084a;

import com.gmail.heagoo.p084a.p085a.p086a.p087a.XmlResourceParserC1052a;
import java.io.InputStream;

/* JADX INFO: renamed from: com.gmail.heagoo.a.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1056b {

    /* JADX INFO: renamed from: a */
    private String f2794a = null;

    /* JADX INFO: renamed from: a */
    private static String m2417a(int i) {
        return (i >>> 24) == 1 ? "android:" : "";
    }

    /* JADX INFO: renamed from: a */
    public final String m2418a() {
        return this.f2794a;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x010c  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2419a(InputStream inputStream, String str, String str2) throws Throwable {
        XmlResourceParserC1052a xmlResourceParserC1052a;
        XmlResourceParserC1052a xmlResourceParserC1052a2 = null;
        try {
            try {
                xmlResourceParserC1052a = new XmlResourceParserC1052a();
                try {
                    xmlResourceParserC1052a.m2388a(inputStream);
                } catch (Exception e) {
                    e = e;
                }
            } catch (Throwable th) {
                th = th;
                if (0 != 0) {
                    xmlResourceParserC1052a2.close();
                }
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            xmlResourceParserC1052a = null;
        } catch (Throwable th2) {
            th = th2;
            if (0 != 0) {
            }
            throw th;
        }
        while (true) {
            int next = xmlResourceParserC1052a.next();
            if (next == 1) {
                xmlResourceParserC1052a.close();
                return;
            }
            switch (next) {
                case 0:
                    break;
                case 1:
                default:
                    continue;
                case 2:
                    if (str.equals(xmlResourceParserC1052a.getName())) {
                        for (int i = 0; i != xmlResourceParserC1052a.getAttributeCount(); i++) {
                            String attributeName = xmlResourceParserC1052a.getAttributeName(i);
                            int iM2387a = xmlResourceParserC1052a.m2387a(i);
                            int iM2389b = xmlResourceParserC1052a.m2389b(i);
                            String attributeValue = iM2387a == 3 ? xmlResourceParserC1052a.getAttributeValue(i) : iM2387a == 2 ? String.format("?%s%08X", m2417a(iM2389b), Integer.valueOf(iM2389b)) : iM2387a == 1 ? String.format("@%s%08X", m2417a(iM2389b), Integer.valueOf(iM2389b)) : iM2387a == 4 ? String.valueOf(Float.intBitsToFloat(iM2389b)) : iM2387a == 17 ? String.format("0x%08X", Integer.valueOf(iM2389b)) : iM2387a == 18 ? iM2389b != 0 ? "true" : "false" : (iM2387a == 5 || iM2387a == 6) ? "" : (iM2387a < 28 || iM2387a > 31) ? (iM2387a < 16 || iM2387a > 31) ? String.format("<0x%X, type 0x%02X>", Integer.valueOf(iM2389b), Integer.valueOf(iM2387a)) : String.valueOf(iM2389b) : String.format("#%08X", Integer.valueOf(iM2389b));
                            if (str2.equals(attributeName)) {
                                this.f2794a = attributeValue;
                                xmlResourceParserC1052a.close();
                                return;
                            }
                        }
                    } else {
                        continue;
                    }
                    break;
            }
            e = e;
            e.printStackTrace();
            if (xmlResourceParserC1052a != null) {
                xmlResourceParserC1052a.close();
                return;
            }
            return;
        }
    }
}
