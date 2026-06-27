package com.gmail.heagoo.apkeditor;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.gmail.heagoo.apkeditor.p098se.SimpleEditActivity;
import com.gmail.heagoo.apkeditor.pro.R;
import com.gmail.heagoo.p084a.p089c.C1067a;
import java.util.ArrayList;
import java.util.List;
import p000a.p001a.p003b.p004a.C0037k;

/* JADX INFO: loaded from: classes.dex */
public class ApkSearchActivity extends Activity implements AdapterView.OnItemClickListener, InterfaceC1189cd, View.OnClickListener {

    /* JADX INFO: renamed from: b */
    private String f2980b;

    /* JADX INFO: renamed from: c */
    private String f2981c;

    /* JADX INFO: renamed from: d */
    private List f2982d = new ArrayList();

    /* JADX INFO: renamed from: e */
    private TextView f2983e;

    /* JADX INFO: renamed from: f */
    private View f2984f;

    /* JADX INFO: renamed from: g */
    private C1158bc f2985g;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m2734a(int i) {
        String strSubstring = String.format(getString(R.string.str_files_found), Integer.valueOf(i), this.f2980b);
        if ("".equals(this.f2980b)) {
            strSubstring = strSubstring.substring(0, strSubstring.length() - 4);
        }
        this.f2983e.setText(strSubstring);
    }

    @Override // com.gmail.heagoo.apkeditor.InterfaceC1189cd
    /* JADX INFO: renamed from: a */
    public final void mo2740a(int i, String str) {
        Intent intent = null;
        switch (i) {
            case 0:
                UserAppActivity.m2900a(this, str);
                return;
            case 1:
                intent = new Intent(this, (Class<?>) SimpleEditActivity.class);
                break;
            case 2:
                intent = new Intent(this, (Class<?>) CommonEditActivity.class);
                break;
            case 4:
                intent = new Intent(this, (Class<?>) AxmlEditActivity.class);
                break;
        }
        if (intent != null) {
            C1067a.m2442a(intent, "apkPath", str);
            startActivity(intent);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_close /* 2131558539 */:
                finish();
                break;
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        setTheme(C0037k.mdNoActionBar(C0037k.m89a(this)));
        super.onCreate(bundle);
        setContentView(R.layout.activity_apksearch);
        Intent intent = getIntent();
        this.f2980b = C1067a.m2457a(intent, "Keyword");
        this.f2981c = C1067a.m2457a(intent, "Path");
        this.f2983e = (TextView) findViewById(R.id.title);
        ((RelativeLayout) findViewById(R.id.btn_close)).setOnClickListener(this);
        this.f2984f = findViewById(R.id.searching_layout);
        ListView listView = (ListView) findViewById(R.id.listview_apkfiles);
        this.f2985g = new C1158bc(this);
        listView.setAdapter((ListAdapter) this.f2985g);
        listView.setOnItemClickListener(this);
        m2734a(0);
        new C1165bj(this).start();
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        if (i < this.f2982d.size()) {
            String str = (String) this.f2982d.get(i);
            if (MainActivity.m2784a(this)) {
                new DialogC1188cc(this, this, str).show();
            } else {
                UserAppActivity.m2900a(this, str);
            }
        }
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
    }
}
