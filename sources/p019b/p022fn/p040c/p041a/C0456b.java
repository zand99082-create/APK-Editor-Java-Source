package p019b.p022fn.p040c.p041a;

import android.support.v4.internal.view.SupportMenu;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p019b.p022fn.p040c.p041a.p042d.C0458a;
import p019b.p022fn.p040c.p041a.p042d.C0459b;
import p019b.p022fn.p040c.p041a.p042d.C0460c;
import p019b.p022fn.p040c.p041a.p042d.C0461d;
import p019b.p022fn.p040c.p041a.p042d.C0462e;
import p019b.p022fn.p040c.p041a.p042d.C0463f;
import p019b.p022fn.p040c.p041a.p042d.C0464g;
import p019b.p022fn.p040c.p041a.p042d.C0465h;
import p019b.p022fn.p040c.p041a.p042d.C0466i;
import p019b.p022fn.p040c.p041a.p042d.C0467j;
import p019b.p022fn.p040c.p041a.p042d.p043k.C0468a;
import p019b.p022fn.p040c.p041a.p042d.p043k.C0469b;
import p019b.p022fn.p040c.p041a.p042d.p043k.C0470c;
import p019b.p022fn.p040c.p041a.p042d.p043k.C0471d;
import p019b.p022fn.p040c.p041a.p042d.p043k.C0472e;
import p019b.p022fn.p040c.p041a.p045f.C0475a;

/* JADX INFO: renamed from: b.fn.c.a.b */
/* JADX INFO: loaded from: classes.dex */
public class C0456b extends C0455a {
    public C0456b(File file) {
        super(file);
    }

    /* JADX INFO: renamed from: a */
    private C0464g m522a(C0458a c0458a) {
        C0464g c0464g = new C0464g();
        c0464g.f600a = c0458a;
        c0464g.f606b = m519d();
        c0464g.f607c = new ArrayList();
        for (int i = 0; i < c0464g.f606b; i++) {
            C0464g.a aVar = new C0464g.a();
            aVar.f608a = m519d();
            aVar.f609b = m516b(256);
            c0464g.f607c.add(aVar);
        }
        return c0464g;
    }

    /* JADX INFO: renamed from: a */
    private C0471d m523a(long j, C0458a c0458a) throws IOException {
        C0471d c0471d = new C0471d();
        c0471d.f600a = c0458a;
        c0471d.f635b = m517c();
        c0471d.f636c = m517c();
        c0471d.f637d = m521e();
        c0471d.f638e = m519d();
        c0471d.f639f = m519d();
        c0471d.f640g = m530i();
        m512a(((long) c0458a.f585b) + j);
        int[] iArrM518c = m518c(c0471d.f638e);
        c0471d.f641h = iArrM518c;
        c0471d.f642i = m524a(j + ((long) c0471d.f639f), iArrM518c);
        return c0471d;
    }

