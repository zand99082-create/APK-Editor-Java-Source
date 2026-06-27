package com.gmail.heagoo.pngeditor.p101a;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import com.gmail.heagoo.pngeditor.InterfaceC1616a;

/* JADX INFO: renamed from: com.gmail.heagoo.pngeditor.a.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1618b implements InterfaceC1616a {

    /* JADX INFO: renamed from: a */
    private int f4914a = 0;

    /* JADX INFO: renamed from: b */
    private int f4915b = 0;

    /* JADX INFO: renamed from: c */
    private boolean f4916c = true;

    /* JADX INFO: renamed from: d */
    private boolean f4917d = false;

    @Override // com.gmail.heagoo.pngeditor.InterfaceC1616a
    /* JADX INFO: renamed from: a */
    public final Bitmap mo3974a(Bitmap bitmap) {
        if (this.f4914a <= 0 || this.f4915b <= 0) {
            return null;
        }
        this.f4917d = true;
        if (!this.f4916c) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.f4914a, this.f4915b, Bitmap.Config.ARGB_8888);
            new Canvas(bitmapCreateBitmap).drawBitmap(bitmap, (r1 - bitmap.getWidth()) / 2, (r2 - bitmap.getHeight()) / 2, new Paint());
            return bitmapCreateBitmap;
        }
        int i = this.f4914a;
        int i2 = this.f4915b;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.postScale(i / width, i2 / height);
        return Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, false);
    }

    @Override // com.gmail.heagoo.pngeditor.InterfaceC1616a
    /* JADX INFO: renamed from: a */
    public final void mo3975a(String str, Object obj) {
        if ("width".equals(str)) {
            this.f4914a = ((Integer) obj).intValue();
        } else if ("height".equals(str)) {
            this.f4915b = ((Integer) obj).intValue();
        } else if ("zooming".equals(str)) {
            this.f4916c = ((Boolean) obj).booleanValue();
        }
    }

    @Override // com.gmail.heagoo.pngeditor.InterfaceC1616a
    /* JADX INFO: renamed from: a */
    public final boolean mo3976a() {
        return this.f4917d;
    }
}
