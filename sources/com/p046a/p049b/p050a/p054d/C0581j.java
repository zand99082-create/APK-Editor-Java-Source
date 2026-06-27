package com.p046a.p049b.p050a.p054d;

import com.gmail.heagoo.p084a.p089c.C1067a;
import com.p046a.p049b.p050a.p052b.C0544ak;
import com.p046a.p049b.p050a.p052b.C0551g;
import com.p046a.p049b.p050a.p052b.InterfaceC0555k;
import com.p046a.p049b.p050a.p055e.InterfaceC0597j;
import com.p046a.p049b.p066f.p069c.AbstractC0857a;
import com.p046a.p049b.p066f.p069c.C0868j;
import com.p046a.p049b.p066f.p069c.C0871m;
import com.p046a.p049b.p066f.p069c.C0872n;
import com.p046a.p049b.p066f.p069c.C0874p;
import com.p046a.p049b.p066f.p069c.C0878t;
import com.p046a.p049b.p066f.p069c.C0884z;
import com.p046a.p049b.p066f.p070d.C0887c;
import com.p046a.p049b.p073h.C0955c;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.a.b.a.d.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0581j implements InterfaceC0555k {

    /* JADX INFO: renamed from: a */
    private final C0955c f956a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC0597j f957b;

    public C0581j(C0955c c0955c, InterfaceC0597j interfaceC0597j) {
        if (c0955c == null) {
            throw new NullPointerException("bytes == null");
        }
        if (interfaceC0597j == null) {
            throw new NullPointerException("observer == null");
        }
        this.f956a = c0955c;
        this.f957b = interfaceC0597j;
    }

    /* JADX INFO: renamed from: b */
    private String m996b(int i) {
        int iM2227e = this.f956a.m2227e(i);
        String strM837a = C0551g.m837a(iM2227e);
        if (iM2227e == 196) {
            strM837a = strM837a + " " + C0551g.m837a(this.f956a.m2227e(i + 1));
        }
        return C1067a.m2558v(i) + ": " + strM837a;
    }

    @Override // com.p046a.p049b.p050a.p052b.InterfaceC0555k
    /* JADX INFO: renamed from: a */
    public final int mo796a() {
        return -1;
    }

    @Override // com.p046a.p049b.p050a.p052b.InterfaceC0555k
    /* JADX INFO: renamed from: a */
    public final void mo797a(int i) {
    }

    @Override // com.p046a.p049b.p050a.p052b.InterfaceC0555k
    /* JADX INFO: renamed from: a */
    public final void mo798a(int i, int i2, int i3) {
        m996b(i2);
    }

    @Override // com.p046a.p049b.p050a.p052b.InterfaceC0555k
    /* JADX INFO: renamed from: a */
    public final void mo799a(int i, int i2, int i3, int i4) {
        new StringBuilder().append(m996b(i2)).append(" ").append(i3 <= 3 ? C1067a.m2558v(i4) : C1067a.m2556t(i4));
    }

    @Override // com.p046a.p049b.p050a.p052b.InterfaceC0555k
    /* JADX INFO: renamed from: a */
    public final void mo800a(int i, int i2, int i3, int i4, C0887c c0887c, int i5) {
        String strM2560x = i3 <= 3 ? C1067a.m2560x(i4) : C1067a.m2558v(i4);
        boolean z = i3 == 1;
        String str = "";
        if (i == 132) {
            str = ", #" + (i3 <= 3 ? C1067a.m2431B(i5) : C1067a.m2430A(i5));
        }
        String str2 = "";
        if (c0887c.m1951k()) {
            str2 = (z ? "," : " //") + " category-2";
        }
        new StringBuilder().append(m996b(i2)).append(z ? " // " : " ").append(strM2560x).append(str).append(str2);
    }

    @Override // com.p046a.p049b.p050a.p052b.InterfaceC0555k
    /* JADX INFO: renamed from: a */
    public final void mo801a(int i, int i2, int i3, C0544ak c0544ak, int i4) {
        int iM806a = c0544ak.m806a();
        StringBuffer stringBuffer = new StringBuffer((iM806a * 20) + 100);
        stringBuffer.append(m996b(i2));
        if (i4 != 0) {
            stringBuffer.append(" // padding: " + C1067a.m2556t(i4));
        }
        stringBuffer.append('\n');
        for (int i5 = 0; i5 < iM806a; i5++) {
            stringBuffer.append("  ");
            stringBuffer.append(C1067a.m2562z(c0544ak.m807a(i5)));
            stringBuffer.append(": ");
            stringBuffer.append(C1067a.m2558v(c0544ak.m810b(i5)));
            stringBuffer.append('\n');
        }
        stringBuffer.append("  default: ");
        stringBuffer.append(C1067a.m2558v(c0544ak.m809b()));
    }

    @Override // com.p046a.p049b.p050a.p052b.InterfaceC0555k
    /* JADX INFO: renamed from: a */
    public final void mo802a(int i, int i2, int i3, AbstractC0857a abstractC0857a, int i4) {
        if (abstractC0857a instanceof C0874p) {
            m996b(i2);
            return;
        }
        if (abstractC0857a instanceof C0872n) {
            String str = i3 == 1 ? " // " : " ";
            int iM2227e = this.f956a.m2227e(i2);
            new StringBuilder().append(m996b(i2)).append(str).append((i3 == 1 || iM2227e == 16) ? "#" + C1067a.m2431B(i4) : iM2227e == 17 ? "#" + C1067a.m2430A(i4) : "#" + C1067a.m2562z(i4));
        } else if (abstractC0857a instanceof C0878t) {
            long jK = ((C0878t) abstractC0857a).mo1895k();
            new StringBuilder().append(m996b(i2)).append(i3 == 1 ? " // " : " #").append(i3 == 1 ? C1067a.m2431B((int) jK) : C1067a.m2499b(jK));
        } else if (abstractC0857a instanceof C0871m) {
            int iJ = ((C0871m) abstractC0857a).mo1894j();
            new StringBuilder().append(m996b(i2)).append(i3 != 1 ? " #" + C1067a.m2556t(iJ) : "").append(" // ").append(Float.intBitsToFloat(iJ));
        } else if (!(abstractC0857a instanceof C0868j)) {
            new StringBuilder().append(m996b(i2)).append(" ").append(abstractC0857a).append(i4 != 0 ? i == 197 ? ", " + C1067a.m2560x(i4) : ", " + C1067a.m2558v(i4) : "");
        } else {
            long jK2 = ((C0868j) abstractC0857a).mo1895k();
            new StringBuilder().append(m996b(i2)).append(i3 != 1 ? " #" + C1067a.m2455a(jK2) : "").append(" // ").append(Double.longBitsToDouble(jK2));
        }
    }

    @Override // com.p046a.p049b.p050a.p052b.InterfaceC0555k
    /* JADX INFO: renamed from: a */
    public final void mo803a(int i, int i2, int i3, C0887c c0887c) {
        m996b(i2);
    }

    @Override // com.p046a.p049b.p050a.p052b.InterfaceC0555k
    /* JADX INFO: renamed from: a */
    public final void mo804a(int i, int i2, C0884z c0884z, ArrayList arrayList) {
        new StringBuilder().append(m996b(i)).append(i2 == 1 ? " // " : " ").append(c0884z.m1917i().m1959s().mo919d());
    }
}
