package com.rull.mod.color;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public class AlphaPatternDrawable extends Drawable {
    private Bitmap mBitmap;
    private Paint mPaint = new Paint();
    private Paint mPaintGray = new Paint();
    private Paint mPaintWhite = new Paint();
    private int mRectangleSize;
    private int numRectanglesHorizontal;
    private int numRectanglesVertical;

    public AlphaPatternDrawable(int i) {
        this.mRectangleSize = 10;
        this.mRectangleSize = i;
        this.mPaintWhite.setColor(-1);
        this.mPaintGray.setColor(-3421237);
    }

    private void generatePatternBitmap() {
        Integer num;
        Paint paint;
        Integer num2;
        if (getBounds().width() <= 0 || getBounds().height() <= 0) {
            return;
        }
        this.mBitmap = Bitmap.createBitmap(getBounds().width(), getBounds().height(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(this.mBitmap);
        Rect rect = new Rect();
        Integer num3 = new Integer(1);
        for (int i = 0; i <= this.numRectanglesVertical; i++) {
            Integer num4 = num3;
            for (int i2 = 0; i2 <= this.numRectanglesHorizontal; i2++) {
                rect.top = this.mRectangleSize * i;
                rect.left = this.mRectangleSize * i2;
                rect.bottom = rect.top + this.mRectangleSize;
                rect.right = rect.left + this.mRectangleSize;
                if (num4 != null) {
                    paint = this.mPaintWhite;
                } else {
                    paint = this.mPaintGray;
                }
                canvas.drawRect(rect, paint);
                if (num4 == null) {
                    num2 = num;
                    Integer num5 = new Integer(1);
                } else {
                    num2 = (Integer) null;
                }
                num4 = num2;
            }
            if (num3 == null) {
                num = num;
                Integer num6 = new Integer(1);
            } else {
                num = (Integer) null;
            }
            num3 = num;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        canvas.drawBitmap(this.mBitmap, (Rect) null, getBounds(), this.mPaint);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        int iHeight = rect.height();
        this.numRectanglesHorizontal = (int) Math.ceil(rect.width() / this.mRectangleSize);
        this.numRectanglesVertical = (int) Math.ceil(iHeight / this.mRectangleSize);
        generatePatternBitmap();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        throw new UnsupportedOperationException("Alpha is not supported by this drawwable.");
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        throw new UnsupportedOperationException("ColorFilter is not supported by this drawwable.");
    }
}
