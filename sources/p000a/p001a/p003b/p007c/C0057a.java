package p000a.p001a.p003b.p007c;

import java.io.File;
import p000a.p013c.C0078f;
import p000a.p013c.C0081i;
import p000a.p013c.InterfaceC0076d;

/* JADX INFO: renamed from: a.a.b.c.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0057a extends File {

    /* JADX INFO: renamed from: a */
    private InterfaceC0076d f172a;

    public C0057a(File file) {
        super(file.getPath());
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC0076d m158a() {
        if (this.f172a == null) {
            if (isDirectory()) {
                this.f172a = new C0078f(this);
            } else {
                this.f172a = new C0081i(this);
            }
        }
        return this.f172a;
    }
}
