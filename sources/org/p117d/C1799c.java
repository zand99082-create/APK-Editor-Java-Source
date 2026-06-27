package org.p117d;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import org.p117d.p118a.C1789d;
import org.p117d.p119b.C1793c;
import org.p117d.p119b.C1795e;
import org.p117d.p119b.C1796f;
import org.p117d.p119b.C1797g;
import org.slf4j.impl.StaticLoggerBinder;

/* JADX INFO: renamed from: org.d.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1799c {

    /* JADX INFO: renamed from: a */
    private static volatile int f5239a = 0;

    /* JADX INFO: renamed from: b */
    private static C1796f f5240b = new C1796f();

    /* JADX INFO: renamed from: c */
    private static C1793c f5241c = new C1793c();

    /* JADX INFO: renamed from: d */
    private static boolean f5242d = C1797g.m4221b("slf4j.detectLoggerNameMismatch");

    /* JADX INFO: renamed from: e */
    private static final String[] f5243e = {"1.6", "1.7"};

    /* JADX INFO: renamed from: f */
    private static String f5244f = "org/slf4j/impl/StaticLoggerBinder.class";

    private C1799c() {
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC1790b m4223a(Class cls) {
        Class clsM4217a;
        InterfaceC1790b interfaceC1790bM4224a = m4224a(cls.getName());
        if (f5242d && (clsM4217a = C1797g.m4217a()) != null) {
            if (!clsM4217a.isAssignableFrom(cls)) {
                C1797g.m4222c(String.format("Detected logger name mismatch. Given name: \"%s\"; computed name: \"%s\".", interfaceC1790bM4224a.mo4191a(), clsM4217a.getName()));
                C1797g.m4222c("See http://www.slf4j.org/codes.html#loggerNameMismatch for an explanation");
            }
        }
        return interfaceC1790bM4224a;
    }

    /* JADX INFO: renamed from: a */
    private static InterfaceC1790b m4224a(String str) {
        return m4231e().mo4189a(str);
    }

    /* JADX INFO: renamed from: a */
    private static void m4225a() {
        synchronized (f5240b) {
            f5240b.m4215c();
            for (C1795e c1795e : f5240b.m4213a()) {
                c1795e.m4209a(m4224a(c1795e.mo4191a()));
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m4226a(Throwable th) {
        f5239a = 2;
        C1797g.m4219a("Failed to instantiate SLF4J LoggerFactory", th);
    }

    /* JADX INFO: renamed from: a */
    private static boolean m4227a(Set set) {
        return set.size() > 1;
    }

    /* JADX INFO: renamed from: b */
    private static void m4228b() {
        LinkedBlockingQueue linkedBlockingQueueM4214b = f5240b.m4214b();
        int size = linkedBlockingQueueM4214b.size();
        int i = 0;
        ArrayList<C1789d> arrayList = new ArrayList(128);
        while (linkedBlockingQueueM4214b.drainTo(arrayList, 128) != 0) {
            int i2 = i;
            for (C1789d c1789d : arrayList) {
                if (c1789d != null) {
                    C1795e c1795eM4206a = c1789d.m4206a();
                    String strMo4191a = c1795eM4206a.mo4191a();
                    if (c1795eM4206a.m4211c()) {
                        throw new IllegalStateException("Delegate logger cannot be null at this state.");
                    }
                    if (!c1795eM4206a.m4212d()) {
                        if (c1795eM4206a.m4210b()) {
                            c1795eM4206a.m4208a(c1789d);
                        } else {
                            C1797g.m4222c(strMo4191a);
                        }
                    }
                }
                int i3 = i2 + 1;
                if (i2 == 0) {
                    if (c1789d.m4206a().m4210b()) {
                        C1797g.m4222c("A number (" + size + ") of logging calls during the initialization phase have been intercepted and are");
                        C1797g.m4222c("now being replayed. These are subject to the filtering rules of the underlying logging system.");
                        C1797g.m4222c("See also http://www.slf4j.org/codes.html#replay");
                        i2 = i3;
                    } else if (!c1789d.m4206a().m4212d()) {
                        C1797g.m4222c("The following set of substitute loggers may have been accessed");
                        C1797g.m4222c("during the initialization phase. Logging calls during this");
                        C1797g.m4222c("phase were not honored. However, subsequent logging calls to these");
                        C1797g.m4222c("loggers will work as normally expected.");
                        C1797g.m4222c("See also http://www.slf4j.org/codes.html#substituteLogger");
                    }
                }
                i2 = i3;
            }
            arrayList.clear();
            i = i2;
        }
    }

    /* JADX INFO: renamed from: c */
    private static final void m4229c() {
        boolean z = false;
        try {
            String str = StaticLoggerBinder.REQUESTED_API_VERSION;
            String[] strArr = f5243e;
            for (int i = 0; i < 2; i++) {
                if (str.startsWith(strArr[i])) {
                    z = true;
                }
            }
            if (z) {
                return;
            }
            C1797g.m4222c("The requested version " + str + " by your slf4j binding is not compatible with " + Arrays.asList(f5243e).toString());
            C1797g.m4222c("See http://www.slf4j.org/codes.html#version_mismatch for further details.");
        } catch (NoSuchFieldError e) {
        } catch (Throwable th) {
            C1797g.m4219a("Unexpected problem occured during version sanity check", th);
        }
    }

    /* JADX INFO: renamed from: d */
    private static Set m4230d() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            ClassLoader classLoader = C1799c.class.getClassLoader();
            Enumeration<URL> systemResources = classLoader == null ? ClassLoader.getSystemResources(f5244f) : classLoader.getResources(f5244f);
            while (systemResources.hasMoreElements()) {
                linkedHashSet.add(systemResources.nextElement());
            }
        } catch (IOException e) {
            C1797g.m4219a("Error getting resources from path", e);
        }
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: e */
    private static InterfaceC1785a m4231e() {
        boolean zContains;
        boolean z = true;
        if (f5239a == 0) {
            synchronized (C1799c.class) {
                if (f5239a == 0) {
                    f5239a = 1;
                    Set set = null;
                    if ("http://www.android.com/" == 0) {
                        zContains = false;
                    } else {
                        try {
                            try {
                                zContains = "http://www.android.com/".toLowerCase().contains("android");
                            } catch (Exception e) {
                                m4226a(e);
                                throw new IllegalStateException("Unexpected initialization failure", e);
                            }
                        } catch (NoClassDefFoundError e2) {
                            String message = e2.getMessage();
                            if (message == null || (!message.contains("org/slf4j/impl/StaticLoggerBinder") && !message.contains("org.slf4j.impl.StaticLoggerBinder"))) {
                                z = false;
                            }
                            if (!z) {
                                m4226a(e2);
                                throw e2;
                            }
                            f5239a = 4;
                            C1797g.m4222c("Failed to load class \"org.slf4j.impl.StaticLoggerBinder\".");
                            C1797g.m4222c("Defaulting to no-operation (NOP) logger implementation");
                            C1797g.m4222c("See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.");
                        } catch (NoSuchMethodError e3) {
                            String message2 = e3.getMessage();
                            if (message2 != null && message2.contains("org.slf4j.impl.StaticLoggerBinder.getSingleton()")) {
                                f5239a = 2;
                                C1797g.m4222c("slf4j-api 1.6.x (or later) is incompatible with this binding.");
                                C1797g.m4222c("Your binding is version 1.5.5 or earlier.");
                                C1797g.m4222c("Upgrade your binding to version 1.6.x.");
                            }
                            throw e3;
                        }
                    }
                    if (!zContains) {
                        Set setM4230d = m4230d();
                        if (m4227a(setM4230d)) {
                            C1797g.m4222c("Class path contains multiple SLF4J bindings.");
                            Iterator it = setM4230d.iterator();
                            while (it.hasNext()) {
                                C1797g.m4222c("Found binding in [" + ((URL) it.next()) + "]");
                            }
                            C1797g.m4222c("See http://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
                        }
                        set = setM4230d;
                    }
                    StaticLoggerBinder.getSingleton();
                    f5239a = 3;
                    if (set != null && m4227a(set)) {
                        C1797g.m4222c("Actual binding is of type [" + StaticLoggerBinder.getSingleton().getLoggerFactoryClassStr() + "]");
                    }
                    m4225a();
                    m4228b();
                    f5240b.m4216d();
                    if (f5239a == 3) {
                        m4229c();
                    }
                }
            }
        }
        switch (f5239a) {
            case 1:
                return f5240b;
            case 2:
                throw new IllegalStateException("org.slf4j.LoggerFactory could not be successfully initialized. See also http://www.slf4j.org/codes.html#unsuccessfulInit");
            case 3:
                return StaticLoggerBinder.getSingleton().getLoggerFactory();
            case 4:
                return f5241c;
            default:
                throw new IllegalStateException("Unreachable code");
        }
    }
}
