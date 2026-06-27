package p019b.p020a.p021a;

import android.support.v7.appcompat.C0327R;

/* JADX WARN: $VALUES field not found */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: b.a.a.m */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0417m implements InterfaceC0416l {

    /* JADX INFO: renamed from: u */
    private final int f453u;

    /* JADX INFO: renamed from: v */
    private final String f454v;

    /* JADX INFO: renamed from: e */
    private static EnumC0417m f437e = new EnumC0417m("SWITCH_PROTOCOL", 0, C0327R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle, "Switching Protocols");

    /* JADX INFO: renamed from: a */
    public static final EnumC0417m f433a = new EnumC0417m("OK", 1, 200, "OK");

    /* JADX INFO: renamed from: f */
    private static EnumC0417m f438f = new EnumC0417m("CREATED", 2, 201, "Created");

    /* JADX INFO: renamed from: g */
    private static EnumC0417m f439g = new EnumC0417m("ACCEPTED", 3, 202, "Accepted");

    /* JADX INFO: renamed from: h */
    private static EnumC0417m f440h = new EnumC0417m("NO_CONTENT", 4, 204, "No Content");

    /* JADX INFO: renamed from: i */
    private static EnumC0417m f441i = new EnumC0417m("PARTIAL_CONTENT", 5, 206, "Partial Content");

    /* JADX INFO: renamed from: j */
    private static EnumC0417m f442j = new EnumC0417m("REDIRECT", 6, 301, "Moved Permanently");

    /* JADX INFO: renamed from: k */
    private static EnumC0417m f443k = new EnumC0417m("NOT_MODIFIED", 7, 304, "Not Modified");

    /* JADX INFO: renamed from: b */
    public static final EnumC0417m f434b = new EnumC0417m("BAD_REQUEST", 8, 400, "Bad Request");

    /* JADX INFO: renamed from: l */
    private static EnumC0417m f444l = new EnumC0417m("UNAUTHORIZED", 9, 401, "Unauthorized");

    /* JADX INFO: renamed from: m */
    private static EnumC0417m f445m = new EnumC0417m("FORBIDDEN", 10, 403, "Forbidden");

    /* JADX INFO: renamed from: c */
    public static final EnumC0417m f435c = new EnumC0417m("NOT_FOUND", 11, 404, "Not Found");

    /* JADX INFO: renamed from: n */
    private static EnumC0417m f446n = new EnumC0417m("METHOD_NOT_ALLOWED", 12, 405, "Method Not Allowed");

    /* JADX INFO: renamed from: o */
    private static EnumC0417m f447o = new EnumC0417m("NOT_ACCEPTABLE", 13, 406, "Not Acceptable");

    /* JADX INFO: renamed from: p */
    private static EnumC0417m f448p = new EnumC0417m("REQUEST_TIMEOUT", 14, 408, "Request Timeout");

    /* JADX INFO: renamed from: q */
    private static EnumC0417m f449q = new EnumC0417m("CONFLICT", 15, 409, "Conflict");

    /* JADX INFO: renamed from: r */
    private static EnumC0417m f450r = new EnumC0417m("RANGE_NOT_SATISFIABLE", 16, 416, "Requested Range Not Satisfiable");

    /* JADX INFO: renamed from: d */
    public static final EnumC0417m f436d = new EnumC0417m("INTERNAL_ERROR", 17, 500, "Internal Server Error");

    /* JADX INFO: renamed from: s */
    private static EnumC0417m f451s = new EnumC0417m("NOT_IMPLEMENTED", 18, 501, "Not Implemented");

    /* JADX INFO: renamed from: t */
    private static EnumC0417m f452t = new EnumC0417m("UNSUPPORTED_HTTP_VERSION", 19, 505, "HTTP Version Not Supported");

    static {
        EnumC0417m[] enumC0417mArr = {f437e, f433a, f438f, f439g, f440h, f441i, f442j, f443k, f434b, f444l, f445m, f435c, f446n, f447o, f448p, f449q, f450r, f436d, f451s, f452t};
    }

    private EnumC0417m(String str, int i, int i2, String str2) {
        this.f453u = i2;
        this.f454v = str2;
    }

    @Override // p019b.p020a.p021a.InterfaceC0416l
    /* JADX INFO: renamed from: a */
    public final String mo380a() {
        return this.f453u + " " + this.f454v;
    }
}
