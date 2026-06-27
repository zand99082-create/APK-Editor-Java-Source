package org.p120jf.dexlib2.iface.instruction;

import org.p120jf.dexlib2.iface.reference.Reference;

/* JADX INFO: loaded from: classes.dex */
public interface ReferenceInstruction extends Instruction {
    Reference getReference();

    int getReferenceType();
}
