package com.masrull.listview.effects;

import android.view.View;
import android.view.ViewPropertyAnimator;
import com.masrull.listview.JazzyEffect;

/* JADX INFO: loaded from: classes.dex */
public class ZipperEffect implements JazzyEffect {
    @Override // com.masrull.listview.JazzyEffect
    public void initView(View view, int i, int i2) {
        int i3 = 1;
        if (i % 2 == 0) {
            i3 = -1;
        }
        view.setTranslationX(i3 * view.getWidth());
    }

    @Override // com.masrull.listview.JazzyEffect
    public void setupAnimation(View view, int i, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        viewPropertyAnimator.translationX(0.0f);
    }
}
