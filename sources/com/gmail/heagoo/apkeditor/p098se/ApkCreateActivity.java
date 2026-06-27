package com.gmail.heagoo.apkeditor.p098se;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.content.ContextCompat;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.gmail.heagoo.apkeditor.p090a.InterfaceC1110f;
import com.gmail.heagoo.apkeditor.pro.R;
import com.gmail.heagoo.common.C1552a;
import com.gmail.heagoo.common.C1553b;
import com.gmail.heagoo.p084a.p089c.C1067a;
import com.p046a.p049b.p050a.p055e.InterfaceC0597j;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipFile;
import p000a.p001a.p003b.p004a.C0037k;

/* JADX INFO: loaded from: classes.dex */
public class ApkCreateActivity extends Activity implements View.OnClickListener, InterfaceC1110f {

    /* JADX INFO: renamed from: a */
    HandlerC1429b f4154a;

    /* JADX INFO: renamed from: b */
    private String f4155b;

    /* JADX INFO: renamed from: c */
    private String f4156c;

    /* JADX INFO: renamed from: d */
    private Map f4157d;

    /* JADX INFO: renamed from: e */
    private Map f4158e;

    /* JADX INFO: renamed from: f */
    private Map f4159f;

    /* JADX INFO: renamed from: g */
    private String f4160g;

    /* JADX INFO: renamed from: h */
    private String f4161h;

    /* JADX INFO: renamed from: i */
    private String f4162i;

    /* JADX INFO: renamed from: j */
    private LinearLayout f4163j;

    /* JADX INFO: renamed from: k */
    private LinearLayout f4164k;

    /* JADX INFO: renamed from: l */
    private ImageView f4165l;

    /* JADX INFO: renamed from: m */
    private TextView f4166m;

    /* JADX INFO: renamed from: n */
    private Button f4167n;

    /* JADX INFO: renamed from: o */
    private Button f4168o;

    /* JADX INFO: renamed from: p */
    private TextView f4169p;

    /* JADX INFO: renamed from: q */
    private C1427a f4170q;

    /* JADX INFO: renamed from: r */
    private String f4171r;

    /* JADX INFO: renamed from: s */
    private String f4172s;

    /* JADX INFO: renamed from: t */
    private boolean f4173t = false;

    /* JADX INFO: renamed from: u */
    private boolean f4174u;

    /* JADX INFO: renamed from: v */
    private C1553b f4175v;

    /* JADX INFO: renamed from: w */
    private String f4176w;

    /* JADX INFO: renamed from: x */
    private InterfaceC0597j f4177x;

    /* JADX INFO: renamed from: y */
    private long f4178y;

    /* JADX INFO: renamed from: z */
    private ArrayList f4179z;

