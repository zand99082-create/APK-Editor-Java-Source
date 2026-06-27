package org.p117d.p118a;

import java.util.Queue;
import org.p117d.InterfaceC1790b;
import org.p117d.p119b.C1795e;

/* JADX INFO: renamed from: org.d.a.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1786a implements InterfaceC1790b {

    /* JADX INFO: renamed from: a */
    private String f5216a;

    /* JADX INFO: renamed from: b */
    private C1795e f5217b;

    /* JADX INFO: renamed from: c */
    private Queue f5218c;

    public C1786a(C1795e c1795e, Queue queue) {
        this.f5217b = c1795e;
        this.f5216a = c1795e.mo4191a();
        this.f5218c = queue;
    }

    /* JADX INFO: renamed from: a */
    private void m4190a(EnumC1787b enumC1787b, String str, Object[] objArr, Throwable th) {
        C1789d c1789d = new C1789d();
        System.currentTimeMillis();
        c1789d.f5225a = this.f5217b;
        Thread.currentThread().getName();
        this.f5218c.add(c1789d);
    }

    @Override // org.p117d.InterfaceC1790b
    /* JADX INFO: renamed from: a */
    public final String mo4191a() {
        return this.f5216a;
    }

    @Override // org.p117d.InterfaceC1790b
    /* JADX INFO: renamed from: a */
    public final void mo4192a(String str) {
        m4190a(EnumC1787b.f5221c, str, null, null);
    }

    @Override // org.p117d.InterfaceC1790b
    /* JADX INFO: renamed from: a */
    public final void mo4193a(String str, Object obj) {
        m4190a(EnumC1787b.f5222d, str, new Object[]{obj}, null);
    }

    @Override // org.p117d.InterfaceC1790b
    /* JADX INFO: renamed from: a */
    public final void mo4194a(String str, Object obj, Object obj2) {
        m4190a(EnumC1787b.f5222d, str, new Object[]{obj, obj2}, null);
    }

    @Override // org.p117d.InterfaceC1790b
    /* JADX INFO: renamed from: a */
    public final void mo4195a(String str, Throwable th) {
        m4190a(EnumC1787b.f5222d, str, null, th);
    }

    @Override // org.p117d.InterfaceC1790b
    /* JADX INFO: renamed from: a */
    public final void mo4196a(String str, Object... objArr) {
        m4190a(EnumC1787b.f5222d, str, objArr, null);
    }

    @Override // org.p117d.InterfaceC1790b
    /* JADX INFO: renamed from: b */
    public final void mo4197b(String str) {
        m4190a(EnumC1787b.f5220b, str, null, null);
    }

    @Override // org.p117d.InterfaceC1790b
    /* JADX INFO: renamed from: b */
    public final void mo4198b(String str, Object obj) {
        m4190a(EnumC1787b.f5221c, str, new Object[]{obj}, null);
    }

    @Override // org.p117d.InterfaceC1790b
    /* JADX INFO: renamed from: b */
    public final void mo4199b(String str, Object obj, Object obj2) {
        m4190a(EnumC1787b.f5220b, str, new Object[]{obj, obj2}, null);
    }

    @Override // org.p117d.InterfaceC1790b
    /* JADX INFO: renamed from: b */
    public final void mo4200b(String str, Throwable th) {
        m4190a(EnumC1787b.f5219a, str, null, th);
    }

    @Override // org.p117d.InterfaceC1790b
    /* JADX INFO: renamed from: b */
    public final void mo4201b(String str, Object... objArr) {
        m4190a(EnumC1787b.f5220b, str, objArr, null);
    }

    @Override // org.p117d.InterfaceC1790b
    /* JADX INFO: renamed from: c */
    public final void mo4202c(String str) {
        m4190a(EnumC1787b.f5219a, str, null, null);
    }

    @Override // org.p117d.InterfaceC1790b
    /* JADX INFO: renamed from: c */
    public final void mo4203c(String str, Object obj) {
        m4190a(EnumC1787b.f5220b, str, new Object[]{obj}, null);
    }

    @Override // org.p117d.InterfaceC1790b
    /* JADX INFO: renamed from: c */
    public final void mo4204c(String str, Object obj, Object obj2) {
        m4190a(EnumC1787b.f5219a, str, new Object[]{obj, obj2}, null);
    }

    @Override // org.p117d.InterfaceC1790b
    /* JADX INFO: renamed from: d */
    public final void mo4205d(String str, Object obj) {
        m4190a(EnumC1787b.f5219a, str, new Object[]{obj}, null);
    }
}
