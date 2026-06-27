package com.gmail.heagoo.apkeditor.p096e;

import com.gmail.heagoo.apkeditor.ApkInfoActivity;
import com.gmail.heagoo.apkeditor.InterfaceC1207cy;
import com.gmail.heagoo.apkeditor.pro.R;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.e.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1240e implements InterfaceC1207cy {

    /* JADX INFO: renamed from: a */
    private WeakReference f3595a;

    /* JADX INFO: renamed from: b */
    private String f3596b;

    /* JADX INFO: renamed from: c */
    private InterfaceC1237b f3597c;

    /* JADX INFO: renamed from: d */
    private C1239d f3598d;

    /* JADX INFO: renamed from: e */
    private ZipFile f3599e;

    public C1240e(ApkInfoActivity apkInfoActivity, String str, InterfaceC1237b interfaceC1237b) {
        this.f3595a = new WeakReference(apkInfoActivity);
        this.f3596b = str;
        this.f3597c = interfaceC1237b;
    }

    /* JADX INFO: renamed from: a */
    static /* synthetic */ int m3172a(C1240e c1240e, List list, String str) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= list.size()) {
                return -1;
            }
            if (str.equals(((AbstractC1242g) list.get(i2)).m3193b())) {
                return i2;
            }
            i = i2 + 1;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m3174a(List list, ZipFile zipFile) {
        new C1241f(this, list, zipFile).start();
    }

    @Override // com.gmail.heagoo.apkeditor.InterfaceC1207cy
    /* JADX INFO: renamed from: a */
    public final void mo3122a() {
        if (this.f3598d == null || this.f3598d.f3594a == null || this.f3599e == null) {
            return;
        }
        m3174a(this.f3598d.f3594a, this.f3599e);
    }

    /* JADX INFO: renamed from: b */
    public final void m3176b() {
        boolean z;
        boolean z2 = false;
        try {
            this.f3599e = new ZipFile(this.f3596b);
            ZipEntry entry = this.f3599e.getEntry("patch.txt");
            if (entry == null) {
                this.f3599e.close();
                this.f3599e = null;
                this.f3597c.mo3162a(R.string.patch_error_no_entry, "patch.txt");
            }
            InputStream inputStream = this.f3599e.getInputStream(entry);
            this.f3598d = C1239d.m3171a(inputStream, this.f3597c);
            inputStream.close();
            if (!((ApkInfoActivity) this.f3595a.get()).m2725k()) {
                Iterator it = this.f3598d.f3594a.iterator();
                boolean zMo3190a = false;
                while (true) {
                    if (!it.hasNext()) {
                        z = zMo3190a;
                        break;
                    }
                    zMo3190a = ((AbstractC1242g) it.next()).mo3190a();
                    if (zMo3190a) {
                        z = zMo3190a;
                        break;
                    }
                }
                if (z) {
                    this.f3597c.mo3161a(R.string.decode_dex_file, true, new Object[0]);
                    ((ApkInfoActivity) this.f3595a.get()).m2692a(this);
                }
                z2 = z;
            }
            if (z2) {
                return;
            }
            m3174a(this.f3598d.f3594a, this.f3599e);
        } catch (Exception e) {
            this.f3597c.mo3162a(R.string.general_error, e.getMessage());
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: c */
    public final List m3177c() {
        ArrayList arrayList = new ArrayList();
        if (this.f3598d != null && this.f3598d.f3594a != null) {
            Iterator it = this.f3598d.f3594a.iterator();
            while (it.hasNext()) {
                arrayList.add(((AbstractC1242g) it.next()).m3193b());
            }
        }
        return arrayList;
    }
}
