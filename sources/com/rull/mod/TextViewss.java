package com.rull.mod;

import android.content.Context;
import android.graphics.Typeface;
import android.preference.PreferenceManager;
import android.util.AttributeSet;
import hito.animasi.rainbow.text.RainbowText;
import org.apache.commons.lang3.builder.Builder;

/* JADX INFO: loaded from: classes.dex */
public class TextViewss extends RainbowText {
    private int mBehindWaveColor;
    private int mFrontWaveColor;
    Builder rullm;
    String str;
    private boolean view;
    private int warna;

    public TextViewss(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        rullhidetext();
        setTypeface(Typeface.DEFAULT_BOLD);
    }

    public int setResource(String str, String str2) {
        return getContext().getResources().getIdentifier(str, str2, getContext().getPackageName());
    }

    public void rullhidetext() {
        this.view = PreferenceManager.getDefaultSharedPreferences(getContext()).getBoolean("hide_textview", true);
        if (!this.view) {
            setVisibility(0);
        } else {
            setVisibility(4);
        }
    }
}
