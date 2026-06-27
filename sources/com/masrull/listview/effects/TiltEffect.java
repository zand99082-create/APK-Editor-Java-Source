package com.masrull.listview.effects;

import android.view.View;
import android.view.ViewPropertyAnimator;
import com.masrull.listview.JazzyEffect;

/* JADX INFO: loaded from: classes.dex */
public class TiltEffect implements JazzyEffect {
    private static final float INITIAL_SCALE_FACTOR = 0.7f;

    @Override // com.masrull.listview.JazzyEffect
    public void initView(View view, int i, int i2) {
        view.setPivotX(view.getWidth() / 2);
        view.setPivotY(view.getHeight() / 2);
        view.setScaleX(INITIAL_SCALE_FACTOR);
        view.setScaleY(INITIAL_SCALE_FACTOR);
        view.setTranslationY((view.getHeight() / 2) * i2);
        view.setAlpha(127.0f);
    }

    @Override // com.masrull.listview.JazzyEffect
    public void setupAnimation(View view, int i, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        viewPropertyAnimator.translationYBy(((-view.getHeight()) / 2) * i2).scaleX(1.0f).scaleY(1.0f).alpha(255.0f);
    }
}
