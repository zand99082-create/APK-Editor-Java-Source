package com.rull.mod;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.os.Handler;
import android.os.SystemClock;
import android.preference.PreferenceManager;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class WaveView extends View {
    private static final float DEFAULT_AMPLITUDE_RATIO = 0.05f;
    private static final float DEFAULT_WATER_LEVEL_RATIO = 0.5f;
    private static final float DEFAULT_WAVE_LENGTH_RATIO = 1.0f;
    public static final ShapeType DEFAULT_WAVE_SHAPE = ShapeType.SQUARE;
    private static final float DEFAULT_WAVE_SHIFT_RATIO = 0.0f;
    private static float level;
    private float mAmplitudeRatio;
    private AnimatorSet mAnimatorSet;
    private int mBehindWaveColor;
    private Paint mBorderPaint;
    private float mDefaultAmplitude;
    private double mDefaultAngularFrequency;
    private float mDefaultWaterLevel;
    private float mDefaultWaveLength;
    private int mFrontWaveColor;
    private Handler mHandler;
    private Matrix mShaderMatrix;
    private ShapeType mShapeType;
    private boolean mShowWave;
    private Runnable mTicker;
    private Paint mViewPaint;
    private float mWaterLevelRatio;
    private float mWaveLengthRatio;
    private BitmapShader mWaveShader;
    private float mWaveShiftRatio;
    private boolean start;
    private int warna;

    public enum ShapeType {
        SQUARE;

        public static ShapeType valueOf(String str) {
            for (ShapeType shapeType : values()) {
                if (shapeType.name().equals(str)) {
                    return shapeType;
                }
            }
            throw new IllegalArgumentException();
        }
    }

    public WaveView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mAmplitudeRatio = DEFAULT_AMPLITUDE_RATIO;
        this.mShapeType = DEFAULT_WAVE_SHAPE;
        this.mWaterLevelRatio = DEFAULT_WATER_LEVEL_RATIO;
        this.mWaveLengthRatio = 1.0f;
        this.mWaveShiftRatio = 0.0f;
        changeSettings();
        init();
        initAnimation();
    }

    private void changeSettings() {
        this.mHandler = new Handler();
        this.mTicker = new Runnable(this) { // from class: com.rull.mod.WaveView.100000000
            private final WaveView this$0;

            {
                this.this$0 = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.this$0.getContext());
                this.this$0.warna = defaultSharedPreferences.getInt("wave_color", 0);
                this.this$0.mFrontWaveColor = this.this$0.warna;
                this.this$0.mBehindWaveColor = this.this$0.adjustAlpha(this.this$0.warna, 0.4f);
                WaveView.level = (100 - defaultSharedPreferences.getInt("wave_level", 30)) / 100.0f;
                this.this$0.start = defaultSharedPreferences.getBoolean("wave_start", true);
                if (this.this$0.start) {
                    this.this$0.setShowWave(true);
                    if (this.this$0.mAnimatorSet != null) {
                        this.this$0.mAnimatorSet.start();
                    }
                } else {
                    this.this$0.setShowWave(false);
                }
                this.this$0.invalidate();
                long jUptimeMillis = SystemClock.uptimeMillis();
                this.this$0.mHandler.postAtTime(this.this$0.mTicker, jUptimeMillis + (((long) 1000) - (jUptimeMillis % ((long) 1000))));
            }
        };
        this.mTicker.run();
    }

    private void createShader() {
        this.mDefaultAngularFrequency = 6.283185307179586d / ((double) getWidth());
        this.mDefaultAmplitude = getHeight() * DEFAULT_AMPLITUDE_RATIO;
        this.mDefaultWaterLevel = getHeight() * DEFAULT_WATER_LEVEL_RATIO;
        this.mDefaultWaveLength = getWidth();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        paint.setStrokeWidth(2.0f);
        paint.setAntiAlias(true);
        int width = getWidth() + 1;
        int height = getHeight() + 1;
        float[] fArr = new float[width];
        paint.setColor(this.mBehindWaveColor);
        for (int i = 0; i < width; i++) {
            float fSin = (float) (((double) this.mDefaultWaterLevel) + (((double) this.mDefaultAmplitude) * Math.sin(((double) i) * this.mDefaultAngularFrequency)));
            canvas.drawLine(i, fSin, i, height, paint);
            fArr[i] = fSin;
        }
        paint.setColor(this.mFrontWaveColor);
        int i2 = (int) (this.mDefaultWaveLength / 4.0f);
        for (int i3 = 0; i3 < width; i3++) {
            canvas.drawLine(i3, fArr[(i3 + i2) % width], i3, height, paint);
        }
        this.mWaveShader = new BitmapShader(bitmapCreateBitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP);
        this.mViewPaint.setShader(this.mWaveShader);
    }

    private void init() {
        this.mShaderMatrix = new Matrix();
        this.mViewPaint = new Paint();
        this.mViewPaint.setAntiAlias(true);
    }

    private void initAnimation() {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "waveShiftRatio", 0.0f, 1.0f);
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.setDuration(1000);
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        arrayList.add(objectAnimatorOfFloat);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, "waterLevelRatio", 0.0f, DEFAULT_WATER_LEVEL_RATIO);
        objectAnimatorOfFloat2.setDuration(4000);
        objectAnimatorOfFloat2.setInterpolator(new DecelerateInterpolator());
        arrayList.add(objectAnimatorOfFloat2);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this, "amplitudeRatio", 1.0E-4f, DEFAULT_AMPLITUDE_RATIO);
        objectAnimatorOfFloat3.setRepeatCount(-1);
        objectAnimatorOfFloat3.setRepeatMode(2);
        objectAnimatorOfFloat3.setDuration(5000);
        objectAnimatorOfFloat3.setInterpolator(new LinearInterpolator());
        arrayList.add(objectAnimatorOfFloat3);
        this.mAnimatorSet = new AnimatorSet();
        this.mAnimatorSet.playTogether(arrayList);
    }

    public int adjustAlpha(int i, float f) {
        return Color.argb(Math.round(Color.alpha(i) * f), Color.red(i), Color.green(i), Color.blue(i));
    }

    public float getAmplitudeRatio() {
        return this.mAmplitudeRatio;
    }

    public float getWaterLevelRatio() {
        return this.mWaterLevelRatio;
    }

    public float getWaveLengthRatio() {
        return this.mWaveLengthRatio;
    }

    public float getWaveShiftRatio() {
        return this.mWaveShiftRatio;
    }

    public boolean isShowWave() {
        return this.mShowWave;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        float strokeWidth = 0.0f;
        if (!this.mShowWave || this.mWaveShader == null) {
            this.mViewPaint.setShader((Shader) null);
            return;
        }
        if (this.mViewPaint.getShader() == null) {
            this.mViewPaint.setShader(this.mWaveShader);
        }
        this.mShaderMatrix.setScale(this.mWaveLengthRatio / 1.0f, this.mAmplitudeRatio / DEFAULT_AMPLITUDE_RATIO, 0.0f, this.mDefaultWaterLevel);
        this.mShaderMatrix.postTranslate(this.mWaveShiftRatio * getWidth(), (level - this.mWaterLevelRatio) * getHeight());
        this.mWaveShader.setLocalMatrix(this.mShaderMatrix);
        if (this.mBorderPaint != null) {
            strokeWidth = this.mBorderPaint.getStrokeWidth();
        }
        if (this.mShapeType == ShapeType.SQUARE) {
            canvas.drawRect(strokeWidth, strokeWidth, getWidth() - strokeWidth, getHeight() - strokeWidth, this.mViewPaint);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        createShader();
    }

    public void setAmplitudeRatio(float f) {
        if (this.mAmplitudeRatio != f) {
            this.mAmplitudeRatio = f;
            invalidate();
        }
    }

    public void setShapeType(ShapeType shapeType) {
        this.mShapeType = shapeType;
        invalidate();
    }

    public void setShowWave(boolean z) {
        this.mShowWave = z;
    }

    public void setWaterLevelRatio(float f) {
        if (this.mWaterLevelRatio != f) {
            this.mWaterLevelRatio = f;
            invalidate();
        }
    }

    public void setWaveColor(int i, int i2) {
        this.mBehindWaveColor = i;
        this.mFrontWaveColor = i2;
        this.mWaveShader = (BitmapShader) null;
        createShader();
        invalidate();
    }

    public void setWaveLengthRatio(float f) {
        this.mWaveLengthRatio = f;
    }

    public void setWaveShiftRatio(float f) {
        if (this.mWaveShiftRatio != f) {
            this.mWaveShiftRatio = f;
            invalidate();
        }
    }
}
