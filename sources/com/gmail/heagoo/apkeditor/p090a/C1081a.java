package com.gmail.heagoo.apkeditor.p090a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.gmail.heagoo.apkeditor.ApkInfoActivity;
import com.gmail.heagoo.apkeditor.p098se.C1428aa;
import com.gmail.heagoo.p084a.p089c.C1067a;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import p000a.p001a.p003b.p004a.C0030d;
import p000a.p001a.p003b.p004a.C0031e;
import p000a.p001a.p003b.p004a.C0032f;
import p000a.p001a.p003b.p004a.C0033g;
import p000a.p001a.p003b.p004a.p005a.C0012i;
import p000a.p001a.p003b.p004a.p005a.C0024u;
import p000a.p001a.p003b.p004a.p005a.C0026w;
import p000a.p001a.p003b.p006b.C0043a;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.a.a */
/* JADX INFO: loaded from: classes.dex */
public class C1081a {

    /* JADX INFO: renamed from: a */
    private Context f3153a;

    /* JADX INFO: renamed from: b */
    private String f3154b;

    /* JADX INFO: renamed from: c */
    private String f3155c;

    /* JADX INFO: renamed from: d */
    private Bitmap f3156d;

    public C1081a(Context context, String str) {
        this.f3153a = context;
        this.f3154b = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0039 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.io.InputStream] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static C1106b m2912a(ZipFile zipFile, String str) throws Throwable {
        C1106b c1106b;
        ZipEntry entry = zipFile.getEntry(str);
        BitmapFactory.Options options = new BitmapFactory.Options();
        ?? inputStream = 1;
        options.inJustDecodeBounds = true;
        try {
            try {
                inputStream = zipFile.getInputStream(entry);
                try {
                    BitmapFactory.decodeStream(inputStream, null, options);
                    c1106b = new C1106b((byte) 0);
                    c1106b.f3273b = options.outHeight;
                    c1106b.f3272a = options.outWidth;
                    if (inputStream != 0) {
                        try {
                            inputStream.close();
                        } catch (IOException e) {
                        }
                    }
                } catch (IOException e2) {
                    e = e2;
                    e.printStackTrace();
                    if (inputStream != 0) {
                        try {
                            inputStream.close();
                        } catch (IOException e3) {
                        }
                    }
                    c1106b = null;
                }
            } catch (Throwable th) {
                th = th;
                if (inputStream != 0) {
                    try {
                        inputStream.close();
                    } catch (IOException e4) {
                    }
                }
                throw th;
            }
        } catch (IOException e5) {
            e = e5;
            inputStream = 0;
        } catch (Throwable th2) {
            th = th2;
            inputStream = 0;
            if (inputStream != 0) {
            }
            throw th;
        }
        return c1106b;
    }

    /* JADX INFO: renamed from: a */
    private static void m2913a(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m2914a(ZipFile zipFile) {
        if (zipFile != null) {
            try {
                zipFile.close();
            } catch (IOException e) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m2915a(ZipFile zipFile, C0031e c0031e, int i) throws Throwable {
        try {
            Map mapM63b = c0031e.m49b(new C0030d(i)).m63b();
            C1428aa c1428aa = new C1428aa(zipFile);
            for (C0033g c0033g : mapM63b.values()) {
                C0026w c0026wM75d = c0033g.m75d();
                String strM6a = c0026wM75d instanceof C0012i ? ((C0012i) c0026wM75d).m6a() : c0026wM75d instanceof C0024u ? c0026wM75d.toString() : "res/" + c0033g.m71a() + ".png";
                C1106b c1106bM2912a = m2912a(zipFile, strM6a);
                if (c1106bM2912a.f3272a > 0) {
                    this.f3156d = c1428aa.m3523a(strM6a, c1106bM2912a.f3272a, c1106bM2912a.f3273b);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m2916a() {
        return this.f3155c;
    }

    /* JADX INFO: renamed from: a */
    public final void m2917a(int i, int i2) throws Throwable {
        ZipFile zipFile;
        Throwable th;
        InputStream inputStream;
        ZipFile zipFile2;
        InputStream inputStream2;
        try {
            zipFile = new ZipFile(this.f3154b);
            try {
                try {
                    inputStream2 = zipFile.getInputStream(zipFile.getEntry("resources.arsc"));
                } catch (Throwable th2) {
                    inputStream = null;
                    th = th2;
                }
                try {
                    for (C0031e c0031e : C0043a.m101a(inputStream2, false, false, new C1067a(this.f3153a.getApplicationContext(), false), null, false).m113a()) {
                        if (i != -1) {
                            try {
                                C0032f c0032fM49b = c0031e.m49b(new C0030d(i));
                                C0026w c0026wM75d = c0032fM49b.m58a(ApkInfoActivity.m2636a(c0032fM49b.m63b().keySet())).m75d();
                                if (c0026wM75d instanceof C0024u) {
                                    this.f3155c = c0026wM75d.toString();
                                }
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                        if (i2 != -1) {
                            m2915a(zipFile, c0031e, i2);
                        }
                    }
                    m2913a(inputStream2);
                    m2914a(zipFile);
                } catch (Throwable th3) {
                    inputStream = inputStream2;
                    th = th3;
                    m2913a(inputStream);
                    m2914a(zipFile);
                    throw th;
                }
            } catch (Exception e2) {
                zipFile2 = zipFile;
                m2913a((InputStream) null);
                m2914a(zipFile2);
            }
        } catch (Exception e3) {
            zipFile2 = null;
        } catch (Throwable th4) {
            zipFile = null;
            th = th4;
            inputStream = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final Bitmap m2918b() {
        return this.f3156d;
    }
}
