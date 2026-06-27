package org.p109c;

import com.p082d.p083a.InterfaceC1047m;
import java.util.concurrent.ConcurrentHashMap;
import org.p109c.p110a.InterfaceC1770a;
import org.p109c.p116b.AbstractC1782a;

/* JADX INFO: renamed from: org.c.a */
/* JADX INFO: loaded from: classes.dex */
public class C1769a implements InterfaceC1047m {

    /* JADX INFO: renamed from: a */
    private AbstractC1782a f5191a;

    /* JADX INFO: renamed from: b */
    private ConcurrentHashMap f5192b;

    public C1769a(AbstractC1782a abstractC1782a) {
        this(abstractC1782a, true);
    }

    private C1769a(AbstractC1782a abstractC1782a, boolean z) {
        if (abstractC1782a == null) {
            throw new IllegalArgumentException("A strategy can't be null");
        }
        this.f5191a = abstractC1782a;
        this.f5192b = new ConcurrentHashMap();
    }

    @Override // com.p082d.p083a.InterfaceC1047m
    /* JADX INFO: renamed from: a */
    public final Object mo2375a(Class cls) {
        InterfaceC1770a interfaceC1770aMo4185a;
        if (this.f5192b == null) {
            interfaceC1770aMo4185a = this.f5191a.mo4185a(cls);
        } else {
            interfaceC1770aMo4185a = (InterfaceC1770a) this.f5192b.get(cls.getName());
            if (interfaceC1770aMo4185a == null) {
                InterfaceC1770a interfaceC1770aMo4185a2 = this.f5191a.mo4185a(cls);
                interfaceC1770aMo4185a = (InterfaceC1770a) this.f5192b.putIfAbsent(cls.getName(), interfaceC1770aMo4185a2);
                if (interfaceC1770aMo4185a == null) {
                    interfaceC1770aMo4185a = interfaceC1770aMo4185a2;
                }
            }
        }
        return interfaceC1770aMo4185a.mo4174a();
    }

    public String toString() {
        return getClass().getName() + " using " + this.f5191a.getClass().getName() + (this.f5192b == null ? " without" : " with") + " caching";
    }
}
