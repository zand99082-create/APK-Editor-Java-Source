package com.gmail.heagoo.apkeditor.p096e;

import jadx.core.deobf.Deobfuscator;
import java.io.File;
import java.util.List;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.e.x */
/* JADX INFO: loaded from: classes.dex */
public final class C1259x extends AbstractC1258w {

    /* JADX INFO: renamed from: a */
    private int f3650a;

    /* JADX INFO: renamed from: b */
    private String f3651b;

    /* JADX INFO: renamed from: c */
    private String f3652c;

    /* JADX INFO: renamed from: d */
    private List f3653d;

    /* JADX INFO: renamed from: e */
    private int f3654e = 0;

    public C1259x(InterfaceC1237b interfaceC1237b, int i) {
        this.f3650a = i;
        this.f3651b = interfaceC1237b.mo3165b();
        switch (C1260y.f3655a[i - 1]) {
            case 1:
                this.f3652c = interfaceC1237b.mo3166c();
                break;
            case 2:
                this.f3653d = interfaceC1237b.mo3167d();
                break;
            case 3:
                this.f3653d = interfaceC1237b.mo3168e();
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    private String m3219a(String str, String str2, boolean z) {
        String str3 = str + "/" + str2.replaceAll("\\.", "/") + ".smali";
        String str4 = this.f3651b + "/" + str3;
        if (!z || new File(str4).exists()) {
            return str3;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    private String m3220b(String str) {
        String strM3219a = m3219a("smali", str, true);
        int i = 2;
        while (strM3219a == null && i < 8) {
            String strM3219a2 = m3219a("smali_classes" + i, str, true);
            i++;
            strM3219a = strM3219a2;
        }
        return strM3219a == null ? m3219a("smali", str, false) : strM3219a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.gmail.heagoo.apkeditor.p096e.AbstractC1258w
    /* JADX INFO: renamed from: a */
    public final String mo3147a() {
        switch (C1260y.f3655a[this.f3650a - 1]) {
            case 1:
                if (this.f3654e == 0) {
                    this.f3654e++;
                    return m3220b(this.f3652c);
                }
                return null;
            case 2:
            case 3:
                if (this.f3654e < this.f3653d.size()) {
                    List list = this.f3653d;
                    int i = this.f3654e;
                    this.f3654e = i + 1;
                    return m3220b((String) list.get(i));
                }
                return null;
            default:
                return null;
        }
    }

    @Override // com.gmail.heagoo.apkeditor.p096e.AbstractC1258w
    /* JADX INFO: renamed from: a */
    public final boolean mo3148a(String str) {
        int iIndexOf = str.indexOf(47);
        if (iIndexOf != -1 && str.endsWith(".smali")) {
            String strReplaceAll = str.substring(iIndexOf + 1, str.length() - 6).replaceAll("/", Deobfuscator.CLASS_NAME_SEPARATOR);
            switch (C1260y.f3655a[this.f3650a - 1]) {
                case 1:
                    return strReplaceAll.equals(this.f3652c);
                case 2:
                case 3:
                    return this.f3653d.contains(strReplaceAll);
            }
        }
        return false;
    }

    @Override // com.gmail.heagoo.apkeditor.p096e.AbstractC1258w
    /* JADX INFO: renamed from: b */
    public final boolean mo3149b() {
        return true;
    }

    @Override // com.gmail.heagoo.apkeditor.p096e.AbstractC1258w
    /* JADX INFO: renamed from: c */
    public final boolean mo3150c() {
        return false;
    }
}
