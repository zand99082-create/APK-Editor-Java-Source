package com.gmail.heagoo.apkeditor;

import android.app.Activity;
import android.app.Dialog;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.gmail.heagoo.apkeditor.pro.R;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.dx */
/* JADX INFO: loaded from: classes.dex */
final class DialogC1228dx extends Dialog {

    /* JADX INFO: renamed from: a */
    private WeakReference f3572a;

    /* JADX INFO: renamed from: b */
    private String f3573b;

    /* JADX INFO: renamed from: c */
    private C1217dj f3574c;

    /* JADX INFO: renamed from: d */
    private InterfaceC1208cz f3575d;

    DialogC1228dx(Activity activity, String str, C1217dj c1217dj, InterfaceC1208cz interfaceC1208cz) {
        super(activity);
        requestWindowFeature(1);
        this.f3572a = new WeakReference(activity);
        this.f3573b = str;
        this.f3574c = c1217dj;
        this.f3575d = interfaceC1208cz;
        View viewInflate = ((Activity) this.f3572a.get()).getLayoutInflater().inflate(R.layout.dlg_manifestline, (ViewGroup) null, false);
        ((TextView) viewInflate.findViewById(R.id.content)).setText(this.f3574c.f3545b);
        TextView textView = (TextView) viewInflate.findViewById(R.id.description);
        textView.setMovementMethod(new ScrollingMovementMethod());
        String strM3127a = this.f3574c.m3127a();
        String strM3131a = strM3127a != null ? C1223ds.m3131a(activity, strM3127a) : null;
        textView.setText(strM3131a == null ? "" : strM3131a);
        Button button = (Button) viewInflate.findViewById(R.id.delete);
        button.setClickable(true);
        button.setOnClickListener(new ViewOnClickListenerC1229dy(this));
        ((RelativeLayout) viewInflate.findViewById(R.id.extract)).setOnClickListener(new ViewOnClickListenerC1230dz(this));
        ((RelativeLayout) viewInflate.findViewById(R.id.replace)).setOnClickListener(new ViewOnClickListenerC1263eb(this));
        ((RelativeLayout) viewInflate.findViewById(R.id.open_in_new_window)).setOnClickListener(new ViewOnClickListenerC1265ed(this));
        ((Button) viewInflate.findViewById(R.id.close)).setOnClickListener(new ViewOnClickListenerC1266ee(this));
        setContentView(viewInflate);
    }

    /* JADX INFO: renamed from: f */
    static /* synthetic */ boolean m3145f(DialogC1228dx dialogC1228dx) {
        return true;
    }
}
