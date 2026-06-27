package com.wang.avi.indicator;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class BallRotateIndicator extends BaseIndicatorController {
    float scaleFloat = 0.5f;

    @Override // com.wang.avi.indicator.BaseIndicatorController
    public void draw(Canvas canvas, Paint paint) {
        float width = getWidth() / 10;
        float width2 = getWidth() / 2;
        float height = getHeight() / 2;
        canvas.save();
        canvas.translate((width2 - (width * 2)) - width, height);
        canvas.scale(this.scaleFloat, this.scaleFloat);
        canvas.drawCircle(0, 0, width, paint);
        canvas.restore();
        canvas.save();
        canvas.translate(width2, height);
        canvas.scale(this.scaleFloat, this.scaleFloat);
        canvas.drawCircle(0, 0, width, paint);
        canvas.restore();
        canvas.save();
        canvas.translate(width2 + (width * 2) + width, height);
        canvas.scale(this.scaleFloat, this.scaleFloat);
        canvas.drawCircle(0, 0, width, paint);
        canvas.restore();
    }

    @Override // com.wang.avi.indicator.BaseIndicatorController
    public List<Animator> createAnimation() {
        ArrayList arrayList = new ArrayList();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.5f, 1, 0.5f);
        valueAnimatorOfFloat.setDuration(1000);
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: com.wang.avi.indicator.BallRotateIndicator.100000000
            private final BallRotateIndicator this$0;

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
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(getTarget(), "rotation", 0, 180, 360);
        objectAnimatorOfFloat.setDuration(1000);
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.start();
        arrayList.add(valueAnimatorOfFloat);
        arrayList.add(objectAnimatorOfFloat);
        return arrayList;
    }
}
