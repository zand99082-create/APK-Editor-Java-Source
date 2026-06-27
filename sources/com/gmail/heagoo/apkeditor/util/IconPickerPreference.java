package com.gmail.heagoo.apkeditor.util;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Build;
import android.preference.ListPreference;
import android.preference.PreferenceManager;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.gmail.heagoo.apkeditor.pro.R;
import com.gmail.heagoo.p084a.p089c.C1067a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class IconPickerPreference extends ListPreference {

    /* JADX INFO: renamed from: a */
    private Context f4316a;

    /* JADX INFO: renamed from: b */
    private int[] f4317b;

    /* JADX INFO: renamed from: c */
    private CharSequence[] f4318c;

    /* JADX INFO: renamed from: d */
    private CharSequence[] f4319d;

    /* JADX INFO: renamed from: e */
    private List f4320e;

    /* JADX INFO: renamed from: f */
    private SharedPreferences f4321f;

    /* JADX INFO: renamed from: g */
    private Resources f4322g;

    /* JADX INFO: renamed from: h */
    private String f4323h;

    /* JADX INFO: renamed from: i */
    private String f4324i;

    /* JADX INFO: renamed from: j */
    private TextView f4325j;

    public IconPickerPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4316a = context;
        this.f4322g = context.getResources();
        this.f4321f = PreferenceManager.getDefaultSharedPreferences(context);
        this.f4318c = this.f4322g.getStringArray(R.array.appicon_key);
        this.f4319d = this.f4322g.getStringArray(R.array.appicon_value);
        this.f4324i = this.f4319d[0].toString();
        this.f4323h = this.f4321f.getString("MyIcon", this.f4324i);
        this.f4317b = (int[]) C1067a.m2452a("com.gmail.heagoo.seticon.SetIcon", "getAllIcons", (Class[]) null, (Object[]) null);
    }

    @Override // android.preference.Preference
    protected void onBindView(View view) {
        super.onBindView(view);
        if (Build.VERSION.SDK_INT < 21) {
            view.setPadding((int) ((view.getPaddingLeft() / 16.0f) * 6.0f), view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
        }
        ((TextView) view.findViewById(R.id.title)).setText(R.string.launcher_icon);
        this.f4325j = (TextView) view.findViewById(R.id.summary);
        for (int i = 0; i < this.f4319d.length; i++) {
            if (this.f4323h.equals(this.f4319d[i])) {
                this.f4325j.setText(this.f4318c[i]);
                return;
            }
        }
    }

    @Override // android.preference.ListPreference, android.preference.DialogPreference
    protected void onDialogClosed(boolean z) {
        super.onDialogClosed(z);
        if (this.f4320e != null) {
            for (int i = 0; i < this.f4318c.length; i++) {
                C1481v c1481v = (C1481v) this.f4320e.get(i);
                if (c1481v.f4398b) {
                    SharedPreferences.Editor editorEdit = this.f4321f.edit();
                    editorEdit.putString("MyIcon", c1481v.f4400d);
                    editorEdit.commit();
                    this.f4325j.setText(c1481v.f4399c);
                    String str = c1481v.f4400d;
                    if (this.f4323h.equals(str)) {
                        return;
                    }
                    this.f4323h = str;
                    C1067a.m2452a("com.gmail.heagoo.seticon.SetIcon", "setIcon", new Class[]{Activity.class, String.class}, new Object[]{(Activity) this.f4316a, str});
                    Toast.makeText(this.f4316a, R.string.icon_changed_tip, 1).show();
                    return;
                }
            }
        }
    }

    @Override // android.preference.ListPreference, android.preference.DialogPreference
    protected void onPrepareDialogBuilder(AlertDialog.Builder builder) {
        builder.setNegativeButton(android.R.string.cancel, (DialogInterface.OnClickListener) null);
        builder.setPositiveButton((CharSequence) null, (DialogInterface.OnClickListener) null);
        this.f4318c = getEntries();
        this.f4319d = getEntryValues();
        if (this.f4318c == null || this.f4319d == null || this.f4318c.length != this.f4319d.length) {
            throw new IllegalStateException("Invalid arguments.");
        }
        this.f4320e = new ArrayList();
        for (int i = 0; i < this.f4318c.length; i++) {
            this.f4320e.add(new C1481v(this.f4318c[i], this.f4319d[i], this.f4317b[i], this.f4323h.equals(this.f4319d[i])));
        }
        builder.setAdapter(new C1479t(this, this.f4316a, R.layout.item_iconpicker, this.f4320e), null);
    }
}
