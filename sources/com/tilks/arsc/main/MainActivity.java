package com.tilks.arsc.main;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.preference.PreferenceManager;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.gmail.heagoo.apkeditor.pro.R;
import com.nabinbhandari.android.permissions.AbstractC1689a;
import com.nabinbhandari.android.permissions.C1690b;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import p019b.p022fn.p023a.p025b.p033b.C0447a;
import p019b.p022fn.p034b.p035a.p036a.p037a.DialogInterfaceOnClickListenerC0449a;

/* JADX INFO: loaded from: classes.dex */
public class MainActivity extends Activity implements View.OnClickListener {

    /* JADX INFO: renamed from: l */
    private static String f5061l = "";

    /* JADX INFO: renamed from: m */
    private static String f5062m = "";

    /* JADX INFO: renamed from: n */
    private static String f5063n = "";

    /* JADX INFO: renamed from: a */
    private TextView f5064a;

    /* JADX INFO: renamed from: b */
    private String f5065b;

    /* JADX INFO: renamed from: c */
    private ProgressBar f5066c;

    /* JADX INFO: renamed from: d */
    private TextView f5067d;

    /* JADX INFO: renamed from: e */
    private boolean f5068e;

    /* JADX INFO: renamed from: f */
    private boolean f5069f = true;

    /* JADX INFO: renamed from: g */
    private boolean f5070g = false;

    /* JADX INFO: renamed from: h */
    private boolean f5071h = false;

    /* JADX INFO: renamed from: i */
    private boolean f5072i = false;

    /* JADX INFO: renamed from: j */
    private boolean f5073j = false;

    /* JADX INFO: renamed from: k */
    private String f5074k;

