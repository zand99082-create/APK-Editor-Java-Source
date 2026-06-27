package com.gmail.heagoo.apkeditor;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.gmail.heagoo.apkeditor.pro.R;
import com.gmail.heagoo.apkeditor.util.C1462c;
import com.gmail.heagoo.apkeditor.util.C1463d;
import com.gmail.heagoo.common.C1552a;
import com.gmail.heagoo.common.C1553b;
import com.gmail.heagoo.common.C1562k;
import com.gmail.heagoo.common.InterfaceC1561j;
import com.gmail.heagoo.p084a.p089c.C1067a;
import com.p046a.p049b.p050a.p055e.InterfaceC0597j;
import java.io.File;
import java.util.Map;
import p000a.p001a.p003b.p004a.C0037k;

/* JADX INFO: loaded from: classes.dex */
public class ApkComposeActivity extends Activity implements View.OnClickListener, InterfaceC1561j {

    /* JADX INFO: renamed from: A */
    private BinderC1401k f2825A;

    /* JADX INFO: renamed from: B */
    private C1463d f2826B;

    /* JADX INFO: renamed from: C */
    private boolean f2827C;

    /* JADX INFO: renamed from: E */
    private String f2829E;

    /* JADX INFO: renamed from: a */
    protected String f2830a;

    /* JADX INFO: renamed from: b */
    private LinearLayout f2831b;

    /* JADX INFO: renamed from: c */
    private LinearLayout f2832c;

    /* JADX INFO: renamed from: d */
    private TextView f2833d;

    /* JADX INFO: renamed from: e */
    private TextView f2834e;

    /* JADX INFO: renamed from: f */
    private ListView f2835f;

    /* JADX INFO: renamed from: g */
    private ImageView f2836g;

    /* JADX INFO: renamed from: h */
    private Button f2837h;

    /* JADX INFO: renamed from: i */
    private Button f2838i;

    /* JADX INFO: renamed from: j */
    private LinearLayout f2839j;

    /* JADX INFO: renamed from: k */
    private TextView f2840k;

    /* JADX INFO: renamed from: l */
    private TextView f2841l;

    /* JADX INFO: renamed from: m */
    private Button f2842m;

    /* JADX INFO: renamed from: n */
    private Button f2843n;

    /* JADX INFO: renamed from: o */
    private Button f2844o;

    /* JADX INFO: renamed from: p */
    private Button f2845p;

    /* JADX INFO: renamed from: r */
    private HandlerC1286f f2847r;

    /* JADX INFO: renamed from: s */
    private C1562k f2848s;

    /* JADX INFO: renamed from: t */
    private String f2849t;

    /* JADX INFO: renamed from: u */
    private long f2850u;

    /* JADX INFO: renamed from: v */
    private String f2851v;

    /* JADX INFO: renamed from: w */
    private String f2852w;

    /* JADX INFO: renamed from: x */
    private String f2853x;

    /* JADX INFO: renamed from: y */
    private boolean f2854y;

    /* JADX INFO: renamed from: z */
    private boolean f2855z;

    /* JADX INFO: renamed from: q */
    private boolean f2846q = false;

    /* JADX INFO: renamed from: D */
    private ServiceConnection f2828D = new ServiceConnectionC1182c(this);

