package p019b.p022fn.p040c.p041a.p045f;

import android.support.v4.media.session.PlaybackStateCompat;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: b.fn.c.a.f.b */
/* JADX INFO: loaded from: classes.dex */
public class C0476b {
    /* JADX INFO: renamed from: a */
    public static String m558a(long j) {
        long jAbs = j == Long.MIN_VALUE ? Long.MAX_VALUE : Math.abs(j);
        if (jAbs < PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) {
            return j + " B";
        }
        if (jAbs <= 1048524) {
            return String.format("%.1f KiB", Double.valueOf(j / 1024.0d));
        }
        if (jAbs <= 1073689395) {
            return String.format("%.1f MiB", Double.valueOf(j / 1048576.0d));
        }
        if (jAbs <= 1099457940684L) {
            return String.format("%.1f GiB", Double.valueOf(j / 1.073741824E9d));
        }
        if (jAbs <= 1125844931261235L) {
            return String.format("%.1f TiB", Double.valueOf(j / 1.099511627776E12d));
        }
        Object[] objArr = new Object[1];
        if (jAbs <= 1152865209611504844L) {
            objArr[0] = Double.valueOf((j >> 10) / 1.099511627776E12d);
            return String.format("%.1f PiB", objArr);
        }
        objArr[0] = Double.valueOf((j >> 20) / 1.099511627776E12d);
        return String.format("%.1f EiB", objArr);
    }

    /* JADX INFO: renamed from: b */
    public static String m559b(long j) {
        long days = TimeUnit.MILLISECONDS.toDays(j);
        long hours = TimeUnit.MILLISECONDS.toHours(j) - TimeUnit.DAYS.toHours(TimeUnit.MILLISECONDS.toDays(j));
        long minutes = TimeUnit.MILLISECONDS.toMinutes(j) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(j));
        long seconds = TimeUnit.MILLISECONDS.toSeconds(j) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(j));
        long millis = TimeUnit.MILLISECONDS.toMillis(j) - TimeUnit.SECONDS.toMillis(TimeUnit.MILLISECONDS.toSeconds(j));
        return days == 0 ? String.format("%02dh:%02dm:%02ds.%04dms", Long.valueOf(hours), Long.valueOf(minutes), Long.valueOf(seconds), Long.valueOf(millis)) : String.format("%dd %02dh:%02dm:%02ds.%04dms", Long.valueOf(days), Long.valueOf(hours), Long.valueOf(minutes), Long.valueOf(seconds), Long.valueOf(millis));
    }
}
