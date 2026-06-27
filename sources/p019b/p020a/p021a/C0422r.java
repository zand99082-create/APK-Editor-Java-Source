package p019b.p020a.p021a;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;

/* JADX INFO: renamed from: b.a.a.r */
/* JADX INFO: loaded from: classes.dex */
public class C0422r {

    /* JADX INFO: renamed from: a */
    private final File f462a = new File(System.getProperty("java.io.tmpdir"));

    /* JADX INFO: renamed from: b */
    private final List f463b;

    public C0422r() {
        if (!this.f462a.exists()) {
            this.f462a.mkdirs();
        }
        this.f463b = new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    public void m387a() {
        Iterator it = this.f463b.iterator();
        while (it.hasNext()) {
            try {
                ((C0421q) it.next()).m385a();
            } catch (Exception e) {
                AbstractC0405a.f382g.log(Level.WARNING, "could not delete file ", (Throwable) e);
            }
        }
        this.f463b.clear();
    }

    /* JADX INFO: renamed from: b */
    public C0421q m388b() {
        C0421q c0421q = new C0421q(this.f462a);
        this.f463b.add(c0421q);
        return c0421q;
    }
}
