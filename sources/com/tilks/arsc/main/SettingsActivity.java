package com.tilks.arsc.main;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.CheckBoxPreference;
import android.preference.EditTextPreference;
import android.preference.Preference;
import android.preference.PreferenceActivity;
import android.preference.PreferenceManager;
import com.gmail.heagoo.apkeditor.pro.R;

/* JADX INFO: loaded from: classes.dex */
public class SettingsActivity extends PreferenceActivity {

    /* JADX INFO: renamed from: a */
    SharedPreferences f5077a;

    /* JADX INFO: renamed from: b */
    CheckBoxPreference f5078b;

    /* JADX INFO: renamed from: c */
    CheckBoxPreference f5079c;

    /* JADX INFO: renamed from: d */
    CheckBoxPreference f5080d;

    /* JADX INFO: renamed from: e */
    CheckBoxPreference f5081e;

    /* JADX INFO: renamed from: f */
    CheckBoxPreference f5082f;

    /* JADX INFO: renamed from: g */
    EditTextPreference f5083g;

    /* JADX INFO: renamed from: com.tilks.arsc.main.SettingsActivity$a */
    class C1696a implements Preference.OnPreferenceChangeListener {
        C1696a() {
        }

        @Override // android.preference.Preference.OnPreferenceChangeListener
        public boolean onPreferenceChange(Preference preference, Object obj) {
            SettingsActivity.this.f5078b.setChecked(((Boolean) obj).booleanValue());
            return true;
        }
    }

    /* JADX INFO: renamed from: com.tilks.arsc.main.SettingsActivity$b */
    class C1697b implements Preference.OnPreferenceChangeListener {
        C1697b() {
        }

        @Override // android.preference.Preference.OnPreferenceChangeListener
        public boolean onPreferenceChange(Preference preference, Object obj) {
            SettingsActivity.this.f5079c.setChecked(((Boolean) obj).booleanValue());
            return true;
        }
    }

    /* JADX INFO: renamed from: com.tilks.arsc.main.SettingsActivity$c */
    class C1698c implements Preference.OnPreferenceChangeListener {
        C1698c() {
        }

        @Override // android.preference.Preference.OnPreferenceChangeListener
        public boolean onPreferenceChange(Preference preference, Object obj) {
            SettingsActivity.this.f5080d.setChecked(((Boolean) obj).booleanValue());
            return true;
        }
    }

    /* JADX INFO: renamed from: com.tilks.arsc.main.SettingsActivity$d */
    class C1699d implements Preference.OnPreferenceChangeListener {
        C1699d() {
        }

        @Override // android.preference.Preference.OnPreferenceChangeListener
        public boolean onPreferenceChange(Preference preference, Object obj) {
            SettingsActivity.this.f5081e.setChecked(((Boolean) obj).booleanValue());
            return true;
        }
    }

    /* JADX INFO: renamed from: com.tilks.arsc.main.SettingsActivity$e */
    class C1700e implements Preference.OnPreferenceChangeListener {
        C1700e() {
        }

        @Override // android.preference.Preference.OnPreferenceChangeListener
        public boolean onPreferenceChange(Preference preference, Object obj) {
            SettingsActivity.this.f5082f.setChecked(((Boolean) obj).booleanValue());
            return true;
        }
    }

    /* JADX INFO: renamed from: com.tilks.arsc.main.SettingsActivity$f */
    class C1701f implements Preference.OnPreferenceChangeListener {
        C1701f() {
        }

        @Override // android.preference.Preference.OnPreferenceChangeListener
        public boolean onPreferenceChange(Preference preference, Object obj) {
            SettingsActivity.this.f5083g.setSummary(obj.toString());
            return true;
        }
    }

    @Override // android.preference.PreferenceActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        addPreferencesFromResource(R.xml.fnAntiSplit);
        this.f5077a = PreferenceManager.getDefaultSharedPreferences(this);
        this.f5078b = (CheckBoxPreference) getPreferenceScreen().findPreference("signEnable");
        this.f5079c = (CheckBoxPreference) getPreferenceScreen().findPreference("moduleEnable");
        this.f5080d = (CheckBoxPreference) getPreferenceScreen().findPreference("languageEnable");
        this.f5081e = (CheckBoxPreference) getPreferenceScreen().findPreference("extractNativeLibsEnable");
        this.f5082f = (CheckBoxPreference) getPreferenceScreen().findPreference("mismatchingPackagesEnable");
        this.f5083g = (EditTextPreference) getPreferenceScreen().findPreference("languageCode");
        boolean z = this.f5077a.getBoolean("signEnable", true);
        boolean z2 = this.f5077a.getBoolean("moduleEnable", false);
        boolean z3 = this.f5077a.getBoolean("languageEnable", false);
        boolean z4 = this.f5077a.getBoolean("extractNativeLibsEnable", false);
        boolean z5 = this.f5077a.getBoolean("mismatchingPackagesEnable", false);
        String string = this.f5077a.getString("languageCode", "ru");
        this.f5078b.setChecked(z);
        this.f5079c.setChecked(z2);
        this.f5080d.setChecked(z3);
        this.f5081e.setChecked(z4);
        this.f5082f.setChecked(z5);
        this.f5083g.setSummary(string);
        this.f5078b.setOnPreferenceChangeListener(new C1696a());
        this.f5079c.setOnPreferenceChangeListener(new C1697b());
        this.f5080d.setOnPreferenceChangeListener(new C1698c());
        this.f5081e.setOnPreferenceChangeListener(new C1699d());
        this.f5082f.setOnPreferenceChangeListener(new C1700e());
        this.f5083g.setOnPreferenceChangeListener(new C1701f());
    }
}
