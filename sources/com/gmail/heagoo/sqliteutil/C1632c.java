package com.gmail.heagoo.sqliteutil;

import android.util.Log;
import com.github.megatronking.stringfog.xor.StringFogImpl;
import com.gmail.heagoo.common.ccc;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;

/* JADX INFO: renamed from: com.gmail.heagoo.sqliteutil.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1632c implements ccc {

    /* JADX INFO: renamed from: b */
    private static String[] f4992b = {"/data/bin/su", "/system/bin/su", "/system/xbin/su"};

    /* JADX INFO: renamed from: a */
    private String f4993a;

    /* JADX INFO: renamed from: a */
    private String[] f4994a = new String[2];

    /* JADX INFO: renamed from: b */
    private String f4995b;

    /* JADX INFO: renamed from: a */
    private static Process m4024a(String str, String[] strArr) {
        int i = 0;
        Map<String, String> map = System.getenv();
        String[] strArr2 = new String[(strArr != null ? strArr.length : 0) + map.size()];
        int i2 = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            strArr2[i2] = entry.getKey() + "=" + entry.getValue();
            i2++;
        }
        if (strArr != null) {
            int length = strArr.length;
            while (i < length) {
                strArr2[i2] = strArr[i];
                i++;
                i2++;
            }
        }
        return Runtime.getRuntime().exec(str, strArr2);
    }

    /* JADX INFO: renamed from: a */
    private static String m4025a(InputStream inputStream) throws IOException {
        int i;
        char[] cArr = new char[8192];
        StringBuilder sb = new StringBuilder();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, StringFogImpl.CHARSET_NAME_UTF_8);
        do {
            i = inputStreamReader.read(cArr, 0, 8192);
            if (i > 0) {
                sb.append(cArr, 0, i);
            }
        } while (i >= 0);
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    private static boolean m4026a(Process process) {
        try {
            process.exitValue();
            return false;
        } catch (IllegalThreadStateException e) {
            return true;
        }
    }

    /* JADX INFO: renamed from: b */
    private static void m4027b(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private boolean m4028b(String str, String[] strArr, Integer num, boolean z) {
        C1633d c1633d;
        C1633d c1633d2;
        Log.d("RootCommand", String.format("Running '%s' as root", str));
        Log.d("RootCommand", String.format("num %d , bool %b", num, Boolean.valueOf(z)));
        String str2 = "su";
        for (String str3 : f4992b) {
            if (new File(str3).exists()) {
                str2 = str3;
            }
        }
        Log.d("RootCommand", "su path: " + str2);
        Process processM4024a = m4024a(str2, strArr);
        try {
            try {
                DataOutputStream dataOutputStream = new DataOutputStream(processM4024a.getOutputStream());
                dataOutputStream.writeBytes(str + "\n");
                dataOutputStream.writeBytes("echo \"rc:\" $?\n");
                dataOutputStream.writeBytes("exit\n");
                dataOutputStream.flush();
                InputStream inputStream = processM4024a.getInputStream();
                InputStream errorStream = processM4024a.getErrorStream();
                if (z) {
                    c1633d = null;
                    c1633d2 = null;
                } else {
                    C1633d c1633d3 = new C1633d(inputStream, this.f4994a, 0);
                    c1633d3.start();
                    C1633d c1633d4 = new C1633d(errorStream, this.f4994a, 1);
                    c1633d4.start();
                    Log.d("RootCommand", "After inputStreamReader thread start");
                    c1633d = c1633d3;
                    c1633d2 = c1633d4;
                }
                if (num.intValue() == 1000) {
                    long jCurrentTimeMillis = System.currentTimeMillis() + ((long) num.intValue());
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    Log.d("RootCommand", "currentTimeMillis");
                    Log.d("RootCommand", String.format("init stopTime %d , currentTime %d", Long.valueOf(jCurrentTimeMillis), Long.valueOf(jCurrentTimeMillis2)));
                    while (true) {
                        if (!m4026a(processM4024a)) {
                            break;
                        }
                        long jCurrentTimeMillis3 = System.currentTimeMillis();
                        Object[] objArr = new Object[3];
                        objArr[0] = Long.valueOf(jCurrentTimeMillis);
                        objArr[1] = Long.valueOf(jCurrentTimeMillis3);
                        objArr[2] = Boolean.valueOf(jCurrentTimeMillis < jCurrentTimeMillis3);
                        Log.d("RootCommand", String.format("stopTime %d < currentTime %d , %b", objArr));
                        if (jCurrentTimeMillis3 > jCurrentTimeMillis) {
                            Log.d("RootCommand", "Process doesn't seem to stop on it's own, assuming it's hanging");
                            try {
                                dataOutputStream.close();
                                if (processM4024a != null) {
                                    try {
                                        processM4024a.exitValue();
                                    } catch (IllegalThreadStateException e) {
                                        e.printStackTrace();
                                        processM4024a.destroy();
                                    }
                                }
                            } catch (IOException e2) {
                                e2.printStackTrace();
                                throw new RuntimeException(e2);
                            }
                        }
                    }
                } else {
                    try {
                        Log.d("RootCommand", "before waitFor");
                        processM4024a.waitFor();
                        Log.d("RootCommand", "after waitFor");
                    } catch (InterruptedException e3) {
                        e3.printStackTrace();
                    }
                }
                if (z) {
                    Log.d("RootCommand", "before inputStreamReader");
                    this.f4994a[0] = m4025a(inputStream);
                    this.f4994a[1] = m4025a(errorStream);
                    m4027b(inputStream);
                    m4027b(errorStream);
                    Log.d("RootCommand", "after inputStreamReader");
                } else {
                    c1633d.m4030a();
                    c1633d2.m4030a();
                }
                Log.d("RootCommand", "Process returned with " + processM4024a.exitValue());
                Log.d("RootCommand", "Process stdout was: " + this.f4994a[0] + "; stderr: " + this.f4994a[1]);
                if (processM4024a.exitValue() == 0) {
                    try {
                        dataOutputStream.close();
                        if (processM4024a != null) {
                            try {
                                processM4024a.exitValue();
                            } catch (IllegalThreadStateException e4) {
                                e4.printStackTrace();
                                processM4024a.destroy();
                            }
                        }
                        return true;
                    } catch (IOException e5) {
                        throw new RuntimeException(e5);
                    }
                }
                try {
                    dataOutputStream.close();
                    if (processM4024a != null) {
                        try {
                            processM4024a.exitValue();
                        } catch (IllegalThreadStateException e6) {
                            e6.printStackTrace();
                            processM4024a.destroy();
                        }
                    }
                    return false;
                } catch (IOException e7) {
                    e7.printStackTrace();
                    throw new RuntimeException(e7);
                }
            } catch (IOException e8) {
                e8.printStackTrace();
                Log.d("RootCommand", "Failed to run command: " + e8.getMessage());
                if (processM4024a != null) {
                    try {
                        processM4024a.exitValue();
                    } catch (IllegalThreadStateException e9) {
                        e9.printStackTrace();
                        processM4024a.destroy();
                    }
                    return false;
                }
                return true;
            }
        } catch (FileNotFoundException e10) {
            e10.printStackTrace();
            return true;
        }
    }

    @Override // com.gmail.heagoo.common.ccc
    /* JADX INFO: renamed from: a */
    public final String mo3755a() {
        return this.f4994a[0];
    }

    @Override // com.gmail.heagoo.common.ccc
    /* JADX INFO: renamed from: a */
    public final boolean mo3757a(String str, String[] strArr, Integer num) {
        return m4029b(str, null, num);
    }

    @Override // com.gmail.heagoo.common.ccc
    /* JADX INFO: renamed from: a */
    public final boolean mo3760a(String str, String[] strArr, Integer num, boolean z) {
        return m4028b(str, null, num, z);
    }

    @Override // com.gmail.heagoo.common.ccc
    /* JADX INFO: renamed from: b */
    public final String mo3759b() {
        return this.f4994a[1];
    }

    /* JADX INFO: renamed from: b */
    public final boolean m4029b(String str, String[] strArr, Integer num) {
        return m4028b(str, strArr, num, false);
    }
}
