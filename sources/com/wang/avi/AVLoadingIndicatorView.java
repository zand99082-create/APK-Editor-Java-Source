package com.wang.avi;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.preference.PreferenceManager;
import android.support.annotation.IntDef;
import android.util.AttributeSet;
import android.view.View;
import com.wang.avi.indicator.BallBeatIndicator;
import com.wang.avi.indicator.BallClipRotateIndicator;
import com.wang.avi.indicator.BallClipRotateMultipleIndicator;
import com.wang.avi.indicator.BallClipRotatePulseIndicator;
import com.wang.avi.indicator.BallGridBeatIndicator;
import com.wang.avi.indicator.BallGridPulseIndicator;
import com.wang.avi.indicator.BallPulseIndicator;
import com.wang.avi.indicator.BallPulseRiseIndicator;
import com.wang.avi.indicator.BallPulseSyncIndicator;
import com.wang.avi.indicator.BallRotateIndicator;
import com.wang.avi.indicator.BallScaleIndicator;
import com.wang.avi.indicator.BallScaleMultipleIndicator;
import com.wang.avi.indicator.BallScaleRippleIndicator;
import com.wang.avi.indicator.BallScaleRippleMultipleIndicator;
import com.wang.avi.indicator.BallSpinFadeLoaderIndicator;
import com.wang.avi.indicator.BallTrianglePathIndicator;
import com.wang.avi.indicator.BallZigZagDeflectIndicator;
import com.wang.avi.indicator.BallZigZagIndicator;
import com.wang.avi.indicator.BaseIndicatorController;
import com.wang.avi.indicator.CubeTransitionIndicator;
import com.wang.avi.indicator.LineScaleIndicator;
import com.wang.avi.indicator.LineScalePartyIndicator;
import com.wang.avi.indicator.LineScalePulseOutIndicator;
import com.wang.avi.indicator.LineScalePulseOutRapidIndicator;
import com.wang.avi.indicator.LineSpinFadeLoaderIndicator;
import com.wang.avi.indicator.PacmanIndicator;
import com.wang.avi.indicator.SemiCircleSpinIndicator;
import com.wang.avi.indicator.SquareSpinIndicator;
import com.wang.avi.indicator.TriangleSkewSpinIndicator;

/* JADX INFO: loaded from: classes.dex */
public class AVLoadingIndicatorView extends View {
    public static final int BallBeat = 17;
    public static final int BallClipRotate = 2;
    public static final int BallClipRotateMultiple = 5;
    public static final int BallClipRotatePulse = 3;
    public static final int BallGridBeat = 26;
    public static final int BallGridPulse = 1;
    public static final int BallPulse = 0;
    public static final int BallPulseRise = 6;
    public static final int BallPulseSync = 16;
    public static final int BallRotate = 7;
    public static final int BallScale = 12;
    public static final int BallScaleMultiple = 15;
    public static final int BallScaleRipple = 20;
    public static final int BallScaleRippleMultiple = 21;
    public static final int BallSpinFadeLoader = 22;
    public static final int BallTrianglePath = 11;
    public static final int BallZigZag = 9;
    public static final int BallZigZagDeflect = 10;
    public static final int CubeTransition = 8;
    public static final int DEFAULT_SIZE = 45;
    public static final int LineScale = 13;
    public static final int LineScaleParty = 14;
    public static final int LineScalePulseOut = 18;
    public static final int LineScalePulseOutRapid = 19;
    public static final int LineSpinFadeLoader = 23;
    public static final int Pacman = 25;
    public static final int SemiCircleSpin = 27;
    public static final int SquareSpin = 4;
    public static final int TriangleSkewSpin = 24;
    int kocaklo;
    private boolean mHasAnimation;
    BaseIndicatorController mIndicatorController;
    int mIndicatorId;
    Paint mPaint;

