package com.gmail.heagoo.appdm;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.TextView;
import com.android.apksig.apk.ApkUtils;
import com.gmail.heagoo.apkeditor.pro.R;
import com.gmail.heagoo.appdm.util.C1523e;
import com.gmail.heagoo.appdm.util.C1526i;
import com.gmail.heagoo.common.C1554c;
import com.gmail.heagoo.common.DialogC1567p;
import com.gmail.heagoo.common.ccc;
import com.gmail.heagoo.p084a.p089c.C1068ax;
import com.gmail.heagoo.p100b.C1533a;
import com.gmail.heagoo.sqliteutil.C1632c;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes.dex */
public class PrefOverallActivity extends Activity implements View.OnClickListener {

    /* JADX INFO: renamed from: A */
    private Drawable f4441A;

    /* JADX INFO: renamed from: B */
    private Drawable f4442B;

    /* JADX INFO: renamed from: C */
    private Drawable f4443C;

    /* JADX INFO: renamed from: D */
    private Drawable f4444D;

    /* JADX INFO: renamed from: G */
    private boolean f4446G;

    /* JADX INFO: renamed from: H */
    private boolean f4447H;

    /* JADX INFO: renamed from: K */
    private long f4449K;

    /* JADX INFO: renamed from: L */
    private long f4450L;

    /* JADX INFO: renamed from: M */
    private long f4451M;

    /* JADX INFO: renamed from: O */
    private int f4453O;

    /* JADX INFO: renamed from: P */
    private boolean f4454P;

    /* JADX INFO: renamed from: a */
    String f4455a;

    /* JADX INFO: renamed from: c */
    private String f4457c;

    /* JADX INFO: renamed from: d */
    private C1494ac f4458d;

    /* JADX INFO: renamed from: e */
    private ListView f4459e;

    /* JADX INFO: renamed from: f */
    private ListView f4460f;

    /* JADX INFO: renamed from: g */
    private ListView f4461g;

    /* JADX INFO: renamed from: h */
    private ListView f4462h;

    /* JADX INFO: renamed from: i */
    private LinearLayout f4463i;

    /* JADX INFO: renamed from: j */
    private ProgressBar f4464j;

    /* JADX INFO: renamed from: k */
    private TextView f4465k;

    /* JADX INFO: renamed from: l */
    private PackageManager f4466l;

    /* JADX INFO: renamed from: m */
    private ApplicationInfo f4467m;

    /* JADX INFO: renamed from: n */
    private PackageInfo f4468n;

    /* JADX INFO: renamed from: o */
    private String f4469o;

    /* JADX INFO: renamed from: p */
    private C1495ad f4470p;

    /* JADX INFO: renamed from: s */
    private RadioButton f4473s;

    /* JADX INFO: renamed from: t */
    private RadioButton f4474t;

    /* JADX INFO: renamed from: u */
    private RadioButton f4475u;

    /* JADX INFO: renamed from: v */
    private RadioButton f4476v;

    /* JADX INFO: renamed from: w */
    private Drawable f4477w;

    /* JADX INFO: renamed from: x */
    private Drawable f4478x;

    /* JADX INFO: renamed from: y */
    private Drawable f4479y;

    /* JADX INFO: renamed from: z */
    private Drawable f4480z;

    /* JADX INFO: renamed from: q */
    private List f4471q = new ArrayList();

    /* JADX INFO: renamed from: r */
    private List f4472r = new ArrayList();

    /* JADX INFO: renamed from: E */
    private int f4445E = -1;

    /* JADX INFO: renamed from: b */
    int f4456b = 0;

    /* JADX INFO: renamed from: J */
    private boolean f4448J = false;

    /* JADX INFO: renamed from: N */
    private int f4452N = 0;

