package com.gmail.heagoo.apkeditor.p090a.p091a;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import p000a.p001a.p003b.p004a.C0028b;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.a.a.t */
/* JADX INFO: loaded from: classes.dex */
public final class C1101t {

    /* JADX INFO: renamed from: a */
    private C0028b f3231a;

    /* JADX INFO: renamed from: b */
    private FileOutputStream f3232b;

    /* JADX INFO: renamed from: c */
    private C1102u f3233c;

    /* JADX INFO: renamed from: d */
    private int f3234d;

    /* JADX INFO: renamed from: e */
    private C1102u f3235e;

    /* JADX INFO: renamed from: f */
    private byte[] f3236f;

    /* JADX INFO: renamed from: g */
    private C1102u f3237g;

    /* JADX INFO: renamed from: h */
    private int f3238h;

    /* JADX INFO: renamed from: i */
    private byte[] f3239i;

    /* JADX INFO: renamed from: j */
    private C1103v f3240j;

    public C1101t(InputStream inputStream, String str) throws IOException {
        this.f3231a = new C0028b(inputStream);
        File file = new File(str);
        if (file.exists()) {
            file.delete();
        }
        this.f3232b = new FileOutputStream(file);
        this.f3233c = new C1102u();
        this.f3233c.m2986a(this.f3231a);
        this.f3234d = this.f3231a.readInt();
        this.f3235e = new C1102u();
        this.f3235e.m2986a(this.f3231a);
        this.f3236f = new byte[this.f3235e.f3241a - 8];
        this.f3231a.readFully(this.f3236f);
        this.f3237g = new C1102u();
        this.f3237g.m2986a(this.f3231a);
        this.f3238h = this.f3231a.readInt();
    }

    /* JADX INFO: renamed from: a */
    private void m2981a(int i) throws IOException {
        this.f3232b.write(new byte[]{(byte) i, (byte) (i >> 8), (byte) (i >> 16), (byte) (i >>> 24)});
    }

    /* JADX INFO: renamed from: a */
    public final void m2982a() throws IOException {
        this.f3233c.m2985a(this.f3233c.f3241a + this.f3240j.m2994a());
        this.f3233c.m2987a(this.f3232b);
        m2981a(this.f3234d);
        if (this.f3240j != null) {
            this.f3240j.m2995a(this.f3232b);
        } else {
            this.f3235e.m2987a(this.f3232b);
            this.f3232b.write(this.f3236f);
        }
        this.f3237g.m2987a(this.f3232b);
        m2981a(this.f3238h);
        if (this.f3239i != null) {
            this.f3232b.write(this.f3239i);
            this.f3231a.skipBytes(256);
        }
        byte[] bArr = new byte[4096];
        int iM40a = this.f3231a.m40a(bArr, 0, 4096);
        while (iM40a > 0) {
            this.f3232b.write(bArr, 0, iM40a);
            iM40a = this.f3231a.m40a(bArr, 0, 4096);
        }
        this.f3232b.close();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m2983a(String str) {
        if (str.length() > 127 || this.f3238h != 127) {
            return false;
        }
        this.f3239i = new byte[256];
        for (int i = 0; i < str.length(); i++) {
            this.f3239i[i * 2] = (byte) str.charAt(i);
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m2984a(String str, String str2, String str3, String str4) {
        this.f3240j = new C1103v(this.f3235e, this.f3236f);
        return this.f3240j.m2996a(str, str2, str3, str4);
    }
}
