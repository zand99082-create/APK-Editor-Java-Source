package com.p046a.p049b.p063d.p064a;

import android.support.v4.view.InputDeviceCompat;
import com.gmail.heagoo.p084a.p089c.C1067a;
import com.p046a.p047a.C0502s;
import com.p046a.p049b.p063d.C0797d;
import com.p046a.p049b.p063d.C0798e;

/* JADX WARN: $VALUES field not found */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: com.a.b.d.a.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class EnumC0778j {

    /* JADX INFO: renamed from: A */
    public static final EnumC0778j f1585A;

    /* JADX INFO: renamed from: B */
    public static final EnumC0778j f1586B;

    /* JADX INFO: renamed from: C */
    private static EnumC0778j f1587C;

    /* JADX INFO: renamed from: D */
    private static EnumC0778j f1588D;

    /* JADX INFO: renamed from: E */
    private static EnumC0778j f1589E;

    /* JADX INFO: renamed from: F */
    private static EnumC0778j f1590F;

    /* JADX INFO: renamed from: G */
    private static EnumC0778j f1591G;

    /* JADX INFO: renamed from: H */
    private static EnumC0778j f1592H;

    /* JADX INFO: renamed from: a */
    public static final EnumC0778j f1593a;

    /* JADX INFO: renamed from: b */
    public static final EnumC0778j f1594b;

    /* JADX INFO: renamed from: c */
    public static final EnumC0778j f1595c;

    /* JADX INFO: renamed from: d */
    public static final EnumC0778j f1596d;

    /* JADX INFO: renamed from: e */
    public static final EnumC0778j f1597e;

    /* JADX INFO: renamed from: f */
    public static final EnumC0778j f1598f;

    /* JADX INFO: renamed from: g */
    public static final EnumC0778j f1599g;

    /* JADX INFO: renamed from: h */
    public static final EnumC0778j f1600h;

    /* JADX INFO: renamed from: i */
    public static final EnumC0778j f1601i;

    /* JADX INFO: renamed from: j */
    public static final EnumC0778j f1602j;

    /* JADX INFO: renamed from: k */
    public static final EnumC0778j f1603k;

    /* JADX INFO: renamed from: l */
    public static final EnumC0778j f1604l;

    /* JADX INFO: renamed from: m */
    public static final EnumC0778j f1605m;

    /* JADX INFO: renamed from: n */
    public static final EnumC0778j f1606n;

    /* JADX INFO: renamed from: o */
    public static final EnumC0778j f1607o;

    /* JADX INFO: renamed from: p */
    public static final EnumC0778j f1608p;

    /* JADX INFO: renamed from: q */
    public static final EnumC0778j f1609q;

    /* JADX INFO: renamed from: r */
    public static final EnumC0778j f1610r;

    /* JADX INFO: renamed from: s */
    public static final EnumC0778j f1611s;

    /* JADX INFO: renamed from: t */
    public static final EnumC0778j f1612t;

    /* JADX INFO: renamed from: u */
    public static final EnumC0778j f1613u;

    /* JADX INFO: renamed from: v */
    public static final EnumC0778j f1614v;

    /* JADX INFO: renamed from: w */
    public static final EnumC0778j f1615w;

    /* JADX INFO: renamed from: x */
    public static final EnumC0778j f1616x;

    /* JADX INFO: renamed from: y */
    public static final EnumC0778j f1617y;

    /* JADX INFO: renamed from: z */
    public static final EnumC0778j f1618z;

    static {
        final int i = 4;
        final int i2 = 3;
        final int i3 = 2;
        final int i4 = 1;
        final int i5 = 0;
        final String str = "FORMAT_00X";
        f1593a = new EnumC0778j(str, i5) { // from class: com.a.b.d.a.k
            {
                byte b2 = 0;
            }

            @Override // com.p046a.p049b.p063d.p064a.EnumC0778j
            /* JADX INFO: renamed from: a */
            public final AbstractC0774f mo1523a(int i6, InterfaceC0772d interfaceC0772d) {
                return new C0770ba(this, i6, 0, 0, 0, 0L);
            }

            @Override // com.p046a.p049b.p063d.p064a.EnumC0778j
            /* JADX INFO: renamed from: a */
            public final void mo1524a(AbstractC0774f abstractC0774f, InterfaceC0773e interfaceC0773e) {
                interfaceC0773e.mo1534a(abstractC0774f.m1560c());
            }
        };
        final String str2 = "FORMAT_10X";
        f1594b = new EnumC0778j(str2, i4) { // from class: com.a.b.d.a.v
            {
                int i6 = 1;
                byte b2 = 0;
            }

            @Override // com.p046a.p049b.p063d.p064a.EnumC0778j
            /* JADX INFO: renamed from: a */
            public final AbstractC0774f mo1523a(int i6, InterfaceC0772d interfaceC0772d) {
                return new C0770ba(this, EnumC0778j.m1577a(i6), 0, 0, 0, EnumC0778j.m1596h(i6));
            }

            @Override // com.p046a.p049b.p063d.p064a.EnumC0778j
            /* JADX INFO: renamed from: a */
            public final void mo1524a(AbstractC0774f abstractC0774f, InterfaceC0773e interfaceC0773e) {
                interfaceC0773e.mo1534a(abstractC0774f.m1560c());
            }
        };
        final String str3 = "FORMAT_12X";
        f1595c = new EnumC0778j(str3, i3) { // from class: com.a.b.d.a.ag
            {
                int i6 = 2;
                byte b2 = 0;
            }

            @Override // com.p046a.p049b.p063d.p064a.EnumC0778j
            /* JADX INFO: renamed from: a */
            public final AbstractC0774f mo1523a(int i6, InterfaceC0772d interfaceC0772d) {
                return new C0768az(this, EnumC0778j.m1577a(i6), 0, 0, 0, 0L, EnumC0778j.m1586c(i6), EnumC0778j.m1590d(i6));
            }

            @Override // com.p046a.p049b.p063d.p064a.EnumC0778j
            /* JADX INFO: renamed from: a */
            public final void mo1524a(AbstractC0774f abstractC0774f, InterfaceC0773e interfaceC0773e) {
                interfaceC0773e.mo1534a(EnumC0778j.m1587c(abstractC0774f.m1560c(), EnumC0778j.m1591d(abstractC0774f.mo1527n(), abstractC0774f.mo1546o())));
            }
        };
        final String str4 = "FORMAT_11N";
        f1596d = new EnumC0778j(str4, i2) { // from class: com.a.b.d.a.am
            {
                int i6 = 3;
                byte b2 = 0;
            }

            @Override // com.p046a.p049b.p063d.p064a.EnumC0778j
            /* JADX INFO: renamed from: a */
            public final AbstractC0774f mo1523a(int i6, InterfaceC0772d interfaceC0772d) {
                return new C0761as(this, EnumC0778j.m1577a(i6), 0, 0, 0, (EnumC0778j.m1590d(i6) << 28) >> 28, EnumC0778j.m1586c(i6));
            }

            @Override // com.p046a.p049b.p063d.p064a.EnumC0778j
            /* JADX INFO: renamed from: a */
            public final void mo1524a(AbstractC0774f abstractC0774f, InterfaceC0773e interfaceC0773e) {
                interfaceC0773e.mo1534a(EnumC0778j.m1587c(abstractC0774f.m1560c(), EnumC0778j.m1591d(abstractC0774f.mo1527n(), abstractC0774f.m1569l())));
            }
        };
        final String str5 = "FORMAT_11X";
        f1597e = new EnumC0778j(str5, i) { // from class: com.a.b.d.a.an
            {
                int i6 = 4;
                byte b2 = 0;
            }

            @Override // com.p046a.p049b.p063d.p064a.EnumC0778j
            /* JADX INFO: renamed from: a */
            public final AbstractC0774f mo1523a(int i6, InterfaceC0772d interfaceC0772d) {
                return new C0761as(this, EnumC0778j.m1577a(i6), 0, 0, 0, 0L, EnumC0778j.m1596h(i6));
            }

            @Override // com.p046a.p049b.p063d.p064a.EnumC0778j
            /* JADX INFO: renamed from: a */
            public final void mo1524a(AbstractC0774f abstractC0774f, InterfaceC0773e interfaceC0773e) {
                interfaceC0773e.mo1534a(EnumC0778j.m1587c(abstractC0774f.m1557b(), abstractC0774f.mo1527n()));
            }
        };
        final String str6 = "FORMAT_10T";
        final int i6 = 5;
        f1598f = new EnumC0778j(str6, i6) { // from class: com.a.b.d.a.ao
            {
                int i7 = 5;
                byte b2 = 0;
            }

            @Override // com.p046a.p049b.p063d.p064a.EnumC0778j
            /* JADX INFO: renamed from: a */
            public final AbstractC0774f mo1523a(int i7, InterfaceC0772d interfaceC0772d) {
                return new C0770ba(this, EnumC0778j.m1577a(i7), 0, 0, (interfaceC0772d.mo1548a() - 1) + ((byte) EnumC0778j.m1596h(i7)), 0L);
            }

            @Override // com.p046a.p049b.p063d.p064a.EnumC0778j
            /* JADX INFO: renamed from: a */
            public final void mo1524a(AbstractC0774f abstractC0774f, InterfaceC0773e interfaceC0773e) {
                interfaceC0773e.mo1534a(EnumC0778j.m1587c(abstractC0774f.m1557b(), abstractC0774f.m1559c(interfaceC0773e.mo1548a())));
            }
        };
        final String str7 = "FORMAT_20T";
        final int i7 = 6;
        f1599g = new EnumC0778j(str7, i7) { // from class: com.a.b.d.a.ap
            {
                int i8 = 6;
                byte b2 = 0;
            }

            @Override // com.p046a.p049b.p063d.p064a.EnumC0778j
            /* JADX INFO: renamed from: a */
            public final AbstractC0774f mo1523a(int i8, InterfaceC0772d interfaceC0772d) {
                return new C0770ba(this, EnumC0778j.m1577a(i8), 0, 0, ((short) interfaceC0772d.mo1530c()) + (interfaceC0772d.mo1548a() - 1), EnumC0778j.m1596h(i8));
            }

            @Override // com.p046a.p049b.p063d.p064a.EnumC0778j
            /* JADX INFO: renamed from: a */
            public final void mo1524a(AbstractC0774f abstractC0774f, InterfaceC0773e interfaceC0773e) {
                interfaceC0773e.mo1535a(abstractC0774f.m1560c(), abstractC0774f.m1558b(interfaceC0773e.mo1548a()));
            }
        };
        final String str8 = "FORMAT_20BC";
        final int i8 = 7;
        f1587C = new EnumC0778j(str8, i8) { // from class: com.a.b.d.a.aq
            {
                int i9 = 7;
                byte b2 = 0;
            }

            @Override // com.p046a.p049b.p063d.p064a.EnumC0778j
            /* JADX INFO: renamed from: a */
            public final AbstractC0774f mo1523a(int i9, InterfaceC0772d interfaceC0772d) {
                return new C0770ba(this, EnumC0778j.m1577a(i9), interfaceC0772d.mo1530c(), C0797d.f1621b, 0, EnumC0778j.m1596h(i9));
            }

            @Override // com.p046a.p049b.p063d.p064a.EnumC0778j
            /* JADX INFO: renamed from: a */
            public final void mo1524a(AbstractC0774f abstractC0774f, InterfaceC0773e interfaceC0773e) {
                interfaceC0773e.mo1535a(EnumC0778j.m1587c(abstractC0774f.m1557b(), abstractC0774f.m1568k()), abstractC0774f.m1562e());
            }
        };
        final String str9 = "FORMAT_22X";
        final int i9 = 8;
        f1600h = new EnumC0778j(str9, i9) { // from class: com.a.b.d.a.ar
            {
                int i10 = 8;
                byte b2 = 0;
            }

            @Override // com.p046a.p049b.p063d.p064a.EnumC0778j
            /* JADX INFO: renamed from: a */
            public final AbstractC0774f mo1523a(int i10, InterfaceC0772d interfaceC0772d) {
                return new C0768az(this, EnumC0778j.m1577a(i10), 0, 0, 0, 0L, EnumC0778j.m1596h(i10), interfaceC0772d.mo1530c());
            }

            @Override // com.p046a.p049b.p063d.p064a.EnumC0778j
            /* JADX INFO: renamed from: a */
            public final void mo1524a(AbstractC0774f abstractC0774f, InterfaceC0773e interfaceC0773e) {
                interfaceC0773e.mo1535a(EnumC0778j.m1587c(abstractC0774f.m1557b(), abstractC0774f.mo1527n()), abstractC0774f.m1573t());
            }
        };
        final String str10 = "FORMAT_21T";
        final int i10 = 9;
        f1601i = new EnumC0778j(str10, i10) { // from class: com.a.b.d.a.l
            {
                int i11 = 9;
                byte b2 = 0;
            }

            @Override // com.p046a.p049b.p063d.p064a.EnumC0778j
            /* JADX INFO: renamed from: a */
            public final AbstractC0774f mo1523a(int i11, InterfaceC0772d interfaceC0772d) {
                return new C0761as(this, EnumC0778j.m1577a(i11), 0, 0, (interfaceC0772d.mo1548a() - 1) + ((short) interfaceC0772d.mo1530c()), 0L, EnumC0778j.m1596h(i11));
            }

            @Override // com.p046a.p049b.p063d.p064a.EnumC0778j
            /* JADX INFO: renamed from: a */
            public final void mo1524a(AbstractC0774f abstractC0774f, InterfaceC0773e interfaceC0773e) {
                interfaceC0773e.mo1535a(EnumC0778j.m1587c(abstractC0774f.m1557b(), abstractC0774f.mo1527n()), abstractC0774f.m1558b(interfaceC0773e.mo1548a()));
            }
        };
        final String str11 = "FORMAT_21S";
        final int i11 = 10;
        f1602j = new EnumC0778j(str11, i11) { // from class: com.a.b.d.a.m
            {
                int i12 = 10;
                byte b2 = 0;
            }

            @Override // com.p046a.p049b.p063d.p064a.EnumC0778j
            /* JADX INFO: renamed from: a */
            public final AbstractC0774f mo1523a(int i12, InterfaceC0772d interfaceC0772d) {
                return new C0761as(this, EnumC0778j.m1577a(i12), 0, 0, 0, (short) interfaceC0772d.mo1530c(), EnumC0778j.m1596h(i12));
            }

            @Override // com.p046a.p049b.p063d.p064a.EnumC0778j
            /* JADX INFO: renamed from: a */
            public final void mo1524a(AbstractC0774f abstractC0774f, InterfaceC0773e interfaceC0773e) {
                interfaceC0773e.mo1535a(EnumC0778j.m1587c(abstractC0774f.m1557b(), abstractC0774f.mo1527n()), abstractC0774f.m1567j());
            }
        };
        final String str12 = "FORMAT_21H";
        final int i12 = 11;
        f1603k = new EnumC0778j(str12, i12) { // from class: com.a.b.d.a.n
            {
                int i13 = 11;
                byte b2 = 0;
            }

            @Override // com.p046a.p049b.p063d.p064a.EnumC0778j
            /* JADX INFO: renamed from: a */
            public final AbstractC0774f mo1523a(int i13, InterfaceC0772d interfaceC0772d) {
                int iM1577a = EnumC0778j.m1577a(i13);
                return new C0761as(this, iM1577a, 0, 0, 0, ((long) ((short) interfaceC0772d.mo1530c())) << (iM1577a == 21 ? (char) 16 : '0'), EnumC0778j.m1596h(i13));
            }

            @Override // com.p046a.p049b.p063d.p064a.EnumC0778j
            /* JADX INFO: renamed from: a */
            public final void mo1524a(AbstractC0774f abstractC0774f, InterfaceC0773e interfaceC0773e) {
                int iM1557b = abstractC0774f.m1557b();
                interfaceC0773e.mo1535a(EnumC0778j.m1587c(iM1557b, abstractC0774f.mo1527n()), (short) (abstractC0774f.m1565h() >> (iM1557b == 21 ? (char) 16 : '0')));
            }
        };
        final String str13 = "FORMAT_21C";
        final int i13 = 12;
        f1604l = new EnumC0778j(str13, i13) { // from class: com.a.b.d.a.o
            {
                int i14 = 12;
                byte b2 = 0;
            }

            @Override // com.p046a.p049b.p063d.p064a.EnumC0778j
            /* JADX INFO: renamed from: a */
            public final AbstractC0774f mo1523a(int i14, InterfaceC0772d interfaceC0772d) {
                int iM1577a = EnumC0778j.m1577a(i14);
                return new C0761as(this, iM1577a, interfaceC0772d.mo1530c(), C0798e.m1602c(iM1577a), 0, 0L, EnumC0778j.m1596h(i14));
            }

            @Override // com.p046a.p049b.p063d.p064a.EnumC0778j
            /* JADX INFO: renamed from: a */
            public final void mo1524a(AbstractC0774f abstractC0774f, InterfaceC0773e interfaceC0773e) {
                interfaceC0773e.mo1535a(EnumC0778j.m1587c(abstractC0774f.m1557b(), abstractC0774f.mo1527n()), abstractC0774f.m1562e());
            }
        };
        final String str14 = "FORMAT_23X";
        final int i14 = 13;
        f1605m = new EnumC0778j(str14, i14) { // from class: com.a.b.d.a.p
            {
                int i15 = 13;
                byte b2 = 0;
            }

            @Override // com.p046a.p049b.p063d.p064a.EnumC0778j
            /* JADX INFO: renamed from: a */
            public final AbstractC0774f mo1523a(int i15, InterfaceC0772d interfaceC0772d) {
                int iM1577a = EnumC0778j.m1577a(i15);
                int iM1596h = EnumC0778j.m1596h(i15);
                int iMo1530c = interfaceC0772d.mo1530c();
                return new C0767ay(this, iM1577a, 0, 0, 0, 0L, iM1596h, EnumC0778j.m1577a(iMo1530c), EnumC0778j.m1596h(iMo1530c));
            }

            @Override // com.p046a.p049b.p063d.p064a.EnumC0778j
            /* JADX INFO: renamed from: a */
            public final void mo1524a(AbstractC0774f abstractC0774f, InterfaceC0773e interfaceC0773e) {
                interfaceC0773e.mo1535a(EnumC0778j.m1587c(abstractC0774f.m1557b(), abstractC0774f.mo1527n()), EnumC0778j.m1587c(abstractC0774f.mo1546o(), abstractC0774f.mo1547p()));
            }
        };
        final String str15 = "FORMAT_22B";
        final int i15 = 14;
        f1606n = new EnumC0778j(str15, i15) { // from class: com.a.b.d.a.q
            {
                int i16 = 14;
                byte b2 = 0;
            }

            @Override // com.p046a.p049b.p063d.p064a.EnumC0778j
            /* JADX INFO: renamed from: a */
            public final AbstractC0774f mo1523a(int i16, InterfaceC0772d interfaceC0772d) {
                return new C0768az(this, EnumC0778j.m1577a(i16), 0, 0, 0, (byte) EnumC0778j.m1596h(r0), EnumC0778j.m1596h(i16), EnumC0778j.m1577a(interfaceC0772d.mo1530c()));
            }

            @Override // com.p046a.p049b.p063d.p064a.EnumC0778j
            /* JADX INFO: renamed from: a */
            public final void mo1524a(AbstractC0774f abstractC0774f, InterfaceC0773e interfaceC0773e) {
                interfaceC0773e.mo1535a(EnumC0778j.m1587c(abstractC0774f.m1557b(), abstractC0774f.mo1527n()), EnumC0778j.m1587c(abstractC0774f.mo1546o(), abstractC0774f.m1568k()));
            }
        };
        final String str16 = "FORMAT_22T";
        final int i16 = 15;
        f1607o = new EnumC0778j(str16, i16) { // from class: com.a.b.d.a.r
            {
                int i17 = 15;
                byte b2 = 0;
            }

            @Override // com.p046a.p049b.p063d.p064a.EnumC0778j
            /* JADX INFO: renamed from: a */
            public final AbstractC0774f mo1523a(int i17, InterfaceC0772d interfaceC0772d) {
                return new C0768az(this, EnumC0778j.m1577a(i17), 0, 0, (interfaceC0772d.mo1548a() - 1) + ((short) interfaceC0772d.mo1530c()), 0L, EnumC0778j.m1586c(i17), EnumC0778j.m1590d(i17));
            }

            @Override // com.p046a.p049b.p063d.p064a.EnumC0778j
            /* JADX INFO: renamed from: a */
            public final void mo1524a(AbstractC0774f abstractC0774f, InterfaceC0773e interfaceC0773e) {
                interfaceC0773e.mo1535a(EnumC0778j.m1587c(abstractC0774f.m1557b(), EnumC0778j.m1591d(abstractC0774f.mo1527n(), abstractC0774f.mo1546o())), abstractC0774f.m1558b(interfaceC0773e.mo1548a()));
            }
        };
        final String str17 = "FORMAT_22S";
        final int i17 = 16;
        f1608p = new EnumC0778j(str17, i17) { // from class: com.a.b.d.a.s
            {
                int i18 = 16;
                byte b2 = 0;
            }

            @Override // com.p046a.p049b.p063d.p064a.EnumC0778j
            /* JADX INFO: renamed from: a */
            public final AbstractC0774f mo1523a(int i18, InterfaceC0772d interfaceC0772d) {
                return new C0768az(this, EnumC0778j.m1577a(i18), 0, 0, 0, (short) interfaceC0772d.mo1530c(), EnumC0778j.m1586c(i18), EnumC0778j.m1590d(i18));
            }

            @Override // com.p046a.p049b.p063d.p064a.EnumC0778j
            /* JADX INFO: renamed from: a */
            public final void mo1524a(AbstractC0774f abstractC0774f, InterfaceC0773e interfaceC0773e) {
                interfaceC0773e.mo1535a(EnumC0778j.m1587c(abstractC0774f.m1557b(), EnumC0778j.m1591d(abstractC0774f.mo1527n(), abstractC0774f.mo1546o())), abstractC0774f.m1567j());
            }
        };
        final String str18 = "FORMAT_22C";
        final int i18 = 17;
        f1609q = new EnumC0778j(str18, i18) { // from class: com.a.b.d.a.t
            {
                int i19 = 17;
                byte b2 = 0;
            }

            @Override // com.p046a.p049b.p063d.p064a.EnumC0778j
            /* JADX INFO: renamed from: a */
            public final AbstractC0774f mo1523a(int i19, InterfaceC0772d interfaceC0772d) {
                int iM1577a = EnumC0778j.m1577a(i19);
                return new C0768az(this, iM1577a, interfaceC0772d.mo1530c(), C0798e.m1602c(iM1577a), 0, 0L, EnumC0778j.m1586c(i19), EnumC0778j.m1590d(i19));
            }

            @Override // com.p046a.p049b.p063d.p064a.EnumC0778j
            /* JADX INFO: renamed from: a */
            public final void mo1524a(AbstractC0774f abstractC0774f, InterfaceC0773e interfaceC0773e) {
                interfaceC0773e.mo1535a(EnumC0778j.m1587c(abstractC0774f.m1557b(), EnumC0778j.m1591d(abstractC0774f.mo1527n(), abstractC0774f.mo1546o())), abstractC0774f.m1562e());
            }
        };
        final String str19 = "FORMAT_22CS";
        final int i19 = 18;
        f1588D = new EnumC0778j(str19, i19) { // from class: com.a.b.d.a.u
            {
                int i20 = 18;
                byte b2 = 0;
            }

            @Override // com.p046a.p049b.p063d.p064a.EnumC0778j
            /* JADX INFO: renamed from: a */
            public final AbstractC0774f mo1523a(int i20, InterfaceC0772d interfaceC0772d) {
                return new C0768az(this, EnumC0778j.m1577a(i20), interfaceC0772d.mo1530c(), C0797d.f1626g, 0, 0L, EnumC0778j.m1586c(i20), EnumC0778j.m1590d(i20));
            }

            @Override // com.p046a.p049b.p063d.p064a.EnumC0778j
            /* JADX INFO: renamed from: a */
            public final void mo1524a(AbstractC0774f abstractC0774f, InterfaceC0773e interfaceC0773e) {
                interfaceC0773e.mo1535a(EnumC0778j.m1587c(abstractC0774f.m1557b(), EnumC0778j.m1591d(abstractC0774f.mo1527n(), abstractC0774f.mo1546o())), abstractC0774f.m1562e());
            }
        };
        final String str20 = "FORMAT_30T";
        final int i20 = 19;
        f1610r = new EnumC0778j(str20, i20) { // from class: com.a.b.d.a.w
            {
                int i21 = 19;
                byte b2 = 0;
            }

            @Override // com.p046a.p049b.p063d.p064a.EnumC0778j
            /* JADX INFO: renamed from: a */
            public final AbstractC0774f mo1523a(int i21, InterfaceC0772d interfaceC0772d) {
                return new C0770ba(this, EnumC0778j.m1577a(i21), 0, 0, interfaceC0772d.mo1531d() + (interfaceC0772d.mo1548a() - 1), EnumC0778j.m1596h(i21));
            }

            @Override // com.p046a.p049b.p063d.p064a.EnumC0778j
            /* JADX INFO: renamed from: a */
            public final void mo1524a(AbstractC0774f abstractC0774f, InterfaceC0773e interfaceC0773e) {
                int iM1554a = abstractC0774f.m1554a(interfaceC0773e.mo1548a());
                interfaceC0773e.mo1536a(abstractC0774f.m1560c(), EnumC0778j.m1593e(iM1554a), EnumC0778j.m1594f(iM1554a));
            }
        };
        final String str21 = "FORMAT_32X";
        final int i21 = 20;
        f1611s = new EnumC0778j(str21, i21) { // from class: com.a.b.d.a.x
            {
                int i22 = 20;
                byte b2 = 0;
            }

            @Override // com.p046a.p049b.p063d.p064a.EnumC0778j
            /* JADX INFO: renamed from: a */
            public final AbstractC0774f mo1523a(int i22, InterfaceC0772d interfaceC0772d) {
                return new C0768az(this, EnumC0778j.m1577a(i22), 0, 0, 0, EnumC0778j.m1596h(i22), interfaceC0772d.mo1530c(), interfaceC0772d.mo1530c());
            }

            @Override // com.p046a.p049b.p063d.p064a.EnumC0778j
            /* JADX INFO: renamed from: a */
            public final void mo1524a(AbstractC0774f abstractC0774f, InterfaceC0773e interfaceC0773e) {
                interfaceC0773e.mo1536a(abstractC0774f.m1560c(), abstractC0774f.m1572s(), abstractC0774f.m1573t());
            }
        };
        final String str22 = "FORMAT_31I";
        final int i22 = 21;
        f1612t = new EnumC0778j(str22, i22) { // from class: com.a.b.d.a.y
            {
                int i23 = 21;
                byte b2 = 0;
            }

            @Override // com.p046a.p049b.p063d.p064a.EnumC0778j
            /* JADX INFO: renamed from: a */
            public final AbstractC0774f mo1523a(int i23, InterfaceC0772d interfaceC0772d) {
                return new C0761as(this, EnumC0778j.m1577a(i23), 0, 0, 0, interfaceC0772d.mo1531d(), EnumC0778j.m1596h(i23));
            }

            @Override // com.p046a.p049b.p063d.p064a.EnumC0778j
            /* JADX INFO: renamed from: a */
            public final void mo1524a(AbstractC0774f abstractC0774f, InterfaceC0773e interfaceC0773e) {
                int iM1566i = abstractC0774f.m1566i();
                interfaceC0773e.mo1536a(EnumC0778j.m1587c(abstractC0774f.m1557b(), abstractC0774f.mo1527n()), EnumC0778j.m1593e(iM1566i), EnumC0778j.m1594f(iM1566i));
            }
        };
        final String str23 = "FORMAT_31T";
        final int i23 = 22;
        f1613u = new EnumC0778j(str23, i23) { // from class: com.a.b.d.a.z
            {
                int i24 = 22;
                byte b2 = 0;
            }

            @Override // com.p046a.p049b.p063d.p064a.EnumC0778j
            /* JADX INFO: renamed from: a */
            public final AbstractC0774f mo1523a(int i24, InterfaceC0772d interfaceC0772d) {
                int iA = interfaceC0772d.mo1548a() - 1;
                int iM1577a = EnumC0778j.m1577a(i24);
                int iM1596h = EnumC0778j.m1596h(i24);
                int iMo1531d = iA + interfaceC0772d.mo1531d();
                switch (iM1577a) {
                    case 43:
                    case 44:
                        interfaceC0772d.mo1550a(iMo1531d, iA);
                        break;
                }
                return new C0761as(this, iM1577a, 0, 0, iMo1531d, 0L, iM1596h);
            }

            @Override // com.p046a.p049b.p063d.p064a.EnumC0778j
            /* JADX INFO: renamed from: a */
            public final void mo1524a(AbstractC0774f abstractC0774f, InterfaceC0773e interfaceC0773e) {
                int iM1554a = abstractC0774f.m1554a(interfaceC0773e.mo1548a());
                interfaceC0773e.mo1536a(EnumC0778j.m1587c(abstractC0774f.m1557b(), abstractC0774f.mo1527n()), EnumC0778j.m1593e(iM1554a), EnumC0778j.m1594f(iM1554a));
            }
        };
        final String str24 = "FORMAT_31C";
        final int i24 = 23;
        f1614v = new EnumC0778j(str24, i24) { // from class: com.a.b.d.a.aa
            {
                int i25 = 23;
                byte b2 = 0;
            }

            @Override // com.p046a.p049b.p063d.p064a.EnumC0778j
            /* JADX INFO: renamed from: a */
            public final AbstractC0774f mo1523a(int i25, InterfaceC0772d interfaceC0772d) {
                int iM1577a = EnumC0778j.m1577a(i25);
                return new C0761as(this, iM1577a, interfaceC0772d.mo1531d(), C0798e.m1602c(iM1577a), 0, 0L, EnumC0778j.m1596h(i25));
            }

            @Override // com.p046a.p049b.p063d.p064a.EnumC0778j
            /* JADX INFO: renamed from: a */
            public final void mo1524a(AbstractC0774f abstractC0774f, InterfaceC0773e interfaceC0773e) {
                int iM1561d = abstractC0774f.m1561d();
                interfaceC0773e.mo1536a(EnumC0778j.m1587c(abstractC0774f.m1557b(), abstractC0774f.mo1527n()), EnumC0778j.m1593e(iM1561d), EnumC0778j.m1594f(iM1561d));
            }
        };
        final String str25 = "FORMAT_35C";
        final int i25 = 24;
        f1615w = new EnumC0778j(str25, i25) { // from class: com.a.b.d.a.ab
            {
                int i26 = 24;
                byte b2 = 0;
            }

            @Override // com.p046a.p049b.p063d.p064a.EnumC0778j
            /* JADX INFO: renamed from: a */
            public final AbstractC0774f mo1523a(int i26, InterfaceC0772d interfaceC0772d) {
                return EnumC0778j.m1579a(this, i26, interfaceC0772d);
            }

            @Override // com.p046a.p049b.p063d.p064a.EnumC0778j
            /* JADX INFO: renamed from: a */
            public final void mo1524a(AbstractC0774f abstractC0774f, InterfaceC0773e interfaceC0773e) {
                EnumC0778j.m1585b(abstractC0774f, interfaceC0773e);
            }
        };
        final String str26 = "FORMAT_35MS";
        final int i26 = 25;
        f1589E = new EnumC0778j(str26, i26) { // from class: com.a.b.d.a.ac
            {
                int i27 = 25;
                byte b2 = 0;
            }

            @Override // com.p046a.p049b.p063d.p064a.EnumC0778j
            /* JADX INFO: renamed from: a */
            public final AbstractC0774f mo1523a(int i27, InterfaceC0772d interfaceC0772d) {
                return EnumC0778j.m1579a(this, i27, interfaceC0772d);
            }

            @Override // com.p046a.p049b.p063d.p064a.EnumC0778j
            /* JADX INFO: renamed from: a */
            public final void mo1524a(AbstractC0774f abstractC0774f, InterfaceC0773e interfaceC0773e) {
                EnumC0778j.m1585b(abstractC0774f, interfaceC0773e);
            }
        };
        final String str27 = "FORMAT_35MI";
        final int i27 = 26;
        f1590F = new EnumC0778j(str27, i27) { // from class: com.a.b.d.a.ad
            {
                int i28 = 26;
                byte b2 = 0;
            }

            @Override // com.p046a.p049b.p063d.p064a.EnumC0778j
            /* JADX INFO: renamed from: a */
            public final AbstractC0774f mo1523a(int i28, InterfaceC0772d interfaceC0772d) {
                return EnumC0778j.m1579a(this, i28, interfaceC0772d);
            }

            @Override // com.p046a.p049b.p063d.p064a.EnumC0778j
            /* JADX INFO: renamed from: a */
            public final void mo1524a(AbstractC0774f abstractC0774f, InterfaceC0773e interfaceC0773e) {
                EnumC0778j.m1585b(abstractC0774f, interfaceC0773e);
            }
        };
        final String str28 = "FORMAT_3RC";
        final int i28 = 27;
        f1616x = new EnumC0778j(str28, i28) { // from class: com.a.b.d.a.ae
            {
                int i29 = 27;
                byte b2 = 0;
            }

            @Override // com.p046a.p049b.p063d.p064a.EnumC0778j
            /* JADX INFO: renamed from: a */
            public final AbstractC0774f mo1523a(int i29, InterfaceC0772d interfaceC0772d) {
                return EnumC0778j.m1582b(this, i29, interfaceC0772d);
            }

            @Override // com.p046a.p049b.p063d.p064a.EnumC0778j
            /* JADX INFO: renamed from: a */
            public final void mo1524a(AbstractC0774f abstractC0774f, InterfaceC0773e interfaceC0773e) {
                interfaceC0773e.mo1536a(EnumC0778j.m1587c(abstractC0774f.m1557b(), abstractC0774f.mo1526m()), abstractC0774f.m1562e(), abstractC0774f.m1572s());
            }
        };
        final String str29 = "FORMAT_3RMS";
        final int i29 = 28;
        f1591G = new EnumC0778j(str29, i29) { // from class: com.a.b.d.a.af
            {
                int i30 = 28;
                byte b2 = 0;
            }

            @Override // com.p046a.p049b.p063d.p064a.EnumC0778j
            /* JADX INFO: renamed from: a */
            public final AbstractC0774f mo1523a(int i30, InterfaceC0772d interfaceC0772d) {
                return EnumC0778j.m1582b(this, i30, interfaceC0772d);
            }

            @Override // com.p046a.p049b.p063d.p064a.EnumC0778j
            /* JADX INFO: renamed from: a */
            public final void mo1524a(AbstractC0774f abstractC0774f, InterfaceC0773e interfaceC0773e) {
                interfaceC0773e.mo1536a(EnumC0778j.m1587c(abstractC0774f.m1557b(), abstractC0774f.mo1526m()), abstractC0774f.m1562e(), abstractC0774f.m1572s());
            }
        };
        final String str30 = "FORMAT_3RMI";
        final int i30 = 29;
        f1592H = new EnumC0778j(str30, i30) { // from class: com.a.b.d.a.ah
            {
                int i31 = 29;
                byte b2 = 0;
            }

            @Override // com.p046a.p049b.p063d.p064a.EnumC0778j
            /* JADX INFO: renamed from: a */
            public final AbstractC0774f mo1523a(int i31, InterfaceC0772d interfaceC0772d) {
                return EnumC0778j.m1582b(this, i31, interfaceC0772d);
            }

            @Override // com.p046a.p049b.p063d.p064a.EnumC0778j
            /* JADX INFO: renamed from: a */
            public final void mo1524a(AbstractC0774f abstractC0774f, InterfaceC0773e interfaceC0773e) {
                interfaceC0773e.mo1536a(EnumC0778j.m1587c(abstractC0774f.m1557b(), abstractC0774f.mo1526m()), abstractC0774f.m1562e(), abstractC0774f.m1572s());
            }
        };
        final String str31 = "FORMAT_51L";
        final int i31 = 30;
        f1617y = new EnumC0778j(str31, i31) { // from class: com.a.b.d.a.ai
            {
                int i32 = 30;
                byte b2 = 0;
            }

            @Override // com.p046a.p049b.p063d.p064a.EnumC0778j
            /* JADX INFO: renamed from: a */
            public final AbstractC0774f mo1523a(int i32, InterfaceC0772d interfaceC0772d) {
                return new C0761as(this, EnumC0778j.m1577a(i32), 0, 0, 0, interfaceC0772d.mo1532e(), EnumC0778j.m1596h(i32));
            }

            @Override // com.p046a.p049b.p063d.p064a.EnumC0778j
            /* JADX INFO: renamed from: a */
            public final void mo1524a(AbstractC0774f abstractC0774f, InterfaceC0773e interfaceC0773e) {
                long jM1565h = abstractC0774f.m1565h();
                interfaceC0773e.mo1537a(EnumC0778j.m1587c(abstractC0774f.m1557b(), abstractC0774f.mo1527n()), EnumC0778j.m1580a(jM1565h), EnumC0778j.m1584b(jM1565h), EnumC0778j.m1588c(jM1565h), EnumC0778j.m1592d(jM1565h));
            }
        };
        final String str32 = "FORMAT_PACKED_SWITCH_PAYLOAD";
        final int i32 = 31;
        f1618z = new EnumC0778j(str32, i32) { // from class: com.a.b.d.a.aj
            {
                int i33 = 31;
                byte b2 = 0;
            }

            @Override // com.p046a.p049b.p063d.p064a.EnumC0778j
            /* JADX INFO: renamed from: a */
            public final AbstractC0774f mo1523a(int i33, InterfaceC0772d interfaceC0772d) {
                int iB = interfaceC0772d.mo1551b() - 1;
                int iMo1530c = interfaceC0772d.mo1530c();
                int iMo1531d = interfaceC0772d.mo1531d();
                int[] iArr = new int[iMo1530c];
                for (int i34 = 0; i34 < iMo1530c; i34++) {
                    iArr[i34] = interfaceC0772d.mo1531d() + iB;
                }
                return new C0762at(this, i33, iMo1531d, iArr);
            }

            @Override // com.p046a.p049b.p063d.p064a.EnumC0778j
            /* JADX INFO: renamed from: a */
            public final void mo1524a(AbstractC0774f abstractC0774f, InterfaceC0773e interfaceC0773e) {
                C0762at c0762at = (C0762at) abstractC0774f;
                int[] iArrM1529v = c0762at.m1529v();
                int iB = interfaceC0773e.mo1551b();
                interfaceC0773e.mo1534a(c0762at.m1560c());
                interfaceC0773e.mo1534a(EnumC0778j.m1595g(iArrM1529v.length));
                interfaceC0773e.mo1542a_(c0762at.m1528u());
                for (int i33 : iArrM1529v) {
                    interfaceC0773e.mo1542a_(i33 - iB);
                }
            }
        };
        final String str33 = "FORMAT_SPARSE_SWITCH_PAYLOAD";
        final int i33 = 32;
        f1585A = new EnumC0778j(str33, i33) { // from class: com.a.b.d.a.ak
            {
                int i34 = 32;
                byte b2 = 0;
            }

            @Override // com.p046a.p049b.p063d.p064a.EnumC0778j
            /* JADX INFO: renamed from: a */
            public final AbstractC0774f mo1523a(int i34, InterfaceC0772d interfaceC0772d) {
                int iB = interfaceC0772d.mo1551b() - 1;
                int iMo1530c = interfaceC0772d.mo1530c();
                int[] iArr = new int[iMo1530c];
                int[] iArr2 = new int[iMo1530c];
                for (int i35 = 0; i35 < iMo1530c; i35++) {
                    iArr[i35] = interfaceC0772d.mo1531d();
                }
                for (int i36 = 0; i36 < iMo1530c; i36++) {
                    iArr2[i36] = interfaceC0772d.mo1531d() + iB;
                }
                return new C0766ax(this, i34, iArr, iArr2);
            }

            @Override // com.p046a.p049b.p063d.p064a.EnumC0778j
            /* JADX INFO: renamed from: a */
            public final void mo1524a(AbstractC0774f abstractC0774f, InterfaceC0773e interfaceC0773e) {
                C0766ax c0766ax = (C0766ax) abstractC0774f;
                int[] iArrM1544u = c0766ax.m1544u();
                int[] iArrM1545v = c0766ax.m1545v();
                int iB = interfaceC0773e.mo1551b();
                interfaceC0773e.mo1534a(c0766ax.m1560c());
                interfaceC0773e.mo1534a(EnumC0778j.m1595g(iArrM1545v.length));
                for (int i34 : iArrM1544u) {
                    interfaceC0773e.mo1542a_(i34);
                }
                for (int i35 : iArrM1545v) {
                    interfaceC0773e.mo1542a_(i35 - iB);
                }
            }
        };
        final String str34 = "FORMAT_FILL_ARRAY_DATA_PAYLOAD";
        final int i34 = 33;
        f1586B = new EnumC0778j(str34, i34) { // from class: com.a.b.d.a.al
            {
                int i35 = 33;
                byte b2 = 0;
            }

            @Override // com.p046a.p049b.p063d.p064a.EnumC0778j
            /* JADX INFO: renamed from: a */
            public final AbstractC0774f mo1523a(int i35, InterfaceC0772d interfaceC0772d) {
                int i36 = 0;
                int iMo1530c = interfaceC0772d.mo1530c();
                int iMo1531d = interfaceC0772d.mo1531d();
                switch (iMo1530c) {
                    case 1:
                        byte[] bArr = new byte[iMo1531d];
                        int iMo1530c2 = 0;
                        int i37 = 0;
                        boolean z = true;
                        while (i37 < iMo1531d) {
                            if (z) {
                                iMo1530c2 = interfaceC0772d.mo1530c();
                            }
                            bArr[i37] = (byte) iMo1530c2;
                            int i38 = iMo1530c2 >> 8;
                            i37++;
                            z = !z;
                            iMo1530c2 = i38;
                        }
                        return new C0775g((EnumC0778j) this, i35, bArr);
                    case 2:
                        short[] sArr = new short[iMo1531d];
                        while (i36 < iMo1531d) {
                            sArr[i36] = (short) interfaceC0772d.mo1530c();
                            i36++;
                        }
                        return new C0775g((EnumC0778j) this, i35, sArr);
                    case 3:
                    case 5:
                    case 6:
                    case 7:
                    default:
                        throw new C0502s("bogus element_width: " + C1067a.m2558v(iMo1530c));
                    case 4:
                        int[] iArr = new int[iMo1531d];
                        while (i36 < iMo1531d) {
                            iArr[i36] = interfaceC0772d.mo1531d();
                            i36++;
                        }
                        return new C0775g((EnumC0778j) this, i35, iArr);
                    case 8:
                        long[] jArr = new long[iMo1531d];
                        while (i36 < iMo1531d) {
                            jArr[i36] = interfaceC0772d.mo1532e();
                            i36++;
                        }
                        return new C0775g(this, i35, jArr);
                }
            }

            @Override // com.p046a.p049b.p063d.p064a.EnumC0778j
            /* JADX INFO: renamed from: a */
            public final void mo1524a(AbstractC0774f abstractC0774f, InterfaceC0773e interfaceC0773e) {
                C0775g c0775g = (C0775g) abstractC0774f;
                short sM1574u = c0775g.m1574u();
                Object objM1576w = c0775g.m1576w();
                interfaceC0773e.mo1534a(c0775g.m1560c());
                interfaceC0773e.mo1534a(sM1574u);
                interfaceC0773e.mo1542a_(c0775g.m1575v());
                switch (sM1574u) {
                    case 1:
                        interfaceC0773e.mo1538a((byte[]) objM1576w);
                        return;
                    case 2:
                        interfaceC0773e.mo1541a((short[]) objM1576w);
                        return;
                    case 3:
                    case 5:
                    case 6:
                    case 7:
                    default:
                        throw new C0502s("bogus element_width: " + C1067a.m2558v(sM1574u));
                    case 4:
                        interfaceC0773e.mo1539a((int[]) objM1576w);
                        return;
                    case 8:
                        interfaceC0773e.mo1540a((long[]) objM1576w);
                        return;
                }
            }
        };
        EnumC0778j[] enumC0778jArr = {f1593a, f1594b, f1595c, f1596d, f1597e, f1598f, f1599g, f1587C, f1600h, f1601i, f1602j, f1603k, f1604l, f1605m, f1606n, f1607o, f1608p, f1609q, f1588D, f1610r, f1611s, f1612t, f1613u, f1614v, f1615w, f1589E, f1590F, f1616x, f1591G, f1592H, f1617y, f1618z, f1585A, f1586B};
    }

    private EnumC0778j(String str, int i) {
    }

    /* synthetic */ EnumC0778j(String str, int i, byte b2) {
        this(str, i);
    }

    /* JADX INFO: renamed from: a */
    static /* synthetic */ int m1577a(int i) {
        return i & 255;
    }

    /* JADX INFO: renamed from: a */
    static /* synthetic */ AbstractC0774f m1579a(EnumC0778j enumC0778j, int i, InterfaceC0772d interfaceC0772d) {
        int i2 = i & 255;
        int i3 = (i >> 8) & 15;
        int i4 = (i >> 12) & 15;
        int iMo1530c = interfaceC0772d.mo1530c();
        int iMo1530c2 = interfaceC0772d.mo1530c();
        int i5 = iMo1530c2 & 15;
        int i6 = (iMo1530c2 >> 4) & 15;
        int i7 = (iMo1530c2 >> 8) & 15;
        int i8 = (iMo1530c2 >> 12) & 15;
        int iM1602c = C0798e.m1602c(i2);
        switch (i4) {
            case 0:
                return new C0770ba(enumC0778j, i2, iMo1530c, iM1602c, 0, 0L);
            case 1:
                return new C0761as(enumC0778j, i2, iMo1530c, iM1602c, 0, 0L, i5);
            case 2:
                return new C0768az(enumC0778j, i2, iMo1530c, iM1602c, 0, 0L, i5, i6);
            case 3:
                return new C0767ay(enumC0778j, i2, iMo1530c, iM1602c, 0, 0L, i5, i6, i7);
            case 4:
                return new C0777i(enumC0778j, i2, iMo1530c, iM1602c, 0, 0L, i5, i6, i7, i8);
            case 5:
                return new C0776h(enumC0778j, i2, iMo1530c, iM1602c, 0, 0L, i5, i6, i7, i8, i3);
            default:
                throw new C0502s("bogus registerCount: " + C1067a.m2561y(i4));
        }
    }

    /* JADX INFO: renamed from: a */
    static /* synthetic */ short m1580a(long j) {
        return (short) j;
    }

    /* JADX INFO: renamed from: b */
    static /* synthetic */ AbstractC0774f m1582b(EnumC0778j enumC0778j, int i, InterfaceC0772d interfaceC0772d) {
        int i2 = i & 255;
        int iM1596h = m1596h(i);
        return new C0763au(enumC0778j, i2, interfaceC0772d.mo1530c(), C0798e.m1602c(i2), 0, 0L, interfaceC0772d.mo1530c(), iM1596h);
    }

    /* JADX INFO: renamed from: b */
    static /* synthetic */ short m1584b(long j) {
        return (short) (j >> 16);
    }

    /* JADX INFO: renamed from: b */
    static /* synthetic */ void m1585b(AbstractC0774f abstractC0774f, InterfaceC0773e interfaceC0773e) {
        short sM1587c = m1587c(abstractC0774f.m1557b(), m1591d(abstractC0774f.mo1571r(), abstractC0774f.mo1526m()));
        short sM1562e = abstractC0774f.m1562e();
        int iMo1527n = abstractC0774f.mo1527n();
        int iMo1546o = abstractC0774f.mo1546o();
        int iMo1547p = abstractC0774f.mo1547p();
        int iMo1570q = abstractC0774f.mo1570q();
        if ((iMo1527n & (-16)) != 0) {
            throw new IllegalArgumentException("bogus nibble0");
        }
        if ((iMo1546o & (-16)) != 0) {
            throw new IllegalArgumentException("bogus nibble1");
        }
        if ((iMo1547p & (-16)) != 0) {
            throw new IllegalArgumentException("bogus nibble2");
        }
        if ((iMo1570q & (-16)) != 0) {
            throw new IllegalArgumentException("bogus nibble3");
        }
        interfaceC0773e.mo1536a(sM1587c, sM1562e, (short) (iMo1527n | (iMo1546o << 4) | (iMo1547p << 8) | (iMo1570q << 12)));
    }

    /* JADX INFO: renamed from: c */
    static /* synthetic */ int m1586c(int i) {
        return (i >> 8) & 15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static short m1587c(int i, int i2) {
        if ((i & InputDeviceCompat.SOURCE_ANY) != 0) {
            throw new IllegalArgumentException("bogus lowByte");
        }
        if ((i2 & InputDeviceCompat.SOURCE_ANY) != 0) {
            throw new IllegalArgumentException("bogus highByte");
        }
        return (short) ((i2 << 8) | i);
    }

    /* JADX INFO: renamed from: c */
    static /* synthetic */ short m1588c(long j) {
        return (short) (j >> 32);
    }

    /* JADX INFO: renamed from: d */
    static /* synthetic */ int m1590d(int i) {
        return (i >> 12) & 15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static int m1591d(int i, int i2) {
        if ((i & (-16)) != 0) {
            throw new IllegalArgumentException("bogus lowNibble");
        }
        if ((i2 & (-16)) != 0) {
            throw new IllegalArgumentException("bogus highNibble");
        }
        return (i2 << 4) | i;
    }

    /* JADX INFO: renamed from: d */
    static /* synthetic */ short m1592d(long j) {
        return (short) (j >> 48);
    }

    /* JADX INFO: renamed from: e */
    static /* synthetic */ short m1593e(int i) {
        return (short) i;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [int, short] */
    /* JADX INFO: renamed from: f */
    static /* synthetic */ short m1594f(int i) {
        return i >> 16;
    }

    /* JADX INFO: renamed from: g */
    static /* synthetic */ short m1595g(int i) {
        if (((-65536) & i) != 0) {
            throw new IllegalArgumentException("bogus unsigned code unit");
        }
        return (short) i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static int m1596h(int i) {
        return (i >> 8) & 255;
    }

    /* JADX INFO: renamed from: a */
    public abstract AbstractC0774f mo1523a(int i, InterfaceC0772d interfaceC0772d);

    /* JADX INFO: renamed from: a */
    public abstract void mo1524a(AbstractC0774f abstractC0774f, InterfaceC0773e interfaceC0773e);
}
