package org.p109c.p110a.p112b;

import com.p046a.p049b.p056b.C0614b;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.lang.reflect.Method;
import org.p109c.p110a.InterfaceC1770a;

/* JADX INFO: renamed from: org.c.a.b.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1775b implements InterfaceC1770a {

    /* JADX INFO: renamed from: a */
    static Method f5201a = null;

    /* JADX INFO: renamed from: b */
    static ObjectInputStream f5202b;

    /* JADX INFO: renamed from: c */
    protected final Class f5203c;

    public AbstractC1775b(Class cls) {
        this.f5203c = cls;
        if (f5201a == null) {
            try {
                Method declaredMethod = ObjectInputStream.class.getDeclaredMethod("newObject", Class.class, Class.class);
                f5201a = declaredMethod;
                declaredMethod.setAccessible(true);
                f5202b = new C1776c();
            } catch (IOException e) {
                throw new C0614b(e);
            } catch (NoSuchMethodException e2) {
                throw new C0614b(e2);
            } catch (RuntimeException e3) {
                throw new C0614b(e3);
            }
        }
    }
}
