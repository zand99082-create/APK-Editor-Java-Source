package com.gmail.heagoo.common;

import com.github.megatronking.stringfog.xor.StringFogImpl;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;

/* JADX INFO: renamed from: com.gmail.heagoo.common.t */
/* JADX INFO: loaded from: classes.dex */
public final class C1571t {

    /* JADX INFO: renamed from: b */
    private static String[] f4659b = {"/data/bin/su", "/system/bin/su", "/system/xbin/su"};

    /* JADX INFO: renamed from: a */
    private String[] f4660a = new String[2];

    /* JADX INFO: renamed from: a */
    private static Process m3788a(String str, String[] strArr) {
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
    private static String m3789a(InputStream inputStream) throws IOException {
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
    private static boolean m3790a(Process process) {
        try {
            process.exitValue();
            return false;
        } catch (IllegalThreadStateException e) {
            return true;
        }
    }

    /* JADX INFO: renamed from: b */
    private static void m3791b(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m3792a() {
        return this.f4660a[0];
    }

    /* JADX INFO: renamed from: a */
    public final boolean m3793a(String str, String[] strArr, Integer num) {
        return m3795a(str, strArr, num, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x01d0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01d5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m3794a(String str, String[] strArr, Integer num, String str2, boolean z) throws Throwable {
        DataOutputStream dataOutputStream;
        Process process;
        Process processM3788a = null;
        try {
            try {
                try {
                    String.format("Running '%s' as root", str);
                    String str3 = "su";
                    String[] strArr2 = f4659b;
                    int length = strArr2.length;
                    int i = 0;
                    while (i < length) {
                        String str4 = strArr2[i];
                        if (!new File(str4).exists()) {
                            str4 = str3;
                        }
                        i++;
                        str3 = str4;
                    }
                    new StringBuilder("su path: ").append(str3);
                    processM3788a = m3788a(str3, strArr);
                    try {
                        dataOutputStream = new DataOutputStream(processM3788a.getOutputStream());
                        if (str2 != null) {
                            try {
                                dataOutputStream.writeBytes("cd " + str2 + "\n");
                            } catch (FileNotFoundException e) {
                                e = e;
                                process = processM3788a;
                                try {
                                    new StringBuilder("Failed to run command: ").append(e.getMessage());
                                    if (dataOutputStream != null) {
                                        try {
                                            dataOutputStream.close();
                                        } catch (IOException e2) {
                                            throw new RuntimeException(e2);
                                        }
                                    }
                                    if (process != null) {
                                        try {
                                            process.exitValue();
                                        } catch (IllegalThreadStateException e3) {
                                            process.destroy();
                                        }
                                    }
                                    return false;
                                } catch (Throwable th) {
                                    th = th;
                                    processM3788a = process;
                                    if (dataOutputStream != null) {
                                    }
                                    if (processM3788a != null) {
                                    }
                                    throw th;
                                }
                            } catch (IOException e4) {
                                e = e4;
                                new StringBuilder("Failed to run command: ").append(e.getMessage());
                                if (dataOutputStream != null) {
                                    try {
                                        dataOutputStream.close();
                                    } catch (IOException e5) {
                                        throw new RuntimeException(e5);
                                    }
                                }
                                if (processM3788a != null) {
                                    try {
                                        processM3788a.exitValue();
                                    } catch (IllegalThreadStateException e6) {
                                        processM3788a.destroy();
                                    }
                                }
                                return false;
                            } catch (InterruptedException e7) {
                                e = e7;
                                new StringBuilder("Failed to run command: ").append(e.getMessage());
                                if (dataOutputStream != null) {
                                    try {
                                        dataOutputStream.close();
                                    } catch (IOException e8) {
                                        throw new RuntimeException(e8);
                                    }
                                }
                                if (processM3788a != null) {
                                    try {
                                        processM3788a.exitValue();
                                    } catch (IllegalThreadStateException e9) {
                                        processM3788a.destroy();
                                    }
                                }
                                return false;
                            }
                        }
                        dataOutputStream.writeBytes(str + "\n");
                        dataOutputStream.writeBytes("echo \"rc:\" $?\n");
                        dataOutputStream.writeBytes("exit\n");
                        dataOutputStream.flush();
                        InputStream inputStream = processM3788a.getInputStream();
                        InputStream errorStream = processM3788a.getErrorStream();
                        C1572u c1572u = null;
                        C1572u c1572u2 = null;
                        if (z) {
                            c1572u = new C1572u(inputStream, this.f4660a, 0);
                            c1572u.start();
                            c1572u2 = new C1572u(errorStream, this.f4660a, 1);
                            c1572u2.start();
                        }
                        if (num != null) {
                            long jCurrentTimeMillis = System.currentTimeMillis() + ((long) num.intValue());
                            while (m3790a(processM3788a)) {
                                if (System.currentTimeMillis() > jCurrentTimeMillis) {
                                    try {
                                        dataOutputStream.close();
                                        if (processM3788a != null) {
                                            try {
                                                processM3788a.exitValue();
                                            } catch (IllegalThreadStateException e10) {
                                                processM3788a.destroy();
                                            }
                                        }
                                        return true;
                                    } catch (IOException e11) {
                                        throw new RuntimeException(e11);
                                    }
                                }
                            }
                        } else {
                            processM3788a.waitFor();
                        }
                        if (z) {
                            c1572u.m3797a();
                            c1572u2.m3797a();
                        } else {
                            this.f4660a[0] = m3789a(inputStream);
                            this.f4660a[1] = m3789a(errorStream);
                            m3791b(inputStream);
                            m3791b(errorStream);
                        }
                        new StringBuilder("Process returned with ").append(processM3788a.exitValue());
                        new StringBuilder("Process stdout was: ").append(this.f4660a[0]).append("; stderr: ").append(this.f4660a[1]);
                        if (processM3788a.exitValue() != 0) {
                            try {
                                dataOutputStream.close();
                                if (processM3788a != null) {
                                    try {
                                        processM3788a.exitValue();
                                    } catch (IllegalThreadStateException e12) {
                                        processM3788a.destroy();
                                    }
                                }
                                return false;
                            } catch (IOException e13) {
                                throw new RuntimeException(e13);
                            }
                        }
                        try {
                            dataOutputStream.close();
                            if (processM3788a != null) {
                                try {
                                    processM3788a.exitValue();
                                } catch (IllegalThreadStateException e14) {
                                    processM3788a.destroy();
                                }
                            }
                            return true;
                        } catch (IOException e15) {
                            throw new RuntimeException(e15);
                        }
                    } catch (FileNotFoundException e16) {
                        e = e16;
                        dataOutputStream = null;
                        process = processM3788a;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (dataOutputStream != null) {
                        try {
                            dataOutputStream.close();
                        } catch (IOException e17) {
                            throw new RuntimeException(e17);
                        }
                    }
                    if (processM3788a != null) {
                        try {
                            processM3788a.exitValue();
                        } catch (IllegalThreadStateException e18) {
                            processM3788a.destroy();
                        }
                    }
                    throw th;
                }
            } catch (FileNotFoundException e19) {
                e = e19;
                dataOutputStream = null;
                process = null;
            }
        } catch (IOException e20) {
            e = e20;
            dataOutputStream = null;
        } catch (InterruptedException e21) {
            e = e21;
            dataOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            dataOutputStream = null;
            if (dataOutputStream != null) {
            }
            if (processM3788a != null) {
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m3795a(String str, String[] strArr, Integer num, boolean z) {
        return m3794a(str, strArr, num, null, z);
    }

    /* JADX INFO: renamed from: b */
    public final String m3796b() {
        return this.f4660a[1];
    }
}
