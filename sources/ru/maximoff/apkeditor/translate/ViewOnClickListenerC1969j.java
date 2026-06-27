package ru.maximoff.apkeditor.translate;

import android.view.View;

/* JADX INFO: renamed from: ru.maximoff.apkeditor.translate.j */
/* JADX INFO: loaded from: classes.dex */
class ViewOnClickListenerC1969j implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    private final DialogInterfaceOnShowListenerC1968i f5352a;

    ViewOnClickListenerC1969j(DialogInterfaceOnShowListenerC1968i dialogInterfaceOnShowListenerC1968i) {
        this.f5352a = dialogInterfaceOnShowListenerC1968i;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        DialogInterfaceOnShowListenerC1968i.m4378a(this.f5352a).m4341c();
    }
}
