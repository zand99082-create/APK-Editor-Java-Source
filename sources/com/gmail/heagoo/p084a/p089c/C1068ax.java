package com.gmail.heagoo.p084a.p089c;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Xml;
import com.github.megatronking.stringfog.xor.StringFogImpl;
import com.gmail.heagoo.apkeditor.gzd;
import com.gmail.heagoo.apkeditor.pro.R;
import com.gmail.heagoo.appdm.util.C1522d;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.lang.reflect.InvocationTargetException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;
import p000a.p001a.p003b.p007c.C0058b;

/* JADX INFO: renamed from: com.gmail.heagoo.a.c.ax */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"NewApi"})
public class C1068ax {

    /* JADX INFO: renamed from: f */
    private static HashSet f2813f;

    /* JADX INFO: renamed from: g */
    private static HashSet f2814g;

    /* JADX INFO: renamed from: h */
    private static boolean f2815h;

    /* JADX INFO: renamed from: a */
    private final Map f2816a = new HashMap();

    /* JADX INFO: renamed from: b */
    private final Map f2817b = new HashMap();

    /* JADX INFO: renamed from: c */
    private final Set f2818c = new LinkedHashSet();

    /* JADX INFO: renamed from: d */
    private final Set f2819d = new LinkedHashSet();

    /* JADX INFO: renamed from: e */
    private Context f2820e;

