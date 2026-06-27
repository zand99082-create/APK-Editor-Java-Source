package org.p109c.p110a.p115e;

import com.p046a.p049b.p056b.C0614b;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.p109c.p110a.InterfaceC1770a;

/* JADX INFO: renamed from: org.c.a.e.a */
/* JADX INFO: loaded from: classes.dex */
public class C1779a implements InterfaceC1770a {

    /* JADX INFO: renamed from: a */
    private final Constructor f5208a;

    public C1779a(Class cls) {
        this.f5208a = m4181a(cls, m4184c());
        this.f5208a.setAccessible(true);
    }

    /* JADX INFO: renamed from: a */
    private static Object m4180a(Class cls) {
        try {
            return cls.getDeclaredMethod("getReflectionFactory", new Class[0]).invoke(null, new Object[0]);
        } catch (IllegalAccessException e) {
            throw new C0614b(e);
        } catch (IllegalArgumentException e2) {
            throw new C0614b(e2);
        } catch (NoSuchMethodException e3) {
            throw new C0614b(e3);
        } catch (InvocationTargetException e4) {
            throw new C0614b(e4);
        }
    }

    /* JADX INFO: renamed from: a */
    public static Constructor m4181a(Class cls, Constructor constructor) {
        Class clsM4182b = m4182b();
        try {
            return (Constructor) m4183b(clsM4182b).invoke(m4180a(clsM4182b), cls, constructor);
        } catch (IllegalAccessException e) {
            throw new C0614b(e);
        } catch (IllegalArgumentException e2) {
            throw new C0614b(e2);
        } catch (InvocationTargetException e3) {
            throw new C0614b(e3);
        }
    }

    /* JADX INFO: renamed from: b */
    private static Class m4182b() {
        try {
            return Class.forName("sun.reflect.ReflectionFactory");
        } catch (ClassNotFoundException e) {
            throw new C0614b(e);
        }
    }

    /* JADX INFO: renamed from: b */
    private static Method m4183b(Class cls) {
        try {
            return cls.getDeclaredMethod("newConstructorForSerialization", Class.class, Constructor.class);
        } catch (NoSuchMethodException e) {
            throw new C0614b(e);
        }
    }

    /* JADX INFO: renamed from: c */
    private static Constructor m4184c() {
        try {
            return Object.class.getConstructor(null);
        } catch (NoSuchMethodException e) {
            throw new C0614b(e);
        }
    }

    @Override // org.p109c.p110a.InterfaceC1770a
    /* JADX INFO: renamed from: a */
    public Object mo4174a() {
        try {
            return this.f5208a.newInstance(null);
        } catch (Exception e) {
            throw new C0614b(e);
        }
    }
}
