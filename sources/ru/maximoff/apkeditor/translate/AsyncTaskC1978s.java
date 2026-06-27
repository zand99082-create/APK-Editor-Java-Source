package ru.maximoff.apkeditor.translate;

import android.content.Context;
import android.os.AsyncTask;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: ru.maximoff.apkeditor.translate.s */
/* JADX INFO: loaded from: classes.dex */
public class AsyncTaskC1978s extends AsyncTask {

    /* JADX INFO: renamed from: a */
    private Context f5367a;

    /* JADX INFO: renamed from: b */
    private String f5368b;

    /* JADX INFO: renamed from: c */
    private String f5369c;

    /* JADX INFO: renamed from: d */
    private String f5370d;

    /* JADX INFO: renamed from: e */
    private String f5371e;

    /* JADX INFO: renamed from: f */
    private InterfaceC1963d f5372f;

    public AsyncTaskC1978s(Context context, String str, String str2, String str3, String str4, InterfaceC1963d interfaceC1963d) {
        this.f5367a = context;
        this.f5368b = str3;
        this.f5369c = str;
        this.f5370d = str2;
        this.f5371e = str4;
        this.f5372f = interfaceC1963d;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0126 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected String m4387a(String... strArr) throws Throwable {
        BufferedReader bufferedReader;
        if (TranslateActivity.f5292a) {
            return (String) null;
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) null;
        BufferedReader bufferedReader2 = (BufferedReader) null;
        try {
            httpURLConnection = (HttpURLConnection) new URL(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("https://translate.yandex.net/api/v1/tr.json/translate?srv=android&lang=").append(this.f5369c.equals("auto") ? this.f5370d : new StringBuffer().append(new StringBuffer().append(this.f5369c).append('-').toString()).append(this.f5370d).toString()).toString()).append("&text=").toString()).append(C1961b.m4368a(this.f5368b)).toString()).openConnection();
            httpURLConnection.setRequestProperty("User-Agent", this.f5371e);
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setConnectTimeout(5000);
            httpURLConnection.connect();
            InputStream inputStream = httpURLConnection.getInputStream();
            StringBuffer stringBuffer = new StringBuffer();
            if (inputStream == null) {
                String str = (String) null;
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
                return str;
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
                    try {
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
                        return (String) null;
                    } catch (Throwable th) {
                        th = th;
                        bufferedReader2 = bufferedReader;
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        if (bufferedReader2 != null) {
                            try {
                                bufferedReader2.close();
                            } catch (IOException e4) {
                                e4.printStackTrace();
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bufferedReader2 = bufferedReader;
                    if (httpURLConnection != null) {
                    }
                    if (bufferedReader2 != null) {
                    }
                    throw th;
                }
            }
            inputStream.close();
            if (stringBuffer.length() == 0) {
                String str2 = (String) null;
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
                return str2;
            }
            String string = stringBuffer.toString();
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e6) {
                    e6.printStackTrace();
                }
            }
            return string;
        } catch (Exception e7) {
            e = e7;
            bufferedReader = bufferedReader2;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX INFO: renamed from: a */
    protected void m4388a(String str) {
        if (str == null || TranslateActivity.f5292a) {
            this.f5372f.mo4377b((String) null);
        } else {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (((Integer) jSONObject.get("code")).intValue() != 200) {
                    this.f5372f.mo4377b((String) jSONObject.get("message"));
                } else {
                    String string = "";
                    JSONArray jSONArray = (JSONArray) jSONObject.get("text");
                    for (int i = 0; i < jSONArray.length(); i++) {
                        string = new StringBuffer().append(string).append((String) jSONArray.get(i)).toString();
                    }
                    if (string.length() > 0) {
                        this.f5372f.mo4376a(string);
                    } else {
                        this.f5372f.mo4377b((String) null);
                    }
                }
            } catch (Exception e) {
                this.f5372f.mo4377b(e.getMessage());
                e.printStackTrace();
            }
        }
        super.onPostExecute(str);
    }

    @Override // android.os.AsyncTask
    protected Object doInBackground(Object[] objArr) {
        return m4387a((String[]) objArr);
    }

    @Override // android.os.AsyncTask
    protected void onPostExecute(Object obj) {
        m4388a((String) obj);
    }

    @Override // android.os.AsyncTask
    protected void onPreExecute() {
        super.onPreExecute();
    }
}
