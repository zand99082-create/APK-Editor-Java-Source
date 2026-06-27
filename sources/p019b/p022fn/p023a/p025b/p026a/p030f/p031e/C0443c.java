package p019b.p022fn.p023a.p025b.p026a.p030f.p031e;

import java.util.Locale;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: b.fn.a.b.a.f.e.c */
/* JADX INFO: loaded from: classes.dex */
public class C0443c extends AbstractC0442b {

    /* JADX INFO: renamed from: e */
    private Locale f520e;

    public C0443c(Map<String, String> map) {
        super(map);
        this.f520e = (Locale) Objects.requireNonNull(m440a(m433b()));
    }

    /* JADX INFO: renamed from: a */
    private static Locale m440a(String str) {
        int iLastIndexOf = str.lastIndexOf("config.");
        if (iLastIndexOf == -1) {
            return null;
        }
        if (iLastIndexOf != 0 && str.charAt(iLastIndexOf - 1) != '.') {
            return null;
        }
        return new Locale.Builder().setLanguageTag(str.substring(iLastIndexOf + 7)).build();
    }

    /* JADX INFO: renamed from: a */
    private static boolean m441a(Locale locale) {
        if (locale == null) {
            return false;
        }
        for (Locale locale2 : Locale.getAvailableLocales()) {
            if (locale2.equals(locale)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m442b(String str) {
        return m441a(m440a(str));
    }

    /* JADX INFO: renamed from: f */
    public Locale m443f() {
        return this.f520e;
    }
}
