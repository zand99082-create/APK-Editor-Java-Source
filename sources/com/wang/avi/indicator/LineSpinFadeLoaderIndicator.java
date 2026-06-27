package com.wang.avi.indicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.wang.avi.indicator.BallSpinFadeLoaderIndicator;

/* JADX INFO: loaded from: classes.dex */
public class LineSpinFadeLoaderIndicator extends BallSpinFadeLoaderIndicator {
    @Override // com.wang.avi.indicator.BallSpinFadeLoaderIndicator, com.wang.avi.indicator.BaseIndicatorController
    public void draw(Canvas canvas, Paint paint) {
        float width = getWidth() / 10;
        for (int i = 0; i < 8; i++) {
            canvas.save();
            BallSpinFadeLoaderIndicator.Point pointCircleAt = circleAt(getWidth(), getHeight(), (getWidth() / 2.5f) - width, ((double) i) * 0.7853981633974483d);
            canvas.translate(pointCircleAt.f5128x, pointCircleAt.f5129y);
            canvas.scale(this.scaleFloats[i], this.scaleFloats[i]);
            canvas.rotate(i * 45);
            paint.setAlpha(this.alphas[i]);
            canvas.drawRoundRect(new RectF(-width, (-width) / 1.5f, 1.5f * width, width / 1.5f), 5, 5, paint);
            canvas.restore();
        }
    }
}
