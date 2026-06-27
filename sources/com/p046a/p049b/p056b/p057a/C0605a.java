package com.p046a.p049b.p056b.p057a;

import com.p046a.p047a.C0492i;
import com.p046a.p047a.C0502s;
import com.p046a.p049b.p050a.p054d.C0573b;
import com.p046a.p049b.p050a.p054d.C0575d;
import com.p046a.p049b.p050a.p054d.C0582k;
import com.p046a.p049b.p050a.p054d.C0587p;
import com.p046a.p049b.p050a.p054d.InterfaceC0580i;
import com.p046a.p049b.p050a.p055e.C0596i;
import com.p046a.p049b.p056b.C0604a;
import com.p046a.p049b.p058c.p059a.C0616a;
import com.p046a.p049b.p058c.p059a.C0618c;
import com.p046a.p049b.p058c.p062c.C0724j;
import com.p046a.p049b.p058c.p062c.C0732r;
import com.p046a.p049b.p058c.p062c.C0736v;
import com.p046a.p049b.p065e.C0800a;
import com.p046a.p049b.p065e.C0801b;
import com.p046a.p049b.p066f.p067a.C0822a;
import com.p046a.p049b.p066f.p067a.C0824c;
import com.p046a.p049b.p066f.p067a.C0825d;
import com.p046a.p049b.p066f.p069c.C0883y;
import jadx.core.codegen.CodeWriter;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.jar.Attributes;
import java.util.jar.JarEntry;
import java.util.jar.JarOutputStream;
import java.util.jar.Manifest;

/* JADX INFO: renamed from: com.a.b.b.a.a */
/* JADX INFO: loaded from: classes.dex */
public class C0605a {

    /* JADX INFO: renamed from: a */
    private static final Attributes.Name f990a;

    /* JADX INFO: renamed from: b */
    private static final String[] f991b;

    /* JADX INFO: renamed from: c */
    private static AtomicInteger f992c;

    /* JADX INFO: renamed from: d */
    private static C0607c f993d;

    /* JADX INFO: renamed from: e */
    private static C0732r f994e;

    /* JADX INFO: renamed from: f */
    private static TreeMap f995f;

    /* JADX INFO: renamed from: g */
    private static final List f996g;

    /* JADX INFO: renamed from: h */
    private static ExecutorService f997h;

    /* JADX INFO: renamed from: i */
    private static List f998i;

    /* JADX INFO: renamed from: j */
    private static volatile boolean f999j;

    /* JADX INFO: renamed from: k */
    private static long f1000k;

    /* JADX INFO: renamed from: l */
    private static Set f1001l;

    /* JADX INFO: renamed from: m */
    private static List f1002m;

    /* JADX INFO: renamed from: n */
    private static OutputStreamWriter f1003n;

    /* JADX INFO: renamed from: o */
    private static /* synthetic */ boolean f1004o;

    static {
        f1004o = !C0605a.class.desiredAssertionStatus();
        f990a = new Attributes.Name("Created-By");
        f991b = new String[]{"accessibility", "crypto", "imageio", "management", "naming", "net", "print", "rmi", "security", "sip", "sound", "sql", "swing", "transaction", "xml"};
        f992c = new AtomicInteger(0);
        f996g = new ArrayList();
        f1000k = 0L;
        f1001l = null;
        f1002m = new ArrayList();
        f1003n = null;
    }

    private C0605a() {
    }

