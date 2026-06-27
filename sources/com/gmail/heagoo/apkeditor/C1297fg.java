package com.gmail.heagoo.apkeditor;

import android.util.LruCache;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.fg */
/* JADX INFO: loaded from: classes.dex */
final class C1297fg extends LruCache {
    C1297fg(C1296ff c1296ff, int i) {
        super(64);
    }

    @Override // android.util.LruCache
    protected final /* synthetic */ void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        C1299fi c1299fi = (C1299fi) obj2;
        if (c1299fi.f3787a != null) {
            c1299fi.f3787a.recycle();
        }
    }
}
