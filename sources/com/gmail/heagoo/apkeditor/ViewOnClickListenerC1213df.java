package com.gmail.heagoo.apkeditor;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.gmail.heagoo.apkeditor.pro.R;
import java.io.File;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.df */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC1213df implements View.OnClickListener, InterfaceC1204cu {

    /* JADX INFO: renamed from: a */
    private View f3531a;

    /* JADX INFO: renamed from: b */
    private Context f3532b;

    /* JADX INFO: renamed from: c */
    private WeakReference f3533c;

    /* JADX INFO: renamed from: d */
    private EditText f3534d;

    /* JADX INFO: renamed from: e */
    private EditText f3535e;

    public ViewOnClickListenerC1213df(KeyListPreference keyListPreference) {
        this.f3533c = new WeakReference(keyListPreference);
    }

    /* JADX INFO: renamed from: a */
    protected final void m3123a() {
        String string = this.f3534d.getText().toString();
        String string2 = this.f3535e.getText().toString();
        if ("".equals(string) || "".equals(string2)) {
            Toast.makeText(this.f3532b, R.string.error_filepath_empty, 1).show();
            return;
        }
        File file = new File(string2);
        File file2 = new File(string);
        if (!file.exists() || !file2.exists()) {
            Toast.makeText(this.f3532b, R.string.error_filepath_notexist, 1).show();
            return;
        }
        SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(this.f3532b).edit();
        editorEdit.putString("PrivateKeyPath", string);
        editorEdit.putString("PublicKeyPath", string2);
        editorEdit.commit();
        KeyListPreference keyListPreference = (KeyListPreference) this.f3533c.get();
        keyListPreference.setValue(new StringBuilder().append((Object) keyListPreference.getEntryValues()[2]).toString());
    }

    /* JADX INFO: renamed from: a */
    public final void m3124a(Context context) {
        this.f3532b = context;
        this.f3531a = LayoutInflater.from(context).inflate(R.layout.dlg_keyselect, (ViewGroup) null, false);
        this.f3534d = (EditText) this.f3531a.findViewById(R.id.et_pk8path);
        this.f3535e = (EditText) this.f3531a.findViewById(R.id.et_x509path);
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.f3532b);
        this.f3534d.setText(defaultSharedPreferences.getString("PrivateKeyPath", ""));
        this.f3535e.setText(defaultSharedPreferences.getString("PublicKeyPath", ""));
        ((RelativeLayout) this.f3531a.findViewById(R.id.btn_select_pk8)).setOnClickListener(this);
        ((RelativeLayout) this.f3531a.findViewById(R.id.btn_select_x509)).setOnClickListener(this);
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setView(this.f3531a);
        builder.setTitle(R.string.custom_key_setting);
        builder.setPositiveButton(android.R.string.ok, new DialogInterfaceOnClickListenerC1214dg(this));
        builder.setNegativeButton(android.R.string.cancel, (DialogInterface.OnClickListener) null);
        builder.show();
    }

    @Override // com.gmail.heagoo.apkeditor.InterfaceC1204cu
    /* JADX INFO: renamed from: a */
    public final void mo2764a(String str, String str2, boolean z) {
        if (".pk8".equals(str2)) {
            this.f3534d.setText(str);
        } else {
            this.f3535e.setText(str);
        }
    }

    @Override // com.gmail.heagoo.apkeditor.InterfaceC1204cu
    /* JADX INFO: renamed from: a */
    public final boolean mo2765a(String str, String str2) {
        return str.endsWith(".pk8") || str.endsWith(str2);
    }

    @Override // com.gmail.heagoo.apkeditor.InterfaceC1204cu
    /* JADX INFO: renamed from: b */
    public final String mo2766b(String str, String str2) {
        return null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id = view.getId();
        if (id == R.id.btn_select_pk8) {
            new DialogC1197cn(this.f3532b, this, ".pk8", ".pk8", this.f3532b.getString(R.string.select_key_file)).show();
        } else if (id == R.id.btn_select_x509) {
            new DialogC1197cn(this.f3532b, this, ".x509.pem", ".pem", this.f3532b.getString(R.string.select_key_file)).show();
        }
    }
}
