package p000a.p013c;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: a.c.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0078f extends AbstractC0073a {

    /* JADX INFO: renamed from: c */
    private File f218c;

    public C0078f(File file) throws C0077e {
        if (!file.isDirectory()) {
            throw new C0077e("File must be a directory: " + file);
        }
        this.f218c = file;
    }

    /* JADX INFO: renamed from: c */
    private void m207c() {
        this.f212a = new LinkedHashSet();
        this.f213b = new LinkedHashMap();
        File[] fileArrListFiles = this.f218c.listFiles();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                if (file.isFile()) {
                    this.f212a.add(file.getName());
                } else {
                    try {
                        this.f213b.put(file.getName(), new C0078f(file));
                    } catch (C0077e e) {
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: j */
    private String m208j(String str) {
        return this.f218c.getPath() + '/' + str;
    }

    @Override // p000a.p013c.AbstractC0073a
    /* JADX INFO: renamed from: a */
    protected final void mo194a() {
        m207c();
    }

    @Override // p000a.p013c.AbstractC0073a
    /* JADX INFO: renamed from: b */
    protected final void mo199b() {
        m207c();
    }

    @Override // p000a.p013c.AbstractC0073a
    /* JADX INFO: renamed from: f */
    protected final InputStream mo203f(String str) throws C0077e {
        try {
            return new FileInputStream(m208j(str));
        } catch (FileNotFoundException e) {
            throw new C0077e(e);
        }
    }

    @Override // p000a.p013c.AbstractC0073a
    /* JADX INFO: renamed from: g */
    protected final OutputStream mo204g(String str) throws C0077e {
        try {
            return new FileOutputStream(m208j(str));
        } catch (FileNotFoundException e) {
            throw new C0077e(e);
        }
    }

    @Override // p000a.p013c.InterfaceC0076d
    public int getCompressionLevel(String str) {
        return 0;
    }

    @Override // p000a.p013c.InterfaceC0076d
    public long getSize(String str) {
        return 0L;
    }

    @Override // p000a.p013c.AbstractC0073a
    /* JADX INFO: renamed from: h */
    protected final AbstractC0073a mo205h(String str) {
        File file = new File(m208j(str));
        file.mkdir();
        return new C0078f(file);
    }

    @Override // p000a.p013c.AbstractC0073a
    /* JADX INFO: renamed from: i */
    protected final void mo206i(String str) {
        new File(m208j(str)).delete();
    }
}
