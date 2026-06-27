package p000a.p001a.p003b.p004a.p005a;

import java.io.IOException;
import java.util.Arrays;
import org.xmlpull.v1.XmlSerializer;
import p000a.p014d.C0085e;

/* JADX INFO: renamed from: a.a.b.a.a.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0013j extends C0005b {

    /* JADX INFO: renamed from: b */
    private final C0015l[] f13b;

    /* JADX INFO: renamed from: c */
    private C0015l[] f14c;

    /* JADX INFO: renamed from: d */
    private C0015l[] f15d;

    C0013j(C0022s c0022s, int i, Integer num, Integer num2, Boolean bool, C0085e[] c0085eArr) {
        super(c0022s, i, num, num2, bool);
        this.f13b = new C0015l[c0085eArr.length];
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= c0085eArr.length) {
                return;
            }
            this.f13b[i3] = new C0015l((C0022s) c0085eArr[i3].f229a, ((C0020q) c0085eArr[i3].f230b).m11b());
            i2 = i3 + 1;
        }
    }

    /* JADX INFO: renamed from: a */
    private static String m8a(C0015l[] c0015lArr) {
        String str = "";
        for (C0015l c0015l : c0015lArr) {
            str = str + "|" + c0015l.m9a();
        }
        return str.equals("") ? str : str.substring(1);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00ab  */
    @Override // p000a.p001a.p003b.p004a.p005a.C0005b
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String mo3a(AbstractC0023t abstractC0023t) {
        int i;
        boolean z;
        if (abstractC0023t instanceof C0022s) {
            return abstractC0023t.mo5a();
        }
        if (!(abstractC0023t instanceof C0020q)) {
            return super.mo3a(abstractC0023t);
        }
        if (this.f15d == null) {
            C0015l[] c0015lArr = new C0015l[this.f13b.length];
            C0015l[] c0015lArr2 = new C0015l[this.f13b.length];
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < this.f13b.length; i4++) {
                C0015l c0015l = this.f13b[i4];
                if (c0015l.f16a == 0) {
                    c0015lArr[i3] = c0015l;
                    i3++;
                } else {
                    c0015lArr2[i2] = c0015l;
                    i2++;
                }
            }
            this.f14c = (C0015l[]) Arrays.copyOf(c0015lArr, i3);
            this.f15d = (C0015l[]) Arrays.copyOf(c0015lArr2, i2);
            Arrays.sort(this.f15d, new C0014k(this));
        }
        int iM11b = ((C0020q) abstractC0023t).m11b();
        if (iM11b == 0) {
            return m8a(this.f14c);
        }
        C0015l[] c0015lArr3 = new C0015l[this.f15d.length];
        int[] iArr = new int[this.f15d.length];
        int i5 = 0;
        int i6 = 0;
        while (i5 < this.f15d.length) {
            C0015l c0015l2 = this.f15d[i5];
            int i7 = c0015l2.f16a;
            if ((iM11b & i7) == i7) {
                int i8 = 0;
                while (true) {
                    if (i8 >= iArr.length) {
                        z = false;
                        break;
                    }
                    if ((iArr[i8] & i7) == i7) {
                        z = true;
                        break;
                    }
                    i8++;
                }
                if (z) {
                    i = i6;
                } else {
                    iArr[i6] = i7;
                    i = i6 + 1;
                    c0015lArr3[i6] = c0015l2;
                }
            }
            i5++;
            i6 = i;
        }
        return m8a((C0015l[]) Arrays.copyOf(c0015lArr3, i6));
    }

    @Override // p000a.p001a.p003b.p004a.p005a.C0005b
    /* JADX INFO: renamed from: a */
    protected final void mo4a(XmlSerializer xmlSerializer) throws IOException {
        for (int i = 0; i < this.f13b.length; i++) {
            C0015l c0015l = this.f13b[i];
            xmlSerializer.startTag(null, "flag");
            xmlSerializer.attribute(null, "name", c0015l.m9a());
            xmlSerializer.attribute(null, "value", String.format("0x%08x", Integer.valueOf(c0015l.f16a)));
            xmlSerializer.endTag(null, "flag");
        }
    }
}
