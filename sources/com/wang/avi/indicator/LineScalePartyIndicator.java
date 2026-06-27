package com.wang.avi.indicator;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.v4.view.PointerIconCompat;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class LineScalePartyIndicator extends BaseIndicatorController {
    public static final float SCALE = 1.0f;
    float[] scaleFloats = {1.0f, 1.0f, 1.0f, 1.0f, 1.0f};

    @Override // com.wang.avi.indicator.BaseIndicatorController
    public void draw(Canvas canvas, Paint paint) {
        float width = getWidth() / 9;
        float height = getHeight() / 2;
        for (int i = 0; i < 4; i++) {
            canvas.save();
            canvas.translate(((2 + (i * 2)) * width) - (width / 2), height);
            canvas.scale(this.scaleFloats[i], this.scaleFloats[i]);
            canvas.drawRoundRect(new RectF((-width) / 2, (-getHeight()) / 2.5f, width / 2, getHeight() / 2.5f), 5, 5, paint);
            canvas.restore();
        }
    }

    @Override // com.wang.avi.indicator.BaseIndicatorController
    public List<Animator> createAnimation() {
        ArrayList arrayList = new ArrayList();
        long[] jArr = {1260, 430, PointerIconCompat.TYPE_ALIAS, 730};
        long[] jArr2 = {770, 290, 280, 740};
        for (int i = 0; i < 4; i++) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1, 0.4f, 1);
            valueAnimatorOfFloat.setDuration(jArr[i]);
            valueAnimatorOfFloat.setRepeatCount(-1);
            valueAnimatorOfFloat.setStartDelay(jArr2[i]);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this, i) { // from class: com.wang.avi.indicator.LineScalePartyIndicator.100000000
                private final LineScalePartyIndicator this$0;
                private final int val$index;

                {
                    this.this$0 = this;
                    this.val$index = i;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.this$0.scaleFloats[this.val$index] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    this.this$0.postInvalidate();
                }
            });
            valueAnimatorOfFloat.start();
            arrayList.add(valueAnimatorOfFloat);
        }
        return arrayList;
    }
}
