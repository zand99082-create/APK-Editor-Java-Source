package com.gmail.heagoo.apkeditor.p098se;

import android.view.MenuItem;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.se.f */
/* JADX INFO: loaded from: classes.dex */
final class MenuItemOnMenuItemClickListenerC1433f implements MenuItem.OnMenuItemClickListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ ViewOnCreateContextMenuListenerC1431d f4227a;

    MenuItemOnMenuItemClickListenerC1433f(ViewOnCreateContextMenuListenerC1431d viewOnCreateContextMenuListenerC1431d) {
        this.f4227a = viewOnCreateContextMenuListenerC1431d;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        this.f4227a.f4225b.m3529b(this.f4227a.f4224a);
        return true;
    }
}
