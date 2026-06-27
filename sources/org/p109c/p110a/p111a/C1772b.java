package org.p109c.p110a.p111a;

import com.p046a.p049b.p056b.C0614b;
import java.io.ObjectStreamClass;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.p109c.p110a.InterfaceC1770a;

/* JADX INFO: renamed from: org.c.a.a.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1772b implements InterfaceC1770a {

    /* JADX INFO: renamed from: a */
    private final Class f5195a;

    /* JADX INFO: renamed from: b */
    private final Method f5196b = m4176b();

    /* JADX INFO: renamed from: c */
    private final Integer f5197c = m4177c();

    public C1772b(Class cls) {
        this.f5195a = cls;
    }

    /* JADX INFO: renamed from: b */
    private static Method m4176b() {
        try {
            Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (NoSuchMethodException e) {
            throw new C0614b(e);
        } catch (RuntimeException e2) {
            throw new C0614b(e2);
        }
    }

    /* JADX INFO: renamed from: c */
    private static Integer m4177c() {
        try {
            Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
            declaredMethod.setAccessible(true);
            return (Integer) declaredMethod.invoke(null, Object.class);
        } catch (IllegalAccessException e) {
            throw new C0614b(e);
        } catch (NoSuchMethodException e2) {
            throw new C0614b(e2);
        } catch (RuntimeException e3) {
            throw new C0614b(e3);
        } catch (InvocationTargetException e4) {
            throw new C0614b(e4);
        }
    }

    @Override // org.p109c.p110a.InterfaceC1770a
    /* JADX INFO: renamed from: a */
    public final Object mo4174a() {
        try {
            return this.f5195a.cast(this.f5196b.invoke(null, this.f5195a, this.f5197c));
        } catch (Exception e) {
            throw new C0614b(e);
        }
    }
}
