package com.gmail.heagoo.neweditor;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.util.TypedValue;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.SlidingDrawer;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;
import android.widget.ViewAnimator;
import com.gmail.heagoo.apkeditor.pro.R;
import com.gmail.heagoo.common.DialogC1567p;
import com.gmail.heagoo.p084a.p089c.C1067a;
import com.masrull.listview.JazzyHelper;
import java.io.File;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class EditorActivity extends Activity implements View.OnClickListener {

    /* JADX INFO: renamed from: d */
    private static int f4689d = JazzyHelper.DURATION;

    /* JADX INFO: renamed from: e */
    private static int f4690e = JazzyHelper.DURATION;

    /* JADX INFO: renamed from: f */
    private static int f4691f = 400;

    /* JADX INFO: renamed from: g */
    private static int f4692g = 100;

    /* JADX INFO: renamed from: A */
    private EditText f4693A;

    /* JADX INFO: renamed from: B */
    private ImageButton f4694B;

    /* JADX INFO: renamed from: C */
    private ImageButton f4695C;

    /* JADX INFO: renamed from: D */
    private ImageView f4696D;

    /* JADX INFO: renamed from: E */
    private ImageView f4697E;

    /* JADX INFO: renamed from: F */
    private ImageView f4698F;

    /* JADX INFO: renamed from: G */
    private ToggleButton f4699G;

    /* JADX INFO: renamed from: H */
    private ToggleButton f4700H;

    /* JADX INFO: renamed from: I */
    private LinearLayout f4701I;

    /* JADX INFO: renamed from: J */
    private ImageView f4702J;

    /* JADX INFO: renamed from: K */
    private ScrollView f4703K;

    /* JADX INFO: renamed from: L */
    private String f4704L;

    /* JADX INFO: renamed from: M */
    private String f4705M;

    /* JADX INFO: renamed from: N */
    private String f4706N;

    /* JADX INFO: renamed from: O */
    private boolean f4707O;

    /* JADX INFO: renamed from: P */
    private C1594e f4708P;

    /* JADX INFO: renamed from: R */
    private int f4710R;

    /* JADX INFO: renamed from: U */
    private int f4713U;

    /* JADX INFO: renamed from: V */
    private int f4714V;

    /* JADX INFO: renamed from: W */
    private int f4715W;

    /* JADX INFO: renamed from: a */
    protected ObEditText f4716a;

    /* JADX INFO: renamed from: b */
    public int f4717b;

    /* JADX INFO: renamed from: m */
    private int f4724m;

    /* JADX INFO: renamed from: r */
    private boolean f4729r;

    /* JADX INFO: renamed from: s */
    private LinearLayout f4730s;

    /* JADX INFO: renamed from: t */
    private FrameLayout f4731t;

    /* JADX INFO: renamed from: u */
    private EditText f4732u;

    /* JADX INFO: renamed from: v */
    private View f4733v;

    /* JADX INFO: renamed from: w */
    private ObScrollView f4734w;

    /* JADX INFO: renamed from: x */
    private ViewAnimator f4735x;

    /* JADX INFO: renamed from: y */
    private SlidingDrawer f4736y;

    /* JADX INFO: renamed from: z */
    private EditText f4737z;

    /* JADX INFO: renamed from: h */
    private boolean f4719h = true;

    /* JADX INFO: renamed from: i */
    private boolean f4720i = false;

    /* JADX INFO: renamed from: j */
    private int f4721j = -1;

    /* JADX INFO: renamed from: k */
    private int f4722k = -1;

    /* JADX INFO: renamed from: l */
    private boolean f4723l = true;

    /* JADX INFO: renamed from: n */
    private int f4725n = 50;

    /* JADX INFO: renamed from: o */
    private Handler f4726o = new Handler();

    /* JADX INFO: renamed from: p */
    private C1607r f4727p = new C1607r(this);

    /* JADX INFO: renamed from: q */
    private C1605p f4728q = new C1605p(this);

    /* JADX INFO: renamed from: Q */
    private boolean f4709Q = true;

    /* JADX INFO: renamed from: S */
    private boolean f4711S = false;

    /* JADX INFO: renamed from: T */
    private boolean f4712T = false;

    /* JADX INFO: renamed from: c */
    protected boolean f4718c = false;

    /* JADX INFO: renamed from: a */
    static /* synthetic */ int m3827a(EditorActivity editorActivity, int i) {
        editorActivity.f4722k = -1;
        return -1;
    }

    /* JADX INFO: renamed from: a */
    private void m3828a(int i) {
        int i2 = i <= 40 ? i : 40;
        int i3 = i2 >= 4 ? i2 : 4;
        this.f4716a.setTextSize(2, i3);
        this.f4732u.setTextSize(2, i3);
        this.f4710R = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m3830a(boolean z, int i) {
        if (z && i == this.f4710R) {
            return;
        }
        this.f4709Q = z;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f4732u.getLayoutParams();
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f4733v.getLayoutParams();
        if (z) {
            this.f4732u.setVisibility(0);
            this.f4733v.setVisibility(0);
            String str = "";
            for (int i2 = 0; i2 < i; i2++) {
                str = String.valueOf(str) + "9";
            }
            this.f4710R = i;
            layoutParams.width = ((int) this.f4716a.getPaint().measureText(str)) + ((int) TypedValue.applyDimension(1, 6.0f, getResources().getDisplayMetrics()));
            layoutParams2.width = 1;
        } else {
            this.f4732u.setVisibility(8);
            this.f4733v.setVisibility(8);
            layoutParams.width = 0;
            layoutParams2.width = 0;
            this.f4710R = 0;
        }
        this.f4732u.requestLayout();
        this.f4733v.requestLayout();
    }

    /* JADX INFO: renamed from: a */
    static /* synthetic */ boolean m3832a(EditorActivity editorActivity, boolean z) {
        editorActivity.f4720i = false;
        return false;
    }

    /* JADX INFO: renamed from: b */
    static /* synthetic */ int m3833b(EditorActivity editorActivity, int i) {
        editorActivity.f4721j = -1;
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public boolean m3837c(boolean z) {
        if (this.f4737z.getText().toString().equals("")) {
            return false;
        }
        if (m3841e()) {
            this.f4716a.requestFocus();
            return true;
        }
        int selectionStart = this.f4716a.getSelectionStart();
        int selectionEnd = this.f4716a.getSelectionEnd();
        this.f4716a.setSelection(0);
        if (m3841e()) {
            this.f4716a.requestFocus();
            return true;
        }
        this.f4716a.setSelection(selectionStart, selectionEnd);
        if (!z) {
            return false;
        }
        Toast.makeText(getApplicationContext(), getString(this.f4715W), 0).show();
        return false;
    }

    /* JADX INFO: renamed from: d */
    private void m3839d(boolean z) {
        if (!z) {
            this.f4716a.setMaxWidth(((this.f4730s.getWidth() - this.f4732u.getWidth()) - this.f4733v.getWidth()) - this.f4736y.getWidth());
            return;
        }
        int width = this.f4730s.getWidth();
        int width2 = this.f4732u.getWidth();
        int width3 = this.f4733v.getWidth();
        this.f4716a.setMaxWidth(((width - width2) - width3) - this.f4702J.getWidth());
    }

    /* JADX INFO: renamed from: e */
    private boolean m3841e() {
        int i = this.f4699G.isChecked() ? 10 : 8;
        if (this.f4700H != null && !this.f4700H.isChecked()) {
            i |= 16;
        }
        try {
            Matcher matcher = Pattern.compile(this.f4737z.getText().toString(), i).matcher(this.f4708P.m3904a().toString());
            if (matcher.find(this.f4716a.getSelectionEnd())) {
                this.f4716a.setSelection(matcher.start(), matcher.end());
                return true;
            }
            this.f4716a.setSelection(this.f4716a.getSelectionEnd());
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    /* JADX INFO: renamed from: i */
    static /* synthetic */ void m3845i(EditorActivity editorActivity) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) editorActivity.f4701I.getLayoutParams();
        layoutParams.setMargins(0, 0, editorActivity.f4736y.getWidth(), layoutParams.bottomMargin);
        editorActivity.f4701I.requestLayout();
        if (editorActivity.f4723l) {
            editorActivity.m3839d(true);
            editorActivity.m3855a(false);
        }
        editorActivity.f4702J.setImageResource(R.drawable.edit_slide_right);
    }

    /* JADX INFO: renamed from: j */
    static /* synthetic */ void m3846j(EditorActivity editorActivity) {
        editorActivity.f4736y.setVisibility(8);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) editorActivity.f4701I.getLayoutParams();
        layoutParams.setMargins(0, 0, 0, layoutParams.bottomMargin);
        editorActivity.f4701I.requestLayout();
        if (editorActivity.f4723l) {
            editorActivity.m3839d(false);
            editorActivity.m3855a(false);
        }
        editorActivity.f4702J.setImageResource(R.drawable.edit_slide_left);
        editorActivity.f4735x.setDisplayedChild(0);
    }

    /* JADX INFO: renamed from: l */
    static /* synthetic */ void m3848l(EditorActivity editorActivity) {
        try {
            int iMin = Math.min(editorActivity.f4716a.getSelectionStart(), editorActivity.f4716a.getSelectionEnd());
            int iMax = Math.max(editorActivity.f4716a.getSelectionStart(), editorActivity.f4716a.getSelectionEnd());
            if (iMin != iMax) {
                String string = editorActivity.f4716a.getText().subSequence(iMin, iMax).toString();
                String string2 = editorActivity.f4737z.getText().toString();
                if ((editorActivity.f4699G.isChecked() ? Pattern.compile(string2, 10) : Pattern.compile(string2)).matcher(string).matches()) {
                    editorActivity.f4695C.setEnabled(true);
                    return;
                }
            }
        } catch (Exception e) {
        }
        editorActivity.f4695C.setEnabled(false);
    }

    /* JADX INFO: renamed from: a */
    protected final synchronized void m3853a() {
        boolean zM3912b = this.f4708P.m3912b();
        if (this.f4712T != zM3912b) {
            if (zM3912b) {
                this.f4697E.getDrawable().setAlpha(255);
                this.f4697E.setClickable(true);
            } else {
                this.f4697E.getDrawable().setAlpha(80);
                this.f4697E.setClickable(false);
            }
            this.f4697E.invalidate();
            this.f4712T = zM3912b;
        }
    }

    /* JADX INFO: renamed from: a */
    protected final void m3854a(int i, int i2, boolean z) {
        if (this.f4719h) {
            if (this.f4722k == -1 || i < this.f4722k) {
                this.f4722k = i;
            }
            if (this.f4721j == -1 || i2 > this.f4721j) {
                this.f4721j = i2;
            }
            this.f4720i = z;
            this.f4726o.removeCallbacks(this.f4728q);
            if (this.f4729r) {
                this.f4726o.postDelayed(this.f4728q, f4689d);
            } else if (z) {
                this.f4726o.postDelayed(this.f4728q, f4691f);
            } else {
                this.f4726o.postDelayed(this.f4728q, f4692g);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    protected final void m3855a(boolean z) {
        if (!this.f4709Q) {
            this.f4717b = this.f4716a.getLineCount();
            return;
        }
        this.f4726o.removeCallbacks(this.f4727p);
        if (z) {
            this.f4726o.postDelayed(this.f4727p, f4690e);
        } else {
            this.f4726o.postDelayed(this.f4727p, 0L);
        }
    }

    /* JADX INFO: renamed from: b */
    protected final synchronized void m3856b() {
    }

    /* JADX INFO: renamed from: b */
    protected final void m3857b(boolean z) {
        C1594e c1594e = this.f4708P;
        this.f4729r = true;
        this.f4716a.setText(c1594e.m3904a());
        this.f4729r = false;
        Handler handler = new Handler();
        this.f4716a.m3861a(0, 0);
        handler.postDelayed(new RunnableC1596g(this, c1594e), 400L);
        m3855a(true);
        m3856b();
        m3853a();
    }

    /* JADX INFO: renamed from: c */
    protected final void m3858c() {
        C1067a.m2452a("com.gmail.heagoo.appdm.util.FileCopyUtil", "copyBack", new Class[]{Context.class, String.class, String.class, Boolean.TYPE}, new Object[]{this, this.f4704L, this.f4705M, Boolean.valueOf(this.f4707O)});
    }

    /* JADX INFO: renamed from: d */
    protected final void m3859d() {
        Intent intent = new Intent();
        intent.putExtra("xmlPath", this.f4704L);
        setResult(1, intent);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id != R.id.openFindBtn) {
            if (id == R.id.findBtn) {
                m3837c(true);
                return;
            }
            if (id == R.id.replaceBtn) {
                this.f4716a.getEditableText().replace(this.f4716a.getSelectionStart(), this.f4716a.getSelectionEnd(), this.f4693A.getText());
                m3837c(true);
                return;
            } else {
                if (id == R.id.saveBtn) {
                    new DialogC1567p(this, new C1604o(this), this.f4714V).show();
                    return;
                }
                return;
            }
        }
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        if (Build.VERSION.SDK_INT >= 11) {
            defaultSharedPreferences.getBoolean("hideDocumentList", false);
        }
        if (this.f4736y.getVisibility() == 8) {
            this.f4736y.animateOpen();
            this.f4736y.setVisibility(0);
        } else {
            this.f4736y.close();
            this.f4736y.setVisibility(8);
            this.f4716a.requestFocus();
        }
        int iMin = Math.min(this.f4716a.getSelectionStart(), this.f4716a.getSelectionEnd());
        int iMax = Math.max(this.f4716a.getSelectionStart(), this.f4716a.getSelectionEnd());
        if (iMin < iMax) {
            String string = this.f4716a.getText().subSequence(iMin, iMax).toString();
            if (!string.contains("\n")) {
                this.f4737z.setText(string);
            }
        }
        this.f4737z.requestFocus();
    }

    @Override // android.app.Activity
    @SuppressLint({"NewApi"})
    public void onCreate(Bundle bundle) {
        String strSubstring;
        int iLastIndexOf;
        super.onCreate(bundle);
        getWindow().requestFeature(1);
        this.f4723l = true;
        if (this.f4723l) {
            setContentView(R.layout.editorutil_main);
        } else {
            setContentView(R.layout.editorutil_main);
        }
        try {
            Bundle extras = getIntent().getExtras();
            this.f4704L = extras.getString("filePath");
            this.f4705M = extras.getString("realFilePath");
            this.f4706N = extras.getString("syntaxFileName");
            this.f4707O = extras.getBoolean("isRootMode");
            int[] intArray = extras.getIntArray("resourceIds");
            this.f4713U = intArray[0];
            this.f4714V = intArray[1];
            this.f4715W = intArray[2];
            if (bundle != null) {
                this.f4718c = bundle.getBoolean("modifySaved", false);
                if (this.f4718c) {
                    m3859d();
                }
            }
            this.f4708P = new C1594e(this, new File(this.f4704L), this.f4706N);
            try {
                this.f4708P.m3906a(this, this.f4704L, this.f4713U);
            } catch (IOException e) {
                Toast.makeText(this, "Failed to open " + this.f4704L, 1).show();
                e.printStackTrace();
            }
            TextView textView = (TextView) findViewById(R.id.filename);
            if (this.f4705M == null || (iLastIndexOf = this.f4705M.lastIndexOf(47)) == -1) {
                int iLastIndexOf2 = this.f4704L.lastIndexOf(47);
                strSubstring = iLastIndexOf2 != -1 ? this.f4704L.substring(iLastIndexOf2 + 1) : this.f4704L;
            } else {
                strSubstring = this.f4705M.substring(iLastIndexOf + 1);
            }
            textView.setText(strSubstring);
            findViewById(R.id.editorView);
            this.f4730s = (LinearLayout) findViewById(R.id.editorLayout);
            this.f4731t = (FrameLayout) findViewById(R.id.center_layout);
            this.f4732u = (EditText) findViewById(R.id.lineNumbers);
            this.f4716a = (ObEditText) findViewById(R.id.editor);
            this.f4733v = findViewById(R.id.divider);
            this.f4734w = (ObScrollView) findViewById(R.id.editorScrollview);
            this.f4735x = (ViewAnimator) findViewById(R.id.searchAnimator);
            this.f4736y = (SlidingDrawer) findViewById(R.id.sliding_drawer);
            this.f4737z = (EditText) findViewById(R.id.findEdit);
            this.f4693A = (EditText) findViewById(R.id.replaceEdit);
            this.f4694B = (ImageButton) findViewById(R.id.findBtn);
            this.f4695C = (ImageButton) findViewById(R.id.replaceBtn);
            this.f4696D = (ImageView) findViewById(R.id.openFindBtn);
            this.f4699G = (ToggleButton) findViewById(R.id.checkBoxIgnoreCase);
            this.f4700H = (ToggleButton) findViewById(R.id.checkBoxRegexp);
            this.f4697E = (ImageView) findViewById(R.id.saveBtn);
            this.f4698F = (ImageView) findViewById(R.id.configBtn);
            this.f4701I = this.f4730s;
            this.f4702J = (ImageView) findViewById(R.id.panel_button);
            this.f4695C = (ImageButton) findViewById(R.id.replaceBtn);
            this.f4703K = this.f4734w;
            this.f4716a.m3865b(this.f4723l);
            this.f4716a.setInputType(721041);
            this.f4724m = 12;
            m3828a(this.f4724m);
            String strM3904a = this.f4708P.m3904a();
            if (strM3904a != null) {
                this.f4716a.setText(strM3904a);
                m3854a(0, strM3904a.length(), true);
            }
            this.f4696D.setOnClickListener(this);
            this.f4694B.setOnClickListener(this);
            this.f4695C.setOnClickListener(this);
            this.f4697E.setOnClickListener(this);
            this.f4698F.setOnClickListener(this);
            this.f4697E.getDrawable().setAlpha(80);
            this.f4697E.setClickable(false);
            this.f4695C.setEnabled(false);
            C1592c c1592c = new C1592c(this);
            this.f4730s.setBackgroundColor(c1592c.m3894a());
            this.f4731t.setBackgroundColor(c1592c.m3894a());
            this.f4732u.setBackgroundColor(c1592c.m3894a());
            this.f4716a.setBackgroundColor(c1592c.m3894a());
            this.f4716a.setTextColor(c1592c.m3896b());
            this.f4732u.setTextColor(c1592c.m3896b());
            this.f4733v.setBackgroundColor(c1592c.m3896b());
            ObEditText obEditText = this.f4716a;
            int iM3894a = c1592c.m3894a();
            obEditText.m3860a(Color.argb(128, 255 - Color.red(iM3894a), 255 - Color.green(iM3894a), 255 - Color.blue(iM3894a)));
            this.f4732u.setOnLongClickListener(null);
        } catch (Exception e2) {
            Toast.makeText(this, "failed", 0).show();
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        this.f4736y.setOnDrawerOpenListener(new C1597h(this));
        this.f4736y.setOnDrawerCloseListener(new C1598i(this));
        this.f4716a.m3862a(new C1599j(this));
        this.f4716a.addTextChangedListener(new C1600k(this));
        this.f4734w.m3866a(new C1601l(this));
        this.f4737z.setOnKeyListener(new ViewOnKeyListenerC1602m(this));
        this.f4693A.setOnKeyListener(new ViewOnKeyListenerC1603n(this));
        if (this.f4724m != 12) {
            this.f4724m = 12;
            m3828a(12);
        }
        m3830a(true, C1607r.m3915a(this.f4708P.m3904a().split("\n").length + 1));
        new Handler().postDelayed(new RunnableC1595f(this), 400L);
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("modifySaved", this.f4718c);
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
    }
}
