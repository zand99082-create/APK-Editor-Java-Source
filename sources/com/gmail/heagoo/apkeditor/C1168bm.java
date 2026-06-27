package com.gmail.heagoo.apkeditor;

import android.graphics.drawable.Drawable;
import android.util.LruCache;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.bm */
/* JADX INFO: loaded from: classes.dex */
final class C1168bm extends LruCache {
    C1168bm(C1167bl c1167bl, int i) {
        super(32);
    }

    @Override // android.util.LruCache
    protected final /* synthetic */ void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        ((Drawable) obj2).setCallback(null);
    }
}
