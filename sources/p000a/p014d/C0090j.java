package p000a.p014d;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: a.d.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0090j {

    /* JADX INFO: renamed from: a */
    private Object[] f255a = new Object[4];

    /* JADX INFO: renamed from: b */
    private int f256b = 0;

    /* JADX INFO: renamed from: c */
    private int f257c;

    /* JADX INFO: renamed from: a */
    private static String m231a(ArrayList arrayList, String str) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            if (((String) pair.second).equals(str)) {
                return (String) pair.first;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final String m232a(int i, String str) {
        String strM231a = null;
        if (this.f256b != 1) {
            if (i >= this.f255a.length) {
                i = this.f255a.length - 1;
            }
            String strM231a2 = null;
            while (i >= 0) {
                if (this.f255a[i] != null && (strM231a2 = m231a((ArrayList) this.f255a[i], str)) != null) {
                    return strM231a2;
                }
                i--;
            }
            return strM231a2;
        }
        ArrayList arrayList = (ArrayList) this.f255a[this.f257c];
        if (arrayList != null) {
            if (arrayList.size() == 1) {
                Pair pair = (Pair) arrayList.get(0);
                int length = ((String) pair.second).length();
                int length2 = str.length();
                if (length == length2 && ((String) pair.second).charAt(length - 1) == str.charAt(length2 - 1)) {
                    return (String) pair.first;
                }
                return null;
            }
            strM231a = m231a(arrayList, str);
        }
        return strM231a;
    }

    /* JADX INFO: renamed from: a */
    public final void m233a(int i) {
        if (this.f255a.length <= i || this.f255a[i] == null) {
            return;
        }
        this.f255a[i] = null;
    }

    /* JADX INFO: renamed from: a */
    public final void m234a(int i, String str, String str2) {
        this.f257c = i;
        if (i >= this.f255a.length) {
            Object[] objArr = new Object[i + 1];
            for (int i2 = 0; i2 < this.f255a.length; i2++) {
                objArr[i2] = this.f255a[i2];
            }
            this.f255a = objArr;
        }
        if (this.f255a[i] != null) {
            ((ArrayList) this.f255a[i]).add(Pair.create(str, str2));
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(Pair.create(str, str2));
        this.f255a[i] = arrayList;
        this.f256b++;
    }
}
