package p019b.p022fn.p023a.p025b.p026a.p032g;

import com.github.megatronking.stringfog.xor.StringFogImpl;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: b.fn.a.b.a.g.a */
/* JADX INFO: loaded from: classes.dex */
public class C0446a {

    /* JADX INFO: renamed from: a */
    private final ByteBuffer f524a;

    /* JADX INFO: renamed from: b */
    private e f525b;

    /* JADX INFO: renamed from: c */
    private d f526c;

    /* JADX INFO: renamed from: d */
    private int f527d;

    /* JADX INFO: renamed from: e */
    private int f528e = 1;

    /* JADX INFO: renamed from: f */
    private String f529f;

    /* JADX INFO: renamed from: g */
    private String f530g;

    /* JADX INFO: renamed from: h */
    private int f531h;

    /* JADX INFO: renamed from: i */
    private List<b> f532i;

    /* JADX INFO: renamed from: j */
    private ByteBuffer f533j;

    /* JADX INFO: renamed from: k */
    private int f534k;

    /* JADX INFO: renamed from: b.fn.a.b.a.g.a$b */
    private static class b {

        /* JADX INFO: renamed from: a */
        private final long f535a;

        /* JADX INFO: renamed from: b */
        private final long f536b;

        /* JADX INFO: renamed from: c */
        private final int f537c;

        /* JADX INFO: renamed from: d */
        private final int f538d;

        /* JADX INFO: renamed from: e */
        private final e f539e;

        private b(long j, long j2, int i, int i2, e eVar, d dVar) {
            this.f535a = j;
            this.f536b = j2;
            this.f537c = i;
            this.f538d = i2;
            this.f539e = eVar;
        }

        /* JADX INFO: renamed from: a */
        public String m471a() {
            return this.f539e.m480a(this.f536b);
        }

        /* JADX INFO: renamed from: b */
        public String m472b() {
            long j = this.f535a;
            return j != 4294967295L ? this.f539e.m480a(j) : "";
        }

        /* JADX INFO: renamed from: c */
        public String m473c() throws f {
            int i = this.f537c;
            if (i == 1) {
                return "@" + Integer.toHexString(this.f538d);
            }
            if (i == 3) {
                return this.f539e.m480a(((long) this.f538d) & 4294967295L);
            }
            if (i == 4) {
                return Float.toString(Float.intBitsToFloat(this.f538d));
            }
            switch (i) {
                case 16:
                    return Integer.toString(this.f538d);
                case 17:
                    return "0x" + Integer.toHexString(this.f538d);
                case 18:
                    return Boolean.toString(this.f538d != 0);
                default:
                    throw new f("Cannot coerce to string: value type " + this.f537c);
            }
        }
    }

    /* JADX INFO: renamed from: b.fn.a.b.a.g.a$c */
    private static class c {

        /* JADX INFO: renamed from: a */
        private final int f540a;

        /* JADX INFO: renamed from: b */
        private final ByteBuffer f541b;

        /* JADX INFO: renamed from: c */
        private final ByteBuffer f542c;

        public c(int i, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
            this.f540a = i;
            this.f541b = byteBuffer;
            this.f542c = byteBuffer2;
        }

        /* JADX INFO: renamed from: a */
        public static c m474a(ByteBuffer byteBuffer) throws f {
            if (byteBuffer.remaining() >= 8) {
                int iPosition = byteBuffer.position();
                int iM457d = C0446a.m457d(byteBuffer);
                int iM457d2 = C0446a.m457d(byteBuffer);
                long jM459e = C0446a.m459e(byteBuffer);
                if (jM459e - 8 <= byteBuffer.remaining()) {
                    if (iM457d2 < 8) {
                        throw new f("Malformed chunk: header too short: " + iM457d2 + " bytes");
                    }
                    if (iM457d2 <= jM459e) {
                        int i = iM457d2 + iPosition;
                        long j = ((long) iPosition) + jM459e;
                        c cVar = new c(iM457d, C0446a.m454b(byteBuffer, iPosition, i), C0446a.m455b(byteBuffer, i, j));
                        byteBuffer.position((int) j);
                        return cVar;
                    }
                    throw new f("Malformed chunk: header too long: " + iM457d2 + " bytes. Chunk size: " + jM459e + " bytes");
                }
            }
            byteBuffer.position(byteBuffer.limit());
            return null;
        }

        /* JADX INFO: renamed from: a */
        public ByteBuffer m475a() {
            ByteBuffer byteBufferSlice = this.f542c.slice();
            byteBufferSlice.order(this.f542c.order());
            return byteBufferSlice;
        }

        /* JADX INFO: renamed from: b */
        public ByteBuffer m476b() {
            ByteBuffer byteBufferSlice = this.f541b.slice();
            byteBufferSlice.order(this.f541b.order());
            return byteBufferSlice;
        }

