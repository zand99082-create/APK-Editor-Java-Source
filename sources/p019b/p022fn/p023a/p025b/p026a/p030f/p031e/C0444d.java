package p019b.p022fn.p023a.p025b.p026a.p030f.p031e;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: b.fn.a.b.a.f.e.d */
/* JADX INFO: loaded from: classes.dex */
public class C0444d extends AbstractC0442b {

    /* JADX INFO: renamed from: g */
    private static final Map<String, Integer> f521g;

    /* JADX INFO: renamed from: e */
    private String f522e;

    /* JADX INFO: renamed from: f */
    private int f523f;

    static {
        HashMap map = new HashMap();
        f521g = map;
        map.put("ldpi", 120);
        f521g.put("mdpi", 160);
        f521g.put("tvdpi", 213);
        f521g.put("hdpi", 240);
        f521g.put("xhdpi", 320);
        f521g.put("xxhdpi", 480);
        f521g.put("xxxhdpi", 640);
    }

    public C0444d(Map<String, String> map) {
        super(map);
        String str = (String) Objects.requireNonNull(m444a((String) Objects.requireNonNull(m433b())));
        this.f522e = str;
        this.f523f = ((Integer) Objects.requireNonNull(f521g.get(str))).intValue();
    }

    /* JADX INFO: renamed from: a */
    public static String m444a(String str) {
        int iLastIndexOf = str.lastIndexOf("config.");
        if (iLastIndexOf != -1 && (iLastIndexOf == 0 || str.charAt(iLastIndexOf - 1) == '.')) {
            String strSubstring = str.substring(iLastIndexOf + 7);
            if (f521g.containsKey(strSubstring)) {
                return strSubstring;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m445b(String str) {
        return m444a(str) != null;
    }

    /* JADX INFO: renamed from: f */
    public int m446f() {
        return this.f523f;
    }

    /* JADX INFO: renamed from: g */
    public String m447g() {
        return this.f522e;
    }
}
