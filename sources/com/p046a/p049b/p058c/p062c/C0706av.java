package com.p046a.p049b.p058c.p062c;

import jadx.core.codegen.CodeWriter;

/* JADX INFO: renamed from: com.a.b.c.c.av */
/* JADX INFO: loaded from: classes.dex */
final class C0706av {

    /* JADX INFO: renamed from: a */
    private final String f1437a;

    /* JADX INFO: renamed from: b */
    private int f1438b;

    /* JADX INFO: renamed from: c */
    private int f1439c;

    /* JADX INFO: renamed from: d */
    private int f1440d;

    /* JADX INFO: renamed from: e */
    private int f1441e;

    public C0706av(AbstractC0688ad abstractC0688ad, String str) {
        int iMo1316e_ = abstractC0688ad.mo1316e_();
        this.f1437a = str;
        this.f1438b = 1;
        this.f1439c = iMo1316e_;
        this.f1440d = iMo1316e_;
        this.f1441e = iMo1316e_;
    }

    /* JADX INFO: renamed from: a */
    public final String m1371a() {
        StringBuilder sb = new StringBuilder();
        sb.append("  " + this.f1437a + ": " + this.f1438b + " item" + (this.f1438b == 1 ? "" : "s") + "; " + this.f1439c + " bytes total\n");
        if (this.f1441e == this.f1440d) {
            sb.append(CodeWriter.INDENT + this.f1441e + " bytes/item\n");
        } else {
            sb.append(CodeWriter.INDENT + this.f1441e + ".." + this.f1440d + " bytes/item; average " + (this.f1439c / this.f1438b) + "\n");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public final void m1372a(AbstractC0688ad abstractC0688ad) {
        int iMo1316e_ = abstractC0688ad.mo1316e_();
        this.f1438b++;
        this.f1439c += iMo1316e_;
        if (iMo1316e_ > this.f1440d) {
            this.f1440d = iMo1316e_;
        }
        if (iMo1316e_ < this.f1441e) {
            this.f1441e = iMo1316e_;
        }
    }
}
