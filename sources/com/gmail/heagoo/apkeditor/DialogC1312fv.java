package com.gmail.heagoo.apkeditor;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.gmail.heagoo.apkeditor.p092ac.C1119a;
import com.gmail.heagoo.apkeditor.p092ac.EditTextWithTip;
import com.gmail.heagoo.apkeditor.pro.R;
import com.gmail.heagoo.p084a.p089c.C1067a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.fv */
/* JADX INFO: loaded from: classes.dex */
public final class DialogC1312fv extends Dialog implements View.OnClickListener, AdapterView.OnItemLongClickListener, ExpandableListView.OnChildClickListener, ExpandableListView.OnGroupClickListener {

    /* JADX INFO: renamed from: a */
    private TextView f3830a;

    /* JADX INFO: renamed from: b */
    private EditTextWithTip f3831b;

    /* JADX INFO: renamed from: c */
    private ExpandableListView f3832c;

    /* JADX INFO: renamed from: d */
    private ViewOnClickListenerC1270ei f3833d;

    /* JADX INFO: renamed from: e */
    private LinearLayout f3834e;

    /* JADX INFO: renamed from: f */
    private WeakReference f3835f;

    /* JADX INFO: renamed from: g */
    private String f3836g;

    /* JADX INFO: renamed from: h */
    private List f3837h;

    /* JADX INFO: renamed from: i */
    private String f3838i;

    /* JADX INFO: renamed from: j */
    private boolean f3839j;

    /* JADX INFO: renamed from: k */
    private ArrayList f3840k;

    /* JADX INFO: renamed from: l */
    private C1119a f3841l;

    public DialogC1312fv(ApkInfoActivity apkInfoActivity, String str, List list, String str2, boolean z) {
        super(apkInfoActivity, R.style.Dialog_FullWindow);
        this.f3840k = new ArrayList();
        requestWindowFeature(1);
        this.f3835f = new WeakReference(apkInfoActivity);
        this.f3836g = str;
        this.f3837h = list;
        this.f3838i = str2;
        this.f3839j = z;
        if (!this.f3836g.endsWith("/")) {
            new StringBuilder().append(str).append("/");
        }
        View viewInflate = LayoutInflater.from(apkInfoActivity).inflate(R.layout.dialog_txt_searchresult, (ViewGroup) null);
        this.f3830a = (TextView) viewInflate.findViewById(R.id.title);
        this.f3831b = (EditTextWithTip) viewInflate.findViewById(R.id.et_replaceall);
        this.f3832c = (ExpandableListView) viewInflate.findViewById(R.id.lv_matchedfiles);
        this.f3834e = (LinearLayout) viewInflate.findViewById(R.id.searching_layout);
        this.f3832c.setVisibility(4);
        new AsyncTaskC1323gf(this, this.f3836g, this.f3837h, this.f3838i, this.f3839j).execute(new Object[0]);
        viewInflate.findViewById(R.id.btn_replaceall).setOnClickListener(this);
        this.f3841l = new C1119a(apkInfoActivity, "search_replace_with");
        ((EditTextWithTip) viewInflate.findViewById(R.id.et_replaceall)).setAdapter(this.f3841l);
        setContentView(viewInflate);
    }

    /* JADX INFO: renamed from: a */
    static /* synthetic */ void m3348a(DialogC1312fv dialogC1312fv, int i) {
        C1296ff c1296ff = ((ApkInfoActivity) dialogC1312fv.f3835f.get()).f2949e;
        String str = (String) dialogC1312fv.f3840k.get(i);
        int iLastIndexOf = str.lastIndexOf(47);
        c1296ff.m3311b(iLastIndexOf != -1 ? str.substring(0, iLastIndexOf) : "", str.substring(iLastIndexOf + 1), false);
        dialogC1312fv.f3833d.m3241c(i);
    }

    /* JADX INFO: renamed from: b */
    static /* synthetic */ void m3349b(DialogC1312fv dialogC1312fv) {
        dialogC1312fv.f3830a.setText(String.format(((ApkInfoActivity) dialogC1312fv.f3835f.get()).getString(R.string.str_files_found), Integer.valueOf(dialogC1312fv.f3840k.size()), dialogC1312fv.f3838i));
        dialogC1312fv.f3833d = new ViewOnClickListenerC1270ei(dialogC1312fv.f3835f, dialogC1312fv.f3832c, dialogC1312fv.f3836g, dialogC1312fv.f3840k, dialogC1312fv.f3838i);
        dialogC1312fv.f3832c.setAdapter(dialogC1312fv.f3833d);
        dialogC1312fv.f3832c.setOnGroupClickListener(dialogC1312fv);
        dialogC1312fv.f3832c.setOnChildClickListener(dialogC1312fv);
        dialogC1312fv.f3832c.setOnItemLongClickListener(dialogC1312fv);
        dialogC1312fv.f3832c.setVisibility(0);
        dialogC1312fv.f3834e.setVisibility(4);
    }

