package com.gmail.heagoo.p084a.p088b;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: com.gmail.heagoo.a.b.j */
/* JADX INFO: loaded from: classes.dex */
public final class C1066j extends AbstractC1058b {

    /* JADX INFO: renamed from: a */
    private ArrayList f2804a = new ArrayList();

    @Override // com.gmail.heagoo.p084a.p088b.AbstractC1058b
    /* JADX INFO: renamed from: a */
    public final int mo2420a() {
        int iM2423b = 0;
        Iterator it = this.f2804a.iterator();
        while (true) {
            int i = iM2423b;
            if (!it.hasNext()) {
                return i;
            }
            iM2423b = ((AbstractC1058b) it.next()).m2423b() + i;
        }
    }

    /* JADX INFO: renamed from: a */
    public final C1066j m2426a(AbstractC1058b abstractC1058b) {
        this.f2804a.add(abstractC1058b);
        return this;
    }

    @Override // com.gmail.heagoo.p084a.p088b.AbstractC1058b
    /* JADX INFO: renamed from: a */
    public final void mo2421a(OutputStream outputStream) throws IOException {
        outputStream.write(49);
        m2422a(outputStream, mo2420a());
        Iterator it = this.f2804a.iterator();
        while (it.hasNext()) {
            ((AbstractC1058b) it.next()).mo2421a(outputStream);
        }
    }
}
