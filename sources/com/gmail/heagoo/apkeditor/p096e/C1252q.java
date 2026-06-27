package com.gmail.heagoo.apkeditor.p096e;

import com.android.apksig.apk.ApkUtils;
import com.gmail.heagoo.apkeditor.ApkInfoActivity;
import com.gmail.heagoo.apkeditor.pro.R;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import java.util.zip.ZipFile;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.e.q */
/* JADX INFO: loaded from: classes.dex */
final class C1252q extends AbstractC1242g {

    /* JADX INFO: renamed from: b */
    private C1235ac f3633b;

    /* JADX INFO: renamed from: i */
    private boolean f3640i;

    /* JADX INFO: renamed from: e */
    private String f3636e = null;

    /* JADX INFO: renamed from: f */
    private boolean f3637f = false;

    /* JADX INFO: renamed from: g */
    private boolean f3638g = false;

    /* JADX INFO: renamed from: c */
    private List f3634c = new ArrayList();

    /* JADX INFO: renamed from: d */
    private List f3635d = new ArrayList();

    /* JADX INFO: renamed from: h */
    private List f3639h = new ArrayList();

    C1252q() {
        this.f3639h.add("[/MATCH_REPLACE]");
        this.f3639h.add("TARGET:");
        this.f3639h.add("MATCH:");
        this.f3639h.add("REGEX:");
        this.f3639h.add("REPLACE:");
        this.f3639h.add("DOTALL:");
    }

