package com.gmail.heagoo.apkeditor.p090a.p091a;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.a.a.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1082a {

    /* JADX INFO: renamed from: a */
    private byte[] f3157a;

    /* JADX INFO: renamed from: b */
    private C1100s f3158b;

    /* JADX INFO: renamed from: c */
    private C1099r f3159c;

    /* JADX INFO: renamed from: d */
    private List f3160d = new ArrayList();

    public C1082a(C1100s c1100s, C1099r c1099r) {
        this.f3158b = c1100s;
        this.f3159c = c1099r;
    }

    /* JADX INFO: renamed from: b */
    private int m2919b(C1094m c1094m) throws IOException {
        int iM2949a = c1094m.m2949a();
        int iM2949a2 = c1094m.m2949a();
        this.f3157a = new byte[iM2949a2];
        C1086e.m2935a(this.f3157a, 0, iM2949a);
        C1086e.m2935a(this.f3157a, 4, iM2949a2);
        if (iM2949a2 > 8) {
            c1094m.m2951a(this.f3157a, 8, iM2949a2 - 8);
        }
        return iM2949a;
    }

    /* JADX INFO: renamed from: a */
    public final void m2920a() {
        List listM2973a = this.f3158b.m2973a();
        if (listM2973a == null || listM2973a.isEmpty()) {
            return;
        }
        int[] iArrM2979b = this.f3158b.m2979b();
        Iterator it = this.f3160d.iterator();
        while (it.hasNext()) {
            ((C1104w) it.next()).m3007a(iArrM2979b);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m2921a(C1093l c1093l) throws IOException {
        Iterator it = this.f3160d.iterator();
        while (it.hasNext()) {
            ((C1104w) it.next()).m3005a(c1093l);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m2922a(C1094m c1094m) {
        int iM2919b;
        Stack stack = new Stack();
        do {
            iM2919b = m2919b(c1094m);
            byte[] bArr = this.f3157a;
            C1104w c1104w = null;
            if (iM2919b == 1048834) {
                c1104w = new C1104w(iM2919b, bArr, this.f3158b, this.f3159c, stack.size());
                if (!stack.isEmpty()) {
                    c1104w.m3006a((C1104w) stack.peek());
                }
                stack.push(c1104w);
            } else if (iM2919b != 1048835) {
                c1104w = new C1104w(iM2919b, bArr, this.f3158b, this.f3159c, stack.size());
            } else if (!stack.isEmpty()) {
                stack.pop();
                c1104w = new C1104w(iM2919b, bArr, this.f3158b, this.f3159c, stack.size());
            }
            this.f3160d.add(c1104w);
        } while (iM2919b != C1083b.f3161a);
    }

    /* JADX INFO: renamed from: a */
    public final void m2923a(String str, int i, int i2, int i3, int i4) {
        for (C1104w c1104w : this.f3160d) {
            if (c1104w.m3003a() == 1048834 && str.equals(c1104w.m3008b())) {
                c1104w.m3004a(0, -1, 268435464, i4);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m2924a(String str, String str2, InterfaceC1085d interfaceC1085d) {
        List<C1105x> listM3009c;
        for (C1104w c1104w : this.f3160d) {
            if (c1104w.m3003a() == 1048834 && str.equals(c1104w.m3008b()) && (listM3009c = c1104w.m3009c()) != null) {
                for (C1105x c1105x : listM3009c) {
                    if (str2.equals(c1105x.f3266b)) {
                        interfaceC1085d.mo2928a(c1105x);
                    }
                }
            }
        }
    }
}
