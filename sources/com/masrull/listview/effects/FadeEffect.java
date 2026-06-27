package com.masrull.listview.effects;

import android.view.View;
import android.view.ViewPropertyAnimator;
import com.masrull.listview.JazzyEffect;

/* JADX INFO: loaded from: classes.dex */
public class FadeEffect implements JazzyEffect {
    private static final int DURATION_MULTIPLIER = 5;

    @Override // com.masrull.listview.JazzyEffect
    public void initView(View view, int i, int i2) {
        view.setAlpha(0.0f);
    }

    @Override // com.masrull.listview.JazzyEffect
    public void setupAnimation(View view, int i, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        viewPropertyAnimator.setDuration(1500).alpha(255.0f);
    }
}
