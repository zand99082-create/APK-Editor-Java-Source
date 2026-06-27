package org.p109c.p110a.p114d;

import com.p046a.p049b.p056b.C0614b;
import java.io.ObjectInputStream;
import java.lang.reflect.Method;
import org.p109c.p110a.InterfaceC1770a;

/* JADX INFO: renamed from: org.c.a.d.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1778a implements InterfaceC1770a {

    /* JADX INFO: renamed from: a */
    private final Method f5206a;

    /* JADX INFO: renamed from: b */
    private final Object[] f5207b = {null, Boolean.FALSE};

    public C1778a(Class cls) {
        this.f5207b[0] = cls;
        try {
            this.f5206a = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Boolean.TYPE);
            this.f5206a.setAccessible(true);
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
            return this.f5206a.invoke(null, this.f5207b);
        } catch (Exception e) {
            throw new C0614b(e);
        }
    }
}
