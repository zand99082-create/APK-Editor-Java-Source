package ru.maximoff.apkeditor.translate;

import com.gmail.heagoo.neweditor.Token;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Random;

/* JADX INFO: renamed from: ru.maximoff.apkeditor.translate.b */
/* JADX INFO: loaded from: classes.dex */
public class C1961b {

    /* JADX INFO: renamed from: a */
    public static final String f5325a = "0123456789ABCDEF";

    /* JADX INFO: renamed from: a */
    public static int m4367a(int i, int i2) {
        return new Random().nextInt((i2 - i) + 1) + i;
    }

    /* JADX INFO: renamed from: a */
    public static String m4368a(String str) {
        if (str == null) {
            return (String) null;
        }
        byte[] bytes = str.getBytes(Charset.defaultCharset());
        StringBuilder sb = new StringBuilder(bytes.length);
        for (byte b2 : bytes) {
            if (b2 < 97 ? b2 < 65 ? b2 < 48 ? b2 == 45 || b2 == 46 : b2 <= 57 : b2 <= 90 || b2 == 95 : b2 <= 122 || b2 == 126) {
                sb.append((char) b2);
            } else {
                sb.append('%').append(f5325a.charAt((b2 >> 4) & 15)).append(f5325a.charAt(b2 & Token.LITERAL3));
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public static String m4369a(List list, String str) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= list.size()) {
                return sb.toString();
            }
            if (i2 > 0) {
                sb.append(str);
            }
            sb.append((String) list.get(i2));
            i = i2 + 1;
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m4370a(String[] strArr, String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strArr.length; i++) {
            if (i > 0) {
                sb.append(str);
            }
            sb.append(strArr[i]);
        }
        return sb.toString();
    }
}
