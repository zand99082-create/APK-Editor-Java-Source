package org.p109c.p110a.p112b;

import com.p046a.p049b.p056b.C0614b;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: org.c.a.b.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1774a extends AbstractC1775b {
    public C1774a(Class cls) {
        super(cls);
    }

    @Override // org.p109c.p110a.InterfaceC1770a
    /* JADX INFO: renamed from: a */
    public final Object mo4174a() {
        try {
            return this.f5203c.cast(f5201a.invoke(f5202b, this.f5203c, Object.class));
        } catch (IllegalAccessException e) {
            throw new C0614b(e);
        } catch (RuntimeException e2) {
            throw new C0614b(e2);
        } catch (InvocationTargetException e3) {
            throw new C0614b(e3);
        }
    }
}
