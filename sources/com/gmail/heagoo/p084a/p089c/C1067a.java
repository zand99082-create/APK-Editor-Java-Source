package com.gmail.heagoo.p084a.p089c;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.AssetManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.preference.PreferenceManager;
import android.support.v4.content.FileProvider;
import android.support.v7.appcompat.C0327R;
import android.widget.Toast;
import com.gmail.heagoo.apkeditor.C1177bv;
import com.gmail.heagoo.apkeditor.MainActivity;
import com.gmail.heagoo.apkeditor.SettingActivity;
import com.gmail.heagoo.apkeditor.SettingEditorActivity;
import com.gmail.heagoo.apkeditor.TextEditBigActivity;
import com.gmail.heagoo.apkeditor.TextEditNormalActivity;
import com.gmail.heagoo.apkeditor.installer.Installer;
import com.gmail.heagoo.apkeditor.pro.R;
import com.gmail.heagoo.neweditor.C1615z;
import com.gmail.heagoo.neweditor.Token;
import com.p046a.p047a.C0502s;
import com.p046a.p047a.p048a.InterfaceC0480b;
import com.p046a.p047a.p048a.InterfaceC0481c;
import com.p046a.p049b.p050a.p052b.C0541ah;
import com.p046a.p049b.p050a.p052b.C0557m;
import com.p046a.p049b.p050a.p052b.C0566v;
import com.p046a.p049b.p066f.p069c.AbstractC0857a;
import com.p046a.p049b.p066f.p069c.C0865g;
import com.p046a.p049b.p066f.p069c.C0866h;
import com.p046a.p049b.p066f.p069c.C0867i;
import com.p046a.p049b.p066f.p069c.C0868j;
import com.p046a.p049b.p066f.p069c.C0871m;
import com.p046a.p049b.p066f.p069c.C0872n;
import com.p046a.p049b.p066f.p069c.C0874p;
import com.p046a.p049b.p066f.p069c.C0878t;
import com.p046a.p049b.p066f.p069c.C0882x;
import com.p046a.p049b.p066f.p070d.C0887c;
import com.p046a.p049b.p066f.p070d.InterfaceC0888d;
import jadx.core.codegen.CodeWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.io.UTFDataFormatException;
import java.lang.Character;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.ZipFile;
import p000a.p001a.C0000a;
import p000a.p001a.p003b.p004a.C0030d;
import p000a.p001a.p003b.p004a.C0031e;
import p000a.p001a.p003b.p004a.C0032f;
import p000a.p001a.p003b.p006b.C0043a;
import p000a.p001a.p003b.p007c.C0058b;
import p000a.p013c.C0077e;
import p000a.p013c.InterfaceC0076d;
import p000a.p014d.C0085e;

/* JADX INFO: renamed from: com.gmail.heagoo.a.c.a */
/* JADX INFO: loaded from: classes.dex */
public class C1067a {

    /* JADX INFO: renamed from: f */
    private static HashSet f2805f;

    /* JADX INFO: renamed from: g */
    private static HashSet f2806g;

    /* JADX INFO: renamed from: h */
    private static boolean f2807h;

    /* JADX INFO: renamed from: a */
    private final Map f2808a = new HashMap();

    /* JADX INFO: renamed from: b */
    private final Map f2809b = new HashMap();

    /* JADX INFO: renamed from: c */
    private final Set f2810c = new LinkedHashSet();

    /* JADX INFO: renamed from: d */
    private final Set f2811d = new LinkedHashSet();

    /* JADX INFO: renamed from: e */
    private Context f2812e;

    public C1067a() {
        new LinkedHashMap();
        new C0058b();
    }

    public C1067a(Context context, boolean z) {
        new LinkedHashMap();
        new C0058b();
        this.f2812e = context;
    }

