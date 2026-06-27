package com.p080c.p081a;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import com.gmail.heagoo.apkeditor.gzd;
import java.io.InputStream;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.c.a.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1022f extends ImageView {

    /* JADX INFO: renamed from: A */
    private ColorFilter f2652A;

    /* JADX INFO: renamed from: B */
    private int f2653B;

    /* JADX INFO: renamed from: C */
    private int f2654C;

    /* JADX INFO: renamed from: D */
    private InterfaceC1025i f2655D;

    /* JADX INFO: renamed from: E */
    private ViewOnTouchListenerC1026j f2656E;

    /* JADX INFO: renamed from: F */
    private View.OnTouchListener f2657F;

    /* JADX INFO: renamed from: G */
    private View.OnClickListener f2658G;

    /* JADX INFO: renamed from: a */
    private final Semaphore f2659a;

    /* JADX INFO: renamed from: b */
    private C1018b f2660b;

    /* JADX INFO: renamed from: c */
    private Drawable f2661c;

    /* JADX INFO: renamed from: d */
    private float f2662d;

    /* JADX INFO: renamed from: e */
    private float f2663e;

    /* JADX INFO: renamed from: f */
    private boolean f2664f;

    /* JADX INFO: renamed from: g */
    private float f2665g;

    /* JADX INFO: renamed from: h */
    private float f2666h;

    /* JADX INFO: renamed from: i */
    private float f2667i;

    /* JADX INFO: renamed from: j */
    private float f2668j;

    /* JADX INFO: renamed from: k */
    private float f2669k;

    /* JADX INFO: renamed from: l */
    private float f2670l;

    /* JADX INFO: renamed from: m */
    private float f2671m;

    /* JADX INFO: renamed from: n */
    private float f2672n;

    /* JADX INFO: renamed from: o */
    private float f2673o;

    /* JADX INFO: renamed from: p */
    private float f2674p;

    /* JADX INFO: renamed from: q */
    private Float f2675q;

    /* JADX INFO: renamed from: r */
    private Float f2676r;

    /* JADX INFO: renamed from: s */
    private int f2677s;

    /* JADX INFO: renamed from: t */
    private int f2678t;

    /* JADX INFO: renamed from: u */
    private int f2679u;

    /* JADX INFO: renamed from: v */
    private boolean f2680v;

    /* JADX INFO: renamed from: w */
    private boolean f2681w;

    /* JADX INFO: renamed from: x */
    private int f2682x;

    /* JADX INFO: renamed from: y */
    private int f2683y;

    /* JADX INFO: renamed from: z */
    private int f2684z;

    public C1022f(Context context, Bitmap bitmap) {
        super(context);
        this.f2659a = new Semaphore(0);
        this.f2662d = 0.0f;
        this.f2663e = 0.0f;
        this.f2664f = false;
        this.f2665g = 1.0f;
        this.f2666h = -1.0f;
        this.f2667i = 1.0f;
        this.f2668j = 8.0f;
        this.f2669k = 0.5f;
        this.f2670l = 1.0f;
        this.f2671m = 1.0f;
        this.f2672n = 0.0f;
        this.f2679u = -1;
        this.f2680v = false;
        this.f2681w = false;
        this.f2684z = 255;
        this.f2653B = -1;
        setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.f2661c = new BitmapDrawable(getResources(), bitmap);
        m2323k();
    }

    /* JADX INFO: renamed from: k */
    private void m2323k() {
        if (this.f2661c != null) {
            this.f2661c.setAlpha(this.f2684z);
            this.f2661c.setFilterBitmap(true);
            if (this.f2652A != null) {
                this.f2661c.setColorFilter(this.f2652A);
            }
        }
        if (this.f2664f) {
            int iM2333c = m2333c();
            int iM2334d = m2334d();
            this.f2677s = Math.round(iM2333c / 2.0f);
            this.f2678t = Math.round(iM2334d / 2.0f);
            this.f2661c.setBounds(-this.f2677s, -this.f2678t, this.f2677s, this.f2678t);
        } else {
            requestLayout();
        }
        postInvalidate();
    }

    /* JADX INFO: renamed from: a */
    public final float m2324a() {
        return this.f2670l < this.f2671m ? this.f2670l : this.f2671m;
    }

    /* JADX INFO: renamed from: a */
    public final void m2325a(float f) {
        this.f2665g = f;
    }

    /* JADX INFO: renamed from: a */
    public final void m2326a(float f, float f2) {
        this.f2662d = f;
        this.f2663e = f2;
    }

    /* JADX INFO: renamed from: a */
    public final void m2327a(InterfaceC1017a interfaceC1017a) {
        if (this.f2660b != null) {
            this.f2660b.m2313a(interfaceC1017a);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m2328a(InterfaceC1025i interfaceC1025i) {
        this.f2655D = interfaceC1025i;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m2329a(long j) {
        return this.f2659a.tryAcquire(32L, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: renamed from: b */
    public final void m2330b() {
        if (this.f2660b != null) {
            this.f2660b.m2314b();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m2331b(float f) {
        this.f2666h = 1.0f;
    }

    /* JADX INFO: renamed from: b */
    public final void m2332b(float f, float f2) {
        this.f2675q = Float.valueOf(f);
        this.f2676r = Float.valueOf(f2);
    }

    /* JADX INFO: renamed from: c */
    public final int m2333c() {
        if (this.f2661c != null) {
            return this.f2661c.getIntrinsicWidth();
        }
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public final int m2334d() {
        if (this.f2661c != null) {
            return this.f2661c.getIntrinsicHeight();
        }
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public final float m2335e() {
        return this.f2665g;
    }

    /* JADX INFO: renamed from: f */
    public final float m2336f() {
        return this.f2662d;
    }

    /* JADX INFO: renamed from: g */
    public final float m2337g() {
        return this.f2663e;
    }

    @Override // android.widget.ImageView
    public final Drawable getDrawable() {
        return this.f2661c;
    }

    @Override // android.widget.ImageView
    public final Matrix getImageMatrix() {
        return super.getImageMatrix();
    }

    /* JADX INFO: renamed from: h */
    public final InterfaceC1025i m2338h() {
        return this.f2655D;
    }

    /* JADX INFO: renamed from: i */
    public final float m2339i() {
        return this.f2673o;
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        super.invalidateDrawable(drawable);
    }

    /* JADX INFO: renamed from: j */
    public final float m2340j() {
        return this.f2674p;
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onAttachedToWindow() {
        this.f2660b = new C1018b(this, "GestureImageViewAnimator");
        this.f2660b.start();
        if (this.f2679u >= 0 && this.f2661c == null) {
            setImageResource(this.f2679u);
        }
        super.onAttachedToWindow();
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        return super.onCreateDrawableState(i);
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onDetachedFromWindow() {
        if (this.f2660b != null) {
            this.f2660b.m2312a();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onDraw(Canvas canvas) {
        Bitmap bitmap;
        if (this.f2664f) {
            if (this.f2661c != null) {
                if (!((this.f2661c == null || !(this.f2661c instanceof BitmapDrawable) || (bitmap = ((BitmapDrawable) this.f2661c).getBitmap()) == null) ? false : bitmap.isRecycled())) {
                    canvas.save();
                    float f = this.f2667i * this.f2665g;
                    canvas.translate(this.f2662d, this.f2663e);
                    if (this.f2672n != 0.0f) {
                        canvas.rotate(this.f2672n);
                    }
                    if (f != 1.0f) {
                        canvas.scale(f, f);
                    }
                    this.f2661c.draw(canvas);
                    canvas.restore();
                }
            }
            if (this.f2659a.availablePermits() <= 0) {
                this.f2659a.release();
            }
        }
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z || !this.f2664f) {
            int i5 = this.f2683y;
            int i6 = this.f2682x;
            int i7 = getResources().getConfiguration().orientation;
            if (this.f2653B != i7) {
                this.f2664f = false;
                this.f2653B = i7;
            }
            if (this.f2661c == null || this.f2664f) {
                return;
            }
            int iM2333c = m2333c();
            int iM2334d = m2334d();
            this.f2677s = Math.round(iM2333c / 2.0f);
            this.f2678t = Math.round(iM2334d / 2.0f);
            int paddingLeft = i5 - (getPaddingLeft() + getPaddingRight());
            int paddingTop = i6 - (getPaddingTop() + getPaddingBottom());
            this.f2670l = paddingLeft / iM2333c;
            this.f2671m = paddingTop / iM2334d;
            if (this.f2666h <= 0.0f) {
                switch (C1024h.f2686a[getScaleType().ordinal()]) {
                    case 1:
                        this.f2666h = 1.0f;
                        break;
                    case 2:
                        this.f2666h = Math.max(paddingTop / iM2334d, paddingLeft / iM2333c);
                        break;
                    case 3:
                        if (iM2333c / paddingLeft <= iM2334d / paddingTop) {
                            this.f2666h = this.f2671m;
                        } else {
                            this.f2666h = this.f2670l;
                        }
                        break;
                }
            }
            this.f2665g = this.f2666h;
            this.f2673o = paddingLeft / 2.0f;
            this.f2674p = paddingTop / 2.0f;
            if (this.f2675q == null) {
                this.f2662d = this.f2673o;
            } else {
                this.f2662d = this.f2675q.floatValue();
            }
            if (this.f2676r == null) {
                this.f2663e = this.f2674p;
            } else {
                this.f2663e = this.f2676r.floatValue();
            }
            this.f2656E = new ViewOnTouchListenerC1026j(this, paddingLeft, paddingTop);
            this.f2656E.m2352b(this.f2669k);
            this.f2656E.m2349a(this.f2668j);
            this.f2661c.setBounds(-this.f2677s, -this.f2678t, this.f2677s, this.f2678t);
            super.setOnTouchListener(new ViewOnTouchListenerC1023g(this));
            this.f2664f = true;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onMeasure(int i, int i2) {
        if (this.f2661c == null) {
            this.f2682x = View.MeasureSpec.getSize(i2);
            this.f2683y = View.MeasureSpec.getSize(i);
        } else if (getResources().getConfiguration().orientation == 2) {
            this.f2682x = View.MeasureSpec.getSize(i2);
            if (getLayoutParams().width == -2) {
                this.f2683y = Math.round((m2333c() / m2334d()) * this.f2682x);
            } else {
                this.f2683y = View.MeasureSpec.getSize(i);
            }
        } else {
            this.f2683y = View.MeasureSpec.getSize(i);
            if (getLayoutParams().height == -2) {
                this.f2682x = Math.round((m2334d() / m2333c()) * this.f2683y);
            } else {
                this.f2682x = View.MeasureSpec.getSize(i2);
            }
        }
        setMeasuredDimension(this.f2683y, this.f2682x);
    }

    @Override // android.widget.ImageView
    public final void setAdjustViewBounds(boolean z) {
        super.setAdjustViewBounds(z);
    }

    @Override // android.widget.ImageView
    public final void setAlpha(int i) {
        this.f2684z = i;
        if (this.f2661c != null) {
            this.f2661c.setAlpha(i);
        }
    }

    @Override // android.widget.ImageView
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f2652A = colorFilter;
        if (this.f2661c != null) {
            this.f2661c.setColorFilter(colorFilter);
        }
    }

    @Override // android.widget.ImageView
    public final void setImageBitmap(Bitmap bitmap) {
        this.f2661c = new BitmapDrawable(getResources(), bitmap);
        m2323k();
    }

    @Override // android.widget.ImageView
    public final void setImageDrawable(Drawable drawable) {
        this.f2661c = drawable;
        m2323k();
    }

    @Override // android.widget.ImageView
    public final void setImageLevel(int i) {
        super.setImageLevel(i);
    }

    @Override // android.widget.ImageView
    public final void setImageMatrix(Matrix matrix) {
    }

    @Override // android.widget.ImageView
    public final void setImageResource(int i) {
        if (this.f2661c != null) {
        }
        this.f2679u = i;
        setImageDrawable(getContext().getResources().getDrawable(i));
    }

    @Override // android.widget.ImageView
    public final void setImageState(int[] iArr, boolean z) {
    }

    @Override // android.widget.ImageView
    public final void setImageURI(Uri uri) throws Throwable {
        InputStream inputStream;
        InputStream inputStreamOpenInputStream;
        if (gzd.COLUMN_CONTENT.equals(uri.getScheme())) {
            try {
                String[] strArr = {"orientation"};
                Cursor cursorQuery = getContext().getContentResolver().query(uri, strArr, null, null, null);
                if (cursorQuery != null && cursorQuery.moveToFirst()) {
                    this.f2654C = cursorQuery.getInt(cursorQuery.getColumnIndex(strArr[0]));
                }
                try {
                    inputStreamOpenInputStream = getContext().getContentResolver().openInputStream(uri);
                } catch (Throwable th) {
                    th = th;
                    inputStream = null;
                }
                try {
                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream);
                    if (this.f2654C != 0) {
                        Matrix matrix = new Matrix();
                        matrix.postRotate(this.f2654C);
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeStream, 0, 0, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight(), matrix, true);
                        bitmapDecodeStream.recycle();
                        setImageDrawable(new BitmapDrawable(getResources(), bitmapCreateBitmap));
                    } else {
                        setImageDrawable(new BitmapDrawable(getResources(), bitmapDecodeStream));
                    }
                    if (inputStreamOpenInputStream != null) {
                        inputStreamOpenInputStream.close();
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    inputStream = inputStreamOpenInputStream;
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    throw th;
                }
            } catch (Exception e) {
                Log.w("GestureImageView", "Unable to open content: " + uri, e);
            }
        } else {
            setImageDrawable(Drawable.createFromPath(uri.toString()));
        }
        if (this.f2661c == null) {
            Log.e("GestureImageView", "resolveUri failed on bad bitmap uri: " + uri);
        }
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f2658G = onClickListener;
    }

    @Override // android.view.View
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f2657F = onTouchListener;
    }

    @Override // android.view.View
    public final void setRotation(float f) {
        this.f2672n = f;
    }

    @Override // android.widget.ImageView
    public final void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType == ImageView.ScaleType.CENTER || scaleType == ImageView.ScaleType.CENTER_CROP || scaleType == ImageView.ScaleType.CENTER_INSIDE) {
            super.setScaleType(scaleType);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void setSelected(boolean z) {
        super.setSelected(z);
    }
}
