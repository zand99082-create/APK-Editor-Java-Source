package com.gmail.heagoo.apkeditor.util;

import android.content.Context;
import com.gmail.heagoo.apkeditor.p096e.C1236ad;
import com.gmail.heagoo.apkeditor.pro.R;
import com.gmail.heagoo.common.C1570s;
import com.gmail.heagoo.common.C1574w;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.util.l */
/* JADX INFO: loaded from: classes.dex */
public final class C1471l extends AbstractC1465f {

    /* JADX INFO: renamed from: e */
    private Map f4367e;

    /* JADX INFO: renamed from: f */
    private Map f4368f;

    /* JADX INFO: renamed from: g */
    private Map f4369g;

    public C1471l(String str, String str2) throws Throwable {
        super(str, str2);
        this.f4367e = new HashMap();
        this.f4368f = new HashMap();
        this.f4369g = new HashMap();
        try {
            m3611e();
        } catch (IOException e) {
        }
    }

    /* JADX INFO: renamed from: e */
    private void m3611e() throws Throwable {
        BufferedReader bufferedReader;
        try {
            Pattern patternCompile = Pattern.compile("^(.+): error: File is case-insensitive equivalent to: (.+)");
            bufferedReader = new BufferedReader(new StringReader(this.f4351b));
            try {
                for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                    Matcher matcher = patternCompile.matcher(line);
                    if (matcher.find()) {
                        this.f4367e.put(matcher.group(1), matcher.group(2));
                    }
                }
                bufferedReader.close();
            } catch (Throwable th) {
                th = th;
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            bufferedReader = null;
        }
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
        return !this.f4367e.isEmpty();
    }

    @Override // com.gmail.heagoo.apkeditor.util.AbstractC1465f
    /* JADX INFO: renamed from: b */
    public final void mo3602b() {
        boolean z;
        String str = this.f4350a + "res/values/public.xml";
        try {
            List listM3798a = new C1574w(str).m3798a();
            for (int i = 0; i < listM3798a.size(); i++) {
                C1236ad c1236adM3156a = C1236ad.m3156a((String) listM3798a.get(i));
                if (c1236adM3156a != null) {
                    String str2 = c1236adM3156a.f3590a;
                    String str3 = c1236adM3156a.f3591b;
                    String lowerCase = str3.toLowerCase();
                    Set hashSet = (Set) this.f4368f.get(str2);
                    if (hashSet == null) {
                        hashSet = new HashSet();
                        this.f4368f.put(str2, hashSet);
                    }
                    if (hashSet.contains(lowerCase)) {
                        z = false;
                    } else {
                        hashSet.add(lowerCase);
                        z = true;
                    }
                    if (!z) {
                        String str4 = str3 + "_" + C1570s.m3787a(6);
                        List arrayList = (List) this.f4369g.get(str2);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            this.f4369g.put(str2, arrayList);
                        }
                        arrayList.add(new C1484y(str2, str3, str4));
                        c1236adM3156a.f3591b = str4;
                        listM3798a.set(i, c1236adM3156a.toString());
                    }
                }
            }
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(str));
            StringBuilder sb = new StringBuilder();
            Iterator it = listM3798a.iterator();
            while (it.hasNext()) {
                sb.append((String) it.next());
                sb.append("\n");
            }
            bufferedOutputStream.write(sb.toString().getBytes());
            bufferedOutputStream.close();
            this.f4352c.add(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (Map.Entry entry : this.f4369g.entrySet()) {
            m3600a((String) entry.getKey(), (List) entry.getValue());
        }
        if (this.f4369g.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = this.f4369g.values().iterator();
        while (it2.hasNext()) {
            arrayList2.addAll((List) it2.next());
        }
        m3598a(arrayList2);
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
