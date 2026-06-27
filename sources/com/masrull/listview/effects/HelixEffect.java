package com.masrull.listview.effects;

import android.view.View;
import android.view.ViewPropertyAnimator;
import com.masrull.listview.JazzyEffect;

/* JADX INFO: loaded from: classes.dex */
public class HelixEffect implements JazzyEffect {
    private static final int INITIAL_ROTATION_ANGLE = 180;

    @Override // com.masrull.listview.JazzyEffect
    public void initView(View view, int i, int i2) {
        view.setRotationY(180.0f);
    }

    @Override // com.masrull.listview.JazzyEffect
    public void setupAnimation(View view, int i, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        viewPropertyAnimator.rotationYBy(i2 * INITIAL_ROTATION_ANGLE);
    }
}
