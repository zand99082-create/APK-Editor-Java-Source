package com.gmail.heagoo.apkeditor.p096e;

import com.gmail.heagoo.apkeditor.ApkInfoActivity;
import com.gmail.heagoo.apkeditor.C1296ff;
import com.gmail.heagoo.apkeditor.pro.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipFile;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.e.u */
/* JADX INFO: loaded from: classes.dex */
final class C1256u extends AbstractC1242g {

    /* JADX INFO: renamed from: b */
    private List f3648b = new ArrayList();

    C1256u() {
    }

    @Override // com.gmail.heagoo.apkeditor.p096e.AbstractC1242g
    /* JADX INFO: renamed from: a */
    public final String mo3186a(ApkInfoActivity apkInfoActivity, ZipFile zipFile, InterfaceC1237b interfaceC1237b) {
        String strM2722i = apkInfoActivity.m2722i();
        C1296ff c1296ffM2724j = apkInfoActivity.m2724j();
        for (int i = 0; i < this.f3648b.size(); i++) {
            String str = strM2722i + "/" + ((String) this.f3648b.get(i));
            int iLastIndexOf = str.lastIndexOf(47);
            String strSubstring = str.substring(0, iLastIndexOf);
            String strSubstring2 = str.substring(iLastIndexOf + 1);
            if (new File(str).exists()) {
                c1296ffM2724j.m3311b(strSubstring, strSubstring2, false);
            } else {
                c1296ffM2724j.m3311b(strSubstring, strSubstring2, true);
            }
        }
        return null;
    }

    @Override // com.gmail.heagoo.apkeditor.p096e.AbstractC1242g
    /* JADX INFO: renamed from: a */
    public final void mo3189a(C1238c c1238c, InterfaceC1237b interfaceC1237b) {
        this.f3603a = c1238c.m3170a();
        String line = c1238c.readLine();
        while (line != null) {
            String strTrim = line.trim();
            if ("[/REMOVE_FILES]".equals(strTrim)) {
                return;
            }
            if (super.m3192a(strTrim, c1238c)) {
                line = c1238c.readLine();
            } else if ("TARGET:".equals(strTrim)) {
                while (true) {
                    line = c1238c.readLine();
                    if (line != null) {
                        line = line.trim();
                        if (!line.startsWith("[")) {
                            if (!"".equals(line)) {
                                this.f3648b.add(line);
                            }
                        }
                    }
                }
            } else {
                interfaceC1237b.mo3162a(R.string.patch_error_cannot_parse, Integer.valueOf(c1238c.m3170a()), strTrim);
                line = c1238c.readLine();
            }
        }
    }

    @Override // com.gmail.heagoo.apkeditor.p096e.AbstractC1242g
    /* JADX INFO: renamed from: a */
    public final boolean mo3190a() {
        Iterator it = this.f3648b.iterator();
        while (it.hasNext()) {
            if (AbstractC1242g.m3184c((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.gmail.heagoo.apkeditor.p096e.AbstractC1242g
    /* JADX INFO: renamed from: a */
    public final boolean mo3191a(InterfaceC1237b interfaceC1237b) {
        if (!this.f3648b.isEmpty()) {
            return true;
        }
        interfaceC1237b.mo3162a(R.string.patch_error_no_target_file, new Object[0]);
        return false;
    }
}
