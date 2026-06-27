package com.gmail.heagoo.apkeditor.p090a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.gmail.heagoo.common.C1563l;
import com.gmail.heagoo.p084a.p089c.C1067a;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import p000a.p001a.p003b.p004a.C0031e;
import p000a.p001a.p003b.p004a.C0032f;
import p000a.p001a.p003b.p004a.C0033g;
import p000a.p001a.p003b.p004a.p005a.C0012i;
import p000a.p001a.p003b.p004a.p005a.C0024u;
import p000a.p001a.p003b.p004a.p005a.C0026w;
import p000a.p001a.p003b.p006b.C0043a;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.a.j */
/* JADX INFO: loaded from: classes.dex */
public final class C1114j implements InterfaceC1108d, Serializable {

    /* JADX INFO: renamed from: a */
    private int f3314a;

    /* JADX INFO: renamed from: b */
    private String f3315b;

    public C1114j(int i, String str) {
        this.f3314a = i;
        this.f3315b = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0038 A[EXC_TOP_SPLITTER, SYNTHETIC] */
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
    private C1115k m3023a(ZipFile zipFile, String str) throws Throwable {
        C1115k c1115k;
        ZipEntry entry = zipFile.getEntry(str);
        BitmapFactory.Options options = new BitmapFactory.Options();
        ?? inputStream = 1;
        options.inJustDecodeBounds = true;
        try {
            try {
                inputStream = zipFile.getInputStream(entry);
                try {
                    BitmapFactory.decodeStream(inputStream, null, options);
                    c1115k = new C1115k(this);
                    c1115k.f3317b = options.outHeight;
                    c1115k.f3316a = options.outWidth;
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
                    c1115k = null;
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
        return c1115k;
    }

    @Override // com.gmail.heagoo.apkeditor.p090a.InterfaceC1108d
    /* JADX INFO: renamed from: a */
    public final void mo2954a(Context context, String str, Map map, InterfaceC1110f interfaceC1110f) throws Throwable {
        ZipFile zipFile;
        InputStream inputStream;
        Throwable th;
        ZipFile zipFile2 = null;
        InputStream inputStream2 = null;
        try {
            zipFile = new ZipFile(str);
            try {
                try {
                    InputStream inputStream3 = zipFile.getInputStream(zipFile.getEntry("resources.arsc"));
                    try {
                        for (C0031e c0031e : C0043a.m101a(inputStream3, false, false, new C1067a(context.getApplicationContext(), false), null, false).m113a()) {
                            Iterator it = c0031e.m44a().iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    C0032f c0032f = (C0032f) it.next();
                                    if (this.f3314a == c0032f.m66e().f64b) {
                                        Map mapM63b = c0032f.m63b();
                                        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(this.f3315b);
                                        int i = 0;
                                        for (C0033g c0033g : mapM63b.values()) {
                                            String str2 = C1067a.m2525d(context, "tmp") + ".launcher" + i + ".png";
                                            C0026w c0026wM75d = c0033g.m75d();
                                            String strM6a = c0026wM75d instanceof C0012i ? ((C0012i) c0026wM75d).m6a() : c0026wM75d instanceof C0024u ? c0026wM75d.toString() : "res/" + c0033g.m71a() + ".png";
                                            C1115k c1115kM3023a = m3023a(zipFile, strM6a);
                                            if (c1115kM3023a != null) {
                                                new C1563l().m3778a(bitmapDecodeFile, c1115kM3023a.f3316a, c1115kM3023a.f3317b, str2);
                                                map.put(strM6a, str2);
                                            } else {
                                                map.put(strM6a, this.f3315b);
                                            }
                                            i++;
                                        }
                                    }
                                }
                            }
                        }
                        if (inputStream3 != null) {
                            try {
                                inputStream3.close();
                            } catch (IOException e) {
                            }
                        }
                        try {
                            zipFile.close();
                        } catch (IOException e2) {
                        }
                    } catch (Throwable th2) {
                        inputStream = inputStream3;
                        th = th2;
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException e3) {
                            }
                        }
                        if (zipFile == null) {
                            throw th;
                        }
                        try {
                            zipFile.close();
                            throw th;
                        } catch (IOException e4) {
                            throw th;
                        }
                    }
                } catch (Exception e5) {
                    zipFile2 = zipFile;
                    if (0 != 0) {
                        try {
                            inputStream2.close();
                        } catch (IOException e6) {
                        }
                    }
                    if (zipFile2 != null) {
                        try {
                            zipFile2.close();
                        } catch (IOException e7) {
                        }
                    }
                }
            } catch (Throwable th3) {
                inputStream = null;
                th = th3;
            }
        } catch (Exception e8) {
        } catch (Throwable th4) {
            zipFile = null;
            inputStream = null;
            th = th4;
        }
    }
}
