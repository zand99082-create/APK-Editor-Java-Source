package com.gmail.heagoo.apkeditor;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.util.LruCache;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.gmail.heagoo.apkeditor.p098se.SimpleEditActivity;
import com.gmail.heagoo.apkeditor.pro.R;
import com.gmail.heagoo.common.C1552a;
import com.gmail.heagoo.common.C1553b;
import com.gmail.heagoo.common.C1573v;
import com.gmail.heagoo.p084a.p089c.C1067a;
import com.gmail.heagoo.p100b.C1533a;
import com.gmail.heagoo.p100b.C1537e;
import com.gmail.heagoo.p100b.InterfaceC1546n;
import com.gmail.heagoo.p100b.InterfaceC1547o;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import p000a.p001a.p003b.p004a.C0037k;

/* JADX INFO: loaded from: classes.dex */
public class FileListActivity extends Activity implements View.OnClickListener, InterfaceC1189cd, InterfaceC1546n, InterfaceC1547o {

    /* JADX INFO: renamed from: a */
    private TextView f3031a;

    /* JADX INFO: renamed from: b */
    private ListView f3032b;

    /* JADX INFO: renamed from: d */
    private C1537e f3033d;

    /* JADX INFO: renamed from: e */
    private ImageView f3034e;

    /* JADX INFO: renamed from: g */
    private boolean f3035g = false;

    /* JADX INFO: renamed from: i */
    private C1196cm f3036i = null;

    /* JADX INFO: renamed from: k */
    private LruCache f3037k = new LruCache(64);

    /* JADX INFO: renamed from: l */
    private int f3038l = 1;

    /* JADX INFO: renamed from: m */
    private Handler f3039m = new HandlerC1195cl(this);

    /* JADX INFO: renamed from: a */
    private void m2767a() {
        String path = Environment.getExternalStorageDirectory().getPath();
        String string = getSharedPreferences("config", 0).getString("apkDirectory", path);
        if (!new File(string).exists()) {
            string = path;
        }
        this.f3031a = (TextView) findViewById(R.id.dirPath);
        this.f3031a.setText(string);
        this.f3032b = (ListView) findViewById(R.id.file_list);
        this.f3033d = new C1537e(this, this.f3032b, string, "/", this, this);
        this.f3034e = (ImageView) findViewById(R.id.imageView_extsdcard);
        findViewById(R.id.menu_switch_card).setOnClickListener(new ViewOnClickListenerC1194ci(this));
        findViewById(R.id.search_button).setOnClickListener(this);
        findViewById(R.id.menu_home).setOnClickListener(new ViewOnClickListenerC1411ne(this));
        findViewById(R.id.files_list).setOnClickListener(new ViewOnClickListenerC1412nf(this));
        findViewById(R.id.btn_close).setOnClickListener(new ViewOnClickListenerC1413ng(this));
    }

