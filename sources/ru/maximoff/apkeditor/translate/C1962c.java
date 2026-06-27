package ru.maximoff.apkeditor.translate;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: ru.maximoff.apkeditor.translate.c */
/* JADX INFO: loaded from: classes.dex */
public class C1962c {

    /* JADX INFO: renamed from: a */
    private Context f5326a;

    /* JADX INFO: renamed from: b */
    private InterfaceC1963d f5327b;

    /* JADX INFO: renamed from: c */
    private String f5328c;

    /* JADX INFO: renamed from: d */
    private String f5329d;

    /* JADX INFO: renamed from: e */
    private String f5330e;

    /* JADX INFO: renamed from: f */
    private String f5331f = "Mozilla/5.0 (Linux; Android 10) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/80.0.3987.119 Mobile Safari/537.36";

    /* JADX INFO: renamed from: g */
    private boolean f5332g = false;

    /* JADX INFO: renamed from: h */
    private Map f5333h = new HashMap();

    public C1962c(Context context, String str, String str2, String str3) {
        this.f5326a = context;
        this.f5328c = str;
        this.f5329d = str2;
        this.f5330e = str3;
    }

    /* JADX INFO: renamed from: a */
    public void m4371a() {
        if (!this.f5332g) {
            new AsyncTaskC1978s(this.f5326a, this.f5328c, this.f5329d, this.f5330e, this.f5331f, this.f5327b).execute(new String[0]);
            return;
        }
        AsyncTaskC1960a asyncTaskC1960a = new AsyncTaskC1960a(this.f5326a, this.f5328c, this.f5329d, this.f5330e, this.f5331f, this.f5327b);
        asyncTaskC1960a.m4366a(this.f5333h);
        asyncTaskC1960a.execute(new String[0]);
    }

    /* JADX INFO: renamed from: a */
    public void m4372a(String str) {
        if (str != null) {
            this.f5331f = str;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m4373a(Map map) {
        this.f5333h = map;
    }

    /* JADX INFO: renamed from: a */
    public void m4374a(InterfaceC1963d interfaceC1963d) {
        this.f5327b = interfaceC1963d;
    }

    /* JADX INFO: renamed from: a */
    public void m4375a(boolean z) {
        this.f5332g = z;
    }
}
