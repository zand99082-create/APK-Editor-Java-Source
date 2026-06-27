package orehito.view.page;

import android.support.v4.view.ViewPager;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class TossTransformation implements ViewPager.PageTransformer {
    public boolean isPagingEnabled() {
        return true;
    }

    @Override // android.support.v4.view.ViewPager.PageTransformer
    public void transformPage(View view, float f) {
        float f2;
        float width = 0.0f;
        if (f < 0.0f) {
            f2 = 90.0f;
        } else {
            f2 = -90.0f;
        }
        float fAbs = f2 * Math.abs(f);
        view.setAlpha((fAbs > 90.0f || fAbs < -90.0f) ? 0.0f : 1.0f);
        if (f < 0.0f) {
            width = view.getWidth();
        }
        view.setPivotX(width);
        view.setPivotY(view.getHeight() * 0.5f);
        view.setRotationY(90.0f * f);
    }
}
