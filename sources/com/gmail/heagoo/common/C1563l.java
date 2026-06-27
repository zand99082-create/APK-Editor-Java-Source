package com.gmail.heagoo.common;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import com.gmail.heagoo.p084a.p089c.C1067a;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: com.gmail.heagoo.common.l */
/* JADX INFO: loaded from: classes.dex */
public final class C1563l {
    /* JADX INFO: renamed from: a */
    private static void m3776a(OutputStream outputStream) {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException e) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m3777a(Bitmap bitmap, String str) throws Throwable {
        FileOutputStream fileOutputStream;
        boolean z;
        try {
            try {
                fileOutputStream = new FileOutputStream(str);
                try {
                    bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                    C1067a.m2474a(fileOutputStream);
                    z = true;
                } catch (Exception e) {
                    e = e;
                    e.printStackTrace();
                    C1067a.m2474a(fileOutputStream);
                    z = false;
                }
            } catch (Throwable th) {
                th = th;
                C1067a.m2474a(fileOutputStream);
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            fileOutputStream = null;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = null;
            C1067a.m2474a(fileOutputStream);
            throw th;
        }
        return z;
    }

    /* JADX INFO: renamed from: a */
    public final void m3778a(Bitmap bitmap, int i, int i2, String str) throws Throwable {
        FileOutputStream fileOutputStream;
        OutputStream outputStream = null;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.postScale(i / width, i2 / height);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, false);
        try {
            try {
                fileOutputStream = new FileOutputStream(str);
                try {
                    if (str.endsWith(".png")) {
                        bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 80, fileOutputStream);
                    } else {
                        bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, 80, fileOutputStream);
                    }
                    m3776a(fileOutputStream);
                } catch (Exception e) {
                    e = e;
                    e.printStackTrace();
                    m3776a(fileOutputStream);
                }
            } catch (Throwable th) {
                th = th;
                m3776a(outputStream);
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            fileOutputStream = null;
        } catch (Throwable th2) {
            th = th2;
            outputStream = null;
            m3776a(outputStream);
            throw th;
        }
    }
}
