package com.gmail.heagoo.apkeditor;

import android.view.ContextMenu;
import android.view.View;
import com.gmail.heagoo.apkeditor.pro.R;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.co */
/* JADX INFO: loaded from: classes.dex */
final class ViewOnCreateContextMenuListenerC1198co implements View.OnCreateContextMenuListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ DialogC1197cn f3512a;

    ViewOnCreateContextMenuListenerC1198co(DialogC1197cn dialogC1197cn) {
        this.f3512a = dialogC1197cn;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        contextMenu.add(0, 1, 0, R.string.new_folder).setOnMenuItemClickListener(new MenuItemOnMenuItemClickListenerC1199cp(this));
    }
}