        /* JADX INFO: renamed from: c */
        public int m477c() {
            return this.f540a;
        }
    }

    /* JADX INFO: renamed from: b.fn.a.b.a.g.a$d */
    private static class d {

        /* JADX INFO: renamed from: a */
        private final ByteBuffer f543a;

        public d(c cVar) {
            ByteBuffer byteBufferSlice = cVar.m475a().slice();
            this.f543a = byteBufferSlice;
            byteBufferSlice.order(cVar.m475a().order());
            int iRemaining = this.f543a.remaining() / 4;
        }
    }

    /* JADX INFO: renamed from: b.fn.a.b.a.g.a$e */
    private static class e {

        /* JADX INFO: renamed from: a */
        private final ByteBuffer f544a;

        /* JADX INFO: renamed from: b */
        private final ByteBuffer f545b;

        /* JADX INFO: renamed from: c */
        private final int f546c;

        /* JADX INFO: renamed from: d */
        private final boolean f547d;

        /* JADX INFO: renamed from: e */
        private final Map<Integer, String> f548e = new HashMap();

        public e(c cVar) throws f {
            long j;
            int iRemaining;
            ByteBuffer byteBufferM476b = cVar.m476b();
            int iRemaining2 = byteBufferM476b.remaining();
            byteBufferM476b.position(8);
            if (byteBufferM476b.remaining() < 20) {
                throw new f("XML chunk's header too short. Required at least 20 bytes. Available: " + byteBufferM476b.remaining() + " bytes");
            }
            long jM459e = C0446a.m459e(byteBufferM476b);
            if (jM459e > 2147483647L) {
                throw new f("Too many strings: " + jM459e);
            }
            this.f546c = (int) jM459e;
            long jM459e2 = C0446a.m459e(byteBufferM476b);
            if (jM459e2 > 2147483647L) {
                throw new f("Too many styles: " + jM459e2);
            }
            long jM459e3 = C0446a.m459e(byteBufferM476b);
            long jM459e4 = C0446a.m459e(byteBufferM476b);
            long jM459e5 = C0446a.m459e(byteBufferM476b);
            ByteBuffer byteBufferM475a = cVar.m475a();
            if (this.f546c > 0) {
                long j2 = iRemaining2;
                j = jM459e3;
                int i = (int) (jM459e4 - j2);
                if (jM459e2 <= 0) {
                    iRemaining = byteBufferM475a.remaining();
                } else {
                    if (jM459e5 < jM459e4) {
                        throw new f("Styles offset (" + jM459e5 + ") < strings offset (" + jM459e4 + ")");
                    }
                    iRemaining = (int) (jM459e5 - j2);
                }
                this.f545b = C0446a.m454b(byteBufferM475a, i, iRemaining);
            } else {
                j = jM459e3;
                this.f545b = ByteBuffer.allocate(0);
            }
            this.f547d = (j & 256) != 0;
            this.f544a = byteBufferM475a;
        }

        /* JADX INFO: renamed from: a */
        private static String m478a(ByteBuffer byteBuffer) throws f {
            byte[] bArrArray;
            int iArrayOffset;
            int iM457d = C0446a.m457d(byteBuffer);
            if ((32768 & iM457d) != 0) {
                iM457d = ((iM457d & 32767) << 16) | C0446a.m457d(byteBuffer);
            }
            if (iM457d > 1073741823) {
                throw new f("String too long: " + iM457d + " uint16s");
            }
            int i = iM457d * 2;
            if (byteBuffer.hasArray()) {
                bArrArray = byteBuffer.array();
                iArrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
                byteBuffer.position(byteBuffer.position() + i);
            } else {
                bArrArray = new byte[i];
                iArrayOffset = 0;
                byteBuffer.get(bArrArray);
            }
            int i2 = iArrayOffset + i;
            if (bArrArray[i2] != 0 || bArrArray[i2 + 1] != 0) {
                throw new f("UTF-16 encoded form of string not NULL terminated");
            }
            try {
                return new String(bArrArray, iArrayOffset, i, "UTF-16LE");
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException("UTF-16LE character encoding not supported", e);
            }
        }

