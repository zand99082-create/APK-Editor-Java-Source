package p019b.p020a.p021a;

import android.support.v4.media.session.PlaybackStateCompat;
import com.gmail.heagoo.apkeditor.gzd;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: b.a.a.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0411g implements InterfaceC0412h {

    /* JADX INFO: renamed from: a */
    private final C0422r f400a;

    /* JADX INFO: renamed from: b */
    private final OutputStream f401b;

    /* JADX INFO: renamed from: c */
    private final BufferedInputStream f402c;

    /* JADX INFO: renamed from: d */
    private int f403d;

    /* JADX INFO: renamed from: e */
    private int f404e;

    /* JADX INFO: renamed from: f */
    private String f405f;

    /* JADX INFO: renamed from: g */
    private EnumC0413i f406g;

    /* JADX INFO: renamed from: h */
    private Map f407h;

    /* JADX INFO: renamed from: i */
    private Map f408i;

    /* JADX INFO: renamed from: j */
    private C0409e f409j;

    /* JADX INFO: renamed from: k */
    private String f410k;

    /* JADX INFO: renamed from: l */
    private String f411l;

    /* JADX INFO: renamed from: m */
    private String f412m;

    /* JADX INFO: renamed from: n */
    private /* synthetic */ AbstractC0405a f413n;

    public C0411g(AbstractC0405a abstractC0405a, C0422r c0422r, InputStream inputStream, OutputStream outputStream, InetAddress inetAddress) {
        this.f413n = abstractC0405a;
        this.f400a = c0422r;
        this.f402c = new BufferedInputStream(inputStream, 8192);
        this.f401b = outputStream;
        this.f411l = (inetAddress.isLoopbackAddress() || inetAddress.isAnyLocalAddress()) ? "127.0.0.1" : inetAddress.getHostAddress().toString();
        this.f408i = new HashMap();
    }

    /* JADX INFO: renamed from: a */
    private static int m353a(byte[] bArr, int i) {
        while (bArr[i] != 10) {
            i++;
        }
        return i + 1;
    }

    /* JADX INFO: renamed from: a */
    private static String m354a(String str, Pattern pattern, String str2) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? matcher.group(2) : str2;
    }

    /* JADX INFO: renamed from: a */
    private String m355a(ByteBuffer byteBuffer, int i, int i2, String str) throws Throwable {
        FileOutputStream fileOutputStream;
        String strM386b = "";
        if (i2 > 0) {
            try {
                C0421q c0421qM388b = this.f400a.m388b();
                ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
                fileOutputStream = new FileOutputStream(c0421qM388b.m386b());
                try {
                    try {
                        FileChannel channel = fileOutputStream.getChannel();
                        byteBufferDuplicate.position(i).limit(i + i2);
                        channel.write(byteBufferDuplicate.slice());
                        strM386b = c0421qM388b.m386b();
                        AbstractC0405a.m332b(fileOutputStream);
                    } catch (Exception e) {
                        e = e;
                        throw new Error(e);
                    }
                } catch (Throwable th) {
                    th = th;
                    AbstractC0405a.m332b(fileOutputStream);
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                fileOutputStream = null;
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
                AbstractC0405a.m332b(fileOutputStream);
                throw th;
            }
        }
        return strM386b;
    }

    /* JADX INFO: renamed from: a */
    private void m356a(BufferedReader bufferedReader, Map map, Map map2, Map map3) throws C0418n {
        String strM331b;
        try {
            String line = bufferedReader.readLine();
            if (line == null) {
                return;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(line);
            if (!stringTokenizer.hasMoreTokens()) {
                throw new C0418n(EnumC0417m.f434b, "BAD REQUEST: Syntax error. Usage: GET /example/file.html");
            }
            map.put("method", stringTokenizer.nextToken());
            if (!stringTokenizer.hasMoreTokens()) {
                throw new C0418n(EnumC0417m.f434b, "BAD REQUEST: Missing URI. Usage: GET /example/file.html");
            }
            String strNextToken = stringTokenizer.nextToken();
            int iIndexOf = strNextToken.indexOf(63);
            if (iIndexOf >= 0) {
                m358a(strNextToken.substring(iIndexOf + 1), map2);
                strM331b = AbstractC0405a.m331b(strNextToken.substring(0, iIndexOf));
            } else {
                strM331b = AbstractC0405a.m331b(strNextToken);
            }
            if (stringTokenizer.hasMoreTokens()) {
                this.f412m = stringTokenizer.nextToken();
            } else {
                this.f412m = "HTTP/1.1";
                AbstractC0405a.f382g.log(Level.FINE, "no protocol version specified, strange. Assuming HTTP/1.1.");
            }
            String line2 = bufferedReader.readLine();
            while (line2 != null && line2.trim().length() > 0) {
                int iIndexOf2 = line2.indexOf(58);
                if (iIndexOf2 >= 0) {
                    map3.put(line2.substring(0, iIndexOf2).trim().toLowerCase(Locale.US), line2.substring(iIndexOf2 + 1).trim());
                }
                line2 = bufferedReader.readLine();
            }
            map.put("uri", strM331b);
        } catch (IOException e) {
            throw new C0418n(EnumC0417m.f436d, "SERVER INTERNAL ERROR: IOException: " + e.getMessage(), e);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m357a(String str, String str2, ByteBuffer byteBuffer, Map map, Map map2) throws Throwable {
        int[] iArr;
        int[] iArr2;
        String strGroup;
        String strGroup2;
        try {
            byte[] bytes = str.getBytes();
            int[] iArr3 = new int[0];
            if (byteBuffer.remaining() < bytes.length) {
                iArr = iArr3;
            } else {
                int i = 0;
                byte[] bArr = new byte[bytes.length + 4096];
                int iRemaining = byteBuffer.remaining() < bArr.length ? byteBuffer.remaining() : bArr.length;
                byteBuffer.get(bArr, 0, iRemaining);
                int length = iRemaining - bytes.length;
                do {
                    int i2 = 0;
                    while (i2 < length) {
                        int i3 = 0;
                        int[] iArr4 = iArr3;
                        while (i3 < bytes.length && bArr[i2 + i3] == bytes[i3]) {
                            if (i3 == bytes.length - 1) {
                                iArr2 = new int[iArr4.length + 1];
                                System.arraycopy(iArr4, 0, iArr2, 0, iArr4.length);
                                iArr2[iArr4.length] = i + i2;
                            } else {
                                iArr2 = iArr4;
                            }
                            i3++;
                            iArr4 = iArr2;
                        }
                        i2++;
                        iArr3 = iArr4;
                    }
                    i += length;
                    System.arraycopy(bArr, bArr.length - bytes.length, bArr, 0, bytes.length);
                    length = bArr.length - bytes.length;
                    if (byteBuffer.remaining() < length) {
                        length = byteBuffer.remaining();
                    }
                    byteBuffer.get(bArr, bytes.length, length);
                } while (length > 0);
                iArr = iArr3;
            }
            if (iArr.length < 2) {
                throw new C0418n(EnumC0417m.f434b, "BAD REQUEST: Content type is multipart/form-data but contains less than two boundary strings.");
            }
            byte[] bArr2 = new byte[1024];
            for (int i4 = 0; i4 < iArr.length - 1; i4++) {
                byteBuffer.position(iArr[i4]);
                int iRemaining2 = byteBuffer.remaining() < 1024 ? byteBuffer.remaining() : 1024;
                byteBuffer.get(bArr2, 0, iRemaining2);
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArr2, 0, iRemaining2), Charset.forName(str2)), iRemaining2);
                if (!bufferedReader.readLine().contains(str)) {
                    throw new C0418n(EnumC0417m.f434b, "BAD REQUEST: Content type is multipart/form-data but chunk does not start with boundary.");
                }
                String str3 = null;
                String str4 = null;
                String strTrim = null;
                String line = bufferedReader.readLine();
                int i5 = 2;
                while (line != null && line.trim().length() > 0) {
                    Matcher matcher = AbstractC0405a.f379d.matcher(line);
                    if (matcher.matches()) {
                        Matcher matcher2 = AbstractC0405a.f381f.matcher(matcher.group(2));
                        strGroup = str4;
                        strGroup2 = str3;
                        while (matcher2.find()) {
                            String strGroup3 = matcher2.group(1);
                            if (strGroup3.equalsIgnoreCase("name")) {
                                strGroup2 = matcher2.group(2);
                            } else if (strGroup3.equalsIgnoreCase("filename")) {
                                strGroup = matcher2.group(2);
                            }
                        }
                    } else {
                        strGroup = str4;
                        strGroup2 = str3;
                    }
                    Matcher matcher3 = AbstractC0405a.f380e.matcher(line);
                    i5++;
                    strTrim = matcher3.matches() ? matcher3.group(2).trim() : strTrim;
                    line = bufferedReader.readLine();
                    str3 = strGroup2;
                    str4 = strGroup;
                }
                int iM353a = 0;
                while (true) {
                    int i6 = i5 - 1;
                    if (i5 <= 0) {
                        break;
                    }
                    iM353a = m353a(bArr2, iM353a);
                    i5 = i6;
                }
                if (iM353a >= iRemaining2 - 4) {
                    throw new C0418n(EnumC0417m.f436d, "Multipart header size exceeds MAX_HEADER_SIZE.");
                }
                int i7 = iM353a + iArr[i4];
                int i8 = iArr[i4 + 1] - 4;
                byteBuffer.position(i7);
                if (strTrim == null) {
                    byte[] bArr3 = new byte[i8 - i7];
                    byteBuffer.get(bArr3);
                    map.put(str3, new String(bArr3, str2));
                } else {
                    String strM355a = m355a(byteBuffer, i7, i8 - i7, str4);
                    if (map2.containsKey(str3)) {
                        int i9 = 2;
                        while (map2.containsKey(str3 + i9)) {
                            i9++;
                        }
                        map2.put(str3 + i9, strM355a);
                    } else {
                        map2.put(str3, strM355a);
                    }
                    map.put(str3, str4);
                }
            }
        } catch (C0418n e) {
            throw e;
        } catch (Exception e2) {
            throw new C0418n(EnumC0417m.f436d, e2.toString());
        }
    }

    /* JADX INFO: renamed from: a */
    private void m358a(String str, Map map) {
        if (str == null) {
            this.f410k = "";
            return;
        }
        this.f410k = str;
        StringTokenizer stringTokenizer = new StringTokenizer(str, "&");
        while (stringTokenizer.hasMoreTokens()) {
            String strNextToken = stringTokenizer.nextToken();
            int iIndexOf = strNextToken.indexOf(61);
            if (iIndexOf >= 0) {
                map.put(AbstractC0405a.m331b(strNextToken.substring(0, iIndexOf)).trim(), AbstractC0405a.m331b(strNextToken.substring(iIndexOf + 1)));
            } else {
                map.put(AbstractC0405a.m331b(strNextToken).trim(), "");
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private static int m359b(byte[] bArr, int i) {
        for (int i2 = 0; i2 + 1 < i; i2++) {
            if (bArr[i2] == 13 && bArr[i2 + 1] == 10 && i2 + 3 < i && bArr[i2 + 2] == 13 && bArr[i2 + 3] == 10) {
                return i2 + 4;
            }
            if (bArr[i2] == 10 && bArr[i2 + 1] == 10) {
                return i2 + 2;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: f */
    private RandomAccessFile m360f() {
        try {
            return new RandomAccessFile(this.f400a.m388b().m386b(), "rw");
        } catch (Exception e) {
            throw new Error(e);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m361a() {
        try {
            try {
                try {
                    try {
                        byte[] bArr = new byte[8192];
                        this.f403d = 0;
                        this.f404e = 0;
                        this.f402c.mark(8192);
                        try {
                            int i = this.f402c.read(bArr, 0, 8192);
                            if (i == -1) {
                                AbstractC0405a.m332b(this.f402c);
                                AbstractC0405a.m332b(this.f401b);
                                throw new SocketException("NanoHttpd Shutdown");
                            }
                            while (i > 0) {
                                this.f404e = i + this.f404e;
                                this.f403d = m359b(bArr, this.f404e);
                                if (this.f403d > 0) {
                                    break;
                                } else {
                                    i = this.f402c.read(bArr, this.f404e, 8192 - this.f404e);
                                }
                            }
                            if (this.f403d < this.f404e) {
                                this.f402c.reset();
                                this.f402c.skip(this.f403d);
                            }
                            this.f407h = new HashMap();
                            if (this.f408i == null) {
                                this.f408i = new HashMap();
                            } else {
                                this.f408i.clear();
                            }
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArr, 0, this.f404e)));
                            HashMap map = new HashMap();
                            m356a(bufferedReader, map, this.f407h, this.f408i);
                            if (this.f411l != null) {
                                this.f408i.put("remote-addr", this.f411l);
                                this.f408i.put("http-client-ip", this.f411l);
                            }
                            this.f406g = EnumC0413i.m367a((String) map.get("method"));
                            if (this.f406g == null) {
                                throw new C0418n(EnumC0417m.f434b, "BAD REQUEST: Syntax error.");
                            }
                            this.f405f = (String) map.get("uri");
                            this.f409j = new C0409e(this.f413n, this.f408i);
                            String str = (String) this.f408i.get("connection");
                            boolean z = this.f412m.equals("HTTP/1.1") && (str == null || !str.matches("(?i).*close.*"));
                            C0414j c0414jMo341a = this.f413n.mo341a((InterfaceC0412h) this);
                            if (c0414jMo341a == null) {
                                throw new C0418n(EnumC0417m.f436d, "SERVER INTERNAL ERROR: Serve() returned a null response.");
                            }
                            String str2 = (String) this.f408i.get("accept-encoding");
                            this.f409j.m351a(c0414jMo341a);
                            c0414jMo341a.m374a(this.f406g);
                            c0414jMo341a.m377a(AbstractC0405a.m329a(c0414jMo341a) && str2 != null && str2.contains("gzip"));
                            c0414jMo341a.m378b(z);
                            c0414jMo341a.m375a(this.f401b);
                            if (!z || "close".equalsIgnoreCase(c0414jMo341a.m373a("connection"))) {
                                throw new SocketException("NanoHttpd Shutdown");
                            }
                            AbstractC0405a.m332b(c0414jMo341a);
                            this.f400a.m387a();
                        } catch (Exception e) {
                            AbstractC0405a.m332b(this.f402c);
                            AbstractC0405a.m332b(this.f401b);
                            throw new SocketException("NanoHttpd Shutdown");
                        }
                    } catch (SocketTimeoutException e2) {
                        throw e2;
                    }
                } catch (SocketException e3) {
                    throw e3;
                }
            } catch (C0418n e4) {
                AbstractC0405a.m326a(e4.m381a(), "text/plain", e4.getMessage()).m375a(this.f401b);
                AbstractC0405a.m332b(this.f401b);
                AbstractC0405a.m332b((Object) null);
                this.f400a.m387a();
            } catch (IOException e5) {
                AbstractC0405a.m326a(EnumC0417m.f436d, "text/plain", "SERVER INTERNAL ERROR: IOException: " + e5.getMessage()).m375a(this.f401b);
                AbstractC0405a.m332b(this.f401b);
                AbstractC0405a.m332b((Object) null);
                this.f400a.m387a();
            }
        } catch (Throwable th) {
            AbstractC0405a.m332b((Object) null);
            this.f400a.m387a();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p019b.p020a.p021a.InterfaceC0412h
    /* JADX INFO: renamed from: a */
    public final void mo362a(Map map) throws Throwable {
        Object obj;
        DataOutput dataOutputM360f;
        ByteArrayOutputStream byteArrayOutputStream;
        RandomAccessFile randomAccessFile;
        ByteBuffer map2;
        StringTokenizer stringTokenizer = null;
        try {
            long j = this.f408i.containsKey("content-length") ? Long.parseLong((String) this.f408i.get("content-length")) : this.f403d < this.f404e ? this.f404e - this.f403d : 0L;
            if (j < PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) {
                byteArrayOutputStream = new ByteArrayOutputStream();
                dataOutputM360f = new DataOutputStream(byteArrayOutputStream);
                randomAccessFile = 0;
            } else {
                dataOutputM360f = m360f();
                byteArrayOutputStream = null;
                randomAccessFile = dataOutputM360f;
            }
            try {
                byte[] bArr = new byte[512];
                while (this.f404e >= 0 && j > 0) {
                    this.f404e = this.f402c.read(bArr, 0, (int) Math.min(j, 512L));
                    j -= (long) this.f404e;
                    if (this.f404e > 0) {
                        dataOutputM360f.write(bArr, 0, this.f404e);
                    }
                }
                if (byteArrayOutputStream != null) {
                    map2 = ByteBuffer.wrap(byteArrayOutputStream.toByteArray(), 0, byteArrayOutputStream.size());
                } else {
                    map2 = randomAccessFile.getChannel().map(FileChannel.MapMode.READ_ONLY, 0L, randomAccessFile.length());
                    randomAccessFile.seek(0L);
                }
                if (EnumC0413i.POST.equals(this.f406g)) {
                    String strNextToken = "";
                    String str = (String) this.f408i.get("content-type");
                    if (str != null) {
                        stringTokenizer = new StringTokenizer(str, ",; ");
                        if (stringTokenizer.hasMoreTokens()) {
                            strNextToken = stringTokenizer.nextToken();
                        }
                    }
                    if (!"multipart/form-data".equalsIgnoreCase(strNextToken)) {
                        byte[] bArr2 = new byte[map2.remaining()];
                        map2.get(bArr2);
                        String strTrim = new String(bArr2).trim();
                        if ("application/x-www-form-urlencoded".equalsIgnoreCase(strNextToken)) {
                            m358a(strTrim, this.f407h);
                        } else if (strTrim.length() != 0) {
                            map.put("postData", strTrim);
                        }
                    } else {
                        if (!stringTokenizer.hasMoreTokens()) {
                            throw new C0418n(EnumC0417m.f434b, "BAD REQUEST: Content type is multipart/form-data but boundary missing. Usage: GET /example/file.html");
                        }
                        m357a(m354a(str, AbstractC0405a.f378c, null), m354a(str, AbstractC0405a.f377b, "US-ASCII"), map2, this.f407h, map);
                    }
                } else if (EnumC0413i.PUT.equals(this.f406g)) {
                    map.put(gzd.COLUMN_CONTENT, m355a(map2, 0, map2.limit(), (String) null));
                }
                AbstractC0405a.m332b(randomAccessFile);
            } catch (Throwable th) {
                th = th;
                obj = randomAccessFile;
                AbstractC0405a.m332b(obj);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            obj = null;
        }
    }

    @Override // p019b.p020a.p021a.InterfaceC0412h
    /* JADX INFO: renamed from: b */
    public final EnumC0413i mo363b() {
        return this.f406g;
    }

    @Override // p019b.p020a.p021a.InterfaceC0412h
    /* JADX INFO: renamed from: c */
    public final Map mo364c() {
        return this.f407h;
    }

    @Override // p019b.p020a.p021a.InterfaceC0412h
    /* JADX INFO: renamed from: d */
    public final String mo365d() {
        return this.f410k;
    }

    @Override // p019b.p020a.p021a.InterfaceC0412h
    /* JADX INFO: renamed from: e */
    public final String mo366e() {
        return this.f405f;
    }
}
