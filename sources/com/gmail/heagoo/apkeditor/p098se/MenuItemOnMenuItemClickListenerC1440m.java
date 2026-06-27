package com.gmail.heagoo.apkeditor.p098se;

import android.view.MenuItem;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.se.m */
/* JADX INFO: loaded from: classes.dex */
final class MenuItemOnMenuItemClickListenerC1440m implements MenuItem.OnMenuItemClickListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ ViewOnCreateContextMenuListenerC1438k f4244a;

    MenuItemOnMenuItemClickListenerC1440m(ViewOnCreateContextMenuListenerC1438k viewOnCreateContextMenuListenerC1438k) {
        this.f4244a = viewOnCreateContextMenuListenerC1438k;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        this.f4244a.f4242b.m3537a(this.f4244a.f4241a);
        return true;
    }
}
