package org.p120jf.dexlib2.writer;

import org.p120jf.dexlib2.iface.reference.CallSiteReference;

/* JADX INFO: loaded from: classes.dex */
public interface CallSiteSection<CallSiteKey extends CallSiteReference, EncodedArrayKey> extends IndexSection<CallSiteKey> {
    EncodedArrayKey getEncodedCallSite(CallSiteKey callsitekey);
}
