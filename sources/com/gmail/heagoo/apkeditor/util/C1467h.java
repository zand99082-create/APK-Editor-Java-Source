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
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.util.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1467h extends AbstractC1465f {

    /* JADX INFO: renamed from: e */
    private int f4357e;

    /* JADX INFO: renamed from: f */
    private List f4358f;

    /* JADX INFO: renamed from: g */
    private Map f4359g;

    public C1467h(String str, String str2) throws Throwable {
        super(str, str2);
        this.f4357e = 0;
        this.f4358f = new ArrayList();
        this.f4359g = new HashMap();
        try {
            m3606e();
        } catch (IOException e) {
        }
    }

    /* JADX INFO: renamed from: a */
    private C1470k m3605a(String str) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.f4358f.size()) {
                return null;
            }
            C1470k c1470k = (C1470k) this.f4358f.get(i2);
            if (str.equals(c1470k.f4364a)) {
                return c1470k;
            }
            i = i2 + 1;
        }
    }

    /* JADX INFO: renamed from: e */
    private void m3606e() throws Throwable {
        Pattern patternCompile;
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2 = null;
        try {
            patternCompile = Pattern.compile("^(.+):([0-9]+): Tag (.+) attribute (.+) has invalid character '");
            bufferedReader = new BufferedReader(new StringReader(this.f4351b));
        } catch (Throwable th) {
            th = th;
        }
        try {
            String line = bufferedReader.readLine();
            while (line != null) {
                Matcher matcher = patternCompile.matcher(line);
                if (matcher.find()) {
                    String strSubstring = line.substring(matcher.start(1), matcher.end(1));
                    String strSubstring2 = line.substring(matcher.start(2), matcher.end(2));
                    String strSubstring3 = line.substring(matcher.start(3), matcher.end(3));
                    String strSubstring4 = line.substring(matcher.start(4), matcher.end(4));
                    try {
                        int iIntValue = Integer.valueOf(strSubstring2).intValue();
                        C1470k c1470kM3605a = m3605a(strSubstring);
                        if (c1470kM3605a == null) {
                            this.f4358f.add(new C1470k(this.f4350a, strSubstring, iIntValue, strSubstring3, strSubstring4, (byte) 0));
                        } else {
                            c1470kM3605a.f4365b.add(new C1469j(iIntValue > 0 ? iIntValue - 1 : 0, strSubstring3, strSubstring4, (byte) 0));
                        }
                    } catch (Exception e) {
                    }
                }
                line = bufferedReader.readLine();
            }
            bufferedReader.close();
            for (int i = 0; i < this.f4358f.size(); i++) {
                ((C1470k) this.f4358f.get(i)).m3610a();
            }
        } catch (Throwable th2) {
            th = th2;
            bufferedReader2 = bufferedReader;
            if (bufferedReader2 != null) {
                bufferedReader2.close();
            }
            throw th;
        }
    }

    @Override // com.gmail.heagoo.apkeditor.util.AbstractC1465f
    /* JADX INFO: renamed from: a */
    public final String mo3599a(Context context) {
        return String.format(context.getString(R.string.str_num_modified_file), Integer.valueOf(this.f4357e));
    }

    @Override // com.gmail.heagoo.apkeditor.util.AbstractC1465f
    /* JADX INFO: renamed from: a */
    public final boolean mo3601a() {
        return this.f4358f.size() > 0;
    }

    @Override // com.gmail.heagoo.apkeditor.util.AbstractC1465f
    /* JADX INFO: renamed from: b */
    public final void mo3602b() throws Throwable {
        BufferedWriter bufferedWriter;
        boolean z;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.f4358f.size()) {
                return;
            }
            C1470k c1470k = (C1470k) this.f4358f.get(i2);
            BufferedWriter bufferedWriter2 = null;
            try {
                List listM3798a = new C1574w(c1470k.f4364a).m3798a();
                for (int i3 = 0; i3 < listM3798a.size(); i3++) {
                    C1468i c1468iM3608a = c1470k.m3608a(i3);
                    if (c1468iM3608a != null) {
                        String str = c1470k.f4364a;
                        String str2 = (String) listM3798a.get(i3);
                        List list = c1468iM3608a.f4361b;
                        String[] strArrSplit = str2.split(" ");
                        for (int i4 = 0; i4 < strArrSplit.length; i4++) {
                            String[] strArrSplit2 = strArrSplit[i4].split("=");
                            if (strArrSplit2.length == 2) {
                                String str3 = strArrSplit2[0];
                                Iterator it = list.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        z = false;
                                        break;
                                    }
                                    String str4 = (String) it.next();
                                    if (!str3.equals(str4)) {
                                        if (str3.endsWith(":" + str4)) {
                                            z = true;
                                            break;
                                        }
                                    } else {
                                        z = true;
                                        break;
                                    }
                                }
                                if (z) {
                                    String[] strArr = new String[2];
                                    StringBuilder sbAppend = new StringBuilder().append(strArrSplit2[0]).append("=");
                                    String str5 = strArrSplit2[1];
                                    int i5 = 0;
                                    String str6 = "";
                                    if (str5.startsWith("\"")) {
                                        i5 = 1;
                                        str6 = "\"";
                                    }
                                    int iLastIndexOf = str5.lastIndexOf("\"");
                                    if (iLastIndexOf != -1) {
                                        String strSubstring = str5.substring(iLastIndexOf);
                                        if (iLastIndexOf > i5) {
                                            String strSubstring2 = str5.substring(i5, iLastIndexOf);
                                            String strM3584b = C1463d.m3584b(strSubstring2);
                                            strArr[0] = strSubstring2;
                                            strArr[1] = strM3584b;
                                            str5 = str6 + strM3584b + strSubstring;
                                        }
                                    }
                                    strArrSplit[i4] = sbAppend.append(str5).toString();
                                    if (strArr[1] != null) {
                                        String str7 = strArr[0];
                                        String str8 = strArr[1];
                                        Map map = (Map) this.f4359g.get(str);
                                        if (map == null) {
                                            map = new HashMap();
                                            this.f4359g.put(str, map);
                                        }
                                        map.put(str7, str8);
                                    }
                                }
                            }
                        }
                        StringBuilder sb = new StringBuilder();
                        for (String str9 : strArrSplit) {
                            sb.append(str9);
                            sb.append(" ");
                        }
                        sb.deleteCharAt(sb.length() - 1);
                        listM3798a.set(i3, sb.toString());
                    }
                }
                bufferedWriter = new BufferedWriter(new FileWriter(c1470k.f4364a));
                try {
                    try {
                        Iterator it2 = listM3798a.iterator();
                        while (it2.hasNext()) {
                            bufferedWriter.write((String) it2.next());
                            bufferedWriter.write("\n");
                        }
                        this.f4357e++;
                        C1463d.m3583a(bufferedWriter);
                    } catch (IOException e) {
                        e = e;
                        e.printStackTrace();
                        C1463d.m3583a(bufferedWriter);
                    }
                } catch (Throwable th) {
                    th = th;
                    bufferedWriter2 = bufferedWriter;
                    C1463d.m3583a(bufferedWriter2);
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
                bufferedWriter = null;
            } catch (Throwable th2) {
                th = th2;
            }
            i = i2 + 1;
        }
    }

    @Override // com.gmail.heagoo.apkeditor.util.AbstractC1465f
    /* JADX INFO: renamed from: c */
    public final boolean mo3603c() {
        return this.f4357e > 0;
    }

    @Override // com.gmail.heagoo.apkeditor.util.AbstractC1465f
    /* JADX INFO: renamed from: d */
    public final Map mo3604d() {
        return this.f4359g;
    }
}
