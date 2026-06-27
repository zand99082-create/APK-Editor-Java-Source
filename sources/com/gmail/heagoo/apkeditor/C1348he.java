package com.gmail.heagoo.apkeditor;

import android.widget.Toast;
import com.gmail.heagoo.apkeditor.p095d.InterfaceC1210a;
import com.gmail.heagoo.apkeditor.pro.R;
import com.gmail.heagoo.p084a.p089c.C1067a;
import java.io.File;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.he */
/* JADX INFO: loaded from: classes.dex */
final class C1348he implements InterfaceC1291fa {

    /* JADX INFO: renamed from: a */
    private boolean f3948a = false;

    /* JADX INFO: renamed from: b */
    private String f3949b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ String f3950c;

    /* JADX INFO: renamed from: d */
    private /* synthetic */ String f3951d;

    /* JADX INFO: renamed from: e */
    private /* synthetic */ String f3952e;

    /* JADX INFO: renamed from: f */
    private /* synthetic */ AbstractActivityC1341gy f3953f;

    C1348he(AbstractActivityC1341gy abstractActivityC1341gy, String str, String str2, String str3) {
        this.f3953f = abstractActivityC1341gy;
        this.f3950c = str;
        this.f3951d = str2;
        this.f3952e = str3;
    }

    @Override // com.gmail.heagoo.apkeditor.InterfaceC1291fa
    /* JADX INFO: renamed from: a */
    public final void mo2792a() {
        InterfaceC1210a interfaceC1210a = (InterfaceC1210a) C1067a.m2453a("com.gmail.heagoo.apkeditor.pro.JavaExtractor", new Class[]{String.class, String.class, String.class, String.class}, new Object[]{this.f3953f.f3922m, this.f3950c, this.f3951d, this.f3952e});
        if (interfaceC1210a != null) {
            this.f3948a = interfaceC1210a.extract();
            if (this.f3948a) {
                return;
            }
            this.f3949b = interfaceC1210a.getErrorMessage();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00b1 A[PHI: r1 r2
      0x00b1: PHI (r1v7 boolean) = (r1v6 boolean), (r1v24 boolean) binds: [B:5:0x002d, B:9:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x00b1: PHI (r2v3 java.lang.String) = (r2v2 java.lang.String), (r2v11 java.lang.String) binds: [B:5:0x002d, B:9:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.gmail.heagoo.apkeditor.InterfaceC1291fa
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo2793b() {
        boolean zExists;
        String str;
        if (!this.f3948a) {
            Toast.makeText(this.f3953f, this.f3949b, 1).show();
            return;
        }
        String strSubstring = this.f3951d.substring(1);
        String str2 = this.f3952e + strSubstring + ".java";
        boolean zExists2 = new File(str2).exists();
        if (zExists2) {
            zExists = zExists2;
            str = str2;
        } else {
            int iLastIndexOf = strSubstring.lastIndexOf(36);
            if (iLastIndexOf != -1) {
                strSubstring = strSubstring.substring(0, iLastIndexOf);
                str2 = this.f3952e + strSubstring + ".java";
                zExists2 = new File(str2).exists();
                if (!zExists2) {
                }
            }
            str = this.f3952e + "defpackage/" + strSubstring + ".java";
            zExists = new File(str).exists();
        }
        if (!zExists) {
            Toast.makeText(this.f3953f, R.string.cannot_find_java_file, 1).show();
        } else {
            this.f3953f.startActivity(C1067a.m2439a(this.f3953f, str, (String) null));
        }
    }
}
