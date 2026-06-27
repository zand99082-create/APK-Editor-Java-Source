package com.gmail.heagoo.apkeditor.p099ui;

import android.content.Context;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.ui.c */
/* JADX INFO: loaded from: classes.dex */
final class ViewOnTouchListenerC1458c implements View.OnTouchListener {

    /* JADX INFO: renamed from: a */
    private boolean f4311a = false;

    /* JADX INFO: renamed from: b */
    private float f4312b;

    /* JADX INFO: renamed from: c */
    private float f4313c;

    /* JADX INFO: renamed from: d */
    private long f4314d;

    /* JADX INFO: renamed from: e */
    private /* synthetic */ EditTextRememberCursor f4315e;

    ViewOnTouchListenerC1458c(EditTextRememberCursor editTextRememberCursor) {
        this.f4315e = editTextRememberCursor;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f4311a = false;
            int i = this.f4315e.f4291a;
            int i2 = this.f4315e.f4292b;
            if (i != i2) {
                Layout layout = ((EditText) view).getLayout();
                int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical((int) (motionEvent.getY() + this.f4315e.getScrollY())), motionEvent.getX() + this.f4315e.getScrollX());
                LayoutObListView layoutObListView = (LayoutObListView) this.f4315e.f4294d.get();
                boolean z = layoutObListView != null && layoutObListView.m3567b();
                if (offsetForHorizontal >= i && offsetForHorizontal < i2 && !z) {
                    this.f4311a = true;
                    this.f4312b = motionEvent.getX();
                    this.f4313c = motionEvent.getY();
                    this.f4314d = System.currentTimeMillis();
                    return true;
                }
            }
        } else if (motionEvent.getAction() != 2 && motionEvent.getAction() == 1) {
            if (this.f4311a) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (Math.abs(x - this.f4312b) < 32.0f && Math.abs(y - this.f4313c) < 32.0f && jCurrentTimeMillis - this.f4314d < 500) {
                    EditTextRememberCursor editTextRememberCursor = this.f4315e;
                    ((InputMethodManager) ((Context) editTextRememberCursor.f4293c.get()).getSystemService("input_method")).showSoftInput(editTextRememberCursor, 0);
                    return true;
                }
            }
            this.f4311a = false;
        }
        return false;
    }
}
