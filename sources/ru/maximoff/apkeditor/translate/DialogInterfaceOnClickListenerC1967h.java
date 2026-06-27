package ru.maximoff.apkeditor.translate;

import android.content.DialogInterface;

/* JADX INFO: renamed from: ru.maximoff.apkeditor.translate.h */
/* JADX INFO: loaded from: classes.dex */
class DialogInterfaceOnClickListenerC1967h implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    private final TranslateActivity f5349a;

    DialogInterfaceOnClickListenerC1967h(TranslateActivity translateActivity) {
        this.f5349a = translateActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        this.f5349a.finish();
    }
}
