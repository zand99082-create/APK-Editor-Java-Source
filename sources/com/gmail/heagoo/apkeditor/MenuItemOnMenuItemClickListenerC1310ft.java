package com.gmail.heagoo.apkeditor;

import android.view.MenuItem;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.ft */
/* JADX INFO: loaded from: classes.dex */
final class MenuItemOnMenuItemClickListenerC1310ft implements MenuItem.OnMenuItemClickListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ ViewOnCreateContextMenuListenerC1307fq f3824a;

    MenuItemOnMenuItemClickListenerC1310ft(ViewOnCreateContextMenuListenerC1307fq viewOnCreateContextMenuListenerC1307fq) {
        this.f3824a = viewOnCreateContextMenuListenerC1307fq;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        DialogC1305fo.m3342c(this.f3824a.f3821b, this.f3824a.f3820a);
        return true;
    }
}
