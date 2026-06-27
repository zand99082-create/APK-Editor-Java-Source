package ru.maximoff.apkeditor.translate;

import android.content.Context;
import android.os.AsyncTask;
import com.github.megatronking.stringfog.xor.StringFogImpl;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;

/* JADX INFO: renamed from: ru.maximoff.apkeditor.translate.a */
/* JADX INFO: loaded from: classes.dex */
public class AsyncTaskC1960a extends AsyncTask {

    /* JADX INFO: renamed from: a */
    private Context f5318a;

    /* JADX INFO: renamed from: b */
    private String f5319b;

    /* JADX INFO: renamed from: c */
    private String f5320c;

    /* JADX INFO: renamed from: d */
    private String f5321d;

    /* JADX INFO: renamed from: e */
    private String f5322e;

    /* JADX INFO: renamed from: f */
    private InterfaceC1963d f5323f;

    /* JADX INFO: renamed from: g */
    private Map f5324g = new HashMap();

    public AsyncTaskC1960a(Context context, String str, String str2, String str3, String str4, InterfaceC1963d interfaceC1963d) {
        this.f5318a = context;
        this.f5319b = str3;
        this.f5320c = str;
        this.f5321d = str2;
        this.f5322e = str4;
        this.f5323f = interfaceC1963d;
    }

    /* JADX INFO: renamed from: a */
    private String m4363a() {
        try {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(0, this.f5319b);
            jSONArray.put(1, this.f5320c);
            jSONArray.put(2, this.f5321d);
            jSONArray.put(3, true);
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.put(0, (Object) null);
            JSONArray jSONArray3 = new JSONArray();
            jSONArray3.put(0, jSONArray);
            jSONArray3.put(1, jSONArray2);
            JSONArray jSONArray4 = new JSONArray();
            jSONArray4.put(0, "MkEWBc");
            jSONArray4.put(1, jSONArray3.toString());
            jSONArray4.put(2, (Object) null);
            jSONArray4.put(3, "generic");
            JSONArray jSONArray5 = new JSONArray();
            jSONArray5.put(0, jSONArray4);
            JSONArray jSONArray6 = new JSONArray();
            jSONArray6.put(0, jSONArray5);
            return jSONArray6.toString();
        } catch (Exception e) {
            return (String) null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x014e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected String m4364a(String... strArr) throws Throwable {
        BufferedReader bufferedReader;
        if (TranslateActivity.f5292a) {
            return (String) null;
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) null;
        BufferedReader bufferedReader2 = (BufferedReader) null;
        try {
            String strM4363a = m4363a();
            if (strM4363a == null) {
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
            this.f5324g.put("_reqid", String.valueOf(C1961b.m4367a(100000, 999999)));
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : this.f5324g.entrySet()) {
                arrayList.add(new StringBuffer().append(new StringBuffer().append((String) entry.getKey()).append("=").toString()).append((String) entry.getValue()).toString());
            }
            byte[] bytes = new StringBuffer().append(new StringBuffer().append("f.req=").append(C1961b.m4368a(strM4363a)).toString()).append("&").toString().getBytes(StringFogImpl.CHARSET_NAME_UTF_8);
            httpURLConnection = (HttpURLConnection) new URL(new StringBuffer().append("https://translate.google.com/_/TranslateWebserverUi/data/batchexecute?").append(C1961b.m4369a(arrayList, "&")).toString()).openConnection();
            httpURLConnection.setRequestProperty("User-Agent", this.f5322e);
            httpURLConnection.setRequestProperty("X-Same-Domain", "1");
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded;charset=utf-8");
            httpURLConnection.setRequestProperty("X-Requested-With", "XMLHttpRequest");
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setConnectTimeout(5000);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.getOutputStream().write(bytes);
            httpURLConnection.connect();
            InputStream inputStream = httpURLConnection.getInputStream();
            StringBuffer stringBuffer = new StringBuffer();
            if (inputStream == null) {
                String str2 = (String) null;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                if (bufferedReader2 != null) {
                    try {
                        bufferedReader2.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                }
                return str2;
            }
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    stringBuffer.append(new StringBuffer().append(line).append("\n").toString());
                } catch (Exception e3) {
                    e = e3;
                    try {
                        e.printStackTrace();
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
                            } catch (IOException e5) {
                                e5.printStackTrace();
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
                String str3 = (String) null;
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
                return str3;
            }
            String string = stringBuffer.toString();
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e7) {
                    e7.printStackTrace();
                }
            }
            return string;
        } catch (Exception e8) {
            e = e8;
            bufferedReader = bufferedReader2;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX INFO: renamed from: a */
    protected void m4365a(String str) {
        JSONArray jSONArray;
        if (str == null || TranslateActivity.f5292a) {
            this.f5323f.mo4377b((String) null);
        } else {
            try {
                if (str.length() > 0) {
                    String string = "";
                    String[] strArrSplit = str.split("\n", 4);
                    try {
                        jSONArray = new JSONArray(strArrSplit[3].substring(0, Integer.parseInt(strArrSplit[2], 10) - 2));
                    } catch (Exception e) {
                        jSONArray = new JSONArray(C1961b.m4370a((String[]) Arrays.copyOfRange(strArrSplit, 2, strArrSplit.length), ""));
                    }
                    JSONArray jSONArray2 = (JSONArray) ((JSONArray) ((JSONArray) new JSONArray((String) ((JSONArray) jSONArray.get(0)).get(2)).get(1)).get(0)).get(0);
                    if (jSONArray2.length() <= 5 || jSONArray2.isNull(5)) {
                        this.f5323f.mo4376a((String) jSONArray2.get(0));
                    } else {
                        JSONArray jSONArray3 = (JSONArray) jSONArray2.get(5);
                        for (int i = 0; i < jSONArray3.length(); i++) {
                            JSONArray jSONArray4 = (JSONArray) jSONArray3.get(i);
                            if (i > 0 && !string.endsWith("\n")) {
                                string = new StringBuffer().append(string).append(" ").toString();
                            }
                            string = new StringBuffer().append(string).append((String) jSONArray4.get(0)).toString();
                        }
                        this.f5323f.mo4376a(string);
                    }
                } else {
                    this.f5323f.mo4377b((String) null);
                }
            } catch (Exception e2) {
                this.f5323f.mo4377b(e2.getMessage());
            }
        }
        super.onPostExecute(str);
    }

    /* JADX INFO: renamed from: a */
    public void m4366a(Map map) {
        this.f5324g = map;
    }

    @Override // android.os.AsyncTask
    protected Object doInBackground(Object[] objArr) {
        return m4364a((String[]) objArr);
    }

    @Override // android.os.AsyncTask
    protected void onPostExecute(Object obj) {
        m4365a((String) obj);
    }

    @Override // android.os.AsyncTask
    protected void onPreExecute() {
        super.onPreExecute();
    }
}
