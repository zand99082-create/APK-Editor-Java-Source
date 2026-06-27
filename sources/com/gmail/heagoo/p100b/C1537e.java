package com.gmail.heagoo.p100b;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.text.InputFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;
import com.gmail.heagoo.apkeditor.pro.R;
import com.gmail.heagoo.common.C1552a;
import com.gmail.heagoo.common.C1559h;
import com.gmail.heagoo.p084a.p089c.C1067a;
import com.gmail.heagoo.p084a.p089c.C1069b;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p000a.p001a.p003b.p004a.C0037k;

/* JADX INFO: renamed from: com.gmail.heagoo.b.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1537e implements AdapterView.OnItemClickListener, AdapterView.OnItemLongClickListener {

    /* JADX INFO: renamed from: a */
    private Context f4605a;

    /* JADX INFO: renamed from: b */
    private ListView f4606b;

    /* JADX INFO: renamed from: c */
    private String f4607c;

    /* JADX INFO: renamed from: d */
    private String f4608d;

    /* JADX INFO: renamed from: e */
    private C1535c f4609e;

    /* JADX INFO: renamed from: f */
    private InterfaceC1546n f4610f;

    public C1537e(Context context, ListView listView, String str, String str2, InterfaceC1546n interfaceC1546n, InterfaceC1547o interfaceC1547o) {
        this.f4605a = context;
        this.f4606b = listView;
        this.f4608d = str;
        this.f4607c = str2;
        this.f4610f = interfaceC1546n;
        this.f4609e = new C1535c(this.f4605a, this.f4607c, this.f4608d, interfaceC1547o);
        this.f4606b.setAdapter((ListAdapter) this.f4609e);
        this.f4606b.setOnItemClickListener(this);
        this.f4606b.setOnItemLongClickListener(this);
    }

    /* JADX INFO: renamed from: a */
    static /* synthetic */ void m3735a(C1537e c1537e) {
        String strM3732a = c1537e.f4609e.m3732a((List) null);
        float f = c1537e.f4605a.getResources().getDisplayMetrics().density;
        int i = (int) ((8.0f * f) + 0.5f);
        int i2 = (int) ((f * 20.0f) + 0.5f);
        AlertDialog.Builder builder = new AlertDialog.Builder(c1537e.f4605a);
        builder.setTitle(R.string.new_file);
        LinearLayout linearLayout = new LinearLayout(c1537e.f4605a);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(i2, i, i2, 0);
        EditText editText = new EditText(c1537e.f4605a);
        editText.setFilters(new InputFilter[]{C1552a.m3749a()});
        editText.setHint(R.string.pls_input_filename);
        editText.setTextColor(ContextCompat.getColor(c1537e.f4605a, C0037k.mdTextMedium(C0037k.m89a(c1537e.f4605a))));
        editText.setTextSize(1, 14);
        editText.setLayoutParams(layoutParams);
        linearLayout.addView(editText);
        builder.setView(linearLayout);
        builder.setPositiveButton(android.R.string.ok, new DialogInterfaceOnClickListenerC1544l(c1537e, editText, strM3732a));
        builder.setNegativeButton(android.R.string.cancel, new DialogInterfaceOnClickListenerC1545m(c1537e));
        builder.show();
    }

    /* JADX INFO: renamed from: a */
    static /* synthetic */ void m3736a(C1537e c1537e, int i) {
        ArrayList arrayList = new ArrayList();
        String strM3732a = c1537e.f4609e.m3732a(arrayList);
        C1533a c1533a = (C1533a) arrayList.get(i);
        if (c1533a != null) {
            String str = c1533a.f4594a;
            if (m3739b(strM3732a + "/" + c1533a.f4594a)) {
                c1537e.f4609e.m3734b(str);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    static /* synthetic */ void m3738b(C1537e c1537e, int i) {
        float f = c1537e.f4605a.getResources().getDisplayMetrics().density;
        int i2 = (int) ((8.0f * f) + 0.5f);
        int i3 = (int) ((f * 20.0f) + 0.5f);
        AlertDialog.Builder builder = new AlertDialog.Builder(c1537e.f4605a);
        builder.setTitle(R.string.rename);
        LinearLayout linearLayout = new LinearLayout(c1537e.f4605a);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(i3, i2, i3, 0);
        EditText editText = new EditText(c1537e.f4605a);
        editText.setHint(R.string.pls_input_filename);
        editText.setTextColor(ContextCompat.getColor(c1537e.f4605a, C0037k.mdTextMedium(C0037k.m89a(c1537e.f4605a))));
        editText.setTextSize(1, 14);
        editText.setLayoutParams(layoutParams);
        linearLayout.addView(editText);
        ArrayList arrayList = new ArrayList();
        String strM3732a = c1537e.f4609e.m3732a(arrayList);
        C1533a c1533a = (C1533a) arrayList.get(i);
        if (c1533a != null) {
            String str = c1533a.f4594a;
            editText.setText(str);
            builder.setView(linearLayout);
            builder.setPositiveButton(android.R.string.ok, new DialogInterfaceOnClickListenerC1542j(c1537e, editText, strM3732a, str));
            builder.setNegativeButton(android.R.string.cancel, new DialogInterfaceOnClickListenerC1543k(c1537e));
            builder.show();
        }
    }

    /* JADX INFO: renamed from: b */
    private static boolean m3739b(String str) {
        File file = new File(str);
        if (!file.exists()) {
            return false;
        }
        if (file.isFile()) {
            return file.delete();
        }
        try {
            C1559h.m3770a(file);
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    /* JADX INFO: renamed from: d */
    static /* synthetic */ void m3741d(C1537e c1537e, int i) throws Throwable {
        ArrayList arrayList = new ArrayList();
        String strM3732a = c1537e.f4609e.m3732a(arrayList);
        C1533a c1533a = (C1533a) arrayList.get(i);
        if (c1533a != null) {
            String str = c1533a.f4594a;
            C1067a.m2466a(c1537e.f4605a, strM3732a + "/" + c1533a.f4594a);
        }
    }

    /* JADX INFO: renamed from: e */
    static /* synthetic */ void m3742e(C1537e c1537e, int i) {
        ArrayList arrayList = new ArrayList();
        String strM3732a = c1537e.f4609e.m3732a(arrayList);
        C1533a c1533a = (C1533a) arrayList.get(i);
        if (c1533a != null) {
            String str = c1533a.f4594a;
            C1067a.m2493aa(c1537e.f4605a, strM3732a + "/" + c1533a.f4594a);
        }
    }

    /* JADX INFO: renamed from: f */
    static /* synthetic */ void m3743f(C1537e c1537e, int i) {
        ArrayList arrayList = new ArrayList();
        String strM3732a = c1537e.f4609e.m3732a(arrayList);
        C1533a c1533a = (C1533a) arrayList.get(i);
        if (c1533a != null) {
            String str = c1533a.f4594a;
            C1069b.sign(c1537e.f4605a, strM3732a + "/" + c1533a.f4594a);
        }
    }

    /* JADX INFO: renamed from: g */
    static /* synthetic */ void m3744g(C1537e c1537e, int i) {
        ArrayList arrayList = new ArrayList();
        String strM3732a = c1537e.f4609e.m3732a(arrayList);
        C1533a c1533a = (C1533a) arrayList.get(i);
        if (c1533a != null) {
            String str = c1533a.f4594a;
            C1069b.checkSign(c1537e.f4605a, strM3732a + "/" + c1533a.f4594a);
        }
    }

    /* JADX INFO: renamed from: a */
    public final C1535c m3745a() {
        return this.f4609e;
    }

    /* JADX INFO: renamed from: a */
    public final void m3746a(String str) {
        String strM3732a = this.f4609e.m3732a((List) null);
        this.f4609e.m3733a(str);
        String strM3732a2 = this.f4609e.m3732a((List) null);
        if (strM3732a2.equals(strM3732a)) {
            return;
        }
        this.f4610f.mo2778a(strM3732a2);
    }

    /* JADX INFO: renamed from: a */
    protected final boolean m3747a(String str, String str2, String str3) {
        File file = new File(str + "/" + str3);
        if (file.exists()) {
            Toast.makeText(this.f4605a, String.format(this.f4605a.getResources().getString(R.string.file_already_exist), str3), 0).show();
            return false;
        }
        boolean zRenameTo = new File(str + "/" + str2).renameTo(file);
        Toast.makeText(this.f4605a, this.f4605a.getResources().getString(R.string.rename) + " " + this.f4605a.getResources().getString(zRenameTo ? R.string.succeed : R.string.failed), 0).show();
        return zRenameTo;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        Context context;
        Intent intentM2529e;
        ArrayList arrayList = new ArrayList();
        String strM3732a = this.f4609e.m3732a(arrayList);
        C1533a c1533a = (C1533a) arrayList.get(i);
        if (c1533a == null) {
            return;
        }
        if (c1533a.f4595b) {
            this.f4609e.m3733a(c1533a.f4594a.equals("..") ? strM3732a.substring(0, strM3732a.lastIndexOf(47)) : strM3732a + "/" + c1533a.f4594a);
        } else {
            String str = strM3732a + "/" + c1533a.f4594a;
            if (!this.f4610f.mo2780b(str) && (intentM2529e = C1067a.m2529e((context = this.f4605a), str)) != null) {
                context.startActivity(intentM2529e);
            }
        }
        String strM3732a2 = this.f4609e.m3732a((List) null);
        if (strM3732a2.equals(strM3732a)) {
            return;
        }
        this.f4610f.mo2778a(strM3732a2);
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public final boolean onItemLongClick(AdapterView adapterView, View view, int i, long j) {
        if (i == 0) {
            return true;
        }
        adapterView.setOnCreateContextMenuListener(new ViewOnCreateContextMenuListenerC1538f(this, i));
        return false;
    }
}
