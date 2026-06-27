package com.gmail.heagoo.apkeditor;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ExpandableListView;
import com.android.apksig.apk.ApkUtils;
import com.gmail.heagoo.apkeditor.pro.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.fc */
/* JADX INFO: loaded from: classes.dex */
public final class C1293fc {

    /* JADX INFO: renamed from: a */
    private Context f3749a;

    /* JADX INFO: renamed from: b */
    private CheckBox f3750b;

    /* JADX INFO: renamed from: c */
    private CheckBox f3751c;

    /* JADX INFO: renamed from: d */
    private CheckBox f3752d;

    /* JADX INFO: renamed from: e */
    private boolean f3753e;

    /* JADX INFO: renamed from: f */
    private boolean f3754f;

    /* JADX INFO: renamed from: g */
    private boolean f3755g;

    /* JADX INFO: renamed from: h */
    private int f3756h = 0;

    /* JADX INFO: renamed from: i */
    private int f3757i = 0;

    /* JADX INFO: renamed from: j */
    private int f3758j = 0;

    /* JADX INFO: renamed from: k */
    private int f3759k = 0;

    /* JADX INFO: renamed from: l */
    private int f3760l = 0;

    /* JADX INFO: renamed from: m */
    private int f3761m = 0;

    /* JADX INFO: renamed from: n */
    private Map f3762n;

    /* JADX INFO: renamed from: o */
    private Map f3763o;

    /* JADX INFO: renamed from: p */
    private Map f3764p;

    /* JADX INFO: renamed from: q */
    private Set f3765q;

    public C1293fc(Context context, boolean z, boolean z2, Map map, Map map2, Set set) {
        this.f3749a = context;
        this.f3753e = z;
        this.f3754f = z2;
        m3273a(map, map2, set);
    }

    /* JADX INFO: renamed from: a */
    private void m3273a(Map map, Map map2, Set set) {
        this.f3755g = false;
        this.f3765q = new HashSet();
        this.f3762n = new HashMap();
        this.f3763o = new HashMap();
        this.f3764p = new HashMap();
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            String str = (String) ((Map.Entry) it.next()).getKey();
            if (str.startsWith("res/")) {
                if (!this.f3755g && !ApkInfoActivity.m2661b(str)) {
                    this.f3755g = true;
                }
                this.f3756h++;
            } else {
                String strM2643a = ApkInfoActivity.m2643a(str, this.f3765q);
                if (strM2643a != null) {
                    Integer num = (Integer) this.f3762n.get(strM2643a);
                    if (num == null) {
                        this.f3762n.put(strM2643a, 1);
                    } else {
                        this.f3762n.put(strM2643a, Integer.valueOf(num.intValue() + 1));
                    }
                } else {
                    this.f3759k++;
                }
            }
        }
        Iterator it2 = map2.entrySet().iterator();
        while (it2.hasNext()) {
            String str2 = (String) ((Map.Entry) it2.next()).getKey();
            if (str2.equals(ApkUtils.ANDROID_MANIFEST_ZIP_ENTRY_NAME) || str2.startsWith("res/")) {
                if (!this.f3755g && !ApkInfoActivity.m2661b(str2)) {
                    this.f3755g = true;
                }
                this.f3758j++;
            } else {
                String strM2643a2 = ApkInfoActivity.m2643a(str2, this.f3765q);
                if (strM2643a2 != null) {
                    Integer num2 = (Integer) this.f3764p.get(strM2643a2);
                    if (num2 == null) {
                        this.f3764p.put(strM2643a2, 1);
                    } else {
                        this.f3764p.put(strM2643a2, Integer.valueOf(num2.intValue() + 1));
                    }
                } else {
                    this.f3761m++;
                }
            }
        }
        Iterator it3 = set.iterator();
        while (it3.hasNext()) {
            String str3 = (String) it3.next();
            if (str3.startsWith("res/")) {
                if (!this.f3755g && !ApkInfoActivity.m2661b(str3)) {
                    this.f3755g = true;
                }
                this.f3757i++;
            } else {
                String strM2643a3 = ApkInfoActivity.m2643a(str3, this.f3765q);
                if (strM2643a3 != null) {
                    Integer num3 = (Integer) this.f3763o.get(strM2643a3);
                    if (num3 == null) {
                        this.f3763o.put(strM2643a3, 1);
                    } else {
                        this.f3763o.put(strM2643a3, Integer.valueOf(num3.intValue() + 1));
                    }
                } else {
                    this.f3760l++;
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private List m3275b() {
        ArrayList arrayList = new ArrayList();
        if (this.f3753e) {
            arrayList.add(new C1276eq(this.f3749a.getString(R.string.string), -1, -1, -1));
        } else {
            arrayList.add(new C1276eq(this.f3749a.getString(R.string.string), 0, 0, 0));
        }
        arrayList.add(new C1276eq(this.f3749a.getString(R.string.resource), this.f3756h, this.f3757i, this.f3758j));
        if (this.f3754f) {
            arrayList.add(new C1276eq(this.f3749a.getString(R.string.manifest), -1, -1, -1));
        } else {
            arrayList.add(new C1276eq(this.f3749a.getString(R.string.manifest), 0, 0, 0));
        }
        for (String str : this.f3765q) {
            Integer num = (Integer) this.f3762n.get(str);
            Integer num2 = (Integer) this.f3763o.get(str);
            Integer num3 = (Integer) this.f3764p.get(str);
            arrayList.add(new C1276eq(str, num == null ? 0 : num.intValue(), num2 == null ? 0 : num2.intValue(), num3 == null ? 0 : num3.intValue()));
        }
        if (this.f3759k > 0 || this.f3760l > 0 || this.f3761m > 0) {
            arrayList.add(new C1276eq(this.f3749a.getString(R.string.others), this.f3759k, this.f3760l, this.f3761m));
        }
        return arrayList;
    }

    @SuppressLint({"InflateParams"})
    /* JADX INFO: renamed from: a */
    public final void m3276a() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f3749a);
        builder.setTitle(R.string.rebuild_the_apk);
        View viewInflate = LayoutInflater.from(this.f3749a).inflate(R.layout.dlg_rebuild_confirm, (ViewGroup) null);
        ExpandableListView expandableListView = (ExpandableListView) viewInflate.findViewById(R.id.modificationList);
        List listM3275b = m3275b();
        expandableListView.setAdapter(new C1275ep(this.f3749a, listM3275b));
        for (int i = 0; i < listM3275b.size(); i++) {
            expandableListView.expandGroup(i);
        }
        this.f3750b = (CheckBox) viewInflate.findViewById(R.id.cb_rebuild_dex);
        this.f3751c = (CheckBox) viewInflate.findViewById(R.id.cb_rebuild_res);
        this.f3752d = (CheckBox) viewInflate.findViewById(R.id.cb_resign);
        this.f3750b.setChecked(!this.f3765q.isEmpty());
        this.f3751c.setChecked(this.f3753e || this.f3754f || this.f3755g);
        this.f3750b.setEnabled(false);
        this.f3751c.setEnabled(false);
        this.f3752d.setChecked(true);
        builder.setView(viewInflate);
        builder.setPositiveButton(android.R.string.ok, new DialogInterfaceOnClickListenerC1294fd(this));
        builder.setNegativeButton(android.R.string.cancel, new DialogInterfaceOnClickListenerC1295fe(this));
        builder.show();
    }
}
