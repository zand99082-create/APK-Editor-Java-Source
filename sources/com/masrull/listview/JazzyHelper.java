package com.masrull.listview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.AbsListView;
import com.masrull.listview.effects.CardsEffect;
import com.masrull.listview.effects.CurlEffect;
import com.masrull.listview.effects.FadeEffect;
import com.masrull.listview.effects.FanEffect;
import com.masrull.listview.effects.FlipEffect;
import com.masrull.listview.effects.FlyEffect;
import com.masrull.listview.effects.GrowEffect;
import com.masrull.listview.effects.HelixEffect;
import com.masrull.listview.effects.ReverseFlyEffect;
import com.masrull.listview.effects.SlideInEffect;
import com.masrull.listview.effects.StandardEffect;
import com.masrull.listview.effects.TiltEffect;
import com.masrull.listview.effects.TwirlEffect;
import com.masrull.listview.effects.WaveEffect;
import com.masrull.listview.effects.ZipperEffect;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public class JazzyHelper implements AbsListView.OnScrollListener {
    public static final int CARDS = 2;
    public static final int CURL = 3;
    public static final int DURATION = 300;
    public static final int FADE = 12;
    public static final int FAN = 9;
    public static final int FLIP = 5;
    public static final int FLY = 6;
    public static final int GROW = 1;
    public static final int HELIX = 8;
    public static final int MAX_VELOCITY_OFF = 0;
    public static final int OPAQUE = 255;
    public static final int REVERSE_FLY = 7;
    public static final int SLIDE_IN = 14;
    public static final int STANDARD = 0;
    public static final int TILT = 10;
    public static final int TRANSPARENT = 0;
    public static final int TWIRL = 13;
    public static final int WAVE = 4;
    public static final int ZIPPER = 11;
    private AbsListView.OnScrollListener mAdditionalOnScrollListener;
    private final HashSet<Integer> mAlreadyAnimatedItems;
    private int mFirstVisibleItem;
    private boolean mIsFlingEvent;
    private boolean mIsScrolling;
    private int mLastVisibleItem;
    private int mMaxVelocity;
    private boolean mOnlyAnimateNewItems;
    private boolean mOnlyAnimateOnFling;
    private long mPreviousEventTime;
    private int mPreviousFirstVisibleItem;
    private boolean mSimulateGridWithList;
    private double mSpeed;
    private JazzyEffect mTransitionEffect;

    public JazzyHelper() {
        this((Context) null, (AttributeSet) null);
    }

    public JazzyHelper(Context context, AttributeSet attributeSet) {
        this.mTransitionEffect = (JazzyEffect) null;
        this.mIsScrolling = false;
        this.mFirstVisibleItem = -1;
        this.mLastVisibleItem = -1;
        this.mPreviousFirstVisibleItem = 0;
        this.mPreviousEventTime = 0;
        this.mSpeed = 0.0d;
        this.mMaxVelocity = 0;
        this.mAlreadyAnimatedItems = new HashSet<>();
        setTransitionEffect(0);
        setMaxAnimationVelocity(0);
    }

    private void doJazziness(View view, int i, int i2) {
        if (this.mIsScrolling) {
            if (!this.mOnlyAnimateNewItems || !this.mAlreadyAnimatedItems.contains(Integer.valueOf(i))) {
                if (!this.mOnlyAnimateOnFling || this.mIsFlingEvent) {
                    int i3 = this.mMaxVelocity;
                    if (i3 <= 0 || i3 >= this.mSpeed) {
                        if (this.mSimulateGridWithList) {
                            ViewGroup viewGroup = (ViewGroup) view;
                            for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                                doJazzinessImpl(viewGroup.getChildAt(i4), i, i2);
                            }
                        } else {
                            doJazzinessImpl(view, i, i2);
                        }
                        this.mAlreadyAnimatedItems.add(Integer.valueOf(i));
                    }
                }
            }
        }
    }

    private void doJazzinessImpl(View view, int i, int i2) {
        try {
            ViewPropertyAnimator interpolator = view.animate().setDuration(DURATION).setInterpolator(new AccelerateDecelerateInterpolator());
            int i3 = i2 > 0 ? 1 : -1;
            this.mTransitionEffect.initView(view, i, i3);
            this.mTransitionEffect.setupAnimation(view, i, i3, interpolator);
            interpolator.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void notifyAdditionalOnScrollListener(AbsListView absListView, int i, int i2, int i3) {
        AbsListView.OnScrollListener onScrollListener = this.mAdditionalOnScrollListener;
        if (onScrollListener != null) {
            onScrollListener.onScroll(absListView, i, i2, i3);
        }
    }

    private void notifyAdditionalOnScrollStateChangedListener(AbsListView absListView, int i) {
        AbsListView.OnScrollListener onScrollListener = this.mAdditionalOnScrollListener;
        if (onScrollListener != null) {
            onScrollListener.onScrollStateChanged(absListView, i);
        }
    }

    private void setVelocity(int i, int i2) {
        if (this.mMaxVelocity <= 0 || this.mPreviousFirstVisibleItem == i) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = jCurrentTimeMillis - this.mPreviousEventTime;
        if (j < 1) {
            double d = j;
            Double.isNaN(d);
            double d2 = (1.0d / d) * 1000.0d;
            double d3 = this.mSpeed;
            if (d2 < d3 * 0.8999999761581421d) {
                this.mSpeed = d3 * 0.8999999761581421d;
            } else if (d2 > d3 * 1.100000023841858d) {
                this.mSpeed = d3 * 1.100000023841858d;
            } else {
                this.mSpeed = d2;
            }
        } else {
            double d4 = j;
            Double.isNaN(d4);
            this.mSpeed = (1.0d / d4) * 1000.0d;
        }
        this.mPreviousFirstVisibleItem = i;
        this.mPreviousEventTime = jCurrentTimeMillis;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        onScrolled(absListView, i, i2, i3);
        notifyAdditionalOnScrollListener(absListView, i, i2, i3);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i) {
        if (i == 0) {
            this.mIsScrolling = false;
            this.mIsFlingEvent = false;
        } else if (i == 1) {
            this.mIsScrolling = true;
            this.mIsFlingEvent = false;
        } else if (i == 2) {
            this.mIsFlingEvent = true;
        }
        notifyAdditionalOnScrollStateChangedListener(absListView, i);
    }

    public final void onScrolled(ViewGroup viewGroup, int i, int i2, int i3) {
        boolean z = (this.mFirstVisibleItem == -1 || this.mLastVisibleItem == -1) ? false : true;
        int i4 = (i + i2) - 1;
        if (this.mIsScrolling && z) {
            setVelocity(i, i3);
            for (int i5 = 0; i + i5 < this.mFirstVisibleItem; i5++) {
                doJazziness(viewGroup.getChildAt(i5), i + i5, -1);
            }
            for (int i6 = 0; i4 - i6 > this.mLastVisibleItem; i6++) {
                doJazziness(viewGroup.getChildAt((i4 - i) - i6), i4 - i6, 1);
            }
        } else if (!z) {
            for (int i7 = i; i7 < i2; i7++) {
                this.mAlreadyAnimatedItems.add(Integer.valueOf(i7));
            }
        }
        this.mFirstVisibleItem = i;
        this.mLastVisibleItem = i4;
    }

    public void setFlingEvent(boolean z) {
        this.mIsFlingEvent = z;
    }

    public void setMaxAnimationVelocity(int i) {
        this.mMaxVelocity = i;
    }

    public void setOnScrollListener(AbsListView.OnScrollListener onScrollListener) {
        this.mAdditionalOnScrollListener = onScrollListener;
    }

    public void setScrolling(boolean z) {
        this.mIsScrolling = z;
    }

    public void setShouldOnlyAnimateFling(boolean z) {
        this.mOnlyAnimateOnFling = z;
    }

    public void setShouldOnlyAnimateNewItems(boolean z) {
        this.mOnlyAnimateNewItems = z;
    }

    public void setSimulateGridWithList(boolean z) {
        this.mSimulateGridWithList = z;
    }

    public void setTransitionEffect(int i) {
        switch (i) {
            case 0:
                setTransitionEffect(new StandardEffect());
                break;
            case 1:
                setTransitionEffect(new GrowEffect());
                break;
            case 2:
                setTransitionEffect(new CardsEffect());
                break;
            case 3:
                setTransitionEffect(new CurlEffect());
                break;
            case 4:
                setTransitionEffect(new WaveEffect());
                break;
            case 5:
                setTransitionEffect(new FlipEffect());
                break;
            case 6:
                setTransitionEffect(new FlyEffect());
                break;
            case 7:
                setTransitionEffect(new ReverseFlyEffect());
                break;
            case 8:
                setTransitionEffect(new HelixEffect());
                break;
            case 9:
                setTransitionEffect(new FanEffect());
                break;
            case 10:
                setTransitionEffect(new TiltEffect());
                break;
            case 11:
                setTransitionEffect(new ZipperEffect());
                break;
            case 12:
                setTransitionEffect(new FadeEffect());
                break;
            case 13:
                setTransitionEffect(new TwirlEffect());
                break;
            case 14:
                setTransitionEffect(new SlideInEffect());
                break;
        }
    }

    public void setTransitionEffect(JazzyEffect jazzyEffect) {
        this.mTransitionEffect = jazzyEffect;
    }
}
