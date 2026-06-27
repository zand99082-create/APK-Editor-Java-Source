package com.gmail.heagoo.common;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.ThumbnailUtils;

/* JADX INFO: renamed from: com.gmail.heagoo.common.m */
/* JADX INFO: loaded from: classes.dex */
public final class C1564m {

    /* JADX INFO: renamed from: a */
    private int f4647a;

    /* JADX INFO: renamed from: b */
    private int f4648b;

    /* JADX INFO: renamed from: a */
    public final int m3779a() {
        return this.f4647a;
    }

    /* JADX INFO: renamed from: a */
    public final Bitmap m3780a(String str, int i, int i2) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        options.inJustDecodeBounds = false;
        this.f4648b = options.outHeight;
        this.f4647a = options.outWidth;
        int i3 = this.f4647a / 32;
        int i4 = this.f4648b / 32;
        if (i3 >= i4) {
            i3 = i4;
        }
        options.inSampleSize = i3 > 0 ? i3 : 1;
        return ThumbnailUtils.extractThumbnail(BitmapFactory.decodeFile(str, options), 32, 32, 2);
    }

    /* JADX INFO: renamed from: b */
    public final int m3781b() {
        return this.f4648b;
    }
}
