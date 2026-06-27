package com.p046a.p049b.p058c.p062c;

import com.p046a.p049b.p073h.C0970r;
import java.util.Collection;

/* JADX INFO: renamed from: com.a.b.c.c.at */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0704at {

    /* JADX INFO: renamed from: a */
    private final String f1431a;

    /* JADX INFO: renamed from: b */
    private final C0732r f1432b;

    /* JADX INFO: renamed from: c */
    private final int f1433c;

    /* JADX INFO: renamed from: d */
    private int f1434d;

    /* JADX INFO: renamed from: e */
    private boolean f1435e;

    public AbstractC0704at(String str, C0732r c0732r, int i) {
        if (c0732r == null) {
            throw new NullPointerException("file == null");
        }
        m1357a(i);
        this.f1431a = str;
        this.f1432b = c0732r;
        this.f1433c = i;
        this.f1434d = -1;
        this.f1435e = false;
    }

    /* JADX INFO: renamed from: a */
    public static void m1357a(int i) {
        if (i <= 0 || ((i - 1) & i) != 0) {
            throw new IllegalArgumentException("invalid alignment");
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract int mo1332a(AbstractC0688ad abstractC0688ad);

    /* JADX INFO: renamed from: a */
    public abstract Collection mo1308a();

    /* JADX INFO: renamed from: a_ */
    protected abstract void mo1335a_(C0970r c0970r);

    /* JADX INFO: renamed from: b */
    public final int m1358b(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("fileOffset < 0");
        }
        if (this.f1434d >= 0) {
            throw new RuntimeException("fileOffset already set");
        }
        int i2 = this.f1433c - 1;
        int i3 = (i2 ^ (-1)) & (i + i2);
        this.f1434d = i3;
        return i3;
    }

    /* JADX INFO: renamed from: c */
    public final int m1359c(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("relative < 0");
        }
        if (this.f1434d < 0) {
            throw new RuntimeException("fileOffset not yet set");
        }
        return this.f1434d + i;
    }

    /* JADX INFO: renamed from: c */
    protected abstract void mo1337c();

    /* JADX INFO: renamed from: c */
    public final void m1360c(C0970r c0970r) {
        m1365i();
        c0970r.m2289g(this.f1433c);
        int iM2270a = c0970r.m2270a();
        if (this.f1434d < 0) {
            this.f1434d = iM2270a;
        } else if (this.f1434d != iM2270a) {
            throw new RuntimeException("alignment mismatch: for " + this + ", at " + iM2270a + ", but expected " + this.f1434d);
        }
        if (c0970r.m2281b()) {
            if (this.f1431a != null) {
                c0970r.m2272a(0, "\n" + this.f1431a + ":");
            } else if (iM2270a != 0) {
                c0970r.m2272a(0, "\n");
            }
        }
        mo1335a_(c0970r);
    }

    /* JADX INFO: renamed from: e */
    public final C0732r m1361e() {
        return this.f1432b;
    }

    /* JADX INFO: renamed from: f */
    public final int m1362f() {
        return this.f1433c;
    }

    /* JADX INFO: renamed from: f_ */
    public abstract int mo1339f_();

    /* JADX INFO: renamed from: g */
    public final int m1363g() {
        if (this.f1434d < 0) {
            throw new RuntimeException("fileOffset not set");
        }
        return this.f1434d;
    }

    /* JADX INFO: renamed from: h */
    public final void m1364h() {
        m1366j();
        mo1337c();
        this.f1435e = true;
    }

    /* JADX INFO: renamed from: i */
    protected final void m1365i() {
        if (!this.f1435e) {
            throw new RuntimeException("not prepared");
        }
    }

    /* JADX INFO: renamed from: j */
    protected final void m1366j() {
        if (this.f1435e) {
            throw new RuntimeException("already prepared");
        }
    }
}
