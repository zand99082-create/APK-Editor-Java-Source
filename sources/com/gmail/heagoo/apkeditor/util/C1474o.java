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

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.util.o */
/* JADX INFO: loaded from: classes.dex */
final class C1474o extends AbstractC1465f {

    /* JADX INFO: renamed from: e */
    private List f4379e;

    C1474o(String str, String str2) throws Throwable {
        super(str, str2);
        this.f4379e = new ArrayList();
        try {
            m3622e();
        } catch (IOException e) {
        }
    }

    /* JADX INFO: renamed from: a */
    private C1475p m3618a(String str) {
        if (!str.startsWith("/")) {
            str = this.f4350a + str;
        }
        for (C1475p c1475p : this.f4379e) {
            if (str.equals(c1475p.f4380a)) {
                return c1475p;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    private void m3619a(C1475p c1475p) {
        int i;
        int iIndexOf;
        try {
            List listM3798a = new C1574w(c1475p.f4380a).m3798a();
            for (C1476q c1476q : c1475p.f4381b) {
                if (c1476q.f4382a > 0) {
                    int i2 = c1476q.f4382a - 1;
                    String str = (String) listM3798a.get(i2);
                    int iIndexOf2 = str.indexOf("type=\"");
                    if (iIndexOf2 != -1 && (iIndexOf = str.indexOf(34, (i = iIndexOf2 + 6))) != -1) {
                        c1476q.f4383b = str.substring(i, iIndexOf);
                    }
                    listM3798a.set(i2, str.replace("name=\"" + c1476q.f4384c + "\"", "name=\"" + c1476q.m3626a() + "\""));
                }
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(c1475p.f4380a));
            Iterator it = listM3798a.iterator();
            while (it.hasNext()) {
                bufferedWriter.write((String) it.next());
                bufferedWriter.write("\n");
            }
            bufferedWriter.close();
            this.f4352c.add(c1475p.f4380a);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    private static boolean m3620a(List list, String str, String str2) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1484y c1484y = (C1484y) it.next();
            if (str.equals(c1484y.f4410a) && str2.equals(c1484y.f4411b)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    private static Map m3621b(List list) {
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1476q c1476q = (C1476q) it.next();
            List arrayList = (List) map.get(c1476q.f4383b);
            if (arrayList == null) {
                arrayList = new ArrayList();
                map.put(c1476q.f4383b, arrayList);
            }
            arrayList.add(new C1484y(c1476q.f4383b, c1476q.f4384c, c1476q.m3626a()));
        }
        return map;
    }

    /* JADX INFO: renamed from: e */
    private void m3622e() throws Throwable {
        BufferedReader bufferedReader = null;
        try {
            Pattern patternCompile = Pattern.compile("^(.+):([0-9]+): error: invalid symbol: '(.+)'");
            BufferedReader bufferedReader2 = new BufferedReader(new StringReader(this.f4351b));
            try {
                String line = bufferedReader2.readLine();
                while (line != null) {
                    Matcher matcher = patternCompile.matcher(line);
                    if (matcher.find()) {
                        String strSubstring = line.substring(matcher.start(1), matcher.end(1));
                        String strSubstring2 = line.substring(matcher.start(2), matcher.end(2));
                        String strSubstring3 = line.substring(matcher.start(3), matcher.end(3));
                        try {
                            int iIntValue = Integer.valueOf(strSubstring2).intValue();
                            C1475p c1475pM3618a = m3618a(strSubstring);
                            if (c1475pM3618a == null) {
                                this.f4379e.add(new C1475p(this.f4350a, strSubstring, iIntValue, strSubstring3, (byte) 0));
                            } else {
                                c1475pM3618a.f4381b.add(new C1476q(c1475pM3618a, iIntValue, strSubstring3, (byte) 0));
                            }
                        } catch (Exception e) {
                        }
                    }
                    line = bufferedReader2.readLine();
                }
                m3592a(bufferedReader2);
            } catch (Throwable th) {
                th = th;
                bufferedReader = bufferedReader2;
                m3592a(bufferedReader);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: f */
    private List m3623f() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f4379e.iterator();
        while (it.hasNext()) {
            for (C1476q c1476q : ((C1475p) it.next()).f4381b) {
                if (C1476q.m3625a(c1476q) && !m3620a(arrayList, c1476q.f4383b, c1476q.f4384c)) {
                    arrayList.add(new C1484y(c1476q.f4383b, c1476q.f4384c, c1476q.m3626a()));
                }
            }
        }
        return arrayList;
    }

    @Override // com.gmail.heagoo.apkeditor.util.AbstractC1465f
    /* JADX INFO: renamed from: a */
    public final String mo3599a(Context context) {
        StringBuilder sb = new StringBuilder();
        if (this.f4353d > 0) {
            sb.append(String.format(context.getString(R.string.str_num_renamed_file), Integer.valueOf(this.f4353d)));
            sb.append("\n");
        }
        if (!this.f4352c.isEmpty()) {
            sb.append(String.format(context.getString(R.string.str_num_modified_file), Integer.valueOf(this.f4352c.size())));
            sb.append("\n");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    @Override // com.gmail.heagoo.apkeditor.util.AbstractC1465f
    /* JADX INFO: renamed from: a */
    public final boolean mo3601a() {
        return this.f4379e.size() > 0;
    }

    @Override // com.gmail.heagoo.apkeditor.util.AbstractC1465f
    /* JADX INFO: renamed from: b */
    public final void mo3602b() {
        C1475p c1475pM3618a = m3618a(this.f4350a + "res/values/public.xml");
        if (c1475pM3618a != null) {
            m3619a(c1475pM3618a);
        }
        if (c1475pM3618a != null) {
            for (Map.Entry entry : m3621b(c1475pM3618a.f4381b).entrySet()) {
                m3600a((String) entry.getKey(), (List) entry.getValue());
            }
        }
        List listM3623f = m3623f();
        if (listM3623f.isEmpty()) {
            return;
        }
        m3598a(listM3623f);
    }

    @Override // com.gmail.heagoo.apkeditor.util.AbstractC1465f
    /* JADX INFO: renamed from: c */
    public final boolean mo3603c() {
        return this.f4353d > 0 || !this.f4352c.isEmpty();
    }

    @Override // com.gmail.heagoo.apkeditor.util.AbstractC1465f
    /* JADX INFO: renamed from: d */
    public final Map mo3604d() {
        return null;
    }
}
