package ru.maximoff.apkeditor.translate;

import android.content.DialogInterface;
import android.widget.Spinner;

/* JADX INFO: renamed from: ru.maximoff.apkeditor.translate.g */
/* JADX INFO: loaded from: classes.dex */
class DialogInterfaceOnClickListenerC1966g implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    private final TranslateActivity f5344a;

    /* JADX INFO: renamed from: b */
    private final String[] f5345b;

    /* JADX INFO: renamed from: c */
    private final Spinner f5346c;

    /* JADX INFO: renamed from: d */
    private final String[] f5347d;

    /* JADX INFO: renamed from: e */
    private final Spinner f5348e;

    DialogInterfaceOnClickListenerC1966g(TranslateActivity translateActivity, String[] strArr, Spinner spinner, String[] strArr2, Spinner spinner2) {
        this.f5344a = translateActivity;
        this.f5345b = strArr;
        this.f5346c = spinner;
        this.f5347d = strArr2;
        this.f5348e = spinner2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        this.f5344a.f5299h = this.f5344a.f5293b ? this.f5345b[this.f5346c.getSelectedItemPosition()] : this.f5347d[this.f5346c.getSelectedItemPosition()];
        this.f5344a.f5298g = this.f5344a.f5293b ? this.f5345b[this.f5348e.getSelectedItemPosition() + 1] : this.f5347d[this.f5348e.getSelectedItemPosition() + 1];
        if (this.f5344a.f5298g.equals("zh")) {
            this.f5344a.f5297f = "-zh-rCN";
        } else if (this.f5344a.f5298g.startsWith("zh-")) {
            this.f5344a.f5297f = new StringBuffer().append("-zh-r").append(this.f5344a.f5298g.substring(3).toUpperCase()).toString();
        } else {
            this.f5344a.f5297f = new StringBuffer().append("-").append(this.f5344a.f5298g).toString();
        }
        this.f5344a.m4356h();
        dialogInterface.dismiss();
    }
}
