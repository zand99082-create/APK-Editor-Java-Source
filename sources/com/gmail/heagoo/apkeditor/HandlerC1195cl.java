package com.gmail.heagoo.apkeditor;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.cl */
/* JADX INFO: loaded from: classes.dex */
final class HandlerC1195cl extends Handler {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ FileListActivity f3497a;

    HandlerC1195cl(FileListActivity fileListActivity) {
        this.f3497a = fileListActivity;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        switch (message.what) {
            case 0:
                this.f3497a.f3033d.m3745a().notifyDataSetChanged();
                break;
        }
    }
}
