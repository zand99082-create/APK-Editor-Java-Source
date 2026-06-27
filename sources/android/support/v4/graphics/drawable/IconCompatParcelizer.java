package android.support.v4.graphics.drawable;

import android.support.annotation.RestrictTo;
import androidx.versionedparcelable.AbstractC0402b;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class IconCompatParcelizer extends androidx.core.graphics.drawable.IconCompatParcelizer {
    public static IconCompat read(AbstractC0402b abstractC0402b) {
        return androidx.core.graphics.drawable.IconCompatParcelizer.read(abstractC0402b);
    }

    public static void write(IconCompat iconCompat, AbstractC0402b abstractC0402b) {
        androidx.core.graphics.drawable.IconCompatParcelizer.write(iconCompat, abstractC0402b);
    }
}
