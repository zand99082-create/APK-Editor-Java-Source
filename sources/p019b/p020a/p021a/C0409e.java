package p019b.p020a.p021a;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: b.a.a.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0409e implements Iterable {

    /* JADX INFO: renamed from: a */
    private final HashMap f398a = new HashMap();

    /* JADX INFO: renamed from: b */
    private final ArrayList f399b = new ArrayList();

    public C0409e(AbstractC0405a abstractC0405a, Map map) {
        String str = (String) map.get("cookie");
        if (str != null) {
            String[] strArrSplit = str.split(";");
            for (String str2 : strArrSplit) {
                String[] strArrSplit2 = str2.trim().split("=");
                if (strArrSplit2.length == 2) {
                    this.f398a.put(strArrSplit2[0], strArrSplit2[1]);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m351a(C0414j c0414j) {
        Iterator it = this.f399b.iterator();
        while (it.hasNext()) {
            c0414j.m376a("Set-Cookie", ((C0408d) it.next()).m350a());
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f398a.keySet().iterator();
    }
}
