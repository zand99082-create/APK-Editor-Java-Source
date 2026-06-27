package com.gmail.heagoo.apkeditor;

import android.view.MenuItem;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.fs */
/* JADX INFO: loaded from: classes.dex */
final class MenuItemOnMenuItemClickListenerC1309fs implements MenuItem.OnMenuItemClickListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ ViewOnCreateContextMenuListenerC1307fq f3823a;

    MenuItemOnMenuItemClickListenerC1309fs(ViewOnCreateContextMenuListenerC1307fq viewOnCreateContextMenuListenerC1307fq) {
        this.f3823a = viewOnCreateContextMenuListenerC1307fq;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        DialogC1305fo.m3340b(this.f3823a.f3821b, this.f3823a.f3820a);
        return true;
    }
}
