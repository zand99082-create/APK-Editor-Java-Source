package com.gmail.heagoo.apkeditor.p090a.p091a;

import com.gmail.heagoo.common.C1570s;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.a.a.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1084c {

    /* JADX INFO: renamed from: a */
    private C1094m f3164a;

    /* JADX INFO: renamed from: b */
    private String f3165b;

    /* JADX INFO: renamed from: c */
    private String f3166c;

    /* JADX INFO: renamed from: d */
    private C1093l f3167d;

    /* JADX INFO: renamed from: e */
    private int f3168e;

    /* JADX INFO: renamed from: f */
    private int f3169f;

    /* JADX INFO: renamed from: g */
    private C1100s f3170g;

    public C1084c(InputStream inputStream, String str) {
        this.f3165b = str;
        this.f3164a = new C1094m(inputStream);
        try {
            this.f3168e = this.f3164a.m2949a();
            this.f3169f = this.f3164a.m2949a();
            this.f3170g = new C1100s();
            this.f3170g.m2976a(this.f3164a);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    private void m2925a() {
        try {
            this.f3167d.m2942a(this.f3168e);
            this.f3167d.m2942a(this.f3169f);
            int i = this.f3170g.f3218a;
            this.f3170g.m2975a(this.f3167d);
            byte[] bArr = new byte[4096];
            while (true) {
                int iM2953b = this.f3164a.m2953b(bArr, 0, 4096);
                if (iM2953b <= 0) {
                    new Object[1][0] = Integer.valueOf(this.f3167d.m2941a());
                    this.f3167d.m2943a(4, this.f3167d.m2941a());
                    return;
                }
                this.f3167d.m2945a(bArr, 0, iM2953b);
            }
        } finally {
            m2926a(this.f3167d);
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m2926a(C1093l c1093l) {
        if (c1093l != null) {
            try {
                c1093l.m2947b();
            } catch (IOException e) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m2927a(String str, String str2) throws IOException {
        boolean z = false;
        int length = this.f3170g.f3221d.length;
        for (int i = 0; i < length; i++) {
            String strM2978b = this.f3170g.m2978b(i);
            if (strM2978b.startsWith(str)) {
                this.f3170g.m2974a(i, str2 + strM2978b.substring(str.length()));
                z = true;
            }
        }
        if (z) {
            File file = new File(new File(this.f3165b), C1570s.m3787a(6));
            if (file.exists()) {
                file.delete();
            }
            this.f3166c = file.getPath();
            RandomAccessFile randomAccessFile = new RandomAccessFile(file.getPath(), "rw");
            randomAccessFile.setLength(0L);
            this.f3167d = new C1093l(randomAccessFile);
            m2925a();
        }
        return this.f3166c;
    }
}
