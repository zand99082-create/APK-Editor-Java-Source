package com.gmail.heagoo.apkeditor;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.gmail.heagoo.apkeditor.p098se.SimpleEditActivity;
import com.gmail.heagoo.apkeditor.pro.R;
import com.gmail.heagoo.common.C1557f;
import com.gmail.heagoo.p084a.p089c.C1067a;
import java.util.ArrayList;
import java.util.List;
import p000a.p001a.p003b.p004a.C0037k;

/* JADX INFO: loaded from: classes.dex */
public class UserAppActivity extends Activity implements View.OnClickListener, AdapterView.OnItemClickListener, InterfaceC1189cd {

    /* JADX INFO: renamed from: c */
    private ListView f3144c;

    /* JADX INFO: renamed from: g */
    private PopupWindow f3148g;

    /* JADX INFO: renamed from: h */
    private C1205cw f3149h;

    /* JADX INFO: renamed from: j */
    private EditText f3150j;

    /* JADX INFO: renamed from: k */
    private View f3151k;

    /* JADX INFO: renamed from: l */
    private ProgressBar f3152l;

    /* JADX INFO: renamed from: a */
    private int f3142a = 0;

    /* JADX INFO: renamed from: b */
    private int f3143b = 0;

    /* JADX INFO: renamed from: d */
    private HandlerC1393iw f3145d = new HandlerC1393iw(this);

    /* JADX INFO: renamed from: e */
    private List f3146e = new ArrayList();

    /* JADX INFO: renamed from: f */
    private final List f3147f = new ArrayList();

    /* JADX INFO: renamed from: a */
    private C1166bk m2895a(int i) {
        C1166bk c1166bk;
        synchronized (this.f3147f) {
            try {
                c1166bk = (C1166bk) this.f3147f.get(i);
            } catch (Throwable th) {
                c1166bk = null;
            }
        }
        return c1166bk;
    }

    /* JADX INFO: renamed from: a */
    private void m2897a() {
        new C1389is(this).start();
    }

    /* JADX INFO: renamed from: a */
    static /* synthetic */ void m2899a(UserAppActivity userAppActivity, int i, int i2) {
        userAppActivity.f3142a = i;
        userAppActivity.f3143b = i2;
        userAppActivity.m2897a();
    }

    /* JADX INFO: renamed from: a */
    public static boolean m2900a(Context context, String str) {
        String strM2814i = SettingActivity.m2814i(context);
        if ("2".equals(strM2814i)) {
            new DialogC1186ca(context, new C1390it(context, str), str).show();
            return false;
        }
        m2903b(context, str, strM2814i);
        return true;
    }

