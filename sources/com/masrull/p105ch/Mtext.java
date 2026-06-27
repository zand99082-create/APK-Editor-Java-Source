package com.masrull.p105ch;

import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;
import com.gmail.heagoo.apkeditor.gzd;

/* JADX INFO: loaded from: classes.dex */
public class Mtext extends TextView {
    String name;
    TextView profilename;

    public Mtext(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.profilename = (TextView) findViewById(setResource("Masrulltxt", gzd.COLUMN_ID));
        this.profilename.setTypeface(Typeface.DEFAULT);
        this.name = context.getSharedPreferences("EvoPrefsFile", 0).getString("profileName", "APK Editor Pro");
        this.profilename.setText(this.name);
        context.registerReceiver(new Mtxt(this, context), new IntentFilter("com.masrull.ch.CHANGE_PROFILE_NAME"));
    }

    public int setResource(String str, String str2) {
        return getContext().getResources().getIdentifier(str, str2, getContext().getPackageName());
    }
}
