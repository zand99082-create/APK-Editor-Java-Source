package com.gmail.heagoo.appdm;

import android.view.ContextMenu;
import android.view.View;
import com.gmail.heagoo.apkeditor.pro.R;
import com.gmail.heagoo.appdm.util.C1523e;

/* JADX INFO: renamed from: com.gmail.heagoo.appdm.p */
/* JADX INFO: loaded from: classes.dex */
final class ViewOnCreateContextMenuListenerC1514p implements View.OnCreateContextMenuListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ String f4550a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C1523e f4551b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C1513o f4552c;

    ViewOnCreateContextMenuListenerC1514p(C1513o c1513o, String str, C1523e c1523e) {
        this.f4552c = c1513o;
        this.f4550a = str;
        this.f4551b = c1523e;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        contextMenu.add(0, 1, 0, R.string.appdm_open_in_editor).setOnMenuItemClickListener(new MenuItemOnMenuItemClickListenerC1515q(this));
    }
}
