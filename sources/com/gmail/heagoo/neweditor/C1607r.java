package com.gmail.heagoo.neweditor;

import java.util.TimerTask;

/* JADX INFO: renamed from: com.gmail.heagoo.neweditor.r */
/* JADX INFO: loaded from: classes.dex */
final class C1607r extends TimerTask {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ EditorActivity f4848a;

    C1607r(EditorActivity editorActivity) {
        this.f4848a = editorActivity;
    }

    /* JADX INFO: renamed from: a */
    protected static int m3915a(int i) {
        int i2 = 1;
        while (i >= 10) {
            i /= 10;
            i2++;
        }
        return Math.max(2, i2);
    }

    /* JADX INFO: renamed from: a */
    private void m3916a() {
        int lineCount = this.f4848a.f4716a.getLineCount();
        if (lineCount == 0) {
            lineCount = 1;
        }
        this.f4848a.m3830a(this.f4848a.f4709Q, m3915a(lineCount));
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= lineCount; i++) {
            sb.append(i);
            sb.append('\n');
        }
        this.f4848a.f4732u.setText(sb.toString());
        this.f4848a.f4732u.requestLayout();
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        int i;
        int i2 = 0;
        try {
            if (this.f4848a.f4723l) {
                String[] strArrSplit = (String.valueOf(this.f4848a.f4716a.getText().toString()) + "\nEND").split("\n");
                this.f4848a.m3830a(this.f4848a.f4709Q, m3915a(strArrSplit.length));
                StringBuilder sb = new StringBuilder();
                int i3 = 0;
                int length = 0;
                while (i3 < strArrSplit.length - 1) {
                    while (true) {
                        i = i2 + 1;
                        if (i2 < this.f4848a.f4716a.m3863b(length)) {
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
                this.f4848a.f4732u.setText(sb.toString());
            } else {
                m3916a();
            }
        } catch (Exception e) {
        }
        this.f4848a.f4717b = this.f4848a.f4716a.getLineCount();
    }
}
