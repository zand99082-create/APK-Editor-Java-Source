package com.rull.colorpicker;

import android.R;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.support.v4.internal.view.SupportMenu;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import com.gmail.heagoo.apkeditor.gzd;

/* JADX INFO: renamed from: com.rull.colorpicker.a */
/* JADX INFO: loaded from: classes.dex */
public class ViewOnClickListenerC1691a extends FrameLayout implements InterfaceC1692b, TextWatcher, SeekBar.OnSeekBarChangeListener, View.OnClickListener {

    /* JADX INFO: renamed from: c */
    private int f5041c;

    /* JADX INFO: renamed from: d */
    private int f5042d;

    /* JADX INFO: renamed from: e */
    private int f5043e;

    /* JADX INFO: renamed from: f */
    private EditText f5044f;
    private C1693c f1621a;
    private int f1622b;

    /* JADX INFO: renamed from: g */
    private SeekBar f5045g;

    /* JADX INFO: renamed from: h */
    private SeekBar f5046h;

    /* JADX INFO: renamed from: i */
    private SeekBar f5047i;

    /* JADX INFO: renamed from: j */
    private SeekBar f5048j;

    /* JADX INFO: renamed from: k */
    private TextView f5049k;

    /* JADX INFO: renamed from: l */
    private TextView f5050l;

    /* JADX INFO: renamed from: m */
    private View f5051m;

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(SeekBar seekBar) {
    }

    public ViewOnClickListenerC1691a(Context context) {
        this(context, (AttributeSet) null);
    }

    public ViewOnClickListenerC1691a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1621a = new C1693c(0);
        LayoutInflater.from(context).inflate(MasrullID("cpv", "layout"), this);
        this.f5051m = findViewById(MasrullID("color_view", gzd.COLUMN_ID));
        this.f5045g = (SeekBar) findViewById(MasrullID("alpha", gzd.COLUMN_ID));
        this.f5046h = (SeekBar) findViewById(MasrullID("red", gzd.COLUMN_ID));
        this.f5047i = (SeekBar) findViewById(MasrullID("green", gzd.COLUMN_ID));
        this.f5048j = (SeekBar) findViewById(MasrullID("blue", gzd.COLUMN_ID));
        m4068b(this.f5045g, -7829368);
        m4068b(this.f5046h, SupportMenu.CATEGORY_MASK);
        m4068b(this.f5047i, -16711936);
        m4068b(this.f5048j, -16776961);
        this.f5049k = (TextView) findViewById(MasrullID("textView1", gzd.COLUMN_ID));
        this.f5049k.setOnClickListener(this);
        this.f5050l = (TextView) findViewById(MasrullID("textView2", gzd.COLUMN_ID));
        this.f5050l.setOnClickListener(this);
        this.f5044f = (EditText) findViewById(MasrullID("color", gzd.COLUMN_ID));
        this.f5044f.addTextChangedListener(this);
        this.f1621a.m4077a(this);
        this.f5044f.setFilters(new InputFilter[]{new InputFilter.LengthFilter(8)});
        this.f5044f.setText(this.f5044f.getText());
    }

    public int MasrullID(String str, String str2) {
        return getContext().getResources().getIdentifier(str, str2, getContext().getPackageName());
    }

    /* JADX INFO: renamed from: b */
    private void m4068b(SeekBar seekBar, int i) {
        seekBar.getThumb().setColorFilter(i, PorterDuff.Mode.SRC_IN);
        seekBar.getProgressDrawable().setColorFilter(i, PorterDuff.Mode.MULTIPLY);
        seekBar.setOnSeekBarChangeListener(this);
    }

    /* JADX INFO: renamed from: c */
    private static String m4069c(int i, int i2, int i3, int i4) {
        return String.format("%02x%02x%02x%02x", new Integer(m4070d(i)), new Integer(m4070d(i2)), new Integer(m4070d(i3)), new Integer(m4070d(i4)));
    }

    /* JADX INFO: renamed from: d */
    private static int m4070d(int i) {
        if (i >= 0 && i <= 255) {
            return i;
        }
        return 0;
    }

    /* JADX INFO: renamed from: f */
    static int m4071f(CharSequence charSequence) {
        try {
            return (int) (Long.parseLong(charSequence.toString(), 16) & 4294967295L);
        } catch (NumberFormatException e) {
            return -7829368;
        }
    }

    /* JADX INFO: renamed from: g */
    private void m4072g(TextView textView) {
        ((ClipboardManager) getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("copied", textView.getText().toString()));
        Toast.makeText(getContext(), new StringBuffer().append(new StringBuffer().append(textView.getText().toString()).append(" ").toString()).append(getContext().getString(R.string.copy).toLowerCase()).toString(), 0).show();
    }

    @Override // com.rull.colorpicker.InterfaceC1692b
    /* JADX INFO: renamed from: a */
    public void mo4073a(C1693c c1693c) {
        this.f5044f.setText(String.format("%08x", Integer.valueOf(c1693c.m4079c())));
    }

    /* JADX INFO: renamed from: e */
    public String m4074e(String str) {
        String string = str;
        new String();
        if (string.length() == 6) {
            string = new StringBuffer().append("ff").append(string).toString();
        }
        int color = Color.parseColor(new StringBuffer().append("#").append(string).toString());
        return Integer.parseInt(string.substring(0, 2), 16) >= 128 ? new StringBuffer().append("-0x").append(Integer.toHexString(color * (-1))).toString() : new StringBuffer().append("0x").append(Integer.toHexString(color)).toString();
    }

    /* JADX INFO: renamed from: h */
    public void m4075h(int i) {
        this.f1621a.m4078b(i, (InterfaceC1692b) null);
    }

    /* JADX INFO: renamed from: i */
    public int m4076i() {
        return this.f1621a.m4079c();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case -2:
                m4072g(this.f5050l);
                break;
            case -1:
                m4072g(this.f5049k);
                break;
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (seekBar.getId() != MasrullID("alpha", gzd.COLUMN_ID)) {
            if (seekBar.getId() != MasrullID("red", gzd.COLUMN_ID)) {
                if (seekBar.getId() != MasrullID("green", gzd.COLUMN_ID)) {
                    if (seekBar.getId() == MasrullID("blue", gzd.COLUMN_ID)) {
                        this.f5043e = i;
                    }
                } else {
                    this.f5042d = i;
                }
            } else {
                this.f5041c = i;
            }
        } else {
            this.f1622b = i;
        }
        this.f5044f.setText(m4069c(this.f1622b, this.f5041c, this.f5042d, this.f5043e));
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f1621a.m4078b(m4071f(charSequence), this);
        String string = charSequence.toString();
        try {
            if (string.length() == 8) {
                try {
                    int color = Color.parseColor(new StringBuffer().append('#').append(string).toString());
                    this.f1622b = Color.alpha(color);
                    this.f5041c = Color.red(color);
                    this.f5042d = Color.green(color);
                    this.f5043e = Color.blue(color);
                    this.f5051m.setBackgroundColor(m4076i());
                    this.f5049k.setText(m4074e(m4069c(this.f1622b, this.f5041c, this.f5042d, this.f5043e)));
                    this.f5050l.setText(String.valueOf(m4076i()));
                    this.f5045g.setProgress(this.f1622b);
                    this.f5046h.setProgress(this.f5041c);
                    this.f5047i.setProgress(this.f5042d);
                    this.f5048j.setProgress(this.f5043e);
                } catch (IllegalArgumentException e) {
                }
                this.f5044f.setSelection(this.f5044f.getText().length());
                this.f5044f.requestFocus();
            }
        } catch (Exception e2) {
        }
    }
}
