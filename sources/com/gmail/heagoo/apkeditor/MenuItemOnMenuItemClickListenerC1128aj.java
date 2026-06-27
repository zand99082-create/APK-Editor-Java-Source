package com.gmail.heagoo.apkeditor;

import android.view.MenuItem;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.aj */
/* JADX INFO: loaded from: classes.dex */
final class MenuItemOnMenuItemClickListenerC1128aj implements MenuItem.OnMenuItemClickListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ ViewOnCreateContextMenuListenerC1122ad f3335a;

    MenuItemOnMenuItemClickListenerC1128aj(ViewOnCreateContextMenuListenerC1122ad viewOnCreateContextMenuListenerC1122ad) {
        this.f3335a = viewOnCreateContextMenuListenerC1122ad;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        this.f3335a.f3328b.m2719g();
        return true;
    }
}
