package p019b.p020a.p021a;

import com.github.megatronking.stringfog.xor.StringFogImpl;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: b.a.a.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0405a {

    /* JADX INFO: renamed from: b */
    private static final Pattern f377b = Pattern.compile("[ |\t]*(charset)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;]*)['|\"]?", 2);

    /* JADX INFO: renamed from: c */
    private static final Pattern f378c = Pattern.compile("[ |\t]*(boundary)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;]*)['|\"]?", 2);

    /* JADX INFO: renamed from: d */
    private static final Pattern f379d = Pattern.compile("([ |\t]*Content-Disposition[ |\t]*:)(.*)", 2);

    /* JADX INFO: renamed from: e */
    private static final Pattern f380e = Pattern.compile("([ |\t]*content-type[ |\t]*:)(.*)", 2);

    /* JADX INFO: renamed from: f */
    private static final Pattern f381f = Pattern.compile("[ |\t]*([a-zA-Z]*)[ |\t]*=[ |\t]*['|\"]([^\"^']*)['|\"]");

    /* JADX INFO: renamed from: g */
    private static final Logger f382g = Logger.getLogger(AbstractC0405a.class.getName());

    /* JADX INFO: renamed from: a */
    protected C0406b f383a;

    /* JADX INFO: renamed from: h */
    private final String f384h;

    /* JADX INFO: renamed from: i */
    private final int f385i;

    /* JADX INFO: renamed from: j */
    private volatile ServerSocket f386j;

    /* JADX INFO: renamed from: k */
    private C0420p f387k;

    /* JADX INFO: renamed from: l */
    private Thread f388l;

    /* JADX INFO: renamed from: m */
    private InterfaceC0423s f389m;

    public AbstractC0405a(int i) {
        this(null, 8000);
    }

    private AbstractC0405a(String str, int i) {
        this.f387k = new C0420p();
        this.f384h = null;
        this.f385i = i;
        this.f389m = new C0410f(this, (byte) 0);
        this.f383a = new C0406b();
    }

    /* JADX INFO: renamed from: a */
    public static C0414j m325a(InterfaceC0416l interfaceC0416l, String str, InputStream inputStream, long j) {
        return new C0414j(interfaceC0416l, str, inputStream, j);
    }

    /* JADX INFO: renamed from: a */
    public static C0414j m326a(InterfaceC0416l interfaceC0416l, String str, String str2) {
        byte[] bytes;
        if (str2 == null) {
            return m325a(interfaceC0416l, str, new ByteArrayInputStream(new byte[0]), 0L);
        }
        try {
            bytes = str2.getBytes(StringFogImpl.CHARSET_NAME_UTF_8);
        } catch (UnsupportedEncodingException e) {
            f382g.log(Level.SEVERE, "encoding problem, responding nothing", (Throwable) e);
            bytes = new byte[0];
        }
        return m325a(interfaceC0416l, str, new ByteArrayInputStream(bytes), bytes.length);
    }

    /* JADX INFO: renamed from: a */
    protected static boolean m329a(C0414j c0414j) {
        return c0414j.m372a() != null && c0414j.m372a().toLowerCase().contains("text/");
    }

    /* JADX INFO: renamed from: b */
    protected static String m331b(String str) {
        try {
            return URLDecoder.decode(str, "UTF8");
        } catch (UnsupportedEncodingException e) {
            f382g.log(Level.WARNING, "Encoding not supported, ignored", (Throwable) e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final void m332b(Object obj) {
        if (obj != null) {
            try {
                if (obj instanceof Closeable) {
                    ((Closeable) obj).close();
                } else if (obj instanceof Socket) {
                    ((Socket) obj).close();
                } else {
                    if (!(obj instanceof ServerSocket)) {
                        throw new IllegalArgumentException("Unknown object to close");
                    }
                    ((ServerSocket) obj).close();
                }
            } catch (IOException e) {
                f382g.log(Level.SEVERE, "Could not close", (Throwable) e);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public C0414j mo341a(InterfaceC0412h interfaceC0412h) {
        HashMap map = new HashMap();
        EnumC0413i enumC0413iMo363b = interfaceC0412h.mo363b();
        if (EnumC0413i.PUT.equals(enumC0413iMo363b) || EnumC0413i.POST.equals(enumC0413iMo363b)) {
            try {
                interfaceC0412h.mo362a(map);
            } catch (C0418n e) {
                return m326a(e.m381a(), "text/plain", e.getMessage());
            } catch (IOException e2) {
                return m326a(EnumC0417m.f436d, "text/plain", "SERVER INTERNAL ERROR: IOException: " + e2.getMessage());
            }
        }
        interfaceC0412h.mo364c().put("NanoHttpd.QUERY_STRING", interfaceC0412h.mo365d());
        return m326a(EnumC0417m.f435c, "text/plain", "Not Found");
    }

    /* JADX INFO: renamed from: a */
    public final void m342a(int i, boolean z) throws IOException {
        this.f386j = this.f387k.m384a();
        this.f386j.setReuseAddress(true);
        RunnableC0419o runnableC0419o = new RunnableC0419o(this, i, (byte) 0);
        this.f388l = new Thread(runnableC0419o);
        this.f388l.setDaemon(true);
        this.f388l.setName("NanoHttpd Main Listener");
        this.f388l.start();
        while (!runnableC0419o.f458c && runnableC0419o.f457b == null) {
            try {
                Thread.sleep(10L);
            } catch (Throwable th) {
            }
        }
        if (runnableC0419o.f457b != null) {
            throw runnableC0419o.f457b;
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m343c() {
        if (this.f386j == null) {
            return -1;
        }
        return this.f386j.getLocalPort();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m344d() {
        return (this.f386j != null && this.f388l != null) && !this.f386j.isClosed() && this.f388l.isAlive();
    }

    /* JADX INFO: renamed from: e */
    public final void m345e() {
        try {
            m332b(this.f386j);
            this.f383a.m346a();
            if (this.f388l != null) {
                this.f388l.join();
            }
        } catch (Exception e) {
            f382g.log(Level.SEVERE, "Could not stop all connections", (Throwable) e);
        }
    }
}
