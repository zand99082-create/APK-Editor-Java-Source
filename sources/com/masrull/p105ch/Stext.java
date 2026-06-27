package com.masrull.p105ch;

import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;
import com.gmail.heagoo.apkeditor.gzd;

/* JADX INFO: loaded from: classes.dex */
public class Stext extends TextView {
    TextView profilequotes;
    String quotes;

    public Stext(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.profilequotes = (TextView) findViewById(setResource("Mstatus", gzd.COLUMN_ID));
        this.profilequotes.setTypeface(Typeface.DEFAULT);
        this.quotes = context.getSharedPreferences("EvoPrefsFile", 0).getString("profileQuotes", "APK Editor GM Modded BY GMods");
        this.profilequotes.setText(this.quotes);
        context.registerReceiver(new Stxt(this, context), new IntentFilter("com.masrull.ch.CHANGE_PROFILE_STATUS"));
    }

    public int setResource(String str, String str2) {
        return getContext().getResources().getIdentifier(str, str2, getContext().getPackageName());
    }
}
