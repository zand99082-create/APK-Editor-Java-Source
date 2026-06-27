package com.gmail.heagoo.sqliteutil;

import android.graphics.Rect;
import android.os.Handler;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.Scroller;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.gmail.heagoo.sqliteutil.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1627a extends FrameLayout {

    /* JADX INFO: renamed from: a */
    private long f4959a;

    /* JADX INFO: renamed from: b */
    private final Rect f4960b;

    /* JADX INFO: renamed from: c */
    private boolean f4961c;

    /* JADX INFO: renamed from: d */
    private float f4962d;

    /* JADX INFO: renamed from: e */
    private float f4963e;

    /* JADX INFO: renamed from: f */
    private boolean f4964f;

    /* JADX INFO: renamed from: g */
    private View f4965g;

    /* JADX INFO: renamed from: h */
    private boolean f4966h;

    /* JADX INFO: renamed from: i */
    private VelocityTracker f4967i;

    /* JADX INFO: renamed from: j */
    private int f4968j;

    /* JADX INFO: renamed from: k */
    private long f4969k;

    /* JADX INFO: renamed from: l */
    private View f4970l;

    /* JADX INFO: renamed from: a */
    private static int m4000a(int i, int i2, int i3) {
        if (i2 >= i3 || i < 0) {
            return 0;
        }
        return i2 + i > i3 ? i3 - i2 : i;
    }

    /* JADX INFO: renamed from: a */
    private int m4001a(Rect rect) {
        int iMax;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        if (rect.bottom < getChildAt(0).getHeight()) {
            i -= verticalFadingEdgeLength;
        }
        if (rect.bottom > i && rect.top > scrollY) {
            iMax = Math.min(rect.height() > height ? (rect.top - scrollY) + 0 : (rect.bottom - i) + 0, getChildAt(0).getBottom() - i);
        } else if (rect.top >= scrollY || rect.bottom >= i) {
            iMax = 0;
        } else {
            iMax = Math.max(rect.height() > height ? 0 - (i - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
        }
        return iMax;
    }

    /* JADX INFO: renamed from: a */
    private void m4003a(MotionEvent motionEvent) {
        int action = (motionEvent.getAction() >> 8) & 255;
        if (motionEvent.getPointerId(action) == this.f4968j) {
            int i = action == 0 ? 1 : 0;
            this.f4963e = motionEvent.getX(i);
            this.f4962d = motionEvent.getY(i);
            this.f4968j = motionEvent.getPointerId(i);
            if (this.f4967i != null) {
                this.f4967i.clear();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m4004a(View view) {
        view.getDrawingRect(this.f4960b);
        offsetDescendantRectToMyCoords(view, this.f4960b);
        int iM4001a = m4001a(this.f4960b);
        int iM4011b = m4011b(this.f4960b);
        if (iM4011b == 0 && iM4001a == 0) {
            return;
        }
        scrollBy(iM4011b, iM4001a);
    }

    /* JADX INFO: renamed from: a */
    private boolean m4005a() {
        View childAt = getChildAt(0);
        if (childAt != null) {
            return getHeight() < (childAt.getHeight() + getPaddingTop()) + getPaddingBottom();
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00f8  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean m4006a(int i) {
        boolean z;
        boolean z2;
        View view;
        int childCount;
        boolean z3 = i == 130;
        int height = getHeight();
        this.f4960b.top = 0;
        this.f4960b.bottom = height;
        if (z3 && (childCount = getChildCount()) > 0) {
            this.f4960b.bottom = getChildAt(childCount - 1).getBottom();
            this.f4960b.top = this.f4960b.bottom - height;
        }
        int i2 = this.f4960b.top;
        int i3 = this.f4960b.bottom;
        int height2 = getHeight();
        int scrollY = getScrollY();
        int i4 = scrollY + height2;
        boolean z4 = i == 33;
        ArrayList focusables = getFocusables(2);
        View view2 = null;
        boolean z5 = false;
        int size = focusables.size();
        int i5 = 0;
        while (i5 < size) {
            View view3 = (View) focusables.get(i5);
            int top = view3.getTop();
            int bottom = view3.getBottom();
            if (i2 >= bottom || top >= i3) {
                z2 = z5;
                view = view2;
            } else {
                boolean z6 = i2 < top && bottom < i3;
                if (view2 == null) {
                    boolean z7 = z6;
                    view = view3;
                    z2 = z7;
                } else {
                    boolean z8 = (z4 && top < view2.getTop()) || (!z4 && bottom > view2.getBottom());
                    if (z5) {
                        if (z6 && z8) {
                            view = view3;
                            z2 = z5;
                        }
                    } else if (z6) {
                        view = view3;
                        z2 = true;
                    } else if (z8) {
                        view = view3;
                        z2 = z5;
                    }
                }
            }
            i5++;
            view2 = view;
            z5 = z2;
        }
        if (view2 == null) {
            view2 = this;
        }
        if (i2 < scrollY || i3 > i4) {
            m4017e(z4 ? i2 - scrollY : i3 - i4);
            z = true;
        } else {
            z = false;
        }
        if (view2 != findFocus() && view2.requestFocus(i)) {
            this.f4961c = true;
            this.f4961c = false;
        }
        return z;
    }

    /* JADX INFO: renamed from: a */
    private boolean m4007a(int i, int i2) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        View childAt = getChildAt(0);
        return i2 >= childAt.getTop() - scrollY && i2 < childAt.getBottom() - scrollY && i >= childAt.getLeft() - scrollX && i < childAt.getRight() - scrollX;
    }

    /* JADX INFO: renamed from: a */
    private boolean m4008a(View view, int i) {
        view.getDrawingRect(this.f4960b);
        offsetDescendantRectToMyCoords(view, this.f4960b);
        return this.f4960b.right + i >= getScrollX() && this.f4960b.left - i <= getScrollX() + getWidth();
    }

    /* JADX INFO: renamed from: a */
    private boolean m4009a(View view, int i, int i2) {
        view.getDrawingRect(this.f4960b);
        offsetDescendantRectToMyCoords(view, this.f4960b);
        return this.f4960b.bottom + i >= getScrollY() && this.f4960b.top - i <= getScrollY() + i2;
    }

    /* JADX INFO: renamed from: a */
    private boolean m4010a(View view, View view2) {
        if (view == view2) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && m4010a((View) parent, view2);
    }

    /* JADX INFO: renamed from: b */
    private int m4011b(Rect rect) {
        int iMax;
        if (getChildCount() == 0) {
            return 0;
        }
        int width = getWidth();
        int scrollX = getScrollX();
        int i = scrollX + width;
        int horizontalFadingEdgeLength = getHorizontalFadingEdgeLength();
        if (rect.left > 0) {
            scrollX += horizontalFadingEdgeLength;
        }
        if (rect.right < getChildAt(0).getWidth()) {
            i -= horizontalFadingEdgeLength;
        }
        if (rect.right > i && rect.left > scrollX) {
            iMax = Math.min(rect.width() > width ? (rect.left - scrollX) + 0 : (rect.right - i) + 0, getChildAt(0).getRight() - i);
        } else if (rect.left >= scrollX || rect.right >= i) {
            iMax = 0;
        } else {
            iMax = Math.max(rect.width() > width ? 0 - (i - rect.right) : 0 - (scrollX - rect.left), -getScrollX());
        }
        return iMax;
    }

    /* JADX INFO: renamed from: b */
    static /* synthetic */ Rect m4012b(C1627a c1627a) {
        return null;
    }

    /* JADX INFO: renamed from: b */
    private boolean m4013b() {
        View childAt = getChildAt(0);
        if (childAt != null) {
            return getWidth() < (childAt.getWidth() + getPaddingLeft()) + getPaddingRight();
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00f7  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean m4014b(int i) {
        boolean z;
        boolean z2;
        View view;
        boolean z3 = i == 66;
        int width = getWidth();
        this.f4960b.left = 0;
        this.f4960b.right = width;
        if (z3 && getChildCount() > 0) {
            this.f4960b.right = getChildAt(0).getRight();
            this.f4960b.left = this.f4960b.right - width;
        }
        int i2 = this.f4960b.left;
        int i3 = this.f4960b.right;
        int width2 = getWidth();
        int scrollX = getScrollX();
        int i4 = scrollX + width2;
        boolean z4 = i == 17;
        ArrayList focusables = getFocusables(2);
        View view2 = null;
        boolean z5 = false;
        int size = focusables.size();
        int i5 = 0;
        while (i5 < size) {
            View view3 = (View) focusables.get(i5);
            int left = view3.getLeft();
            int right = view3.getRight();
            if (i2 >= right || left >= i3) {
                z2 = z5;
                view = view2;
            } else {
                boolean z6 = i2 < left && right < i3;
                if (view2 == null) {
                    boolean z7 = z6;
                    view = view3;
                    z2 = z7;
                } else {
                    boolean z8 = (z4 && left < view2.getLeft()) || (!z4 && right > view2.getRight());
                    if (z5) {
                        if (z6 && z8) {
                            view = view3;
                            z2 = z5;
                        }
                    } else if (z6) {
                        view = view3;
                        z2 = true;
                    } else if (z8) {
                        view = view3;
                        z2 = z5;
                    }
                }
            }
            i5++;
            view2 = view;
            z5 = z2;
        }
        if (view2 == null) {
            view2 = this;
        }
        if (i2 < scrollX || i3 > i4) {
            m4018f(z4 ? i2 - scrollX : i3 - i4);
            z = true;
        } else {
            z = false;
        }
        if (view2 != findFocus() && view2.requestFocus(i)) {
            this.f4961c = true;
            this.f4961c = false;
        }
        return z;
    }

    /* JADX INFO: renamed from: c */
    private boolean m4015c(int i) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i);
        int bottom = (int) (0.5f * (getBottom() - getTop()));
        if (viewFindNextFocus == null || !m4009a(viewFindNextFocus, bottom, getHeight())) {
            if (i == 33 && getScrollY() < bottom) {
                bottom = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                int bottom2 = getChildAt(0).getBottom();
                int scrollY = getScrollY() + getHeight();
                if (bottom2 - scrollY < bottom) {
                    bottom = bottom2 - scrollY;
                }
            }
            if (bottom == 0) {
                return false;
            }
            if (i != 130) {
                bottom = -bottom;
            }
            m4017e(bottom);
        } else {
            viewFindNextFocus.getDrawingRect(this.f4960b);
            offsetDescendantRectToMyCoords(viewFindNextFocus, this.f4960b);
            m4017e(m4001a(this.f4960b));
            viewFindNextFocus.requestFocus(i);
        }
        if (viewFindFocus != null && viewFindFocus.isFocused()) {
            if (m4009a(viewFindFocus, 0, getHeight()) ? false : true) {
                int descendantFocusability = getDescendantFocusability();
                setDescendantFocusability(131072);
                requestFocus();
                setDescendantFocusability(descendantFocusability);
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    private boolean m4016d(int i) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i);
        int right = (int) (0.5f * (getRight() - getLeft()));
        if (viewFindNextFocus == null || !m4008a(viewFindNextFocus, right)) {
            if (i == 17 && getScrollX() < right) {
                right = getScrollX();
            } else if (i == 66 && getChildCount() > 0) {
                int right2 = getChildAt(0).getRight();
                int scrollX = getScrollX() + getWidth();
                if (right2 - scrollX < right) {
                    right = right2 - scrollX;
                }
            }
            if (right == 0) {
                return false;
            }
            if (i != 66) {
                right = -right;
            }
            m4018f(right);
        } else {
            viewFindNextFocus.getDrawingRect(this.f4960b);
            offsetDescendantRectToMyCoords(viewFindNextFocus, this.f4960b);
            m4018f(m4011b(this.f4960b));
            viewFindNextFocus.requestFocus(i);
        }
        if (viewFindFocus != null && viewFindFocus.isFocused()) {
            if (m4008a(viewFindFocus, 0) ? false : true) {
                int descendantFocusability = getDescendantFocusability();
                setDescendantFocusability(131072);
                requestFocus();
                setDescendantFocusability(descendantFocusability);
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: e */
    private void m4017e(int i) {
        if (i != 0) {
            scrollBy(0, i);
        }
    }

    /* JADX INFO: renamed from: f */
    private void m4018f(int i) {
        if (i != 0) {
            scrollBy(i, 0);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, layoutParams);
    }

    @Override // android.view.View
    protected final int computeHorizontalScrollOffset() {
        return Math.max(0, super.computeHorizontalScrollOffset());
    }

    @Override // android.view.View
    protected final int computeHorizontalScrollRange() {
        return getChildCount() == 0 ? (getWidth() - getPaddingLeft()) - getPaddingRight() : getChildAt(0).getRight();
    }

    @Override // android.view.View
    public final void computeScroll() {
        Scroller scroller = null;
        if (scroller.computeScrollOffset()) {
            int currX = scroller.getCurrX();
            int currY = scroller.getCurrY();
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                super.scrollTo(m4000a(currX, (getWidth() - getPaddingRight()) - getPaddingLeft(), childAt.getWidth()), m4000a(currY, (getHeight() - getPaddingBottom()) - getPaddingTop(), childAt.getHeight()));
            }
            awakenScrollBars();
            postInvalidate();
        }
    }

    @Override // android.view.View
    protected final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    protected final int computeVerticalScrollRange() {
        return getChildCount() == 0 ? (getHeight() - getPaddingBottom()) - getPaddingTop() : getChildAt(0).getBottom();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean zM4006a;
        if (!super.dispatchKeyEvent(keyEvent)) {
            this.f4960b.setEmpty();
            if (keyEvent.getAction() == 0) {
                switch (keyEvent.getKeyCode()) {
                    case 19:
                        if (!m4005a()) {
                            zM4006a = false;
                        } else if (!keyEvent.isAltPressed()) {
                            zM4006a = m4015c(33);
                        } else {
                            zM4006a = m4006a(33);
                        }
                        break;
                    case 20:
                        if (!m4005a()) {
                            zM4006a = false;
                        } else if (!keyEvent.isAltPressed()) {
                            zM4006a = m4015c(130);
                        } else {
                            zM4006a = m4006a(130);
                        }
                        break;
                    case 21:
                        if (!m4013b()) {
                            zM4006a = false;
                        } else if (!keyEvent.isAltPressed()) {
                            zM4006a = m4016d(17);
                        } else {
                            zM4006a = m4014b(17);
                        }
                        break;
                    case 22:
                        if (!m4013b()) {
                            zM4006a = false;
                        } else if (!keyEvent.isAltPressed()) {
                            zM4006a = m4016d(66);
                        } else {
                            zM4006a = m4014b(66);
                        }
                        break;
                    default:
                        zM4006a = false;
                        break;
                }
            } else {
                zM4006a = false;
            }
            if (!zM4006a) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.View
    protected final float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = (getChildAt(0).getBottom() - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    @Override // android.view.View
    protected final float getLeftFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int horizontalFadingEdgeLength = getHorizontalFadingEdgeLength();
        if (getScrollX() < horizontalFadingEdgeLength) {
            return getScrollX() / horizontalFadingEdgeLength;
        }
        return 1.0f;
    }

    @Override // android.view.View
    protected final float getRightFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int horizontalFadingEdgeLength = getHorizontalFadingEdgeLength();
        int right = (getChildAt(0).getRight() - getScrollX()) - (getWidth() - getPaddingRight());
        if (right < horizontalFadingEdgeLength) {
            return right / horizontalFadingEdgeLength;
        }
        return 1.0f;
    }

    @Override // android.view.View
    protected final float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (getScrollY() < verticalFadingEdgeLength) {
            return getScrollY() / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    @Override // android.view.ViewGroup
    protected final void measureChild(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    protected final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(View.MeasureSpec.makeMeasureSpec(marginLayoutParams.leftMargin + marginLayoutParams.rightMargin, 0), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.bottomMargin + marginLayoutParams.topMargin, 0));
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        if (getChildCount() > 0) {
            this.f4970l = getChildAt(0);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 2 && this.f4966h) {
            return true;
        }
        switch (action & 255) {
            case 0:
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (!m4007a((int) x, (int) y)) {
                    this.f4966h = false;
                } else {
                    this.f4962d = y;
                    this.f4963e = x;
                    this.f4968j = motionEvent.getPointerId(0);
                    Scroller scroller = null;
                    this.f4966h = scroller.isFinished() ? false : true;
                }
                break;
            case 1:
            case 3:
                this.f4966h = false;
                this.f4968j = -1;
                break;
            case 2:
                int i = this.f4968j;
                if (i != -1) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(i);
                    float y2 = motionEvent.getY(iFindPointerIndex);
                    if (((int) Math.abs(y2 - this.f4962d)) > 0) {
                        this.f4966h = true;
                        this.f4962d = y2;
                    }
                    float x2 = motionEvent.getX(iFindPointerIndex);
                    if (((int) Math.abs(x2 - this.f4963e)) > 0) {
                        this.f4966h = true;
                        this.f4963e = x2;
                    }
                }
                break;
            case 6:
                m4003a(motionEvent);
                break;
        }
        return this.f4966h;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f4964f = false;
        if (this.f4965g != null && m4010a(this.f4965g, this)) {
            m4004a(this.f4965g);
        }
        this.f4965g = null;
        scrollTo(getScrollX(), getScrollY());
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override // android.view.ViewGroup
    protected final boolean onRequestFocusInDescendants(int i, Rect rect) {
        View viewFindNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        if (viewFindNextFocus == null) {
            return false;
        }
        return viewFindNextFocus.requestFocus(i, rect);
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus) {
            return;
        }
        if (m4009a(viewFindFocus, 0, i4)) {
            viewFindFocus.getDrawingRect(this.f4960b);
            offsetDescendantRectToMyCoords(viewFindFocus, this.f4960b);
            m4017e(m4001a(this.f4960b));
        }
        if (m4008a(viewFindFocus, getRight() - getLeft())) {
            viewFindFocus.getDrawingRect(this.f4960b);
            offsetDescendantRectToMyCoords(viewFindFocus, this.f4960b);
            m4018f(m4011b(this.f4960b));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Rect rect = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) {
            return false;
        }
        if (this.f4967i == null) {
            this.f4967i = VelocityTracker.obtain();
        }
        this.f4967i.addMovement(motionEvent);
        switch (motionEvent.getAction() & 255) {
            case 0:
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                boolean zM4007a = m4007a((int) x, (int) y);
                this.f4966h = zM4007a;
                if (!zM4007a) {
                    return false;
                }
                if (System.currentTimeMillis() - this.f4969k < 200) {
                    motionEvent.setAction(3);
                }
                this.f4969k = System.currentTimeMillis();
                if (!(objArr2 == true ? 1 : 0).isFinished()) {
                    (objArr == true ? 1 : 0).abortAnimation();
                }
                this.f4962d = y;
                this.f4963e = x;
                this.f4968j = motionEvent.getPointerId(0);
                return true;
            case 1:
                if (this.f4966h) {
                    if (!rect.isEmpty()) {
                        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, -this.f4970l.getLeft(), 0.0f, -this.f4970l.getTop());
                        translateAnimation.setDuration(200L);
                        this.f4970l.startAnimation(translateAnimation);
                        new Handler().postDelayed(new RunnableC1631b(this), 200L);
                    }
                    this.f4968j = -1;
                    this.f4966h = false;
                    if (this.f4967i != null) {
                        this.f4967i.recycle();
                        this.f4967i = null;
                    }
                }
                return true;
            case 2:
                if (this.f4966h) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f4968j);
                    float y2 = motionEvent.getY(iFindPointerIndex);
                    int i = (int) (this.f4962d - y2);
                    this.f4962d = y2;
                    float x2 = motionEvent.getX(iFindPointerIndex);
                    int i2 = (int) (this.f4963e - x2);
                    this.f4963e = x2;
                    scrollBy(i2, i);
                    int measuredWidth = this.f4970l.getMeasuredWidth() - getWidth();
                    int scrollX = getScrollX();
                    if (scrollX != 0 && scrollX != measuredWidth) {
                        int measuredHeight = this.f4970l.getMeasuredHeight() - getHeight();
                        int scrollY = getScrollY();
                        if (scrollY == 0 || scrollY == measuredHeight) {
                        }
                    }
                }
                return true;
            case 3:
                if (this.f4966h && getChildCount() > 0) {
                    this.f4968j = -1;
                    this.f4966h = false;
                    if (this.f4967i != null) {
                        this.f4967i.recycle();
                        this.f4967i = null;
                    }
                }
                return true;
            case 4:
            case 5:
            default:
                return true;
            case 6:
                m4003a(motionEvent);
                return true;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (!this.f4961c) {
            if (this.f4964f) {
                this.f4965g = view2;
            } else {
                m4004a(view2);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        Scroller scroller = null;
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int iM4001a = m4001a(rect);
        int iM4011b = m4011b(rect);
        boolean z2 = (iM4011b == 0 && iM4001a == 0) ? false : true;
        if (z2) {
            if (z) {
                scrollBy(iM4011b, iM4001a);
            } else if (getChildCount() != 0) {
                if (AnimationUtils.currentAnimationTimeMillis() - this.f4959a > 250) {
                    int iMax = Math.max(0, getChildAt(0).getHeight() - ((getHeight() - getPaddingBottom()) - getPaddingTop()));
                    int scrollY = getScrollY();
                    int iMax2 = Math.max(0, Math.min(iM4001a + scrollY, iMax)) - scrollY;
                    int iMax3 = Math.max(0, getChildAt(0).getWidth() - ((getWidth() - getPaddingRight()) - getPaddingLeft()));
                    int scrollX = getScrollX();
                    scroller.startScroll(scrollX, scrollY, Math.max(0, Math.min(iM4011b + scrollX, iMax3)) - scrollX, iMax2);
                    invalidate();
                } else {
                    if (!scroller.isFinished()) {
                        scroller.abortAnimation();
                    }
                    scrollBy(iM4011b, iM4001a);
                }
                this.f4959a = AnimationUtils.currentAnimationTimeMillis();
            }
        }
        return z2;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f4964f = true;
        super.requestLayout();
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            int iM4000a = m4000a(i, (getWidth() - getPaddingRight()) - getPaddingLeft(), childAt.getWidth());
            int iM4000a2 = m4000a(i2, (getHeight() - getPaddingBottom()) - getPaddingTop(), childAt.getHeight());
            if (iM4000a == getScrollX() && iM4000a2 == getScrollY()) {
                return;
            }
            super.scrollTo(iM4000a, iM4000a2);
        }
    }
}
