package com.gmail.heagoo.apkeditor.p096e;

import com.gmail.heagoo.apkeditor.pro.R;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.e.d */
/* JADX INFO: loaded from: classes.dex */
public class C1239d {

    /* JADX INFO: renamed from: a */
    public List f3594a = new ArrayList();

    /* JADX INFO: renamed from: a */
    public static C1239d m3171a(InputStream inputStream, InterfaceC1237b interfaceC1237b) {
        interfaceC1237b.mo3161a(R.string.patch_start_parse, true, new Object[0]);
        C1239d c1239d = new C1239d();
        C1238c c1238c = new C1238c(new InputStreamReader(inputStream));
        for (String line = c1238c.readLine(); line != null; line = c1238c.readLine()) {
            String strTrim = line.trim();
            if (strTrim.startsWith("[")) {
                if ("[MIN_ENGINE_VER]".equals(strTrim)) {
                    Integer.valueOf(c1238c.readLine()).intValue();
                } else if ("[AUTHOR]".equals(strTrim)) {
                    c1238c.readLine();
                } else if ("[PACKAGE]".equals(strTrim)) {
                    c1238c.readLine();
                } else {
                    AbstractC1242g c1246k = null;
                    if ("[ADD_FILES]".equals(strTrim)) {
                        c1246k = new C1244i();
                    } else if ("[REMOVE_FILES]".equals(strTrim)) {
                        c1246k = new C1256u();
                    } else if ("[MERGE]".equals(strTrim)) {
                        c1246k = new C1254s();
                    } else if ("[MATCH_REPLACE]".equals(strTrim)) {
                        c1246k = new C1252q();
                    } else if ("[MATCH_GOTO]".equals(strTrim)) {
                        c1246k = new C1250o();
                    } else if ("[MATCH_ASSIGN]".equals(strTrim)) {
                        c1246k = new C1249n();
                    } else if ("[FUNCTION_REPLACE]".equals(strTrim)) {
                        c1246k = new C1247l();
                    } else if ("[SIGNATURE_REVISE]".equals(strTrim)) {
                        c1246k = new C1257v();
                    } else if ("[GOTO]".equals(strTrim)) {
                        c1246k = new C1248m();
                    } else if ("[DUMMY]".equals(strTrim)) {
                        c1246k = new C1245j();
                    } else if ("[EXECUTE_DEX]".equals(strTrim)) {
                        c1246k = new C1246k();
                    } else {
                        interfaceC1237b.mo3162a(R.string.patch_error_unknown_rule, Integer.valueOf(c1238c.m3170a()), strTrim);
                    }
                    if (c1246k != null) {
                        c1246k.mo3189a(c1238c, interfaceC1237b);
                    }
                    if (c1246k != null) {
                        c1239d.f3594a.add(c1246k);
                    }
                }
            } else if (!strTrim.startsWith("#") && !"".equals(strTrim)) {
                interfaceC1237b.mo3162a(R.string.patch_error_unknown_rule, Integer.valueOf(c1238c.m3170a()), strTrim);
            }
        }
        return c1239d;
    }
}
