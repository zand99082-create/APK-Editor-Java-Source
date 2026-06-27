package p019b.p022fn.p023a.p025b.p026a;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: b.fn.a.b.a.b */
/* JADX INFO: loaded from: classes.dex */
public class C0431b {

    /* JADX INFO: renamed from: a */
    private Map<EnumC0430a, C0432c> f497a = new HashMap();

    /* JADX INFO: renamed from: b */
    private List<C0432c> f498b = new ArrayList();

    public C0431b() {
        new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    public C0432c m412a(EnumC0430a enumC0430a) {
        return this.f497a.get(enumC0430a);
    }

    /* JADX INFO: renamed from: a */
    public C0432c m413a(EnumC0430a enumC0430a, String str, String str2) {
        C0432c c0432c = this.f497a.get(enumC0430a);
        if (c0432c != null) {
            return c0432c;
        }
        C0432c c0432c2 = new C0432c(enumC0430a, str, str2);
        this.f497a.put(enumC0430a, c0432c2);
        this.f498b.add(c0432c2);
        return c0432c2;
    }

    /* JADX INFO: renamed from: a */
    public List<C0432c> m414a() {
        return this.f498b;
    }
}
