package com.gmail.heagoo.neweditor;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.preference.PreferenceManager;
import android.support.v4.view.InputDeviceCompat;
import android.text.DynamicLayout;
import android.text.style.BackgroundColorSpan;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class ObEditText extends EditText implements InterfaceC1608s {

    /* JADX INFO: renamed from: a */
    private boolean f4738a;

    /* JADX INFO: renamed from: b */
    private int f4739b;

    /* JADX INFO: renamed from: c */
    private boolean f4740c;

    /* JADX INFO: renamed from: d */
    private int f4741d;

    /* JADX INFO: renamed from: e */
    private boolean f4742e;

    /* JADX INFO: renamed from: f */
    private boolean f4743f;

    /* JADX INFO: renamed from: g */
    private WeakReference f4744g;

    /* JADX INFO: renamed from: h */
    private boolean f4745h;

    public ObEditText(Context context) {
        super(context);
        new BackgroundColorSpan(InputDeviceCompat.SOURCE_ANY);
        this.f4738a = true;
        new Rect();
        new BackgroundColorSpan(InputDeviceCompat.SOURCE_ANY);
        this.f4743f = false;
        this.f4744g = null;
    }

    public ObEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new BackgroundColorSpan(InputDeviceCompat.SOURCE_ANY);
        this.f4738a = true;
        new Rect();
        new BackgroundColorSpan(InputDeviceCompat.SOURCE_ANY);
        this.f4743f = false;
        this.f4744g = null;
    }

    public ObEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        new BackgroundColorSpan(InputDeviceCompat.SOURCE_ANY);
        this.f4738a = true;
        new Rect();
        new BackgroundColorSpan(InputDeviceCompat.SOURCE_ANY);
        this.f4743f = false;
        this.f4744g = null;
    }

    /* JADX INFO: renamed from: a */
    public final void m3860a(int i) {
        new BackgroundColorSpan(i);
        new BackgroundColorSpan(i);
    }

    /* JADX INFO: renamed from: a */
    public final void m3861a(int i, int i2) {
        boolean z = this.f4743f;
        this.f4743f = false;
        try {
            setSelection(i, i2);
        } catch (Exception e) {
        }
        this.f4743f = z;
    }

    /* JADX INFO: renamed from: a */
    public final void m3862a(InterfaceC1585ad interfaceC1585ad) {
        this.f4744g = new WeakReference(interfaceC1585ad);
    }

    @Override // com.gmail.heagoo.neweditor.InterfaceC1608s
    /* JADX INFO: renamed from: a */
    public final void mo3565a(boolean z) {
        this.f4745h = z;
    }

    /* JADX INFO: renamed from: b */
    public final int m3863b(int i) {
        if (getLayout() != null) {
            return ((DynamicLayout) getLayout()).getLineForOffset(i);
        }
        return 0;
    }

    @SuppressLint({"WrongCall"})
    /* JADX INFO: renamed from: b */
    public final void m3864b(int i, int i2) {
        onMeasure(i, i2);
    }

    /* JADX INFO: renamed from: b */
    public final void m3865b(boolean z) {
        this.f4742e = z;
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onCheckIsTextEditor() {
        return this.f4738a;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        if (!PreferenceManager.getDefaultSharedPreferences(getContext()).getBoolean("rawKeys", false)) {
            return super.onCreateInputConnection(editorInfo);
        }
        C1611v c1611v = new C1611v(this, this, false);
        editorInfo.actionLabel = null;
        editorInfo.inputType = 0;
        editorInfo.imeOptions = 1342177280;
        return c1611v;
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        if (i != 4 || !this.f4745h) {
            return false;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).hideSoftInputFromWindow(getWindowToken(), 0);
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.f4742e) {
            super.onMeasure(i, i2);
            return;
        }
        float fMeasureText = getPaint().measureText("X");
        int lineHeight = getLineHeight();
        String[] strArrSplit = getText().toString().split("\\n");
        int i3 = this.f4739b;
        this.f4739b = 0;
        this.f4741d = strArrSplit.length;
        for (String str : strArrSplit) {
            this.f4739b = Math.max(this.f4739b, str.length());
        }
        if (this.f4741d == 0) {
            this.f4741d = 1;
        }
        this.f4740c = i3 != this.f4739b;
        setMeasuredDimension(Math.max(((int) ((String.valueOf(this.f4741d).length() + this.f4739b) * fMeasureText)) + 10, View.MeasureSpec.getSize(i)), Math.max((this.f4741d * lineHeight) + 10, View.MeasureSpec.getSize(i2)));
        if (this.f4740c) {
            setPaintFlags(getPaintFlags() + 1);
            setPaintFlags(getPaintFlags() - 1);
        }
    }

    @Override // android.widget.TextView
    protected void onSelectionChanged(int i, int i2) {
        InterfaceC1585ad interfaceC1585ad;
        super.onSelectionChanged(i, i2);
        if (this.f4744g == null || (interfaceC1585ad = (InterfaceC1585ad) this.f4744g.get()) == null) {
            return;
        }
        interfaceC1585ad.mo2892b(i, i2);
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (getSelectionStart() == getSelectionEnd()) {
            getSelectionStart();
        }
    }

    @Override // android.widget.TextView
    public void setWidth(int i) {
        if (i != 0) {
            super.setWidth(i);
        }
    }
}
