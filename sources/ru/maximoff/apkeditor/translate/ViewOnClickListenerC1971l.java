package ru.maximoff.apkeditor.translate;

import android.view.View;
import android.widget.EditText;

/* JADX INFO: renamed from: ru.maximoff.apkeditor.translate.l */
/* JADX INFO: loaded from: classes.dex */
class ViewOnClickListenerC1971l implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    private final TranslateActivity f5354a;

    ViewOnClickListenerC1971l(TranslateActivity translateActivity) {
        this.f5354a = translateActivity;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getTag() instanceof EditText) {
            EditText editText = (EditText) view.getTag();
            editText.setText("");
            editText.requestFocus();
        }
    }
}
