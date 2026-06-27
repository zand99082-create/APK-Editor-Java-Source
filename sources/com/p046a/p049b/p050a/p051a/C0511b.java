package com.p046a.p049b.p050a.p051a;

import com.p046a.p049b.p050a.p052b.C0549e;
import com.p046a.p049b.p050a.p052b.C0552h;
import com.p046a.p049b.p050a.p055e.AbstractC0588a;
import com.p046a.p049b.p050a.p055e.InterfaceC0589b;
import com.p046a.p049b.p073h.C0969q;

/* JADX INFO: renamed from: com.a.b.a.a.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0511b extends AbstractC0588a {

    /* JADX INFO: renamed from: a */
    private final int f782a;

    /* JADX INFO: renamed from: b */
    private final int f783b;

    /* JADX INFO: renamed from: c */
    private final C0552h f784c;

    /* JADX INFO: renamed from: d */
    private final C0549e f785d;

    /* JADX INFO: renamed from: e */
    private final InterfaceC0589b f786e;

    public C0511b(int i, int i2, C0552h c0552h, C0549e c0549e, InterfaceC0589b interfaceC0589b) {
        super("Code");
        if (i < 0) {
            throw new IllegalArgumentException("maxStack < 0");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("maxLocals < 0");
        }
        try {
            if (c0549e.m2264c_()) {
                throw new C0969q("catches.isMutable()");
            }
            try {
                if (interfaceC0589b.m1049c_()) {
                    throw new C0969q("attributes.isMutable()");
                }
                this.f782a = i;
                this.f783b = i2;
                this.f784c = c0552h;
                this.f785d = c0549e;
                this.f786e = interfaceC0589b;
            } catch (NullPointerException e) {
                throw new NullPointerException("attributes == null");
            }
        } catch (NullPointerException e2) {
            throw new NullPointerException("catches == null");
        }
    }

    @Override // com.p046a.p049b.p050a.p055e.AbstractC0588a
    /* JADX INFO: renamed from: a */
    public final int mo705a() {
        return this.f784c.m843c() + 10 + (this.f785d.m2239d_() << 3) + 2 + this.f786e.mo1048b();
    }

    /* JADX INFO: renamed from: b */
    public final int m707b() {
        return this.f782a;
    }

    /* JADX INFO: renamed from: c */
    public final int m708c() {
        return this.f783b;
    }

    /* JADX INFO: renamed from: d */
    public final C0552h m709d() {
        return this.f784c;
    }

    /* JADX INFO: renamed from: e */
    public final C0549e m710e() {
        return this.f785d;
    }

    /* JADX INFO: renamed from: f */
    public final InterfaceC0589b m711f() {
        return this.f786e;
    }
}
