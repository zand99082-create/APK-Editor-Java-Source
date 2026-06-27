package com.gmail.heagoo.apkeditor.p098se;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.se.s */
/* JADX INFO: loaded from: classes.dex */
public final class C1446s extends PagerAdapter {

    /* JADX INFO: renamed from: a */
    private List f4252a;

    public C1446s(SimpleEditActivity simpleEditActivity, List list) {
        this.f4252a = list;
    }

    @Override // android.support.v4.view.PagerAdapter
    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) this.f4252a.get(i));
    }

    @Override // android.support.v4.view.PagerAdapter
    public final int getCount() {
        return this.f4252a.size();
    }

    @Override // android.support.v4.view.PagerAdapter
    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        viewGroup.addView((View) this.f4252a.get(i), 0);
        return this.f4252a.get(i);
    }

    @Override // android.support.v4.view.PagerAdapter
    public final boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }
}
