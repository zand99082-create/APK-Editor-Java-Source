package com.p046a.p049b.p073h;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

/* JADX INFO: renamed from: com.a.b.h.t */
/* JADX INFO: loaded from: classes.dex */
public final class C0972t {

    /* JADX INFO: renamed from: a */
    private final Writer f2593a;

    /* JADX INFO: renamed from: b */
    private final int f2594b;

    /* JADX INFO: renamed from: c */
    private final StringBuffer f2595c;

    /* JADX INFO: renamed from: d */
    private final StringBuffer f2596d;

    /* JADX INFO: renamed from: e */
    private final C0960h f2597e;

    /* JADX INFO: renamed from: f */
    private final C0960h f2598f;

    public C0972t(Writer writer, int i, int i2, String str) {
        if (writer == null) {
            throw new NullPointerException("out == null");
        }
        if (i <= 0) {
            throw new IllegalArgumentException("leftWidth < 1");
        }
        if (i2 <= 0) {
            throw new IllegalArgumentException("rightWidth < 1");
        }
        if (str == null) {
            throw new NullPointerException("spacer == null");
        }
        StringWriter stringWriter = new StringWriter(1000);
        StringWriter stringWriter2 = new StringWriter(1000);
        this.f2593a = writer;
        this.f2594b = i;
        this.f2595c = stringWriter.getBuffer();
        this.f2596d = stringWriter2.getBuffer();
        this.f2597e = new C0960h(stringWriter, i);
        this.f2598f = new C0960h(stringWriter2, i2, str);
    }

    /* JADX INFO: renamed from: a */
    public static String m2293a(String str, int i, String str2, String str3, int i2) {
        StringWriter stringWriter = new StringWriter((str.length() + str3.length()) * 3);
        C0972t c0972t = new C0972t(stringWriter, i, i2, str2);
        try {
            c0972t.f2597e.write(str);
            c0972t.f2598f.write(str3);
            c0972t.m2298c();
            return stringWriter.toString();
        } catch (IOException e) {
            throw new RuntimeException("shouldn't happen", e);
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m2294a(StringBuffer stringBuffer, Writer writer) throws IOException {
        int length = stringBuffer.length();
        if (length == 0 || stringBuffer.charAt(length - 1) == '\n') {
            return;
        }
        writer.write(10);
    }

    /* JADX INFO: renamed from: d */
    private void m2295d() throws IOException {
        int iIndexOf;
        while (true) {
            int iIndexOf2 = this.f2595c.indexOf("\n");
            if (iIndexOf2 < 0 || (iIndexOf = this.f2596d.indexOf("\n")) < 0) {
                return;
            }
            if (iIndexOf2 != 0) {
                this.f2593a.write(this.f2595c.substring(0, iIndexOf2));
            }
            if (iIndexOf != 0) {
                Writer writer = this.f2593a;
                for (int i = this.f2594b - iIndexOf2; i > 0; i--) {
                    writer.write(32);
                }
                this.f2593a.write(this.f2596d.substring(0, iIndexOf));
            }
            this.f2593a.write(10);
            this.f2595c.delete(0, iIndexOf2 + 1);
            this.f2596d.delete(0, iIndexOf + 1);
        }
    }

    /* JADX INFO: renamed from: a */
    public final Writer m2296a() {
        return this.f2597e;
    }

    /* JADX INFO: renamed from: b */
    public final Writer m2297b() {
        return this.f2598f;
    }

    /* JADX INFO: renamed from: c */
    public final void m2298c() {
        try {
            m2294a(this.f2595c, this.f2597e);
            m2294a(this.f2596d, this.f2598f);
            m2295d();
            m2294a(this.f2595c, this.f2597e);
            while (this.f2595c.length() != 0) {
                this.f2598f.write(10);
                m2295d();
            }
            m2294a(this.f2596d, this.f2598f);
            while (this.f2596d.length() != 0) {
                this.f2597e.write(10);
                m2295d();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
