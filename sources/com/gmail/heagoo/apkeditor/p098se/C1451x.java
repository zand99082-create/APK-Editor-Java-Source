package com.gmail.heagoo.apkeditor.p098se;

import android.app.Activity;
import android.content.Context;
import com.gmail.heagoo.apkeditor.DialogC1190ce;
import com.gmail.heagoo.apkeditor.InterfaceC1204cu;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.se.x */
/* JADX INFO: loaded from: classes.dex */
final class C1451x implements InterfaceC1204cu {

    /* JADX INFO: renamed from: a */
    private WeakReference f4274a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ Activity f4275b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ String f4276c;

    /* JADX INFO: renamed from: d */
    private /* synthetic */ List f4277d;

    C1451x(Activity activity, String str, List list) {
        this.f4275b = activity;
        this.f4276c = str;
        this.f4277d = list;
        this.f4274a = new WeakReference(this.f4275b);
    }

    @Override // com.gmail.heagoo.apkeditor.InterfaceC1204cu
    /* JADX INFO: renamed from: a */
    public final void mo2764a(String str, String str2, boolean z) {
        new DialogC1190ce((Context) this.f4274a.get(), this.f4276c, (String) null, (Map) null, this.f4277d, str).show();
    }

    @Override // com.gmail.heagoo.apkeditor.InterfaceC1204cu
    /* JADX INFO: renamed from: a */
    public final boolean mo2765a(String str, String str2) {
        return true;
    }

    @Override // com.gmail.heagoo.apkeditor.InterfaceC1204cu
    /* JADX INFO: renamed from: b */
    public final String mo2766b(String str, String str2) {
        return null;
    }
}
