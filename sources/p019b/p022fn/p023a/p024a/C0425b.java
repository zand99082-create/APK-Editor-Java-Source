package p019b.p022fn.p023a.p024a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: b.fn.a.a.b */
/* JADX INFO: loaded from: classes.dex */
class C0425b {

    /* JADX INFO: renamed from: c */
    private String f477c;

    /* JADX INFO: renamed from: b */
    private long f476b = 0;

    /* JADX INFO: renamed from: d */
    private long f478d = -1;

    /* JADX INFO: renamed from: a */
    private ArrayList<a> f475a = new ArrayList<>();

    /* JADX INFO: renamed from: b.fn.a.a.b$a */
    static class a {

        /* JADX INFO: renamed from: a */
        private LinkedHashMap<String, String> f479a = new LinkedHashMap<>();

        a() {
        }

        /* JADX INFO: renamed from: a */
        String m397a(String str) {
            return this.f479a.get(str);
        }

        /* JADX INFO: renamed from: a */
        void m398a(String str, String str2) {
            this.f479a.put(str, str2);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            for (String str : this.f479a.keySet()) {
                sb.append(String.format("%s: %s\r\n", str, this.f479a.get(str)));
            }
            sb.append("\r\n");
            return sb.toString();
        }
    }

    C0425b() {
    }

    /* JADX INFO: renamed from: c */
    private a m393c() {
        a aVar = new a();
        aVar.m398a("Manifest-Version", "1.0");
        aVar.m398a("Created-By", "PseudoApkSigner 1.6 (AntiSplit-G2)");
        return aVar;
    }

    /* JADX INFO: renamed from: a */
    String m394a() {
        if (this.f476b == this.f478d) {
            return this.f477c;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(m393c().toString());
        Iterator<a> it = this.f475a.iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
        }
        this.f478d = this.f476b;
        String string = sb.toString();
        this.f477c = string;
        return string;
    }

    /* JADX INFO: renamed from: a */
    void m395a(a aVar) {
        this.f475a.add(aVar);
        this.f476b++;
    }

    /* JADX INFO: renamed from: b */
    List<a> m396b() {
        return this.f475a;
    }
}
