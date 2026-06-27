package org.p120jf.dexlib2.iface.value;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface ArrayEncodedValue extends EncodedValue {
    List<? extends EncodedValue> getValue();
}
