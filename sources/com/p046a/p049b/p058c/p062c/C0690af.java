package com.p046a.p049b.p058c.p062c;

import com.gmail.heagoo.p084a.p089c.C1067a;
import com.p046a.p049b.p073h.C0970r;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.a.b.c.c.af */
/* JADX INFO: loaded from: classes.dex */
public final class C0690af extends AbstractC0700ap {

    /* JADX INFO: renamed from: a */
    private final EnumC0689ae f1402a;

    /* JADX INFO: renamed from: b */
    private final AbstractC0704at f1403b;

    /* JADX INFO: renamed from: c */
    private final AbstractC0688ad f1404c;

    /* JADX INFO: renamed from: d */
    private final int f1405d;

    private C0690af(EnumC0689ae enumC0689ae, AbstractC0704at abstractC0704at, AbstractC0688ad abstractC0688ad, AbstractC0688ad abstractC0688ad2, int i) {
        super(4, 12);
        if (enumC0689ae == null) {
            throw new NullPointerException("type == null");
        }
        if (abstractC0704at == null) {
            throw new NullPointerException("section == null");
        }
        if (abstractC0688ad == null) {
            throw new NullPointerException("firstItem == null");
        }
        if (abstractC0688ad2 == null) {
            throw new NullPointerException("lastItem == null");
        }
        if (i <= 0) {
            throw new IllegalArgumentException("itemCount <= 0");
        }
        this.f1402a = enumC0689ae;
        this.f1403b = abstractC0704at;
        this.f1404c = abstractC0688ad;
        this.f1405d = i;
    }

    private C0690af(AbstractC0704at abstractC0704at) {
        super(4, 12);
        if (abstractC0704at == null) {
            throw new NullPointerException("section == null");
        }
        this.f1402a = EnumC0689ae.f1384h;
        this.f1403b = abstractC0704at;
        this.f1404c = null;
        this.f1405d = 1;
    }

    /* JADX INFO: renamed from: a */
    public static void m1319a(AbstractC0704at[] abstractC0704atArr, C0696al c0696al) {
        if (abstractC0704atArr == null) {
            throw new NullPointerException("sections == null");
        }
        if (c0696al.mo1308a().size() != 0) {
            throw new IllegalArgumentException("mapSection.items().size() != 0");
        }
        ArrayList arrayList = new ArrayList(50);
        for (AbstractC0704at abstractC0704at : abstractC0704atArr) {
            int i = 0;
            AbstractC0688ad abstractC0688ad = null;
            AbstractC0688ad abstractC0688ad2 = null;
            EnumC0689ae enumC0689ae = null;
            for (AbstractC0688ad abstractC0688ad3 : abstractC0704at.mo1308a()) {
                EnumC0689ae enumC0689aeMo1302a = abstractC0688ad3.mo1302a();
                if (enumC0689aeMo1302a != enumC0689ae) {
                    if (i != 0) {
                        arrayList.add(new C0690af(enumC0689ae, abstractC0704at, abstractC0688ad2, abstractC0688ad, i));
                    }
                    i = 0;
                    abstractC0688ad2 = abstractC0688ad3;
                    enumC0689ae = enumC0689aeMo1302a;
                }
                i++;
                abstractC0688ad = abstractC0688ad3;
            }
            if (i != 0) {
                arrayList.add(new C0690af(enumC0689ae, abstractC0704at, abstractC0688ad2, abstractC0688ad, i));
            } else if (abstractC0704at == c0696al) {
                arrayList.add(new C0690af(c0696al));
            }
        }
        c0696al.m1333a((AbstractC0700ap) new C0715bd(EnumC0689ae.f1384h, arrayList));
    }

    @Override // com.p046a.p049b.p058c.p062c.AbstractC0688ad
    /* JADX INFO: renamed from: a */
    public final EnumC0689ae mo1302a() {
        return EnumC0689ae.f1395s;
    }

    @Override // com.p046a.p049b.p058c.p062c.AbstractC0688ad
    /* JADX INFO: renamed from: a */
    public final void mo1304a(C0732r c0732r) {
    }

    @Override // com.p046a.p049b.p058c.p062c.AbstractC0700ap
    /* JADX INFO: renamed from: a_ */
    protected final void mo1306a_(C0732r c0732r, C0970r c0970r) {
        int iM1317a = this.f1402a.m1317a();
        int iM1363g = this.f1404c == null ? this.f1403b.m1363g() : this.f1403b.mo1332a(this.f1404c);
        if (c0970r.m2281b()) {
            c0970r.m2272a(0, m1347h() + ' ' + this.f1402a.m1318b() + " map");
            c0970r.m2272a(2, "  type:   " + C1067a.m2558v(iM1317a) + " // " + this.f1402a.toString());
            c0970r.m2272a(2, "  unused: 0");
            c0970r.m2272a(4, "  size:   " + C1067a.m2556t(this.f1405d));
            c0970r.m2272a(4, "  offset: " + C1067a.m2556t(iM1363g));
        }
        c0970r.m2280b(iM1317a);
        c0970r.m2280b(0);
        c0970r.m2282c(this.f1405d);
        c0970r.m2282c(iM1363g);
    }

    @Override // com.p046a.p049b.p058c.p062c.AbstractC0700ap
    /* JADX INFO: renamed from: b */
    public final String mo1307b() {
        return toString();
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer(100);
        stringBuffer.append(getClass().getName());
        stringBuffer.append('{');
        stringBuffer.append(this.f1403b.toString());
        stringBuffer.append(' ');
        stringBuffer.append(this.f1402a.mo919d());
        stringBuffer.append('}');
        return stringBuffer.toString();
    }
}
