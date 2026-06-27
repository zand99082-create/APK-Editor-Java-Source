package com.p046a.p049b.p050a.p055e;

import com.p046a.p049b.p066f.p069c.C0881w;
import com.p046a.p049b.p066f.p069c.C0883y;
import com.p046a.p049b.p066f.p069c.C0884z;

/* JADX INFO: renamed from: com.a.b.a.e.n */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0601n implements InterfaceC0593f {

    /* JADX INFO: renamed from: a */
    private final C0884z f983a;

    /* JADX INFO: renamed from: b */
    private final int f984b;

    /* JADX INFO: renamed from: c */
    private final C0881w f985c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC0589b f986d;

    public AbstractC0601n(C0884z c0884z, int i, C0881w c0881w, InterfaceC0589b interfaceC0589b) {
        if (c0884z == null) {
            throw new NullPointerException("definingClass == null");
        }
        if (c0881w == null) {
            throw new NullPointerException("nat == null");
        }
        if (interfaceC0589b == null) {
            throw new NullPointerException("attributes == null");
        }
        this.f983a = c0884z;
        this.f984b = i;
        this.f985c = c0881w;
        this.f986d = interfaceC0589b;
    }

    @Override // com.p046a.p049b.p050a.p055e.InterfaceC0593f
    /* JADX INFO: renamed from: a */
    public final C0881w mo845a() {
        return this.f985c;
    }

    @Override // com.p046a.p049b.p050a.p055e.InterfaceC0593f
    /* JADX INFO: renamed from: b */
    public final C0883y mo846b() {
        return this.f985c.m1900a();
    }

    @Override // com.p046a.p049b.p050a.p055e.InterfaceC0593f
    /* JADX INFO: renamed from: c */
    public final C0883y mo847c() {
        return this.f985c.m1901b();
    }

    @Override // com.p046a.p049b.p050a.p055e.InterfaceC0593f
    /* JADX INFO: renamed from: d */
    public final int mo848d() {
        return this.f984b;
    }

    @Override // com.p046a.p049b.p050a.p055e.InterfaceC0593f
    /* JADX INFO: renamed from: e */
    public final InterfaceC0589b mo849e() {
        return this.f986d;
    }

    @Override // com.p046a.p049b.p050a.p055e.InterfaceC0593f
    /* JADX INFO: renamed from: f */
    public final C0884z mo850f() {
        return this.f983a;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(100);
        stringBuffer.append(getClass().getName());
        stringBuffer.append('{');
        stringBuffer.append(this.f985c.mo919d());
        stringBuffer.append('}');
        return stringBuffer.toString();
    }
}
