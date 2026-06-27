package com.wang.avi.indicator;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class BallPulseRiseIndicator extends BaseIndicatorController {
    @Override // com.wang.avi.indicator.BaseIndicatorController
    public void draw(Canvas canvas, Paint paint) {
        float width = getWidth() / 10;
        canvas.drawCircle(getWidth() / 4, width * 2, width, paint);
        canvas.drawCircle((getWidth() * 3) / 4, width * 2, width, paint);
        canvas.drawCircle(width, getHeight() - (2 * width), width, paint);
        canvas.drawCircle(getWidth() / 2, getHeight() - (2 * width), width, paint);
        canvas.drawCircle(getWidth() - width, getHeight() - (2 * width), width, paint);
    }

    @Override // com.wang.avi.indicator.BaseIndicatorController
    public List<Animator> createAnimation() {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(getTarget(), PropertyValuesHolder.ofFloat("rotationX", 0, 360));
        objectAnimatorOfPropertyValuesHolder.setInterpolator(new LinearInterpolator());
        objectAnimatorOfPropertyValuesHolder.setRepeatCount(-1);
        objectAnimatorOfPropertyValuesHolder.setDuration(1500);
        objectAnimatorOfPropertyValuesHolder.start();
        ArrayList arrayList = new ArrayList();
        arrayList.add(objectAnimatorOfPropertyValuesHolder);
        return arrayList;
    }
}
