package com.gmail.heagoo.apkeditor;

import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.ig */
/* JADX INFO: loaded from: classes.dex */
final class ViewOnTouchListenerC1377ig implements View.OnTouchListener {

    /* JADX INFO: renamed from: a */
    private boolean f4008a = false;

    /* JADX INFO: renamed from: b */
    private float f4009b;

    /* JADX INFO: renamed from: c */
    private float f4010c;

    /* JADX INFO: renamed from: d */
    private long f4011d;

    /* JADX INFO: renamed from: e */
    private /* synthetic */ TextEditNormalActivity f4012e;

    ViewOnTouchListenerC1377ig(TextEditNormalActivity textEditNormalActivity) {
        this.f4012e = textEditNormalActivity;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f4008a = false;
            int selectionStart = this.f4012e.f3129l.getSelectionStart();
            int selectionEnd = this.f4012e.f3129l.getSelectionEnd();
            if (selectionStart != selectionEnd) {
                Layout layout = ((EditText) view).getLayout();
                int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical((int) (motionEvent.getY() + this.f4012e.f3129l.getScrollY())), motionEvent.getX() + this.f4012e.f3129l.getScrollX());
                if (offsetForHorizontal >= selectionStart && offsetForHorizontal < selectionEnd && !this.f4012e.m3404c()) {
                    this.f4008a = true;
                    this.f4009b = motionEvent.getX();
                    this.f4010c = motionEvent.getY();
                    this.f4011d = System.currentTimeMillis();
                    return true;
                }
            }
        } else if (motionEvent.getAction() != 2 && motionEvent.getAction() == 1) {
            if (this.f4008a) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (Math.abs(x - this.f4009b) < 32.0f && Math.abs(y - this.f4010c) < 32.0f && jCurrentTimeMillis - this.f4011d < 500) {
                    TextEditNormalActivity.m2889r(this.f4012e);
                    return true;
                }
            }
            this.f4008a = false;
        }
        return false;
    }
}