        /* JADX INFO: renamed from: b */
        private static String m479b(ByteBuffer byteBuffer) throws f {
            byte[] bArrArray;
            int iArrayOffset;
            if ((C0446a.m460f(byteBuffer) & 128) != 0) {
                C0446a.m460f(byteBuffer);
            }
            int iM460f = C0446a.m460f(byteBuffer);
            if ((iM460f & 128) != 0) {
                iM460f = ((iM460f & 127) << 8) | C0446a.m460f(byteBuffer);
            }
            if (byteBuffer.hasArray()) {
                bArrArray = byteBuffer.array();
                iArrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
                byteBuffer.position(byteBuffer.position() + iM460f);
            } else {
                bArrArray = new byte[iM460f];
                iArrayOffset = 0;
                byteBuffer.get(bArrArray);
            }
            if (bArrArray[iArrayOffset + iM460f] != 0) {
                throw new f("UTF-8 encoded form of string not NULL terminated");
            }
            try {
                return new String(bArrArray, iArrayOffset, iM460f, StringFogImpl.CHARSET_NAME_UTF_8);
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException("UTF-8 character encoding not supported", e);
            }
        }

        /* JADX INFO: renamed from: a */
        public String m480a(long j) throws f {
            if (j < 0) {
                throw new f("Unsuported string index: " + j);
            }
            if (j >= this.f546c) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unsuported string index: ");
                sb.append(j);
                sb.append(", max: ");
                sb.append(this.f546c - 1);
                throw new f(sb.toString());
            }
            int i = (int) j;
            String str = this.f548e.get(Integer.valueOf(i));
            if (str != null) {
                return str;
            }
            long jM453b = C0446a.m453b(this.f544a, i * 4);
            if (jM453b < this.f545b.capacity()) {
                this.f545b.position((int) jM453b);
                String strM479b = this.f547d ? m479b(this.f545b) : m478a(this.f545b);
                this.f548e.put(Integer.valueOf(i), strM479b);
                return strM479b;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Offset of string idx ");
            sb2.append(i);
            sb2.append(" out of bounds: ");
            sb2.append(jM453b);
            sb2.append(", max: ");
            sb2.append(this.f545b.capacity() - 1);
            throw new f(sb2.toString());
        }
    }

    /* JADX INFO: renamed from: b.fn.a.b.a.g.a$f */
    public static class f extends Exception {
        public f(String str) {
            super(str);
        }
    }

