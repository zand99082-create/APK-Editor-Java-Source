package com.gmail.heagoo.apkeditor;

import com.gmail.heagoo.common.C1554c;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.gj */
/* JADX INFO: loaded from: classes.dex */
final class C1326gj implements InterfaceC1291fa {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ String f3867a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ SettingActivity f3868b;

    C1326gj(SettingActivity settingActivity, String str) {
        this.f3868b = settingActivity;
        this.f3867a = str;
    }

    @Override // com.gmail.heagoo.apkeditor.InterfaceC1291fa
    /* JADX INFO: renamed from: a */
    public final void mo2792a() {
        this.f3868b.m2815a();
        new C1554c().mo3757a("rm -rf " + this.f3867a + "/decoded\nrm -rf " + this.f3867a + "/temp", (String[]) null, (Integer) 8000);
    }

    @Override // com.gmail.heagoo.apkeditor.InterfaceC1291fa
    /* JADX INFO: renamed from: b */
    public final void mo2793b() {
    }
}
