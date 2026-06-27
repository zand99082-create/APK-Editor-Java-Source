package p000a.p001a.p003b.p004a.p005a;

import org.xmlpull.v1.XmlSerializer;
import p000a.p001a.p003b.p004a.C0032f;
import p000a.p001a.p003b.p004a.C0033g;
import p000a.p001a.p003b.p008d.InterfaceC0059a;
import p000a.p014d.C0085e;

/* JADX INFO: renamed from: a.a.b.a.a.v */
/* JADX INFO: loaded from: classes.dex */
public final class C0025v extends C0006c implements InterfaceC0059a {

    /* JADX INFO: renamed from: b */
    private final C0085e[] f32b;

    C0025v(C0022s c0022s, C0085e[] c0085eArr, C0027x c0027x) {
        super(c0022s);
        this.f32b = new C0085e[c0085eArr.length];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= c0085eArr.length) {
                return;
            }
            this.f32b[i2] = new C0085e(c0027x.m38a(((Integer) c0085eArr[i2].f229a).intValue(), (String) null), c0085eArr[i2].f230b);
            i = i2 + 1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0099  */
    @Override // p000a.p001a.p003b.p004a.p005a.C0006c, p000a.p001a.p003b.p008d.InterfaceC0059a
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo1a(XmlSerializer xmlSerializer, C0033g c0033g) {
        String strM59a;
        String strMo17h;
        xmlSerializer.startTag(null, "style");
        xmlSerializer.attribute(null, "name", c0033g.m74c().m67f());
        if (!this.f8a.m13e()) {
            if (!(this.f8a.m12d() == null)) {
                xmlSerializer.attribute(null, "parent", this.f8a.mo15f());
            }
        } else if (c0033g.m74c().m67f().indexOf(46) != -1) {
            xmlSerializer.attribute(null, "parent", "");
        }
        for (int i = 0; i < this.f32b.length; i++) {
            C0032f c0032fM12d = ((C0022s) this.f32b[i].f229a).m12d();
            if (c0032fM12d != null) {
                C0026w c0026wM75d = c0032fM12d.m64c().m75d();
                if (!(c0026wM75d instanceof C0022s)) {
                    if (c0026wM75d instanceof C0005b) {
                        strMo17h = ((C0005b) c0026wM75d).mo3a((AbstractC0023t) this.f32b[i].f230b);
                        strM59a = c0032fM12d.m59a(c0033g.m74c().m68g(), true);
                    } else {
                        strM59a = "@" + c0032fM12d.m59a(c0033g.m74c().m68g(), false);
                        strMo17h = null;
                    }
                    if (strMo17h == null) {
                        strMo17h = ((AbstractC0023t) this.f32b[i].f230b).mo17h();
                    }
                    if (strMo17h != null) {
                        xmlSerializer.startTag(null, "item");
                        xmlSerializer.attribute(null, "name", strM59a);
                        xmlSerializer.text(strMo17h);
                        xmlSerializer.endTag(null, "item");
                    }
                }
            }
        }
        xmlSerializer.endTag(null, "style");
    }
}
