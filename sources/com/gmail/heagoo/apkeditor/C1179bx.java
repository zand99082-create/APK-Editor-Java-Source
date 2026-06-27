package com.gmail.heagoo.apkeditor;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.android.apksig.apk.ApkUtils;
import com.gmail.heagoo.apkeditor.p090a.C1081a;
import com.gmail.heagoo.apkeditor.p090a.C1111g;
import com.gmail.heagoo.apkeditor.p090a.C1113i;
import com.gmail.heagoo.common.C1552a;
import com.gmail.heagoo.common.C1553b;
import java.io.InputStream;
import java.util.zip.ZipFile;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.bx */
/* JADX INFO: loaded from: classes.dex */
final class C1179bx extends Thread {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ CommonEditActivity f3455a;

    C1179bx(CommonEditActivity commonEditActivity) {
        this.f3455a = commonEditActivity;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws Throwable {
        try {
            CommonEditActivity commonEditActivity = this.f3455a;
            new C1552a();
            commonEditActivity.f3005b = C1552a.m3750a(this.f3455a, this.f3455a.f3004a);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            ZipFile zipFile = new ZipFile(this.f3455a.f3004a);
            InputStream inputStream = zipFile.getInputStream(zipFile.getEntry(ApkUtils.ANDROID_MANIFEST_ZIP_ENTRY_NAME));
            this.f3455a.f3022s = new C1113i(inputStream);
            this.f3455a.f3022s.m3022b();
            inputStream.close();
            zipFile.close();
            C1111g c1111gM3021a = this.f3455a.f3022s.m3021a();
            if (this.f3455a.f3005b == null) {
                this.f3455a.f3005b = new C1553b();
                C1081a c1081a = new C1081a(this.f3455a, this.f3455a.f3004a);
                c1081a.m2917a(c1111gM3021a.f3295n, c1111gM3021a.f3294m);
                this.f3455a.f3005b.f4629a = c1081a.m2916a();
                Bitmap bitmapM2918b = c1081a.m2918b();
                if (bitmapM2918b != null) {
                    this.f3455a.f3005b.f4631c = new BitmapDrawable(bitmapM2918b);
                }
            }
            this.f3455a.f3024u.sendEmptyMessage(0);
        } catch (Exception e2) {
            e2.printStackTrace();
            this.f3455a.f3024u.m3083a(e2.getMessage());
            this.f3455a.f3024u.sendEmptyMessage(1);
        }
    }
}
