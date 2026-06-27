package com.gmail.heagoo.appdm;

import android.view.MenuItem;

/* JADX INFO: renamed from: com.gmail.heagoo.appdm.q */
/* JADX INFO: loaded from: classes.dex */
final class MenuItemOnMenuItemClickListenerC1515q implements MenuItem.OnMenuItemClickListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ ViewOnCreateContextMenuListenerC1514p f4553a;

    MenuItemOnMenuItemClickListenerC1515q(ViewOnCreateContextMenuListenerC1514p viewOnCreateContextMenuListenerC1514p) {
        this.f4553a = viewOnCreateContextMenuListenerC1514p;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        this.f4553a.f4552c.f4549a.m3658a(this.f4553a.f4550a + "/" + this.f4553a.f4551b.f4582a, (String) null);
        return true;
    }
}
