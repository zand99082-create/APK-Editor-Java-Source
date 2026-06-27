package com.gmail.heagoo.common;

import android.util.Log;
import com.github.megatronking.stringfog.xor.StringFogImpl;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/* JADX INFO: renamed from: com.gmail.heagoo.common.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1554c implements ccc {

    /* JADX INFO: renamed from: a */
    private String[] f4632a = new String[2];

    /* JADX INFO: renamed from: a */
    private static String m3752a(InputStream inputStream) throws IOException {
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
    private static boolean m3753a(Process process) {
        try {
            process.exitValue();
            return false;
        } catch (IllegalThreadStateException e) {
            return true;
        }
    }

    /* JADX INFO: renamed from: b */
    private static void m3754b(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
            }
        }
    }

    @Override // com.gmail.heagoo.common.ccc
    /* JADX INFO: renamed from: a */
    public final String mo3755a() {
        return this.f4632a[0];
    }

    /* JADX INFO: renamed from: a */
    public final boolean m3756a(Object obj, String[] strArr, Integer num, boolean z) {
        Process processExec;
        Process process = null;
        try {
            try {
                try {
                    if (obj instanceof String) {
                        processExec = Runtime.getRuntime().exec((String) obj, strArr);
                    } else {
                        processExec = Runtime.getRuntime().exec((String[]) obj);
                    }
                    InputStream inputStream = processExec.getInputStream();
                    InputStream errorStream = processExec.getErrorStream();
                    C1555d c1555d = null;
                    C1555d c1555d2 = null;
                    if (z) {
                        c1555d = new C1555d(inputStream, this.f4632a, 0);
                        c1555d.start();
                        c1555d2 = new C1555d(errorStream, this.f4632a, 1);
                        c1555d2.start();
                    }
                    if (num != null) {
                        long jCurrentTimeMillis = System.currentTimeMillis() + ((long) num.intValue());
                        do {
                            Thread.sleep(20L);
                            if (m3753a(processExec)) {
                            }
                        } while (System.currentTimeMillis() <= jCurrentTimeMillis);
                        Log.w("CommandRunner", "Process doesn't seem to stop on it's own, assuming it's hanging");
                        this.f4632a[1] = "Timeout!";
                        if (processExec != null) {
                            try {
                                processExec.exitValue();
                            } catch (IllegalThreadStateException e) {
                                processExec.destroy();
                            }
                        }
                        return false;
                    }
                    processExec.waitFor();
                    if (z) {
                        c1555d.m3761a();
                        c1555d2.m3761a();
                    } else {
                        this.f4632a[0] = m3752a(inputStream);
                        this.f4632a[1] = m3752a(errorStream);
                        m3754b(inputStream);
                        m3754b(errorStream);
                    }
                    if (processExec.exitValue() != 0) {
                        if (processExec != null) {
                            try {
                                processExec.exitValue();
                            } catch (IllegalThreadStateException e2) {
                                processExec.destroy();
                            }
                        }
                        return false;
                    }
                    if (processExec != null) {
                        try {
                            processExec.exitValue();
                        } catch (IllegalThreadStateException e3) {
                            processExec.destroy();
                        }
                    }
                    return true;
                } catch (Throwable th) {
                    if (0 != 0) {
                        try {
                            process.exitValue();
                        } catch (IllegalThreadStateException e4) {
                            process.destroy();
                        }
                    }
                    throw th;
                }
            } catch (IOException e5) {
                Log.e("DEBUG", "Failed to run command", e5);
                if (0 != 0) {
                    try {
                        process.exitValue();
                    } catch (IllegalThreadStateException e6) {
                        process.destroy();
                    }
                }
                return false;
            }
        } catch (FileNotFoundException e7) {
            Log.e("DEBUG", "Failed to run command", e7);
            if (0 != 0) {
                try {
                    process.exitValue();
                } catch (IllegalThreadStateException e8) {
                    process.destroy();
                }
            }
            return false;
        } catch (InterruptedException e9) {
            if (0 != 0) {
                try {
                    process.exitValue();
                } catch (IllegalThreadStateException e10) {
                    process.destroy();
                }
            }
            return false;
        }
    }

    @Override // com.gmail.heagoo.common.ccc
    /* JADX INFO: renamed from: a */
    public final boolean mo3757a(String str, String[] strArr, Integer num) {
        return m3756a((Object) str, (String[]) null, num, false);
    }

    @Override // com.gmail.heagoo.common.ccc
    /* JADX INFO: renamed from: a */
    public final boolean mo3758a(String[] strArr, Integer num, boolean z) {
        C1555d c1555d;
        C1555d c1555d2;
        boolean z2 = false;
        try {
            try {
                Process processExec = Runtime.getRuntime().exec(strArr);
                InputStream inputStream = processExec.getInputStream();
                InputStream errorStream = processExec.getErrorStream();
                if (z) {
                    C1555d c1555d3 = new C1555d(inputStream, this.f4632a, 0);
                    c1555d3.start();
                    C1555d c1555d4 = new C1555d(errorStream, this.f4632a, 1);
                    c1555d4.start();
                    c1555d = c1555d4;
                    c1555d2 = c1555d3;
                } else {
                    c1555d = null;
                    c1555d2 = null;
                }
                try {
                    if (num != null) {
                        long jCurrentTimeMillis = System.currentTimeMillis() + ((long) num.intValue());
                        do {
                            Thread.sleep(20L);
                            m3753a(processExec);
                        } while (System.currentTimeMillis() <= jCurrentTimeMillis);
                        Log.w("CommandRunner", "Process doesn't seem to stop on it's own, assuming it's hanging");
                        this.f4632a[1] = "Timeout!";
                        if (processExec == null) {
                            return false;
                        }
                        try {
                            processExec.exitValue();
                            return false;
                        } catch (IllegalThreadStateException e) {
                            processExec.destroy();
                            return false;
                        }
                    }
                    processExec.waitFor();
                    if (z) {
                        c1555d2.m3761a();
                        c1555d.m3761a();
                    } else {
                        this.f4632a[0] = m3752a(inputStream);
                        this.f4632a[1] = m3752a(errorStream);
                        m3754b(inputStream);
                        m3754b(errorStream);
                    }
                    if (processExec.exitValue() == 0) {
                        if (processExec != null) {
                            try {
                                processExec.exitValue();
                            } catch (IllegalThreadStateException e2) {
                                processExec.destroy();
                            }
                        }
                        return true;
                    }
                    if (processExec == null) {
                        return false;
                    }
                    try {
                        processExec.exitValue();
                        return false;
                    } catch (IllegalThreadStateException e3) {
                        processExec.destroy();
                        return false;
                    }
                } catch (FileNotFoundException e4) {
                    e = e4;
                    z2 = false;
                } catch (IOException e5) {
                    e = e5;
                    z2 = false;
                    Log.e("DEBUG", "Failed to run command", e);
                    return z2;
                }
            } catch (FileNotFoundException e6) {
                e = e6;
            } catch (IOException e7) {
                e = e7;
            }
            Log.e("DEBUG", "Failed to run command", e);
            return z2;
        } catch (InterruptedException e8) {
            return false;
        }
    }

    @Override // com.gmail.heagoo.common.ccc
    /* JADX INFO: renamed from: b */
    public final String mo3759b() {
        return this.f4632a[1];
    }
}
