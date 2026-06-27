package com.masrull.listview.effects;

import android.view.View;
import android.view.ViewPropertyAnimator;
import com.masrull.listview.JazzyEffect;

/* JADX INFO: loaded from: classes.dex */
public class CurlEffect implements JazzyEffect {
    private static final int INITIAL_ROTATION_ANGLE = 90;

    @Override // com.masrull.listview.JazzyEffect
    public void initView(View view, int i, int i2) {
        view.setPivotX(0.0f);
        view.setPivotY(view.getHeight() / 2);
        view.setRotationY(90.0f);
    }

    @Override // com.masrull.listview.JazzyEffect
    public void setupAnimation(View view, int i, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        viewPropertyAnimator.rotationYBy(-90.0f);
    }
}
