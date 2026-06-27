package com.gmail.heagoo.apkeditor;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.Toast;
import com.gmail.heagoo.apkeditor.downloader.DownloaderManager;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class UpdaterEngine extends AsyncTask<String, Void, JSONObject> {
    private JSONObject UpdaterEngine;

    /* JADX INFO: renamed from: c */
    WeakReference<Context> f3141c;
    Context saaa;
    boolean showToast;
    String update_channel;

    @Override // android.os.AsyncTask
    public /* bridge */ JSONObject doInBackground(String[] strArr) {
        return doInBackground2(strArr);
    }

    @Override // android.os.AsyncTask
    public /* bridge */ void onPostExecute(JSONObject jSONObject) {
        onPostExecute2(jSONObject);
    }

    public UpdaterEngine(Context context, String str, boolean z) {
        this.f3141c = new WeakReference<>(context);
        this.update_channel = str;
        this.showToast = z;
    }

    /* JADX INFO: renamed from: doInBackground, reason: avoid collision after fix types in other method */
    public JSONObject doInBackground2(String... strArr) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(strArr[0]).openConnection();
            InputStream inputStream = httpURLConnection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String line = bufferedReader.readLine();
                if (line != null) {
                    sb.append(line);
                } else {
                    String string = sb.toString();
                    httpURLConnection.disconnect();
                    inputStream.close();
                    sb.delete(0, sb.length());
                    return (JSONObject) new JSONObject(string).get(this.update_channel);
                }
            }
        } catch (Exception e) {
            Log.w("UpdaterEngine", e);
            return (JSONObject) null;
        }
    }

    /* JADX INFO: renamed from: onPostExecute, reason: avoid collision after fix types in other method */
    public void onPostExecute2(JSONObject jSONObject) {
        super.onPostExecute(this.UpdaterEngine);
        try {
            if (jSONObject != null) {
                int i = jSONObject.getInt("current_version");
                String string = jSONObject.getString("download_url");
                String string2 = jSONObject.getString("changelog");
                int i2 = -1;
                try {
                    i2 = this.f3141c.get().getPackageManager().getPackageInfo(this.f3141c.get().getPackageName(), 0).versionCode;
                } catch (PackageManager.NameNotFoundException e) {
                    e.printStackTrace();
                }
                if (i > i2) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(this.f3141c.get());
                    builder.setTitle(Saya.intString("update_title"));
                    builder.setMessage(string2);
                    builder.setCancelable(true);
                    builder.setPositiveButton(Saya.intString("update_download"), new DialogInterface.OnClickListener(this, string) { // from class: com.gmail.heagoo.apkeditor.UpdaterEngine.100000000
                        private final UpdaterEngine this$0;
                        private final String val$linkApk;

                        {
                            this.this$0 = this;
                            this.val$linkApk = string;
                        }

                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i3) {
                            new DownloaderManager(this.this$0.f3141c.get(), this.val$linkApk).startDownload();
                        }
                    });
                    builder.setNegativeButton(Saya.intString("update_close"), new DialogInterface.OnClickListener(this) { // from class: com.gmail.heagoo.apkeditor.UpdaterEngine.100000001
                        private final UpdaterEngine this$0;

                        {
                            this.this$0 = this;
                        }

                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i3) {
                            dialogInterface.cancel();
                        }
                    });
                    builder.create().show();
                    return;
                }
                noUpdatesToast();
                return;
            }
            noUpdatesToast();
        } catch (Exception e2) {
            Log.w("UpdaterEngine", e2);
            noUpdatesToast();
        }
    }

    public void noUpdatesToast() {
        if (this.showToast) {
            Toast.makeText(this.f3141c.get(), Saya.intString("update_not_found"), 0).show();
        }
    }
}