    /* JADX INFO: renamed from: b */
    private boolean m2584b(String str) {
        try {
            getPackageManager().getPackageInfo(str, 0);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    static /* synthetic */ boolean m2586c(ApkComposeActivity apkComposeActivity, boolean z) {
        apkComposeActivity.f2846q = true;
        return true;
    }

    /* JADX INFO: renamed from: d */
    private String m2587d() {
        try {
            new C1552a();
            C1553b c1553bM3750a = C1552a.m3750a(this, this.f2851v);
            if (c1553bM3750a != null) {
                return c1553bM3750a.f4630b;
            }
        } catch (Exception e) {
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    static /* synthetic */ InterfaceC0597j m2589e(ApkComposeActivity apkComposeActivity) {
        return null;
    }

    @Override // com.gmail.heagoo.common.InterfaceC1561j
    /* JADX INFO: renamed from: a */
    public final void mo2595a() {
        this.f2847r.sendEmptyMessage(2);
    }

    @Override // com.gmail.heagoo.common.InterfaceC1561j
    /* JADX INFO: renamed from: a */
    public final void mo2596a(C1562k c1562k) {
        this.f2848s = c1562k;
        this.f2847r.sendEmptyMessage(1);
    }

    @Override // com.gmail.heagoo.common.InterfaceC1561j
    /* JADX INFO: renamed from: a */
    public final void mo2597a(String str) {
        this.f2849t = str;
        this.f2847r.sendEmptyMessage(3);
    }

    /* JADX INFO: renamed from: a */
    public final void m2598a(boolean z) {
        int i = -1;
        this.f2831b.setVisibility(4);
        this.f2832c.setVisibility(0);
        if (this.f2825A != null && this.f2827C) {
            this.f2825A.m3453a();
        }
        Button button = (Button) findViewById(R.id.btn_install);
        if (!z) {
            setResult(-1);
            findViewById(R.id.succeeded_view).setVisibility(8);
            findViewById(R.id.failed_view).setVisibility(0);
            this.f2835f.setDivider(null);
            this.f2835f.setAdapter((ListAdapter) new C1317g(this, this.f2849t));
            this.f2836g.setImageResource(R.drawable.ic_close);
            if (this.f2849t.contains("warning:")) {
                this.f2837h.setVisibility(0);
            } else {
                this.f2837h.setVisibility(8);
            }
            this.f2826B.m3586a(this.f2849t);
            if (this.f2826B.m3587a()) {
                switch (this.f2826B.m3588b()) {
                    case 0:
                        i = R.string.fix_invalid_name_tip;
                        break;
                    case 1:
                        i = R.string.fix_invalid_token_tip;
                        break;
                    case 2:
                        i = R.string.fix_invalid_attr_tip;
                        break;
                    case 3:
                        i = R.string.fix_invalid_symbol_tip;
                        break;
                    case 4:
                        i = R.string.fix_error_equivalent;
                        break;
                }
                this.f2840k.setText(i);
                this.f2839j.setVisibility(0);
            }
            button.setVisibility(8);
            this.f2838i.setVisibility(8);
            this.f2844o.setVisibility(0);
            return;
        }
        setResult(10005);
        button.setOnClickListener(this);
        findViewById(R.id.succeeded_view).setVisibility(0);
        findViewById(R.id.failed_view).setVisibility(8);
        this.f2836g.setImageResource(R.drawable.ic_select);
        String str = getResources().getString(R.string.dummy) + "" + String.format(getResources().getString(R.string.apk_savedas_1), this.f2851v) + "\n\n";
        if (this.f2855z) {
            this.f2852w = m2587d();
            if (m2584b(this.f2852w)) {
                String str2 = str + getResources().getString(R.string.remove_tip);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
                AbsoluteSizeSpan absoluteSizeSpan = new AbsoluteSizeSpan(12, true);
                int length = str.length();
                int length2 = str2.length();
                spannableStringBuilder.setSpan(absoluteSizeSpan, length, length2, 33);
                spannableStringBuilder.setSpan(new ForegroundColorSpan(ContextCompat.getColor(this, C0037k.mdTextSmall(C0037k.m89a(this)))), length, length2, 33);
                this.f2834e.setText(spannableStringBuilder);
                this.f2838i.setVisibility(0);
            } else {
                this.f2834e.setText(str);
                this.f2838i.setVisibility(8);
            }
            this.f2844o.setVisibility(8);
            button.setVisibility(0);
        } else {
            String str3 = str + getResources().getString(R.string.not_signed_tip);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str3);
            AbsoluteSizeSpan absoluteSizeSpan2 = new AbsoluteSizeSpan(12, true);
            int length3 = str.length();
            int length4 = str3.length();
            spannableStringBuilder2.setSpan(absoluteSizeSpan2, length3, length4, 18);
            spannableStringBuilder2.setSpan(new ForegroundColorSpan(ContextCompat.getColor(this, C0037k.mdProgress(C0037k.m89a(this)))), length3, length4, 18);
            this.f2834e.setText(spannableStringBuilder2);
            this.f2844o.setVisibility(8);
            this.f2838i.setVisibility(8);
            button.setVisibility(8);
        }
        if (this.f2854y) {
            String property = System.getProperty("java.vm.version");
            if (property != null && property.charAt(0) > '1') {
                this.f2841l = (TextView) findViewById(R.id.tv_patch_tip);
                findViewById(R.id.patch_dex_layout).setVisibility(0);
                this.f2842m = (Button) findViewById(R.id.btn_patch);
                this.f2842m.setOnClickListener(this);
                return;
            }
        }
        findViewById(R.id.patch_dex_layout).setVisibility(8);
    }

    /* JADX INFO: renamed from: b */
    public final void m2599b() {
        this.f2833d.setText(String.format(getResources().getString(R.string.step) + " %d/%d: %s", Integer.valueOf(this.f2848s.f4644a), Integer.valueOf(this.f2848s.f4645b), this.f2848s.f4646c));
    }

    /* JADX INFO: renamed from: c */
    public final void m2600c() {
        if (this.f2825A != null) {
            Map mapM3589c = this.f2826B.m3589c();
            if (this.f2825A != null && !mapM3589c.isEmpty()) {
                this.f2825A.f4067a.f2870o = new C1462c(this.f2853x, mapM3589c);
            }
            this.f2833d.setText("");
            this.f2831b.setVisibility(0);
            this.f2832c.setVisibility(8);
            BinderC1401k binderC1401k = this.f2825A;
            binderC1401k.f4067a.m2612c();
            binderC1401k.f4067a.m2609b();
            binderC1401k.f4067a.m2614d();
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (this.f2825A == null || !this.f2825A.m3454b()) {
            finish();
            return;
        }
        if (C1067a.m2486a((Context) this, "donot_show_compose_tip", false)) {
            finish();
            return;
        }
        View viewInflate = LayoutInflater.from(this).inflate(R.layout.dlg_tip, (ViewGroup) null);
        ((TextView) viewInflate.findViewById(R.id.tv_message)).setText(R.string.build_still_running_tip);
        AlertDialog.Builder positiveButton = new AlertDialog.Builder(this).setTitle(R.string.tip).setPositiveButton(android.R.string.ok, new DialogInterfaceOnClickListenerC1231e(this, (CheckBox) viewInflate.findViewById(R.id.cb_show_once)));
        positiveButton.setView(viewInflate);
        positiveButton.show();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) throws Throwable {
        int iLastIndexOf;
        File file;
        int id = view.getId();
        if (id == R.id.btn_close) {
            finish();
            return;
        }
        if (id == R.id.btn_install) {
            C1067a.m2466a(this, this.f2851v);
            return;
        }
        if (id == R.id.btn_remove) {
            if (this.f2852w != null) {
                startActivity(new Intent("android.intent.action.DELETE", Uri.parse("package:" + this.f2852w)));
                return;
            }
            return;
        }
        if (id == R.id.btn_copy_errmsg) {
            C1067a.m2519c(this, this.f2849t);
            Toast.makeText(this, R.string.errmsg_copied, 0).show();
            return;
        }
        if (id == R.id.btn_fix) {
            if (this.f2826B != null) {
                this.f2839j.setVisibility(8);
                this.f2826B.m3585a(this);
                return;
            }
            return;
        }
        if (id == R.id.btn_patch) {
            if (!this.f2846q) {
                new DialogC1284ey(this, new C1209d(this), -1).show();
                return;
            }
            try {
                Intent launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(this.f2852w);
                if (launchIntentForPackage != null) {
                    startActivity(launchIntentForPackage);
                    return;
                }
                return;
            } catch (ActivityNotFoundException e) {
                return;
            }
        }
        if (id == R.id.btn_hide_warning) {
            StringBuilder sb = new StringBuilder();
            for (String str : this.f2849t.split("\n")) {
                if (!str.startsWith("warning:")) {
                    sb.append(str);
                    sb.append("\n");
                }
            }
            C1317g c1317g = (C1317g) this.f2835f.getAdapter();
            c1317g.m3360a(sb.toString());
            c1317g.notifyDataSetChanged();
            this.f2837h.setVisibility(8);
            return;
        }
        if (id == R.id.btn_bg) {
            finish();
            return;
        }
        if (id != R.id.result || this.f2851v == null) {
            return;
        }
        String str2 = this.f2851v;
        if (!new File(str2).exists() || (iLastIndexOf = str2.lastIndexOf("/")) == -1 || (file = new File(str2.substring(0, iLastIndexOf + 1))) == null || !file.exists()) {
            return;
        }
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.addFlags(268435456);
        intent.setDataAndType(Uri.fromFile(file), "text/csv");
        try {
            startActivity(intent);
        } catch (ActivityNotFoundException e2) {
            e2.printStackTrace();
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        setTheme(C0037k.mdNoActionBar(C0037k.m89a(this)));
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
            NotificationChannel notificationChannel = new NotificationChannel("default", "default", 3);
            notificationChannel.setLightColor(0);
            notificationChannel.enableVibration(false);
            notificationChannel.setVibrationPattern(new long[]{0});
            notificationChannel.setLockscreenVisibility(1);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        this.f2829E = getIntent().getAction();
        getWindow().setFlags(128, 128);
        setContentView(R.layout.activity_apkcompose);
        this.f2847r = new HandlerC1286f(this);
        this.f2831b = (LinearLayout) findViewById(R.id.layout_apk_composing);
        this.f2832c = (LinearLayout) findViewById(R.id.layout_apk_composed);
        this.f2833d = (TextView) findViewById(R.id.progress_tip);
        this.f2834e = (TextView) findViewById(R.id.result);
        this.f2835f = (ListView) findViewById(R.id.failed_view);
        this.f2836g = (ImageView) findViewById(R.id.result_image);
        this.f2839j = (LinearLayout) findViewById(R.id.fix_layout);
        this.f2840k = (TextView) findViewById(R.id.tv_fix_tip);
        this.f2834e.setOnClickListener(this);
        this.f2832c.setVisibility(4);
        ((Button) findViewById(R.id.btn_close)).setOnClickListener(this);
        this.f2838i = (Button) findViewById(R.id.btn_remove);
        this.f2838i.setOnClickListener(this);
        this.f2843n = (Button) findViewById(R.id.btn_fix);
        this.f2843n.setOnClickListener(this);
        this.f2844o = (Button) findViewById(R.id.btn_copy_errmsg);
        this.f2844o.setOnClickListener(this);
        this.f2837h = (Button) findViewById(R.id.btn_hide_warning);
        this.f2837h.setOnClickListener(this);
        this.f2845p = (Button) findViewById(R.id.btn_bg);
        this.f2845p.setOnClickListener(this);
        bindService(new Intent(this, (Class<?>) ApkComposeService.class), this.f2828D, 1);
        this.f2850u = System.currentTimeMillis();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        if (this.f2828D != null) {
            unbindService(this.f2828D);
            this.f2828D = null;
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        this.f2829E = intent.getAction();
        if (this.f2829E == null || !"com.gmail.heagoo.action.apkcompose".equals(this.f2829E) || this.f2825A == null || this.f2825A.m3454b()) {
            return;
        }
        this.f2825A.m3453a();
    }

    @Override // android.app.Activity
    public void onPause() {
        this.f2827C = false;
        super.onPause();
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        this.f2827C = true;
    }
}
