package com.wang.avi.indicator;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class BallZigZagDeflectIndicator extends BallZigZagIndicator {
    @Override // com.wang.avi.indicator.BallZigZagIndicator, com.wang.avi.indicator.BaseIndicatorController
    public List<Animator> createAnimation() {
        ArrayList arrayList = new ArrayList();
        float width = getWidth() / 6;
        float width2 = getWidth() / 6;
        for (int i = 0; i < 2; i++) {
            int i2 = i;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(width, getWidth() - width, width, getWidth() - width, width);
            if (i == 1) {
                valueAnimatorOfFloat = ValueAnimator.ofFloat(getWidth() - width, width, getWidth() - width, width, getWidth() - width);
            }
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(width2, width2, getHeight() - width2, getHeight() - width2, width2);
            if (i == 1) {
                valueAnimatorOfFloat2 = ValueAnimator.ofFloat(getHeight() - width2, getHeight() - width2, width2, width2, getHeight() - width2);
            }
            valueAnimatorOfFloat.setDuration(2000);
            valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
            valueAnimatorOfFloat.setRepeatCount(-1);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this, i2) { // from class: com.wang.avi.indicator.BallZigZagDeflectIndicator.100000000
                private final BallZigZagDeflectIndicator this$0;
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
            valueAnimatorOfFloat2.setDuration(2000);
            valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
            valueAnimatorOfFloat2.setRepeatCount(-1);
            valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this, i2) { // from class: com.wang.avi.indicator.BallZigZagDeflectIndicator.100000001
                private final BallZigZagDeflectIndicator this$0;
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
        return arrayList;
    }
}
