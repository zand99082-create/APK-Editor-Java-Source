package com.gmail.heagoo.apkeditor.util;

import android.app.Activity;
import android.support.graphics.drawable.PathInterpolatorCompat;
import android.util.Log;
import com.gmail.heagoo.apkeditor.pro.R;
import com.gmail.heagoo.common.C1559h;
import com.gmail.heagoo.common.C1571t;
import com.gmail.heagoo.common.C1574w;
import com.gmail.heagoo.p084a.p089c.C1067a;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.StringReader;
import java.util.List;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.util.x */
/* JADX INFO: loaded from: classes.dex */
public final class C1483x {

    /* JADX INFO: renamed from: a */
    public String f4404a;

    /* JADX INFO: renamed from: b */
    public String f4405b;

    /* JADX INFO: renamed from: c */
    private String f4406c;

    /* JADX INFO: renamed from: d */
    private int f4407d;

    /* JADX INFO: renamed from: e */
    private byte[] f4408e;

    /* JADX INFO: renamed from: f */
    private String f4409f;

    public C1483x(String str) {
        this.f4409f = str;
    }

    /* JADX INFO: renamed from: a */
    private String m3636a(Activity activity) {
        String str;
        try {
            List listM3798a = new C1574w("/proc/self/maps").m3798a();
            String packageName = activity.getPackageName();
            int i = 0;
            while (true) {
                if (i >= listM3798a.size()) {
                    str = null;
                    break;
                }
                String str2 = (String) listM3798a.get(i);
                if (str2.endsWith(".odex") && str2.contains("/" + packageName)) {
                    str = str2.split("\\s+")[r0.length - 1];
                    break;
                }
                i++;
            }
            if (str == null) {
                return null;
            }
            int iIndexOf = str.indexOf("/" + activity.getPackageName());
            String strSubstring = str.substring(0, iIndexOf);
            C1571t c1571t = new C1571t();
            c1571t.m3795a("ls " + strSubstring, null, Integer.valueOf(PathInterpolatorCompat.MAX_NUM_POINTS), true);
            String strM3792a = c1571t.m3792a();
            if (strM3792a == null || strM3792a.equals("")) {
                return null;
            }
            String strM3637a = m3637a(strM3792a);
            if (strM3637a == null) {
                return null;
            }
            return strSubstring + "/" + strM3637a + str.substring(str.indexOf(47, iIndexOf + 1));
        } catch (Exception e) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private String m3637a(String str) {
        char cCharAt;
        BufferedReader bufferedReader = new BufferedReader(new StringReader(str));
        try {
            for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                if (line.equals(this.f4409f)) {
                    return line;
                }
                if (line.startsWith(this.f4409f) && (cCharAt = line.charAt(this.f4409f.length())) != '.') {
                    if (!((cCharAt >= 'a' && cCharAt <= 'z') || (cCharAt >= 'A' && cCharAt <= 'Z'))) {
                        return line;
                    }
                }
            }
            return null;
        } catch (Exception e) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m3638a(Activity activity, String str, boolean z) {
        try {
            String str2 = activity.getPackageManager().getApplicationInfo(this.f4409f, 0).sourceDir;
            this.f4406c = str2.substring(str2.lastIndexOf(47) + 1);
            FileInputStream fileInputStream = new FileInputStream(str);
            byte[] bArr = new byte[65536];
            int i = 0;
            while (i < 65536) {
                int i2 = fileInputStream.read(bArr, i, 65536 - i);
                if (i2 == -1) {
                    break;
                }
                i += i2;
            }
            fileInputStream.close();
            boolean zM3639a = m3639a(bArr, this.f4406c, z);
            return !zM3639a ? m3639a(bArr, str2, z) : zM3639a;
        } catch (Exception e) {
            Log.d("DEBUG", "Exception: " + e.getMessage() + ": " + e);
            e.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m3639a(byte[] bArr, String str, boolean z) {
        byte b2;
        int length = str.length();
        byte[] bArr2 = {(byte) length, (byte) (length >> 8), (byte) (length >> 16), (byte) (length >>> 24)};
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= (65536 - length) - 16) {
                return false;
            }
            if (bArr[i2] == bArr2[0] && bArr[i2 + 1] == bArr2[1] && bArr[i2 + 2] == bArr2[2] && bArr[i2 + 3] == bArr2[3]) {
                byte[] bytes = str.getBytes();
                int i3 = i2 + 4;
                int length2 = bytes.length;
                int i4 = 0;
                while (true) {
                    if (i4 >= length2) {
                        b2 = 0;
                        break;
                    }
                    if (bArr[i3 + i4] != bytes[i4 + 0]) {
                        if (bArr[i3 + i4] < bytes[i4 + 0]) {
                            b2 = -1;
                            break;
                        }
                        if (bArr[i3 + i4] > bytes[i4 + 0]) {
                            b2 = 1;
                            break;
                        }
                    }
                    i4++;
                }
                if (b2 == 0) {
                    this.f4407d = i2 + 4 + bytes.length;
                    if (z) {
                        this.f4408e = new byte[]{bArr[i2 + 4 + bytes.length], bArr[i2 + 5 + bytes.length], bArr[i2 + 6 + bytes.length], bArr[i2 + 7 + bytes.length]};
                    }
                    return true;
                }
            }
            i = i2 + 1;
        }
    }

    /* JADX INFO: renamed from: b */
    private void m3640b(String str) {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(str, "rw");
            randomAccessFile.seek(this.f4407d);
            randomAccessFile.write(this.f4408e);
            randomAccessFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m3641a(Activity activity, String str) throws Throwable {
        this.f4405b = m3636a(activity);
        if (this.f4405b == null) {
            this.f4404a = activity.getString(R.string.patch_err_odex_not_found1);
            return;
        }
        C1571t c1571t = new C1571t();
        c1571t.m3793a("ls " + this.f4405b, null, Integer.valueOf(PathInterpolatorCompat.MAX_NUM_POINTS));
        String strM3796b = c1571t.m3796b();
        if (strM3796b != null && !strM3796b.equals("")) {
            String strReplace = this.f4405b.contains("/arm64/") ? this.f4405b.replace("/arm64/", "/arm/") : this.f4405b.replace("/arm/", "/arm64/");
            c1571t.m3793a("ls " + strReplace, null, Integer.valueOf(PathInterpolatorCompat.MAX_NUM_POINTS));
            String strM3796b2 = c1571t.m3796b();
            if (strM3796b2 != null && !strM3796b2.equals("")) {
                this.f4404a = String.format(activity.getString(R.string.copyright), this.f4405b, strReplace);
                return;
            }
            this.f4405b = strReplace;
        }
        m3638a(activity, this.f4405b, true);
        if (this.f4408e == null) {
            this.f4404a = "Cannot get the original checksum.";
            return;
        }
        try {
            String strM2525d = C1067a.m2525d(activity, "tmp");
            String str2 = strM2525d + this.f4406c;
            C1559h.m3772a(str, str2);
            String str3 = strM2525d + "odex";
            String str4 = "dex2oat --dex-file=" + this.f4406c + " --oat-file=" + str3 + (this.f4405b.contains("/arm64/") ? " --instruction-set=arm64" : "");
            C1571t c1571t2 = new C1571t();
            c1571t2.m3794a(str4, null, 10000, strM2525d, false);
            new File(str2).delete();
            if (m3638a(activity, str3, false)) {
                m3640b(str3);
                c1571t2.m3793a("cp " + str3 + " " + this.f4405b, null, 5000);
            } else {
                this.f4404a = "Cannot fix the checksum.";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        new C1571t().m3793a("am force-stop " + this.f4409f, null, 5000);
    }
}
