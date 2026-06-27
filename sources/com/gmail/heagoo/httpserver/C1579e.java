package com.gmail.heagoo.httpserver;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.widget.Toast;
import com.gmail.heagoo.apkeditor.pro.R;
import com.gmail.heagoo.p084a.p089c.C1067a;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p000a.p001a.p003b.p004a.p005a.C0027x;

/* JADX INFO: renamed from: com.gmail.heagoo.httpserver.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1579e {

    /* JADX INFO: renamed from: a */
    private static C1579e f4678a = null;

    /* JADX INFO: renamed from: b */
    private final List f4679b = new ArrayList();

    private C1579e() {
    }

    /* JADX INFO: renamed from: a */
    public static C1579e m3816a() {
        if (f4678a == null) {
            f4678a = new C1579e();
        }
        return f4678a;
    }

    /* JADX INFO: renamed from: b */
    public static void m3819b(Activity activity) {
        activity.stopService(new Intent(activity, (Class<?>) HttpService.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static void m3820b(Activity activity, String str) {
        new AlertDialog.Builder(activity).setTitle(R.string.web_server).setMessage(String.format(activity.getString(R.string.web_server_started), str)).setPositiveButton(android.R.string.ok, (DialogInterface.OnClickListener) null).show();
    }

    /* JADX INFO: renamed from: c */
    private BinderC1578d m3821c(Activity activity) {
        synchronized (this.f4679b) {
            for (ServiceConnectionC1580f serviceConnectionC1580f : this.f4679b) {
                if (serviceConnectionC1580f.f4680a.get() == activity) {
                    return serviceConnectionC1580f.f4681b;
                }
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m3822a(Activity activity) {
        ServiceConnectionC1580f serviceConnectionC1580f;
        synchronized (this.f4679b) {
            Iterator it = this.f4679b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    serviceConnectionC1580f = null;
                    break;
                } else {
                    serviceConnectionC1580f = (ServiceConnectionC1580f) it.next();
                    if (serviceConnectionC1580f.f4680a.get() == activity) {
                        break;
                    }
                }
            }
        }
        if (serviceConnectionC1580f != null) {
            activity.unbindService(serviceConnectionC1580f);
            synchronized (this.f4679b) {
                this.f4679b.remove(serviceConnectionC1580f);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m3823a(Activity activity, String str) {
        FileOutputStream fileOutputStream;
        InputStream inputStreamOpen;
        InputStream inputStream = null;
        BinderC1578d binderC1578dM3821c = m3821c(activity);
        if (binderC1578dM3821c != null) {
            binderC1578dM3821c.f4677a.f4669b = str;
            if (binderC1578dM3821c.f4677a.f4670c != null) {
                binderC1578dM3821c.f4677a.f4670c.m3814a(str);
            }
            m3820b(activity, binderC1578dM3821c.m3815a());
            return;
        }
        File file = new File(activity.getFilesDir(), "http_server");
        if (!file.exists()) {
            try {
                inputStreamOpen = activity.getAssets().open("http.zip");
                try {
                    File file2 = new File(activity.getFilesDir(), "http.zip");
                    fileOutputStream = new FileOutputStream(file2);
                    try {
                        C1067a.m2506b(inputStreamOpen, fileOutputStream);
                        file.mkdir();
                        C0027x.m29a(file2.getPath(), file.getPath());
                        file2.delete();
                        C1067a.m2474a((Closeable) inputStreamOpen);
                        C1067a.m2474a(fileOutputStream);
                    } catch (Exception e) {
                        e = e;
                        inputStream = inputStreamOpen;
                        try {
                            Toast.makeText(activity, "Init Error: " + e.getMessage(), 1).show();
                            C1067a.m2474a((Closeable) inputStream);
                            C1067a.m2474a(fileOutputStream);
                            return;
                        } catch (Throwable th) {
                            th = th;
                            inputStreamOpen = inputStream;
                            C1067a.m2474a((Closeable) inputStreamOpen);
                            C1067a.m2474a(fileOutputStream);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        C1067a.m2474a((Closeable) inputStreamOpen);
                        C1067a.m2474a(fileOutputStream);
                        throw th;
                    }
                } catch (Exception e2) {
                    e = e2;
                    fileOutputStream = null;
                    inputStream = inputStreamOpen;
                } catch (Throwable th3) {
                    th = th3;
                    fileOutputStream = null;
                }
            } catch (Exception e3) {
                e = e3;
                fileOutputStream = null;
            } catch (Throwable th4) {
                th = th4;
                fileOutputStream = null;
                inputStreamOpen = null;
            }
        }
        Intent intent = new Intent(activity, (Class<?>) HttpService.class);
        C1067a.m2442a(intent, "httpDirectory", file.getPath());
        C1067a.m2442a(intent, "projectDirectory", str);
        activity.startService(intent);
        activity.bindService(intent, new ServiceConnectionC1580f(this, activity), 1);
    }
}
