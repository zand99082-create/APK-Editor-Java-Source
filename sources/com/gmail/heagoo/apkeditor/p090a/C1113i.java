package com.gmail.heagoo.apkeditor.p090a;

import android.R;
import android.support.v4.app.NotificationCompat;
import com.gmail.heagoo.apkeditor.p090a.p091a.C1094m;
import com.gmail.heagoo.apkeditor.p090a.p091a.C1099r;
import com.gmail.heagoo.apkeditor.p090a.p091a.C1100s;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.a.i */
/* JADX INFO: loaded from: classes.dex */
public final class C1113i implements InterfaceC1109e {

    /* JADX INFO: renamed from: a */
    private C1094m f3307a;

    /* JADX INFO: renamed from: b */
    private int f3308b;

    /* JADX INFO: renamed from: c */
    private C1100s f3309c;

    /* JADX INFO: renamed from: d */
    private C1099r f3310d;

    /* JADX INFO: renamed from: g */
    private C1112h f3313g;

    /* JADX INFO: renamed from: f */
    private int f3312f = -1;

    /* JADX INFO: renamed from: e */
    private C1111g f3311e = new C1111g();

    public C1113i(InputStream inputStream) {
        this.f3307a = new C1094m(inputStream);
    }

    /* JADX INFO: renamed from: a */
    protected static int m3018a(byte[] bArr, int i) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
    }

    /* JADX INFO: renamed from: a */
    public static String m3019a(int i) {
        switch (i) {
            case R.attr.theme:
                return "theme";
            case R.attr.label:
                return "label";
            case R.attr.icon:
                return "icon";
            case R.attr.name:
                return "name";
            case R.attr.authorities:
                return "authorities";
            case R.attr.versionCode:
                return "versionCode";
            case R.attr.versionName:
                return "versionName";
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: a */
    protected static void m3020a(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) i2;
        bArr[i + 1] = (byte) (i2 >> 8);
        bArr[i + 2] = (byte) (i2 >> 16);
        bArr[i + 3] = (byte) (i2 >>> 24);
    }

    /* JADX INFO: renamed from: a */
    public final C1111g m3021a() {
        return this.f3311e;
    }

    @Override // com.gmail.heagoo.apkeditor.p090a.InterfaceC1109e
    /* JADX INFO: renamed from: a */
    public final void mo3016a(String str, int i, int i2, int i3, int i4) {
        String strM2978b = this.f3309c.m2978b(i);
        if ((strM2978b == null || strM2978b.equals("")) && i < this.f3310d.m2963a()) {
            strM2978b = m3019a(this.f3310d.f3213a[i]);
        }
        if (i4 < 0) {
            i4 = i2;
        }
        if ("uses-permission".equals(str)) {
            if ("name".equals(strM2978b)) {
                this.f3311e.f3303v.add(this.f3309c.m2978b(i4));
                return;
            }
            return;
        }
        if ("manifest".equals(str)) {
            if ("versionCode".equals(strM2978b)) {
                this.f3311e.f3282a = i4;
                return;
            }
            if ("versionName".equals(strM2978b) && C1107c.m3014a(i3)) {
                this.f3311e.f3292k = i4;
                this.f3311e.f3285d = this.f3309c.m2978b(i4);
                return;
            } else if ("installLocation".equals(strM2978b)) {
                this.f3311e.f3283b = i4;
                return;
            } else {
                if ("package".equals(strM2978b) && C1107c.m3014a(i3)) {
                    this.f3311e.f3293l = i4;
                    this.f3311e.f3286e = this.f3309c.m2978b(i4);
                    return;
                }
                return;
            }
        }
        if ("application".equals(str)) {
            if ("label".equals(strM2978b)) {
                if (!C1107c.m3014a(i3)) {
                    this.f3311e.f3295n = i4;
                    return;
                }
                this.f3311e.f3291j = i4;
                this.f3311e.f3284c = this.f3309c.m2978b(i4);
                return;
            }
            if ("name".equals(strM2978b)) {
                this.f3311e.f3297p.add(Integer.valueOf(i4));
                this.f3311e.f3287f = this.f3309c.m2978b(i4);
                return;
            } else {
                if ("icon".equals(strM2978b)) {
                    this.f3311e.f3294m = i4;
                    return;
                }
                return;
            }
        }
        if ("activity".equals(str) || NotificationCompat.CATEGORY_SERVICE.equals(str) || "receiver".equals(str) || "provider".equals(str)) {
            if ("name".equals(strM2978b) && C1107c.m3014a(i3)) {
                this.f3311e.f3297p.add(Integer.valueOf(i4));
                if ("activity".equals(str)) {
                    this.f3311e.f3298q.put(Integer.valueOf(i4), 0);
                } else if (NotificationCompat.CATEGORY_SERVICE.equals(str)) {
                    this.f3311e.f3298q.put(Integer.valueOf(i4), 1);
                } else if ("receiver".equals(str)) {
                    this.f3311e.f3298q.put(Integer.valueOf(i4), 2);
                } else if ("provider".equals(str)) {
                    this.f3311e.f3298q.put(Integer.valueOf(i4), 3);
                }
            }
            if ("activity".equals(str) && "name".equals(strM2978b)) {
                this.f3312f = i4;
            }
            if ("provider".equals(str) && C1107c.m3014a(i3)) {
                if (this.f3313g == null) {
                    this.f3313g = new C1112h();
                }
                if ("authorities".equals(strM2978b)) {
                    this.f3313g.f3306c = i4;
                    this.f3313g.f3305b = this.f3309c.m2978b(i4);
                } else if ("name".equals(strM2978b)) {
                    this.f3313g.f3304a = this.f3309c.m2978b(i4);
                }
                if (this.f3313g.f3305b == null || this.f3313g.f3304a == null) {
                    return;
                }
                this.f3311e.f3300s.add(this.f3313g);
                this.f3313g = null;
                return;
            }
            return;
        }
        if ("activity-alias".equals(str)) {
            if ("name".equals(strM2978b)) {
                this.f3312f = i4;
                return;
            } else {
                if ("targetActivity".equals(strM2978b)) {
                    this.f3311e.f3302u.put(Integer.valueOf(this.f3312f), Integer.valueOf(i4));
                    return;
                }
                return;
            }
        }
        if ("category".equals(str)) {
            if ("name".equals(strM2978b) && "android.intent.category.LAUNCHER".equals(this.f3309c.m2978b(i4)) && this.f3312f != -1) {
                this.f3311e.f3301t.add(Integer.valueOf(this.f3312f));
                return;
            }
            return;
        }
        if ("permission".equals(str)) {
            if ("name".equals(strM2978b)) {
                this.f3311e.f3299r.put(Integer.valueOf(i4), this.f3309c.m2978b(i4));
            }
        } else if ("uses-sdk".equals(str)) {
            if ("minSdkVersion".equals(strM2978b)) {
                this.f3311e.f3288g = i4;
            } else if ("targetSdkVersion".equals(strM2978b)) {
                this.f3311e.f3289h = i4;
            } else if ("maxSdkVersion".equals(strM2978b)) {
                this.f3311e.f3290i = i4;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m3022b() throws IOException {
        this.f3307a.m2949a();
        this.f3308b = this.f3307a.m2949a();
        this.f3309c = new C1100s();
        this.f3309c.m2976a(this.f3307a);
        new Object[1][0] = Integer.valueOf(this.f3309c.f3218a);
        new Object[1][0] = Integer.valueOf(this.f3309c.m2980c());
        for (int i = 0; i < this.f3309c.m2980c(); i++) {
            this.f3311e.f3296o.add(this.f3309c.m2978b(i));
        }
        this.f3310d = new C1099r();
        this.f3310d.m2966a(this.f3307a);
        while (new C1107c(this.f3309c).m3015a(this.f3307a, this) != C1107c.f3274a) {
        }
        this.f3308b += 20;
    }
}
