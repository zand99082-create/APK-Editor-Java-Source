package com.wang.avi.indicator;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class BallClipRotateMultipleIndicator extends BaseIndicatorController {
    float degrees;
    float scaleFloat = 1;

    @Override // com.wang.avi.indicator.BaseIndicatorController
    public void draw(Canvas canvas, Paint paint) {
        paint.setStrokeWidth(3);
        paint.setStyle(Paint.Style.STROKE);
        float f = 12;
        float width = getWidth() / 2;
        float height = getHeight() / 2;
        canvas.save();
        canvas.translate(width, height);
        canvas.scale(this.scaleFloat, this.scaleFloat);
        canvas.rotate(this.degrees);
        float[] fArr = {135, -45};
        for (int i = 0; i < 2; i++) {
            canvas.drawArc(new RectF((-width) + f, (-height) + f, width - f, height - f), fArr[i], 90, false, paint);
        }
        canvas.restore();
        canvas.translate(width, height);
        canvas.scale(this.scaleFloat, this.scaleFloat);
        canvas.rotate(-this.degrees);
        float[] fArr2 = {225, 45};
        for (int i2 = 0; i2 < 2; i2++) {
            canvas.drawArc(new RectF(((-width) / 1.8f) + f, ((-height) / 1.8f) + f, (width / 1.8f) - f, (height / 1.8f) - f), fArr2[i2], 90, false, paint);
        }
    }

    @Override // com.wang.avi.indicator.BaseIndicatorController
    public List<Animator> createAnimation() {
        ArrayList arrayList = new ArrayList();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1, 0.6f, 1);
        valueAnimatorOfFloat.setDuration(1000);
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: com.wang.avi.indicator.BallClipRotateMultipleIndicator.100000000
            private final BallClipRotateMultipleIndicator this$0;

            {
                this.this$0 = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.this$0.scaleFloat = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.this$0.postInvalidate();
            }
        });
        valueAnimatorOfFloat.start();
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0, 180, 360);
        valueAnimatorOfFloat2.setDuration(1000);
        valueAnimatorOfFloat2.setRepeatCount(-1);
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: com.wang.avi.indicator.BallClipRotateMultipleIndicator.100000001
            private final BallClipRotateMultipleIndicator this$0;

            {
                this.this$0 = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.this$0.degrees = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.this$0.postInvalidate();
            }
        });
        valueAnimatorOfFloat2.start();
        arrayList.add(valueAnimatorOfFloat);
        arrayList.add(valueAnimatorOfFloat2);
        return arrayList;
    }
}
