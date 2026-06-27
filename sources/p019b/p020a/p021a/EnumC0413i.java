package p019b.p020a.p021a;

/* JADX INFO: renamed from: b.a.a.i */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0413i {
    GET,
    PUT,
    POST,
    DELETE,
    HEAD,
    OPTIONS,
    TRACE,
    CONNECT,
    PATCH;

    /* JADX INFO: renamed from: a */
    static EnumC0413i m367a(String str) {
        for (EnumC0413i enumC0413i : (EnumC0413i[]) values().clone()) {
            if (enumC0413i.toString().equalsIgnoreCase(str)) {
                return enumC0413i;
            }
        }
        return null;
    }
}
