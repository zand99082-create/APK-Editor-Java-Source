package com.gmail.heagoo.apkeditor.p098se;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.ThumbnailUtils;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipFile;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.se.aa */
/* JADX INFO: loaded from: classes.dex */
public final class C1428aa {

    /* JADX INFO: renamed from: a */
    private ZipFile f4209a;

    /* JADX INFO: renamed from: b */
    private int f4210b;

    /* JADX INFO: renamed from: c */
    private int f4211c;

    public C1428aa(ZipFile zipFile) {
        this.f4209a = zipFile;
    }

    /* JADX INFO: renamed from: a */
    private static void m3521a(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e) {
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m3522a() {
        return this.f4210b;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0048  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bitmap m3523a(String str, int i, int i2) throws Throwable {
        InputStream inputStream;
        try {
            inputStream = this.f4209a.getInputStream(this.f4209a.getEntry(str));
            try {
                try {
                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStream);
                    this.f4210b = bitmapDecodeStream.getWidth();
                    this.f4211c = bitmapDecodeStream.getHeight();
                    int i3 = this.f4210b / i;
                    int i4 = this.f4211c / i2;
                    if (i3 >= i4) {
                        i3 = i4;
                    }
                    if (i3 <= 0) {
                        i3 = 1;
                    }
                    if (i3 > 1) {
                        bitmapDecodeStream = ThumbnailUtils.extractThumbnail(bitmapDecodeStream, i, i2, 2);
                    }
                    if (inputStream == null) {
                        return bitmapDecodeStream;
                    }
                    m3521a(inputStream);
                    return bitmapDecodeStream;
                } catch (Exception e) {
                    e = e;
                    e.printStackTrace();
                    if (inputStream != null) {
                        m3521a(inputStream);
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                if (inputStream != null) {
                    m3521a(inputStream);
                }
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            inputStream = null;
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
            if (inputStream != null) {
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m3524b() {
        return this.f4211c;
    }
}
