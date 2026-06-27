package com.gmail.heagoo.apkeditor.p098se;

import android.view.ContextMenu;
import android.view.View;
import com.gmail.heagoo.apkeditor.pro.R;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.se.k */
/* JADX INFO: loaded from: classes.dex */
final class ViewOnCreateContextMenuListenerC1438k implements View.OnCreateContextMenuListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ int f4241a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ ViewOnClickListenerC1436i f4242b;

    ViewOnCreateContextMenuListenerC1438k(ViewOnClickListenerC1436i viewOnClickListenerC1436i, int i) {
        this.f4242b = viewOnClickListenerC1436i;
        this.f4241a = i;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        contextMenu.add(0, 1, 0, R.string.extract).setOnMenuItemClickListener(new MenuItemOnMenuItemClickListenerC1439l(this));
        contextMenu.add(0, 2, 0, R.string.view).setOnMenuItemClickListener(new MenuItemOnMenuItemClickListenerC1440m(this));
        contextMenu.add(0, 3, 0, R.string.replace).setOnMenuItemClickListener(new MenuItemOnMenuItemClickListenerC1441n(this));
    }
}
