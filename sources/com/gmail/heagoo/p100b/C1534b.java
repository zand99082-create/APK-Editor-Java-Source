package com.gmail.heagoo.p100b;

import java.util.Comparator;

/* JADX INFO: renamed from: com.gmail.heagoo.b.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1534b implements Comparator {
    /* JADX INFO: renamed from: a */
    private static int m3729a(String str, String str2) {
        while (!str.isEmpty()) {
            if (str2.isEmpty()) {
                return 1;
            }
            char cCharAt = str.charAt(0);
            char cCharAt2 = str2.charAt(0);
            if (cCharAt != cCharAt2) {
                if (!m3730a(cCharAt) || !m3730a(cCharAt2)) {
                    return cCharAt < cCharAt2 ? -1 : 1;
                }
                char lowerCase = Character.toLowerCase(cCharAt);
                char lowerCase2 = Character.toLowerCase(cCharAt2);
                return lowerCase == lowerCase2 ? cCharAt < cCharAt2 ? -1 : 1 : lowerCase < lowerCase2 ? -1 : 1;
            }
            str = str.substring(1);
            str2 = str2.substring(1);
        }
        return str2.isEmpty() ? 0 : -1;
    }

    /* JADX INFO: renamed from: a */
    private static boolean m3730a(char c) {
        return ('A' <= c && c <= 'Z') || ('a' <= c && c <= 'z');
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C1533a c1533a = (C1533a) obj;
        C1533a c1533a2 = (C1533a) obj2;
        if (c1533a.f4595b) {
            if (c1533a2.f4595b) {
                return m3729a(c1533a.f4594a, c1533a2.f4594a);
            }
            return -1;
        }
        if (c1533a2.f4595b) {
            return 1;
        }
        return m3729a(c1533a.f4594a, c1533a2.f4594a);
    }
}
