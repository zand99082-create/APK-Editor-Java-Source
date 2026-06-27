package ru.zeratul.preference;

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
import com.gmail.heagoo.apkeditor.pro.R;

/* JADX INFO: renamed from: ru.zeratul.preference.a */
/* JADX INFO: loaded from: classes.dex */
public class ViewOnClickListenerC1979a extends FrameLayout implements InterfaceC1980b, TextWatcher, SeekBar.OnSeekBarChangeListener, View.OnClickListener {

    /* JADX INFO: renamed from: a */
    private C1981c f5375a;

    /* JADX INFO: renamed from: b */
    private int f5376b;

    /* JADX INFO: renamed from: c */
    private int f5377c;

    /* JADX INFO: renamed from: d */
    private int f5378d;

    /* JADX INFO: renamed from: e */
    private int f5379e;

    /* JADX INFO: renamed from: f */
    private EditText f5380f;

    /* JADX INFO: renamed from: g */
    private SeekBar f5381g;

    /* JADX INFO: renamed from: h */
    private SeekBar f5382h;

    /* JADX INFO: renamed from: i */
    private SeekBar f5383i;

    /* JADX INFO: renamed from: j */
    private SeekBar f5384j;

    /* JADX INFO: renamed from: k */
    private TextView f5385k;

    /* JADX INFO: renamed from: l */
    private TextView f5386l;

    /* JADX INFO: renamed from: m */
    private View f5387m;

    public ViewOnClickListenerC1979a(Context context) {
        this(context, (AttributeSet) null);
    }

    public ViewOnClickListenerC1979a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5375a = new C1981c(0);
        LayoutInflater.from(context).inflate(R.layout.cpv, this);
        this.f5387m = findViewById(R.id.color_view);
        this.f5381g = (SeekBar) findViewById(R.id.alpha);
        this.f5382h = (SeekBar) findViewById(R.id.red);
        this.f5383i = (SeekBar) findViewById(R.id.green);
        this.f5384j = (SeekBar) findViewById(R.id.blue);
        m4393b(this.f5381g, -7829368);
        m4393b(this.f5382h, SupportMenu.CATEGORY_MASK);
        m4393b(this.f5383i, -16711936);
        m4393b(this.f5384j, -16776961);
        this.f5385k = (TextView) findViewById(R.id.textView1);
        this.f5385k.setOnClickListener(this);
        this.f5386l = (TextView) findViewById(R.id.textView2);
        this.f5386l.setOnClickListener(this);
        this.f5380f = (EditText) findViewById(R.id.color);
        this.f5380f.addTextChangedListener(this);
        this.f5375a.m4402a(this);
        this.f5380f.setFilters(new InputFilter[]{new InputFilter.LengthFilter(8)});
        this.f5380f.setText(this.f5380f.getText());
    }

    /* JADX INFO: renamed from: b */
    private void m4393b(SeekBar seekBar, int i) {
        seekBar.getThumb().setColorFilter(i, PorterDuff.Mode.SRC_IN);
        seekBar.getProgressDrawable().setColorFilter(i, PorterDuff.Mode.MULTIPLY);
        seekBar.setOnSeekBarChangeListener(this);
    }

    /* JADX INFO: renamed from: c */
    private static String m4394c(int i, int i2, int i3, int i4) {
        return String.format("%02x%02x%02x%02x", new Integer(m4395d(i)), new Integer(m4395d(i2)), new Integer(m4395d(i3)), new Integer(m4395d(i4)));
    }

    /* JADX INFO: renamed from: d */
    private static int m4395d(int i) {
        if (i < 0 || i > 255) {
            return 0;
        }
        return i;
    }

    /* JADX INFO: renamed from: f */
    static int m4396f(CharSequence charSequence) {
        try {
            return (int) (Long.parseLong(charSequence.toString(), 16) & 4294967295L);
        } catch (NumberFormatException e) {
            return -7829368;
        }
    }

    /* JADX INFO: renamed from: g */
    private void m4397g(TextView textView) {
        ((ClipboardManager) getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("copied", textView.getText().toString()));
        Toast.makeText(getContext(), textView.getText().toString() + " " + getContext().getString(R.string.toast_clipboard).toLowerCase(), 0).show();
    }

    @Override // ru.zeratul.preference.InterfaceC1980b
    /* JADX INFO: renamed from: a */
    public void mo4398a(C1981c c1981c) {
        this.f5380f.setText(String.format("%08x", Integer.valueOf(c1981c.m4404c())));
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* JADX INFO: renamed from: e */
    public String m4399e(String str) {
        new String();
        if (str.length() == 6) {
            str = "ff" + str;
        }
        int color = Color.parseColor("#" + str);
        return Integer.parseInt(str.substring(0, 2), 16) >= 128 ? "-0x" + Integer.toHexString(color * (-1)) : "0x" + Integer.toHexString(color);
    }

    /* JADX INFO: renamed from: h */
    public void m4400h(int i) {
        this.f5375a.m4403b(i, (InterfaceC1980b) null);
    }

    /* JADX INFO: renamed from: i */
    public int m4401i() {
        return this.f5375a.m4404c();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.textView1 /* 2131558467 */:
                m4397g(this.f5385k);
                break;
            case R.id.textView2 /* 2131558683 */:
                m4397g(this.f5386l);
                break;
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (seekBar.getId() == R.id.alpha) {
            this.f5376b = i;
        } else if (seekBar.getId() == R.id.red) {
            this.f5377c = i;
        } else if (seekBar.getId() == R.id.green) {
            this.f5378d = i;
        } else if (seekBar.getId() == R.id.blue) {
            this.f5379e = i;
        }
        this.f5380f.setText(m4394c(this.f5376b, this.f5377c, this.f5378d, this.f5379e));
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f5375a.m4403b(m4396f(charSequence), this);
        String string = charSequence.toString();
        try {
            if (string.length() == 8) {
                try {
                    int color = Color.parseColor(new StringBuffer().append('#').append(string).toString());
                    this.f5376b = Color.alpha(color);
                    this.f5377c = Color.red(color);
                    this.f5378d = Color.green(color);
                    this.f5379e = Color.blue(color);
                    this.f5387m.setBackgroundColor(m4401i());
                    this.f5385k.setText(m4399e(m4394c(this.f5376b, this.f5377c, this.f5378d, this.f5379e)));
                    this.f5386l.setText(String.valueOf(m4401i()));
                    this.f5381g.setProgress(this.f5376b);
                    this.f5382h.setProgress(this.f5377c);
                    this.f5383i.setProgress(this.f5378d);
                    this.f5384j.setProgress(this.f5379e);
                } catch (IllegalArgumentException e) {
                }
                this.f5380f.setSelection(this.f5380f.getText().length());
                this.f5380f.requestFocus();
            }
        } catch (Exception e2) {
        }
    }
}
