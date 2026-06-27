package com.wang.avi.indicator;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class BallPulseSyncIndicator extends BaseIndicatorController {
    float[] translateYFloats = new float[3];

    @Override // com.wang.avi.indicator.BaseIndicatorController
    public void draw(Canvas canvas, Paint paint) {
        float f = 4;
        float width = (getWidth() - (f * 2)) / 6;
        float width2 = (getWidth() / 2) - ((width * 2) + f);
        for (int i = 0; i < 3; i++) {
            canvas.save();
            canvas.translate(width2 + (width * 2 * i) + (f * i), this.translateYFloats[i]);
            canvas.drawCircle(0, 0, width, paint);
            canvas.restore();
        }
    }

    @Override // com.wang.avi.indicator.BaseIndicatorController
    public List<Animator> createAnimation() {
        ArrayList arrayList = new ArrayList();
        float width = (getWidth() - (4 * 2)) / 6;
        int[] iArr = {70, 140, 210};
        for (int i = 0; i < 3; i++) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(getHeight() / 2, (getHeight() / 2) - (width * 2), getHeight() / 2);
            valueAnimatorOfFloat.setDuration(600);
            valueAnimatorOfFloat.setRepeatCount(-1);
            valueAnimatorOfFloat.setStartDelay(iArr[i]);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this, i) { // from class: com.wang.avi.indicator.BallPulseSyncIndicator.100000000
                private final BallPulseSyncIndicator this$0;
                private final int val$index;

                {
                    this.this$0 = this;
                    this.val$index = i;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.this$0.translateYFloats[this.val$index] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    this.this$0.postInvalidate();
                }
            });
            valueAnimatorOfFloat.start();
            arrayList.add(valueAnimatorOfFloat);
        }
        return arrayList;
    }
}
