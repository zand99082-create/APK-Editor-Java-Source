package com.gmail.heagoo.apkeditor;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Environment;
import android.preference.PreferenceManager;
import android.util.Log;
import com.android.apksig.apk.ApkUtils;
import com.gmail.heagoo.apkeditor.p090a.InterfaceC1108d;
import com.gmail.heagoo.apkeditor.p097f.InterfaceC1289c;
import com.gmail.heagoo.apkeditor.pro.R;
import com.gmail.heagoo.common.C1554c;
import com.gmail.heagoo.common.C1562k;
import com.gmail.heagoo.common.InterfaceC1561j;
import com.gmail.heagoo.p084a.p089c.C1067a;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p000a.p001a.p003b.p004a.p005a.C0027x;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.m */
/* JADX INFO: loaded from: classes.dex */
public final class C1405m extends AbstractC1181bz implements InterfaceC1289c {

    /* JADX INFO: renamed from: a */
    private Context f4073a;

    /* JADX INFO: renamed from: b */
    private String f4074b;

    /* JADX INFO: renamed from: c */
    private String f4075c;

    /* JADX INFO: renamed from: d */
    private String f4076d;

    /* JADX INFO: renamed from: e */
    private String f4077e;

    /* JADX INFO: renamed from: f */
    private String f4078f;

    /* JADX INFO: renamed from: g */
    private String f4079g;

    /* JADX INFO: renamed from: h */
    private String f4080h;

    /* JADX INFO: renamed from: i */
    private boolean f4081i;

    /* JADX INFO: renamed from: j */
    private String f4082j;

    /* JADX INFO: renamed from: l */
    private boolean f4084l;

    /* JADX INFO: renamed from: m */
    private boolean f4085m;

    /* JADX INFO: renamed from: n */
    private boolean f4086n;

    /* JADX INFO: renamed from: o */
    private List f4087o;

    /* JADX INFO: renamed from: p */
    private Map f4088p;

    /* JADX INFO: renamed from: q */
    private Map f4089q;

    /* JADX INFO: renamed from: r */
    private Set f4090r;

    /* JADX INFO: renamed from: s */
    private Map f4091s;

    /* JADX INFO: renamed from: t */
    private InterfaceC1561j f4092t;

    /* JADX INFO: renamed from: u */
    private C1562k f4093u;

    /* JADX INFO: renamed from: x */
    private boolean f4096x;

    /* JADX INFO: renamed from: y */
    private InterfaceC1108d f4097y;

    /* JADX INFO: renamed from: k */
    private Map f4083k = new HashMap();

    /* JADX INFO: renamed from: v */
    private long f4094v = 0;

    /* JADX INFO: renamed from: w */
    private boolean f4095w = false;

    public C1405m(Context context, String str, String str2, String str3) {
        this.f4073a = context;
        this.f4074b = context.getFilesDir().getAbsolutePath() + "/bin";
        this.f4075c = this.f4074b + "/aapt";
        this.f4076d = this.f4074b + "/android.jar";
        this.f4077e = str;
        this.f4078f = str2;
        this.f4079g = str3;
        this.f4080h = str2;
        new StringBuilder("aaptPath: ").append(this.f4075c);
        new StringBuilder("androidJarPath: ").append(this.f4076d);
        new StringBuilder("decodedFilePath: ").append(this.f4077e);
        this.f4093u = new C1562k();
    }

    /* JADX INFO: renamed from: a */
    private void m3456a(String str) {
        this.f4093u.f4644a++;
        this.f4093u.f4646c = str;
        this.f4092t.mo2596a(this.f4093u);
    }

