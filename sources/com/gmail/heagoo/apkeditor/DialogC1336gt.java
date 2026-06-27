package com.gmail.heagoo.apkeditor;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import com.gmail.heagoo.apkeditor.pro.R;
import com.gmail.heagoo.p084a.p089c.C1067a;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.gt */
/* JADX INFO: loaded from: classes.dex */
public final class DialogC1336gt extends Dialog implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    private View f3893a;

    /* JADX INFO: renamed from: b */
    private Context f3894b;

    @SuppressLint({"InflateParams"})
    public DialogC1336gt(Context context) {
        super(context);
        requestWindowFeature(1);
        this.f3894b = context;
        this.f3893a = LayoutInflater.from(context).inflate(R.layout.dlg_smali_license, (ViewGroup) null);
        setContentView(this.f3893a);
        m3376a();
    }

    /* JADX INFO: renamed from: a */
    private void m3376a() {
        InputStream inputStreamOpen = null;
        StringBuilder sb = new StringBuilder();
        try {
            try {
                inputStreamOpen = this.f3894b.getAssets().open("smali-NOTICE");
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen));
                for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                    sb.append(line + "\n");
                }
                if (inputStreamOpen != null) {
                    try {
                        inputStreamOpen.close();
                    } catch (IOException e) {
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                if (inputStreamOpen != null) {
                    try {
                        inputStreamOpen.close();
                    } catch (IOException e3) {
                    }
                }
            }
            ((TextView) this.f3893a.findViewById(R.id.content)).setText(sb.toString());
            ((Button) this.f3893a.findViewById(R.id.close_button)).setOnClickListener(this);
        } catch (Throwable th) {
            if (inputStreamOpen != null) {
                try {
                    inputStreamOpen.close();
                } catch (IOException e4) {
                }
            }
            throw th;
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (((CheckBox) this.f3893a.findViewById(R.id.cb_show_once)).isChecked()) {
            C1067a.m2502b(this.f3894b, "smali_license_showed", true);
        }
        dismiss();
    }
}
