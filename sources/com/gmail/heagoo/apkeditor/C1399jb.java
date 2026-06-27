package com.gmail.heagoo.apkeditor;

import android.content.Intent;
import com.gmail.heagoo.apkeditor.pro.R;
import p000a.p001a.p003b.p004a.InterfaceC0042p;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.jb */
/* JADX INFO: loaded from: classes.dex */
class C1399jb implements InterfaceC0042p {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ SettingHideActivity f4065a;

    C1399jb(SettingHideActivity settingHideActivity) {
        this.f4065a = settingHideActivity;
    }

    @Override // p000a.p001a.p003b.p004a.InterfaceC0042p
    /* JADX INFO: renamed from: a */
    public void mo99a() {
        this.f4065a.finish();
        this.f4065a.overridePendingTransition(R.anim.abc_fade_in_out, R.anim.abc_fade_out);
        this.f4065a.startActivity(new Intent(this.f4065a, (Class<?>) SettingHideActivity.class));
        this.f4065a.overridePendingTransition(R.anim.abc_fade_in, R.anim.abc_fade_in_out);
    }
}
