package p019b.p022fn.p040c.p041a.p044e;

import android.app.PendingIntent;
import android.content.Intent;
import com.masrull.listview.JazzyHelper;
import com.tilks.arsc.main.C1706e;
import com.tilks.arsc.main.MergeService;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.zip.ZipOutputStream;
import p019b.p022fn.p023a.p025b.p026a.p027e.p028a.InterfaceC0434a;
import p019b.p022fn.p023a.p025b.p026a.p027e.p028a.p029b.C0436b;
import p019b.p022fn.p040c.p041a.C0456b;
import p019b.p022fn.p040c.p041a.p045f.C0476b;

/* JADX INFO: renamed from: b.fn.c.a.e.b */
/* JADX INFO: loaded from: classes.dex */
public class C0474b {

    /* JADX INFO: renamed from: a */
    private File f658a;

    /* JADX INFO: renamed from: b */
    private String f659b;

    /* JADX INFO: renamed from: c */
    private String f660c;

    /* JADX INFO: renamed from: d */
    private boolean f661d;

    /* JADX INFO: renamed from: e */
    private byte[] f662e;

    /* JADX INFO: renamed from: f */
    private PendingIntent f663f;

    /* JADX INFO: renamed from: g */
    private MergeService f664g;

    /* JADX INFO: renamed from: h */
    private String f665h;

    /* JADX INFO: renamed from: i */
    private String f666i;

    public C0474b(File file, String str, String str2, boolean z, String str3, String str4, byte[] bArr, PendingIntent pendingIntent, MergeService mergeService) {
        this.f658a = file;
        this.f659b = str;
        this.f660c = str2;
        this.f661d = z;
        this.f662e = bArr;
        this.f663f = pendingIntent;
        this.f664g = mergeService;
        this.f665h = str3;
        this.f666i = str4;
    }

    /* JADX INFO: renamed from: a */
    public void m552a() throws PendingIntent.CanceledException, IOException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strM558a = C0476b.m558a(this.f658a.length());
        String absolutePath = this.f658a.getAbsolutePath();
        this.f663f.send(100);
        this.f663f.send(this.f664g, 200, new Intent().putExtra("result", String.format("%nStarting copying language (%c%c)%n%n", Byte.valueOf(this.f662e[0]), Byte.valueOf(this.f662e[1]))));
        this.f663f.send(this.f664g, 200, new Intent().putExtra("result", String.format("File: %s(size: %s)%nfolder: %s%n", absolutePath, strM558a, this.f660c)));
        if (!(absolutePath.endsWith(".apks") || absolutePath.endsWith(".zip") || absolutePath.endsWith(".xapk"))) {
            this.f663f.send(this.f664g, 200, new Intent().putExtra("result", String.format("Error! Only works with .apks, .zip or .xapk file%n", new Object[0])));
            this.f663f.send(JazzyHelper.DURATION);
            return;
        }
        ArrayList arrayList = new ArrayList();
        C1706e c1706e = new C1706e(this.f660c, arrayList, this.f663f, this.f664g, this.f665h, this.f666i);
        String strM4127a = c1706e.m4127a(this.f659b);
        if (strM4127a == null) {
            this.f663f.send(this.f664g, 200, new Intent().putExtra("result", String.format("Error baseName%n", new Object[0])));
            this.f663f.send(JazzyHelper.DURATION);
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ZipOutputStream zipOutputStream = new ZipOutputStream(byteArrayOutputStream);
        C0436b c0436b = new C0436b(this.f658a, this.f659b);
        C0456b c0456bM4125a = null;
        C0456b c0456bM4125a2 = null;
        while (true) {
            InterfaceC0434a.a aVarMo422b = c0436b.mo422b();
            if (aVarMo422b == null) {
                break;
            }
            if (aVarMo422b.m424b().equals(strM4127a)) {
                c0456bM4125a = c1706e.m4125a(c0436b.mo421a(), zipOutputStream, true);
            } else if (c0456bM4125a2 == null) {
                c0456bM4125a2 = c1706e.m4125a(c0436b.mo421a(), zipOutputStream, false);
            }
        }
        c1706e.m4132a(this.f662e);
        c1706e.m4131a(zipOutputStream);
        if (c0456bM4125a != null) {
            c0456bM4125a.m509a();
        }
        if (c0456bM4125a2 != null) {
            c0456bM4125a2.m509a();
        }
        zipOutputStream.flush();
        zipOutputStream.close();
        StringBuilder sb = new StringBuilder();
        String str = this.f659b;
        sb.append(str.substring(0, str.lastIndexOf(46)));
        sb.append(this.f661d ? "_signed.apk" : "_unsigned.apk");
        String string = sb.toString();
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(string));
        if (this.f661d) {
            this.f663f.send(this.f664g, 200, new Intent().putExtra("result", String.format("[*] Signing the APK:%n    ->  %s%n", string)));
            c1706e.m4133a(byteArrayOutputStream.toByteArray(), bufferedOutputStream);
        } else {
            this.f663f.send(this.f664g, 200, new Intent().putExtra("result", String.format("[*] Saving the APK:%n    ->  %s%n", string)));
            bufferedOutputStream.write(byteArrayOutputStream.toByteArray());
        }
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
        c1706e.m4128a();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.format("%n################ Output ###################%n%n", new Object[0]));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sb2.append((String) it.next());
        }
        this.f663f.send(this.f664g, 200, new Intent().putExtra("result", sb2.toString()));
        this.f663f.send(this.f664g, 200, new Intent().putExtra("result", String.format("Completed successfully in %s%n", C0476b.m559b(System.currentTimeMillis() - jCurrentTimeMillis))));
        this.f663f.send(JazzyHelper.DURATION);
    }
}
