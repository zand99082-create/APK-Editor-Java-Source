package p000a.p013c;

import com.gmail.heagoo.p084a.p089c.C1067a;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: a.c.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0073a implements InterfaceC0076d {

    /* JADX INFO: renamed from: a */
    protected Set f212a;

    /* JADX INFO: renamed from: b */
    protected Map f213b;

    /* JADX INFO: renamed from: b */
    private Map m188b(boolean z) {
        if (this.f213b == null) {
            mo199b();
        }
        if (!z) {
            return this.f213b;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(this.f213b);
        for (Map.Entry entry : m189c().entrySet()) {
            for (Map.Entry entry2 : ((AbstractC0073a) entry.getValue()).m188b(true).entrySet()) {
                linkedHashMap.put(((String) entry.getKey()) + '/' + ((String) entry2.getKey()), entry2.getValue());
            }
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: c */
    private Map m189c() {
        return m188b(false);
    }

    /* JADX INFO: renamed from: j */
    private InterfaceC0076d m190j(String str) throws C0079g {
        C0074b c0074bM192l;
        AbstractC0073a abstractC0073aMo205h;
        while (true) {
            c0074bM192l = this.m192l(str);
            if (c0074bM192l.f214a == null) {
                break;
            }
            if (this.m188b(false).containsKey(c0074bM192l.f214a)) {
                abstractC0073aMo205h = (AbstractC0073a) this.m188b(false).get(c0074bM192l.f214a);
            } else {
                abstractC0073aMo205h = this.mo205h(c0074bM192l.f214a);
                this.m188b(false).put(c0074bM192l.f214a, abstractC0073aMo205h);
            }
            this = abstractC0073aMo205h;
            str = c0074bM192l.f215b;
        }
        if (this.m188b(false).containsKey(c0074bM192l.f215b)) {
            throw new C0079g(str);
        }
        AbstractC0073a abstractC0073aMo205h2 = this.mo205h(c0074bM192l.f215b);
        this.m188b(false).put(c0074bM192l.f215b, abstractC0073aMo205h2);
        return abstractC0073aMo205h2;
    }

    /* JADX INFO: renamed from: k */
    private C0075c m191k(String str) throws C0080h {
        C0074b c0074bM192l = m192l(str);
        if (c0074bM192l.f214a == null) {
            return new C0075c(this, null, c0074bM192l.f215b);
        }
        if (m188b(false).containsKey(c0074bM192l.f214a)) {
            return new C0075c(this, (AbstractC0073a) m189c().get(c0074bM192l.f214a), c0074bM192l.f215b);
        }
        throw new C0080h(str);
    }

    /* JADX INFO: renamed from: l */
    private C0074b m192l(String str) {
        int iIndexOf = str.indexOf(47);
        return iIndexOf == -1 ? new C0074b(this, null, str) : new C0074b(this, str.substring(0, iIndexOf), str.substring(iIndexOf + 1));
    }

    @Override // p000a.p013c.InterfaceC0076d
    /* JADX INFO: renamed from: a */
    public final Set mo193a(boolean z) {
        if (this.f212a == null) {
            mo194a();
        }
        if (!z) {
            return this.f212a;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(this.f212a);
        for (Map.Entry entry : m189c().entrySet()) {
            Iterator it = ((InterfaceC0076d) entry.getValue()).mo193a(true).iterator();
            while (it.hasNext()) {
                linkedHashSet.add(((String) entry.getKey()) + '/' + ((String) it.next()));
            }
        }
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: a */
    protected abstract void mo194a();

    @Override // p000a.p013c.InterfaceC0076d
    /* JADX INFO: renamed from: a */
    public final void mo195a(File file) throws C0077e {
        Iterator it = mo193a(true).iterator();
        while (it.hasNext()) {
            C1067a.m2464a(this, file, (String) it.next());
        }
    }

    @Override // p000a.p013c.InterfaceC0076d
    /* JADX INFO: renamed from: a */
    public final void mo196a(File file, String str) throws C0077e {
        C1067a.m2464a(this, file, str);
    }

    @Override // p000a.p013c.InterfaceC0076d
    /* JADX INFO: renamed from: a */
    public final boolean mo197a(String str) {
        while (true) {
            try {
                C0075c c0075cM191k = this.m191k(str);
                if (c0075cM191k.f216a == null) {
                    return this.m188b(false).containsKey(c0075cM191k.f217b);
                }
                this = c0075cM191k.f216a;
                str = c0075cM191k.f217b;
            } catch (C0080h e) {
                return false;
            }
        }
    }

    @Override // p000a.p013c.InterfaceC0076d
    /* JADX INFO: renamed from: b */
    public final InputStream mo198b(String str) throws C0080h {
        C0075c c0075cM191k;
        while (true) {
            c0075cM191k = this.m191k(str);
            if (c0075cM191k.f216a == null) {
                break;
            }
            this = c0075cM191k.f216a;
            str = c0075cM191k.f217b;
        }
        if (this.mo193a(false).contains(c0075cM191k.f217b)) {
            return this.mo203f(c0075cM191k.f217b);
        }
        throw new C0080h(str);
    }

    /* JADX INFO: renamed from: b */
    protected abstract void mo199b();

    @Override // p000a.p013c.InterfaceC0076d
    /* JADX INFO: renamed from: c */
    public final OutputStream mo200c(String str) {
        InterfaceC0076d interfaceC0076dM190j;
        C0074b c0074bM192l = m192l(str);
        if (c0074bM192l.f214a == null) {
            mo193a(false).add(c0074bM192l.f215b);
            return mo204g(c0074bM192l.f215b);
        }
        try {
            interfaceC0076dM190j = m190j(c0074bM192l.f214a);
        } catch (C0079g e) {
            interfaceC0076dM190j = (InterfaceC0076d) m188b(false).get(c0074bM192l.f214a);
        }
        return interfaceC0076dM190j.mo200c(c0074bM192l.f215b);
    }

    @Override // p000a.p013c.InterfaceC0076d
    /* JADX INFO: renamed from: d */
    public final InterfaceC0076d mo201d(String str) throws C0080h {
        C0075c c0075cM191k;
        while (true) {
            c0075cM191k = this.m191k(str);
            if (c0075cM191k.f216a == null) {
                break;
            }
            this = c0075cM191k.f216a;
            str = c0075cM191k.f217b;
        }
        if (this.m188b(false).containsKey(c0075cM191k.f217b)) {
            return (InterfaceC0076d) this.m188b(false).get(c0075cM191k.f217b);
        }
        throw new C0080h(str);
    }

    @Override // p000a.p013c.InterfaceC0076d
    /* JADX INFO: renamed from: e */
    public final boolean mo202e(String str) {
        C0075c c0075cM191k;
        while (true) {
            try {
                c0075cM191k = this.m191k(str);
                if (c0075cM191k.f216a == null) {
                    break;
                }
                this = c0075cM191k.f216a;
                str = c0075cM191k.f217b;
            } catch (C0080h e) {
                return false;
            }
        }
        if (!this.mo193a(false).contains(c0075cM191k.f217b)) {
            return false;
        }
        this.mo206i(c0075cM191k.f217b);
        this.mo193a(false).remove(c0075cM191k.f217b);
        return true;
    }

    /* JADX INFO: renamed from: f */
    protected abstract InputStream mo203f(String str);

    /* JADX INFO: renamed from: g */
    protected abstract OutputStream mo204g(String str);

    /* JADX INFO: renamed from: h */
    protected abstract AbstractC0073a mo205h(String str);

    /* JADX INFO: renamed from: i */
    protected abstract void mo206i(String str);
}
