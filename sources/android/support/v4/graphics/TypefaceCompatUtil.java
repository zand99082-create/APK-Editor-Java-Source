package android.support.v4.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.annotation.RestrictTo;
import android.util.Log;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class TypefaceCompatUtil {
    private static final String CACHE_FILE_PREFIX = ".font";
    private static final String TAG = "TypefaceCompatUtil";

    private TypefaceCompatUtil() {
    }

    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
            }
        }
    }

    @RequiresApi(19)
    @Nullable
    public static ByteBuffer copyToDirectBuffer(Context context, Resources resources, int i) {
        ByteBuffer byteBufferMmap = null;
        File tempFile = getTempFile(context);
        if (tempFile != null) {
            try {
                if (copyToFile(tempFile, resources, i)) {
                    byteBufferMmap = mmap(tempFile);
                }
            } finally {
                tempFile.delete();
            }
        }
        return byteBufferMmap;
    }

    public static boolean copyToFile(File file, Resources resources, int i) {
        InputStream inputStreamOpenRawResource = null;
        try {
            inputStreamOpenRawResource = resources.openRawResource(i);
            return copyToFile(file, inputStreamOpenRawResource);
        } finally {
            closeQuietly(inputStreamOpenRawResource);
        }
    }

    public static boolean copyToFile(File file, InputStream inputStream) throws Throwable {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i = inputStream.read(bArr);
                        if (i == -1) {
                            closeQuietly(fileOutputStream);
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                            return true;
                        }
                        fileOutputStream.write(bArr, 0, i);
                    }
                } catch (IOException e) {
                    e = e;
                    Log.e(TAG, "Error copying resource contents to temp file: " + e.getMessage());
                    closeQuietly(fileOutputStream);
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    return false;
                }
            } catch (Throwable th) {
                th = th;
                closeQuietly(null);
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            fileOutputStream = null;
        } catch (Throwable th2) {
            th = th2;
            closeQuietly(null);
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
            throw th;
        }
    }

    @Nullable
    public static File getTempFile(Context context) {
        String str = CACHE_FILE_PREFIX + Process.myPid() + "-" + Process.myTid() + "-";
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= 100) {
                return null;
            }
            File file = new File(context.getCacheDir(), str + i2);
            if (file.createNewFile()) {
                return file;
            }
            i = i2 + 1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005b A[Catch: Throwable -> 0x0045, all -> 0x0058, TRY_LEAVE, TryCatch #5 {all -> 0x0058, blocks: (B:9:0x0014, B:11:0x002d, B:22:0x0041, B:23:0x0044, B:36:0x005b, B:33:0x0054), top: B:51:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0041 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[Catch: IOException -> 0x0036, SYNTHETIC, TRY_ENTER, TRY_LEAVE, TryCatch #1 {IOException -> 0x0036, blocks: (B:3:0x0005, B:6:0x000f, B:13:0x0032, B:30:0x004f, B:40:0x0064, B:39:0x0060, B:31:0x0052), top: B:46:0x0005, inners: #0 }] */
    @RequiresApi(19)
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ByteBuffer mmap(Context context, CancellationSignal cancellationSignal, Uri uri) throws Throwable {
        Throwable th;
        Throwable th2;
        Throwable th3;
        Throwable th4;
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", cancellationSignal);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                }
                return null;
            }
            try {
                try {
                    FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                    try {
                        FileChannel channel = fileInputStream.getChannel();
                        MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                        fileInputStream.close();
                        if (parcelFileDescriptorOpenFileDescriptor == null) {
                            return map;
                        }
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return map;
                    } catch (Throwable th5) {
                        try {
                            throw th5;
                        } catch (Throwable th6) {
                            th3 = th5;
                            th4 = th6;
                            if (th3 != null) {
                                fileInputStream.close();
                                throw th4;
                            }
                            try {
                                fileInputStream.close();
                                throw th4;
                            } catch (Throwable th7) {
                                th3.addSuppressed(th7);
                                throw th4;
                            }
                        }
                    }
                } catch (Throwable th8) {
                    th2 = th8;
                    th = null;
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                    }
                }
            } catch (Throwable th9) {
                try {
                    throw th9;
                } catch (Throwable th10) {
                    th = th9;
                    th2 = th10;
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        throw th2;
                    }
                    if (th == null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                        throw th2;
                    }
                    try {
                        parcelFileDescriptorOpenFileDescriptor.close();
                        throw th2;
                    } catch (Throwable th11) {
                        th.addSuppressed(th11);
                        throw th2;
                    }
                }
            }
        } catch (IOException e) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002e A[Catch: IOException -> 0x0026, TRY_LEAVE, TryCatch #2 {IOException -> 0x0026, blocks: (B:3:0x0001, B:5:0x0016, B:12:0x0022, B:13:0x0025, B:18:0x002e, B:17:0x002a), top: B:22:0x0001, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0022 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @RequiresApi(19)
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static ByteBuffer mmap(File file) throws Throwable {
        Throwable th;
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                fileInputStream.close();
                return map;
            } catch (Throwable th2) {
                th = th2;
                th = null;
                if (th != null) {
                }
            }
        } catch (IOException e) {
            return null;
        }
    }
}
