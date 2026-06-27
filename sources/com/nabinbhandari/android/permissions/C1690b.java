package com.nabinbhandari.android.permissions;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: com.nabinbhandari.android.permissions.b */
/* JADX INFO: loaded from: classes.dex */
public class C1690b {

    /* JADX INFO: renamed from: a */
    static boolean f5034a = true;

    /* JADX INFO: renamed from: com.nabinbhandari.android.permissions.b$a */
    public static class a implements Serializable {

        /* JADX INFO: renamed from: a */
        String f5035a = "Settings";

        /* JADX INFO: renamed from: b */
        String f5036b = "Permissions Required";

        /* JADX INFO: renamed from: c */
        String f5037c = "Permissions Required";

        /* JADX INFO: renamed from: d */
        String f5038d = "Required permission(s) have been set not to ask again! Please provide them from settings.";

        /* JADX INFO: renamed from: e */
        boolean f5039e = true;

        /* JADX INFO: renamed from: f */
        boolean f5040f = false;

        /* JADX INFO: renamed from: a */
        public a m4062a(String str) {
            this.f5036b = str;
            return this;
        }

        /* JADX INFO: renamed from: b */
        public a m4063b(String str) {
            this.f5037c = str;
            return this;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m4060a(Context context, String[] strArr, String str, a aVar, AbstractC1689a abstractC1689a) {
        if (Build.VERSION.SDK_INT < 23) {
            abstractC1689a.mo4056a();
            m4061a("Android version < 23");
            return;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Collections.addAll(linkedHashSet, strArr);
        boolean z = true;
        Iterator it = linkedHashSet.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (context.checkSelfPermission((String) it.next()) != 0) {
                z = false;
                break;
            }
        }
        if (z) {
            abstractC1689a.mo4056a();
            StringBuilder sb = new StringBuilder();
            sb.append("Permission(s) ");
            sb.append(PermissionsActivity.f5024e == null ? "already granted." : "just granted from settings.");
            m4061a(sb.toString());
            PermissionsActivity.f5024e = null;
            return;
        }
        PermissionsActivity.f5024e = abstractC1689a;
        Intent intentPutExtra = new Intent(context, (Class<?>) PermissionsActivity.class).putExtra("permissions", new ArrayList(linkedHashSet)).putExtra("rationale", str).putExtra("options", aVar);
        if (aVar != null && aVar.f5040f) {
            intentPutExtra.addFlags(268435456);
        }
        context.startActivity(intentPutExtra);
    }

    /* JADX INFO: renamed from: a */
    static void m4061a(String str) {
        if (f5034a) {
            Log.d("Permissions", str);
        }
    }
}
