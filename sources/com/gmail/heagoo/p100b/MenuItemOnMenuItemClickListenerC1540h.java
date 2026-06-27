package com.gmail.heagoo.p100b;

import android.view.MenuItem;

/* JADX INFO: renamed from: com.gmail.heagoo.b.h */
/* JADX INFO: loaded from: classes.dex */
final class MenuItemOnMenuItemClickListenerC1540h implements MenuItem.OnMenuItemClickListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ ViewOnCreateContextMenuListenerC1538f f4614a;

    MenuItemOnMenuItemClickListenerC1540h(ViewOnCreateContextMenuListenerC1538f viewOnCreateContextMenuListenerC1538f) {
        this.f4614a = viewOnCreateContextMenuListenerC1538f;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        C1537e.m3738b(this.f4614a.f4612b, this.f4614a.f4611a);
        return true;
    }
}
