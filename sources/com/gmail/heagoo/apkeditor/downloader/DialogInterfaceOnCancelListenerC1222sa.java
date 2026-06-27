package com.gmail.heagoo.apkeditor.downloader;

import android.content.DialogInterface;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.downloader.sa */
/* JADX INFO: loaded from: classes.dex */
class DialogInterfaceOnCancelListenerC1222sa implements DialogInterface.OnCancelListener {
    final DownloadTask this$0;
    final DownloadTask val$me;

    DialogInterfaceOnCancelListenerC1222sa(DownloadTask downloadTask, DownloadTask downloadTask2) {
        this.this$0 = downloadTask;
        this.val$me = downloadTask2;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        this.val$me.cancel(true);
    }
}