    /* JADX INFO: renamed from: a */
    private List<C0468a> m524a(long j, int[] iArr) throws IOException {
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            if (i != -1) {
                m512a(((long) i) + j);
                arrayList.add(m531j());
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    private byte[][] m525a(int i, long j, int[] iArr) throws IOException {
        boolean zM554a = C0475a.m554a(i);
        int length = iArr.length;
        byte[][] bArr = new byte[length][];
        for (int i2 = 0; i2 < length; i2++) {
            long j2 = ((long) iArr[i2]) + j;
            m512a(j2);
            byte[] bArr2 = {m517c(), m517c(), m517c(), m517c()};
            int[] iArrM557b = zM554a ? C0475a.m557b(bArr2, 0) : C0475a.m556a(bArr2, 0);
            m512a(j2 + ((long) iArrM557b[0]));
            bArr[i2] = m516b(iArrM557b[1]);
        }
        return bArr;
    }

    /* JADX INFO: renamed from: b */
    private C0467j m526b(C0458a c0458a) {
        C0467j c0467j = new C0467j();
        c0467j.f600a = c0458a;
        c0467j.f621b = m517c();
        c0467j.f622c = m517c();
        c0467j.f623d = m521e();
        c0467j.f624e = m519d();
        c0467j.f625f = m516b(c0458a.f586c - c0458a.f585b);
        return c0467j;
    }

    /* JADX INFO: renamed from: b */
    private List<C0461d> m527b(long j) throws IOException {
        C0461d c0461dM523a;
        ArrayList arrayList = new ArrayList();
        long jM515b = m515b();
        long j2 = j + jM515b;
        while (jM515b < j2) {
            m512a(jM515b);
            C0458a c0458aM528g = m528g();
            short s = c0458aM528g.f584a;
            if (s == 515) {
                c0461dM523a = m522a(c0458aM528g);
            } else if (s == 514) {
                c0461dM523a = m526b(c0458aM528g);
            } else {
                if (s != 513) {
                    throw new IOException("read package error");
                }
                c0461dM523a = m523a(jM515b, c0458aM528g);
            }
            arrayList.add(c0461dM523a);
            jM515b += (long) c0458aM528g.f586c;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: g */
    private C0458a m528g() {
        C0458a c0458a = new C0458a();
        c0458a.f584a = m521e();
        c0458a.f585b = m521e();
        c0458a.f586c = m519d();
        return c0458a;
    }

    /* JADX INFO: renamed from: h */
    private C0459b m529h() throws IOException {
        long jM515b = m515b();
        C0459b c0459b = new C0459b();
        C0459b.a aVar = new C0459b.a();
        c0459b.f587a = aVar;
        aVar.f600a = m528g();
        C0459b.a aVar2 = c0459b.f587a;
        aVar2.f592b = m519d();
        aVar2.f593c = m519d();
        aVar2.f594d = m519d();
        aVar2.f595e = m519d();
        aVar2.f596f = m519d();
        C0458a c0458a = aVar2.f600a;
        int i = c0458a.f586c - c0458a.f585b;
        c0459b.f591e = m516b(i);
        m511a(i);
        c0459b.f588b = m518c(aVar2.f592b);
        c0459b.f589c = m518c(aVar2.f593c);
        c0459b.f590d = m525a(aVar2.f594d, ((long) aVar2.f595e) + jM515b, c0459b.f588b);
        m525a(aVar2.f594d, ((long) aVar2.f596f) + jM515b, c0459b.f589c);
        m512a(jM515b + ((long) c0458a.f586c));
        return c0459b;
    }

    /* JADX INFO: renamed from: i */
    private C0462e m530i() throws IOException {
        C0462e c0462e = new C0462e();
        c0462e.f601a = m519d();
        m511a(4);
        c0462e.f604d = m516b(c0462e.f601a);
        m511a(c0462e.f601a - 4);
        m521e();
        m521e();
        c0462e.f602b = m516b(2);
        c0462e.f603c = m516b(2);
        m517c();
        m517c();
        m521e();
        m517c();
        m517c();
        m517c();
        m517c();
        m521e();
        m521e();
        m521e();
        m521e();
        if (c0462e.f601a >= 33) {
            m517c();
            m517c();
            m521e();
        }
        if (c0462e.f601a >= 37) {
            m521e();
            m521e();
        }
        if (c0462e.f601a >= 39) {
            m521e();
        }
        return c0462e;
    }

    /* JADX INFO: renamed from: j */
    private C0468a m531j() {
        short sM521e = m521e();
        short sM521e2 = m521e();
        int iM519d = m519d();
        if ((sM521e2 & 1) == 0) {
            C0468a c0468a = new C0468a();
            c0468a.f626a = sM521e;
            c0468a.f627b = sM521e2;
            c0468a.f628c = iM519d;
            c0468a.f629d = m535n();
            return c0468a;
        }
        C0470c c0470c = new C0470c();
        c0470c.f626a = sM521e;
        c0470c.f627b = sM521e2;
        c0470c.f628c = iM519d;
        c0470c.f632e = m519d();
        c0470c.f633f = m519d() & SupportMenu.USER_MASK;
        c0470c.f634g = new ArrayList();
        for (int i = 0; i < c0470c.f633f; i++) {
            C0469b c0469b = new C0469b();
            c0469b.f630a = m519d();
            c0469b.f631b = m535n();
            c0470c.f634g.add(c0469b);
        }
        return c0470c;
    }

    /* JADX INFO: renamed from: k */
    private C0463f m532k() {
        C0463f c0463f = new C0463f();
        c0463f.f600a = m528g();
        c0463f.f605b = m519d();
        return c0463f;
    }

    /* JADX INFO: renamed from: l */
    private C0465h m533l() throws IOException {
        long jM515b = m515b();
        C0465h c0465h = new C0465h();
        C0466i c0466iM534m = m534m();
        c0465h.f610a = c0466iM534m;
        m512a(((long) c0466iM534m.f616d) + jM515b);
        c0465h.f611b = m529h();
        m512a(((long) c0465h.f610a.f618f) + jM515b);
        C0459b c0459bM529h = m529h();
        c0465h.f612c = c0459bM529h;
        m512a(jM515b + ((long) (c0465h.f610a.f600a.f585b + c0465h.f611b.f587a.f600a.f586c + c0459bM529h.f587a.f600a.f586c)));
        c0465h.f613d = m527b(c0465h.f610a.f600a.f586c - r4);
        return c0465h;
    }

    /* JADX INFO: renamed from: m */
    private C0466i m534m() {
        C0466i c0466i = new C0466i();
        c0466i.f600a = m528g();
        c0466i.f614b = m519d();
        c0466i.f615c = m516b(256);
        c0466i.f616d = m519d();
        c0466i.f617e = m519d();
        c0466i.f618f = m519d();
        c0466i.f619g = m519d();
        c0466i.f620h = m519d();
        return c0466i;
    }

    /* JADX INFO: renamed from: n */
    private C0472e m535n() {
        C0472e c0472e = new C0472e();
        c0472e.f643a = m521e();
        c0472e.f644b = m517c();
        c0472e.f645c = m517c();
        c0472e.f646d = m519d();
        return c0472e;
    }

    /* JADX INFO: renamed from: f */
    public C0460c m536f() {
        C0460c c0460c = new C0460c();
        c0460c.f597a = m532k();
        c0460c.f598b = m529h();
        int i = c0460c.f597a.f605b;
        if (i == 0) {
            return null;
        }
        c0460c.f599c = new ArrayList();
        for (int i2 = 0; i2 < i; i2++) {
            c0460c.f599c.add(m533l());
        }
        return c0460c;
    }
}
