package com.gmail.heagoo.apkeditor.p099ui;

import android.content.Context;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.widget.ListView;
import com.gmail.heagoo.neweditor.InterfaceC1608s;

/* JADX INFO: loaded from: classes.dex */
public class LayoutObListView extends ListView implements InterfaceC1608s {

    /* JADX INFO: renamed from: a */
    private boolean f4296a;

    /* JADX INFO: renamed from: b */
    private boolean f4297b;

    /* JADX INFO: renamed from: c */
    private int f4298c;

    /* JADX INFO: renamed from: d */
    private int f4299d;

    /* JADX INFO: renamed from: e */
    private int f4300e;

    public LayoutObListView(Context context) {
        super(context);
        this.f4296a = false;
        this.f4298c = -1;
    }

    public LayoutObListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4296a = false;
        this.f4298c = -1;
    }

    public LayoutObListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4296a = false;
        this.f4298c = -1;
    }

    @RequiresApi(21)
    public LayoutObListView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f4296a = false;
        this.f4298c = -1;
    }

    /* JADX INFO: renamed from: a */
    public final void m3564a(int i, int i2, int i3) {
        if (i >= getFirstVisiblePosition() && i <= getLastVisiblePosition()) {
            this.f4298c = i;
            this.f4299d = i2;
            this.f4300e = i3;
        }
    }

    @Override // com.gmail.heagoo.neweditor.InterfaceC1608s
    /* JADX INFO: renamed from: a */
    public final void mo3565a(boolean z) {
        this.f4297b = z;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m3566a() {
        return this.f4296a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m3567b() {
        return this.f4297b;
    }

    /* JADX INFO: renamed from: c */
    public final void m3568c() {
        this.f4298c = 0;
        this.f4299d = 0;
        this.f4300e = 0;
    }

    /* JADX INFO: renamed from: d */
    public final int m3569d() {
        return this.f4298c;
    }

    /* JADX INFO: renamed from: e */
    public final int m3570e() {
        return this.f4299d;
    }

    /* JADX INFO: renamed from: f */
    public final int m3571f() {
        return this.f4300e;
    }

    @Override // android.widget.ListView, android.widget.AbsListView
    protected void layoutChildren() {
        this.f4296a = true;
        super.layoutChildren();
        this.f4296a = false;
    }
}
