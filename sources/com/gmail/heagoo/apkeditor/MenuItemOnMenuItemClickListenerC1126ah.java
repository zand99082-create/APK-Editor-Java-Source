package com.gmail.heagoo.apkeditor;

import android.view.MenuItem;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.ah */
/* JADX INFO: loaded from: classes.dex */
final class MenuItemOnMenuItemClickListenerC1126ah implements MenuItem.OnMenuItemClickListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ ViewOnCreateContextMenuListenerC1122ad f3333a;

    MenuItemOnMenuItemClickListenerC1126ah(ViewOnCreateContextMenuListenerC1122ad viewOnCreateContextMenuListenerC1122ad) {
        this.f3333a = viewOnCreateContextMenuListenerC1122ad;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        this.f3333a.f3328b.m2691a(this.f3333a.f3327a);
        return true;
    }
}
