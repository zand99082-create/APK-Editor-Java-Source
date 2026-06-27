package org.p109c.p116b;

import com.p046a.p049b.p056b.C0614b;

/* JADX INFO: renamed from: org.c.b.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1783b {

    /* JADX INFO: renamed from: a */
    public static final String f5211a;

    /* JADX INFO: renamed from: b */
    public static final String f5212b;

    /* JADX INFO: renamed from: c */
    public static final String f5213c;

    /* JADX INFO: renamed from: d */
    public static final int f5214d;

    /* JADX INFO: renamed from: e */
    private static String f5215e;

    static {
        System.getProperty("java.specification.version");
        f5211a = System.getProperty("java.runtime.version");
        f5212b = System.getProperty("java.vm.info");
        f5213c = System.getProperty("java.vm.version");
        System.getProperty("java.vm.vendor");
        f5215e = System.getProperty("java.vm.name");
        f5214d = !f5215e.startsWith("Dalvik") ? 0 : m4186a();
    }

    /* JADX INFO: renamed from: a */
    private static int m4186a() {
        try {
            Class<?> cls = Class.forName("android.os.Build$VERSION");
            try {
                try {
                    return ((Integer) cls.getField("SDK_INT").get(null)).intValue();
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
            } catch (NoSuchFieldException e2) {
                return m4187a(cls);
            }
        } catch (ClassNotFoundException e3) {
            throw new C0614b(e3);
        }
    }

    /* JADX INFO: renamed from: a */
    private static int m4187a(Class cls) {
        try {
            try {
                return Integer.parseInt((String) cls.getField("SDK").get(null));
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        } catch (NoSuchFieldException e2) {
            throw new C0614b(e2);
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m4188a(String str) {
        return f5215e.startsWith(str);
    }
}
