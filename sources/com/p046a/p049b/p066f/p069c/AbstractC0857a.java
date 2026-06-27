package com.p046a.p049b.p066f.p069c;

import com.p046a.p049b.p073h.InterfaceC0971s;

/* JADX INFO: renamed from: com.a.b.f.c.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0857a implements InterfaceC0971s, Comparable {
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(AbstractC0857a abstractC0857a) {
        Class<?> cls = getClass();
        Class<?> cls2 = abstractC0857a.getClass();
        return cls != cls2 ? cls.getName().compareTo(cls2.getName()) : mo1864b(abstractC0857a);
    }

    /* JADX INFO: renamed from: b */
    protected abstract int mo1864b(AbstractC0857a abstractC0857a);

    /* JADX INFO: renamed from: g */
    public abstract boolean mo1865g();

    /* JADX INFO: renamed from: h */
    public abstract String mo1866h();
}