    /* JADX INFO: renamed from: a */
    public static int m1061a(C0607c c0607c) throws IOException {
        OutputStream outputStream;
        File file;
        byte[] bArrM1083h;
        int iM1078e;
        byte[] byteArray = null;
        f992c.set(0);
        f996g.clear();
        f993d = c0607c;
        c0607c.makeOptionsObjects();
        if (f993d.humanOutName != null) {
            OutputStream outputStreamM1079e = m1079e(f993d.humanOutName);
            f1003n = new OutputStreamWriter(outputStreamM1079e);
            outputStream = outputStreamM1079e;
        } else {
            outputStream = null;
        }
        try {
            if (f993d.multiDex) {
                iM1078e = m1078e();
            } else {
                if (!f993d.incremental) {
                    file = null;
                } else if (f993d.outName == null) {
                    System.err.println("error: no incremental output name specified");
                    iM1078e = -1;
                } else {
                    File file2 = new File(f993d.outName);
                    if (file2.exists()) {
                        f1000k = file2.lastModified();
                    }
                    file = file2;
                }
                if (!m1081f()) {
                    iM1078e = 1;
                } else if (!f993d.incremental || f999j) {
                    if (f994e.m1479a() && f993d.humanOutName == null) {
                        bArrM1083h = null;
                    } else {
                        bArrM1083h = m1083h();
                        if (bArrM1083h == null) {
                            iM1078e = 2;
                        }
                    }
                    if (f993d.incremental) {
                        C0492i c0492i = bArrM1083h != null ? new C0492i(bArrM1083h) : null;
                        C0492i c0492i2 = file.exists() ? new C0492i(file) : null;
                        if (c0492i != null || c0492i2 != null) {
                            C0492i c0492iM1635a = c0492i == null ? c0492i2 : c0492i2 == null ? c0492i : new C0801b(c0492i, c0492i2, C0800a.f1858a).m1635a();
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            c0492iM1635a.m619a(byteArrayOutputStream);
                            byteArray = byteArrayOutputStream.toByteArray();
                        }
                    } else {
                        byteArray = bArrM1083h;
                    }
                    byte[] bArrM1070a = m1070a(byteArray);
                    if (f993d.jarOutput) {
                        f994e = null;
                        if (bArrM1070a != null) {
                            f995f.put("classes.dex", bArrM1070a);
                        }
                        if (!m1077d(f993d.outName)) {
                            iM1078e = 3;
                        }
                    } else if (bArrM1070a != null && f993d.outName != null) {
                        OutputStream outputStreamM1079e2 = m1079e(f993d.outName);
                        outputStreamM1079e2.write(bArrM1070a);
                        m1065a(outputStreamM1079e2);
                    }
                    iM1078e = 0;
                } else {
                    iM1078e = 0;
                }
            }
            return iM1078e;
        } finally {
            m1065a(outputStream);
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m1062a() {
        return f993d.multiDex ? "The list of classes given in --main-dex-list is too big and does not fit in the main dex." : "You may try using --multi-dex option.";
    }

    /* JADX INFO: renamed from: a */
    private static String m1063a(int i) {
        return i == 0 ? "classes.dex" : "classes" + (i + 1) + ".dex";
    }

    /* JADX INFO: renamed from: a */
    private static void m1065a(OutputStream outputStream) throws IOException {
        if (outputStream == null) {
            return;
        }
        outputStream.flush();
        if (outputStream != System.out) {
            outputStream.close();
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m1066a(String str, InterfaceC0580i interfaceC0580i) {
        byte b2 = 0;
        C0575d c0575d = new C0575d(str, false, interfaceC0580i, new C0606b());
        if (f993d.numThreads > 1) {
            f998i.add(f997h.submit(new CallableC0612h(c0575d, b2)));
        } else if (c0575d.m991a()) {
            f999j = true;
        }
    }

    /* JADX INFO: renamed from: a */
    private static boolean m1068a(String str, byte[] bArr) {
        boolean z;
        if (!f993d.coreLibrary) {
            if (str.startsWith("java/")) {
                z = true;
            } else if (str.startsWith("javax/")) {
                int iIndexOf = str.indexOf(47, 6);
                if (iIndexOf == -1) {
                    z = true;
                } else {
                    z = Arrays.binarySearch(f991b, str.substring(6, iIndexOf)) >= 0;
                }
            } else {
                z = false;
            }
            if (z) {
                C0604a.f989b.println("\ntrouble processing \"" + str + "\":\n\nIll-advised or mistaken usage of a core class (java.* or javax.*)\nwhen not building a core library.\n\nThis is often due to inadvertently including a core library file\nin your application's project, when using an IDE (such as\nEclipse). If you are sure you're not intentionally defining a\ncore class, then this is the most likely explanation of what's\ngoing on.\n\nHowever, you might actually be trying to define a class in a core\nnamespace, the source of which you may have taken, for example,\nfrom a non-Android virtual machine project. This will most\nassuredly not work. At a minimum, it jeopardizes the\ncompatibility of your app with future versions of the platform.\nIt is also often of questionable legality.\n\nIf you really intend to build a core library -- which is only\nappropriate as part of creating a full virtual machine\ndistribution, as opposed to compiling an application -- then use\nthe \"--core-library\" option to suppress this error message.\n\nIf you go ahead and use \"--core-library\" but are in fact\nbuilding an application, then be forewarned that your application\nwill still fail to build or run, at some point. Please be\nprepared for angry customers who find, for example, that your\napplication ceases to function once they upgrade their operating\nsystem. You will be to blame for this problem.\n\nIf you are legitimately using some code that happens to be in a\ncore package, then the easiest safe alternative you have is to\nrepackage that code. That is, move the classes in question into\nyour own package namespace. This means that they will never be in\nconflict with core system classes. JarJar is a tool that may help\nyou in this endeavor. If you find that you cannot do this, then\nthat is an indication that the path you are on will ultimately\nlead to pain, suffering, grief, and lamentation.\n");
                f992c.incrementAndGet();
                throw new C0613i((byte) 0);
            }
        }
        C0582k c0582k = new C0582k(bArr, str, f993d.cfOptions$4cfd32cd.f1017c);
        c0582k.m1006a((C0573b) C0587p.f981a);
        c0582k.m1008c();
        int size = f994e.m1494n().mo1308a().size();
        int size2 = f994e.m1493m().mo1308a().size();
        int iMo1868a = c0582k.m1012g().mo1868a();
        int iM1054d_ = size + iMo1868a + c0582k.m1015j().m1054d_() + 2;
        int iM1052d_ = iMo1868a + size2 + c0582k.m1014i().m1052d_() + 9;
        if (f993d.multiDex && f994e.m1489i().mo1308a().size() > 0 && (iM1054d_ > f993d.maxNumberOfIdxPerDex || iM1052d_ > f993d.maxNumberOfIdxPerDex)) {
            C0732r c0732r = f994e;
            m1082g();
            if (!f1004o && (c0732r.m1494n().mo1308a().size() > size + 2 || c0732r.m1493m().mo1308a().size() > size2 + 9)) {
                throw new AssertionError();
            }
        }
        try {
            C0724j c0724jM1090a = C0616a.m1090a(c0582k, bArr, f993d.cfOptions$4cfd32cd, f993d.dexOptions, f994e);
            synchronized (f994e) {
                f994e.m1477a(c0724jM1090a);
            }
            return true;
        } catch (C0596i e) {
            C0604a.f989b.println("\ntrouble processing:");
            if (f993d.debug) {
                e.printStackTrace(C0604a.f989b);
            } else {
                e.m572a(C0604a.f989b);
            }
            f992c.incrementAndGet();
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    static /* synthetic */ boolean m1069a(boolean z) {
        f999j = true;
        return true;
    }

    /* JADX INFO: renamed from: a */
    private static byte[] m1070a(byte[] bArr) {
        for (byte[] bArr2 : f996g) {
            bArr = bArr == null ? bArr2 : new C0801b(new C0492i(bArr), new C0492i(bArr2), C0800a.f1859b).m1635a().m624d();
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static boolean m1073b(String str, long j, byte[] bArr) {
        boolean zEndsWith = str.endsWith(".class");
        boolean zEquals = str.equals("classes.dex");
        boolean z = f995f != null;
        if (!zEndsWith && !zEquals && !z) {
            if (!f993d.verbose) {
                return false;
            }
            C0604a.f988a.println("ignored resource " + str);
            return false;
        }
        if (f993d.verbose) {
            C0604a.f988a.println("processing " + str + "...");
        }
        String strM1080f = m1080f(str);
        if (zEndsWith) {
            if (z && f993d.keepClassesInJar) {
                synchronized (f995f) {
                    f995f.put(strM1080f, bArr);
                }
            }
            if (j < f1000k) {
                return true;
            }
            return m1068a(strM1080f, bArr);
        }
        if (zEquals) {
            synchronized (f996g) {
                f996g.add(bArr);
            }
            return true;
        }
        synchronized (f995f) {
            f995f.put(strM1080f, bArr);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static Set m1075c(String str) throws Throwable {
        BufferedReader bufferedReader;
        HashSet hashSet = new HashSet();
        try {
            bufferedReader = new BufferedReader(new FileReader(str));
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        bufferedReader.close();
                        return hashSet;
                    }
                    hashSet.add(m1080f(line));
                } catch (Throwable th) {
                    th = th;
                    if (bufferedReader != null) {
                        bufferedReader.close();
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            bufferedReader = null;
        }
    }

    /* JADX INFO: renamed from: d */
    private static boolean m1077d(String str) {
        Manifest manifest;
        Attributes attributes;
        try {
            byte[] bArr = (byte[]) f995f.get("META-INF/MANIFEST.MF");
            if (bArr == null) {
                Manifest manifest2 = new Manifest();
                Attributes mainAttributes = manifest2.getMainAttributes();
                mainAttributes.put(Attributes.Name.MANIFEST_VERSION, "1.0");
                manifest = manifest2;
                attributes = mainAttributes;
            } else {
                Manifest manifest3 = new Manifest(new ByteArrayInputStream(bArr));
                Attributes mainAttributes2 = manifest3.getMainAttributes();
                f995f.remove("META-INF/MANIFEST.MF");
                manifest = manifest3;
                attributes = mainAttributes2;
            }
            String value = attributes.getValue(f990a);
            attributes.put(f990a, (value == null ? "" : value + " + ") + "dx 1.10");
            attributes.putValue("Dex-Location", "classes.dex");
            OutputStream outputStreamM1079e = m1079e(str);
            JarOutputStream jarOutputStream = new JarOutputStream(outputStreamM1079e, manifest);
            try {
                for (Map.Entry entry : f995f.entrySet()) {
                    String str2 = (String) entry.getKey();
                    byte[] bArr2 = (byte[]) entry.getValue();
                    JarEntry jarEntry = new JarEntry(str2);
                    int length = bArr2.length;
                    if (f993d.verbose) {
                        C0604a.f988a.println("writing " + str2 + "; size " + length + "...");
                    }
                    jarEntry.setSize(length);
                    jarOutputStream.putNextEntry(jarEntry);
                    jarOutputStream.write(bArr2);
                    jarOutputStream.closeEntry();
                }
                return true;
            } finally {
                jarOutputStream.finish();
                jarOutputStream.flush();
                m1065a(outputStreamM1079e);
            }
        } catch (Exception e) {
            if (f993d.debug) {
                C0604a.f989b.println("\ntrouble writing output:");
                e.printStackTrace(C0604a.f989b);
            } else {
                C0604a.f989b.println("\ntrouble writing output: " + e.getMessage());
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: e */
    private static int m1078e() throws IOException {
        if (!f1004o && f993d.incremental) {
            throw new AssertionError();
        }
        if (!f1004o && f993d.numThreads != 1) {
            throw new AssertionError();
        }
        if (f993d.mainDexListFile != null) {
            f1001l = m1075c(f993d.mainDexListFile);
        }
        if (!m1081f()) {
            return 1;
        }
        if (!f996g.isEmpty()) {
            throw new C0502s("Library dex files are not supported in multi-dex mode");
        }
        if (f994e != null) {
            f1002m.add(m1083h());
            f994e = null;
        }
        if (f993d.jarOutput) {
            for (int i = 0; i < f1002m.size(); i++) {
                f995f.put(m1063a(i), f1002m.get(i));
            }
            return !m1077d(f993d.outName) ? 3 : 0;
        }
        if (f993d.outName == null) {
            return 0;
        }
        File file = new File(f993d.outName);
        if (!f1004o && !file.isDirectory()) {
            throw new AssertionError();
        }
        for (int i2 = 0; i2 < f1002m.size(); i2++) {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(file, m1063a(i2)));
            try {
                fileOutputStream.write((byte[]) f1002m.get(i2));
                m1065a(fileOutputStream);
            } catch (Throwable th) {
                m1065a(fileOutputStream);
                throw th;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: e */
    private static OutputStream m1079e(String str) {
        return (str.equals("-") || str.startsWith("-.")) ? System.out : new FileOutputStream(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static String m1080f(String str) {
        if (File.separatorChar == '\\') {
            str = str.replace('\\', '/');
        }
        int iLastIndexOf = str.lastIndexOf("/./");
        return iLastIndexOf != -1 ? str.substring(iLastIndexOf + 3) : str.startsWith("./") ? str.substring(2) : str;
    }

    /* JADX INFO: renamed from: f */
    private static boolean m1081f() {
        m1082g();
        if (f993d.jarOutput) {
            f995f = new TreeMap();
        }
        f999j = false;
        String[] strArr = f993d.fileNames;
        if (f993d.numThreads > 1) {
            f997h = Executors.newFixedThreadPool(f993d.numThreads);
            f998i = new ArrayList();
        }
        try {
            if (f993d.mainDexListFile != null) {
                InterfaceC0580i c0610f = f993d.strictNameCheck ? new C0610f((byte) 0) : new C0609e();
                for (String str : strArr) {
                    m1066a(str, c0610f);
                }
                if (f1002m.size() > 0) {
                    throw new C0502s("Too many classes in --main-dex-list, main dex capacity exceeded");
                }
                if (f993d.minimalMainDex) {
                    m1082g();
                }
                for (String str2 : strArr) {
                    m1066a(str2, new C0611g(c0610f, (byte) 0));
                }
            } else {
                for (String str3 : strArr) {
                    m1066a(str3, C0575d.f951a);
                }
            }
        } catch (C0613i e) {
        }
        if (f993d.numThreads > 1) {
            try {
                f997h.shutdown();
                if (!f997h.awaitTermination(600L, TimeUnit.SECONDS)) {
                    throw new RuntimeException("Timed out waiting for threads.");
                }
                try {
                    Iterator it = f998i.iterator();
                    while (it.hasNext()) {
                        ((Future) it.next()).get();
                    }
                } catch (InterruptedException e2) {
                    throw new AssertionError(e2);
                } catch (ExecutionException e3) {
                    if (e3.getCause() instanceof Error) {
                        throw ((Error) e3.getCause());
                    }
                    throw new AssertionError(e3.getCause());
                }
            } catch (InterruptedException e4) {
                f997h.shutdownNow();
                throw new RuntimeException("A thread has been interrupted.");
            }
        }
        int i = f992c.get();
        if (i != 0) {
            C0604a.f989b.println(i + " error" + (i == 1 ? "" : "s") + "; aborting");
            return false;
        }
        if (f993d.incremental && !f999j) {
            return true;
        }
        if (!f999j && !f993d.emptyOk) {
            C0604a.f989b.println("no classfiles specified");
            return false;
        }
        if (f993d.optimize && f993d.statistics) {
            C0618c.m1101a(C0604a.f988a);
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    private static void m1082g() {
        if (f994e != null) {
            f1002m.add(m1083h());
        }
        f994e = new C0732r(f993d.dexOptions);
        if (f993d.dumpWidth != 0) {
            f994e.m1476a(f993d.dumpWidth);
        }
    }

    /* JADX INFO: renamed from: h */
    private static byte[] m1083h() {
        byte[] bArrM1480a;
        try {
            try {
                if (f993d.methodToDump != null) {
                    f994e.m1480a((Writer) null, false);
                    C0732r c0732r = f994e;
                    String str = f993d.methodToDump;
                    OutputStreamWriter outputStreamWriter = f1003n;
                    boolean zEndsWith = str.endsWith("*");
                    int iLastIndexOf = str.lastIndexOf(46);
                    if (iLastIndexOf <= 0 || iLastIndexOf == str.length() - 1) {
                        C0604a.f989b.println("bogus fully-qualified method name: " + str);
                        bArrM1480a = null;
                    } else {
                        String strReplace = str.substring(0, iLastIndexOf).replace('.', '/');
                        String strSubstring = str.substring(iLastIndexOf + 1);
                        C0724j c0724jM1475a = c0732r.m1475a(strReplace);
                        if (c0724jM1475a == null) {
                            C0604a.f989b.println("no such class: " + strReplace);
                            bArrM1480a = null;
                        } else {
                            String strSubstring2 = zEndsWith ? strSubstring.substring(0, strSubstring.length() - 1) : strSubstring;
                            ArrayList<C0736v> arrayListM1445g = c0724jM1475a.m1445g();
                            TreeMap treeMap = new TreeMap();
                            for (C0736v c0736v : arrayListM1445g) {
                                String strM1911j = c0736v.m1505a().m1911j();
                                if ((zEndsWith && strM1911j.startsWith(strSubstring2)) || (!zEndsWith && strM1911j.equals(strSubstring2))) {
                                    treeMap.put(c0736v.m1508c().m1899l(), c0736v);
                                }
                            }
                            if (treeMap.size() == 0) {
                                C0604a.f989b.println("no such method: " + str);
                                bArrM1480a = null;
                            } else {
                                PrintWriter printWriter = new PrintWriter(outputStreamWriter);
                                for (C0736v c0736v2 : treeMap.values()) {
                                    c0736v2.m1507a(printWriter, f993d.verboseDump);
                                    C0883y c0883yM1444f = c0724jM1475a.m1444f();
                                    if (c0883yM1444f != null) {
                                        printWriter.println("  source file: " + c0883yM1444f.m1910i());
                                    }
                                    C0824c c0824cM1431a = c0724jM1475a.m1431a(c0736v2.m1508c());
                                    C0825d c0825dM1439b = c0724jM1475a.m1439b(c0736v2.m1508c());
                                    if (c0824cM1431a != null) {
                                        printWriter.println("  method annotations:");
                                        Iterator it = c0824cM1431a.m1712d().iterator();
                                        while (it.hasNext()) {
                                            printWriter.println(CodeWriter.INDENT + ((C0822a) it.next()));
                                        }
                                    }
                                    if (c0825dM1439b != null) {
                                        printWriter.println("  parameter annotations:");
                                        int iD_ = c0825dM1439b.m2239d_();
                                        for (int i = 0; i < iD_; i++) {
                                            printWriter.println("    parameter " + i);
                                            Iterator it2 = c0825dM1439b.m1714a(i).m1712d().iterator();
                                            while (it2.hasNext()) {
                                                printWriter.println("      " + ((C0822a) it2.next()));
                                            }
                                        }
                                    }
                                }
                                printWriter.flush();
                                bArrM1480a = null;
                            }
                        }
                    }
                } else {
                    bArrM1480a = f994e.m1480a(f1003n, f993d.verboseDump);
                }
                if (f993d.statistics) {
                    C0604a.f988a.println(f994e.m1498r().m1367a());
                }
            } finally {
                if (f1003n != null) {
                    f1003n.flush();
                }
            }
        } catch (Exception e) {
            if (f993d.debug) {
                C0604a.f989b.println("\ntrouble writing output:");
                e.printStackTrace(C0604a.f989b);
            } else {
                C0604a.f989b.println("\ntrouble writing output: " + e.getMessage());
            }
            return null;
        }
    }
}
