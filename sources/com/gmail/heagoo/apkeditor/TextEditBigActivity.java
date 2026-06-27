package com.gmail.heagoo.apkeditor;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SlidingDrawer;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;
import android.widget.ViewAnimator;
import com.gmail.heagoo.InterfaceC1050a;
import com.gmail.heagoo.apkeditor.p099ui.LayoutObListView;
import com.gmail.heagoo.apkeditor.pro.R;
import com.gmail.heagoo.common.InterfaceC1560i;
import com.gmail.heagoo.neweditor.C1592c;
import com.gmail.heagoo.neweditor.C1594e;
import com.gmail.heagoo.neweditor.InterfaceC1608s;
import com.gmail.heagoo.p084a.p089c.C1067a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class TextEditBigActivity extends AbstractActivityC1341gy implements TextWatcher, View.OnClickListener, InterfaceC1050a {

    /* JADX INFO: renamed from: A */
    private ToggleButton f3061A;

    /* JADX INFO: renamed from: B */
    private ToggleButton f3062B;

    /* JADX INFO: renamed from: C */
    private ImageView f3063C;

    /* JADX INFO: renamed from: D */
    private boolean f3064D;

    /* JADX INFO: renamed from: E */
    private boolean f3065E;

    /* JADX INFO: renamed from: F */
    private TextView f3066F;

    /* JADX INFO: renamed from: G */
    private View f3067G;

    /* JADX INFO: renamed from: H */
    private View f3068H;

    /* JADX INFO: renamed from: I */
    private View f3069I;

    /* JADX INFO: renamed from: J */
    private int f3070J;

    /* JADX INFO: renamed from: K */
    private C1366hw f3071K;

    /* JADX INFO: renamed from: L */
    private String f3072L;

    /* JADX INFO: renamed from: k */
    private int f3073k;

    /* JADX INFO: renamed from: l */
    private FrameLayout f3074l;

    /* JADX INFO: renamed from: m */
    private ViewAnimator f3075m;

    /* JADX INFO: renamed from: n */
    private SlidingDrawer f3076n;

    /* JADX INFO: renamed from: o */
    private EditText f3077o;

    /* JADX INFO: renamed from: p */
    private EditText f3078p;

    /* JADX INFO: renamed from: q */
    private ImageButton f3079q;

    /* JADX INFO: renamed from: r */
    private ImageButton f3080r;

    /* JADX INFO: renamed from: s */
    private ImageButton f3081s;

    /* JADX INFO: renamed from: t */
    private ImageButton f3082t;

    /* JADX INFO: renamed from: u */
    private EditText f3083u;

    /* JADX INFO: renamed from: v */
    private ImageView f3084v;

    /* JADX INFO: renamed from: w */
    private ImageView f3085w;

    /* JADX INFO: renamed from: x */
    private ImageView f3086x;

    /* JADX INFO: renamed from: y */
    private ImageView f3087y;

    /* JADX INFO: renamed from: z */
    private ImageView f3088z;

    public TextEditBigActivity() {
        super(true, false);
        this.f3064D = false;
        this.f3065E = false;
        this.f3072L = "";
    }

    /* JADX INFO: renamed from: a */
    private void m2831a(int i, int i2, int i3) {
        this.f3071K.m3423a(i, i2, i3);
    }

    /* JADX INFO: renamed from: a */
    private static void m2832a(ImageView imageView, boolean z) {
        if (z) {
            imageView.getDrawable().setAlpha(255);
            imageView.setClickable(true);
        } else {
            imageView.getDrawable().setAlpha(80);
            imageView.setClickable(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m2834a(InterfaceC1560i interfaceC1560i) {
        new DialogC1284ey(this, new C1356hm(this, interfaceC1560i), R.string.file_saved).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public boolean m2836a(boolean z) {
        if (this.f3077o.getText().toString().equals("")) {
            return false;
        }
        if (!m2838b(this.f3071K.m3420a(), this.f3071K.m3432c()) && !m2838b(0, 0)) {
            if (!z) {
                return false;
            }
            Toast.makeText(getApplicationContext(), getString(R.string.not_found), 0).show();
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    private boolean m2838b(int i, int i2) {
        Matcher matcher;
        if (i < 0) {
            i = 0;
        }
        int i3 = this.f3061A.isChecked() ? 10 : 8;
        int i4 = (this.f3062B == null || this.f3062B.isChecked()) ? i3 : i3 | 16;
        try {
            List listM3436e = this.f3071K.m3436e();
            String str = (String) listM3436e.get(i);
            Pattern patternCompile = Pattern.compile(this.f3077o.getText().toString(), i4);
            Matcher matcher2 = patternCompile.matcher(str);
            if (matcher2.find(i2)) {
                m2831a(i, matcher2.start(), matcher2.end());
                return true;
            }
            do {
                i++;
                if (i >= listM3436e.size()) {
                    return false;
                }
                matcher = patternCompile.matcher((CharSequence) listM3436e.get(i));
            } while (!matcher.find());
            m2831a(i, matcher.start(), matcher.end());
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /* JADX INFO: renamed from: d */
    private void m2841d(int i) {
        byte b2 = 0;
        if (this.f3919j.m3912b()) {
            new AlertDialog.Builder(this).setMessage(R.string.save_changes_tip).setPositiveButton(R.string.save, new DialogInterfaceOnClickListenerC1354hk(this, i)).setNegativeButton(R.string.donot_save, new DialogInterfaceOnClickListenerC1353hj(this, i)).setNeutralButton(android.R.string.cancel, (DialogInterface.OnClickListener) null).show();
        } else {
            this.f3914e += i;
            new AsyncTaskC1361hr(this, b2).execute(new Void[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public void m2843e() {
        try {
            String str = this.f3072L;
            if (str != null && !"".equals(str)) {
                String string = this.f3077o.getText().toString();
                if ((this.f3061A.isChecked() ? Pattern.compile(string, 10) : Pattern.compile(string)).matcher(str).matches()) {
                    this.f3080r.setEnabled(true);
                    this.f3081s.setEnabled(true);
                    return;
                }
            }
        } catch (Exception e) {
        }
        this.f3080r.setEnabled(false);
        this.f3081s.setEnabled(false);
    }

    /* JADX INFO: renamed from: e */
    private void m2844e(int i) {
        this.f3071K.m3422a(2, (i <= 40 ? i : 40) >= 4 ? r1 : 4);
    }

    /* JADX INFO: renamed from: f */
    static /* synthetic */ void m2845f(TextEditBigActivity textEditBigActivity) {
        if (textEditBigActivity.f3070J > 0) {
            textEditBigActivity.f3071K.m3433c(textEditBigActivity.f3070J - 1);
        }
    }

    /* JADX INFO: renamed from: g */
    static /* synthetic */ void m2846g(TextEditBigActivity textEditBigActivity) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) textEditBigActivity.f3071K.m3439h();
        layoutParams.setMargins(0, 0, textEditBigActivity.f3076n.getWidth(), layoutParams.bottomMargin);
        textEditBigActivity.f3071K.m3438g();
        textEditBigActivity.f3063C.setImageResource(R.drawable.edit_slide_right);
    }

    /* JADX INFO: renamed from: h */
    static /* synthetic */ void m2847h(TextEditBigActivity textEditBigActivity) {
        textEditBigActivity.f3076n.setVisibility(8);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) textEditBigActivity.f3071K.m3439h();
        layoutParams.setMargins(0, 0, 0, layoutParams.bottomMargin);
        textEditBigActivity.f3071K.m3438g();
        textEditBigActivity.f3063C.setImageResource(R.drawable.edit_slide_left);
        textEditBigActivity.f3075m.setDisplayedChild(0);
    }

    @Override // com.gmail.heagoo.apkeditor.AbstractActivityC1341gy, com.gmail.heagoo.apkeditor.InterfaceC1221dn
    /* JADX INFO: renamed from: a */
    public final void mo2850a(int i, int i2) {
        boolean z;
        boolean z2 = false;
        if (this.f3918i == 2) {
            String[] strArrSplit = this.f3071K.m3435d().toString().split("\n");
            if (i <= 0) {
                i = 1;
            }
            if (i2 > strArrSplit.length) {
                i2 = strArrSplit.length;
            }
            if (i <= i2) {
                ArrayList arrayList = new ArrayList();
                for (int i3 = 1; i3 < i; i3++) {
                    arrayList.add(strArrSplit[i3 - 1]);
                }
                for (int i4 = i2 + 1; i4 <= strArrSplit.length; i4++) {
                    arrayList.add(strArrSplit[i4 - 1]);
                }
                this.f3071K.m3428a(arrayList);
                Toast.makeText(this, String.format(getString(R.string.n_lines_deleted), Integer.valueOf((i2 - i) + 1)), 1).show();
                z = true;
            } else {
                z = false;
            }
            z2 = z;
        } else if (this.f3918i == 5) {
            String[] strArrSplit2 = this.f3071K.m3435d().toString().split("\n");
            if (i <= 0) {
                i = 1;
            }
            if (i2 > strArrSplit2.length) {
                i2 = strArrSplit2.length;
            }
            if (i <= i2) {
                ArrayList arrayList2 = new ArrayList();
                for (int i5 = 1; i5 < i; i5++) {
                    arrayList2.add(strArrSplit2[i5 - 1]);
                }
                boolean zA = m3384a(strArrSplit2, i, i2, "#");
                if (zA) {
                    for (int i6 = i; i6 <= i2; i6++) {
                        int iIndexOf = strArrSplit2[i6 - 1].indexOf(35);
                        if (iIndexOf > 0) {
                            arrayList2.add(strArrSplit2[i6 - 1].substring(0, iIndexOf) + strArrSplit2[i6 - 1].substring(iIndexOf + 1));
                        } else {
                            arrayList2.add(strArrSplit2[i6 - 1].substring(iIndexOf + 1));
                        }
                    }
                } else {
                    for (int i7 = i; i7 <= i2; i7++) {
                        arrayList2.add("#" + strArrSplit2[i7 - 1]);
                    }
                }
                for (int i8 = i2 + 1; i8 <= strArrSplit2.length; i8++) {
                    arrayList2.add(strArrSplit2[i8 - 1]);
                }
                this.f3071K.m3428a(arrayList2);
                Toast.makeText(this, String.format(zA ? getString(R.string.n_lines_uncommented) : getString(R.string.n_lines_commented), Integer.valueOf((i2 - i) + 1)), 1).show();
                z2 = true;
            }
        }
        if (z2) {
            this.f3919j.m3911a(true);
            m2853d();
        }
    }

    @Override // com.gmail.heagoo.InterfaceC1050a
    /* JADX INFO: renamed from: a */
    public final void mo2378a(int i, int i2, String str) {
        this.f3072L = str;
        if (i == i2) {
            m2832a(this.f3086x, false);
        } else {
            m2832a(this.f3086x, true);
        }
        if (this.f3076n.isOpened()) {
            m2843e();
        }
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        this.f3919j.m3911a(true);
        m2853d();
    }

    @Override // com.gmail.heagoo.apkeditor.InterfaceC1334gr
    /* JADX INFO: renamed from: b */
    public final void mo2851b(int i) {
        if (i > 0) {
            this.f3083u.setText("");
            this.f3071K.m3433c(i - 1);
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // com.gmail.heagoo.apkeditor.AbstractActivityC1341gy
    /* JADX INFO: renamed from: c */
    protected final void mo2852c(int i) {
        Editable editableM3437f;
        if (this.f3071K == null || (editableM3437f = this.f3071K.m3437f()) == null) {
            return;
        }
        editableM3437f.replace(this.f3071K.m3430b(), this.f3071K.m3432c(), new StringBuilder().append(m3401b((String) null).charAt(i)).toString());
    }

    /* JADX INFO: renamed from: d */
    protected final synchronized void m2853d() {
        boolean zM3912b;
        C1594e c1594e = this.f3919j;
        if (c1594e != null && this.f3065E != (zM3912b = c1594e.m3912b())) {
            if (zM3912b) {
                m2832a(this.f3085w, true);
            } else {
                m2832a(this.f3085w, false);
            }
            this.f3085w.invalidate();
            this.f3065E = zM3912b;
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (this.f3919j.m3912b()) {
            new AlertDialog.Builder(this).setMessage(R.string.save_changes_tip).setPositiveButton(R.string.save, new DialogInterfaceOnClickListenerC1358ho(this)).setNegativeButton(R.string.donot_save, new DialogInterfaceOnClickListenerC1357hn(this)).setNeutralButton(android.R.string.cancel, (DialogInterface.OnClickListener) null).show();
        } else {
            finish();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int size;
        int iM3430b;
        int iM3432c;
        EditText editTextM3434d;
        int id = view.getId();
        if (id == R.id.menu_next) {
            m2841d(1);
            return;
        }
        if (id == R.id.menu_previous) {
            m2841d(-1);
            return;
        }
        if (id == R.id.moreBtn) {
            m3398a(view);
            return;
        }
        if (id == R.id.openFindBtn) {
            if (this.f3076n.getVisibility() == 8) {
                this.f3076n.animateOpen();
                this.f3076n.setVisibility(0);
            } else {
                this.f3076n.close();
                this.f3076n.setVisibility(8);
            }
            String str = this.f3072L;
            if (str == null || "".equals(str)) {
                if (this.f3910a != null && "".equals(this.f3077o.getText().toString())) {
                    this.f3077o.setText(this.f3910a);
                }
            } else if (!str.contains("\n")) {
                this.f3077o.setText(str);
            }
            this.f3077o.requestFocus();
            return;
        }
        if (id == R.id.findBtn) {
            m2836a(true);
            return;
        }
        if (id == R.id.replaceBtn) {
            C1366hw c1366hw = this.f3071K;
            String string = this.f3078p.getText().toString();
            int iM3420a = c1366hw.m3420a();
            if (iM3420a >= 0 && (iM3430b = c1366hw.m3430b()) != (iM3432c = c1366hw.m3432c()) && (editTextM3434d = c1366hw.m3434d(iM3420a)) != null) {
                editTextM3434d.getEditableText().replace(iM3430b, iM3432c, string);
            }
            m2836a(true);
            return;
        }
        if (id != R.id.replaceAllBtn) {
            if (id == R.id.goBtn) {
                String strTrim = this.f3083u.getText().toString().trim();
                if (!strTrim.equals("")) {
                    try {
                        mo2851b(Integer.valueOf(strTrim).intValue());
                        return;
                    } catch (Exception e) {
                        return;
                    }
                }
                C1366hw c1366hw2 = this.f3071K;
                EditText editTextM3434d2 = c1366hw2.m3434d(c1366hw2.m3420a());
                if (editTextM3434d2 != null) {
                    editTextM3434d2.getText().insert(editTextM3434d2.getSelectionStart(), "\n");
                    return;
                }
                return;
            }
            if (id == R.id.saveBtn) {
                m2834a((InterfaceC1560i) null);
                return;
            }
            if (id == R.id.copyBtn) {
                String str2 = this.f3072L;
                if (str2 == null || str2.equals("")) {
                    return;
                }
                C1067a.m2519c(this, str2);
                if (str2.contains("\n")) {
                    Toast.makeText(this, R.string.selected_str_copied, 0).show();
                    return;
                } else {
                    Toast.makeText(this, String.format(getString(R.string.copied_to_clipboard), str2), 0).show();
                    return;
                }
            }
            if (id != R.id.pasteBtn) {
                if (id == R.id.menu_methods) {
                    m3403b(view);
                    return;
                }
                return;
            }
            String strM2500b = C1067a.m2500b(this);
            if (strM2500b == null) {
                Toast.makeText(this, R.string.clipboard_no_text, 0).show();
                return;
            }
            Editable editableM3437f = this.f3071K.m3437f();
            if (editableM3437f != null) {
                editableM3437f.replace(this.f3071K.m3430b(), this.f3071K.m3432c(), strM2500b);
                return;
            }
            return;
        }
        int i = this.f3061A.isChecked() ? 10 : 8;
        if (this.f3062B != null && !this.f3062B.isChecked()) {
            i |= 16;
        }
        try {
            String string2 = this.f3078p.getText().toString();
            List listM3436e = this.f3071K.m3436e();
            Pattern patternCompile = Pattern.compile(this.f3077o.getText().toString(), i);
            ArrayList<C1360hq> arrayList = new ArrayList();
            int i2 = 0;
            int i3 = 0;
            while (i2 < listM3436e.size()) {
                String str3 = (String) listM3436e.get(i2);
                Matcher matcher = patternCompile.matcher(str3);
                int iEnd = 0;
                while (matcher.find(iEnd)) {
                    int iStart = matcher.start();
                    iEnd = matcher.end();
                    arrayList.add(new C1360hq(iStart, iEnd, (byte) 0));
                }
                if (arrayList.isEmpty()) {
                    size = i3;
                } else {
                    StringBuilder sb = new StringBuilder();
                    int i4 = 0;
                    for (C1360hq c1360hq : arrayList) {
                        sb.append(str3.substring(i4, c1360hq.f3968a));
                        sb.append(string2);
                        i4 = c1360hq.f3969b;
                    }
                    sb.append(str3.substring(i4));
                    listM3436e.set(i2, sb.toString());
                    size = arrayList.size() + i3;
                    arrayList.clear();
                }
                i2++;
                i3 = size;
            }
            this.f3071K.m3440i();
            if (i3 > 0) {
                Toast.makeText(getApplicationContext(), String.format(getString(R.string.replace_all_ret), Integer.valueOf(i3)), 0).show();
            } else {
                Toast.makeText(getApplicationContext(), getString(R.string.not_found), 0).show();
            }
        } catch (Exception e2) {
        }
    }

    @Override // com.gmail.heagoo.apkeditor.AbstractActivityC1341gy, android.app.Activity
    @SuppressLint({"NewApi"})
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f3066F = (TextView) findViewById(R.id.filename);
        this.f3067G = findViewById(R.id.menu_previous);
        this.f3068H = findViewById(R.id.menu_next);
        this.f3069I = findViewById(R.id.menu_methods);
        this.f3067G.setOnClickListener(this);
        this.f3068H.setOnClickListener(this);
        this.f3069I.setOnClickListener(this);
        this.f3074l = (FrameLayout) findViewById(R.id.center_layout);
        this.f3071K = new C1366hw(this, (LayoutObListView) findViewById(R.id.text_list));
        this.f3075m = (ViewAnimator) findViewById(R.id.searchAnimator);
        this.f3076n = (SlidingDrawer) findViewById(R.id.sliding_drawer);
        this.f3077o = (EditText) findViewById(R.id.findEdit);
        this.f3078p = (EditText) findViewById(R.id.replaceEdit);
        this.f3079q = (ImageButton) findViewById(R.id.findBtn);
        this.f3080r = (ImageButton) findViewById(R.id.replaceBtn);
        this.f3081s = (ImageButton) findViewById(R.id.replaceAllBtn);
        this.f3084v = (ImageView) findViewById(R.id.openFindBtn);
        this.f3061A = (ToggleButton) findViewById(R.id.checkBoxIgnoreCase);
        this.f3062B = (ToggleButton) findViewById(R.id.checkBoxRegexp);
        this.f3085w = (ImageView) findViewById(R.id.saveBtn);
        this.f3086x = (ImageView) findViewById(R.id.copyBtn);
        this.f3087y = (ImageView) findViewById(R.id.pasteBtn);
        this.f3088z = (ImageView) findViewById(R.id.moreBtn);
        this.f3082t = (ImageButton) findViewById(R.id.goBtn);
        this.f3083u = (EditText) findViewById(R.id.lineNumEdit);
        this.f3063C = (ImageView) findViewById(R.id.panel_button);
        m2832a(this.f3086x, false);
        this.f3073k = SettingEditorActivity.m2823b(this);
        m2844e(this.f3073k);
        this.f3084v.setOnClickListener(this);
        this.f3079q.setOnClickListener(this);
        this.f3080r.setOnClickListener(this);
        this.f3081s.setOnClickListener(this);
        this.f3085w.setOnClickListener(this);
        this.f3082t.setOnClickListener(this);
        this.f3086x.setOnClickListener(this);
        this.f3087y.setOnClickListener(this);
        this.f3088z.setOnClickListener(this);
        this.f3085w.getDrawable().setAlpha(80);
        this.f3085w.setClickable(false);
        this.f3080r.setEnabled(false);
        this.f3081s.setEnabled(false);
        C1592c c1592c = new C1592c(this);
        this.f3074l.setBackgroundColor(c1592c.m3894a());
        this.f3071K.m3421a(c1592c.m3894a());
        this.f3071K.m3431b(c1592c.m3896b());
        int iM3894a = c1592c.m3894a();
        Color.argb(128, 255 - Color.red(iM3894a), 255 - Color.green(iM3894a), 255 - Color.blue(iM3894a));
        this.f3071K.m3424a((TextWatcher) this);
        this.f3076n.setOnDrawerOpenListener(new C1349hf(this));
        this.f3076n.setOnDrawerCloseListener(new C1350hg(this));
        this.f3071K.m3425a((InterfaceC1050a) this);
        this.f3077o.setOnKeyListener(new ViewOnKeyListenerC1351hh(this));
        this.f3078p.setOnKeyListener(new ViewOnKeyListenerC1352hi(this));
        super.m3399a((InterfaceC1608s) findViewById(R.id.text_list));
        new AsyncTaskC1361hr(this, (byte) 0).execute(new Void[0]);
    }

    @Override // android.app.Activity
    public boolean onPrepareOptionsMenu(Menu menu) {
        return true;
    }

    @Override // android.app.Activity
    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
    }

    @Override // com.gmail.heagoo.apkeditor.AbstractActivityC1341gy, android.app.Activity
    protected void onResume() {
        super.onResume();
        int iM2823b = SettingEditorActivity.m2823b(this);
        if (this.f3073k != iM2823b) {
            this.f3073k = iM2823b;
            m2844e(iM2823b);
            m2853d();
        }
        if (SettingEditorActivity.m2827e(this)) {
            this.f3071K.m3429a(true);
        } else {
            this.f3071K.m3429a(false);
        }
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        String str;
        super.onSaveInstanceState(bundle);
        bundle.putInt("curFileIndex", this.f3914e);
        bundle.putBoolean("modifySaved", this.f3916g);
        if (this.f3919j == null || !this.f3919j.m3912b()) {
            return;
        }
        bundle.putBoolean("docChanged", true);
        try {
            str = C1067a.m2525d(this, "tmp") + C1067a.m2546l(m3397a()) + ".tmp";
        } catch (Exception e) {
            str = m3397a() + ".tmp";
        }
        try {
            this.f3919j.m3910a(str);
            bundle.putString("unsavedFilePath", str);
        } catch (IOException e2) {
        }
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
