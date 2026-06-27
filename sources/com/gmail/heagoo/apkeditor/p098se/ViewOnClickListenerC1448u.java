package com.gmail.heagoo.apkeditor.p098se;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.util.LruCache;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.gmail.heagoo.apkeditor.C1192cg;
import com.gmail.heagoo.apkeditor.DialogC1197cn;
import com.gmail.heagoo.apkeditor.DialogC1284ey;
import com.gmail.heagoo.apkeditor.InterfaceC1204cu;
import com.gmail.heagoo.apkeditor.InterfaceC1291fa;
import com.gmail.heagoo.apkeditor.pro.R;
import com.gmail.heagoo.common.C1564m;
import com.gmail.heagoo.imageviewlib.ViewZipImageActivity;
import com.gmail.heagoo.p084a.C1051a;
import com.gmail.heagoo.p084a.p089c.C1067a;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipFile;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.se.u */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC1448u extends BaseAdapter implements View.OnClickListener, AdapterView.OnItemClickListener, AdapterView.OnItemLongClickListener, InterfaceC1204cu, InterfaceC1291fa {

    /* JADX INFO: renamed from: a */
    private Activity f4258a;

    /* JADX INFO: renamed from: b */
    private InterfaceC1435h f4259b;

    /* JADX INFO: renamed from: c */
    private String f4260c;

    /* JADX INFO: renamed from: d */
    private List f4261d;

    /* JADX INFO: renamed from: e */
    private Map f4262e;

    /* JADX INFO: renamed from: f */
    private Map f4263f;

    /* JADX INFO: renamed from: g */
    private boolean f4264g;

    /* JADX INFO: renamed from: h */
    private LruCache f4265h;

    /* JADX INFO: renamed from: i */
    private Comparator f4266i;

    /* JADX INFO: renamed from: j */
    private C1453z f4267j;

    /* JADX INFO: renamed from: k */
    private ZipFile f4268k;

    /* JADX INFO: renamed from: l */
    private C1428aa f4269l;

    /* JADX INFO: renamed from: m */
    private int f4270m;

    /* JADX INFO: renamed from: n */
    private boolean f4271n;

    /* JADX INFO: renamed from: o */
    private String f4272o;

    /* JADX INFO: renamed from: p */
    private String f4273p;

    public ViewOnClickListenerC1448u(Activity activity, InterfaceC1435h interfaceC1435h, C1453z c1453z) {
        this.f4263f = new HashMap();
        this.f4264g = false;
        this.f4265h = new C1449v(this, 32);
        this.f4266i = new C1450w(this);
        this.f4258a = activity;
        this.f4260c = "/";
        this.f4259b = interfaceC1435h;
        this.f4262e = c1453z.f4283c;
        this.f4267j = c1453z;
        this.f4261d = (List) this.f4262e.get(this.f4260c);
        Collections.sort(this.f4261d, this.f4266i);
        this.f4270m = R.layout.item_zipfile;
        try {
            this.f4268k = new ZipFile(c1453z.m3556b());
            this.f4269l = new C1428aa(this.f4268k);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ViewOnClickListenerC1448u(Activity activity, InterfaceC1435h interfaceC1435h, C1453z c1453z, boolean z) {
        this(activity, interfaceC1435h, c1453z);
        this.f4264g = true;
    }

    /* JADX INFO: renamed from: a */
    public static void m3544a(Activity activity, String str, String str2) {
        ArrayList arrayList = new ArrayList();
        C1192cg c1192cg = new C1192cg();
        c1192cg.f3493c = true;
        c1192cg.f3492b = false;
        c1192cg.f3491a = str2;
        arrayList.add(c1192cg);
        new DialogC1197cn(activity, new C1451x(activity, str, arrayList), null, null, activity.getString(R.string.select_folder), true, false, false, null).show();
    }

    /* JADX INFO: renamed from: a */
    public static boolean m3545a(String str) {
        return str.endsWith(".png") || str.endsWith(".jpg") || str.endsWith(".jpeg") || str.endsWith(".gif");
    }

    /* JADX INFO: renamed from: f */
    private boolean m3546f() {
        return "/".equals(this.f4260c);
    }

    @Override // com.gmail.heagoo.apkeditor.InterfaceC1291fa
    /* JADX INFO: renamed from: a */
    public final void mo2792a() throws IOException {
        InputStream inputStream;
        this.f4271n = false;
        if (this.f4268k != null) {
            String str = (String) this.f4263f.get(this.f4272o);
            if (str != null) {
                inputStream = new FileInputStream(str);
            } else {
                inputStream = this.f4268k.getInputStream(this.f4268k.getEntry(this.f4272o));
            }
            this.f4273p = C1067a.m2525d(this.f4258a, "tmp") + this.f4272o.replace('/', '_');
            FileOutputStream fileOutputStream = new FileOutputStream(this.f4273p);
            C1051a c1051a = new C1051a();
            if (inputStream != null) {
                this.f4271n = c1051a.m2382a(inputStream, fileOutputStream);
            }
            C1067a.m2474a((Closeable) inputStream);
            C1067a.m2474a(fileOutputStream);
        }
    }

    @Override // com.gmail.heagoo.apkeditor.InterfaceC1204cu
    /* JADX INFO: renamed from: a */
    public final void mo2764a(String str, String str2, boolean z) {
        this.f4263f.put(str2, str);
        this.f4265h.remove(str2);
        notifyDataSetChanged();
        ((SimpleEditActivity) this.f4258a).m3515a();
    }

    @Override // com.gmail.heagoo.apkeditor.InterfaceC1204cu
    /* JADX INFO: renamed from: a */
    public final boolean mo2765a(String str, String str2) {
        int iIndexOf = str2.indexOf(46, str2.lastIndexOf(47) + 1);
        if (iIndexOf != -1) {
            return str.endsWith(str2.substring(iIndexOf));
        }
        return true;
    }

    @Override // com.gmail.heagoo.apkeditor.InterfaceC1204cu
    /* JADX INFO: renamed from: b */
    public final String mo2766b(String str, String str2) {
        return null;
    }

    @Override // com.gmail.heagoo.apkeditor.InterfaceC1291fa
    /* JADX INFO: renamed from: b */
    public final void mo2793b() {
        if (!this.f4271n) {
            Toast.makeText(this.f4258a, String.format(this.f4258a.getString(R.string.failed_to_parse_xml), this.f4272o), 1).show();
            return;
        }
        Intent intentM2439a = C1067a.m2439a(this.f4258a, this.f4273p, this.f4267j != null ? this.f4267j.m3556b() : null);
        C1067a.m2442a(intentM2439a, "displayFileName", this.f4272o);
        C1067a.m2442a(intentM2439a, "extraString", this.f4272o);
        this.f4258a.startActivityForResult(intentM2439a, 0);
    }

    /* JADX INFO: renamed from: c */
    public final String m3547c() {
        return this.f4260c;
    }

    /* JADX INFO: renamed from: c */
    public final void m3548c(String str, String str2) {
        this.f4263f.put(str, str2);
    }

    /* JADX INFO: renamed from: d */
    public final Map m3549d() {
        return this.f4263f;
    }

    /* JADX INFO: renamed from: e */
    public final void m3550e() {
        try {
            if (this.f4268k != null) {
                this.f4268k.close();
            }
        } catch (IOException e) {
        }
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        if (m3546f()) {
            return this.f4261d.size();
        }
        if (this.f4261d != null) {
            return this.f4261d.size() + 1;
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        if (m3546f()) {
            return this.f4261d.get(i);
        }
        if (this.f4261d != null) {
            return this.f4261d.get(i - 1);
        }
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    @SuppressLint({"InflateParams"})
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C1447t c1447t;
        boolean z;
        if (this.f4261d == null) {
            return null;
        }
        if (view == null) {
            view = LayoutInflater.from(this.f4258a).inflate(this.f4270m, (ViewGroup) null);
            c1447t = new C1447t();
            c1447t.f4253a = (ImageView) view.findViewById(R.id.file_icon);
            c1447t.f4254b = (TextView) view.findViewById(R.id.filename);
            c1447t.f4255c = (TextView) view.findViewById(R.id.detail1);
            c1447t.f4256d = view.findViewById(R.id.menu_edit);
            c1447t.f4257e = view.findViewById(R.id.menu_save);
            view.setTag(c1447t);
        } else {
            c1447t = (C1447t) view.getTag();
        }
        if (!m3546f()) {
            i--;
        }
        if (i >= 0) {
            C1452y c1452y = (C1452y) this.f4261d.get(i);
            c1447t.f4254b.setText(c1452y.f4278a);
            if (c1452y.f4279b) {
                c1447t.f4253a.setImageResource(R.drawable.ic_file_folder);
                z = false;
            } else {
                String str = c1452y.f4278a;
                if ((str.endsWith(".xml") || str.endsWith(".dex") || str.endsWith(".MF") || str.endsWith(".SF") || str.endsWith(".RSA") || str.endsWith(".so")) || !m3545a(c1452y.f4278a)) {
                    c1447t.f4253a.setImageResource(R.drawable.ic_file_unknown);
                    z = true;
                } else {
                    String str2 = this.f4260c.substring(1) + c1452y.f4278a;
                    ImageView imageView = c1447t.f4253a;
                    Bitmap bitmapM3523a = (Bitmap) this.f4265h.get(str2);
                    if (bitmapM3523a == null) {
                        String str3 = (String) this.f4263f.get(str2);
                        bitmapM3523a = str3 == null ? this.f4269l.m3523a(str2, 32, 32) : new C1564m().m3780a(str3, 32, 32);
                        if (bitmapM3523a != null) {
                            this.f4265h.put(str2, bitmapM3523a);
                        }
                    }
                    imageView.setImageBitmap(bitmapM3523a);
                    z = true;
                }
            }
            if (!z || this.f4264g) {
                c1447t.f4256d.setVisibility(8);
                c1447t.f4257e.setVisibility(8);
            } else {
                c1447t.f4256d.setVisibility(0);
                c1447t.f4256d.setId(i);
                c1447t.f4256d.setOnClickListener(this);
                c1447t.f4257e.setVisibility(0);
                c1447t.f4257e.setId(this.f4261d.size() + i);
                c1447t.f4257e.setOnClickListener(this);
            }
        } else {
            c1447t.f4254b.setText("..");
            c1447t.f4253a.setImageResource(R.drawable.ic_file_up);
            c1447t.f4256d.setVisibility(8);
            c1447t.f4257e.setVisibility(8);
        }
        c1447t.f4255c.setVisibility(8);
        return view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int size;
        int id = view.getId();
        if (id < this.f4261d.size()) {
            if (id < this.f4261d.size()) {
                new DialogC1197cn(this.f4258a, this, null, this.f4260c.substring(1) + ((C1452y) this.f4261d.get(id)).f4278a, this.f4258a.getString(R.string.select_file_replace)).show();
            }
        } else {
            if (id >= this.f4261d.size() * 2 || (size = id - this.f4261d.size()) >= this.f4261d.size()) {
                return;
            }
            m3544a(this.f4258a, this.f4267j.m3556b(), this.f4260c.substring(1) + ((C1452y) this.f4261d.get(size)).f4278a);
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        boolean z;
        boolean z2 = false;
        if (!m3546f()) {
            if (i == 0) {
                String str = this.f4260c;
                this.f4260c = str.substring(0, str.lastIndexOf(47, str.length() - 2) + 1);
                this.f4261d = (List) this.f4262e.get(this.f4260c);
                z2 = true;
                i = -1;
            } else {
                i--;
            }
        }
        if (i != -1) {
            C1452y c1452y = (C1452y) this.f4261d.get(i);
            if (c1452y.f4279b) {
                this.f4260c += c1452y.f4278a + "/";
                this.f4261d = (List) this.f4262e.get(this.f4260c);
                z = true;
            } else if (m3545a(c1452y.f4278a)) {
                String str2 = this.f4260c.substring(1) + c1452y.f4278a;
                String str3 = (String) this.f4263f.get(str2);
                Intent intent = new Intent(this.f4258a, (Class<?>) ViewZipImageActivity.class);
                if (str3 == null) {
                    C1067a.m2442a(intent, "zipFilePath", this.f4267j.m3556b());
                    C1067a.m2442a(intent, "entryName", str2);
                } else {
                    C1067a.m2442a(intent, "imageFilePath", str3);
                }
                this.f4258a.startActivity(intent);
                z = z2;
            } else {
                if (this.f4264g && c1452y.f4278a.endsWith(".xml")) {
                    this.f4272o = this.f4260c.substring(1) + c1452y.f4278a;
                    new DialogC1284ey(this.f4258a, this, -1).show();
                }
                z = z2;
            }
        } else {
            z = z2;
        }
        if (z) {
            this.f4259b.mo2748a(this.f4260c);
            notifyDataSetChanged();
        }
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public final boolean onItemLongClick(AdapterView adapterView, View view, int i, long j) {
        return false;
    }
}
