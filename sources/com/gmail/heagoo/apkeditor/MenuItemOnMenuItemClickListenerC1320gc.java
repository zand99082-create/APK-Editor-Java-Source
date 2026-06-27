package com.gmail.heagoo.apkeditor;

import android.view.MenuItem;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.gc */
/* JADX INFO: loaded from: classes.dex */
final class MenuItemOnMenuItemClickListenerC1320gc implements MenuItem.OnMenuItemClickListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ ViewOnCreateContextMenuListenerC1316fz f3854a;

    MenuItemOnMenuItemClickListenerC1320gc(ViewOnCreateContextMenuListenerC1316fz viewOnCreateContextMenuListenerC1316fz) {
        this.f3854a = viewOnCreateContextMenuListenerC1316fz;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        DialogC1312fv.m3351c(this.f3854a.f3849b, this.f3854a.f3848a);
        return true;
    }
}
