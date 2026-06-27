package com.gmail.heagoo.apkeditor.p099ui;

import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.text.InputFilter;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.gmail.heagoo.apkeditor.DialogC1197cn;
import com.gmail.heagoo.apkeditor.InterfaceC1204cu;
import com.gmail.heagoo.apkeditor.pro.R;
import com.gmail.heagoo.common.C1552a;
import java.io.File;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.ui.a */
/* JADX INFO: loaded from: classes.dex */
public final class DialogC1456a extends Dialog implements View.OnClickListener, InterfaceC1204cu {

    /* JADX INFO: renamed from: a */
    private final InterfaceC1457b f4301a;

    /* JADX INFO: renamed from: b */
    private final WeakReference f4302b;

    /* JADX INFO: renamed from: c */
    private boolean f4303c;

    /* JADX INFO: renamed from: d */
    private View f4304d;

    /* JADX INFO: renamed from: e */
    private View f4305e;

    /* JADX INFO: renamed from: f */
    private View f4306f;

    /* JADX INFO: renamed from: g */
    private View f4307g;

    /* JADX INFO: renamed from: h */
    private EditText f4308h;

    /* JADX INFO: renamed from: i */
    private EditText f4309i;

    /* JADX INFO: renamed from: j */
    private boolean f4310j;

    public DialogC1456a(@NonNull Context context, InterfaceC1457b interfaceC1457b, boolean z) {
        super(context);
        this.f4310j = true;
        this.f4302b = new WeakReference(context);
        this.f4301a = interfaceC1457b;
        this.f4303c = z;
        setContentView(R.layout.dlg_add_folder);
        TextView textView = (TextView) findViewById(R.id.tv_new_folder);
        TextView textView2 = (TextView) findViewById(R.id.tv_import_folder);
        if (!this.f4303c) {
            textView2.setVisibility(8);
        }
        this.f4304d = findViewById(R.id.divider1);
        this.f4305e = findViewById(R.id.divider2);
        this.f4306f = findViewById(R.id.layout_new);
        this.f4307g = findViewById(R.id.layout_import);
        this.f4308h = (EditText) findViewById(R.id.et_folder_name);
        this.f4309i = (EditText) findViewById(R.id.et_folder_path);
        this.f4308h.setFilters(new InputFilter[]{C1552a.m3749a()});
        textView.setOnClickListener(this);
        textView2.setOnClickListener(this);
        findViewById(R.id.btn_browse).setOnClickListener(this);
        findViewById(R.id.btn_cancel).setOnClickListener(this);
        findViewById(R.id.btn_confirm).setOnClickListener(this);
    }

    @Override // com.gmail.heagoo.apkeditor.InterfaceC1204cu
    /* JADX INFO: renamed from: a */
    public final void mo2764a(String str, String str2, boolean z) {
        this.f4309i.setText(str);
    }

    @Override // com.gmail.heagoo.apkeditor.InterfaceC1204cu
    /* JADX INFO: renamed from: a */
    public final boolean mo2765a(String str, String str2) {
        return false;
    }

    @Override // com.gmail.heagoo.apkeditor.InterfaceC1204cu
    /* JADX INFO: renamed from: b */
    public final String mo2766b(String str, String str2) {
        return null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id = view.getId();
        if (id == R.id.tv_new_folder) {
            this.f4310j = true;
            this.f4304d.setVisibility(0);
            this.f4305e.setVisibility(4);
            this.f4306f.setVisibility(0);
            this.f4307g.setVisibility(4);
            return;
        }
        if (id == R.id.tv_import_folder) {
            this.f4310j = false;
            this.f4304d.setVisibility(4);
            this.f4305e.setVisibility(0);
            this.f4306f.setVisibility(4);
            this.f4307g.setVisibility(0);
            return;
        }
        if (id == R.id.btn_cancel) {
            dismiss();
            return;
        }
        if (id != R.id.btn_confirm) {
            if (id == R.id.btn_browse) {
                Context context = (Context) this.f4302b.get();
                new DialogC1197cn(context, this, "", "", context.getString(R.string.select_imported_folder), true, false, false, "import_folder").show();
                return;
            }
            return;
        }
        if (this.f4310j) {
            String strTrim = this.f4308h.getText().toString().trim();
            if ("".equals(strTrim)) {
                Toast.makeText((Context) this.f4302b.get(), R.string.empty_input_tip, 1).show();
                return;
            } else {
                this.f4301a.mo2710c(strTrim);
                dismiss();
                return;
            }
        }
        String strTrim2 = this.f4309i.getText().toString().trim();
        if ("".equals(strTrim2)) {
            Toast.makeText((Context) this.f4302b.get(), R.string.empty_input_tip, 1).show();
        } else if (!new File(strTrim2).exists()) {
            Toast.makeText((Context) this.f4302b.get(), String.format(((Context) this.f4302b.get()).getString(R.string.error_path_xxx_not_exist), strTrim2), 1).show();
        } else {
            this.f4301a.mo2713d(strTrim2);
            dismiss();
        }
    }
}
