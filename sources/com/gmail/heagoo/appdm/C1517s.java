package com.gmail.heagoo.appdm;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import com.gmail.heagoo.apkeditor.InterfaceC1291fa;
import com.gmail.heagoo.apkeditor.pro.R;
import com.gmail.heagoo.neweditor.EditorActivity;

/* JADX INFO: renamed from: com.gmail.heagoo.appdm.s */
/* JADX INFO: loaded from: classes.dex */
final class C1517s implements InterfaceC1291fa {

    /* JADX INFO: renamed from: a */
    private String f4556a = null;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ String f4557b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ String f4558c;

    /* JADX INFO: renamed from: d */
    private /* synthetic */ PrefOverallActivity f4559d;

    C1517s(PrefOverallActivity prefOverallActivity, String str, String str2) {
        this.f4559d = prefOverallActivity;
        this.f4557b = str;
        this.f4558c = str2;
    }

    @Override // com.gmail.heagoo.apkeditor.InterfaceC1291fa
    /* JADX INFO: renamed from: a */
    public final void mo2792a() {
        this.f4556a = PrefOverallActivity.m3656a(this.f4559d, this.f4557b);
    }

    @Override // com.gmail.heagoo.apkeditor.InterfaceC1291fa
    /* JADX INFO: renamed from: b */
    public final void mo2793b() {
        if (this.f4556a == null) {
            Toast.makeText(this.f4559d, "Failed to open the file.", 0).show();
            return;
        }
        Intent intent = new Intent(this.f4559d, (Class<?>) EditorActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("filePath", this.f4556a);
        bundle.putString("realFilePath", this.f4557b);
        if (this.f4558c != null) {
            bundle.putString("syntaxFileName", this.f4558c);
        }
        bundle.putBoolean("isRootMode", this.f4559d.f4446G);
        bundle.putIntArray("resourceIds", new int[]{R.string.appdm_apk_file_path, R.string.appdm_apk_build_time, R.string.appdm_basic_info});
        intent.putExtras(bundle);
        this.f4559d.startActivityForResult(intent, 1000);
    }
}
