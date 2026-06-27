package com.gmail.heagoo.apkeditor.p090a;

import android.support.v4.app.NotificationCompat;
import com.gmail.heagoo.apkeditor.p090a.p091a.C1094m;
import com.gmail.heagoo.apkeditor.p090a.p091a.C1100s;
import java.io.IOException;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.a.c */
/* JADX INFO: loaded from: classes.dex */
final class C1107c {

    /* JADX INFO: renamed from: a */
    public static int f3274a = 1048833;

    /* JADX INFO: renamed from: b */
    private static int f3275b = 1048834;

    /* JADX INFO: renamed from: c */
    private static int f3276c = 1048835;

    /* JADX INFO: renamed from: d */
    private static int f3277d = 1048832;

    /* JADX INFO: renamed from: e */
    private static int f3278e = 1048836;

    /* JADX INFO: renamed from: f */
    private byte[] f3279f;

    /* JADX INFO: renamed from: g */
    private int f3280g;

    /* JADX INFO: renamed from: h */
    private C1100s f3281h;

    public C1107c(C1100s c1100s) {
        this.f3280g = c1100s.m2980c();
        this.f3281h = c1100s;
        for (int i = 0; i < this.f3280g; i++) {
            "android".equals(c1100s.m2978b(i));
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m3014a(int i) {
        if (i == 3) {
            return true;
        }
        if (i != 2 && i != 1 && i != 4 && i != 17 && i != 18 && i != 5 && i != 6) {
            if (i < 28 || i > 31) {
                return (i < 16 || i > 31) ? false : false;
            }
            return false;
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public final int m3015a(C1094m c1094m, InterfaceC1109e interfaceC1109e) throws IOException {
        int iM2949a = c1094m.m2949a();
        int iM2949a2 = c1094m.m2949a();
        this.f3279f = new byte[iM2949a2];
        C1113i.m3020a(this.f3279f, 0, iM2949a);
        C1113i.m3020a(this.f3279f, 4, iM2949a2);
        if (iM2949a2 > 8) {
            c1094m.m2951a(this.f3279f, 8, iM2949a2 - 8);
        }
        if (iM2949a == f3275b) {
            int iM3018a = C1113i.m3018a(this.f3279f, 20);
            int iM3018a2 = C1113i.m3018a(this.f3279f, 28);
            String strM2978b = this.f3281h.m2978b(iM3018a);
            if ("uses-permission".equals(strM2978b) || "manifest".equals(strM2978b) || "application".equals(strM2978b) || "activity".equals(strM2978b) || NotificationCompat.CATEGORY_SERVICE.equals(strM2978b) || "receiver".equals(strM2978b) || "provider".equals(strM2978b) || "activity-alias".equals(strM2978b) || "category".equals(strM2978b) || "permission".equals(strM2978b) || "uses-sdk".equals(strM2978b)) {
                for (int i = 0; i < iM3018a2; i++) {
                    int iM3018a3 = C1113i.m3018a(this.f3279f, (i * 20) + 36 + 4);
                    int iM3018a4 = C1113i.m3018a(this.f3279f, (i * 20) + 36 + 8);
                    int iM3018a5 = C1113i.m3018a(this.f3279f, ((i * 20) + 36) + 12) >> 16;
                    int i2 = ((iM3018a5 >> 8) & 255) | ((iM3018a5 & 255) << 8);
                    int iM3018a6 = C1113i.m3018a(this.f3279f, (i * 20) + 36 + 16);
                    Object[] objArr = {this.f3281h.m2978b(iM3018a3), this.f3281h.m2978b(iM3018a4), Integer.valueOf(i2), Integer.valueOf(iM3018a4), Integer.valueOf(iM3018a6)};
                    interfaceC1109e.mo3016a(this.f3281h.m2978b(iM3018a), iM3018a3, iM3018a4, i2, iM3018a6);
                }
            }
        }
        return iM2949a;
    }
}
