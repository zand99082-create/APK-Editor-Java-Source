package com.masrull.p105ch;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes.dex */
class Mtxt extends BroadcastReceiver {
    private final Mtext this$0;
    private final Context val$context;

    Mtxt(Mtext mtext, Context context) {
        this.this$0 = mtext;
        this.val$context = context;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        this.this$0.name = intent.getStringExtra("NAME");
        this.this$0.profilename.setText(this.this$0.name);
        SharedPreferences.Editor editorEdit = this.val$context.getSharedPreferences("EvoPrefsFile", 0).edit();
        editorEdit.putString("profileName", this.this$0.name);
        editorEdit.commit();
    }
}
