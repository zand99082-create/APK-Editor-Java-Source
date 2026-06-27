package com.p080c.p081a;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: com.c.a.g */
/* JADX INFO: loaded from: classes.dex */
final class ViewOnTouchListenerC1023g implements View.OnTouchListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ C1022f f2685a;

    ViewOnTouchListenerC1023g(C1022f c1022f) {
        this.f2685a = c1022f;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.f2685a.f2657F != null) {
            this.f2685a.f2657F.onTouch(view, motionEvent);
        }
        return this.f2685a.f2656E.onTouch(view, motionEvent);
    }
}
