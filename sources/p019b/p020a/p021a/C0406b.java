package p019b.p020a.p021a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: b.a.a.b */
/* JADX INFO: loaded from: classes.dex */
public class C0406b {

    /* JADX INFO: renamed from: a */
    private long f390a;

    /* JADX INFO: renamed from: b */
    private final List f391b = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: a */
    public void m346a() {
        Iterator it = new ArrayList(this.f391b).iterator();
        while (it.hasNext()) {
            ((RunnableC0407c) it.next()).m349a();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m347a(RunnableC0407c runnableC0407c) {
        this.f391b.remove(runnableC0407c);
    }

    /* JADX INFO: renamed from: b */
    public void m348b(RunnableC0407c runnableC0407c) {
        this.f390a++;
        Thread thread = new Thread(runnableC0407c);
        thread.setDaemon(true);
        thread.setName("NanoHttpd Request Processor (#" + this.f390a + ")");
        this.f391b.add(runnableC0407c);
        thread.start();
    }
}
