package com.gmail.heagoo.apkeditor;

import android.content.Context;
import android.os.Environment;
import android.util.Log;
import com.gmail.heagoo.apkeditor.p090a.InterfaceC1108d;
import com.gmail.heagoo.apkeditor.p097f.InterfaceC1289c;
import com.gmail.heagoo.apkeditor.pro.R;
import com.gmail.heagoo.common.C1554c;
import com.gmail.heagoo.common.C1559h;
import com.gmail.heagoo.common.C1562k;
import com.gmail.heagoo.common.InterfaceC1561j;
import com.gmail.heagoo.p084a.p089c.C1067a;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.o */
/* JADX INFO: loaded from: classes.dex */
public final class C1414o extends AbstractC1181bz implements InterfaceC1289c {

    /* JADX INFO: renamed from: a */
    private Context f4101a;

    /* JADX INFO: renamed from: b */
    private String f4102b;

    /* JADX INFO: renamed from: c */
    private String f4103c;

    /* JADX INFO: renamed from: d */
    private String f4104d;

    /* JADX INFO: renamed from: e */
    private String f4105e;

    /* JADX INFO: renamed from: f */
    private String f4106f;

    /* JADX INFO: renamed from: g */
    private String f4107g;

    /* JADX INFO: renamed from: h */
    private boolean f4108h;

    /* JADX INFO: renamed from: i */
    private String f4109i;

    /* JADX INFO: renamed from: l */
    private InterfaceC1561j f4112l;

    /* JADX INFO: renamed from: m */
    private C1562k f4113m;
    private Set mdUncString;

    /* JADX INFO: renamed from: p */
    private boolean f4116p;

    /* JADX INFO: renamed from: q */
    private InterfaceC1108d f4117q;

    /* JADX INFO: renamed from: j */
    private Map f4110j = new HashMap();

    /* JADX INFO: renamed from: k */
    private List f4111k = new ArrayList();

    /* JADX INFO: renamed from: n */
    private long f4114n = 0;

    /* JADX INFO: renamed from: o */
    private boolean f4115o = false;

    public C1414o(Context context, String str, String str2) {
        this.f4101a = context;
        this.f4102b = context.getFilesDir().getAbsolutePath() + "/bin";
        this.f4103c = this.f4102b + "/aapt";
        this.f4104d = this.f4102b + "/android.jar";
        this.f4105e = str;
        this.f4106f = str2;
        this.f4107g = str + "/build/resource.apk";
        new StringBuilder("aaptPath: ").append(this.f4103c);
        new StringBuilder("androidJarPath: ").append(this.f4104d);
        new StringBuilder("decodedFilePath: ").append(this.f4105e);
        this.f4113m = new C1562k();
    }

