package p019b.p022fn.p023a.p025b.p026a.p030f.p031e;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: b.fn.a.b.a.f.e.a */
/* JADX INFO: loaded from: classes.dex */
public class C0441a extends AbstractC0442b {

    /* JADX INFO: renamed from: f */
    private static Set<String> f517f;

    /* JADX INFO: renamed from: e */
    private String f518e;

    static {
        HashSet hashSet = new HashSet();
        f517f = hashSet;
        hashSet.add("armeabi_v7a");
        f517f.add("arm64_v8a");
        f517f.add("x86");
        f517f.add("x86_64");
    }

    public C0441a(Map<String, String> map) {
        super(map);
        this.f518e = m435a(m433b());
    }

    /* JADX INFO: renamed from: a */
    private static String m435a(String str) {
        int iLastIndexOf = str.lastIndexOf("config.");
        if (iLastIndexOf != -1 && (iLastIndexOf == 0 || str.charAt(iLastIndexOf - 1) == '.')) {
            String strSubstring = str.substring(iLastIndexOf + 7);
            if (f517f.contains(strSubstring)) {
                return strSubstring;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m436b(String str) {
        return m435a(str) != null;
    }

    /* JADX INFO: renamed from: f */
    public String m437f() {
        return this.f518e;
    }
}
