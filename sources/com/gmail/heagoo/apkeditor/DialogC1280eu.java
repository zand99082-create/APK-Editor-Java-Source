package com.gmail.heagoo.apkeditor;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.android.apksig.apk.ApkUtils;
import com.gmail.heagoo.apkeditor.p090a.C1111g;
import com.gmail.heagoo.apkeditor.p090a.C1113i;
import com.gmail.heagoo.apkeditor.p096e.C1240e;
import com.gmail.heagoo.apkeditor.p096e.InterfaceC1237b;
import com.gmail.heagoo.apkeditor.pro.R;
import com.gmail.heagoo.p084a.p089c.C1067a;
import jadx.core.deobf.Deobfuscator;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.eu */
/* JADX INFO: loaded from: classes.dex */
public final class DialogC1280eu extends Dialog implements View.OnClickListener, InterfaceC1237b {

    /* JADX INFO: renamed from: a */
    private WeakReference f3715a;

    /* JADX INFO: renamed from: b */
    private String f3716b;

    /* JADX INFO: renamed from: c */
    private String f3717c;

    /* JADX INFO: renamed from: d */
    private View f3718d;

    /* JADX INFO: renamed from: e */
    private TextView f3719e;

    /* JADX INFO: renamed from: f */
    private TextView f3720f;

    /* JADX INFO: renamed from: g */
    private Button f3721g;

    /* JADX INFO: renamed from: i */
    private View f3722i;

    /* JADX INFO: renamed from: j */
    private TextView f3723j;

    /* JADX INFO: renamed from: k */
    private C1111g f3724k;

    /* JADX INFO: renamed from: l */
    private C1240e f3725l;

    /* JADX INFO: renamed from: m */
    private Map f3726m;

    /* JADX INFO: renamed from: n */
    private ProgressBar f3727n;

    public DialogC1280eu(ApkInfoActivity apkInfoActivity) {
        super(apkInfoActivity);
        this.f3716b = null;
        this.f3717c = null;
        this.f3726m = new HashMap();
        requestWindowFeature(1);
        this.f3715a = new WeakReference(apkInfoActivity);
        View viewInflate = LayoutInflater.from(apkInfoActivity).inflate(R.layout.dlg_patch, (ViewGroup) null);
        this.f3718d = viewInflate.findViewById(R.id.tv_curpatch);
        this.f3718d.setOnClickListener(this);
        this.f3719e = (TextView) viewInflate.findViewById(R.id.tv_patch_path);
        ((Button) viewInflate.findViewById(R.id.btn_close)).setOnClickListener(this);
        this.f3721g = (Button) viewInflate.findViewById(R.id.btn_select_apply);
        this.f3721g.setOnClickListener(this);
        this.f3727n = (ProgressBar) viewInflate.findViewById(R.id.progress_patch);
        this.f3720f = (TextView) viewInflate.findViewById(R.id.tv_save_patches);
        this.f3720f.setOnClickListener(this);
        this.f3722i = viewInflate.findViewById(R.id.log_layout);
        this.f3723j = (TextView) viewInflate.findViewById(R.id.tv_patchlog);
        setContentView(viewInflate);
        int i = apkInfoActivity.getResources().getDisplayMetrics().widthPixels;
        Window window = getWindow();
        window.setLayout((i * 7) / 8, -2);
        window.setFlags(128, 128);
    }

    /* JADX INFO: renamed from: a */
    private static String m3246a(C1111g c1111g, int i) {
        if (c1111g.f3302u != null && c1111g.f3302u.containsKey(Integer.valueOf(i))) {
            i = ((Integer) c1111g.f3302u.get(Integer.valueOf(i))).intValue();
        }
        if (i >= c1111g.f3296o.size()) {
            return null;
        }
        String str = (String) c1111g.f3296o.get(i);
        return str.startsWith(Deobfuscator.CLASS_NAME_SEPARATOR) ? c1111g.f3286e + str : !str.contains(Deobfuscator.CLASS_NAME_SEPARATOR) ? c1111g.f3286e + Deobfuscator.CLASS_NAME_SEPARATOR + str : str;
    }

    /* JADX INFO: renamed from: a */
    static /* synthetic */ void m3247a(DialogC1280eu dialogC1280eu, String str) throws Throwable {
        dialogC1280eu.f3722i.setVisibility(0);
        String strM3253c = dialogC1280eu.m3253c(str);
        if (strM3253c != null) {
            dialogC1280eu.f3723j.setText(strM3253c);
        }
        dialogC1280eu.f3717c = str;
        dialogC1280eu.f3719e.setText(dialogC1280eu.f3717c);
        dialogC1280eu.f3721g.setText(R.string.apply_the_patch);
    }

    /* JADX INFO: renamed from: a */
    private static void m3248a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m3249a(String str, boolean z, boolean z2) {
        ((ApkInfoActivity) this.f3715a.get()).runOnUiThread(new RunnableC1282ew(this, z2, str, z));
    }

