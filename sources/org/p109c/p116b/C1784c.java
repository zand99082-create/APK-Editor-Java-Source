package org.p109c.p116b;

import org.p109c.p110a.InterfaceC1770a;
import org.p109c.p110a.p111a.C1771a;
import org.p109c.p110a.p111a.C1772b;
import org.p109c.p110a.p111a.C1773c;
import org.p109c.p110a.p112b.C1774a;
import org.p109c.p110a.p113c.C1777a;
import org.p109c.p110a.p114d.C1778a;
import org.p109c.p110a.p115e.C1779a;
import org.p109c.p110a.p115e.C1780b;

/* JADX INFO: renamed from: org.c.b.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1784c extends AbstractC1782a {
    @Override // org.p109c.p116b.AbstractC1782a
    /* JADX INFO: renamed from: a */
    public final InterfaceC1770a mo4185a(Class cls) {
        return (C1783b.m4188a("Java HotSpot") || C1783b.m4188a("OpenJDK")) ? new C1779a(cls) : C1783b.m4188a("BEA") ? (!C1783b.f5211a.startsWith("1.4") || C1783b.f5213c.startsWith("R") || (C1783b.f5212b != null && C1783b.f5212b.startsWith("R25.1") && C1783b.f5212b.startsWith("R25.2"))) ? new C1779a(cls) : new C1777a(cls) : C1783b.m4188a("Dalvik") ? C1783b.f5214d <= 10 ? new C1771a(cls) : C1783b.f5214d <= 17 ? new C1772b(cls) : new C1773c(cls) : C1783b.m4188a("GNU libgcj") ? new C1774a(cls) : C1783b.m4188a("PERC") ? new C1778a(cls) : new C1780b(cls);
    }
}
