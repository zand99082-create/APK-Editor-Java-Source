package com.wang.avi.indicator;

import android.animation.Animator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseIndicatorController {
    private List<Animator> mAnimators;
    private View mTarget;

    public abstract List<Animator> createAnimation();

    public abstract void draw(Canvas canvas, Paint paint);

    public void setTarget(View view) {
        this.mTarget = view;
    }

    public View getTarget() {
        return this.mTarget;
    }

    public int getWidth() {
        return this.mTarget.getWidth();
    }

    public int getHeight() {
        return this.mTarget.getHeight();
    }

    public void postInvalidate() {
        this.mTarget.postInvalidate();
    }

    public void initAnimation() {
        this.mAnimators = createAnimation();
    }

    public void setAnimationStatus(AnimStatus animStatus) {
        if (this.mAnimators != null) {
            int size = this.mAnimators.size();
            for (int i = 0; i < size; i++) {
                Animator animator = this.mAnimators.get(i);
                boolean zIsRunning = animator.isRunning();
                if (animStatus == AnimStatus.START) {
                    if (!zIsRunning) {
                        animator.start();
                    }
                } else if (animStatus != AnimStatus.END) {
                    if (animStatus == AnimStatus.CANCEL && zIsRunning) {
                        animator.cancel();
                    }
                } else if (zIsRunning) {
                    animator.end();
                }
            }
        }
    }

    public enum AnimStatus {
        START,
        END,
        CANCEL;

        public static AnimStatus valueOf(String str) {
            for (AnimStatus animStatus : values()) {
                if (animStatus.name().equals(str)) {
                    return animStatus;
                }
            }
            throw new IllegalArgumentException();
        }
    }
}