    /* JADX INFO: renamed from: a */
    private static void m3250a(ZipFile zipFile) {
        if (zipFile != null) {
            try {
                zipFile.close();
            } catch (IOException e) {
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private boolean m3252b(String str) throws Throwable {
        InputStream inputStreamOpen;
        IOException iOException;
        boolean z;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        m3254g();
        String str2 = this.f3716b + str;
        try {
            try {
                inputStreamOpen = ((ApkInfoActivity) this.f3715a.get()).getAssets().open(str);
                try {
                    fileOutputStream = new FileOutputStream(str2);
                } catch (IOException e) {
                    iOException = e;
                }
            } catch (Throwable th) {
                th = th;
            }
            try {
                C1067a.m2506b(inputStreamOpen, fileOutputStream);
                m3248a(inputStreamOpen);
                m3248a(fileOutputStream);
                z = true;
            } catch (IOException e2) {
                fileOutputStream2 = fileOutputStream;
                iOException = e2;
                Toast.makeText((Context) this.f3715a.get(), iOException.getMessage(), 0).show();
                m3248a(inputStreamOpen);
                m3248a(fileOutputStream2);
                z = false;
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream2 = fileOutputStream;
                m3248a(inputStreamOpen);
                m3248a(fileOutputStream2);
                throw th;
            }
        } catch (IOException e3) {
            iOException = e3;
            inputStreamOpen = null;
        } catch (Throwable th3) {
            th = th3;
            inputStreamOpen = null;
        }
        return z;
    }

    /* JADX INFO: renamed from: c */
    private String m3253c(String str) throws Throwable {
        InputStream inputStream;
        ZipFile zipFile;
        Throwable th;
        String strM2459a = null;
        try {
            try {
                zipFile = new ZipFile(str);
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                ZipEntry entry = zipFile.getEntry("patch.txt");
                if (entry == null) {
                    mo3162a(R.string.patch_error_no_entry, "patch.txt");
                }
                inputStream = zipFile.getInputStream(entry);
                try {
                    strM2459a = C1067a.m2459a(inputStream);
                    m3248a(inputStream);
                    m3250a(zipFile);
                } catch (Exception e) {
                    e = e;
                    mo3162a(R.string.general_error, e.getMessage());
                    m3248a(inputStream);
                    m3250a(zipFile);
                }
            } catch (Exception e2) {
                e = e2;
                inputStream = null;
            } catch (Throwable th3) {
                inputStream = null;
                th = th3;
                m3248a(inputStream);
                m3250a(zipFile);
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            inputStream = null;
            zipFile = null;
        } catch (Throwable th4) {
            inputStream = null;
            zipFile = null;
            th = th4;
        }
        return strM2459a;
    }

    /* JADX INFO: renamed from: g */
    private void m3254g() {
        if (this.f3716b == null) {
            try {
                this.f3716b = C1067a.m2525d((Context) this.f3715a.get(), "patches");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: h */
    private void m3255h() {
        m3254g();
        new DialogC1197cn((Context) this.f3715a.get(), new C1281ev(this), ".zip", null, ((ApkInfoActivity) this.f3715a.get()).getString(R.string.select_patch), false, false, false, "patch", new File(this.f3716b).exists() ? this.f3716b : null).show();
    }

    /* JADX INFO: renamed from: i */
    private void m3256i() throws Throwable {
        ZipFile zipFile;
        InputStream inputStream = null;
        try {
            try {
                zipFile = new ZipFile(((ApkInfoActivity) this.f3715a.get()).m2726l());
                try {
                    inputStream = zipFile.getInputStream(zipFile.getEntry(ApkUtils.ANDROID_MANIFEST_ZIP_ENTRY_NAME));
                    C1113i c1113i = new C1113i(inputStream);
                    c1113i.m3022b();
                    this.f3724k = c1113i.m3021a();
                    m3248a(inputStream);
                    m3250a(zipFile);
                } catch (Exception e) {
                    e = e;
                    e.printStackTrace();
                    m3248a(inputStream);
                    m3250a(zipFile);
                }
            } catch (Throwable th) {
                th = th;
                m3248a(inputStream);
                m3250a(zipFile);
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            zipFile = null;
        } catch (Throwable th2) {
            th = th2;
            zipFile = null;
            m3248a(inputStream);
            m3250a(zipFile);
            throw th;
        }
    }

    static ProgressBar progressPatch(DialogC1280eu dialogC1280eu) {
        return dialogC1280eu.f3727n;
    }

    @Override // com.gmail.heagoo.apkeditor.p096e.InterfaceC1237b
    /* JADX INFO: renamed from: a */
    public final String mo3158a(int i) {
        return ((ApkInfoActivity) this.f3715a.get()).getString(i);
    }

    @Override // com.gmail.heagoo.apkeditor.p096e.InterfaceC1237b
    /* JADX INFO: renamed from: a */
    public final String mo3159a(String str) {
        return (String) this.f3726m.get(str);
    }

    @Override // com.gmail.heagoo.apkeditor.p096e.InterfaceC1237b
    /* JADX INFO: renamed from: a */
    public final void mo3160a() {
        ((ApkInfoActivity) this.f3715a.get()).runOnUiThread(new RunnableC1283ex(this));
    }

    @Override // com.gmail.heagoo.apkeditor.p096e.InterfaceC1237b
    /* JADX INFO: renamed from: a */
    public final void mo3161a(int i, boolean z, Object... objArr) {
        String str = String.format(((ApkInfoActivity) this.f3715a.get()).getString(i), objArr);
        m3249a(z ? "\n" + str + "\n" : str + "\n", z, false);
    }

    @Override // com.gmail.heagoo.apkeditor.p096e.InterfaceC1237b
    /* JADX INFO: renamed from: a */
    public final void mo3162a(int i, Object... objArr) {
        m3249a(String.format(((ApkInfoActivity) this.f3715a.get()).getString(i), objArr) + "\n", false, true);
    }

    @Override // com.gmail.heagoo.apkeditor.p096e.InterfaceC1237b
    /* JADX INFO: renamed from: a */
    public final void mo3163a(String str, String str2) {
        this.f3726m.put(str, str2);
    }

    @Override // com.gmail.heagoo.apkeditor.p096e.InterfaceC1237b
    /* JADX INFO: renamed from: a */
    public final void mo3164a(String str, boolean z, Object... objArr) {
        m3249a(String.format(str, objArr) + "\n", false, false);
    }

    @Override // com.gmail.heagoo.apkeditor.p096e.InterfaceC1237b
    /* JADX INFO: renamed from: b */
    public final String mo3165b() {
        return ((ApkInfoActivity) this.f3715a.get()).m2722i();
    }

    @Override // com.gmail.heagoo.apkeditor.p096e.InterfaceC1237b
    /* JADX INFO: renamed from: c */
    public final String mo3166c() throws Throwable {
        String str;
        if (this.f3724k == null) {
            m3256i();
        }
        if (this.f3724k != null && (str = this.f3724k.f3287f) != null) {
            return str.startsWith(Deobfuscator.CLASS_NAME_SEPARATOR) ? this.f3724k.f3286e + str : !str.contains(Deobfuscator.CLASS_NAME_SEPARATOR) ? this.f3724k.f3286e + Deobfuscator.CLASS_NAME_SEPARATOR + str : str;
        }
        return null;
    }

    @Override // com.gmail.heagoo.apkeditor.p096e.InterfaceC1237b
    /* JADX INFO: renamed from: d */
    public final List mo3167d() throws Throwable {
        if (this.f3724k == null) {
            m3256i();
        }
        if (this.f3724k == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f3724k.f3298q.entrySet()) {
            if (((Integer) entry.getValue()).intValue() == 0) {
                String strM3246a = m3246a(this.f3724k, ((Integer) entry.getKey()).intValue());
                if (!arrayList.contains(strM3246a)) {
                    arrayList.add(strM3246a);
                }
            }
        }
        return arrayList;
    }

    @Override // com.gmail.heagoo.apkeditor.p096e.InterfaceC1237b
    /* JADX INFO: renamed from: e */
    public final List mo3168e() throws Throwable {
        if (this.f3724k == null) {
            m3256i();
        }
        if (this.f3724k == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f3724k.f3301t.iterator();
        while (it.hasNext()) {
            String strM3246a = m3246a(this.f3724k, ((Integer) it.next()).intValue());
            if (!arrayList.contains(strM3246a)) {
                arrayList.add(strM3246a);
            }
        }
        return arrayList;
    }

    @Override // com.gmail.heagoo.apkeditor.p096e.InterfaceC1237b
    /* JADX INFO: renamed from: f */
    public final List mo3169f() {
        if (this.f3725l != null) {
            return this.f3725l.m3177c();
        }
        return null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id = view.getId();
        if (id == R.id.btn_close) {
            dismiss();
            return;
        }
        if (id == R.id.tv_curpatch) {
            m3255h();
            return;
        }
        if (id != R.id.btn_select_apply) {
            if (id != R.id.tv_save_patches || (!(m3252b("patch_app_rename.zip") | m3252b("patch_data_editor.zip") | m3252b("patch_new_entrance.zip") | m3252b("patch_my_font.zip") | m3252b("patch_mem_editor.zip") | m3252b("patch_bypass_sigcheck.zip") | m3252b("patch_launcher_toast.zip")) && !m3252b("patch_script_example.zip"))) {
                return;
            }
            Toast.makeText((Context) this.f3715a.get(), String.format(((ApkInfoActivity) this.f3715a.get()).getString(R.string.patch_examples_copied), this.f3716b), 0).show();
            return;
        }
        if (this.f3717c == null) {
            m3255h();
            return;
        }
        this.f3723j.setText("");
        this.f3721g.setEnabled(false);
        this.f3721g.setVisibility(8);
        this.f3727n.setVisibility(0);
        this.f3725l = new C1240e((ApkInfoActivity) this.f3715a.get(), this.f3717c, this);
        this.f3725l.m3176b();
    }
}
