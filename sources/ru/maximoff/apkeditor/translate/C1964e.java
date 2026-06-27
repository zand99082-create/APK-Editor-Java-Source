package ru.maximoff.apkeditor.translate;

import android.support.v4.app.NotificationCompat;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

/* JADX INFO: renamed from: ru.maximoff.apkeditor.translate.e */
/* JADX INFO: loaded from: classes.dex */
class C1964e implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: a */
    private final TranslateActivity f5334a;

    /* JADX INFO: renamed from: b */
    private final Spinner f5335b;

    /* JADX INFO: renamed from: c */
    private final ArrayAdapter f5336c;

    /* JADX INFO: renamed from: d */
    private final ArrayAdapter f5337d;

    /* JADX INFO: renamed from: e */
    private final Spinner f5338e;

    /* JADX INFO: renamed from: f */
    private final ArrayAdapter f5339f;

    /* JADX INFO: renamed from: g */
    private final ArrayAdapter f5340g;

    /* JADX INFO: renamed from: h */
    private final String[] f5341h;

    /* JADX INFO: renamed from: i */
    private final String[] f5342i;

    C1964e(TranslateActivity translateActivity, Spinner spinner, ArrayAdapter arrayAdapter, ArrayAdapter arrayAdapter2, Spinner spinner2, ArrayAdapter arrayAdapter3, ArrayAdapter arrayAdapter4, String[] strArr, String[] strArr2) {
        this.f5334a = translateActivity;
        this.f5335b = spinner;
        this.f5336c = arrayAdapter;
        this.f5337d = arrayAdapter2;
        this.f5338e = spinner2;
        this.f5339f = arrayAdapter3;
        this.f5340g = arrayAdapter4;
        this.f5341h = strArr;
        this.f5342i = strArr2;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        this.f5334a.f5294c.edit().putInt(NotificationCompat.CATEGORY_SERVICE, i).commit();
        this.f5334a.f5293b = i == 0;
        this.f5335b.setAdapter((SpinnerAdapter) (this.f5334a.f5293b ? this.f5336c : this.f5337d));
        this.f5338e.setAdapter((SpinnerAdapter) (this.f5334a.f5293b ? this.f5339f : this.f5340g));
        this.f5338e.setSelection(this.f5334a.m4320a(this.f5334a.f5293b ? this.f5341h : this.f5342i, this.f5334a.m4358i()) - 1);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView adapterView) {
    }
}
