package p019b.p022fn.p034b.p035a.p036a.p037a.p038b;

import java.io.File;
import java.io.FileFilter;

/* JADX INFO: renamed from: b.fn.b.a.a.a.b.a */
/* JADX INFO: loaded from: classes.dex */
public class C0450a implements FileFilter {

    /* JADX INFO: renamed from: a */
    boolean f574a;

    /* JADX INFO: renamed from: b */
    boolean f575b;

    /* JADX INFO: renamed from: c */
    String[] f576c;

    public C0450a(boolean z, boolean z2, String... strArr) {
        this.f574a = z2;
        this.f575b = z;
        this.f576c = strArr;
    }

    @Override // java.io.FileFilter
    public boolean accept(File file) {
        if (!this.f574a && file.isHidden()) {
            return false;
        }
        if (this.f575b && !file.isDirectory()) {
            return false;
        }
        if (this.f576c == null || file.isDirectory()) {
            return true;
        }
        String strM504b = C0451b.m504b(file);
        for (String str : this.f576c) {
            if (strM504b.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
