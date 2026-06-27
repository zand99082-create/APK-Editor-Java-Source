package com.rull.mod;

import android.content.Context;
import android.preference.PreferenceManager;
import android.util.AttributeSet;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public class BackgroundView extends ImageView {
    private int currentDrawable;
    private boolean mView;
    private boolean view;

    public BackgroundView(Context context) {
        super(context);
        this.mView = false;
        setimageview();
    }

    private String getPackageName() {
        return (String) null;
    }

    public BackgroundView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mView = false;
        setimageview();
    }

    public int setResource(String str, String str2) {
        return getResources().getIdentifier(str, str2, getPackageName());
    }

    public BackgroundView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mView = false;
        setimageview();
    }

    private void setImage() {
        this.currentDrawable = Integer.parseInt(PreferenceManager.getDefaultSharedPreferences(getContext()).getString("mod_key_corner", "1"));
        setImageDrawable(getResources().getDrawable(Masrull("corner6", "drawable")));
        if (this.currentDrawable == 1) {
            setBackground(getResources().getDrawable(Masrull("corner1", "drawable")));
        }
        if (this.currentDrawable == 2) {
            setBackground(getResources().getDrawable(Masrull("corner2", "drawable")));
        }
        if (this.currentDrawable == 3) {
            setBackground(getResources().getDrawable(Masrull("corner3", "drawable")));
        }
        if (this.currentDrawable == 4) {
            setBackground(getResources().getDrawable(Masrull("corner4", "drawable")));
        }
        if (this.currentDrawable == 5) {
            setBackground(getResources().getDrawable(Masrull("corner5", "drawable")));
        }
        if (this.currentDrawable == 6) {
            setBackground(getResources().getDrawable(Masrull("corner7", "drawable")));
        }
        if (this.currentDrawable == 7) {
            setBackground(getResources().getDrawable(Masrull("wp1", "drawable")));
        }
        if (this.currentDrawable == 8) {
            setBackground(getResources().getDrawable(Masrull("wp2", "drawable")));
        }
        int i = this.currentDrawable;
    }

    public int Masrull(String str, String str2) {
        return getContext().getResources().getIdentifier(str, str2, getContext().getPackageName());
    }

    public void setimageview() {
        this.view = PreferenceManager.getDefaultSharedPreferences(getContext()).getBoolean("test", true);
        setImage();
        if (!this.view) {
            setVisibility(4);
        } else {
            setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: com.rull.mod.BackgroundView$100000000, reason: invalid class name */
    class AnonymousClass100000000 implements Runnable {
        private final BackgroundView this$0;

        AnonymousClass100000000(BackgroundView backgroundView) {
            this.this$0 = backgroundView;
        }

        @Override // java.lang.Runnable
        public void run() {
            BackgroundView.access$S1000004(this.this$0, PreferenceManager.getDefaultSharedPreferences(this.this$0.getContext()).getBoolean("background_view", true));
            if (!BackgroundView.access$L1000004(this.this$0)) {
                this.this$0.setShowWave(false);
            } else {
                this.this$0.setShowWave(true);
            }
        }
    }
}
