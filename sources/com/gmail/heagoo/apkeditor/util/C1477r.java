package com.gmail.heagoo.apkeditor.util;

import android.content.Context;
import com.gmail.heagoo.apkeditor.pro.R;
import com.gmail.heagoo.common.C1574w;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.util.r */
/* JADX INFO: loaded from: classes.dex */
public final class C1477r extends AbstractC1465f {

    /* JADX INFO: renamed from: e */
    private int f4386e;

    /* JADX INFO: renamed from: f */
    private Map f4387f;

    /* JADX INFO: renamed from: g */
    private List f4388g;

    public C1477r(String str, String str2) throws Throwable {
        super(str, str2);
        this.f4386e = 0;
        this.f4387f = new HashMap();
        this.f4388g = new ArrayList();
        try {
            m3629e();
        } catch (IOException e) {
        }
    }

    /* JADX INFO: renamed from: a */
    private C1478s m3627a(String str) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.f4388g.size()) {
                return null;
            }
            C1478s c1478s = (C1478s) this.f4388g.get(i2);
            if (str.equals(c1478s.f4389a)) {
                return c1478s;
            }
            i = i2 + 1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00db  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m3628a(String str, Map map) throws Throwable {
        BufferedWriter bufferedWriter;
        boolean z;
        int iIndexOf;
        int i;
        boolean z2 = false;
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                HashMap map2 = new HashMap();
                List listM3798a = new C1574w(str).m3798a();
                int i2 = 1;
                while (i2 < listM3798a.size()) {
                    String str2 = (String) listM3798a.get(i2);
                    int iIndexOf2 = str2.indexOf(60);
                    if (iIndexOf2 == -1 || !str2.endsWith(">")) {
                        z = z2;
                    } else {
                        if (str2.charAt(iIndexOf2 + 1) == '/') {
                            i = iIndexOf2 + 2;
                            iIndexOf = str2.length() - 1;
                        } else {
                            iIndexOf = str2.indexOf(32, iIndexOf2);
                            i = iIndexOf2 + 1;
                        }
                        if (iIndexOf > i) {
                            String strSubstring = str2.substring(i, iIndexOf);
                            if (!strSubstring.matches("^[a-zA-Z0-9._]+$")) {
                                String strSubstring2 = str2.substring(0, i);
                                String strSubstring3 = str2.substring(iIndexOf);
                                String strM3584b = (String) map.get(strSubstring);
                                if (strM3584b == null) {
                                    strM3584b = C1463d.m3584b(strSubstring);
                                    map.put(strSubstring, strM3584b);
                                }
                                map2.put(strSubstring, strM3584b);
                                listM3798a.set(i2, strSubstring2 + strM3584b + strSubstring3);
                                z = true;
                            }
                        }
                    }
                    i2++;
                    z2 = z;
                }
                if (z2) {
                    BufferedWriter bufferedWriter3 = new BufferedWriter(new FileWriter(str));
                    try {
                        Iterator it = listM3798a.iterator();
                        while (it.hasNext()) {
                            bufferedWriter3.write((String) it.next());
                            bufferedWriter3.write("\n");
                        }
                        this.f4387f.put(str, map2);
                        this.f4386e++;
                        bufferedWriter = bufferedWriter3;
                    } catch (IOException e) {
                        e = e;
                        bufferedWriter2 = bufferedWriter3;
                        e.printStackTrace();
                        C1463d.m3583a(bufferedWriter2);
                        return;
                    } catch (Throwable th) {
                        th = th;
                        bufferedWriter2 = bufferedWriter3;
                        C1463d.m3583a(bufferedWriter2);
                        throw th;
                    }
                } else {
                    bufferedWriter = null;
                }
                C1463d.m3583a(bufferedWriter);
            } catch (IOException e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: e */
    private void m3629e() throws Throwable {
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new StringReader(this.f4351b));
        } catch (Throwable th) {
            th = th;
            bufferedReader = null;
        }
        try {
            String line = bufferedReader.readLine();
            while (line != null) {
                int iIndexOf = line.indexOf(": error: Error parsing XML: not well-formed (invalid token)");
                if (iIndexOf > 0) {
                    String strSubstring = line.substring(0, iIndexOf);
                    int iLastIndexOf = strSubstring.lastIndexOf(58);
                    if (iLastIndexOf != -1) {
                        String strSubstring2 = strSubstring.substring(0, iLastIndexOf);
                        try {
                            int iIntValue = Integer.valueOf(strSubstring.substring(iLastIndexOf + 1)).intValue();
                            if (m3627a(strSubstring2) == null) {
                                this.f4388g.add(new C1478s(strSubstring2, iIntValue));
                            }
                        } catch (Exception e) {
                        }
                    }
                }
                line = bufferedReader.readLine();
            }
            bufferedReader.close();
        } catch (Throwable th2) {
            th = th2;
            if (bufferedReader != null) {
                bufferedReader.close();
            }
            throw th;
        }
    }

    @Override // com.gmail.heagoo.apkeditor.util.AbstractC1465f
    /* JADX INFO: renamed from: a */
    public final String mo3599a(Context context) {
        return String.format(context.getString(R.string.str_num_modified_file), Integer.valueOf(this.f4386e));
    }

    @Override // com.gmail.heagoo.apkeditor.util.AbstractC1465f
    /* JADX INFO: renamed from: a */
    public final boolean mo3601a() {
        return this.f4388g.size() > 0;
    }

    @Override // com.gmail.heagoo.apkeditor.util.AbstractC1465f
    /* JADX INFO: renamed from: b */
    public final void mo3602b() throws Throwable {
        HashMap map = new HashMap();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.f4388g.size()) {
                return;
            }
            m3628a(((C1478s) this.f4388g.get(i2)).f4389a, map);
            i = i2 + 1;
        }
    }

    @Override // com.gmail.heagoo.apkeditor.util.AbstractC1465f
    /* JADX INFO: renamed from: c */
    public final boolean mo3603c() {
        return this.f4386e > 0;
    }

    @Override // com.gmail.heagoo.apkeditor.util.AbstractC1465f
    /* JADX INFO: renamed from: d */
    public final Map mo3604d() {
        return this.f4387f;
    }
}
