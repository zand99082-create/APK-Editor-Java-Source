package com.gmail.heagoo.apkeditor.p098se;

import android.graphics.Bitmap;
import android.util.LruCache;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.se.v */
/* JADX INFO: loaded from: classes.dex */
final class C1449v extends LruCache {
    C1449v(ViewOnClickListenerC1448u viewOnClickListenerC1448u, int i) {
        super(32);
    }

    @Override // android.util.LruCache
    protected final /* synthetic */ void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        ((Bitmap) obj2).recycle();
    }
}
