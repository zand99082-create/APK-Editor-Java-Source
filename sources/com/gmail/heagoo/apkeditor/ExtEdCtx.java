package com.gmail.heagoo.apkeditor;

import android.view.MenuItem;

/* JADX INFO: loaded from: classes.dex */
final class ExtEdCtx implements MenuItem.OnMenuItemClickListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ ViewOnCreateContextMenuListenerC1122ad f3030a;

    ExtEdCtx(ViewOnCreateContextMenuListenerC1122ad viewOnCreateContextMenuListenerC1122ad) {
        this.f3030a = viewOnCreateContextMenuListenerC1122ad;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        this.f3030a.f3328b.m2703aa(this.f3030a.f3327a);
        return true;
    }
}
