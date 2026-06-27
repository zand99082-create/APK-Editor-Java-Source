package ru.maximoff.apkeditor.translate;

import android.view.View;
import android.widget.ImageView;

/* JADX INFO: renamed from: ru.maximoff.apkeditor.translate.m */
/* JADX INFO: loaded from: classes.dex */
class ViewOnClickListenerC1972m implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    private final TranslateActivity f5355a;

    ViewOnClickListenerC1972m(TranslateActivity translateActivity) {
        this.f5355a = translateActivity;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.f5355a.m4324a((ImageView) view);
    }
}
