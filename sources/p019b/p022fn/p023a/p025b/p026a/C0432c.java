package p019b.p022fn.p023a.p025b.p026a;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: b.fn.a.b.a.c */
/* JADX INFO: loaded from: classes.dex */
public class C0432c {

    /* JADX INFO: renamed from: a */
    private String f499a;

    /* JADX INFO: renamed from: b */
    private List<C0433d> f500b = new ArrayList();

    public C0432c(EnumC0430a enumC0430a, String str, String str2) {
        this.f499a = str;
    }

    /* JADX INFO: renamed from: a */
    public C0432c m415a(C0433d c0433d) {
        this.f500b.add(c0433d);
        return this;
    }

    /* JADX INFO: renamed from: a */
    public String m416a() {
        return this.f499a;
    }

    /* JADX INFO: renamed from: b */
    public List<C0433d> m417b() {
        return this.f500b;
    }
}
