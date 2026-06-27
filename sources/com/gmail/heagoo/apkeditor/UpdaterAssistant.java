package com.gmail.heagoo.apkeditor;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Base64;
import android.widget.Toast;
import com.github.megatronking.stringfog.xor.StringFogImpl;

/* JADX INFO: loaded from: classes.dex */
public class UpdaterAssistant {
    protected String Updates = "aHR0cHM6Ly9yYXcuZ2l0aHVidXNlcmNvbnRlbnQuY29tL2N1bWFSdWxsL0Fway1FZGl0b3IvbWFzdGVyL1JlbGVhc2VzL3VwZGF0ZS5qc29u";

    /* JADX INFO: renamed from: c */
    Context f3140c;
    boolean showToast;

    public UpdaterAssistant(Context context, boolean z) {
        this.f3140c = context;
        this.showToast = z;
    }

    public void checkForUpdates() {
        if (isNetworkAvailable()) {
            try {
                new UpdaterEngine(this.f3140c, getCurrentChannel(), this.showToast).execute(new String(Base64.decode(this.Updates.replace("[[[[b[", ""), 0), StringFogImpl.CHARSET_NAME_UTF_8));
            } catch (Exception e) {
            }
        } else if (this.showToast) {
            Toast.makeText(this.f3140c, Saya.intString("no_internet"), 0).show();
        }
    }

    public String getCurrentChannel() {
        return this.f3140c.getSharedPreferences("com.gmail.heagoo.apkeditor.pro_preferences", 0).getString("channel", (String) null);
    }

    private boolean isNetworkAvailable() {
        boolean z = false;
        boolean z2 = false;
        for (NetworkInfo networkInfo : ((ConnectivityManager) this.f3140c.getSystemService("connectivity")).getAllNetworkInfo()) {
            if (networkInfo.getTypeName().equalsIgnoreCase("WIFI") && networkInfo.isConnected()) {
                z2 = true;
            }
            if (networkInfo.getTypeName().equalsIgnoreCase("MOBILE") && networkInfo.isConnected()) {
                z = true;
            }
        }
        return z2 || z;
    }
}
