package jadx.core.utils;

import java.io.File;
import java.io.FileInputStream;
import org.p107b.p108a.C1768a;

/* JADX INFO: loaded from: classes.dex */
public class AsmUtils {
    private AsmUtils() {
    }

    public static String getNameFromClassFile(File file) throws Throwable {
        FileInputStream fileInputStream;
        try {
            fileInputStream = new FileInputStream(file);
        } catch (Throwable th) {
            th = th;
            fileInputStream = null;
        }
        try {
            String strM4173a = new C1768a(fileInputStream).m4173a();
            fileInputStream.close();
            return strM4173a;
        } catch (Throwable th2) {
            th = th2;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            throw th;
        }
    }
}
