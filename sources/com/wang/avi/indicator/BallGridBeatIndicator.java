package com.wang.avi.indicator;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class BallGridBeatIndicator extends BaseIndicatorController {
    public static final int ALPHA = 255;
    int[] alphas = {255, 255, 255, 255, 255, 255, 255, 255, 255};

    @Override // com.wang.avi.indicator.BaseIndicatorController
    public void draw(Canvas canvas, Paint paint) {
        float f = 4;
        float width = (getWidth() - (f * 4)) / 6;
        float width2 = (getWidth() / 2) - ((width * 2) + f);
        float width3 = (getWidth() / 2) - ((width * 2) + f);
        for (int i = 0; i < 3; i++) {
            for (int i2 = 0; i2 < 3; i2++) {
                canvas.save();
                canvas.translate(width2 + (width * 2 * i2) + (f * i2), width3 + (width * 2 * i) + (f * i));
                paint.setAlpha(this.alphas[(3 * i) + i2]);
                canvas.drawCircle(0, 0, width, paint);
                canvas.restore();
            }
        }
    }

    @Override // com.wang.avi.indicator.BaseIndicatorController
    public List<Animator> createAnimation() {
        ArrayList arrayList = new ArrayList();
        int[] iArr = {960, 930, 1190, 1130, 1340, 940, 1200, 820, 1190};
        int[] iArr2 = {360, 400, 680, 410, 710, -150, -120, 10, 320};
        for (int i = 0; i < 9; i++) {
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(255, 168, 255);
            valueAnimatorOfInt.setDuration(iArr[i]);
            valueAnimatorOfInt.setRepeatCount(-1);
            valueAnimatorOfInt.setStartDelay(iArr2[i]);
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this, i) { // from class: com.wang.avi.indicator.BallGridBeatIndicator.100000000
                private final BallGridBeatIndicator this$0;
                private final int val$index;

                {
                    this.this$0 = this;
                    this.val$index = i;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.this$0.alphas[this.val$index] = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    this.this$0.postInvalidate();
                }
            });
            valueAnimatorOfInt.start();
            arrayList.add(valueAnimatorOfInt);
        }
        return arrayList;
    }
}
