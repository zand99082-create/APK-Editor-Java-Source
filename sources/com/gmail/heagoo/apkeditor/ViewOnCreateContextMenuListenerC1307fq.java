package com.gmail.heagoo.apkeditor;

import android.view.ContextMenu;
import android.view.View;
import com.gmail.heagoo.apkeditor.pro.R;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.fq */
/* JADX INFO: loaded from: classes.dex */
final class ViewOnCreateContextMenuListenerC1307fq implements View.OnCreateContextMenuListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ int f3820a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ DialogC1305fo f3821b;

    ViewOnCreateContextMenuListenerC1307fq(DialogC1305fo dialogC1305fo, int i) {
        this.f3821b = dialogC1305fo;
        this.f3820a = i;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        contextMenu.add(0, 1, 0, R.string.delete).setOnMenuItemClickListener(new MenuItemOnMenuItemClickListenerC1308fr(this));
        contextMenu.add(0, 2, 0, R.string.extract).setOnMenuItemClickListener(new MenuItemOnMenuItemClickListenerC1309fs(this));
        contextMenu.add(0, 3, 0, R.string.replace).setOnMenuItemClickListener(new MenuItemOnMenuItemClickListenerC1310ft(this));
    }
}
