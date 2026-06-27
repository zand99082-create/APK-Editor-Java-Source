package com.gmail.heagoo.apkeditor.p096e;

import java.io.BufferedReader;
import java.io.Reader;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.e.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1238c extends BufferedReader {

    /* JADX INFO: renamed from: a */
    private int f3593a;

    public C1238c(Reader reader) {
        super(reader);
        this.f3593a = 0;
    }

    /* JADX INFO: renamed from: a */
    public final int m3170a() {
        return this.f3593a;
    }

    @Override // java.io.BufferedReader
    public final String readLine() {
        this.f3593a++;
        return super.readLine();
    }
}
