package com.gmail.heagoo.httpserver;

import com.gmail.heagoo.apkeditor.gzd;
import com.gmail.heagoo.common.C1574w;
import com.gmail.heagoo.p084a.p089c.C1067a;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p019b.p020a.p021a.AbstractC0405a;
import p019b.p020a.p021a.C0414j;
import p019b.p020a.p021a.EnumC0417m;
import p019b.p020a.p021a.InterfaceC0412h;

/* JADX INFO: renamed from: com.gmail.heagoo.httpserver.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1576b extends AbstractC0405a {

    /* JADX INFO: renamed from: b */
    private static final String[] f4672b = {"/listFiles", "/readFile", "/readImage", "/saveFile"};

    /* JADX INFO: renamed from: c */
    private String f4673c;

    /* JADX INFO: renamed from: d */
    private String f4674d;

    /* JADX INFO: renamed from: e */
    private String f4675e;

    public C1576b(String str, String str2) {
        super(8000);
        this.f4675e = null;
        this.f4673c = str;
        this.f4674d = str2;
    }

    /* JADX INFO: renamed from: a */
    private C0414j m3803a(Map map) throws Throwable {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        String str = (String) map.get("path");
        String str2 = (String) map.get(gzd.COLUMN_CONTENT);
        if (str != null && str2 != null) {
            File file = new File(this.f4674d + "/" + str);
            if (file.isFile() && file.exists()) {
                try {
                    fileOutputStream = new FileOutputStream(file);
                    try {
                        fileOutputStream.write(str2.getBytes());
                        fileOutputStream.close();
                        C0414j c0414jA = m326a(EnumC0417m.f433a, "text/html", "OK");
                        C1067a.m2474a(fileOutputStream);
                        return c0414jA;
                    } catch (IOException e) {
                        e = e;
                        fileOutputStream2 = fileOutputStream;
                        try {
                            e.printStackTrace();
                            C1067a.m2474a(fileOutputStream2);
                            return m3810l();
                        } catch (Throwable th) {
                            th = th;
                            fileOutputStream = fileOutputStream2;
                            C1067a.m2474a(fileOutputStream);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        C1067a.m2474a(fileOutputStream);
                        throw th;
                    }
                } catch (IOException e2) {
                    e = e2;
                    fileOutputStream2 = null;
                } catch (Throwable th3) {
                    th = th3;
                    fileOutputStream = null;
                }
            }
        }
        return m3810l();
    }

    /* JADX INFO: renamed from: b */
    private C0414j m3804b(Map map) {
        String str = (String) map.get("path");
        File file = new File(this.f4674d + "/" + str);
        if (!file.exists() || !file.isFile()) {
            return m3810l();
        }
        try {
            return m325a(EnumC0417m.f433a, m3807c(str), new FileInputStream(file), r2.available());
        } catch (IOException e) {
            return m3810l();
        }
    }

    /* JADX INFO: renamed from: c */
    private C0414j m3806c(Map map) {
        String str = (String) map.get("path");
        File file = new File(this.f4674d + "/" + str);
        if (!file.exists() || !file.isFile()) {
            return m3810l();
        }
        String str2 = str.endsWith(".xml") ? "xml" : str.endsWith(".java") ? "java" : str.endsWith(".kt") ? "kotlin" : str.endsWith(".css") ? "css" : str.endsWith(".js") ? "javascript" : (str.endsWith(".htm") || str.endsWith(".html")) ? "html" : (str.endsWith(".txt") || str.endsWith(".md") || str.endsWith(".project") || str.endsWith(".gradle") || str.endsWith(".smali")) ? "text" : (str.endsWith(".c") || str.endsWith(".cpp")) ? "c_cpp" : str.endsWith(".py") ? "python" : null;
        if (str2 == null) {
            if (str.endsWith(".png") || str.endsWith(".jpg") || str.endsWith(".jpeg") || str.endsWith(".gif") || str.endsWith(".bmp")) {
                return m326a(EnumC0417m.f433a, "text/html", "<html>\n<head>\n<style type=\"text/css\">\nimg {\n    position: absolute;\n    margin: auto;\n    top: 0;\n    left: 0;\n    right: 0;\n    bottom: 0;\n}\n</style>\n</head>\n<body>\n<img src=\"readImage?path=" + str + "\">\n</body>\n</html>");
            }
            return m326a(EnumC0417m.f433a, "text/html", "<html>\n<head>\n<style type=\"text/css\">\n#tip {\n    position: absolute;\n    margin: auto;\n    top: 50%;\n    width: 100%;\n    height: 100px;\n    margin-top: -50px;\n}\n</style>\n</head>\n<body>\n<div id=\"tip\"><center>Cannot open " + str + "</center></div>\n</body>\n</html>");
        }
        if (this.f4675e == null) {
            try {
                this.f4675e = new C1574w(this.f4673c + "/editor.htm").m3799b();
            } catch (IOException e) {
                this.f4675e = "<html lang=\"en\">\n<head>\n  <meta charset=\"UTF-8\">\n  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\n  <title>Editor</title>\n  <style type=\"text/css\" media=\"screen\">\n    body {\n        overflow: hidden;\n    }\n    #editor {\n        margin: 0;\n        position: absolute;\n        top: 0;\n        bottom: 0;\n        left: 0;\n        right: 0;\n    }\n  </style>\n</head>\n<body>\n<pre id=\"editor\">__CONTENT__</pre>\n<script src=\"src-min-noconflict/ace.js\" type=\"text/javascript\" charset=\"utf-8\"></script>\n<script>\n    var editor = ace.edit(\"editor\");\n    editor.setTheme(\"ace/theme/dreamweaver\");\n    editor.session.setMode(\"ace/mode/__MODE__\");\n</script>\n</body>\n</html>";
            }
        }
        try {
            return m326a(EnumC0417m.f433a, "text/html", this.f4675e.replace("__MODE__", str2).replace("__PATH__", str).replace("__CONTENT__", new C1574w(file.getPath()).m3799b().replace("<", "&lt;")));
        } catch (IOException e2) {
            return m3810l();
        }
    }

    /* JADX INFO: renamed from: c */
    private static String m3807c(String str) {
        return (str.endsWith(".jpg") || str.endsWith(".jpeg")) ? "image/jpeg" : str.endsWith(".png") ? "image/png" : str.endsWith(".gif") ? "image/gif" : str.endsWith(".bmp") ? "image/bmp" : (str.endsWith(".htm") || str.endsWith(".html")) ? "text/html" : str.endsWith(".css") ? "text/css" : str.endsWith(".js") ? "text/javascript" : "text/plain";
    }

    /* JADX INFO: renamed from: d */
    private C0414j m3808d(Map map) {
        String str = (String) map.get("node");
        String str2 = str == null ? "" : str + "/";
        File file = new File(this.f4674d + "/" + str2);
        if (!file.exists() || !file.isDirectory()) {
            return m3810l();
        }
        List listAsList = Arrays.asList(file.listFiles());
        Collections.sort(listAsList, new C1575a());
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= listAsList.size()) {
                sb.append("]");
                return m326a(EnumC0417m.f433a, "application/json", sb.toString());
            }
            File file2 = (File) listAsList.get(i2);
            sb.append("{");
            sb.append("\"name\": \"" + file2.getName() + "\",");
            sb.append("\"id\": \"" + str2 + file2.getName() + "\",");
            if (file2.isDirectory()) {
                sb.append("\"load_on_demand\": true");
            } else {
                sb.append("\"load_on_demand\": false");
            }
            sb.append("}");
            if (i2 != listAsList.size() - 1) {
                sb.append(",");
            }
            i = i2 + 1;
        }
    }

    /* JADX INFO: renamed from: d */
    private static boolean m3809d(String str) {
        String[] strArr = f4672b;
        for (int i = 0; i < 4; i++) {
            if (strArr[i].equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: l */
    private static C0414j m3810l() {
        return m326a(EnumC0417m.f435c, "text/html", "Not Found!");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005d  */
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static InetAddress m3811m() throws UnknownHostException {
        InetAddress inetAddress = null;
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress inetAddressNextElement = inetAddresses.nextElement();
                    if (inetAddressNextElement.isLoopbackAddress()) {
                        inetAddressNextElement = inetAddress;
                    } else {
                        if (inetAddressNextElement.isSiteLocalAddress()) {
                            return inetAddressNextElement;
                        }
                        if (inetAddress == null) {
                        }
                    }
                    inetAddress = inetAddressNextElement;
                }
            }
            if (inetAddress != null) {
                return inetAddress;
            }
            InetAddress localHost = InetAddress.getLocalHost();
            if (localHost == null) {
                throw new UnknownHostException("The JDK InetAddress.getLocalHost() method unexpectedly returned null.");
            }
            return localHost;
        } catch (Exception e) {
            UnknownHostException unknownHostException = new UnknownHostException("Failed to determine LAN address: " + e);
            unknownHostException.initCause(e);
            throw unknownHostException;
        }
    }

    @Override // p019b.p020a.p021a.AbstractC0405a
    /* JADX INFO: renamed from: a */
    public final C0414j mo341a(InterfaceC0412h interfaceC0412h) {
        String strMo366e = interfaceC0412h.mo366e();
        try {
            interfaceC0412h.mo362a(new HashMap());
        } catch (Exception e) {
        }
        Map mapMo364c = interfaceC0412h.mo364c();
        try {
            if (m3809d(strMo366e)) {
                switch (strMo366e) {
                    case "/listFiles":
                        return m3808d(mapMo364c);
                    case "/readFile":
                        return m3806c(mapMo364c);
                    case "/readImage":
                        return m3804b(mapMo364c);
                    case "/saveFile":
                        return m3803a(mapMo364c);
                }
            }
            String str = "/".equals(strMo366e) ? this.f4673c + "/index.htm" : this.f4673c + strMo366e;
            if (str == null) {
                return super.mo341a(interfaceC0412h);
            }
            File file = new File(str);
            if (file.exists()) {
                new StringBuilder("file path = ").append(file.getAbsolutePath());
                return m325a(EnumC0417m.f433a, m3807c(str), new FileInputStream(file), r2.available());
            }
            new StringBuilder("Cannot find").append(file.getAbsolutePath());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return m3810l();
    }

    /* JADX INFO: renamed from: a */
    public final String m3812a() {
        String[] strArr = {""};
        C1577c c1577c = new C1577c(this, strArr);
        try {
            synchronized (c1577c) {
                c1577c.start();
                c1577c.wait();
            }
        } catch (InterruptedException e) {
        }
        return "http://" + strArr[0] + ":" + String.valueOf(m343c());
    }

    /* JADX INFO: renamed from: a */
    public final void m3813a(int i) {
        try {
            Field declaredField = AbstractC0405a.class.getDeclaredField("myPort");
            declaredField.setAccessible(true);
            declaredField.set(this, Integer.valueOf(i + 8000));
        } catch (Exception e) {
            e.printStackTrace();
        }
        m342a(5000, true);
    }

    /* JADX INFO: renamed from: a */
    public final void m3814a(String str) {
        this.f4674d = str;
    }
}
