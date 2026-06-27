package ru.maximoff.apkeditor.translate;

import android.app.AlertDialog;
import android.content.DialogInterface;

/* JADX INFO: renamed from: ru.maximoff.apkeditor.translate.i */
/* JADX INFO: loaded from: classes.dex */
class DialogInterfaceOnShowListenerC1968i implements DialogInterface.OnShowListener {

    /* JADX INFO: renamed from: a */
    private final TranslateActivity f5350a;

    /* JADX INFO: renamed from: b */
    private final AlertDialog f5351b;

    DialogInterfaceOnShowListenerC1968i(TranslateActivity translateActivity, AlertDialog alertDialog) {
        this.f5350a = translateActivity;
        this.f5351b = alertDialog;
    }

    /* JADX INFO: renamed from: a */
    static TranslateActivity m4378a(DialogInterfaceOnShowListenerC1968i dialogInterfaceOnShowListenerC1968i) {
        return dialogInterfaceOnShowListenerC1968i.f5350a;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public void onShow(DialogInterface dialogInterface) {
        this.f5351b.getButton(-3).setOnClickListener(new ViewOnClickListenerC1969j(this));
    }
}
