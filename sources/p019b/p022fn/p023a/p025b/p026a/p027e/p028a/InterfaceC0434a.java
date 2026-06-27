package p019b.p022fn.p023a.p025b.p026a.p027e.p028a;

import java.io.InputStream;

/* JADX INFO: renamed from: b.fn.a.b.a.e.a.a */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0434a extends AutoCloseable {

    /* JADX INFO: renamed from: b.fn.a.b.a.e.a.a$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private String f504a;

        /* JADX INFO: renamed from: b */
        private String f505b;

        public a(String str, String str2) {
            this.f504a = str;
            this.f505b = str2;
        }

        /* JADX INFO: renamed from: a */
        public String m423a() {
            return this.f505b;
        }

        /* JADX INFO: renamed from: b */
        public String m424b() {
            return this.f504a;
        }
    }

    /* JADX INFO: renamed from: a */
    InputStream mo421a();

    /* JADX INFO: renamed from: b */
    a mo422b();

    @Override // java.lang.AutoCloseable
    void close();
}
