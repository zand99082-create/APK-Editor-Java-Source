package com.gmail.heagoo.apkeditor;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Environment;
import android.preference.PreferenceManager;
import android.support.v4.content.ContextCompat;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.gmail.heagoo.apkeditor.pro.R;
import com.gmail.heagoo.common.C1552a;
import com.gmail.heagoo.p084a.p089c.C1067a;
import com.gmail.heagoo.p100b.C1533a;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import p000a.p001a.p003b.p004a.C0037k;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.cn */
/* JADX INFO: loaded from: classes.dex */
public final class DialogC1197cn extends Dialog implements View.OnClickListener, AdapterView.OnItemClickListener, AdapterView.OnItemLongClickListener {

    /* JADX INFO: renamed from: a */
    private C1296ff f3502a;

    /* JADX INFO: renamed from: b */
    private String f3503b;

    /* JADX INFO: renamed from: c */
    private boolean f3504c;

    /* JADX INFO: renamed from: d */
    private boolean f3505d;

    /* JADX INFO: renamed from: e */
    private String f3506e;

    /* JADX INFO: renamed from: f */
    private TextView f3507f;

    /* JADX INFO: renamed from: g */
    private TextView f3508g;

    /* JADX INFO: renamed from: h */
    private CheckBox f3509h;

    /* JADX INFO: renamed from: i */
    private InterfaceC1204cu f3510i;

    /* JADX INFO: renamed from: j */
    private Context f3511j;

    public DialogC1197cn(Context context, InterfaceC1204cu interfaceC1204cu, String str, String str2, String str3) {
        this(context, interfaceC1204cu, str, str2, str3, false, false, false, null);
    }

    public DialogC1197cn(Context context, InterfaceC1204cu interfaceC1204cu, String str, String str2, String str3, boolean z, boolean z2, boolean z3, String str4) {
        this(context, interfaceC1204cu, str, str2, str3, z, z2, z3, str4, null);
    }