    /* JADX INFO: renamed from: a */
    static /* synthetic */ void m2768a(FileListActivity fileListActivity) {
        boolean z;
        if (fileListActivity.f3035g) {
            fileListActivity.m2771c();
            fileListActivity.f3034e.setImageResource(R.drawable.ic_sdcard_ext);
            z = true;
        } else if (fileListActivity.m2770b()) {
            fileListActivity.f3034e.setImageResource(R.drawable.ic_sdcard_int);
            z = true;
        } else {
            z = false;
        }
        if (z) {
            fileListActivity.f3035g = !fileListActivity.f3035g;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008e A[SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m2770b() {
        Iterator it;
        String strSubstring;
        int length;
        if (Build.VERSION.SDK_INT >= 19) {
            String path = Environment.getExternalStorageDirectory().getPath();
            File[] externalFilesDirs = getExternalFilesDirs(null);
            if (externalFilesDirs != null) {
                int length2 = externalFilesDirs.length;
                int i = 0;
                while (true) {
                    if (i >= length2) {
                        length = 0;
                        break;
                    }
                    String path2 = externalFilesDirs[i].getPath();
                    if (path2.startsWith(path)) {
                        length = path2.length() - path.length();
                        break;
                    }
                    i++;
                }
                for (File file : externalFilesDirs) {
                    String path3 = file.getPath();
                    if (!path3.startsWith(path)) {
                        strSubstring = path3.substring(0, path3.length() - length);
                        break;
                    }
                }
                it = C1552a.m3751b().iterator();
                while (true) {
                    if (it.hasNext()) {
                        strSubstring = null;
                        break;
                    }
                    C1573v c1573v = (C1573v) it.next();
                    if (!c1573v.f4665b && !c1573v.f4666c) {
                        strSubstring = c1573v.f4664a;
                        break;
                    }
                }
            } else {
                it = C1552a.m3751b().iterator();
                while (true) {
                    if (it.hasNext()) {
                    }
                }
            }
        }
        if (strSubstring == null || strSubstring.equals("")) {
            Toast.makeText(this, R.string.cannot_find_ext_sdcard, 0).show();
            return false;
        }
        if (this.f3033d == null) {
            return false;
        }
        this.f3033d.m3746a(strSubstring);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public void m2771c() {
        String path = Environment.getExternalStorageDirectory().getPath();
        if (path == null || path.equals("") || this.f3033d == null) {
            return;
        }
        this.f3033d.m3746a(path);
    }

    /* JADX INFO: renamed from: d */
    static /* synthetic */ boolean m2773d(FileListActivity fileListActivity) {
        File filesDir = fileListActivity.getFilesDir();
        if (fileListActivity.f3033d == null) {
            return false;
        }
        fileListActivity.f3033d.m3746a(filesDir.getPath());
        return true;
    }

    /* JADX INFO: renamed from: g */
    static /* synthetic */ void m2775g(FileListActivity fileListActivity) {
        fileListActivity.f3039m.removeMessages(0);
        fileListActivity.f3039m.sendEmptyMessageDelayed(0, 300L);
    }

    @Override // com.gmail.heagoo.p100b.InterfaceC1547o
    /* JADX INFO: renamed from: a */
    public final Drawable mo2777a(String str, C1533a c1533a) {
        if (c1533a == null || c1533a.f4595b || !c1533a.f4594a.endsWith(".apk")) {
            return null;
        }
        String str2 = str + "/" + c1533a.f4594a;
        C1553b c1553b = (C1553b) this.f3037k.get(str2);
        if (c1553b != null) {
            return c1553b.f4631c;
        }
        this.f3036i.m3110a(str2);
        return getResources().getDrawable(R.drawable.apk_icon);
    }

    @Override // com.gmail.heagoo.apkeditor.InterfaceC1189cd
    /* JADX INFO: renamed from: a */
    public final void mo2740a(int i, String str) {
        Intent intent = null;
        switch (i) {
            case 0:
                UserAppActivity.m2900a(this, str);
                return;
            case 1:
                intent = new Intent(this, (Class<?>) SimpleEditActivity.class);
                break;
            case 2:
                intent = new Intent(this, (Class<?>) CommonEditActivity.class);
                break;
            case 4:
                intent = new Intent(this, (Class<?>) AxmlEditActivity.class);
                break;
        }
        if (intent != null) {
            C1067a.m2442a(intent, "apkPath", str);
            startActivity(intent);
        }
    }

    @Override // com.gmail.heagoo.p100b.InterfaceC1546n
    /* JADX INFO: renamed from: a */
    public final void mo2778a(String str) {
        if (this.f3031a != null) {
            this.f3031a.setText(str);
        }
    }

    @Override // com.gmail.heagoo.p100b.InterfaceC1547o
    /* JADX INFO: renamed from: b */
    public final String mo2779b(String str, C1533a c1533a) {
        if (c1533a.f4595b || !c1533a.f4594a.endsWith(".apk")) {
            return null;
        }
        C1553b c1553b = (C1553b) this.f3037k.get(str + "/" + c1533a.f4594a);
        return c1553b != null ? c1553b.f4629a : "";
    }

    @Override // com.gmail.heagoo.p100b.InterfaceC1546n
    /* JADX INFO: renamed from: b */
    public final boolean mo2780b(String str) {
        if (!str.endsWith(".apk")) {
            return false;
        }
        String strSubstring = str.substring(0, str.lastIndexOf(47));
        SharedPreferences.Editor editorEdit = getSharedPreferences("config", 0).edit();
        editorEdit.putString("apkDirectory", strSubstring);
        editorEdit.commit();
        if (MainActivity.m2784a(this)) {
            new DialogC1188cc(this, this, str).show();
        } else {
            UserAppActivity.m2900a(this, str);
        }
        return true;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() != R.id.search_button || this.f3033d == null) {
            return;
        }
        String string = ((EditText) findViewById(R.id.keyword_edit)).getText().toString();
        String strM3732a = this.f3033d.m3745a().m3732a((List) null);
        Intent intent = new Intent(this, (Class<?>) ApkSearchActivity.class);
        C1067a.m2442a(intent, "Keyword", string);
        C1067a.m2442a(intent, "Path", strM3732a);
        startActivity(intent);
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        setTheme(C0037k.mdNoActionBar(C0037k.m89a(this)));
        super.onCreate(bundle);
        setContentView(R.layout.activity_listfile);
        if (this.f3036i == null) {
            this.f3036i = new C1196cm(this);
            this.f3036i.start();
        }
        if (ContextCompat.checkSelfPermission(this, "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            ActivityCompat.requestPermissions(this, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, this.f3038l);
        } else {
            m2767a();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        this.f3036i.m3109a();
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (iArr.length <= 0 || iArr[0] != 0) {
            return;
        }
        m2767a();
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
    }
}
