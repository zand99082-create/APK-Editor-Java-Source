package com.p046a.p049b.p058c.p062c;

import com.p046a.p047a.p048a.C0482d;
import com.p046a.p049b.p073h.C0970r;

/* JADX INFO: renamed from: com.a.b.c.c.ap */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0700ap extends AbstractC0688ad implements Comparable {

    /* JADX INFO: renamed from: a */
    private final int f1420a;

    /* JADX INFO: renamed from: b */
    private int f1421b;

    /* JADX INFO: renamed from: c */
    private AbstractC0704at f1422c;

    /* JADX INFO: renamed from: d */
    private int f1423d;

    public AbstractC0700ap(int i, int i2) {
        AbstractC0704at.m1357a(i);
        if (i2 < -1) {
            throw new IllegalArgumentException("writeSize < -1");
        }
        this.f1420a = i;
        this.f1421b = i2;
        this.f1422c = null;
        this.f1423d = -1;
    }

    /* JADX INFO: renamed from: b */
    public static int m1341b(AbstractC0700ap abstractC0700ap) {
        if (abstractC0700ap == null) {
            return 0;
        }
        return abstractC0700ap.m1345f();
    }

    /* JADX INFO: renamed from: a */
    protected int mo1301a(AbstractC0700ap abstractC0700ap) {
        throw new UnsupportedOperationException("unsupported");
    }

    /* JADX INFO: renamed from: a */
    public final void m1342a(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("writeSize < 0");
        }
        if (this.f1421b >= 0) {
            throw new UnsupportedOperationException("writeSize already set");
        }
        this.f1421b = i;
    }

    /* JADX INFO: renamed from: a */
    protected void mo1303a(AbstractC0704at abstractC0704at, int i) {
    }

    @Override // com.p046a.p049b.p058c.p062c.AbstractC0688ad
    /* JADX INFO: renamed from: a */
    public final void mo1315a(C0732r c0732r, C0970r c0970r) {
        c0970r.m2289g(this.f1420a);
        try {
            if (this.f1421b < 0) {
                throw new UnsupportedOperationException("writeSize is unknown");
            }
            c0970r.m2271a(m1345f());
            mo1306a_(c0732r, c0970r);
        } catch (RuntimeException e) {
            throw C0482d.m570a(e, "...while writing " + this);
        }
    }

    /* JADX INFO: renamed from: a_ */
    protected abstract void mo1306a_(C0732r c0732r, C0970r c0970r);

    /* JADX INFO: renamed from: b */
    public final int m1343b(AbstractC0704at abstractC0704at, int i) {
        if (abstractC0704at == null) {
            throw new NullPointerException("addedTo == null");
        }
        if (i < 0) {
            throw new IllegalArgumentException("offset < 0");
        }
        if (this.f1422c != null) {
            throw new RuntimeException("already written");
        }
        int i2 = this.f1420a - 1;
        int i3 = (i2 ^ (-1)) & (i + i2);
        this.f1422c = abstractC0704at;
        this.f1423d = i3;
        mo1303a(abstractC0704at, i3);
        return i3;
    }

    /* JADX INFO: renamed from: b */
    public abstract String mo1307b();

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(AbstractC0700ap abstractC0700ap) {
        if (this == abstractC0700ap) {
            return 0;
        }
        EnumC0689ae enumC0689aeA = mo1302a();
        EnumC0689ae enumC0689aeA2 = abstractC0700ap.mo1302a();
        return enumC0689aeA != enumC0689aeA2 ? enumC0689aeA.compareTo(enumC0689aeA2) : mo1301a(abstractC0700ap);
    }

    @Override // com.p046a.p049b.p058c.p062c.AbstractC0688ad
    /* JADX INFO: renamed from: e_ */
    public final int mo1316e_() {
        if (this.f1421b < 0) {
            throw new UnsupportedOperationException("writeSize is unknown");
        }
        return this.f1421b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        AbstractC0700ap abstractC0700ap = (AbstractC0700ap) obj;
        return mo1302a() == abstractC0700ap.mo1302a() && mo1301a(abstractC0700ap) == 0;
    }

    /* JADX INFO: renamed from: f */
    public final int m1345f() {
        if (this.f1423d < 0) {
            throw new RuntimeException("offset not yet known");
        }
        return this.f1422c.m1359c(this.f1423d);
    }

    /* JADX INFO: renamed from: g */
    public final int m1346g() {
        return this.f1420a;
    }

    /* JADX INFO: renamed from: h */
    public final String m1347h() {
        return "[" + Integer.toHexString(m1345f()) + ']';
    }
}