    /* JADX INFO: renamed from: A */
    public static String m2430A(int i) {
        char[] cArr = new char[5];
        if (i < 0) {
            cArr[0] = '-';
            i = -i;
        } else {
            cArr[0] = '+';
        }
        for (int i2 = 0; i2 < 4; i2++) {
            cArr[4 - i2] = Character.forDigit(i & 15, 16);
            i >>= 4;
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: B */
    public static String m2431B(int i) {
        char[] cArr = new char[3];
        if (i < 0) {
            cArr[0] = '-';
            i = -i;
        } else {
            cArr[0] = '+';
        }
        for (int i2 = 0; i2 < 2; i2++) {
            cArr[2 - i2] = Character.forDigit(i & 15, 16);
            i >>= 4;
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: a */
    public static int m2432a(int i, int i2) {
        if (i == i2) {
            return 0;
        }
        return (((long) i) & 4294967295L) < (((long) i2) & 4294967295L) ? -1 : 1;
    }

    /* JADX INFO: renamed from: a */
    public static int m2433a(InterfaceC0480b interfaceC0480b) {
        int iMo568d;
        int i = 0;
        int i2 = -1;
        int i3 = 0;
        do {
            iMo568d = interfaceC0480b.mo568d() & 255;
            i3 |= (iMo568d & 127) << (i * 7);
            i2 <<= 7;
            i++;
            if ((iMo568d & 128) != 128) {
                break;
            }
        } while (i < 5);
        if ((iMo568d & 128) == 128) {
            throw new C0502s("invalid LEB128 sequence");
        }
        return ((i2 >> 1) & i3) != 0 ? i3 | i2 : i3;
    }

    /* JADX INFO: renamed from: a */
    public static int m2434a(InterfaceC0480b interfaceC0480b, int i) {
        int iMo568d = 0;
        for (int i2 = i; i2 >= 0; i2--) {
            iMo568d = (iMo568d >>> 8) | ((interfaceC0480b.mo568d() & 255) << 24);
        }
        return iMo568d >> ((3 - i) << 3);
    }

    /* JADX INFO: renamed from: a */
    public static int m2435a(InterfaceC0480b interfaceC0480b, int i, boolean z) {
        int iMo568d = 0;
        if (z) {
            while (i >= 0) {
                iMo568d = (iMo568d >>> 8) | ((interfaceC0480b.mo568d() & 255) << 24);
                i--;
            }
            return iMo568d;
        }
        for (int i2 = i; i2 >= 0; i2--) {
            iMo568d = (iMo568d >>> 8) | ((interfaceC0480b.mo568d() & 255) << 24);
        }
        return iMo568d >>> ((3 - i) << 3);
    }

    /* JADX INFO: renamed from: a */
    public static int m2436a(short s, short s2) {
        if (s == s2) {
            return 0;
        }
        return (s & 65535) < (65535 & s2) ? -1 : 1;
    }

    /* JADX INFO: renamed from: a */
    public static int m2437a(int[] iArr) {
        return iArr.length << 5;
    }

    /* JADX INFO: renamed from: a */
    private static C0085e m2438a(String str, int i) {
        char cCharAt;
        int i2 = 0;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (str == null) {
            return new C0085e(arrayList, arrayList2);
        }
        int length = str.length();
        while (true) {
            int iIndexOf = str.indexOf(37, i2);
            if (iIndexOf != -1) {
                int i3 = iIndexOf + 1;
                if (i3 != length) {
                    i2 = i3 + 1;
                    char cCharAt2 = str.charAt(i3);
                    if (cCharAt2 != '%') {
                        if (cCharAt2 >= '0' && cCharAt2 <= '9' && i2 < length) {
                            do {
                                int i4 = i2;
                                i2 = i4 + 1;
                                cCharAt = str.charAt(i4);
                                if (cCharAt < '0' || cCharAt > '9') {
                                    break;
                                }
                            } while (i2 < length);
                            if (cCharAt == '$') {
                                arrayList2.add(Integer.valueOf(iIndexOf));
                            }
                        }
                        arrayList.add(Integer.valueOf(iIndexOf));
                        if (arrayList.size() >= 4) {
                            break;
                        }
                    }
                } else {
                    arrayList.add(Integer.valueOf(iIndexOf));
                    break;
                }
            } else {
                break;
            }
        }
        return new C0085e(arrayList, arrayList2);
    }

    /* JADX INFO: renamed from: a */
    public static Intent m2439a(Context context, String str, String str2) {
        Intent intent = m2534f(context, str) ? new Intent(context, (Class<?>) TextEditBigActivity.class) : new Intent(context, (Class<?>) TextEditNormalActivity.class);
        m2442a(intent, "xmlPath", str);
        if (str2 != null) {
            m2442a(intent, "apkPath", str2);
        }
        return intent;
    }

    /* JADX INFO: renamed from: a */
    public static Intent m2440a(Context context, ArrayList arrayList, int i, String str) {
        Intent intent = m2534f(context, (String) arrayList.get(i)) ? new Intent(context, (Class<?>) TextEditBigActivity.class) : new Intent(context, (Class<?>) TextEditNormalActivity.class);
        m2443a(intent, "fileList", arrayList);
        m2441a(intent, "curFileIndex", i);
        if (str != null) {
            m2442a(intent, "apkPath", str);
        }
        return intent;
    }

    /* JADX INFO: renamed from: a */
    public static Bundle m2441a(Intent intent, String str, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt(str, i);
        intent.putExtras(bundle);
        return bundle;
    }

    /* JADX INFO: renamed from: a */
    public static Bundle m2442a(Intent intent, String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString(str, str2);
        intent.putExtras(bundle);
        return bundle;
    }

    /* JADX INFO: renamed from: a */
    public static Bundle m2443a(Intent intent, String str, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putStringArrayList(str, arrayList);
        intent.putExtras(bundle);
        return bundle;
    }

    /* JADX INFO: renamed from: a */
    public static Bundle m2444a(Intent intent, String str, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean(str, z);
        intent.putExtras(bundle);
        return bundle;
    }

    /* JADX INFO: renamed from: a */
    public static C0557m m2445a(C0557m c0557m, C0557m c0557m2) {
        if (c0557m == c0557m2) {
            return c0557m;
        }
        int iM867b = c0557m.m867b();
        if (c0557m2.m867b() != iM867b) {
            throw new C0541ah("mismatched stack depths");
        }
        C0557m c0557mM860a = null;
        for (int i = 0; i < iM867b; i++) {
            InterfaceC0888d interfaceC0888dM862a = c0557m.m862a(i);
            InterfaceC0888d interfaceC0888dM862a2 = c0557m2.m862a(i);
            InterfaceC0888d interfaceC0888dM2448a = m2448a(interfaceC0888dM862a, interfaceC0888dM862a2);
            if (interfaceC0888dM2448a != interfaceC0888dM862a) {
                if (c0557mM860a == null) {
                    c0557mM860a = c0557m.m860a();
                }
                if (interfaceC0888dM2448a == null) {
                    throw new C0541ah("incompatible: " + interfaceC0888dM862a + ", " + interfaceC0888dM862a2);
                }
                try {
                    c0557mM860a.m863a(i, interfaceC0888dM2448a);
                } catch (C0541ah e) {
                    e.m573a("...while merging stack[" + m2558v(i) + "]");
                    throw e;
                }
                e.m573a("...while merging stack[" + m2558v(i) + "]");
                throw e;
            }
        }
        if (c0557mM860a == null) {
            return c0557m;
        }
        c0557mM860a.mo811b_();
        return c0557mM860a;
    }

    /* JADX INFO: renamed from: a */
    public static C0566v m2446a(C0566v c0566v, C0566v c0566v2) {
        if (c0566v == c0566v2) {
            return c0566v;
        }
        int iM924f = c0566v.m924f();
        if (c0566v2.m924f() != iM924f) {
            throw new C0541ah("mismatched maxLocals values");
        }
        C0566v c0566vM923e = null;
        for (int i = 0; i < iM924f; i++) {
            InterfaceC0888d interfaceC0888dM922c = c0566v.m922c(i);
            InterfaceC0888d interfaceC0888dM2448a = m2448a(interfaceC0888dM922c, c0566v2.m922c(i));
            if (interfaceC0888dM2448a != interfaceC0888dM922c) {
                if (c0566vM923e == null) {
                    c0566vM923e = c0566v.mo905a();
                }
                if (interfaceC0888dM2448a == null) {
                    c0566vM923e.m921b(i);
                } else {
                    c0566vM923e.mo909a(i, interfaceC0888dM2448a);
                }
            }
        }
        if (c0566vM923e == null) {
            return c0566v;
        }
        c0566vM923e.mo811b_();
        return c0566vM923e;
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC0857a m2447a(C0887c c0887c) {
        switch (c0887c.mo927c()) {
            case 1:
                return C0865g.f2238a;
            case 2:
                return C0866h.f2240a;
            case 3:
                return C0867i.f2241a;
            case 4:
                return C0868j.f2242a;
            case 5:
                return C0871m.f2245a;
            case 6:
                return C0872n.f2249b;
            case 7:
                return C0878t.f2260a;
            case 8:
                return C0882x.f2267a;
            case 9:
                return C0874p.f2257a;
            default:
                throw new UnsupportedOperationException("no zero for type: " + c0887c.mo919d());
        }
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC0888d m2448a(InterfaceC0888d interfaceC0888d, InterfaceC0888d interfaceC0888d2) {
        if (interfaceC0888d == null || interfaceC0888d.equals(interfaceC0888d2)) {
            return interfaceC0888d;
        }
        if (interfaceC0888d2 == null) {
            return null;
        }
        C0887c c0887cMo925a = interfaceC0888d.mo925a();
        C0887c c0887cMo925a2 = interfaceC0888d2.mo925a();
        if (c0887cMo925a == c0887cMo925a2) {
            return c0887cMo925a;
        }
        if (!c0887cMo925a.m1954n() || !c0887cMo925a2.m1954n()) {
            if (c0887cMo925a.m1952l() && c0887cMo925a2.m1952l()) {
                return C0887c.f2347f;
            }
            return null;
        }
        if (c0887cMo925a == C0887c.f2351j) {
            return c0887cMo925a2;
        }
        if (c0887cMo925a2 == C0887c.f2351j) {
            return c0887cMo925a;
        }
        if (!c0887cMo925a.m1955o() || !c0887cMo925a2.m1955o()) {
            return C0887c.f2355n;
        }
        InterfaceC0888d interfaceC0888dM2448a = m2448a(c0887cMo925a.m1959s(), c0887cMo925a2.m1959s());
        return interfaceC0888dM2448a == null ? C0887c.f2355n : ((C0887c) interfaceC0888dM2448a).m1958r();
    }

    /* JADX INFO: renamed from: a */
    public static Token m2449a(Token token) {
        if (token == null) {
            return null;
        }
        Token token2 = token;
        for (Token token3 = token.next; token3 != null; token3 = token3.next) {
            if (token3.f4747id == token2.f4747id && token3.offset == token2.offset + token2.length) {
                token2.length += token3.length;
            } else {
                token2.next = token3;
                token2 = token3;
            }
        }
        token2.next = null;
        return token;
    }

    /* JADX INFO: renamed from: a */
    public static File m2450a(String str, boolean z) {
        String strSubstring;
        int i;
        int iLastIndexOf = str.lastIndexOf(47);
        String strSubstring2 = str.substring(0, iLastIndexOf + 1);
        String strSubstring3 = str.substring(iLastIndexOf + 1);
        String strSubstring4 = "";
        int iLastIndexOf2 = strSubstring3.lastIndexOf(46);
        if (iLastIndexOf2 != -1) {
            strSubstring = strSubstring3.substring(0, iLastIndexOf2);
            strSubstring4 = strSubstring3.substring(iLastIndexOf2);
            i = 1;
        } else {
            strSubstring = strSubstring3;
            i = 1;
        }
        while (true) {
            File file = new File(strSubstring2 + strSubstring + i + strSubstring4);
            if (!file.exists()) {
                return file;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: a */
    public static Object m2451a(String str, String str2, Object obj, Class[] clsArr, Object[] objArr) {
        try {
            return Class.forName(str).getMethod(str2, clsArr).invoke(obj, objArr);
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

    /* JADX INFO: renamed from: a */
    public static Object m2452a(String str, String str2, Class[] clsArr, Object[] objArr) {
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

    /* JADX INFO: renamed from: a */
    public static Object m2453a(String str, Class[] clsArr, Object[] objArr) {
        try {
            return Class.forName(str).getConstructor(clsArr).newInstance(objArr);
        } catch (Exception e) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private static String m2454a(int i, int i2, int i3) {
        StringBuffer stringBuffer = new StringBuffer(80);
        int i4 = (i2 ^ (-1)) & i;
        int i5 = i & i2;
        if ((i5 & 1) != 0) {
            stringBuffer.append("|public");
        }
        if ((i5 & 2) != 0) {
            stringBuffer.append("|private");
        }
        if ((i5 & 4) != 0) {
            stringBuffer.append("|protected");
        }
        if ((i5 & 8) != 0) {
            stringBuffer.append("|static");
        }
        if ((i5 & 16) != 0) {
            stringBuffer.append("|final");
        }
        if ((i5 & 32) != 0) {
            if (i3 == 1) {
                stringBuffer.append("|super");
            } else {
                stringBuffer.append("|synchronized");
            }
        }
        if ((i5 & 64) != 0) {
            if (i3 == 3) {
                stringBuffer.append("|bridge");
            } else {
                stringBuffer.append("|volatile");
            }
        }
        if ((i5 & 128) != 0) {
            if (i3 == 3) {
                stringBuffer.append("|varargs");
            } else {
                stringBuffer.append("|transient");
            }
        }
        if ((i5 & 256) != 0) {
            stringBuffer.append("|native");
        }
        if ((i5 & 512) != 0) {
            stringBuffer.append("|interface");
        }
        if ((i5 & 1024) != 0) {
            stringBuffer.append("|abstract");
        }
        if ((i5 & 2048) != 0) {
            stringBuffer.append("|strictfp");
        }
        if ((i5 & 4096) != 0) {
            stringBuffer.append("|synthetic");
        }
        if ((i5 & 8192) != 0) {
            stringBuffer.append("|annotation");
        }
        if ((i5 & 16384) != 0) {
            stringBuffer.append("|enum");
        }
        if ((65536 & i5) != 0) {
            stringBuffer.append("|constructor");
        }
        if ((i5 & 131072) != 0) {
            stringBuffer.append("|declared_synchronized");
        }
        if (i4 != 0 || stringBuffer.length() == 0) {
            stringBuffer.append('|');
            stringBuffer.append(m2558v(i4));
        }
        return stringBuffer.substring(1);
    }

    /* JADX INFO: renamed from: a */
    public static String m2455a(long j) {
        char[] cArr = new char[16];
        for (int i = 0; i < 16; i++) {
            cArr[15 - i] = Character.forDigit(((int) j) & 15, 16);
            j >>= 4;
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: a */
    public static String m2456a(Context context, Uri uri, String str, String[] strArr) {
        Cursor cursor = null;
        try {
            Cursor cursorQuery = context.getContentResolver().query(uri, new String[]{"_data"}, str, strArr, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                        if (cursorQuery == null) {
                            return string;
                        }
                        cursorQuery.close();
                        return string;
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m2457a(Intent intent, String str) {
        Bundle extras = intent.getExtras();
        if (extras != null) {
            return extras.getString(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static String m2458a(InterfaceC0480b interfaceC0480b, char[] cArr) throws UTFDataFormatException {
        int i = 0;
        while (true) {
            char cMo568d = (char) (interfaceC0480b.mo568d() & 255);
            if (cMo568d == 0) {
                return new String(cArr, 0, i);
            }
            cArr[i] = cMo568d;
            if (cMo568d < 128) {
                i++;
            } else if ((cMo568d & 224) == 192) {
                int iMo568d = interfaceC0480b.mo568d() & 255;
                if ((iMo568d & 192) != 128) {
                    throw new UTFDataFormatException("bad second byte");
                }
                cArr[i] = (char) (((cMo568d & 31) << 6) | (iMo568d & 63));
                i++;
            } else {
                if ((cMo568d & 240) != 224) {
                    throw new UTFDataFormatException("bad byte");
                }
                int iMo568d2 = interfaceC0480b.mo568d() & 255;
                int iMo568d3 = interfaceC0480b.mo568d() & 255;
                if ((iMo568d2 & 192) != 128 || (iMo568d3 & 192) != 128) {
                    break;
                }
                cArr[i] = (char) (((cMo568d & 15) << 12) | ((iMo568d2 & 63) << 6) | (iMo568d3 & 63));
                i++;
            }
        }
        throw new UTFDataFormatException("bad second or third byte");
    }

    /* JADX INFO: renamed from: a */
    public static String m2459a(InputStream inputStream) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
            sb.append(line);
            sb.append("\n");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public static String m2460a(String str) {
        return str.replace("&", "&amp;").replace("<", "&lt;");
    }

    /* JADX INFO: renamed from: a */
    public static String m2461a(String str, String[] strArr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strArr.length; i++) {
            if (i == strArr.length - 1) {
                sb.append(strArr[i]);
            } else {
                sb.append(strArr[i]).append(str);
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public static String m2462a(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < bArr.length; i += 3) {
            stringBuffer.append(m2491a(bArr, i));
        }
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: a */
    public static String m2463a(byte[] bArr, int i, int i2, int i3, int i4, int i5) {
        int i6 = i + i2;
        if ((i | i2 | i6) < 0 || i6 > bArr.length) {
            throw new IndexOutOfBoundsException("arr.length " + bArr.length + "; " + i + "..!" + i6);
        }
        if (i3 < 0) {
            throw new IllegalArgumentException("outOffset < 0");
        }
        if (i2 == 0) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer((i2 << 2) + 6);
        int i7 = 0;
        while (i2 > 0) {
            if (i7 == 0) {
                stringBuffer.append(m2557u(i3));
                stringBuffer.append(": ");
            } else if ((i7 & 1) == 0) {
                stringBuffer.append(' ');
            }
            stringBuffer.append(m2560x(bArr[i]));
            i3++;
            i++;
            i7++;
            if (i7 == i4) {
                stringBuffer.append('\n');
                i7 = 0;
            }
            i2--;
        }
        if (i7 != 0) {
            stringBuffer.append('\n');
        }
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: a */
    public static void m2464a(InterfaceC0076d interfaceC0076d, File file, String str) throws C0077e {
        try {
            if (interfaceC0076d.mo197a(str)) {
                m2475a(new File(file, str));
                interfaceC0076d.mo201d(str).mo195a(new File(file, str));
            } else {
                File file2 = new File(file, str);
                file2.getParentFile().mkdirs();
                m2477a(interfaceC0076d.mo198b(str), new FileOutputStream(file2));
            }
        } catch (IOException e) {
            throw new C0077e("File copy error: " + str, e);
        } catch (Exception e2) {
            throw new C0077e("File copy error: " + str, e2);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m2465a(Activity activity, String str, int i) {
        Intent intentM2529e = m2529e(activity, str);
        if (intentM2529e != null) {
            activity.startActivityForResult(intentM2529e, i);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m2466a(Context context, String str) throws Throwable {
        Intent intent;
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        Uri uriFromFile = null;
        fileInputStream2 = null;
        if (Build.VERSION.SDK_INT >= 24) {
            intent = new Intent("android.intent.action.INSTALL_PACKAGE");
            intent.setFlags(1);
            File externalFilesDir = context.getExternalFilesDir("apk");
            if (!externalFilesDir.exists()) {
                externalFilesDir.mkdir();
            }
            File file = new File(externalFilesDir, "gen.apk");
            try {
                fileInputStream = new FileInputStream(new File(str));
                try {
                    fileOutputStream = new FileOutputStream(file);
                } catch (Exception e) {
                    e = e;
                    fileOutputStream = null;
                    fileInputStream2 = fileInputStream;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = null;
                    fileInputStream2 = fileInputStream;
                }
            } catch (Exception e2) {
                e = e2;
                fileOutputStream = null;
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
            }
            try {
                m2506b(fileInputStream, fileOutputStream);
                m2474a((Closeable) fileInputStream);
                m2474a(fileOutputStream);
                try {
                    uriFromFile = FileProvider.getUriForFile(context, context.getPackageName() + ".fileprovider", file);
                } catch (Throwable th3) {
                }
            } catch (Exception e3) {
                e = e3;
                fileInputStream2 = fileInputStream;
                try {
                    Toast.makeText(context, "Internal error: " + e.getMessage(), 1);
                    m2474a((Closeable) fileInputStream2);
                    m2474a(fileOutputStream);
                    return;
                } catch (Throwable th4) {
                    th = th4;
                    m2474a((Closeable) fileInputStream2);
                    m2474a(fileOutputStream);
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
                fileInputStream2 = fileInputStream;
                m2474a((Closeable) fileInputStream2);
                m2474a(fileOutputStream);
                throw th;
            }
        } else {
            intent = new Intent("android.intent.action.VIEW");
            uriFromFile = Uri.fromFile(new File(str));
        }
        if (uriFromFile != null) {
            try {
                intent.putExtra("android.intent.extra.NOT_UNKNOWN_SOURCE", true);
                intent.setDataAndType(uriFromFile, "application/vnd.android.package-archive");
                intent.setFlags(268468224);
                intent.addFlags(1);
                context.startActivity(intent);
            } catch (Throwable th6) {
                th6.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m2467a(Context context, String str, String str2, Map<String, String> map, Map<String, String> map2, Set<String> set) {
        String str3;
        String str4;
        String absolutePath;
        String absolutePath2;
        if (isNullOrEmpty(map) && isNullOrEmpty(map2) && isNullOrEmpty(set)) {
            str4 = null;
            str3 = str;
        } else {
            str3 = str2 + ".signed";
            int length = 0;
            StringBuilder sb = new StringBuilder();
            char c = '\n';
            if (!isNullOrEmpty(map2)) {
                for (Map.Entry<String, String> entry : map2.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    sb.append(key);
                    sb.append('\n');
                    sb.append(value);
                    sb.append('\n');
                    length += key.getBytes().length + value.getBytes().length + 2;
                }
            }
            StringBuilder sb2 = new StringBuilder();
            int length2 = 0;
            if (!isNullOrEmpty(set)) {
                for (String str5 : set) {
                    sb2.append(str5);
                    sb2.append('\n');
                    length2 += str5.getBytes().length + 1;
                }
            }
            StringBuilder sb3 = new StringBuilder();
            int length3 = 0;
            if (!isNullOrEmpty(map)) {
                for (Map.Entry<String, String> entry2 : map.entrySet()) {
                    String key2 = entry2.getKey();
                    String value2 = entry2.getValue();
                    sb3.append(key2);
                    sb3.append(c);
                    sb3.append(value2);
                    sb3.append(c);
                    length3 += key2.getBytes().length + value2.getBytes().length + 2;
                    c = '\n';
                }
            }
            MainActivity.m2789md(str3, str, sb.toString(), length, sb2.toString(), length2, sb3.toString(), length3);
            str4 = str3;
        }
        String strM2808c = SettingActivity.m2808c(context);
        if (strM2808c.charAt(0) == 'c' && strM2808c.charAt(1) == 'u') {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
            String string = defaultSharedPreferences.getString("PublicKeyPath", "");
            absolutePath2 = defaultSharedPreferences.getString("PrivateKeyPath", "");
            absolutePath = string;
        } else {
            File file = new File(context.getFilesDir(), "signing");
            File file2 = new File(file, strM2808c + ".x509.pem");
            File file3 = new File(file, strM2808c + ".pk8");
            if (file2.exists() && file3.exists()) {
                absolutePath = file2.getAbsolutePath();
                absolutePath2 = file3.getAbsolutePath();
            } else {
                file.mkdir();
                try {
                    AssetManager assets = context.getAssets();
                    m2477a(assets.open(strM2808c + ".x509.pem"), new FileOutputStream(file2));
                    m2477a(assets.open(strM2808c + ".pk8"), new FileOutputStream(file3));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (!file2.exists() || !file3.exists()) {
                    return;
                }
                absolutePath = file2.getAbsolutePath();
                absolutePath2 = file3.getAbsolutePath();
            }
        }
        boolean[] zArrEnabledSignatureVersions = SettingActivity.enabledSignatureVersions(context);
        C1069b.m2574a(absolutePath, absolutePath2, str3, str2, zArrEnabledSignatureVersions[0], zArrEnabledSignatureVersions[1], zArrEnabledSignatureVersions[2], zArrEnabledSignatureVersions[3]);
        if (str4 != null) {
            File file4 = new File(str4);
            if (file4.exists()) {
                file4.delete();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m2468a(Intent intent, String str, Map map) {
        Bundle bundle = new Bundle();
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList<String> arrayList2 = new ArrayList<>();
        for (String str2 : map.keySet()) {
            String str3 = (String) map.get(str2);
            arrayList.add(str2);
            arrayList2.add(str3);
        }
        bundle.putStringArrayList(str + "_keys", arrayList);
        bundle.putStringArrayList(str + "_values", arrayList2);
        intent.putExtras(bundle);
    }

    /* JADX INFO: renamed from: a */
    public static void m2469a(InterfaceC0481c interfaceC0481c, int i) {
        for (int i2 = i >>> 7; i2 != 0; i2 >>>= 7) {
            interfaceC0481c.mo569d((byte) ((i & 127) | 128));
            i = i2;
        }
        interfaceC0481c.mo569d((byte) (i & 127));
    }

    /* JADX INFO: renamed from: a */
    public static void m2470a(InterfaceC0481c interfaceC0481c, int i, long j) {
        int iNumberOfLeadingZeros = ((65 - Long.numberOfLeadingZeros((j >> 63) ^ j)) + 7) >> 3;
        interfaceC0481c.mo569d(((iNumberOfLeadingZeros - 1) << 5) | i);
        while (iNumberOfLeadingZeros > 0) {
            interfaceC0481c.mo569d((byte) j);
            j >>= 8;
            iNumberOfLeadingZeros--;
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m2471a(BufferedWriter bufferedWriter, int i, String str) {
        for (int i2 = 0; i2 < i; i2++) {
            bufferedWriter.write(CodeWriter.INDENT);
        }
        bufferedWriter.write("&lt;/<span class=\"end-tag\">" + str + "</span>&gt;");
    }

    /* JADX INFO: renamed from: a */
    private static void m2472a(BufferedWriter bufferedWriter, int i, String str, String str2) {
        bufferedWriter.write("\n");
        for (int i2 = 0; i2 < i; i2++) {
            bufferedWriter.write(CodeWriter.INDENT);
        }
        bufferedWriter.write("<span class=\"attribute-name\">" + str + "</span>=<a class=\"attribute-value\">" + str2 + "</a>");
    }

    /* JADX INFO: renamed from: a */
    private static void m2473a(BufferedWriter bufferedWriter, String str) {
        bufferedWriter.write(str.replaceAll("<", "&lt;").replace(">", "&gt;"));
    }

    /* JADX INFO: renamed from: a */
    public static void m2474a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m2475a(File file) {
        if (file.exists()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null) {
                for (File file2 : fileArrListFiles) {
                    if (file2.isDirectory()) {
                        m2475a(file2);
                    } else {
                        file2.delete();
                    }
                }
            }
            file.delete();
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m2476a(File file, File file2) throws Throwable {
        FileInputStream fileInputStream;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        File[] fileArrListFiles = file2.listFiles();
        if (fileArrListFiles != null) {
            for (File file3 : fileArrListFiles) {
                if (file3.isFile()) {
                    try {
                        fileInputStream = new FileInputStream(file3);
                        try {
                            fileOutputStream = new FileOutputStream(new File(file, file3.getName()));
                            try {
                                m2506b(fileInputStream, fileOutputStream);
                                m2474a((Closeable) fileInputStream);
                                m2474a(fileOutputStream);
                            } catch (Exception e) {
                                m2474a((Closeable) fileInputStream);
                                m2474a(fileOutputStream);
                            } catch (Throwable th) {
                                fileOutputStream2 = fileOutputStream;
                                th = th;
                                m2474a((Closeable) fileInputStream);
                                m2474a(fileOutputStream2);
                                throw th;
                            }
                        } catch (Exception e2) {
                            fileOutputStream = null;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (Exception e3) {
                        fileOutputStream = null;
                        fileInputStream = null;
                    } catch (Throwable th3) {
                        th = th3;
                        fileInputStream = null;
                    }
                } else if (file3.isDirectory()) {
                    File file4 = new File(file, file3.getName());
                    file4.mkdir();
                    m2476a(file4, file3);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m2477a(InputStream inputStream, OutputStream outputStream) {
        try {
            byte[] bArr = new byte[1024];
            int i = inputStream.read(bArr);
            while (i > 0) {
                outputStream.write(bArr, 0, i);
                i = inputStream.read(bArr);
            }
        } finally {
            try {
                inputStream.close();
                outputStream.close();
            } catch (IOException e) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m2478a(InputStream inputStream, byte[] bArr) {
        int i;
        int i2 = 0;
        while (i2 < bArr.length && (i = inputStream.read(bArr, i2, bArr.length - i2)) != -1) {
            i2 += i;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m2479a(String str, String str2) {
        if (f2807h) {
            return;
        }
        if (str != null && str2 != null) {
            throw new RuntimeException("optimize and don't optimize lists  are mutually exclusive.");
        }
        if (str != null) {
            f2805f = m2548m(str);
        }
        if (str2 != null) {
            f2806g = m2548m(str2);
        }
        f2807h = true;
    }

    /* JADX INFO: renamed from: a */
    public static void m2480a(List list, String str) throws IOException {
        if (list.isEmpty()) {
            return;
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File(str)));
        bufferedWriter.write("<html><head>");
        bufferedWriter.write("<title>1.xml</title>");
        bufferedWriter.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"viewsource.css\">");
        bufferedWriter.write("</head>");
        bufferedWriter.write("<body id=\"viewsource\" class=\"wrap\" style=\"-moz-tab-size: 4\">");
        bufferedWriter.write("<pre id=\"line1\">");
        String str2 = (String) list.get(0);
        if (str2 != null) {
            bufferedWriter.write(str2.replaceAll("<", "&lt;").replace(">", "&gt;"));
        }
        int i = 1;
        int i2 = 2;
        int i3 = 0;
        while (true) {
            int i4 = i;
            if (i4 >= list.size()) {
                bufferedWriter.close();
                return;
            }
            String strTrim = ((String) list.get(i4)).trim();
            bufferedWriter.write("\n<span id=\"line" + i2 + "\"></span>");
            boolean z = false;
            if (strTrim.length() >= 2 && strTrim.charAt(0) == '<') {
                char cCharAt = strTrim.charAt(1);
                if ((cCharAt >= 'a' && cCharAt <= 'z') || ((cCharAt >= 'A' && cCharAt <= 'Z') || cCharAt == '_')) {
                    boolean z2 = false;
                    boolean z3 = false;
                    if (strTrim.endsWith(">")) {
                        z2 = true;
                        if (strTrim.endsWith("/>")) {
                            z3 = true;
                            strTrim = strTrim.substring(0, strTrim.length() - 2);
                        } else {
                            strTrim = strTrim.substring(0, strTrim.length() - 1);
                        }
                    }
                    String[] strArrSplit = strTrim.split(" ");
                    m2505b(bufferedWriter, i3, strArrSplit[0].substring(1));
                    for (int i5 = 1; i5 < strArrSplit.length; i5++) {
                        int iIndexOf = strArrSplit[i5].indexOf("=");
                        if (iIndexOf != -1) {
                            m2472a(bufferedWriter, i3 + 1, strArrSplit[i5].substring(0, iIndexOf), strArrSplit[i5].substring(iIndexOf + 1));
                        } else {
                            m2473a(bufferedWriter, strArrSplit[i5]);
                        }
                    }
                    if (z3) {
                        m2473a(bufferedWriter, "/>");
                    } else if (z2) {
                        m2473a(bufferedWriter, ">");
                    }
                    if (!z3) {
                        i3++;
                    }
                    z = true;
                } else if (cCharAt == '/') {
                    i3--;
                    m2471a(bufferedWriter, i3, strTrim.substring(2, strTrim.length() - 1));
                    z = true;
                }
            }
            if (!z) {
                for (int i6 = 0; i6 < i3; i6++) {
                    bufferedWriter.write(CodeWriter.INDENT);
                }
                bufferedWriter.write(strTrim.replaceAll("<", "&lt;").replace(">", "&gt;"));
            }
            i2++;
            i = i4 + 1;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m2481a(ZipFile zipFile) {
        if (zipFile != null) {
            try {
                zipFile.close();
            } catch (IOException e) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m2482a(byte[] bArr, int i, String str) {
        int i2;
        int length = str.length();
        int i3 = 0;
        while (i3 < length) {
            char cCharAt = str.charAt(i3);
            if (cCharAt != 0 && cCharAt <= 127) {
                i2 = i + 1;
                bArr[i] = (byte) cCharAt;
            } else if (cCharAt <= 2047) {
                int i4 = i + 1;
                bArr[i] = (byte) (((cCharAt >> 6) & 31) | 192);
                i2 = i4 + 1;
                bArr[i4] = (byte) ((cCharAt & '?') | 128);
            } else {
                int i5 = i + 1;
                bArr[i] = (byte) (((cCharAt >> '\f') & 15) | 224);
                int i6 = i5 + 1;
                bArr[i5] = (byte) (((cCharAt >> 6) & 63) | 128);
                i2 = i6 + 1;
                bArr[i6] = (byte) ((cCharAt & '?') | 128);
            }
            i3++;
            i = i2;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m2483a(int[] iArr, int i, boolean z) {
        int i2 = i >> 5;
        iArr[i2] = (1 << (i & 31)) | iArr[i2];
    }

    /* JADX INFO: renamed from: a */
    public static void m2484a(int[] iArr, int[] iArr2) {
        for (int i = 0; i < iArr2.length; i++) {
            iArr[i] = iArr[i] | iArr2[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    private static boolean m2485a(char c) {
        Character.UnicodeBlock unicodeBlockOf = Character.UnicodeBlock.of(c);
        return (Character.isISOControl(c) || c == -1 || unicodeBlockOf == null || unicodeBlockOf == Character.UnicodeBlock.SPECIALS) ? false : true;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m2486a(Context context, String str, boolean z) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean(str, false);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m2487a(String str, Object obj) {
        ObjectOutputStream objectOutputStream;
        boolean z;
        ObjectOutputStream objectOutputStream2 = null;
        try {
            try {
                objectOutputStream = new ObjectOutputStream(new FileOutputStream(new File(str)));
                try {
                    objectOutputStream.writeObject(obj);
                    objectOutputStream.flush();
                    m2474a(objectOutputStream);
                    z = true;
                } catch (IOException e) {
                    e = e;
                    e.printStackTrace();
                    m2474a(objectOutputStream);
                    z = false;
                }
            } catch (Throwable th) {
                th = th;
                objectOutputStream2 = objectOutputStream;
                m2474a(objectOutputStream2);
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            objectOutputStream = null;
        } catch (Throwable th2) {
            th = th2;
            m2474a(objectOutputStream2);
            throw th;
        }
        return z;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m2488a(boolean z, C1615z c1615z, int i, char[] cArr) {
        int length = i + cArr.length;
        if (length > c1615z.f4886c + c1615z.f4885b) {
            return false;
        }
        char[] cArr2 = c1615z.f4884a;
        int i2 = 0;
        while (i < length) {
            char upperCase = cArr2[i];
            char upperCase2 = cArr[i2];
            if (z) {
                upperCase = Character.toUpperCase(upperCase);
                upperCase2 = Character.toUpperCase(upperCase2);
            }
            if (upperCase != upperCase2) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m2489a(int[] iArr, int i) {
        return (iArr[i >> 5] & (1 << (i & 31))) != 0;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m2490a(int[] iArr, int i, int i2) {
        int iM2524d = m2524d(iArr, i);
        return iM2524d >= 0 && iM2524d < i2;
    }

    /* JADX INFO: renamed from: a */
    private static char[] m2491a(byte[] bArr, int i) {
        int length = (bArr.length - i) - 1;
        int i2 = length >= 2 ? 2 : length;
        int i3 = 0;
        for (int i4 = 0; i4 <= i2; i4++) {
            int i5 = bArr[i + i4];
            if (i5 < 0) {
                i5 += 256;
            }
            i3 += i5 << ((2 - i4) * 8);
        }
        char[] cArr = new char[4];
        for (int i6 = 0; i6 < 4; i6++) {
            int i7 = (i3 >>> ((3 - i6) * 6)) & 63;
            cArr[i6] = (i7 < 0 || i7 > 25) ? (i7 < 26 || i7 > 51) ? (i7 < 52 || i7 > 61) ? i7 == 62 ? '+' : i7 == 63 ? '/' : '?' : (char) ((i7 - 52) + 48) : (char) ((i7 - 26) + 97) : (char) (i7 + 65);
        }
        if (length <= 0) {
            cArr[2] = '=';
        }
        if (length < 2) {
            cArr[3] = '=';
        }
        return cArr;
    }

    /* JADX INFO: renamed from: a */
    private C0031e[] m2492a(C1067a c1067a, boolean z) throws C0000a {
        ByteArrayInputStream byteArrayInputStream;
        try {
            File file = new File(this.f2812e.getFilesDir().getAbsolutePath() + "/bin/resources.arsc");
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[(int) file.length()];
                m2478a(fileInputStream, bArr);
                byteArrayInputStream = new ByteArrayInputStream(bArr);
            } catch (Throwable th) {
                byteArrayInputStream = null;
            }
            C0031e[] c0031eArrM113a = C0043a.m101a(byteArrayInputStream != null ? byteArrayInputStream : fileInputStream, false, true, c1067a, null, false).m113a();
            if (byteArrayInputStream != null) {
                try {
                    byteArrayInputStream.close();
                } catch (Exception e) {
                }
            }
            try {
                fileInputStream.close();
            } catch (Exception e2) {
            }
            return c0031eArrM113a;
        } catch (IOException e3) {
            throw new C0000a("Could not load resources.arsc", e3);
        }
    }

    /* JADX INFO: renamed from: aa */
    public static void m2493aa(Context context, String str) {
        File file = new File(str);
        if (!file.exists() && !file.isFile()) {
            Toast.makeText(context, "File " + file.getAbsolutePath() + " don't exist", 1).show();
            return;
        }
        if (file.canRead()) {
            new Installer(context).installApkFiles(file);
            return;
        }
        Toast.makeText(context, "File " + file.getAbsolutePath() + " don't open", 1).show();
    }

    /* JADX INFO: renamed from: b */
    public static int m2494b(InterfaceC0480b interfaceC0480b) {
        int iMo568d;
        int i = 0;
        int i2 = 0;
        do {
            iMo568d = interfaceC0480b.mo568d() & 255;
            i2 |= (iMo568d & 127) << (i * 7);
            i++;
            if ((iMo568d & 128) != 128) {
                break;
            }
        } while (i < 5);
        if ((iMo568d & 128) == 128) {
            throw new C0502s("invalid LEB128 sequence");
        }
        return i2;
    }

    /* JADX INFO: renamed from: b */
    public static int m2495b(byte[] bArr) {
        if (bArr.length != 8 || bArr[0] != 100 || bArr[1] != 101 || bArr[2] != 120 || bArr[3] != 10 || bArr[7] != 0) {
            return -1;
        }
        String string = new StringBuilder().append((char) bArr[4]).append((char) bArr[5]).append((char) bArr[6]).toString();
        if (string.equals("036")) {
            return 14;
        }
        return string.equals("035") ? 13 : -1;
    }

    /* JADX INFO: renamed from: b */
    public static long m2496b(InterfaceC0480b interfaceC0480b, int i) {
        long jMo568d = 0;
        for (int i2 = i; i2 >= 0; i2--) {
            jMo568d = (jMo568d >>> 8) | ((((long) interfaceC0480b.mo568d()) & 255) << 56);
        }
        return jMo568d >> ((7 - i) << 3);
    }

    /* JADX INFO: renamed from: b */
    public static long m2497b(InterfaceC0480b interfaceC0480b, int i, boolean z) {
        long jMo568d = 0;
        while (i >= 0) {
            jMo568d = (jMo568d >>> 8) | ((((long) interfaceC0480b.mo568d()) & 255) << 56);
            i--;
        }
        return jMo568d;
    }

    /* JADX INFO: renamed from: b */
    public static Bundle m2498b(Intent intent, String str, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean(str, z);
        intent.putExtras(bundle);
        return bundle;
    }

    /* JADX INFO: renamed from: b */
    public static String m2499b(long j) {
        char[] cArr = new char[17];
        if (j < 0) {
            cArr[0] = '-';
            j = -j;
        } else {
            cArr[0] = '+';
        }
        for (int i = 0; i < 16; i++) {
            cArr[16 - i] = Character.forDigit(((int) j) & 15, 16);
            j >>= 4;
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: b */
    public static String m2500b(Context context) {
        ClipData primaryClip = ((ClipboardManager) context.getSystemService("clipboard")).getPrimaryClip();
        if (primaryClip == null || primaryClip.getItemCount() <= 0) {
            return null;
        }
        return primaryClip.getItemAt(0).coerceToText(context).toString();
    }

    /* JADX INFO: renamed from: b */
    public static String m2501b(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        char[] charArray = str.toCharArray();
        StringBuilder sb = new StringBuilder(str.length() + 10);
        switch (charArray[0]) {
            case '#':
            case '?':
            case '@':
                sb.append('\\');
                break;
        }
        for (char c : charArray) {
            switch (c) {
                case '\n':
                    sb.append("\\n");
                    continue;
                    break;
                case '\"':
                    sb.append("&quot;");
                    continue;
                    break;
                case C0327R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 92 */:
                    sb.append('\\');
                    break;
                default:
                    if (!m2485a(c)) {
                        sb.append(String.format("\\u%04x", Integer.valueOf(c)));
                    }
                    break;
            }
            sb.append(c);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public static void m2502b(Context context, String str, boolean z) {
        SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        editorEdit.putBoolean(str, true);
        editorEdit.commit();
    }

    /* JADX INFO: renamed from: b */
    public static void m2503b(InterfaceC0481c interfaceC0481c, int i) {
        int i2 = i >> 7;
        int i3 = (Integer.MIN_VALUE & i) == 0 ? 0 : -1;
        boolean z = true;
        int i4 = i2;
        while (z) {
            z = (i4 == i3 && (i4 & 1) == ((i >> 6) & 1)) ? false : true;
            interfaceC0481c.mo569d((byte) ((z ? 128 : 0) | (i & 127)));
            i = i4;
            i4 >>= 7;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m2504b(InterfaceC0481c interfaceC0481c, int i, long j) {
        int iNumberOfLeadingZeros = 64 - Long.numberOfLeadingZeros(j);
        if (iNumberOfLeadingZeros == 0) {
            iNumberOfLeadingZeros = 1;
        }
        int i2 = (iNumberOfLeadingZeros + 7) >> 3;
        interfaceC0481c.mo569d(((i2 - 1) << 5) | i);
        while (i2 > 0) {
            interfaceC0481c.mo569d((byte) j);
            j >>= 8;
            i2--;
        }
    }

    /* JADX INFO: renamed from: b */
    private static void m2505b(BufferedWriter bufferedWriter, int i, String str) {
        for (int i2 = 0; i2 < i; i2++) {
            bufferedWriter.write(CodeWriter.INDENT);
        }
        bufferedWriter.write("&lt;<span class=\"start-tag\">" + str + "</span>");
    }

    /* JADX INFO: renamed from: b */
    public static void m2506b(InputStream inputStream, OutputStream outputStream) throws IOException {
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

    /* JADX INFO: renamed from: b */
    public static void m2507b(String str, String str2) {
        FileOutputStream fileOutputStream;
        try {
            fileOutputStream = new FileOutputStream(str);
        } catch (Throwable th) {
            th = th;
            fileOutputStream = null;
        }
        try {
            fileOutputStream.write(str2.getBytes());
            m2474a(fileOutputStream);
        } catch (Throwable th2) {
            th = th2;
            m2474a(fileOutputStream);
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m2508b(int[] iArr, int i) {
        int i2 = i >> 5;
        iArr[i2] = (1 << (i & 31)) | iArr[i2];
    }

    /* JADX INFO: renamed from: b */
    public static boolean m2509b(Intent intent, String str) {
        Bundle extras = intent.getExtras();
        if (extras != null) {
            return extras.getBoolean(str, false);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
    
        if (r1.m1952l() == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
    
        if (r0.m1952l() == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:?, code lost:
    
        return false;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m2510b(InterfaceC0888d interfaceC0888d, InterfaceC0888d interfaceC0888d2) {
        C0887c c0887cM1959s;
        int i;
        C0887c c0887cM1959s2;
        int i2;
        while (true) {
            C0887c c0887cMo925a = interfaceC0888d.mo925a();
            C0887c c0887cMo925a2 = interfaceC0888d2.mo925a();
            if (c0887cMo925a.equals(c0887cMo925a2)) {
                return true;
            }
            int iMo927c = c0887cMo925a.mo927c();
            int iMo927c2 = c0887cMo925a2.mo927c();
            if (iMo927c == 10) {
                c0887cM1959s = C0887c.f2355n;
                i = 9;
            } else {
                c0887cM1959s = c0887cMo925a;
                i = iMo927c;
            }
            if (iMo927c2 == 10) {
                c0887cM1959s2 = C0887c.f2355n;
                i2 = 9;
            } else {
                c0887cM1959s2 = c0887cMo925a2;
                i2 = iMo927c2;
            }
            if (i != 9 || i2 != 9) {
                break;
            }
            if (c0887cM1959s == C0887c.f2351j) {
                return false;
            }
            if (c0887cM1959s2 != C0887c.f2351j && c0887cM1959s != C0887c.f2355n) {
                if (!c0887cM1959s.m1955o()) {
                    if (c0887cM1959s2.m1955o()) {
                        return c0887cM1959s == C0887c.f2356o || c0887cM1959s == C0887c.f2354m;
                    }
                    return true;
                }
                if (!c0887cM1959s2.m1955o()) {
                    return false;
                }
                do {
                    c0887cM1959s = c0887cM1959s.m1959s();
                    c0887cM1959s2 = c0887cM1959s2.m1959s();
                    if (c0887cM1959s.m1955o()) {
                    }
                    interfaceC0888d2 = c0887cM1959s2;
                    interfaceC0888d = c0887cM1959s;
                } while (c0887cM1959s2.m1955o());
                interfaceC0888d2 = c0887cM1959s2;
                interfaceC0888d = c0887cM1959s;
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: b */
    private static boolean m2511b(String str, String[] strArr) {
        for (String str2 : strArr) {
            if (str.endsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m2512b(int[] iArr) {
        for (int i : iArr) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m2513b(File file) {
        if (!file.exists()) {
            throw new RuntimeException(file + ": file not found");
        }
        if (!file.isFile()) {
            throw new RuntimeException(file + ": not a file");
        }
        if (!file.canRead()) {
            throw new RuntimeException(file + ": file not readable");
        }
        long length = file.length();
        int i = (int) length;
        if (i != length) {
            throw new RuntimeException(file + ": file too long");
        }
        byte[] bArr = new byte[i];
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            int i2 = 0;
            while (i > 0) {
                int i3 = fileInputStream.read(bArr, i2, i);
                if (i3 == -1) {
                    throw new RuntimeException(file + ": unexpected EOF");
                }
                i2 += i3;
                i -= i3;
            }
            fileInputStream.close();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException(file + ": trouble reading", e);
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m2514c(int[] iArr) {
        int iBitCount = 0;
        for (int i : iArr) {
            iBitCount += Integer.bitCount(i);
        }
        return iBitCount;
    }

    /* JADX INFO: renamed from: c */
    public static String m2515c(int i) {
        return i >= 14 ? "dex\n036\u0000" : "dex\n035\u0000";
    }

    /* JADX INFO: renamed from: c */
    public static String m2516c(String str) {
        boolean z;
        boolean z2;
        if (str == null || str.isEmpty()) {
            return str;
        }
        char[] charArray = str.toCharArray();
        StringBuilder sb = new StringBuilder(str.length() + 16);
        switch (charArray[0]) {
            case '#':
            case '?':
            case '@':
                sb.append('\\');
                break;
        }
        int length = charArray.length;
        int i = 0;
        boolean z3 = true;
        boolean z4 = false;
        int length2 = 0;
        boolean z5 = false;
        while (i < length) {
            char c = charArray[i];
            if (z5) {
                if (c == '>') {
                    length2 = sb.length() + 1;
                    z5 = false;
                    z2 = z3;
                    z = false;
                } else {
                    boolean z6 = z3;
                    z = z4;
                    z2 = z6;
                }
            } else if (c == ' ') {
                if (z3) {
                    z4 = true;
                }
                z = z4;
                z2 = true;
            } else {
                switch (c) {
                    case '\n':
                    case '\'':
                        z2 = false;
                        z = true;
                        break;
                    case '\"':
                        sb.append('\\');
                        z = z4;
                        z2 = false;
                        break;
                    case C0327R.styleable.AppCompatTheme_toolbarStyle /* 60 */:
                        if (!z4) {
                            z = z4;
                            z5 = true;
                            z2 = false;
                        } else {
                            sb.insert(length2, '\"').append('\"');
                            z = z4;
                            z5 = true;
                            z2 = false;
                        }
                        break;
                    case C0327R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 92 */:
                        sb.append('\\');
                        z = z4;
                        z2 = false;
                        break;
                    default:
                        if (m2485a(c)) {
                            z = z4;
                            z2 = false;
                        } else if (sb.length() + 1 == str.length() && c == 0) {
                            z = z4;
                            z2 = false;
                        } else {
                            sb.append(String.format("\\u%04x", Integer.valueOf(c)));
                            z = z4;
                            z2 = false;
                        }
                        break;
                }
                i++;
                boolean z7 = z2;
                z4 = z;
                z3 = z7;
            }
            sb.append(c);
            i++;
            boolean z72 = z2;
            z4 = z;
            z3 = z72;
        }
        if (z4 || z3) {
            sb.insert(length2, '\"').append('\"');
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: c */
    public static String m2517c(byte[] bArr) {
        StringBuilder sb = new StringBuilder("");
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        for (byte b2 : bArr) {
            String hexString = Integer.toHexString(b2 & 255);
            if (hexString.length() < 2) {
                sb.append(0);
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: c */
    public static ArrayList m2518c(Intent intent, String str) {
        Bundle extras = intent.getExtras();
        if (extras != null) {
            return extras.getStringArrayList(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static void m2519c(Context context, String str) {
        ((ClipboardManager) context.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("", str));
    }

    /* JADX INFO: renamed from: c */
    public static void m2520c(InterfaceC0481c interfaceC0481c, int i, long j) {
        int iNumberOfTrailingZeros = 64 - Long.numberOfTrailingZeros(j);
        if (iNumberOfTrailingZeros == 0) {
            iNumberOfTrailingZeros = 1;
        }
        int i2 = (iNumberOfTrailingZeros + 7) >> 3;
        long j2 = j >> (64 - (i2 << 3));
        interfaceC0481c.mo569d(((i2 - 1) << 5) | i);
        while (i2 > 0) {
            interfaceC0481c.mo569d((byte) j2);
            j2 >>= 8;
            i2--;
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m2521c(int[] iArr, int i) {
        int i2 = i >> 5;
        iArr[i2] = ((1 << (i & 31)) ^ (-1)) & iArr[i2];
    }

    /* JADX INFO: renamed from: c */
    public static boolean m2522c(String str, String str2) {
        if (str.endsWith("/")) {
            str = str.substring(0, str.length() - 1);
        }
        if (str2.endsWith("/")) {
            str2 = str2.substring(0, str2.length() - 1);
        }
        String[] strArrSplit = str.split("/");
        String[] strArrSplit2 = str2.split("/");
        if (strArrSplit.length >= strArrSplit2.length) {
            return false;
        }
        for (int i = 0; i < strArrSplit.length; i++) {
            if (!strArrSplit[i].equals(strArrSplit2[i])) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    public static int m2523d(int i) {
        int i2 = i >> 7;
        int i3 = 0;
        while (i2 != 0) {
            i2 >>= 7;
            i3++;
        }
        return i3 + 1;
    }

    /* JADX INFO: renamed from: d */
    public static int m2524d(int[] iArr, int i) {
        int length = iArr.length;
        int i2 = i & 31;
        for (int i3 = i >> 5; i3 < length; i3++) {
            int i4 = iArr[i3];
            if (i4 != 0) {
                int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros((((1 << i2) - 1) ^ (-1)) & i4);
                if (iNumberOfTrailingZeros == 32) {
                    iNumberOfTrailingZeros = -1;
                }
                if (iNumberOfTrailingZeros >= 0) {
                    return (i3 << 5) + iNumberOfTrailingZeros;
                }
            }
            i2 = 0;
        }
        return -1;
    }

    /* JADX INFO: renamed from: d */
    public static String m2525d(Context context, String str) {
        if (!Environment.getExternalStorageState().equals("mounted")) {
            throw new Exception("Can not find sd card.");
        }
        String str2 = Environment.getExternalStorageDirectory().getPath() + ("/ApkEditor/" + str + "/");
        File file = new File(str2);
        if (!file.exists()) {
            file.mkdirs();
        }
        return str2;
    }

    /* JADX INFO: renamed from: d */
    public static String m2526d(String str, String str2) {
        if (str.endsWith("/")) {
            str = str.substring(0, str.length() - 1);
        }
        if (str2.endsWith("/")) {
            str2 = str2.substring(0, str2.length() - 1);
        }
        String[] strArrSplit = str.split("/");
        String[] strArrSplit2 = str2.split("/");
        if (strArrSplit.length < strArrSplit2.length) {
            return strArrSplit2[strArrSplit.length];
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static Map m2527d(Intent intent, String str) {
        Bundle extras = intent.getExtras();
        if (extras != null) {
            HashMap map = new HashMap();
            ArrayList<String> stringArrayList = extras.getStringArrayList(str + "_keys");
            ArrayList<String> stringArrayList2 = extras.getStringArrayList(str + "_values");
            if (stringArrayList != null && stringArrayList2 != null) {
                for (int i = 0; i < stringArrayList.size(); i++) {
                    map.put(stringArrayList.get(i), stringArrayList2.get(i));
                }
                return map;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m2528d(String str) {
        C0085e c0085eM2438a = m2438a(str, 4);
        if (!((List) c0085eM2438a.f229a).isEmpty()) {
            if (((List) c0085eM2438a.f230b).size() + ((List) c0085eM2438a.f229a).size() > 1) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public static Intent m2529e(Context context, String str) {
        Uri uriForFile;
        Intent intent = null;
        try {
            uriForFile = FileProvider.getUriForFile(context, context.getPackageName() + ".fileprovider", new File(str));
        } catch (Throwable th) {
            uriForFile = null;
        }
        if (uriForFile != null) {
            if (m2511b(str, context.getResources().getStringArray(R.array.fileTypeImage))) {
                intent = new Intent("android.intent.action.VIEW");
                intent.addCategory("android.intent.category.DEFAULT");
                intent.setDataAndType(uriForFile, "image/*");
            } else if (m2511b(str, context.getResources().getStringArray(R.array.fileTypeWebText))) {
                intent = new Intent("android.intent.action.VIEW");
                intent.setDataAndType(uriForFile, "text/html");
            } else if (m2511b(str, context.getResources().getStringArray(R.array.fileTypePackage))) {
                intent = new Intent();
                intent.setAction("android.intent.action.VIEW");
                intent.setDataAndType(uriForFile, "application/vnd.android.package-archive");
            } else if (m2511b(str, context.getResources().getStringArray(R.array.fileTypeAudio))) {
                intent = new Intent("android.intent.action.VIEW");
                intent.putExtra("oneshot", 0);
                intent.putExtra("configchange", 0);
                intent.setDataAndType(uriForFile, "audio/*");
            } else if (m2511b(str, context.getResources().getStringArray(R.array.fileTypeVideo))) {
                intent = new Intent("android.intent.action.VIEW");
                intent.putExtra("oneshot", 0);
                intent.putExtra("configchange", 0);
                intent.setDataAndType(uriForFile, "video/*");
            } else if (m2511b(str, context.getResources().getStringArray(R.array.fileTypeText))) {
                intent = new Intent("android.intent.action.VIEW");
                intent.addCategory("android.intent.category.DEFAULT");
                intent.setDataAndType(uriForFile, "text/plain");
            } else if (m2511b(str, context.getResources().getStringArray(R.array.fileTypePdf))) {
                intent = new Intent("android.intent.action.VIEW");
                intent.addCategory("android.intent.category.DEFAULT");
                intent.setDataAndType(uriForFile, "application/pdf");
            } else if (m2511b(str, context.getResources().getStringArray(R.array.fileTypeWord))) {
                intent = new Intent("android.intent.action.VIEW");
                intent.addCategory("android.intent.category.DEFAULT");
                intent.setDataAndType(uriForFile, "application/msword");
            } else if (m2511b(str, context.getResources().getStringArray(R.array.fileTypeExcel))) {
                intent = new Intent("android.intent.action.VIEW");
                intent.addCategory("android.intent.category.DEFAULT");
                intent.setDataAndType(uriForFile, "application/vnd.ms-excel");
            } else if (m2511b(str, context.getResources().getStringArray(R.array.fileTypePPT))) {
                intent = new Intent("android.intent.action.VIEW");
                intent.addCategory("android.intent.category.DEFAULT");
                intent.setDataAndType(uriForFile, "application/vnd.ms-powerpoint");
            } else {
                intent = new Intent("android.intent.action.VIEW");
                intent.setDataAndType(uriForFile, "*/*");
            }
            intent.setFlags(3);
        }
        return intent;
    }

    /* JADX INFO: renamed from: e */
    public static Object m2530e(String str, String str2) {
        try {
            Field declaredField = Class.forName(str).getDeclaredField(str2);
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
            return null;
        } catch (IllegalArgumentException e3) {
            e3.printStackTrace();
            return null;
        } catch (NoSuchFieldException e4) {
            e4.printStackTrace();
            return null;
        } catch (SecurityException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static String m2531e(String str) {
        int i = 0;
        C0085e c0085eM2438a = m2438a(str, 4);
        if (((List) c0085eM2438a.f229a).isEmpty()) {
            return str;
        }
        if (((List) c0085eM2438a.f230b).size() + ((List) c0085eM2438a.f229a).size() < 2) {
            return str;
        }
        List list = (List) c0085eM2438a.f229a;
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            Integer numValueOf = Integer.valueOf(((Integer) it.next()).intValue() + 1);
            int i2 = i + 1;
            sb.append(str.substring(iIntValue, numValueOf.intValue())).append(i2).append('$');
            iIntValue = numValueOf.intValue();
            i = i2;
        }
        sb.append(str.substring(iIntValue));
        return sb.toString();
    }

    /* JADX INFO: renamed from: e */
    public static boolean m2532e(int i) {
        if (i < -1) {
            return false;
        }
        if (i == -1) {
            return true;
        }
        int i2 = i & 255;
        if (i2 == 0 || i2 == 255) {
            return true;
        }
        return (65280 & i) == 0;
    }

    /* JADX INFO: renamed from: f */
    public static int m2533f(int i) {
        int i2 = i & 255;
        return (i2 == 0 || i2 == 255) ? i : i2;
    }

    /* JADX INFO: renamed from: f */
    private static boolean m2534f(Context context, String str) {
        File file = new File(str);
        boolean z = file.exists() && file.length() > ((long) (SettingEditorActivity.m2826d(context) << 10));
        if (z) {
            Toast.makeText(context, R.string.use_bfe_tip, 0);
        }
        return z;
    }

    /* JADX INFO: renamed from: f */
    public static byte[] m2535f(String str) throws UTFDataFormatException {
        long j = 0;
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            j = (cCharAt == 0 || cCharAt > 127) ? cCharAt <= 2047 ? j + 2 : j + 3 : j + 1;
            if (j > 65535) {
                throw new UTFDataFormatException("String more than 65535 UTF bytes long");
            }
        }
        byte[] bArr = new byte[(int) j];
        m2482a(bArr, 0, str);
        return bArr;
    }

    /* JADX INFO: renamed from: g */
    public static String m2536g(int i) {
        return m2454a(i, 30257, 1);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m2537g(String str) {
        return str.endsWith(".zip") || str.endsWith(".jar") || str.endsWith(".apk");
    }

    /* JADX INFO: renamed from: h */
    public static String m2538h(int i) {
        return m2454a(i, 30239, 1);
    }

    /* JADX INFO: renamed from: h */
    public static boolean m2539h(String str) {
        return f2805f != null ? f2805f.contains(str) : f2806g == null || !f2806g.contains(str);
    }

    /* JADX INFO: renamed from: i */
    public static String m2540i(int i) {
        return m2454a(i, 20703, 2);
    }

    /* JADX INFO: renamed from: i */
    public static void m2541i(String str) throws Throwable {
        RandomAccessFile randomAccessFile;
        byte[] bArr = new byte[4096];
        try {
            randomAccessFile = new RandomAccessFile(str, "rw");
            int i = 0;
            while (true) {
                try {
                    int i2 = randomAccessFile.read(bArr);
                    if (i2 == -1) {
                        randomAccessFile.close();
                        randomAccessFile.close();
                        return;
                    }
                    for (int i3 = 0; i3 < i2; i3++) {
                        bArr[i3] = (byte) (bArr[i3] ^ 85);
                    }
                    randomAccessFile.seek(i);
                    randomAccessFile.write(bArr, 0, i2);
                    i += i2;
                } catch (Throwable th) {
                    th = th;
                    if (randomAccessFile != null) {
                        randomAccessFile.close();
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile = null;
        }
    }

    public static boolean isNullOrEmpty(Collection<?> collection) {
        return collection == null || collection.isEmpty();
    }

    public static boolean isNullOrEmpty(Map<?, ?> map) {
        return map == null || map.isEmpty();
    }

    /* JADX INFO: renamed from: j */
    public static Object m2542j(String str) throws Throwable {
        ObjectInputStream objectInputStream;
        Throwable th;
        Object object = null;
        if (str != null) {
            try {
                objectInputStream = new ObjectInputStream(new FileInputStream(new File(str)));
                try {
                    try {
                        object = objectInputStream.readObject();
                        m2474a((Closeable) objectInputStream);
                    } catch (Exception e) {
                        e = e;
                        e.printStackTrace();
                        m2474a((Closeable) objectInputStream);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    m2474a((Closeable) objectInputStream);
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                objectInputStream = null;
            } catch (Throwable th3) {
                objectInputStream = null;
                th = th3;
                m2474a((Closeable) objectInputStream);
                throw th;
            }
        }
        return object;
    }

    /* JADX INFO: renamed from: j */
    public static String m2543j(int i) {
        return m2454a(i, 204287, 3);
    }

    /* JADX INFO: renamed from: k */
    public static String m2544k(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            byte[] bArrDigest = messageDigest.digest();
            char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
            char[] cArr2 = new char[bArrDigest.length << 1];
            int i = 0;
            for (byte b2 : bArrDigest) {
                int i2 = i + 1;
                cArr2[i] = cArr[(b2 >>> 4) & 15];
                i = i2 + 1;
                cArr2[i2] = cArr[b2 & Token.LITERAL3];
            }
            return new String(cArr2);
        } catch (NoSuchAlgorithmException e) {
            return null;
        }
    }

    /* JADX INFO: renamed from: k */
    public static boolean m2545k(int i) {
        return (i & 2) != 0;
    }

    /* JADX INFO: renamed from: l */
    public static String m2546l(String str) {
        if (str != null) {
            return str.substring(str.lastIndexOf(47) + 1);
        }
        return null;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m2547l(int i) {
        return (i & 8) != 0;
    }

    /* JADX INFO: renamed from: m */
    private static HashSet m2548m(String str) {
        HashSet hashSet = new HashSet();
        try {
            FileReader fileReader = new FileReader(str);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    fileReader.close();
                    return hashSet;
                }
                hashSet.add(line);
            }
        } catch (IOException e) {
            throw new RuntimeException("Error with optimize list: " + str, e);
        }
    }

    /* JADX INFO: renamed from: m */
    public static boolean m2549m(int i) {
        return (i & 32) != 0;
    }

    /* JADX INFO: renamed from: n */
    public static boolean m2550n(int i) {
        return (i & 1024) != 0;
    }

    /* JADX INFO: renamed from: o */
    public static boolean m2551o(int i) {
        return (i & 256) != 0;
    }

    /* JADX INFO: renamed from: p */
    public static boolean m2552p(int i) {
        return (i & 8192) != 0;
    }

    /* JADX INFO: renamed from: q */
    public static String m2553q(int i) {
        switch (i) {
            case 1:
                return "nop";
            case 2:
                return "move";
            case 3:
                return "move-param";
            case 4:
                return "move-exception";
            case 5:
                return "const";
            case 6:
                return "goto";
            case 7:
                return "if-eq";
            case 8:
                return "if-ne";
            case 9:
                return "if-lt";
            case 10:
                return "if-ge";
            case 11:
                return "if-le";
            case 12:
                return "if-gt";
            case 13:
                return "switch";
            case 14:
                return "add";
            case 15:
                return "sub";
            case 16:
                return "mul";
            case 17:
                return "div";
            case 18:
                return "rem";
            case 19:
                return "neg";
            case 20:
                return "and";
            case 21:
                return "or";
            case 22:
                return "xor";
            case 23:
                return "shl";
            case 24:
                return "shr";
            case 25:
                return "ushr";
            case 26:
                return "not";
            case 27:
                return "cmpl";
            case 28:
                return "cmpg";
            case 29:
                return "conv";
            case 30:
                return "to-byte";
            case 31:
                return "to-char";
            case 32:
                return "to-short";
            case 33:
                return "return";
            case 34:
                return "array-length";
            case 35:
                return "throw";
            case 36:
                return "monitor-enter";
            case 37:
                return "monitor-exit";
            case 38:
                return "aget";
            case 39:
                return "aput";
            case 40:
                return "new-instance";
            case 41:
                return "new-array";
            case 42:
                return "filled-new-array";
            case 43:
                return "check-cast";
            case 44:
                return "instance-of";
            case 45:
                return "get-field";
            case 46:
                return "get-static";
            case 47:
                return "put-field";
            case C0327R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 48 */:
                return "put-static";
            case C0327R.styleable.AppCompatTheme_spinnerDropDownItemStyle /* 49 */:
                return "invoke-static";
            case 50:
                return "invoke-virtual";
            case C0327R.styleable.AppCompatTheme_actionButtonStyle /* 51 */:
                return "invoke-super";
            case C0327R.styleable.AppCompatTheme_buttonBarStyle /* 52 */:
                return "invoke-direct";
            case C0327R.styleable.AppCompatTheme_buttonBarButtonStyle /* 53 */:
                return "invoke-interface";
            case C0327R.styleable.AppCompatTheme_selectableItemBackground /* 54 */:
            default:
                return "unknown-" + m2560x(i);
            case C0327R.styleable.AppCompatTheme_selectableItemBackgroundBorderless /* 55 */:
                return "move-result";
            case C0327R.styleable.AppCompatTheme_borderlessButtonStyle /* 56 */:
                return "move-result-pseudo";
            case C0327R.styleable.AppCompatTheme_dividerVertical /* 57 */:
                return "fill-array-data";
        }
    }

    /* JADX INFO: renamed from: r */
    public static int m2554r(int i) {
        switch (i) {
            case 7:
            case 8:
                return i;
            case 9:
                return 12;
            case 10:
                return 11;
            case 11:
                return 10;
            case 12:
                return 9;
            default:
                throw new RuntimeException("Unrecognized IF regop: " + i);
        }
    }

    /* JADX INFO: renamed from: s */
    public static int[] m2555s(int i) {
        return new int[(i + 31) >> 5];
    }

    /* JADX INFO: renamed from: t */
    public static String m2556t(int i) {
        char[] cArr = new char[8];
        for (int i2 = 0; i2 < 8; i2++) {
            cArr[7 - i2] = Character.forDigit(i & 15, 16);
            i >>= 4;
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: u */
    public static String m2557u(int i) {
        char[] cArr = new char[6];
        for (int i2 = 0; i2 < 6; i2++) {
            cArr[5 - i2] = Character.forDigit(i & 15, 16);
            i >>= 4;
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: v */
    public static String m2558v(int i) {
        char[] cArr = new char[4];
        for (int i2 = 0; i2 < 4; i2++) {
            cArr[3 - i2] = Character.forDigit(i & 15, 16);
            i >>= 4;
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: w */
    public static String m2559w(int i) {
        return i == ((char) i) ? m2558v(i) : m2556t(i);
    }

    /* JADX INFO: renamed from: x */
    public static String m2560x(int i) {
        char[] cArr = new char[2];
        for (int i2 = 0; i2 < 2; i2++) {
            cArr[1 - i2] = Character.forDigit(i & 15, 16);
            i >>= 4;
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: y */
    public static String m2561y(int i) {
        return new String(new char[]{Character.forDigit(i & 15, 16)});
    }

    /* JADX INFO: renamed from: z */
    public static String m2562z(int i) {
        char[] cArr = new char[9];
        if (i < 0) {
            cArr[0] = '-';
            i = -i;
        } else {
            cArr[0] = '+';
        }
        for (int i2 = 0; i2 < 8; i2++) {
            cArr[8 - i2] = Character.forDigit(i & 15, 16);
            i >>= 4;
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: a */
    public C0031e m2563a(C1067a c1067a, int i) throws C0000a {
        C0031e c0031eM3082b;
        new StringBuilder("*************************************id=").append(i);
        if (i != 1 || (c0031eM3082b = C1177bv.m3080a().m3082b()) == null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            C0031e[] c0031eArrM2492a = m2492a(c1067a, true);
            if (c0031eArrM2492a.length != 1) {
                throw new C0000a("Arsc files with zero or multiple packages");
            }
            c0031eM3082b = c0031eArrM2492a[0];
            if (c0031eM3082b.m55e() != i) {
                throw new C0000a("Expected pkg of id: " + String.valueOf(i) + ", got: " + c0031eM3082b.m55e());
            }
            c1067a.m2567a(c0031eM3082b, false);
            new StringBuilder("Loaded. Time=").append(System.currentTimeMillis() - jCurrentTimeMillis);
            C1177bv.m3080a().m3081a(c0031eM3082b);
        } else {
            c1067a.m2567a(c0031eM3082b, false);
        }
        return c0031eM3082b;
    }

    /* JADX INFO: renamed from: a */
    public C0032f m2564a(int i) {
        if ((i >> 24) == 0) {
            i |= 33554432;
        }
        return m2565a(new C0030d(i));
    }

    /* JADX INFO: renamed from: a */
    public C0032f m2565a(C0030d c0030d) {
        C0031e c0031eM2568b = m2568b(c0030d.f63a);
        if (c0031eM2568b != null) {
            return c0031eM2568b.m49b(c0030d);
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public Set m2566a() {
        return this.f2810c;
    }

    /* JADX INFO: renamed from: a */
    public void m2567a(C0031e c0031e, boolean z) throws C0000a {
        Integer numValueOf = Integer.valueOf(c0031e.m55e());
        if (this.f2808a.containsKey(numValueOf)) {
            throw new C0000a("Multiple packages: id=" + numValueOf.toString());
        }
        String strM56f = c0031e.m56f();
        if (this.f2809b.containsKey(strM56f)) {
            throw new C0000a("Multiple packages: name=" + strM56f);
        }
        this.f2808a.put(numValueOf, c0031e);
        this.f2809b.put(strM56f, c0031e);
        if (z) {
            this.f2810c.add(c0031e);
        } else {
            this.f2811d.add(c0031e);
        }
    }

    /* JADX INFO: renamed from: b */
    public C0031e m2568b(int i) {
        C0031e c0031e = (C0031e) this.f2808a.get(Integer.valueOf(i));
        if (c0031e != null) {
            return c0031e;
        }
        if (this.f2808a.get(1) == null) {
            try {
                return m2563a(this, i);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