    /* JADX INFO: renamed from: b */
    static /* synthetic */ void m3350b(DialogC1312fv dialogC1312fv, int i) {
        if (i < dialogC1312fv.f3840k.size()) {
            ((ApkInfoActivity) dialogC1312fv.f3835f.get()).m2721h((String) dialogC1312fv.f3840k.get(i));
        }
    }

    /* JADX INFO: renamed from: c */
    static /* synthetic */ void m3351c(DialogC1312fv dialogC1312fv, int i) {
        if (i < dialogC1312fv.f3840k.size()) {
            ((ApkInfoActivity) dialogC1312fv.f3835f.get()).m2694a((String) dialogC1312fv.f3840k.get(i), new C1321gd(dialogC1312fv, i));
        }
    }

    /* JADX INFO: renamed from: a */
    protected final void m3357a(String str) {
        new DialogC1284ey((Activity) this.f3835f.get(), new C1315fy(this, str), -1);
    }

    /* JADX INFO: renamed from: b */
    public final void m3358b(String str) {
        ((ApkInfoActivity) this.f3835f.get()).m2695a(str, (String) null);
    }

    @Override // android.widget.ExpandableListView.OnChildClickListener
    public final boolean onChildClick(ExpandableListView expandableListView, View view, int i, int i2, long j) {
        Intent intentM2440a;
        ArrayList arrayListM3235a = this.f3833d.m3235a();
        C1269eh c1269eh = (C1269eh) this.f3833d.getChild(i, i2);
        if (c1269eh != null) {
            if (arrayListM3235a.size() > 100) {
                String str = (String) arrayListM3235a.get(i);
                ApkInfoActivity apkInfoActivity = (ApkInfoActivity) this.f3835f.get();
                intentM2440a = C1067a.m2439a(apkInfoActivity, str, apkInfoActivity.m2726l());
                C1067a.m2442a(intentM2440a, "startLine", new StringBuilder().append(c1269eh.f3675a).toString());
            } else {
                ApkInfoActivity apkInfoActivity2 = (ApkInfoActivity) this.f3835f.get();
                intentM2440a = C1067a.m2440a(apkInfoActivity2, arrayListM3235a, i, apkInfoActivity2.m2726l());
                C1067a.m2443a(intentM2440a, "fileList", arrayListM3235a);
                C1067a.m2441a(intentM2440a, "curFileIndex", i);
                ArrayList<Integer> arrayList = new ArrayList<>(arrayListM3235a.size());
                for (int i3 = 0; i3 < i; i3++) {
                    arrayList.add(-1);
                }
                arrayList.add(Integer.valueOf(c1269eh.f3675a));
                for (int i4 = i + 1; i4 < arrayListM3235a.size(); i4++) {
                    arrayList.add(-1);
                }
                Bundle bundle = new Bundle();
                bundle.putIntegerArrayList("startLineList", arrayList);
                intentM2440a.putExtras(bundle);
            }
            C1067a.m2442a(intentM2440a, "searchString", this.f3838i);
            ((ApkInfoActivity) this.f3835f.get()).startActivityForResult(intentM2440a, 0);
        }
        return false;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view.getId() == R.id.btn_replaceall) {
            String string = this.f3831b.getText().toString();
            AlertDialog.Builder builder = new AlertDialog.Builder((Context) this.f3835f.get());
            builder.setMessage(String.format(((ApkInfoActivity) this.f3835f.get()).getString(R.string.sure_to_replace_all), this.f3838i, string));
            builder.setPositiveButton(android.R.string.ok, new DialogInterfaceOnClickListenerC1313fw(this, string));
            builder.setNegativeButton(android.R.string.cancel, new DialogInterfaceOnClickListenerC1314fx(this));
            builder.show();
        }
    }

    @Override // android.widget.ExpandableListView.OnGroupClickListener
    public final boolean onGroupClick(ExpandableListView expandableListView, View view, int i, long j) {
        if (expandableListView.isGroupExpanded(i) || this.f3833d.m3238a(i)) {
            return false;
        }
        new AsyncTaskC1322ge(this, (String) this.f3833d.getGroup(i), this.f3833d.m3239b(), i).execute(new Object[0]);
        return true;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public final boolean onItemLongClick(AdapterView adapterView, View view, int i, long j) {
        if (ExpandableListView.getPackedPositionType(j) != 0) {
            return true;
        }
        adapterView.setOnCreateContextMenuListener(new ViewOnCreateContextMenuListenerC1316fz(this, ExpandableListView.getPackedPositionGroup(j)));
        return false;
    }
}
