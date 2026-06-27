package com.p078b.p079a;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import com.gmail.heagoo.apkeditor.pro.R;

/* JADX INFO: renamed from: com.b.a.f */
/* JADX INFO: loaded from: classes.dex */
public final class AlertDialogC1013f extends AlertDialog implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    private C1008a f2628a;

    /* JADX INFO: renamed from: b */
    private int f2629b;

    /* JADX INFO: renamed from: c */
    private InterfaceC1012e f2630c;

    public AlertDialogC1013f(Context context, int i, InterfaceC1012e interfaceC1012e) {
        super(context);
        this.f2628a = null;
        this.f2630c = null;
        this.f2629b = i;
        this.f2630c = interfaceC1012e;
        this.f2628a = new C1008a(context);
        this.f2628a.m2306a(i);
        setView(this.f2628a);
        setButton(context.getText(R.string.colormixer_set), this);
        setButton2(context.getText(R.string.colormixer_cancel), (DialogInterface.OnClickListener) null);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.f2629b != this.f2628a.m2305a()) {
            this.f2630c.mo2307a(this.f2628a.m2305a());
        }
    }

    @Override // android.app.Dialog
    public final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.f2628a.m2306a(bundle.getInt("c"));
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        bundleOnSaveInstanceState.putInt("c", this.f2628a.m2305a());
        return bundleOnSaveInstanceState;
    }
}
