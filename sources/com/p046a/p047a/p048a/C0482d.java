package com.p046a.p047a.p048a;

import java.io.PrintStream;
import java.io.PrintWriter;

/* JADX INFO: renamed from: com.a.a.a.d */
/* JADX INFO: loaded from: classes.dex */
public class C0482d extends RuntimeException {

    /* JADX INFO: renamed from: a */
    private StringBuffer f672a;

    public C0482d(String str) {
        this(str, null);
    }

    public C0482d(String str, Throwable th) {
        super(str == null ? th != null ? th.getMessage() : null : str, th);
        if (!(th instanceof C0482d)) {
            this.f672a = new StringBuffer(200);
            return;
        }
        String string = ((C0482d) th).f672a.toString();
        this.f672a = new StringBuffer(string.length() + 200);
        this.f672a.append(string);
    }

    public C0482d(Throwable th) {
        this(null, th);
    }

    /* JADX INFO: renamed from: a */
    public static C0482d m570a(Throwable th, String str) {
        C0482d c0482d = th instanceof C0482d ? (C0482d) th : new C0482d(th);
        c0482d.m573a(str);
        return c0482d;
    }

    /* JADX INFO: renamed from: a */
    public final String m571a() {
        return this.f672a.toString();
    }

    /* JADX INFO: renamed from: a */
    public final void m572a(PrintStream printStream) {
        printStream.println(getMessage());
        printStream.print(this.f672a);
    }

    /* JADX INFO: renamed from: a */
    public final void m573a(String str) {
        if (str == null) {
            throw new NullPointerException("str == null");
        }
        this.f672a.append(str);
        if (str.endsWith("\n")) {
            return;
        }
        this.f672a.append('\n');
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        super.printStackTrace(printStream);
        printStream.println(this.f672a);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        super.printStackTrace(printWriter);
        printWriter.println(this.f672a);
    }
}
