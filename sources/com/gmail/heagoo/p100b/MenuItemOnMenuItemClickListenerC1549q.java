package com.gmail.heagoo.p100b;

import android.view.MenuItem;

/* JADX INFO: renamed from: com.gmail.heagoo.b.q */
/* JADX INFO: loaded from: classes.dex */
final class MenuItemOnMenuItemClickListenerC1549q implements MenuItem.OnMenuItemClickListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ ViewOnCreateContextMenuListenerC1538f f4624a;

    MenuItemOnMenuItemClickListenerC1549q(ViewOnCreateContextMenuListenerC1538f viewOnCreateContextMenuListenerC1538f) {
        this.f4624a = viewOnCreateContextMenuListenerC1538f;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        C1537e.m3743f(this.f4624a.f4612b, this.f4624a.f4611a);
        return true;
    }
}
