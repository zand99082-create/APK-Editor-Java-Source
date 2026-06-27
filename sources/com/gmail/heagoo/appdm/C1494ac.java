package com.gmail.heagoo.appdm;

import com.gmail.heagoo.appdm.util.C1526i;
import com.gmail.heagoo.common.ccc;
import java.io.File;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.gmail.heagoo.appdm.ac */
/* JADX INFO: loaded from: classes.dex */
final class C1494ac extends Thread {

    /* JADX INFO: renamed from: a */
    private WeakReference f4488a;

    /* JADX INFO: renamed from: b */
    private String f4489b;

    /* JADX INFO: renamed from: c */
    private String f4490c;

    /* JADX INFO: renamed from: d */
    private String f4491d;

    /* JADX INFO: renamed from: e */
    private String f4492e;

    public C1494ac(PrefOverallActivity prefOverallActivity) {
        this.f4489b = prefOverallActivity.f4457c;
        this.f4488a = new WeakReference(prefOverallActivity);
    }

    /* JADX INFO: renamed from: a */
    public final String m3697a() {
        return this.f4491d;
    }

    /* JADX INFO: renamed from: b */
    public final String m3698b() {
        return this.f4492e;
    }

    /* JADX INFO: renamed from: c */
    public final String m3699c() {
        return this.f4490c;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        PrefOverallActivity prefOverallActivity = (PrefOverallActivity) this.f4488a.get();
        if (prefOverallActivity != null) {
            if (C1526i.m3726a()) {
                String path = prefOverallActivity.getFilesDir().getPath();
                int iIndexOf = path.indexOf(prefOverallActivity.getPackageName());
                if (iIndexOf == -1) {
                    this.f4490c = "Can not find data path!";
                } else {
                    String strSubstring = path.substring(0, iIndexOf);
                    if (prefOverallActivity.f4446G) {
                        String str = strSubstring + this.f4489b + "/shared_prefs/*.xml";
                        String str2 = strSubstring + this.f4489b + "/databases/*.db";
                        ccc cccVarM3691g = prefOverallActivity.m3691g();
                        if (cccVarM3691g.mo3757a(String.format("ls %s", str), (String[]) null, (Integer) 5000)) {
                            this.f4491d = cccVarM3691g.mo3755a();
                            if (cccVarM3691g.mo3757a(String.format("ls %s", str2), (String[]) null, (Integer) 5000)) {
                                this.f4492e = cccVarM3691g.mo3755a();
                            } else {
                                this.f4490c = "Can not get access to read files!";
                            }
                        } else {
                            this.f4490c = "Can not get access to read files!";
                        }
                    } else {
                        File[] fileArrListFiles = new File(strSubstring + this.f4489b + "/shared_prefs").listFiles();
                        if (fileArrListFiles != null) {
                            StringBuffer stringBuffer = new StringBuffer();
                            for (File file : fileArrListFiles) {
                                stringBuffer.append(file.getAbsolutePath());
                                stringBuffer.append("\n");
                            }
                            this.f4491d = stringBuffer.toString();
                        }
                        File[] fileArrListFiles2 = new File(strSubstring + this.f4489b + "/databases").listFiles();
                        if (fileArrListFiles2 != null) {
                            StringBuffer stringBuffer2 = new StringBuffer();
                            for (File file2 : fileArrListFiles2) {
                                stringBuffer2.append(file2.getAbsolutePath());
                                stringBuffer2.append("\n");
                            }
                            this.f4492e = stringBuffer2.toString();
                        }
                    }
                    z = true;
                }
            } else {
                this.f4490c = "Can not find SD card!";
            }
        }
        PrefOverallActivity prefOverallActivity2 = (PrefOverallActivity) this.f4488a.get();
        if (prefOverallActivity2 != null) {
            prefOverallActivity2.m3685a(z);
        }
    }
}
