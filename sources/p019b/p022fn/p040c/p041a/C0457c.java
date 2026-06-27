package p019b.p022fn.p040c.p041a;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p019b.p022fn.p040c.p041a.p042d.C0458a;
import p019b.p022fn.p040c.p041a.p042d.C0459b;
import p019b.p022fn.p040c.p041a.p042d.C0460c;
import p019b.p022fn.p040c.p041a.p042d.C0461d;
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

/* JADX INFO: renamed from: b.fn.c.a.c */
/* JADX INFO: loaded from: classes.dex */
public class C0457c extends C0455a {
    public C0457c(File file) {
        super(file);
    }

    /* JADX INFO: renamed from: a */
    private void m537a(C0458a c0458a) throws IOException {
        m513a(c0458a.f584a);
        m513a(c0458a.f585b);
        m520d(c0458a.f586c);
    }

    /* JADX INFO: renamed from: a */
    private void m538a(C0459b c0459b) throws IOException {
        C0459b.a aVar = c0459b.f587a;
        m537a(aVar.f600a);
        m520d(aVar.f592b);
        m520d(aVar.f593c);
        m520d(aVar.f594d);
        m520d(aVar.f595e);
        m520d(aVar.f596f);
        m514a(c0459b.f591e);
    }

    /* JADX INFO: renamed from: a */
    private void m539a(C0463f c0463f) throws IOException {
        m537a(c0463f.f600a);
        m520d(c0463f.f605b);
    }

    /* JADX INFO: renamed from: a */
    private void m540a(C0464g c0464g) throws IOException {
        m537a(c0464g.f600a);
        m520d(c0464g.f606b);
        List<C0464g.a> list = c0464g.f607c;
        if (list != null) {
            for (C0464g.a aVar : list) {
                m520d(aVar.f608a);
                m514a(aVar.f609b);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m541a(C0465h c0465h) throws IOException {
        m542a(c0465h.f610a);
        m538a(c0465h.f611b);
        m538a(c0465h.f612c);
        m548a(c0465h.f613d);
    }

    /* JADX INFO: renamed from: a */
    private void m542a(C0466i c0466i) throws IOException {
        m537a(c0466i.f600a);
        m520d(c0466i.f614b);
        m514a(c0466i.f615c);
        m520d(c0466i.f616d);
        m520d(c0466i.f617e);
        m520d(c0466i.f618f);
        m520d(c0466i.f619g);
        m520d(c0466i.f620h);
    }

    /* JADX INFO: renamed from: a */
    private void m543a(C0467j c0467j) throws IOException {
        m537a(c0467j.f600a);
        m510a(c0467j.f621b);
        m510a(c0467j.f622c);
        m513a(c0467j.f623d);
        m520d(c0467j.f624e);
        m514a(c0467j.f625f);
    }

    /* JADX INFO: renamed from: a */
    private void m544a(C0468a c0468a) throws IOException {
        m513a(c0468a.f626a);
        m513a(c0468a.f627b);
        m520d(c0468a.f628c);
        m547a(c0468a.f629d);
    }

    /* JADX INFO: renamed from: a */
    private void m545a(C0470c c0470c) throws IOException {
        m513a(c0470c.f626a);
        m513a(c0470c.f627b);
        m520d(c0470c.f628c);
        m520d(c0470c.f632e);
        m520d(c0470c.f633f);
        List<C0469b> list = c0470c.f634g;
        if (list != null) {
            for (C0469b c0469b : list) {
                m520d(c0469b.f630a);
                m547a(c0469b.f631b);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m546a(C0471d c0471d) throws IOException {
        m537a(c0471d.f600a);
        m510a(c0471d.f635b);
        m510a(c0471d.f636c);
        m513a(c0471d.f637d);
        m520d(c0471d.f638e);
        m520d(c0471d.f639f);
        m514a(c0471d.f640g.f604d);
        int[] iArr = c0471d.f641h;
        if (iArr != null) {
            for (int i : iArr) {
                m520d(i);
            }
        }
        List<C0468a> list = c0471d.f642i;
        if (list != null) {
            for (C0468a c0468a : list) {
                if (c0468a instanceof C0470c) {
                    m545a((C0470c) c0468a);
                } else {
                    m544a(c0468a);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m547a(C0472e c0472e) throws IOException {
        m513a(c0472e.f643a);
        m510a(c0472e.f644b);
        m510a(c0472e.f645c);
        m520d(c0472e.f646d);
    }

    /* JADX INFO: renamed from: a */
    private void m548a(List<C0461d> list) throws IOException {
        for (C0461d c0461d : list) {
            if (c0461d instanceof C0464g) {
                m540a((C0464g) c0461d);
            } else if (c0461d instanceof C0467j) {
                m543a((C0467j) c0461d);
            } else if (c0461d instanceof C0471d) {
                m546a((C0471d) c0461d);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m549a(C0460c c0460c) throws IOException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < c0460c.f597a.f605b; i++) {
            if (c0460c.f599c.get(i).f610a == null) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        if (arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                C0463f c0463f = c0460c.f597a;
                c0463f.f605b--;
                c0460c.f599c.remove(iIntValue);
            }
        }
        m539a(c0460c.f597a);
        m538a(c0460c.f598b);
        for (int i2 = 0; i2 < c0460c.f597a.f605b; i2++) {
            m541a(c0460c.f599c.get(i2));
        }
    }
}
