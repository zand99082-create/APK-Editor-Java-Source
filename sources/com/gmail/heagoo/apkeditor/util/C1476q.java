package com.gmail.heagoo.apkeditor.util;

import com.gmail.heagoo.common.C1570s;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.util.q */
/* JADX INFO: loaded from: classes.dex */
final class C1476q {

    /* JADX INFO: renamed from: a */
    int f4382a;

    /* JADX INFO: renamed from: b */
    String f4383b;

    /* JADX INFO: renamed from: c */
    String f4384c;

    /* JADX INFO: renamed from: d */
    private String f4385d;

    private C1476q(C1475p c1475p, int i, String str) {
        this.f4382a = i;
        this.f4384c = str;
    }

    /* synthetic */ C1476q(C1475p c1475p, int i, String str, byte b2) {
        this(c1475p, i, str);
    }

    /* JADX INFO: renamed from: a */
    static /* synthetic */ boolean m3625a(C1476q c1476q) {
        return c1476q.f4385d != null;
    }

    /* JADX INFO: renamed from: a */
    public final String m3626a() {
        if (this.f4385d == null) {
            this.f4385d = this.f4384c + "_" + C1570s.m3787a(4);
        }
        return this.f4385d;
    }
}
