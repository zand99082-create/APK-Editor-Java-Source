package com.gmail.heagoo.apkeditor;

import android.view.ContextMenu;
import android.view.View;
import com.gmail.heagoo.apkeditor.pro.R;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.fz */
/* JADX INFO: loaded from: classes.dex */
final class ViewOnCreateContextMenuListenerC1316fz implements View.OnCreateContextMenuListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ int f3848a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ DialogC1312fv f3849b;

    ViewOnCreateContextMenuListenerC1316fz(DialogC1312fv dialogC1312fv, int i) {
        this.f3849b = dialogC1312fv;
        this.f3848a = i;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        contextMenu.add(0, 1, 0, R.string.delete).setOnMenuItemClickListener(new MenuItemOnMenuItemClickListenerC1318ga(this));
        contextMenu.add(0, 2, 0, R.string.extract).setOnMenuItemClickListener(new MenuItemOnMenuItemClickListenerC1319gb(this));
        contextMenu.add(0, 3, 0, R.string.replace).setOnMenuItemClickListener(new MenuItemOnMenuItemClickListenerC1320gc(this));
    }
}
