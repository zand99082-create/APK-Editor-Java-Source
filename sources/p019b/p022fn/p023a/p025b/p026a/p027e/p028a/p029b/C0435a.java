package p019b.p022fn.p023a.p025b.p026a.p027e.p028a.p029b;

import android.app.PendingIntent;
import android.content.Intent;
import com.android.apksig.apk.ApkUtils;
import com.tilks.arsc.main.MergeService;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import p019b.p022fn.p023a.p025b.p026a.C0431b;
import p019b.p022fn.p023a.p025b.p026a.C0432c;
import p019b.p022fn.p023a.p025b.p026a.C0433d;
import p019b.p022fn.p023a.p025b.p026a.EnumC0430a;
import p019b.p022fn.p023a.p025b.p026a.p027e.p028a.InterfaceC0434a;
import p019b.p022fn.p023a.p025b.p026a.p030f.AbstractC0439c;
import p019b.p022fn.p023a.p025b.p026a.p030f.C0437a;
import p019b.p022fn.p023a.p025b.p026a.p030f.C0438b;
import p019b.p022fn.p023a.p025b.p026a.p030f.p031e.C0441a;
import p019b.p022fn.p023a.p025b.p026a.p030f.p031e.C0443c;
import p019b.p022fn.p023a.p025b.p026a.p030f.p031e.C0444d;
import p019b.p022fn.p023a.p025b.p026a.p032g.C0446a;
import p019b.p022fn.p023a.p025b.p033b.C0447a;

/* JADX INFO: renamed from: b.fn.a.b.a.e.a.b.a */
/* JADX INFO: loaded from: classes.dex */
public class C0435a {

    /* JADX INFO: renamed from: a */
    private PendingIntent f506a;

    /* JADX INFO: renamed from: b */
    private MergeService f507b;

    public C0435a(PendingIntent pendingIntent, MergeService mergeService) {
        this.f506a = pendingIntent;
        this.f507b = mergeService;
    }

