package com.gmail.heagoo.apkeditor;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import com.android.apksig.apk.ApkUtils;
import com.gmail.heagoo.apkeditor.p090a.C1111g;
import com.gmail.heagoo.apkeditor.p090a.C1113i;
import com.gmail.heagoo.apkeditor.p090a.C1114j;
import com.gmail.heagoo.apkeditor.p090a.p091a.C1086e;
import com.gmail.heagoo.apkeditor.p090a.p091a.C1095n;
import com.gmail.heagoo.apkeditor.p090a.p091a.C1096o;
import com.gmail.heagoo.apkeditor.p090a.p091a.C1097p;
import com.gmail.heagoo.apkeditor.p090a.p091a.C1098q;
import com.gmail.heagoo.apkeditor.p098se.ApkCreateActivity;
import com.gmail.heagoo.apkeditor.pro.R;
import com.gmail.heagoo.common.C1553b;
import com.gmail.heagoo.common.C1570s;
import com.gmail.heagoo.p084a.p089c.C1067a;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.zip.ZipFile;
import p000a.p001a.p003b.p004a.C0037k;

/* JADX INFO: loaded from: classes.dex */
public class CommonEditActivity extends Activity implements TextWatcher, View.OnClickListener, AdapterView.OnItemSelectedListener, InterfaceC1204cu {

    /* JADX INFO: renamed from: A */
    private String f2999A;

    /* JADX INFO: renamed from: B */
    private String f3000B;

    /* JADX INFO: renamed from: C */
    private int f3001C;

    /* JADX INFO: renamed from: D */
    private int f3002D;

    /* JADX INFO: renamed from: E */
    private String f3003E;

    /* JADX INFO: renamed from: a */
    private String f3004a;

    /* JADX INFO: renamed from: b */
    private C1553b f3005b;

    /* JADX INFO: renamed from: c */
    private ImageView f3006c;

    /* JADX INFO: renamed from: d */
    private ImageView f3007d;

    /* JADX INFO: renamed from: e */
    private TextView f3008e;

    /* JADX INFO: renamed from: f */
    private TextView f3009f;

    /* JADX INFO: renamed from: g */
    private TextView f3010g;

    /* JADX INFO: renamed from: h */
    private TextView f3011h;

    /* JADX INFO: renamed from: i */
    private EditText f3012i;

    /* JADX INFO: renamed from: j */
    private EditText f3013j;

    /* JADX INFO: renamed from: k */
    private EditText f3014k;

    /* JADX INFO: renamed from: l */
    private EditText f3015l;

    /* JADX INFO: renamed from: m */
    private EditText f3016m;

    /* JADX INFO: renamed from: n */
    private EditText f3017n;

    /* JADX INFO: renamed from: o */
    private EditText f3018o;

    /* JADX INFO: renamed from: p */
    private CheckBox f3019p;

    /* JADX INFO: renamed from: q */
    private CheckBox f3020q;

    /* JADX INFO: renamed from: r */
    private View f3021r;

    /* JADX INFO: renamed from: s */
    private C1113i f3022s;

    /* JADX INFO: renamed from: t */
    private C1111g f3023t;

    /* JADX INFO: renamed from: u */
    private HandlerC1180by f3024u = new HandlerC1180by(this);

    /* JADX INFO: renamed from: v */
    private Spinner f3025v;

    /* JADX INFO: renamed from: w */
    private Spinner f3026w;

    /* JADX INFO: renamed from: x */
    private String f3027x;

    /* JADX INFO: renamed from: y */
    private Map f3028y;

    /* JADX INFO: renamed from: z */
    private String f3029z;

