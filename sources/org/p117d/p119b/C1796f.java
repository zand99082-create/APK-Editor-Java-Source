package org.p117d.p119b;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import org.p117d.InterfaceC1785a;
import org.p117d.InterfaceC1790b;

/* JADX INFO: renamed from: org.d.b.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1796f implements InterfaceC1785a {

    /* JADX INFO: renamed from: a */
    private boolean f5234a = false;

    /* JADX INFO: renamed from: b */
    private Map f5235b = new HashMap();

    /* JADX INFO: renamed from: c */
    private LinkedBlockingQueue f5236c = new LinkedBlockingQueue();

    /* JADX INFO: renamed from: a */
    public final List m4213a() {
        return new ArrayList(this.f5235b.values());
    }

    @Override // org.p117d.InterfaceC1785a
    /* JADX INFO: renamed from: a */
    public final synchronized InterfaceC1790b mo4189a(String str) {
        C1795e c1795e;
        c1795e = (C1795e) this.f5235b.get(str);
        if (c1795e == null) {
            c1795e = new C1795e(str, this.f5236c, this.f5234a);
            this.f5235b.put(str, c1795e);
        }
        return c1795e;
    }

    /* JADX INFO: renamed from: b */
    public final LinkedBlockingQueue m4214b() {
        return this.f5236c;
    }

    /* JADX INFO: renamed from: c */
    public final void m4215c() {
        this.f5234a = true;
    }

    /* JADX INFO: renamed from: d */
    public final void m4216d() {
        this.f5235b.clear();
        this.f5236c.clear();
    }
}
