package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.support.annotation.RestrictTo;
import android.support.v4.graphics.drawable.IconCompat;
import androidx.versionedparcelable.AbstractC0402b;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class IconCompatParcelizer {
    public static IconCompat read(AbstractC0402b abstractC0402b) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.mType = abstractC0402b.m313b(iconCompat.mType, 1);
        iconCompat.mData = abstractC0402b.m318b(iconCompat.mData, 2);
        iconCompat.mParcelable = abstractC0402b.m314b(iconCompat.mParcelable, 3);
        iconCompat.mInt1 = abstractC0402b.m313b(iconCompat.mInt1, 4);
        iconCompat.mInt2 = abstractC0402b.m313b(iconCompat.mInt2, 5);
        iconCompat.mTintList = (ColorStateList) abstractC0402b.m314b(iconCompat.mTintList, 6);
        iconCompat.mTintModeStr = abstractC0402b.m316b(iconCompat.mTintModeStr, 7);
        iconCompat.onPostParceling();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, AbstractC0402b abstractC0402b) {
        iconCompat.onPreParceling(false);
        abstractC0402b.m305a(iconCompat.mType, 1);
        abstractC0402b.m312a(iconCompat.mData, 2);
        abstractC0402b.m307a(iconCompat.mParcelable, 3);
        abstractC0402b.m305a(iconCompat.mInt1, 4);
        abstractC0402b.m305a(iconCompat.mInt2, 5);
        abstractC0402b.m307a(iconCompat.mTintList, 6);
        abstractC0402b.m310a(iconCompat.mTintModeStr, 7);
    }
}
