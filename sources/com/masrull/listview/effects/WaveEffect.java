package com.masrull.listview.effects;

import android.view.View;
import android.view.ViewPropertyAnimator;
import com.masrull.listview.JazzyEffect;

/* JADX INFO: loaded from: classes.dex */
public class WaveEffect implements JazzyEffect {
    @Override // com.masrull.listview.JazzyEffect
    public void initView(View view, int i, int i2) {
        view.setTranslationX(-view.getWidth());
    }

    @Override // com.masrull.listview.JazzyEffect
    public void setupAnimation(View view, int i, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        viewPropertyAnimator.translationX(0.0f);
    }
}
