package com.gmail.heagoo.apkeditor;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.PopupWindow;
import com.gmail.heagoo.apkeditor.pro.R;
import com.p078b.p079a.AlertDialogC1013f;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.hc */
/* JADX INFO: loaded from: classes.dex */
final class C1346hc implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ C1277er f3944a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ PopupWindow f3945b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ AbstractActivityC1341gy f3946c;

    C1346hc(AbstractActivityC1341gy abstractActivityC1341gy, C1277er c1277er, PopupWindow popupWindow) {
        this.f3946c = abstractActivityC1341gy;
        this.f3944a = c1277er;
        this.f3945b = popupWindow;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        switch (this.f3944a.m3244a(i)) {
            case 0:
                AbstractActivityC1341gy.m3390d(this.f3946c);
                break;
            case 1:
                new AlertDialogC1013f(this.f3946c, -1, this.f3946c).show();
                break;
            case 2:
                this.f3946c.f3918i = 2;
                new C1218dk().m3130a(this.f3946c, R.string.delete_lines, this.f3946c);
                break;
            case 3:
                this.f3946c.startActivity(new Intent(this.f3946c, (Class<?>) SettingEditorActivity.class));
                break;
            case 4:
                this.f3946c.startActivity(new Intent(this.f3946c, (Class<?>) AboutModActivity.class));
                break;
            case 5:
                this.f3946c.f3918i = 5;
                new C1218dk().m3130a(this.f3946c, R.string.comment_lines, this.f3946c);
                break;
            case 6:
                this.f3946c.startActivity(new Intent(this.f3946c, (Class<?>) TemplatesActivity.class));
                break;
            case 7:
                AbstractActivityC1341gy.m3394f(this.f3946c);
                break;
        }
        if (this.f3945b != null) {
            this.f3945b.dismiss();
        }
    }
}
