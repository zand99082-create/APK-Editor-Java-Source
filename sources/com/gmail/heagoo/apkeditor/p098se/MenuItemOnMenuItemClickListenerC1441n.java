package com.gmail.heagoo.apkeditor.p098se;

import android.view.MenuItem;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.se.n */
/* JADX INFO: loaded from: classes.dex */
final class MenuItemOnMenuItemClickListenerC1441n implements MenuItem.OnMenuItemClickListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ ViewOnCreateContextMenuListenerC1438k f4245a;

    MenuItemOnMenuItemClickListenerC1441n(ViewOnCreateContextMenuListenerC1438k viewOnCreateContextMenuListenerC1438k) {
        this.f4245a = viewOnCreateContextMenuListenerC1438k;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        this.f4245a.f4242b.m3541c(this.f4245a.f4241a);
        return true;
    }
}
