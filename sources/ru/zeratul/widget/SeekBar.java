package ru.zeratul.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.util.TypedValue;

/* JADX INFO: loaded from: classes.dex */
class SeekBar extends android.widget.SeekBar {

    /* JADX INFO: renamed from: a */
    private int[] f5391a;

    /* JADX INFO: renamed from: b */
    private int f5392b;

    /* JADX INFO: renamed from: c */
    private int f5393c;

    /* JADX INFO: renamed from: d */
    private int f5394d;

    /* JADX INFO: renamed from: e */
    private int f5395e;

    /* JADX INFO: renamed from: f */
    private float f5396f;

    /* JADX INFO: renamed from: g */
    private Paint f5397g;

    /* JADX INFO: renamed from: h */
    private Rect f5398h;

    /* JADX INFO: renamed from: i */
    private String f5399i;

    public SeekBar(Context context) {
        super(context);
        this.f5391a = new int[]{R.attr.textSize, R.attr.textColor, R.attr.text};
        this.f5392b = 0;
        this.f5393c = 1;
        this.f5394d = 2;
        init((AttributeSet) null);
    }

    public SeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5391a = new int[]{R.attr.textSize, R.attr.textColor, R.attr.text};
        this.f5392b = 0;
        this.f5393c = 1;
        this.f5394d = 2;
        init(attributeSet);
    }

    public SeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5391a = new int[]{R.attr.textSize, R.attr.textColor, R.attr.text};
        this.f5392b = 0;
        this.f5393c = 1;
        this.f5394d = 2;
        init(attributeSet);
    }

    private void init(AttributeSet attributeSet) {
        this.f5397g = new Paint(65);
        this.f5398h = new Rect();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, this.f5391a);
            try {
                this.f5395e = typedArrayObtainStyledAttributes.getColor(this.f5393c, ViewCompat.MEASURED_STATE_MASK);
                this.f5396f = typedArrayObtainStyledAttributes.getDimension(this.f5392b, TypedValue.applyDimension(2, 16, getResources().getDisplayMetrics()));
                this.f5399i = typedArrayObtainStyledAttributes.getString(this.f5394d);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
        this.f5397g.setColor(this.f5395e);
        this.f5397g.setTypeface(Typeface.DEFAULT_BOLD);
        this.f5397g.setTextSize(this.f5396f);
        this.f5397g.setTextAlign(Paint.Align.CENTER);
        this.f5397g.getTextBounds("255", 0, 3, this.f5398h);
        setPadding(getPaddingLeft(), (int) TypedValue.applyDimension(1, (float) (0.6d * ((double) this.f5398h.height())), getResources().getDisplayMetrics()), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawText(this.f5399i == null ? String.valueOf(getProgress()) : this.f5399i, getThumb().getBounds().left + getPaddingLeft(), this.f5398h.height() + (getPaddingTop() >> 4), this.f5397g);
    }
}
