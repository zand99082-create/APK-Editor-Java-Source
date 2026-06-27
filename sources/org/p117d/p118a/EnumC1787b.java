package org.p117d.p118a;

/* JADX WARN: $VALUES field not found */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: org.d.a.b */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1787b {

    /* JADX INFO: renamed from: a */
    public static final EnumC1787b f5219a = new EnumC1787b("ERROR", 0, 40, "ERROR");

    /* JADX INFO: renamed from: b */
    public static final EnumC1787b f5220b = new EnumC1787b("WARN", 1, 30, "WARN");

    /* JADX INFO: renamed from: c */
    public static final EnumC1787b f5221c = new EnumC1787b("INFO", 2, 20, "INFO");

    /* JADX INFO: renamed from: d */
    public static final EnumC1787b f5222d = new EnumC1787b("DEBUG", 3, 10, "DEBUG");

    /* JADX INFO: renamed from: e */
    private static EnumC1787b f5223e = new EnumC1787b("TRACE", 4, 0, "TRACE");

    /* JADX INFO: renamed from: f */
    private String f5224f;

    static {
        EnumC1787b[] enumC1787bArr = {f5219a, f5220b, f5221c, f5222d, f5223e};
    }

    private EnumC1787b(String str, int i, int i2, String str2) {
        this.f5224f = str2;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f5224f;
    }
}