    /* JADX INFO: renamed from: a */
    private boolean m3493a() {
        try {
            new C1552a();
            C1553b c1553bM3750a = C1552a.m3750a(this, this.f4171r);
            if (c1553bM3750a == null) {
                return false;
            }
            getPackageManager().getPackageInfo(c1553bM3750a.f4630b, 0);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    private void m3495b() {
        if (!this.f4174u) {
            this.f4165l.setImageResource(R.drawable.ic_close);
            this.f4166m.setText(this.f4172s);
            this.f4167n.setVisibility(8);
            this.f4168o.setVisibility(8);
            return;
        }
        String str = getResources().getString(R.string.dummy) + "" + String.format(getResources().getString(R.string.apk_savedas_1), this.f4171r) + "\n\n";
        if (m3493a()) {
            String str2 = str + getResources().getString(R.string.remove_tip);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
            AbsoluteSizeSpan absoluteSizeSpan = new AbsoluteSizeSpan(12, true);
            int length = str.length();
            int length2 = str2.length();
            spannableStringBuilder.setSpan(absoluteSizeSpan, length, length2, 33);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(ContextCompat.getColor(this, C0037k.mdTextSmall(C0037k.m89a(this)))), length, length2, 33);
            this.f4166m.setText(spannableStringBuilder);
            this.f4167n.setVisibility(0);
        } else {
            this.f4166m.setText(str);
            this.f4167n.setVisibility(8);
        }
        this.f4165l.setImageResource(R.drawable.ic_select);
    }

    /* JADX INFO: renamed from: b */
    private void m3496b(boolean z) {
        this.f4165l = (ImageView) findViewById(R.id.result_image);
        this.f4166m = (TextView) findViewById(R.id.result);
        this.f4169p = (TextView) findViewById(R.id.tv_detail);
        this.f4167n = (Button) findViewById(R.id.button_uninstall);
        this.f4168o = (Button) findViewById(R.id.button_reinstall);
        Button button = (Button) findViewById(R.id.button_close);
        this.f4167n.setOnClickListener(this);
        this.f4168o.setOnClickListener(this);
        button.setOnClickListener(this);
        this.f4163j = (LinearLayout) findViewById(R.id.layout_apk_generating);
        this.f4164k = (LinearLayout) findViewById(R.id.layout_apk_reinstall);
        if (z) {
            this.f4163j.setVisibility(4);
            this.f4164k.setVisibility(0);
        } else {
            this.f4163j.setVisibility(0);
            this.f4164k.setVisibility(4);
        }
        if (this.f4173t) {
            m3495b();
        }
    }

    /* JADX INFO: renamed from: c */
    private long m3497c() {
        long j = PreferenceManager.getDefaultSharedPreferences(this).getLong("LastPopAdTime", 0L);
        if (j < System.currentTimeMillis()) {
            return j;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: g */
    static /* synthetic */ void m3502g(ApkCreateActivity apkCreateActivity) throws IOException {
        if (apkCreateActivity.f4157d == null || apkCreateActivity.f4157d.isEmpty()) {
            return;
        }
        ZipFile zipFile = new ZipFile(apkCreateActivity.f4155b);
        HashMap map = new HashMap();
        for (Map.Entry entry : apkCreateActivity.f4157d.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            List arrayList = (List) map.get(str2);
            if (arrayList == null) {
                arrayList = new ArrayList();
                map.put(str2, arrayList);
            }
            arrayList.add(str);
        }
        for (String str3 : map.keySet()) {
            List<String> list = (List) map.get(str3);
            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str3);
            for (String str4 : list) {
                InputStream inputStream = zipFile.getInputStream(zipFile.getEntry(str4));
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(inputStream, null, options);
                int i = options.outWidth;
                int i2 = options.outHeight;
                int width = bitmapDecodeFile.getWidth();
                int height = bitmapDecodeFile.getHeight();
                Matrix matrix = new Matrix();
                matrix.postScale(i / width, i2 / height);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeFile, 0, 0, width, height, matrix, true);
                String str5 = apkCreateActivity.f4176w + str4.replaceAll("/", "_");
                FileOutputStream fileOutputStream = new FileOutputStream(str5);
                if (str5.endsWith(".png")) {
                    bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 80, fileOutputStream);
                } else {
                    bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, 80, fileOutputStream);
                }
                fileOutputStream.close();
                apkCreateActivity.f4158e.put(str4, str5);
            }
        }
        zipFile.close();
    }

    @Override // com.gmail.heagoo.apkeditor.p090a.InterfaceC1110f
    /* JADX INFO: renamed from: a */
    public final void mo3017a(String str) {
        this.f4154a.m3525a(str);
    }

    /* JADX INFO: renamed from: a */
    public final void m3508a(boolean z) {
        this.f4174u = z;
        if (z) {
            this.f4171r = this.f4170q.f4207b;
            if (this.f4177x != null && this.f4177x.m1056b()) {
                Toast.makeText(this, R.string.show_ad_tip, 0).show();
            }
        } else {
            this.f4172s = this.f4170q.m3520a();
            System.currentTimeMillis();
            m3497c();
        }
        m3495b();
        this.f4163j.setVisibility(4);
        this.f4164k.setVisibility(0);
        this.f4173t = true;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) throws Throwable {
        int id = view.getId();
        if (id == R.id.button_uninstall) {
            if (this.f4175v != null) {
                startActivity(new Intent("android.intent.action.DELETE", Uri.parse("package:" + this.f4175v.f4630b)));
            }
        } else if (id == R.id.button_reinstall) {
            C1067a.m2466a(this, this.f4171r);
        } else if (id == R.id.button_close) {
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        setTheme(C0037k.mdNoActionBar(C0037k.m89a(this)));
        super.onCreate(bundle);
        getWindow().setFlags(128, 128);
        setContentView(R.layout.activity_simpleedit_making);
        if (bundle != null) {
            this.f4155b = bundle.getString("apkPath");
            this.f4156c = bundle.getString("packageName");
            this.f4173t = bundle.getBoolean("modifyFinished");
            this.f4174u = bundle.getBoolean("succeed");
            this.f4171r = bundle.getString("outApkPath");
            this.f4172s = bundle.getString("errorMessage");
        } else {
            Intent intent = getIntent();
            this.f4155b = C1067a.m2457a(intent, "apkPath");
            this.f4156c = C1067a.m2457a(intent, "packageName");
            this.f4157d = C1067a.m2527d(intent, "imageReplaces");
            Map mapM2527d = C1067a.m2527d(intent, "otherReplaces");
            this.f4179z = (ArrayList) intent.getExtras().getSerializable("interfaces");
            this.f4158e = new HashMap();
            if (mapM2527d != null) {
                this.f4158e.putAll(mapM2527d);
            }
            try {
                this.f4176w = C1067a.m2525d(this, "tmp");
            } catch (Exception e) {
            }
            this.f4161h = C1067a.m2457a(intent, "oldAppNameInArsc");
            this.f4162i = C1067a.m2457a(intent, "newAppNameInArsc");
            this.f4160g = C1067a.m2457a(intent, "newPackageNameInArsc");
            this.f4159f = C1067a.m2527d(intent, "classRenames");
        }
        try {
            new C1552a();
            this.f4175v = C1552a.m3750a(this, this.f4155b);
        } catch (Exception e2) {
            Toast.makeText(this, getResources().getString(R.string.cannot_parse_apk) + ": " + e2.getMessage(), 1).show();
        }
        this.f4154a = new HandlerC1429b(this);
        if (this.f4173t) {
            m3496b(true);
            return;
        }
        this.f4170q = new C1427a(this);
        this.f4170q.start();
        m3496b(false);
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putString("apkPath", this.f4155b);
        bundle.putString("packageName", this.f4156c);
        bundle.putString("outApkPath", this.f4171r);
        bundle.putString("errorMessage", this.f4172s);
        bundle.putBoolean("modifyFinished", this.f4173t);
        bundle.putBoolean("succeed", this.f4174u);
        super.onSaveInstanceState(bundle);
    }
}
