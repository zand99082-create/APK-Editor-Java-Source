package com.gmail.heagoo.apkeditor;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;
import com.gmail.heagoo.apkeditor.pro.R;
import com.gmail.heagoo.p084a.p089c.C1067a;
import common.types.StringItem;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.gv */
/* JADX INFO: loaded from: classes.dex */
final class C1338gv extends BaseAdapter implements AdapterView.OnItemClickListener, AdapterView.OnItemLongClickListener {

    /* JADX INFO: renamed from: a */
    private WeakReference f3895a;

    /* JADX INFO: renamed from: b */
    private final List f3896b = new ArrayList();

    /* JADX INFO: renamed from: c */
    private Map f3897c = new HashMap();

    /* JADX INFO: renamed from: d */
    private String f3898d = null;

    /* JADX INFO: renamed from: e */
    private int f3899e = R.layout.item_stringvaluestatic;

    /* JADX INFO: renamed from: f */
    private Activity f3900f;

    C1338gv(Activity activity) {
        this.f3895a = new WeakReference(activity);
        this.f3900f = activity;
    }

    /* JADX INFO: renamed from: a */
    final Map m3377a() {
        return this.f3897c;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004c  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void m3378a(int i, String str) {
        boolean z;
        synchronized (this.f3896b) {
            if (i >= 0) {
                if (i < this.f3896b.size()) {
                    StringItem stringItem = (StringItem) this.f3896b.get(i);
                    if (stringItem.value.equals(str)) {
                        z = false;
                    } else {
                        if (this.f3898d != null) {
                            stringItem.value = str;
                            Map map = (Map) this.f3897c.get(this.f3898d);
                            if (map == null) {
                                map = new HashMap();
                                this.f3897c.put(this.f3898d, map);
                            }
                            map.put(stringItem.name, str);
                        }
                        z = true;
                    }
                }
            }
        }
        if (z) {
            notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: a */
    final void m3379a(String str, List list) {
        synchronized (this.f3896b) {
            this.f3898d = str;
            this.f3896b.clear();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.f3896b.add((StringItem) it.next());
            }
        }
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: a */
    final void m3380a(Map map) {
        this.f3897c = map;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        int size;
        synchronized (this.f3896b) {
            size = this.f3896b.size();
        }
        return size;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        Object obj;
        synchronized (this.f3896b) {
            obj = this.f3896b.get(i);
        }
        return obj;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C1339gw c1339gw;
        synchronized (this.f3896b) {
            StringItem stringItem = (StringItem) this.f3896b.get(i);
            if (view == null) {
                view = LayoutInflater.from((Context) this.f3895a.get()).inflate(this.f3899e, (ViewGroup) null);
                C1339gw c1339gw2 = new C1339gw((byte) 0);
                c1339gw2.f3901a = (TextView) view.findViewById(R.id.string_name);
                c1339gw2.f3902b = (TextView) view.findViewById(R.id.string_value);
                view.setTag(c1339gw2);
                c1339gw = c1339gw2;
            } else {
                c1339gw = (C1339gw) view.getTag();
            }
            c1339gw.f3901a.setText(stringItem.name);
            c1339gw.f3902b.setText(stringItem.value);
        }
        return view;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        DialogC1340gx dialogC1340gx = new DialogC1340gx((Context) this.f3895a.get(), this, i);
        synchronized (this.f3896b) {
            StringItem stringItem = (StringItem) this.f3896b.get(i);
            dialogC1340gx.m3381a(stringItem.name, stringItem.value);
        }
        dialogC1340gx.show();
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public final boolean onItemLongClick(AdapterView adapterView, View view, int i, long j) {
        String str = ((StringItem) this.f3896b.get(i)).name;
        C1067a.m2519c(this.f3900f, str);
        Toast.makeText(this.f3900f, String.format(this.f3900f.getString(R.string.copied_to_clipboard), str), 0).show();
        return true;
    }
}
