package com.gmail.heagoo.apkeditor.prj;

import android.content.Context;
import android.widget.Toast;
import com.gmail.heagoo.apkeditor.InterfaceC1291fa;
import com.gmail.heagoo.apkeditor.pro.R;
import com.gmail.heagoo.common.C1559h;
import com.gmail.heagoo.p084a.p089c.C1067a;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.prj.g */
/* JADX INFO: loaded from: classes.dex */
final class C1422g implements InterfaceC1291fa {

    /* JADX INFO: renamed from: a */
    private WeakReference f4140a;

    /* JADX INFO: renamed from: b */
    private C1421f f4141b;

    /* JADX INFO: renamed from: c */
    private boolean f4142c = false;

    /* JADX INFO: renamed from: d */
    private String f4143d;

    C1422g(ProjectListActivity projectListActivity, C1421f c1421f) {
        this.f4140a = new WeakReference(projectListActivity);
        this.f4141b = c1421f;
    }

    @Override // com.gmail.heagoo.apkeditor.InterfaceC1291fa
    /* JADX INFO: renamed from: a */
    public final void mo2792a() {
        try {
            C1559h.m3770a(new File(this.f4141b.f4137c));
        } catch (IOException e) {
        }
        try {
            C1559h.m3770a(new File(C1067a.m2525d((Context) this.f4140a.get(), ".projects") + this.f4141b.f4135a));
            this.f4142c = true;
        } catch (Exception e2) {
            this.f4143d = e2.getMessage();
        }
    }

    @Override // com.gmail.heagoo.apkeditor.InterfaceC1291fa
    /* JADX INFO: renamed from: b */
    public final void mo2793b() {
        if (this.f4142c) {
            Context context = (Context) this.f4140a.get();
            Toast.makeText(context, String.format(context.getString(R.string.project_removed), this.f4141b.f4135a), 1).show();
            ((ProjectListActivity) this.f4140a.get()).m3484a();
        } else if (this.f4143d != null) {
            Toast.makeText((Context) this.f4140a.get(), String.format(((ProjectListActivity) this.f4140a.get()).getString(R.string.general_error), this.f4143d), 1).show();
        }
    }
}
