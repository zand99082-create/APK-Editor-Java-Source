package android.support.p015a.p016a;

import android.os.Build;
import android.os.Bundle;
import android.support.p015a.p016a.C0120n;

/* JADX INFO: renamed from: android.support.a.a.l */
/* JADX INFO: loaded from: classes2.dex */
public final class C0118l extends C0120n.a {

    /* JADX INFO: renamed from: a */
    public static final C0120n.a.InterfaceC1983a f341a;

    /* JADX INFO: renamed from: g */
    private static final a f342g;

    /* JADX INFO: renamed from: b */
    private final String f343b;

    /* JADX INFO: renamed from: c */
    private final CharSequence f344c;

    /* JADX INFO: renamed from: d */
    private final CharSequence[] f345d;

    /* JADX INFO: renamed from: e */
    private final boolean f346e;

    /* JADX INFO: renamed from: f */
    private final Bundle f347f;

    /* JADX INFO: renamed from: android.support.a.a.l$a */
    interface a {
    }

    /* JADX INFO: renamed from: android.support.a.a.l$b */
    static class b implements a {
        b() {
        }
    }

    /* JADX INFO: renamed from: android.support.a.a.l$c */
    static class c implements a {
        c() {
        }
    }

    /* JADX INFO: renamed from: android.support.a.a.l$d */
    static class d implements a {
        d() {
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 20) {
            f342g = new b();
        } else if (Build.VERSION.SDK_INT >= 16) {
            f342g = new d();
        } else {
            f342g = new c();
        }
        f341a = new C0120n.a.InterfaceC1983a() { // from class: android.support.a.a.l.1
        };
    }

    @Override // android.support.p015a.p016a.C0120n.a
    /* JADX INFO: renamed from: a */
    public String mo284a() {
        return this.f343b;
    }

    @Override // android.support.p015a.p016a.C0120n.a
    /* JADX INFO: renamed from: b */
    public CharSequence mo285b() {
        return this.f344c;
    }

    @Override // android.support.p015a.p016a.C0120n.a
    /* JADX INFO: renamed from: c */
    public CharSequence[] mo286c() {
        return this.f345d;
    }

    @Override // android.support.p015a.p016a.C0120n.a
    /* JADX INFO: renamed from: d */
    public boolean mo287d() {
        return this.f346e;
    }

    @Override // android.support.p015a.p016a.C0120n.a
    /* JADX INFO: renamed from: e */
    public Bundle mo288e() {
        return this.f347f;
    }
}