    @IntDef(flag = true, value = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27})
    public @interface Indicator {
    }

    public AVLoadingIndicatorView(Context context) {
        super(context);
        init();
    }

    public AVLoadingIndicatorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public AVLoadingIndicatorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    public AVLoadingIndicatorView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        init();
    }

    public int Masrull() {
        return Integer.parseInt(PreferenceManager.getDefaultSharedPreferences(getContext()).getString("animation_key", "0"));
    }

    public int Masrulla(String str, String str2) {
        return getContext().getResources().getIdentifier(str, str2, getContext().getPackageName());
    }

    private void init() {
        this.mIndicatorId = Masrull();
        this.mPaint = new Paint();
        this.mPaint.setColor(getContext().getResources().getColor(Masrulla("light_accent", "color")));
        this.mPaint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.mPaint.setAntiAlias(true);
        applyIndicator();
    }

    private void applyIndicator() {
        switch (this.mIndicatorId) {
            case 0:
                this.mIndicatorController = new BallPulseIndicator();
                break;
            case 1:
                this.mIndicatorController = new BallGridPulseIndicator();
                break;
            case 2:
                this.mIndicatorController = new BallClipRotateIndicator();
                break;
            case 3:
                this.mIndicatorController = new BallClipRotatePulseIndicator();
                break;
            case 4:
                this.mIndicatorController = new SquareSpinIndicator();
                break;
            case 5:
                this.mIndicatorController = new BallClipRotateMultipleIndicator();
                break;
            case 6:
                this.mIndicatorController = new BallPulseRiseIndicator();
                break;
            case 7:
                this.mIndicatorController = new BallRotateIndicator();
                break;
            case 8:
                this.mIndicatorController = new CubeTransitionIndicator();
                break;
            case 9:
                this.mIndicatorController = new BallZigZagIndicator();
                break;
            case 10:
                this.mIndicatorController = new BallZigZagDeflectIndicator();
                break;
            case 11:
                this.mIndicatorController = new BallTrianglePathIndicator();
                break;
            case 12:
                this.mIndicatorController = new BallScaleIndicator();
                break;
            case 13:
                this.mIndicatorController = new LineScaleIndicator();
                break;
            case 14:
                this.mIndicatorController = new LineScalePartyIndicator();
                break;
            case 15:
                this.mIndicatorController = new BallScaleMultipleIndicator();
                break;
            case 16:
                this.mIndicatorController = new BallPulseSyncIndicator();
                break;
            case 17:
                this.mIndicatorController = new BallBeatIndicator();
                break;
            case 18:
                this.mIndicatorController = new LineScalePulseOutIndicator();
                break;
            case 19:
                this.mIndicatorController = new LineScalePulseOutRapidIndicator();
                break;
            case 20:
                this.mIndicatorController = new BallScaleRippleIndicator();
                break;
            case 21:
                this.mIndicatorController = new BallScaleRippleMultipleIndicator();
                break;
            case 22:
                this.mIndicatorController = new BallSpinFadeLoaderIndicator();
                break;
            case 23:
                this.mIndicatorController = new LineSpinFadeLoaderIndicator();
                break;
            case 24:
                this.mIndicatorController = new TriangleSkewSpinIndicator();
                break;
            case 25:
                this.mIndicatorController = new PacmanIndicator();
                break;
            case 26:
                this.mIndicatorController = new BallGridBeatIndicator();
                break;
            case 27:
                this.mIndicatorController = new SemiCircleSpinIndicator();
                break;
        }
        this.mIndicatorController.setTarget(this);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(measureDimension(dp2px(45), i), measureDimension(dp2px(45), i2));
    }

    private int measureDimension(int i, int i2) {
        int iMin;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == 1073741824) {
            iMin = size;
        } else if (mode == Integer.MIN_VALUE) {
            iMin = Math.min(i, size);
        } else {
            iMin = i;
        }
        return iMin;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        drawIndicator(canvas);
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.mHasAnimation) {
            return;
        }
        this.mHasAnimation = true;
        applyAnimation();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        if (getVisibility() != i) {
            super.setVisibility(i);
            if (i != 8 && i != 4) {
                this.mIndicatorController.setAnimationStatus(BaseIndicatorController.AnimStatus.START);
            } else {
                this.mIndicatorController.setAnimationStatus(BaseIndicatorController.AnimStatus.END);
            }
        }
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.mIndicatorController.setAnimationStatus(BaseIndicatorController.AnimStatus.CANCEL);
    }

    void drawIndicator(Canvas canvas) {
        this.mIndicatorController.draw(canvas, this.mPaint);
    }

    void applyAnimation() {
        this.mIndicatorController.initAnimation();
    }

    private int dp2px(int i) {
        return ((int) getContext().getResources().getDisplayMetrics().density) * i;
    }

    /* JADX INFO: renamed from: com.wang.avi.AVLoadingIndicatorView$100000000, reason: invalid class name */
    class AnonymousClass100000000 implements Runnable {
        private final AVLoadingIndicatorView this$0;

        AnonymousClass100000000(AVLoadingIndicatorView aVLoadingIndicatorView) {
            this.this$0 = aVLoadingIndicatorView;
        }

        public void Init(Context context) {
            AVLoadingIndicatorView.access$S1000007(this.this$0, context.getSharedPreferences("animationcolor", 0));
        }

        @Override // java.lang.Runnable
        public void run() {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.this$0.getContext());
            this.this$0.mIndicatorColor = defaultSharedPreferences.getInt("animationcolor", 0);
        }
    }
}
