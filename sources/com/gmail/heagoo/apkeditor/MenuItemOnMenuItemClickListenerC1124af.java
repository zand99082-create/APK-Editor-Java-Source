package com.gmail.heagoo.apkeditor;

import android.view.MenuItem;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.af */
/* JADX INFO: loaded from: classes.dex */
final class MenuItemOnMenuItemClickListenerC1124af implements MenuItem.OnMenuItemClickListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ ViewOnCreateContextMenuListenerC1122ad f3331a;

    MenuItemOnMenuItemClickListenerC1124af(ViewOnCreateContextMenuListenerC1122ad viewOnCreateContextMenuListenerC1122ad) {
        this.f3331a = viewOnCreateContextMenuListenerC1122ad;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(this.f3331a.f3327a));
        this.f3331a.f3328b.m2699a((List) arrayList);
        return true;
    }
}
