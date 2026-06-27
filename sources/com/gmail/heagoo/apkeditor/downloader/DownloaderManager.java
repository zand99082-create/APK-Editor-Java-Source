package com.gmail.heagoo.apkeditor.downloader;

import android.content.Context;
import android.os.Environment;
import android.util.Base64;
import com.github.megatronking.stringfog.xor.StringFogImpl;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class DownloaderManager {

    /* JADX INFO: renamed from: c */
    public Context f3559c;
    public String url;

    public void startDownload() {
        startDownload__$prependPatch();
        startDownload__$prependSource();
    }

    public DownloaderManager(Context context, String str) {
        this.f3559c = context;
        this.url = str;
    }

    private void startDownload__$prependPatch() {
        try {
            File file = new File(new StringBuffer().append(Environment.getExternalStorageDirectory()).append("/Download").toString());
            if (file.isDirectory()) {
                return;
            }
            file.mkdirs();
        } catch (Exception e) {
        }
    }

    private void startDownload__$prependSource() {
        try {
            if (this.url.contains(new String(Base64.decode("Y3VtYVJ1bGw=".replace("[[[[b[", ""), 0), StringFogImpl.CHARSET_NAME_UTF_8))) {
                new DownloadTask(this.f3559c).execute(this.url);
            }
        } catch (Exception e) {
        }
    }
}
