package com.gmail.heagoo.apkeditor.p098se;

import android.app.Activity;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.gmail.heagoo.apkeditor.pro.R;
import com.gmail.heagoo.common.C1552a;
import com.gmail.heagoo.common.C1553b;
import com.gmail.heagoo.common.DynamicExpandListView;
import com.gmail.heagoo.p084a.p089c.C1067a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p000a.p001a.p003b.p004a.C0037k;

/* JADX INFO: loaded from: classes.dex */
public class SimpleEditActivity extends Activity implements View.OnClickListener, InterfaceC1435h {

    /* JADX INFO: renamed from: B */
    private C1453z f4181B;

    /* JADX INFO: renamed from: b */
    private String f4182b;

    /* JADX INFO: renamed from: c */
    private C1553b f4183c;

    /* JADX INFO: renamed from: d */
    private int f4184d;

    /* JADX INFO: renamed from: e */
    private ViewOnClickListenerC1448u f4185e;

    /* JADX INFO: renamed from: f */
    private ViewOnClickListenerC1436i f4186f;

    /* JADX INFO: renamed from: g */
    private ViewOnClickListenerC1430c f4187g;

    /* JADX INFO: renamed from: h */
    private HandlerC1443p f4188h;

    /* JADX INFO: renamed from: i */
    private C1445r f4189i;

    /* JADX INFO: renamed from: j */
    private ListView f4190j;

    /* JADX INFO: renamed from: k */
    private DynamicExpandListView f4191k;

    /* JADX INFO: renamed from: l */
    private ListView f4192l;

    /* JADX INFO: renamed from: m */
    private LinearLayout f4193m;

    /* JADX INFO: renamed from: o */
    private int f4195o;

    /* JADX INFO: renamed from: q */
    private ViewPager f4196q;

    /* JADX INFO: renamed from: r */
    private List f4197r;

    /* JADX INFO: renamed from: s */
    private View f4198s;

    /* JADX INFO: renamed from: t */
    private View f4199t;

    /* JADX INFO: renamed from: u */
    private View f4200u;

    /* JADX INFO: renamed from: v */
    private TextView f4201v;

    /* JADX INFO: renamed from: w */
    private TextView f4202w;

    /* JADX INFO: renamed from: x */
    private TextView f4203x;

    /* JADX INFO: renamed from: y */
    private Button f4204y;

    /* JADX INFO: renamed from: z */
    private TextView f4205z;

    /* JADX INFO: renamed from: n */
    private int f4194n = 0;

    /* JADX INFO: renamed from: A */
    private boolean f4180A = false;

    /* JADX INFO: renamed from: a */
    static /* synthetic */ void m3510a(SimpleEditActivity simpleEditActivity) throws Throwable {
        C1067a.m2525d(simpleEditActivity, "tmp");
        simpleEditActivity.f4181B = new C1453z(simpleEditActivity.f4182b);
        simpleEditActivity.f4181B.m3555a();
    }

