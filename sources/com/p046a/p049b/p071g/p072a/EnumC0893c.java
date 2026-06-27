package com.p046a.p049b.p071g.p072a;

import java.util.BitSet;

/* JADX WARN: $VALUES field not found */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: com.a.b.g.a.c */
/* JADX INFO: loaded from: classes.dex */
abstract class EnumC0893c {

    /* JADX INFO: renamed from: a */
    public static final EnumC0893c f2387a;

    /* JADX INFO: renamed from: b */
    public static final EnumC0893c f2388b;

    /* JADX INFO: renamed from: c */
    public static final EnumC0893c f2389c;

    static {
        final int i = 2;
        final int i2 = 1;
        final int i3 = 0;
        final String str = "EVEN";
        f2387a = new EnumC0893c(str, i3) { // from class: com.a.b.g.a.d
            {
                byte b2 = 0;
            }

            @Override // com.p046a.p049b.p071g.p072a.EnumC0893c
            /* JADX INFO: renamed from: a */
            final int mo1993a(BitSet bitSet, int i4) {
                int iNextClearBit = bitSet.nextClearBit(i4);
                while (!C0891a.m1987f(iNextClearBit)) {
                    iNextClearBit = bitSet.nextClearBit(iNextClearBit + 1);
                }
                return iNextClearBit;
            }
        };
        final String str2 = "ODD";
        f2388b = new EnumC0893c(str2, i2) { // from class: com.a.b.g.a.e
            {
                int i4 = 1;
                byte b2 = 0;
            }

            @Override // com.p046a.p049b.p071g.p072a.EnumC0893c
            /* JADX INFO: renamed from: a */
            final int mo1993a(BitSet bitSet, int i4) {
                int iNextClearBit = bitSet.nextClearBit(i4);
                while (C0891a.m1987f(iNextClearBit)) {
                    iNextClearBit = bitSet.nextClearBit(iNextClearBit + 1);
                }
                return iNextClearBit;
            }
        };
        final String str3 = "UNSPECIFIED";
        f2389c = new EnumC0893c(str3, i) { // from class: com.a.b.g.a.f
            {
                int i4 = 2;
                byte b2 = 0;
            }

            @Override // com.p046a.p049b.p071g.p072a.EnumC0893c
            /* JADX INFO: renamed from: a */
            final int mo1993a(BitSet bitSet, int i4) {
                return bitSet.nextClearBit(i4);
            }
        };
        EnumC0893c[] enumC0893cArr = {f2387a, f2388b, f2389c};
    }

    private EnumC0893c(String str, int i) {
    }

    /* synthetic */ EnumC0893c(String str, int i, byte b2) {
        this(str, i);
    }

    /* JADX INFO: renamed from: a */
    abstract int mo1993a(BitSet bitSet, int i);
}
