package org.p109c.p110a.p113c;

import com.p046a.p049b.p056b.C0614b;
import java.lang.reflect.Method;
import org.p109c.p110a.InterfaceC1770a;

/* JADX INFO: renamed from: org.c.a.c.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1777a implements InterfaceC1770a {

    /* JADX INFO: renamed from: a */
    private static Method f5204a = null;

    /* JADX INFO: renamed from: b */
    private final Class f5205b;

    public C1777a(Class cls) {
        if (f5204a == null) {
            try {
                Method declaredMethod = Class.forName("jrockit.vm.MemSystem").getDeclaredMethod("safeAllocObject", Class.class);
                f5204a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (ClassNotFoundException e) {
                throw new C0614b(e);
            } catch (NoSuchMethodException e2) {
                throw new C0614b(e2);
            } catch (RuntimeException e3) {
                throw new C0614b(e3);
            }
        }
        this.f5205b = cls;
    }

    @Override // org.p109c.p110a.InterfaceC1770a
    /* JADX INFO: renamed from: a */
    public final Object mo4174a() {
        try {
            return this.f5205b.cast(f5204a.invoke(null, this.f5205b));
        } catch (Exception e) {
            throw new C0614b(e);
        }
    }
}
