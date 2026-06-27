package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;

/* JADX INFO: renamed from: androidx.cardview.widget.h */
/* JADX INFO: loaded from: classes.dex */
interface InterfaceC0391h {
    ColorStateList getBackgroundColor(InterfaceC0390g interfaceC0390g);

    float getElevation(InterfaceC0390g interfaceC0390g);

    float getMaxElevation(InterfaceC0390g interfaceC0390g);

    float getMinHeight(InterfaceC0390g interfaceC0390g);

    float getMinWidth(InterfaceC0390g interfaceC0390g);

    float getRadius(InterfaceC0390g interfaceC0390g);

    void initStatic();

    void initialize(InterfaceC0390g interfaceC0390g, Context context, ColorStateList colorStateList, float f, float f2, float f3);

    void onCompatPaddingChanged(InterfaceC0390g interfaceC0390g);

    void onPreventCornerOverlapChanged(InterfaceC0390g interfaceC0390g);

    void setBackgroundColor(InterfaceC0390g interfaceC0390g, ColorStateList colorStateList);

    void setElevation(InterfaceC0390g interfaceC0390g, float f);

    void setMaxElevation(InterfaceC0390g interfaceC0390g, float f);

    void setRadius(InterfaceC0390g interfaceC0390g, float f);

    void updatePadding(InterfaceC0390g interfaceC0390g);
}
