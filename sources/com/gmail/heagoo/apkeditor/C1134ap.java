package com.gmail.heagoo.apkeditor;

import android.widget.Toast;
import com.gmail.heagoo.apkeditor.pro.R;
import com.gmail.heagoo.p084a.p089c.C1067a;
import common.types.ActivityState_V1;
import common.types.ProjectInfo_V1;
import java.io.File;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.ap */
/* JADX INFO: loaded from: classes.dex */
final class C1134ap implements InterfaceC1291fa {

    /* JADX INFO: renamed from: a */
    private ActivityState_V1 f3344a;

    /* JADX INFO: renamed from: b */
    private File f3345b;

    /* JADX INFO: renamed from: c */
    private File f3346c;

    /* JADX INFO: renamed from: d */
    private String f3347d = null;

    /* JADX INFO: renamed from: e */
    private /* synthetic */ ApkInfoActivity f3348e;

    C1134ap(ApkInfoActivity apkInfoActivity) {
        this.f3348e = apkInfoActivity;
    }

    @Override // com.gmail.heagoo.apkeditor.InterfaceC1291fa
    /* JADX INFO: renamed from: a */
    public final void mo2792a() {
        String str = this.f3348e.f2947c != null ? this.f3348e.f2947c.f4629a : "UNKNOWN";
        try {
            String str2 = C1067a.m2525d(this.f3348e, ".projects") + str;
            this.f3346c = new File(str2);
            if (this.f3346c.exists()) {
                this.f3346c = DialogC1190ce.m3097a(str2, true);
            }
            if (!this.f3346c.mkdirs()) {
                this.f3347d = this.f3348e.getString(R.string.cannot_save_project);
                return;
            }
            String str3 = this.f3348e.f2946b;
            String str4 = str3 != null ? str3.substring(0, str3.lastIndexOf(47) + 1) + str : null;
            this.f3345b = new File(str4);
            if (this.f3345b.exists()) {
                this.f3345b = DialogC1190ce.m3097a(str4, true);
            }
            if (!new File(this.f3348e.f2946b).renameTo(this.f3345b)) {
                this.f3347d = this.f3348e.getString(R.string.cannot_rename_decode_folder);
                return;
            }
            this.f3348e.f2949e.m3322f(this.f3348e.f2946b + "/", this.f3345b.getPath() + "/");
            this.f3344a = this.f3348e.m2639a(this.f3346c.getPath() + "/", true, this.f3346c);
            if (this.f3344a == null) {
                this.f3347d = "Cannot save project state.";
            }
        } catch (Exception e) {
            this.f3347d = String.format(this.f3348e.getString(R.string.general_error), e.getMessage());
        }
    }

    @Override // com.gmail.heagoo.apkeditor.InterfaceC1291fa
    /* JADX INFO: renamed from: b */
    public final void mo2793b() {
        if (this.f3347d != null) {
            Toast.makeText(this.f3348e, this.f3347d, 1).show();
            return;
        }
        ProjectInfo_V1 projectInfo_V1 = new ProjectInfo_V1();
        projectInfo_V1.state = this.f3344a;
        projectInfo_V1.apkPath = this.f3348e.f2914a;
        projectInfo_V1.decodeRootPath = this.f3345b.getPath();
        ApkInfoActivity apkInfoActivity = this.f3348e;
        if (ApkInfoActivity.m2655a(this.f3346c.getPath(), projectInfo_V1)) {
            this.f3348e.finish();
        } else {
            Toast.makeText(this.f3348e, R.string.cannot_save_project, 1).show();
        }
    }
}
