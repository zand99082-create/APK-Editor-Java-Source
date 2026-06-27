package p019b.p020a.p021a;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.logging.Level;

/* JADX INFO: renamed from: b.a.a.o */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0419o implements Runnable {

    /* JADX INFO: renamed from: a */
    private final int f456a;

    /* JADX INFO: renamed from: b */
    private IOException f457b;

    /* JADX INFO: renamed from: c */
    private boolean f458c;

    /* JADX INFO: renamed from: d */
    private /* synthetic */ AbstractC0405a f459d;

    private RunnableC0419o(AbstractC0405a abstractC0405a, int i) {
        this.f459d = abstractC0405a;
        this.f458c = false;
        this.f456a = i;
    }

    /* synthetic */ RunnableC0419o(AbstractC0405a abstractC0405a, int i, byte b2) {
        this(abstractC0405a, i);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f459d.f386j.bind(this.f459d.f384h != null ? new InetSocketAddress(this.f459d.f384h, this.f459d.f385i) : new InetSocketAddress(this.f459d.f385i));
            this.f458c = true;
            do {
                try {
                    Socket socketAccept = this.f459d.f386j.accept();
                    if (this.f456a > 0) {
                        socketAccept.setSoTimeout(this.f456a);
                    }
                    this.f459d.f383a.m348b(new RunnableC0407c(this.f459d, socketAccept.getInputStream(), socketAccept, (byte) 0));
                } catch (IOException e) {
                    AbstractC0405a.f382g.log(Level.FINE, "Communication with the client broken", (Throwable) e);
                }
            } while (!this.f459d.f386j.isClosed());
        } catch (IOException e2) {
            this.f457b = e2;
        }
    }
}
