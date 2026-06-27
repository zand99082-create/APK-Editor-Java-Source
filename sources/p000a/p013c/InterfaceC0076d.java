package p000a.p013c;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Set;

/* JADX INFO: renamed from: a.c.d */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0076d {
    /* JADX INFO: renamed from: a */
    Set mo193a(boolean z);

    /* JADX INFO: renamed from: a */
    void mo195a(File file);

    /* JADX INFO: renamed from: a */
    void mo196a(File file, String str);

    /* JADX INFO: renamed from: a */
    boolean mo197a(String str);

    /* JADX INFO: renamed from: b */
    InputStream mo198b(String str);

    /* JADX INFO: renamed from: c */
    OutputStream mo200c(String str);

    /* JADX INFO: renamed from: d */
    InterfaceC0076d mo201d(String str);

    /* JADX INFO: renamed from: e */
    boolean mo202e(String str);

    int getCompressionLevel(String str);

    long getSize(String str);
}
