package com.gmail.heagoo.common;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;

/* JADX INFO: loaded from: classes.dex */
public class DynamicExpandListView extends ListView implements AbsListView.OnScrollListener {

    /* JADX INFO: renamed from: a */
    private C1558g f4627a;

    /* JADX INFO: renamed from: b */
    private int f4628b;

    public DynamicExpandListView(Context context) {
        super(context);
        this.f4628b = 30;
        setOnScrollListener(this);
    }

    public DynamicExpandListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4628b = 30;
        setOnScrollListener(this);
    }

    public DynamicExpandListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4628b = 30;
        setOnScrollListener(this);
    }

    /* JADX INFO: renamed from: a */
    public final void m3748a() {
        if (this.f4627a != null) {
            this.f4627a.notifyDataSetChanged();
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        if (i + i2 < i3 || this.f4627a == null) {
            return;
        }
        this.f4627a.m3767a();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i) {
    }

    @Override // android.widget.AdapterView
    public void setAdapter(ListAdapter listAdapter) {
        this.f4627a = new C1558g(listAdapter, this.f4628b);
        super.setAdapter((ListAdapter) this.f4627a);
    }
}
