package com.gmail.heagoo.appdm;

import com.gmail.heagoo.appdm.util.C1526i;
import com.gmail.heagoo.common.ccc;
import com.gmail.heagoo.p084a.p089c.C1068ax;
import java.io.File;
import java.io.FileInputStream;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.gmail.heagoo.appdm.m */
/* JADX INFO: loaded from: classes.dex */
final class C1511m extends Thread {

    /* JADX INFO: renamed from: a */
    private WeakReference f4547a;

    public C1511m(PrefDetailActivity prefDetailActivity) {
        this.f4547a = new WeakReference(prefDetailActivity);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        HashMap mapA_004;
        PrefDetailActivity prefDetailActivity = (PrefDetailActivity) this.f4547a.get();
        if (prefDetailActivity != null) {
            try {
                if (!C1526i.m3726a()) {
                    throw new Exception("Can not find SD Card!");
                }
                File file = new File(C1526i.m3727b(prefDetailActivity));
                if (!file.exists()) {
                    file.mkdirs();
                }
                if (prefDetailActivity.f4435l) {
                    String path = new File(prefDetailActivity.getFilesDir(), "work.xml").getPath();
                    prefDetailActivity.f4426b = path;
                    ccc cccVarM3645a = PrefDetailActivity.m3645a(prefDetailActivity.f4435l);
                    File file2 = new File(prefDetailActivity.getFilesDir(), "mycp");
                    boolean zMo3757a = cccVarM3645a.mo3757a(String.format((file2.exists() ? file2.getPath() : "cp") + " \"%s\" %s", prefDetailActivity.f4425a, path, path), (String[]) null, (Integer) 5000);
                    cccVarM3645a.mo3759b();
                    if (!zMo3757a) {
                        path = prefDetailActivity.f4425a;
                    }
                    FileInputStream fileInputStream = new FileInputStream(path);
                    mapA_004 = C1068ax.a_004(fileInputStream);
                    fileInputStream.close();
                } else {
                    FileInputStream fileInputStream2 = new FileInputStream(prefDetailActivity.f4425a);
                    mapA_004 = C1068ax.a_004(fileInputStream2);
                    fileInputStream2.close();
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : mapA_004.entrySet()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
                PrefDetailActivity.m3647a(prefDetailActivity, linkedHashMap);
                prefDetailActivity.m3651a((String) null);
            } catch (Exception e) {
                prefDetailActivity.m3651a(e.getMessage() + ": " + ((String) null));
            }
        }
    }
}
