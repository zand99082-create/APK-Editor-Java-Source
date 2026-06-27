package com.gmail.heagoo.neweditor;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;

/* JADX INFO: loaded from: classes.dex */
public class ObScrollView extends ScrollView {

    /* JADX INFO: renamed from: a */
    private InterfaceC1614y f4746a;

    public ObScrollView(Context context) {
        super(context);
        this.f4746a = null;
    }

    public ObScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4746a = null;
    }

    public ObScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4746a = null;
    }

    /* JADX INFO: renamed from: a */
    public final void m3866a(InterfaceC1614y interfaceC1614y) {
        this.f4746a = interfaceC1614y;
    }

    @Override // android.view.View
    protected void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (this.f4746a != null) {
            this.f4746a.mo3442a();
        }
    }
}
