package com.gmail.heagoo.apkeditor.p099ui;

import android.content.Context;
import android.support.v7.widget.AppCompatEditText;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.inputmethod.InputMethodManager;
import com.gmail.heagoo.InterfaceC1050a;
import com.gmail.heagoo.apkeditor.pro.R;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class EditTextRememberCursor extends AppCompatEditText {

    /* JADX INFO: renamed from: a */
    private int f4291a;

    /* JADX INFO: renamed from: b */
    private int f4292b;

    /* JADX INFO: renamed from: c */
    private WeakReference f4293c;

    /* JADX INFO: renamed from: d */
    private WeakReference f4294d;

    /* JADX INFO: renamed from: e */
    private WeakReference f4295e;

    public EditTextRememberCursor(Context context) {
        super(context);
    }

    public EditTextRememberCursor(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public EditTextRememberCursor(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* JADX INFO: renamed from: a */
    public final void m3561a() {
        setOnTouchListener(new ViewOnTouchListenerC1458c(this));
    }

    /* JADX INFO: renamed from: a */
    public final void m3562a(Context context, WeakReference weakReference) {
        this.f4293c = new WeakReference(context);
        this.f4294d = weakReference;
    }

    /* JADX INFO: renamed from: a */
    public final void m3563a(WeakReference weakReference) {
        this.f4295e = weakReference;
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        LayoutObListView layoutObListView;
        if (i != 4 || (layoutObListView = (LayoutObListView) this.f4294d.get()) == null || !layoutObListView.m3567b()) {
            return false;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).hideSoftInputFromWindow(getWindowToken(), 0);
        return true;
    }

    @Override // android.widget.TextView
    protected void onSelectionChanged(int i, int i2) {
        InterfaceC1050a interfaceC1050a;
        if (i != i2 || this.f4294d == null || this.f4294d.get() == null || !((LayoutObListView) this.f4294d.get()).m3566a()) {
            this.f4291a = i;
            this.f4292b = i2;
            Integer num = (Integer) getTag(R.id.text);
            if (num != null) {
                if (this.f4295e != null && (interfaceC1050a = (InterfaceC1050a) this.f4295e.get()) != null) {
                    String strSubstring = "";
                    if (i < i2) {
                        try {
                            strSubstring = getText().toString().substring(i, i2);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    num.intValue();
                    interfaceC1050a.mo2378a(i, i2, strSubstring);
                }
                LayoutObListView layoutObListView = (LayoutObListView) this.f4294d.get();
                if (layoutObListView != null) {
                    layoutObListView.m3564a(num.intValue(), i, i2);
                }
            }
        }
    }
}
