package p019b.p022fn.p023a.p025b.p026a.p027e.p028a.p029b;

import java.io.File;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import p019b.p022fn.p023a.p025b.p026a.p027e.p028a.InterfaceC0434a;
import p019b.p022fn.p023a.p025b.p033b.C0447a;
import p019b.p022fn.p023a.p025b.p033b.C0448b;

/* JADX INFO: renamed from: b.fn.a.b.a.e.a.b.b */
/* JADX INFO: loaded from: classes.dex */
public class C0436b implements InterfaceC0434a {

    /* JADX INFO: renamed from: a */
    private File f508a;

    /* JADX INFO: renamed from: b */
    private ZipFile f509b;

    /* JADX INFO: renamed from: c */
    private Enumeration<? extends ZipEntry> f510c;

    /* JADX INFO: renamed from: d */
    private ZipEntry f511d;

    public C0436b(File file, String str) {
        this.f508a = file;
    }

    @Override // p019b.p022fn.p023a.p025b.p026a.p027e.p028a.InterfaceC0434a
    /* JADX INFO: renamed from: a */
    public InputStream mo421a() {
        return this.f509b.getInputStream(this.f511d);
    }

    @Override // p019b.p022fn.p023a.p025b.p026a.p027e.p028a.InterfaceC0434a
    /* JADX INFO: renamed from: b */
    public InterfaceC0434a.a mo422b() {
        if (this.f509b == null) {
            ZipFile zipFile = new ZipFile(this.f508a);
            this.f509b = zipFile;
            this.f510c = zipFile.entries();
        }
        if (!this.f510c.hasMoreElements()) {
            return null;
        }
        ZipEntry zipEntryNextElement = this.f510c.nextElement();
        this.f511d = zipEntryNextElement;
        return new InterfaceC0434a.a(C0448b.m484a(zipEntryNextElement), this.f511d.getName());
    }

    @Override // p019b.p022fn.p023a.p025b.p026a.p027e.p028a.InterfaceC0434a, java.lang.AutoCloseable
    public void close() {
        C0447a.m482a(this.f509b);
    }
}
