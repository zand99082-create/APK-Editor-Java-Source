package com.gmail.heagoo.apkeditor;

import android.view.MenuItem;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.ga */
/* JADX INFO: loaded from: classes.dex */
final class MenuItemOnMenuItemClickListenerC1318ga implements MenuItem.OnMenuItemClickListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ ViewOnCreateContextMenuListenerC1316fz f3852a;

    MenuItemOnMenuItemClickListenerC1318ga(ViewOnCreateContextMenuListenerC1316fz viewOnCreateContextMenuListenerC1316fz) {
        this.f3852a = viewOnCreateContextMenuListenerC1316fz;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        DialogC1312fv.m3348a(this.f3852a.f3849b, this.f3852a.f3848a);
        return true;
    }
}
