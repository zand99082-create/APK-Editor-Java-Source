package com.gmail.heagoo.apkeditor;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.gmail.heagoo.apkeditor.p098se.ApkCreateActivity;
import com.gmail.heagoo.apkeditor.p098se.C1453z;
import com.gmail.heagoo.apkeditor.p098se.InterfaceC1435h;
import com.gmail.heagoo.apkeditor.p098se.ViewOnClickListenerC1448u;
import com.gmail.heagoo.apkeditor.pro.R;
import com.gmail.heagoo.common.C1552a;
import com.gmail.heagoo.common.C1553b;
import com.gmail.heagoo.p084a.p089c.C1067a;
import java.util.Map;
import p000a.p001a.p003b.p004a.C0037k;

/* JADX INFO: loaded from: classes.dex */
public class AxmlEditActivity extends Activity implements View.OnClickListener, InterfaceC1435h {

    /* JADX INFO: renamed from: b */
    private String f2986b;

    /* JADX INFO: renamed from: c */
    private C1553b f2987c;

    /* JADX INFO: renamed from: e */
    private ViewOnClickListenerC1448u f2988e;

    /* JADX INFO: renamed from: f */
    private HandlerC1174bs f2989f;

    /* JADX INFO: renamed from: g */
    private C1175bt f2990g;

    /* JADX INFO: renamed from: h */
    private ListView f2991h;

    /* JADX INFO: renamed from: i */
    private Button f2992i;

    /* JADX INFO: renamed from: j */
    private TextView f2993j;

    /* JADX INFO: renamed from: k */
    private C1453z f2994k;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public String m2741a() {
        try {
            return getPackageManager().getApplicationInfo("com.gmail.heagoo.apkeditor.pro", 0).publicSourceDir;
        } catch (Throwable th) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    static /* synthetic */ void m2742a(AxmlEditActivity axmlEditActivity) throws Throwable {
        axmlEditActivity.f2994k = new C1453z(axmlEditActivity.f2986b);
        axmlEditActivity.f2994k.m3555a();
    }

    /* JADX INFO: renamed from: c */
    static /* synthetic */ String m2744c(AxmlEditActivity axmlEditActivity) {
        new C1405m(axmlEditActivity, null, null, null).m3468a();
        return axmlEditActivity.getFilesDir().getAbsolutePath() + "/bin/";
    }

    @Override // com.gmail.heagoo.apkeditor.p098se.InterfaceC1435h
    /* JADX INFO: renamed from: a */
    public final void mo2748a(String str) {
        this.f2993j.setText(str);
    }

    /* JADX INFO: renamed from: a */
    public final void m2749a(boolean z) {
        findViewById(R.id.progress_bar).setVisibility(8);
        if (!z) {
            Toast.makeText(this, this.f2990g.f3441a, 0).show();
            finish();
            return;
        }
        this.f2991h.setVisibility(0);
        this.f2988e = new ViewOnClickListenerC1448u(this, this, this.f2994k, true);
        this.f2991h.setAdapter((ListAdapter) this.f2988e);
        this.f2991h.setOnItemClickListener(this.f2988e);
        this.f2991h.setOnItemLongClickListener(this.f2988e);
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        if (i == 0 && i2 == 1) {
            new DialogC1284ey(this, new C1176bu(this, intent.getStringExtra("xmlPath"), intent.getStringExtra("extraString")), -1).show();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.btn_close) {
            finish();
            return;
        }
        if (id == R.id.btn_save) {
            Map mapM3549d = this.f2988e.m3549d();
            Intent intent = new Intent(this, (Class<?>) ApkCreateActivity.class);
            C1067a.m2442a(intent, "apkPath", this.f2986b);
            C1067a.m2442a(intent, "packageName", this.f2987c.f4630b);
            if (!mapM3549d.isEmpty()) {
                C1067a.m2468a(intent, "otherReplaces", mapM3549d);
            }
            startActivity(intent);
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        setTheme(C0037k.mdNoActionBar(C0037k.m89a(this)));
        super.onCreate(bundle);
        setContentView(R.layout.activity_axmledit);
        this.f2986b = C1067a.m2457a(getIntent(), "apkPath");
        try {
            new C1552a();
            this.f2987c = C1552a.m3750a(this, this.f2986b);
        } catch (Exception e) {
            Toast.makeText(this, getResources().getString(R.string.cannot_parse_apk) + ": " + e.getMessage(), 1).show();
        }
        if (this.f2987c == null) {
            finish();
            return;
        }
        this.f2989f = new HandlerC1174bs(this);
        this.f2990g = new C1175bt(this);
        this.f2990g.start();
        this.f2991h = (ListView) findViewById(R.id.files_list);
        this.f2993j = (TextView) findViewById(R.id.tv_summary);
        this.f2992i = (Button) findViewById(R.id.btn_save);
        Button button = (Button) findViewById(R.id.btn_close);
        this.f2991h.setVisibility(4);
        this.f2992i.setOnClickListener(this);
        button.setOnClickListener(this);
        if (this.f2987c != null) {
            ((ImageView) findViewById(R.id.apk_icon)).setImageDrawable(this.f2987c.f4631c);
            ((TextView) findViewById(R.id.apk_label)).setText(this.f2987c.f4629a);
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        if (this.f2988e != null) {
            this.f2988e.m3550e();
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putString("apkPath", this.f2986b);
        super.onSaveInstanceState(bundle);
    }
}