    public C1068ax() {
        new LinkedHashMap();
        new C0058b();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004a A[Catch: Exception -> 0x0063, TRY_LEAVE, TryCatch #10 {Exception -> 0x0063, blocks: (B:22:0x0045, B:24:0x004a), top: B:60:0x0045 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0045 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m2569a(File file, String str) throws Throwable {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = (FileInputStream) null;
        BufferedReader bufferedReader = (BufferedReader) null;
        try {
            try {
                StringBuffer stringBuffer = new StringBuffer();
                fileInputStream = new FileInputStream(file);
                try {
                    BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(fileInputStream, str));
                    int i = 0;
                    while (true) {
                        try {
                            try {
                                String line = bufferedReader2.readLine();
                                if (line == null) {
                                    break;
                                }
                                if (i > 0) {
                                    stringBuffer.append("\n");
                                }
                                stringBuffer.append(line);
                                i++;
                            } catch (Exception e) {
                                e = e;
                                bufferedReader = bufferedReader2;
                                e.printStackTrace();
                                if (fileInputStream != null) {
                                    try {
                                        fileInputStream.close();
                                    } catch (Exception e2) {
                                        return "";
                                    }
                                }
                                if (bufferedReader != null) {
                                    bufferedReader.close();
                                }
                                return "";
                            }
                        } catch (OutOfMemoryError e3) {
                            e = e3;
                            bufferedReader = bufferedReader2;
                            e.printStackTrace();
                            if (fileInputStream != null) {
                            }
                            if (bufferedReader != null) {
                            }
                            return "";
                        } catch (Throwable th) {
                            th = th;
                            bufferedReader = bufferedReader2;
                            if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                } catch (Exception e4) {
                                    throw th;
                                }
                            }
                            if (bufferedReader == null) {
                                throw th;
                            }
                            bufferedReader.close();
                            throw th;
                        }
                    }
                    String string = stringBuffer.toString();
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (Exception e5) {
                            return string;
                        }
                    }
                    if (bufferedReader2 == null) {
                        return string;
                    }
                    bufferedReader2.close();
                    return string;
                } catch (Exception e6) {
                    e = e6;
                } catch (OutOfMemoryError e7) {
                    e = e7;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e8) {
            e = e8;
            fileInputStream = fileInputStream2;
        } catch (OutOfMemoryError e9) {
            e = e9;
            fileInputStream = fileInputStream2;
        } catch (Throwable th3) {
            th = th3;
            fileInputStream = fileInputStream2;
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m2570a(String str) {
        Matcher matcher = Pattern.compile("\\sxmlns:(\\w+)=\"http://schemas.android.com/apk/res/android\"").matcher(str);
        return matcher.find() ? matcher.group(1) : "android";
    }

    /* JADX INFO: renamed from: a */
    public static void m2571a(File file, String str, String str2) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), str2));
            bufferedWriter.write(str);
            bufferedWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Bundle a_001(Intent intent, String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString(str, str2);
        intent.putExtras(bundle);
        return bundle;
    }

    public static Bundle a_002(Intent intent, String str, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt(str, i);
        intent.putExtras(bundle);
        return bundle;
    }

    public static void a_003(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[4096];
        while (true) {
            int i = inputStream.read(bArr);
            if (i == -1) {
                return;
            } else {
                outputStream.write(bArr, 0, i);
            }
        }
    }

    public static HashMap a_004(InputStream inputStream) throws XmlPullParserException, IOException {
        XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
        xmlPullParserNewPullParser.setInput(inputStream, null);
        String[] strArr = new String[1];
        int eventType = xmlPullParserNewPullParser.getEventType();
        while (eventType != 2) {
            if (eventType == 3) {
                throw new XmlPullParserException("Unexpected end tag at: " + xmlPullParserNewPullParser.getName());
            }
            if (eventType == 4) {
                throw new XmlPullParserException("Unexpected text: " + xmlPullParserNewPullParser.getText());
            }
            eventType = xmlPullParserNewPullParser.next();
            if (eventType == 1) {
                throw new XmlPullParserException("Unexpected end of document");
            }
        }
        return (HashMap) a_023(xmlPullParserNewPullParser, strArr);
    }

    public static void a_005(Map map, OutputStream outputStream) throws IOException {
        C1522d c1522d = new C1522d();
        c1522d.setOutput(outputStream, "utf-8");
        c1522d.startDocument(null, true);
        c1522d.setFeature("http://xmlpull.org/v1/doc/features.html#indent-output", true);
        a_016(map, null, c1522d);
        c1522d.endDocument();
    }

    public static String a_008(Intent intent, String str) {
        Bundle extras = intent.getExtras();
        if (extras != null) {
            return extras.getString(str);
        }
        return null;
    }

    public static Object a_010(String str, String str2, Class[] clsArr, Object[] objArr) {
        try {
            return Class.forName(str).getMethod(str2, clsArr).invoke(null, objArr);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
            return null;
        } catch (IllegalArgumentException e3) {
            e3.printStackTrace();
            return null;
        } catch (NoSuchMethodException e4) {
            e4.printStackTrace();
            return null;
        } catch (SecurityException e5) {
            e5.printStackTrace();
            return null;
        } catch (InvocationTargetException e6) {
            e6.printStackTrace();
            return null;
        }
    }

    public static String a_014(byte[] bArr, int i, int i2) {
        StringBuilder sb = new StringBuilder("");
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        String hexString = Integer.toHexString(bArr[0] & 255);
        if (hexString.length() < 2) {
            sb.append(0);
        }
        sb.append(hexString);
        for (int i3 = 1; i3 < i2 + 0; i3++) {
            sb.append(" ");
            String hexString2 = Integer.toHexString(bArr[i3] & 255);
            if (hexString2.length() < 2) {
                sb.append(0);
            }
            sb.append(hexString2);
        }
        return sb.toString();
    }

    public static Bundle a_015(Intent intent, String str, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putStringArrayList(str, arrayList);
        intent.putExtras(bundle);
        return bundle;
    }

    public static void a_016(Map map, String str, XmlSerializer xmlSerializer) throws IOException {
        if (map == null) {
            xmlSerializer.startTag(null, "null");
            xmlSerializer.endTag(null, "null");
            return;
        }
        xmlSerializer.startTag(null, "map");
        if (str != null) {
            xmlSerializer.attribute(null, "name", str);
        }
        for (Map.Entry entry : map.entrySet()) {
            a_017(entry.getValue(), (String) entry.getKey(), xmlSerializer);
        }
        xmlSerializer.endTag(null, "map");
    }

    public static void a_017(Object obj, String str, XmlSerializer xmlSerializer) throws IOException {
        String str2;
        if (obj == null) {
            xmlSerializer.startTag(null, "null");
            if (str != null) {
                xmlSerializer.attribute(null, "name", str);
            }
            xmlSerializer.endTag(null, "null");
            return;
        }
        if (obj instanceof String) {
            xmlSerializer.startTag(null, "string");
            if (str != null) {
                xmlSerializer.attribute(null, "name", str);
            }
            xmlSerializer.text(obj.toString());
            xmlSerializer.endTag(null, "string");
            return;
        }
        if (obj instanceof Integer) {
            str2 = "int";
        } else if (obj instanceof Long) {
            str2 = "long";
        } else if (obj instanceof Float) {
            str2 = "float";
        } else if (obj instanceof Double) {
            str2 = "double";
        } else {
            if (!(obj instanceof Boolean)) {
                if (!(obj instanceof byte[])) {
                    if (obj instanceof int[]) {
                        a_019((int[]) obj, str, xmlSerializer);
                        return;
                    }
                    if (obj instanceof Map) {
                        a_016((Map) obj, str, xmlSerializer);
                        return;
                    }
                    if (obj instanceof List) {
                        a_018((List) obj, str, xmlSerializer);
                        return;
                    }
                    if (obj instanceof Set) {
                        a_020((Set) obj, str, xmlSerializer);
                        return;
                    }
                    if (!(obj instanceof CharSequence)) {
                        throw new RuntimeException("writeValueXml: unable to write value " + obj);
                    }
                    xmlSerializer.startTag(null, "string");
                    if (str != null) {
                        xmlSerializer.attribute(null, "name", str);
                    }
                    xmlSerializer.text(obj.toString());
                    xmlSerializer.endTag(null, "string");
                    return;
                }
                byte[] bArr = (byte[]) obj;
                if (bArr == null) {
                    xmlSerializer.startTag(null, "null");
                    xmlSerializer.endTag(null, "null");
                    return;
                }
                xmlSerializer.startTag(null, "byte-array");
                if (str != null) {
                    xmlSerializer.attribute(null, "name", str);
                }
                xmlSerializer.attribute(null, "num", Integer.toString(bArr.length));
                StringBuilder sb = new StringBuilder(bArr.length << 1);
                for (byte b2 : bArr) {
                    int i = b2 >> 4;
                    sb.append(i >= 10 ? (i + 97) - 10 : i + 48);
                    int i2 = b2 & 255;
                    sb.append(i2 >= 10 ? (i2 + 97) - 10 : i2 + 48);
                }
                xmlSerializer.text(sb.toString());
                xmlSerializer.endTag(null, "byte-array");
                return;
            }
            str2 = "boolean";
        }
        xmlSerializer.startTag(null, str2);
        if (str != null) {
            xmlSerializer.attribute(null, "name", str);
        }
        xmlSerializer.attribute(null, "value", obj.toString());
        xmlSerializer.endTag(null, str2);
    }

    public static void a_018(List list, String str, XmlSerializer xmlSerializer) throws IOException {
        if (list == null) {
            xmlSerializer.startTag(null, "null");
            xmlSerializer.endTag(null, "null");
            return;
        }
        xmlSerializer.startTag(null, "list");
        if (str != null) {
            xmlSerializer.attribute(null, "name", str);
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            a_017(list.get(i), null, xmlSerializer);
        }
        xmlSerializer.endTag(null, "list");
    }

    public static void a_019(int[] iArr, String str, XmlSerializer xmlSerializer) throws IOException {
        if (iArr == null) {
            xmlSerializer.startTag(null, "null");
            xmlSerializer.endTag(null, "null");
            return;
        }
        xmlSerializer.startTag(null, "int-array");
        if (str != null) {
            xmlSerializer.attribute(null, "name", str);
        }
        xmlSerializer.attribute(null, "num", Integer.toString(iArr.length));
        for (int i : iArr) {
            xmlSerializer.startTag(null, "item");
            xmlSerializer.attribute(null, "value", Integer.toString(i));
            xmlSerializer.endTag(null, "item");
        }
        xmlSerializer.endTag(null, "int-array");
    }

    public static void a_020(Set set, String str, XmlSerializer xmlSerializer) throws IOException {
        if (set == null) {
            xmlSerializer.startTag(null, "null");
            xmlSerializer.endTag(null, "null");
            return;
        }
        xmlSerializer.startTag(null, "set");
        if (str != null) {
            xmlSerializer.attribute(null, "name", str);
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            a_017(it.next(), null, xmlSerializer);
        }
        xmlSerializer.endTag(null, "set");
    }

    private static Object a_023(XmlPullParser xmlPullParser, String[] strArr) throws XmlPullParserException, IOException {
        int next;
        Object objValueOf = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "name");
        String name = xmlPullParser.getName();
        if (!name.equals("null")) {
            if (name.equals("string")) {
                String str = "";
                while (true) {
                    int next2 = xmlPullParser.next();
                    if (next2 == 1) {
                        throw new XmlPullParserException("Unexpected end of document in <string>");
                    }
                    if (next2 == 3) {
                        if (!xmlPullParser.getName().equals("string")) {
                            throw new XmlPullParserException("Unexpected end tag in <string>: " + xmlPullParser.getName());
                        }
                        strArr[0] = attributeValue;
                        return str;
                    }
                    if (next2 == 4) {
                        str = str + xmlPullParser.getText();
                    } else if (next2 == 2) {
                        throw new XmlPullParserException("Unexpected start tag in <string>: " + xmlPullParser.getName());
                    }
                }
            } else if (name.equals("int")) {
                objValueOf = Integer.valueOf(Integer.parseInt(xmlPullParser.getAttributeValue(null, "value")));
            } else if (name.equals("long")) {
                objValueOf = Long.valueOf(xmlPullParser.getAttributeValue(null, "value"));
            } else if (name.equals("float")) {
                objValueOf = new Float(xmlPullParser.getAttributeValue(null, "value"));
            } else if (name.equals("double")) {
                objValueOf = new Double(xmlPullParser.getAttributeValue(null, "value"));
            } else {
                if (!name.equals("boolean")) {
                    if (name.equals("int-array")) {
                        xmlPullParser.next();
                        int[] iArrA_024 = a_024(xmlPullParser, "int-array");
                        strArr[0] = attributeValue;
                        return iArrA_024;
                    }
                    if (name.equals("map")) {
                        xmlPullParser.next();
                        HashMap mapA_025 = a_025(xmlPullParser, "map", strArr);
                        strArr[0] = attributeValue;
                        return mapA_025;
                    }
                    if (name.equals("list")) {
                        xmlPullParser.next();
                        ArrayList arrayListB_026 = b_026(xmlPullParser, "list", strArr);
                        strArr[0] = attributeValue;
                        return arrayListB_026;
                    }
                    if (!name.equals("set")) {
                        throw new XmlPullParserException("Unknown tag: " + name);
                    }
                    xmlPullParser.next();
                    HashSet hashSetC_027 = c_027(xmlPullParser, "set", strArr);
                    strArr[0] = attributeValue;
                    return hashSetC_027;
                }
                objValueOf = Boolean.valueOf(xmlPullParser.getAttributeValue(null, "value"));
            }
        }
        do {
            next = xmlPullParser.next();
            if (next == 1) {
                throw new XmlPullParserException("Unexpected end of document in <" + name + ">");
            }
            if (next == 3) {
                if (!xmlPullParser.getName().equals(name)) {
                    throw new XmlPullParserException("Unexpected end tag in <" + name + ">: " + xmlPullParser.getName());
                }
                strArr[0] = attributeValue;
                return objValueOf;
            }
            if (next == 4) {
                throw new XmlPullParserException("Unexpected text in <" + name + ">: " + xmlPullParser.getName());
            }
        } while (next != 2);
        throw new XmlPullParserException("Unexpected start tag in <" + name + ">: " + xmlPullParser.getName());
    }

    public static int[] a_024(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        try {
            int[] iArr = new int[Integer.parseInt(xmlPullParser.getAttributeValue(null, "num"))];
            int i = 0;
            int eventType = xmlPullParser.getEventType();
            do {
                if (eventType == 2) {
                    if (!xmlPullParser.getName().equals("item")) {
                        throw new XmlPullParserException("Expected item tag at: " + xmlPullParser.getName());
                    }
                    try {
                        iArr[i] = Integer.parseInt(xmlPullParser.getAttributeValue(null, "value"));
                    } catch (NullPointerException e) {
                        throw new XmlPullParserException("Need value attribute in item");
                    } catch (NumberFormatException e2) {
                        throw new XmlPullParserException("Not a number in value attribute in item");
                    }
                } else if (eventType == 3) {
                    if (xmlPullParser.getName().equals(str)) {
                        return iArr;
                    }
                    if (!xmlPullParser.getName().equals("item")) {
                        throw new XmlPullParserException("Expected " + str + " end tag at: " + xmlPullParser.getName());
                    }
                    i++;
                }
                eventType = xmlPullParser.next();
            } while (eventType != 1);
            throw new XmlPullParserException("Document ended before " + str + " end tag");
        } catch (NullPointerException e3) {
            throw new XmlPullParserException("Need num attribute in byte-array");
        } catch (NumberFormatException e4) {
            throw new XmlPullParserException("Not a number in num attribute in byte-array");
        }
    }

    public static HashMap a_025(XmlPullParser xmlPullParser, String str, String[] strArr) throws XmlPullParserException, IOException {
        HashMap map = new HashMap();
        int eventType = xmlPullParser.getEventType();
        do {
            if (eventType == 2) {
                Object objA_023 = a_023(xmlPullParser, strArr);
                if (strArr[0] == null) {
                    throw new XmlPullParserException("Map value without name attribute: " + xmlPullParser.getName());
                }
                map.put(strArr[0], objA_023);
            } else if (eventType == 3) {
                if (xmlPullParser.getName().equals(str)) {
                    return map;
                }
                throw new XmlPullParserException("Expected " + str + " end tag at: " + xmlPullParser.getName());
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        throw new XmlPullParserException("Document ended before " + str + " end tag");
    }

    /* JADX INFO: renamed from: b */
    public static void m2572b(File file, String str) {
        m2571a(file, str, StringFogImpl.CHARSET_NAME_UTF_8);
    }

    public static boolean b_007(Intent intent, String str) {
        Bundle extras = intent.getExtras();
        if (extras != null) {
            return extras.getBoolean(str, false);
        }
        return false;
    }

    public static void b_011(Context context, String str) {
        Intent intent;
        if (b_022(str, context.getResources().getStringArray(R.array.fileTypeImage))) {
            File file = new File(str);
            intent = new Intent("android.intent.action.VIEW");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.setDataAndType(Uri.fromFile(file), "image/*");
        } else if (b_022(str, context.getResources().getStringArray(R.array.fileTypeWebText))) {
            File file2 = new File(str);
            Uri uriBuild = Uri.parse(file2.toString()).buildUpon().encodedAuthority("com.android.htmlfileprovider").scheme(gzd.COLUMN_CONTENT).encodedPath(file2.toString()).build();
            intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(uriBuild, "text/html");
        } else if (b_022(str, context.getResources().getStringArray(R.array.fileTypePackage))) {
            File file3 = new File(str);
            intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.setDataAndType(Uri.fromFile(file3), "application/vnd.android.package-archive");
        } else if (b_022(str, context.getResources().getStringArray(R.array.fileTypeAudio))) {
            File file4 = new File(str);
            intent = new Intent("android.intent.action.VIEW");
            intent.putExtra("oneshot", 0);
            intent.putExtra("configchange", 0);
            intent.setDataAndType(Uri.fromFile(file4), "audio/*");
        } else if (b_022(str, context.getResources().getStringArray(R.array.fileTypeVideo))) {
            File file5 = new File(str);
            intent = new Intent("android.intent.action.VIEW");
            intent.putExtra("oneshot", 0);
            intent.putExtra("configchange", 0);
            intent.setDataAndType(Uri.fromFile(file5), "video/*");
        } else if (b_022(str, context.getResources().getStringArray(R.array.fileTypeText))) {
            File file6 = new File(str);
            intent = new Intent("android.intent.action.VIEW");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.setDataAndType(Uri.fromFile(file6), "text/plain");
        } else if (b_022(str, context.getResources().getStringArray(R.array.fileTypePdf))) {
            File file7 = new File(str);
            intent = new Intent("android.intent.action.VIEW");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.setDataAndType(Uri.fromFile(file7), "application/pdf");
        } else if (b_022(str, context.getResources().getStringArray(R.array.fileTypeWord))) {
            File file8 = new File(str);
            intent = new Intent("android.intent.action.VIEW");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.setDataAndType(Uri.fromFile(file8), "application/msword");
        } else if (b_022(str, context.getResources().getStringArray(R.array.fileTypeExcel))) {
            File file9 = new File(str);
            intent = new Intent("android.intent.action.VIEW");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.setDataAndType(Uri.fromFile(file9), "application/vnd.ms-excel");
        } else if (b_022(str, context.getResources().getStringArray(R.array.fileTypePPT))) {
            File file10 = new File(str);
            intent = new Intent("android.intent.action.VIEW");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.setDataAndType(Uri.fromFile(file10), "application/vnd.ms-powerpoint");
        } else {
            intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.fromFile(new File(str)), "*/*");
        }
        context.startActivity(intent);
    }

    public static Bundle b_012(Intent intent, String str, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean(str, z);
        intent.putExtras(bundle);
        return bundle;
    }

    private static boolean b_022(String str, String[] strArr) {
        for (String str2 : strArr) {
            if (str.endsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    public static ArrayList b_026(XmlPullParser xmlPullParser, String str, String[] strArr) throws XmlPullParserException, IOException {
        ArrayList arrayList = new ArrayList();
        int eventType = xmlPullParser.getEventType();
        do {
            if (eventType == 2) {
                arrayList.add(a_023(xmlPullParser, strArr));
            } else if (eventType == 3) {
                if (xmlPullParser.getName().equals(str)) {
                    return arrayList;
                }
                throw new XmlPullParserException("Expected " + str + " end tag at: " + xmlPullParser.getName());
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        throw new XmlPullParserException("Document ended before " + str + " end tag");
    }

    public static int c_006(Intent intent, String str) {
        Bundle extras = intent.getExtras();
        if (extras != null) {
            return extras.getInt(str, 0);
        }
        return 0;
    }

    public static HashSet c_027(XmlPullParser xmlPullParser, String str, String[] strArr) throws XmlPullParserException, IOException {
        HashSet hashSet = new HashSet();
        int eventType = xmlPullParser.getEventType();
        do {
            if (eventType == 2) {
                hashSet.add(a_023(xmlPullParser, strArr));
            } else if (eventType == 3) {
                if (xmlPullParser.getName().equals(str)) {
                    return hashSet;
                }
                throw new XmlPullParserException("Expected " + str + " end tag at: " + xmlPullParser.getName());
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        throw new XmlPullParserException("Document ended before " + str + " end tag");
    }

    public static ArrayList d_013(Intent intent, String str) {
        Bundle extras = intent.getExtras();
        if (extras != null) {
            return extras.getStringArrayList(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static String m2573e(File file) {
        return m2569a(file, StringFogImpl.CHARSET_NAME_UTF_8);
    }

    public static String i_009(String str) {
        try {
            ZipFile zipFile = new ZipFile(str);
            Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
            while (enumerationEntries.hasMoreElements()) {
                ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                if (!zipEntryNextElement.isDirectory()) {
                    String name = zipEntryNextElement.getName();
                    if (name.endsWith(".RSA") || name.endsWith(".rsa") || name.endsWith(".DSA") || name.endsWith(".dsa")) {
                        InputStream inputStream = zipFile.getInputStream(zipEntryNextElement);
                        try {
                            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(inputStream)).getSubjectDN().toString().replace("C=", "Country=").replaceAll("O=", "Organization=").replaceAll("OU=", "Organization Unit=").replaceAll("ST=", "State/Province=").replaceAll("CN=", "Common Name=").replaceAll("L=", "Locality=").replaceAll("SN=", "Surname=").replaceAll("GN=", "Given Name=");
                        } catch (Exception e) {
                        } finally {
                            inputStream.close();
                        }
                    }
                }
            }
            zipFile.close();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return null;
    }

    public static String millisToDHMS(long j) {
        long days = TimeUnit.MILLISECONDS.toDays(j);
        long hours = TimeUnit.MILLISECONDS.toHours(j) - TimeUnit.DAYS.toHours(TimeUnit.MILLISECONDS.toDays(j));
        long minutes = TimeUnit.MILLISECONDS.toMinutes(j) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(j));
        long seconds = TimeUnit.MILLISECONDS.toSeconds(j) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(j));
        long millis = TimeUnit.MILLISECONDS.toMillis(j) - TimeUnit.SECONDS.toMillis(TimeUnit.MILLISECONDS.toSeconds(j));
        return days == 0 ? String.format("%02dh:%02dm:%02ds.%03dms", Long.valueOf(hours), Long.valueOf(minutes), Long.valueOf(seconds), Long.valueOf(millis)) : String.format("%dd %02dh:%02dm:%02ds.%03dms", Long.valueOf(days), Long.valueOf(hours), Long.valueOf(minutes), Long.valueOf(seconds), Long.valueOf(millis));
    }
}
