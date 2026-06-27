package com.gmail.heagoo.apkeditor;

import android.app.ActionBar;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Process;
import android.preference.PreferenceManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import com.gmail.heagoo.apkeditor.prj.ProjectListActivity;
import com.gmail.heagoo.apkeditor.pro.R;
import com.gmail.heagoo.common.C1554c;
import com.gmail.heagoo.common.C1556e;
import com.gmail.heagoo.common.C1559h;
import com.gmail.heagoo.httpserver.C1579e;
import com.gmail.heagoo.p084a.p089c.C1067a;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipFile;
import org.apache.commons.p106io.FileUtils;
import p000a.p001a.p003b.p004a.C0037k;
import p000a.p001a.p003b.p004a.C0040n;
import rull.mod.Webku;

/* JADX INFO: loaded from: classes.dex */
public class MainActivity extends Activity implements View.OnClickListener, View.OnLongClickListener, DialogInterface.OnClickListener, InterfaceC1291fa {

    /* JADX INFO: renamed from: a */
    private static int f3041a;

    /* JADX INFO: renamed from: b */
    private static int f3042b;

    /* JADX INFO: renamed from: d */
    SharedPreferences f3044d;

    /* JADX INFO: renamed from: e */
    View f3045e;

    /* JADX INFO: renamed from: f */
    View f3046f;

    /* JADX INFO: renamed from: g */
    View f3047g;

    /* JADX INFO: renamed from: h */
    View f3048h;

    /* JADX INFO: renamed from: j */
    View f3050j;

    /* JADX INFO: renamed from: k */
    View f3051k;
    String kotak;

    /* JADX INFO: renamed from: l */
    View f3052l;

    /* JADX INFO: renamed from: m */
    View f3053m;
    View yes;

    /* JADX INFO: renamed from: i */
    private int f3049i = 1;

    /* JADX INFO: renamed from: c */
    private MainActivity f3043c = this;

    static {
        System.loadLibrary("syscheck");
    }

