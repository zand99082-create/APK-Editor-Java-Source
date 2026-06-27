package com.gmail.heagoo.appdm;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.gmail.heagoo.apkeditor.pro.R;
import com.gmail.heagoo.appdm.util.FileCopyUtil;
import com.gmail.heagoo.common.C1554c;
import com.gmail.heagoo.common.ccc;
import com.gmail.heagoo.neweditor.EditorActivity;
import com.gmail.heagoo.p084a.p089c.C1068ax;
import com.gmail.heagoo.sqliteutil.C1632c;
import com.gmail.heagoo.sqliteutil.p102a.InterfaceC1630c;
import com.gmail.heagoo.sqliteutil.p102a.ViewOnClickListenerC1629b;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class PrefDetailActivity extends Activity implements View.OnClickListener, InterfaceC1630c {

    /* JADX INFO: renamed from: a */
    protected String f4425a;

    /* JADX INFO: renamed from: b */
    protected String f4426b;

    /* JADX INFO: renamed from: c */
    private String f4427c;

    /* JADX INFO: renamed from: d */
    private C1511m f4428d;

    /* JADX INFO: renamed from: e */
    private ScrollView f4429e;

    /* JADX INFO: renamed from: f */
    private ProgressBar f4430f;

    /* JADX INFO: renamed from: g */
    private TableLayout f4431g;

    /* JADX INFO: renamed from: h */
    private LinkedHashMap f4432h;

    /* JADX INFO: renamed from: i */
    private LinkedHashMap f4433i;

    /* JADX INFO: renamed from: j */
    private ArrayList f4434j;

    /* JADX INFO: renamed from: l */
    private boolean f4435l;

    /* JADX INFO: renamed from: m */
    private ViewOnClickListenerC1629b f4436m;

    /* JADX INFO: renamed from: n */
    private HandlerC1510l f4437n = new HandlerC1510l(this);

    /* JADX INFO: renamed from: o */
    private Button f4438o;

    /* JADX INFO: renamed from: p */
    private int f4439p;

    /* JADX INFO: renamed from: q */
    private boolean f4440q;

    /* JADX INFO: renamed from: a */
    static /* synthetic */ ccc m3645a(boolean z) {
        return z ? new C1632c() : new C1554c();
    }

    /* JADX INFO: renamed from: a */
    static /* synthetic */ void m3646a(PrefDetailActivity prefDetailActivity) {
        prefDetailActivity.f4436m.m4022b();
        prefDetailActivity.f4429e.setVisibility(0);
        prefDetailActivity.f4438o.setVisibility(0);
        prefDetailActivity.f4430f.setVisibility(8);
    }

    /* JADX INFO: renamed from: a */
    static /* synthetic */ void m3647a(PrefDetailActivity prefDetailActivity, LinkedHashMap linkedHashMap) {
        if (linkedHashMap != null) {
            prefDetailActivity.f4432h = linkedHashMap;
            prefDetailActivity.f4434j = new ArrayList();
            for (String str : linkedHashMap.keySet()) {
                ArrayList arrayList = new ArrayList();
                Object obj = linkedHashMap.get(str);
                String string = "";
                if (obj != null) {
                    string = obj.toString();
                }
                arrayList.add(str);
                arrayList.add(string);
                prefDetailActivity.f4434j.add(arrayList);
            }
            if (prefDetailActivity.f4436m == null) {
                prefDetailActivity.f4436m = new ViewOnClickListenerC1629b(prefDetailActivity, null, prefDetailActivity.f4431g, prefDetailActivity, prefDetailActivity.f4440q);
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add("Key");
            arrayList2.add("Value");
            prefDetailActivity.f4436m.m4020a(arrayList2);
            prefDetailActivity.f4436m.m4021a((List) prefDetailActivity.f4434j);
            prefDetailActivity.f4436m.m4019a();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m3649a() {
        this.f4428d = new C1511m(this);
        this.f4428d.start();
    }

    @Override // com.gmail.heagoo.sqliteutil.p102a.InterfaceC1630c
    /* JADX INFO: renamed from: a */
    public final void mo3650a(int i, boolean z) {
        if (z) {
            new DialogC1506h(this, this.f4432h, i, true, this.f4439p).show();
        } else {
            new DialogC1506h(this, this.f4433i, i, true, this.f4439p).show();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m3651a(String str) {
        if (str == null) {
            this.f4437n.sendEmptyMessage(0);
        } else {
            this.f4437n.m3713a(str);
            this.f4437n.sendEmptyMessage(1);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m3652a(String str, Object obj) {
        this.f4432h.put(str, obj);
        if (this.f4435l) {
            FileOutputStream fileOutputStream = new FileOutputStream(this.f4426b);
            C1068ax.a_005(this.f4432h, fileOutputStream);
            fileOutputStream.close();
            FileCopyUtil.copyBack(this, this.f4426b, this.f4425a, this.f4435l);
        } else {
            FileOutputStream fileOutputStream2 = new FileOutputStream(this.f4425a);
            C1068ax.a_005(this.f4432h, fileOutputStream2);
            fileOutputStream2.close();
        }
        setResult(1);
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        switch (i) {
            case 1000:
                if (i2 != 0) {
                    setResult(1);
                    m3649a();
                }
                break;
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.button_close) {
            finish();
            return;
        }
        if (id != R.id.button_search) {
            if (id == R.id.btn_raw_file) {
                Intent intent = new Intent(this, (Class<?>) EditorActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("filePath", this.f4426b);
                bundle.putString("realFilePath", this.f4425a);
                bundle.putBoolean("isRootMode", this.f4435l);
                bundle.putIntArray("resourceIds", new int[]{R.string.appdm_apk_file_path, R.string.appdm_apk_build_time, R.string.appdm_basic_info});
                intent.putExtras(bundle);
                startActivityForResult(intent, 1000);
                return;
            }
            return;
        }
        String strTrim = ((EditText) findViewById(R.id.tv_keyword)).getText().toString().trim();
        if (strTrim.equals("")) {
            Toast.makeText(this, R.string.warning_keyword_empty, 0).show();
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f4432h.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            boolean z = str.toLowerCase().contains(strTrim);
            if (!z && value != null && value.toString().toLowerCase().contains(strTrim)) {
                z = true;
            }
            if (z) {
                linkedHashMap.put(str, value);
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(str);
                if (value != null) {
                    arrayList2.add(value.toString());
                } else {
                    arrayList2.add("");
                }
                arrayList.add(arrayList2);
            }
        }
        if (linkedHashMap.isEmpty()) {
            Toast.makeText(this, "No record found.", 0).show();
        } else {
            this.f4433i = linkedHashMap;
            this.f4436m.m4023b(arrayList);
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        this.f4439p = C1068ax.c_006(getIntent(), "themeId");
        this.f4440q = this.f4439p != 0;
        setContentView(R.layout.appdm_activity_prefdetail);
        try {
            "gplay".equals(getPackageManager().getApplicationInfo(getPackageName(), 128).metaData.getString("com.gmail.heagoo.publish_channel"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.f4435l = C1068ax.b_007(getIntent(), "isRootMode");
        this.f4427c = C1068ax.a_008(getIntent(), "appName");
        this.f4425a = C1068ax.a_008(getIntent(), "xmlFilePath");
        this.f4429e = (ScrollView) findViewById(R.id.scroll_view);
        this.f4430f = (ProgressBar) findViewById(R.id.progress_bar);
        this.f4431g = (TableLayout) findViewById(R.id.valueTable);
        ((TextView) findViewById(R.id.tv_appname)).setText(this.f4427c);
        TextView textView = (TextView) findViewById(R.id.tv_prefname);
        String str = this.f4425a;
        textView.setText(str.substring(str.lastIndexOf("/") + 1).substring(0, r2.length() - 4));
        findViewById(R.id.button_close).setOnClickListener(this);
        this.f4438o = (Button) findViewById(R.id.button_search);
        this.f4438o.setVisibility(8);
        this.f4438o.setOnClickListener(this);
        findViewById(R.id.btn_raw_file).setOnClickListener(this);
        m3649a();
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
