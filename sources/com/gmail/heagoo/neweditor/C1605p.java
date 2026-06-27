package com.gmail.heagoo.neweditor;

import android.graphics.Rect;
import java.util.TimerTask;

/* JADX INFO: renamed from: com.gmail.heagoo.neweditor.p */
/* JADX INFO: loaded from: classes.dex */
final class C1605p extends TimerTask {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ EditorActivity f4844a;

    C1605p(EditorActivity editorActivity) {
        this.f4844a = editorActivity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m3913a(C1594e c1594e, Rect rect) {
        int i;
        int i2;
        try {
            int lineHeight = rect.top / this.f4844a.f4716a.getLineHeight();
            int height = (rect.top + this.f4844a.getWindowManager().getDefaultDisplay().getHeight()) / this.f4844a.f4716a.getLineHeight();
            if (this.f4844a.f4723l) {
                String[] strArrSplit = this.f4844a.f4716a.getText().toString().split("\\n");
                int length = 0;
                int i3 = 0;
                int i4 = 0;
                for (int i5 = 0; i5 < strArrSplit.length; i5++) {
                    int iM3863b = this.f4844a.f4716a.m3863b(length);
                    length += strArrSplit[i5].length() + 1;
                    if (iM3863b <= lineHeight) {
                        i4 = i5;
                    }
                    if (iM3863b <= height) {
                        i3 = i5;
                    }
                }
                i2 = i3;
                i = i4;
            } else {
                i = lineHeight;
                i2 = height;
            }
            int i6 = i - this.f4844a.f4725n;
            int i7 = i2 + this.f4844a.f4725n;
            ObEditText obEditText = this.f4844a.f4716a;
            int i8 = this.f4844a.f4722k;
            int i9 = this.f4844a.f4721j;
            boolean z = this.f4844a.f4720i;
            this.f4844a.getApplicationContext();
            c1594e.m3908a(obEditText, i8, i9, i6, i7, z);
        } catch (Exception e) {
        }
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        C1594e c1594e = this.f4844a.f4708P;
        Rect rect = new Rect();
        if (this.f4844a.f4716a.getLocalVisibleRect(rect)) {
            m3913a(c1594e, rect);
        } else {
            ObEditText obEditText = this.f4844a.f4716a;
            int i = this.f4844a.f4722k;
            int i2 = this.f4844a.f4721j;
            boolean z = this.f4844a.f4720i;
            this.f4844a.getApplicationContext();
            c1594e.m3908a(obEditText, i, i2, -1, -1, z);
            this.f4844a.f4716a.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC1606q(this, rect, c1594e));
        }
        EditorActivity.m3827a(this.f4844a, -1);
        EditorActivity.m3833b(this.f4844a, -1);
        EditorActivity.m3832a(this.f4844a, false);
    }
}
