package com.gmail.heagoo.appdm;

import java.util.List;

/* JADX INFO: renamed from: com.gmail.heagoo.appdm.af */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1497af implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ String f4502a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ List f4503b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ C1495ad f4504c;

    RunnableC1497af(C1495ad c1495ad, String str, List list) {
        this.f4504c = c1495ad;
        this.f4502a = str;
        this.f4503b = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f4504c.f4498f) {
            this.f4504c.f4495c = this.f4502a;
            this.f4504c.f4498f.clear();
            if (!this.f4504c.f4495c.equals(this.f4504c.f4494b)) {
                this.f4504c.f4498f.add(C1495ad.m3700a());
            }
            this.f4504c.f4498f.addAll(this.f4503b);
        }
        this.f4504c.notifyDataSetChanged();
    }
}
