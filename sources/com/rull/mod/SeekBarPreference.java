package com.rull.mod;

import android.content.Context;
import android.content.res.TypedArray;
import android.preference.DialogPreference;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import com.gmail.heagoo.apkeditor.gzd;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class SeekBarPreference extends DialogPreference implements SeekBar.OnSeekBarChangeListener {
    public final int f1239a;
    public final int f1240b;
    public final int f1241c;
    public int f1242d;
    public TextView f1243e;

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(SeekBar seekBar) {
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1239a = 0;
        this.f1241c = this.f1239a;
        this.f1240b = 100;
    }

    public int getID(String str, String str2) {
        return getContext().getResources().getIdentifier(str, str2, getContext().getPackageName());
    }

    /* JADX INFO: renamed from: a */
    public final int m4080a(TypedArray typedArray, int i) {
        try {
            return typedArray.getInt(i, Integer.MIN_VALUE);
        } catch (NumberFormatException e) {
            return typedArray.getDimensionPixelSize(i, Integer.MIN_VALUE);
        }
    }

    @Override // android.preference.DialogPreference
    public final View onCreateDialogView() {
        this.f1242d = getPersistedInt(this.f1241c);
        View viewInflate = LayoutInflater.from(getContext()).inflate(getID("dialog_slider", "layout"), (ViewGroup) null, false);
        Locale locale = Locale.ENGLISH;
        ((TextView) viewInflate.findViewById(getID("min_value", gzd.COLUMN_ID))).setText(String.format(locale, "%d", Integer.valueOf(this.f1239a)));
        ((TextView) viewInflate.findViewById(getID("max_value", gzd.COLUMN_ID))).setText(String.format(locale, "%d", Integer.valueOf(this.f1240b)));
        SeekBar seekBar = (SeekBar) viewInflate.findViewById(getID("seek_bar", gzd.COLUMN_ID));
        seekBar.setMax(this.f1240b - this.f1239a);
        seekBar.setProgress(this.f1242d - this.f1239a);
        seekBar.setOnSeekBarChangeListener(this);
        TextView textView = (TextView) viewInflate.findViewById(getID("current_value", gzd.COLUMN_ID));
        this.f1243e = textView;
        textView.setText(String.format(locale, "%d", Integer.valueOf(this.f1242d)));
        return viewInflate;
    }

    @Override // android.preference.DialogPreference
    public final void onDialogClosed(boolean z) {
        super.onDialogClosed(z);
        if (z) {
            if (shouldPersist()) {
                persistInt(this.f1242d);
            }
            notifyChanged();
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        int i2 = i + this.f1239a;
        this.f1242d = i2;
        this.f1243e.setText(String.format(Locale.ENGLISH, "%d", Integer.valueOf(i2)));
    }
}
