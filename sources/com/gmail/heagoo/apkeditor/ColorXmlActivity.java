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
import android.widget.Toast;
import com.gmail.heagoo.apkeditor.pro.R;
import com.gmail.heagoo.p084a.p089c.C1067a;
import com.p078b.p079a.AlertDialogC1013f;
import com.p078b.p079a.C1014g;
import com.p078b.p079a.C1015h;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import p000a.p001a.p003b.p004a.C0037k;

/* JADX INFO: loaded from: classes.dex */
public class ColorXmlActivity extends Activity implements View.OnClickListener, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a */
    private String f2995a;

    /* JADX INFO: renamed from: b */
    private ArrayList f2996b;

    /* JADX INFO: renamed from: c */
    private C1015h f2997c;

    /* JADX INFO: renamed from: d */
    private RelativeLayout f2998d;

    /* JADX WARN: Removed duplicated region for block: B:40:0x008c  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m2750a() throws Throwable {
        BufferedReader bufferedReader;
        C1014g c1014g;
        int i;
        int iIndexOf;
        BufferedReader bufferedReader2 = null;
        this.f2996b = new ArrayList();
        try {
            bufferedReader = new BufferedReader(new FileReader(new File(this.f2995a)));
            try {
                for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                    int iIndexOf2 = line.indexOf("<color name=\"");
                    if (iIndexOf2 == -1 || (iIndexOf = line.indexOf("\">", (i = iIndexOf2 + 13))) == -1) {
                        c1014g = null;
                    } else {
                        String strSubstring = line.substring(i, iIndexOf);
                        int i2 = iIndexOf + 2;
                        int iIndexOf3 = line.indexOf("</color>", i2);
                        if (iIndexOf3 != -1) {
                            c1014g = new C1014g(strSubstring, line.substring(i2, iIndexOf3));
                        }
                    }
                    if (c1014g != null) {
                        this.f2996b.add(c1014g);
                    }
                }
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                }
            } catch (Exception e2) {
                try {
                    bufferedReader.close();
                } catch (IOException e3) {
                }
            } catch (Throwable th) {
                bufferedReader2 = bufferedReader;
                th = th;
                try {
                    bufferedReader2.close();
                } catch (IOException e4) {
                }
                throw th;
            }
        } catch (Exception e5) {
            bufferedReader = null;
        } catch (Throwable th2) {
            th = th2;
        }
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (i4 >= this.f2996b.size()) {
                return;
            }
            ((C1014g) this.f2996b.get(i4)).m2308a(this, this.f2996b);
            i3 = i4 + 1;
        }
    }

    /* JADX INFO: renamed from: b */
    private void m2751b() {
        Intent intent = new Intent();
        intent.putExtra("xmlPath", this.f2995a);
        intent.putExtra("extraString", "res/values/colors.xml");
        setResult(1, intent);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [android.widget.Button, android.widget.RelativeLayout] */
    /* JADX INFO: renamed from: a */
    protected final void m2752a(int i, int i2) {
        if (i < this.f2996b.size()) {
            C1014g c1014g = (C1014g) this.f2996b.get(i);
            c1014g.f2633c = i2;
            c1014g.f2632b = "#" + Integer.toHexString(i2);
            this.f2998d.setVisibility(0);
            this.f2997c.notifyDataSetChanged();
        }
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) throws Throwable {
        switch (i) {
            case 0:
                if (i2 != 0) {
                    m2750a();
                    this.f2997c.m2309a(this.f2996b);
                    m2751b();
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    @Override // android.view.View.OnClickListener
    public void onClick(View view) throws Throwable {
        BufferedWriter bufferedWriter;
        BufferedWriter id = view.getId();
        if (id == R.id.btn_close) {
            finish();
            return;
        }
        try {
            if (id != R.id.btn_save) {
                if (id == R.id.btn_openeditor) {
                    Intent intentM2439a = C1067a.m2439a(this, this.f2995a, (String) null);
                    C1067a.m2442a(intentM2439a, "syntaxFileName", "xml.xml");
                    C1067a.m2442a(intentM2439a, "displayFileName", "colors.xml");
                    C1067a.m2442a(intentM2439a, "extraString", "res/values/colors.xml");
                    startActivityForResult(intentM2439a, 0);
                    return;
                }
                return;
            }
            try {
                bufferedWriter = new BufferedWriter(new FileWriter(this.f2995a));
                try {
                    bufferedWriter.write("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n");
                    bufferedWriter.write("<resources>\n");
                    for (int i = 0; i < this.f2996b.size(); i++) {
                        bufferedWriter.write(((C1014g) this.f2996b.get(i)).toString());
                        bufferedWriter.write("\n");
                    }
                    bufferedWriter.write("</resources>");
                    m2751b();
                    try {
                        bufferedWriter.close();
                    } catch (IOException e) {
                    }
                } catch (Exception e2) {
                    e = e2;
                    Toast.makeText(this, String.format(getString(R.string.general_error), e.getMessage()), 1).show();
                    if (bufferedWriter != null) {
                        try {
                            bufferedWriter.close();
                        } catch (IOException e3) {
                        }
                    }
                }
            } catch (Exception e4) {
                e = e4;
                bufferedWriter = null;
            } catch (Throwable th) {
                th = th;
                id = 0;
                if (id != 0) {
                    try {
                        id.close();
                    } catch (IOException e5) {
                    }
                }
                throw th;
            }
            finish();
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) throws Throwable {
        setTheme(C0037k.mdNoActionBar(C0037k.m89a(this)));
        super.onCreate(bundle);
        setContentView(R.layout.activity_colors_xml);
        this.f2995a = C1067a.m2457a(getIntent(), "xmlPath");
        m2750a();
        ((TextView) findViewById(R.id.filename)).setText(this.f2995a.substring(this.f2995a.lastIndexOf(47) + 1));
        this.f2997c = new C1015h(this, this.f2996b);
        ListView listView = (ListView) findViewById(R.id.color_list);
        listView.setAdapter((ListAdapter) this.f2997c);
        listView.setOnItemClickListener(this);
        this.f2998d = (RelativeLayout) findViewById(R.id.btn_save);
        this.f2998d.setOnClickListener(this);
        ((RelativeLayout) findViewById(R.id.btn_close)).setOnClickListener(this);
        ((RelativeLayout) findViewById(R.id.btn_openeditor)).setOnClickListener(this);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        new AlertDialogC1013f(this, ((C1014g) this.f2996b.get(i)).f2633c, new C1178bw(this, i)).show();
    }
}
