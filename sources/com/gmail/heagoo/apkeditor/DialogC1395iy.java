package com.gmail.heagoo.apkeditor;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.gmail.heagoo.apkeditor.pro.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.iy */
/* JADX INFO: loaded from: classes.dex */
public final class DialogC1395iy extends Dialog implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    private InterfaceC1396iz f4048a;

    /* JADX INFO: renamed from: b */
    private int f4049b;

    /* JADX INFO: renamed from: c */
    private String f4050c;

    /* JADX INFO: renamed from: d */
    private LinkedHashMap f4051d;

    /* JADX INFO: renamed from: e */
    private boolean f4052e;

    /* JADX INFO: renamed from: f */
    private List f4053f;

    /* JADX INFO: renamed from: g */
    private String f4054g;

    /* JADX INFO: renamed from: h */
    private Context f4055h;

    /* JADX INFO: renamed from: i */
    private Dialog f4056i;

    /* JADX INFO: renamed from: j */
    private View f4057j;

    /* JADX INFO: renamed from: k */
    private LinearLayout f4058k;

    /* JADX INFO: renamed from: l */
    private int f4059l;

    /* JADX WARN: Removed duplicated region for block: B:21:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0094 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DialogC1395iy(Context context, InterfaceC1396iz interfaceC1396iz, int i, String str) {
        String strSubstring;
        super(context, R.style.Dialog_FullWindow);
        this.f4052e = false;
        requestWindowFeature(1);
        this.f4055h = context;
        this.f4048a = interfaceC1396iz;
        this.f4049b = i;
        this.f4059l = R.layout.item_stringvalue;
        int iIndexOf = str.indexOf(62);
        if (iIndexOf != -1) {
            this.f4054g = str.substring(iIndexOf + 1);
            if (iIndexOf != str.length() - 1) {
                str = str.substring(0, iIndexOf + 1);
            }
        }
        this.f4051d = new LinkedHashMap();
        String[] strArrSplit = str.split(" ");
        this.f4050c = strArrSplit[0].trim();
        if (this.f4050c.startsWith("<")) {
            this.f4050c = this.f4050c.substring(1);
        } else {
            this.f4050c = "";
        }
        for (int i2 = 1; i2 < strArrSplit.length; i2++) {
            String[] strArrSplit2 = strArrSplit[i2].split("=");
            if (strArrSplit2.length == 2) {
                String str2 = strArrSplit2[1];
                if (str2.startsWith("\"")) {
                    if (str2.endsWith("\"")) {
                        strSubstring = str2.substring(1, str2.length() - 1);
                    } else if (str2.endsWith("\">")) {
                        strSubstring = str2.substring(1, str2.length() - 2);
                    }
                    if (strSubstring == null) {
                    }
                } else {
                    strSubstring = null;
                    if (strSubstring == null) {
                        this.f4051d.put(strArrSplit2[0], strSubstring);
                    }
                }
            }
        }
        this.f4052e = str.endsWith("/>");
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.dlg_xmlline, (ViewGroup) null);
        ((TextView) viewInflate.findViewById(R.id.tv_linecontent)).setText(str);
        viewInflate.findViewById(R.id.btn_dlgclose).setOnClickListener(this);
        View viewFindViewById = viewInflate.findViewById(R.id.btn_dlgsave);
        viewFindViewById.setOnClickListener(this);
        this.f4058k = (LinearLayout) viewInflate.findViewById(R.id.view_keyvalue);
        this.f4053f = new ArrayList();
        if (this.f4051d.isEmpty()) {
            View view = new View(context);
            view.setLayoutParams(new LinearLayout.LayoutParams(-1, 100));
            this.f4058k.addView(view, 0);
            viewFindViewById.setVisibility(8);
        } else {
            int i3 = 0;
            for (Map.Entry entry : this.f4051d.entrySet()) {
                View viewInflate2 = LayoutInflater.from(context).inflate(this.f4059l, (ViewGroup) null);
                ((TextView) viewInflate2.findViewById(R.id.string_name)).setText((CharSequence) entry.getKey());
                EditText editText = (EditText) viewInflate2.findViewById(R.id.string_value);
                this.f4053f.add(editText);
                editText.setText((CharSequence) entry.getValue());
                this.f4058k.addView(viewInflate2, i3);
                i3++;
            }
            View viewFindViewById2 = viewInflate.findViewById(R.id.hidden_image);
            viewFindViewById2.setVisibility(0);
            viewFindViewById2.setOnClickListener(this);
        }
        setContentView(viewInflate);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 0;
        int id = view.getId();
        if (id == R.id.btn_dlgclose) {
            dismiss();
            return;
        }
        if (id == R.id.btn_dlgsave) {
            if (this.f4048a != null) {
                InterfaceC1396iz interfaceC1396iz = this.f4048a;
                int i2 = this.f4049b;
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("<" + this.f4050c);
                Iterator it = this.f4051d.entrySet().iterator();
                while (it.hasNext()) {
                    stringBuffer.append(" " + ((String) ((Map.Entry) it.next()).getKey()) + "=\"" + ((EditText) this.f4053f.get(i)).getText().toString() + "\"");
                    i++;
                }
                if (this.f4052e) {
                    stringBuffer.append(" />");
                } else {
                    stringBuffer.append(">");
                }
                stringBuffer.append(this.f4054g);
                interfaceC1396iz.mo3139a(i2, stringBuffer.toString());
            }
            dismiss();
            return;
        }
        if (id == R.id.hidden_image) {
            this.f4056i = new Dialog(this.f4055h);
            View viewInflate = LayoutInflater.from(this.f4055h).inflate(R.layout.dlg_addkeyvalue, (ViewGroup) null);
            ((Button) viewInflate.findViewById(R.id.btn_addkeyvalue_ok)).setOnClickListener(this);
            ((Button) viewInflate.findViewById(R.id.btn_addkeyvalue_cancel)).setOnClickListener(this);
            this.f4057j = viewInflate;
            this.f4056i.requestWindowFeature(1);
            this.f4056i.setContentView(viewInflate);
            this.f4056i.show();
            return;
        }
        if (id != R.id.btn_addkeyvalue_ok) {
            if (id == R.id.btn_addkeyvalue_cancel) {
                this.f4056i.dismiss();
                return;
            }
            return;
        }
        EditText editText = (EditText) this.f4057j.findViewById(R.id.key);
        EditText editText2 = (EditText) this.f4057j.findViewById(R.id.value);
        String strTrim = editText.getText().toString().trim();
        String strTrim2 = editText2.getText().toString().trim();
        if (strTrim.equals("")) {
            Toast.makeText(this.f4055h, R.string.empty_key_tip, 0).show();
            return;
        }
        this.f4051d.put(strTrim, strTrim2);
        View viewInflate2 = LayoutInflater.from(this.f4055h).inflate(this.f4059l, (ViewGroup) null);
        ((TextView) viewInflate2.findViewById(R.id.string_name)).setText(strTrim);
        EditText editText3 = (EditText) viewInflate2.findViewById(R.id.string_value);
        this.f4053f.add(editText3);
        editText3.setText(strTrim2);
        this.f4058k.addView(viewInflate2, this.f4051d.size() - 1);
        this.f4056i.dismiss();
    }
}
