package com.gmail.heagoo.neweditor;

/* JADX INFO: renamed from: com.gmail.heagoo.neweditor.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1593d implements InterfaceC1586ae {

    /* JADX INFO: renamed from: a */
    private Token f4817a;

    /* JADX INFO: renamed from: b */
    private Token f4818b;

    /* JADX INFO: renamed from: a */
    private static C1613x m3897a(C1588ag c1588ag) {
        while (c1588ag != null) {
            if (!c1588ag.f4772c.m3956l()) {
                return c1588ag.f4772c;
            }
            c1588ag = c1588ag.f4770a;
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final Token m3898a() {
        return this.f4817a;
    }

    @Override // com.gmail.heagoo.neweditor.InterfaceC1586ae
    /* JADX INFO: renamed from: a */
    public final void mo3870a(byte b2, int i, int i2, C1588ag c1588ag) {
        Token token = new Token(b2, i, i2, m3897a(c1588ag));
        if (this.f4817a == null) {
            this.f4818b = token;
            this.f4817a = token;
        } else {
            this.f4818b.next = token;
            this.f4818b = this.f4818b.next;
        }
    }
}
