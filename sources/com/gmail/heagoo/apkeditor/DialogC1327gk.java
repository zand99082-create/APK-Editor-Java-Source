package com.gmail.heagoo.apkeditor;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.Toast;
import com.gmail.heagoo.apkeditor.pro.R;
import com.gmail.heagoo.p084a.p089c.C1067a;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.gk */
/* JADX INFO: loaded from: classes.dex */
public final class DialogC1327gk extends Dialog implements View.OnClickListener {

    /* JADX INFO: renamed from: e */
    private static int[] f3869e = {R.string.show_a_toast, R.string.log_a_message, R.string.dump_a_value, R.string.print_stack_trace};

    /* JADX INFO: renamed from: f */
    private static String[] f3870f = {"    const-string v0, \"This is a toast.\"\n    # p0 (this object) must be an object of Context\n    invoke-static {p0, v0}, Lapkeditor/Utils;->showToast(Landroid/content/Context;Ljava/lang/String;)V", "    # use 'adb logcat APKEDITOR:* *:S' to view the log\n    const-string v0, \"I am here.\"\n    invoke-static {v0}, Lapkeditor/Utils;->log(Ljava/lang/String;)V", "    # use 'adb logcat APKEDITOR:* *:S' to view the value\n    invoke-static {v0}, Lapkeditor/Utils;->dumpValue(Ljava/lang/Object;)V", "    # use 'adb logcat APKEDITOR:* *:S' to view the stack trace\n    invoke-static {}, Lapkeditor/Utils;->printCallStack()V"};

    /* JADX INFO: renamed from: a */
    private WeakReference f3871a;

    /* JADX INFO: renamed from: b */
    private String f3872b;

    /* JADX INFO: renamed from: c */
    private Spinner f3873c;

    /* JADX INFO: renamed from: d */
    private EditText f3874d;

    public DialogC1327gk(Activity activity, String str) {
        super(activity);
        requestWindowFeature(1);
        this.f3871a = new WeakReference(activity);
        this.f3872b = m3365a(str);
        m3366a(activity);
        getWindow().setLayout((activity.getResources().getDisplayMetrics().widthPixels * 6) / 7, -2);
    }

    /* JADX INFO: renamed from: a */
    private static String m3365a(String str) {
        String str2 = "";
        for (String str3 : str.split("/")) {
            str2 = str2 + str3 + "/";
            if ("smali".equals(str3) || str3.startsWith("smali_")) {
                break;
            }
        }
        return str2;
    }

    @SuppressLint({"InflateParams"})
    /* JADX INFO: renamed from: a */
    private void m3366a(Activity activity) {
        View viewInflate = LayoutInflater.from(activity).inflate(R.layout.dlg_smalicode, (ViewGroup) null);
        this.f3873c = (Spinner) viewInflate.findViewById(R.id.spinner_codename);
        String[] strArr = new String[f3869e.length];
        for (int i = 0; i < f3869e.length; i++) {
            strArr[i] = activity.getString(f3869e[i]);
        }
        ArrayAdapter arrayAdapter = new ArrayAdapter(activity, android.R.layout.simple_spinner_item, strArr);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.f3873c.setAdapter((SpinnerAdapter) arrayAdapter);
        this.f3873c.setOnItemSelectedListener(new C1328gl(this));
        this.f3874d = (EditText) viewInflate.findViewById(R.id.et_samplecode);
        ((Button) viewInflate.findViewById(R.id.btn_copy)).setOnClickListener(this);
        ((Button) viewInflate.findViewById(R.id.btn_close)).setOnClickListener(this);
        setContentView(viewInflate);
    }

    /* JADX INFO: renamed from: a */
    private static void m3367a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    protected final void m3368a(int i) {
        if (i < f3870f.length) {
            this.f3874d.setText(f3870f[i]);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        FileOutputStream fileOutputStream;
        InputStream inputStreamOpen = null;
        int id = view.getId();
        if (id == R.id.btn_close) {
            dismiss();
            return;
        }
        if (id == R.id.btn_copy) {
            Activity activity = (Activity) this.f3871a.get();
            ((ClipboardManager) activity.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("code", this.f3874d.getText().toString()));
            String str = this.f3872b + "apkeditor";
            File file = new File(str);
            if (!file.exists()) {
                file.mkdir();
            }
            File file2 = new File(str + "/Utils.smali");
            if (!file2.exists()) {
                try {
                    fileOutputStream = new FileOutputStream(file2);
                    try {
                        try {
                            inputStreamOpen = ((Activity) this.f3871a.get()).getAssets().open("smali_patch/Utils.smali");
                            C1067a.m2506b(inputStreamOpen, fileOutputStream);
                            m3367a(fileOutputStream);
                            m3367a(inputStreamOpen);
                        } catch (Exception e) {
                            e = e;
                            e.printStackTrace();
                            m3367a(fileOutputStream);
                            m3367a(inputStreamOpen);
                        }
                    } catch (Throwable th) {
                        th = th;
                        m3367a(fileOutputStream);
                        m3367a(inputStreamOpen);
                        throw th;
                    }
                } catch (Exception e2) {
                    e = e2;
                    fileOutputStream = null;
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = null;
                    m3367a(fileOutputStream);
                    m3367a(inputStreamOpen);
                    throw th;
                }
            }
            Toast.makeText(activity, R.string.smali_copied, 0).show();
        }
    }
}
