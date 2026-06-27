package androidx.cardview.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* JADX INFO: renamed from: androidx.cardview.widget.c */
/* JADX INFO: loaded from: classes.dex */
class C0386c implements InterfaceC0394k {
    final /* synthetic */ C0385b this$0;

    C0386c(C0385b c0385b) {
        this.this$0 = c0385b;
    }

    @Override // androidx.cardview.widget.InterfaceC0394k
    public void drawRoundRect(Canvas canvas, RectF rectF, float f, Paint paint) {
        canvas.drawRoundRect(rectF, f, f, paint);
    }
}
