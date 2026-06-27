package com.p046a.p049b.p056b.p057a;

import com.p046a.p049b.p050a.p054d.C0575d;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.a.b.b.a.h */
/* JADX INFO: loaded from: classes.dex */
final class CallableC0612h implements Callable {

    /* JADX INFO: renamed from: a */
    private C0575d f1011a;

    private CallableC0612h(C0575d c0575d) {
        this.f1011a = c0575d;
    }

    /* synthetic */ CallableC0612h(C0575d c0575d, byte b2) {
        this(c0575d);
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        if (!this.f1011a.m991a()) {
            return null;
        }
        C0605a.m1069a(true);
        return null;
    }
}
