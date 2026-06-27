package com.gmail.heagoo.apkeditor;

import java.util.TimerTask;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.iq */
/* JADX INFO: loaded from: classes.dex */
final class C1387iq extends TimerTask {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ TextEditNormalActivity f4031a;

    C1387iq(TextEditNormalActivity textEditNormalActivity) {
        this.f4031a = textEditNormalActivity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static int m3446a(int i) {
        int i2 = 1;
        while (i >= 10) {
            i /= 10;
            i2++;
        }
        return Math.max(2, i2);
    }

    /* JADX INFO: renamed from: a */
    private void m3448a() {
        int lineCount = this.f4031a.f3129l.getLineCount();
        if (lineCount == 0) {
            lineCount = 1;
        }
        TextEditNormalActivity.m2857a(this.f4031a, this.f4031a.f3117Y, m3446a(lineCount));
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= lineCount; i++) {
            sb.append(i);
            sb.append('\n');
        }
        this.f4031a.f3094B.setText(sb.toString());
        this.f4031a.f3094B.requestLayout();
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        int i;
        int i2 = 0;
        if (!SettingEditorActivity.m2827e(this.f4031a)) {
            this.f4031a.f3130m = 0;
            return;
        }
        if (this.f4031a.f3915f) {
            String[] strArrSplit = this.f4031a.f3129l.getText().toString().split("\n");
            TextEditNormalActivity.m2857a(this.f4031a, this.f4031a.f3117Y, m3446a(strArrSplit.length + 1));
            StringBuilder sb = new StringBuilder();
            int i3 = 0;
            int length = 0;
            while (i3 < strArrSplit.length) {
                while (true) {
                    i = i2 + 1;
                    if (i2 < this.f4031a.f3129l.m3863b(length)) {
                        sb.append('\n');
                        i2 = i;
                    }
                }
                sb.append(i3 + 1);
                sb.append('\n');
                length += strArrSplit[i3].length() + 1;
                i3++;
                i2 = i;
            }
            this.f4031a.f3094B.setText(sb.toString());
        } else {
            m3448a();
        }
        this.f4031a.f3130m = this.f4031a.f3129l.getLineCount();
    }
}
