package com.gmail.heagoo.apkeditor.util;

import jadx.core.codegen.CodeWriter;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.util.ab */
/* JADX INFO: loaded from: classes.dex */
public final class C1460ab {

    /* JADX INFO: renamed from: a */
    private int f4338a;

    /* JADX INFO: renamed from: a */
    private static void m3574a(BufferedWriter bufferedWriter, int i, String str, String str2) {
        bufferedWriter.write("\n");
        for (int i2 = 0; i2 < i; i2++) {
            bufferedWriter.write(CodeWriter.INDENT);
        }
        bufferedWriter.write("<span class=\"attribute-name\">" + str + "</span>=<a class=\"attribute-value\">" + str2 + "</a>");
    }

    /* JADX INFO: renamed from: a */
    private static void m3575a(BufferedWriter bufferedWriter, int i, String str, boolean z) {
        if (z) {
            for (int i2 = 0; i2 < i; i2++) {
                bufferedWriter.write(CodeWriter.INDENT);
            }
        }
        bufferedWriter.write("&lt;/<span class=\"end-tag\">" + str + "</span>&gt;");
    }

    /* JADX INFO: renamed from: a */
    private static void m3576a(BufferedWriter bufferedWriter, String str) {
        bufferedWriter.write(str.replaceAll("<", "&lt;").replace(">", "&gt;"));
    }

    /* JADX INFO: renamed from: a */
    private void m3577a(BufferedWriter bufferedWriter, String str, boolean z) {
        int i;
        boolean z2;
        int iIndexOf = str.indexOf(60);
        if (iIndexOf > 0) {
            m3576a(bufferedWriter, str.substring(0, iIndexOf));
        } else if (iIndexOf == -1) {
            m3576a(bufferedWriter, str);
            return;
        }
        if (str.charAt(iIndexOf + 1) == '/') {
            this.f4338a--;
            int iIndexOf2 = str.indexOf(62, iIndexOf + 2);
            if (iIndexOf2 == -1) {
                m3575a(bufferedWriter, this.f4338a, str.substring(iIndexOf + 2), z);
                return;
            }
            m3575a(bufferedWriter, this.f4338a, str.substring(iIndexOf + 2, iIndexOf2), z);
            if (iIndexOf2 + 1 < str.length()) {
                m3577a(bufferedWriter, str.substring(iIndexOf2 + 1), false);
                return;
            }
            return;
        }
        int iIndexOf3 = str.indexOf(62, iIndexOf + 2);
        if (iIndexOf3 == -1) {
            m3576a(bufferedWriter, str);
            return;
        }
        if (str.charAt(iIndexOf3 - 1) == '/') {
            i = iIndexOf3 - 1;
            z2 = true;
        } else {
            i = iIndexOf3;
            z2 = false;
        }
        String[] strArrSplit = str.substring(iIndexOf + 1, i).split(" ");
        String str2 = strArrSplit[0];
        int i2 = this.f4338a;
        if (z) {
            for (int i3 = 0; i3 < i2; i3++) {
                bufferedWriter.write(CodeWriter.INDENT);
            }
        }
        bufferedWriter.write("&lt;<span class=\"start-tag\">" + str2 + "</span>");
        for (int i4 = 1; i4 < strArrSplit.length; i4++) {
            int iIndexOf4 = strArrSplit[i4].indexOf("=");
            if (iIndexOf4 != -1) {
                m3574a(bufferedWriter, this.f4338a + 1, strArrSplit[i4].substring(0, iIndexOf4), strArrSplit[i4].substring(iIndexOf4 + 1));
            } else {
                m3576a(bufferedWriter, strArrSplit[i4]);
            }
        }
        if (z2) {
            m3576a(bufferedWriter, "/>");
        } else {
            this.f4338a++;
            m3576a(bufferedWriter, ">");
        }
        if (iIndexOf3 + 1 < str.length()) {
            m3577a(bufferedWriter, str.substring(iIndexOf3 + 1), false);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m3578a(List list, String str) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File(str)));
        bufferedWriter.write("<html><head>");
        bufferedWriter.write("<title>1.xml</title>");
        bufferedWriter.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"viewsource.css\">");
        bufferedWriter.write("</head>");
        bufferedWriter.write("<body id=\"viewsource\" class=\"wrap\" style=\"-moz-tab-size: 4\">");
        bufferedWriter.write("<pre id=\"line1\">");
        String str2 = (String) list.get(0);
        if (str2 != null) {
            bufferedWriter.write(str2.replaceAll("<", "&lt;").replace(">", "&gt;"));
        }
        int i = 2;
        for (int i2 = 1; i2 < list.size(); i2++) {
            String strTrim = ((String) list.get(i2)).trim();
            bufferedWriter.write("\n<span id=\"line" + i + "\"></span>");
            m3577a(bufferedWriter, strTrim, true);
            i++;
        }
        bufferedWriter.close();
    }
}
