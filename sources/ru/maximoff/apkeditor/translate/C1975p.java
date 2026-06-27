package ru.maximoff.apkeditor.translate;

import android.widget.EditText;
import android.widget.ImageView;
import com.gmail.heagoo.apkeditor.pro.R;

/* JADX INFO: renamed from: ru.maximoff.apkeditor.translate.p */
/* JADX INFO: loaded from: classes.dex */
class C1975p implements InterfaceC1963d {

    /* JADX INFO: renamed from: a */
    private final TranslateActivity f5359a;

    /* JADX INFO: renamed from: b */
    private final EditText f5360b;

    /* JADX INFO: renamed from: c */
    private final ImageView f5361c;

    C1975p(TranslateActivity translateActivity, EditText editText, ImageView imageView) {
        this.f5359a = translateActivity;
        this.f5360b = editText;
        this.f5361c = imageView;
    }

    @Override // ru.maximoff.apkeditor.translate.InterfaceC1963d
    /* JADX INFO: renamed from: a */
    public void mo4376a(String str) {
        this.f5360b.setText(this.f5359a.m4335b(str));
        this.f5360b.requestFocus();
        this.f5361c.setImageResource(R.drawable.abc_cab_background_internal_bg);
        this.f5361c.setClickable(true);
        this.f5361c.setEnabled(true);
    }

    @Override // ru.maximoff.apkeditor.translate.InterfaceC1963d
    /* JADX INFO: renamed from: b */
    public void mo4377b(String str) {
        this.f5359a.m4326a(str);
        this.f5360b.requestFocus();
        this.f5361c.setImageResource(R.drawable.abc_cab_background_internal_bg);
        this.f5361c.setClickable(true);
        this.f5361c.setEnabled(true);
    }
}
