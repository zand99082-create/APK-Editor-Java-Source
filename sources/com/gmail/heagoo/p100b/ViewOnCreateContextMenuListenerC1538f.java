package com.gmail.heagoo.p100b;

import android.view.ContextMenu;
import android.view.View;
import com.gmail.heagoo.apkeditor.pro.R;

/* JADX INFO: renamed from: com.gmail.heagoo.b.f */
/* JADX INFO: loaded from: classes.dex */
final class ViewOnCreateContextMenuListenerC1538f implements View.OnCreateContextMenuListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ int f4611a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C1537e f4612b;

    ViewOnCreateContextMenuListenerC1538f(C1537e c1537e, int i) {
        this.f4612b = c1537e;
        this.f4611a = i;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        contextMenu.add(0, 1, 0, R.string.delete).setOnMenuItemClickListener(new MenuItemOnMenuItemClickListenerC1539g(this));
        contextMenu.add(0, 2, 0, R.string.rename).setOnMenuItemClickListener(new MenuItemOnMenuItemClickListenerC1540h(this));
        contextMenu.add(0, 3, 0, R.string.new_file).setOnMenuItemClickListener(new MenuItemOnMenuItemClickListenerC1541i(this));
        contextMenu.add(0, 4, 0, R.string.install).setOnMenuItemClickListener(new MenuItemOnMenuItemClickListenerC1548p(this));
        contextMenu.add(0, 5, 0, R.string.sign).setOnMenuItemClickListener(new MenuItemOnMenuItemClickListenerC1549q(this));
        contextMenu.add(0, 6, 0, R.string.action_verify).setOnMenuItemClickListener(new MenuItemOnMenuItemClickListenerC1551s(this));
    }
}
