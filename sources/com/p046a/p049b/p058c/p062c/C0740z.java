package com.p046a.p049b.p058c.p062c;

import android.support.v7.appcompat.C0327R;
import com.gmail.heagoo.p084a.p089c.C1067a;
import com.p046a.p049b.p066f.p069c.C0883y;
import com.p046a.p049b.p073h.C0970r;

/* JADX INFO: renamed from: com.a.b.c.c.z */
/* JADX INFO: loaded from: classes.dex */
public final class C0740z extends AbstractC0687ac {
    @Override // com.p046a.p049b.p058c.p062c.AbstractC0688ad
    /* JADX INFO: renamed from: a */
    public final EnumC0689ae mo1302a() {
        return EnumC0689ae.f1377a;
    }

    @Override // com.p046a.p049b.p058c.p062c.AbstractC0688ad
    /* JADX INFO: renamed from: a */
    public final void mo1304a(C0732r c0732r) {
    }

    @Override // com.p046a.p049b.p058c.p062c.AbstractC0688ad
    /* JADX INFO: renamed from: a */
    public final void mo1315a(C0732r c0732r, C0970r c0970r) {
        int iG = c0732r.m1487g().m1363g();
        AbstractC0704at abstractC0704atM1496p = c0732r.m1496p();
        AbstractC0704at abstractC0704atM1497q = c0732r.m1497q();
        int iM1363g = abstractC0704atM1496p.m1363g();
        int iM1363g2 = (abstractC0704atM1497q.m1363g() + abstractC0704atM1497q.mo1339f_()) - iM1363g;
        String strM2515c = C1067a.m2515c(c0732r.m1481b().f1013b);
        if (c0970r.m2281b()) {
            c0970r.m2272a(8, "magic: " + new C0883y(strM2515c).m1910i());
            c0970r.m2272a(4, "checksum");
            c0970r.m2272a(20, "signature");
            c0970r.m2272a(4, "file_size:       " + C1067a.m2556t(c0732r.m1483c()));
            c0970r.m2272a(4, "header_size:     " + C1067a.m2556t(C0327R.styleable.AppCompatTheme_ratingBarStyleSmall));
            c0970r.m2272a(4, "endian_tag:      " + C1067a.m2556t(305419896));
            c0970r.m2272a(4, "link_size:       0");
            c0970r.m2272a(4, "link_off:        0");
            c0970r.m2272a(4, "map_off:         " + C1067a.m2556t(iG));
        }
        for (int i = 0; i < 8; i++) {
            c0970r.mo569d(strM2515c.charAt(i));
        }
        c0970r.m2287f(24);
        c0970r.m2282c(c0732r.m1483c());
        c0970r.m2282c(C0327R.styleable.AppCompatTheme_ratingBarStyleSmall);
        c0970r.m2282c(305419896);
        c0970r.m2287f(8);
        c0970r.m2282c(iG);
        c0732r.m1488h().m1377b(c0970r);
        c0732r.m1491k().m1383b(c0970r);
        c0732r.m1492l().m1356b(c0970r);
        c0732r.m1493m().m1513a(c0970r);
        c0732r.m1494n().m1330a(c0970r);
        c0732r.m1489i().m1449a(c0970r);
        if (c0970r.m2281b()) {
            c0970r.m2272a(4, "data_size:       " + C1067a.m2556t(iM1363g2));
            c0970r.m2272a(4, "data_off:        " + C1067a.m2556t(iM1363g));
        }
        c0970r.m2282c(iM1363g2);
        c0970r.m2282c(iM1363g);
    }

    @Override // com.p046a.p049b.p058c.p062c.AbstractC0688ad
    /* JADX INFO: renamed from: e_ */
    public final int mo1316e_() {
        return C0327R.styleable.AppCompatTheme_ratingBarStyleSmall;
    }
}
