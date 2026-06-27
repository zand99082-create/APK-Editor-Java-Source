package org.p120jf.dexlib2.immutable.debug;

import com.google.common.collect.ImmutableList;
import org.p120jf.dexlib2.iface.debug.DebugItem;
import org.p120jf.dexlib2.iface.debug.EndLocal;
import org.p120jf.dexlib2.iface.debug.EpilogueBegin;
import org.p120jf.dexlib2.iface.debug.LineNumber;
import org.p120jf.dexlib2.iface.debug.PrologueEnd;
import org.p120jf.dexlib2.iface.debug.RestartLocal;
import org.p120jf.dexlib2.iface.debug.SetSourceFile;
import org.p120jf.dexlib2.iface.debug.StartLocal;
import org.p120jf.util.ExceptionWithContext;
import org.p120jf.util.ImmutableConverter;

/* JADX INFO: loaded from: classes.dex */
public abstract class ImmutableDebugItem implements DebugItem {
    public static final ImmutableConverter<ImmutableDebugItem, DebugItem> CONVERTER = new ImmutableConverter<ImmutableDebugItem, DebugItem>() { // from class: org.jf.dexlib2.immutable.debug.ImmutableDebugItem.1
        @Override // org.p120jf.util.ImmutableConverter
        public boolean isImmutable(DebugItem debugItem) {
            return debugItem instanceof ImmutableDebugItem;
        }

        @Override // org.p120jf.util.ImmutableConverter
        public ImmutableDebugItem makeImmutable(DebugItem debugItem) {
            return ImmutableDebugItem.m4242of(debugItem);
        }
    };
    public final int codeAddress;

    public ImmutableDebugItem(int i) {
        this.codeAddress = i;
    }

    public static ImmutableList<ImmutableDebugItem> immutableListOf(Iterable<? extends DebugItem> iterable) {
        return CONVERTER.toList(iterable);
    }

    /* JADX INFO: renamed from: of */
    public static ImmutableDebugItem m4242of(DebugItem debugItem) {
        if (debugItem instanceof ImmutableDebugItem) {
            return (ImmutableDebugItem) debugItem;
        }
        switch (debugItem.getDebugItemType()) {
            case 3:
                return ImmutableStartLocal.m4249of((StartLocal) debugItem);
            case 4:
            default:
                throw new ExceptionWithContext("Invalid debug item type: %d", Integer.valueOf(debugItem.getDebugItemType()));
            case 5:
                return ImmutableEndLocal.m4243of((EndLocal) debugItem);
            case 6:
                return ImmutableRestartLocal.m4247of((RestartLocal) debugItem);
            case 7:
                return ImmutablePrologueEnd.m4246of((PrologueEnd) debugItem);
            case 8:
                return ImmutableEpilogueBegin.m4244of((EpilogueBegin) debugItem);
            case 9:
                return ImmutableSetSourceFile.m4248of((SetSourceFile) debugItem);
            case 10:
                return ImmutableLineNumber.m4245of((LineNumber) debugItem);
        }
    }

    @Override // org.p120jf.dexlib2.iface.debug.DebugItem
    public int getCodeAddress() {
        return this.codeAddress;
    }
}
