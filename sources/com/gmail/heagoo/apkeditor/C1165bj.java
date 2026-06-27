package com.gmail.heagoo.apkeditor;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.bj */
/* JADX INFO: loaded from: classes.dex */
final class C1165bj extends Thread {

    /* JADX INFO: renamed from: a */
    private String f3421a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ ApkSearchActivity f3422b;

    C1165bj(ApkSearchActivity apkSearchActivity) {
        this.f3422b = apkSearchActivity;
        this.f3421a = apkSearchActivity.f2980b.toLowerCase();
    }

    /* JADX INFO: renamed from: a */
    private void m3076a(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            ArrayList arrayList = new ArrayList();
            for (File file2 : fileArrListFiles) {
                if (file2.isFile()) {
                    String name = file2.getName();
                    if (name.endsWith(".apk") && name.toLowerCase().contains(this.f3421a)) {
                        ApkSearchActivity apkSearchActivity = this.f3422b;
                        apkSearchActivity.runOnUiThread(new RunnableC1163bh(apkSearchActivity, file2.getAbsolutePath()));
                    }
                } else {
                    arrayList.add(file2);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                m3076a((File) it.next());
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        m3076a(new File(this.f3422b.f2981c));
        ApkSearchActivity apkSearchActivity = this.f3422b;
        apkSearchActivity.runOnUiThread(new RunnableC1164bi(apkSearchActivity));
    }
}
