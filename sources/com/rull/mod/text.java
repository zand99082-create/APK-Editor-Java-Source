package com.rull.mod;

import android.content.Context;
import android.graphics.Typeface;
import android.preference.PreferenceManager;
import android.util.AttributeSet;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public class text extends TextView {
    private int currentDrawable;

    public text(Context context) {
        super(context);
        rull();
    }

    public text(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        rull();
    }

    public int setResource(String str, String str2) {
        return getContext().getResources().getIdentifier(str, str2, getContext().getPackageName());
    }

    public text(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        rull();
    }

    private void rull() {
        this.currentDrawable = Integer.parseInt(PreferenceManager.getDefaultSharedPreferences(getContext()).getString("font", "0"));
        setTypeface(Typeface.createFromAsset(getContext().getAssets(), "0.ttf"));
        if (this.currentDrawable == 1) {
            setTypeface(Typeface.createFromAsset(getContext().getAssets(), "Roboto-Light.ttf"));
        }
        if (this.currentDrawable == 2) {
            setTypeface(Typeface.createFromAsset(getContext().getAssets(), "Roboto-Medium.ttf"));
        }
        if (this.currentDrawable == 3) {
            setTypeface(Typeface.createFromAsset(getContext().getAssets(), "RobotoMono.ttf"));
        }
        if (this.currentDrawable == 4) {
            setTypeface(Typeface.createFromAsset(getContext().getAssets(), "RobotoMono-Regular.ttf"));
        }
        if (this.currentDrawable == 5) {
            setTypeface(Typeface.createFromAsset(getContext().getAssets(), "Satisfy.ttf"));
        }
        if (this.currentDrawable == 6) {
            setTypeface(Typeface.createFromAsset(getContext().getAssets(), "SC_HANI(Arabic).ttf"));
        }
        if (this.currentDrawable == 7) {
            setTypeface(Typeface.createFromAsset(getContext().getAssets(), "SC_REHAN(Arabic).ttf"));
        }
        if (this.currentDrawable == 8) {
            setTypeface(Typeface.createFromAsset(getContext().getAssets(), "Slate_OnePlus.ttf"));
        }
        if (this.currentDrawable == 9) {
            setTypeface(Typeface.createFromAsset(getContext().getAssets(), "Slate_OnePlus-Bold.ttf"));
        }
        if (this.currentDrawable == 10) {
            setTypeface(Typeface.createFromAsset(getContext().getAssets(), "Smoolthan-Thin.ttf"));
        }
        if (this.currentDrawable == 11) {
            setTypeface(Typeface.createFromAsset(getContext().getAssets(), "SourceSansPro.ttf"));
        }
        if (this.currentDrawable == 12) {
            setTypeface(Typeface.createFromAsset(getContext().getAssets(), "SourceSansPro-Bold.ttf"));
        }
        if (this.currentDrawable == 13) {
            setTypeface(Typeface.createFromAsset(getContext().getAssets(), "Transformers.ttf"));
        }
        if (this.currentDrawable == 14) {
            setTypeface(Typeface.createFromAsset(getContext().getAssets(), "MontserratSans.otf"));
        }
        if (this.currentDrawable == 15) {
            setTypeface(Typeface.createFromAsset(getContext().getAssets(), "Motken_noqta_ii(Arabic).ttf"));
        }
        if (this.currentDrawable == 16) {
            setTypeface(Typeface.createFromAsset(getContext().getAssets(), "Motla_bold(Arabic).ttf"));
        }
        if (this.currentDrawable == 17) {
            setTypeface(Typeface.createFromAsset(getContext().getAssets(), "Nekar(Arabic).ttf"));
        }
        if (this.currentDrawable == 18) {
            setTypeface(Typeface.createFromAsset(getContext().getAssets(), "Norican.ttf"));
        }
        if (this.currentDrawable == 19) {
            setTypeface(Typeface.createFromAsset(getContext().getAssets(), "Norican-Regular.ttf"));
        }
        if (this.currentDrawable == 20) {
            setTypeface(Typeface.createFromAsset(getContext().getAssets(), "Oswald-Heavy.ttf"));
        }
        if (this.currentDrawable == 21) {
            setTypeface(Typeface.createFromAsset(getContext().getAssets(), "Pacifico.ttf"));
        }
        if (this.currentDrawable == 22) {
            setTypeface(Typeface.createFromAsset(getContext().getAssets(), "Passing_Notes.ttf"));
        }
        if (this.currentDrawable == 23) {
            setTypeface(Typeface.createFromAsset(getContext().getAssets(), "bBalikAwan.ttf"));
        }
        if (this.currentDrawable == 24) {
            setTypeface(Typeface.createFromAsset(getContext().getAssets(), "bBangkitkanBangsa.ttf"));
        }
        if (this.currentDrawable == 25) {
            setTypeface(Typeface.createFromAsset(getContext().getAssets(), "bBebaskan.ttf"));
        }
        if (this.currentDrawable == 26) {
            setTypeface(Typeface.createFromAsset(getContext().getAssets(), "bBerantas.ttf"));
        }
        if (this.currentDrawable == 27) {
            setTypeface(Typeface.createFromAsset(getContext().getAssets(), "bBeshary.ttf"));
        }
        if (this.currentDrawable == 28) {
            setTypeface(Typeface.createFromAsset(getContext().getAssets(), "FPTypewriterDEMO-LightItalic.otf"));
        }
        if (this.currentDrawable == 29) {
            setTypeface(Typeface.createFromAsset(getContext().getAssets(), "HelloWorld.otf"));
        }
        if (this.currentDrawable == 30) {
            setTypeface(Typeface.createFromAsset(getContext().getAssets(), "Larman.ttf"));
        }
    }
}
