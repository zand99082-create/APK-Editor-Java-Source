package com.gmail.heagoo.p100b;

import android.view.MenuItem;

/* JADX INFO: renamed from: com.gmail.heagoo.b.s */
/* JADX INFO: loaded from: classes.dex */
final class MenuItemOnMenuItemClickListenerC1551s implements MenuItem.OnMenuItemClickListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ ViewOnCreateContextMenuListenerC1538f f4626a;

    MenuItemOnMenuItemClickListenerC1551s(ViewOnCreateContextMenuListenerC1538f viewOnCreateContextMenuListenerC1538f) {
        this.f4626a = viewOnCreateContextMenuListenerC1538f;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        C1537e.m3744g(this.f4626a.f4612b, this.f4626a.f4611a);
        return true;
    }
}
