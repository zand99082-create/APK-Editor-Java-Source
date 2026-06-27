package com.gmail.heagoo.apkeditor;

import android.app.Dialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.gmail.heagoo.apkeditor.pro.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.fo */
/* JADX INFO: loaded from: classes.dex */
public final class DialogC1305fo extends Dialog implements View.OnClickListener, AdapterView.OnItemClickListener, AdapterView.OnItemLongClickListener, InterfaceC1304fn {

    /* JADX INFO: renamed from: a */
    private WeakReference f3803a;

    /* JADX INFO: renamed from: b */
    private TextView f3804b;

    /* JADX INFO: renamed from: c */
    private View f3805c;

    /* JADX INFO: renamed from: d */
    private TextView f3806d;

    /* JADX INFO: renamed from: e */
    private ListView f3807e;

    /* JADX INFO: renamed from: f */
    private C1267ef f3808f;

    /* JADX INFO: renamed from: g */
    private LinearLayout f3809g;

    /* JADX INFO: renamed from: h */
    private Button f3810h;

    /* JADX INFO: renamed from: i */
    private Button f3811i;

    /* JADX INFO: renamed from: j */
    private View f3812j;

    /* JADX INFO: renamed from: k */
    private View f3813k;

    /* JADX INFO: renamed from: l */
    private String f3814l;

    /* JADX INFO: renamed from: m */
    private List f3815m;

    /* JADX INFO: renamed from: n */
    private String f3816n;

    /* JADX INFO: renamed from: o */
    private boolean f3817o;

    /* JADX INFO: renamed from: p */
    private ArrayList f3818p;

    public DialogC1305fo(ApkInfoActivity apkInfoActivity, String str, List list, String str2, boolean z) {
        super(apkInfoActivity, R.style.Dialog_FullWindow);
        this.f3818p = new ArrayList();
        new HashSet();
        requestWindowFeature(1);
        this.f3803a = new WeakReference(apkInfoActivity);
        this.f3814l = str;
        this.f3815m = list;
        this.f3816n = str2;
        this.f3817o = z;
        if (!this.f3814l.endsWith("/")) {
            new StringBuilder().append(str).append("/");
        }
        View viewInflate = LayoutInflater.from(apkInfoActivity).inflate(R.layout.dlg_filename_searchret, (ViewGroup) null);
        this.f3804b = (TextView) viewInflate.findViewById(R.id.title);
        this.f3805c = viewInflate.findViewById(R.id.res_header_selection);
        this.f3806d = (TextView) viewInflate.findViewById(R.id.selection_tip);
        this.f3807e = (ListView) viewInflate.findViewById(R.id.file_list);
        this.f3809g = (LinearLayout) viewInflate.findViewById(R.id.searching_layout);
        this.f3812j = viewInflate.findViewById(R.id.menu_done);
        this.f3813k = viewInflate.findViewById(R.id.menu_select);
        this.f3812j.setOnClickListener(this);
        this.f3813k.setOnClickListener(this);
        this.f3810h = (Button) viewInflate.findViewById(R.id.btn_close);
        this.f3811i = (Button) viewInflate.findViewById(R.id.btn_delete);
        this.f3810h.setOnClickListener(this);
        this.f3811i.setOnClickListener(this);
        this.f3807e.setVisibility(4);
        new AsyncTaskC1311fu(this, this.f3814l, this.f3815m, this.f3816n).execute(new Object[0]);
        setContentView(viewInflate);
    }

    /* JADX INFO: renamed from: a */
    private void m3335a() {
        this.f3804b.setVisibility(0);
        this.f3805c.setVisibility(8);
        this.f3811i.setVisibility(8);
        this.f3804b.setText(String.format(((ApkInfoActivity) this.f3803a.get()).getString(R.string.str_files_found), Integer.valueOf(this.f3818p.size()), this.f3816n));
    }

