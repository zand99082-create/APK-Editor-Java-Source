package com.gmail.heagoo.apkeditor.p098se;

import android.util.LruCache;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.se.j */
/* JADX INFO: loaded from: classes.dex */
final class C1437j extends LruCache {
    C1437j(ViewOnClickListenerC1436i viewOnClickListenerC1436i, int i) {
        super(32);
    }

    @Override // android.util.LruCache
    protected final /* synthetic */ void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        C1442o c1442o = (C1442o) obj2;
        if (c1442o.f4246a != null) {
            c1442o.f4246a.recycle();
        }
    }
}
