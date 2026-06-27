package com.p046a.p047a;

/* JADX INFO: renamed from: com.a.a.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0488e {

    /* JADX INFO: renamed from: a */
    private final C0492i f689a;

    /* JADX INFO: renamed from: b */
    private final int f690b;

    /* JADX INFO: renamed from: c */
    private final int f691c;

    /* JADX INFO: renamed from: d */
    private final int f692d;

    /* JADX INFO: renamed from: e */
    private final int f693e;

    /* JADX INFO: renamed from: f */
    private final int f694f;

    /* JADX INFO: renamed from: g */
    private final int f695g;

    /* JADX INFO: renamed from: h */
    private final int f696h;

    /* JADX INFO: renamed from: i */
    private final int f697i;

    /* JADX INFO: renamed from: j */
    private final int f698j;

    public C0488e(C0492i c0492i, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.f689a = c0492i;
        this.f690b = i;
        this.f691c = i2;
        this.f692d = i3;
        this.f693e = i4;
        this.f694f = i5;
        this.f695g = i6;
        this.f696h = i7;
        this.f697i = i8;
        this.f698j = i9;
    }

    /* JADX INFO: renamed from: a */
    public final int m585a() {
        return this.f690b;
    }

    /* JADX INFO: renamed from: b */
    public final int m586b() {
        return this.f691c;
    }

    /* JADX INFO: renamed from: c */
    public final int m587c() {
        return this.f693e;
    }

    /* JADX INFO: renamed from: d */
    public final int m588d() {
        return this.f694f;
    }

    /* JADX INFO: renamed from: e */
    public final short[] m589e() {
        return this.f689a.m621b(this.f694f).m575a();
    }

    /* JADX INFO: renamed from: f */
    public final int m590f() {
        return this.f692d;
    }

    /* JADX INFO: renamed from: g */
    public final int m591g() {
        return this.f695g;
    }

    /* JADX INFO: renamed from: h */
    public final int m592h() {
        return this.f696h;
    }

    /* JADX INFO: renamed from: i */
    public final int m593i() {
        return this.f697i;
    }

    /* JADX INFO: renamed from: j */
    public final int m594j() {
        return this.f698j;
    }

    public final String toString() {
        if (this.f689a == null) {
            return this.f691c + " " + this.f693e;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((String) this.f689a.m627g().get(this.f691c));
        if (this.f693e != -1) {
            sb.append(" extends ").append((String) this.f689a.m627g().get(this.f693e));
        }
        return sb.toString();
    }
}
