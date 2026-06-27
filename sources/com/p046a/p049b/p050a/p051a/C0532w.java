package com.p046a.p049b.p050a.p051a;

import com.p046a.p049b.p050a.p055e.AbstractC0588a;
import com.p046a.p049b.p066f.p069c.InterfaceC0860b;
import com.p046a.p049b.p073h.C0955c;

/* JADX INFO: renamed from: com.a.b.a.a.w */
/* JADX INFO: loaded from: classes.dex */
public final class C0532w extends AbstractC0588a {

    /* JADX INFO: renamed from: a */
    private final C0955c f804a;

    public C0532w(String str, C0955c c0955c, int i, int i2, InterfaceC0860b interfaceC0860b) {
        this(str, c0955c.m2221a(i, i + i2), interfaceC0860b);
    }

    private C0532w(String str, C0955c c0955c, InterfaceC0860b interfaceC0860b) {
        super(str);
        if (c0955c == null) {
            throw new NullPointerException("data == null");
        }
        this.f804a = c0955c;
    }

    @Override // com.p046a.p049b.p050a.p055e.AbstractC0588a
    /* JADX INFO: renamed from: a */
    public final int mo705a() {
        return this.f804a.m2219a() + 6;
    }
}