    public C0446a(ByteBuffer byteBuffer) throws f {
        c cVarM474a;
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        while (byteBuffer.hasRemaining() && (cVarM474a = c.m474a(byteBuffer)) != null) {
            if (cVarM474a.m477c() == 3) {
                break;
            }
        }
        cVarM474a = null;
        if (cVarM474a == null) {
            throw new f("No XML chunk in file");
        }
        this.f524a = cVarM474a.m475a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static long m453b(ByteBuffer byteBuffer, int i) {
        return ((long) byteBuffer.getInt(i)) & 4294967295L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static ByteBuffer m454b(ByteBuffer byteBuffer, int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("start: " + i);
        }
        if (i2 < i) {
            throw new IllegalArgumentException("end < start: " + i2 + " < " + i);
        }
        int iCapacity = byteBuffer.capacity();
        if (i2 > byteBuffer.capacity()) {
            throw new IllegalArgumentException("end > capacity: " + i2 + " > " + iCapacity);
        }
        int iLimit = byteBuffer.limit();
        int iPosition = byteBuffer.position();
        try {
            byteBuffer.position(0);
            byteBuffer.limit(i2);
            byteBuffer.position(i);
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            byteBufferSlice.order(byteBuffer.order());
            return byteBufferSlice;
        } finally {
            byteBuffer.position(0);
            byteBuffer.limit(iLimit);
            byteBuffer.position(iPosition);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static ByteBuffer m455b(ByteBuffer byteBuffer, long j, long j2) {
        if (j < 0) {
            throw new IllegalArgumentException("start: " + j);
        }
        if (j2 < j) {
            throw new IllegalArgumentException("end < start: " + j2 + " < " + j);
        }
        int iCapacity = byteBuffer.capacity();
        if (j2 <= byteBuffer.capacity()) {
            return m454b(byteBuffer, (int) j, (int) j2);
        }
        throw new IllegalArgumentException("end > capacity: " + j2 + " > " + iCapacity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static int m457d(ByteBuffer byteBuffer) {
        return byteBuffer.getShort() & 65535;
    }

    /* JADX INFO: renamed from: d */
    private b m458d(int i) {
        if (this.f528e != 3) {
            throw new IndexOutOfBoundsException("Current event not a START_ELEMENT");
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException("index must be >= 0");
        }
        if (i < this.f531h) {
            m461g();
            return this.f532i.get(i);
        }
        throw new IndexOutOfBoundsException("index must be <= attr count (" + this.f531h + ")");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static long m459e(ByteBuffer byteBuffer) {
        return ((long) byteBuffer.getInt()) & 4294967295L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static int m460f(ByteBuffer byteBuffer) {
        return byteBuffer.get() & 255;
    }

    /* JADX INFO: renamed from: g */
    private void m461g() {
        if (this.f532i != null) {
            return;
        }
        this.f532i = new ArrayList(this.f531h);
        for (int i = 0; i < this.f531h; i++) {
            int i2 = this.f534k;
            int i3 = i * i2;
            ByteBuffer byteBufferM454b = m454b(this.f533j, i3, i2 + i3);
            long jM459e = m459e(byteBufferM454b);
            long jM459e2 = m459e(byteBufferM454b);
            byteBufferM454b.position(byteBufferM454b.position() + 7);
            this.f532i.add(new b(jM459e, jM459e2, m460f(byteBufferM454b), (int) m459e(byteBufferM454b), this.f525b, this.f526c));
        }
    }

    /* JADX INFO: renamed from: a */
    public int m462a() {
        if (this.f528e != 3) {
            return -1;
        }
        return this.f531h;
    }

    /* JADX INFO: renamed from: a */
    public String m463a(int i) {
        return m458d(i).m471a();
    }

    /* JADX INFO: renamed from: b */
    public int m464b() {
        return this.f527d;
    }

    /* JADX INFO: renamed from: b */
    public String m465b(int i) {
        return m458d(i).m472b();
    }

    /* JADX INFO: renamed from: c */
    public int m466c() {
        return this.f528e;
    }

    /* JADX INFO: renamed from: c */
    public String m467c(int i) {
        return m458d(i).m473c();
    }

    /* JADX INFO: renamed from: d */
    public String m468d() {
        int i = this.f528e;
        if (i == 3 || i == 4) {
            return this.f529f;
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public String m469e() {
        int i = this.f528e;
        if (i == 3 || i == 4) {
            return this.f530g;
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public int m470f() throws f {
        int i;
        c cVarM474a;
        if (this.f528e == 4) {
            this.f527d--;
        }
        while (this.f524a.hasRemaining() && (cVarM474a = c.m474a(this.f524a)) != null) {
            int iM477c = cVarM474a.m477c();
            if (iM477c != 1) {
                if (iM477c != 384) {
                    if (iM477c == 258) {
                        if (this.f525b == null) {
                            throw new f("Named element encountered before string pool");
                        }
                        ByteBuffer byteBufferM475a = cVarM474a.m475a();
                        if (byteBufferM475a.remaining() < 20) {
                            throw new f("Start element chunk too short. Need at least 20 bytes. Available: " + byteBufferM475a.remaining() + " bytes");
                        }
                        long jM459e = m459e(byteBufferM475a);
                        long jM459e2 = m459e(byteBufferM475a);
                        int iM457d = m457d(byteBufferM475a);
                        int iM457d2 = m457d(byteBufferM475a);
                        int iM457d3 = m457d(byteBufferM475a);
                        long j = iM457d;
                        long j2 = (((long) iM457d3) * ((long) iM457d2)) + j;
                        byteBufferM475a.position(0);
                        if (iM457d > byteBufferM475a.remaining()) {
                            throw new f("Attributes start offset out of bounds: " + iM457d + ", max: " + byteBufferM475a.remaining());
                        }
                        if (j2 > byteBufferM475a.remaining()) {
                            throw new f("Attributes end offset out of bounds: " + j2 + ", max: " + byteBufferM475a.remaining());
                        }
                        this.f529f = this.f525b.m480a(jM459e2);
                        this.f530g = jM459e != 4294967295L ? this.f525b.m480a(jM459e) : "";
                        this.f531h = iM457d3;
                        this.f532i = null;
                        this.f534k = iM457d2;
                        this.f533j = m455b(byteBufferM475a, j, j2);
                        this.f527d++;
                        i = 3;
                        this.f528e = i;
                        return i;
                    }
                    if (iM477c == 259) {
                        if (this.f525b == null) {
                            throw new f("Named element encountered before string pool");
                        }
                        ByteBuffer byteBufferM475a2 = cVarM474a.m475a();
                        if (byteBufferM475a2.remaining() < 8) {
                            throw new f("End element chunk too short. Need at least 8 bytes. Available: " + byteBufferM475a2.remaining() + " bytes");
                        }
                        long jM459e3 = m459e(byteBufferM475a2);
                        this.f529f = this.f525b.m480a(m459e(byteBufferM475a2));
                        this.f530g = jM459e3 != 4294967295L ? this.f525b.m480a(jM459e3) : "";
                        this.f528e = 4;
                        this.f532i = null;
                        this.f533j = null;
                        return 4;
                    }
                } else {
                    if (this.f526c != null) {
                        throw new f("Multiple resource maps not supported");
                    }
                    this.f526c = new d(cVarM474a);
                }
            } else {
                if (this.f525b != null) {
                    throw new f("Multiple string pools not supported");
                }
                this.f525b = new e(cVarM474a);
            }
        }
        i = 2;
        this.f528e = i;
        return i;
    }
}
