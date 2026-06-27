package p019b.p020a.p021a;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

/* JADX INFO: renamed from: b.a.a.c */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0407c implements Runnable {

    /* JADX INFO: renamed from: a */
    private final InputStream f392a;

    /* JADX INFO: renamed from: b */
    private final Socket f393b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ AbstractC0405a f394c;

    private RunnableC0407c(AbstractC0405a abstractC0405a, InputStream inputStream, Socket socket) {
        this.f394c = abstractC0405a;
        this.f392a = inputStream;
        this.f393b = socket;
    }

    /* synthetic */ RunnableC0407c(AbstractC0405a abstractC0405a, InputStream inputStream, Socket socket, byte b2) {
        this(abstractC0405a, inputStream, socket);
    }

    /* JADX INFO: renamed from: a */
    public final void m349a() {
        AbstractC0405a.m332b(this.f392a);
        AbstractC0405a.m332b(this.f393b);
    }

    @Override // java.lang.Runnable
    public final void run() {
        OutputStream outputStream = null;
        try {
            outputStream = this.f393b.getOutputStream();
            C0411g c0411g = new C0411g(this.f394c, this.f394c.f389m.mo352a(), this.f392a, outputStream, this.f393b.getInetAddress());
            while (!this.f393b.isClosed()) {
                c0411g.m361a();
            }
        } catch (Exception e) {
            if ((!(e instanceof SocketException) || !"NanoHttpd Shutdown".equals(e.getMessage())) && !(e instanceof SocketTimeoutException)) {
                AbstractC0405a.f382g.log(Level.FINE, "Communication with the client broken", (Throwable) e);
            }
        } finally {
            AbstractC0405a.m332b(outputStream);
            AbstractC0405a.m332b(this.f392a);
            AbstractC0405a.m332b(this.f393b);
            this.f394c.f383a.m347a(this);
        }
    }
}
