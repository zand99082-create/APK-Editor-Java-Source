package com.gmail.heagoo.apkeditor;

import android.graphics.Rect;
import com.gmail.heagoo.neweditor.C1594e;
import com.gmail.heagoo.neweditor.ObEditText;
import java.util.TimerTask;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.im */
/* JADX INFO: loaded from: classes.dex */
final class C1383im extends TimerTask {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ TextEditNormalActivity f4022a;

    C1383im(TextEditNormalActivity textEditNormalActivity) {
        this.f4022a = textEditNormalActivity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m3444a(C1594e c1594e, Rect rect) {
        int i;
        int i2 = 0;
        if (this.f4022a.f3126ah) {
            try {
                int lineHeight = this.f4022a.f3129l.getLineHeight();
                int i3 = rect.top / lineHeight;
                int i4 = rect.bottom / lineHeight;
                if (this.f4022a.f3915f) {
                    String[] strArrSplit = this.f4022a.f3129l.getText().toString().split("\\n");
                    int length = 0;
                    int i5 = 0;
                    int i6 = 0;
                    while (i6 < strArrSplit.length) {
                        int iM3863b = this.f4022a.f3129l.m3863b(length);
                        length += strArrSplit[i6].length() + 1;
                        if (iM3863b <= i3) {
                            i2 = i6;
                        }
                        if (iM3863b > i4) {
                            break;
                        }
                        int i7 = i6;
                        i6++;
                        i5 = i7;
                    }
                    i = i5;
                } else {
                    i2 = i3;
                    i = i4;
                }
                int i8 = i2 - this.f4022a.f3136w;
                int i9 = i + this.f4022a.f3136w;
                long jCurrentTimeMillis = System.currentTimeMillis();
                ObEditText obEditText = this.f4022a.f3129l;
                int i10 = this.f4022a.f3134u;
                int i11 = this.f4022a.f3133t;
                boolean z = this.f4022a.f3132s;
                this.f4022a.getApplicationContext();
                c1594e.m3908a(obEditText, i10, i11, i8, i9, z);
                if (System.currentTimeMillis() - jCurrentTimeMillis > 2000) {
                    TextEditNormalActivity.m2863b(this.f4022a, false);
                }
            } catch (Exception e) {
            }
        }
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        if (this.f4022a.f3126ah) {
            C1594e c1594e = this.f4022a.f3919j;
            Rect rect = new Rect();
            if (this.f4022a.f3129l.getLocalVisibleRect(rect)) {
                m3444a(c1594e, rect);
            } else if (this.f4022a.f3126ah) {
                ObEditText obEditText = this.f4022a.f3129l;
                int i = this.f4022a.f3134u;
                int i2 = this.f4022a.f3133t;
                boolean z = this.f4022a.f3132s;
                this.f4022a.getApplicationContext();
                c1594e.m3908a(obEditText, i, i2, -1, -1, z);
                this.f4022a.f3129l.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC1384in(this, rect, c1594e));
            }
            TextEditNormalActivity.m2854a(this.f4022a, -1);
            TextEditNormalActivity.m2861b(this.f4022a, -1);
            TextEditNormalActivity.m2860a(this.f4022a, false);
        }
    }
}
