package com.p046a.p049b.p058c.p060b;

import com.gmail.heagoo.p084a.p089c.C1067a;
import com.p046a.p049b.p066f.p068b.C0850t;
import com.p046a.p049b.p066f.p068b.C0856z;
import com.p046a.p049b.p066f.p069c.AbstractC0857a;
import com.p046a.p049b.p066f.p069c.AbstractC0875q;
import com.p046a.p049b.p066f.p069c.AbstractC0876r;
import com.p046a.p049b.p066f.p069c.C0884z;
import com.p046a.p049b.p073h.C0970r;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.a.b.c.b.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0619a extends AbstractC0657am {

    /* JADX INFO: renamed from: a */
    private final C0665h f1030a;

    /* JADX INFO: renamed from: b */
    private final ArrayList f1031b;

    /* JADX INFO: renamed from: c */
    private final AbstractC0857a f1032c;

    /* JADX INFO: renamed from: d */
    private final int f1033d;

    /* JADX INFO: renamed from: e */
    private final int f1034e;

    public C0619a(C0856z c0856z, C0665h c0665h, ArrayList arrayList, AbstractC0857a abstractC0857a) {
        super(c0856z, C0850t.f2003a);
        if (c0665h == null) {
            throw new NullPointerException("user == null");
        }
        if (arrayList == null) {
            throw new NullPointerException("values == null");
        }
        if (arrayList.size() <= 0) {
            throw new IllegalArgumentException("Illegal number of init values");
        }
        this.f1032c = abstractC0857a;
        if (abstractC0857a == C0884z.f2272c || abstractC0857a == C0884z.f2271b) {
            this.f1033d = 1;
        } else if (abstractC0857a == C0884z.f2278i || abstractC0857a == C0884z.f2273d) {
            this.f1033d = 2;
        } else if (abstractC0857a == C0884z.f2277h || abstractC0857a == C0884z.f2275f) {
            this.f1033d = 4;
        } else {
            if (abstractC0857a != C0884z.f2276g && abstractC0857a != C0884z.f2274e) {
                throw new IllegalArgumentException("Unexpected constant type");
            }
            this.f1033d = 8;
        }
        this.f1030a = c0665h;
        this.f1031b = arrayList;
        this.f1034e = arrayList.size();
    }

    @Override // com.p046a.p049b.p058c.p060b.AbstractC0669l
    /* JADX INFO: renamed from: a */
    public final int mo1102a() {
        return (((this.f1034e * this.f1033d) + 1) / 2) + 4;
    }

    @Override // com.p046a.p049b.p058c.p060b.AbstractC0669l
    /* JADX INFO: renamed from: a */
    public final AbstractC0669l mo1103a(C0850t c0850t) {
        return new C0619a(m1224i(), this.f1030a, this.f1031b, this.f1032c);
    }

    @Override // com.p046a.p049b.p058c.p060b.AbstractC0669l
    /* JADX INFO: renamed from: a */
    protected final String mo1104a(boolean z) {
        int iG = this.f1030a.m1222g();
        StringBuffer stringBuffer = new StringBuffer(100);
        int size = this.f1031b.size();
        stringBuffer.append("fill-array-data-payload // for fill-array-data @ ");
        stringBuffer.append(C1067a.m2558v(iG));
        for (int i = 0; i < size; i++) {
            stringBuffer.append("\n  ");
            stringBuffer.append(i);
            stringBuffer.append(": ");
            stringBuffer.append(((AbstractC0857a) this.f1031b.get(i)).mo919d());
        }
        return stringBuffer.toString();
    }

    @Override // com.p046a.p049b.p058c.p060b.AbstractC0669l
    /* JADX INFO: renamed from: a */
    public final void mo1105a(C0970r c0970r) {
        int size = this.f1031b.size();
        c0970r.m2280b(768);
        c0970r.m2280b(this.f1033d);
        c0970r.m2282c(this.f1034e);
        switch (this.f1033d) {
            case 1:
                for (int i = 0; i < size; i++) {
                    c0970r.mo569d((byte) ((AbstractC0875q) ((AbstractC0857a) this.f1031b.get(i))).mo1894j());
                }
                break;
            case 2:
                for (int i2 = 0; i2 < size; i2++) {
                    c0970r.m2280b((short) ((AbstractC0875q) ((AbstractC0857a) this.f1031b.get(i2))).mo1894j());
                }
                break;
            case 4:
                for (int i3 = 0; i3 < size; i3++) {
                    c0970r.m2282c(((AbstractC0875q) ((AbstractC0857a) this.f1031b.get(i3))).mo1894j());
                }
                break;
            case 8:
                for (int i4 = 0; i4 < size; i4++) {
                    c0970r.m2274a(((AbstractC0876r) ((AbstractC0857a) this.f1031b.get(i4))).mo1895k());
                }
                break;
        }
        if (this.f1033d != 1 || size % 2 == 0) {
            return;
        }
        c0970r.mo569d(0);
    }

    @Override // com.p046a.p049b.p058c.p060b.AbstractC0669l
    /* JADX INFO: renamed from: b */
    protected final String mo1106b() {
        StringBuffer stringBuffer = new StringBuffer(100);
        int size = this.f1031b.size();
        for (int i = 0; i < size; i++) {
            stringBuffer.append("\n    ");
            stringBuffer.append(i);
            stringBuffer.append(": ");
            stringBuffer.append(((AbstractC0857a) this.f1031b.get(i)).mo919d());
        }
        return stringBuffer.toString();
    }
}
