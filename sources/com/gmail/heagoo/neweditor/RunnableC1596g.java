package com.gmail.heagoo.neweditor;

import android.widget.ScrollView;

/* JADX INFO: renamed from: com.gmail.heagoo.neweditor.g */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1596g implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ C1594e f4834a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ EditorActivity f4835b;

    RunnableC1596g(EditorActivity editorActivity, C1594e c1594e) {
        this.f4835b = editorActivity;
        this.f4834a = c1594e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ScrollView scrollView = this.f4835b.f4703K;
        C1594e c1594e = this.f4834a;
        C1594e c1594e2 = this.f4834a;
        scrollView.scrollTo(0, 0);
    }
}
