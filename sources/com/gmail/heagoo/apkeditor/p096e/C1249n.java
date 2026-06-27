package com.gmail.heagoo.apkeditor.p096e;

import com.gmail.heagoo.apkeditor.ApkInfoActivity;
import com.gmail.heagoo.apkeditor.pro.R;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipFile;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.e.n */
/* JADX INFO: loaded from: classes.dex */
final class C1249n extends AbstractC1242g {

    /* JADX INFO: renamed from: b */
    private C1235ac f3621b;

    /* JADX INFO: renamed from: e */
    private boolean f3624e = false;

    /* JADX INFO: renamed from: f */
    private boolean f3625f = false;

    /* JADX INFO: renamed from: c */
    private List f3622c = new ArrayList();

    /* JADX INFO: renamed from: d */
    private List f3623d = new ArrayList();

    /* JADX INFO: renamed from: g */
    private List f3626g = new ArrayList();

    C1249n() {
        this.f3626g.add("[/MATCH_ASSIGN]");
        this.f3626g.add("TARGET:");
        this.f3626g.add("MATCH:");
        this.f3626g.add("REGEX:");
        this.f3626g.add("ASSIGN:");
        this.f3626g.add("DOTALL:");
    }

    /* JADX INFO: renamed from: a */
    private static String m3196a(String str, List list) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= list.size()) {
                return str;
            }
            str = str.replace("${GROUP" + (i2 + 1) + "}", (CharSequence) list.get(i2));
            i = i2 + 1;
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m3197a(ApkInfoActivity apkInfoActivity, InterfaceC1237b interfaceC1237b, String str) {
        try {
            String strA = m3187a(apkInfoActivity.m2722i() + "/" + str);
            String str2 = (String) this.f3622c.get(0);
            Matcher matcher = (this.f3625f ? Pattern.compile(str2.trim(), 32) : Pattern.compile(str2.trim())).matcher(strA);
            if (!matcher.find(0)) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            int iGroupCount = matcher.groupCount();
            if (iGroupCount > 0) {
                for (int i = 0; i < iGroupCount; i++) {
                    arrayList.add(matcher.group(i + 1));
                }
            }
            Iterator it = this.f3623d.iterator();
            while (it.hasNext()) {
                String strTrim = ((String) it.next()).trim();
                int iIndexOf = strTrim.indexOf(61);
                if (iIndexOf != -1) {
                    String strSubstring = strTrim.substring(0, iIndexOf);
                    String strM3196a = m3196a(strTrim.substring(iIndexOf + 1), arrayList);
                    interfaceC1237b.mo3163a(strSubstring, strM3196a);
                    interfaceC1237b.mo3164a("%s=\"%s\"", false, strSubstring, strM3196a);
                }
            }
            return true;
        } catch (IOException e) {
            interfaceC1237b.mo3162a(R.string.patch_error_read_from, str);
            return false;
        }
    }

    @Override // com.gmail.heagoo.apkeditor.p096e.AbstractC1242g
    /* JADX INFO: renamed from: a */
    public final String mo3186a(ApkInfoActivity apkInfoActivity, ZipFile zipFile, InterfaceC1237b interfaceC1237b) {
        m3180a(interfaceC1237b, this.f3622c);
        String strM3153b = this.f3621b.m3153b();
        while (strM3153b != null && !m3197a(apkInfoActivity, interfaceC1237b, strM3153b)) {
            strM3153b = this.f3621b.m3153b();
        }
        return null;
    }

    @Override // com.gmail.heagoo.apkeditor.p096e.AbstractC1242g
    /* JADX INFO: renamed from: a */
    public final void mo3189a(C1238c c1238c, InterfaceC1237b interfaceC1237b) {
        this.f3603a = c1238c.m3170a();
        String line = c1238c.readLine();
        while (line != null) {
            String strTrim = line.trim();
            if ("[/MATCH_ASSIGN]".equals(strTrim)) {
                return;
            }
            if (super.m3192a(strTrim, c1238c)) {
                line = c1238c.readLine();
            } else {
                if ("TARGET:".equals(strTrim)) {
                    this.f3621b = new C1235ac(interfaceC1237b, c1238c.readLine().trim(), c1238c.m3170a());
                } else if ("REGEX:".equals(strTrim)) {
                    this.f3624e = Boolean.valueOf(c1238c.readLine().trim()).booleanValue();
                } else if ("DOTALL:".equals(strTrim)) {
                    this.f3625f = Boolean.valueOf(c1238c.readLine().trim()).booleanValue();
                } else if ("MATCH:".equals(strTrim)) {
                    line = m3179a((BufferedReader) c1238c, this.f3622c, true, this.f3626g);
                } else if ("ASSIGN:".equals(strTrim)) {
                    line = m3179a((BufferedReader) c1238c, this.f3623d, false, this.f3626g);
                } else {
                    interfaceC1237b.mo3162a(R.string.patch_error_cannot_parse, Integer.valueOf(c1238c.m3170a()), strTrim);
                }
                line = c1238c.readLine();
            }
        }
    }

    @Override // com.gmail.heagoo.apkeditor.p096e.AbstractC1242g
    /* JADX INFO: renamed from: a */
    public final boolean mo3190a() {
        return this.f3621b.m3152a();
    }

    @Override // com.gmail.heagoo.apkeditor.p096e.AbstractC1242g
    /* JADX INFO: renamed from: a */
    public final boolean mo3191a(InterfaceC1237b interfaceC1237b) {
        if (this.f3621b == null || !this.f3621b.m3154c()) {
            return false;
        }
        if (this.f3622c.isEmpty()) {
            interfaceC1237b.mo3162a(R.string.patch_error_no_match_content, new Object[0]);
            return false;
        }
        if (this.f3624e) {
            return true;
        }
        interfaceC1237b.mo3162a(R.string.patch_error_regex_not_true, new Object[0]);
        return false;
    }
}
