package com.masrull.listview.effects;

import android.view.View;
import android.view.ViewPropertyAnimator;
import com.masrull.listview.JazzyEffect;

/* JADX INFO: loaded from: classes.dex */
public class GrowEffect implements JazzyEffect {
    private static final float INITIAL_SCALE_FACTOR = 0.01f;

    @Override // com.masrull.listview.JazzyEffect
    public void initView(View view, int i, int i2) {
        view.setPivotX(view.getWidth() / 2);
        view.setPivotY(view.getHeight() / 2);
        view.setScaleX(INITIAL_SCALE_FACTOR);
        view.setScaleY(INITIAL_SCALE_FACTOR);
    }

    @Override // com.masrull.listview.JazzyEffect
    public void setupAnimation(View view, int i, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        viewPropertyAnimator.scaleX(1.0f).scaleY(1.0f);
    }
}
