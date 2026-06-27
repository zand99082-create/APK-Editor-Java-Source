package com.gmail.heagoo.apkeditor;

import android.app.Activity;
import android.content.Context;
import com.android.apksig.apk.ApkUtils;
import com.gmail.heagoo.apkeditor.p097f.C1290d;
import com.gmail.heagoo.common.C1559h;
import com.gmail.heagoo.p084a.C1056b;
import com.gmail.heagoo.p084a.p089c.C1067a;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import p000a.p001a.C0000a;
import p000a.p001a.p003b.p004a.C0031e;
import p000a.p001a.p003b.p006b.C0043a;
import p000a.p001a.p003b.p007c.C0057a;
import p000a.p013c.InterfaceC0076d;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.bg */
/* JADX INFO: loaded from: classes.dex */
public final class C1162bg extends Thread {

    /* JADX INFO: renamed from: a */
    private static boolean f3406a = false;

    /* JADX INFO: renamed from: b */
    private WeakReference f3407b;

    /* JADX INFO: renamed from: c */
    private WeakReference f3408c;

    /* JADX INFO: renamed from: d */
    private String f3409d;

    /* JADX INFO: renamed from: e */
    private String f3410e;

    /* JADX INFO: renamed from: f */
    private C0031e f3411f;

    /* JADX INFO: renamed from: g */
    private C1067a f3412g;

    /* JADX INFO: renamed from: h */
    private String f3413h;

    /* JADX INFO: renamed from: i */
    private ApkDecoderMine f3414i;

    /* JADX INFO: renamed from: j */
    private C1290d f3415j;

    /* JADX INFO: renamed from: k */
    private boolean f3416k;

    /* JADX INFO: renamed from: l */
    private boolean f3417l;

    public C1162bg(Activity activity, InterfaceC1161bf interfaceC1161bf, String str, String str2, boolean z) {
        this.f3407b = new WeakReference(activity);
        this.f3408c = new WeakReference(interfaceC1161bf);
        this.f3409d = str;
        this.f3410e = str2;
        this.f3417l = z;
    }

