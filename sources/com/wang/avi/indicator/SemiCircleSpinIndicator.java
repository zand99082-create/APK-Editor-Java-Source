package com.wang.avi.indicator;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class SemiCircleSpinIndicator extends BaseIndicatorController {
    @Override // com.wang.avi.indicator.BaseIndicatorController
    public void draw(Canvas canvas, Paint paint) {
        canvas.drawArc(new RectF(0, 0, getWidth(), getHeight()), -60, 120, false, paint);
    }

    @Override // com.wang.avi.indicator.BaseIndicatorController
    public List<Animator> createAnimation() {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(getTarget(), "rotation", 0, 180, 360);
        objectAnimatorOfFloat.setDuration(600);
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.start();
        arrayList.add(objectAnimatorOfFloat);
        return arrayList;
    }
}
