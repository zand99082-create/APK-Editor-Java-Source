package com.gmail.heagoo.apkeditor;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import com.gmail.heagoo.apkeditor.pro.R;
import com.gmail.heagoo.p100b.C1533a;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.az */
/* JADX INFO: loaded from: classes.dex */
final class ViewOnClickListenerC1143az implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C1533a f3361a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ String f3362b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ String f3363c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ int f3364d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ ViewOnClickListenerC1139av f3365e;

    /* JADX INFO: renamed from: f */
    private /* synthetic */ EditText f3366f;

    ViewOnClickListenerC1143az(ViewOnClickListenerC1139av viewOnClickListenerC1139av, EditText editText, C1533a c1533a, String str, String str2, int i) {
        this.f3365e = viewOnClickListenerC1139av;
        this.f3366f = editText;
        this.f3361a = c1533a;
        this.f3362b = str;
        this.f3363c = str2;
        this.f3364d = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x008e  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        boolean z = true;
        String strTrim = this.f3366f.getText().toString().trim();
        if (strTrim.equals("")) {
            Toast.makeText(this.f3365e.f3354a, R.string.empty_input_tip, 0).show();
            return;
        }
        if (strTrim.equals(this.f3361a.f4594a)) {
            Toast.makeText(this.f3365e.f3354a, R.string.no_change_detected, 0).show();
            return;
        }
        if (!this.f3361a.f4595b) {
            String str = this.f3361a.f4594a;
            int iLastIndexOf = str.lastIndexOf(46);
            if (iLastIndexOf != -1) {
                String strSubstring = str.substring(iLastIndexOf);
                int iLastIndexOf2 = strTrim.lastIndexOf(46);
                if (iLastIndexOf2 != -1 && strSubstring.equals(strTrim.substring(iLastIndexOf2))) {
                    z = false;
                }
                if (z) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(this.f3365e.f3354a);
                    builder.setMessage(R.string.extension_changed_tip);
                    builder.setPositiveButton(R.string.yes, new DialogInterfaceOnClickListenerC1156ba(this, strTrim));
                    builder.setNegativeButton(R.string.no, (DialogInterface.OnClickListener) null);
                    builder.show();
                    return;
                }
            }
        }
        this.f3365e.m3030a(this.f3362b, this.f3361a, this.f3363c, strTrim, this.f3364d);
    }
}
