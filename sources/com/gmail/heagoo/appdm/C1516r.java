package com.gmail.heagoo.appdm;

import com.gmail.heagoo.apkeditor.InterfaceC1291fa;
import com.gmail.heagoo.appdm.util.C1524f;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.gmail.heagoo.appdm.r */
/* JADX INFO: loaded from: classes.dex */
final class C1516r implements InterfaceC1291fa {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ String f4554a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ PrefOverallActivity f4555b;

    C1516r(PrefOverallActivity prefOverallActivity, String str) {
        this.f4555b = prefOverallActivity;
        this.f4554a = str;
    }

    @Override // com.gmail.heagoo.apkeditor.InterfaceC1291fa
    /* JADX INFO: renamed from: a */
    public final void mo2792a() {
        List listM3709a = this.f4555b.f4470p.m3709a(this.f4554a, true);
        Collections.sort(listM3709a, new C1524f());
        if (listM3709a != null) {
            this.f4555b.f4470p.m3710a(this.f4554a, listM3709a);
        }
    }

    @Override // com.gmail.heagoo.apkeditor.InterfaceC1291fa
    /* JADX INFO: renamed from: b */
    public final void mo2793b() {
    }
}
