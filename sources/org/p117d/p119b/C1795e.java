package org.p117d.p119b;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Queue;
import org.p117d.InterfaceC1790b;
import org.p117d.p118a.C1786a;
import org.p117d.p118a.InterfaceC1788c;

/* JADX INFO: renamed from: org.d.b.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1795e implements InterfaceC1790b {

    /* JADX INFO: renamed from: a */
    private final String f5227a;

    /* JADX INFO: renamed from: b */
    private volatile InterfaceC1790b f5228b;

    /* JADX INFO: renamed from: c */
    private Boolean f5229c;

    /* JADX INFO: renamed from: d */
    private Method f5230d;

    /* JADX INFO: renamed from: e */
    private C1786a f5231e;

    /* JADX INFO: renamed from: f */
    private Queue f5232f;

    /* JADX INFO: renamed from: g */
    private final boolean f5233g;

    public C1795e(String str, Queue queue, boolean z) {
        this.f5227a = str;
        this.f5232f = queue;
        this.f5233g = z;
    }

    /* JADX INFO: renamed from: e */
    private InterfaceC1790b m4207e() {
        if (this.f5228b != null) {
            return this.f5228b;
        }
        if (this.f5233g) {
            return C1792b.f5226a;
        }
        if (this.f5231e == null) {
            this.f5231e = new C1786a(this, this.f5232f);
        }
        return this.f5231e;
    }

    @Override // org.p117d.InterfaceC1790b
    /* JADX INFO: renamed from: a */
    public final String mo4191a() {
        return this.f5227a;
    }

    @Override // org.p117d.InterfaceC1790b
    /* JADX INFO: renamed from: a */
    public final void mo4192a(String str) {
        m4207e().mo4192a(str);
    }

    @Override // org.p117d.InterfaceC1790b
    /* JADX INFO: renamed from: a */
    public final void mo4193a(String str, Object obj) {
        m4207e().mo4193a(str, obj);
    }

    @Override // org.p117d.InterfaceC1790b
    /* JADX INFO: renamed from: a */
    public final void mo4194a(String str, Object obj, Object obj2) {
        m4207e().mo4194a(str, obj, obj2);
    }

    @Override // org.p117d.InterfaceC1790b
    /* JADX INFO: renamed from: a */
    public final void mo4195a(String str, Throwable th) {
        m4207e().mo4195a(str, th);
    }

    @Override // org.p117d.InterfaceC1790b
    /* JADX INFO: renamed from: a */
    public final void mo4196a(String str, Object... objArr) {
        m4207e().mo4196a(str, objArr);
    }

    /* JADX INFO: renamed from: a */
    public final void m4208a(InterfaceC1788c interfaceC1788c) {
        if (m4210b()) {
            try {
                this.f5230d.invoke(this.f5228b, interfaceC1788c);
            } catch (IllegalAccessException e) {
            } catch (IllegalArgumentException e2) {
            } catch (InvocationTargetException e3) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m4209a(InterfaceC1790b interfaceC1790b) {
        this.f5228b = interfaceC1790b;
    }

    @Override // org.p117d.InterfaceC1790b
    /* JADX INFO: renamed from: b */
    public final void mo4197b(String str) {
        m4207e().mo4197b(str);
    }

    @Override // org.p117d.InterfaceC1790b
    /* JADX INFO: renamed from: b */
    public final void mo4198b(String str, Object obj) {
        m4207e().mo4198b(str, obj);
    }

    @Override // org.p117d.InterfaceC1790b
    /* JADX INFO: renamed from: b */
    public final void mo4199b(String str, Object obj, Object obj2) {
        m4207e().mo4199b(str, obj, obj2);
    }

    @Override // org.p117d.InterfaceC1790b
    /* JADX INFO: renamed from: b */
    public final void mo4200b(String str, Throwable th) {
        m4207e().mo4200b(str, th);
    }

    @Override // org.p117d.InterfaceC1790b
    /* JADX INFO: renamed from: b */
    public final void mo4201b(String str, Object... objArr) {
        m4207e().mo4201b(str, objArr);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m4210b() {
        if (this.f5229c != null) {
            return this.f5229c.booleanValue();
        }
        try {
            this.f5230d = this.f5228b.getClass().getMethod("log", InterfaceC1788c.class);
            this.f5229c = Boolean.TRUE;
        } catch (NoSuchMethodException e) {
            this.f5229c = Boolean.FALSE;
        }
        return this.f5229c.booleanValue();
    }

    @Override // org.p117d.InterfaceC1790b
    /* JADX INFO: renamed from: c */
    public final void mo4202c(String str) {
        m4207e().mo4202c(str);
    }

    @Override // org.p117d.InterfaceC1790b
    /* JADX INFO: renamed from: c */
    public final void mo4203c(String str, Object obj) {
        m4207e().mo4203c(str, obj);
    }

    @Override // org.p117d.InterfaceC1790b
    /* JADX INFO: renamed from: c */
    public final void mo4204c(String str, Object obj, Object obj2) {
        m4207e().mo4204c(str, obj, obj2);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m4211c() {
        return this.f5228b == null;
    }

    @Override // org.p117d.InterfaceC1790b
    /* JADX INFO: renamed from: d */
    public final void mo4205d(String str, Object obj) {
        m4207e().mo4205d(str, obj);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m4212d() {
        return this.f5228b instanceof C1792b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f5227a.equals(((C1795e) obj).f5227a);
    }

    public final int hashCode() {
        return this.f5227a.hashCode();
    }
}
