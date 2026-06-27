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
public class PacmanIndicator extends BaseIndicatorController {
    private int alpha;
    private float degrees1;
    private float degrees2;
    private float translateX;

    @Override // com.wang.avi.indicator.BaseIndicatorController
    public void draw(Canvas canvas, Paint paint) {
        drawPacman(canvas, paint);
        drawCircle(canvas, paint);
    }

    private void drawPacman(Canvas canvas, Paint paint) {
        float width = getWidth() / 2;
        float height = getHeight() / 2;
        canvas.save();
        canvas.translate(width, height);
        canvas.rotate(this.degrees1);
        paint.setAlpha(255);
        canvas.drawArc(new RectF((-width) / 1.7f, (-height) / 1.7f, width / 1.7f, height / 1.7f), 0, 270, true, paint);
        canvas.restore();
        canvas.save();
        canvas.translate(width, height);
        canvas.rotate(this.degrees2);
        paint.setAlpha(255);
        canvas.drawArc(new RectF((-width) / 1.7f, (-height) / 1.7f, width / 1.7f, height / 1.7f), 90, 270, true, paint);
        canvas.restore();
    }

    private void drawCircle(Canvas canvas, Paint paint) {
        float width = getWidth() / 11;
        paint.setAlpha(this.alpha);
        canvas.drawCircle(this.translateX, getHeight() / 2, width, paint);
    }

    @Override // com.wang.avi.indicator.BaseIndicatorController
    public List<Animator> createAnimation() {
        ArrayList arrayList = new ArrayList();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(getWidth() - (getWidth() / 11), getWidth() / 2);
        valueAnimatorOfFloat.setDuration(650);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: com.wang.avi.indicator.PacmanIndicator.100000000
            private final PacmanIndicator this$0;

            {
                this.this$0 = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.this$0.translateX = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.this$0.postInvalidate();
            }
        });
        valueAnimatorOfFloat.start();
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(255, 122);
        valueAnimatorOfInt.setDuration(650);
        valueAnimatorOfInt.setRepeatCount(-1);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: com.wang.avi.indicator.PacmanIndicator.100000001
            private final PacmanIndicator this$0;

            {
                this.this$0 = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.this$0.alpha = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.this$0.postInvalidate();
            }
        });
        valueAnimatorOfInt.start();
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0, 45, 0);
        valueAnimatorOfFloat2.setDuration(650);
        valueAnimatorOfFloat2.setRepeatCount(-1);
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: com.wang.avi.indicator.PacmanIndicator.100000002
            private final PacmanIndicator this$0;

            {
                this.this$0 = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.this$0.degrees1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.this$0.postInvalidate();
            }
        });
        valueAnimatorOfFloat2.start();
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0, -45, 0);
        valueAnimatorOfFloat3.setDuration(650);
        valueAnimatorOfFloat3.setRepeatCount(-1);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: com.wang.avi.indicator.PacmanIndicator.100000003
            private final PacmanIndicator this$0;

            {
                this.this$0 = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.this$0.degrees2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.this$0.postInvalidate();
            }
        });
        valueAnimatorOfFloat3.start();
        arrayList.add(valueAnimatorOfFloat);
        arrayList.add(valueAnimatorOfInt);
        arrayList.add(valueAnimatorOfFloat2);
        arrayList.add(valueAnimatorOfFloat3);
        return arrayList;
    }
}
