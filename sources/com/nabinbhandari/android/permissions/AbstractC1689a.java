package com.nabinbhandari.android.permissions;

import android.content.Context;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.nabinbhandari.android.permissions.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1689a {
    /* JADX INFO: renamed from: a */
    public abstract void mo4056a();

    /* JADX INFO: renamed from: a */
    public void m4057a(Context context, ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        if (C1690b.f5034a) {
            StringBuilder sb = new StringBuilder();
            sb.append("Just set not to ask again:");
            for (String str : arrayList) {
                sb.append(" ");
                sb.append(str);
            }
            C1690b.m4061a(sb.toString());
        }
        mo4059b(context, arrayList2);
    }

    /* JADX INFO: renamed from: a */
    public boolean m4058a(Context context, ArrayList<String> arrayList) {
        if (!C1690b.f5034a) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Set not to ask again:");
        for (String str : arrayList) {
            sb.append(" ");
            sb.append(str);
        }
        C1690b.m4061a(sb.toString());
        return false;
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo4059b(Context context, ArrayList<String> arrayList);
}
