package com.p080c.p081a;

import android.graphics.PointF;

/* JADX INFO: renamed from: com.c.a.p */
/* JADX INFO: loaded from: classes.dex */
public final class C1032p {

    /* JADX INFO: renamed from: a */
    public float f2730a;

    /* JADX INFO: renamed from: b */
    public final PointF f2731b = new PointF();

    /* JADX INFO: renamed from: c */
    public final PointF f2732c = new PointF();

    /* JADX INFO: renamed from: d */
    private float f2733d;

    /* JADX INFO: renamed from: a */
    public final void m2357a() {
        this.f2732c.x = (((float) Math.cos(this.f2733d)) * this.f2730a) + this.f2731b.x;
        this.f2732c.y = (((float) Math.sin(this.f2733d)) * this.f2730a) + this.f2731b.y;
    }

    /* JADX INFO: renamed from: a */
    public final void m2358a(PointF pointF) {
        this.f2731b.x = pointF.x;
        this.f2731b.y = pointF.y;
    }

    /* JADX INFO: renamed from: b */
    public final float m2359b() {
        PointF pointF = this.f2731b;
        PointF pointF2 = this.f2732c;
        float f = pointF.x - pointF2.x;
        float f2 = pointF.y - pointF2.y;
        this.f2730a = (float) Math.sqrt((f2 * f2) + (f * f));
        return this.f2730a;
    }

    /* JADX INFO: renamed from: b */
    public final void m2360b(PointF pointF) {
        this.f2732c.x = pointF.x;
        this.f2732c.y = pointF.y;
    }

    /* JADX INFO: renamed from: c */
    public final float m2361c() {
        PointF pointF = this.f2731b;
        PointF pointF2 = this.f2732c;
        float f = pointF.x;
        this.f2733d = (float) Math.atan2(pointF2.y - pointF.y, pointF2.x - f);
        return this.f2733d;
    }
}
