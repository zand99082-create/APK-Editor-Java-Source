package com.gmail.heagoo.appdm;

import android.app.Dialog;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.gmail.heagoo.apkeditor.pro.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.gmail.heagoo.appdm.h */
/* JADX INFO: loaded from: classes.dex */
public final class DialogC1506h extends Dialog implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    private PrefDetailActivity f4526a;

    /* JADX INFO: renamed from: b */
    private int f4527b;

    /* JADX INFO: renamed from: c */
    private List f4528c;

    /* JADX INFO: renamed from: d */
    private TextView f4529d;

    /* JADX INFO: renamed from: e */
    private EditText f4530e;

    /* JADX INFO: renamed from: f */
    private EditText f4531f;

    /* JADX INFO: renamed from: g */
    private View f4532g;

    /* JADX INFO: renamed from: h */
    private View f4533h;

    /* JADX INFO: renamed from: i */
    private boolean f4534i;

    /* JADX INFO: renamed from: j */
    private boolean f4535j;

    /* JADX INFO: renamed from: k */
    private int f4536k;

    public DialogC1506h(PrefDetailActivity prefDetailActivity, Map map, int i, boolean z, int i2) {
        super(prefDetailActivity);
        this.f4528c = new ArrayList();
        this.f4534i = false;
        this.f4526a = prefDetailActivity;
        this.f4527b = i;
        this.f4535j = true;
        this.f4536k = i2;
        m3712a(map);
        View viewInflate = getLayoutInflater().inflate(R.layout.appdm_dialog_keyvalue, (ViewGroup) null);
        this.f4529d = (TextView) viewInflate.findViewById(R.id.tv_type);
        this.f4530e = (EditText) viewInflate.findViewById(R.id.et_key);
        this.f4531f = (EditText) viewInflate.findViewById(R.id.et_valuey);
        this.f4532g = viewInflate.findViewById(R.id.image_next);
        this.f4533h = viewInflate.findViewById(R.id.image_prev);
        this.f4532g.setClickable(true);
        this.f4532g.setOnClickListener(this);
        this.f4533h.setClickable(true);
        this.f4533h.setOnClickListener(this);
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_noteditable);
        Button button = (Button) viewInflate.findViewById(R.id.btn_save);
        if (this.f4535j) {
            button.setOnClickListener(this);
            textView.setVisibility(8);
        } else {
            button.setVisibility(8);
            this.f4531f.setEnabled(false);
            textView.setVisibility(0);
        }
        ((Button) viewInflate.findViewById(R.id.btn_cancel)).setOnClickListener(this);
        m3711a(this.f4527b);
        super.setContentView(viewInflate);
        super.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        super.setCancelable(false);
        super.setCanceledOnTouchOutside(false);
    }

    /* JADX INFO: renamed from: a */
    private void m3711a(int i) {
        C1507i c1507i = (C1507i) this.f4528c.get(i);
        this.f4529d.setText("Type: " + c1507i.f4539c);
        this.f4530e.setText(c1507i.f4537a);
        this.f4531f.setText(c1507i.f4538b);
    }

    /* JADX INFO: renamed from: a */
    private void m3712a(Map map) {
        for (String str : map.keySet()) {
            C1507i c1507i = new C1507i();
            c1507i.f4537a = str;
            Object obj = map.get(str);
            if (obj != null) {
                c1507i.f4538b = obj.toString();
                c1507i.f4539c = obj.getClass().getSimpleName();
            } else {
                c1507i.f4538b = "";
                c1507i.f4539c = "null";
            }
            this.f4528c.add(c1507i);
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
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object objValueOf;
        int id = view.getId();
        if (id == R.id.image_next) {
            if (this.f4527b + 1 >= this.f4528c.size()) {
                Toast.makeText(this.f4526a, "No more values!", 0).show();
                return;
            } else {
                m3711a(this.f4527b + 1);
                this.f4527b++;
                return;
            }
        }
        if (id == R.id.image_prev) {
            if (this.f4527b <= 0) {
                Toast.makeText(this.f4526a, "No more values!", 0).show();
                return;
            } else {
                m3711a(this.f4527b - 1);
                this.f4527b--;
                return;
            }
        }
        if (id != R.id.btn_save) {
            if (id == R.id.btn_cancel) {
                cancel();
                if (this.f4534i) {
                    this.f4526a.m3649a();
                    return;
                }
                return;
            }
            return;
        }
        try {
            C1507i c1507i = (C1507i) this.f4528c.get(this.f4527b);
            String str = c1507i.f4539c;
            String string = this.f4531f.getText().toString();
            if ("Integer".equals(str)) {
                objValueOf = Integer.valueOf(string);
            } else if ("Float".equals(str)) {
                objValueOf = Float.valueOf(string);
            } else if ("Long".equals(str)) {
                objValueOf = Long.valueOf(string);
            } else {
                objValueOf = string;
                if (!"String".equals(str)) {
                    if (!"Boolean".equals(str)) {
                        throw new Exception("Value type not supported!");
                    }
                    objValueOf = Boolean.valueOf(string);
                }
            }
            c1507i.f4538b = objValueOf.toString();
            this.f4526a.m3652a(c1507i.f4537a, objValueOf);
            Toast.makeText(this.f4526a, "Succeed!", 0).show();
        } catch (Exception e) {
            Toast.makeText(this.f4526a, e.getMessage(), 0).show();
        }
        this.f4534i = true;
    }
}
