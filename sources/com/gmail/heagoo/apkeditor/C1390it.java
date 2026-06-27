package com.gmail.heagoo.apkeditor;

import android.content.Context;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.it */
/* JADX INFO: loaded from: classes.dex */
final class C1390it implements InterfaceC1187cb {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ Context f4035a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ String f4036b;

    C1390it(Context context, String str) {
        this.f4035a = context;
        this.f4036b = str;
    }

    @Override // com.gmail.heagoo.apkeditor.InterfaceC1187cb
    /* JADX INFO: renamed from: a */
    public final void mo3096a(int i) {
        UserAppActivity.m2903b(this.f4035a, this.f4036b, new StringBuilder().append(i).toString());
    }
}
