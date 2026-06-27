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
import java.util.HashMap;
import java.util.Iterator;
import java.util.zip.ZipOutputStream;
import p019b.p022fn.p023a.p025b.p026a.C0431b;
import p019b.p022fn.p023a.p025b.p026a.C0432c;
import p019b.p022fn.p023a.p025b.p026a.C0433d;
import p019b.p022fn.p023a.p025b.p026a.EnumC0430a;
import p019b.p022fn.p023a.p025b.p026a.p027e.p028a.InterfaceC0434a;
import p019b.p022fn.p023a.p025b.p026a.p027e.p028a.p029b.C0435a;
import p019b.p022fn.p023a.p025b.p026a.p027e.p028a.p029b.C0436b;
import p019b.p022fn.p040c.p041a.C0456b;
import p019b.p022fn.p040c.p041a.p045f.C0476b;

/* JADX INFO: renamed from: b.fn.c.a.e.a */
/* JADX INFO: loaded from: classes.dex */
public class C0473a {

    /* JADX INFO: renamed from: a */
    private File f647a;

    /* JADX INFO: renamed from: b */
    private String f648b;

    /* JADX INFO: renamed from: c */
    private boolean f649c;

    /* JADX INFO: renamed from: d */
    private boolean f650d;

    /* JADX INFO: renamed from: e */
    private boolean f651e;

    /* JADX INFO: renamed from: f */
    private boolean f652f;

    /* JADX INFO: renamed from: g */
    private String f653g;

    /* JADX INFO: renamed from: h */
    private PendingIntent f654h;

    /* JADX INFO: renamed from: i */
    private MergeService f655i;

    /* JADX INFO: renamed from: j */
    private String f656j;

    /* JADX INFO: renamed from: k */
    private String f657k;

    public C0473a(File file, String str, String str2, boolean z, String str3, String str4, boolean z2, boolean z3, boolean z4, PendingIntent pendingIntent, MergeService mergeService) {
        this.f647a = file;
        this.f648b = str;
        this.f653g = str2;
        this.f649c = z;
        this.f650d = z2;
        this.f651e = z3;
        this.f652f = z4;
        this.f654h = pendingIntent;
        this.f655i = mergeService;
        this.f656j = str3;
        this.f657k = str4;
    }

