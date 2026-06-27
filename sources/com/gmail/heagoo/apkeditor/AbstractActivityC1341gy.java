package com.gmail.heagoo.apkeditor;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;
import com.gmail.heagoo.apkeditor.p094c.DialogC1183a;
import com.gmail.heagoo.apkeditor.pro.R;
import com.gmail.heagoo.common.C1557f;
import com.gmail.heagoo.neweditor.C1594e;
import com.gmail.heagoo.neweditor.InterfaceC1608s;
import com.gmail.heagoo.p084a.p089c.C1067a;
import com.p078b.p079a.InterfaceC1012e;
import java.util.ArrayList;
import java.util.List;
import p000a.p001a.p003b.p004a.C0037k;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.gy */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractActivityC1341gy extends Activity implements InterfaceC1012e, InterfaceC1221dn, InterfaceC1334gr {

    /* JADX INFO: renamed from: z */
    public static boolean f3909z = false;

    /* JADX INFO: renamed from: a */
    protected String f3910a;

    /* JADX INFO: renamed from: b */
    protected List f3911b;

    /* JADX INFO: renamed from: c */
    protected List f3912c;

    /* JADX INFO: renamed from: d */
    protected List f3913d;

    /* JADX INFO: renamed from: h */
    protected String f3917h;

    /* JADX INFO: renamed from: i */
    protected int f3918i;

    /* JADX INFO: renamed from: j */
    protected C1594e f3919j;

    /* JADX INFO: renamed from: k */
    private boolean f3920k;

    /* JADX INFO: renamed from: l */
    private boolean f3921l;

    /* JADX INFO: renamed from: m */
    private String f3922m;

    /* JADX INFO: renamed from: n */
    private boolean f3923n;

    /* JADX INFO: renamed from: o */
    private String f3924o;

    /* JADX INFO: renamed from: p */
    private List f3925p;

    /* JADX INFO: renamed from: q */
    private String f3926q;

    /* JADX INFO: renamed from: s */
    private boolean f3928s;

    /* JADX INFO: renamed from: w */
    private View f3932w;

    /* JADX INFO: renamed from: x */
    private LinearLayout f3933x;

    /* JADX INFO: renamed from: y */
    private DialogC1183a f3934y;

    /* JADX INFO: renamed from: e */
    protected int f3914e = 0;

    /* JADX INFO: renamed from: f */
    protected boolean f3915f = true;

    /* JADX INFO: renamed from: g */
    protected boolean f3916g = false;

    /* JADX INFO: renamed from: r */
    private ArrayList f3927r = new ArrayList();

    /* JADX INFO: renamed from: t */
    private C1332gp f3929t = new C1332gp(this);

    /* JADX INFO: renamed from: u */
    private String[] f3930u = {",.?!:;~-_=\"'/@*+()<>{}[]%&$|\\#^", "<>\":=/@+.-?#_()[]{}\\;!$%^&*|~',", "(){};.=\"'|&![]@<>+-*/?:,_\\^%#~$"};

    /* JADX INFO: renamed from: v */
    private int f3931v = -1;

    public AbstractActivityC1341gy(boolean z, boolean z2) {
        this.f3920k = z;
        this.f3921l = z2;
    }

    /* JADX INFO: renamed from: a */
    protected static boolean m3384a(String[] strArr, int i, int i2, String str) {
        while (i <= i2) {
            if (!strArr[i - 1].trim().startsWith(str)) {
                return false;
            }
            i++;
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    static /* synthetic */ void m3386b(AbstractActivityC1341gy abstractActivityC1341gy, boolean z) {
        if (SettingEditorActivity.m2825c(abstractActivityC1341gy)) {
            if (z) {
                abstractActivityC1341gy.f3932w.setVisibility(0);
                abstractActivityC1341gy.f3933x.setVisibility(4);
            } else {
                abstractActivityC1341gy.f3933x.setVisibility(0);
                abstractActivityC1341gy.f3932w.setVisibility(4);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m3388c(String str) {
        return str != null && str.endsWith(".smali");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public void m3389d() {
        if (this.f3922m == null) {
            Toast.makeText(this, "Internal error: cannot find apk path to decode java code, please contact the author.", 1).show();
            return;
        }
        try {
            String strM2525d = C1067a.m2525d(this, "tmp");
            String str = "classes.dex";
            String[] strArrSplit = this.f3926q.split("/");
            int i = 0;
            while (true) {
                if (i >= strArrSplit.length || "smali".equals(strArrSplit[i])) {
                    break;
                }
                if (strArrSplit[i].startsWith("smali_")) {
                    str = strArrSplit[i].substring(6) + ".dex";
                    break;
                }
                i++;
            }
            StringBuilder sb = new StringBuilder();
            sb.append('L');
            while (true) {
                i++;
                if (i >= strArrSplit.length) {
                    break;
                }
                String str2 = strArrSplit[i];
                if (i != strArrSplit.length - 1) {
                    sb.append(str2);
                    sb.append('/');
                } else if (str2.length() > 6 && str2.endsWith(".smali")) {
                    sb.append(str2.substring(0, str2.length() - 6));
                }
            }
            String[] strArr = sb.length() == 0 ? null : new String[]{str, sb.toString()};
            String str3 = strArr[0];
            String str4 = strArr[1];
            if (str4 == null) {
                Toast.makeText(this, "Internal error: Cannot get class name, please contact the author.", 1).show();
            } else {
                new DialogC1284ey(this, new C1348he(this, str3, str4, strM2525d), -1).show();
            }
        } catch (Exception e) {
            Toast.makeText(this, "Cannot make working directory.", 0).show();
        }
    }

    /* JADX INFO: renamed from: d */
    static /* synthetic */ void m3390d(AbstractActivityC1341gy abstractActivityC1341gy) {
        if (abstractActivityC1341gy.f3934y == null) {
            abstractActivityC1341gy.f3934y = new DialogC1183a(abstractActivityC1341gy);
        }
        abstractActivityC1341gy.f3934y.m3095a(abstractActivityC1341gy.f3926q, abstractActivityC1341gy.m3405f(abstractActivityC1341gy.f3926q));
    }

    /* JADX INFO: renamed from: d */
    public static boolean m3391d(String str) {
        return str != null && str.endsWith(".java");
    }

    /* JADX INFO: renamed from: e */
    public static boolean m3393e(String str) {
        return str.endsWith(".xml");
    }

    /* JADX INFO: renamed from: f */
    static /* synthetic */ void m3394f(AbstractActivityC1341gy abstractActivityC1341gy) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(abstractActivityC1341gy);
        if (defaultSharedPreferences.getBoolean("java_edit_tip_shown", false)) {
            abstractActivityC1341gy.m3389d();
            return;
        }
        new AlertDialog.Builder(abstractActivityC1341gy).setTitle(R.string.please_note).setMessage(R.string.java_code_edit_tip).setPositiveButton(android.R.string.ok, new DialogInterfaceOnClickListenerC1347hd(abstractActivityC1341gy)).show();
        SharedPreferences.Editor editorEdit = defaultSharedPreferences.edit();
        editorEdit.putBoolean("java_edit_tip_shown", true);
        editorEdit.commit();
    }

    /* JADX INFO: renamed from: a */
    protected final String m3397a() {
        return this.f3926q;
    }

    @Override // com.p078b.p079a.InterfaceC1012e
    /* JADX INFO: renamed from: a */
    public final void mo2307a(int i) {
        String str = String.format("#%08x", Integer.valueOf(i));
        C1067a.m2519c(this, str);
        Toast.makeText(this, String.format(getString(R.string.copied_to_clipboard), str), 0).show();
    }

    /* JADX INFO: renamed from: a */
    public void mo2850a(int i, int i2) {
        Toast.makeText(this, "Not implemented.", 0).show();
    }

    /* JADX INFO: renamed from: a */
    protected final void m3398a(View view) {
        View viewInflate = LayoutInflater.from(this).inflate(R.layout.popup_list, (ViewGroup) null);
        ListView listView = (ListView) viewInflate.findViewById(R.id.lvGroup);
        C1277er c1277er = new C1277er(this, this.f3926q);
        listView.setAdapter((ListAdapter) c1277er);
        PopupWindow popupWindow = new PopupWindow(viewInflate, C1557f.m3763a(this) / 2, C1557f.m3764a(this, (c1277er.m3243a() * 48) + 32));
        listView.setOnItemClickListener(new C1346hc(this, c1277er, popupWindow));
        popupWindow.setFocusable(true);
        popupWindow.setOutsideTouchable(true);
        popupWindow.setBackgroundDrawable(new BitmapDrawable());
        popupWindow.showAsDropDown(view, (((WindowManager) getSystemService("window")).getDefaultDisplay().getWidth() / 2) - (popupWindow.getWidth() / 2), 0);
    }

    /* JADX INFO: renamed from: a */
    protected final void m3399a(InterfaceC1608s interfaceC1608s) {
        View viewFindViewById = findViewById(android.R.id.content);
        viewFindViewById.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC1345hb(this, viewFindViewById, interfaceC1608s));
    }

    /* JADX INFO: renamed from: a */
    protected final void m3400a(String str) {
        this.f3926q = str;
        int i = str == null ? this.f3931v : str.endsWith(".xml") ? 1 : str.endsWith(".java") ? 2 : 0;
        if (i != this.f3931v) {
            this.f3931v = i;
            LinearLayout linearLayout = (LinearLayout) findViewById(R.id.special_char_container);
            linearLayout.removeAllViews();
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(C1557f.m3763a(this) / 11, -1);
            String str2 = this.f3930u[this.f3931v];
            for (int i2 = 0; i2 < str2.length(); i2++) {
                TextView textView = new TextView(this);
                textView.setTextSize(2, 24.0f);
                textView.setBackgroundResource(R.drawable.mtrl_selectable);
                textView.setText(new StringBuilder().append(str2.charAt(i2)).toString());
                textView.setTextColor(ContextCompat.getColor(this, C0037k.mdTextMedium(C0037k.m89a(this))));
                textView.setGravity(17);
                textView.setTag(Integer.valueOf(i2));
                textView.setOnClickListener(new ViewOnClickListenerC1344ha(this));
                linearLayout.addView(textView, layoutParams);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    protected final String m3401b(String str) {
        return this.f3931v >= 0 ? this.f3930u[this.f3931v] : "";
    }

    /* JADX INFO: renamed from: b */
    protected final void m3402b() {
        Intent intent = new Intent();
        if (this.f3923n) {
            if (!this.f3927r.contains(this.f3926q)) {
                this.f3927r.add(this.f3926q);
            }
            intent.putStringArrayListExtra("modifiedFiles", this.f3927r);
        } else {
            intent.putExtra("xmlPath", this.f3926q);
            intent.putExtra("extraString", (String) this.f3925p.get(0));
        }
        setResult(1, intent);
    }

    /* JADX INFO: renamed from: b */
    protected final void m3403b(View view) {
        if (this.f3929t == null || !this.f3926q.equals(this.f3929t.m3372a())) {
            this.f3929t.m3373a(this, this.f3926q, this.f3919j.m3904a(), view);
        } else {
            this.f3929t.m3374a(view);
        }
    }

    /* JADX INFO: renamed from: c */
    protected abstract void mo2852c(int i);

    /* JADX INFO: renamed from: c */
    protected final boolean m3404c() {
        return this.f3928s;
    }

    /* JADX INFO: renamed from: f */
    public final String m3405f(String str) {
        if (!this.f3923n && this.f3924o != null) {
            return this.f3924o;
        }
        int iLastIndexOf = str.lastIndexOf(47);
        return iLastIndexOf != -1 ? str.substring(iLastIndexOf + 1) : str;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0041  */
    @Override // android.app.Activity
    @SuppressLint({"NewApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onCreate(Bundle bundle) {
        int i;
        AbstractActivityC1341gy abstractActivityC1341gy;
        String strM2457a;
        setTheme(C0037k.mdNoActionBar(C0037k.m89a(this)));
        super.onCreate(bundle);
        getWindow().setSoftInputMode(2);
        try {
            if (this.f3920k) {
                i = R.layout.activity_editor_bigfile;
                abstractActivityC1341gy = this;
            } else {
                this.f3915f = SettingEditorActivity.m2822a(this);
                if (this.f3915f) {
                    setContentView(R.layout.activity_editor_wrap);
                    Intent intent = getIntent();
                    strM2457a = C1067a.m2457a(intent, "xmlPath");
                    this.f3922m = C1067a.m2457a(intent, "apkPath");
                    this.f3910a = C1067a.m2457a(intent, "searchString");
                    if (strM2457a == null) {
                        this.f3923n = false;
                        String strM2457a2 = C1067a.m2457a(intent, "startLine");
                        int iIntValue = strM2457a2 != null ? Integer.valueOf(strM2457a2).intValue() : -1;
                        String strM2457a3 = C1067a.m2457a(intent, "syntaxFileName");
                        String strM2457a4 = C1067a.m2457a(intent, "extraString");
                        this.f3924o = C1067a.m2457a(intent, "displayFileName");
                        this.f3911b = new ArrayList(1);
                        this.f3911b.add(strM2457a);
                        this.f3912c = new ArrayList();
                        this.f3912c.add(Integer.valueOf(iIntValue));
                        this.f3913d = new ArrayList(1);
                        this.f3913d.add(strM2457a3);
                        this.f3925p = new ArrayList(1);
                        this.f3925p.add(strM2457a4);
                    } else {
                        this.f3923n = true;
                        this.f3911b = C1067a.m2518c(intent, "fileList");
                        Bundle extras = intent.getExtras();
                        this.f3914e = extras != null ? extras.getInt("curFileIndex", 0) : 0;
                        Bundle extras2 = intent.getExtras();
                        this.f3912c = extras2 != null ? extras2.getIntegerArrayList("startLineList") : null;
                        this.f3913d = C1067a.m2518c(intent, "syntaxFileList");
                        this.f3925p = C1067a.m2518c(intent, "extraStringList");
                        if (this.f3912c == null) {
                            this.f3912c = new ArrayList(this.f3911b.size());
                            for (int i2 = 0; i2 < this.f3911b.size(); i2++) {
                                this.f3912c.add(-1);
                            }
                        }
                        if (this.f3913d == null) {
                            this.f3913d = new ArrayList(this.f3911b.size());
                            for (int i3 = 0; i3 < this.f3911b.size(); i3++) {
                                this.f3913d.add(null);
                            }
                        }
                        if (this.f3925p == null) {
                            this.f3925p = new ArrayList(this.f3911b.size());
                            for (int i4 = 0; i4 < this.f3911b.size(); i4++) {
                                this.f3925p.add(null);
                            }
                        }
                    }
                    if (bundle != null) {
                        this.f3914e = bundle.getInt("curFileIndex");
                        this.f3916g = bundle.getBoolean("modifySaved", false);
                        if (this.f3916g) {
                            m3402b();
                        }
                        if (bundle.getBoolean("docChanged", false)) {
                            this.f3917h = bundle.getString("unsavedFilePath");
                        }
                    }
                    this.f3932w = findViewById(R.id.special_char_layout);
                    this.f3933x = (LinearLayout) findViewById(R.id.menu_layout);
                    View viewFindViewById = findViewById(R.id.switch_view);
                    if (!SettingEditorActivity.m2825c(this)) {
                        viewFindViewById.setOnClickListener(new ViewOnClickListenerC1342gz(this));
                        return;
                    } else {
                        viewFindViewById.setVisibility(8);
                        findViewById(R.id.separate_view).setVisibility(8);
                        return;
                    }
                }
                i = R.layout.activity_editor;
                abstractActivityC1341gy = this;
            }
            if (strM2457a == null) {
            }
            if (bundle != null) {
            }
            this.f3932w = findViewById(R.id.special_char_layout);
            this.f3933x = (LinearLayout) findViewById(R.id.menu_layout);
            View viewFindViewById2 = findViewById(R.id.switch_view);
            if (!SettingEditorActivity.m2825c(this)) {
            }
        } catch (Exception e) {
            Toast.makeText(this, R.string.failed, 0).show();
            finish();
            return;
        }
        abstractActivityC1341gy.setContentView(i);
        Intent intent2 = getIntent();
        strM2457a = C1067a.m2457a(intent2, "xmlPath");
        this.f3922m = C1067a.m2457a(intent2, "apkPath");
        this.f3910a = C1067a.m2457a(intent2, "searchString");
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        if (f3909z) {
            f3909z = false;
            recreate();
        }
    }
}
