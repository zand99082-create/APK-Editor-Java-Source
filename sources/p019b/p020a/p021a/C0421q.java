package p019b.p020a.p021a;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: b.a.a.q */
/* JADX INFO: loaded from: classes.dex */
public class C0421q {

    /* JADX INFO: renamed from: a */
    private final File f460a;

    /* JADX INFO: renamed from: b */
    private final OutputStream f461b;

    public C0421q(File file) {
        this.f460a = File.createTempFile("NanoHTTPD-", "", file);
        this.f461b = new FileOutputStream(this.f460a);
    }

    /* JADX INFO: renamed from: a */
    public void m385a() throws Exception {
        AbstractC0405a.m332b(this.f461b);
        if (!this.f460a.delete()) {
            throw new Exception("could not delete temporary file");
        }
    }

    /* JADX INFO: renamed from: b */
    public String m386b() {
        return this.f460a.getAbsolutePath();
    }
}
