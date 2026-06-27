package com.gmail.heagoo.sqliteutil;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.gmail.heagoo.apkeditor.pro.R;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: renamed from: com.gmail.heagoo.sqliteutil.k */
/* JADX INFO: loaded from: classes.dex */
public final class DialogC1640k extends Dialog {

    /* JADX INFO: renamed from: a */
    private WeakReference f5004a;

    /* JADX INFO: renamed from: b */
    private int f5005b;

    /* JADX INFO: renamed from: c */
    private List f5006c;

    /* JADX INFO: renamed from: d */
    private List f5007d;

    /* JADX INFO: renamed from: e */
    private List f5008e;

    /* JADX INFO: renamed from: f */
    private List f5009f;

    /* JADX INFO: renamed from: g */
    private TextView f5010g;

    /* JADX INFO: renamed from: h */
    private TextView f5011h;

    /* JADX INFO: renamed from: i */
    private EditText f5012i;

    /* JADX INFO: renamed from: j */
    private EditText f5013j;

    /* JADX INFO: renamed from: k */
    private View f5014k;

    /* JADX INFO: renamed from: l */
    private View f5015l;

    /* JADX INFO: renamed from: m */
    private Button f5016m;

    /* JADX INFO: renamed from: n */
    private Button f5017n;

    /* JADX INFO: renamed from: o */
    private boolean f5018o;

    public DialogC1640k(SqliteRowViewActivity sqliteRowViewActivity, List list, List list2, List list3, List list4, int i, boolean z, int i2) {
        super(sqliteRowViewActivity);
        this.f5004a = new WeakReference(sqliteRowViewActivity);
        this.f5005b = i;
        this.f5006c = list;
        this.f5007d = list2;
        this.f5008e = list4;
        this.f5009f = list3;
        this.f5018o = z;
        View viewInflate = getLayoutInflater().inflate(R.layout.sql_dialog_tablerecord, (ViewGroup) null);
        this.f5010g = (TextView) viewInflate.findViewById(R.id.tv_type);
        this.f5012i = (EditText) viewInflate.findViewById(R.id.et_name);
        this.f5013j = (EditText) viewInflate.findViewById(R.id.et_valuey);
        this.f5014k = viewInflate.findViewById(R.id.image_next);
        this.f5015l = viewInflate.findViewById(R.id.image_prev);
        this.f5011h = (TextView) viewInflate.findViewById(R.id.tv_pkflag);
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_noteditable);
        if (this.f5018o) {
            textView.setVisibility(4);
        } else {
            textView.setVisibility(0);
            this.f5013j.setEnabled(false);
        }
        this.f5014k.setClickable(true);
        this.f5014k.setOnClickListener(new ViewOnClickListenerC1641l(this));
        this.f5015l.setClickable(true);
        this.f5015l.setOnClickListener(new ViewOnClickListenerC1642m(this));
        this.f5016m = (Button) viewInflate.findViewById(R.id.btn_save);
        if (this.f5018o) {
            this.f5016m.setOnClickListener(new ViewOnClickListenerC1643n(this));
        } else {
            this.f5016m.setVisibility(8);
        }
        this.f5017n = (Button) viewInflate.findViewById(R.id.btn_cancel);
        this.f5017n.setOnClickListener(new ViewOnClickListenerC1644o(this));
        m4032b(this.f5005b);
        super.setContentView(viewInflate);
    }

    /* JADX INFO: renamed from: a */
    private boolean m4031a(int i) {
        return !"0".equals(this.f5009f.get(i));
    }

    /* JADX INFO: renamed from: b */
    private void m4032b(int i) {
        boolean zM4031a = m4031a(i);
        this.f5010g.setText("Type: " + ((String) this.f5006c.get(i)));
        this.f5011h.setText("Primary Key: " + zM4031a);
        this.f5012i.setText((CharSequence) this.f5007d.get(i));
        this.f5013j.setText((CharSequence) this.f5008e.get(i));
        if (this.f5018o) {
            return;
        }
        if (zM4031a) {
            this.f5013j.setEnabled(false);
            this.f5016m.setVisibility(8);
        } else {
            this.f5013j.setEnabled(true);
            this.f5016m.setVisibility(0);
        }
    }

    @SuppressLint({"DefaultLocale"})
    /* JADX INFO: renamed from: a */
    protected final void m4033a() {
        Object objValueOf;
        try {
            if (m4031a(this.f5005b)) {
                throw new Exception("Can not edit primary key!");
            }
            String upperCase = ((String) this.f5006c.get(this.f5005b)).toUpperCase();
            String string = this.f5013j.getText().toString();
            if (SqliteTableViewActivity.m3999f(upperCase)) {
                objValueOf = string;
            } else if (SqliteTableViewActivity.m3996c(upperCase)) {
                objValueOf = Long.valueOf(string);
            } else if (SqliteTableViewActivity.m3997d(upperCase)) {
                objValueOf = Boolean.valueOf(string);
            } else if (SqliteTableViewActivity.m3995b(upperCase)) {
                objValueOf = Float.valueOf(string);
            } else if (SqliteTableViewActivity.m3992a(upperCase)) {
                objValueOf = Double.valueOf(string);
            } else {
                if (SqliteTableViewActivity.m3998e(upperCase)) {
                    throw new Exception("Value type not supported!");
                }
                objValueOf = string;
            }
            ((SqliteRowViewActivity) this.f5004a.get()).m3981a(this.f5005b, objValueOf);
            Toast.makeText((Context) this.f5004a.get(), "Succeed!", 0).show();
        } catch (Exception e) {
            Toast.makeText((Context) this.f5004a.get(), e.getMessage(), 0).show();
        }
    }

    /* JADX INFO: renamed from: b */
    protected final void m4034b() {
        if (this.f5005b <= 0) {
            Toast.makeText((Context) this.f5004a.get(), R.string.toast_no_values, 0).show();
        } else {
            m4032b(this.f5005b - 1);
            this.f5005b--;
        }
    }

    /* JADX INFO: renamed from: c */
    protected final void m4035c() {
        if (this.f5005b + 1 >= this.f5008e.size()) {
            Toast.makeText((Context) this.f5004a.get(), R.string.toast_no_values, 0).show();
        } else {
            m4032b(this.f5005b + 1);
            this.f5005b++;
        }
    }
}
