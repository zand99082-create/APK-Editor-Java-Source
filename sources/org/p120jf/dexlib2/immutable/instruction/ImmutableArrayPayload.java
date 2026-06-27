package org.p120jf.dexlib2.immutable.instruction;

import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;
import org.p120jf.dexlib2.Format;
import org.p120jf.dexlib2.Opcode;
import org.p120jf.dexlib2.iface.instruction.formats.ArrayPayload;
import org.p120jf.dexlib2.util.Preconditions;

/* JADX INFO: loaded from: classes.dex */
public class ImmutableArrayPayload extends ImmutableInstruction implements ArrayPayload {
    public static final Opcode OPCODE = Opcode.ARRAY_PAYLOAD;
    public final ImmutableList<Number> arrayElements;
    public final int elementWidth;

    public ImmutableArrayPayload(int i, List<Number> list) {
        super(OPCODE);
        this.elementWidth = Preconditions.checkArrayPayloadElementWidth(i);
        this.arrayElements = (ImmutableList) Preconditions.checkArrayPayloadElements(i, list == null ? ImmutableList.m4040of() : ImmutableList.copyOf((Collection) list));
    }

    /* JADX INFO: renamed from: of */
    public static ImmutableArrayPayload m4250of(ArrayPayload arrayPayload) {
        return arrayPayload instanceof ImmutableArrayPayload ? (ImmutableArrayPayload) arrayPayload : new ImmutableArrayPayload(arrayPayload.getElementWidth(), arrayPayload.getArrayElements());
    }

    @Override // org.p120jf.dexlib2.iface.instruction.formats.ArrayPayload
    public List<Number> getArrayElements() {
        return this.arrayElements;
    }

    @Override // org.p120jf.dexlib2.immutable.instruction.ImmutableInstruction, org.p120jf.dexlib2.iface.instruction.Instruction
    public int getCodeUnits() {
        return (((this.elementWidth * this.arrayElements.size()) + 1) / 2) + 4;
    }

    @Override // org.p120jf.dexlib2.iface.instruction.formats.ArrayPayload
    public int getElementWidth() {
        return this.elementWidth;
    }

    @Override // org.p120jf.dexlib2.immutable.instruction.ImmutableInstruction
    public Format getFormat() {
        return OPCODE.format;
    }
}
