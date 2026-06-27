package com.gmail.heagoo.p084a;

import android.support.v4.view.InputDeviceCompat;
import com.gmail.heagoo.p084a.p085a.p086a.p087a.XmlResourceParserC1052a;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.Formatter;

/* JADX INFO: renamed from: com.gmail.heagoo.a.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1051a {

    /* JADX INFO: renamed from: b */
    private static final float[] f2762b = {0.00390625f, 3.051758E-5f, 1.192093E-7f, 4.656613E-10f};

    /* JADX INFO: renamed from: c */
    private static final String[] f2763c = {"px", "dip", "sp", "pt", "in", "mm", "", ""};

    /* JADX INFO: renamed from: d */
    private static final String[] f2764d = {"%", "%p", "", "", "", "", "", ""};

    /* JADX INFO: renamed from: a */
    private StringBuffer f2765a = new StringBuffer();

    /* JADX INFO: renamed from: a */
    private static float m2379a(int i) {
        return (i & InputDeviceCompat.SOURCE_ANY) * f2762b[(i >> 4) & 3];
    }

    /* JADX INFO: renamed from: a */
    private static String m2380a(String str) {
        return (str == null || str.length() == 0) ? "" : str + ":";
    }

    /* JADX INFO: renamed from: a */
    private void m2381a(String str, Object... objArr) {
        Formatter formatter = new Formatter();
        formatter.format(str, objArr);
        this.f2765a.append(formatter.toString() + "\n");
    }

    /* JADX INFO: renamed from: a */
    public final boolean m2382a(InputStream inputStream, OutputStream outputStream) {
        try {
            XmlResourceParserC1052a xmlResourceParserC1052a = new XmlResourceParserC1052a();
            xmlResourceParserC1052a.m2388a(inputStream);
            StringBuilder sb = new StringBuilder(10);
            while (true) {
                int next = xmlResourceParserC1052a.next();
                if (next == 1) {
                    String string = this.f2765a.toString();
                    OutputStreamWriter outputStreamWriter = null;
                    try {
                        outputStreamWriter = new OutputStreamWriter(outputStream, "utf-8");
                    } catch (UnsupportedEncodingException e) {
                        e.printStackTrace();
                    }
                    try {
                        try {
                            outputStreamWriter.write(string);
                        } catch (IOException e2) {
                            e2.printStackTrace();
                            try {
                                outputStreamWriter.close();
                                outputStream.close();
                            } catch (IOException e3) {
                                throw new Error(e3);
                            }
                        }
                        try {
                            outputStreamWriter.close();
                            outputStream.close();
                            return true;
                        } catch (IOException e4) {
                            throw new Error(e4);
                        }
                    } catch (Throwable th) {
                        try {
                            outputStreamWriter.close();
                            outputStream.close();
                            throw th;
                        } catch (IOException e5) {
                            throw new Error(e5);
                        }
                    }
                }
                switch (next) {
                    case 0:
                        m2381a("<?xml version=\"1.0\" encoding=\"utf-8\"?>", new Object[0]);
                        break;
                    case 2:
                        m2381a("%s<%s%s", sb, m2380a(xmlResourceParserC1052a.getPrefix()), xmlResourceParserC1052a.getName());
                        sb.append("\t");
                        int namespaceCount = xmlResourceParserC1052a.getNamespaceCount(xmlResourceParserC1052a.getDepth());
                        for (int namespaceCount2 = xmlResourceParserC1052a.getNamespaceCount(xmlResourceParserC1052a.getDepth() - 1); namespaceCount2 != namespaceCount; namespaceCount2++) {
                            m2381a("%sxmlns:%s=\"%s\"", sb, xmlResourceParserC1052a.getNamespacePrefix(namespaceCount2), xmlResourceParserC1052a.getNamespaceUri(namespaceCount2));
                        }
                        for (int i = 0; i != xmlResourceParserC1052a.getAttributeCount(); i++) {
                            Object[] objArr = new Object[4];
                            objArr[0] = sb;
                            objArr[1] = m2380a(xmlResourceParserC1052a.getAttributePrefix(i));
                            objArr[2] = xmlResourceParserC1052a.getAttributeName(i);
                            int iM2387a = xmlResourceParserC1052a.m2387a(i);
                            int iM2389b = xmlResourceParserC1052a.m2389b(i);
                            objArr[3] = iM2387a == 3 ? xmlResourceParserC1052a.getAttributeValue(i) : iM2387a == 2 ? String.format("?%08X", Integer.valueOf(iM2389b)) : iM2387a == 1 ? iM2389b == 0 ? "@null" : String.format("@%08X", Integer.valueOf(iM2389b)) : iM2387a == 4 ? String.valueOf(Float.intBitsToFloat(iM2389b)) : iM2387a == 17 ? String.format("0x%08X", Integer.valueOf(iM2389b)) : iM2387a == 18 ? iM2389b != 0 ? "true" : "false" : iM2387a == 5 ? Float.toString(m2379a(iM2389b)) + f2763c[iM2389b & 15] : iM2387a == 6 ? Float.toString(m2379a(iM2389b)) + f2764d[iM2389b & 15] : (iM2387a < 28 || iM2387a > 31) ? (iM2387a < 16 || iM2387a > 31) ? String.format("<0x%X, type 0x%02X>", Integer.valueOf(iM2389b), Integer.valueOf(iM2387a)) : String.valueOf(iM2389b) : String.format("#%08X", Integer.valueOf(iM2389b));
                            m2381a("%s%s%s=\"%s\"", objArr);
                        }
                        m2381a("%s>", sb);
                        break;
                    case 3:
                        sb.setLength(sb.length() - 1);
                        m2381a("%s</%s%s>", sb, m2380a(xmlResourceParserC1052a.getPrefix()), xmlResourceParserC1052a.getName());
                        break;
                    case 4:
                        m2381a("%s%s", sb, xmlResourceParserC1052a.getText());
                        break;
                }
            }
        } catch (Exception e6) {
            e6.printStackTrace();
            return false;
        }
    }
}
