package com.gmail.heagoo.p100b;

import android.view.MenuItem;

/* JADX INFO: renamed from: com.gmail.heagoo.b.g */
/* JADX INFO: loaded from: classes.dex */
final class MenuItemOnMenuItemClickListenerC1539g implements MenuItem.OnMenuItemClickListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ ViewOnCreateContextMenuListenerC1538f f4613a;

    MenuItemOnMenuItemClickListenerC1539g(ViewOnCreateContextMenuListenerC1538f viewOnCreateContextMenuListenerC1538f) {
        this.f4613a = viewOnCreateContextMenuListenerC1538f;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        C1537e.m3736a(this.f4613a.f4612b, this.f4613a.f4611a);
        return true;
    }
}
