package p019b.p020a.p021a;

import android.support.v4.media.session.PlaybackStateCompat;
import com.github.megatronking.stringfog.xor.StringFogImpl;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: renamed from: b.a.a.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0414j implements Closeable {

    /* JADX INFO: renamed from: a */
    private InterfaceC0416l f424a;

    /* JADX INFO: renamed from: b */
    private String f425b;

    /* JADX INFO: renamed from: c */
    private InputStream f426c;

    /* JADX INFO: renamed from: d */
    private long f427d;

    /* JADX INFO: renamed from: e */
    private final Map f428e = new HashMap();

    /* JADX INFO: renamed from: f */
    private EnumC0413i f429f;

    /* JADX INFO: renamed from: g */
    private boolean f430g;

    /* JADX INFO: renamed from: h */
    private boolean f431h;

    /* JADX INFO: renamed from: i */
    private boolean f432i;

    protected C0414j(InterfaceC0416l interfaceC0416l, String str, InputStream inputStream, long j) {
        this.f424a = interfaceC0416l;
        this.f425b = str;
        if (inputStream == null) {
            this.f426c = new ByteArrayInputStream(new byte[0]);
            this.f427d = 0L;
        } else {
            this.f426c = inputStream;
            this.f427d = j;
        }
        this.f430g = this.f427d < 0;
        this.f432i = true;
    }

    /* JADX INFO: renamed from: a */
    private static long m368a(PrintWriter printWriter, Map map, long j) {
        for (String str : map.keySet()) {
            if (str.equalsIgnoreCase("content-length")) {
                try {
                    return Long.parseLong((String) map.get(str));
                } catch (NumberFormatException e) {
                    return j;
                }
            }
        }
        printWriter.print("Content-Length: " + j + "\r\n");
        return j;
    }

    /* JADX INFO: renamed from: a */
    private void m369a(OutputStream outputStream, long j) throws IOException {
        if (!this.f431h) {
            m371b(outputStream, j);
            return;
        }
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
        m371b(gZIPOutputStream, -1L);
        gZIPOutputStream.finish();
    }

    /* JADX INFO: renamed from: a */
    private static boolean m370a(Map map, String str) {
        boolean zEqualsIgnoreCase = false;
        Iterator it = map.keySet().iterator();
        while (true) {
            boolean z = zEqualsIgnoreCase;
            if (!it.hasNext()) {
                return z;
            }
            zEqualsIgnoreCase = ((String) it.next()).equalsIgnoreCase(str) | z;
        }
    }

    /* JADX INFO: renamed from: b */
    private void m371b(OutputStream outputStream, long j) throws IOException {
        byte[] bArr = new byte[16384];
        boolean z = j == -1;
        long j2 = j;
        while (true) {
            if (j2 <= 0 && !z) {
                return;
            }
            int i = this.f426c.read(bArr, 0, (int) (z ? 16384L : Math.min(j2, PlaybackStateCompat.ACTION_PREPARE)));
            if (i <= 0) {
                return;
            }
            outputStream.write(bArr, 0, i);
            j2 = !z ? j2 - ((long) i) : j2;
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m372a() {
        return this.f425b;
    }

    /* JADX INFO: renamed from: a */
    public final String m373a(String str) {
        for (String str2 : this.f428e.keySet()) {
            if (str2.equalsIgnoreCase(str)) {
                return (String) this.f428e.get(str2);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final void m374a(EnumC0413i enumC0413i) {
        this.f429f = enumC0413i;
    }

    /* JADX INFO: renamed from: a */
    protected final void m375a(OutputStream outputStream) {
        String str = this.f425b;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("E, d MMM yyyy HH:mm:ss 'GMT'", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        try {
            if (this.f424a == null) {
                throw new Error("sendResponse(): Status can't be null.");
            }
            PrintWriter printWriter = new PrintWriter((Writer) new BufferedWriter(new OutputStreamWriter(outputStream, StringFogImpl.CHARSET_NAME_UTF_8)), false);
            printWriter.print("HTTP/1.1 " + this.f424a.mo380a() + " \r\n");
            if (str != null) {
                printWriter.print("Content-Type: " + str + "\r\n");
            }
            if (this.f428e.get("Date") == null) {
                printWriter.print("Date: " + simpleDateFormat.format(new Date()) + "\r\n");
            }
            for (String str2 : this.f428e.keySet()) {
                printWriter.print(str2 + ": " + ((String) this.f428e.get(str2)) + "\r\n");
            }
            if (!m370a(this.f428e, "connection")) {
                printWriter.print("Connection: " + (this.f432i ? "keep-alive" : "close") + "\r\n");
            }
            if (m370a(this.f428e, "content-length")) {
                this.f431h = false;
            }
            if (this.f431h) {
                printWriter.print("Content-Encoding: gzip\r\n");
                this.f430g = true;
            }
            long jM368a = this.f426c != null ? this.f427d : 0L;
            if (this.f429f != EnumC0413i.HEAD && this.f430g) {
                printWriter.print("Transfer-Encoding: chunked\r\n");
            } else if (!this.f431h) {
                jM368a = m368a(printWriter, this.f428e, jM368a);
            }
            printWriter.print("\r\n");
            printWriter.flush();
            if (this.f429f == EnumC0413i.HEAD || !this.f430g) {
                m369a(outputStream, jM368a);
            } else {
                C0415k c0415k = new C0415k(outputStream);
                m369a(c0415k, -1L);
                c0415k.m379a();
            }
            outputStream.flush();
            AbstractC0405a.m332b(this.f426c);
        } catch (IOException e) {
            AbstractC0405a.f382g.log(Level.SEVERE, "Could not send response to the client", (Throwable) e);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m376a(String str, String str2) {
        this.f428e.put(str, str2);
    }

    /* JADX INFO: renamed from: a */
    public final void m377a(boolean z) {
        this.f431h = z;
    }

    /* JADX INFO: renamed from: b */
    public final void m378b(boolean z) {
        this.f432i = z;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f426c != null) {
            this.f426c.close();
        }
    }
}