    /* JADX INFO: renamed from: a */
    private static String m3200a(String str, C1253r c1253r) {
        List list = c1253r.f3643c;
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
    private static void m3201a(BufferedOutputStream bufferedOutputStream, List list, int i, int i2) {
        while (i < i2) {
            bufferedOutputStream.write(((String) list.get(i)).getBytes());
            bufferedOutputStream.write("\n".getBytes());
            i++;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m3202a(String str, String str2, List list) throws Throwable {
        FileOutputStream fileOutputStream;
        String strM3205c = m3205c();
        try {
            fileOutputStream = new FileOutputStream(str);
            int i = 0;
            for (int i2 = 0; i2 < list.size(); i2++) {
                try {
                    C1253r c1253r = (C1253r) list.get(i2);
                    fileOutputStream.write(str2.substring(i, c1253r.f3641a).getBytes());
                    i = c1253r.f3642b;
                    fileOutputStream.write(((c1253r.f3643c == null || c1253r.f3643c.isEmpty()) ? strM3205c : m3200a(strM3205c, c1253r)).getBytes());
                } catch (Throwable th) {
                    th = th;
                    m3181a(fileOutputStream);
                    throw th;
                }
            }
            fileOutputStream.write(str2.substring(i).getBytes());
            m3181a(fileOutputStream);
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = null;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m3203a(String str, List list, List list2) throws Throwable {
        BufferedOutputStream bufferedOutputStream;
        String strM3205c = m3205c();
        try {
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(str));
            int size = 0;
            for (int i = 0; i < list2.size(); i++) {
                try {
                    int iIntValue = ((Integer) list2.get(i)).intValue();
                    m3201a(bufferedOutputStream, list, size, iIntValue);
                    bufferedOutputStream.write(strM3205c.getBytes());
                    bufferedOutputStream.write("\n".getBytes());
                    size = this.f3634c.size() + iIntValue;
                } catch (Throwable th) {
                    th = th;
                    m3181a(bufferedOutputStream);
                    throw th;
                }
            }
            m3201a(bufferedOutputStream, list, size, list.size());
            m3181a(bufferedOutputStream);
        } catch (Throwable th2) {
            th = th2;
            bufferedOutputStream = null;
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m3204a(List list, int i) {
        int i2 = 0;
        while (i2 < this.f3634c.size() && ((String) list.get(i + i2)).trim().equals((String) this.f3634c.get(i2))) {
            i2++;
        }
        return i2 == this.f3634c.size();
    }

    /* JADX INFO: renamed from: c */
    private String m3205c() {
        if (this.f3636e == null) {
            if (this.f3635d.isEmpty()) {
                this.f3636e = "";
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append((String) this.f3635d.get(0));
                int i = 1;
                while (true) {
                    int i2 = i;
                    if (i2 >= this.f3635d.size()) {
                        break;
                    }
                    sb.append("\n");
                    sb.append((String) this.f3635d.get(i2));
                    i = i2 + 1;
                }
                this.f3636e = sb.toString();
            }
        }
        return this.f3636e;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00a5 A[SYNTHETIC] */
    @Override // com.gmail.heagoo.apkeditor.p096e.AbstractC1242g
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String mo3186a(ApkInfoActivity apkInfoActivity, ZipFile zipFile, InterfaceC1237b interfaceC1237b) throws Throwable {
        boolean z;
        m3180a(interfaceC1237b, this.f3634c);
        m3180a(interfaceC1237b, this.f3635d);
        Pattern patternCompile = null;
        if (this.f3637f) {
            String str = (String) this.f3634c.get(0);
            try {
                patternCompile = this.f3638g ? Pattern.compile(str.trim(), 32) : Pattern.compile(str.trim());
            } catch (PatternSyntaxException e) {
                interfaceC1237b.mo3162a(R.string.patch_error_regex_syntax, e.getMessage());
                return null;
            }
        }
        String strM3153b = this.f3633b.m3153b();
        while (strM3153b != null) {
            boolean z2 = false;
            String str2 = apkInfoActivity.m2722i() + "/" + strM3153b;
            if (patternCompile != null) {
                try {
                    String strA = m3187a(str2);
                    ArrayList arrayList = new ArrayList();
                    Matcher matcher = patternCompile.matcher(strA);
                    for (int iEnd = 0; matcher.find(iEnd); iEnd = matcher.end()) {
                        ArrayList arrayList2 = null;
                        int iGroupCount = matcher.groupCount();
                        if (iGroupCount > 0) {
                            arrayList2 = new ArrayList(iGroupCount);
                            for (int i = 0; i < iGroupCount; i++) {
                                arrayList2.add(matcher.group(i + 1));
                            }
                        }
                        arrayList.add(new C1253r(matcher.start(), matcher.end(), arrayList2));
                    }
                    if (!arrayList.isEmpty()) {
                        try {
                            m3202a(str2, strA, arrayList);
                            z = true;
                        } catch (IOException e2) {
                            z = false;
                        }
                        try {
                            interfaceC1237b.mo3164a(strM3153b + ": " + String.format(interfaceC1237b.mo3158a(R.string.patch_info_num_replaced), Integer.valueOf(arrayList.size())), false, new Object[0]);
                            z2 = true;
                        } catch (IOException e3) {
                            interfaceC1237b.mo3162a(R.string.patch_error_write_to, strM3153b);
                            z2 = z;
                        }
                        if (z2) {
                        }
                    } else if (this.f3640i) {
                        z = false;
                        z2 = z;
                        if (z2) {
                        }
                    } else {
                        interfaceC1237b.mo3162a(R.string.patch_error_no_match, strM3153b);
                        if (z2) {
                            if (ApkUtils.ANDROID_MANIFEST_ZIP_ENTRY_NAME.equals(strM3153b)) {
                                apkInfoActivity.m2701a(false);
                            } else {
                                apkInfoActivity.m2724j().m3314c(strM3153b, str2);
                            }
                        }
                    }
                } catch (IOException e4) {
                    interfaceC1237b.mo3162a(R.string.patch_error_read_from, strM3153b);
                }
            } else {
                try {
                    List listM3194b = super.m3194b(str2);
                    ArrayList arrayList3 = new ArrayList();
                    int size = 0;
                    while (size < (listM3194b.size() - this.f3634c.size()) + 1) {
                        if (m3204a(listM3194b, size)) {
                            arrayList3.add(Integer.valueOf(size));
                            size += this.f3634c.size() - 1;
                        }
                        size++;
                    }
                    if (arrayList3.isEmpty()) {
                        interfaceC1237b.mo3162a(R.string.patch_error_no_match, strM3153b);
                    } else {
                        try {
                            m3203a(str2, listM3194b, arrayList3);
                            z2 = true;
                            interfaceC1237b.mo3161a(R.string.patch_info_num_replaced, false, Integer.valueOf(arrayList3.size()));
                        } catch (IOException e5) {
                            interfaceC1237b.mo3162a(R.string.patch_error_write_to, strM3153b);
                        }
                    }
                    if (z2) {
                    }
                } catch (IOException e6) {
                    interfaceC1237b.mo3162a(R.string.patch_error_read_from, strM3153b);
                }
            }
            strM3153b = this.f3633b.m3153b();
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
            if ("[/MATCH_REPLACE]".equals(strTrim)) {
                break;
            }
            if (super.m3192a(strTrim, c1238c)) {
                line = c1238c.readLine();
            } else {
                if ("TARGET:".equals(strTrim)) {
                    this.f3633b = new C1235ac(interfaceC1237b, c1238c.readLine().trim(), c1238c.m3170a());
                } else if ("REGEX:".equals(strTrim)) {
                    this.f3637f = Boolean.valueOf(c1238c.readLine().trim()).booleanValue();
                } else if ("DOTALL:".equals(strTrim)) {
                    this.f3638g = Boolean.valueOf(c1238c.readLine().trim()).booleanValue();
                } else if ("MATCH:".equals(strTrim)) {
                    line = m3179a((BufferedReader) c1238c, this.f3634c, true, this.f3639h);
                } else if ("REPLACE:".equals(strTrim)) {
                    line = m3179a((BufferedReader) c1238c, this.f3635d, false, this.f3639h);
                } else {
                    interfaceC1237b.mo3162a(R.string.patch_error_cannot_parse, Integer.valueOf(c1238c.m3170a()), strTrim);
                }
                line = c1238c.readLine();
            }
        }
        if (this.f3633b != null) {
            this.f3640i = this.f3633b.m3155d();
        }
    }

    @Override // com.gmail.heagoo.apkeditor.p096e.AbstractC1242g
    /* JADX INFO: renamed from: a */
    public final boolean mo3190a() {
        return this.f3633b.m3152a();
    }

    @Override // com.gmail.heagoo.apkeditor.p096e.AbstractC1242g
    /* JADX INFO: renamed from: a */
    public final boolean mo3191a(InterfaceC1237b interfaceC1237b) {
        if (this.f3633b == null || !this.f3633b.m3154c()) {
            return false;
        }
        if (!this.f3634c.isEmpty()) {
            return true;
        }
        interfaceC1237b.mo3162a(R.string.patch_error_no_match_content, new Object[0]);
        return false;
    }
}
