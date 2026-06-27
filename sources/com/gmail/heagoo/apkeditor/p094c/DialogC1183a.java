package com.gmail.heagoo.apkeditor.p094c;

import android.app.Activity;
import android.app.Dialog;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;
import com.gmail.heagoo.apkeditor.C1332gp;
import com.gmail.heagoo.apkeditor.InterfaceC1334gr;
import com.gmail.heagoo.apkeditor.TextEditNormalActivity;
import com.gmail.heagoo.apkeditor.pro.R;
import com.gmail.heagoo.apkeditor.util.C1460ab;
import com.gmail.heagoo.apkeditor.util.C1485z;
import com.gmail.heagoo.common.C1574w;
import com.gmail.heagoo.p084a.p089c.C1067a;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.c.a */
/* JADX INFO: loaded from: classes.dex */
public final class DialogC1183a extends Dialog implements View.OnClickListener, InterfaceC1334gr {

    /* JADX INFO: renamed from: a */
    private TextView f3459a;

    /* JADX INFO: renamed from: b */
    private View f3460b;

    /* JADX INFO: renamed from: c */
    private WebView f3461c;

    /* JADX INFO: renamed from: d */
    private String f3462d;

    /* JADX INFO: renamed from: e */
    private File f3463e;

    /* JADX INFO: renamed from: f */
    private WeakReference f3464f;

    /* JADX INFO: renamed from: g */
    private HandlerC1185c f3465g;

    /* JADX INFO: renamed from: h */
    private C1332gp f3466h;

    public DialogC1183a(Activity activity) {
        super(activity, R.style.Dialog_FullWindow);
        this.f3465g = new HandlerC1185c(this);
        this.f3466h = new C1332gp(this);
        this.f3464f = new WeakReference(activity);
        setContentView(R.layout.dlg_htmlview);
        this.f3459a = (TextView) findViewById(R.id.filename);
        this.f3460b = findViewById(R.id.menu_methods);
        this.f3461c = (WebView) findViewById(R.id.webView);
        View viewFindViewById = findViewById(R.id.editorBtn);
        this.f3460b.setOnClickListener(this);
        viewFindViewById.setOnClickListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m3089a(int i) {
        if (this.f3463e != null) {
            this.f3461c.loadUrl("file://" + this.f3463e.getAbsolutePath() + (i > 0 ? "#line" + i : ""));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public boolean m3092a(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(str));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                arrayList.add(line);
            }
            bufferedReader.close();
            try {
                File file = new File(((Activity) this.f3464f.get()).getFilesDir(), "viewsource.css");
                if (!file.exists()) {
                    InputStream inputStreamOpen = ((Activity) this.f3464f.get()).getAssets().open("viewsource.css");
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    C1067a.m2506b(inputStreamOpen, fileOutputStream);
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            File file2 = new File(((Activity) this.f3464f.get()).getFilesDir(), ".html");
            try {
                if (TextEditNormalActivity.m2878g(str)) {
                    new C1460ab().m3578a(arrayList, file2.getAbsolutePath());
                } else {
                    C1067a.m2480a(arrayList, file2.getAbsolutePath());
                }
                this.f3463e = file2;
                return true;
            } catch (IOException e2) {
                e2.printStackTrace();
                return false;
            }
        } catch (Exception e3) {
            e3.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public boolean m3094b(String str) {
        C1485z c1485z = new C1485z(str);
        File file = new File(((Activity) this.f3464f.get()).getFilesDir(), ".html");
        try {
            c1485z.m3644a(file.getAbsolutePath());
            this.f3463e = file;
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m3095a(String str, String str2) {
        if (!str.equals(this.f3462d)) {
            this.f3462d = str;
            this.f3459a.setText(str2);
            if (TextEditNormalActivity.m3388c(str)) {
                this.f3460b.setVisibility(0);
            } else {
                this.f3460b.setVisibility(8);
            }
            new C1184b(this, str).start();
        }
        show();
    }

    @Override // com.gmail.heagoo.apkeditor.InterfaceC1334gr
    /* JADX INFO: renamed from: b */
    public final void mo2851b(int i) {
        m3089a(i);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id = view.getId();
        if (id != R.id.menu_methods) {
            if (id == R.id.editorBtn) {
                dismiss();
            }
        } else {
            if (this.f3466h != null && this.f3466h.m3372a() != null) {
                this.f3466h.m3374a(view);
                return;
            }
            try {
                this.f3466h.m3373a((Activity) this.f3464f.get(), this.f3462d, new C1574w(this.f3462d).m3799b(), view);
            } catch (Exception e) {
            }
        }
    }
}