    /* JADX INFO: renamed from: a */
    public void m551a() throws PendingIntent.CanceledException, IOException {
        boolean zEquals;
        boolean z;
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strM558a = C0476b.m558a(this.f647a.length());
        String absolutePath = this.f647a.getAbsolutePath();
        this.f654h.send(100);
        this.f654h.send(this.f655i, 200, new Intent().putExtra("result", String.format("%nStarting merge splitted resources%n%n", new Object[0])));
        this.f654h.send(this.f655i, 200, new Intent().putExtra("result", String.format("File: %s(size: %s)%nfolder: %s%n", absolutePath, strM558a, this.f653g)));
        if (!(absolutePath.endsWith(".apks") || absolutePath.endsWith(".zip") || absolutePath.endsWith(".xapk"))) {
            this.f654h.send(this.f655i, 200, new Intent().putExtra("result", String.format("Error! Only works with .apks, .zip or .xapk file%n", new Object[0])));
            this.f654h.send(JazzyHelper.DURATION);
            return;
        }
        C0431b c0431bM428a = new C0435a(this.f654h, this.f655i).m428a(new C0436b(this.f647a, this.f648b), this.f651e);
        if (c0431bM428a == null) {
            this.f654h.send(this.f655i, 200, new Intent().putExtra("result", String.format("%nError! Packages parsing error.%n", new Object[0])));
            this.f654h.send(JazzyHelper.DURATION);
            return;
        }
        String strM419b = c0431bM428a.m412a(EnumC0430a.BASE_APK).m417b().get(0).m419b();
        this.f654h.send(this.f655i, 200, new Intent().putExtra("result", String.format("%n[BASE] %s%n", strM419b)));
        ArrayList arrayList = new ArrayList();
        ArrayList<String> arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        HashMap map = new HashMap();
        C0432c c0432cM412a = c0431bM428a.m412a(EnumC0430a.FEATURE);
        if (c0432cM412a != null) {
            for (int i = 0; i < c0432cM412a.m417b().size(); i++) {
                arrayList2.add(c0432cM412a.m417b().get(i).m420c());
                arrayList.add(c0432cM412a.m417b().get(i).m419b());
            }
            Iterator<C0432c> it = c0431bM428a.m414a().iterator();
            while (it.hasNext()) {
                for (C0433d c0433d : it.next().m417b()) {
                    for (String str : arrayList2) {
                        if (c0433d.m420c().endsWith(str)) {
                            map.put(c0433d.m419b(), Integer.valueOf(arrayList2.indexOf(str)));
                            arrayList3.add(c0433d.m419b());
                        }
                    }
                }
            }
        }
        ArrayList arrayList4 = new ArrayList();
        C1706e c1706e = new C1706e(this.f653g, arrayList4, this.f654h, this.f655i, this.f656j, this.f657k);
        C0456b c0456bM4126a = null;
        C0436b c0436b = new C0436b(this.f647a, this.f648b);
        while (true) {
            InterfaceC0434a.a aVarMo422b = c0436b.mo422b();
            if (aVarMo422b == null) {
                break;
            } else if (aVarMo422b.m424b().equals(strM419b)) {
                c0456bM4126a = c1706e.m4126a(c0436b.mo421a(), true);
            }
        }
        if (this.f650d) {
            C0436b c0436b2 = new C0436b(this.f647a, this.f648b);
            while (true) {
                InterfaceC0434a.a aVarMo422b2 = c0436b2.mo422b();
                if (aVarMo422b2 == null) {
                    break;
                }
                if (arrayList.contains(aVarMo422b2.m424b())) {
                    C0456b c0456bM4126a2 = c1706e.m4126a(c0436b2.mo421a(), false);
                    if (c0456bM4126a != null && c0456bM4126a2 != null) {
                        c1706e.m4129a(((Integer) map.get(aVarMo422b2.m424b())).intValue());
                        c0456bM4126a2.m509a();
                    }
                }
            }
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ZipOutputStream zipOutputStream = new ZipOutputStream(byteArrayOutputStream);
        ArrayList<String> arrayList5 = new ArrayList<>();
        C0436b c0436b3 = new C0436b(this.f647a, this.f648b);
        while (true) {
            InterfaceC0434a.a aVarMo422b3 = c0436b3.mo422b();
            if (aVarMo422b3 == null) {
                break;
            }
            if (aVarMo422b3.m424b().toLowerCase().endsWith(".apk")) {
                if (!arrayList3.contains(aVarMo422b3.m424b())) {
                    zEquals = aVarMo422b3.m424b().equals(strM419b);
                    z = false;
                } else if (this.f650d) {
                    zEquals = arrayList.contains(aVarMo422b3.m424b());
                    z = true;
                }
                String str2 = strM419b;
                ArrayList arrayList6 = arrayList;
                this.f654h.send(this.f655i, 200, new Intent().putExtra("result", String.format("[+] Copied files from %s%n", aVarMo422b3.m424b())));
                c1706e.m4130a(c0436b3.mo421a(), zipOutputStream, arrayList5, zEquals, z, map.get(aVarMo422b3.m424b()) != null ? ((Integer) map.get(aVarMo422b3.m424b())).intValue() : 255, this.f652f);
                strM419b = str2;
                arrayList = arrayList6;
            }
        }
        c1706e.m4131a(zipOutputStream);
        if (c0456bM4126a != null) {
            c0456bM4126a.m509a();
        }
        zipOutputStream.flush();
        zipOutputStream.close();
        StringBuilder sb = new StringBuilder();
        String str3 = this.f648b;
        sb.append(str3.substring(0, str3.lastIndexOf(46)));
        sb.append(this.f649c ? "_apks_signed.apk" : "_apks_unsigned.apk");
        String string = sb.toString();
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(string));
        if (this.f649c) {
            this.f654h.send(this.f655i, 200, new Intent().putExtra("result", String.format("[*] Signing the APK:%n    ->  %s%n", string)));
            c1706e.m4133a(byteArrayOutputStream.toByteArray(), bufferedOutputStream);
        } else {
            this.f654h.send(this.f655i, 200, new Intent().putExtra("result", String.format("[*] Saving the APK:%n    ->  %s%n", string)));
            bufferedOutputStream.write(byteArrayOutputStream.toByteArray());
        }
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
        c1706e.m4128a();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.format("%n################ Output ###################%n%n", new Object[0]));
        Iterator it2 = arrayList4.iterator();
        while (it2.hasNext()) {
            sb2.append((String) it2.next());
        }
        this.f654h.send(this.f655i, 200, new Intent().putExtra("result", sb2.toString()));
        this.f654h.send(this.f655i, 200, new Intent().putExtra("result", String.format("%nCompleted successfully in %s%n", C0476b.m559b(System.currentTimeMillis() - jCurrentTimeMillis))));
        this.f654h.send(JazzyHelper.DURATION);
    }
}
