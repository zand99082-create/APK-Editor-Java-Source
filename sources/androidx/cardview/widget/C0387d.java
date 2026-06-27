package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

/* JADX INFO: renamed from: androidx.cardview.widget.d */
/* JADX INFO: loaded from: classes.dex */
class C0387d implements InterfaceC0391h {
    C0387d() {
    }

    private C0392i getCardBackground(InterfaceC0390g interfaceC0390g) {
        return (C0392i) interfaceC0390g.getCardBackground();
    }

    @Override // androidx.cardview.widget.InterfaceC0391h
    public ColorStateList getBackgroundColor(InterfaceC0390g interfaceC0390g) {
        return getCardBackground(interfaceC0390g).getColor();
    }

    @Override // androidx.cardview.widget.InterfaceC0391h
    public float getElevation(InterfaceC0390g interfaceC0390g) {
        return interfaceC0390g.getCardView().getElevation();
    }

    @Override // androidx.cardview.widget.InterfaceC0391h
    public float getMaxElevation(InterfaceC0390g interfaceC0390g) {
        return getCardBackground(interfaceC0390g).getPadding();
    }

    @Override // androidx.cardview.widget.InterfaceC0391h
    public float getMinHeight(InterfaceC0390g interfaceC0390g) {
        return getRadius(interfaceC0390g) * 2.0f;
    }

    @Override // androidx.cardview.widget.InterfaceC0391h
    public float getMinWidth(InterfaceC0390g interfaceC0390g) {
        return getRadius(interfaceC0390g) * 2.0f;
    }

    @Override // androidx.cardview.widget.InterfaceC0391h
    public float getRadius(InterfaceC0390g interfaceC0390g) {
        return getCardBackground(interfaceC0390g).getRadius();
    }

    @Override // androidx.cardview.widget.InterfaceC0391h
    public void initStatic() {
    }

    @Override // androidx.cardview.widget.InterfaceC0391h
    public void initialize(InterfaceC0390g interfaceC0390g, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        interfaceC0390g.setCardBackground(new C0392i(colorStateList, f));
        View cardView = interfaceC0390g.getCardView();
        cardView.setClipToOutline(true);
        cardView.setElevation(f2);
        setMaxElevation(interfaceC0390g, f3);
    }

    @Override // androidx.cardview.widget.InterfaceC0391h
    public void onCompatPaddingChanged(InterfaceC0390g interfaceC0390g) {
        setMaxElevation(interfaceC0390g, getMaxElevation(interfaceC0390g));
    }

    @Override // androidx.cardview.widget.InterfaceC0391h
    public void onPreventCornerOverlapChanged(InterfaceC0390g interfaceC0390g) {
        setMaxElevation(interfaceC0390g, getMaxElevation(interfaceC0390g));
    }

    @Override // androidx.cardview.widget.InterfaceC0391h
    public void setBackgroundColor(InterfaceC0390g interfaceC0390g, ColorStateList colorStateList) {
        getCardBackground(interfaceC0390g).setColor(colorStateList);
    }

    @Override // androidx.cardview.widget.InterfaceC0391h
    public void setElevation(InterfaceC0390g interfaceC0390g, float f) {
        interfaceC0390g.getCardView().setElevation(f);
    }

    @Override // androidx.cardview.widget.InterfaceC0391h
    public void setMaxElevation(InterfaceC0390g interfaceC0390g, float f) {
        getCardBackground(interfaceC0390g).setPadding(f, interfaceC0390g.getUseCompatPadding(), interfaceC0390g.getPreventCornerOverlap());
        updatePadding(interfaceC0390g);
    }

    @Override // androidx.cardview.widget.InterfaceC0391h
    public void setRadius(InterfaceC0390g interfaceC0390g, float f) {
        getCardBackground(interfaceC0390g).setRadius(f);
    }

    @Override // androidx.cardview.widget.InterfaceC0391h
    public void updatePadding(InterfaceC0390g interfaceC0390g) {
        if (!interfaceC0390g.getUseCompatPadding()) {
            interfaceC0390g.setShadowPadding(0, 0, 0, 0);
            return;
        }
        float maxElevation = getMaxElevation(interfaceC0390g);
        float radius = getRadius(interfaceC0390g);
        int iCeil = (int) Math.ceil(C0393j.calculateHorizontalPadding(maxElevation, radius, interfaceC0390g.getPreventCornerOverlap()));
        int iCeil2 = (int) Math.ceil(C0393j.calculateVerticalPadding(maxElevation, radius, interfaceC0390g.getPreventCornerOverlap()));
        interfaceC0390g.setShadowPadding(iCeil, iCeil2, iCeil, iCeil2);
    }
}