    /* JADX INFO: renamed from: f */
    static /* synthetic */ void m3514f(SimpleEditActivity simpleEditActivity) {
        if (simpleEditActivity.f4184d == 2) {
            simpleEditActivity.f4201v.setTextColor(-1);
            simpleEditActivity.f4202w.setTextColor(-1);
            simpleEditActivity.f4203x.setTextColor(-1);
        } else {
            simpleEditActivity.f4201v.setTextColor(simpleEditActivity.getResources().getColor(C0037k.mdNavNormal(C0037k.m89a(simpleEditActivity))));
            simpleEditActivity.f4201v.setBackgroundResource(R.drawable.mtrl_nav_bg_unchecked);
            simpleEditActivity.f4202w.setTextColor(simpleEditActivity.getResources().getColor(C0037k.mdNavNormal(C0037k.m89a(simpleEditActivity))));
            simpleEditActivity.f4202w.setBackgroundResource(R.drawable.mtrl_nav_bg_unchecked);
            simpleEditActivity.f4203x.setTextColor(simpleEditActivity.getResources().getColor(C0037k.mdNavNormal(C0037k.m89a(simpleEditActivity))));
            simpleEditActivity.f4203x.setBackgroundResource(R.drawable.mtrl_nav_bg_unchecked);
        }
        switch (simpleEditActivity.f4194n) {
            case 0:
                simpleEditActivity.f4201v.setTextColor(simpleEditActivity.getResources().getColor(C0037k.mdNavActivated(C0037k.m89a(simpleEditActivity))));
                simpleEditActivity.f4201v.setBackgroundResource(R.drawable.mtrl_nav_bg_checked);
                simpleEditActivity.f4205z.setText(simpleEditActivity.f4185e.m3547c());
                break;
            case 1:
                simpleEditActivity.f4202w.setTextColor(simpleEditActivity.getResources().getColor(C0037k.mdNavActivated(C0037k.m89a(simpleEditActivity))));
                simpleEditActivity.f4202w.setBackgroundResource(R.drawable.mtrl_nav_bg_checked);
                if (simpleEditActivity.f4181B != null) {
                    simpleEditActivity.f4205z.setText(String.format((String) simpleEditActivity.getResources().getText(R.string.image_summary), Integer.valueOf(simpleEditActivity.f4181B.f4281a.size())));
                }
                break;
            case 2:
                simpleEditActivity.f4203x.setTextColor(simpleEditActivity.getResources().getColor(C0037k.mdNavActivated(C0037k.m89a(simpleEditActivity))));
                simpleEditActivity.f4203x.setBackgroundResource(R.drawable.mtrl_nav_bg_checked);
                if (simpleEditActivity.f4181B != null) {
                    simpleEditActivity.f4205z.setText(String.format((String) simpleEditActivity.getResources().getText(R.string.audio_summary), Integer.valueOf(simpleEditActivity.f4181B.f4284d.size())));
                }
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m3515a() {
        if (this.f4180A) {
            return;
        }
        this.f4204y.setText(R.string.save);
        this.f4204y.setTextColor(getResources().getColor(C0037k.mdGoogleBtnText(C0037k.m89a(this))));
        this.f4204y.setBackgroundResource(R.drawable.mtrl_google_btn);
        this.f4180A = true;
    }

    @Override // com.gmail.heagoo.apkeditor.p098se.InterfaceC1435h
    /* JADX INFO: renamed from: a */
    public final void mo2748a(String str) {
        this.f4205z.setText(str);
    }

    /* JADX INFO: renamed from: a */
    public final void m3516a(boolean z) {
        findViewById(R.id.progress_bar).setVisibility(8);
        if (!z) {
            Toast.makeText(this, this.f4189i.f4250a, 0).show();
            finish();
            return;
        }
        this.f4193m.setVisibility(0);
        this.f4190j = (ListView) this.f4198s.findViewById(R.id.files_list);
        this.f4191k = (DynamicExpandListView) this.f4199t.findViewById(R.id.images_list);
        this.f4192l = (ListView) this.f4200u.findViewById(R.id.audios_list);
        this.f4185e = new ViewOnClickListenerC1448u(this, this, this.f4181B);
        this.f4190j.setAdapter((ListAdapter) this.f4185e);
        this.f4190j.setOnItemClickListener(this.f4185e);
        this.f4190j.setOnItemLongClickListener(this.f4185e);
        this.f4186f = new ViewOnClickListenerC1436i(this.f4191k, this, this.f4181B);
        this.f4191k.setAdapter((ListAdapter) this.f4186f);
        this.f4191k.setOnItemClickListener(this.f4186f);
        this.f4191k.setOnItemLongClickListener(this.f4186f);
        this.f4187g = new ViewOnClickListenerC1430c(this, this.f4181B);
        this.f4192l.setAdapter((ListAdapter) this.f4187g);
        this.f4192l.setOnItemClickListener(this.f4187g);
        this.f4192l.setOnItemLongClickListener(this.f4187g);
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.files_label) {
            this.f4194n = 0;
            this.f4196q.setCurrentItem(this.f4194n);
            return;
        }
        if (id == R.id.audio_label) {
            this.f4194n = 2;
            this.f4196q.setCurrentItem(this.f4194n);
            return;
        }
        if (id == R.id.images_label) {
            this.f4194n = 1;
            this.f4196q.setCurrentItem(this.f4194n);
            return;
        }
        if (id == R.id.btn_close) {
            if (this.f4180A) {
                Map mapM3543a = this.f4186f.m3543a();
                Map mapM3549d = this.f4185e.m3549d();
                Map mapM3533b = this.f4187g.m3533b();
                Intent intent = new Intent(this, (Class<?>) ApkCreateActivity.class);
                C1067a.m2442a(intent, "apkPath", this.f4182b);
                C1067a.m2442a(intent, "packageName", this.f4183c.f4630b);
                C1067a.m2468a(intent, "imageReplaces", mapM3543a);
                if (!mapM3549d.isEmpty() || !mapM3533b.isEmpty()) {
                    mapM3549d.putAll(mapM3533b);
                    C1067a.m2468a(intent, "otherReplaces", mapM3549d);
                }
                startActivity(intent);
            }
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        setTheme(C0037k.mdNoActionBar(C0037k.m89a(this)));
        super.onCreate(bundle);
        setContentView(R.layout.activity_simpleedit);
        this.f4182b = C1067a.m2457a(getIntent(), "apkPath");
        try {
            new C1552a();
            this.f4183c = C1552a.m3750a(this, this.f4182b);
        } catch (Exception e) {
            Toast.makeText(this, getResources().getString(R.string.cannot_parse_apk) + ": " + e.getMessage(), 1).show();
        }
        if (this.f4183c == null) {
            finish();
            return;
        }
        this.f4188h = new HandlerC1443p(this);
        this.f4189i = new C1445r(this);
        this.f4189i.start();
        int width = BitmapFactory.decodeResource(getResources(), R.drawable.pager_focus).getWidth();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        this.f4195o = displayMetrics.widthPixels;
        new Matrix().postTranslate(((this.f4195o / 3) - width) / 2, 0.0f);
        this.f4193m = (LinearLayout) findViewById(R.id.center_layout);
        this.f4205z = (TextView) findViewById(R.id.tv_summary);
        this.f4201v = (TextView) findViewById(R.id.files_label);
        this.f4202w = (TextView) findViewById(R.id.images_label);
        this.f4203x = (TextView) findViewById(R.id.audio_label);
        this.f4204y = (Button) findViewById(R.id.btn_close);
        this.f4193m.setVisibility(4);
        this.f4201v.setOnClickListener(this);
        this.f4202w.setOnClickListener(this);
        this.f4203x.setOnClickListener(this);
        this.f4204y.setOnClickListener(this);
        if (this.f4183c != null) {
            ((ImageView) findViewById(R.id.apk_icon)).setImageDrawable(this.f4183c.f4631c);
            ((TextView) findViewById(R.id.apk_label)).setText(this.f4183c.f4629a);
        }
        this.f4196q = (ViewPager) findViewById(R.id.pagerView);
        this.f4197r = new ArrayList();
        LayoutInflater layoutInflater = getLayoutInflater();
        this.f4198s = layoutInflater.inflate(R.layout.pageitem_files, (ViewGroup) null);
        this.f4199t = layoutInflater.inflate(R.layout.pageitem_images, (ViewGroup) null);
        this.f4200u = layoutInflater.inflate(R.layout.pageitem_audios, (ViewGroup) null);
        this.f4197r.add(this.f4198s);
        this.f4197r.add(this.f4199t);
        this.f4197r.add(this.f4200u);
        this.f4196q.setAdapter(new C1446s(this, this.f4197r));
        this.f4196q.setCurrentItem(0);
        this.f4196q.setOnPageChangeListener(new C1444q(this));
    }

    @Override // android.app.Activity
    public void onDestroy() {
        if (this.f4185e != null) {
            this.f4185e.m3550e();
        }
        if (this.f4187g != null) {
            this.f4187g.m3532a();
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putString("apkPath", this.f4182b);
        super.onSaveInstanceState(bundle);
    }
}
