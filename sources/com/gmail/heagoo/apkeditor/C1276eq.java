package com.gmail.heagoo.apkeditor;

import android.content.Context;
import com.gmail.heagoo.apkeditor.pro.R;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.eq */
/* JADX INFO: loaded from: classes.dex */
final class C1276eq {

    /* JADX INFO: renamed from: a */
    public String f3703a;

    /* JADX INFO: renamed from: b */
    public int f3704b;

    /* JADX INFO: renamed from: c */
    public int f3705c;

    /* JADX INFO: renamed from: d */
    public int f3706d;

    public C1276eq(String str, int i, int i2, int i3) {
        this.f3703a = str;
        this.f3704b = i;
        this.f3705c = i2;
        this.f3706d = i3;
    }

    /* JADX INFO: renamed from: a */
    public final String m3242a(Context context, int i) {
        if (this.f3704b < 0 && this.f3705c < 0 && this.f3706d < 0) {
            return context.getString(R.string.str_modified);
        }
        if (this.f3704b == 0 && this.f3705c == 0 && this.f3706d == 0) {
            return context.getString(R.string.str_not_modified);
        }
        int i2 = this.f3704b > 0 ? 0 : -1;
        if (i2 == i) {
            return String.format(context.getString(R.string.str_num_added_file), Integer.valueOf(this.f3704b));
        }
        if (this.f3705c > 0) {
            i2++;
        }
        if (i2 == i) {
            return String.format(context.getString(R.string.str_num_removed_file), Integer.valueOf(this.f3705c));
        }
        if (this.f3706d > 0) {
            i2++;
        }
        if (i2 == i) {
            return String.format(context.getString(R.string.str_num_modified_file), Integer.valueOf(this.f3706d));
        }
        return null;
    }
}
