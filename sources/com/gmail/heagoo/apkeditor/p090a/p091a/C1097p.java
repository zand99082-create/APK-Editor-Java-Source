package com.gmail.heagoo.apkeditor.p090a.p091a;

import android.content.Context;
import com.gmail.heagoo.apkeditor.p090a.InterfaceC1108d;
import com.gmail.heagoo.apkeditor.p090a.InterfaceC1110f;
import com.gmail.heagoo.apkeditor.p093b.C1149e;
import com.gmail.heagoo.common.C1570s;
import com.gmail.heagoo.p084a.p089c.C1067a;
import java.io.Serializable;
import java.util.Map;
import p000a.p001a.p003b.p004a.p005a.C0027x;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.a.a.p */
/* JADX INFO: loaded from: classes.dex */
public final class C1097p implements InterfaceC1108d, Serializable {

    /* JADX INFO: renamed from: a */
    private String f3209a;

    /* JADX INFO: renamed from: b */
    private String f3210b;

    public C1097p(String str, String str2) {
        this.f3209a = str;
        this.f3210b = str2;
    }

    @Override // com.gmail.heagoo.apkeditor.p090a.InterfaceC1108d
    /* JADX INFO: renamed from: a */
    public final void mo2954a(Context context, String str, Map map, InterfaceC1110f interfaceC1110f) {
        for (String str2 : C0027x.m35c(str, "")) {
            if (str2.endsWith(".dex")) {
                String str3 = C1067a.m2525d(context, "tmp") + C1570s.m3787a(6) + ".dex";
                if (new C1149e(str, str2).m3062a(this.f3209a, this.f3210b, str3)) {
                    map.put(str2, str3);
                }
            }
        }
    }
}