    @SuppressLint({"InflateParams"})
    public DialogC1197cn(Context context, InterfaceC1204cu interfaceC1204cu, String str, String str2, String str3, boolean z, boolean z2, boolean z3, String str4, String str5) {
        super(context);
        super.requestWindowFeature(1);
        this.f3511j = context;
        this.f3510i = interfaceC1204cu;
        this.f3503b = str2;
        this.f3504c = z;
        this.f3505d = z2;
        this.f3506e = str4;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.dlg_fileselect, (ViewGroup) null, false);
        Button button = (Button) viewInflate.findViewById(R.id.confirm);
        if (z) {
            button.setVisibility(0);
            button.setOnClickListener(this);
        } else {
            button.setVisibility(8);
        }
        String string = PreferenceManager.getDefaultSharedPreferences(context).getString(str4 != null ? str4 + "_lastDirectory" : "lastDirectory", "");
        string = new File(string).exists() ? string : str5 == null ? Environment.getExternalStorageDirectory().getPath() : str5;
        this.f3507f = (TextView) viewInflate.findViewById(R.id.tv_title);
        this.f3508g = (TextView) viewInflate.findViewById(R.id.tv_subtitle);
        this.f3507f.setText(str3 == null ? str != null ? context.getString(R.string.select_file_replace) + " (" + str + ")" : context.getString(R.string.select_file_replace) : str3);
        this.f3508g.setText(string);
        ListView listView = (ListView) viewInflate.findViewById(R.id.file_list);
        this.f3502a = new C1296ff(context, null, string, "/", new C1202cs(this));
        listView.setAdapter((ListAdapter) this.f3502a);
        listView.setOnItemClickListener(this);
        listView.setOnItemLongClickListener(this);
        this.f3509h = (CheckBox) viewInflate.findViewById(R.id.cb_edit_before_replace);
        if (z3) {
            this.f3509h.setText(String.format(context.getString(R.string.edit_before_replace), C1067a.m2546l(str2)));
            this.f3509h.setChecked(PreferenceManager.getDefaultSharedPreferences(this.f3511j).getBoolean(this.f3506e != null ? this.f3506e + "_editBeforeReplace" : "editBeforeReplace", false));
            this.f3509h.setVisibility(0);
        } else {
            this.f3509h.setVisibility(8);
        }
        ((Button) viewInflate.findViewById(R.id.close)).setOnClickListener(this);
        setContentView(viewInflate);
    }

    /* JADX INFO: renamed from: a */
    static /* synthetic */ void m3111a(DialogC1197cn dialogC1197cn) {
        String strM3300a = dialogC1197cn.f3502a.m3300a((List) null);
        float f = dialogC1197cn.f3511j.getResources().getDisplayMetrics().density;
        int i = (int) ((20.0f * f) + 0.5f);
        AlertDialog.Builder builder = new AlertDialog.Builder(dialogC1197cn.f3511j);
        builder.setTitle(R.string.new_folder);
        LinearLayout linearLayout = new LinearLayout(dialogC1197cn.f3511j);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(i, (int) ((f * 8.0f) + 0.5f), i, 0);
        EditText editText = new EditText(dialogC1197cn.f3511j);
        editText.setFilters(new InputFilter[]{C1552a.m3749a()});
        editText.setHint(R.string.pls_input_foldername);
        editText.setTextColor(ContextCompat.getColor(dialogC1197cn.f3511j, C0037k.mdTextMedium(C0037k.m89a(dialogC1197cn.f3511j))));
        editText.setTextSize(1, 14);
        editText.setLayoutParams(layoutParams);
        linearLayout.addView(editText);
        builder.setView(linearLayout);
        builder.setPositiveButton(android.R.string.ok, new DialogInterfaceOnClickListenerC1200cq(dialogC1197cn, editText, strM3300a));
        builder.setNegativeButton(android.R.string.cancel, new DialogInterfaceOnClickListenerC1201cr(dialogC1197cn));
        builder.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public boolean m3113a(String str) {
        return this.f3510i.mo2765a(str, this.f3503b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m3116b(String str) {
        SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(this.f3511j).edit();
        editorEdit.putString(this.f3506e != null ? this.f3506e + "_lastDirectory" : "lastDirectory", str);
        editorEdit.apply();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id = view.getId();
        if (id == R.id.close) {
            dismiss();
            return;
        }
        if (id == R.id.confirm) {
            String strM3300a = this.f3502a.m3300a((List) null);
            if (this.f3505d) {
                new AlertDialog.Builder(this.f3511j).setTitle(R.string.confirm_dir_replace).setMessage(this.f3510i.mo2766b(strM3300a, this.f3503b)).setPositiveButton(R.string.yes, new DialogInterfaceOnClickListenerC1203ct(this, strM3300a)).setNegativeButton(android.R.string.cancel, (DialogInterface.OnClickListener) null).show();
                return;
            }
            this.f3510i.mo2764a(strM3300a, this.f3503b, this.f3509h.isChecked());
            m3116b(strM3300a);
            dismiss();
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        ArrayList arrayList = new ArrayList();
        String strM3300a = this.f3502a.m3300a(arrayList);
        C1533a c1533a = (C1533a) arrayList.get(i);
        if (c1533a == null) {
            return;
        }
        if (c1533a.f4595b) {
            this.f3502a.m3313c(c1533a.f4594a.equals("..") ? strM3300a.substring(0, strM3300a.lastIndexOf(47)) : strM3300a + "/" + c1533a.f4594a);
            this.f3508g.setText(this.f3502a.m3300a((List) null));
            return;
        }
        if (this.f3504c || !m3113a(c1533a.f4594a)) {
            return;
        }
        String str = strM3300a + "/" + c1533a.f4594a;
        boolean zIsChecked = this.f3509h.isChecked();
        this.f3510i.mo2764a(str, this.f3503b, zIsChecked);
        m3116b(strM3300a);
        SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(this.f3511j).edit();
        editorEdit.putBoolean(this.f3506e != null ? this.f3506e + "_editBeforeReplace" : "editBeforeReplace", zIsChecked);
        editorEdit.apply();
        dismiss();
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public final boolean onItemLongClick(AdapterView adapterView, View view, int i, long j) {
        adapterView.setOnCreateContextMenuListener(new ViewOnCreateContextMenuListenerC1198co(this));
        return false;
    }
}
