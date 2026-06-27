package com.gmail.heagoo.apkeditor.prj;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.prj.c */
/* JADX INFO: loaded from: classes.dex */
final class HandlerC1418c extends Handler {

    /* JADX INFO: renamed from: a */
    private WeakReference f4125a;

    /* JADX INFO: renamed from: b */
    private final Map f4126b = new HashMap();

    HandlerC1418c(ProjectListActivity projectListActivity) {
        this.f4125a = new WeakReference(projectListActivity);
    }

    /* JADX INFO: renamed from: a */
    final void m3486a(String str, Drawable drawable) {
        synchronized (this.f4126b) {
            this.f4126b.put(str, drawable);
        }
        sendEmptyMessage(0);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        switch (message.what) {
            case 0:
                synchronized (this.f4126b) {
                    ((ProjectListActivity) this.f4125a.get()).f4118a.m3490a(this.f4126b);
                    break;
                }
                ((ProjectListActivity) this.f4125a.get()).f4118a.notifyDataSetChanged();
                return;
            default:
                return;
        }
    }
}