    /* JADX INFO: renamed from: a */
    static /* synthetic */ String m3656a(PrefOverallActivity prefOverallActivity, String str) {
        String strSubstring;
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf != -1) {
            strSubstring = str.substring(iLastIndexOf);
            if (strSubstring.contains("/")) {
                strSubstring = null;
            }
        } else {
            strSubstring = null;
        }
        StringBuilder sbAppend = new StringBuilder().append(C1526i.m3727b(prefOverallActivity)).append("/_work");
        if (strSubstring == null) {
            strSubstring = "";
        }
        String string = sbAppend.append(strSubstring).toString();
        ccc cccVarM3691g = prefOverallActivity.m3691g();
        File file = new File(prefOverallActivity.getFilesDir(), "mycp");
        if (cccVarM3691g.mo3760a(String.format((file.exists() ? file.getPath() : "cp") + " \"%s\" %s", str, string), null, 5000, false)) {
            return string;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m3658a(String str, String str2) {
        new DialogC1567p(this, new C1517s(this, str, str2), -1).show();
    }

    /* JADX INFO: renamed from: a */
    private void m3659a(List list) {
        String[] strArr;
        Resources resources = getResources();
        this.f4469o = this.f4467m.loadLabel(this.f4466l).toString();
        list.add(new C1505g(resources.getString(R.string.appdm_app_name), this.f4469o));
        list.add(new C1505g(resources.getString(R.string.appdm_package_name), this.f4457c));
        File file = new File(this.f4467m.sourceDir);
        String string = "";
        long length = 0;
        if (Build.VERSION.SDK_INT >= 21 && (strArr = this.f4467m.splitSourceDirs) != null && strArr.length > 0) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < strArr.length; i++) {
                sb.append("\n" + strArr[i]);
                length += new File(strArr[i]).length();
            }
            string = sb.toString();
        }
        list.add(new C1505g(resources.getString(R.string.appdm_app_size), C1526i.m3724a(length + file.length())));
        list.add(new C1505g(resources.getString(R.string.appdm_version), resources.getString(R.string.appdm_version_code) + ": " + this.f4468n.versionCode + "\n" + resources.getString(R.string.appdm_version_name) + ": " + this.f4468n.versionName));
        list.add(new C1505g(resources.getString(R.string.appdm_apk_file_path), this.f4467m.sourceDir + string, resources.getString(R.string.save), new ViewOnClickListenerC1512n(this)));
        try {
            ZipFile zipFile = new ZipFile(this.f4467m.sourceDir);
            ZipEntry entry = zipFile.getEntry(ApkUtils.ANDROID_MANIFEST_ZIP_ENTRY_NAME);
            ZipEntry entry2 = zipFile.getEntry("classes.dex");
            long time = entry != null ? entry.getTime() : Long.MIN_VALUE;
            long time2 = entry2 != null ? entry2.getTime() : Long.MIN_VALUE;
            if (time2 < time) {
                time2 = time;
            }
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(time2);
            list.add(new C1505g(resources.getString(R.string.appdm_apk_build_time), calendar.getTime().toString()));
            zipFile.close();
        } catch (IOException e) {
        }
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(file.lastModified());
        list.add(new C1505g(resources.getString(R.string.appdm_install_time), calendar2.getTime().toString()));
        list.add(new C1505g(resources.getString(R.string.appdm_signature), C1068ax.i_009(this.f4467m.sourceDir)));
    }

    /* JADX INFO: renamed from: d */
    static /* synthetic */ void m3662d(PrefOverallActivity prefOverallActivity) {
        prefOverallActivity.f4459e.setAdapter((ListAdapter) new C1508j(prefOverallActivity, prefOverallActivity.f4471q, prefOverallActivity.f4454P));
        prefOverallActivity.f4459e.setOnItemClickListener(new C1532z(prefOverallActivity));
    }

    /* JADX INFO: renamed from: e */
    static /* synthetic */ void m3663e(PrefOverallActivity prefOverallActivity) {
        prefOverallActivity.f4460f.setAdapter((ListAdapter) new C1508j(prefOverallActivity, prefOverallActivity.f4472r, prefOverallActivity.f4454P));
        prefOverallActivity.f4460f.setOnItemClickListener(new C1492aa(prefOverallActivity));
    }

    /* JADX INFO: renamed from: a */
    protected final void m3683a() {
        String[] strArr;
        new DialogC1491a(this, this.f4467m.sourceDir, this.f4469o).m3694a();
        if (Build.VERSION.SDK_INT < 21 || (strArr = this.f4467m.splitSourceDirs) == null || strArr.length <= 0) {
            return;
        }
        for (int i = 0; i < strArr.length; i++) {
            String name = new File(strArr[i]).getName();
            new DialogC1491a(this, strArr[i], this.f4469o + "_" + name.substring(0, name.lastIndexOf(".apk"))).m3694a();
        }
    }

    /* JADX INFO: renamed from: a */
    protected final void m3684a(int i) {
        String strSubstring;
        ArrayList arrayList = new ArrayList();
        String strM3707a = this.f4470p.m3707a(arrayList);
        if (i < arrayList.size()) {
            C1523e c1523e = (C1523e) arrayList.get(i);
            if (c1523e.f4584c) {
                String str = c1523e.f4582a;
                if ("..".equals(str)) {
                    int iLastIndexOf = strM3707a.lastIndexOf(47);
                    strSubstring = iLastIndexOf != -1 ? strM3707a.substring(0, iLastIndexOf) : strM3707a;
                } else {
                    strSubstring = strM3707a + "/" + str;
                }
                new DialogC1567p(this, new C1516r(this, strSubstring), -1).show();
                return;
            }
            String str2 = strM3707a + "/" + c1523e.f4582a;
            String str3 = c1523e.f4582a;
            String str4 = str3.endsWith(".xml") ? "xml.xml" : (str3.endsWith(".html") || str3.endsWith(".htm")) ? "html.xml" : str3.endsWith(".css") ? "css.xml" : str3.endsWith(".java") ? "java.xml" : str3.endsWith(".json") ? "json.xml" : str3.endsWith(".txt") ? "txt.xml" : str3.endsWith(".js") ? "js.xml" : null;
            if (str4 != null) {
                m3658a(str2, str4);
            } else {
                new DialogC1567p(this, new C1518t(this, str2), -1).show();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m3685a(boolean z) {
        synchronized (this) {
            this.f4445E = z ? 1 : 0;
            this.f4455a = this.f4458d.m3699c();
        }
        runOnUiThread(new RunnableC1519u(this, z));
    }

    /* JADX INFO: renamed from: b */
    protected final void m3686b() {
        switch (this.f4456b) {
            case 0:
                m3687c();
                break;
            case 1:
                m3688d();
                break;
            case 2:
                m3689e();
                break;
        }
    }

    /* JADX INFO: renamed from: c */
    protected final void m3687c() {
        this.f4461g.setVisibility(0);
        this.f4459e.setVisibility(4);
        this.f4460f.setVisibility(4);
        this.f4462h.setVisibility(4);
        this.f4463i.setVisibility(4);
    }

    /* JADX INFO: renamed from: d */
    protected final void m3688d() {
        synchronized (this) {
            switch (this.f4445E) {
                case -1:
                    this.f4459e.setVisibility(4);
                    this.f4463i.setVisibility(0);
                    break;
                case 0:
                    this.f4459e.setVisibility(4);
                    this.f4463i.setVisibility(0);
                    this.f4464j.setVisibility(8);
                    this.f4465k.setText(this.f4455a);
                    break;
                case 1:
                    this.f4463i.setVisibility(4);
                    this.f4459e.setVisibility(0);
                    break;
            }
        }
        this.f4461g.setVisibility(4);
        this.f4460f.setVisibility(4);
        this.f4462h.setVisibility(4);
    }

    /* JADX INFO: renamed from: e */
    protected final void m3689e() {
        synchronized (this) {
            switch (this.f4445E) {
                case -1:
                    this.f4460f.setVisibility(4);
                    this.f4463i.setVisibility(0);
                    break;
                case 0:
                    this.f4460f.setVisibility(4);
                    this.f4463i.setVisibility(0);
                    this.f4464j.setVisibility(8);
                    this.f4465k.setText(this.f4455a);
                    break;
                case 1:
                    this.f4463i.setVisibility(4);
                    this.f4460f.setVisibility(0);
                    break;
            }
        }
        this.f4461g.setVisibility(4);
        this.f4459e.setVisibility(4);
        this.f4462h.setVisibility(4);
    }

    /* JADX INFO: renamed from: f */
    protected final void m3690f() {
        this.f4463i.setVisibility(4);
        this.f4461g.setVisibility(4);
        this.f4459e.setVisibility(4);
        this.f4460f.setVisibility(4);
        this.f4462h.setVisibility(0);
    }

    /* JADX INFO: renamed from: g */
    protected final ccc m3691g() {
        return this.f4446G ? new C1632c() : new C1554c();
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1001) {
            this.f4450L = System.currentTimeMillis();
            if (i2 == 1) {
                this.f4448J = true;
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.button_backup) {
            C1068ax.a_010("com.gmail.heagoo.appdm.free.a", "s", new Class[]{Activity.class, C1533a.class}, new Object[]{this, C1533a.a(this.f4466l, this.f4467m)});
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        Intent intent = getIntent();
        this.f4453O = C1068ax.c_006(intent, "themeId");
        this.f4454P = this.f4453O != 0;
        setContentView(R.layout.appdm_activity_dataoverview);
        this.f4457c = C1068ax.a_008(intent, "packagePath");
        this.f4447H = C1068ax.b_007(intent, "backup");
        try {
            this.f4466l = getPackageManager();
            this.f4467m = this.f4466l.getApplicationInfo(this.f4457c, 0);
            this.f4468n = this.f4466l.getPackageInfo(this.f4457c, 0);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        this.f4451M = System.currentTimeMillis();
        this.f4446G = true;
        try {
            if (this.f4468n.sharedUserId != null && this.f4468n.sharedUserId.equals(this.f4466l.getPackageInfo(getPackageName(), 0).sharedUserId)) {
                this.f4446G = false;
            }
        } catch (PackageManager.NameNotFoundException e2) {
        }
        ((ImageView) findViewById(R.id.app_icon)).setImageDrawable(this.f4467m.loadIcon(this.f4466l));
        ((TextView) findViewById(R.id.app_name)).setText(this.f4467m.loadLabel(this.f4466l));
        ((TextView) findViewById(R.id.app_pkgpath)).setText(this.f4467m.packageName);
        Button button = (Button) findViewById(R.id.button_backup);
        if (this.f4447H) {
            button.setOnClickListener(this);
        } else {
            button.setVisibility(8);
        }
        this.f4461g = (ListView) findViewById(R.id.appInfo_list);
        this.f4459e = (ListView) findViewById(R.id.preference_list);
        this.f4460f = (ListView) findViewById(R.id.database_list);
        this.f4462h = (ListView) findViewById(R.id.files_list);
        this.f4463i = (LinearLayout) findViewById(R.id.layout_scanning);
        this.f4464j = (ProgressBar) findViewById(R.id.progress_bar);
        this.f4465k = (TextView) findViewById(R.id.tv_tip);
        ArrayList arrayList = new ArrayList();
        m3659a(arrayList);
        this.f4461g.setAdapter((ListAdapter) new C1503e(this, arrayList, this.f4454P));
        String path = getFilesDir().getPath();
        this.f4470p = new C1495ad(this, path.substring(0, path.indexOf(getPackageName())) + this.f4457c + "/files", this.f4446G, this.f4454P);
        this.f4462h.setAdapter((ListAdapter) this.f4470p);
        this.f4462h.setOnItemClickListener(new C1493ab(this));
        this.f4462h.setOnItemLongClickListener(new C1513o(this));
        Resources resources = getResources();
        this.f4477w = resources.getDrawable(R.drawable.appdm_info);
        this.f4478x = resources.getDrawable(R.drawable.appdm_info_blue);
        this.f4479y = resources.getDrawable(R.drawable.appdm_config);
        this.f4480z = resources.getDrawable(R.drawable.appdm_config_blue);
        this.f4441A = resources.getDrawable(R.drawable.appdm_db);
        this.f4442B = resources.getDrawable(R.drawable.appdm_db_blue);
        this.f4443C = resources.getDrawable(R.drawable.appdm_files);
        this.f4444D = resources.getDrawable(R.drawable.appdm_files_blue);
        this.f4473s = (RadioButton) findViewById(R.id.tab_appinfo);
        this.f4474t = (RadioButton) findViewById(R.id.tab_preference);
        this.f4475u = (RadioButton) findViewById(R.id.tab_database);
        this.f4476v = (RadioButton) findViewById(R.id.tab_files);
        this.f4473s.setOnClickListener(new ViewOnClickListenerC1528v(this));
        this.f4474t.setOnClickListener(new ViewOnClickListenerC1529w(this));
        this.f4475u.setOnClickListener(new ViewOnClickListenerC1530x(this));
        this.f4476v.setOnClickListener(new ViewOnClickListenerC1531y(this));
        this.f4458d = new C1494ac(this);
        this.f4458d.start();
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
    }
}
