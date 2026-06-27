package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class ParcelImpl implements Parcelable {

    /* JADX INFO: renamed from: a */
    private final InterfaceC0404d f369a;

    static {
        new C0401a();
    }

    protected ParcelImpl(Parcel parcel) {
        this.f369a = new C0403c(parcel).m324g();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        new C0403c(parcel).m308a(this.f369a);
    }
}
