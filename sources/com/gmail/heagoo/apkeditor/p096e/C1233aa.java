package com.gmail.heagoo.apkeditor.p096e;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.e.aa */
/* JADX INFO: loaded from: classes.dex */
public final class C1233aa extends AbstractC1258w {

    /* JADX INFO: renamed from: a */
    private String f3580a;

    /* JADX INFO: renamed from: b */
    private int f3581b = 0;

    public C1233aa(String str) {
        this.f3580a = str;
    }

    @Override // com.gmail.heagoo.apkeditor.p096e.AbstractC1258w
    /* JADX INFO: renamed from: a */
    public final String mo3147a() {
        if (this.f3581b != 0) {
            return null;
        }
        this.f3581b++;
        return this.f3580a;
    }

    @Override // com.gmail.heagoo.apkeditor.p096e.AbstractC1258w
    /* JADX INFO: renamed from: a */
    public final boolean mo3148a(String str) {
        return this.f3580a.equals(str);
    }

    @Override // com.gmail.heagoo.apkeditor.p096e.AbstractC1258w
    /* JADX INFO: renamed from: b */
    public final boolean mo3149b() {
        int iIndexOf;
        if (this.f3580a == null || (iIndexOf = this.f3580a.indexOf(47)) == -1) {
            return false;
        }
        String strSubstring = this.f3580a.substring(0, iIndexOf);
        return "smali".equals(strSubstring) || strSubstring.startsWith("smali_");
    }

    @Override // com.gmail.heagoo.apkeditor.p096e.AbstractC1258w
    /* JADX INFO: renamed from: c */
    public final boolean mo3150c() {
        return false;
    }
}
