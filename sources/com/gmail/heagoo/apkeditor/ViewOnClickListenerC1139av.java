package com.gmail.heagoo.apkeditor;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.gmail.heagoo.apkeditor.p092ac.C1119a;
import com.gmail.heagoo.apkeditor.p092ac.EditTextWithTip;
import com.gmail.heagoo.apkeditor.pro.R;
import com.gmail.heagoo.common.C1570s;
import com.gmail.heagoo.p084a.p089c.C1067a;
import com.gmail.heagoo.p100b.C1533a;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.zip.ZipFile;
import p000a.p001a.p003b.p004a.C0037k;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.av */
/* JADX INFO: loaded from: classes.dex */
final class ViewOnClickListenerC1139av implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ ApkInfoExActivity f3354a;

    ViewOnClickListenerC1139av(ApkInfoExActivity apkInfoExActivity) {
        this.f3354a = apkInfoExActivity;
    }

    /* JADX INFO: renamed from: a */
    private AlertDialog m3027a(String str, C1533a c1533a, int i) throws Throwable {
        String str2;
        ZipFile zipFile;
        ZipFile zipFile2 = null;
        String str3 = c1533a.f4594a;
        String str4 = str + "/" + c1533a.f4594a;
        String strSubstring = str4.substring(this.f3354a.f2946b.length() + 1);
        if (str4.startsWith(this.f3354a.f2946b + "/")) {
            String strSubstring2 = str4.substring(this.f3354a.f2946b.length() + 1);
            String str5 = this.f3354a.f2955k != null ? (String) this.f3354a.f2955k.get(strSubstring2) : null;
            if (str5 == null) {
                str5 = strSubstring2;
            }
            try {
                zipFile = new ZipFile(this.f3354a.f2914a);
                try {
                    try {
                        if (zipFile.getEntry(str5) == null) {
                            str5 = null;
                        }
                        m3029a(zipFile);
                        str2 = str5;
                    } catch (Throwable th) {
                        th = th;
                        zipFile2 = zipFile;
                        m3029a(zipFile2);
                        throw th;
                    }
                } catch (Exception e) {
                    e = e;
                    e.printStackTrace();
                    m3029a(zipFile);
                    str2 = null;
                }
            } catch (Exception e2) {
                e = e2;
                zipFile = null;
            } catch (Throwable th2) {
                th = th2;
                m3029a(zipFile2);
                throw th;
            }
        } else {
            str2 = null;
        }
        View viewInflate = LayoutInflater.from(this.f3354a).inflate(R.layout.dlg_resfile_more, (ViewGroup) null);
        EditText editText = (EditText) viewInflate.findViewById(R.id.filename);
        editText.setText(str3);
        ((EditText) viewInflate.findViewById(R.id.filepath)).setText(strSubstring);
        ((EditText) viewInflate.findViewById(R.id.fileentry)).setText(str2 != null ? str2 : this.f3354a.getString(R.string.not_available));
        RelativeLayout relativeLayout = (RelativeLayout) viewInflate.findViewById(R.id.btn_extract);
        if (c1533a.f4595b) {
            relativeLayout.setVisibility(8);
        } else {
            relativeLayout.setOnClickListener(new ViewOnClickListenerC1142ay(this, str2));
        }
        RelativeLayout relativeLayout2 = (RelativeLayout) viewInflate.findViewById(R.id.btn_rename);
        if (!this.f3354a.f2957m && c1533a.f4595b) {
            relativeLayout2.setVisibility(8);
        }
        relativeLayout2.setOnClickListener(new ViewOnClickListenerC1143az(this, editText, c1533a, str, str2, i));
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f3354a);
        builder.setTitle(R.string.detail);
        builder.setView(viewInflate);
        builder.setNeutralButton(R.string.copy_file_path, new DialogInterfaceOnClickListenerC1157bb(this, strSubstring));
        builder.setPositiveButton(android.R.string.ok, (DialogInterface.OnClickListener) null);
        return builder.create();
    }

    /* JADX INFO: renamed from: a */
    private static void m3028a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m3029a(ZipFile zipFile) {
        if (zipFile != null) {
            try {
                zipFile.close();
            } catch (IOException e) {
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: a */
    protected final void m3030a(String str, C1533a c1533a, String str2, String str3, int i) {
        InputStream inputStream;
        ZipFile zipFile;
        FileOutputStream fileOutputStream;
        ZipFile zipFile2;
        String str4;
        FileInputStream fileInputStream;
        FileOutputStream fileOutputStream2 = null;
        FileInputStream fileInputStream2 = null;
        fileOutputStream2 = null;
        inputStream = null;
        fileOutputStream2 = null;
        InputStream inputStream2 = null;
        boolean z = false;
        if (this.f3354a.f2957m) {
            new File(str + "/" + c1533a.f4594a).renameTo(new File(str + "/" + str3));
            return;
        }
        if (!c1533a.f4596c && !ApkInfoExActivity.m2661b(c1533a.f4594a)) {
            z = true;
        }
        try {
            if (z) {
                inputStream = new FileInputStream(str + "/" + c1533a.f4594a);
                zipFile = null;
            } else {
                ZipFile zipFile3 = new ZipFile(this.f3354a.f2914a);
                try {
                    inputStream = zipFile3.getInputStream(zipFile3.getEntry(str2));
                    zipFile = zipFile3;
                } catch (Exception e) {
                    zipFile2 = zipFile3;
                    fileOutputStream = null;
                    try {
                        Toast.makeText(this.f3354a, R.string.str_rename_failed, 0).show();
                        m3028a(fileOutputStream);
                        m3028a(inputStream2);
                        m3029a(zipFile2);
                    } catch (Throwable th) {
                        zipFile = zipFile2;
                        inputStream = inputStream2;
                        fileOutputStream2 = fileOutputStream;
                        th = th;
                        m3028a(fileOutputStream2);
                        m3028a(inputStream);
                        m3029a(zipFile);
                        throw th;
                    }
                } catch (Throwable th2) {
                    zipFile = zipFile3;
                    th = th2;
                    inputStream = null;
                    m3028a(fileOutputStream2);
                    m3028a(inputStream);
                    m3029a(zipFile);
                    throw th;
                }
            }
            try {
                str4 = C1067a.m2525d(this.f3354a, "tmp") + C1570s.m3787a(6);
                fileOutputStream = new FileOutputStream(str4);
            } catch (Exception e2) {
                fileOutputStream = null;
                inputStream2 = inputStream;
                zipFile2 = zipFile;
            } catch (Throwable th3) {
                th = th3;
            }
            try {
                C1067a.m2506b(inputStream, fileOutputStream);
                m3028a(fileOutputStream);
                m3028a(inputStream);
                m3029a(zipFile);
                this.f3354a.f2949e.m3311b(str, c1533a.f4594a, c1533a.f4596c);
                ArrayList arrayList = new ArrayList();
                arrayList.add(Integer.valueOf(i));
                this.f3354a.f2949e.m3310b(arrayList);
                String str5 = str + "/" + str3;
                try {
                    fileInputStream = new FileInputStream(str4);
                    try {
                        this.f3354a.f2949e.m3303a(str, this.f3354a.f2949e.m3299a(str5, fileInputStream));
                        Toast.makeText(this.f3354a, R.string.file_renamed, 0).show();
                        m3028a(fileInputStream);
                    } catch (Exception e3) {
                        e = e3;
                        fileInputStream2 = fileInputStream;
                        try {
                            e.printStackTrace();
                            Toast.makeText(this.f3354a, R.string.str_rename_failed, 0).show();
                            m3028a(fileInputStream2);
                        } catch (Throwable th4) {
                            th = th4;
                            fileInputStream = fileInputStream2;
                            m3028a(fileInputStream);
                            throw th;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        m3028a(fileInputStream);
                        throw th;
                    }
                } catch (Exception e4) {
                    e = e4;
                } catch (Throwable th6) {
                    th = th6;
                    fileInputStream = null;
                }
            } catch (Exception e5) {
                inputStream2 = inputStream;
                zipFile2 = zipFile;
                Toast.makeText(this.f3354a, R.string.str_rename_failed, 0).show();
                m3028a(fileOutputStream);
                m3028a(inputStream2);
                m3029a(zipFile2);
            } catch (Throwable th7) {
                fileOutputStream2 = fileOutputStream;
                th = th7;
                m3028a(fileOutputStream2);
                m3028a(inputStream);
                m3029a(zipFile);
                throw th;
            }
        } catch (Exception e6) {
            fileOutputStream = null;
            zipFile2 = null;
        } catch (Throwable th8) {
            th = th8;
            inputStream = null;
            zipFile = null;
        }
    }

    /* JADX INFO: renamed from: a */
    protected final void m3031a(String str, boolean z, boolean z2) {
        Set setM3319e = this.f3354a.f2949e.m3319e();
        if (setM3319e.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        String strM3300a = this.f3354a.f2949e.m3300a(arrayList);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList(setM3319e.size());
        arrayList3.addAll(setM3319e);
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            arrayList2.add(((C1533a) arrayList.get(((Integer) it.next()).intValue())).f4594a);
        }
        this.f3354a.m2697a(str, strM3300a, arrayList2, z, !z2);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id = view.getId();
        if (id == R.id.menu_home) {
            this.f3354a.f2949e.m3313c(this.f3354a.f2946b);
            this.f3354a.f2950f.m3334a(this.f3354a.f2946b);
            return;
        }
        if (id == R.id.menu_done) {
            this.f3354a.f2949e.m3307a(false);
            return;
        }
        if (id == R.id.menu_select) {
            Set setM3319e = this.f3354a.f2949e.m3319e();
            int count = this.f3354a.f2949e.getCount();
            ArrayList arrayList = new ArrayList(count);
            this.f3354a.f2949e.m3300a(arrayList);
            if (setM3319e.size() != ("..".equals(((C1533a) arrayList.get(0)).f4594a) ? count - 1 : count)) {
                this.f3354a.f2949e.m3307a(true);
                return;
            } else {
                this.f3354a.f2949e.m3307a(false);
                return;
            }
        }
        if (id == R.id.menu_addfile) {
            this.f3354a.m2716f();
            return;
        }
        if (id == R.id.menu_addfolder) {
            this.f3354a.m2719g();
            return;
        }
        if (id == R.id.menu_searchoptions) {
            this.f3354a.m2731n();
            return;
        }
        if (id == R.id.menu_caseinsensitive) {
            this.f3354a.m2732o();
            return;
        }
        if (id == R.drawable.ic_res_extract) {
            Set setM3319e2 = this.f3354a.f2949e.m3319e();
            if (setM3319e2.isEmpty()) {
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(setM3319e2);
            Collections.sort(arrayList2);
            this.f3354a.m2699a((List) arrayList2);
            return;
        }
        if (id == R.drawable.ic_res_replace) {
            Set setM3319e3 = this.f3354a.f2949e.m3319e();
            if (setM3319e3.isEmpty()) {
                return;
            }
            int iIntValue = ((Integer) setM3319e3.iterator().next()).intValue();
            ArrayList arrayList3 = new ArrayList();
            this.f3354a.f2949e.m3300a(arrayList3);
            if (((C1533a) arrayList3.get(iIntValue)).f4595b) {
                this.f3354a.m2705b(iIntValue);
                return;
            } else {
                this.f3354a.m2691a(iIntValue);
                return;
            }
        }
        if (id != R.drawable.ic_res_search) {
            if (id == R.drawable.ic_res_delete) {
                Set setM3319e4 = this.f3354a.f2949e.m3319e();
                if (setM3319e4.isEmpty()) {
                    return;
                }
                ArrayList arrayList4 = new ArrayList();
                arrayList4.addAll(setM3319e4);
                Collections.sort(arrayList4);
                this.f3354a.f2949e.m3315c(arrayList4);
                return;
            }
            if (id == R.drawable.ic_res_detail) {
                Set setM3319e5 = this.f3354a.f2949e.m3319e();
                if (setM3319e5.isEmpty()) {
                    return;
                }
                int iIntValue2 = ((Integer) setM3319e5.iterator().next()).intValue();
                ArrayList arrayList5 = new ArrayList();
                m3027a(this.f3354a.f2949e.m3300a(arrayList5), (C1533a) arrayList5.get(iIntValue2), iIntValue2).show();
                return;
            }
            return;
        }
        float f = this.f3354a.getResources().getDisplayMetrics().density;
        int i = (int) ((8.0f * f) + 0.5f);
        int i2 = (int) ((18.0f * f) + 0.5f);
        int i3 = (int) ((f * 20.0f) + 0.5f);
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f3354a);
        builder.setTitle(R.string.search);
        C1119a c1119a = new C1119a(this.f3354a, "res_keywords");
        LinearLayout linearLayout = new LinearLayout(this.f3354a);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        EditTextWithTip editTextWithTip = new EditTextWithTip(this.f3354a);
        editTextWithTip.setHint(R.string.pls_input_keyword);
        editTextWithTip.setTextColor(ContextCompat.getColor(this.f3354a, C0037k.mdTextMedium(C0037k.m89a(this.f3354a))));
        editTextWithTip.setTextSize(1, 14);
        editTextWithTip.setAdapter(c1119a);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(i3, i, i3, 0);
        editTextWithTip.setLayoutParams(layoutParams);
        linearLayout.addView(editTextWithTip);
        CheckBox checkBox = new CheckBox(this.f3354a);
        checkBox.setText(R.string.case_insensitive);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(i2, 0, i2, 0);
        checkBox.setLayoutParams(layoutParams2);
        linearLayout.addView(checkBox);
        CheckBox checkBox2 = new CheckBox(this.f3354a);
        checkBox2.setText(R.string.search_file_names);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.setMargins(i2, 0, i2, 0);
        checkBox2.setLayoutParams(layoutParams3);
        linearLayout.addView(checkBox2);
        builder.setView(linearLayout);
        builder.setPositiveButton(android.R.string.ok, new DialogInterfaceOnClickListenerC1140aw(this, editTextWithTip, checkBox2, checkBox));
        builder.setNegativeButton(android.R.string.cancel, new DialogInterfaceOnClickListenerC1141ax(this));
        builder.show();
    }
}
