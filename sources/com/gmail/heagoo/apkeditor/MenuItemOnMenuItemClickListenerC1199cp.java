package com.gmail.heagoo.apkeditor;

import android.view.MenuItem;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.cp */
/* JADX INFO: loaded from: classes.dex */
final class MenuItemOnMenuItemClickListenerC1199cp implements MenuItem.OnMenuItemClickListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ ViewOnCreateContextMenuListenerC1198co f3513a;

    MenuItemOnMenuItemClickListenerC1199cp(ViewOnCreateContextMenuListenerC1198co viewOnCreateContextMenuListenerC1198co) {
        this.f3513a = viewOnCreateContextMenuListenerC1198co;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        DialogC1197cn.m3111a(this.f3513a.f3512a);
        return true;
    }
}
