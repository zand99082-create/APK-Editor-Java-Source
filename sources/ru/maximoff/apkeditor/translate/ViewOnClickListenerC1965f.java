package ru.maximoff.apkeditor.translate;

import android.view.View;
import android.widget.CheckBox;
import com.gmail.heagoo.apkeditor.pro.R;

/* JADX INFO: renamed from: ru.maximoff.apkeditor.translate.f */
/* JADX INFO: loaded from: classes.dex */
class ViewOnClickListenerC1965f implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    private final TranslateActivity f5343a;

    ViewOnClickListenerC1965f(TranslateActivity translateActivity) {
        this.f5343a = translateActivity;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        CheckBox checkBox = (CheckBox) view;
        switch (checkBox.getId()) {
            case R.array.fileTypeWebText /* 2131230739 */:
                this.f5343a.f5294c.edit().putBoolean("isDark", checkBox.isChecked()).commit();
                break;
            case R.array.fileTypeWord /* 2131230740 */:
                this.f5343a.f5294c.edit().putBoolean("isFullScreen", checkBox.isChecked()).commit();
                break;
            case R.array.appicon_value /* 2131230741 */:
                this.f5343a.f5294c.edit().putBoolean("skip_dialog", checkBox.isChecked()).commit();
                return;
        }
        this.f5343a.recreate();
    }
}
