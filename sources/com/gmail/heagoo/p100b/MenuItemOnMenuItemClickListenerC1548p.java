package com.gmail.heagoo.p100b;

import android.view.MenuItem;

/* JADX INFO: renamed from: com.gmail.heagoo.b.p */
/* JADX INFO: loaded from: classes.dex */
final class MenuItemOnMenuItemClickListenerC1548p implements MenuItem.OnMenuItemClickListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ ViewOnCreateContextMenuListenerC1538f f4623a;

    MenuItemOnMenuItemClickListenerC1548p(ViewOnCreateContextMenuListenerC1538f viewOnCreateContextMenuListenerC1538f) {
        this.f4623a = viewOnCreateContextMenuListenerC1538f;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) throws Throwable {
        C1537e.m3741d(this.f4623a.f4612b, this.f4623a.f4611a);
        return true;
    }
}
