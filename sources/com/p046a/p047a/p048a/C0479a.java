package com.p046a.p047a.p048a;

/* JADX INFO: renamed from: com.a.a.a.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0479a implements InterfaceC0480b {

    /* JADX INFO: renamed from: a */
    private final byte[] f670a;

    /* JADX INFO: renamed from: b */
    private int f671b;

    public C0479a(byte... bArr) {
        this.f670a = bArr;
    }

    @Override // com.p046a.p047a.p048a.InterfaceC0480b
    /* JADX INFO: renamed from: d */
    public final byte mo568d() {
        byte[] bArr = this.f670a;
        int i = this.f671b;
        this.f671b = i + 1;
        return bArr[i];
    }
}