    /* JADX INFO: renamed from: com.tilks.arsc.main.MainActivity$a */
    class C1694a implements TextWatcher {
        C1694a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            String unused = MainActivity.f5063n = MainActivity.this.f5064a.getText().toString();
        }
    }

    /* JADX INFO: renamed from: com.tilks.arsc.main.MainActivity$b */
    class C1695b extends AbstractC1689a {
        C1695b() {
        }

        @Override // com.nabinbhandari.android.permissions.AbstractC1689a
        /* JADX INFO: renamed from: a */
        public void mo4056a() {
            Toast.makeText(MainActivity.this, "Permission Granted, Now you can use local drive.", 0).show();
        }

        @Override // com.nabinbhandari.android.permissions.AbstractC1689a
        /* JADX INFO: renamed from: b */
        public void mo4059b(Context context, ArrayList<String> arrayList) {
            Toast.makeText(MainActivity.this, "Permission Denied, You cannot use local drive.", 0).show();
        }
    }

    /* JADX INFO: renamed from: a */
    private void m4083a(final View view) {
        DialogInterfaceOnClickListenerC0449a dialogInterfaceOnClickListenerC0449a = new DialogInterfaceOnClickListenerC0449a();
        dialogInterfaceOnClickListenerC0449a.m491a(this);
        dialogInterfaceOnClickListenerC0449a.m494a(false, false, "apks", "zip", "xapk");
        dialogInterfaceOnClickListenerC0449a.m493a(this.f5065b);
        dialogInterfaceOnClickListenerC0449a.m492a(new DialogInterfaceOnClickListenerC0449a.k() { // from class: com.tilks.arsc.main.a
            @Override // p019b.p022fn.p034b.p035a.p036a.p037a.DialogInterfaceOnClickListenerC0449a.k
            /* JADX INFO: renamed from: a */
            public final void mo501a(String str, File file) {
                this.f5090a.m4089a(view, str, file);
            }
        });
        dialogInterfaceOnClickListenerC0449a.m490a();
        dialogInterfaceOnClickListenerC0449a.m496b();
    }

    /* JADX INFO: renamed from: b */
    private void m4084b() {
        File fileM4085c = m4085c();
        File file = new File(fileM4085c, "testkey.past");
        File file2 = new File(fileM4085c, "testkey.pk8");
        if (file.exists() && file2.exists()) {
            f5061l = file.getAbsolutePath();
            f5062m = file2.getAbsolutePath();
            return;
        }
        fileM4085c.mkdir();
        try {
            C0447a.m481a(this, "testkey.past", file);
            C0447a.m481a(this, "testkey.pk8", file2);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (file.exists() && file2.exists()) {
            f5061l = file.getAbsolutePath();
            f5062m = file2.getAbsolutePath();
        }
    }

    /* JADX INFO: renamed from: c */
    private File m4085c() {
        return new File(getFilesDir(), "signing");
    }

    /* JADX INFO: renamed from: d */
    private void m4086d() {
    }

    /* JADX INFO: renamed from: e */
    private String m4087e() {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        this.f5069f = defaultSharedPreferences.getBoolean("signEnable", true);
        this.f5070g = defaultSharedPreferences.getBoolean("moduleEnable", false);
        this.f5071h = defaultSharedPreferences.getBoolean("languageEnable", false);
        this.f5072i = defaultSharedPreferences.getBoolean("extractNativeLibsEnable", false);
        this.f5073j = defaultSharedPreferences.getBoolean("mismatchingPackagesEnable", false);
        this.f5074k = defaultSharedPreferences.getString("languageCode", "ru");
        if (!this.f5071h) {
            return "AntiSplit";
        }
        return "Language " + this.f5074k;
    }

    /* JADX INFO: renamed from: a */
    public void m4088a() {
        C1690b.a aVar = new C1690b.a();
        aVar.m4062a("Info");
        aVar.m4063b("Warning");
        C1690b.m4060a(this, new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"}, "Please provide storage permission so that you can ...", aVar, new C1695b());
    }

    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m4089a(View view, String str, File file) {
        Toast.makeText(this, "FILE: " + str, 0).show();
        int id = view.getId();
        if (id == R.id.dup_0x7f030003 || id == R.id.dup_0x7f030007) {
            f5063n = str;
            this.f5064a.setText(str);
        }
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == 100) {
            this.f5066c.setVisibility(0);
        } else if (i2 == 200) {
            this.f5067d.append(intent.getStringExtra("result"));
        } else if (i2 == 300) {
            this.f5066c.setVisibility(8);
            this.f5068e = false;
        }
        if (i == 1000) {
            Toast.makeText(getApplicationContext(), m4087e(), 0).show();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        String str;
        if (view.getId() != R.id.dup_0x7f030001) {
            m4083a(view);
            return;
        }
        if (this.f5071h) {
            str = "Language " + this.f5074k;
        } else {
            str = "AntiSplit";
        }
        Toast.makeText(this, str, 0).show();
        this.f5067d.setText("");
        PendingIntent pendingIntentCreatePendingResult = createPendingResult(1, new Intent(), 0);
        Intent intent = new Intent(this, (Class<?>) MergeService.class);
        intent.putExtra("keyPast", f5061l);
        intent.putExtra("keyKey", f5062m);
        intent.putExtra("zip", f5063n);
        intent.putExtra("signEnable", this.f5069f);
        intent.putExtra("moduleEnable", this.f5070g);
        intent.putExtra("languageEnable", this.f5071h);
        intent.putExtra("extractNativeLibsEnable", this.f5072i);
        intent.putExtra("mismatchingPackagesEnable", this.f5073j);
        intent.putExtra("languageCode", this.f5074k);
        intent.putExtra("pendingIntent", pendingIntentCreatePendingResult);
        this.f5068e = true;
        startService(intent);
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.fnAntiSplit);
        ProgressBar progressBar = (ProgressBar) findViewById(R.id.dup_0x7f030006);
        this.f5066c = progressBar;
        progressBar.setVisibility(8);
        if (Build.VERSION.SDK_INT >= 23 && checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            m4088a();
        }
        this.f5065b = Environment.getExternalStorageDirectory().getPath();
        this.f5067d = (TextView) findViewById(R.id.dup_0x7f03000a);
        TextView textView = (TextView) findViewById(R.id.dup_0x7f030003);
        this.f5064a = textView;
        textView.setHint(R.string.dup_0x7f060004);
        this.f5064a.setOnClickListener(this);
        this.f5064a.addTextChangedListener(new C1694a());
        Button button = (Button) findViewById(R.id.dup_0x7f030001);
        button.setText(R.string.dup_0x7f060006);
        button.setOnClickListener(this);
        ((ImageButton) findViewById(R.id.dup_0x7f030007)).setOnClickListener(this);
        if (bundle != null) {
            this.f5064a.setText(bundle.getCharSequence("zip1"));
            this.f5067d.setText(bundle.getCharSequence("result"));
            this.f5068e = bundle.getBoolean("isRunning");
        }
        m4084b();
        if (this.f5068e) {
            this.f5066c.setVisibility(0);
        } else {
            this.f5066c.setVisibility(8);
        }
        m4087e();
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        bundle.putCharSequence("zip1", this.f5064a.getText());
        bundle.putCharSequence("result", this.f5067d.getText());
        bundle.putBoolean("isRunning", this.f5068e);
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.fnAntiSplit, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        switch (itemId) {
            case R.id.dup_0x7f030008 /* 2131559086 */:
                startActivity(new Intent(this, (Class<?>) SettingsActivity.class));
                break;
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
