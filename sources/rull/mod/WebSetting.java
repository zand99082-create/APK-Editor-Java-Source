package rull.mod;

import adrt.ADRTLogCatReader;
import android.app.ActionBar;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.gmail.heagoo.apkeditor.pro.R;
import p000a.p001a.p003b.p004a.C0037k;

/* JADX INFO: loaded from: classes.dex */
public class WebSetting extends PreferenceActivity {
    @Override // android.preference.PreferenceActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        ADRTLogCatReader.onContext(this, "com.aide.ui.fagmmmu.kotlin");
        setTheme(C0037k.m91md(C0037k.m89a(this)));
        super.onCreate(bundle);
        addPreferencesFromResource(setResource("web_setting", "xml"));
        ActionBar actionBar = getActionBar();
        View viewInflate = getLayoutInflater().inflate(R.layout.mtrl_toolbar, (ViewGroup) null);
        ActionBar.LayoutParams layoutParams = new ActionBar.LayoutParams(-2, -1, 17);
        ((TextView) viewInflate.findViewById(android.R.id.title)).setText(setResource("web_setting_header", "string"));
        actionBar.setCustomView(viewInflate, layoutParams);
        actionBar.setDisplayShowCustomEnabled(true);
        actionBar.setDisplayShowTitleEnabled(false);
        actionBar.setDisplayHomeAsUpEnabled(true);
    }

    public int setResource(String str, String str2) {
        return getResources().getIdentifier(str, str2, getPackageName());
    }
}