    /* JADX INFO: renamed from: a */
    private static void m3457a(Map map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            String str = (String) ((Map.Entry) it.next()).getKey();
            if (str.equals(ApkUtils.ANDROID_MANIFEST_ZIP_ENTRY_NAME)) {
                it.remove();
            } else if (str.startsWith("res/")) {
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m3458a(Context context) {
        try {
            String packageName = context.getPackageName();
            String strM3461b = m3461b(context, packageName);
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append('i');
            stringBuffer.append('n');
            stringBuffer.append('g');
            if (strM3461b.endsWith(stringBuffer.toString())) {
                return packageName.endsWith("pro");
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    protected static boolean m3459a(Context context, String str) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        int i = defaultSharedPreferences.getInt("aapt-no-version-vectors", -1);
        if (i == 1) {
            return true;
        }
        if (i == 0) {
            return false;
        }
        C1554c c1554c = new C1554c();
        c1554c.m3756a((Object) new String[]{str}, (String[]) null, (Integer) 5000, false);
        String strMo3755a = c1554c.mo3755a();
        String strMo3759b = c1554c.mo3759b();
        boolean z = (strMo3755a != null && strMo3755a.contains("--no-version-vectors")) || (strMo3759b != null && strMo3759b.contains("--no-version-vectors"));
        SharedPreferences.Editor editorEdit = defaultSharedPreferences.edit();
        editorEdit.putInt("aapt-no-version-vectors", z ? 1 : 0);
        editorEdit.apply();
        return z;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m3460a(Context context, String str, String str2) throws Exception {
        String str3 = null;
        try {
            str3 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("info", 0);
        boolean z = sharedPreferences.getBoolean("initialized", false);
        String string = sharedPreferences.getString("version", "");
        if (!z || !string.equals(str3)) {
            m3462b(context, str, str2);
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putBoolean("initialized", true);
            editorEdit.putString("version", str3);
            editorEdit.commit();
        }
        return true;
    }

    static ArrayList aaptNoCompress() {
        ArrayList arrayList = new ArrayList();
        Set<String> set = null;
        try {
            String strM2525d = C1067a.m2525d((Context) null, "tmp");
            if (new File(strM2525d, "aaptUncString").exists()) {
                set = (Set) C1067a.m2542j(strM2525d + "aaptUncString");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (set != null && !set.isEmpty()) {
            for (String str : set) {
                arrayList.add("-0");
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    private static String m3461b(Context context, String str) {
        String str2;
        try {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append('g');
            stringBuffer.append('e');
            stringBuffer.append('t');
            stringBuffer.append("Package");
            stringBuffer.append('M');
            stringBuffer.append('a');
            stringBuffer.append('n');
            stringBuffer.append('a');
            stringBuffer.append('g');
            stringBuffer.append('e');
            stringBuffer.append('r');
            PackageManager packageManager = (PackageManager) Context.class.getMethod(stringBuffer.toString(), new Class[0]).invoke(context, new Object[0]);
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append('g');
            stringBuffer2.append('e');
            stringBuffer2.append('t');
            stringBuffer2.append("In");
            stringBuffer2.append("stall");
            stringBuffer2.append("er");
            stringBuffer2.append("Package");
            stringBuffer2.append('N');
            stringBuffer2.append('a');
            stringBuffer2.append('m');
            stringBuffer2.append('e');
            str2 = (String) PackageManager.class.getMethod(stringBuffer2.toString(), String.class).invoke(packageManager, str);
        } catch (Exception e) {
            e.printStackTrace();
            str2 = null;
        }
        return str2 == null ? "" : str2;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 14 */
    /* JADX INFO: renamed from: b */
    private static boolean m3462b(Context context, String str, String str2) throws Exception {
        try {
            File file = new File(str);
            File parentFile = file.getParentFile();
            if (!parentFile.exists()) {
                parentFile.mkdirs();
            }
            InputStream inputStreamOpen = context.getAssets().open("aapt");
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            C1067a.m2506b(inputStreamOpen, fileOutputStream);
            inputStreamOpen.close();
            fileOutputStream.close();
            file.setExecutable(true);
            InputStream inputStreamOpen2 = context.getAssets().open("android.zip");
            String str3 = str2 + "/tmp.zip";
            FileOutputStream fileOutputStream2 = new FileOutputStream(str2 + "/tmp.zip");
            C1067a.m2506b(inputStreamOpen2, fileOutputStream2);
            inputStreamOpen2.close();
            fileOutputStream2.close();
            C0027x.m33b(str3, str2);
            new File(str3).delete();
            C0027x.m33b(str2 + "/android.jar", str2);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Can not copy file: " + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: d */
    private void m3463d() {
        if (this.f4091s == null || this.f4091s.isEmpty()) {
            return;
        }
        if (!this.f4088p.isEmpty()) {
            HashMap map = new HashMap();
            for (Map.Entry entry : this.f4088p.entrySet()) {
                String str = (String) this.f4091s.get(entry.getKey());
                if (str != null) {
                    map.put(str, entry.getValue());
                } else {
                    map.put(entry.getKey(), entry.getValue());
                }
            }
            this.f4088p = map;
        }
        if (!this.f4089q.isEmpty()) {
            HashMap map2 = new HashMap();
            for (Map.Entry entry2 : this.f4089q.entrySet()) {
                String str2 = (String) this.f4091s.get(entry2.getKey());
                if (str2 != null) {
                    map2.put(str2, entry2.getValue());
                } else {
                    map2.put(entry2.getKey(), entry2.getValue());
                }
            }
            this.f4089q = map2;
        }
        if (this.f4090r.isEmpty()) {
            return;
        }
        HashSet hashSet = new HashSet();
        for (String str3 : this.f4090r) {
            String str4 = (String) this.f4091s.get(str3);
            if (str4 != null) {
                hashSet.add(str4);
            } else {
                hashSet.add(str3);
            }
        }
        this.f4090r = hashSet;
    }

    /* JADX INFO: renamed from: e */
    private void m3464e() {
        m3457a(this.f4088p);
        m3457a(this.f4089q);
        Iterator it = this.f4090r.iterator();
        while (it.hasNext()) {
            if (((String) it.next()).startsWith("res/")) {
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: f */
    private void m3465f() {
        int length = 0;
        HashMap map = new HashMap();
        if (this.f4097y != null) {
            try {
                this.f4097y.mo2954a(this.f4073a, this.f4080h, map, new C1406n(this));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        StringBuilder sb = new StringBuilder();
        int length2 = 0;
        for (Map.Entry entry : this.f4091s.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            sb.append(str);
            sb.append('\n');
            sb.append(str2);
            sb.append('\n');
            length2 += str2.getBytes().length + str.getBytes().length + 2;
        }
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry entry2 : this.f4088p.entrySet()) {
            String str3 = (String) entry2.getKey();
            String str4 = (String) entry2.getValue();
            if (!str3.startsWith("res/") || !str3.endsWith(".xml")) {
                sb2.append(str3);
                sb2.append('\n');
                sb2.append(str4);
                sb2.append('\n');
                length += str4.getBytes().length + str3.getBytes().length + 2;
            }
        }
        for (Map.Entry entry3 : this.f4089q.entrySet()) {
            String str5 = (String) entry3.getKey();
            if (!str5.equals(ApkUtils.ANDROID_MANIFEST_ZIP_ENTRY_NAME)) {
                String str6 = (String) entry3.getValue();
                if (!str5.startsWith("res/") || (!str5.endsWith(".xml") && !str5.endsWith(".9.png"))) {
                    sb2.append(str5);
                    sb2.append('\n');
                    sb2.append(str6);
                    sb2.append('\n');
                    length += str6.getBytes().length + str5.getBytes().length + 2;
                }
            }
        }
        int length3 = length;
        for (Map.Entry entry4 : map.entrySet()) {
            String str7 = (String) entry4.getKey();
            String str8 = (String) entry4.getValue();
            sb2.append((String) entry4.getKey());
            sb2.append('\n');
            sb2.append((String) entry4.getValue());
            sb2.append('\n');
            length3 += str7.getBytes().length + str8.getBytes().length + 2;
        }
        MainActivity.m2790mg(this.f4080h, this.f4078f, sb2.toString(), length3, sb.toString(), length2);
    }

    /* JADX INFO: renamed from: g */
    private boolean m3466g() {
        this.f4089q.putAll(this.f4083k);
        try {
            C1067a.m2467a(this.f4073a, this.f4080h, this.f4079g, (Map<String, String>) this.f4089q, (Map<String, String>) this.f4088p, (Set<String>) this.f4090r);
            return true;
        } catch (Exception e) {
            this.f4082j = this.f4073a.getResources().getString(R.string.sign_error) + e.getMessage();
            return false;
        }
    }

    /* JADX INFO: renamed from: h */
    private boolean m3467h() {
        this.f4089q.putAll(this.f4083k);
        StringBuilder sb = new StringBuilder();
        int length = 0;
        for (Map.Entry entry : this.f4088p.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            sb.append(str);
            sb.append('\n');
            sb.append(str2);
            sb.append('\n');
            length += str2.getBytes().length + str.getBytes().length + 2;
        }
        StringBuilder sb2 = new StringBuilder();
        int length2 = 0;
        for (String str3 : this.f4090r) {
            sb2.append(str3);
            sb2.append('\n');
            length2 += str3.getBytes().length + 1;
        }
        StringBuilder sb3 = new StringBuilder();
        int length3 = 0;
        for (Map.Entry entry2 : this.f4089q.entrySet()) {
            String str4 = (String) entry2.getKey();
            String str5 = (String) entry2.getValue();
            sb3.append(str4);
            sb3.append('\n');
            sb3.append(str5);
            sb3.append('\n');
            length3 += str5.getBytes().length + str4.getBytes().length + 2;
        }
        MainActivity.m2789md(this.f4079g, this.f4080h, sb.toString(), length, sb2.toString(), length2, sb3.toString(), length3);
        return true;
    }

    @Override // com.gmail.heagoo.apkeditor.p097f.InterfaceC1289c
    /* JADX INFO: renamed from: a */
    public final void mo3270a(int i, int i2) {
        if (System.currentTimeMillis() > 500) {
            this.f4093u.f4646c = String.format(this.f4073a.getString(R.string.assemble_dex_detail), Integer.valueOf(i), Integer.valueOf(i2));
            this.f4092t.mo2596a(this.f4093u);
        }
    }

    @Override // com.gmail.heagoo.apkeditor.AbstractC1181bz
    /* JADX INFO: renamed from: a */
    public final void mo3084a(InterfaceC1108d interfaceC1108d) {
        this.f4097y = interfaceC1108d;
    }

    @Override // com.gmail.heagoo.apkeditor.AbstractC1181bz
    /* JADX INFO: renamed from: a */
    public final void mo3085a(InterfaceC1561j interfaceC1561j) {
        this.f4092t = interfaceC1561j;
    }

    @Override // com.gmail.heagoo.apkeditor.AbstractC1181bz
    /* JADX INFO: renamed from: a */
    public final void mo3086a(boolean z, boolean z2, boolean z3, List list, Map map, Map map2, Set set, Map map3, boolean z4) {
        this.f4084l = z;
        this.f4085m = z2;
        this.f4086n = z3;
        this.f4087o = list;
        this.f4088p = map;
        this.f4090r = set;
        this.f4089q = map2;
        this.f4091s = map3;
        this.f4096x = z4;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m3468a() {
        try {
            return m3460a(this.f4073a, this.f4075c, this.f4074b);
        } catch (Exception e) {
            this.f4082j = e.getMessage();
            return false;
        }
    }

    @Override // com.gmail.heagoo.apkeditor.AbstractC1181bz
    /* JADX INFO: renamed from: b */
    public final void mo3087b() {
        this.f4095w = true;
        interrupt();
    }

    /* JADX INFO: renamed from: c */
    public final String m3469c() {
        return this.f4082j;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0157 A[PHI: r3
      0x0157: PHI (r3v1 boolean) = (r3v0 boolean), (r3v4 boolean) binds: [B:20:0x0041, B:43:0x0155] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0237  */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z;
        boolean z2 = false;
        boolean z3 = true;
        System.currentTimeMillis();
        boolean z4 = this.f4084l || this.f4085m || this.f4086n;
        this.f4093u.f4645b = this.f4096x ? 2 : 1;
        if (z4) {
            this.f4093u.f4645b += 2;
        }
        if (this.f4087o != null && !this.f4087o.isEmpty()) {
            this.f4093u.f4645b += this.f4087o.size();
        }
        if (z4) {
            if (this.f4095w) {
                this.f4082j = "User request to stop";
            } else {
                m3456a(this.f4073a.getString(R.string.compose));
                if (m3468a()) {
                    if (this.f4095w) {
                        this.f4082j = "User request to stop";
                    } else {
                        this.f4080h = this.f4079g + ".in";
                        boolean zM3459a = m3459a(this.f4073a, this.f4075c);
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(this.f4075c);
                        arrayList.add("package");
                        arrayList.add("-f");
                        arrayList.add("-I");
                        arrayList.add(this.f4076d);
                        arrayList.add("-S");
                        arrayList.add(this.f4077e + "/res");
                        arrayList.add("-M");
                        arrayList.add(this.f4077e + "/AndroidManifest.xml");
                        arrayList.add("-F");
                        arrayList.add(this.f4080h);
                        arrayList.addAll(aaptNoCompress());
                        if (zM3459a) {
                            arrayList.add("--no-version-vectors");
                        }
                        System.currentTimeMillis();
                        C1554c c1554c = new C1554c();
                        Object[] array = arrayList.toArray(new String[arrayList.size()]);
                        z3 = true;
                        boolean zM3756a = c1554c.m3756a((Object) array, (String[]) null, (Integer) 300000, true);
                        new StringBuilder("stdout: ").append(c1554c.mo3755a()).append(", ret=").append(zM3756a);
                        if (zM3756a) {
                            z = true;
                        } else {
                            new StringBuilder("stderr: ").append(c1554c.mo3759b());
                            this.f4082j = c1554c.mo3759b();
                            z = false;
                        }
                        if (z) {
                        }
                    }
                }
            }
        } else if (this.f4087o == null || this.f4087o.isEmpty()) {
            if (!z4) {
                m3463d();
            } else if (this.f4095w) {
                this.f4082j = "User request to stop";
            } else {
                m3456a(this.f4073a.getString(R.string.merge));
                try {
                    System.currentTimeMillis();
                    m3465f();
                    m3464e();
                } catch (Exception e) {
                    e.printStackTrace();
                    this.f4082j = this.f4073a.getString(R.string.merge) + ": " + e.getMessage();
                }
            }
            if (!this.f4096x) {
                m3467h();
            } else if (this.f4095w) {
                this.f4082j = "User request to stop";
            } else {
                m3456a(this.f4073a.getString(R.string.sign));
                if (m3466g()) {
                }
            }
            if (this.f4095w) {
                this.f4082j = "User request to stop";
            } else {
                m3456a(this.f4073a.getString(R.string.cleanup));
                if (!this.f4080h.equals(this.f4078f)) {
                    new File(this.f4080h).delete();
                }
                try {
                    new C1554c().mo3757a("rm -rf " + (Environment.getExternalStorageDirectory().getPath() + "/ApkEditor/tmp"), (String[]) null, (Integer) 10000);
                } catch (Exception e2) {
                }
                this.f4081i = z3;
            }
        } else {
            Iterator it = this.f4087o.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String str = (String) it.next();
                String str2 = this.f4077e + "/" + str;
                String str3 = "smali".equals(str) ? "classes.dex" : str.startsWith("smali_") ? str.substring(6) + ".dex" : str + ".dex";
                m3456a(this.f4073a.getString(R.string.assemble_dex_file) + ": " + str3);
                try {
                    String str4 = this.f4079g;
                    String str5 = str4.substring(0, str4.lastIndexOf(47) + 1) + str3;
                    try {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        Class.forName("com.gmail.heagoo.apkeditor.pro.DexEncoder").getMethod("smali2Dex", String.class, String.class, InterfaceC1289c.class).invoke(null, str2, str5, this);
                        Log.i("DEBUG", "Encode time=" + (System.currentTimeMillis() - jCurrentTimeMillis));
                        this.f4083k.put(str3, str5);
                        if (this.f4095w) {
                            this.f4082j = "User request to stop";
                            z2 = z3;
                            break;
                        }
                    } catch (InvocationTargetException e3) {
                        throw e3.getTargetException();
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                    this.f4082j = th.getMessage();
                    z2 = z3;
                }
            }
            if (!z2) {
            }
        }
        if (this.f4095w) {
            return;
        }
        if (this.f4081i) {
            this.f4092t.mo2595a();
        } else {
            this.f4092t.mo2597a(this.f4082j);
        }
    }
}
