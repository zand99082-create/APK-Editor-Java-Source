package com.wang.avi.indicator;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class BallClipRotatePulseIndicator extends BaseIndicatorController {
    float degrees;
    float scaleFloat1;
    float scaleFloat2;

    @Override // com.wang.avi.indicator.BaseIndicatorController
    public void draw(Canvas canvas, Paint paint) {
        float f = 12;
        float width = getWidth() / 2;
        float height = getHeight() / 2;
        canvas.save();
        canvas.translate(width, height);
        canvas.scale(this.scaleFloat1, this.scaleFloat1);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawCircle(0, 0, width / 2.5f, paint);
        canvas.restore();
        canvas.translate(width, height);
        canvas.scale(this.scaleFloat2, this.scaleFloat2);
        canvas.rotate(this.degrees);
        paint.setStrokeWidth(3);
        paint.setStyle(Paint.Style.STROKE);
        float[] fArr = {225, 45};
        for (int i = 0; i < 2; i++) {
            canvas.drawArc(new RectF((-width) + f, (-height) + f, width - f, height - f), fArr[i], 90, false, paint);
        }
    }

    @Override // com.wang.avi.indicator.BaseIndicatorController
    public List<Animator> createAnimation() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1, 0.3f, 1);
        valueAnimatorOfFloat.setDuration(1000);
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: com.wang.avi.indicator.BallClipRotatePulseIndicator.100000000
            private final BallClipRotatePulseIndicator this$0;

            {
                this.this$0 = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.this$0.scaleFloat1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.this$0.postInvalidate();
            }
        });
        valueAnimatorOfFloat.start();
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1, 0.6f, 1);
        valueAnimatorOfFloat2.setDuration(1000);
        valueAnimatorOfFloat2.setRepeatCount(-1);
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: com.wang.avi.indicator.BallClipRotatePulseIndicator.100000001
            private final BallClipRotatePulseIndicator this$0;

            {
                this.this$0 = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.this$0.scaleFloat2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.this$0.postInvalidate();
            }
        });
        valueAnimatorOfFloat2.start();
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0, 180, 360);
        valueAnimatorOfFloat3.setDuration(1000);
        valueAnimatorOfFloat3.setRepeatCount(-1);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: com.wang.avi.indicator.BallClipRotatePulseIndicator.100000002
            private final BallClipRotatePulseIndicator this$0;

            {
                this.this$0 = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.this$0.degrees = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.this$0.postInvalidate();
            }
        });
        valueAnimatorOfFloat3.start();
        ArrayList arrayList = new ArrayList();
        arrayList.add(valueAnimatorOfFloat);
        arrayList.add(valueAnimatorOfFloat2);
        arrayList.add(valueAnimatorOfFloat3);
        return arrayList;
    }
}
