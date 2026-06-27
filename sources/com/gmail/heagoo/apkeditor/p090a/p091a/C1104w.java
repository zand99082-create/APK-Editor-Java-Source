package com.gmail.heagoo.apkeditor.p090a.p091a;

import jadx.core.codegen.CodeWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.a.a.w */
/* JADX INFO: loaded from: classes.dex */
public final class C1104w {

    /* JADX INFO: renamed from: a */
    private int f3257a;

    /* JADX INFO: renamed from: b */
    private byte[] f3258b;

    /* JADX INFO: renamed from: c */
    private int f3259c;

    /* JADX INFO: renamed from: d */
    private String f3260d;

    /* JADX INFO: renamed from: e */
    private List f3261e;

    /* JADX INFO: renamed from: f */
    private C1104w f3262f;

    /* JADX INFO: renamed from: g */
    private C1100s f3263g;

    /* JADX INFO: renamed from: h */
    private C1099r f3264h;

    C1104w(int i, byte[] bArr, C1100s c1100s, C1099r c1099r, int i2) {
        this.f3257a = i;
        this.f3258b = bArr;
        this.f3263g = c1100s;
        this.f3264h = c1099r;
        this.f3259c = i2;
        switch (i) {
            case 1048834:
                this.f3261e = m3001d();
                break;
            case 1048835:
                if (this.f3258b.length >= 24) {
                    this.f3260d = this.f3263g.m2978b(C1086e.m2929a(this.f3258b, 20));
                }
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static void m2999b(int[] iArr, byte[] bArr, int i) {
        int iM2929a = C1086e.m2929a(bArr, i);
        if (iM2929a < 0 || iM2929a >= iArr.length) {
            return;
        }
        C1086e.m2935a(bArr, i, iArr[iM2929a]);
    }

    /* JADX INFO: renamed from: d */
    private List m3001d() {
        ArrayList arrayList = null;
        int iM2929a = C1086e.m2929a(this.f3258b, 0);
        int iM2929a2 = C1086e.m2929a(this.f3258b, 4);
        if (iM2929a == 1048834 && iM2929a2 == this.f3258b.length) {
            this.f3260d = this.f3263g.m2978b(C1086e.m2929a(this.f3258b, 20));
            byte[] bArr = this.f3258b;
            int i = (bArr[28] & 255) | ((bArr[29] & 255) << 8);
            arrayList = new ArrayList();
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(new C1105x(this, this.f3258b, (i2 * 20) + 36));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    private String m3002e() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.f3259c; i++) {
            sb.append(CodeWriter.INDENT);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public final int m3003a() {
        return this.f3257a;
    }

    /* JADX INFO: renamed from: a */
    public final void m3004a(int i, int i2, int i3, int i4) {
        int length = this.f3258b.length;
        byte[] bArr = new byte[this.f3258b.length + 20];
        System.arraycopy(this.f3258b, 0, bArr, 0, 36);
        System.arraycopy(this.f3258b, 36, bArr, 56, length - 36);
        C1086e.m2935a(bArr, 36, this.f3263g.m2972a("android"));
        C1086e.m2935a(bArr, 40, i);
        C1086e.m2935a(bArr, 44, i2);
        C1086e.m2935a(bArr, 48, i3);
        C1086e.m2935a(bArr, 52, i4);
        C1086e.m2935a(bArr, 4, length + 20);
        int size = (this.f3261e != null ? this.f3261e.size() : 0) + 1;
        C1086e.m2935a(bArr, 28, size);
        this.f3258b = bArr;
        this.f3261e = new ArrayList();
        for (int i5 = 0; i5 < size; i5++) {
            this.f3261e.add(new C1105x(this, this.f3258b, (i5 * 20) + 36));
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m3005a(C1093l c1093l) throws IOException {
        c1093l.m2944a(this.f3258b);
    }

    /* JADX INFO: renamed from: a */
    protected final void m3006a(C1104w c1104w) {
        this.f3262f = c1104w;
    }

    /* JADX INFO: renamed from: a */
    protected final void m3007a(int[] iArr) {
        if (this.f3257a == 1048834) {
            m2999b(iArr, this.f3258b, 16);
            m2999b(iArr, this.f3258b, 20);
            if (this.f3261e != null) {
                Iterator it = this.f3261e.iterator();
                while (it.hasNext()) {
                    C1105x.m3010a((C1105x) it.next(), iArr);
                }
                return;
            }
            return;
        }
        if (this.f3257a == 1048835) {
            m2999b(iArr, this.f3258b, 16);
            m2999b(iArr, this.f3258b, 20);
        } else if (this.f3257a == 1048833) {
            m2999b(iArr, this.f3258b, 16);
            m2999b(iArr, this.f3258b, 20);
        } else if (this.f3257a == 1048832) {
            m2999b(iArr, this.f3258b, 16);
            m2999b(iArr, this.f3258b, 20);
        }
    }

    /* JADX INFO: renamed from: b */
    public final String m3008b() {
        ArrayList arrayList = new ArrayList();
        while (this != null) {
            arrayList.add(this.f3260d);
            this = this.f3262f;
        }
        StringBuilder sb = new StringBuilder();
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            sb.append((String) arrayList.get(size));
            sb.append("/");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    /* JADX INFO: renamed from: c */
    public final List m3009c() {
        return this.f3261e;
    }

    public final String toString() {
        switch (this.f3257a) {
            case 1048834:
                StringBuilder sb = new StringBuilder();
                sb.append(m3002e());
                sb.append("<");
                sb.append(this.f3260d);
                if (this.f3261e != null) {
                    int i = 0;
                    while (true) {
                        int i2 = i;
                        if (i2 < this.f3261e.size()) {
                            sb.append(" ");
                            sb.append(((C1105x) this.f3261e.get(i2)).toString());
                            i = i2 + 1;
                        }
                    }
                }
                sb.append(">");
                return sb.toString();
            case 1048835:
                return m3002e() + "</" + this.f3260d + ">";
            default:
                return m3002e() + "<unsupported tag>: " + this.f3257a;
        }
    }
}
