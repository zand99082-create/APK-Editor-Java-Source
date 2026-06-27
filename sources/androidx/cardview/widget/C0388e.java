package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;

/* JADX INFO: renamed from: androidx.cardview.widget.e */
/* JADX INFO: loaded from: classes.dex */
class C0388e implements InterfaceC0391h {
    final RectF mCornerRect = new RectF();

    C0388e() {
    }

    private C0393j createBackground(Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        return new C0393j(context.getResources(), colorStateList, f, f2, f3);
    }

    private C0393j getShadowBackground(InterfaceC0390g interfaceC0390g) {
        return (C0393j) interfaceC0390g.getCardBackground();
    }

    @Override // androidx.cardview.widget.InterfaceC0391h
    public ColorStateList getBackgroundColor(InterfaceC0390g interfaceC0390g) {
        return getShadowBackground(interfaceC0390g).getColor();
    }

    @Override // androidx.cardview.widget.InterfaceC0391h
    public float getElevation(InterfaceC0390g interfaceC0390g) {
        return getShadowBackground(interfaceC0390g).getShadowSize();
    }

    @Override // androidx.cardview.widget.InterfaceC0391h
    public float getMaxElevation(InterfaceC0390g interfaceC0390g) {
        return getShadowBackground(interfaceC0390g).getMaxShadowSize();
    }

    @Override // androidx.cardview.widget.InterfaceC0391h
    public float getMinHeight(InterfaceC0390g interfaceC0390g) {
        return getShadowBackground(interfaceC0390g).getMinHeight();
    }

    @Override // androidx.cardview.widget.InterfaceC0391h
    public float getMinWidth(InterfaceC0390g interfaceC0390g) {
        return getShadowBackground(interfaceC0390g).getMinWidth();
    }

    @Override // androidx.cardview.widget.InterfaceC0391h
    public float getRadius(InterfaceC0390g interfaceC0390g) {
        return getShadowBackground(interfaceC0390g).getCornerRadius();
    }

    @Override // androidx.cardview.widget.InterfaceC0391h
    public void initStatic() {
        C0393j.sRoundRectHelper = new C0389f(this);
    }

    @Override // androidx.cardview.widget.InterfaceC0391h
    public void initialize(InterfaceC0390g interfaceC0390g, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        C0393j c0393jCreateBackground = createBackground(context, colorStateList, f, f2, f3);
        c0393jCreateBackground.setAddPaddingForCorners(interfaceC0390g.getPreventCornerOverlap());
        interfaceC0390g.setCardBackground(c0393jCreateBackground);
        updatePadding(interfaceC0390g);
    }

    @Override // androidx.cardview.widget.InterfaceC0391h
    public void onCompatPaddingChanged(InterfaceC0390g interfaceC0390g) {
    }

    @Override // androidx.cardview.widget.InterfaceC0391h
    public void onPreventCornerOverlapChanged(InterfaceC0390g interfaceC0390g) {
        getShadowBackground(interfaceC0390g).setAddPaddingForCorners(interfaceC0390g.getPreventCornerOverlap());
        updatePadding(interfaceC0390g);
    }

    @Override // androidx.cardview.widget.InterfaceC0391h
    public void setBackgroundColor(InterfaceC0390g interfaceC0390g, ColorStateList colorStateList) {
        getShadowBackground(interfaceC0390g).setColor(colorStateList);
    }

    @Override // androidx.cardview.widget.InterfaceC0391h
    public void setElevation(InterfaceC0390g interfaceC0390g, float f) {
        getShadowBackground(interfaceC0390g).setShadowSize(f);
    }

    @Override // androidx.cardview.widget.InterfaceC0391h
    public void setMaxElevation(InterfaceC0390g interfaceC0390g, float f) {
        getShadowBackground(interfaceC0390g).setMaxShadowSize(f);
        updatePadding(interfaceC0390g);
    }

    @Override // androidx.cardview.widget.InterfaceC0391h
    public void setRadius(InterfaceC0390g interfaceC0390g, float f) {
        getShadowBackground(interfaceC0390g).setCornerRadius(f);
        updatePadding(interfaceC0390g);
    }

    @Override // androidx.cardview.widget.InterfaceC0391h
    public void updatePadding(InterfaceC0390g interfaceC0390g) {
        Rect rect = new Rect();
        getShadowBackground(interfaceC0390g).getMaxShadowAndCornerPadding(rect);
        interfaceC0390g.setMinWidthHeightInternal((int) Math.ceil(getMinWidth(interfaceC0390g)), (int) Math.ceil(getMinHeight(interfaceC0390g)));
        interfaceC0390g.setShadowPadding(rect.left, rect.top, rect.right, rect.bottom);
    }
}
