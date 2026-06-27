package com.gmail.heagoo.apkeditor;

import android.view.MenuItem;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.ai */
/* JADX INFO: loaded from: classes.dex */
final class MenuItemOnMenuItemClickListenerC1127ai implements MenuItem.OnMenuItemClickListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ ViewOnCreateContextMenuListenerC1122ad f3334a;

    MenuItemOnMenuItemClickListenerC1127ai(ViewOnCreateContextMenuListenerC1122ad viewOnCreateContextMenuListenerC1122ad) {
        this.f3334a = viewOnCreateContextMenuListenerC1122ad;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        this.f3334a.f3328b.m2716f();
        return true;
    }
}
