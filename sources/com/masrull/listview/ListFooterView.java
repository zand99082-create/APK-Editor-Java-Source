package com.masrull.listview;

import android.content.Context;
import android.view.View;
import com.twotoasters.App;

/* JADX INFO: loaded from: classes.dex */
public class ListFooterView extends View {
    public ListFooterView(Context context) {
        super(context);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(dpToPx(100.0f), 1073741824));
    }

    public static int dpToPx(float f) {
        return Math.round(App.getApp().getResources().getDisplayMetrics().density * f);
    }
}
