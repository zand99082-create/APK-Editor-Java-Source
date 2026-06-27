package com.gmail.heagoo.apkeditor.p092ac;

import android.widget.Filter;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.ac.c */
/* JADX INFO: loaded from: classes.dex */
final class C1121c extends Filter {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ C1119a f3326a;

    private C1121c(C1119a c1119a) {
        this.f3326a = c1119a;
    }

    /* synthetic */ C1121c(C1119a c1119a, byte b2) {
        this(c1119a);
    }

    @Override // android.widget.Filter
    protected final Filter.FilterResults performFiltering(CharSequence charSequence) {
        int i = 0;
        if (charSequence == null) {
            ArrayList arrayList = new ArrayList(this.f3326a.f3323d.length);
            String[] strArr = this.f3326a.f3323d;
            int length = strArr.length;
            while (i < length) {
                arrayList.add(strArr[i]);
                i++;
            }
            Filter.FilterResults filterResults = new Filter.FilterResults();
            filterResults.values = arrayList;
            filterResults.count = arrayList.size();
            return filterResults;
        }
        String lowerCase = charSequence.toString().toLowerCase();
        Filter.FilterResults filterResults2 = new Filter.FilterResults();
        int length2 = this.f3326a.f3323d.length;
        ArrayList arrayList2 = new ArrayList(length2);
        while (i < length2) {
            String str = this.f3326a.f3323d[i];
            if (str.toLowerCase().contains(lowerCase)) {
                arrayList2.add(str);
            }
            i++;
        }
        filterResults2.values = arrayList2;
        filterResults2.count = arrayList2.size();
        return filterResults2;
    }

    @Override // android.widget.Filter
    protected final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        this.f3326a.f3320a = (ArrayList) filterResults.values;
        this.f3326a.notifyDataSetChanged();
    }
}
