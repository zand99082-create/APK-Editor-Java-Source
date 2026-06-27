package com.gmail.heagoo.apkeditor.util;

import jadx.core.codegen.CodeWriter;
import jadx.core.deobf.Deobfuscator;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.util.z */
/* JADX INFO: loaded from: classes.dex */
public final class C1485z {

    /* JADX INFO: renamed from: a */
    private BufferedReader f4413a;

    /* JADX INFO: renamed from: b */
    private BufferedWriter f4414b;

    /* JADX INFO: renamed from: c */
    private List f4415c = new ArrayList();

    /* JADX INFO: renamed from: d */
    private boolean f4416d = false;

    public C1485z(String str) {
        try {
            this.f4413a = new BufferedReader(new FileReader(str));
            String line = this.f4413a.readLine();
            while (line != null) {
                this.f4415c.add(line);
                line = this.f4413a.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: b */
    private String m3642b(String str) {
        int iIndexOf;
        int i = 0;
        if (str.startsWith("\"")) {
            if (str.endsWith("\"")) {
                return "<font color=\"blue\">" + m3643c(str) + "</font>";
            }
            this.f4416d = true;
            return "<font color=\"blue\">" + m3643c(str);
        }
        if (str.endsWith("\"")) {
            this.f4416d = false;
            return m3643c(str) + "</font>";
        }
        if (this.f4416d) {
            return m3643c(str);
        }
        if (str.startsWith("L") && (iIndexOf = str.indexOf(59)) != -1) {
            return "L<font color=\"red\">" + str.substring(1, iIndexOf) + "</font>;" + str.substring(iIndexOf + 1);
        }
        StringBuilder sb = new StringBuilder();
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '>') {
                sb.append("&gt;");
            } else if (cCharAt == '<') {
                sb.append("&lt;");
            } else if ((cCharAt == 'v' || cCharAt == 'p') && i + 1 < str.length() && Character.isDigit(str.charAt(i + 1))) {
                sb.append("<font color=\"red\">");
                sb.append(cCharAt);
                sb.append(str.charAt(i + 1));
                i++;
                if (i + 1 < str.length() && Character.isDigit(str.charAt(i + 1))) {
                    sb.append(str.charAt(i + 1));
                    i++;
                }
                sb.append("</font>");
            } else {
                sb.append(cCharAt);
            }
            i++;
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: c */
    private static String m3643c(String str) {
        return str.replaceAll("<", "&lt;").replace(">", "&gt;");
    }

    /* JADX INFO: renamed from: a */
    public final void m3644a(String str) throws IOException {
        int i;
        this.f4414b = new BufferedWriter(new FileWriter(str));
        this.f4414b.write("<html>");
        this.f4414b.write("<head>");
        this.f4414b.write("<title>1.xml</title>");
        this.f4414b.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"viewsource.css\">");
        this.f4414b.write("</head>");
        this.f4414b.write("<body id=\"viewsource\" class=\"wrap\" style=\"-moz-tab-size: 4\">");
        this.f4414b.write("<pre id=\"line1\">" + ((String) this.f4415c.get(0)) + "\n");
        for (int i2 = 1; i2 < this.f4415c.size(); i2++) {
            String str2 = (String) this.f4415c.get(i2);
            if (str2.trim().isEmpty()) {
                this.f4414b.write("<span id=\"line" + (i2 + 1) + "\"></span>\n");
            } else {
                this.f4414b.write("<span id=\"line" + (i2 + 1) + "\">");
                String[] strArrSplit = str2.split("\\s+");
                if (strArrSplit[0].equals("")) {
                    this.f4414b.write(CodeWriter.INDENT);
                    i = 1;
                } else {
                    i = 0;
                }
                String str3 = strArrSplit[i];
                this.f4414b.write("<font color=\"" + (str3.startsWith(Deobfuscator.CLASS_NAME_SEPARATOR) ? "#FF3399" : str3.startsWith(":") ? "brown" : "green") + "\">");
                this.f4414b.write(strArrSplit[i]);
                this.f4414b.write("</font>");
                while (true) {
                    i++;
                    if (i >= strArrSplit.length) {
                        break;
                    }
                    this.f4414b.write(" ");
                    this.f4414b.write(m3642b(strArrSplit[i]));
                }
                this.f4414b.write("</span>\n");
            }
        }
        this.f4414b.write("</body>");
        this.f4414b.write("</html>");
        this.f4414b.close();
    }
}
