package rull.mod;

import adrt.ADRTLogCatReader;
import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.app.DownloadManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.support.v4.app.NotificationCompat;
import android.support.v4.widget.SwipeRefreshLayout;
import android.util.Log;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.URLUtil;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.gmail.heagoo.apkeditor.gzd;
import com.gmail.heagoo.apkeditor.pro.R;
import java.io.File;
import java.util.Objects;
import p000a.p001a.p003b.p004a.C0037k;

/* JADX INFO: loaded from: classes.dex */
public class Webku extends Activity implements SwipeRefreshLayout.OnRefreshListener {
    private ProgressBar masrullmod;
    SharedPreferences ngocoksaja;

    /* JADX INFO: renamed from: rf */
    private SwipeRefreshLayout f5400rf;
    WebView webView;
    final String sans = "ApkEditor/download/";
    String toast = "Download...";
    String url = "www.google.com/";
    String saya = "default";

    public static void openLink(Context context, String str) {
        context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
    }

    public void backto(View view) {
        finish();
    }

    public int getID(String str, String str2) {
        return getBaseContext().getResources().getIdentifier(str, str2, getBaseContext().getPackageName());
    }

    @Override // android.app.Activity
    @SuppressLint("SetJavaScriptEnabled")
    protected void onCreate(Bundle bundle) {
        ADRTLogCatReader.onContext(this, "com.aide.ui.fagmmmu.kotlin");
        setTheme(C0037k.m91md(C0037k.m89a(this)));
        super.onCreate(bundle);
        setContentView(getID("webku", "layout"));
        ActionBar actionBar = getActionBar();
        View viewInflate = getLayoutInflater().inflate(R.layout.mtrl_toolbar, (ViewGroup) null);
        ActionBar.LayoutParams layoutParams = new ActionBar.LayoutParams(-2, -1, 17);
        ((TextView) viewInflate.findViewById(android.R.id.title)).setText(getID("webku_xml", "string"));
        actionBar.setCustomView(viewInflate, layoutParams);
        actionBar.setDisplayShowCustomEnabled(true);
        actionBar.setDisplayShowTitleEnabled(false);
        actionBar.setDisplayHomeAsUpEnabled(true);
        this.ngocoksaja = PreferenceManager.getDefaultSharedPreferences(this);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) findViewById(getID("refresh", gzd.COLUMN_ID));
        swipeRefreshLayout.setOnRefreshListener(this);
        swipeRefreshLayout.setColorScheme(getID("colorAccent", "color"));
        if (!isOnline()) {
            Dialog dialog = new Dialog(this, setResource("NoInternetdlg", "style"));
            dialog.setContentView(getID("web_dialog", "layout"));
            Toast.makeText(getApplication(), "Please on data connection ", 0).show();
            ((Button) dialog.findViewById(setResource("dlg_retry", gzd.COLUMN_ID))).setOnClickListener(new View.OnClickListener(this) { // from class: rull.mod.Webku.100000000
                private final Webku this$0;

                {
                    this.this$0 = this;
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    this.this$0.finish();
                }
            });
            dialog.show();
        }
        if (Build.VERSION.SDK_INT >= 23 && checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == -1) {
            Log.d("permission", "permission denied to WRITE_EXTERNAL_STORAGE - requesting it");
            requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 1);
        }
        this.masrullmod = (ProgressBar) findViewById(setResource("masrull_pr", gzd.COLUMN_ID));
        this.webView = (WebView) findViewById(setResource("webView", gzd.COLUMN_ID));
        this.webView.getSettings().setLoadsImagesAutomatically(true);
        this.webView.getSettings().setJavaScriptEnabled(true);
        this.webView.setScrollBarStyle(50331648);
        this.webView.loadUrl(this.ngocoksaja.getString("MasrullUrl", this.url));
        this.webView.setVerticalScrollBarEnabled(false);
        this.webView.setHorizontalScrollBarEnabled(false);
        registerForContextMenu(this.webView);
        this.webView.setWebViewClient(new WebViewClient());
        this.webView.setWebChromeClient(new MyChrome(this));
        this.webView.setWebViewClient(new WebViewClient(this, swipeRefreshLayout) { // from class: rull.mod.Webku.100000001
            private final Webku this$0;
            private final SwipeRefreshLayout val$rf;

            {
                this.this$0 = this;
                this.val$rf = swipeRefreshLayout;
            }

            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                this.val$rf.setRefreshing(false);
            }
        });
        this.masrullmod.setProgress(0);
        this.webView.setWebChromeClient(new MyChrome(this, this) { // from class: rull.mod.Webku.100000002
            private final Webku this$0;

            /* JADX INFO: renamed from: rull.mod.Webku$100000002$100000001, reason: invalid class name */
            class AnonymousClass100000001 implements Runnable {
                private final AnonymousClass100000002 this$0;

                AnonymousClass100000001(AnonymousClass100000002 anonymousClass100000002) {
                    this.this$0 = anonymousClass100000002;
                }

                @Override // java.lang.Runnable
                public void run() {
                }
            }

            {
                this.this$0 = this;
            }

            @Override // android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView, int i) {
                this.this$0.masrullmod.setProgress(i);
                this.this$0.setTitle("Please wait..");
                if (i == 100) {
                    this.this$0.setTitle(webView.getTitle());
                    this.this$0.masrullmod.setVisibility(8);
                } else {
                    this.this$0.masrullmod.setVisibility(0);
                }
                super.onProgressChanged(webView, i);
            }

            /* JADX INFO: renamed from: rull.mod.Webku$100000002$CustWebViewClient */
            class CustWebViewClient extends WebViewClient {
                private final Webku this$0;
                private final SwipeRefreshLayout val$rf;

                @Override // android.webkit.WebViewClient
                public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                    Log.d("CustWebViewClient", new StringBuffer().append("error:").append(webResourceError.toString()).toString());
                    this.val$rf.setRefreshing(false);
                    super.onReceivedError(webView, webResourceRequest, webResourceError);
                }

                @Override // android.webkit.WebViewClient
                public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                    Log.d("CustWebViewClient", new StringBuffer().append("errorResponse:").append(webResourceResponse.getData()).toString());
                    this.val$rf.setRefreshing(false);
                    super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                }

                @Override // android.webkit.WebViewClient
                public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                    this.val$rf.setRefreshing(true);
                    super.onPageStarted(webView, str, bitmap);
                }

                @Override // android.webkit.WebViewClient
                public void onPageFinished(WebView webView, String str) {
                    this.val$rf.setRefreshing(false);
                    super.onPageFinished(webView, str);
                }

                public CustWebViewClient(Webku webku, SwipeRefreshLayout swipeRefreshLayout) {
                    this.this$0 = webku;
                    this.val$rf = swipeRefreshLayout;
                }
            }
        });
        this.webView.getSettings().setUserAgentString((String) null);
        this.webView.getSettings().setUseWideViewPort(false);
        this.webView.getSettings().setLoadWithOverviewMode(false);
        this.webView.reload();
        this.webView.setDownloadListener(new DownloadListener(this) { // from class: rull.mod.Webku.100000004
            private String contentdisposition;
            private String mimetype;
            private final Webku this$0;
            private Uri uri;

            {
                this.this$0 = this;
            }

            @Override // android.webkit.DownloadListener
            public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
                request.setTitle("Download");
                request.setMimeType(str4);
                request.addRequestHeader("cookie", CookieManager.getInstance().getCookie(str));
                request.addRequestHeader("User-Agent", str2);
                request.setDescription("Downloading Your File...");
                request.setTitle(URLUtil.guessFileName(str, str3, this.mimetype));
                request.allowScanningByMediaScanner();
                request.setNotificationVisibility(1);
                File file = new File(new StringBuffer().append(new StringBuffer().append(Environment.getExternalStorageDirectory().getPath()).append("/").toString()).append(this.this$0.ngocoksaja.getString("changestorage", "ApkEditor/download/")).toString());
                Toast.makeText(this.this$0.getApplication(), this.this$0.toast, 0).show();
                if (!file.exists() && !file.mkdirs()) {
                    Log.e("TravellerLog ::", "Problem creating Image folder");
                }
                request.setDestinationInExternalPublicDir(new StringBuffer().append("/").append(this.this$0.ngocoksaja.getString("changestorage", "ApkEditor/download/")).toString(), URLUtil.guessFileName(str, str3, this.mimetype));
                ((DownloadManager) this.this$0.getSystemService("download")).enqueue(request);
                WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(-2, -2, 2002, 24, -3);
                new Handler().postDelayed(new Runnable(this) { // from class: rull.mod.Webku.100000004.100000003
                    private final AnonymousClass100000004 this$0;

                    {
                        this.this$0 = this;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                    }
                }, 5000);
                layoutParams2.gravity = 8388659;
                layoutParams2.x = 0;
                layoutParams2.y = 0;
                ((ViewGroup.LayoutParams) layoutParams2).width = 0;
                ((ViewGroup.LayoutParams) layoutParams2).height = 0;
            }
        });
    }

    /* JADX INFO: renamed from: rull.mod.Webku$100000003, reason: invalid class name */
    class AnonymousClass100000003 implements DownloadListener {
        private String contentdisposition;
        private String mimetype;
        private final Webku this$0;
        private Uri uri;

        AnonymousClass100000003(Webku webku) {
            this.this$0 = webku;
        }

        /* JADX INFO: renamed from: rull.mod.Webku$100000003$100000001, reason: invalid class name */
        class AnonymousClass100000001 extends BroadcastReceiver {
            private final AnonymousClass100000003 this$0;

            AnonymousClass100000001(AnonymousClass100000003 anonymousClass100000003) {
                this.this$0 = anonymousClass100000003;
            }

            private void showMessage(String str) {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                showMessage("Download Complete!");
                this.this$0.this$0.unregisterReceiver(this);
            }
        }

        @Override // android.webkit.DownloadListener
        public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
            request.setTitle("Download");
            request.setMimeType(str4);
            request.addRequestHeader("cookie", CookieManager.getInstance().getCookie(str));
            request.addRequestHeader("User-Agent", str2);
            request.setDescription("Downloading Your File...");
            request.setTitle(URLUtil.guessFileName(str, str3, this.mimetype));
            request.allowScanningByMediaScanner();
            request.setNotificationVisibility(1);
            File file = new File(new StringBuffer().append(new StringBuffer().append(Environment.getExternalStorageDirectory().getPath()).append("/").toString()).append(this.this$0.ngocoksaja.getString("changestorage", "ApkEditor/download/")).toString());
            Toast.makeText(this.this$0.getApplication(), this.this$0.toast, 0).show();
            if (!file.exists() && !file.mkdirs()) {
                Log.e("TravellerLog ::", "Problem creating Image folder");
            }
            request.setDestinationInExternalPublicDir(new StringBuffer().append("/").append(this.this$0.ngocoksaja.getString("changestorage", "ApkEditor/download/")).toString(), URLUtil.guessFileName(str, str3, this.mimetype));
            ((DownloadManager) this.this$0.getSystemService("download")).enqueue(request);
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 2002, 24, -3);
            new Handler().postDelayed(new Runnable(this) { // from class: rull.mod.Webku.100000003.100000002
                private final AnonymousClass100000003 this$0;

                {
                    this.this$0 = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                }
            }, 5000);
            layoutParams.gravity = 8388659;
            layoutParams.x = 0;
            layoutParams.y = 0;
            ((ViewGroup.LayoutParams) layoutParams).width = 0;
            ((ViewGroup.LayoutParams) layoutParams).height = 0;
        }
    }

    /* JADX INFO: renamed from: rull.mod.Webku$100000005, reason: invalid class name */
    class AnonymousClass100000005 implements MenuItem.OnMenuItemClickListener {
        private final Webku this$0;
        private final WebView.HitTestResult val$hitTestResult;

        /* JADX INFO: renamed from: rull.mod.Webku$100000005$100000004, reason: invalid class name */
        class AnonymousClass100000004 implements Runnable {
            private final AnonymousClass100000005 this$0;

            AnonymousClass100000004(AnonymousClass100000005 anonymousClass100000005) {
                this.this$0 = anonymousClass100000005;
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        AnonymousClass100000005(Webku webku, WebView.HitTestResult hitTestResult) {
            this.this$0 = webku;
            this.val$hitTestResult = hitTestResult;
        }

        /* JADX INFO: renamed from: rull.mod.Webku$100000005$100000003, reason: invalid class name */
        class AnonymousClass100000003 implements Runnable {
            private final AnonymousClass100000005 this$0;
            private final long val$downloadId;
            private final DownloadManager val$manager;

            AnonymousClass100000003(AnonymousClass100000005 anonymousClass100000005, long j, DownloadManager downloadManager) {
                this.this$0 = anonymousClass100000005;
                this.val$downloadId = j;
                this.val$manager = downloadManager;
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean z = true;
                while (z) {
                    DownloadManager.Query query = new DownloadManager.Query();
                    query.setFilterById(this.val$downloadId);
                    Cursor cursorQuery = this.val$manager.query(query);
                    cursorQuery.moveToFirst();
                    int i = cursorQuery.getInt(cursorQuery.getColumnIndex("bytes_so_far"));
                    int i2 = cursorQuery.getInt(cursorQuery.getColumnIndex("total_size"));
                    if (cursorQuery.getInt(cursorQuery.getColumnIndex(NotificationCompat.CATEGORY_STATUS)) == 8) {
                        z = false;
                    }
                    this.this$0.this$0.runOnUiThread(new Runnable(this, (int) ((((long) i) * 100) / ((long) i2))) { // from class: rull.mod.Webku.100000005.100000003.100000002
                        private final AnonymousClass100000003 this$0;
                        private final int val$dl_progress;

                        {
                            this.this$0 = this;
                            this.val$dl_progress = i;
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                            this.this$0.this$0.this$0.prog.setProgress(this.val$dl_progress);
                        }
                    });
                    cursorQuery.close();
                }
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            String extra = this.val$hitTestResult.getExtra();
            if (URLUtil.isValidUrl(extra)) {
                DownloadManager.Request request = new DownloadManager.Request(Uri.parse(extra));
                request.allowScanningByMediaScanner();
                request.setNotificationVisibility(1);
                File file = new File(new StringBuffer().append(new StringBuffer().append(Environment.getExternalStorageDirectory().getPath()).append("/").toString()).append(this.this$0.ngocoksaja.getString("changestorage", "ApkEditor/download/")).toString());
                Toast.makeText(this.this$0.getApplication(), this.this$0.toast, 0).show();
                if (!file.exists() && !file.mkdirs()) {
                    Log.e("TravellerLog ::", "Problem creating Image folder");
                }
                request.setDestinationInExternalPublicDir(new StringBuffer().append("/").append(this.this$0.ngocoksaja.getString("changestorage", "ApkEditor/download/")).toString(), "download.png");
                DownloadManager downloadManager = (DownloadManager) this.this$0.getSystemService("download");
                if (Build.VERSION.SDK_INT >= 19) {
                    ((DownloadManager) Objects.requireNonNull(downloadManager)).enqueue(request);
                }
                Toast.makeText(this.this$0, "Gambar sukses di unduh", 1).show();
            } else {
                Toast.makeText(this.this$0, "Gambar gagal di unduh", 1).show();
            }
            return false;
        }
    }

    @Override // android.support.v4.widget.SwipeRefreshLayout.OnRefreshListener
    public void onRefresh() {
        this.webView.reload();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            switch (i) {
                case 4:
                    if (this.webView.canGoBack()) {
                        this.webView.goBack();
                    } else {
                        finish();
                    }
                    return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Activity, android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        WebView.HitTestResult hitTestResult = this.webView.getHitTestResult();
        if (hitTestResult.getType() == 5 || hitTestResult.getType() == 8) {
            contextMenu.setHeaderTitle("Download Gambar");
            contextMenu.setHeaderIcon(getID("ic_download", "drawable"));
            contextMenu.add(0, 1, 0, "Download").setOnMenuItemClickListener(new AnonymousClass100000005(this, hitTestResult));
        }
    }

    /* JADX INFO: renamed from: rull.mod.Webku$100000006, reason: invalid class name */
    class AnonymousClass100000006 implements MenuItem.OnMenuItemClickListener {
        private final Webku this$0;
        private final WebView.HitTestResult val$hitTestResult;

        AnonymousClass100000006(Webku webku, WebView.HitTestResult hitTestResult) {
            this.this$0 = webku;
            this.val$hitTestResult = hitTestResult;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            String extra = this.val$hitTestResult.getExtra();
            if (URLUtil.isValidUrl(extra)) {
                DownloadManager.Request request = new DownloadManager.Request(Uri.parse(extra));
                request.allowScanningByMediaScanner();
                request.setNotificationVisibility(1);
                File file = new File(new StringBuffer().append(new StringBuffer().append(Environment.getExternalStorageDirectory().getPath()).append("/").toString()).append("ApkEditor/download/").toString());
                Toast.makeText(this.this$0.getApplication(), this.this$0.toast, 0).show();
                if (!file.exists() && !file.mkdirs()) {
                    Log.e("TravellerLog ::", "Problem creating Image folder");
                }
                request.setDestinationInExternalPublicDir(new StringBuffer().append("/").append("ApkEditor/download/").toString(), "download.png");
                DownloadManager downloadManager = (DownloadManager) this.this$0.getSystemService("download");
                if (Build.VERSION.SDK_INT >= 19) {
                    ((DownloadManager) Objects.requireNonNull(downloadManager)).enqueue(request);
                }
                Toast.makeText(this.this$0, "Gambar sukses di unduh", 1).show();
            } else {
                Toast.makeText(this.this$0, "Gambar gagal di unduh", 1).show();
            }
            return false;
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        if (menu != null) {
            getMenuInflater().inflate(getID("webku_menu", "menu"), menu);
            return true;
        }
        return false;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == setResource("websetting", gzd.COLUMN_ID)) {
            try {
                startActivity(new Intent(this, Class.forName("rull.mod.WebSetting")));
                return true;
            } catch (ClassNotFoundException e) {
                throw new NoClassDefFoundError(e.getMessage());
            }
        }
        if (itemId == 16908332) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public int setResource(String str, String str2) {
        return getResources().getIdentifier(str, str2, getPackageName());
    }

    private class MyChrome extends WebChromeClient {
        private View mCustomView;
        private WebChromeClient.CustomViewCallback mCustomViewCallback;
        protected FrameLayout mFullscreenContainer;
        private int mOriginalOrientation;
        private int mOriginalSystemUiVisibility;
        private final Webku this$0;

        MyChrome(Webku webku) {
            this.this$0 = webku;
        }

        @Override // android.webkit.WebChromeClient
        public Bitmap getDefaultVideoPoster() {
            if (this.mCustomView != null) {
                return BitmapFactory.decodeResource(this.this$0.getApplicationContext().getResources(), R.drawable.abc_tab_indicator_material);
            }
            return (Bitmap) null;
        }

        @Override // android.webkit.WebChromeClient
        public void onHideCustomView() {
            ((FrameLayout) this.this$0.getWindow().getDecorView()).removeView(this.mCustomView);
            this.mCustomView = (View) null;
            this.this$0.getWindow().getDecorView().setSystemUiVisibility(this.mOriginalSystemUiVisibility);
            this.this$0.setRequestedOrientation(this.mOriginalOrientation);
            this.mCustomViewCallback.onCustomViewHidden();
            this.mCustomViewCallback = (WebChromeClient.CustomViewCallback) null;
        }

        @Override // android.webkit.WebChromeClient
        public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            if (this.mCustomView != null) {
                onHideCustomView();
                return;
            }
            this.mCustomView = view;
            this.mOriginalSystemUiVisibility = this.this$0.getWindow().getDecorView().getSystemUiVisibility();
            this.mOriginalOrientation = this.this$0.getRequestedOrientation();
            this.mCustomViewCallback = customViewCallback;
            ((FrameLayout) this.this$0.getWindow().getDecorView()).addView(this.mCustomView, new FrameLayout.LayoutParams(-1, -1));
            this.this$0.getWindow().getDecorView().setSystemUiVisibility(3846);
        }
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.webView.saveState(bundle);
    }

    @Override // android.app.Activity
    protected void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.webView.restoreState(bundle);
    }

    public boolean isOnline() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isAvailable() && activeNetworkInfo.isConnected();
    }

    @Deprecated
    public void showMessage(String str) {
        Toast.makeText(getApplicationContext(), str, 0).show();
    }
}
