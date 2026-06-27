package android.support.p015a.p016a;

import android.annotation.TargetApi;
import android.os.Bundle;
import android.support.p015a.p016a.C0120n;

/* JADX INFO: renamed from: android.support.a.a.o */
/* JADX INFO: loaded from: classes2.dex */
@TargetApi(16)
class C0121o {
    /* JADX INFO: renamed from: a */
    static Bundle m290a(C0120n.a aVar) {
        Bundle bundle = new Bundle();
        bundle.putString("resultKey", aVar.mo284a());
        bundle.putCharSequence("label", aVar.mo285b());
        bundle.putCharSequenceArray("choices", aVar.mo286c());
        bundle.putBoolean("allowFreeFormInput", aVar.mo287d());
        bundle.putBundle("extras", aVar.mo288e());
        return bundle;
    }

    /* JADX INFO: renamed from: a */
    static Bundle[] m291a(C0120n.a[] aVarArr) {
        if (aVarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[aVarArr.length];
        for (int i = 0; i < aVarArr.length; i++) {
            bundleArr[i] = m290a(aVarArr[i]);
        }
        return bundleArr;
    }
}
