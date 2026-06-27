package com.gmail.heagoo.apkeditor.downloader;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Environment;
import android.os.PowerManager;
import android.widget.Toast;
import com.gmail.heagoo.apkeditor.Saya;
import com.gmail.heagoo.apkeditor.installer.ApkInstaller;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: loaded from: classes.dex */
public class DownloadTask extends AsyncTask<String, Integer, String> {
    private String filepath;
    private final ProgressDialog mPDialog;
    private PowerManager.WakeLock mWakeLock;
    private final WeakReference<Context> weakContext;

    @Override // android.os.AsyncTask
    public /* bridge */ String doInBackground(String[] strArr) {
        return doInBackground2(strArr);
    }

    @Override // android.os.AsyncTask
    public /* bridge */ void onPostExecute(String str) {
        onPostExecute2(str);
    }

    @Override // android.os.AsyncTask
    public /* bridge */ void onProgressUpdate(Integer[] numArr) {
        onProgressUpdate2(numArr);
    }

    public DownloadTask(Context context) {
        this.weakContext = new WeakReference<>(context);
        this.mPDialog = new ProgressDialog(context);
        this.mPDialog.setMessage(this.weakContext.get().getResources().getString(Saya.intString("update_downloading")));
        this.mPDialog.setIndeterminate(true);
        this.mPDialog.setProgressStyle(1);
        this.mPDialog.setCancelable(false);
        this.mPDialog.setOnCancelListener(new DialogInterfaceOnCancelListenerC1222sa(this, this));
    }

    /* JADX INFO: renamed from: doInBackground, reason: avoid collision after fix types in other method */
    public String doInBackground2(String... strArr) {
        byte[] bArr;
        try {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(strArr[0]).openConnection();
                httpURLConnection.connect();
                if (httpURLConnection.getResponseCode() != 200) {
                    String string = new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("Server returned HTTP ").append(httpURLConnection.getResponseCode()).toString()).append(" ").toString()).append(httpURLConnection.getResponseMessage()).toString();
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    return string;
                }
                int contentLength = httpURLConnection.getContentLength();
                int i = 1;
                this.filepath = new StringBuffer().append(new StringBuffer().append(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS)).append("/").toString()).append(strArr[0].endsWith(".apk") ? strArr[0].substring(strArr[0].lastIndexOf("/") + 1) : "apkeditor.apk").toString();
                InputStream inputStream = httpURLConnection.getInputStream();
                FileOutputStream fileOutputStream = new FileOutputStream(this.filepath, false);
                byte[] bArr2 = new byte[4096];
                long j = 0;
                while (true) {
                    int i2 = inputStream.read(bArr2);
                    if (i2 == -1) {
                        try {
                            fileOutputStream.close();
                            if (inputStream != null) {
                                inputStream.close();
                            }
                        } catch (IOException e) {
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        return (String) null;
                    }
                    if (isCancelled()) {
                        inputStream.close();
                        try {
                            fileOutputStream.close();
                            if (inputStream != null) {
                                inputStream.close();
                            }
                        } catch (IOException e2) {
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        return (String) null;
                    }
                    j += (long) i2;
                    if (contentLength > 0) {
                        Integer[] numArr = new Integer[i];
                        bArr = bArr2;
                        numArr[0] = Integer.valueOf((int) ((((long) 100) * j) / ((long) contentLength)));
                        publishProgress(numArr);
                    } else {
                        bArr = bArr2;
                    }
                    byte[] bArr3 = bArr;
                    fileOutputStream.write(bArr3, 0, i2);
                    bArr2 = bArr3;
                    i = 1;
                }
            } catch (Exception e3) {
                return e3.toString();
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                return (String) null;
            }
        }
    }

    @Override // android.os.AsyncTask
    protected void onPreExecute() {
        super.onPreExecute();
        this.mWakeLock = ((PowerManager) this.weakContext.get().getSystemService("power")).newWakeLock(1, getClass().getName());
        this.mWakeLock.acquire();
        this.mPDialog.show();
    }

    /* JADX INFO: renamed from: onProgressUpdate, reason: avoid collision after fix types in other method */
    public void onProgressUpdate2(Integer... numArr) {
        this.mPDialog.setIndeterminate(false);
        this.mPDialog.setMax(100);
        this.mPDialog.setProgress(numArr[0].intValue());
    }

    /* JADX INFO: renamed from: onPostExecute, reason: avoid collision after fix types in other method */
    public void onPostExecute2(String str) {
        this.mWakeLock.release();
        this.mPDialog.dismiss();
        if (str == null) {
            ApkInstaller.installApplication(this.weakContext.get(), this.filepath);
        } else {
            Toast.makeText(this.weakContext.get(), new StringBuffer().append(Saya.intString("update_not_found")).append(str).toString(), 1).show();
        }
    }
}
