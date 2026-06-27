package com.gmail.heagoo.p100b;

import android.view.MenuItem;

/* JADX INFO: renamed from: com.gmail.heagoo.b.r */
/* JADX INFO: loaded from: classes.dex */
final class MenuItemOnMenuItemClickListenerC1550r implements MenuItem.OnMenuItemClickListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ ViewOnCreateContextMenuListenerC1538f f4625a;

    MenuItemOnMenuItemClickListenerC1550r(ViewOnCreateContextMenuListenerC1538f viewOnCreateContextMenuListenerC1538f) {
        this.f4625a = viewOnCreateContextMenuListenerC1538f;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        C1537e.m3742e(this.f4625a.f4612b, this.f4625a.f4611a);
        return true;
    }
}
