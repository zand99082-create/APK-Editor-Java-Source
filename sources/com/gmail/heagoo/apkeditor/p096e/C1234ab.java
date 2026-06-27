package com.gmail.heagoo.apkeditor.p096e;

import jadx.core.deobf.Deobfuscator;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.e.ab */
/* JADX INFO: loaded from: classes.dex */
public final class C1234ab extends AbstractC1258w {

    /* JADX INFO: renamed from: a */
    private String f3582a;

    /* JADX INFO: renamed from: b */
    private String f3583b;

    /* JADX INFO: renamed from: c */
    private String f3584c;

    /* JADX INFO: renamed from: d */
    private boolean f3585d = false;

    /* JADX INFO: renamed from: e */
    private List f3586e = new LinkedList();

    /* JADX INFO: renamed from: f */
    private List f3587f = new ArrayList();

    /* JADX INFO: renamed from: g */
    private int f3588g = 0;

    public C1234ab(InterfaceC1237b interfaceC1237b, String str) {
        this.f3582a = str;
        this.f3583b = "^" + str.replace("*", ".*") + Deobfuscator.INNER_CLASS_SEPARATOR;
        this.f3584c = interfaceC1237b.mo3165b();
    }

    @Override // com.gmail.heagoo.apkeditor.p096e.AbstractC1258w
    /* JADX INFO: renamed from: a */
    public final String mo3147a() {
        if (!this.f3585d) {
            File[] fileArrListFiles = new File(this.f3584c).listFiles();
            if (fileArrListFiles != null) {
                for (File file : fileArrListFiles) {
                    if (file.isDirectory()) {
                        this.f3586e.add(file.getName());
                    } else {
                        String name = file.getName();
                        if (mo3148a(name)) {
                            this.f3587f.add(name);
                        }
                    }
                }
            }
            this.f3585d = true;
        }
        if (this.f3588g < this.f3587f.size()) {
            String str = (String) this.f3587f.get(this.f3588g);
            this.f3588g++;
            return str;
        }
        if (!this.f3586e.isEmpty()) {
            this.f3588g = 0;
            this.f3587f.clear();
            while (!this.f3586e.isEmpty()) {
                String str2 = (String) this.f3586e.remove(0);
                File[] fileArrListFiles2 = new File(this.f3584c + "/" + str2).listFiles();
                if (fileArrListFiles2 != null) {
                    for (File file2 : fileArrListFiles2) {
                        String str3 = str2 + "/" + file2.getName();
                        if (file2.isDirectory()) {
                            this.f3586e.add(str3);
                        } else if (mo3148a(str3)) {
                            this.f3587f.add(str3);
                        }
                    }
                }
                if (!this.f3587f.isEmpty()) {
                    break;
                }
            }
            if (!this.f3587f.isEmpty()) {
                this.f3588g = 1;
                return (String) this.f3587f.get(0);
            }
        }
        return null;
    }

    @Override // com.gmail.heagoo.apkeditor.p096e.AbstractC1258w
    /* JADX INFO: renamed from: a */
    public final boolean mo3148a(String str) {
        return str.matches(this.f3583b);
    }

    @Override // com.gmail.heagoo.apkeditor.p096e.AbstractC1258w
    /* JADX INFO: renamed from: b */
    public final boolean mo3149b() {
        return this.f3582a.startsWith("smali") || this.f3582a.endsWith(".smali");
    }

    @Override // com.gmail.heagoo.apkeditor.p096e.AbstractC1258w
    /* JADX INFO: renamed from: c */
    public final boolean mo3150c() {
        return true;
    }
}
