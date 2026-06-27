package com.gmail.heagoo.apkeditor.util;

import android.app.Activity;
import android.widget.Toast;
import com.gmail.heagoo.apkeditor.ApkComposeActivity;
import com.gmail.heagoo.apkeditor.InterfaceC1291fa;
import com.gmail.heagoo.apkeditor.pro.R;
import java.util.Map;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.util.e */
/* JADX INFO: loaded from: classes.dex */
final class C1464e implements InterfaceC1291fa {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ Activity f4348a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ C1463d f4349b;

    C1464e(C1463d c1463d, Activity activity) {
        this.f4349b = c1463d;
        this.f4348a = activity;
    }

    @Override // com.gmail.heagoo.apkeditor.InterfaceC1291fa
    /* JADX INFO: renamed from: a */
    public final void mo2792a() {
        this.f4349b.f4345d.mo3602b();
        C1463d c1463d = this.f4349b;
        Map mapMo3604d = this.f4349b.f4345d.mo3604d();
        if (mapMo3604d != null) {
            for (Map.Entry entry : mapMo3604d.entrySet()) {
                String str = (String) entry.getKey();
                Map map = (Map) c1463d.f4342a.get(str);
                if (map == null) {
                    c1463d.f4342a.put(str, entry.getValue());
                } else {
                    map.putAll((Map) entry.getValue());
                }
            }
        }
    }

    @Override // com.gmail.heagoo.apkeditor.InterfaceC1291fa
    /* JADX INFO: renamed from: b */
    public final void mo2793b() {
        if (!this.f4349b.f4345d.mo3603c()) {
            Toast.makeText(this.f4348a, R.string.str_fix_failed, 0).show();
            return;
        }
        Toast.makeText(this.f4348a, this.f4349b.f4345d.mo3599a(this.f4348a), 0).show();
        ((ApkComposeActivity) this.f4348a).m2600c();
    }
}
