package com.p046a.p049b.p058c.p060b;

import com.p046a.p049b.p058c.C0615a;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.a.b.c.b.z */
/* JADX INFO: loaded from: classes.dex */
public final class C0683z {

    /* JADX INFO: renamed from: a */
    private final C0645aa f1368a;

    /* JADX INFO: renamed from: b */
    private ArrayList f1369b;

    public C0683z(C0615a c0615a, int i, int i2, int i3, int i4) {
        this.f1368a = new C0645aa(c0615a, i, i3, i4);
        this.f1369b = new ArrayList(i2);
    }

    /* JADX INFO: renamed from: b */
    private void m1294b() {
        int size = this.f1369b.size();
        for (int i = 0; i < size; i++) {
            this.f1368a.m1131a((AbstractC0669l) this.f1369b.get(i));
        }
        this.f1369b = null;
    }

    /* JADX INFO: renamed from: a */
    public final C0645aa m1295a() {
        if (this.f1369b == null) {
            throw new UnsupportedOperationException("already processed");
        }
        m1294b();
        return this.f1368a;
    }

    /* JADX INFO: renamed from: a */
    public final void m1296a(int i, C0665h c0665h) {
        this.f1368a.m1129a(1, c0665h);
    }

    /* JADX INFO: renamed from: a */
    public final void m1297a(AbstractC0669l abstractC0669l) {
        this.f1368a.m1131a(abstractC0669l);
    }

    /* JADX INFO: renamed from: b */
    public final void m1298b(AbstractC0669l abstractC0669l) {
        this.f1369b.add(abstractC0669l);
    }
}
