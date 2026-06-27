package com.p046a.p049b.p056b.p057a;

import com.p046a.p049b.p050a.p054d.InterfaceC0580i;

/* JADX INFO: renamed from: com.a.b.b.a.f */
/* JADX INFO: loaded from: classes.dex */
final class C0610f implements InterfaceC0580i {
    private C0610f() {
    }

    /* synthetic */ C0610f(byte b2) {
        this();
    }

    @Override // com.p046a.p049b.p050a.p054d.InterfaceC0580i
    /* JADX INFO: renamed from: a */
    public final boolean mo992a(String str) {
        if (!str.endsWith(".class")) {
            return true;
        }
        return C0605a.f1001l.contains(C0605a.m1080f(str));
    }
}
