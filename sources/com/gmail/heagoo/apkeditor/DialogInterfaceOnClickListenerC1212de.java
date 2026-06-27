package com.gmail.heagoo.apkeditor;

import android.content.DialogInterface;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.de */
/* JADX INFO: loaded from: classes.dex */
final class DialogInterfaceOnClickListenerC1212de implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ KeyListPreference f3530a;

    DialogInterfaceOnClickListenerC1212de(KeyListPreference keyListPreference) {
        this.f3530a = keyListPreference;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (2 == i) {
            new ViewOnClickListenerC1213df(this.f3530a).m3124a(this.f3530a.f3040a);
        } else {
            this.f3530a.setValue(new StringBuilder().append((Object) this.f3530a.getEntryValues()[i]).toString());
        }
        dialogInterface.dismiss();
    }
}
