package com.rull.mod.color;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class ColorPickerPanelView extends View {
    private static final float BORDER_WIDTH_PX = 1.0f;
    private AlphaPatternDrawable mAlphaPattern;
    private int mBorderColor;
    private Paint mBorderPaint;
    private int mColor;
    private Paint mColorPaint;
    private RectF mColorRect;
    private float mDensity;
    private RectF mDrawingRect;

    public ColorPickerPanelView(Context context) {
        this(context, (AttributeSet) null);
    }

    public ColorPickerPanelView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ColorPickerPanelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mDensity = 1.0f;
        this.mBorderColor = -9539986;
        this.mColor = ViewCompat.MEASURED_STATE_MASK;
        init();
    }

    private void init() {
        this.mBorderPaint = new Paint();
        this.mColorPaint = new Paint();
        this.mDensity = getContext().getResources().getDisplayMetrics().density;
    }

    private void setUpColorRect() {
        RectF rectF = this.mDrawingRect;
        this.mColorRect = new RectF(rectF.left + 1.0f, rectF.top + 1.0f, rectF.right - 1.0f, rectF.bottom - 1.0f);
        this.mAlphaPattern = new AlphaPatternDrawable((int) (5.0f * this.mDensity));
        this.mAlphaPattern.setBounds(Math.round(this.mColorRect.left), Math.round(this.mColorRect.top), Math.round(this.mColorRect.right), Math.round(this.mColorRect.bottom));
    }

    public int getBorderColor() {
        return this.mBorderColor;
    }

    public int getColor() {
        return this.mColor;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        RectF rectF = this.mColorRect;
        this.mBorderPaint.setColor(this.mBorderColor);
        canvas.drawRect(this.mDrawingRect, this.mBorderPaint);
        if (this.mAlphaPattern != null) {
            this.mAlphaPattern.draw(canvas);
        }
        this.mColorPaint.setColor(this.mColor);
        canvas.drawRect(rectF, this.mColorPaint);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.mDrawingRect = new RectF();
        this.mDrawingRect.left = getPaddingLeft();
        this.mDrawingRect.right = i - getPaddingRight();
        this.mDrawingRect.top = getPaddingTop();
        this.mDrawingRect.bottom = i2 - getPaddingBottom();
        setUpColorRect();
    }

    public void setBorderColor(int i) {
        this.mBorderColor = i;
        invalidate();
    }

    public void setColor(int i) {
        this.mColor = i;
        invalidate();
    }
}
