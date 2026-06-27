package com.gmail.heagoo.apkeditor.prj;

import com.gmail.heagoo.common.C1552a;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.prj.b */
/* JADX INFO: loaded from: classes.dex */
final class C1417b extends Thread {

    /* JADX INFO: renamed from: a */
    private boolean f4123a = false;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ ProjectListActivity f4124b;

    C1417b(ProjectListActivity projectListActivity) {
        this.f4124b = projectListActivity;
    }

    /* JADX INFO: renamed from: a */
    final void m3485a() {
        this.f4123a = true;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        new C1552a();
        int i = 0;
        while (true) {
            int i2 = i;
            if (this.f4123a || i2 >= this.f4124b.f4120c.size()) {
                return;
            }
            C1421f c1421f = (C1421f) this.f4124b.f4120c.get(i2);
            try {
                this.f4124b.f4122e.m3486a(c1421f.f4136b, C1552a.m3750a(this.f4124b, c1421f.f4136b).f4631c);
            } catch (Exception e) {
            }
            i = i2 + 1;
        }
    }
}
