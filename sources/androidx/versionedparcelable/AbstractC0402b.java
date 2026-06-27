package androidx.versionedparcelable;

import android.os.Parcelable;
import android.support.annotation.RestrictTo;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: androidx.versionedparcelable.b */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class AbstractC0402b {
    /* JADX INFO: renamed from: a */
    private static InterfaceC0404d m301a(String str, AbstractC0402b abstractC0402b) {
        try {
            return (InterfaceC0404d) Class.forName(str, true, AbstractC0402b.class.getClassLoader()).getDeclaredMethod("read", AbstractC0402b.class).invoke(null, abstractC0402b);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
        }
    }

    /* JADX INFO: renamed from: a */
    private static Class m302a(Class cls) {
        return Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
    }

    /* JADX INFO: renamed from: a */
    protected abstract void mo303a();

    /* JADX INFO: renamed from: a */
    protected abstract void mo304a(int i);

    /* JADX INFO: renamed from: a */
    public final void m305a(int i, int i2) {
        mo320c(i2);
        mo304a(i);
    }

    /* JADX INFO: renamed from: a */
    protected abstract void mo306a(Parcelable parcelable);

    /* JADX INFO: renamed from: a */
    public final void m307a(Parcelable parcelable, int i) {
        mo320c(i);
        mo306a(parcelable);
    }

    /* JADX INFO: renamed from: a */
    protected final void m308a(InterfaceC0404d interfaceC0404d) {
        if (interfaceC0404d == null) {
            mo309a((String) null);
            return;
        }
        try {
            mo309a(m302a(interfaceC0404d.getClass()).getName());
            AbstractC0402b abstractC0402bMo315b = mo315b();
            try {
                m302a(interfaceC0404d.getClass()).getDeclaredMethod("write", interfaceC0404d.getClass(), AbstractC0402b.class).invoke(null, interfaceC0404d, abstractC0402bMo315b);
                abstractC0402bMo315b.mo303a();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (InvocationTargetException e4) {
                if (!(e4.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
                }
                throw ((RuntimeException) e4.getCause());
            }
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException(interfaceC0404d.getClass().getSimpleName() + " does not have a Parcelizer", e5);
        }
    }

    /* JADX INFO: renamed from: a */
    protected abstract void mo309a(String str);

    /* JADX INFO: renamed from: a */
    public final void m310a(String str, int i) {
        mo320c(7);
        mo309a(str);
    }

    /* JADX INFO: renamed from: a */
    protected abstract void mo311a(byte[] bArr);

    /* JADX INFO: renamed from: a */
    public final void m312a(byte[] bArr, int i) {
        mo320c(2);
        mo311a(bArr);
    }

    /* JADX INFO: renamed from: b */
    public final int m313b(int i, int i2) {
        return !mo317b(i2) ? i : mo319c();
    }

    /* JADX INFO: renamed from: b */
    public final Parcelable m314b(Parcelable parcelable, int i) {
        return !mo317b(i) ? parcelable : mo323f();
    }

    /* JADX INFO: renamed from: b */
    protected abstract AbstractC0402b mo315b();

    /* JADX INFO: renamed from: b */
    public final String m316b(String str, int i) {
        return !mo317b(7) ? str : mo321d();
    }

    /* JADX INFO: renamed from: b */
    protected abstract boolean mo317b(int i);

    /* JADX INFO: renamed from: b */
    public final byte[] m318b(byte[] bArr, int i) {
        return !mo317b(2) ? bArr : mo322e();
    }

    /* JADX INFO: renamed from: c */
    protected abstract int mo319c();

    /* JADX INFO: renamed from: c */
    protected abstract void mo320c(int i);

    /* JADX INFO: renamed from: d */
    protected abstract String mo321d();

    /* JADX INFO: renamed from: e */
    protected abstract byte[] mo322e();

    /* JADX INFO: renamed from: f */
    protected abstract Parcelable mo323f();

    /* JADX INFO: renamed from: g */
    protected final InterfaceC0404d m324g() {
        String strMo321d = mo321d();
        if (strMo321d == null) {
            return null;
        }
        return m301a(strMo321d, mo315b());
    }
}
