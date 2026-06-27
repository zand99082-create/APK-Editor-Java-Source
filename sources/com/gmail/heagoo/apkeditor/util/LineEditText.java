package com.gmail.heagoo.apkeditor.util;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.EditText;

/* JADX INFO: loaded from: classes.dex */
public class LineEditText extends EditText {

    /* JADX INFO: renamed from: a */
    private Rect f4326a;

    /* JADX INFO: renamed from: b */
    private Paint f4327b;

    /* JADX INFO: renamed from: c */
    private float f4328c;

    /* JADX INFO: renamed from: d */
    private int f4329d;

    /* JADX INFO: renamed from: e */
    private int f4330e;

    /* JADX INFO: renamed from: f */
    private int f4331f;

    /* JADX INFO: renamed from: g */
    private int f4332g;

    public LineEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4328c = context.getResources().getDisplayMetrics().density;
        this.f4329d = getPaddingLeft();
        this.f4330e = getPaddingRight();
        this.f4331f = getPaddingBottom();
        this.f4332g = getPaddingTop();
        this.f4326a = new Rect();
        this.f4327b = new Paint();
        this.f4327b.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f4327b.setColor(-8882056);
        this.f4327b.setTextSize((int) ((14.0f * this.f4328c) + 0.5f));
        this.f4329d = (int) this.f4327b.measureText("4455");
        setPadding((int) (this.f4329d + (2.0f * this.f4328c)), this.f4332g, this.f4330e, this.f4331f);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        int i;
        int lineBounds;
        int lineHeight = getLineHeight();
        int lineCount = getLineCount();
        Rect rect = this.f4326a;
        Paint paint = this.f4327b;
        String string = getText().toString();
        int length = string.length();
        Layout layout = getLayout();
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        int i5 = -1;
        while (i3 < lineCount) {
            int lineEnd = layout.getLineEnd(i3);
            if (i2 != i5) {
                String str = i2 < 1000 ? String.format("%03d", Integer.valueOf(i2)) : String.format("%4d", Integer.valueOf(i2));
                lineBounds = getLineBounds(i3, rect);
                canvas.drawText(str, rect.left - getPaddingLeft(), lineBounds + 1, paint);
                i = i2;
            } else {
                i = i5;
                lineBounds = i4;
            }
            i3++;
            i2 = (length < lineEnd || string.charAt(lineEnd + (-1)) != '\n') ? i2 : i2 + 1;
            i4 = lineBounds;
            i5 = i;
        }
        canvas.drawLine(this.f4329d, this.f4332g + (lineHeight / 3), this.f4329d, i4 + 1, paint);
        super.onDraw(canvas);
    }
}
