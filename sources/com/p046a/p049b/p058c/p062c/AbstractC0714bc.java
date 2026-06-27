package com.p046a.p049b.p058c.p062c;

import com.p046a.p049b.p073h.C0970r;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: com.a.b.c.c.bc */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0714bc extends AbstractC0704at {
    public AbstractC0714bc(String str, C0732r c0732r, int i) {
        super(str, c0732r, 4);
    }

    @Override // com.p046a.p049b.p058c.p062c.AbstractC0704at
    /* JADX INFO: renamed from: a */
    public final int mo1332a(AbstractC0688ad abstractC0688ad) {
        AbstractC0687ac abstractC0687ac = (AbstractC0687ac) abstractC0688ad;
        return m1359c(abstractC0687ac.m1313i() * abstractC0687ac.mo1316e_());
    }

    @Override // com.p046a.p049b.p058c.p062c.AbstractC0704at
    /* JADX INFO: renamed from: a_ */
    protected final void mo1335a_(C0970r c0970r) {
        C0732r c0732rE = m1361e();
        int iF = m1362f();
        Iterator it = mo1308a().iterator();
        while (it.hasNext()) {
            ((AbstractC0688ad) it.next()).mo1315a(c0732rE, c0970r);
            c0970r.m2289g(iF);
        }
    }

    /* JADX INFO: renamed from: b */
    protected abstract void mo1309b();

    @Override // com.p046a.p049b.p058c.p062c.AbstractC0704at
    /* JADX INFO: renamed from: c */
    protected final void mo1337c() {
        C0732r c0732rE = m1361e();
        mo1309b();
        Iterator it = mo1308a().iterator();
        while (it.hasNext()) {
            ((AbstractC0688ad) it.next()).mo1304a(c0732rE);
        }
    }

    @Override // com.p046a.p049b.p058c.p062c.AbstractC0704at
    /* JADX INFO: renamed from: f_ */
    public final int mo1339f_() {
        Collection collectionA = mo1308a();
        int size = collectionA.size();
        if (size == 0) {
            return 0;
        }
        return ((AbstractC0688ad) collectionA.iterator().next()).mo1316e_() * size;
    }
}
