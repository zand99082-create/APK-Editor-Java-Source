package android.support.p015a.p016a;

import android.annotation.TargetApi;
import android.app.RemoteInput;
import android.support.p015a.p016a.C0120n;

/* JADX INFO: renamed from: android.support.a.a.m */
/* JADX INFO: loaded from: classes2.dex */
@TargetApi(20)
class C0119m {
    /* JADX INFO: renamed from: a */
    static RemoteInput[] m289a(C0120n.a[] aVarArr) {
        if (aVarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[aVarArr.length];
        for (int i = 0; i < aVarArr.length; i++) {
            C0120n.a aVar = aVarArr[i];
            remoteInputArr[i] = new RemoteInput.Builder(aVar.mo284a()).setLabel(aVar.mo285b()).setChoices(aVar.mo286c()).setAllowFreeFormInput(aVar.mo287d()).addExtras(aVar.mo288e()).build();
        }
        return remoteInputArr;
    }
}
