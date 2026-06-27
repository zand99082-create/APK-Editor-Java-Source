package org.p117d.p119b;

/* JADX INFO: renamed from: org.d.b.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1797g {

    /* JADX INFO: renamed from: a */
    private static C1798h f5237a;

    /* JADX INFO: renamed from: b */
    private static boolean f5238b = false;

    private C1797g() {
    }

    /* JADX INFO: renamed from: a */
    public static Class m4217a() {
        C1798h c1798h;
        if (f5237a != null) {
            c1798h = f5237a;
        } else if (f5238b) {
            c1798h = null;
        } else {
            f5237a = m4220b();
            f5238b = true;
            c1798h = f5237a;
        }
        if (c1798h == null) {
            return null;
        }
        Class[] classContext = c1798h.getClassContext();
        String name = C1797g.class.getName();
        int i = 0;
        while (i < classContext.length && !name.equals(classContext[i].getName())) {
            i++;
        }
        if (i >= classContext.length || i + 2 >= classContext.length) {
            throw new IllegalStateException("Failed to find org.slf4j.helpers.Util or its caller in the stack; this should not happen");
        }
        return classContext[i + 2];
    }

    /* JADX INFO: renamed from: a */
    public static String m4218a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("null input");
        }
        try {
            return System.getProperty(str);
        } catch (SecurityException e) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m4219a(String str, Throwable th) {
        System.err.println(str);
        System.err.println("Reported exception:");
        th.printStackTrace();
    }

    /* JADX INFO: renamed from: b */
    private static C1798h m4220b() {
        try {
            return new C1798h((byte) 0);
        } catch (SecurityException e) {
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m4221b(String str) {
        String strM4218a = m4218a(str);
        if (strM4218a == null) {
            return false;
        }
        return strM4218a.equalsIgnoreCase("true");
    }

    /* JADX INFO: renamed from: c */
    public static final void m4222c(String str) {
        System.err.println("SLF4J: " + str);
    }
}
