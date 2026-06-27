package com.p046a.p049b.p058c.p059a;

import com.p046a.p049b.p058c.p060b.C0667j;
import com.p046a.p049b.p066f.p068b.C0854x;
import java.io.PrintStream;

/* JADX INFO: renamed from: com.a.b.c.a.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0618c {

    /* JADX INFO: renamed from: a */
    private static int f1023a = 0;

    /* JADX INFO: renamed from: b */
    private static int f1024b = 0;

    /* JADX INFO: renamed from: c */
    private static int f1025c = 0;

    /* JADX INFO: renamed from: d */
    private static int f1026d = 0;

    /* JADX INFO: renamed from: e */
    private static int f1027e = 0;

    /* JADX INFO: renamed from: f */
    private static int f1028f = 0;

    /* JADX INFO: renamed from: g */
    private static int f1029g = 0;

    /* JADX INFO: renamed from: a */
    public static void m1098a(int i) {
        f1029g += i;
    }

    /* JADX INFO: renamed from: a */
    public static void m1099a(C0667j c0667j, C0667j c0667j2) {
        f1027e += c0667j2.m1209f().m1233e() - c0667j.m1209f().m1233e();
        f1026d += c0667j2.m1209f().m1234f() - c0667j.m1209f().m1234f();
        f1028f += c0667j2.m1209f().m1233e();
    }

    /* JADX INFO: renamed from: a */
    public static void m1100a(C0854x c0854x, C0854x c0854x2) {
        int iM1743g = c0854x.m1844a().m1743g();
        int iM1741e = c0854x.m1844a().m1741e();
        int iM1743g2 = c0854x2.m1844a().m1743g();
        f1024b = (iM1743g2 - iM1743g) + f1024b;
        f1023a += c0854x2.m1844a().m1741e() - iM1741e;
        f1025c += iM1743g2;
    }

    /* JADX INFO: renamed from: a */
    public static void m1101a(PrintStream printStream) {
        printStream.printf("Optimizer Delta Rop Insns: %d total: %d (%.2f%%) Delta Registers: %d\n", Integer.valueOf(f1024b), Integer.valueOf(f1025c), Double.valueOf(((double) (f1024b / (f1025c + Math.abs(f1024b)))) * 100.0d), Integer.valueOf(f1023a));
        printStream.printf("Optimizer Delta Dex Insns: Insns: %d total: %d (%.2f%%) Delta Registers: %d\n", Integer.valueOf(f1027e), Integer.valueOf(f1028f), Double.valueOf(((double) (f1027e / (f1028f + Math.abs(f1027e)))) * 100.0d), Integer.valueOf(f1026d));
        printStream.printf("Original bytecode byte count: %d\n", Integer.valueOf(f1029g));
    }
}