    /* JADX INFO: renamed from: a */
    private ByteBuffer m425a(InputStream inputStream) throws IOException {
        ZipInputStream zipInputStream = new ZipInputStream(inputStream);
        while (true) {
            try {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry == null) {
                    zipInputStream.close();
                    return null;
                }
                if (nextEntry.getName().equals(ApkUtils.ANDROID_MANIFEST_ZIP_ENTRY_NAME)) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    C0447a.m483a(zipInputStream, byteArrayOutputStream);
                    ByteBuffer byteBufferWrap = ByteBuffer.wrap(byteArrayOutputStream.toByteArray());
                    zipInputStream.close();
                    return byteBufferWrap;
                }
                zipInputStream.closeEntry();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        zipInputStream.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m426a(C0431b c0431b) throws PendingIntent.CanceledException {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%n", new Object[0]));
        C0432c c0432cM412a = c0431b.m412a(EnumC0430a.BASE_APK);
        if (c0432cM412a != null) {
            sb.append(String.format("%s%n", c0432cM412a.m416a()));
            for (C0433d c0433d : c0432cM412a.m417b()) {
                sb.append(String.format("name: %s%n", c0433d.m420c()));
                sb.append(String.format("version: %s%n", c0433d.m418a()));
                sb.append(String.format("Id: %s%n", c0433d.m419b()));
            }
            sb.append(String.format("%n", new Object[0]));
        }
        C0432c c0432cM412a2 = c0431b.m412a(EnumC0430a.FEATURE);
        if (c0432cM412a2 != null) {
            sb.append(String.format("%s%n", c0432cM412a2.m416a()));
            for (C0433d c0433d2 : c0432cM412a2.m417b()) {
                sb.append(String.format("name: %s%n", c0433d2.m420c()));
                sb.append(String.format("Id: %s%n", c0433d2.m419b()));
            }
            sb.append(String.format("%n", new Object[0]));
        }
        C0432c c0432cM412a3 = c0431b.m412a(EnumC0430a.CONFIG_ABI);
        if (c0432cM412a3 != null) {
            sb.append(String.format("%s%n", c0432cM412a3.m416a()));
            for (C0433d c0433d3 : c0432cM412a3.m417b()) {
                sb.append(String.format("name: %s%n", c0433d3.m420c()));
                sb.append(String.format("Id: %s%n", c0433d3.m419b()));
            }
            sb.append(String.format("%n", new Object[0]));
        }
        C0432c c0432cM412a4 = c0431b.m412a(EnumC0430a.CONFIG_DENSITY);
        if (c0432cM412a4 != null) {
            sb.append(String.format("%s%n", c0432cM412a4.m416a()));
            for (C0433d c0433d4 : c0432cM412a4.m417b()) {
                sb.append(String.format("name: %s%n", c0433d4.m420c()));
                sb.append(String.format("Id: %s%n", c0433d4.m419b()));
            }
            sb.append(String.format("%n", new Object[0]));
        }
        C0432c c0432cM412a5 = c0431b.m412a(EnumC0430a.CONFIG_LOCALE);
        if (c0432cM412a5 != null) {
            sb.append(String.format("%s%n", c0432cM412a5.m416a()));
            for (C0433d c0433d5 : c0432cM412a5.m417b()) {
                sb.append(String.format("name: %s%n", c0433d5.m420c()));
                sb.append(String.format("Id: %s%n", c0433d5.m419b()));
            }
            sb.append(String.format("%n", new Object[0]));
        }
        C0432c c0432cM412a6 = c0431b.m412a(EnumC0430a.UNKNOWN);
        if (c0432cM412a6 != null) {
            sb.append(String.format("%s%n", c0432cM412a6.m416a()));
            for (C0433d c0433d6 : c0432cM412a6.m417b()) {
                sb.append(String.format("name: %s%n", c0433d6.m420c()));
                sb.append(String.format("Id: %s%n", c0433d6.m419b()));
            }
            sb.append(String.format("%n", new Object[0]));
        }
        this.f506a.send(this.f507b, 200, new Intent().putExtra("result", sb.toString()));
    }

    /* JADX WARN: Removed duplicated region for block: B:151:0x01fe A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01a8 A[SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private C0431b m427b(InterfaceC0434a interfaceC0434a, boolean z) {
        String str;
        Long lValueOf;
        C0432c c0432cM413a;
        C0433d c0433d;
        StringBuilder sb;
        StringBuilder sb2;
        StringBuilder sb3;
        try {
            C0431b c0431b = new C0431b();
            int i = 1;
            C0431b c0431b2 = null;
            String strM432a = null;
            Long l = null;
            boolean z2 = false;
            boolean z3 = false;
            while (true) {
                InterfaceC0434a.a aVarMo422b = interfaceC0434a.mo422b();
                if (aVarMo422b == null) {
                    if (!z2) {
                        this.f506a.send(this.f507b, 200, new Intent().putExtra("result", String.format("Source doesn't contain any APK files%n", new Object[0])));
                        if (interfaceC0434a == null) {
                            return null;
                        }
                        interfaceC0434a.close();
                        return null;
                    }
                    if (z3) {
                        m426a(c0431b);
                        if (interfaceC0434a != null) {
                            interfaceC0434a.close();
                        }
                        return c0431b;
                    }
                    this.f506a.send(this.f507b, 200, new Intent().putExtra("result", String.format("Source doesn't contain base APK file%n", new Object[0])));
                    if (interfaceC0434a == null) {
                        return null;
                    }
                    interfaceC0434a.close();
                    return null;
                }
                if (aVarMo422b.m424b().toLowerCase().endsWith(".apk")) {
                    HashMap map = new HashMap();
                    ByteBuffer byteBufferM425a = m425a(interfaceC0434a.mo421a());
                    if (byteBufferM425a == null) {
                        this.f506a.send(this.f507b, 200, new Intent().putExtra("result", String.format("AndroidManifest.xml not found in an APK%n", new Object[0])));
                        if (interfaceC0434a != null) {
                            interfaceC0434a.close();
                        }
                        return c0431b2;
                    }
                    C0446a c0446a = new C0446a(byteBufferM425a);
                    int iM466c = c0446a.m466c();
                    boolean z4 = false;
                    while (iM466c != 2) {
                        if (iM466c == 3 && c0446a.m468d().equals("manifest") && c0446a.m464b() == i && c0446a.m469e().isEmpty()) {
                            if (z4) {
                                this.f506a.send(this.f507b, 200, new Intent().putExtra("result", String.format("Found duplicate manifest entry in AndroidManifest.xml%n", new Object[0])));
                                if (interfaceC0434a == null) {
                                    return null;
                                }
                                interfaceC0434a.close();
                                return null;
                            }
                            for (int i2 = 0; i2 < c0446a.m462a(); i2++) {
                                if (!c0446a.m463a(i2).isEmpty()) {
                                    StringBuilder sb4 = new StringBuilder();
                                    sb4.append("");
                                    sb4.append(c0446a.m465b(i2).isEmpty() ? "" : c0446a.m465b(i2) + ":");
                                    map.put(sb4.toString() + c0446a.m463a(i2), c0446a.m467c(i2));
                                }
                            }
                            z4 = true;
                        }
                        iM466c = c0446a.m470f();
                        i = 1;
                    }
                    if (!z4) {
                        this.f506a.send(this.f507b, 200, new Intent().putExtra("result", String.format("Manifest entry was not found in AndroidManifest.xml%n", new Object[0])));
                        if (interfaceC0434a == null) {
                            return null;
                        }
                        interfaceC0434a.close();
                        return null;
                    }
                    AbstractC0439c abstractC0439cM431a = AbstractC0439c.m431a(map);
                    if (z) {
                        str = strM432a;
                        lValueOf = l;
                        if (!(abstractC0439cM431a instanceof C0437a)) {
                            if (abstractC0439cM431a instanceof C0438b) {
                                c0431b.m413a(EnumC0430a.FEATURE, "Dynamic features", null).m415a(new C0433d(abstractC0439cM431a, aVarMo422b.m424b(), aVarMo422b.m423a(), ((C0438b) abstractC0439cM431a).m430d(), null, false, true));
                            } else {
                                if (abstractC0439cM431a instanceof C0441a) {
                                    C0441a c0441a = (C0441a) abstractC0439cM431a;
                                    if (c0441a.m438d()) {
                                        sb3 = new StringBuilder();
                                        sb3.append(c0441a.m437f());
                                        sb3.append(" code for ");
                                        sb3.append(c0441a.m439e());
                                    } else {
                                        sb3 = new StringBuilder();
                                        sb3.append(c0441a.m437f());
                                        sb3.append(" code for base APK");
                                    }
                                    String string = sb3.toString();
                                    c0432cM413a = c0431b.m413a(EnumC0430a.CONFIG_ABI, "Configuration: Architecture", null);
                                    c0433d = new C0433d(abstractC0439cM431a, aVarMo422b.m424b(), aVarMo422b.m423a(), string, null, false, false);
                                } else if (abstractC0439cM431a instanceof C0443c) {
                                    C0443c c0443c = (C0443c) abstractC0439cM431a;
                                    if (c0443c.m438d()) {
                                        sb2 = new StringBuilder();
                                        sb2.append(c0443c.m443f().getDisplayName());
                                        sb2.append(" locale for ");
                                        sb2.append(c0443c.m439e());
                                    } else {
                                        sb2 = new StringBuilder();
                                        sb2.append(c0443c.m443f().getDisplayName());
                                        sb2.append(" locale for base APK");
                                    }
                                    String string2 = sb2.toString();
                                    c0432cM413a = c0431b.m413a(EnumC0430a.CONFIG_LOCALE, "Configuration: Locale", null);
                                    c0433d = new C0433d(abstractC0439cM431a, aVarMo422b.m424b(), aVarMo422b.m423a(), string2, null, false, false);
                                } else if (abstractC0439cM431a instanceof C0444d) {
                                    C0444d c0444d = (C0444d) abstractC0439cM431a;
                                    if (c0444d.m438d()) {
                                        sb = new StringBuilder();
                                        sb.append(c0444d.m447g());
                                        sb.append(" (");
                                        sb.append(c0444d.m446f());
                                        sb.append(" DPI) resources for ");
                                        sb.append(c0444d.m439e());
                                    } else {
                                        sb = new StringBuilder();
                                        sb.append(c0444d.m447g());
                                        sb.append(" (");
                                        sb.append(c0444d.m446f());
                                        sb.append(" DPI) resources for base APK");
                                    }
                                    String string3 = sb.toString();
                                    c0432cM413a = c0431b.m413a(EnumC0430a.CONFIG_DENSITY, "Configuration: DPI Resources", null);
                                    c0433d = new C0433d(abstractC0439cM431a, aVarMo422b.m424b(), aVarMo422b.m423a(), string3, null, false, false);
                                } else {
                                    c0432cM413a = c0431b.m413a(EnumC0430a.UNKNOWN, "Unknown", "Split APK parts with unknown purpose");
                                    c0433d = new C0433d(abstractC0439cM431a, aVarMo422b.m424b(), aVarMo422b.m423a(), abstractC0439cM431a.m433b(), null, false, true);
                                }
                                c0432cM413a.m415a(c0433d);
                            }
                            strM432a = str;
                            l = lValueOf;
                            i = 1;
                            c0431b2 = null;
                            z2 = true;
                        } else {
                            if (z3) {
                                this.f506a.send(this.f507b, 200, new Intent().putExtra("result", String.format("Found multiple base APK files%n", new Object[0])));
                                if (interfaceC0434a == null) {
                                    return null;
                                }
                                interfaceC0434a.close();
                                return null;
                            }
                            C0437a c0437a = (C0437a) abstractC0439cM431a;
                            c0431b.m413a(EnumC0430a.BASE_APK, "Base APK", null).m415a(new C0433d(abstractC0439cM431a, aVarMo422b.m424b(), aVarMo422b.m423a(), c0437a.m432a(), c0437a.m429d(), true, true));
                            strM432a = str;
                            l = lValueOf;
                            i = 1;
                            c0431b2 = null;
                            z2 = true;
                            z3 = true;
                        }
                    } else {
                        if (strM432a == null) {
                            strM432a = abstractC0439cM431a.m432a();
                        } else if (!strM432a.equals(abstractC0439cM431a.m432a())) {
                            this.f506a.send(this.f507b, 200, new Intent().putExtra("result", String.format("Split APK parts have mismatching packages%n", new Object[0])));
                            if (interfaceC0434a == null) {
                                return null;
                            }
                            interfaceC0434a.close();
                            return null;
                        }
                        if (l == null) {
                            lValueOf = Long.valueOf(abstractC0439cM431a.m434c());
                            str = strM432a;
                            if (!(abstractC0439cM431a instanceof C0437a)) {
                            }
                        } else {
                            if (!l.equals(Long.valueOf(abstractC0439cM431a.m434c()))) {
                                this.f506a.send(this.f507b, 200, new Intent().putExtra("result", String.format("Split APK parts have mismatching versions%n", new Object[0])));
                                if (interfaceC0434a == null) {
                                    return null;
                                }
                                interfaceC0434a.close();
                                return null;
                            }
                            str = strM432a;
                            lValueOf = l;
                            if (!(abstractC0439cM431a instanceof C0437a)) {
                            }
                        }
                    }
                }
            }
        } catch (Throwable th) {
            try {
                throw th;
            } finally {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public C0431b m428a(InterfaceC0434a interfaceC0434a, boolean z) {
        try {
            return m427b(interfaceC0434a, z);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
