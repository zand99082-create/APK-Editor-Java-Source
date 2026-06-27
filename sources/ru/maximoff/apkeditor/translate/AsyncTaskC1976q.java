package ru.maximoff.apkeditor.translate;

import android.content.Context;
import android.os.AsyncTask;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: ru.maximoff.apkeditor.translate.q */
/* JADX INFO: loaded from: classes.dex */
public class AsyncTaskC1976q extends AsyncTask {

    /* JADX INFO: renamed from: a */
    private Context f5362a;

    /* JADX INFO: renamed from: b */
    private String f5363b;

    /* JADX INFO: renamed from: d */
    private InterfaceC1977r f5365d;

    /* JADX INFO: renamed from: c */
    private Map f5364c = new HashMap();

    /* JADX INFO: renamed from: e */
    private boolean f5366e = false;

    public AsyncTaskC1976q(Context context, String str) {
        this.f5362a = context;
        this.f5363b = str;
    }

    /* JADX INFO: renamed from: a */
    private String m4382a(String str, String str2) {
        Matcher matcher = Pattern.compile(new StringBuffer().append(new StringBuffer().append("\"").append(str).toString()).append("\":\"([^\"]+)\"").toString()).matcher(str2);
        return !matcher.find() ? "" : matcher.group(1);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ca A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected Boolean m4383a(String... strArr) throws Throwable {
        BufferedReader bufferedReader;
        if (!this.f5366e) {
            return new Boolean(true);
        }
        if (TranslateActivity.f5292a) {
            return new Boolean(false);
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) null;
        BufferedReader bufferedReader2 = (BufferedReader) null;
        try {
            try {
                httpURLConnection = (HttpURLConnection) new URL("https://translate.google.com/?hl=en-US").openConnection();
                httpURLConnection.setRequestProperty("User-Agent", this.f5363b);
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setConnectTimeout(5000);
                httpURLConnection.connect();
                InputStream inputStream = httpURLConnection.getInputStream();
                StringBuffer stringBuffer = new StringBuffer();
                if (inputStream == null) {
                    Boolean bool = new Boolean(false);
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    if (bufferedReader2 != null) {
                        try {
                            bufferedReader2.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    return bool;
                }
                bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        stringBuffer.append(new StringBuffer().append(line).append("\n").toString());
                    } catch (Exception e2) {
                        e = e2;
                        e.printStackTrace();
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e3) {
                                e3.printStackTrace();
                            }
                        }
                        return new Boolean(false);
                    }
                }
                inputStream.close();
                if (stringBuffer.length() == 0) {
                    Boolean bool2 = new Boolean(false);
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e4) {
                            e4.printStackTrace();
                        }
                    }
                    return bool2;
                }
                String string = stringBuffer.toString();
                this.f5364c.put("rpcids", "MkEWBc");
                this.f5364c.put("f.sid", m4382a("FdrFJe", string));
                this.f5364c.put("bl", m4382a("cfb2h", string));
                this.f5364c.put("hl", "en-US");
                this.f5364c.put("soc-app", "1");
                this.f5364c.put("soc-platform", "1");
                this.f5364c.put("soc-device", "1");
                this.f5364c.put("rt", "c");
                Boolean bool3 = new Boolean(true);
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException e5) {
                        e5.printStackTrace();
                    }
                }
                return bool3;
            } catch (Throwable th) {
                th = th;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                if (bufferedReader2 != null) {
                    throw th;
                }
                try {
                    bufferedReader2.close();
                    throw th;
                } catch (IOException e6) {
                    e6.printStackTrace();
                    throw th;
                }
            }
        } catch (Exception e7) {
            e = e7;
            bufferedReader = bufferedReader2;
        } catch (Throwable th2) {
            th = th2;
            if (httpURLConnection != null) {
            }
            if (bufferedReader2 != null) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    protected void m4384a(Boolean bool) {
        if (!bool.booleanValue() || TranslateActivity.f5292a) {
            this.f5365d.mo4380a((String) null);
        } else {
            this.f5365d.mo4381a(this.f5364c);
        }
        super.onPostExecute(bool);
    }

    /* JADX INFO: renamed from: a */
    public void m4385a(InterfaceC1977r interfaceC1977r) {
        this.f5365d = interfaceC1977r;
    }

    /* JADX INFO: renamed from: a */
    public void m4386a(boolean z) {
        this.f5366e = z;
    }

    @Override // android.os.AsyncTask
    protected Object doInBackground(Object[] objArr) {
        return m4383a((String[]) objArr);
    }

    @Override // android.os.AsyncTask
    protected void onPostExecute(Object obj) {
        m4384a((Boolean) obj);
    }

    @Override // android.os.AsyncTask
    protected void onPreExecute() {
        super.onPreExecute();
    }
}
