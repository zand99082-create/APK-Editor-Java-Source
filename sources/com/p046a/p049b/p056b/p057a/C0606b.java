package com.p046a.p049b.p056b.p057a;

import com.p046a.p049b.p050a.p052b.C0541ah;
import com.p046a.p049b.p050a.p054d.InterfaceC0579h;
import com.p046a.p049b.p056b.C0604a;
import java.io.File;

/* JADX INFO: renamed from: com.a.b.b.a.b */
/* JADX INFO: loaded from: classes.dex */
final class C0606b implements InterfaceC0579h {
    C0606b() {
    }

    @Override // com.p046a.p049b.p050a.p054d.InterfaceC0579h
    /* JADX INFO: renamed from: a */
    public final void mo993a(File file) {
        if (C0605a.f993d.verbose) {
            C0604a.f988a.println("processing archive " + file + "...");
        }
    }

    @Override // com.p046a.p049b.p050a.p054d.InterfaceC0579h
    /* JADX INFO: renamed from: a */
    public final void mo994a(Exception exc) {
        if (exc instanceof C0613i) {
            throw ((C0613i) exc);
        }
        if (exc instanceof C0541ah) {
            C0604a.f989b.println("\nEXCEPTION FROM SIMULATION:");
            C0604a.f989b.println(exc.getMessage() + "\n");
            C0604a.f989b.println(((C0541ah) exc).m571a());
        } else {
            C0604a.f989b.println("\nUNEXPECTED TOP-LEVEL EXCEPTION:");
            exc.printStackTrace(C0604a.f989b);
        }
        C0605a.f992c.incrementAndGet();
    }

    @Override // com.p046a.p049b.p050a.p054d.InterfaceC0579h
    /* JADX INFO: renamed from: a */
    public final boolean mo995a(String str, long j, byte[] bArr) {
        return C0605a.m1073b(str, j, bArr);
    }
}
