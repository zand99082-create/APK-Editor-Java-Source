package com.masrull.p105ch;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes.dex */
class Stxt extends BroadcastReceiver {
    private final Stext this$0;
    private final Context val$context;

    Stxt(Stext stext, Context context) {
        this.this$0 = stext;
        this.val$context = context;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        this.this$0.quotes = intent.getStringExtra("QUOTES");
        this.this$0.profilequotes.setText(this.this$0.quotes);
        SharedPreferences.Editor editorEdit = this.val$context.getSharedPreferences("EvoPrefsFile", 0).edit();
        editorEdit.putString("profileQuotes", this.this$0.quotes);
        editorEdit.commit();
    }
}