    /* JADX INFO: renamed from: AB */
    private void m2783AB() {
        ActionBar actionBar = getActionBar();
        View viewInflate = getLayoutInflater().inflate(R.layout.mtrl_toolbar, (ViewGroup) null);
        ActionBar.LayoutParams layoutParams = new ActionBar.LayoutParams(-2, -1, 17);
        TextView textView = (TextView) viewInflate.findViewById(android.R.id.title);
        textView.setText(R.string.app_name);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.gmail.heagoo.apkeditor.la
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.m2788lc(view);
            }
        });
        textView.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.gmail.heagoo.apkeditor.lb
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f4072a.llc(view);
            }
        });
        actionBar.setCustomView(viewInflate, layoutParams);
        actionBar.setDisplayShowCustomEnabled(true);
        actionBar.setDisplayShowTitleEnabled(false);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.ic_theme);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m2784a(Context context) {
        return true;
    }

    /* JADX INFO: renamed from: c */
    private void m2785c() {
        try {
            File file = new File(getFilesDir(), "work.xml");
            if (!file.exists()) {
                file.createNewFile();
                file.setWritable(true);
            }
            File file2 = new File(getFilesDir(), "work.db");
            if (!file2.exists()) {
                file2.createNewFile();
                file2.setWritable(true);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            File file3 = new File(getFilesDir(), "mycp");
            if (!file3.exists() && Build.VERSION.SDK_INT >= 20) {
                InputStream inputStreamOpen = getAssets().open("mycp");
                FileOutputStream fileOutputStream = new FileOutputStream(file3);
                C1067a.m2477a(inputStreamOpen, fileOutputStream);
                inputStreamOpen.close();
                fileOutputStream.close();
                file3.setExecutable(true);
            }
            File file4 = new File(getFilesDir().getAbsolutePath() + "/bin", "aapt2");
            File parentFile = file4.getParentFile();
            if (!parentFile.exists()) {
                parentFile.mkdirs();
            }
            if (file4.exists()) {
                return;
            }
            InputStream inputStreamOpen2 = getAssets().open("aapt2");
            FileOutputStream fileOutputStream2 = new FileOutputStream(file4);
            C1067a.m2477a(inputStreamOpen2, fileOutputStream2);
            inputStreamOpen2.close();
            fileOutputStream2.close();
            file4.setExecutable(true);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private void clean() {
        cleanStorage();
        String absolutePath = getFilesDir().getAbsolutePath();
        new C1554c().mo3757a("rm -rf " + absolutePath + "/decoded\nrm -rf " + absolutePath + "/temp", (String[]) null, (Integer) 8000);
        Toast.makeText(this, R.string.temp_file_cleaned, 0).show();
    }

    private void cleanStorage() {
        boolean z;
        File file = new File(Environment.getExternalStorageDirectory().getPath() + "/ApkEditor");
        if (file.exists() && file.isDirectory()) {
            String[] strArr = {"backups", ".projects"};
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null) {
                for (File file2 : fileArrListFiles) {
                    if (file2.isDirectory()) {
                        String name = file2.getName();
                        int i = 0;
                        while (true) {
                            if (i >= 2) {
                                z = false;
                                break;
                            } else {
                                if (name.equals(strArr[i])) {
                                    z = true;
                                    break;
                                }
                                i++;
                            }
                        }
                        if (!z) {
                            cleanWork(file2);
                            file2.delete();
                        }
                    } else {
                        file2.delete();
                    }
                }
            }
        }
    }

    private void cleanWork(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    cleanWork(file2);
                    file2.delete();
                } else {
                    file2.delete();
                }
            }
        }
    }

    /* JADX INFO: renamed from: fd */
    private void m2786fd() {
        SharedPreferences.Editor editorEdit = getSharedPreferences("fd", 0).edit();
        editorEdit.putBoolean("FD", false);
        editorEdit.apply();
        float f = getResources().getDisplayMetrics().density;
        int i = (int) ((6.0f * f) + 0.5f);
        int i2 = (int) ((f * 24.0f) + 0.5f);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(R.string.action_changelogs);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(layoutParams);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        ScrollView scrollView = new ScrollView(this);
        scrollView.setVerticalScrollBarEnabled(false);
        layoutParams2.setMargins(0, i, 0, 0);
        scrollView.setLayoutParams(layoutParams2);
        linearLayout.addView(scrollView);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        TextView textView = new TextView(this);
        textView.setText(R.string.changelogs);
        textView.setTextColor(ContextCompat.getColor(this, C0037k.mdTextSmall(C0037k.m89a(this))));
        textView.setTextSize(1, 14.0f);
        textView.setPadding(0, i, 0, i);
        layoutParams3.setMargins(i2, 0, i2, 0);
        textView.setLayoutParams(layoutParams3);
        scrollView.addView(textView);
        builder.setView(linearLayout);
        builder.setPositiveButton(R.string.got_it, (DialogInterface.OnClickListener) null);
        builder.setNeutralButton("by Zeratul", (DialogInterface.OnClickListener) null);
        builder.setCancelable(false);
        builder.show().getButton(-3).setEnabled(false);
    }

    public static native int isX86();

    /* JADX INFO: renamed from: it */
    public static native void m2787it(Object obj, String str, String str2, String str3);

    public static void lang(MainActivity mainActivity) {
        C1556e.m3762l(mainActivity);
    }

    /* JADX INFO: renamed from: lc */
    static /* synthetic */ void m2788lc(View view) {
        f3041a++;
    }

    /* JADX INFO: renamed from: md */
    public static native void m2789md(String str, String str2, String str3, int i, String str4, int i2, String str5, int i3);

    /* JADX INFO: renamed from: mg */
    public static native void m2790mg(String str, String str2, String str3, int i, String str4, int i2);

    private void resetTools() {
        SharedPreferences.Editor editorEdit = getSharedPreferences("info", 0).edit();
        editorEdit.putBoolean("initialized", false);
        editorEdit.commit();
        Toast.makeText(this, R.string.toast_reset_tools, 1).show();
    }

    private void showDialogClean() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(R.string.confirm_title);
        builder.setMessage(R.string.confirm_message_clean);
        builder.setNegativeButton(R.string.no, this);
        builder.setPositiveButton(R.string.yes, this);
        builder.create().show();
    }

    /* JADX INFO: renamed from: vc */
    public static native int m2791vc(Object obj, int i);

    private void visibilityButtons() {
        if (new Boolean(this.f3044d.getBoolean("hide_prj", false)).equals(new Boolean(true))) {
            this.f3045e.setVisibility(8);
        } else {
            this.f3045e.setVisibility(0);
        }
        if (new Boolean(this.f3044d.getBoolean("show_odex", false)).equals(new Boolean(true))) {
            this.f3046f.setVisibility(0);
        } else {
            this.f3046f.setVisibility(8);
        }
        if (new Boolean(this.f3044d.getBoolean("show_info", false)).equals(new Boolean(true))) {
            this.f3047g.setVisibility(0);
        } else {
            this.f3047g.setVisibility(8);
        }
        if (new Boolean(this.f3044d.getBoolean("hide_exit", false)).equals(new Boolean(true))) {
            this.f3048h.setVisibility(8);
        } else {
            this.f3048h.setVisibility(0);
        }
        if (new Boolean(this.f3044d.getBoolean("show_verify", false)).equals(new Boolean(true))) {
            this.f3050j.setVisibility(0);
        } else {
            this.f3050j.setVisibility(8);
        }
        if (new Boolean(this.f3044d.getBoolean("show_sign", false)).equals(new Boolean(true))) {
            this.f3051k.setVisibility(0);
        } else {
            this.f3051k.setVisibility(8);
        }
        if (new Boolean(this.f3044d.getBoolean("show_db", false)).equals(new Boolean(true))) {
            this.f3052l.setVisibility(0);
        } else {
            this.f3052l.setVisibility(8);
        }
        if (new Boolean(this.f3044d.getBoolean("hide_webview", false)).equals(new Boolean(true))) {
            this.f3053m.setVisibility(8);
        } else {
            this.f3053m.setVisibility(0);
        }
    }

    public void RizalVa(View view) {
        try {
            startActivity(new Intent(getApplicationContext(), Class.forName("com.tilks.arsc.main.MainActivity")));
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    @Override // com.gmail.heagoo.apkeditor.InterfaceC1291fa
    /* JADX INFO: renamed from: a */
    public final void mo2792a() {
        try {
            stopService(new Intent(this, (Class<?>) ApkComposeService.class));
            C1579e.m3816a();
            C1579e.m3819b(this);
            C1559h.m3770a(new File(getFilesDir().getAbsolutePath() + "/decoded"));
        } catch (Throwable th) {
        }
    }

    @Override // com.gmail.heagoo.apkeditor.InterfaceC1291fa
    /* JADX INFO: renamed from: b */
    public final void mo2793b() {
        Process.killProcess(Process.myPid());
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void checkingInstruments() {
        boolean z;
        if (getSharedPreferences("info", 0).getBoolean("initialized", false)) {
            String str = getFilesDir().getAbsolutePath() + "/bin";
            File file = new File(str, "aapt");
            if (fileSize(file) != 819960) {
                z = true;
            } else {
                long jChecksumCRC32 = 0;
                try {
                    jChecksumCRC32 = FileUtils.checksumCRC32(file);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (getCrc("assets/aapt") == jChecksumCRC32) {
                    z = false;
                }
            }
            if (fileSize(new File(str, "android.jar")) == 2269471 ? z : true) {
                Toast.makeText(this, R.string.update_instruments, 0);
            }
        }
    }

    public final long fileSize(File file) {
        if (file.exists()) {
            return file.length();
        }
        return 0L;
    }

    public final long getCrc(String str) {
        long crc = 0;
        try {
            ZipFile zipFile = new ZipFile(getPackageCodePath());
            crc = zipFile.getEntry(str).getCrc();
            zipFile.close();
            return crc;
        } catch (IOException e) {
            e.printStackTrace();
            return crc;
        }
    }

    public boolean llc(View view) {
        if (f3041a >= 5) {
            Toast.makeText(this, "by Zeratul", 0).show();
        }
        return f3041a >= 5;
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        finish();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        switch (i) {
            case -2:
                dialogInterface.dismiss();
                break;
            case -1:
                clean();
                break;
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_apk /* 2131558984 */:
                startActivity(new Intent(this, (Class<?>) FileListActivity.class));
                break;
            case R.id.btn_app /* 2131558985 */:
                startActivity(new Intent(this, (Class<?>) UserAppActivity.class));
                break;
            case R.id.btn_prj /* 2131558986 */:
                startActivity(new Intent(this, (Class<?>) ProjectListActivity.class));
                break;
            case R.id.btn_odex /* 2131558987 */:
                startActivity(new Intent(this, (Class<?>) OdexPatchActivity.class));
                break;
            case R.id.btn_info /* 2131558988 */:
                startActivity(new Intent(this, (Class<?>) InfoActivity.class));
                break;
            case R.id.btn_settings /* 2131558989 */:
                startActivity(new Intent(this, (Class<?>) SettingActivity.class));
                break;
            case R.id.btn_exit /* 2131558990 */:
                new DialogC1284ey(this.f3043c, this.f3043c, -1).show();
                break;
            case R.id.btn_sign /* 2131559001 */:
                startActivity(new Intent(this, (Class<?>) SelectFileActivity.class));
                break;
            case R.id.btn_verify /* 2131559003 */:
                startActivity(new Intent(this, (Class<?>) VerifyActivity.class));
                break;
            case R.id.btn_db /* 2131559020 */:
                startActivity(new Intent(this, (Class<?>) SelectDbActivity.class));
                break;
            case R.id.webButton /* 2131559066 */:
                startActivity(new Intent(this, (Class<?>) Webku.class));
                break;
            case R.id.btn_current /* 2131559075 */:
                startActivity(new Intent(this, (Class<?>) com.willme.topactivity.MainActivity.class));
                break;
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        setTheme(C0037k.m91md(C0037k.m89a(this)));
        super.onCreate(bundle);
        lang(this);
        App.setContext(this);
        this.f3044d = PreferenceManager.getDefaultSharedPreferences(this);
        setContentView(C0040n.m94b(C0040n.m96d(this)));
        if (getSharedPreferences("fd", 0).getBoolean("FD", true)) {
            m2786fd();
        }
        m2783AB();
        sayaupdate();
        findViewById(R.id.btn_apk).setOnClickListener(this);
        findViewById(R.id.btn_app).setOnClickListener(this);
        this.f3045e = findViewById(R.id.btn_prj);
        this.f3045e.setOnClickListener(this);
        this.f3046f = findViewById(R.id.btn_odex);
        this.f3046f.setOnClickListener(this);
        this.f3047g = findViewById(R.id.btn_info);
        this.f3047g.setOnClickListener(this);
        findViewById(R.id.btn_settings).setOnClickListener(this);
        this.f3048h = findViewById(R.id.btn_exit);
        this.f3048h.setOnClickListener(this);
        this.f3050j = findViewById(R.id.btn_verify);
        this.f3050j.setOnClickListener(this);
        this.f3051k = findViewById(R.id.btn_sign);
        this.f3051k.setOnClickListener(this);
        this.f3052l = findViewById(R.id.btn_db);
        this.f3052l.setOnClickListener(this);
        this.f3053m = findViewById(R.id.webButton);
        this.f3053m.setOnClickListener(this);
        this.yes = findViewById(R.id.btn_current);
        this.yes.setOnClickListener(this);
        if (ContextCompat.checkSelfPermission(this, "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            ActivityCompat.requestPermissions(this, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, this.f3049i);
        } else {
            m2785c();
            checkingInstruments();
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case android.R.id.home:
                new C0037k().m92f(this, R.string.theme_title, new C1398ja(this));
                break;
            case R.id.action_prj /* 2131558991 */:
                startActivity(new Intent(this, (Class<?>) ProjectListActivity.class));
                break;
            case R.id.action_odex /* 2131558992 */:
                startActivity(new Intent(this, (Class<?>) OdexPatchActivity.class));
                break;
            case R.id.action_edit /* 2131558993 */:
                startActivity(new Intent(this, (Class<?>) SettingEditorActivity.class));
                break;
            case R.id.action_info /* 2131558994 */:
                startActivity(new Intent(this, (Class<?>) InfoActivity.class));
                break;
            case R.id.action_mod /* 2131558995 */:
                startActivity(new Intent(this, (Class<?>) AboutModActivity.class));
                break;
            case R.id.action_exit /* 2131558996 */:
                new DialogC1284ey(this.f3043c, this.f3043c, -1).show();
                break;
            case R.id.action_db /* 2131558997 */:
                startActivity(new Intent(this, (Class<?>) SelectDbActivity.class));
                break;
            case R.id.action_tools /* 2131558998 */:
                resetTools();
                break;
            case R.id.action_changelogs /* 2131558999 */:
                m2786fd();
                break;
            case R.id.action_sign /* 2131559000 */:
                startActivity(new Intent(this, (Class<?>) SelectFileActivity.class));
                break;
            case R.id.action_verify /* 2131559002 */:
                startActivity(new Intent(this, (Class<?>) VerifyActivity.class));
                break;
            case R.id.action_clean /* 2131559021 */:
                showDialogClean();
                break;
            case R.id.action_webview /* 2131559062 */:
                startActivity(new Intent(this, (Class<?>) Webku.class));
                break;
        }
        return true;
    }

    @Override // android.app.Activity
    public boolean onPrepareOptionsMenu(Menu menu) {
        MenuItem menuItemFindItem = menu.findItem(R.id.action_prj);
        if (new Boolean(this.f3044d.getBoolean("hide_prj", false)).equals(new Boolean(true))) {
            menuItemFindItem.setVisible(true);
        } else {
            menuItemFindItem.setVisible(false);
        }
        MenuItem menuItemFindItem2 = menu.findItem(R.id.action_webview);
        if (new Boolean(this.f3044d.getBoolean("hide_webview", false)).equals(new Boolean(true))) {
            menuItemFindItem2.setVisible(true);
        } else {
            menuItemFindItem2.setVisible(false);
        }
        MenuItem menuItemFindItem3 = menu.findItem(R.id.action_odex);
        if (new Boolean(this.f3044d.getBoolean("show_odex", false)).equals(new Boolean(true))) {
            menuItemFindItem3.setVisible(false);
        } else {
            menuItemFindItem3.setVisible(true);
        }
        menu.findItem(R.id.action_edit).setVisible(true);
        MenuItem menuItemFindItem4 = menu.findItem(R.id.action_info);
        if (new Boolean(this.f3044d.getBoolean("show_info", false)).equals(new Boolean(true))) {
            menuItemFindItem4.setVisible(false);
        } else {
            menuItemFindItem4.setVisible(true);
        }
        MenuItem menuItemFindItem5 = menu.findItem(R.id.action_mod);
        if (new Boolean(this.f3044d.getBoolean("hide_mod", false)).equals(new Boolean(true))) {
            menuItemFindItem5.setVisible(false);
        } else {
            menuItemFindItem5.setVisible(true);
        }
        MenuItem menuItemFindItem6 = menu.findItem(R.id.action_exit);
        if (new Boolean(this.f3044d.getBoolean("hide_exit", false)).equals(new Boolean(true))) {
            menuItemFindItem6.setVisible(true);
        } else {
            menuItemFindItem6.setVisible(false);
        }
        MenuItem menuItemFindItem7 = menu.findItem(R.id.action_verify);
        if (new Boolean(this.f3044d.getBoolean("show_verify", false)).equals(new Boolean(true))) {
            menuItemFindItem7.setVisible(false);
        } else {
            menuItemFindItem7.setVisible(true);
        }
        MenuItem menuItemFindItem8 = menu.findItem(R.id.action_sign);
        if (new Boolean(this.f3044d.getBoolean("show_sign", false)).equals(new Boolean(true))) {
            menuItemFindItem8.setVisible(false);
        } else {
            menuItemFindItem8.setVisible(true);
        }
        MenuItem menuItemFindItem9 = menu.findItem(R.id.action_changelogs);
        if (new Boolean(this.f3044d.getBoolean("hide_changelogs", false)).equals(new Boolean(true))) {
            menuItemFindItem9.setVisible(false);
        } else {
            menuItemFindItem9.setVisible(true);
        }
        MenuItem menuItemFindItem10 = menu.findItem(R.id.action_tools);
        if (new Boolean(this.f3044d.getBoolean("hide_tools", false)).equals(new Boolean(true))) {
            menuItemFindItem10.setVisible(false);
        } else {
            menuItemFindItem10.setVisible(true);
        }
        MenuItem menuItemFindItem11 = menu.findItem(R.id.action_db);
        if (new Boolean(this.f3044d.getBoolean("show_db", false)).equals(new Boolean(true))) {
            menuItemFindItem11.setVisible(false);
        } else {
            menuItemFindItem11.setVisible(true);
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        m2785c();
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        if (C0037k.f92md) {
            C0037k.f92md = false;
            recreate();
        }
        visibilityButtons();
    }

    public void sayaupdate() {
        if (getCurrentChannel() == null) {
            writeUpdateChannelPreference("stable");
            writeUpdatesOnStartup(true);
        }
        if (getStartupUpdates()) {
            new UpdaterAssistant(this, false).checkForUpdates();
        }
    }

    public void writeUpdateChannelPreference(String str) {
        SharedPreferences.Editor editorEdit = getSharedPreferences("com.gmail.heagoo.apkeditor.pro_preferences", 0).edit();
        editorEdit.putString("channel", str);
        editorEdit.apply();
    }

    public void writeUpdatesOnStartup(boolean z) {
        SharedPreferences.Editor editorEdit = getSharedPreferences("com.gmail.heagoo.apkeditor.pro_preferences", 0).edit();
        editorEdit.putBoolean("updates_on_startup", z);
        editorEdit.apply();
    }

    public String getCurrentChannel() {
        return getSharedPreferences("com.gmail.heagoo.apkeditor.pro_preferences", 0).getString("channel", (String) null);
    }

    public boolean getStartupUpdates() {
        return getSharedPreferences("com.gmail.heagoo.apkeditor.pro_preferences", 0).getBoolean("updates_on_startup", true);
    }
}
