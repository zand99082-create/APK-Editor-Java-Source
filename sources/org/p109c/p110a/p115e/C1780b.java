package org.p109c.p110a.p115e;

import com.p046a.p049b.p056b.C0614b;
import java.lang.reflect.Field;
import org.p109c.p110a.InterfaceC1770a;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: org.c.a.e.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1780b implements InterfaceC1770a {

    /* JADX INFO: renamed from: a */
    private static Unsafe f5209a;

    /* JADX INFO: renamed from: b */
    private final Class f5210b;

    public C1780b(Class cls) {
        if (f5209a == null) {
            try {
                Field declaredField = Unsafe.class.getDeclaredField("theUnsafe");
                declaredField.setAccessible(true);
                try {
                    f5209a = (Unsafe) declaredField.get(null);
                } catch (IllegalAccessException e) {
                    throw new C0614b(e);
                }
            } catch (NoSuchFieldException e2) {
                throw new C0614b(e2);
            }
        }
        this.f5210b = cls;
    }

    @Override // org.p109c.p110a.InterfaceC1770a
    /* JADX INFO: renamed from: a */
    public final Object mo4174a() {
        try {
            return this.f5210b.cast(f5209a.allocateInstance(this.f5210b));
        } catch (InstantiationException e) {
            throw new C0614b(e);
        }
    }
}
