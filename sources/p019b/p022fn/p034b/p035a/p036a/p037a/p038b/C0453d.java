package p019b.p022fn.p034b.p035a.p036a.p037a.p038b;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: b.fn.b.a.a.a.b.d */
/* JADX INFO: loaded from: classes.dex */
public class C0453d extends Drawable {

    /* JADX INFO: renamed from: a */
    private final Drawable f577a;

    public C0453d(Drawable drawable, float f, float f2) {
        this.f577a = drawable;
        setBounds(0, 0, (int) C0452c.m505a(f), (int) C0452c.m505a(f2));
    }

    /* JADX INFO: renamed from: a */
    protected Drawable m507a() {
        return this.f577a;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawableM507a = m507a();
        if (drawableM507a != null) {
            drawableM507a.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawableM507a = m507a();
        if (drawableM507a != null) {
            return drawableM507a.getBounds().height();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawableM507a = m507a();
        if (drawableM507a != null) {
            return drawableM507a.getBounds().width();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawableM507a = m507a();
        if (drawableM507a != null) {
            return drawableM507a.getOpacity();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        Drawable drawableM507a = m507a();
        if (drawableM507a != null) {
            drawableM507a.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        Drawable drawableM507a = m507a();
        if (drawableM507a != null) {
            drawableM507a.setBounds(i, i2, i3, i4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawableM507a = m507a();
        if (drawableM507a != null) {
            drawableM507a.setColorFilter(colorFilter);
        }
    }
}
