package com.gmail.heagoo.apkeditor.p098se;

import android.view.ContextMenu;
import android.view.View;
import com.gmail.heagoo.apkeditor.pro.R;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.se.d */
/* JADX INFO: loaded from: classes.dex */
final class ViewOnCreateContextMenuListenerC1431d implements View.OnCreateContextMenuListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ int f4224a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ ViewOnClickListenerC1430c f4225b;

    ViewOnCreateContextMenuListenerC1431d(ViewOnClickListenerC1430c viewOnClickListenerC1430c, int i) {
        this.f4225b = viewOnClickListenerC1430c;
        this.f4224a = i;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        contextMenu.add(0, 1, 0, R.string.extract).setOnMenuItemClickListener(new MenuItemOnMenuItemClickListenerC1432e(this));
        contextMenu.add(0, 2, 0, R.string.replace).setOnMenuItemClickListener(new MenuItemOnMenuItemClickListenerC1433f(this));
    }
}
