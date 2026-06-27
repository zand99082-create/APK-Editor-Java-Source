package com.gmail.heagoo.apkeditor.p098se;

import android.view.MenuItem;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.se.e */
/* JADX INFO: loaded from: classes.dex */
final class MenuItemOnMenuItemClickListenerC1432e implements MenuItem.OnMenuItemClickListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ ViewOnCreateContextMenuListenerC1431d f4226a;

    MenuItemOnMenuItemClickListenerC1432e(ViewOnCreateContextMenuListenerC1431d viewOnCreateContextMenuListenerC1431d) {
        this.f4226a = viewOnCreateContextMenuListenerC1431d;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        this.f4226a.f4225b.m3531c(this.f4226a.f4224a);
        return true;
    }
}
