package com.gmail.heagoo.apkeditor;

import android.view.MenuItem;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.fr */
/* JADX INFO: loaded from: classes.dex */
final class MenuItemOnMenuItemClickListenerC1308fr implements MenuItem.OnMenuItemClickListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ ViewOnCreateContextMenuListenerC1307fq f3822a;

    MenuItemOnMenuItemClickListenerC1308fr(ViewOnCreateContextMenuListenerC1307fq viewOnCreateContextMenuListenerC1307fq) {
        this.f3822a = viewOnCreateContextMenuListenerC1307fq;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        DialogC1305fo.m3336a(this.f3822a.f3821b, this.f3822a.f3820a);
        return true;
    }
}
