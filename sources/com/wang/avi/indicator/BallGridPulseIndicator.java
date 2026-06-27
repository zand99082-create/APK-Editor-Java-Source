package com.wang.avi.indicator;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.v4.view.PointerIconCompat;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class BallGridPulseIndicator extends BaseIndicatorController {
    public static final int ALPHA = 255;
    public static final float SCALE = 1.0f;
    int[] alphas = {255, 255, 255, 255, 255, 255, 255, 255, 255};
    float[] scaleFloats = {1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f};

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
                canvas.scale(this.scaleFloats[(3 * i) + i2], this.scaleFloats[(3 * i) + i2]);
                paint.setAlpha(this.alphas[(3 * i) + i2]);
                canvas.drawCircle(0, 0, width, paint);
                canvas.restore();
            }
        }
    }

    @Override // com.wang.avi.indicator.BaseIndicatorController
    public List<Animator> createAnimation() {
        ArrayList arrayList = new ArrayList();
        int[] iArr = {720, PointerIconCompat.TYPE_GRAB, 1280, 1420, 1450, 1180, 870, 1450, 1060};
        int[] iArr2 = {-60, 250, -170, 480, 310, 30, 460, 780, 450};
        for (int i = 0; i < 9; i++) {
            int i2 = i;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1, 0.5f, 1);
            valueAnimatorOfFloat.setDuration(iArr[i]);
            valueAnimatorOfFloat.setRepeatCount(-1);
            valueAnimatorOfFloat.setStartDelay(iArr2[i]);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this, i2) { // from class: com.wang.avi.indicator.BallGridPulseIndicator.100000000
                private final BallGridPulseIndicator this$0;
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
            valueAnimatorOfFloat.start();
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(255, 210, 122, 255);
            valueAnimatorOfInt.setDuration(iArr[i]);
            valueAnimatorOfInt.setRepeatCount(-1);
            valueAnimatorOfInt.setStartDelay(iArr2[i]);
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this, i2) { // from class: com.wang.avi.indicator.BallGridPulseIndicator.100000001
                private final BallGridPulseIndicator this$0;
                private final int val$index;

                {
                    this.this$0 = this;
                    this.val$index = i2;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.this$0.alphas[this.val$index] = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    this.this$0.postInvalidate();
                }
            });
            valueAnimatorOfInt.start();
            arrayList.add(valueAnimatorOfFloat);
            arrayList.add(valueAnimatorOfInt);
        }
        return arrayList;
    }
}
