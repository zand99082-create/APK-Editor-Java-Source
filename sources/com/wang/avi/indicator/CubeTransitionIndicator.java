package com.wang.avi.indicator;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class CubeTransitionIndicator extends BaseIndicatorController {
    float degrees;
    float[] translateX = new float[2];
    float[] translateY = new float[2];
    float scaleFloat = 1.0f;

    @Override // com.wang.avi.indicator.BaseIndicatorController
    public void draw(Canvas canvas, Paint paint) {
        float width = getWidth() / 5;
        float height = getHeight() / 5;
        for (int i = 0; i < 2; i++) {
            canvas.save();
            canvas.translate(this.translateX[i], this.translateY[i]);
            canvas.rotate(this.degrees);
            canvas.scale(this.scaleFloat, this.scaleFloat);
            canvas.drawRect(new RectF((-width) / 2, (-height) / 2, width / 2, height / 2), paint);
            canvas.restore();
        }
    }

    @Override // com.wang.avi.indicator.BaseIndicatorController
    public List<Animator> createAnimation() {
        ArrayList arrayList = new ArrayList();
        float width = getWidth() / 5;
        float height = getHeight() / 5;
        for (int i = 0; i < 2; i++) {
            int i2 = i;
            this.translateX[i2] = width;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(width, getWidth() - width, getWidth() - width, width, width);
            if (i == 1) {
                valueAnimatorOfFloat = ValueAnimator.ofFloat(getWidth() - width, width, width, getWidth() - width, getWidth() - width);
            }
            valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
            valueAnimatorOfFloat.setDuration(1600);
            valueAnimatorOfFloat.setRepeatCount(-1);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this, i2) { // from class: com.wang.avi.indicator.CubeTransitionIndicator.100000000
                private final CubeTransitionIndicator this$0;
                private final int val$index;

                {
                    this.this$0 = this;
                    this.val$index = i2;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.this$0.translateX[this.val$index] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    this.this$0.postInvalidate();
                }
            });
            valueAnimatorOfFloat.start();
            this.translateY[i2] = height;
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(height, height, getHeight() - height, getHeight() - height, height);
            if (i == 1) {
                valueAnimatorOfFloat2 = ValueAnimator.ofFloat(getHeight() - height, getHeight() - height, height, height, getHeight() - height);
            }
            valueAnimatorOfFloat2.setDuration(1600);
            valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
            valueAnimatorOfFloat2.setRepeatCount(-1);
            valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this, i2) { // from class: com.wang.avi.indicator.CubeTransitionIndicator.100000001
                private final CubeTransitionIndicator this$0;
                private final int val$index;

                {
                    this.this$0 = this;
                    this.val$index = i2;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.this$0.translateY[this.val$index] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    this.this$0.postInvalidate();
                }
            });
            valueAnimatorOfFloat2.start();
            arrayList.add(valueAnimatorOfFloat);
            arrayList.add(valueAnimatorOfFloat2);
        }
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1, 0.5f, 1, 0.5f, 1);
        valueAnimatorOfFloat3.setDuration(1600);
        valueAnimatorOfFloat3.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat3.setRepeatCount(-1);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: com.wang.avi.indicator.CubeTransitionIndicator.100000002
            private final CubeTransitionIndicator this$0;

            {
                this.this$0 = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.this$0.scaleFloat = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.this$0.postInvalidate();
            }
        });
        valueAnimatorOfFloat3.start();
        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(0, 180, 360, 540.0f, 720);
        valueAnimatorOfFloat4.setDuration(1600);
        valueAnimatorOfFloat4.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat4.setRepeatCount(-1);
        valueAnimatorOfFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: com.wang.avi.indicator.CubeTransitionIndicator.100000003
            private final CubeTransitionIndicator this$0;

            {
                this.this$0 = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.this$0.degrees = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.this$0.postInvalidate();
            }
        });
        valueAnimatorOfFloat4.start();
        arrayList.add(valueAnimatorOfFloat3);
        arrayList.add(valueAnimatorOfFloat4);
        return arrayList;
    }
}
