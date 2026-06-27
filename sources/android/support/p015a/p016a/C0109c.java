package android.support.p015a.p016a;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.p015a.p016a.C0110d;
import android.support.p015a.p016a.C0111e;
import android.support.p015a.p016a.C0112f;
import android.support.p015a.p016a.C0113g;
import android.support.p015a.p016a.C0115i;
import android.support.p015a.p016a.C0116j;
import android.support.p015a.p016a.C0117k;
import android.support.p015a.p017b.C0122a;
import android.support.v4.app.NotificationCompat;
import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: android.support.a.a.c */
/* JADX INFO: loaded from: classes2.dex */
public class C0109c {

    /* JADX INFO: renamed from: a */
    static final h f258a;

    /* JADX INFO: renamed from: android.support.a.a.c$a */
    public static class a extends C0113g.a {

        /* JADX INFO: renamed from: e */
        public static final C0113g.a.InterfaceC1982a f259e = new C0113g.a.InterfaceC1982a() { // from class: android.support.a.a.c.a.1
        };

        /* JADX INFO: renamed from: a */
        final Bundle f260a;

        /* JADX INFO: renamed from: b */
        public int f261b;

        /* JADX INFO: renamed from: c */
        public CharSequence f262c;

        /* JADX INFO: renamed from: d */
        public PendingIntent f263d;

        /* JADX INFO: renamed from: f */
        private final C0118l[] f264f;

        /* JADX INFO: renamed from: g */
        private boolean f265g;

