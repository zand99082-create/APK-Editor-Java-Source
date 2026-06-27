package com.gmail.heagoo.neweditor;

import android.content.Context;
import com.gmail.heagoo.apkeditor.p090a.InterfaceC1108d;
import com.gmail.heagoo.apkeditor.p090a.InterfaceC1110f;
import com.gmail.heagoo.apkeditor.p097f.AsyncTaskC1287a;
import com.gmail.heagoo.apkeditor.pro.R;
import com.gmail.heagoo.common.C1554c;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: renamed from: com.gmail.heagoo.neweditor.a */
/* JADX INFO: loaded from: classes.dex */
public class C1581a implements InterfaceC1108d, Serializable {

    /* JADX INFO: renamed from: a */
    private String f4748a;

    /* JADX INFO: renamed from: b */
    private String f4749b;

    /* JADX INFO: renamed from: c */
    private int f4750c;

    /* JADX INFO: renamed from: d */
    private int f4751d;

    public C1581a() {
    }

    public C1581a(int i, String str, String str2) {
        this.f4751d = C1591b.f4810a;
        this.f4750c = i;
        this.f4749b = str;
        this.f4748a = str2;
        if (str.length() == 0 && this.f4748a.length() > 0) {
            this.f4751d = C1591b.f4811b;
        }
        if (str.length() > 0 && this.f4748a.length() == 0) {
            this.f4751d = C1591b.f4812c;
        }
        if (str.length() <= 0 || this.f4748a.length() <= 0) {
            return;
        }
        this.f4751d = C1591b.f4813d;
    }

    @Override // com.gmail.heagoo.apkeditor.p090a.InterfaceC1108d
    /* JADX INFO: renamed from: a */
    public void mo2954a(Context context, String str, Map map, InterfaceC1110f interfaceC1110f) throws Throwable {
        if (interfaceC1110f != null) {
            interfaceC1110f.mo3017a(context.getString(R.string.decode_dex_file));
        }
        String str2 = context.getFilesDir().getAbsolutePath() + "/decoded";
        new C1554c().mo3757a("rm -rf " + str2 + "/smali", (String[]) null, (Integer) 10000);
        new AsyncTaskC1287a(context, str, str2, null).m3269a();
        if (interfaceC1110f != null) {
            interfaceC1110f.mo3017a("");
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m3867a(C1581a c1581a) {
        if (this.f4751d == C1591b.f4811b && c1581a.f4751d == C1591b.f4811b && c1581a.f4748a.length() == 1 && !Character.isWhitespace(c1581a.f4748a.charAt(0)) && this.f4750c + this.f4748a.length() == c1581a.f4750c) {
            return true;
        }
        return this.f4751d == C1591b.f4812c && c1581a.f4751d == C1591b.f4812c && c1581a.f4749b.length() == 1 && !Character.isWhitespace(c1581a.f4749b.charAt(0)) && c1581a.f4750c + c1581a.f4749b.length() == this.f4750c;
    }

    /* JADX INFO: renamed from: b */
    public final void m3868b(C1581a c1581a) {
        if (this.f4751d == C1591b.f4811b && c1581a.f4751d == C1591b.f4811b) {
            this.f4748a += c1581a.f4748a;
        }
        if (this.f4751d == C1591b.f4812c && c1581a.f4751d == C1591b.f4812c) {
            this.f4749b = c1581a.f4749b + this.f4749b;
            this.f4750c = c1581a.f4750c;
        }
    }
}
