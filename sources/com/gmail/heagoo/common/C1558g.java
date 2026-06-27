package com.gmail.heagoo.common;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;

/* JADX INFO: renamed from: com.gmail.heagoo.common.g */
/* JADX INFO: loaded from: classes.dex */
final class C1558g extends BaseAdapter {

    /* JADX INFO: renamed from: a */
    private int f4638a;

    /* JADX INFO: renamed from: b */
    private int f4639b = 30;

    /* JADX INFO: renamed from: c */
    private boolean f4640c;

    /* JADX INFO: renamed from: d */
    private ListAdapter f4641d;

    /* JADX INFO: renamed from: e */
    private int f4642e;

    public C1558g(ListAdapter listAdapter, int i) {
        this.f4640c = false;
        this.f4641d = listAdapter;
        this.f4638a = i;
        if (listAdapter.getCount() > this.f4638a) {
            this.f4642e = this.f4638a;
            this.f4640c = false;
        } else {
            this.f4642e = listAdapter.getCount();
            this.f4640c = true;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m3767a() {
        if (this.f4640c) {
            return;
        }
        this.f4638a += this.f4639b;
        if (this.f4641d.getCount() > this.f4638a) {
            this.f4640c = false;
            this.f4642e = this.f4638a;
        } else {
            this.f4640c = true;
            this.f4642e = this.f4641d.getCount();
        }
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f4642e;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.f4641d.getItem(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return this.f4641d.getItemId(i);
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        return this.f4641d.getView(i, view, viewGroup);
    }
}
