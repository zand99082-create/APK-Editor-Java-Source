package com.p046a.p049b.p050a.p052b;

import com.gmail.heagoo.p084a.p089c.C1067a;
import com.p046a.p049b.p066f.p070d.C0887c;
import com.p046a.p049b.p066f.p070d.InterfaceC0888d;

/* JADX INFO: renamed from: com.a.b.a.b.w */
/* JADX INFO: loaded from: classes.dex */
public final class C0567w implements InterfaceC0888d {

    /* JADX INFO: renamed from: a */
    private final int f916a;

    public C0567w(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("subroutineAddress < 0");
        }
        this.f916a = i;
    }

    @Override // com.p046a.p049b.p066f.p070d.InterfaceC0888d
    /* JADX INFO: renamed from: a */
    public final C0887c mo925a() {
        return C0887c.f2352k;
    }

    @Override // com.p046a.p049b.p066f.p070d.InterfaceC0888d
    /* JADX INFO: renamed from: b */
    public final InterfaceC0888d mo926b() {
        return this;
    }

    @Override // com.p046a.p049b.p066f.p070d.InterfaceC0888d
    /* JADX INFO: renamed from: c */
    public final int mo927c() {
        return C0887c.f2352k.mo927c();
    }

    @Override // com.p046a.p049b.p073h.InterfaceC0971s
    /* JADX INFO: renamed from: d */
    public final String mo919d() {
        return toString();
    }

    @Override // com.p046a.p049b.p066f.p070d.InterfaceC0888d
    /* JADX INFO: renamed from: e */
    public final int mo928e() {
        return C0887c.f2352k.mo928e();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0567w) && this.f916a == ((C0567w) obj).f916a;
    }

    @Override // com.p046a.p049b.p066f.p070d.InterfaceC0888d
    /* JADX INFO: renamed from: f */
    public final boolean mo929f() {
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final int m930g() {
        return this.f916a;
    }

    public final int hashCode() {
        return this.f916a;
    }

    public final String toString() {
        return "<addr:" + C1067a.m2558v(this.f916a) + ">";
    }
}
