package com.gmail.heagoo.apkeditor;

import android.view.MenuItem;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.ae */
/* JADX INFO: loaded from: classes.dex */
final class MenuItemOnMenuItemClickListenerC1123ae implements MenuItem.OnMenuItemClickListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ ViewOnCreateContextMenuListenerC1122ad f3330a;

    MenuItemOnMenuItemClickListenerC1123ae(ViewOnCreateContextMenuListenerC1122ad viewOnCreateContextMenuListenerC1122ad) {
        this.f3330a = viewOnCreateContextMenuListenerC1122ad;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(this.f3330a.f3327a));
        this.f3330a.f3328b.f2949e.m3315c(arrayList);
        return true;
    }
}
