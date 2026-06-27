package com.p080c.p081a;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* JADX INFO: renamed from: com.c.a.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1021e extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: a */
    private float f2650a;

    /* JADX INFO: renamed from: b */
    private float f2651b;

    /* JADX INFO: renamed from: a */
    public final float m2319a() {
        return this.f2650a;
    }

    /* JADX INFO: renamed from: b */
    public final float m2320b() {
        return this.f2651b;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.f2650a = f;
        this.f2651b = f2;
        return true;
    }
}
