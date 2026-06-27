package com.gmail.heagoo.imageviewlib;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.os.Bundle;
import android.view.Display;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;
import com.gmail.heagoo.apkeditor.pro.R;
import com.gmail.heagoo.p084a.p089c.C1067a;
import com.p080c.p081a.C1022f;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes.dex */
public class ViewZipImageActivity extends Activity {

    /* JADX INFO: renamed from: a */
    private C1022f f4683a;

    /* JADX INFO: renamed from: b */
    private String f4684b;

    /* JADX INFO: renamed from: c */
    private String f4685c;

    /* JADX INFO: renamed from: d */
    private String f4686d;

    /* JADX INFO: renamed from: e */
    private int f4687e;

    /* JADX INFO: renamed from: f */
    private int f4688f;

    /* JADX WARN: Removed duplicated region for block: B:47:0x0049 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0044 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Bitmap m3826a() throws Throwable {
        InputStream inputStream;
        ZipFile zipFile;
        Throwable th;
        Bitmap bitmapDecodeStream = null;
        try {
            zipFile = new ZipFile(this.f4685c);
        } catch (Exception e) {
            e = e;
            inputStream = null;
            zipFile = null;
        } catch (Throwable th2) {
            inputStream = null;
            zipFile = null;
            th = th2;
        }
        try {
            inputStream = zipFile.getInputStream(zipFile.getEntry(this.f4686d));
            try {
                try {
                    bitmapDecodeStream = BitmapFactory.decodeStream(inputStream);
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException e2) {
                        }
                    }
                    try {
                        zipFile.close();
                    } catch (IOException e3) {
                    }
                } catch (Exception e4) {
                    e = e4;
                    e.printStackTrace();
                    Toast.makeText(this, e.getMessage(), 0).show();
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException e5) {
                        }
                    }
                    if (zipFile != null) {
                        try {
                            zipFile.close();
                        } catch (IOException e6) {
                        }
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e7) {
                    }
                }
                if (zipFile != null) {
                    throw th;
                }
                try {
                    zipFile.close();
                    throw th;
                } catch (IOException e8) {
                    throw th;
                }
            }
        } catch (Exception e9) {
            e = e9;
            inputStream = null;
        } catch (Throwable th4) {
            inputStream = null;
            th = th4;
            if (inputStream != null) {
            }
            if (zipFile != null) {
            }
        }
        return bitmapDecodeStream;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent == null) {
            finish();
            return;
        }
        if (intent.getBooleanExtra("fullScreen", false)) {
            getWindow().setFlags(1024, 1024);
        }
        setContentView(R.layout.imageviewlib_activity_empty);
        this.f4685c = C1067a.m2457a(intent, "zipFilePath");
        this.f4686d = C1067a.m2457a(intent, "entryName");
        this.f4684b = C1067a.m2457a(intent, "imageFilePath");
        Bitmap bitmapDecodeFile = this.f4684b != null ? BitmapFactory.decodeFile(this.f4684b) : m3826a();
        if (bitmapDecodeFile == null) {
            finish();
            return;
        }
        Display defaultDisplay = getWindowManager().getDefaultDisplay();
        Point point = new Point();
        try {
            defaultDisplay.getSize(point);
        } catch (NoSuchMethodError e) {
            point.x = defaultDisplay.getWidth();
            point.y = defaultDisplay.getHeight();
        }
        this.f4687e = point.x;
        this.f4688f = point.y;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        this.f4683a = new C1022f(this, bitmapDecodeFile);
        this.f4683a.setLayoutParams(layoutParams);
        if (bitmapDecodeFile.getWidth() <= this.f4687e && bitmapDecodeFile.getHeight() <= this.f4688f) {
            this.f4683a.m2331b(1.0f);
            this.f4683a.m2332b(this.f4687e / 2.0f, this.f4688f / 2.0f);
        }
        ((ViewGroup) findViewById(R.id.layout)).addView(this.f4683a);
    }
}
