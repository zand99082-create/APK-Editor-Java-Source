package com.gmail.heagoo.apkeditor;

import android.view.MenuItem;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.gb */
/* JADX INFO: loaded from: classes.dex */
final class MenuItemOnMenuItemClickListenerC1319gb implements MenuItem.OnMenuItemClickListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ ViewOnCreateContextMenuListenerC1316fz f3853a;

    MenuItemOnMenuItemClickListenerC1319gb(ViewOnCreateContextMenuListenerC1316fz viewOnCreateContextMenuListenerC1316fz) {
        this.f3853a = viewOnCreateContextMenuListenerC1316fz;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        DialogC1312fv.m3350b(this.f3853a.f3849b, this.f3853a.f3848a);
        return true;
    }
}
