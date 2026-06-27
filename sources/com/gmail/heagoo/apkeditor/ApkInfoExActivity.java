package com.gmail.heagoo.apkeditor;

import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.gmail.heagoo.apkeditor.pro.R;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class ApkInfoExActivity extends ApkInfoActivity {

    /* JADX INFO: renamed from: A */
    private ViewOnClickListenerC1139av f2965A = new ViewOnClickListenerC1139av(this);

    /* JADX INFO: renamed from: B */
    private boolean f2966B;

    /* JADX INFO: renamed from: n */
    private LinearLayout f2967n;

    /* JADX INFO: renamed from: o */
    private View f2968o;

    /* JADX INFO: renamed from: p */
    private View f2969p;

    /* JADX INFO: renamed from: q */
    private View f2970q;

    /* JADX INFO: renamed from: r */
    private View f2971r;

    /* JADX INFO: renamed from: s */
    private View f2972s;

    /* JADX INFO: renamed from: t */
    private View f2973t;

    /* JADX INFO: renamed from: u */
    private View f2974u;

    /* JADX INFO: renamed from: v */
    private View f2975v;

    /* JADX INFO: renamed from: w */
    private View f2976w;

    /* JADX INFO: renamed from: x */
    private View f2977x;

    /* JADX INFO: renamed from: y */
    private View f2978y;

    /* JADX INFO: renamed from: z */
    private View f2979z;

    /* JADX INFO: renamed from: a */
    private View m2728a(int i, int i2) {
        View viewInflate = LayoutInflater.from(this).inflate(R.layout.item_res_menu, (ViewGroup) null);
        ((ImageView) viewInflate.findViewById(R.id.menu_icon)).setImageResource(i);
        ((TextView) viewInflate.findViewById(R.id.menu_title)).setText(i2);
        viewInflate.setId(i);
        viewInflate.setOnClickListener(this.f2965A);
        return viewInflate;
    }

    /* JADX INFO: renamed from: a */
    private static void m2729a(View view, boolean z) {
        ImageView imageView = (ImageView) view.findViewById(R.id.menu_icon);
        TextView textView = (TextView) view.findViewById(R.id.menu_title);
        if (z) {
            imageView.getDrawable().setAlpha(255);
            textView.setEnabled(true);
        } else {
            imageView.getDrawable().setAlpha(127);
            textView.setEnabled(false);
        }
        view.setClickable(z);
        view.setEnabled(z);
    }

    @Override // com.gmail.heagoo.apkeditor.ApkInfoActivity, com.gmail.heagoo.apkeditor.InterfaceC1304fn
    /* JADX INFO: renamed from: b */
    public final void mo2707b(Set set) {
        super.mo2707b(set);
        if (set.size() == 1) {
            m2729a(this.f2978y, true);
            m2729a(this.f2979z, true);
        } else {
            m2729a(this.f2978y, false);
            m2729a(this.f2979z, false);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m2731n() {
        this.f2953i = !this.f2953i;
        this.f2951g.setImageResource(this.f2966B ? this.f2953i ? R.drawable.searchtxt_checked_white : R.drawable.searchtxt_unchecked_white : this.f2953i ? R.drawable.searchtxt_checked : R.drawable.searchtxt_unchecked);
    }

    /* JADX INFO: renamed from: o */
    public final void m2732o() {
        this.f2954j = !this.f2954j;
        this.f2952h.setImageResource(this.f2966B ? this.f2954j ? R.drawable.ic_case_sensitive_white : R.drawable.ic_case_insensitive_white : this.f2954j ? R.drawable.ic_case_sensitive : R.drawable.ic_case_insensitive);
    }

    @Override // com.gmail.heagoo.apkeditor.ApkInfoActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setFlags(128, 128);
        this.f2966B = this.f2956l != 0;
        this.f2968o = findViewById(R.id.menu_home);
        this.f2969p = findViewById(R.id.menu_done);
        this.f2970q = findViewById(R.id.menu_select);
        this.f2971r = findViewById(R.id.menu_addfile);
        this.f2972s = findViewById(R.id.menu_addfolder);
        this.f2973t = findViewById(R.id.menu_searchoptions);
        this.f2974u = findViewById(R.id.menu_caseinsensitive);
        this.f2968o.setOnClickListener(this.f2965A);
        this.f2969p.setOnClickListener(this.f2965A);
        this.f2970q.setOnClickListener(this.f2965A);
        this.f2971r.setOnClickListener(this.f2965A);
        this.f2972s.setOnClickListener(this.f2965A);
        this.f2973t.setOnClickListener(this.f2965A);
        this.f2974u.setOnClickListener(this.f2965A);
        this.f2967n = (LinearLayout) findViewById(R.id.res_menu_layout);
        this.f2975v = m2728a(R.drawable.ic_res_extract, R.string.extract);
        this.f2978y = m2728a(R.drawable.ic_res_replace, R.string.replace);
        this.f2977x = m2728a(R.drawable.ic_res_search, R.string.search);
        this.f2976w = m2728a(R.drawable.ic_res_delete, R.string.delete);
        this.f2979z = m2728a(R.drawable.ic_res_detail, R.string.detail);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2, 1.0f);
        this.f2967n.addView(this.f2975v, layoutParams);
        this.f2967n.addView(this.f2978y, layoutParams);
        this.f2967n.addView(this.f2977x, layoutParams);
        this.f2967n.addView(this.f2976w, layoutParams);
        this.f2967n.addView(this.f2979z, layoutParams);
    }

    @Override // com.gmail.heagoo.apkeditor.ApkInfoActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.gmail.heagoo.apkeditor.ApkInfoActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.gmail.heagoo.apkeditor.ApkInfoActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    public void toasku() {
        Toast.makeText(getApplicationContext(), PreferenceManager.getDefaultSharedPreferences(this).getString("toast", "Apk Editor Pro modded by Masrull"), 0).show();
    }
}
