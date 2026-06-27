package com.gmail.heagoo.appdm;

import android.widget.Toast;
import com.gmail.heagoo.apkeditor.pro.R;
import com.gmail.heagoo.appdm.util.C1527j;

/* JADX INFO: renamed from: com.gmail.heagoo.appdm.u */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1519u implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ boolean f4563a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ PrefOverallActivity f4564b;

    RunnableC1519u(PrefOverallActivity prefOverallActivity, boolean z) {
        this.f4564b = prefOverallActivity;
        this.f4563a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4564b.findViewById(R.id.layout_scanning).setVisibility(4);
        if (!this.f4563a) {
            Toast.makeText(this.f4564b, this.f4564b.f4455a, 0).show();
            return;
        }
        String strM3697a = this.f4564b.f4458d.m3697a();
        if (strM3697a != null) {
            String[] strArrSplit = strM3697a.split("\n");
            for (String str : strArrSplit) {
                if (str.endsWith(".xml")) {
                    this.f4564b.f4471q.add(new C1527j(str.substring(str.lastIndexOf(47) + 1).substring(0, r5.length() - 4), str));
                }
            }
        }
        String strM3698b = this.f4564b.f4458d.m3698b();
        if (strM3698b != null) {
            String[] strArrSplit2 = strM3698b.split("\n");
            for (String str2 : strArrSplit2) {
                if (str2.endsWith(".db")) {
                    this.f4564b.f4472r.add(new C1527j(str2.substring(str2.lastIndexOf(47) + 1).substring(0, r5.length() - 3), str2));
                }
            }
        }
        PrefOverallActivity.m3662d(this.f4564b);
        PrefOverallActivity.m3663e(this.f4564b);
        this.f4564b.m3686b();
    }
}
