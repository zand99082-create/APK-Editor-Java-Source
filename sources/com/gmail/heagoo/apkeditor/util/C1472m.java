package com.gmail.heagoo.apkeditor.util;

import android.content.Context;
import com.gmail.heagoo.apkeditor.pro.R;
import com.gmail.heagoo.common.C1574w;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.util.m */
/* JADX INFO: loaded from: classes.dex */
public final class C1472m extends AbstractC1465f {

    /* JADX INFO: renamed from: e */
    private int f4370e;

    /* JADX INFO: renamed from: f */
    private int f4371f;

    /* JADX INFO: renamed from: g */
    private List f4372g;

    public C1472m(String str, String str2) throws Throwable {
        super(str, str2);
        this.f4370e = 0;
        this.f4371f = 0;
        this.f4372g = new ArrayList();
        try {
            m3614e();
        } catch (IOException e) {
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m3612a(BufferedReader bufferedReader) {
        if (bufferedReader != null) {
            try {
                bufferedReader.close();
            } catch (IOException e) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m3613a(String str) {
        String[] strArrSplit = str.split("/");
        int length = strArrSplit.length;
        String str2 = strArrSplit[length - 1];
        String str3 = strArrSplit[length - 2];
        int iIndexOf = str3.indexOf(45);
        String strSubstring = iIndexOf != -1 ? str3.substring(0, iIndexOf) : str3;
        for (int i = 0; i < this.f4372g.size(); i++) {
            C1473n c1473n = (C1473n) this.f4372g.get(i);
            if (str2.equals(c1473n.f4375c) && strSubstring.equals(c1473n.f4373a)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    private void m3614e() throws Throwable {
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new StringReader(this.f4351b));
            try {
                for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                    int iIndexOf = line.indexOf(": Invalid file name: must contain only ");
                    if (iIndexOf > 0) {
                        String strSubstring = line.substring(0, iIndexOf);
                        if (!m3613a(strSubstring)) {
                            this.f4372g.add(new C1473n(strSubstring, (byte) 0));
                        }
                    }
                }
                m3612a(bufferedReader);
            } catch (Throwable th) {
                th = th;
                m3612a(bufferedReader);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            bufferedReader = null;
        }
    }

    /* JADX INFO: renamed from: f */
    private void m3615f() {
        ArrayList arrayList = new ArrayList();
        for (C1473n c1473n : this.f4372g) {
            arrayList.add(new C1484y(c1473n.f4373a, c1473n.f4374b, c1473n.f4377e));
        }
        m3598a(arrayList);
    }

    /* JADX INFO: renamed from: g */
    private void m3616g() {
        String str = this.f4350a + "res/values/public.xml";
        try {
            String strM3799b = new C1574w(str).m3799b();
            for (int i = 0; i < this.f4372g.size(); i++) {
                C1473n c1473n = (C1473n) this.f4372g.get(i);
                strM3799b = strM3799b.replace("\"" + c1473n.f4374b + "\"", "\"" + c1473n.f4377e + "\"");
            }
            FileOutputStream fileOutputStream = new FileOutputStream(str);
            fileOutputStream.write(strM3799b.getBytes());
            fileOutputStream.close();
            this.f4371f++;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override // com.gmail.heagoo.apkeditor.util.AbstractC1465f
    /* JADX INFO: renamed from: a */
    public final String mo3599a(Context context) {
        StringBuilder sb = new StringBuilder();
        if (this.f4370e > 0) {
            sb.append(String.format(context.getString(R.string.str_num_renamed_file), Integer.valueOf(this.f4370e)));
            sb.append("\n");
        }
        if (this.f4371f > 0) {
            sb.append(String.format(context.getString(R.string.str_num_modified_file), Integer.valueOf(this.f4371f)));
            sb.append("\n");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    @Override // com.gmail.heagoo.apkeditor.util.AbstractC1465f
    /* JADX INFO: renamed from: a */
    public final boolean mo3601a() {
        return this.f4372g.size() > 0;
    }

    @Override // com.gmail.heagoo.apkeditor.util.AbstractC1465f
    /* JADX INFO: renamed from: b */
    public final void mo3602b() {
        File[] fileArrListFiles;
        File[] fileArrListFiles2 = new File(this.f4350a + "res").listFiles();
        for (int i = 0; i < this.f4372g.size(); i++) {
            C1473n c1473n = (C1473n) this.f4372g.get(i);
            C1473n.m3617a(c1473n, i);
            if (fileArrListFiles2 != null) {
                for (File file : fileArrListFiles2) {
                    if (!file.isFile() && file.getName().startsWith(c1473n.f4373a) && (fileArrListFiles = file.listFiles()) != null) {
                        for (File file2 : fileArrListFiles) {
                            if (!file2.isDirectory() && file2.getName().equals(c1473n.f4375c)) {
                                file2.renameTo(new File(file, c1473n.f4376d));
                                this.f4370e++;
                            }
                        }
                    }
                }
            }
        }
        m3616g();
        m3615f();
    }

    @Override // com.gmail.heagoo.apkeditor.util.AbstractC1465f
    /* JADX INFO: renamed from: c */
    public final boolean mo3603c() {
        return this.f4370e > 0 || this.f4371f > 0;
    }

    @Override // com.gmail.heagoo.apkeditor.util.AbstractC1465f
    /* JADX INFO: renamed from: d */
    public final Map mo3604d() {
        return null;
    }
}
