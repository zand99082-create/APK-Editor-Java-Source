package com.gmail.heagoo.apkeditor;

import adrt.ADRTLogCatReader;
import android.app.ActionBar;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.gmail.heagoo.apkeditor.pro.R;
import p000a.p001a.p003b.p004a.C0037k;

/* JADX INFO: loaded from: classes.dex */
public class UpdateView extends PreferenceActivity {
    @Override // android.preference.PreferenceActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        ADRTLogCatReader.onContext(this, "com.aide.ui.fagmmmu.kotlin");
        setTheme(C0037k.m91md(C0037k.m89a(this)));
        super.onCreate(bundle);
        ActionBar actionBar = getActionBar();
        View viewInflate = getLayoutInflater().inflate(R.layout.mtrl_toolbar, (ViewGroup) null);
        ActionBar.LayoutParams layoutParams = new ActionBar.LayoutParams(-2, -1, 17);
        ((TextView) viewInflate.findViewById(android.R.id.title)).setText(R.string.update_settings);
        actionBar.setCustomView(viewInflate, layoutParams);
        actionBar.setDisplayShowCustomEnabled(true);
        actionBar.setDisplayShowTitleEnabled(false);
        actionBar.setDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.update_view);
        addPreferencesFromResource(R.xml.web_setting);
        findPreference("checkForUpdates").setOnPreferenceClickListener(new Preference.OnPreferenceClickListener(this) { // from class: com.gmail.heagoo.apkeditor.UpdateView.100000000
            private final UpdateView this$0;

            {
                this.this$0 = this;
            }

            @Override // android.preference.Preference.OnPreferenceClickListener
            public boolean onPreferenceClick(Preference preference) {
                new UpdaterAssistant(this.this$0, true).checkForUpdates();
                return true;
            }
        });
    }
}