    /* JADX INFO: renamed from: a */
    private static long m3470a(File file) {
        if (file.exists()) {
            return file.lastModified();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: a */
    private static String m3471a(String str) {
        return "smali".equals(str) ? "classes.dex" : str.startsWith("smali_") ? str.substring(6) + ".dex" : str + ".dex";
    }

    /* JADX INFO: renamed from: a */
    private void m3472a() {
        for (File file : new File(this.f4105e).listFiles()) {
            if (file.isDirectory()) {
                String name = file.getName();
                if (name.equals("smali") || name.startsWith("smali_")) {
                    String strM3471a = m3471a(name);
                    long jM3470a = m3470a(new File(this.f4105e + "/" + strM3471a));
                    long jM3470a2 = m3470a(new File(this.f4105e + "/build/" + strM3471a));
                    if (jM3470a2 <= jM3470a) {
                        jM3470a2 = jM3470a;
                    }
                    if (C1559h.m3775b(file) > jM3470a2) {
                        this.f4111k.add(name);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m3473a(Map map) {
        map.putAll(this.f4110j);
        for (File file : new File(this.f4105e).listFiles()) {
            String name = file.getName();
            if (file.isFile() && name.endsWith(".dex") && !this.f4110j.containsKey(name)) {
                File file2 = new File(this.f4105e + "/build/" + name);
                if (file2.isFile() && file2.exists()) {
                    map.put(name, file2.getPath());
                } else {
                    map.put(name, file.getPath());
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m3474a(Map map, File file, String str) {
        for (File file2 : file.listFiles()) {
            if (file2.isFile()) {
                map.put(str + file2.getName(), file2.getPath());
            } else if (file2.isDirectory()) {
                m3474a(map, file2, str + file2.getName() + "/");
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private void m3475b(String str) {
        this.f4113m.f4644a++;
        this.f4113m.f4646c = str;
        this.f4112l.mo2596a(this.f4113m);
    }

    /* JADX INFO: renamed from: c */
    private void m3476c() {
        HashMap map = new HashMap();
        InterfaceC1108d interfaceC1108d = this.f4117q;
        if (interfaceC1108d != null) {
            try {
                interfaceC1108d.mo2954a(this.f4101a, this.f4107g, map, new C1415p(this));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        HashMap map2 = new HashMap();
        File file = new File(this.f4105e + "/assets");
        if (file.exists()) {
            m3474a(map2, file, "assets/");
        }
        File file2 = new File(this.f4105e + "/lib");
        if (file2.exists()) {
            m3474a(map2, file2, "lib/");
        }
        File file3 = new File(this.f4105e + "/libs");
        if (file3.exists()) {
            m3474a(map2, file3, "libs/");
        }
        File file4 = new File(this.f4105e + "/kotlin");
        if (file4.exists()) {
            m3474a(map2, file4, "kotlin/");
        }
        File file5 = new File(this.f4105e + "/unknown");
        if (file5.exists()) {
            m3474a(map2, file5, "");
        }
        m3473a(map2);
        mdNoCompress();
        HashMap map3 = new HashMap();
        Set set = this.mdUncString;
        if (set == null || set.isEmpty()) {
            map3 = map2;
        } else {
            for (Map.Entry entry : map2.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                if (this.mdUncString.contains(str)) {
                    map3.put(str + ":0", str2);
                } else {
                    map3.put(str, str2);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        int length = 0;
        for (Map.Entry entry2 : map3.entrySet()) {
            String str3 = (String) entry2.getKey();
            String str4 = (String) entry2.getValue();
            sb.append(str3);
            sb.append('\n');
            sb.append(str4);
            sb.append('\n');
            length += str4.getBytes().length + str3.getBytes().length + 2;
        }
        StringBuilder sb2 = new StringBuilder();
        int length2 = 0;
        for (Map.Entry entry3 : map.entrySet()) {
            String str5 = (String) entry3.getKey();
            String str6 = (String) entry3.getValue();
            sb2.append(str5);
            sb2.append('\n');
            sb2.append(str6);
            sb2.append('\n');
            length2 += str6.getBytes().length + str5.getBytes().length + 2;
        }
        MainActivity.m2789md(this.f4106f, this.f4107g, sb.toString(), length, "", 0, sb2.toString(), length2);
    }

    /* JADX INFO: renamed from: d */
    private boolean m3477d() {
        String str = this.f4106f + ".signed";
        try {
            HashMap map = new HashMap();
            C1067a.m2467a(this.f4101a, this.f4106f, str, map, map, new HashSet());
            File file = new File(this.f4106f);
            file.delete();
            new File(str).renameTo(file);
            return true;
        } catch (Exception e) {
            this.f4109i = this.f4101a.getResources().getString(R.string.sign_error) + e.getMessage();
            return false;
        }
    }

    /* JADX INFO: renamed from: e */
    private boolean m3478e() {
        try {
            return C1405m.m3460a(this.f4101a, this.f4103c, this.f4102b);
        } catch (Exception e) {
            this.f4109i = e.getMessage();
            return false;
        }
    }

    private void mdNoCompress() {
        this.mdUncString = null;
        try {
            String strM2525d = C1067a.m2525d((Context) null, "tmp");
            if (new File(strM2525d, "mdUncString").exists()) {
                this.mdUncString = (Set) C1067a.m2542j(strM2525d + "mdUncString");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.gmail.heagoo.apkeditor.p097f.InterfaceC1289c
    /* JADX INFO: renamed from: a */
    public final void mo3270a(int i, int i2) {
        if (System.currentTimeMillis() > 500) {
            this.f4113m.f4646c = String.format(this.f4101a.getString(R.string.assemble_dex_detail), Integer.valueOf(i), Integer.valueOf(i2));
            this.f4112l.mo2596a(this.f4113m);
        }
    }

    @Override // com.gmail.heagoo.apkeditor.AbstractC1181bz
    /* JADX INFO: renamed from: a */
    public final void mo3084a(InterfaceC1108d interfaceC1108d) {
        this.f4117q = interfaceC1108d;
    }

    @Override // com.gmail.heagoo.apkeditor.AbstractC1181bz
    /* JADX INFO: renamed from: a */
    public final void mo3085a(InterfaceC1561j interfaceC1561j) {
        this.f4112l = interfaceC1561j;
    }

    @Override // com.gmail.heagoo.apkeditor.AbstractC1181bz
    /* JADX INFO: renamed from: a */
    public final void mo3086a(boolean z, boolean z2, boolean z3, List list, Map map, Map map2, Set set, Map map3, boolean z4) {
        this.f4116p = z4;
    }

    @Override // com.gmail.heagoo.apkeditor.AbstractC1181bz
    /* JADX INFO: renamed from: b */
    public final void mo3087b() {
        this.f4115o = true;
        interrupt();
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x031f  */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z;
        boolean z2 = false;
        System.currentTimeMillis();
        File file = new File(this.f4105e + "/build");
        if (!file.exists()) {
            file.mkdir();
        }
        File file2 = new File(this.f4107g);
        boolean z3 = (file2.isFile() && file2.exists() && file2.lastModified() > C1559h.m3768a(new File[]{new File(new StringBuilder().append(this.f4105e).append("/res").toString()), new File(new StringBuilder().append(this.f4105e).append("/AndroidManifest.xml").toString())})) ? false : true;
        m3472a();
        this.f4113m.f4645b = 0;
        if (z3) {
            this.f4113m.f4645b++;
        }
        this.f4113m.f4645b++;
        if (this.f4111k != null && !this.f4111k.isEmpty()) {
            this.f4113m.f4645b += this.f4111k.size();
        }
        if (this.f4116p) {
            this.f4113m.f4645b++;
        }
        this.f4113m.f4645b++;
        if (!z3) {
            this.f4110j.clear();
            if (this.f4111k != null && !this.f4111k.isEmpty()) {
                Iterator it = this.f4111k.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    String str = (String) it.next();
                    String str2 = this.f4105e + "/" + str;
                    String strM3471a = m3471a(str);
                    m3475b(this.f4101a.getString(R.string.assemble_dex_file) + ": " + strM3471a);
                    try {
                        File file3 = new File(new File(this.f4105e), "build");
                        if (!file3.exists()) {
                            file3.mkdir();
                        }
                        String path = new File(file3, strM3471a).getPath();
                        try {
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            Class.forName("com.gmail.heagoo.apkeditor.pro.DexEncoder").getMethod("smali2Dex", String.class, String.class, InterfaceC1289c.class).invoke(null, str2, path, this);
                            Log.i("DEBUG", "Encode time=" + (System.currentTimeMillis() - jCurrentTimeMillis));
                            this.f4110j.put(strM3471a, path);
                            if (this.f4115o) {
                                this.f4109i = "User request to stop";
                                z2 = true;
                                break;
                            }
                        } catch (InvocationTargetException e) {
                            throw e.getTargetException();
                        }
                    } catch (Throwable th) {
                        th.printStackTrace();
                        this.f4109i = th.getMessage();
                        z2 = true;
                    }
                }
                if (!z2) {
                }
            } else if (this.f4115o) {
                this.f4109i = "User request to stop";
            } else {
                m3475b(this.f4101a.getString(R.string.merge));
                try {
                    System.currentTimeMillis();
                    m3476c();
                    if (this.f4116p) {
                        if (this.f4115o) {
                            this.f4109i = "User request to stop";
                        } else {
                            m3475b(this.f4101a.getString(R.string.sign));
                            if (m3477d()) {
                            }
                        }
                    } else if (this.f4115o) {
                        this.f4109i = "User request to stop";
                    } else {
                        m3475b(this.f4101a.getString(R.string.cleanup));
                        try {
                            new C1554c().mo3757a("rm -rf " + (Environment.getExternalStorageDirectory().getPath() + "/ApkEditor/tmp"), (String[]) null, (Integer) 10000);
                        } catch (Exception e2) {
                        }
                        this.f4108h = true;
                    }
                } catch (Exception e3) {
                    e3.printStackTrace();
                    this.f4109i = this.f4101a.getString(R.string.merge) + ": " + e3.getMessage();
                }
            }
        } else if (this.f4115o) {
            this.f4109i = "User request to stop";
        } else {
            m3475b(this.f4101a.getString(R.string.compose));
            if (m3478e()) {
                if (this.f4115o) {
                    this.f4109i = "User request to stop";
                } else {
                    boolean zM3459a = C1405m.m3459a(this.f4101a, this.f4103c);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.f4103c);
                    arrayList.add("package");
                    arrayList.add("-f");
                    arrayList.add("-I");
                    arrayList.add(this.f4104d);
                    arrayList.add("-S");
                    arrayList.add(this.f4105e + "/res");
                    arrayList.add("-M");
                    arrayList.add(this.f4105e + "/AndroidManifest.xml");
                    arrayList.add("-F");
                    arrayList.add(this.f4107g);
                    arrayList.addAll(C1405m.aaptNoCompress());
                    if (zM3459a) {
                        arrayList.add("--no-version-vectors");
                    }
                    System.currentTimeMillis();
                    C1554c c1554c = new C1554c();
                    boolean zM3756a = c1554c.m3756a((Object) arrayList.toArray(new String[arrayList.size()]), (String[]) null, (Integer) 300000, true);
                    new StringBuilder("stdout: ").append(c1554c.mo3755a()).append(", ret=").append(zM3756a);
                    if (zM3756a) {
                        z = true;
                    } else {
                        new StringBuilder("stderr: ").append(c1554c.mo3759b());
                        this.f4109i = c1554c.mo3759b();
                        z = false;
                    }
                    if (z) {
                    }
                }
            }
        }
        if (this.f4115o) {
            return;
        }
        if (this.f4108h) {
            this.f4112l.mo2595a();
        } else {
            this.f4112l.mo2597a(this.f4109i);
        }
    }
}
