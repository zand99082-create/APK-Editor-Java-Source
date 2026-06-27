package com.gmail.heagoo.apkeditor;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.content.pm.ServiceInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.IBinder;
import androidx.core.app.NotificationCompat;
import com.android.apksig.apk.ApkUtils;
import com.gmail.heagoo.apkeditor.p090a.InterfaceC1108d;
import com.gmail.heagoo.apkeditor.pro.R;
import com.gmail.heagoo.common.C1562k;
import com.gmail.heagoo.common.InterfaceC1561j;
import com.gmail.heagoo.p084a.p089c.C1067a;
import com.gmail.heagoo.p084a.p089c.ResXmlPatcher;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class ApkComposeService extends Service implements InterfaceC1561j {

    /* JADX INFO: renamed from: a */
    private String f2856a;

    /* JADX INFO: renamed from: b */
    private String f2857b;

    /* JADX INFO: renamed from: c */
    private Boolean f2858c;

    /* JADX INFO: renamed from: d */
    private Boolean f2859d;

    /* JADX INFO: renamed from: e */
    private Boolean f2860e;

    /* JADX INFO: renamed from: f */
    private ArrayList f2861f;

    /* JADX INFO: renamed from: g */
    private Map f2862g;
    /* JADX INFO: renamed from: h */
    private Map f2863h;

    /* JADX INFO: renamed from: i */
    private Set f2864i;

    /* JADX INFO: renamed from: j */
    private Map f2865j;

    /* JADX INFO: renamed from: k */
    private String f2866k;
    /* JADX INFO: renamed from: l */
    private AbstractC1181bz f2867l;

    /* JADX INFO: renamed from: n */
    private WeakReference f2869n;

    /* JADX INFO: renamed from: p */
    private NotificationManager f2871p;

    /* JADX INFO: renamed from: q */
    private NotificationCompat.Builder f2872q;

    /* JADX INFO: renamed from: u */
    private boolean f2876u;

    /* JADX INFO: renamed from: m */
    private C1397j f2868m = new C1397j(this);

    /* JADX INFO: renamed from: o */
    private InterfaceC1108d f2870o = null;

    /* JADX INFO: renamed from: r */
    private boolean f2873r = false;

    /* JADX INFO: renamed from: s */
    private HandlerC1402l f2874s = new HandlerC1402l(this, 0);

    /* JADX INFO: renamed from: t */
    private BinderC1401k f2875t = new BinderC1401k(this);

    /* JADX INFO: renamed from: v */
    private long f2877v = 0;

    /* JADX INFO: renamed from: a */
    static /* synthetic */ NotificationManager m2602a(ApkComposeService apkComposeService, NotificationManager notificationManager) {
        apkComposeService.f2871p = null;
        return null;
    }

    /* JADX INFO: renamed from: a */
    private void m2606a(boolean z, String str, String str2) {
        if (this.f2871p != null) {
            this.f2874s.removeMessages(0);
            this.f2874s.m3455a(str, str2);
            if (z || System.currentTimeMillis() - this.f2877v > 1000) {
                this.f2874s.sendEmptyMessage(0);
            } else {
                this.f2874s.sendEmptyMessageDelayed(0, 500L);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private static Map m2608b(String str) throws Throwable {
        BufferedReader bufferedReader;
        HashMap map = new HashMap();
        BufferedReader bufferedReader2 = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(str)));
            try {
                for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                    String line2 = bufferedReader.readLine();
                    if (line2 != null) {
                        map.put(line, line2);
                    }
                }
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                }
            } catch (Exception e2) {
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException e3) {
                    }
                }
            } catch (Throwable th) {
                bufferedReader2 = bufferedReader;
                th = th;
                if (bufferedReader2 != null) {
                    try {
                        bufferedReader2.close();
                    } catch (IOException e4) {
                    }
                }
                throw th;
            }
        } catch (Exception e5) {
            bufferedReader = null;
        } catch (Throwable th2) {
            th = th2;
        }
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m2609b() {
        Intent intent = new Intent(this, (Class<?>) ApkComposeActivity.class);
        intent.setAction("com.gmail.heagoo.action.apkcompose");
        intent.setFlags(131072);
        PendingIntent activity = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_IMMUTABLE);
        int iIntValue = ((Integer) C1067a.m2452a("com.gmail.heagoo.seticon.SetIcon", "getIconId", (Class[]) null, (Object[]) null)).intValue();
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(getResources(), iIntValue);
        String string = getString(R.string.app_name);
        this.f2871p = (NotificationManager) getSystemService("notification");
        if (Build.VERSION.SDK_INT >= 26) {
            this.f2872q = new NotificationCompat.Builder(this, "apk_channel");
        } else {
            this.f2872q = new NotificationCompat.Builder(this);
        }
        this.f2872q.setContentTitle(string).setTicker(string).setContentText(getString(R.string.build_ongoing)).setSmallIcon(iIntValue).setLargeIcon(Bitmap.createScaledBitmap(bitmapDecodeResource, 128, 128, false)).setContentIntent(activity).setOngoing(true);

        // اصلاح startForeground برای اندروید ۱۴+
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            // برای Android 14+ (API 34) باید foregroundServiceType رو مشخص کنیم
            startForeground(8001, this.f2872q.build(), ServiceInfo.FOREGROUND_SERVICE_TYPE_DATA_SYNC);
        } else {
            startForeground(8001, this.f2872q.build());
        }
        this.f2873r = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public void m2612c() {
        if (this.f2867l != null && this.f2867l.isAlive()) {
            this.f2867l.mo3087b();
        }
        C1397j c1397j = this.f2868m;
        c1397j.f4060a = false;
        c1397j.f4062c = null;
        c1397j.f4063d = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public void m2614d() {
        ResXmlPatcher.m2428a(new File(this.f2856a, ApkUtils.ANDROID_MANIFEST_ZIP_ENTRY_NAME));
        if (this.f2857b != null) {
            this.f2867l = new C1405m(this, this.f2856a, this.f2857b, this.f2866k);
        } else {
            this.f2867l = new C1414o(this, this.f2856a, this.f2866k);
        }
        if (this.f2870o != null) {
            this.f2867l.mo3084a(this.f2870o);
        }
        this.f2867l.mo3086a(this.f2858c.booleanValue(), this.f2859d.booleanValue(), this.f2860e.booleanValue(), this.f2861f, this.f2862g, this.f2863h, this.f2864i, this.f2865j, this.f2876u);
        this.f2867l.mo3085a(this);
        this.f2867l.start();
    }

    @Override // com.gmail.heagoo.common.InterfaceC1561j
    /* JADX INFO: renamed from: a */
    public final void mo2595a() {
        InterfaceC1561j interfaceC1561j;
        synchronized (this.f2868m) {
            this.f2868m.f4060a = true;
            this.f2868m.f4061b = true;
            this.f2868m.f4062c = null;
        }
        m2606a(true, getString(R.string.build_finished), getString(R.string.succeed));
        if (this.f2869n == null || (interfaceC1561j = (InterfaceC1561j) this.f2869n.get()) == null) {
            return;
        }
        interfaceC1561j.mo2595a();
    }

    @Override // com.gmail.heagoo.common.InterfaceC1561j
    /* JADX INFO: renamed from: a */
    public final void mo2596a(C1562k c1562k) {
        InterfaceC1561j interfaceC1561j;
        synchronized (this.f2868m) {
            this.f2868m.f4063d = c1562k;
        }
        if (this.f2869n != null && (interfaceC1561j = (InterfaceC1561j) this.f2869n.get()) != null) {
            interfaceC1561j.mo2596a(c1562k);
        }
        m2606a(c1562k.f4644a == c1562k.f4645b, getString(R.string.build_ongoing), String.format(getResources().getString(R.string.step) + " %d/%d: %s", Integer.valueOf(c1562k.f4644a), Integer.valueOf(c1562k.f4645b), c1562k.f4646c));
    }

    @Override // com.gmail.heagoo.common.InterfaceC1561j
    /* JADX INFO: renamed from: a */
    public final void mo2597a(String str) {
        InterfaceC1561j interfaceC1561j;
        synchronized (this.f2868m) {
            this.f2868m.f4060a = true;
            this.f2868m.f4061b = false;
            this.f2868m.f4062c = str;
        }
        m2606a(true, getString(R.string.build_finished), getString(R.string.failed));
        if (this.f2869n == null || (interfaceC1561j = (InterfaceC1561j) this.f2869n.get()) == null) {
            return;
        }
        interfaceC1561j.mo2597a(str);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f2875t;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        // ایجاد کانال اعلان برای اندروید ۸+ (نیاز به NotificationChannel)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            android.app.NotificationChannel channel = new android.app.NotificationChannel(
                    "apk_channel",
                    "APK Editor Service",
                    android.app.NotificationManager.IMPORTANCE_LOW
            );
            android.app.NotificationManager manager = (android.app.NotificationManager) getSystemService(android.app.NotificationManager.class);
            if (manager != null) {
                manager.createNotificationChannel(channel);
            }
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        if (intent == null) {
            return super.onStartCommand(intent, i, i2);
        }
        this.f2856a = C1067a.m2457a(intent, "decodeRootPath");
        this.f2857b = C1067a.m2457a(intent, "srcApkPath");
        this.f2866k = C1067a.m2457a(intent, "targetApkPath");
        this.f2858c = Boolean.valueOf(C1067a.m2457a(intent, "stringModified"));
        this.f2859d = Boolean.valueOf(C1067a.m2457a(intent, "manifestModified"));
        this.f2860e = Boolean.valueOf(C1067a.m2457a(intent, "resFileModified"));
        this.f2861f = C1067a.m2518c(intent, "modifiedSmaliFolders");
        this.f2876u = C1067a.m2509b(intent, "signAPK");
        this.f2862g = C1067a.m2527d(intent, "addedFiles");
        this.f2863h = C1067a.m2527d(intent, "replacedFiles");
        this.f2864i = new HashSet();
        Iterator it = C1067a.m2518c(intent, "deletedFiles").iterator();
        while (it.hasNext()) {
            this.f2864i.add((String) it.next());
        }
        String strM2457a = C1067a.m2457a(intent, "fileEntry2ZipEntry");
        if (strM2457a != null) {
            this.f2865j = m2608b(strM2457a);
        }
        m2612c();
        m2609b();
        m2614d();
        return 1;
    }
}
