package com.rull.mod.color;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ComposeShader;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Shader;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class ColorPickerView extends View {
    private static final float BORDER_WIDTH_PX = 1.0f;
    private static final int PANEL_ALPHA = 2;
    private static final int PANEL_HUE = 1;
    private static final int PANEL_SAT_VAL = 0;
    private float ALPHA_PANEL_HEIGHT;
    private float HUE_PANEL_WIDTH;
    private float PALETTE_CIRCLE_TRACKER_RADIUS;
    private float PANEL_SPACING;
    private float RECTANGLE_TRACKER_OFFSET;
    private int mAlpha;
    private Paint mAlphaPaint;
    private AlphaPatternDrawable mAlphaPattern;
    private RectF mAlphaRect;
    private Shader mAlphaShader;
    private String mAlphaSliderText;
    private Paint mAlphaTextPaint;
    private int mBorderColor;
    private Paint mBorderPaint;
    private float mDensity;
    private float mDrawingOffset;
    private RectF mDrawingRect;
    private float mHue;
    private Paint mHuePaint;
    private RectF mHueRect;
    private Shader mHueShader;
    private Paint mHueTrackerPaint;
    private int mLastTouchedPanel;
    private OnColorChangedListener mListener;
    private float mSat;
    private Shader mSatShader;
    private Paint mSatValPaint;
    private RectF mSatValRect;
    private Paint mSatValTrackerPaint;
    private boolean mShowAlphaPanel;
    private int mSliderTrackerColor;
    private Point mStartTouchPoint;
    private float mVal;
    private Shader mValShader;

    public interface OnColorChangedListener {
        void onColorChanged(int i);
    }

    public ColorPickerView(Context context) {
        this(context, (AttributeSet) null);
    }

    public ColorPickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ColorPickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.HUE_PANEL_WIDTH = 30.0f;
        this.ALPHA_PANEL_HEIGHT = 20.0f;
        this.PANEL_SPACING = 10.0f;
        this.PALETTE_CIRCLE_TRACKER_RADIUS = 5.0f;
        this.RECTANGLE_TRACKER_OFFSET = 2.0f;
        this.mDensity = 1.0f;
        this.mAlpha = 255;
        this.mHue = 360.0f;
        this.mSat = 0.0f;
        this.mVal = 0.0f;
        this.mAlphaSliderText = "";
        this.mSliderTrackerColor = -14935012;
        this.mBorderColor = -9539986;
        this.mShowAlphaPanel = false;
        this.mLastTouchedPanel = 0;
        this.mStartTouchPoint = (Point) null;
        init();
    }

    private Point alphaToPoint(int i) {
        RectF rectF = this.mAlphaRect;
        float fWidth = rectF.width();
        Point point = new Point();
        point.x = (int) ((fWidth - ((i * fWidth) / 255.0f)) + rectF.left);
        point.y = (int) rectF.top;
        return point;
    }

    private int[] buildHueColorArray() {
        int[] iArr = new int[361];
        int i = 0;
        int length = iArr.length - 1;
        while (length >= 0) {
            iArr[i] = Color.HSVToColor(new float[]{length, 1.0f, 1.0f});
            length--;
            i++;
        }
        return iArr;
    }

    private float calculateRequiredOffset() {
        return 1.5f * Math.max(Math.max(this.PALETTE_CIRCLE_TRACKER_RADIUS, this.RECTANGLE_TRACKER_OFFSET), 1.0f * this.mDensity);
    }

    private int chooseHeight(int i, int i2) {
        return (i == Integer.MIN_VALUE || i == 1073741824) ? i2 : getPrefferedHeight();
    }

    private int chooseWidth(int i, int i2) {
        return (i == Integer.MIN_VALUE || i == 1073741824) ? i2 : getPrefferedWidth();
    }

    private void drawAlphaPanel(Canvas canvas) {
        if (!this.mShowAlphaPanel || this.mAlphaRect == null || this.mAlphaPattern == null) {
            return;
        }
        RectF rectF = this.mAlphaRect;
        this.mBorderPaint.setColor(this.mBorderColor);
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, 1.0f + rectF.right, 1.0f + rectF.bottom, this.mBorderPaint);
        this.mAlphaPattern.draw(canvas);
        float[] fArr = {this.mHue, this.mSat, this.mVal};
        this.mAlphaShader = new LinearGradient(rectF.left, rectF.top, rectF.right, rectF.top, Color.HSVToColor(fArr), Color.HSVToColor(0, fArr), Shader.TileMode.CLAMP);
        this.mAlphaPaint.setShader(this.mAlphaShader);
        canvas.drawRect(rectF, this.mAlphaPaint);
        if (this.mAlphaSliderText != null && this.mAlphaSliderText != "") {
            canvas.drawText(this.mAlphaSliderText, rectF.centerX(), rectF.centerY() + (4.0f * this.mDensity), this.mAlphaTextPaint);
        }
        float f = (4.0f * this.mDensity) / 2.0f;
        Point pointAlphaToPoint = alphaToPoint(this.mAlpha);
        RectF rectF2 = new RectF();
        rectF2.left = pointAlphaToPoint.x - f;
        rectF2.right = pointAlphaToPoint.x + f;
        rectF2.top = rectF.top - this.RECTANGLE_TRACKER_OFFSET;
        rectF2.bottom = rectF.bottom + this.RECTANGLE_TRACKER_OFFSET;
        canvas.drawRoundRect(rectF2, 2.0f, 2.0f, this.mHueTrackerPaint);
    }

    private void drawHuePanel(Canvas canvas) {
        RectF rectF = this.mHueRect;
        this.mBorderPaint.setColor(this.mBorderColor);
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, 1.0f + rectF.bottom, this.mBorderPaint);
        if (this.mHueShader == null) {
            this.mHueShader = new LinearGradient(rectF.left, rectF.top, rectF.left, rectF.bottom, buildHueColorArray(), (float[]) null, Shader.TileMode.CLAMP);
            this.mHuePaint.setShader(this.mHueShader);
        }
        canvas.drawRect(rectF, this.mHuePaint);
        float f = (4.0f * this.mDensity) / 2.0f;
        Point pointHueToPoint = hueToPoint(this.mHue);
        RectF rectF2 = new RectF();
        rectF2.left = rectF.left - this.RECTANGLE_TRACKER_OFFSET;
        rectF2.right = rectF.right + this.RECTANGLE_TRACKER_OFFSET;
        rectF2.top = pointHueToPoint.y - f;
        rectF2.bottom = pointHueToPoint.y + f;
        canvas.drawRoundRect(rectF2, 2.0f, 2.0f, this.mHueTrackerPaint);
    }

    private void drawSatValPanel(Canvas canvas) {
        RectF rectF = this.mSatValRect;
        this.mBorderPaint.setColor(this.mBorderColor);
        canvas.drawRect(this.mDrawingRect.left, this.mDrawingRect.top, 1.0f + rectF.right, 1.0f + rectF.bottom, this.mBorderPaint);
        if (this.mValShader == null) {
            this.mValShader = new LinearGradient(rectF.left, rectF.top, rectF.left, rectF.bottom, -1, ViewCompat.MEASURED_STATE_MASK, Shader.TileMode.CLAMP);
        }
        this.mSatShader = new LinearGradient(rectF.left, rectF.top, rectF.right, rectF.top, -1, Color.HSVToColor(new float[]{this.mHue, 1.0f, 1.0f}), Shader.TileMode.CLAMP);
        this.mSatValPaint.setShader(new ComposeShader(this.mValShader, this.mSatShader, PorterDuff.Mode.MULTIPLY));
        canvas.drawRect(rectF, this.mSatValPaint);
        Point pointSatValToPoint = satValToPoint(this.mSat, this.mVal);
        this.mSatValTrackerPaint.setColor(ViewCompat.MEASURED_STATE_MASK);
        canvas.drawCircle(pointSatValToPoint.x, pointSatValToPoint.y, this.PALETTE_CIRCLE_TRACKER_RADIUS - (1.0f * this.mDensity), this.mSatValTrackerPaint);
        this.mSatValTrackerPaint.setColor(-2236963);
        canvas.drawCircle(pointSatValToPoint.x, pointSatValToPoint.y, this.PALETTE_CIRCLE_TRACKER_RADIUS, this.mSatValTrackerPaint);
    }

    private int getPrefferedHeight() {
        int i = (int) (200.0f * this.mDensity);
        return this.mShowAlphaPanel ? (int) (i + this.PANEL_SPACING + this.ALPHA_PANEL_HEIGHT) : i;
    }

    private int getPrefferedWidth() {
        int prefferedHeight = getPrefferedHeight();
        if (this.mShowAlphaPanel) {
            prefferedHeight = (int) (prefferedHeight - (this.PANEL_SPACING + this.ALPHA_PANEL_HEIGHT));
        }
        return (int) (prefferedHeight + this.HUE_PANEL_WIDTH + this.PANEL_SPACING);
    }

    private Point hueToPoint(float f) {
        RectF rectF = this.mHueRect;
        float fHeight = rectF.height();
        Point point = new Point();
        point.y = (int) ((fHeight - ((f * fHeight) / 360.0f)) + rectF.top);
        point.x = (int) rectF.left;
        return point;
    }

    private void init() {
        this.mDensity = getContext().getResources().getDisplayMetrics().density;
        this.PALETTE_CIRCLE_TRACKER_RADIUS *= this.mDensity;
        this.RECTANGLE_TRACKER_OFFSET *= this.mDensity;
        this.HUE_PANEL_WIDTH *= this.mDensity;
        this.ALPHA_PANEL_HEIGHT *= this.mDensity;
        this.PANEL_SPACING *= this.mDensity;
        this.mDrawingOffset = calculateRequiredOffset();
        initPaintTools();
        setFocusable(true);
        setFocusableInTouchMode(true);
    }

    private void initPaintTools() {
        this.mSatValPaint = new Paint();
        this.mSatValTrackerPaint = new Paint();
        this.mHuePaint = new Paint();
        this.mHueTrackerPaint = new Paint();
        this.mAlphaPaint = new Paint();
        this.mAlphaTextPaint = new Paint();
        this.mBorderPaint = new Paint();
        this.mSatValTrackerPaint.setStyle(Paint.Style.STROKE);
        this.mSatValTrackerPaint.setStrokeWidth(this.mDensity * 2.0f);
        this.mSatValTrackerPaint.setAntiAlias(true);
        this.mHueTrackerPaint.setColor(this.mSliderTrackerColor);
        this.mHueTrackerPaint.setStyle(Paint.Style.STROKE);
        this.mHueTrackerPaint.setStrokeWidth(this.mDensity * 2.0f);
        this.mHueTrackerPaint.setAntiAlias(true);
        this.mAlphaTextPaint.setColor(-14935012);
        this.mAlphaTextPaint.setTextSize(14.0f * this.mDensity);
        this.mAlphaTextPaint.setAntiAlias(true);
        this.mAlphaTextPaint.setTextAlign(Paint.Align.CENTER);
        this.mAlphaTextPaint.setFakeBoldText(true);
    }

    private boolean moveTrackersIfNeeded(MotionEvent motionEvent) {
        if (this.mStartTouchPoint == null) {
            return false;
        }
        int i = this.mStartTouchPoint.x;
        int i2 = this.mStartTouchPoint.y;
        if (this.mHueRect.contains(i, i2)) {
            this.mLastTouchedPanel = 1;
            this.mHue = pointToHue(motionEvent.getY());
            return true;
        }
        if (this.mSatValRect.contains(i, i2)) {
            this.mLastTouchedPanel = 0;
            float[] fArrPointToSatVal = pointToSatVal(motionEvent.getX(), motionEvent.getY());
            this.mSat = fArrPointToSatVal[0];
            this.mVal = fArrPointToSatVal[1];
            return true;
        }
        if (this.mAlphaRect == null || !this.mAlphaRect.contains(i, i2)) {
            return false;
        }
        this.mLastTouchedPanel = 2;
        this.mAlpha = pointToAlpha((int) motionEvent.getX());
        return true;
    }

    private int pointToAlpha(int i) {
        RectF rectF = this.mAlphaRect;
        int iWidth = (int) rectF.width();
        return 255 - (((((float) i) < rectF.left ? 0 : ((float) i) > rectF.right ? iWidth : i - ((int) rectF.left)) * 255) / iWidth);
    }

    private float pointToHue(float f) {
        RectF rectF = this.mHueRect;
        float fHeight = rectF.height();
        return 360.0f - (((f < rectF.top ? 0.0f : f > rectF.bottom ? fHeight : f - rectF.top) * 360.0f) / fHeight);
    }

    private float[] pointToSatVal(float f, float f2) {
        RectF rectF = this.mSatValRect;
        float[] fArr = new float[2];
        float fWidth = rectF.width();
        float fHeight = rectF.height();
        float f3 = f < rectF.left ? 0.0f : f > rectF.right ? fWidth : f - rectF.left;
        float f4 = f2 < rectF.top ? 0.0f : f2 > rectF.bottom ? fHeight : f2 - rectF.top;
        fArr[0] = (1.0f / fWidth) * f3;
        fArr[1] = 1.0f - ((1.0f / fHeight) * f4);
        return fArr;
    }

    private Point satValToPoint(float f, float f2) {
        RectF rectF = this.mSatValRect;
        float fHeight = rectF.height();
        float fWidth = rectF.width();
        Point point = new Point();
        point.x = (int) ((f * fWidth) + rectF.left);
        point.y = (int) (((1.0f - f2) * fHeight) + rectF.top);
        return point;
    }

    private void setUpAlphaRect() {
        if (this.mShowAlphaPanel) {
            RectF rectF = this.mDrawingRect;
            this.mAlphaRect = new RectF(rectF.left + 1.0f, (rectF.bottom - this.ALPHA_PANEL_HEIGHT) + 1.0f, rectF.right - 1.0f, rectF.bottom - 1.0f);
            this.mAlphaPattern = new AlphaPatternDrawable((int) (5.0f * this.mDensity));
            this.mAlphaPattern.setBounds(Math.round(this.mAlphaRect.left), Math.round(this.mAlphaRect.top), Math.round(this.mAlphaRect.right), Math.round(this.mAlphaRect.bottom));
        }
    }

    private void setUpHueRect() {
        RectF rectF = this.mDrawingRect;
        this.mHueRect = new RectF((rectF.right - this.HUE_PANEL_WIDTH) + 1.0f, rectF.top + 1.0f, rectF.right - 1.0f, (rectF.bottom - 1.0f) - (this.mShowAlphaPanel ? this.PANEL_SPACING + this.ALPHA_PANEL_HEIGHT : 0.0f));
    }

    private void setUpSatValRect() {
        RectF rectF = this.mDrawingRect;
        float fHeight = rectF.height() - 2.0f;
        if (this.mShowAlphaPanel) {
            fHeight -= this.PANEL_SPACING + this.ALPHA_PANEL_HEIGHT;
        }
        float f = rectF.left + 1.0f;
        float f2 = rectF.top + 1.0f;
        this.mSatValRect = new RectF(f, f2, f + fHeight, f2 + fHeight);
    }

    public String getAlphaSliderText() {
        return this.mAlphaSliderText;
    }

    public boolean getAlphaSliderVisible() {
        return this.mShowAlphaPanel;
    }

    public int getBorderColor() {
        return this.mBorderColor;
    }

    public int getColor() {
        return Color.HSVToColor(this.mAlpha, new float[]{this.mHue, this.mSat, this.mVal});
    }

    public float getDrawingOffset() {
        return this.mDrawingOffset;
    }

    public int getSliderTrackerColor() {
        return this.mSliderTrackerColor;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.mDrawingRect.width() <= 0.0f || this.mDrawingRect.height() <= 0.0f) {
            return;
        }
        drawSatValPanel(canvas);
        drawHuePanel(canvas);
        drawAlphaPanel(canvas);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int iChooseWidth = chooseWidth(mode, size);
        int iChooseHeight = chooseHeight(mode2, size2);
        if (this.mShowAlphaPanel) {
            i4 = (int) ((iChooseHeight - this.ALPHA_PANEL_HEIGHT) + this.HUE_PANEL_WIDTH);
            if (i4 > iChooseWidth) {
                i4 = iChooseWidth;
                i3 = (int) ((iChooseWidth - this.HUE_PANEL_WIDTH) + this.ALPHA_PANEL_HEIGHT);
            } else {
                i3 = iChooseHeight;
            }
        } else {
            i3 = (int) ((iChooseWidth - this.PANEL_SPACING) - this.HUE_PANEL_WIDTH);
            if (i3 > iChooseHeight || getTag().equals("landscape")) {
                i3 = iChooseHeight;
                i4 = (int) (i3 + this.PANEL_SPACING + this.HUE_PANEL_WIDTH);
            } else {
                i4 = iChooseWidth;
            }
        }
        setMeasuredDimension(i4, i3);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.mDrawingRect = new RectF();
        this.mDrawingRect.left = this.mDrawingOffset + getPaddingLeft();
        this.mDrawingRect.right = (i - this.mDrawingOffset) - getPaddingRight();
        this.mDrawingRect.top = this.mDrawingOffset + getPaddingTop();
        this.mDrawingRect.bottom = (i2 - this.mDrawingOffset) - getPaddingBottom();
        setUpSatValRect();
        setUpHueRect();
        setUpAlphaRect();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zMoveTrackersIfNeeded = false;
        switch (motionEvent.getAction()) {
            case 0:
                this.mStartTouchPoint = new Point((int) motionEvent.getX(), (int) motionEvent.getY());
                zMoveTrackersIfNeeded = moveTrackersIfNeeded(motionEvent);
                break;
            case 1:
                this.mStartTouchPoint = (Point) null;
                zMoveTrackersIfNeeded = moveTrackersIfNeeded(motionEvent);
                break;
            case 2:
                zMoveTrackersIfNeeded = moveTrackersIfNeeded(motionEvent);
                break;
        }
        if (!zMoveTrackersIfNeeded) {
            return super.onTouchEvent(motionEvent);
        }
        if (this.mListener != null) {
            this.mListener.onColorChanged(Color.HSVToColor(this.mAlpha, new float[]{this.mHue, this.mSat, this.mVal}));
        }
        invalidate();
        return true;
    }

    @Override // android.view.View
    public boolean onTrackballEvent(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        Object num = (Object) null;
        if (motionEvent.getAction() == 2) {
            switch (this.mLastTouchedPanel) {
                case 0:
                    float f = this.mSat + (x / 50.0f);
                    float f2 = this.mVal - (y / 50.0f);
                    if (f < 0.0f) {
                        f = 0.0f;
                    } else if (f > 1.0f) {
                        f = 1.0f;
                    }
                    if (f2 < 0.0f) {
                        f2 = 0.0f;
                    } else if (f2 > 1.0f) {
                        f2 = 1.0f;
                    }
                    this.mSat = f;
                    this.mVal = f2;
                    num = new Integer(1);
                    break;
                case 1:
                    float f3 = this.mHue - (y * 10.0f);
                    if (f3 < 0.0f) {
                        f3 = 0.0f;
                    } else if (f3 > 360.0f) {
                        f3 = 360.0f;
                    }
                    this.mHue = f3;
                    num = new Integer(1);
                    break;
                case 2:
                    if (this.mShowAlphaPanel && this.mAlphaRect != null) {
                        int i = (int) (this.mAlpha - (x * 10.0f));
                        if (i < 0) {
                            i = 0;
                        } else if (i > 255) {
                            i = 255;
                        }
                        this.mAlpha = i;
                        num = new Integer(1);
                    } else {
                        num = (Object) null;
                    }
                    break;
            }
        }
        if (num == null) {
            return super.onTrackballEvent(motionEvent);
        }
        if (this.mListener != null) {
            this.mListener.onColorChanged(Color.HSVToColor(this.mAlpha, new float[]{this.mHue, this.mSat, this.mVal}));
        }
        invalidate();
        return true;
    }

    public void setAlphaSliderText(int i) {
        setAlphaSliderText(getContext().getString(i));
    }

    public void setAlphaSliderText(String str) {
        this.mAlphaSliderText = str;
        invalidate();
    }

    public void setAlphaSliderVisible(boolean z) {
        if (this.mShowAlphaPanel) {
            if (z) {
                return;
            }
        } else if (!z) {
            return;
        }
        this.mShowAlphaPanel = z;
        this.mValShader = (Shader) null;
        this.mSatShader = (Shader) null;
        this.mHueShader = (Shader) null;
        this.mAlphaShader = (Shader) null;
        requestLayout();
    }

    public void setBorderColor(int i) {
        this.mBorderColor = i;
        invalidate();
    }

    public void setColor(int i) {
        setColor(i, false);
    }

    public void setColor(int i, boolean z) {
        int iAlpha = Color.alpha(i);
        float[] fArr = new float[3];
        Color.colorToHSV(i, fArr);
        this.mAlpha = iAlpha;
        this.mHue = fArr[0];
        this.mSat = fArr[1];
        this.mVal = fArr[2];
        if (z && this.mListener != null) {
            this.mListener.onColorChanged(Color.HSVToColor(this.mAlpha, new float[]{this.mHue, this.mSat, this.mVal}));
        }
        invalidate();
    }

    public void setOnColorChangedListener(OnColorChangedListener onColorChangedListener) {
        this.mListener = onColorChangedListener;
    }

    public void setSliderTrackerColor(int i) {
        this.mSliderTrackerColor = i;
        this.mHueTrackerPaint.setColor(this.mSliderTrackerColor);
        invalidate();
    }
}
