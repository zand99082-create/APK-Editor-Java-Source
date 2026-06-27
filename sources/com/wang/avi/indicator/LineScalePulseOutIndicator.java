package com.wang.avi.indicator;

import android.animation.Animator;
import android.animation.ValueAnimator;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class LineScalePulseOutIndicator extends LineScaleIndicator {
    @Override // com.wang.avi.indicator.LineScaleIndicator, com.wang.avi.indicator.BaseIndicatorController
    public List<Animator> createAnimation() {
        ArrayList arrayList = new ArrayList();
        long[] jArr = {500, 250, 0, 250, 500};
        for (int i = 0; i < 5; i++) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1, 0.3f, 1);
            valueAnimatorOfFloat.setDuration(900);
            valueAnimatorOfFloat.setRepeatCount(-1);
            valueAnimatorOfFloat.setStartDelay(jArr[i]);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this, i) { // from class: com.wang.avi.indicator.LineScalePulseOutIndicator.100000000
                private final LineScalePulseOutIndicator this$0;
                private final int val$index;

                {
                    this.this$0 = this;
                    this.val$index = i;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.this$0.scaleYFloats[this.val$index] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    this.this$0.postInvalidate();
                }
            });
            valueAnimatorOfFloat.start();
            arrayList.add(valueAnimatorOfFloat);
        }
        return arrayList;
    }
}
