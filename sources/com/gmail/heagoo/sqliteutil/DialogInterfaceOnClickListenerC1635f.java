package com.gmail.heagoo.sqliteutil;

import android.content.DialogInterface;
import android.widget.Toast;

/* JADX INFO: renamed from: com.gmail.heagoo.sqliteutil.f */
/* JADX INFO: loaded from: classes.dex */
final class DialogInterfaceOnClickListenerC1635f implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ SqliteRowViewActivity f4999a;

    DialogInterfaceOnClickListenerC1635f(SqliteRowViewActivity sqliteRowViewActivity) {
        this.f4999a = sqliteRowViewActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        try {
            SqliteRowViewActivity.m3979a(this.f4999a);
            this.f4999a.finish();
        } catch (Exception e) {
            Toast.makeText(this.f4999a, e.getClass().getSimpleName() + ": " + e.getMessage(), 0).show();
        }
    }
}
