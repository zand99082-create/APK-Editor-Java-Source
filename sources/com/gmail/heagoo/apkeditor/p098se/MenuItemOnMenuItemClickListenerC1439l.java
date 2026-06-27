package com.gmail.heagoo.apkeditor.p098se;

import android.view.MenuItem;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.se.l */
/* JADX INFO: loaded from: classes.dex */
final class MenuItemOnMenuItemClickListenerC1439l implements MenuItem.OnMenuItemClickListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ ViewOnCreateContextMenuListenerC1438k f4243a;

    MenuItemOnMenuItemClickListenerC1439l(ViewOnCreateContextMenuListenerC1438k viewOnCreateContextMenuListenerC1438k) {
        this.f4243a = viewOnCreateContextMenuListenerC1438k;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        this.f4243a.f4242b.m3539b(this.f4243a.f4241a);
        return true;
    }
}
