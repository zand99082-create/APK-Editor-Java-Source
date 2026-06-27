package com.gmail.heagoo.apkeditor;

import android.content.Context;
import com.gmail.heagoo.common.C1570s;
import com.gmail.heagoo.p084a.p089c.C1067a;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.fh */
/* JADX INFO: loaded from: classes.dex */
final class C1298fh implements InterfaceC1291fa {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ String f3784a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ String f3785b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ C1296ff f3786c;

    C1298fh(C1296ff c1296ff, String str, String str2) {
        this.f3786c = c1296ff;
        this.f3784a = str;
        this.f3785b = str2;
    }

    @Override // com.gmail.heagoo.apkeditor.InterfaceC1291fa
    /* JADX INFO: renamed from: a */
    public final void mo2792a() {
        File file = new File(this.f3784a);
        if (file.exists()) {
            List listM3280a = this.f3786c.m3280a(file);
            if (listM3280a != null) {
                Iterator it = listM3280a.iterator();
                while (it.hasNext()) {
                    this.f3786c.m3297l(((String) it.next()).substring(this.f3786c.f3771e.length() + 1));
                }
            }
            for (Map.Entry entry : this.f3786c.m3282a(new File(this.f3785b), file, this.f3784a.substring(this.f3786c.f3771e.length() + 1)).entrySet()) {
                this.f3786c.m3291g((String) entry.getKey(), (String) entry.getValue());
            }
            return;
        }
        String strSubstring = this.f3784a.substring(this.f3786c.f3771e.length() + 1);
        List listM3332c = this.f3786c.f3779m.m3332c(strSubstring.split("/"));
        if (listM3332c != null) {
            Iterator it2 = listM3332c.iterator();
            while (it2.hasNext()) {
                this.f3786c.m3297l((String) it2.next());
            }
        }
        for (Map.Entry entry2 : this.f3786c.m3282a(new File(this.f3785b), new File(C1067a.m2525d((Context) this.f3786c.f3767a.get(), "tmp") + C1570s.m3787a(6)), strSubstring).entrySet()) {
            this.f3786c.f3779m.m3330a(((String) entry2.getKey()).split("/"), true);
            this.f3786c.m3291g((String) entry2.getKey(), (String) entry2.getValue());
        }
    }

    @Override // com.gmail.heagoo.apkeditor.InterfaceC1291fa
    /* JADX INFO: renamed from: b */
    public final void mo2793b() {
    }
}