    @SuppressLint({"DefaultLocale"})
    /* JADX INFO: renamed from: b */
    private void m2902b() {
        String lowerCase = this.f3150j.getText().toString().toLowerCase();
        ArrayList arrayList = new ArrayList();
        for (C1166bk c1166bk : this.f3146e) {
            if (c1166bk.f3425c.toLowerCase().contains(lowerCase)) {
                arrayList.add(c1166bk);
            }
        }
        m2910a(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static void m2903b(Context context, String str, String str2) {
        Intent intent = new Intent(context, (Class<?>) ApkInfoExActivity.class);
        C1067a.m2442a(intent, "apkPath", str);
        C1067a.m2498b(intent, "isFullDecoding", "0".equals(str2));
        context.startActivity(intent);
    }

    /* JADX INFO: renamed from: b */
    private static boolean m2904b(Context context, String str) {
        try {
            Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str);
            if (launchIntentForPackage == null) {
                return false;
            }
            launchIntentForPackage.addCategory("android.intent.category.LAUNCHER");
            context.startActivity(launchIntentForPackage);
            return true;
        } catch (ActivityNotFoundException e) {
            return false;
        }
    }

    @Override // com.gmail.heagoo.apkeditor.InterfaceC1189cd
    /* JADX INFO: renamed from: a */
    public final void mo2740a(int i, String str) {
        Intent intent = null;
        switch (i) {
            case 0:
                if (m2900a(this, str)) {
                    finish();
                    return;
                }
                return;
            case 1:
                intent = new Intent(this, (Class<?>) SimpleEditActivity.class);
                break;
            case 2:
                intent = new Intent(this, (Class<?>) CommonEditActivity.class);
                break;
            case 3:
                try {
                    C1067a.m2452a("com.gmail.heagoo.apkeditor.pro.appdm", "de", new Class[]{Context.class, String.class}, new Object[]{this, str});
                } catch (Exception e) {
                }
                break;
            case 4:
                intent = new Intent(this, (Class<?>) AxmlEditActivity.class);
                break;
        }
        if (intent != null) {
            C1067a.m2442a(intent, "apkPath", str);
            startActivity(intent);
            finish();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m2910a(List list) {
        this.f3152l.setVisibility(8);
        this.f3144c.setVisibility(0);
        C1167bl c1167bl = (C1167bl) this.f3144c.getAdapter();
        String[] stringArray = getResources().getStringArray(R.array.order_value);
        c1167bl.m3078a(list, this.f3143b < stringArray.length ? stringArray[this.f3143b] : "");
        c1167bl.notifyDataSetChanged();
        synchronized (this.f3147f) {
            this.f3147f.clear();
            this.f3147f.addAll(list);
        }
        this.f3150j.setEnabled(true);
        this.f3151k.setVisibility(0);
    }

    /* JADX INFO: renamed from: b */
    protected final void m2911b(List list) {
        PackageManager packageManager = getPackageManager();
        List<ApplicationInfo> installedApplications = packageManager.getInstalledApplications(0);
        if (this.f3142a == 0) {
            for (ApplicationInfo applicationInfo : installedApplications) {
                if ((applicationInfo.flags & 1) == 0) {
                    list.add(C1166bk.m3077a(packageManager, applicationInfo));
                }
            }
            return;
        }
        for (ApplicationInfo applicationInfo2 : installedApplications) {
            if ((applicationInfo2.flags & 1) != 0) {
                list.add(C1166bk.m3077a(packageManager, applicationInfo2));
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id != R.id.menu_more) {
            if (id == R.id.btn_close) {
                finish();
                return;
            } else {
                if (id == R.id.btn_search) {
                    m2902b();
                    return;
                }
                return;
            }
        }
        if (this.f3148g == null) {
            View viewInflate = ((LayoutInflater) getSystemService("layout_inflater")).inflate(R.layout.popup_list, (ViewGroup) null);
            ListView listView = (ListView) viewInflate.findViewById(R.id.lvGroup);
            ArrayList arrayList = new ArrayList();
            Resources resources = getResources();
            arrayList.add(resources.getString(R.string.user_apps));
            arrayList.add(resources.getString(R.string.system_apps));
            String[] stringArray = resources.getStringArray(R.array.order_value);
            for (String str : stringArray) {
                arrayList.add(str);
            }
            this.f3149h = new C1205cw(this, arrayList);
            listView.setAdapter((ListAdapter) this.f3149h);
            this.f3148g = new PopupWindow(viewInflate, C1557f.m3763a(this) / 2, C1557f.m3764a(this, 224.0f));
            listView.setOnItemClickListener(new C1391iu(this));
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(Integer.valueOf(this.f3142a));
        arrayList2.add(Integer.valueOf(this.f3143b + 2));
        this.f3149h.m3121a(arrayList2);
        this.f3148g.setFocusable(true);
        this.f3148g.setOutsideTouchable(true);
        this.f3148g.setBackgroundDrawable(new BitmapDrawable());
        this.f3148g.showAsDropDown(view, (((WindowManager) getSystemService("window")).getDefaultDisplay().getWidth() / 2) - (this.f3148g.getWidth() / 2), 0);
    }

    @Override // android.app.Activity
    public boolean onContextItemSelected(MenuItem menuItem) {
        int i = ((AdapterView.AdapterContextMenuInfo) menuItem.getMenuInfo()).position;
        switch (menuItem.getItemId()) {
            case 2:
                try {
                    C1166bk c1166bkM2895a = m2895a(i);
                    if (c1166bkM2895a != null) {
                        String str = c1166bkM2895a.f3424b;
                        try {
                            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                            intent.setData(Uri.parse("package:" + str));
                            startActivity(intent);
                        } catch (ActivityNotFoundException e) {
                            startActivity(new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"));
                        }
                    }
                    break;
                } catch (Exception e2) {
                }
                return true;
            case 3:
                try {
                    C1166bk c1166bkM2895a2 = m2895a(i);
                    if (c1166bkM2895a2 != null) {
                        new DialogC1284ey(this, new C1392iv(this, c1166bkM2895a2.f3425c, getPackageManager().getApplicationInfo(c1166bkM2895a2.f3424b, 0).publicSourceDir), -1).show();
                    }
                    break;
                } catch (Exception e3) {
                }
                return true;
            case 4:
                try {
                    C1166bk c1166bkM2895a3 = m2895a(i);
                    if (c1166bkM2895a3 != null && !m2904b(this, c1166bkM2895a3.f3424b)) {
                        Toast.makeText(this, String.format(getString(R.string.cannot_launch), c1166bkM2895a3.f3425c), 0).show();
                    }
                    break;
                } catch (Exception e4) {
                }
                return true;
            default:
                return super.onOptionsItemSelected(menuItem);
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        setTheme(C0037k.mdNoActionBar(C0037k.m89a(this)));
        super.onCreate(bundle);
        setContentView(R.layout.activity_applist);
        String strM2804a = SettingActivity.m2804a(this);
        String[] stringArray = getResources().getStringArray(R.array.order_value);
        int i = 0;
        while (true) {
            if (i >= stringArray.length) {
                i = 0;
                break;
            } else if (strM2804a.equals(stringArray[i])) {
                break;
            } else {
                i++;
            }
        }
        this.f3143b = i;
        this.f3152l = (ProgressBar) findViewById(R.id.progress_bar);
        ((TextView) findViewById(R.id.apptype)).setText(R.string.select_apk_from_app);
        findViewById(R.id.menu_more).setOnClickListener(this);
        this.f3144c = (ListView) findViewById(R.id.application_list);
        C1167bl c1167bl = new C1167bl(this);
        c1167bl.m3078a(this.f3147f, SettingActivity.m2804a(this));
        this.f3144c.setAdapter((ListAdapter) c1167bl);
        this.f3144c.setOnItemClickListener(this);
        registerForContextMenu(this.f3144c);
        this.f3150j = (EditText) findViewById(R.id.et_keyword);
        this.f3151k = findViewById(R.id.btn_search);
        this.f3151k.setOnClickListener(this);
        findViewById(R.id.btn_close).setOnClickListener(this);
    }

    @Override // android.app.Activity, android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        C1166bk c1166bkM2895a;
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        AdapterView.AdapterContextMenuInfo adapterContextMenuInfo = (AdapterView.AdapterContextMenuInfo) contextMenuInfo;
        if (adapterContextMenuInfo == null || (c1166bkM2895a = m2895a(adapterContextMenuInfo.position)) == null) {
            return;
        }
        contextMenu.setHeaderTitle(c1166bkM2895a.f3425c);
        contextMenu.add(0, 2, 0, R.string.app_info);
        contextMenu.add(0, 3, 0, R.string.backup);
        contextMenu.add(0, 4, 0, R.string.launch);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        C1166bk c1166bkM2895a = m2895a(i);
        if (c1166bkM2895a != null) {
            try {
                ApplicationInfo applicationInfo = getPackageManager().getApplicationInfo(c1166bkM2895a.f3424b, 0);
                String str = applicationInfo.sourceDir;
                if (MainActivity.m2784a(this)) {
                    new DialogC1188cc(this, this, str, applicationInfo.packageName).show();
                } else {
                    m2900a(this, str);
                }
            } catch (PackageManager.NameNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        m2897a();
    }
}
