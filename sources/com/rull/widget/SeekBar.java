package com.rull.widget;

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

    /* JADX INFO: renamed from: c */
    private int f5054c;

    /* JADX INFO: renamed from: d */
    private int f5055d;

    /* JADX INFO: renamed from: e */
    private int f5056e;

    /* JADX INFO: renamed from: f */
    private float f5057f;
    private int[] f1625a;
    private int f1626b;

    /* JADX INFO: renamed from: g */
    private Paint f5058g;

    /* JADX INFO: renamed from: h */
    private Rect f5059h;

    /* JADX INFO: renamed from: i */
    private String f5060i;

    public SeekBar(Context context) {
        super(context);
        this.f1625a = new int[]{R.attr.textSize, R.attr.textColor, R.attr.text};
        this.f1626b = 0;
        this.f5054c = 1;
        this.f5055d = 2;
        init((AttributeSet) null);
    }

    public SeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1625a = new int[]{R.attr.textSize, R.attr.textColor, R.attr.text};
        this.f1626b = 0;
        this.f5054c = 1;
        this.f5055d = 2;
        init(attributeSet);
    }

    public SeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1625a = new int[]{R.attr.textSize, R.attr.textColor, R.attr.text};
        this.f1626b = 0;
        this.f5054c = 1;
        this.f5055d = 2;
        init(attributeSet);
    }

    private void init(AttributeSet attributeSet) {
        this.f5058g = new Paint(65);
        this.f5059h = new Rect();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, this.f1625a);
            try {
                this.f5056e = typedArrayObtainStyledAttributes.getColor(this.f5054c, ViewCompat.MEASURED_STATE_MASK);
                this.f5057f = typedArrayObtainStyledAttributes.getDimension(this.f1626b, TypedValue.applyDimension(2, 16, getResources().getDisplayMetrics()));
                this.f5060i = typedArrayObtainStyledAttributes.getString(this.f5055d);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
        this.f5058g.setColor(this.f5056e);
        this.f5058g.setTypeface(Typeface.DEFAULT_BOLD);
        this.f5058g.setTextSize(this.f5057f);
        this.f5058g.setTextAlign(Paint.Align.CENTER);
        this.f5058g.getTextBounds("255", 0, 3, this.f5059h);
        setPadding(getPaddingLeft(), (int) TypedValue.applyDimension(1, (float) (0.6d * ((double) this.f5059h.height())), getResources().getDisplayMetrics()), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawText(this.f5060i == null ? String.valueOf(getProgress()) : this.f5060i, getThumb().getBounds().left + getPaddingLeft(), this.f5059h.height() + (getPaddingTop() >> 4), this.f5058g);
    }
}
