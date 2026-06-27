package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.RestrictTo;
import android.util.SparseIntArray;

/* JADX INFO: renamed from: androidx.versionedparcelable.c */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
final class C0403c extends AbstractC0402b {

    /* JADX INFO: renamed from: a */
    private final SparseIntArray f370a;

    /* JADX INFO: renamed from: b */
    private final Parcel f371b;

    /* JADX INFO: renamed from: c */
    private final int f372c;

    /* JADX INFO: renamed from: d */
    private final int f373d;

    /* JADX INFO: renamed from: e */
    private final String f374e;

    /* JADX INFO: renamed from: f */
    private int f375f;

    /* JADX INFO: renamed from: g */
    private int f376g;

    C0403c(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "");
    }

    private C0403c(Parcel parcel, int i, int i2, String str) {
        this.f370a = new SparseIntArray();
        this.f375f = -1;
        this.f376g = 0;
        this.f371b = parcel;
        this.f372c = i;
        this.f373d = i2;
        this.f376g = this.f372c;
        this.f374e = str;
    }

    @Override // androidx.versionedparcelable.AbstractC0402b
    /* JADX INFO: renamed from: a */
    public final void mo303a() {
        if (this.f375f >= 0) {
            int i = this.f370a.get(this.f375f);
            int iDataPosition = this.f371b.dataPosition();
            this.f371b.setDataPosition(i);
            this.f371b.writeInt(iDataPosition - i);
            this.f371b.setDataPosition(iDataPosition);
        }
    }

    @Override // androidx.versionedparcelable.AbstractC0402b
    /* JADX INFO: renamed from: a */
    public final void mo304a(int i) {
        this.f371b.writeInt(i);
    }

    @Override // androidx.versionedparcelable.AbstractC0402b
    /* JADX INFO: renamed from: a */
    public final void mo306a(Parcelable parcelable) {
        this.f371b.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.AbstractC0402b
    /* JADX INFO: renamed from: a */
    public final void mo309a(String str) {
        this.f371b.writeString(str);
    }

    @Override // androidx.versionedparcelable.AbstractC0402b
    /* JADX INFO: renamed from: a */
    public final void mo311a(byte[] bArr) {
        if (bArr == null) {
            this.f371b.writeInt(-1);
        } else {
            this.f371b.writeInt(bArr.length);
            this.f371b.writeByteArray(bArr);
        }
    }

    @Override // androidx.versionedparcelable.AbstractC0402b
    /* JADX INFO: renamed from: b */
    protected final AbstractC0402b mo315b() {
        return new C0403c(this.f371b, this.f371b.dataPosition(), this.f376g == this.f372c ? this.f373d : this.f376g, this.f374e + "  ");
    }

    @Override // androidx.versionedparcelable.AbstractC0402b
    /* JADX INFO: renamed from: b */
    public final boolean mo317b(int i) {
        int iDataPosition;
        while (true) {
            if (this.f376g >= this.f373d) {
                iDataPosition = -1;
                break;
            }
            this.f371b.setDataPosition(this.f376g);
            int i2 = this.f371b.readInt();
            int i3 = this.f371b.readInt();
            this.f376g = i2 + this.f376g;
            if (i3 == i) {
                iDataPosition = this.f371b.dataPosition();
                break;
            }
        }
        if (iDataPosition == -1) {
            return false;
        }
        this.f371b.setDataPosition(iDataPosition);
        return true;
    }

    @Override // androidx.versionedparcelable.AbstractC0402b
    /* JADX INFO: renamed from: c */
    public final int mo319c() {
        return this.f371b.readInt();
    }

    @Override // androidx.versionedparcelable.AbstractC0402b
    /* JADX INFO: renamed from: c */
    public final void mo320c(int i) {
        mo303a();
        this.f375f = i;
        this.f370a.put(i, this.f371b.dataPosition());
        mo304a(0);
        mo304a(i);
    }

    @Override // androidx.versionedparcelable.AbstractC0402b
    /* JADX INFO: renamed from: d */
    public final String mo321d() {
        return this.f371b.readString();
    }

    @Override // androidx.versionedparcelable.AbstractC0402b
    /* JADX INFO: renamed from: e */
    public final byte[] mo322e() {
        int i = this.f371b.readInt();
        if (i < 0) {
            return null;
        }
        byte[] bArr = new byte[i];
        this.f371b.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.AbstractC0402b
    /* JADX INFO: renamed from: f */
    public final Parcelable mo323f() {
        return this.f371b.readParcelable(getClass().getClassLoader());
    }
}
