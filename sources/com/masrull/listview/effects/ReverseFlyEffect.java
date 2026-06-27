package com.masrull.listview.effects;

import android.view.View;
import android.view.ViewPropertyAnimator;
import com.masrull.listview.JazzyEffect;

/* JADX INFO: loaded from: classes.dex */
public class ReverseFlyEffect implements JazzyEffect {
    private static final int INITIAL_ROTATION_ANGLE = 135;

    @Override // com.masrull.listview.JazzyEffect
    public void initView(View view, int i, int i2) {
        view.setPivotX(view.getWidth() / 2);
        view.setPivotY(view.getHeight() / 2);
        view.setRotationX(i2 * INITIAL_ROTATION_ANGLE);
        view.setTranslationY((-view.getHeight()) * 2 * i2);
    }

    @Override // com.masrull.listview.JazzyEffect
    public void setupAnimation(View view, int i, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        viewPropertyAnimator.rotationXBy(i2 * (-135)).translationYBy(view.getHeight() * 2 * i2);
    }
}
