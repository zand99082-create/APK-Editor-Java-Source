package com.p046a.p049b.p073h;

import android.support.v7.widget.ActivityChooserView;
import java.io.FilterWriter;
import java.io.Writer;

/* JADX INFO: renamed from: com.a.b.h.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0960h extends FilterWriter {

    /* JADX INFO: renamed from: a */
    private final String f2571a;

    /* JADX INFO: renamed from: b */
    private final int f2572b;

    /* JADX INFO: renamed from: c */
    private final int f2573c;

    /* JADX INFO: renamed from: d */
    private int f2574d;

    /* JADX INFO: renamed from: e */
    private boolean f2575e;

    /* JADX INFO: renamed from: f */
    private int f2576f;

    public C0960h(Writer writer, int i) {
        this(writer, i, "");
    }

    public C0960h(Writer writer, int i, String str) {
        super(writer);
        if (writer == null) {
            throw new NullPointerException("out == null");
        }
        if (i < 0) {
            throw new IllegalArgumentException("width < 0");
        }
        if (str == null) {
            throw new NullPointerException("prefix == null");
        }
        this.f2572b = i != 0 ? i : ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.f2573c = i >> 1;
        this.f2571a = str.length() == 0 ? null : str;
        m2243a();
    }

    /* JADX INFO: renamed from: a */
    private void m2243a() {
        this.f2574d = 0;
        this.f2575e = this.f2573c != 0;
        this.f2576f = 0;
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public final void write(int i) {
        synchronized (this.lock) {
            if (this.f2575e) {
                if (i == 32) {
                    this.f2576f++;
                    if (this.f2576f >= this.f2573c) {
                        this.f2576f = this.f2573c;
                        this.f2575e = false;
                    }
                } else {
                    this.f2575e = false;
                }
            }
            if (this.f2574d == this.f2572b && i != 10) {
                this.out.write(10);
                this.f2574d = 0;
            }
            if (this.f2574d == 0) {
                if (this.f2571a != null) {
                    this.out.write(this.f2571a);
                }
                if (!this.f2575e) {
                    for (int i2 = 0; i2 < this.f2576f; i2++) {
                        this.out.write(32);
                    }
                    this.f2574d = this.f2576f;
                }
            }
            this.out.write(i);
            if (i == 10) {
                m2243a();
            } else {
                this.f2574d++;
            }
        }
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public final void write(String str, int i, int i2) {
        synchronized (this.lock) {
            while (i2 > 0) {
                write(str.charAt(i));
                i++;
                i2--;
            }
        }
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        synchronized (this.lock) {
            while (i2 > 0) {
                write(cArr[i]);
                i++;
                i2--;
            }
        }
    }
}
