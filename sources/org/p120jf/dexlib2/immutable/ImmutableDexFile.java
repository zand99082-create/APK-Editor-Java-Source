package org.p120jf.dexlib2.immutable;

import com.google.common.collect.ImmutableSet;
import java.util.Collection;
import org.p120jf.dexlib2.Opcodes;
import org.p120jf.dexlib2.iface.ClassDef;
import org.p120jf.dexlib2.iface.DexFile;

/* JADX INFO: loaded from: classes.dex */
public class ImmutableDexFile implements DexFile {
    public final ImmutableSet<? extends ImmutableClassDef> classes;
    public final Opcodes opcodes;

    public ImmutableDexFile(Opcodes opcodes, Collection<? extends ClassDef> collection) {
        this.classes = ImmutableClassDef.immutableSetOf(collection);
        this.opcodes = opcodes;
    }

    @Override // org.p120jf.dexlib2.iface.DexFile
    public ImmutableSet<? extends ImmutableClassDef> getClasses() {
        return this.classes;
    }

    @Override // org.p120jf.dexlib2.iface.DexFile
    public Opcodes getOpcodes() {
        return this.opcodes;
    }
}