        public a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i, charSequence, pendingIntent, new Bundle(), null, true);
        }

        a(int i, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, C0118l[] c0118lArr, boolean z) {
            this.f261b = i;
            this.f262c = d.m249c(charSequence);
            this.f263d = pendingIntent;
            this.f260a = bundle == null ? new Bundle() : bundle;
            this.f264f = c0118lArr;
            this.f265g = z;
        }

        @Override // android.support.p015a.p016a.C0113g.a
        /* JADX INFO: renamed from: a */
        public int mo241a() {
            return this.f261b;
        }

        @Override // android.support.p015a.p016a.C0113g.a
        /* JADX INFO: renamed from: b */
        public CharSequence mo242b() {
            return this.f262c;
        }

        @Override // android.support.p015a.p016a.C0113g.a
        /* JADX INFO: renamed from: c */
        public PendingIntent mo243c() {
            return this.f263d;
        }

        @Override // android.support.p015a.p016a.C0113g.a
        /* JADX INFO: renamed from: d */
        public Bundle mo244d() {
            return this.f260a;
        }

        @Override // android.support.p015a.p016a.C0113g.a
        /* JADX INFO: renamed from: e */
        public boolean mo245e() {
            return this.f265g;
        }

        @Override // android.support.p015a.p016a.C0113g.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public C0118l[] mo247g() {
            return this.f264f;
        }
    }

    /* JADX INFO: renamed from: android.support.a.a.c$b */
    public static class b extends q {

        /* JADX INFO: renamed from: a */
        Bitmap f266a;

        /* JADX INFO: renamed from: b */
        Bitmap f267b;

        /* JADX INFO: renamed from: c */
        boolean f268c;
    }

    /* JADX INFO: renamed from: android.support.a.a.c$c */
    public static class c extends q {

        /* JADX INFO: renamed from: a */
        CharSequence f269a;
    }

    /* JADX INFO: renamed from: android.support.a.a.c$d */
    public static class d {

        /* JADX INFO: renamed from: B */
        Notification f271B;

        /* JADX INFO: renamed from: C */
        RemoteViews f272C;

        /* JADX INFO: renamed from: D */
        RemoteViews f273D;

        /* JADX INFO: renamed from: E */
        RemoteViews f274E;

        /* JADX INFO: renamed from: G */
        public ArrayList<String> f276G;

        /* JADX INFO: renamed from: a */
        public Context f277a;

        /* JADX INFO: renamed from: b */
        public CharSequence f278b;

        /* JADX INFO: renamed from: c */
        public CharSequence f279c;

        /* JADX INFO: renamed from: d */
        PendingIntent f280d;

        /* JADX INFO: renamed from: e */
        PendingIntent f281e;

        /* JADX INFO: renamed from: f */
        RemoteViews f282f;

        /* JADX INFO: renamed from: g */
        public Bitmap f283g;

        /* JADX INFO: renamed from: h */
        public CharSequence f284h;

        /* JADX INFO: renamed from: i */
        public int f285i;

        /* JADX INFO: renamed from: j */
        int f286j;

        /* JADX INFO: renamed from: l */
        public boolean f288l;

        /* JADX INFO: renamed from: m */
        public q f289m;

        /* JADX INFO: renamed from: n */
        public CharSequence f290n;

        /* JADX INFO: renamed from: o */
        public CharSequence[] f291o;

        /* JADX INFO: renamed from: p */
        int f292p;

        /* JADX INFO: renamed from: q */
        int f293q;

        /* JADX INFO: renamed from: r */
        boolean f294r;

        /* JADX INFO: renamed from: s */
        String f295s;

        /* JADX INFO: renamed from: t */
        boolean f296t;

        /* JADX INFO: renamed from: u */
        String f297u;

        /* JADX INFO: renamed from: x */
        String f300x;

        /* JADX INFO: renamed from: y */
        Bundle f301y;

        /* JADX INFO: renamed from: k */
        boolean f287k = true;

        /* JADX INFO: renamed from: v */
        public ArrayList<a> f298v = new ArrayList<>();

        /* JADX INFO: renamed from: w */
        boolean f299w = false;

        /* JADX INFO: renamed from: z */
        int f302z = 0;

        /* JADX INFO: renamed from: A */
        int f270A = 0;

        /* JADX INFO: renamed from: F */
        public Notification f275F = new Notification();

        public d(Context context) {
            this.f277a = context;
            this.f275F.when = System.currentTimeMillis();
            this.f275F.audioStreamType = -1;
            this.f286j = 0;
            this.f276G = new ArrayList<>();
        }

        /* JADX INFO: renamed from: a */
        private void m248a(int i, boolean z) {
            if (z) {
                this.f275F.flags |= i;
            } else {
                this.f275F.flags &= i ^ (-1);
            }
        }

        /* JADX INFO: renamed from: c */
        protected static CharSequence m249c(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        /* JADX INFO: renamed from: a */
        public Notification m250a() {
            return C0109c.f258a.mo271a(this, m258b());
        }

        /* JADX INFO: renamed from: a */
        public d m251a(int i) {
            this.f275F.icon = i;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public d m252a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f298v.add(new a(i, charSequence, pendingIntent));
            return this;
        }

        /* JADX INFO: renamed from: a */
        public d m253a(PendingIntent pendingIntent) {
            this.f280d = pendingIntent;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public d m254a(CharSequence charSequence) {
            this.f278b = m249c(charSequence);
            return this;
        }

        /* JADX INFO: renamed from: a */
        public d m255a(boolean z) {
            m248a(2, z);
            return this;
        }

        /* JADX INFO: renamed from: b */
        public d m256b(int i) {
            this.f302z = i;
            return this;
        }

        /* JADX INFO: renamed from: b */
        public d m257b(CharSequence charSequence) {
            this.f279c = m249c(charSequence);
            return this;
        }

        /* JADX INFO: renamed from: b */
        protected e m258b() {
            return new e();
        }

        /* JADX INFO: renamed from: c */
        public d m259c(int i) {
            this.f270A = i;
            return this;
        }

        /* JADX INFO: renamed from: c */
        protected CharSequence m260c() {
            return this.f279c;
        }

        /* JADX INFO: renamed from: d */
        protected CharSequence m261d() {
            return this.f278b;
        }
    }

    /* JADX INFO: renamed from: android.support.a.a.c$e */
    protected static class e {
        protected e() {
        }

        /* JADX INFO: renamed from: a */
        public Notification m262a(d dVar, InterfaceC0108b interfaceC0108b) {
            Notification notificationMo237b = interfaceC0108b.mo237b();
            if (dVar.f272C != null) {
                notificationMo237b.contentView = dVar.f272C;
            }
            return notificationMo237b;
        }
    }

    /* JADX INFO: renamed from: android.support.a.a.c$f */
    public static class f extends q {

        /* JADX INFO: renamed from: a */
        ArrayList<CharSequence> f303a = new ArrayList<>();
    }

    /* JADX INFO: renamed from: android.support.a.a.c$g */
    public static class g extends q {

        /* JADX INFO: renamed from: a */
        CharSequence f304a;

        /* JADX INFO: renamed from: b */
        CharSequence f305b;

        /* JADX INFO: renamed from: c */
        List<a> f306c = new ArrayList();

        /* JADX INFO: renamed from: android.support.a.a.c$g$a */
        public static final class a {

            /* JADX INFO: renamed from: a */
            private final CharSequence f307a;

            /* JADX INFO: renamed from: b */
            private final long f308b;

            /* JADX INFO: renamed from: c */
            private final CharSequence f309c;

            /* JADX INFO: renamed from: d */
            private String f310d;

            /* JADX INFO: renamed from: e */
            private Uri f311e;

            /* JADX INFO: renamed from: a */
            static Bundle[] m264a(List<a> list) {
                Bundle[] bundleArr = new Bundle[list.size()];
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    bundleArr[i] = list.get(i).m265f();
                }
                return bundleArr;
            }

            /* JADX INFO: renamed from: f */
            private Bundle m265f() {
                Bundle bundle = new Bundle();
                if (this.f307a != null) {
                    bundle.putCharSequence("text", this.f307a);
                }
                bundle.putLong("time", this.f308b);
                if (this.f309c != null) {
                    bundle.putCharSequence("sender", this.f309c);
                }
                if (this.f310d != null) {
                    bundle.putString("type", this.f310d);
                }
                if (this.f311e != null) {
                    bundle.putParcelable("uri", this.f311e);
                }
                return bundle;
            }

            /* JADX INFO: renamed from: a */
            public CharSequence m266a() {
                return this.f307a;
            }

            /* JADX INFO: renamed from: b */
            public long m267b() {
                return this.f308b;
            }

            /* JADX INFO: renamed from: c */
            public CharSequence m268c() {
                return this.f309c;
            }

            /* JADX INFO: renamed from: d */
            public String m269d() {
                return this.f310d;
            }

            /* JADX INFO: renamed from: e */
            public Uri m270e() {
                return this.f311e;
            }
        }

        g() {
        }

        @Override // android.support.p015a.p016a.C0109c.q
        /* JADX INFO: renamed from: a */
        public void mo263a(Bundle bundle) {
            super.mo263a(bundle);
            if (this.f304a != null) {
                bundle.putCharSequence(NotificationCompat.EXTRA_SELF_DISPLAY_NAME, this.f304a);
            }
            if (this.f305b != null) {
                bundle.putCharSequence(NotificationCompat.EXTRA_CONVERSATION_TITLE, this.f305b);
            }
            if (this.f306c.isEmpty()) {
                return;
            }
            bundle.putParcelableArray(NotificationCompat.EXTRA_MESSAGES, a.m264a(this.f306c));
        }
    }

    /* JADX INFO: renamed from: android.support.a.a.c$h */
    interface h {
        /* JADX INFO: renamed from: a */
        Notification mo271a(d dVar, e eVar);
    }

    /* JADX INFO: renamed from: android.support.a.a.c$i */
    static class i extends p {
        i() {
        }

        @Override // android.support.p015a.p016a.C0109c.p, android.support.p015a.p016a.C0109c.o, android.support.p015a.p016a.C0109c.l, android.support.p015a.p016a.C0109c.h
        /* JADX INFO: renamed from: a */
        public Notification mo271a(d dVar, e eVar) {
            C0110d.a aVar = new C0110d.a(dVar.f277a, dVar.f275F, dVar.m261d(), dVar.m260c(), dVar.f284h, dVar.f282f, dVar.f285i, dVar.f280d, dVar.f281e, dVar.f283g, dVar.f292p, dVar.f293q, dVar.f294r, dVar.f287k, dVar.f288l, dVar.f286j, dVar.f290n, dVar.f299w, dVar.f276G, dVar.f301y, dVar.f295s, dVar.f296t, dVar.f297u, dVar.f272C, dVar.f273D);
            C0109c.m238a(aVar, dVar.f298v);
            C0109c.m239a(aVar, dVar.f289m);
            Notification notificationM262a = eVar.m262a(dVar, aVar);
            if (dVar.f289m != null) {
                dVar.f289m.mo263a(mo272a(notificationM262a));
            }
            return notificationM262a;
        }
    }

    /* JADX INFO: renamed from: android.support.a.a.c$j */
    static class j extends i {
        j() {
        }

        @Override // android.support.p015a.p016a.C0109c.i, android.support.p015a.p016a.C0109c.p, android.support.p015a.p016a.C0109c.o, android.support.p015a.p016a.C0109c.l, android.support.p015a.p016a.C0109c.h
        /* JADX INFO: renamed from: a */
        public Notification mo271a(d dVar, e eVar) {
            C0111e.a aVar = new C0111e.a(dVar.f277a, dVar.f275F, dVar.m261d(), dVar.m260c(), dVar.f284h, dVar.f282f, dVar.f285i, dVar.f280d, dVar.f281e, dVar.f283g, dVar.f292p, dVar.f293q, dVar.f294r, dVar.f287k, dVar.f288l, dVar.f286j, dVar.f290n, dVar.f299w, dVar.f300x, dVar.f276G, dVar.f301y, dVar.f302z, dVar.f270A, dVar.f271B, dVar.f295s, dVar.f296t, dVar.f297u, dVar.f272C, dVar.f273D, dVar.f274E);
            C0109c.m238a(aVar, dVar.f298v);
            C0109c.m239a(aVar, dVar.f289m);
            Notification notificationM262a = eVar.m262a(dVar, aVar);
            if (dVar.f289m != null) {
                dVar.f289m.mo263a(mo272a(notificationM262a));
            }
            return notificationM262a;
        }
    }

    /* JADX INFO: renamed from: android.support.a.a.c$k */
    static class k extends j {
        k() {
        }

        @Override // android.support.p015a.p016a.C0109c.j, android.support.p015a.p016a.C0109c.i, android.support.p015a.p016a.C0109c.p, android.support.p015a.p016a.C0109c.o, android.support.p015a.p016a.C0109c.l, android.support.p015a.p016a.C0109c.h
        /* JADX INFO: renamed from: a */
        public Notification mo271a(d dVar, e eVar) {
            C0112f.a aVar = new C0112f.a(dVar.f277a, dVar.f275F, dVar.f278b, dVar.f279c, dVar.f284h, dVar.f282f, dVar.f285i, dVar.f280d, dVar.f281e, dVar.f283g, dVar.f292p, dVar.f293q, dVar.f294r, dVar.f287k, dVar.f288l, dVar.f286j, dVar.f290n, dVar.f299w, dVar.f300x, dVar.f276G, dVar.f301y, dVar.f302z, dVar.f270A, dVar.f271B, dVar.f295s, dVar.f296t, dVar.f297u, dVar.f291o, dVar.f272C, dVar.f273D, dVar.f274E);
            C0109c.m238a(aVar, dVar.f298v);
            C0109c.m240b(aVar, dVar.f289m);
            Notification notificationM262a = eVar.m262a(dVar, aVar);
            if (dVar.f289m != null) {
                dVar.f289m.mo263a(mo272a(notificationM262a));
            }
            return notificationM262a;
        }
    }

    /* JADX INFO: renamed from: android.support.a.a.c$l */
    static class l implements h {
        l() {
        }

        @Override // android.support.p015a.p016a.C0109c.h
        /* JADX INFO: renamed from: a */
        public Notification mo271a(d dVar, e eVar) {
            Notification notificationM275a = C0113g.m275a(dVar.f275F, dVar.f277a, dVar.m261d(), dVar.m260c(), dVar.f280d, dVar.f281e);
            if (dVar.f286j > 0) {
                notificationM275a.flags |= 128;
            }
            if (dVar.f272C != null) {
                notificationM275a.contentView = dVar.f272C;
            }
            return notificationM275a;
        }

        /* JADX INFO: renamed from: a */
        public Bundle mo272a(Notification notification) {
            return null;
        }
    }

    /* JADX INFO: renamed from: android.support.a.a.c$m */
    static class m extends l {
        m() {
        }

        @Override // android.support.p015a.p016a.C0109c.l, android.support.p015a.p016a.C0109c.h
        /* JADX INFO: renamed from: a */
        public Notification mo271a(d dVar, e eVar) {
            Notification notificationM276a = C0114h.m276a(dVar.f277a, dVar.f275F, dVar.m261d(), dVar.m260c(), dVar.f284h, dVar.f282f, dVar.f285i, dVar.f280d, dVar.f281e, dVar.f283g);
            if (dVar.f272C != null) {
                notificationM276a.contentView = dVar.f272C;
            }
            return notificationM276a;
        }
    }

    /* JADX INFO: renamed from: android.support.a.a.c$n */
    static class n extends l {
        n() {
        }

        @Override // android.support.p015a.p016a.C0109c.l, android.support.p015a.p016a.C0109c.h
        /* JADX INFO: renamed from: a */
        public Notification mo271a(d dVar, e eVar) {
            return eVar.m262a(dVar, new C0115i.a(dVar.f277a, dVar.f275F, dVar.m261d(), dVar.m260c(), dVar.f284h, dVar.f282f, dVar.f285i, dVar.f280d, dVar.f281e, dVar.f283g, dVar.f292p, dVar.f293q, dVar.f294r));
        }
    }

    /* JADX INFO: renamed from: android.support.a.a.c$o */
    static class o extends l {
        o() {
        }

        @Override // android.support.p015a.p016a.C0109c.l, android.support.p015a.p016a.C0109c.h
        /* JADX INFO: renamed from: a */
        public Notification mo271a(d dVar, e eVar) {
            Bundle bundleMo272a;
            C0116j.a aVar = new C0116j.a(dVar.f277a, dVar.f275F, dVar.m261d(), dVar.m260c(), dVar.f284h, dVar.f282f, dVar.f285i, dVar.f280d, dVar.f281e, dVar.f283g, dVar.f292p, dVar.f293q, dVar.f294r, dVar.f288l, dVar.f286j, dVar.f290n, dVar.f299w, dVar.f301y, dVar.f295s, dVar.f296t, dVar.f297u, dVar.f272C, dVar.f273D);
            C0109c.m238a(aVar, dVar.f298v);
            C0109c.m239a(aVar, dVar.f289m);
            Notification notificationM262a = eVar.m262a(dVar, aVar);
            if (dVar.f289m != null && (bundleMo272a = mo272a(notificationM262a)) != null) {
                dVar.f289m.mo263a(bundleMo272a);
            }
            return notificationM262a;
        }

        @Override // android.support.p015a.p016a.C0109c.l
        /* JADX INFO: renamed from: a */
        public Bundle mo272a(Notification notification) {
            return C0116j.m278a(notification);
        }
    }

    /* JADX INFO: renamed from: android.support.a.a.c$p */
    static class p extends o {
        p() {
        }

        @Override // android.support.p015a.p016a.C0109c.o, android.support.p015a.p016a.C0109c.l, android.support.p015a.p016a.C0109c.h
        /* JADX INFO: renamed from: a */
        public Notification mo271a(d dVar, e eVar) {
            C0117k.a aVar = new C0117k.a(dVar.f277a, dVar.f275F, dVar.m261d(), dVar.m260c(), dVar.f284h, dVar.f282f, dVar.f285i, dVar.f280d, dVar.f281e, dVar.f283g, dVar.f292p, dVar.f293q, dVar.f294r, dVar.f287k, dVar.f288l, dVar.f286j, dVar.f290n, dVar.f299w, dVar.f276G, dVar.f301y, dVar.f295s, dVar.f296t, dVar.f297u, dVar.f272C, dVar.f273D);
            C0109c.m238a(aVar, dVar.f298v);
            C0109c.m239a(aVar, dVar.f289m);
            return eVar.m262a(dVar, aVar);
        }

        @Override // android.support.p015a.p016a.C0109c.o, android.support.p015a.p016a.C0109c.l
        /* JADX INFO: renamed from: a */
        public Bundle mo272a(Notification notification) {
            return C0117k.m283a(notification);
        }
    }

    /* JADX INFO: renamed from: android.support.a.a.c$q */
    public static abstract class q {

        /* JADX INFO: renamed from: d */
        CharSequence f312d;

        /* JADX INFO: renamed from: e */
        CharSequence f313e;

        /* JADX INFO: renamed from: f */
        boolean f314f = false;

        /* JADX INFO: renamed from: a */
        public void mo263a(Bundle bundle) {
        }
    }

    static {
        if (C0122a.m292a()) {
            f258a = new k();
            return;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            f258a = new j();
            return;
        }
        if (Build.VERSION.SDK_INT >= 20) {
            f258a = new i();
            return;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            f258a = new p();
            return;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            f258a = new o();
            return;
        }
        if (Build.VERSION.SDK_INT >= 14) {
            f258a = new n();
        } else if (Build.VERSION.SDK_INT >= 11) {
            f258a = new m();
        } else {
            f258a = new l();
        }
    }

    /* JADX INFO: renamed from: a */
    static void m238a(InterfaceC0107a interfaceC0107a, ArrayList<a> arrayList) {
        Iterator<a> it = arrayList.iterator();
        while (it.hasNext()) {
            interfaceC0107a.mo235a(it.next());
        }
    }

    /* JADX INFO: renamed from: a */
    static void m239a(InterfaceC0108b interfaceC0108b, q qVar) {
        if (qVar != null) {
            if (qVar instanceof c) {
                c cVar = (c) qVar;
                C0116j.m281a(interfaceC0108b, cVar.f312d, cVar.f314f, cVar.f313e, cVar.f269a);
            } else if (qVar instanceof f) {
                f fVar = (f) qVar;
                C0116j.m282a(interfaceC0108b, fVar.f312d, fVar.f314f, fVar.f313e, fVar.f303a);
            } else if (qVar instanceof b) {
                b bVar = (b) qVar;
                C0116j.m280a(interfaceC0108b, bVar.f312d, bVar.f314f, bVar.f313e, bVar.f266a, bVar.f267b, bVar.f268c);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    static void m240b(InterfaceC0108b interfaceC0108b, q qVar) {
        if (qVar != null) {
            if (!(qVar instanceof g)) {
                m239a(interfaceC0108b, qVar);
                return;
            }
            g gVar = (g) qVar;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            for (g.a aVar : gVar.f306c) {
                arrayList.add(aVar.m266a());
                arrayList2.add(Long.valueOf(aVar.m267b()));
                arrayList3.add(aVar.m268c());
                arrayList4.add(aVar.m269d());
                arrayList5.add(aVar.m270e());
            }
            C0112f.m274a(interfaceC0108b, gVar.f304a, gVar.f305b, arrayList, arrayList2, arrayList3, arrayList4, arrayList5);
        }
    }
}