    /* JADX INFO: renamed from: a */
    static /* synthetic */ void m3336a(DialogC1305fo dialogC1305fo, int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(i));
        dialogC1305fo.m3337a(arrayList);
    }

    /* JADX INFO: renamed from: a */
    private void m3337a(List list) {
        C1296ff c1296ff = ((ApkInfoActivity) this.f3803a.get()).f2949e;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) this.f3818p.get(((Integer) it.next()).intValue());
            int iLastIndexOf = str.lastIndexOf(47);
            c1296ff.m3311b(iLastIndexOf != -1 ? str.substring(0, iLastIndexOf) : "", str.substring(iLastIndexOf + 1), false);
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f3818p.size(); i++) {
            if (!list.contains(Integer.valueOf(i))) {
                arrayList.add(this.f3818p.get(i));
            }
        }
        this.f3818p = arrayList;
        this.f3808f.m3224a(this.f3818p, list);
        if (this.f3808f.m3228e()) {
            m3335a();
        }
    }

    /* JADX INFO: renamed from: b */
    static /* synthetic */ void m3340b(DialogC1305fo dialogC1305fo, int i) {
        if (i < dialogC1305fo.f3818p.size()) {
            ((ApkInfoActivity) dialogC1305fo.f3803a.get()).m2721h((String) dialogC1305fo.f3818p.get(i));
        }
    }

    /* JADX INFO: renamed from: c */
    static /* synthetic */ void m3341c(DialogC1305fo dialogC1305fo) {
        dialogC1305fo.f3804b.setText(String.format(((ApkInfoActivity) dialogC1305fo.f3803a.get()).getString(R.string.str_files_found), Integer.valueOf(dialogC1305fo.f3818p.size()), dialogC1305fo.f3816n));
        dialogC1305fo.f3808f = new C1267ef((ApkInfoActivity) dialogC1305fo.f3803a.get(), dialogC1305fo, dialogC1305fo.f3814l, dialogC1305fo.f3818p);
        dialogC1305fo.f3807e.setAdapter((ListAdapter) dialogC1305fo.f3808f);
        dialogC1305fo.f3807e.setOnItemClickListener(dialogC1305fo);
        dialogC1305fo.f3807e.setOnItemLongClickListener(dialogC1305fo);
        dialogC1305fo.f3807e.setVisibility(0);
        dialogC1305fo.f3809g.setVisibility(4);
    }

    /* JADX INFO: renamed from: c */
    static /* synthetic */ void m3342c(DialogC1305fo dialogC1305fo, int i) {
        if (i < dialogC1305fo.f3818p.size()) {
            ((ApkInfoActivity) dialogC1305fo.f3803a.get()).m2694a((String) dialogC1305fo.f3818p.get(i), new C1306fp(dialogC1305fo));
        }
    }

    @Override // com.gmail.heagoo.apkeditor.InterfaceC1304fn
    /* JADX INFO: renamed from: b */
    public final void mo2707b(Set set) {
        if (set.isEmpty()) {
            m3335a();
            return;
        }
        this.f3806d.setText(String.format(((ApkInfoActivity) this.f3803a.get()).getString(R.string.num_items_selected), Integer.valueOf(set.size())));
        this.f3804b.setVisibility(8);
        this.f3805c.setVisibility(0);
        this.f3811i.setVisibility(0);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id = view.getId();
        if (id == R.id.btn_close) {
            dismiss();
            return;
        }
        if (id == R.id.btn_delete) {
            m3337a(this.f3808f.m3223a());
            return;
        }
        if (id == R.id.menu_done) {
            this.f3808f.m3226c();
            m3335a();
        } else if (id == R.id.menu_select) {
            if (!this.f3808f.m3227d()) {
                this.f3808f.m3225b();
            } else {
                this.f3808f.m3226c();
                m3335a();
            }
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        String str;
        int iLastIndexOf;
        if (i < this.f3818p.size() && (iLastIndexOf = (str = (String) this.f3818p.get(i)).lastIndexOf("/")) != -1) {
            ((ApkInfoActivity) this.f3803a.get()).m2698a(str.substring(0, iLastIndexOf), str.substring(iLastIndexOf + 1), false);
        }
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public final boolean onItemLongClick(AdapterView adapterView, View view, int i, long j) {
        adapterView.setOnCreateContextMenuListener(new ViewOnCreateContextMenuListenerC1307fq(this, i));
        return false;
    }
}
