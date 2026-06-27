package com.p078b.p079a;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import com.gmail.heagoo.apkeditor.pro.R;

/* JADX INFO: renamed from: com.b.a.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1008a extends RelativeLayout implements TextWatcher {

    /* JADX INFO: renamed from: a */
    Handler f2615a;

    /* JADX INFO: renamed from: b */
    private View f2616b;

    /* JADX INFO: renamed from: c */
    private SeekBar f2617c;

    /* JADX INFO: renamed from: d */
    private SeekBar f2618d;

    /* JADX INFO: renamed from: e */
    private SeekBar f2619e;

    /* JADX INFO: renamed from: f */
    private SeekBar f2620f;

    /* JADX INFO: renamed from: g */
    private EditText f2621g;

    /* JADX INFO: renamed from: h */
    private InterfaceC1012e f2622h;

    /* JADX INFO: renamed from: i */
    private int f2623i;

    /* JADX INFO: renamed from: j */
    private int f2624j;

    /* JADX INFO: renamed from: k */
    private SeekBar.OnSeekBarChangeListener f2625k;

    public C1008a(Context context) {
        super(context);
        this.f2616b = null;
        this.f2617c = null;
        this.f2618d = null;
        this.f2619e = null;
        this.f2620f = null;
        this.f2621g = null;
        this.f2622h = null;
        this.f2615a = new HandlerC1010c(this);
        this.f2625k = new C1011d(this);
        if (isInEditMode()) {
            return;
        }
        (getContext() instanceof Activity ? ((Activity) getContext()).getLayoutInflater() : LayoutInflater.from(getContext())).inflate(R.layout.dlg_colormixer, (ViewGroup) this, true);
        this.f2616b = findViewById(R.id.swatch);
        this.f2621g = (EditText) findViewById(R.id.color);
        this.f2621g.addTextChangedListener(this);
        this.f2621g.setFilters(new InputFilter[]{new C1009b(this), new InputFilter.LengthFilter(8)});
        this.f2617c = (SeekBar) findViewById(R.id.red);
        this.f2617c.setMax(255);
        this.f2617c.setOnSeekBarChangeListener(this.f2625k);
        this.f2619e = (SeekBar) findViewById(R.id.green);
        this.f2619e.setMax(255);
        this.f2619e.setOnSeekBarChangeListener(this.f2625k);
        this.f2618d = (SeekBar) findViewById(R.id.blue);
        this.f2618d.setMax(255);
        this.f2618d.setOnSeekBarChangeListener(this.f2625k);
        this.f2620f = (SeekBar) findViewById(R.id.alpha);
        this.f2620f.setMax(255);
        this.f2620f.setOnSeekBarChangeListener(this.f2625k);
    }

    /* JADX INFO: renamed from: a */
    static /* synthetic */ void m2302a(C1008a c1008a, int i) {
        c1008a.f2624j = i;
        String hexString = Integer.toHexString(i);
        c1008a.f2621g.setText(hexString);
        c1008a.f2621g.setSelection(hexString.length());
    }

    /* JADX INFO: renamed from: c */
    static /* synthetic */ InterfaceC1012e m2304c(C1008a c1008a) {
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final int m2305a() {
        return Color.argb(this.f2620f.getProgress(), this.f2617c.getProgress(), this.f2619e.getProgress(), this.f2618d.getProgress());
    }

    /* JADX INFO: renamed from: a */
    public final void m2306a(int i) {
        this.f2617c.setProgress(Color.red(i));
        this.f2619e.setProgress(Color.green(i));
        this.f2618d.setProgress(Color.blue(i));
        this.f2620f.setProgress(Color.alpha(i));
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        try {
            String string = this.f2621g.getText().toString();
            Long lValueOf = Long.valueOf(Long.parseLong(string, 16));
            if (lValueOf.intValue() != this.f2624j) {
                if (string.length() <= 6) {
                    lValueOf = Long.valueOf(lValueOf.longValue() | (-16777216));
                }
                int iIntValue = lValueOf.intValue();
                this.f2623i = iIntValue;
                m2306a(iIntValue);
            }
        } catch (Exception e) {
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("superState"));
        m2306a(bundle.getInt("color"));
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("superState", super.onSaveInstanceState());
        bundle.putInt("color", m2305a());
        return bundle;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
