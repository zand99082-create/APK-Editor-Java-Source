package com.gmail.heagoo.apkeditor;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.text.InputFilter;
import android.util.TypedValue;
import android.view.Menu;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SlidingDrawer;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;
import android.widget.ViewAnimator;
import com.gmail.heagoo.apkeditor.pro.R;
import com.gmail.heagoo.common.InterfaceC1560i;
import com.gmail.heagoo.neweditor.C1592c;
import com.gmail.heagoo.neweditor.C1594e;
import com.gmail.heagoo.neweditor.InterfaceC1585ad;
import com.gmail.heagoo.neweditor.InterfaceC1608s;
import com.gmail.heagoo.neweditor.ObEditText;
import com.gmail.heagoo.neweditor.ObScrollView;
import com.gmail.heagoo.p084a.p089c.C1067a;
import com.masrull.listview.JazzyHelper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class TextEditNormalActivity extends AbstractActivityC1341gy implements View.OnClickListener, InterfaceC1585ad {

    /* JADX INFO: renamed from: n */
    private static int f3089n = JazzyHelper.DURATION;

    /* JADX INFO: renamed from: o */
    private static int f3090o = JazzyHelper.DURATION;

    /* JADX INFO: renamed from: p */
    private static int f3091p = 400;

    /* JADX INFO: renamed from: q */
    private static int f3092q = 100;

    /* JADX INFO: renamed from: A */
    private FrameLayout f3093A;

    /* JADX INFO: renamed from: B */
    private EditText f3094B;

    /* JADX INFO: renamed from: C */
    private HorizontalScrollView f3095C;

    /* JADX INFO: renamed from: D */
    private View f3096D;

    /* JADX INFO: renamed from: E */
    private ObScrollView f3097E;

    /* JADX INFO: renamed from: F */
    private ViewAnimator f3098F;

    /* JADX INFO: renamed from: G */
    private SlidingDrawer f3099G;

    /* JADX INFO: renamed from: H */
    private EditText f3100H;

    /* JADX INFO: renamed from: I */
    private EditText f3101I;

    /* JADX INFO: renamed from: J */
    private ImageButton f3102J;

    /* JADX INFO: renamed from: K */
    private ImageButton f3103K;

    /* JADX INFO: renamed from: L */
    private ImageButton f3104L;

    /* JADX INFO: renamed from: M */
    private ImageButton f3105M;

    /* JADX INFO: renamed from: N */
    private EditText f3106N;

    /* JADX INFO: renamed from: O */
    private ImageView f3107O;

    /* JADX INFO: renamed from: P */
    private ImageView f3108P;

    /* JADX INFO: renamed from: Q */
    private ImageView f3109Q;

    /* JADX INFO: renamed from: R */
    private ImageView f3110R;

    /* JADX INFO: renamed from: S */
    private ImageView f3111S;

    /* JADX INFO: renamed from: T */
    private ToggleButton f3112T;

    /* JADX INFO: renamed from: U */
    private ToggleButton f3113U;

    /* JADX INFO: renamed from: V */
    private LinearLayout f3114V;

    /* JADX INFO: renamed from: W */
    private ImageView f3115W;

    /* JADX INFO: renamed from: X */
    private C1385io f3116X;

    /* JADX INFO: renamed from: Y */
    private boolean f3117Y;

    /* JADX INFO: renamed from: Z */
    private int f3118Z;

    /* JADX INFO: renamed from: aa */
    private boolean f3119aa;

    /* JADX INFO: renamed from: ab */
    private boolean f3120ab;

    /* JADX INFO: renamed from: ac */
    private TextView f3121ac;

    /* JADX INFO: renamed from: ad */
    private View f3122ad;

    /* JADX INFO: renamed from: ae */
    private View f3123ae;

    /* JADX INFO: renamed from: af */
    private View f3124af;

    /* JADX INFO: renamed from: ag */
    private int f3125ag;

    /* JADX INFO: renamed from: ah */
    private boolean f3126ah;

    /* JADX INFO: renamed from: ai */
    private boolean f3127ai;

    /* JADX INFO: renamed from: k */
    C1387iq f3128k;

    /* JADX INFO: renamed from: l */
    protected ObEditText f3129l;

    /* JADX INFO: renamed from: m */
    public int f3130m;

    /* JADX INFO: renamed from: r */
    private boolean f3131r;

    /* JADX INFO: renamed from: s */
    private boolean f3132s;

    /* JADX INFO: renamed from: t */
    private int f3133t;

    /* JADX INFO: renamed from: u */
    private int f3134u;

    /* JADX INFO: renamed from: v */
    private int f3135v;

    /* JADX INFO: renamed from: w */
    private int f3136w;

    /* JADX INFO: renamed from: x */
    private Handler f3137x;

    /* JADX INFO: renamed from: y */
    private C1383im f3138y;

    /* JADX INFO: renamed from: z */
    private LinearLayout f3139z;

    public TextEditNormalActivity() {
        super(false, true);
        this.f3131r = true;
        this.f3132s = false;
        this.f3133t = -1;
        this.f3134u = -1;
        this.f3136w = 20;
        this.f3137x = new Handler();
        this.f3128k = new C1387iq(this);
        this.f3138y = new C1383im(this);
        this.f3117Y = true;
        this.f3119aa = false;
        this.f3120ab = false;
        this.f3126ah = true;
        this.f3127ai = false;
    }

    /* JADX INFO: renamed from: a */
    static /* synthetic */ int m2854a(TextEditNormalActivity textEditNormalActivity, int i) {
        textEditNormalActivity.f3134u = -1;
        return -1;
    }

    /* JADX INFO: renamed from: a */
    private static void m2855a(ImageView imageView, boolean z) {
        if (z) {
            imageView.getDrawable().setAlpha(255);
            imageView.setClickable(true);
        } else {
            imageView.getDrawable().setAlpha(80);
            imageView.setClickable(false);
        }
    }

    /* JADX INFO: renamed from: a */
    static /* synthetic */ void m2857a(TextEditNormalActivity textEditNormalActivity, boolean z, int i) {
        if (z && i == textEditNormalActivity.f3118Z) {
            return;
        }
        textEditNormalActivity.f3117Y = z;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) textEditNormalActivity.f3094B.getLayoutParams();
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) textEditNormalActivity.f3096D.getLayoutParams();
        if (z) {
            if (SettingEditorActivity.m2827e(textEditNormalActivity)) {
                textEditNormalActivity.f3094B.setVisibility(0);
                textEditNormalActivity.f3096D.setVisibility(0);
            }
            String str = "";
            for (int i2 = 0; i2 < i; i2++) {
                str = str + "9";
            }
            textEditNormalActivity.f3118Z = i;
            layoutParams.width = ((int) textEditNormalActivity.f3129l.getPaint().measureText(str)) + ((int) TypedValue.applyDimension(1, 6.0f, textEditNormalActivity.getResources().getDisplayMetrics()));
            layoutParams2.width = 1;
        } else {
            textEditNormalActivity.f3094B.setVisibility(8);
            textEditNormalActivity.f3096D.setVisibility(8);
            layoutParams.width = 0;
            layoutParams2.width = 0;
            textEditNormalActivity.f3118Z = 0;
        }
        textEditNormalActivity.f3094B.requestLayout();
        textEditNormalActivity.f3096D.requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m2858a(InterfaceC1560i interfaceC1560i) {
        new DialogC1284ey(this, new C1381ik(this, interfaceC1560i), R.string.file_saved).show();
    }

    /* JADX INFO: renamed from: a */
    static /* synthetic */ boolean m2860a(TextEditNormalActivity textEditNormalActivity, boolean z) {
        textEditNormalActivity.f3132s = false;
        return false;
    }

    /* JADX INFO: renamed from: b */
    static /* synthetic */ int m2861b(TextEditNormalActivity textEditNormalActivity, int i) {
        textEditNormalActivity.f3133t = -1;
        return -1;
    }

    /* JADX INFO: renamed from: b */
    static /* synthetic */ boolean m2863b(TextEditNormalActivity textEditNormalActivity, boolean z) {
        textEditNormalActivity.f3126ah = false;
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public boolean m2864b(boolean z) {
        if (this.f3100H.getText().toString().equals("")) {
            return false;
        }
        if (m2874f()) {
            this.f3129l.requestFocus();
            return true;
        }
        int selectionStart = this.f3129l.getSelectionStart();
        int selectionEnd = this.f3129l.getSelectionEnd();
        this.f3129l.setSelection(0);
        if (m2874f()) {
            this.f3129l.requestFocus();
            return true;
        }
        this.f3129l.setSelection(selectionStart, selectionEnd);
        if (!z) {
            return false;
        }
        Toast.makeText(getApplicationContext(), getString(R.string.not_found), 0).show();
        return false;
    }

    /* JADX INFO: renamed from: c */
    private void m2866c(boolean z) {
        if (!z) {
            this.f3129l.setMaxWidth(((this.f3139z.getWidth() - this.f3094B.getWidth()) - this.f3096D.getWidth()) - this.f3099G.getWidth());
            return;
        }
        int width = this.f3139z.getWidth();
        int width2 = this.f3094B.getWidth();
        this.f3129l.setMaxWidth(((width - width2) - this.f3096D.getWidth()) - this.f3115W.getWidth());
    }

    /* JADX INFO: renamed from: c */
    static /* synthetic */ boolean m2868c(TextEditNormalActivity textEditNormalActivity, boolean z) {
        textEditNormalActivity.f3127ai = true;
        return true;
    }

    /* JADX INFO: renamed from: d */
    private void m2870d(int i) {
        byte b2 = 0;
        if (this.f3919j.m3912b()) {
            new AlertDialog.Builder(this).setMessage(R.string.save_changes_tip).setPositiveButton(R.string.save, new DialogInterfaceOnClickListenerC1379ii(this, i)).setNegativeButton(R.string.donot_save, new DialogInterfaceOnClickListenerC1378ih(this, i)).setNeutralButton(android.R.string.cancel, (DialogInterface.OnClickListener) null).show();
        } else {
            this.f3914e += i;
            new AsyncTaskC1386ip(this, b2).execute(new Void[0]);
        }
    }

    /* JADX INFO: renamed from: e */
    private void m2873e(int i) {
        int i2 = i <= 40 ? i : 40;
        int i3 = i2 >= 4 ? i2 : 4;
        this.f3129l.setTextSize(2, i3);
        this.f3094B.setTextSize(2, i3);
        this.f3118Z = 0;
    }

    /* JADX INFO: renamed from: f */
    private boolean m2874f() {
        int i = this.f3112T.isChecked() ? 10 : 8;
        if (this.f3113U != null && !this.f3113U.isChecked()) {
            i |= 16;
        }
        try {
            Matcher matcher = Pattern.compile(this.f3100H.getText().toString(), i).matcher(this.f3919j.m3904a());
            if (matcher.find(this.f3129l.getSelectionEnd())) {
                this.f3129l.setSelection(matcher.start(), matcher.end());
                return true;
            }
            this.f3129l.setSelection(this.f3129l.getSelectionEnd());
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public void m2877g() {
        try {
            int iMin = Math.min(this.f3129l.getSelectionStart(), this.f3129l.getSelectionEnd());
            int iMax = Math.max(this.f3129l.getSelectionStart(), this.f3129l.getSelectionEnd());
            if (iMin != iMax) {
                String string = this.f3129l.getText().subSequence(iMin, iMax).toString();
                String string2 = this.f3100H.getText().toString();
                if ((this.f3112T.isChecked() ? Pattern.compile(string2, 10) : Pattern.compile(string2)).matcher(string).matches()) {
                    this.f3103K.setEnabled(true);
                    this.f3104L.setEnabled(true);
                    return;
                }
            }
        } catch (Exception e) {
        }
        this.f3103K.setEnabled(false);
        this.f3104L.setEnabled(false);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m2878g(String str) {
        String[] strArrSplit = str.split("/");
        return strArrSplit.length > 2 && strArrSplit[strArrSplit.length + (-2)].startsWith("values");
    }

    /* JADX INFO: renamed from: m */
    static /* synthetic */ boolean m2884m(TextEditNormalActivity textEditNormalActivity) {
        return false;
    }

    /* JADX INFO: renamed from: n */
    static /* synthetic */ void m2885n(TextEditNormalActivity textEditNormalActivity) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textEditNormalActivity.f3114V.getLayoutParams();
        layoutParams.setMargins(0, 0, textEditNormalActivity.f3099G.getWidth(), layoutParams.bottomMargin);
        textEditNormalActivity.f3114V.requestLayout();
        if (textEditNormalActivity.f3915f) {
            textEditNormalActivity.m2866c(true);
            textEditNormalActivity.m2891a(false);
        }
        textEditNormalActivity.f3115W.setImageResource(R.drawable.edit_slide_right);
    }

    /* JADX INFO: renamed from: o */
    static /* synthetic */ void m2886o(TextEditNormalActivity textEditNormalActivity) {
        textEditNormalActivity.f3099G.setVisibility(8);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textEditNormalActivity.f3114V.getLayoutParams();
        layoutParams.setMargins(0, 0, 0, layoutParams.bottomMargin);
        textEditNormalActivity.f3114V.requestLayout();
        if (textEditNormalActivity.f3915f) {
            textEditNormalActivity.m2866c(false);
            textEditNormalActivity.m2891a(false);
        }
        textEditNormalActivity.f3115W.setImageResource(R.drawable.edit_slide_left);
        textEditNormalActivity.f3098F.setDisplayedChild(0);
    }

    /* JADX INFO: renamed from: r */
    static /* synthetic */ void m2889r(TextEditNormalActivity textEditNormalActivity) {
        View currentFocus = textEditNormalActivity.getCurrentFocus();
        if (currentFocus != null) {
            ((InputMethodManager) textEditNormalActivity.getSystemService("input_method")).showSoftInput(currentFocus, 0);
        }
    }

    @Override // com.gmail.heagoo.apkeditor.AbstractActivityC1341gy, com.gmail.heagoo.apkeditor.InterfaceC1221dn
    /* JADX INFO: renamed from: a */
    public final void mo2850a(int i, int i2) {
        boolean z = false;
        if (this.f3918i == 2) {
            String[] strArrSplit = this.f3129l.getText().toString().split("\n");
            if (i <= 0) {
                i = 1;
            }
            if (i2 > strArrSplit.length) {
                i2 = strArrSplit.length;
            }
            if (i <= i2) {
                int length = 0;
                for (int i3 = 1; i3 < i; i3++) {
                    length += strArrSplit[i3 - 1].length() + 1;
                }
                int length2 = length;
                for (int i4 = i; i4 <= i2; i4++) {
                    length2 += strArrSplit[i4 - 1].length() + 1;
                }
                this.f3129l.getText().replace(length, length2, "");
                Toast.makeText(this, String.format(getString(R.string.n_lines_deleted), Integer.valueOf((i2 - i) + 1)), 1).show();
                z = true;
            }
        } else if (this.f3918i == 5) {
            String[] strArrSplit2 = this.f3129l.getText().toString().split("\n");
            if (i <= 0) {
                i = 1;
            }
            if (i2 > strArrSplit2.length) {
                i2 = strArrSplit2.length;
            }
            if (i <= i2) {
                StringBuilder sb = new StringBuilder();
                int length3 = 0;
                for (int i5 = 1; i5 < i; i5++) {
                    length3 += strArrSplit2[i5 - 1].length() + 1;
                }
                int length4 = length3;
                for (int i6 = i; i6 <= i2; i6++) {
                    length4 += strArrSplit2[i6 - 1].length() + 1;
                }
                boolean zA = m3384a(strArrSplit2, i, i2, "#");
                if (zA) {
                    for (int i7 = i; i7 <= i2; i7++) {
                        int iIndexOf = strArrSplit2[i7 - 1].indexOf(35);
                        if (iIndexOf > 0) {
                            sb.append(strArrSplit2[i7 - 1].substring(0, iIndexOf));
                        }
                        sb.append(strArrSplit2[i7 - 1].substring(iIndexOf + 1));
                        sb.append("\n");
                    }
                } else {
                    for (int i8 = i; i8 <= i2; i8++) {
                        sb.append("#");
                        sb.append(strArrSplit2[i8 - 1]);
                        sb.append("\n");
                    }
                }
                this.f3129l.getText().replace(length3, length4, sb.toString());
                Toast.makeText(this, String.format(zA ? getString(R.string.n_lines_uncommented) : getString(R.string.n_lines_commented), Integer.valueOf((i2 - i) + 1)), 1).show();
                z = true;
            }
        }
        if (z) {
            this.f3919j.m3911a(true);
            m2893d();
        }
    }

    /* JADX INFO: renamed from: a */
    protected final void m2890a(int i, int i2, boolean z) {
        if (this.f3131r) {
            if (this.f3134u == -1 || i < this.f3134u) {
                this.f3134u = i;
            }
            if (this.f3133t == -1 || i2 > this.f3133t) {
                this.f3133t = i2;
            }
            this.f3132s = z;
            this.f3137x.removeCallbacks(this.f3138y);
            if (z) {
                this.f3137x.postDelayed(this.f3138y, f3091p);
            } else {
                this.f3137x.postDelayed(this.f3138y, f3092q);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    protected final void m2891a(boolean z) {
        if (this.f3125ag > 0) {
            String[] strArrSplit = this.f3129l.getText().toString().split("\n");
            int length = this.f3125ag > strArrSplit.length ? strArrSplit.length : this.f3125ag;
            int length2 = 0;
            for (int i = 0; i < length - 1; i++) {
                length2 += strArrSplit[i].length() + 1;
            }
            this.f3129l.setSelection(length2);
            this.f3129l.requestFocus();
            View currentFocus = getCurrentFocus();
            if (currentFocus != null) {
                ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
            }
            this.f3125ag = -1;
        }
        if (!this.f3117Y) {
            if (this.f3095C != null && String.valueOf(this.f3130m).length() != String.valueOf(this.f3129l.getLineCount()).length()) {
                this.f3095C.requestLayout();
            }
            this.f3130m = this.f3129l.getLineCount();
            return;
        }
        this.f3137x.removeCallbacks(this.f3128k);
        if (z) {
            this.f3137x.postDelayed(this.f3128k, f3090o);
        } else {
            this.f3137x.postDelayed(this.f3128k, 0L);
        }
    }

    @Override // com.gmail.heagoo.apkeditor.InterfaceC1334gr
    /* JADX INFO: renamed from: b */
    public final void mo2851b(int i) {
        if (i > 0) {
            String[] strArrSplit = this.f3129l.getText().toString().split("\n");
            if (i > strArrSplit.length) {
                i = strArrSplit.length;
            }
            int length = 0;
            for (int i2 = 0; i2 < i - 1; i2++) {
                length += strArrSplit[i2].length() + 1;
            }
            this.f3106N.setText("");
            this.f3129l.setSelection(length);
            this.f3129l.requestFocus();
        }
    }

    @Override // com.gmail.heagoo.neweditor.InterfaceC1585ad
    /* JADX INFO: renamed from: b */
    public final void mo2892b(int i, int i2) {
        if (i == i2) {
            m2855a(this.f3109Q, false);
        } else {
            m2855a(this.f3109Q, true);
        }
        if (this.f3099G.isOpened()) {
            m2877g();
        }
    }

    @Override // com.gmail.heagoo.apkeditor.AbstractActivityC1341gy
    /* JADX INFO: renamed from: c */
    protected final void mo2852c(int i) {
        if (this.f3129l != null) {
            this.f3129l.getText().replace(this.f3129l.getSelectionStart(), this.f3129l.getSelectionEnd(), new StringBuilder().append(m3401b((String) null).charAt(i)).toString());
            this.f3129l.requestFocus();
        }
    }

    /* JADX INFO: renamed from: d */
    protected final synchronized void m2893d() {
        boolean zM3912b;
        C1594e c1594e = this.f3919j;
        if (c1594e != null && this.f3120ab != (zM3912b = c1594e.m3912b())) {
            if (zM3912b) {
                m2855a(this.f3108P, true);
            } else {
                m2855a(this.f3108P, false);
            }
            this.f3108P.invalidate();
            this.f3120ab = zM3912b;
        }
    }

    /* JADX INFO: renamed from: e */
    protected final synchronized void m2894e() {
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (this.f3919j == null || this.f3919j.m3912b()) {
            new AlertDialog.Builder(this).setMessage(R.string.save_changes_tip).setPositiveButton(R.string.save, new DialogInterfaceOnClickListenerC1371ia(this)).setNegativeButton(R.string.donot_save, new DialogInterfaceOnClickListenerC1369hz(this)).setNeutralButton(android.R.string.cancel, (DialogInterface.OnClickListener) null).show();
        } else {
            finish();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int length = 0;
        int id = view.getId();
        if (id == R.id.menu_next) {
            m2870d(1);
            return;
        }
        if (id == R.id.menu_previous) {
            m2870d(-1);
            return;
        }
        if (id == R.id.moreBtn) {
            m3398a(view);
            return;
        }
        if (id == R.id.openFindBtn) {
            if (this.f3099G.getVisibility() == 8) {
                this.f3099G.animateOpen();
                this.f3099G.setVisibility(0);
            } else {
                this.f3099G.close();
                this.f3099G.setVisibility(8);
                this.f3129l.requestFocus();
            }
            int iMin = Math.min(this.f3129l.getSelectionStart(), this.f3129l.getSelectionEnd());
            int iMax = Math.max(this.f3129l.getSelectionStart(), this.f3129l.getSelectionEnd());
            if (iMin < iMax) {
                String string = this.f3129l.getText().subSequence(iMin, iMax).toString();
                if (!string.contains("\n")) {
                    this.f3100H.setText(string);
                }
            } else if (this.f3910a != null && "".equals(this.f3100H.getText().toString())) {
                this.f3100H.setText(this.f3910a);
            }
            this.f3100H.requestFocus();
            return;
        }
        if (id == R.id.findBtn) {
            m2864b(true);
            return;
        }
        if (id == R.id.replaceBtn) {
            this.f3129l.getEditableText().replace(this.f3129l.getSelectionStart(), this.f3129l.getSelectionEnd(), this.f3101I.getText());
            m2864b(true);
            return;
        }
        if (id == R.id.replaceAllBtn) {
            int i = this.f3112T.isChecked() ? 10 : 8;
            if (this.f3113U != null && !this.f3113U.isChecked()) {
                i |= 16;
            }
            try {
                Matcher matcher = Pattern.compile(this.f3100H.getText().toString(), i).matcher(this.f3919j.m3904a());
                ArrayList arrayList = new ArrayList();
                int iEnd = 0;
                while (matcher.find(iEnd)) {
                    int iStart = matcher.start();
                    iEnd = matcher.end();
                    arrayList.add(new C1382il(iStart, iEnd, (byte) 0));
                }
                if (arrayList.isEmpty()) {
                    Toast.makeText(getApplicationContext(), getString(R.string.not_found), 0).show();
                    return;
                }
                String string2 = this.f3101I.getText().toString();
                int i2 = 0;
                while (i2 < arrayList.size()) {
                    C1382il c1382il = (C1382il) arrayList.get(i2);
                    this.f3129l.getEditableText().replace(c1382il.f4020a + length, c1382il.f4021b + length, string2);
                    i2++;
                    length = (string2.length() - (c1382il.f4021b - c1382il.f4020a)) + length;
                }
                Toast.makeText(getApplicationContext(), String.format(getString(R.string.replace_all_ret), Integer.valueOf(arrayList.size())), 0).show();
                return;
            } catch (Exception e) {
                return;
            }
        }
        if (id == R.id.goBtn) {
            String strTrim = this.f3106N.getText().toString().trim();
            if (strTrim.equals("")) {
                this.f3129l.getText().insert(this.f3129l.getSelectionStart(), "\n");
                this.f3129l.requestFocus();
                return;
            } else {
                try {
                    mo2851b(Integer.valueOf(strTrim).intValue());
                    return;
                } catch (Exception e2) {
                    return;
                }
            }
        }
        if (id == R.id.saveBtn) {
            m2858a((InterfaceC1560i) null);
            return;
        }
        if (id == R.id.copyBtn) {
            String strSubstring = this.f3129l.getText().toString().substring(this.f3129l.getSelectionStart(), this.f3129l.getSelectionEnd());
            if (strSubstring == null || strSubstring.equals("")) {
                return;
            }
            C1067a.m2519c(this, strSubstring);
            if (strSubstring.contains("\n")) {
                Toast.makeText(this, R.string.selected_str_copied, 0).show();
                return;
            } else {
                Toast.makeText(this, String.format(getString(R.string.copied_to_clipboard), strSubstring), 0).show();
                return;
            }
        }
        if (id != R.id.pasteBtn) {
            if (id == R.id.menu_methods) {
                m3403b(view);
            }
        } else {
            String strM2500b = C1067a.m2500b(this);
            if (strM2500b == null) {
                Toast.makeText(this, R.string.clipboard_no_text, 0).show();
            } else {
                this.f3129l.getText().replace(this.f3129l.getSelectionStart(), this.f3129l.getSelectionEnd(), strM2500b);
                this.f3129l.requestFocus();
            }
        }
    }

    @Override // com.gmail.heagoo.apkeditor.AbstractActivityC1341gy, android.app.Activity
    @SuppressLint({"NewApi"})
    public void onCreate(Bundle bundle) {
        byte b2 = 0;
        super.onCreate(bundle);
        this.f3121ac = (TextView) findViewById(R.id.filename);
        this.f3122ad = findViewById(R.id.menu_previous);
        this.f3123ae = findViewById(R.id.menu_next);
        this.f3124af = findViewById(R.id.menu_methods);
        this.f3122ad.setOnClickListener(this);
        this.f3123ae.setOnClickListener(this);
        this.f3124af.setOnClickListener(this);
        this.f3139z = (LinearLayout) findViewById(R.id.editorLayout);
        this.f3093A = (FrameLayout) findViewById(R.id.center_layout);
        this.f3094B = (EditText) findViewById(R.id.lineNumbers);
        this.f3094B.setFilters(new InputFilter[0]);
        this.f3129l = (ObEditText) findViewById(R.id.editor);
        this.f3129l.setFilters(new InputFilter[0]);
        this.f3096D = findViewById(R.id.divider);
        this.f3097E = (ObScrollView) findViewById(R.id.editorScrollview);
        this.f3095C = (HorizontalScrollView) findViewById(R.id.hScrollView);
        this.f3098F = (ViewAnimator) findViewById(R.id.searchAnimator);
        this.f3099G = (SlidingDrawer) findViewById(R.id.sliding_drawer);
        this.f3100H = (EditText) findViewById(R.id.findEdit);
        this.f3101I = (EditText) findViewById(R.id.replaceEdit);
        this.f3102J = (ImageButton) findViewById(R.id.findBtn);
        this.f3103K = (ImageButton) findViewById(R.id.replaceBtn);
        this.f3104L = (ImageButton) findViewById(R.id.replaceAllBtn);
        this.f3107O = (ImageView) findViewById(R.id.openFindBtn);
        this.f3112T = (ToggleButton) findViewById(R.id.checkBoxIgnoreCase);
        this.f3113U = (ToggleButton) findViewById(R.id.checkBoxRegexp);
        this.f3108P = (ImageView) findViewById(R.id.saveBtn);
        this.f3109Q = (ImageView) findViewById(R.id.copyBtn);
        this.f3110R = (ImageView) findViewById(R.id.pasteBtn);
        this.f3111S = (ImageView) findViewById(R.id.moreBtn);
        this.f3105M = (ImageButton) findViewById(R.id.goBtn);
        this.f3106N = (EditText) findViewById(R.id.lineNumEdit);
        this.f3114V = this.f3139z;
        this.f3115W = (ImageView) findViewById(R.id.panel_button);
        m2855a(this.f3109Q, false);
        this.f3129l.m3865b(this.f3915f);
        this.f3129l.setInputType(720897);
        this.f3135v = SettingEditorActivity.m2823b(this);
        m2873e(this.f3135v);
        this.f3107O.setOnClickListener(this);
        this.f3102J.setOnClickListener(this);
        this.f3103K.setOnClickListener(this);
        this.f3104L.setOnClickListener(this);
        this.f3108P.setOnClickListener(this);
        this.f3105M.setOnClickListener(this);
        this.f3109Q.setOnClickListener(this);
        this.f3110R.setOnClickListener(this);
        this.f3111S.setOnClickListener(this);
        this.f3108P.getDrawable().setAlpha(80);
        this.f3108P.setClickable(false);
        this.f3103K.setEnabled(false);
        this.f3104L.setEnabled(false);
        C1592c c1592c = new C1592c(this);
        this.f3139z.setBackgroundColor(c1592c.m3894a());
        this.f3093A.setBackgroundColor(c1592c.m3894a());
        this.f3094B.setBackgroundColor(c1592c.m3894a());
        this.f3129l.setBackgroundColor(c1592c.m3894a());
        this.f3129l.setTextColor(c1592c.m3896b());
        this.f3094B.setTextColor(c1592c.m3896b());
        this.f3096D.setBackgroundColor(c1592c.m3896b());
        ObEditText obEditText = this.f3129l;
        int iM3894a = c1592c.m3894a();
        obEditText.m3860a(Color.argb(128, 255 - Color.red(iM3894a), 255 - Color.green(iM3894a), 255 - Color.blue(iM3894a)));
        this.f3094B.setOnLongClickListener(null);
        this.f3099G.setOnDrawerOpenListener(new C1368hy(this));
        this.f3099G.setOnDrawerCloseListener(new C1373ic(this));
        this.f3129l.m3862a(this);
        this.f3116X = new C1385io(this, b2);
        this.f3129l.addTextChangedListener(this.f3116X);
        this.f3097E.m3866a(new C1374id(this));
        this.f3100H.setOnKeyListener(new ViewOnKeyListenerC1375ie(this));
        this.f3101I.setOnKeyListener(new ViewOnKeyListenerC1376if(this));
        this.f3129l.setOnTouchListener(new ViewOnTouchListenerC1377ig(this));
        super.m3399a((InterfaceC1608s) this.f3129l);
        new AsyncTaskC1386ip(this, b2).execute(new Void[0]);
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
        if (this.f3135v != iM2823b) {
            this.f3135v = iM2823b;
            m2873e(iM2823b);
            m2891a(true);
            m2890a(-1, -1, false);
            m2893d();
        }
        if (!SettingEditorActivity.m2827e(this)) {
            this.f3094B.setVisibility(8);
            this.f3096D.setVisibility(8);
            return;
        }
        this.f3094B.setVisibility(0);
        this.f3096D.setVisibility(0);
        if (this.f3127ai) {
            m2891a(false);
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
}
