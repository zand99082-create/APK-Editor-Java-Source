package p019b.p022fn.p023a.p025b.p033b;

import java.util.zip.ZipEntry;

/* JADX INFO: renamed from: b.fn.a.b.b.b */
/* JADX INFO: loaded from: classes.dex */
public class C0448b {
    /* JADX INFO: renamed from: a */
    public static String m484a(ZipEntry zipEntry) {
        String name = zipEntry.getName();
        int iLastIndexOf = name.lastIndexOf("/");
        return iLastIndexOf == -1 ? name : name.substring(iLastIndexOf + 1);
    }
}
