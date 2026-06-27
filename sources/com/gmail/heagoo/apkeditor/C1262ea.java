package com.gmail.heagoo.apkeditor;

import android.content.Context;
import java.util.Map;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.ea */
/* JADX INFO: loaded from: classes.dex */
final class C1262ea implements InterfaceC1204cu {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ ViewOnClickListenerC1230dz f3660a;

    C1262ea(ViewOnClickListenerC1230dz viewOnClickListenerC1230dz) {
        this.f3660a = viewOnClickListenerC1230dz;
    }

    @Override // com.gmail.heagoo.apkeditor.InterfaceC1204cu
    /* JADX INFO: renamed from: a */
    public final void mo2764a(String str, String str2, boolean z) {
        new DialogC1190ce((Context) this.f3660a.f3577a.f3572a.get(), this.f3660a.f3577a.f3573b, str, (String) null, (String) null, (Map) null).show();
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
