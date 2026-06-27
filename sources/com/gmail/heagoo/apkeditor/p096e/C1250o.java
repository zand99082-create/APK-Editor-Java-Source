package com.gmail.heagoo.apkeditor.p096e;

import com.gmail.heagoo.apkeditor.ApkInfoActivity;
import com.gmail.heagoo.apkeditor.pro.R;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipFile;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.e.o */
/* JADX INFO: loaded from: classes.dex */
final class C1250o extends AbstractC1242g {

    /* JADX INFO: renamed from: b */
    private C1235ac f3627b;

    /* JADX INFO: renamed from: d */
    private String f3629d;

    /* JADX INFO: renamed from: e */
    private boolean f3630e = false;

    /* JADX INFO: renamed from: f */
    private boolean f3631f = false;

    /* JADX INFO: renamed from: c */
    private List f3628c = new ArrayList();

    /* JADX INFO: renamed from: g */
    private List f3632g = new ArrayList();

    C1250o() {
        this.f3632g.add("[/MATCH_GOTO]");
        this.f3632g.add("TARGET:");
        this.f3632g.add("MATCH:");
        this.f3632g.add("REGEX:");
        this.f3632g.add("GOTO:");
        this.f3632g.add("DOTALL:");
    }

    /* JADX INFO: renamed from: a */
    private boolean m3198a(ApkInfoActivity apkInfoActivity, InterfaceC1237b interfaceC1237b, String str) {
        String str2 = apkInfoActivity.m2722i() + "/" + str;
        if (!this.f3630e) {
            try {
                List listM3194b = super.m3194b(str2);
                boolean zM3199a = false;
                for (int i = 0; i < (listM3194b.size() - this.f3628c.size()) + 1 && !(zM3199a = m3199a(listM3194b, i)); i++) {
                }
                return zM3199a;
            } catch (IOException e) {
                interfaceC1237b.mo3162a(R.string.patch_error_read_from, str);
                return false;
            }
        }
        try {
            String strA = m3187a(str2);
            ArrayList arrayList = new ArrayList();
            String str3 = (String) this.f3628c.get(0);
            Matcher matcher = (this.f3631f ? Pattern.compile(str3.trim(), 32) : Pattern.compile(str3.trim())).matcher(strA);
            for (int iEnd = 0; matcher.find(iEnd); iEnd = matcher.end()) {
                ArrayList arrayList2 = null;
                int iGroupCount = matcher.groupCount();
                if (iGroupCount > 0) {
                    arrayList2 = new ArrayList(iGroupCount);
                    for (int i2 = 0; i2 < iGroupCount; i2++) {
                        arrayList2.add(matcher.group(i2 + 1));
                    }
                }
                arrayList.add(new C1251p(matcher.start(), matcher.end(), arrayList2));
            }
            return !arrayList.isEmpty();
        } catch (IOException e2) {
            interfaceC1237b.mo3162a(R.string.patch_error_read_from, str);
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m3199a(List list, int i) {
        int i2 = 0;
        while (i2 < this.f3628c.size() && ((String) list.get(i + i2)).trim().equals((String) this.f3628c.get(i2))) {
            i2++;
        }
        return i2 == this.f3628c.size();
    }

    @Override // com.gmail.heagoo.apkeditor.p096e.AbstractC1242g
    /* JADX INFO: renamed from: a */
    public final String mo3186a(ApkInfoActivity apkInfoActivity, ZipFile zipFile, InterfaceC1237b interfaceC1237b) {
        m3180a(interfaceC1237b, this.f3628c);
        String strM3153b = this.f3627b.m3153b();
        while (strM3153b != null) {
            if (m3198a(apkInfoActivity, interfaceC1237b, strM3153b)) {
                return this.f3629d;
            }
            strM3153b = this.f3627b.m3153b();
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
            if ("[/MATCH_GOTO]".equals(strTrim)) {
                return;
            }
            if (super.m3192a(strTrim, c1238c)) {
                line = c1238c.readLine();
            } else {
                if ("TARGET:".equals(strTrim)) {
                    this.f3627b = new C1235ac(interfaceC1237b, c1238c.readLine().trim(), c1238c.m3170a());
                } else if ("REGEX:".equals(strTrim)) {
                    this.f3630e = Boolean.valueOf(c1238c.readLine().trim()).booleanValue();
                } else if ("DOTALL:".equals(strTrim)) {
                    this.f3631f = Boolean.valueOf(c1238c.readLine().trim()).booleanValue();
                } else if ("MATCH:".equals(strTrim)) {
                    line = m3179a((BufferedReader) c1238c, this.f3628c, true, this.f3632g);
                } else if ("GOTO:".equals(strTrim)) {
                    this.f3629d = c1238c.readLine().trim();
                    line = c1238c.readLine();
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
        return this.f3627b.m3152a();
    }

    @Override // com.gmail.heagoo.apkeditor.p096e.AbstractC1242g
    /* JADX INFO: renamed from: a */
    public final boolean mo3191a(InterfaceC1237b interfaceC1237b) {
        if (this.f3627b == null || !this.f3627b.m3154c()) {
            return false;
        }
        if (this.f3628c.isEmpty()) {
            interfaceC1237b.mo3162a(R.string.patch_error_no_match_content, new Object[0]);
            return false;
        }
        if (this.f3629d == null) {
            interfaceC1237b.mo3162a(R.string.patch_error_no_goto_target, new Object[0]);
            return false;
        }
        List listMo3169f = interfaceC1237b.mo3169f();
        if (listMo3169f != null && listMo3169f.contains(this.f3629d)) {
            return true;
        }
        interfaceC1237b.mo3162a(R.string.patch_error_goto_target_notfound, this.f3629d);
        return false;
    }
}
