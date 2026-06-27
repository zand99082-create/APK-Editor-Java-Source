package com.gmail.heagoo.apkeditor.p098se;

import android.support.v4.view.ViewPager;
import android.view.animation.TranslateAnimation;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.se.q */
/* JADX INFO: loaded from: classes.dex */
public final class C1444q implements ViewPager.OnPageChangeListener {

    /* JADX INFO: renamed from: a */
    private int f4248a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ SimpleEditActivity f4249b;

    public C1444q(SimpleEditActivity simpleEditActivity) {
        this.f4249b = simpleEditActivity;
        this.f4248a = this.f4249b.f4195o / 3;
    }

    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
    public final void onPageScrolled(int i, float f, int i2) {
    }

    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
    public final void onPageSelected(int i) {
        TranslateAnimation translateAnimation = new TranslateAnimation(this.f4248a * this.f4249b.f4194n, this.f4248a * i, 0.0f, 0.0f);
        this.f4249b.f4194n = i;
        translateAnimation.setFillAfter(true);
        translateAnimation.setDuration(200L);
        SimpleEditActivity.m3514f(this.f4249b);
    }
}