    /* JADX INFO: renamed from: a */
    private void m2756a() throws Throwable {
        String absolutePath = getFilesDir().getAbsolutePath();
        String str = absolutePath + "/bin/_wrapper.apk";
        File file = new File(absolutePath + "/bin");
        if (!file.exists() && !file.mkdirs()) {
            Toast.makeText(this, "Cannot create bin directory", 1).show();
            return;
        }
        String strM3787a = C1570s.m3787a(4);
        try {
            this.f3027x = C1067a.m2525d(this, "tmp") + ".xml";
            String str2 = null;
            try {
                str2 = getPackageManager().getPackageInfo(getPackageName(), 0).versionName;
            } catch (PackageManager.NameNotFoundException e) {
            }
            SharedPreferences sharedPreferences = getSharedPreferences("info", 0);
            String string = sharedPreferences.getString("wrapper_ver", "");
            if (!new File(str).exists() || !string.equals(str2)) {
                try {
                    InputStream inputStreamOpen = getAssets().open("_wrapper");
                    FileOutputStream fileOutputStream = new FileOutputStream(str);
                    C1067a.m2506b(inputStreamOpen, fileOutputStream);
                    inputStreamOpen.close();
                    fileOutputStream.close();
                    C1067a.m2541i(str);
                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                    editorEdit.putString("wrapper_ver", str2);
                    editorEdit.apply();
                } catch (Exception e2) {
                }
            }
            ZipFile zipFile = new ZipFile(str);
            InputStream inputStream = zipFile.getInputStream(zipFile.getEntry(ApkUtils.ANDROID_MANIFEST_ZIP_ENTRY_NAME));
            C1096o c1096o = new C1096o(inputStream, this.f3027x);
            c1096o.m2959a("com.example.droidpluginwrapper", this.f3029z);
            c1096o.m2959a("DroidPluginWrapper", this.f2999A);
            c1096o.m2959a("1.x.y", this.f3000B);
            for (int i = 0; i < 9; i++) {
                char c = (char) (i + 48);
                c1096o.m2959a("com.morgoo.droidplugin_stub_P0" + c, "com.morgoo.droidplugin_" + strM3787a + "_P0" + c);
            }
            c1096o.m2961b(this.f3001C);
            c1096o.m2958a(this.f3002D >= 0 ? this.f3002D : 0);
            if (!this.f3023t.f3303v.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                Iterator it = this.f3023t.f3303v.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) it.next());
                }
                c1096o.m2960a(arrayList);
            }
            c1096o.m2957a();
            inputStream.close();
            zipFile.close();
            HashMap map = new HashMap();
            map.put(ApkUtils.ANDROID_MANIFEST_ZIP_ENTRY_NAME, this.f3027x);
            map.put("assets/1.apk", this.f3004a);
            if (this.f3003E != null) {
                map.put("res/drawable/ic_launcher.png", this.f3003E);
            } else {
                String strM2760b = m2760b();
                if (strM2760b != null) {
                    map.put("res/drawable/ic_launcher.png", strM2760b);
                }
            }
            Intent intent = new Intent(this, (Class<?>) ApkCreateActivity.class);
            C1067a.m2442a(intent, "apkPath", str);
            C1067a.m2442a(intent, "packageName", this.f3023t.f3286e);
            C1067a.m2468a(intent, "otherReplaces", map);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new C1095n(strM3787a));
            intent.putExtra("interfaces", arrayList2);
            startActivity(intent);
        } catch (Exception e3) {
            Toast.makeText(this, e3.getMessage(), 1).show();
            e3.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m2757a(TextView textView, EditText editText, int i) {
        if (i == -1) {
            textView.setVisibility(8);
            editText.setVisibility(8);
        } else {
            editText.setText(String.valueOf(i));
            textView.setVisibility(0);
            editText.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m2758a(boolean z, boolean z2) {
        HashMap map = new HashMap();
        map.put(ApkUtils.ANDROID_MANIFEST_ZIP_ENTRY_NAME, this.f3027x);
        Intent intent = new Intent(this, (Class<?>) ApkCreateActivity.class);
        C1067a.m2442a(intent, "apkPath", this.f3004a);
        C1067a.m2442a(intent, "packageName", this.f3023t.f3286e);
        C1067a.m2468a(intent, "otherReplaces", map);
        if (!this.f3023t.f3286e.equals(this.f3029z) && this.f3019p.isChecked()) {
            C1067a.m2442a(intent, "newPackageNameInArsc", this.f3029z);
        }
        if (this.f3023t.f3291j < 0 && !this.f2999A.equals(this.f3023t.f3284c)) {
            C1067a.m2442a(intent, "oldAppNameInArsc", this.f3023t.f3284c);
            C1067a.m2442a(intent, "newAppNameInArsc", this.f2999A);
        }
        if (!this.f3028y.isEmpty()) {
            HashMap map2 = new HashMap();
            for (Map.Entry entry : this.f3028y.entrySet()) {
                map2.put("L" + ((String) entry.getKey()).replaceAll("\\.", "/"), "L" + ((String) entry.getValue()).replaceAll("\\.", "/"));
            }
            C1067a.m2468a(intent, "classRenames", map2);
        }
        ArrayList arrayList = new ArrayList();
        if (this.f3023t.f3294m != -1 && this.f3003E != null) {
            arrayList.add(new C1114j(this.f3023t.f3294m, this.f3003E));
        }
        if (z2) {
            arrayList.add(new C1097p(this.f3023t.f3286e, this.f3029z));
            arrayList.add(new C1098q(this.f3023t.f3286e, this.f3029z));
        }
        if (!arrayList.isEmpty()) {
            intent.putExtra("interfaces", arrayList);
        }
        startActivity(intent);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0049 A[Catch: Exception -> 0x0073, TryCatch #0 {Exception -> 0x0073, blocks: (B:2:0x0000, B:4:0x0006, B:6:0x0027, B:8:0x0031, B:9:0x0035, B:11:0x0049, B:13:0x004f, B:21:0x0079, B:16:0x005d, B:15:0x0055), top: B:23:0x0000 }] */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String m2760b() {
        Bitmap bitmapCreateBitmap;
        try {
            if (this.f3005b.f4631c != null) {
                String str = C1067a.m2525d(this, "tmp") + "_launcher";
                Drawable drawable = this.f3005b.f4631c;
                if (drawable instanceof BitmapDrawable) {
                    BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                    if (bitmapDrawable.getBitmap() != null) {
                        bitmapCreateBitmap = bitmapDrawable.getBitmap();
                    } else {
                        bitmapCreateBitmap = (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) ? Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888) : Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(bitmapCreateBitmap);
                        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                        drawable.draw(canvas);
                    }
                }
                FileOutputStream fileOutputStream = new FileOutputStream(str);
                bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                fileOutputStream.flush();
                fileOutputStream.close();
                return str;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final void m2763a(String str) {
        if (str != null) {
            Toast.makeText(this, getResources().getString(R.string.cannot_parse_apk) + ": " + str, 1).show();
            finish();
            return;
        }
        this.f3023t = this.f3022s.m3021a();
        this.f3023t.f3284c = this.f3005b.f4629a;
        this.f3006c.setImageDrawable(this.f3005b.f4631c);
        this.f3008e.setText(this.f3005b.f4629a);
        this.f3012i.setText(this.f3005b.f4629a);
        this.f3013j.setText(this.f3023t.f3286e);
        if (this.f3023t.f3292k == -1) {
            this.f3015l.setVisibility(8);
            findViewById(R.id.tv_vername).setVisibility(8);
        } else {
            this.f3015l.setText(this.f3023t.f3285d);
        }
        this.f3014k.setText(String.valueOf(this.f3023t.f3282a));
        int i = this.f3023t.f3283b;
        if (i >= -1 && i < 3) {
            this.f3025v.setSelection(i + 1);
        }
        this.f3007d.setImageDrawable(this.f3005b.f4631c);
        if (this.f3023t.f3294m != -1) {
            this.f3007d.setOnClickListener(this);
        }
        m2757a(this.f3009f, this.f3016m, this.f3023t.f3288g);
        m2757a(this.f3010g, this.f3017n, this.f3023t.f3289h);
        m2757a(this.f3011h, this.f3018o, this.f3023t.f3290i);
    }

    @Override // com.gmail.heagoo.apkeditor.InterfaceC1204cu
    /* JADX INFO: renamed from: a */
    public final void mo2764a(String str, String str2, boolean z) {
        this.f3003E = str;
        try {
            this.f3007d.setImageBitmap(BitmapFactory.decodeFile(this.f3003E));
        } catch (Exception e) {
        }
    }

    @Override // com.gmail.heagoo.apkeditor.InterfaceC1204cu
    /* JADX INFO: renamed from: a */
    public final boolean mo2765a(String str, String str2) {
        return str.endsWith(".png");
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        String string = editable.toString();
        if (this.f3023t == null || !string.equals(this.f3023t.f3286e)) {
            this.f3021r.setVisibility(0);
        } else {
            this.f3021r.setVisibility(8);
        }
    }

    @Override // com.gmail.heagoo.apkeditor.InterfaceC1204cu
    /* JADX INFO: renamed from: b */
    public final String mo2766b(String str, String str2) {
        return null;
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) throws Throwable {
        int i;
        int i2;
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        boolean z;
        int id = view.getId();
        if (id == R.id.btn_close) {
            finish();
            return;
        }
        if (id != R.id.btn_save) {
            if (id == R.id.launcher_icon) {
                new DialogC1197cn(this, this, ".png", "launcher.png", null).show();
                return;
            }
            return;
        }
        String string = this.f3014k.getText().toString();
        this.f3001C = 0;
        try {
            this.f3001C = Integer.valueOf(string).intValue();
            this.f2999A = this.f3012i.getText().toString();
            this.f3029z = this.f3013j.getText().toString();
            this.f3029z = this.f3029z.trim();
            this.f3000B = this.f3015l.getText().toString();
            try {
                String string2 = this.f3016m.getText().toString();
                iIntValue = !"".equals(string2) ? Integer.valueOf(string2).intValue() : -1;
                try {
                    String string3 = this.f3017n.getText().toString();
                    iIntValue2 = !"".equals(string3) ? Integer.valueOf(string3).intValue() : -1;
                } catch (Exception e) {
                    i = -1;
                    i2 = iIntValue;
                }
            } catch (Exception e2) {
                i = -1;
                i2 = -1;
            }
            try {
                String string4 = this.f3018o.getText().toString();
                iIntValue3 = !"".equals(string4) ? Integer.valueOf(string4).intValue() : -1;
            } catch (Exception e3) {
                i = iIntValue2;
                i2 = iIntValue;
                iIntValue = i2;
                iIntValue2 = i;
                iIntValue3 = -1;
            }
            if (!this.f3029z.equals("")) {
                if (this.f3029z.length() < 128) {
                    int i3 = 0;
                    while (true) {
                        if (i3 >= this.f3029z.length()) {
                            z = true;
                            break;
                        } else {
                            if (this.f3029z.charAt(i3) > 127) {
                                Toast.makeText(this, "Invalid Package Name", 0).show();
                                z = false;
                                break;
                            }
                            i3++;
                        }
                    }
                } else {
                    Toast.makeText(this, "Package name is too long", 0).show();
                    z = false;
                }
            } else {
                Toast.makeText(this, "Invalid Package Name", 0).show();
                z = false;
            }
            if (z) {
                this.f3002D = this.f3025v.getSelectedItemPosition() - 1;
                boolean z2 = this.f3003E == null && this.f3023t.f3284c.equals(this.f2999A) && this.f3023t.f3286e.equals(this.f3029z) && this.f3023t.f3282a == this.f3001C && this.f3023t.f3283b == this.f3002D;
                if ((((this.f3023t.f3292k != -1 ? z2 && this.f3023t.f3285d.equals(this.f3000B) : z2) && this.f3023t.f3288g == iIntValue) && this.f3023t.f3289h == iIntValue2) && this.f3023t.f3290i == iIntValue3) {
                    Toast.makeText(this, R.string.no_change_detected, 1).show();
                    return;
                }
                int selectedItemPosition = this.f3026w.getSelectedItemPosition();
                if (!this.f3023t.f3286e.equals(this.f3029z) && selectedItemPosition == 1) {
                    m2756a();
                    return;
                }
                boolean z3 = this.f3020q.isChecked() && !this.f3023t.f3286e.equals(this.f3029z);
                try {
                    this.f3027x = C1067a.m2525d(this, "tmp") + ".xml";
                    ZipFile zipFile = new ZipFile(this.f3004a);
                    InputStream inputStream = zipFile.getInputStream(zipFile.getEntry(ApkUtils.ANDROID_MANIFEST_ZIP_ENTRY_NAME));
                    C1111g c1111g = new C1111g();
                    c1111g.f3284c = this.f2999A;
                    c1111g.f3286e = this.f3029z;
                    c1111g.f3282a = this.f3001C;
                    c1111g.f3285d = this.f3000B;
                    c1111g.f3283b = this.f3002D;
                    c1111g.f3288g = iIntValue;
                    c1111g.f3289h = iIntValue2;
                    c1111g.f3290i = iIntValue3;
                    C1086e c1086e = new C1086e(inputStream, this.f3027x, z3);
                    c1086e.m2939a(this.f3023t, c1111g);
                    c1086e.m2938a();
                    this.f3028y = c1086e.m2940b();
                    new HashMap();
                    inputStream.close();
                    zipFile.close();
                    m2758a(false, z3);
                } catch (Exception e4) {
                    Toast.makeText(this, e4.getMessage(), 1).show();
                    e4.printStackTrace();
                }
            }
        } catch (Exception e5) {
            Toast.makeText(this, R.string.invalid_ver_code, 1).show();
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        setTheme(C0037k.mdNoActionBar(C0037k.m89a(this)));
        super.onCreate(bundle);
        setContentView(R.layout.activity_commonedit);
        this.f3004a = C1067a.m2457a(getIntent(), "apkPath");
        new C1179bx(this).start();
        this.f3006c = (ImageView) findViewById(R.id.apk_icon);
        this.f3007d = (ImageView) findViewById(R.id.launcher_icon);
        this.f3008e = (TextView) findViewById(R.id.apk_label);
        this.f3009f = (TextView) findViewById(R.id.tv_minSdkVersion);
        this.f3010g = (TextView) findViewById(R.id.tv_targetSdkVersion);
        this.f3011h = (TextView) findViewById(R.id.tv_maxSdkVersion);
        this.f3012i = (EditText) findViewById(R.id.et_appname);
        this.f3013j = (EditText) findViewById(R.id.et_pkgname);
        this.f3014k = (EditText) findViewById(R.id.et_vercode);
        this.f3015l = (EditText) findViewById(R.id.et_vername);
        this.f3016m = (EditText) findViewById(R.id.et_minSdkVersion);
        this.f3017n = (EditText) findViewById(R.id.et_targetSdkVersion);
        this.f3018o = (EditText) findViewById(R.id.et_maxSdkVersion);
        this.f3019p = (CheckBox) findViewById(R.id.cb_rename_resource);
        this.f3020q = (CheckBox) findViewById(R.id.cb_rename_dex);
        this.f3021r = findViewById(R.id.layout_rename_extra);
        this.f3026w = (Spinner) findViewById(R.id.rename_method_spinner);
        if (getPackageName().endsWith("pro")) {
            this.f3013j.addTextChangedListener(this);
        } else {
            this.f3013j.setEnabled(false);
            this.f3026w.setEnabled(false);
            findViewById(R.id.cb_rename_resource).setEnabled(false);
        }
        this.f3025v = (Spinner) findViewById(R.id.location_spinner);
        Resources resources = getResources();
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, new String[]{resources.getString(R.string.location_0), resources.getString(R.string.location_1), resources.getString(R.string.location_2), resources.getString(R.string.location_3)});
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.f3025v.setAdapter((SpinnerAdapter) arrayAdapter);
        ArrayAdapter arrayAdapter2 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, new String[]{resources.getString(R.string.pkg_rename_direct), resources.getString(R.string.pkg_rename_as_plugin)});
        arrayAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.f3026w.setAdapter((SpinnerAdapter) arrayAdapter2);
        this.f3026w.setOnItemSelectedListener(this);
        findViewById(R.id.btn_close).setOnClickListener(this);
        findViewById(R.id.btn_save).setOnClickListener(this);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        if (i == 1) {
            this.f3019p.setVisibility(8);
            this.f3020q.setVisibility(8);
        } else {
            this.f3019p.setVisibility(0);
            this.f3020q.setVisibility(0);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView adapterView) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
