package org.p109c.p110a.p111a;

import com.p046a.p049b.p056b.C0614b;
import java.io.ObjectInputStream;
import java.lang.reflect.Method;
import org.p109c.p110a.InterfaceC1770a;

/* JADX INFO: renamed from: org.c.a.a.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1771a implements InterfaceC1770a {

    /* JADX INFO: renamed from: a */
    private final Class f5193a;

    /* JADX INFO: renamed from: b */
    private final Method f5194b = m4175b();

    public C1771a(Class cls) {
        this.f5193a = cls;
    }

    /* JADX INFO: renamed from: b */
    private static Method m4175b() {
        try {
            Method declaredMethod = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (NoSuchMethodException e) {
            throw new C0614b(e);
        } catch (RuntimeException e2) {
            throw new C0614b(e2);
        }
    }

    @Override // org.p109c.p110a.InterfaceC1770a
    /* JADX INFO: renamed from: a */
    public final Object mo4174a() {
        try {
            return this.f5193a.cast(this.f5194b.invoke(null, this.f5193a, Object.class));
        } catch (Exception e) {
            throw new C0614b(e);
        }
    }
}
