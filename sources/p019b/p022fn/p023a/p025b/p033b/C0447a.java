package p019b.p022fn.p023a.p025b.p033b;

import android.content.Context;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: b.fn.a.b.b.a */
/* JADX INFO: loaded from: classes.dex */
public class C0447a {
    /* JADX INFO: renamed from: a */
    public static void m481a(Context context, String str, File file) throws IOException {
        InputStream inputStreamOpen = context.getAssets().open(str);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                m483a(inputStreamOpen, fileOutputStream);
                fileOutputStream.close();
                if (inputStreamOpen != null) {
                    inputStreamOpen.close();
                }
            } finally {
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (inputStreamOpen != null) {
                    try {
                        inputStreamOpen.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m482a(Closeable closeable) {
        try {
            closeable.close();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m483a(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[1048576];
        int i = 0;
        while (i != -1) {
            i = inputStream.read(bArr);
            if (i != -1) {
                outputStream.write(bArr, 0, i);
            }
        }
    }
}
