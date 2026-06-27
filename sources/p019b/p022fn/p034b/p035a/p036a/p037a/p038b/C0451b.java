package p019b.p022fn.p034b.p035a.p036a.p037a.p038b;

import android.support.v4.media.session.PlaybackStateCompat;
import jadx.core.deobf.Deobfuscator;
import java.io.File;
import java.text.DecimalFormat;

/* JADX INFO: renamed from: b.fn.b.a.a.a.b.b */
/* JADX INFO: loaded from: classes.dex */
public class C0451b {
    /* JADX INFO: renamed from: a */
    public static String m502a(long j) {
        float f;
        DecimalFormat decimalFormat = new DecimalFormat("###.#");
        String str = " KB";
        if (j > PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) {
            f = j / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
            if (f > 1024.0f) {
                f /= 1024.0f;
                if (f > 1024.0f) {
                    f /= 1024.0f;
                    str = " GB";
                } else {
                    str = " MB";
                }
            }
        } else {
            f = 0.0f;
        }
        return String.valueOf(decimalFormat.format(f) + str);
    }

    /* JADX INFO: renamed from: a */
    public static String m503a(File file) {
        if (file == null) {
            return null;
        }
        int iLastIndexOf = file.getName().lastIndexOf(Deobfuscator.CLASS_NAME_SEPARATOR);
        return iLastIndexOf >= 0 ? file.getName().substring(iLastIndexOf) : "";
    }

    /* JADX INFO: renamed from: b */
    public static String m504b(File file) {
        String strM503a = m503a(file);
        return strM503a.length() == 0 ? strM503a : strM503a.substring(1);
    }
}
