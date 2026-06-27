package com.gmail.heagoo.apkeditor;

import android.app.Activity;
import android.support.v4.view.PointerIconCompat;
import com.gmail.heagoo.p084a.p089c.C1067a;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.ec */
/* JADX INFO: loaded from: classes.dex */
final class C1264ec implements InterfaceC1204cu {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ ViewOnClickListenerC1263eb f3662a;

    C1264ec(ViewOnClickListenerC1263eb viewOnClickListenerC1263eb) {
        this.f3662a = viewOnClickListenerC1263eb;
    }

    @Override // com.gmail.heagoo.apkeditor.InterfaceC1204cu
    /* JADX INFO: renamed from: a */
    public final void mo2764a(String str, String str2, boolean z) throws Throwable {
        if (z) {
            ((ApkInfoActivity) this.f3662a.f3661a.f3572a.get()).m2696a(str, str2, (InterfaceC1337gu) null);
            C1067a.m2465a((Activity) this.f3662a.f3661a.f3572a.get(), str, PointerIconCompat.TYPE_CONTEXT_MENU);
        } else {
            ((ApkInfoActivity) this.f3662a.f3661a.f3572a.get()).m2706b(str2, str);
            ((ApkInfoActivity) this.f3662a.f3661a.f3572a.get()).m2701a(true);
        }
    }

    @Override // com.gmail.heagoo.apkeditor.InterfaceC1204cu
    /* JADX INFO: renamed from: a */
    public final boolean mo2765a(String str, String str2) {
        return str.endsWith(".xml");
    }

    @Override // com.gmail.heagoo.apkeditor.InterfaceC1204cu
    /* JADX INFO: renamed from: b */
    public final String mo2766b(String str, String str2) {
        return null;
    }
}
