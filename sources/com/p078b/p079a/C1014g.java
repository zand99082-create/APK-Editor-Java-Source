package com.p078b.p079a;

import android.annotation.SuppressLint;
import android.content.Context;
import com.gmail.heagoo.p084a.p089c.C1067a;
import java.util.List;

/* JADX INFO: renamed from: com.b.a.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1014g {

    /* JADX INFO: renamed from: a */
    public String f2631a;

    /* JADX INFO: renamed from: b */
    public String f2632b;

    /* JADX INFO: renamed from: c */
    public int f2633c;

    /* JADX INFO: renamed from: d */
    public boolean f2634d;

    public C1014g(String str, String str2) {
        this.f2631a = str;
        this.f2632b = str2;
        if (str2.startsWith("#")) {
            try {
                this.f2633c = (int) Long.parseLong(str2.substring(1), 16);
                this.f2634d = true;
            } catch (Exception e) {
            }
        }
    }

    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: a */
    public final void m2308a(Context context, List list) {
        if (this.f2634d) {
            return;
        }
        if (!this.f2632b.startsWith("@color/")) {
            if (this.f2632b.startsWith("@android:color/")) {
                try {
                    Object objM2530e = C1067a.m2530e("android.R$color", this.f2632b.substring(15));
                    if (objM2530e != null) {
                        this.f2633c = context.getColor(((Integer) objM2530e).intValue());
                        this.f2634d = true;
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    return;
                }
            }
            return;
        }
        String strSubstring = this.f2632b.substring(7);
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= list.size()) {
                return;
            }
            C1014g c1014g = (C1014g) list.get(i2);
            if (c1014g.f2634d && strSubstring.equals(c1014g.f2631a)) {
                this.f2633c = c1014g.f2633c;
                this.f2634d = true;
                return;
            }
            i = i2 + 1;
        }
    }

    public final String toString() {
        return "    <color name=\"" + this.f2631a + "\">" + this.f2632b + "</color>";
    }
}
