package com.willme.topactivity;

import android.app.ActionBar;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.AppOpsManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.provider.Settings;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;
import com.gmail.heagoo.apkeditor.pro.R;
import p000a.p001a.p003b.p004a.C0037k;

/* JADX INFO: loaded from: classes2.dex */
public class MainActivity extends Activity implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: a */
    CompoundButton f5130a;

    /* JADX INFO: renamed from: b */
    CompoundButton f5131b;

    /* JADX INFO: renamed from: c */
    private BroadcastReceiver f5132c;

    /* JADX INFO: renamed from: com.willme.topactivity.MainActivity$a */
    class C1716a extends BroadcastReceiver {
        C1716a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            MainActivity.this.m4135a();
            MainActivity.this.m4138b();
        }
    }

    /* JADX INFO: renamed from: AB */
    private void m4134AB() {
        ActionBar actionBar = getActionBar();
        View viewInflate = getLayoutInflater().inflate(R.layout.mtrl_toolbar, (ViewGroup) null);
        ActionBar.LayoutParams layoutParams = new ActionBar.LayoutParams(-2, -1, 17);
        ((TextView) viewInflate.findViewById(android.R.id.title)).setText(R.string.current_activity);
        actionBar.setCustomView(viewInflate, layoutParams);
        actionBar.setDisplayShowCustomEnabled(true);
        actionBar.setDisplayShowTitleEnabled(false);
        actionBar.setDisplayHomeAsUpEnabled(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m4135a() {
        this.f5130a.setChecked(C1719a.m4155a(this));
        if (getResources().getBoolean(R.bool.use_accessibility_service)) {
            if (C1721c.m4163a() == null) {
                this.f5130a.setChecked(false);
            }
        } else {
            if (Build.VERSION.SDK_INT <= 21 || m4137a((Context) this)) {
                return;
            }
            this.f5130a.setChecked(false);
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m4137a(Context context) {
        return ((AppOpsManager) context.getSystemService("appops")).checkOpNoThrow("android:get_usage_stats", Process.myUid(), context.getPackageName()) == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m4138b() {
        if (this.f5131b != null) {
            this.f5131b.setChecked(!C1719a.m4159c(this));
        }
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (compoundButton == this.f5131b) {
            if (C1719a.m4157b(this)) {
                C1719a.m4158c(this, z ? false : true);
                return;
            } else if (!z) {
                C1719a.m4158c(this, z ? false : true);
                return;
            } else {
                Toast.makeText(this, R.string.toast_add_tile, 1).show();
                compoundButton.setChecked(false);
                return;
            }
        }
        boolean z2 = getResources().getBoolean(R.bool.use_accessibility_service);
        if (z && compoundButton == this.f5130a && Build.VERSION.SDK_INT >= 21) {
            if (Build.VERSION.SDK_INT >= 25 && !Settings.canDrawOverlays(this)) {
                new AlertDialog.Builder(this).setMessage(R.string.dialog_enable_overlay_window_msg).setPositiveButton(R.string.dialog_enable_overlay_window_positive_btn, new DialogInterface.OnClickListener() { // from class: com.willme.topactivity.MainActivity.3
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION");
                        intent.setData(Uri.parse("package:" + MainActivity.this.getPackageName()));
                        MainActivity.this.startActivity(intent);
                        dialogInterface.dismiss();
                    }
                }).setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() { // from class: com.willme.topactivity.MainActivity.2
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        C1719a.m4154a(MainActivity.this, false);
                        MainActivity.this.m4135a();
                    }
                }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.willme.topactivity.MainActivity.1
                    @Override // android.content.DialogInterface.OnCancelListener
                    public void onCancel(DialogInterface dialogInterface) {
                        C1719a.m4154a(MainActivity.this, false);
                        MainActivity.this.m4135a();
                    }
                }).create().show();
                return;
            }
            if (z2 && C1721c.m4163a() == null) {
                new AlertDialog.Builder(this).setMessage(R.string.dialog_enable_accessibility_msg).setPositiveButton(R.string.dialog_enable_accessibility_positive_btn, new DialogInterface.OnClickListener() { // from class: com.willme.topactivity.MainActivity.6
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        C1719a.m4154a(MainActivity.this, true);
                        Intent intent = new Intent();
                        intent.setAction("android.settings.ACCESSIBILITY_SETTINGS");
                        MainActivity.this.startActivity(intent);
                    }
                }).setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() { // from class: com.willme.topactivity.MainActivity.5
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        MainActivity.this.m4135a();
                    }
                }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.willme.topactivity.MainActivity.4
                    @Override // android.content.DialogInterface.OnCancelListener
                    public void onCancel(DialogInterface dialogInterface) {
                        MainActivity.this.m4135a();
                    }
                }).create().show();
                C1719a.m4154a(this, true);
                return;
            } else if (!m4137a((Context) this)) {
                new AlertDialog.Builder(this).setMessage(R.string.dialog_grant_usage_api).setPositiveButton(R.string.dialog_grant_usage_api_positive_btn, new DialogInterface.OnClickListener() { // from class: com.willme.topactivity.MainActivity.9
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        C1719a.m4154a(MainActivity.this, true);
                        MainActivity.this.startActivity(new Intent("android.settings.USAGE_ACCESS_SETTINGS"));
                    }
                }).setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() { // from class: com.willme.topactivity.MainActivity.8
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        MainActivity.this.m4135a();
                    }
                }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.willme.topactivity.MainActivity.7
                    @Override // android.content.DialogInterface.OnCancelListener
                    public void onCancel(DialogInterface dialogInterface) {
                        MainActivity.this.m4135a();
                    }
                }).create().show();
                C1719a.m4154a(this, true);
                startService(new Intent(this, (Class<?>) WatchingService.class));
                return;
            }
        }
        if (compoundButton == this.f5130a) {
            C1719a.m4154a(this, z);
            if (!z) {
                C1720b.m4162b(this);
            } else {
                C1720b.m4161a(this, getPackageName() + "\n" + getClass().getName());
                startService(new Intent(this, (Class<?>) WatchingService.class));
            }
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        setTheme(C0037k.m91md(C0037k.m89a(this)));
        super.onCreate(bundle);
        setContentView(R.layout.activity_current);
        m4134AB();
        this.f5130a = (CompoundButton) findViewById(R.id.sw_window);
        this.f5130a.setOnCheckedChangeListener(this);
        if (Build.VERSION.SDK_INT >= 14 && !getResources().getBoolean(R.bool.qs_tile_service_availability)) {
            findViewById(R.id.useNotificationPref).setVisibility(8);
        }
        this.f5131b = (CompoundButton) findViewById(R.id.sw_notification);
        if (this.f5131b != null) {
            this.f5131b.setOnCheckedChangeListener(this);
        }
        if (getIntent().getBooleanExtra("from_qs_tile", false)) {
            this.f5130a.setChecked(true);
        }
        this.f5132c = new C1716a();
        registerReceiver(this.f5132c, new IntentFilter("com.willme.topactivity.ACTION_STATE_CHANGED"));
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(this.f5132c);
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (getIntent().getBooleanExtra("from_qs_tile", false)) {
            this.f5130a.setChecked(true);
        }
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
            default:
                return false;
        }
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        if (C1719a.m4155a(this)) {
            if (getResources().getBoolean(R.bool.use_accessibility_service) && C1721c.m4163a() == null) {
                return;
            }
            NotificationActionReceiver.m4142a((Context) this, false);
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        m4135a();
        m4138b();
        NotificationActionReceiver.m4141a(this);
    }
}
