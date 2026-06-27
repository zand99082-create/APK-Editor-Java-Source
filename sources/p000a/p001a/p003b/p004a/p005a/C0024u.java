package p000a.p001a.p003b.p004a.p005a;

import com.gmail.heagoo.p084a.p089c.C1067a;
import java.io.IOException;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: renamed from: a.a.b.a.a.u */
/* JADX INFO: loaded from: classes.dex */
public final class C0024u extends AbstractC0023t {

    /* JADX INFO: renamed from: a */
    private static Pattern f31a = Pattern.compile("\\d{9,}");

    public C0024u(String str, int i) {
        super("string", i, str);
    }

    public C0024u(String str, int i, String str2, boolean z) {
        super("string", i, str, str2, z);
    }

    @Override // p000a.p001a.p003b.p004a.p005a.AbstractC0023t
    /* JADX INFO: renamed from: a */
    protected final String mo5a() {
        throw new UnsupportedOperationException();
    }

    @Override // p000a.p001a.p003b.p004a.p005a.AbstractC0023t
    /* JADX INFO: renamed from: a */
    protected final void mo14a(XmlSerializer xmlSerializer) throws IOException {
        if (C1067a.m2528d(this.f28b)) {
            xmlSerializer.attribute(null, "formatted", "false");
        }
    }

    @Override // p000a.p001a.p003b.p004a.p005a.AbstractC0023t
    /* JADX INFO: renamed from: f */
    public final String mo15f() {
        String strM2501b = C1067a.m2501b(this.f28b);
        return (strM2501b == null || strM2501b.isEmpty() || !f31a.matcher(strM2501b).matches()) ? strM2501b : "\\ " + strM2501b;
    }

    @Override // p000a.p001a.p003b.p004a.p005a.AbstractC0023t
    /* JADX INFO: renamed from: g */
    public final String mo16g() {
        return C1067a.m2531e(C1067a.m2516c(this.f28b));
    }

    @Override // p000a.p001a.p003b.p004a.p005a.AbstractC0023t
    /* JADX INFO: renamed from: h */
    public final String mo17h() {
        return C1067a.m2516c(this.f28b);
    }
}
