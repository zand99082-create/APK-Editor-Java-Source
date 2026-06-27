package com.masrull.listview.effects;

import android.view.View;
import android.view.ViewPropertyAnimator;
import com.masrull.listview.JazzyEffect;

/* JADX INFO: loaded from: classes.dex */
public class TwirlEffect implements JazzyEffect {
    private static final int INITIAL_ROTATION_X = 80;
    private static final int INITIAL_ROTATION_Y = 70;
    private static final int INITIAL_ROTATION_Z = 10;

    @Override // com.masrull.listview.JazzyEffect
    public void initView(View view, int i, int i2) {
        view.setPivotX(view.getWidth() / 2);
        view.setPivotY(view.getWidth() / 2);
        view.setRotationX(80.0f);
        view.setRotationY(i2 * 70);
        view.setRotation(10.0f);
    }

    @Override // com.masrull.listview.JazzyEffect
    public void setupAnimation(View view, int i, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        viewPropertyAnimator.rotationXBy(-80.0f).rotationYBy(i2 * (-70)).rotationBy(-10.0f);
    }
}
