package p019b.p022fn.p023a.p025b.p026a.p030f;

import java.util.HashMap;
import java.util.Map;
import p019b.p022fn.p023a.p025b.p026a.p030f.p031e.C0441a;
import p019b.p022fn.p023a.p025b.p026a.p030f.p031e.C0443c;
import p019b.p022fn.p023a.p025b.p026a.p030f.p031e.C0444d;
import p019b.p022fn.p023a.p025b.p026a.p030f.p031e.C0445e;

/* JADX INFO: renamed from: b.fn.a.b.a.f.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0439c {

    /* JADX INFO: renamed from: a */
    private String f514a;

    /* JADX INFO: renamed from: b */
    private long f515b;

    /* JADX INFO: renamed from: c */
    private String f516c;

    public AbstractC0439c(Map<String, String> map) {
        this.f514a = map.get("package");
        this.f515b = Long.parseLong(map.get("http://schemas.android.com/apk/res/android:versionCode"));
        this.f516c = map.get("split");
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC0439c m431a(HashMap<String, String> map) {
        if (!map.containsKey("split")) {
            return new C0437a(map);
        }
        if (map.containsKey("http://schemas.android.com/apk/res/android:isFeatureSplit")) {
            return new C0438b(map);
        }
        if (!map.containsKey("configForSplit")) {
            return new C0440d(map);
        }
        String str = map.get("split");
        return C0441a.m436b(str) ? new C0441a(map) : C0444d.m445b(str) ? new C0444d(map) : C0443c.m442b(str) ? new C0443c(map) : new C0445e(map);
    }

    /* JADX INFO: renamed from: a */
    public String m432a() {
        return this.f514a;
    }

    /* JADX INFO: renamed from: b */
    public String m433b() {
        return this.f516c;
    }

    /* JADX INFO: renamed from: c */
    public long m434c() {
        return this.f515b;
    }
}
