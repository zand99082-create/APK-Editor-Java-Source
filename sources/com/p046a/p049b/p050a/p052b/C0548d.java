package com.p046a.p049b.p050a.p052b;

import com.gmail.heagoo.p084a.p089c.C1067a;
import com.p046a.p049b.p073h.C0965m;
import com.p046a.p049b.p073h.InterfaceC0964l;

/* JADX INFO: renamed from: com.a.b.a.b.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0548d extends C0965m {
    public C0548d(int i) {
        super(i);
    }

    /* JADX INFO: renamed from: a */
    public final C0547c m826a(int i) {
        int iC = m2262c(i);
        if (iC < 0) {
            throw new IllegalArgumentException("no such label: " + C1067a.m2558v(i));
        }
        return (C0547c) m2240e(iC);
    }

    /* JADX INFO: renamed from: a */
    public final void m827a(int i, C0547c c0547c) {
        super.m2261a(i, (InterfaceC0964l) c0547c);
    }
}
