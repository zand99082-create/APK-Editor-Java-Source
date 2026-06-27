package com.gmail.heagoo.apkeditor.prj;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.gmail.heagoo.apkeditor.ApkInfoActivity;
import com.gmail.heagoo.apkeditor.DialogC1284ey;
import com.gmail.heagoo.apkeditor.pro.R;
import com.gmail.heagoo.p084a.p089c.C1067a;
import common.types.ProjectInfo_V1;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p000a.p001a.p003b.p004a.C0037k;

/* JADX INFO: loaded from: classes.dex */
public class ProjectListActivity extends Activity implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    private C1419d f4118a;

    /* JADX INFO: renamed from: b */
    private String f4119b;

    /* JADX INFO: renamed from: c */
    private List f4120c;

    /* JADX INFO: renamed from: d */
    private C1417b f4121d;

    /* JADX INFO: renamed from: e */
    private HandlerC1418c f4122e = new HandlerC1418c(this);

    /* JADX INFO: renamed from: a */
    private static File m3480a(File[] fileArr) {
        if (fileArr == null) {
            return null;
        }
        for (File file : fileArr) {
            if (file.isFile() && file.getName().equals("ae.prj")) {
                return file;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    private List m3481a(String str) {
        File fileM3480a;
        ProjectInfo_V1 projectInfo_V1M2640a;
        File file = new File(str);
        ArrayList arrayList = new ArrayList();
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (!file2.isFile() && (fileM3480a = m3480a(file2.listFiles())) != null && (projectInfo_V1M2640a = ApkInfoActivity.m2640a(file2.getPath())) != null) {
                    arrayList.add(new C1421f(file2.getName(), projectInfo_V1M2640a.apkPath, projectInfo_V1M2640a.decodeRootPath, fileM3480a.lastModified()));
                }
            }
        }
        if (!arrayList.isEmpty()) {
            Collections.sort(arrayList, new C1416a(this));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    final void m3484a() {
        this.f4120c = m3481a(this.f4119b);
        this.f4118a.m3489a(this.f4120c);
        this.f4118a.notifyDataSetChanged();
        ((TextView) findViewById(R.id.tv_title)).setText(String.format(getString(R.string.project_num), Integer.valueOf(this.f4118a.m3488a())));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int iIntValue;
        int id = view.getId();
        if (id == R.id.btn_close) {
            finish();
        } else {
            if (id != R.id.menu_delete || (iIntValue = ((Integer) view.getTag()).intValue()) >= this.f4120c.size()) {
                return;
            }
            new DialogC1284ey(this, new C1422g(this, (C1421f) this.f4120c.get(iIntValue)), -1).show();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        setTheme(C0037k.mdNoActionBar(C0037k.m89a(this)));
        super.onCreate(bundle);
        setContentView(R.layout.activity_projectlist);
        ListView listView = (ListView) findViewById(R.id.project_list);
        try {
            this.f4119b = C1067a.m2525d(this, ".projects");
            this.f4120c = m3481a(this.f4119b);
            this.f4118a = new C1419d(this, this.f4120c);
            listView.setAdapter((ListAdapter) this.f4118a);
            listView.setOnItemClickListener(this.f4118a);
            this.f4121d = new C1417b(this);
            this.f4121d.start();
            ((TextView) findViewById(R.id.tv_title)).setText(String.format(getString(R.string.project_num), Integer.valueOf(this.f4118a.m3488a())));
            findViewById(R.id.btn_close).setOnClickListener(this);
        } catch (Exception e) {
            Toast.makeText(this, e.getMessage(), 1).show();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        if (this.f4121d != null && this.f4121d.isAlive()) {
            this.f4121d.m3485a();
        }
        super.onDestroy();
    }
}
