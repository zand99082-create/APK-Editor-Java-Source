package com.p046a.p049b.p058c.p062c;

import com.gmail.heagoo.p084a.p089c.C1067a;
import com.p046a.p049b.p073h.C0970r;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.a.b.c.c.bd */
/* JADX INFO: loaded from: classes.dex */
public final class C0715bd extends AbstractC0700ap {

    /* JADX INFO: renamed from: a */
    private final EnumC0689ae f1449a;

    /* JADX INFO: renamed from: b */
    private final List f1450b;

    /* JADX WARN: Illegal instructions before constructor call */
    public C0715bd(EnumC0689ae enumC0689ae, List list) {
        int iM1385a = m1385a(list);
        AbstractC0700ap abstractC0700ap = (AbstractC0700ap) list.get(0);
        super(iM1385a, (abstractC0700ap.mo1316e_() * list.size()) + m1385a(list));
        if (enumC0689ae == null) {
            throw new NullPointerException("itemType == null");
        }
        this.f1450b = list;
        this.f1449a = enumC0689ae;
    }

    /* JADX INFO: renamed from: a */
    private static int m1385a(List list) {
        try {
            return Math.max(4, ((AbstractC0700ap) list.get(0)).m1346g());
        } catch (IndexOutOfBoundsException e) {
            throw new IllegalArgumentException("items.size() == 0");
        } catch (NullPointerException e2) {
            throw new NullPointerException("items == null");
        }
    }

    @Override // com.p046a.p049b.p058c.p062c.AbstractC0688ad
    /* JADX INFO: renamed from: a */
    public final EnumC0689ae mo1302a() {
        return this.f1449a;
    }

    @Override // com.p046a.p049b.p058c.p062c.AbstractC0700ap
    /* JADX INFO: renamed from: a */
    protected final void mo1303a(AbstractC0704at abstractC0704at, int i) {
        int iG = i + m1346g();
        int i2 = 0;
        boolean z = true;
        int iM1343b = iG;
        int iM1346g = 0;
        for (AbstractC0700ap abstractC0700ap : this.f1450b) {
            int iMo1316e_ = abstractC0700ap.mo1316e_();
            if (z) {
                iM1346g = abstractC0700ap.m1346g();
                i2 = iMo1316e_;
                z = false;
            } else {
                if (iMo1316e_ != i2) {
                    throw new UnsupportedOperationException("item size mismatch");
                }
                if (abstractC0700ap.m1346g() != iM1346g) {
                    throw new UnsupportedOperationException("item alignment mismatch");
                }
            }
            iM1343b = abstractC0700ap.m1343b(abstractC0704at, iM1343b) + iMo1316e_;
        }
    }

    @Override // com.p046a.p049b.p058c.p062c.AbstractC0688ad
    /* JADX INFO: renamed from: a */
    public final void mo1304a(C0732r c0732r) {
        Iterator it = this.f1450b.iterator();
        while (it.hasNext()) {
            ((AbstractC0700ap) it.next()).mo1304a(c0732r);
        }
    }

    @Override // com.p046a.p049b.p058c.p062c.AbstractC0700ap
    /* JADX INFO: renamed from: a_ */
    protected final void mo1306a_(C0732r c0732r, C0970r c0970r) {
        int size = this.f1450b.size();
        if (c0970r.m2281b()) {
            c0970r.m2272a(0, m1347h() + " " + mo1302a().mo919d());
            c0970r.m2272a(4, "  size: " + C1067a.m2556t(size));
        }
        c0970r.m2282c(size);
        Iterator it = this.f1450b.iterator();
        while (it.hasNext()) {
            ((AbstractC0700ap) it.next()).mo1315a(c0732r, c0970r);
        }
    }

    @Override // com.p046a.p049b.p058c.p062c.AbstractC0700ap
    /* JADX INFO: renamed from: b */
    public final String mo1307b() {
        StringBuffer stringBuffer = new StringBuffer(100);
        stringBuffer.append("{");
        boolean z = true;
        for (AbstractC0700ap abstractC0700ap : this.f1450b) {
            if (z) {
                z = false;
            } else {
                stringBuffer.append(", ");
            }
            stringBuffer.append(abstractC0700ap.mo1307b());
        }
        stringBuffer.append("}");
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: c */
    public final List m1386c() {
        return this.f1450b;
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer(100);
        stringBuffer.append(getClass().getName());
        stringBuffer.append(this.f1450b);
        return stringBuffer.toString();
    }
}
