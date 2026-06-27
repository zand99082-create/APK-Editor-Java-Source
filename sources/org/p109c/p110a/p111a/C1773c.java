package org.p109c.p110a.p111a;

import com.p046a.p049b.p056b.C0614b;
import java.io.ObjectStreamClass;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.p109c.p110a.InterfaceC1770a;

/* JADX INFO: renamed from: org.c.a.a.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1773c implements InterfaceC1770a {

    /* JADX INFO: renamed from: a */
    private final Class f5198a;

    /* JADX INFO: renamed from: b */
    private final Method f5199b = m4178b();

    /* JADX INFO: renamed from: c */
    private final Long f5200c = m4179c();

    public C1773c(Class cls) {
        this.f5198a = cls;
    }

    /* JADX INFO: renamed from: b */
    private static Method m4178b() {
        try {
            Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Long.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (NoSuchMethodException e) {
            throw new C0614b(e);
        } catch (RuntimeException e2) {
            throw new C0614b(e2);
        }
    }

    /* JADX INFO: renamed from: c */
    private static Long m4179c() {
        try {
            Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
            declaredMethod.setAccessible(true);
            return (Long) declaredMethod.invoke(null, Object.class);
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
            return this.f5198a.cast(this.f5199b.invoke(null, this.f5198a, this.f5200c));
        } catch (Exception e) {
            throw new C0614b(e);
        }
    }
}
