package com.gmail.heagoo.apkeditor;

import android.content.Context;
import android.widget.Toast;
import com.gmail.heagoo.apkeditor.pro.R;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.fy */
/* JADX INFO: loaded from: classes.dex */
final class C1315fy implements InterfaceC1291fa {

    /* JADX INFO: renamed from: a */
    private int f3844a = 0;

    /* JADX INFO: renamed from: b */
    private String f3845b = "";

    /* JADX INFO: renamed from: c */
    private /* synthetic */ String f3846c;

    /* JADX INFO: renamed from: d */
    private /* synthetic */ DialogC1312fv f3847d;

    C1315fy(DialogC1312fv dialogC1312fv, String str) {
        this.f3847d = dialogC1312fv;
        this.f3846c = str;
    }

    @Override // com.gmail.heagoo.apkeditor.InterfaceC1291fa
    /* JADX INFO: renamed from: a */
    public final void mo2792a() throws Throwable {
        for (String str : this.f3847d.f3840k) {
            try {
                this.f3847d.f3833d.m3236a(str, this.f3846c);
                this.f3847d.m3358b(str);
            } catch (Exception e) {
                this.f3845b += "\n" + String.format(((ApkInfoActivity) this.f3847d.f3835f.get()).getString(R.string.failed_to_modify), str);
                this.f3844a++;
            }
        }
    }

    @Override // com.gmail.heagoo.apkeditor.InterfaceC1291fa
    /* JADX INFO: renamed from: b */
    public final void mo2793b() {
        for (int i = 0; i < this.f3847d.f3833d.getGroupCount(); i++) {
            this.f3847d.f3832c.collapseGroup(i);
            this.f3847d.f3833d.m3240b(i);
        }
        String str = String.format(((ApkInfoActivity) this.f3847d.f3835f.get()).getString(R.string.str_num_modified_file), Integer.valueOf(this.f3847d.f3840k.size() - this.f3844a));
        if (this.f3844a > 0) {
            Toast.makeText((Context) this.f3847d.f3835f.get(), str + this.f3845b, 1).show();
        } else {
            Toast.makeText((Context) this.f3847d.f3835f.get(), str, 0).show();
        }
    }
}
