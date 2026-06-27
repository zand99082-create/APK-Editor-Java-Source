package com.masrull.listview.effects;

import android.view.View;
import android.view.ViewPropertyAnimator;
import com.masrull.listview.JazzyEffect;

/* JADX INFO: loaded from: classes.dex */
public class SlideInEffect implements JazzyEffect {
    @Override // com.masrull.listview.JazzyEffect
    public void initView(View view, int i, int i2) {
        view.setTranslationY((view.getHeight() / 2) * i2);
    }

    @Override // com.masrull.listview.JazzyEffect
    public void setupAnimation(View view, int i, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        viewPropertyAnimator.translationYBy(((-view.getHeight()) / 2) * i2);
    }
}