    /* JADX INFO: renamed from: a */
    private static void m3071a(Context context, String str, byte[] bArr) throws IOException {
        int i;
        InputStream inputStreamOpen = context.getAssets().open(str);
        int i2 = inputStreamOpen.read(bArr);
        while (i2 < bArr.length && (i = inputStreamOpen.read(bArr, i2, bArr.length - i2)) != -1) {
            i2 += i;
        }
        inputStreamOpen.close();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private C0031e[] m3072a(C0057a c0057a, C1067a c1067a, boolean z) throws Throwable {
        ZipFile zipFile;
        ZipFile zipFile2;
        ByteArrayInputStream byteArrayInputStream = null;
        try {
            zipFile = new ZipFile(c0057a);
            try {
                ZipEntry entry = zipFile.getEntry("resources.arsc");
                if (entry == null) {
                    try {
                        zipFile.close();
                    } catch (IOException e) {
                    }
                    return null;
                }
                byte[] bArr = new byte[(int) entry.getSize()];
                C1067a.m2478a(zipFile.getInputStream(entry), bArr);
                ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArr);
                try {
                    C0031e[] c0031eArrM113a = C0043a.m101a(byteArrayInputStream2, false, z, c1067a, this.f3415j, this.f3416k).m113a();
                    try {
                        zipFile.close();
                    } catch (IOException e2) {
                    }
                    try {
                        byteArrayInputStream2.close();
                    } catch (IOException e3) {
                    }
                    return c0031eArrM113a;
                } catch (IOException e4) {
                    zipFile2 = zipFile;
                    e = e4;
                    byteArrayInputStream = byteArrayInputStream2;
                } catch (Throwable th) {
                    byteArrayInputStream = byteArrayInputStream2;
                    th = th;
                    try {
                        zipFile.close();
                    } catch (IOException e5) {
                    }
                    if (byteArrayInputStream != null) {
                    }
                }
            } catch (IOException e6) {
                e = e6;
                zipFile2 = zipFile;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e7) {
            e = e7;
            zipFile2 = null;
        } catch (Throwable th3) {
            th = th3;
            zipFile = null;
        }
        try {
            throw new C0000a("Could not read resources.arsc from file: " + c0057a, e);
        } catch (Throwable th4) {
            th = th4;
            zipFile = zipFile2;
            zipFile.close();
            if (byteArrayInputStream != null) {
                throw th;
            }
            try {
                byteArrayInputStream.close();
                throw th;
            } catch (IOException e8) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private boolean m3073c() throws Throwable {
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        try {
            Activity activity = (Activity) this.f3407b.get();
            if (this.f3417l) {
                bArr = null;
                bArr2 = null;
                bArr3 = null;
            } else {
                byte[] bArr4 = new byte[68];
                m3071a(activity, "dummy_png.png", bArr4);
                byte[] bArr5 = new byte[667];
                m3071a(activity, "dummy_jpg.jpg", bArr5);
                byte[] bArr6 = new byte[97];
                m3071a(activity, "dummy.9.png", bArr6);
                bArr3 = bArr4;
                bArr2 = bArr5;
                bArr = bArr6;
            }
            C0057a c0057a = new C0057a(new File(this.f3409d));
            InterfaceC0076d interfaceC0076dM158a = c0057a.m158a();
            this.f3416k = !interfaceC0076dM158a.mo197a("res");
            if (this.f3416k && (interfaceC0076dM158a.mo197a("r") || interfaceC0076dM158a.mo197a("R"))) {
                try {
                    InputStream inputStreamMo198b = interfaceC0076dM158a.mo198b(ApkUtils.ANDROID_MANIFEST_ZIP_ENTRY_NAME);
                    C1056b c1056b = new C1056b();
                    c1056b.m2419a(inputStreamMo198b, "manifest", "package");
                    String strM2418a = c1056b.m2418a();
                    inputStreamMo198b.close();
                    InputStream inputStreamMo198b2 = interfaceC0076dM158a.mo198b("classes.dex");
                    String strM2525d = C1067a.m2525d(activity, "tmp");
                    String str = strM2525d + "classes.dex";
                    FileOutputStream fileOutputStream = new FileOutputStream(str);
                    C1067a.m2506b(inputStreamMo198b2, fileOutputStream);
                    inputStreamMo198b2.close();
                    fileOutputStream.close();
                    C1067a.m2452a("com.gmail.heagoo.apkeditor.pro.ResourceDecoder", "decodeResources", new Class[]{String.class, String.class}, new Object[]{str, strM2525d});
                    this.f3415j = new C1290d(strM2525d, strM2418a);
                } catch (Exception e) {
                }
            }
            C1067a c1067a = new C1067a(((Activity) this.f3407b.get()).getApplicationContext(), this.f3416k);
            C0031e[] c0031eArrM3072a = m3072a(c0057a, c1067a, false);
            if (c0031eArrM3072a != null) {
                switch (c0031eArrM3072a.length) {
                    case 1:
                        this.f3411f = c0031eArrM3072a[0];
                        break;
                    case 2:
                        if (c0031eArrM3072a[0].m56f().equals("android") || c0031eArrM3072a[0].m56f().equals("com.htc")) {
                            this.f3411f = c0031eArrM3072a[1];
                            break;
                        }
                    default:
                        this.f3411f = selectPkgWithMostResSpecs(c0031eArrM3072a);
                        break;
                }
                if (this.f3411f == null) {
                    throw new C0000a("Arsc files with zero packages");
                }
                c1067a.m2567a(this.f3411f, true);
                C0031e c0031e = this.f3411f;
            }
            this.f3412g = c1067a;
            if (this.f3408c.get() != null) {
                ((InterfaceC1161bf) this.f3408c.get()).mo2711c(true);
            }
            this.f3414i = new ApkDecoderMine(this.f3412g, bArr3, bArr2, bArr);
            C1559h.m3770a(new File(this.f3410e));
            C1405m.m3458a((Context) this.f3407b.get());
            File file = new File(this.f3410e);
            if (!file.exists()) {
                file.mkdirs();
            }
            this.f3414i.m2634a(c0057a, file);
            if (this.f3408c.get() != null) {
                ((InterfaceC1161bf) this.f3408c.get()).mo2700a(this.f3414i.m2633a());
            }
            return true;
        } catch (Exception e2) {
            this.f3413h = e2.getMessage();
            e2.printStackTrace();
            return false;
        }
    }

    private C0031e selectPkgWithMostResSpecs(C0031e[] c0031eArr) {
        int iM55e = 0;
        int size = 0;
        int i = 0;
        for (int i2 = 0; i2 < c0031eArr.length; i2++) {
            C0031e c0031e = c0031eArr[i2];
            if (c0031e.getSize() > size) {
                size = c0031e.getSize();
                iM55e = c0031e.m55e();
                i = i2;
            }
        }
        return iM55e == 0 ? c0031eArr[0] : c0031eArr[i];
    }

    /* JADX INFO: renamed from: a */
    public final C0031e m3074a() {
        return this.f3411f;
    }

    /* JADX INFO: renamed from: b */
    public final void m3075b() {
        if (this.f3414i != null) {
            this.f3414i.m2635b();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        C1405m c1405m = new C1405m((Context) this.f3407b.get(), null, null, null);
        if (!c1405m.m3468a()) {
            ((InterfaceC1161bf) this.f3408c.get()).mo2715e(c1405m.m3469c());
        } else {
            if (m3073c() || this.f3408c.get() == null) {
                return;
            }
            ((InterfaceC1161bf) this.f3408c.get()).mo2715e(this.f3413h);
        }
    }
}
