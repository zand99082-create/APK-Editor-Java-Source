package com.gmail.heagoo.apkeditor;

import com.gmail.heagoo.common.C1552a;
import com.gmail.heagoo.common.C1553b;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.cm */
/* JADX INFO: loaded from: classes.dex */
final class C1196cm extends Thread {

    /* JADX INFO: renamed from: a */
    private C1552a f3498a = null;

    /* JADX INFO: renamed from: b */
    private boolean f3499b = false;

    /* JADX INFO: renamed from: c */
    private List f3500c = new LinkedList();

    /* JADX INFO: renamed from: d */
    private /* synthetic */ FileListActivity f3501d;

    C1196cm(FileListActivity fileListActivity) {
        this.f3501d = fileListActivity;
    }

    /* JADX INFO: renamed from: a */
    public final void m3109a() {
        this.f3499b = true;
        synchronized (this.f3500c) {
            this.f3500c.notify();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m3110a(String str) {
        synchronized (this.f3500c) {
            this.f3500c.add(str);
            this.f3500c.notify();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        String str;
        C1553b c1553bM3750a;
        this.f3498a = new C1552a();
        while (!this.f3499b) {
            synchronized (this.f3500c) {
                if (this.f3500c.isEmpty()) {
                    try {
                        this.f3500c.wait();
                    } catch (InterruptedException e) {
                    }
                }
                str = !this.f3500c.isEmpty() ? (String) this.f3500c.remove(0) : null;
            }
            if (str != null) {
                try {
                    c1553bM3750a = C1552a.m3750a(this.f3501d, str);
                } catch (Throwable th) {
                    c1553bM3750a = null;
                }
                if (c1553bM3750a != null) {
                    this.f3501d.f3037k.put(str, c1553bM3750a);
                    FileListActivity.m2775g(this.f3501d);
                }
            }
        }
    }
}
