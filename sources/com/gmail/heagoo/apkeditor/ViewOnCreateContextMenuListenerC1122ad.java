package com.gmail.heagoo.apkeditor;

import android.view.ContextMenu;
import android.view.View;
import com.gmail.heagoo.apkeditor.pro.R;
import com.gmail.heagoo.p100b.C1533a;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.ad */
/* JADX INFO: loaded from: classes.dex */
final class ViewOnCreateContextMenuListenerC1122ad implements View.OnCreateContextMenuListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ int f3327a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ ApkInfoActivity f3328b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ boolean f3329c;

    ViewOnCreateContextMenuListenerC1122ad(ApkInfoActivity apkInfoActivity, int i, boolean z) {
        this.f3328b = apkInfoActivity;
        this.f3327a = i;
        this.f3329c = z;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        ArrayList arrayList = new ArrayList();
        String strM3300a = this.f3328b.f2949e.m3300a(arrayList);
        boolean z = ((C1533a) arrayList.get(this.f3327a)).f4595b;
        if (!this.f3329c) {
            contextMenu.add(0, 1, 0, R.string.delete).setOnMenuItemClickListener(new MenuItemOnMenuItemClickListenerC1123ae(this));
        }
        if (!this.f3329c || strM3300a.equals(this.f3328b.f2946b)) {
            contextMenu.add(0, 2, 0, R.string.extract).setOnMenuItemClickListener(new MenuItemOnMenuItemClickListenerC1124af(this));
        }
        if (!this.f3329c || strM3300a.equals(this.f3328b.f2946b)) {
            contextMenu.add(0, 3, 0, R.string.replace).setOnMenuItemClickListener(z ? new MenuItemOnMenuItemClickListenerC1125ag(this) : new MenuItemOnMenuItemClickListenerC1126ah(this));
        }
        contextMenu.add(0, 4, 0, R.string.add_a_file).setOnMenuItemClickListener(new MenuItemOnMenuItemClickListenerC1127ai(this));
        contextMenu.add(0, 5, 0, R.string.new_folder).setOnMenuItemClickListener(new MenuItemOnMenuItemClickListenerC1128aj(this));
        contextMenu.add(0, 6, 0, R.string.external_editor).setOnMenuItemClickListener(new ExtEdCtx(this));
    }
}
