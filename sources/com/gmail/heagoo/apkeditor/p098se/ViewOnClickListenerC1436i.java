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
import com.gmail.heagoo.apkeditor.DialogC1197cn;
import com.gmail.heagoo.apkeditor.InterfaceC1204cu;
import com.gmail.heagoo.apkeditor.pro.R;
import com.gmail.heagoo.common.C1564m;
import com.gmail.heagoo.common.DynamicExpandListView;
import com.gmail.heagoo.imageviewlib.ViewZipImageActivity;
import com.gmail.heagoo.p084a.p089c.C1067a;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipFile;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.se.i */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC1436i extends BaseAdapter implements View.OnClickListener, AdapterView.OnItemClickListener, AdapterView.OnItemLongClickListener, InterfaceC1204cu {

    /* JADX INFO: renamed from: a */
    private WeakReference f4231a;

    /* JADX INFO: renamed from: b */
    private Activity f4232b;

    /* JADX INFO: renamed from: c */
    private List f4233c;

    /* JADX INFO: renamed from: d */
    private HashMap f4234d;

    /* JADX INFO: renamed from: e */
    private C1453z f4235e;

    /* JADX INFO: renamed from: f */
    private C1428aa f4236f;

    /* JADX INFO: renamed from: g */
    private ZipFile f4237g;

    /* JADX INFO: renamed from: h */
    private Map f4238h = new HashMap();

    /* JADX INFO: renamed from: i */
    private LruCache f4239i = new C1437j(this, 32);

    /* JADX INFO: renamed from: j */
    private int f4240j = R.layout.item_zipfile;

    public ViewOnClickListenerC1436i(DynamicExpandListView dynamicExpandListView, Activity activity, C1453z c1453z) {
        this.f4231a = new WeakReference(dynamicExpandListView);
        this.f4232b = activity;
        this.f4235e = c1453z;
        this.f4233c = c1453z.f4281a;
        this.f4234d = c1453z.f4282b;
        try {
            this.f4237g = new ZipFile(c1453z.m3556b());
            this.f4236f = new C1428aa(this.f4237g);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m3537a(int i) {
        String str = (String) this.f4233c.get(i);
        C1434g c1434g = (C1434g) this.f4234d.get(str);
        Intent intent = new Intent(this.f4232b, (Class<?>) ViewZipImageActivity.class);
        if (c1434g.f4229b == null) {
            C1067a.m2442a(intent, "zipFilePath", this.f4235e.m3556b());
            C1067a.m2442a(intent, "entryName", c1434g.f4230c + "/" + str);
        } else {
            C1067a.m2442a(intent, "imageFilePath", c1434g.f4229b);
        }
        this.f4232b.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m3539b(int i) {
        String str = (String) this.f4233c.get(i);
        ViewOnClickListenerC1448u.m3544a(this.f4232b, this.f4235e.m3556b(), ((C1434g) this.f4234d.get(str)).f4230c + "/" + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public void m3541c(int i) {
        new DialogC1197cn(this.f4232b, this, null, (String) this.f4233c.get(i), this.f4232b.getString(R.string.select_file_replace)).show();
    }

    /* JADX INFO: renamed from: a */
    public final Map m3543a() {
        return this.f4238h;
    }

    @Override // com.gmail.heagoo.apkeditor.InterfaceC1204cu
    /* JADX INFO: renamed from: a */
    public final void mo2764a(String str, String str2, boolean z) {
        C1434g c1434g = (C1434g) this.f4234d.get(str2);
        c1434g.f4229b = str;
        Iterator it = c1434g.f4228a.iterator();
        while (it.hasNext()) {
            this.f4238h.put(((String) it.next()) + "/" + str2, str);
        }
        this.f4239i.remove(str2);
        DynamicExpandListView dynamicExpandListView = (DynamicExpandListView) this.f4231a.get();
        if (dynamicExpandListView != null) {
            dynamicExpandListView.m3748a();
        }
        ((SimpleEditActivity) this.f4232b).m3515a();
    }

    @Override // com.gmail.heagoo.apkeditor.InterfaceC1204cu
    /* JADX INFO: renamed from: a */
    public final boolean mo2765a(String str, String str2) {
        return ViewOnClickListenerC1448u.m3545a(str);
    }

    @Override // com.gmail.heagoo.apkeditor.InterfaceC1204cu
    /* JADX INFO: renamed from: b */
    public final String mo2766b(String str, String str2) {
        return null;
    }

    protected final void finalize() throws Throwable {
        if (this.f4237g != null) {
            try {
                this.f4237g.close();
            } catch (IOException e) {
            }
        }
        super.finalize();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f4234d.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.f4234d.get(Integer.valueOf(i));
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    @SuppressLint({"InflateParams"})
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C1447t c1447t;
        Bitmap bitmapM3523a;
        String str = (String) this.f4233c.get(i);
        if (view == null) {
            view = LayoutInflater.from(this.f4232b).inflate(this.f4240j, (ViewGroup) null);
            C1447t c1447t2 = new C1447t();
            c1447t2.f4253a = (ImageView) view.findViewById(R.id.file_icon);
            c1447t2.f4254b = (TextView) view.findViewById(R.id.filename);
            c1447t2.f4255c = (TextView) view.findViewById(R.id.detail1);
            c1447t2.f4256d = view.findViewById(R.id.menu_edit);
            c1447t2.f4257e = view.findViewById(R.id.menu_save);
            view.setTag(c1447t2);
            c1447t = c1447t2;
        } else {
            c1447t = (C1447t) view.getTag();
        }
        c1447t.f4254b.setText(str);
        c1447t.f4256d.setId(i);
        c1447t.f4256d.setOnClickListener(this);
        c1447t.f4257e.setId(this.f4233c.size() + i);
        c1447t.f4257e.setOnClickListener(this);
        C1434g c1434g = (C1434g) this.f4234d.get(str);
        C1442o c1442o = (C1442o) this.f4239i.get(str);
        if (c1442o != null) {
            bitmapM3523a = c1442o.f4246a;
        } else {
            bitmapM3523a = c1434g.f4229b == null ? this.f4236f.m3523a(c1434g.f4230c + "/" + str, 32, 32) : new C1564m().m3780a(c1434g.f4229b, 32, 32);
            C1442o c1442o2 = new C1442o();
            c1442o2.f4246a = bitmapM3523a;
            this.f4239i.put(str, c1442o2);
        }
        c1447t.f4253a.setImageBitmap(bitmapM3523a);
        c1447t.f4255c.setText(c1434g.m3535a());
        return view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id = view.getId();
        if (id < this.f4233c.size()) {
            m3541c(id);
        } else if (id < (this.f4233c.size() << 1)) {
            m3539b(id - this.f4233c.size());
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        m3537a(i);
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public final boolean onItemLongClick(AdapterView adapterView, View view, int i, long j) {
        adapterView.setOnCreateContextMenuListener(new ViewOnCreateContextMenuListenerC1438k(this, i));
        return false;
    }
}
