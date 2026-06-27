package com.gmail.heagoo.apkeditor;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Environment;
import android.util.Log;
import android.util.LruCache;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.android.apksig.apk.ApkUtils;
import com.gmail.heagoo.apkeditor.p098se.C1428aa;
import com.gmail.heagoo.apkeditor.pro.R;
import com.gmail.heagoo.common.C1559h;
import com.gmail.heagoo.common.C1564m;
import com.gmail.heagoo.common.C1570s;
import com.gmail.heagoo.p084a.p089c.C1067a;
import com.gmail.heagoo.p100b.C1533a;
import com.gmail.heagoo.p100b.C1534b;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.ff */
/* JADX INFO: loaded from: classes.dex */
public final class C1296ff extends BaseAdapter implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: a */
    private WeakReference f3767a;

    /* JADX INFO: renamed from: b */
    private WeakReference f3768b;

    /* JADX INFO: renamed from: c */
    private int f3769c;

    /* JADX INFO: renamed from: d */
    private String f3770d;

    /* JADX INFO: renamed from: e */
    private String f3771e;

    /* JADX INFO: renamed from: f */
    private String f3772f;

    /* JADX INFO: renamed from: g */
    private String f3773g;

    /* JADX INFO: renamed from: h */
    private List f3774h;

    /* JADX INFO: renamed from: i */
    private FilenameFilter f3775i;

    /* JADX INFO: renamed from: j */
    private Map f3776j;

    /* JADX INFO: renamed from: k */
    private Set f3777k;

    /* JADX INFO: renamed from: l */
    private LruCache f3778l;

    /* JADX INFO: renamed from: m */
    private C1301fk f3779m;

    /* JADX INFO: renamed from: n */
    private C1428aa f3780n;

    /* JADX INFO: renamed from: o */
    private Map f3781o;

    /* JADX INFO: renamed from: p */
    private Map f3782p;

    /* JADX INFO: renamed from: q */
    private Set f3783q;

    public C1296ff(Context context, String str, String str2, String str3, FilenameFilter filenameFilter) {
        this(context, null, str2, str3, null, filenameFilter, null);
    }

    public C1296ff(Context context, String str, String str2, String str3, Map map, FilenameFilter filenameFilter, InterfaceC1304fn interfaceC1304fn) {
        this.f3774h = new ArrayList();
        this.f3777k = new HashSet();
        this.f3778l = new C1297fg(this, 64);
        this.f3779m = new C1301fk();
        this.f3781o = new HashMap();
        this.f3782p = new HashMap();
        this.f3783q = new HashSet();
        this.f3767a = new WeakReference(context);
        if (interfaceC1304fn != null) {
            this.f3768b = new WeakReference(interfaceC1304fn);
        }
        this.f3770d = str;
        this.f3771e = str3;
        this.f3772f = str2;
        this.f3776j = map;
        this.f3775i = filenameFilter;
        this.f3773g = context.getResources().getString(R.string.resolution);
        this.f3769c = interfaceC1304fn != null ? R.layout.item_file_selectable : R.layout.item_file;
        if (str != null) {
            m3289f(str);
        }
        m3290g(str2);
    }

    /* JADX INFO: renamed from: a */
    private C1211dd m3277a(String str, boolean z) throws Throwable {
        String str2;
        String str3;
        C1564m c1564m;
        Bitmap bitmapM3780a;
        Bitmap bitmapM3780a2 = null;
        String str4 = (String) this.f3782p.get(str);
        if (str4 == null) {
            str4 = (String) this.f3781o.get(str);
        }
        C1299fi c1299fi = (str4 == null || (bitmapM3780a = (c1564m = new C1564m()).m3780a(str4, 32, 32)) == null) ? null : new C1299fi(bitmapM3780a, c1564m.m3779a(), c1564m.m3781b());
        if (c1299fi != null) {
            bitmapM3780a2 = c1299fi.f3787a;
            str2 = this.f3773g + ": " + c1299fi.f3788b + " X " + c1299fi.f3789c;
        } else if (this.f3770d == null) {
            C1564m c1564m2 = new C1564m();
            bitmapM3780a2 = c1564m2.m3780a(this.f3771e + "/" + str, 32, 32);
            str2 = this.f3773g + ": " + c1564m2.m3779a() + " X " + c1564m2.m3781b();
        } else if (z || !str.endsWith(".9.png")) {
            if (this.f3776j != null && (str3 = (String) this.f3776j.get(str)) != null) {
                str = str3;
            }
            C1299fi c1299fi2 = (C1299fi) this.f3778l.get(str);
            if (c1299fi2 == null) {
                Bitmap bitmapM3523a = this.f3780n.m3523a(str, 32, 32);
                if (bitmapM3523a != null) {
                    c1299fi2 = new C1299fi(bitmapM3523a, this.f3780n.m3522a(), this.f3780n.m3524b());
                }
                if (c1299fi2 != null) {
                    this.f3778l.put(str, c1299fi2);
                }
            }
            if (c1299fi2 != null) {
                bitmapM3780a2 = c1299fi2.f3787a;
                str2 = this.f3773g + ": " + c1299fi2.f3788b + " X " + c1299fi2.f3789c;
            } else {
                str2 = null;
            }
        } else {
            C1564m c1564m3 = new C1564m();
            bitmapM3780a2 = c1564m3.m3780a(this.f3771e + "/" + str, 32, 32);
            str2 = this.f3773g + ": " + c1564m3.m3779a() + " X " + c1564m3.m3781b();
        }
        return new C1211dd(bitmapM3780a2, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public List m3280a(File file) {
        ArrayList arrayList = new ArrayList();
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isFile()) {
                    file2.delete();
                    arrayList.add(file2.getPath());
                } else {
                    arrayList.addAll(m3280a(file2));
                }
            }
        }
        file.delete();
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public Map m3282a(File file, File file2, String str) throws Throwable {
        if (!file2.exists()) {
            file2.mkdirs();
        }
        HashMap map = new HashMap();
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file3 : fileArrListFiles) {
                String name = file3.getName();
                if (file3.isFile()) {
                    File file4 = new File(file2, file3.getName());
                    C1559h.m3771a(file3, file4);
                    map.put(str + "/" + name, file4.getPath());
                } else {
                    map.putAll(m3282a(file3, new File(file2, file3.getName()), str + "/" + name));
                }
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: a */
    private static void m3285a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m3287b(String str) {
        return str.endsWith(".png") || str.endsWith(".jpg") || str.endsWith(".jpeg") || str.endsWith(".webp");
    }

    /* JADX INFO: renamed from: f */
    private void m3289f(String str) {
        try {
            ZipFile zipFile = new ZipFile(str);
            this.f3780n = new C1428aa(zipFile);
            Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
            while (enumerationEntries.hasMoreElements()) {
                String name = enumerationEntries.nextElement().getName();
                if (!name.startsWith("res/") && !name.startsWith("r/") && !name.startsWith("META-INF/")) {
                    String[] strArrSplit = name.split("/");
                    if (strArrSplit.length != 1 || (!name.equals(ApkUtils.ANDROID_MANIFEST_ZIP_ENTRY_NAME) && !name.endsWith(".dex") && !name.endsWith(".arsc"))) {
                        this.f3779m.m3330a(strArrSplit, true);
                    }
                }
            }
        } catch (Exception e) {
        }
    }

    /* JADX INFO: renamed from: g */
    private void m3290g(String str) {
        synchronized (this.f3774h) {
            if (new File(str).exists()) {
                m3294i(str);
            } else {
                m3292h(str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public void m3291g(String str, String str2) {
        if (this.f3783q.contains(str)) {
            this.f3783q.remove(str);
            this.f3781o.put(str, str2);
        } else if (this.f3781o.containsKey(str)) {
            Log.d("DEBUG", "error: " + str + " already exist?");
        } else {
            this.f3782p.put(str, str2);
        }
    }

    /* JADX INFO: renamed from: h */
    private void m3292h(String str) {
        C1301fk c1301fkM3329a = this.f3779m.m3329a(str.substring(this.f3771e.length() + 1).split("/"));
        if (c1301fkM3329a != null) {
            this.f3774h.clear();
            List<C1301fk> list = c1301fkM3329a.f3794a;
            if (list != null) {
                for (C1301fk c1301fk : list) {
                    C1533a c1533a = new C1533a();
                    c1533a.f4594a = c1301fk.f3795b;
                    c1533a.f4595b = !c1301fk.f3796c;
                    c1533a.f4596c = true;
                    this.f3774h.add(c1533a);
                }
                Collections.sort(this.f3774h, new C1534b());
            }
            C1533a c1533a2 = new C1533a();
            c1533a2.f4594a = "..";
            c1533a2.f4595b = true;
            this.f3774h.add(0, c1533a2);
            this.f3772f = str;
        }
    }

    /* JADX INFO: renamed from: h */
    private void m3293h(String str, String str2) {
        if (this.f3782p.containsKey(str)) {
            this.f3782p.put(str, str2);
        } else if (this.f3783q.contains(str)) {
            Log.d("DEBUG", "error: " + str + " is already deleted?");
        } else {
            this.f3781o.put(str, str2);
        }
    }

    /* JADX INFO: renamed from: i */
    private void m3294i(String str) {
        File file = new File(str);
        boolean zEquals = str.equals(this.f3771e);
        File[] fileArrListFiles = (!zEquals || this.f3775i == null) ? file.listFiles() : file.listFiles(this.f3775i);
        if (fileArrListFiles == null) {
            if (C1067a.m2522c(str, Environment.getExternalStorageDirectory().getPath())) {
                this.f3774h.clear();
                Environment.getExternalStorageDirectory().getPath();
                C1533a c1533a = new C1533a();
                c1533a.f4594a = C1067a.m2526d(str, Environment.getExternalStorageDirectory().getPath());
                c1533a.f4595b = true;
                this.f3774h.add(c1533a);
                if (!str.equals(this.f3771e)) {
                    C1533a c1533a2 = new C1533a();
                    c1533a2.f4594a = "..";
                    c1533a2.f4595b = true;
                    this.f3774h.add(0, c1533a2);
                }
                this.f3772f = str;
                return;
            }
            return;
        }
        this.f3774h.clear();
        for (File file2 : fileArrListFiles) {
            C1533a c1533a3 = new C1533a();
            c1533a3.f4594a = file2.getName();
            c1533a3.f4595b = file2.isDirectory();
            this.f3774h.add(c1533a3);
        }
        try {
            Collections.sort(this.f3774h, new C1534b());
        } catch (Exception e) {
        }
        if (zEquals) {
            ArrayList arrayList = new ArrayList();
            List<C1301fk> list = this.f3779m.f3794a;
            if (list != null && !list.isEmpty()) {
                for (C1301fk c1301fk : list) {
                    C1533a c1533a4 = new C1533a();
                    c1533a4.f4594a = c1301fk.f3795b;
                    c1533a4.f4595b = !c1301fk.f3796c;
                    c1533a4.f4596c = true;
                    arrayList.add(c1533a4);
                }
                Collections.sort(arrayList, new C1534b());
                this.f3774h.addAll(arrayList);
            }
        } else {
            C1533a c1533a5 = new C1533a();
            c1533a5.f4594a = "..";
            c1533a5.f4595b = true;
            this.f3774h.add(0, c1533a5);
        }
        this.f3772f = str;
    }

    /* JADX INFO: renamed from: j */
    private void m3295j(String str) throws Exception {
        if (str.equals("META-INF")) {
            m3296k(str);
        }
        ZipFile zipFile = new ZipFile(this.f3770d);
        if (zipFile.getEntry(str) == null) {
            zipFile.close();
        } else {
            zipFile.close();
            m3296k(str);
        }
    }

    /* JADX INFO: renamed from: k */
    private void m3296k(String str) throws Exception {
        throw new Exception(String.format(((Context) this.f3767a.get()).getString(R.string.file_already_exist), str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public void m3297l(String str) {
        if (this.f3782p.containsKey(str)) {
            this.f3782p.remove(str);
        } else if (!this.f3781o.containsKey(str)) {
            this.f3783q.add(str);
        } else {
            this.f3781o.remove(str);
            this.f3783q.add(str);
        }
    }

    /* JADX INFO: renamed from: a */
    public final C1211dd m3298a(String str) {
        return m3277a(str.substring(this.f3771e.length() + 1), false);
    }

    /* JADX INFO: renamed from: a */
    public final C1533a m3299a(String str, InputStream inputStream) throws Exception {
        boolean z;
        boolean z2;
        int iLastIndexOf = str.lastIndexOf(47);
        String strSubstring = str.substring(0, iLastIndexOf);
        String strSubstring2 = str.substring(iLastIndexOf + 1);
        String strSubstring3 = strSubstring.equals(this.f3771e) ? strSubstring2 : str.substring(this.f3771e.length() + 1);
        if (strSubstring.equals(this.f3771e) && this.f3770d != null) {
            m3295j(strSubstring2);
        }
        File file = new File(strSubstring);
        String str2 = this.f3771e + "/res";
        if (strSubstring.equals(str2) || strSubstring.startsWith(str2 + "/")) {
            z = true;
        } else {
            String str3 = this.f3771e + "/smali";
            z = strSubstring.equals(str3) || strSubstring.startsWith(new StringBuilder().append(str3).append("/").toString()) || strSubstring.startsWith(new StringBuilder().append(str3).append("_").toString());
        }
        if (z || (file.exists() && !strSubstring.equals(this.f3771e))) {
            if (!file.exists()) {
                file.mkdirs();
            }
            if (new File(str).exists()) {
                m3296k(strSubstring3);
                z2 = false;
            } else {
                FileOutputStream fileOutputStream = new FileOutputStream(str);
                C1067a.m2506b(inputStream, fileOutputStream);
                fileOutputStream.close();
                z2 = false;
            }
        } else {
            String[] strArrSplit = strSubstring3.split("/");
            if (this.f3779m.m3331b(strArrSplit) != null) {
                m3296k(strSubstring3);
                z2 = true;
            } else {
                str = C1067a.m2525d((Context) this.f3767a.get(), "tmp") + C1570s.m3787a(8);
                FileOutputStream fileOutputStream2 = new FileOutputStream(str);
                C1067a.m2506b(inputStream, fileOutputStream2);
                fileOutputStream2.close();
                this.f3779m.m3330a(strArrSplit, true);
                z2 = true;
            }
        }
        m3291g(strSubstring3, str);
        return new C1533a(strSubstring2, false, z2);
    }

    /* JADX INFO: renamed from: a */
    public final String m3300a(List list) {
        String str;
        synchronized (this.f3774h) {
            if (list != null) {
                list.addAll(this.f3774h);
                str = this.f3772f;
            } else {
                str = this.f3772f;
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: a */
    public final void m3301a() {
        m3313c(this.f3772f);
    }

    /* JADX INFO: renamed from: a */
    public final void m3302a(int i) {
        if (i == 0 && !this.f3774h.isEmpty() && "..".equals(((C1533a) this.f3774h.get(0)).f4594a)) {
            return;
        }
        if (this.f3777k.contains(Integer.valueOf(i))) {
            this.f3777k.remove(Integer.valueOf(i));
        } else {
            this.f3777k.add(Integer.valueOf(i));
        }
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: a */
    public final void m3303a(String str, C1533a c1533a) {
        synchronized (this.f3774h) {
            if (this.f3772f.equals(str)) {
                this.f3774h.add(c1533a);
                notifyDataSetChanged();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.gmail.heagoo.apkeditor.ff] */
    /* JADX INFO: renamed from: a */
    public final void m3304a(String str, String str2) throws Throwable {
        Exception exc;
        FileInputStream fileInputStream;
        int iLastIndexOf = str.lastIndexOf("/");
        String strSubstring = str.substring(iLastIndexOf + 1);
        String strSubstring2 = str.substring(0, iLastIndexOf);
        ?? r2 = 0;
        r2 = 0;
        try {
            try {
                fileInputStream = new FileInputStream(str2);
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e) {
            exc = e;
        }
        try {
            m3303a(strSubstring2, m3299a(str, fileInputStream));
            r2 = String.format(((Context) this.f3767a.get()).getString(R.string.file_added), strSubstring);
            Toast.makeText((Context) this.f3767a.get(), (CharSequence) r2, 0).show();
            try {
                fileInputStream.close();
            } catch (IOException e2) {
            }
        } catch (Exception e3) {
            r2 = fileInputStream;
            exc = e3;
            Toast.makeText((Context) this.f3767a.get(), String.format(((Context) this.f3767a.get()).getString(R.string.failed_1), exc.getMessage()), 1).show();
            if (r2 != 0) {
                try {
                    r2.close();
                } catch (IOException e4) {
                }
            }
        } catch (Throwable th2) {
            th = th2;
            r2 = fileInputStream;
            if (r2 != 0) {
                try {
                    r2.close();
                } catch (IOException e5) {
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m3305a(String str, String str2, boolean z) throws Exception {
        if (str.equals(this.f3771e) && this.f3770d != null) {
            m3295j(str2);
        }
        if (!new File(str).exists() || str.equals(this.f3771e)) {
            String[] strArrSplit = (str.equals(this.f3771e) ? str2 : str.substring(this.f3771e.length() + 1) + "/" + str2).split("/");
            if (this.f3779m.m3331b(strArrSplit) != null) {
                m3296k(str2);
                return;
            }
            this.f3779m.m3330a(strArrSplit, false);
            if (z) {
                m3313c(str);
                return;
            }
            return;
        }
        File file = new File(str, str2);
        if (file.exists()) {
            m3296k(str2);
        }
        boolean zMkdir = file.mkdir();
        if (z) {
            if (zMkdir || this.f3767a.get() == null) {
                m3313c(str);
            } else {
                Toast.makeText((Context) this.f3767a.get(), R.string.failed, 1).show();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m3306a(Map map, Set set, Map map2) {
        if (map != null) {
            this.f3782p = map;
        }
        if (set != null) {
            this.f3783q = set;
        }
        if (map2 != null) {
            this.f3781o = map2;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m3307a(boolean z) {
        if (z) {
            if (!((C1533a) this.f3774h.get(0)).f4594a.equals("..")) {
                this.f3777k.add(0);
            }
            for (int i = 1; i < this.f3774h.size(); i++) {
                this.f3777k.add(Integer.valueOf(i));
            }
        } else {
            this.f3777k.clear();
            if (this.f3768b.get() != null) {
                ((InterfaceC1304fn) this.f3768b.get()).mo2707b(this.f3777k);
            }
        }
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: b */
    public final Map m3308b() {
        return this.f3782p;
    }

    /* JADX INFO: renamed from: b */
    public final void m3309b(String str, String str2) {
        try {
            m3305a(str, str2, true);
        } catch (Exception e) {
            Toast.makeText((Context) this.f3767a.get(), e.getMessage(), 1).show();
        }
    }

    /* JADX INFO: renamed from: b */
    protected final void m3310b(List list) {
        Iterator it = this.f3774h.iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next();
            if (list.contains(Integer.valueOf(i))) {
                it.remove();
            }
            i++;
        }
        this.f3777k.clear();
        notifyDataSetChanged();
        if (this.f3768b.get() != null) {
            ((InterfaceC1304fn) this.f3768b.get()).mo2707b(this.f3777k);
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m3311b(String str, String str2, boolean z) {
        List listM3280a;
        List listM3332c;
        ArrayList arrayList = null;
        boolean z2 = true;
        if (z) {
            if (!str.equals(this.f3771e)) {
                str2 = str.substring(this.f3771e.length() + 1) + "/" + str2;
            }
            listM3332c = this.f3779m.m3332c(str2.split("/"));
        } else {
            String str3 = str + "/" + str2;
            File file = new File(str3);
            if (!file.exists()) {
                listM3280a = null;
            } else if (file.isFile()) {
                file.delete();
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(str3);
                listM3280a = arrayList2;
            } else {
                listM3280a = m3280a(file);
            }
            if (listM3280a != null) {
                arrayList = new ArrayList();
                Iterator it = listM3280a.iterator();
                while (it.hasNext()) {
                    arrayList.add(((String) it.next()).substring(this.f3771e.length() + 1));
                }
            }
            if (listM3280a != null) {
                listM3332c = arrayList;
            } else {
                z2 = false;
                listM3332c = arrayList;
            }
        }
        if (listM3332c != null) {
            Iterator it2 = listM3332c.iterator();
            while (it2.hasNext()) {
                m3297l((String) it2.next());
            }
        }
        return z2;
    }

    /* JADX INFO: renamed from: c */
    public final Map m3312c() {
        return this.f3781o;
    }

    /* JADX INFO: renamed from: c */
    public final void m3313c(String str) {
        if (!this.f3771e.startsWith(str) || str.equals(this.f3771e)) {
            m3290g(str);
            notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m3314c(String str, String str2) {
        m3293h(str, str2);
    }

    /* JADX INFO: renamed from: c */
    protected final void m3315c(List list) {
        ArrayList arrayList = new ArrayList();
        String strM3300a = m3300a(arrayList);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            C1533a c1533a = (C1533a) arrayList.get(iIntValue);
            if (c1533a != null) {
                m3311b(strM3300a, c1533a.f4594a, c1533a.f4596c);
                arrayList2.add(Integer.valueOf(iIntValue));
            }
        }
        m3310b(arrayList2);
    }

    /* JADX INFO: renamed from: d */
    public final String m3316d(String str) {
        String str2 = (String) this.f3781o.get(str);
        return str2 == null ? (String) this.f3782p.get(str) : str2;
    }

    /* JADX INFO: renamed from: d */
    public final Set m3317d() {
        return this.f3783q;
    }

    /* JADX INFO: renamed from: d */
    public final void m3318d(String str, String str2) {
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        String strSubstring = str.substring(this.f3771e.length() + 1);
        if (new File(str).exists()) {
            try {
                fileInputStream = new FileInputStream(str2);
                try {
                    fileOutputStream = new FileOutputStream(str);
                    try {
                        C1067a.m2506b(fileInputStream, fileOutputStream);
                        m3293h(strSubstring, str);
                        Toast.makeText((Context) this.f3767a.get(), R.string.file_replaced, 0).show();
                        m3285a(fileInputStream);
                        m3285a(fileOutputStream);
                    } catch (IOException e) {
                        e = e;
                        fileInputStream2 = fileInputStream;
                        try {
                            e.printStackTrace();
                            m3285a(fileInputStream2);
                            m3285a(fileOutputStream);
                        } catch (Throwable th) {
                            th = th;
                            fileInputStream = fileInputStream2;
                            m3285a(fileInputStream);
                            m3285a(fileOutputStream);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        m3285a(fileInputStream);
                        m3285a(fileOutputStream);
                        throw th;
                    }
                } catch (IOException e2) {
                    e = e2;
                    fileOutputStream = null;
                    fileInputStream2 = fileInputStream;
                } catch (Throwable th3) {
                    th = th3;
                    fileOutputStream = null;
                }
            } catch (IOException e3) {
                e = e3;
                fileOutputStream = null;
            } catch (Throwable th4) {
                th = th4;
                fileOutputStream = null;
                fileInputStream = null;
            }
        } else {
            try {
                String str3 = C1067a.m2525d((Context) this.f3767a.get(), "tmp") + C1570s.m3787a(8);
                C1559h.m3772a(str2, str3);
                m3293h(strSubstring, str3);
                Toast.makeText((Context) this.f3767a.get(), R.string.file_replaced, 0).show();
            } catch (Exception e4) {
                e4.printStackTrace();
            }
        }
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: e */
    public final Set m3319e() {
        return this.f3777k;
    }

    /* JADX INFO: renamed from: e */
    public final void m3320e(String str, String str2) {
        new DialogC1284ey((Activity) this.f3767a.get(), new C1298fh(this, str, str2), R.string.folder_replaced).show();
    }

    /* JADX INFO: renamed from: e */
    public final boolean m3321e(String str) {
        if (new File(str).exists() || this.f3771e.equals(str)) {
            return true;
        }
        return this.f3779m.m3329a(str.substring(this.f3771e.length() + 1).split("/")) != null;
    }

    /* JADX INFO: renamed from: f */
    public final void m3322f(String str, String str2) {
        if (this.f3782p != null) {
            for (Map.Entry entry : this.f3782p.entrySet()) {
                if (((String) entry.getValue()).startsWith(str)) {
                    entry.setValue(str2 + ((String) entry.getValue()).substring(str.length()));
                }
            }
        }
        if (this.f3781o != null) {
            for (Map.Entry entry2 : this.f3781o.entrySet()) {
                if (((String) entry2.getValue()).startsWith(str)) {
                    entry2.setValue(str2 + ((String) entry2.getValue()).substring(str.length()));
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final boolean m3323f() {
        return this.f3772f.equals(this.f3771e);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f3774h.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.f3774h.get(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    @SuppressLint({"InflateParams"})
    public final View getView(int i, View view, ViewGroup viewGroup) throws Throwable {
        C1300fj c1300fj;
        String str;
        String str2;
        C1533a c1533a = (C1533a) this.f3774h.get(i);
        if (view == null) {
            view = LayoutInflater.from((Context) this.f3767a.get()).inflate(this.f3769c, (ViewGroup) null);
            C1300fj c1300fj2 = new C1300fj((byte) 0);
            c1300fj2.f3790a = (ImageView) view.findViewById(R.id.file_icon);
            c1300fj2.f3791b = (TextView) view.findViewById(R.id.filename);
            c1300fj2.f3792c = (TextView) view.findViewById(R.id.detail1);
            c1300fj2.f3793d = (CheckBox) view.findViewById(R.id.checkBox);
            view.setTag(c1300fj2);
            c1300fj = c1300fj2;
        } else {
            c1300fj = (C1300fj) view.getTag();
        }
        c1300fj.f3791b.setText(c1533a.f4594a);
        if (c1533a.f4594a.equals("..")) {
            c1300fj.f3790a.setImageResource(R.drawable.ic_file_up);
            str = null;
        } else if (c1533a.f4595b) {
            c1300fj.f3790a.setImageResource(R.drawable.ic_file_folder);
            str = null;
        } else {
            if (c1533a.f4594a.endsWith(".xml")) {
                c1300fj.f3790a.setImageResource(R.drawable.ic_file_xml);
            }
            if (c1533a.f4594a.endsWith(".smali")) {
                c1300fj.f3790a.setImageResource(R.drawable.ic_file_smali);
            }
            if (c1533a.f4594a.endsWith(".htm")) {
                c1300fj.f3790a.setImageResource(R.drawable.ic_file_html);
            }
            if (c1533a.f4594a.endsWith(".html")) {
                c1300fj.f3790a.setImageResource(R.drawable.ic_file_html);
            }
            if (c1533a.f4594a.endsWith(".rar")) {
                c1300fj.f3790a.setImageResource(R.drawable.ic_file_zip);
            }
            if (c1533a.f4594a.endsWith(".zip")) {
                c1300fj.f3790a.setImageResource(R.drawable.ic_file_zip);
            }
            if (c1533a.f4594a.endsWith(".dex")) {
                c1300fj.f3790a.setImageResource(R.drawable.ic_file_dex);
            }
            if (c1533a.f4594a.endsWith(".properties")) {
                c1300fj.f3790a.setImageResource(R.drawable.ic_file_text);
            }
            if (c1533a.f4594a.endsWith(".css")) {
                c1300fj.f3790a.setImageResource(R.drawable.ic_file_text);
            }
            if (c1533a.f4594a.endsWith(".java")) {
                c1300fj.f3790a.setImageResource(R.drawable.ic_file_text);
            }
            if (c1533a.f4594a.endsWith(".js")) {
                c1300fj.f3790a.setImageResource(R.drawable.ic_file_text);
            }
            if (c1533a.f4594a.endsWith(".MF")) {
                c1300fj.f3790a.setImageResource(R.drawable.ic_file_text);
            }
            if (c1533a.f4594a.endsWith(".SF")) {
                c1300fj.f3790a.setImageResource(R.drawable.ic_file_text);
            }
            if (c1533a.f4594a.endsWith(".txt")) {
                c1300fj.f3790a.setImageResource(R.drawable.ic_file_text);
            }
            if (c1533a.f4594a.endsWith(".apk")) {
                c1300fj.f3790a.setImageResource(R.drawable.ic_file_apk);
            }
            if (c1533a.f4594a.endsWith(".ttf")) {
                c1300fj.f3790a.setImageResource(R.drawable.ic_file_ttf);
            }
            if (m3287b(c1533a.f4594a)) {
                String str3 = this.f3772f;
                String str4 = c1533a.f4594a;
                if (str3.equals(this.f3771e)) {
                    str2 = str4;
                } else {
                    str2 = str3.substring(this.f3771e.endsWith("/") ? this.f3771e.length() : this.f3771e.length() + 1) + "/" + str4;
                }
                C1211dd c1211ddM3277a = m3277a(str2, c1533a.f4596c);
                c1300fj.f3790a.setImageBitmap(c1211ddM3277a.f3528a);
                str = c1211ddM3277a.f3529b;
            } else if (c1533a.f4594a.endsWith(".xml")) {
                c1300fj.f3790a.setImageResource(R.drawable.ic_file_xml);
                str = null;
            } else if (c1533a.f4594a.endsWith(".smali")) {
                c1300fj.f3790a.setImageResource(R.drawable.ic_file_smali);
                str = null;
            } else if (c1533a.f4594a.endsWith(".htm") || c1533a.f4594a.endsWith(".html")) {
                c1300fj.f3790a.setImageResource(R.drawable.ic_file_html);
                str = null;
            } else if (c1533a.f4594a.endsWith(".rar") || c1533a.f4594a.endsWith(".zip")) {
                c1300fj.f3790a.setImageResource(R.drawable.ic_file_zip);
                str = null;
            } else if (c1533a.f4594a.endsWith(".dex")) {
                c1300fj.f3790a.setImageResource(R.drawable.ic_file_dex);
                str = null;
            } else if (c1533a.f4594a.endsWith(".properties") || c1533a.f4594a.endsWith(".css") || c1533a.f4594a.endsWith(".java") || c1533a.f4594a.endsWith(".js") || c1533a.f4594a.endsWith(".MF") || c1533a.f4594a.endsWith(".SF") || c1533a.f4594a.endsWith(".txt")) {
                c1300fj.f3790a.setImageResource(R.drawable.ic_file_text);
                str = null;
            } else if (c1533a.f4594a.endsWith(".apk")) {
                c1300fj.f3790a.setImageResource(R.drawable.ic_file_apk);
                str = null;
            } else if (c1533a.f4594a.endsWith(".ttf")) {
                c1300fj.f3790a.setImageResource(R.drawable.ic_file_ttf);
                str = null;
            } else {
                c1300fj.f3790a.setImageResource(R.drawable.ic_file_unknown);
                str = null;
            }
        }
        if (str != null) {
            c1300fj.f3792c.setText(str);
            c1300fj.f3792c.setVisibility(0);
        } else {
            c1300fj.f3792c.setVisibility(8);
        }
        if (c1300fj.f3793d != null) {
            if (i == 0 && c1533a.f4594a.equals("..")) {
                c1300fj.f3793d.setVisibility(4);
            } else {
                c1300fj.f3793d.setVisibility(0);
                c1300fj.f3793d.setId(i);
                c1300fj.f3793d.setOnCheckedChangeListener(this);
                c1300fj.f3793d.setChecked(this.f3777k.contains(Integer.valueOf(i)));
            }
        }
        return view;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int id = compoundButton.getId();
        if (z) {
            this.f3777k.add(Integer.valueOf(id));
        } else {
            this.f3777k.remove(Integer.valueOf(id));
        }
        if (this.f3768b != null) {
            ((InterfaceC1304fn) this.f3768b.get()).mo2707b(this.f3777k);
        }
    }
}
