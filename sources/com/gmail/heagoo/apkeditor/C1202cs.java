package com.gmail.heagoo.apkeditor;

import java.io.File;
import java.io.FilenameFilter;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.cs */
/* JADX INFO: loaded from: classes.dex */
final class C1202cs implements FilenameFilter {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ DialogC1197cn f3517a;

    C1202cs(DialogC1197cn dialogC1197cn) {
        this.f3517a = dialogC1197cn;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return new File(file, str).isDirectory() || this.f3517a.m3113a(str);
    }
}
