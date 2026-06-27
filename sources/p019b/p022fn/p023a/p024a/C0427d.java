package p019b.p022fn.p023a.p024a;

import com.github.megatronking.stringfog.xor.StringFogImpl;
import p019b.p022fn.p023a.p024a.C0425b;

/* JADX INFO: renamed from: b.fn.a.a.d */
/* JADX INFO: loaded from: classes.dex */
class C0427d {

    /* JADX INFO: renamed from: a */
    private C0425b f484a;

    /* JADX INFO: renamed from: b */
    private String f485b;

    C0427d(C0425b c0425b, String str) {
        this.f484a = c0425b;
        this.f485b = str;
    }

    /* JADX INFO: renamed from: b */
    private C0425b.a m400b() {
        C0425b.a aVar = new C0425b.a();
        aVar.m398a("Signature-Version", "1.0");
        aVar.m398a("Created-By", "PseudoApkSigner 1.6 (AntiSplit-G2)");
        aVar.m398a(this.f485b + "-Digest-Manifest", C0428e.m402a(C0428e.m406a(this.f484a.m394a().getBytes(StringFogImpl.CHARSET_NAME_UTF_8), this.f485b)));
        return aVar;
    }

    /* JADX INFO: renamed from: a */
    String m401a() {
        StringBuilder sb = new StringBuilder();
        sb.append(m400b().toString());
        for (C0425b.a aVar : this.f484a.m396b()) {
            C0425b.a aVar2 = new C0425b.a();
            aVar2.m398a("Name", aVar.m397a("Name"));
            aVar2.m398a(this.f485b + "-Digest", C0428e.m402a(C0428e.m406a(aVar.toString().getBytes(StringFogImpl.CHARSET_NAME_UTF_8), this.f485b)));
            sb.append(aVar2.toString());
        }
        return sb.toString();
    }
}
