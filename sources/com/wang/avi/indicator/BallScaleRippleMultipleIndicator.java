package com.wang.avi.indicator;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class BallScaleRippleMultipleIndicator extends BallScaleMultipleIndicator {
    @Override // com.wang.avi.indicator.BallScaleMultipleIndicator, com.wang.avi.indicator.BaseIndicatorController
    public void draw(Canvas canvas, Paint paint) {
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(3);
        super.draw(canvas, paint);
    }

    @Override // com.wang.avi.indicator.BallScaleMultipleIndicator, com.wang.avi.indicator.BaseIndicatorController
    public List<Animator> createAnimation() {
        ArrayList arrayList = new ArrayList();
        long[] jArr = {0, 200, 400};
        for (int i = 0; i < 3; i++) {
            int i2 = i;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0, 1);
            valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
            valueAnimatorOfFloat.setDuration(1000);
            valueAnimatorOfFloat.setRepeatCount(-1);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this, i2) { // from class: com.wang.avi.indicator.BallScaleRippleMultipleIndicator.100000000
                private final BallScaleRippleMultipleIndicator this$0;
                private final int val$index;

                {
                    this.this$0 = this;
                    this.val$index = i2;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.this$0.scaleFloats[this.val$index] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    this.this$0.postInvalidate();
                }
            });
            valueAnimatorOfFloat.setStartDelay(jArr[i]);
            valueAnimatorOfFloat.start();
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 255);
            valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
            valueAnimatorOfInt.setDuration(1000);
            valueAnimatorOfInt.setRepeatCount(-1);
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this, i2) { // from class: com.wang.avi.indicator.BallScaleRippleMultipleIndicator.100000001
                private final BallScaleRippleMultipleIndicator this$0;
                private final int val$index;

                {
                    this.this$0 = this;
                    this.val$index = i2;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.this$0.alphaInts[this.val$index] = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    this.this$0.postInvalidate();
                }
            });
            valueAnimatorOfFloat.setStartDelay(jArr[i]);
            valueAnimatorOfInt.start();
            arrayList.add(valueAnimatorOfFloat);
            arrayList.add(valueAnimatorOfInt);
        }
        return arrayList;
    }
}
