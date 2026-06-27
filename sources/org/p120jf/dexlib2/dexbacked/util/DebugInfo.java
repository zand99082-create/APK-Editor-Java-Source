package org.p120jf.dexlib2.dexbacked.util;

import com.google.common.collect.ImmutableSet;
import java.util.Arrays;
import java.util.Iterator;
import org.p120jf.dexlib2.AccessFlags;
import org.p120jf.dexlib2.dexbacked.DexBackedDexFile;
import org.p120jf.dexlib2.dexbacked.DexBackedMethod;
import org.p120jf.dexlib2.dexbacked.DexBackedMethodImplementation;
import org.p120jf.dexlib2.dexbacked.DexBuffer;
import org.p120jf.dexlib2.dexbacked.DexReader;
import org.p120jf.dexlib2.iface.debug.DebugItem;
import org.p120jf.dexlib2.iface.debug.EndLocal;
import org.p120jf.dexlib2.iface.debug.LocalInfo;
import org.p120jf.dexlib2.immutable.debug.ImmutableEndLocal;
import org.p120jf.dexlib2.immutable.debug.ImmutableEpilogueBegin;
import org.p120jf.dexlib2.immutable.debug.ImmutableLineNumber;
import org.p120jf.dexlib2.immutable.debug.ImmutablePrologueEnd;
import org.p120jf.dexlib2.immutable.debug.ImmutableRestartLocal;
import org.p120jf.dexlib2.immutable.debug.ImmutableSetSourceFile;
import org.p120jf.dexlib2.immutable.debug.ImmutableStartLocal;

/* JADX INFO: loaded from: classes.dex */
public abstract class DebugInfo implements Iterable<DebugItem> {

    public static class DebugInfoImpl extends DebugInfo {
        public static final LocalInfo EMPTY_LOCAL_INFO = new LocalInfo() { // from class: org.jf.dexlib2.dexbacked.util.DebugInfo.DebugInfoImpl.1
            @Override // org.p120jf.dexlib2.iface.debug.LocalInfo
            public String getName() {
                return null;
            }

            @Override // org.p120jf.dexlib2.iface.debug.LocalInfo
            public String getSignature() {
                return null;
            }

            @Override // org.p120jf.dexlib2.iface.debug.LocalInfo
            public String getType() {
                return null;
            }
        };
        public final int debugInfoOffset;
        public final DexBackedDexFile dexFile;
        public final DexBackedMethodImplementation methodImpl;

        public DebugInfoImpl(DexBackedDexFile dexBackedDexFile, int i, DexBackedMethodImplementation dexBackedMethodImplementation) {
            this.dexFile = dexBackedDexFile;
            this.debugInfoOffset = i;
            this.methodImpl = dexBackedMethodImplementation;
        }

        @Override // org.p120jf.dexlib2.dexbacked.util.DebugInfo
        public VariableSizeIterator<String> getParameterNames(DexReader dexReader) {
            if (dexReader == null) {
                dexReader = this.dexFile.getDataBuffer().readerAt(this.debugInfoOffset);
                dexReader.skipUleb128();
            }
            return new VariableSizeIterator<String>(dexReader, dexReader.readSmallUleb128()) { // from class: org.jf.dexlib2.dexbacked.util.DebugInfo.DebugInfoImpl.4
                @Override // org.p120jf.dexlib2.dexbacked.util.VariableSizeIterator
                public String readNextItem(DexReader dexReader2, int i) {
                    return DebugInfoImpl.this.dexFile.getStringSection().getOptional(dexReader2.readSmallUleb128() - 1);
                }
            };
        }

        @Override // java.lang.Iterable
        public Iterator<DebugItem> iterator() {
            LocalInfo localInfo;
            String type;
            DexReader<? extends DexBuffer> dexReader = this.dexFile.getDataBuffer().readerAt(this.debugInfoOffset);
            int bigUleb128 = dexReader.readBigUleb128();
            int registerCount = this.methodImpl.getRegisterCount();
            LocalInfo[] localInfoArr = new LocalInfo[registerCount];
            Arrays.fill(localInfoArr, EMPTY_LOCAL_INFO);
            DexBackedMethod dexBackedMethod = this.methodImpl.method;
            ParameterIterator parameterIterator = new ParameterIterator(dexBackedMethod.getParameterTypes(), dexBackedMethod.getParameterAnnotations(), getParameterNames((DexReader) dexReader));
            int i = 0;
            if (!AccessFlags.STATIC.isSet(this.methodImpl.method.getAccessFlags())) {
                localInfoArr[0] = new LocalInfo() { // from class: org.jf.dexlib2.dexbacked.util.DebugInfo.DebugInfoImpl.2
                    @Override // org.p120jf.dexlib2.iface.debug.LocalInfo
                    public String getName() {
                        return "this";
                    }

                    @Override // org.p120jf.dexlib2.iface.debug.LocalInfo
                    public String getSignature() {
                        return null;
                    }

                    @Override // org.p120jf.dexlib2.iface.debug.LocalInfo
                    public String getType() {
                        return DebugInfoImpl.this.methodImpl.method.getDefiningClass();
                    }
                };
                i = 1;
            }
            while (parameterIterator.hasNext()) {
                localInfoArr[i] = parameterIterator.next();
                i++;
            }
            if (i < registerCount) {
                int i2 = registerCount - 1;
                while (true) {
                    i--;
                    if (i <= -1 || ((type = (localInfo = localInfoArr[i]).getType()) != null && ((type.equals("J") || type.equals("D")) && i2 - 1 == i))) {
                        break;
                    }
                    localInfoArr[i2] = localInfo;
                    localInfoArr[i] = EMPTY_LOCAL_INFO;
                    i2--;
                }
            }
            return new VariableSizeLookaheadIterator<DebugItem>(this.dexFile.getDataBuffer(), dexReader.getOffset(), bigUleb128, localInfoArr) { // from class: org.jf.dexlib2.dexbacked.util.DebugInfo.DebugInfoImpl.3
                public int codeAddress = 0;
                public int lineNumber;
                public final /* synthetic */ int val$lineNumberStart;
                public final /* synthetic */ LocalInfo[] val$locals;

                {
                    this.val$lineNumberStart = bigUleb128;
                    this.val$locals = localInfoArr;
                    this.lineNumber = bigUleb128;
                }

                /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
                /* JADX WARN: Removed duplicated region for block: B:29:0x008f  */
                @Override // org.p120jf.dexlib2.dexbacked.util.VariableSizeLookaheadIterator
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public DebugItem readNextItem(DexReader dexReader2) {
                    LocalInfo localInfo2;
                    LocalInfo localInfo3;
                    while (true) {
                        int ubyte = dexReader2.readUbyte();
                        boolean z = true;
                        switch (ubyte) {
                            case 0:
                                return endOfData();
                            case 1:
                                this.codeAddress += dexReader2.readSmallUleb128();
                                break;
                            case 2:
                                this.lineNumber += dexReader2.readSleb128();
                                break;
                            case 3:
                                int smallUleb128 = dexReader2.readSmallUleb128();
                                ImmutableStartLocal immutableStartLocal = new ImmutableStartLocal(this.codeAddress, smallUleb128, DebugInfoImpl.this.dexFile.getStringSection().getOptional(dexReader2.readSmallUleb128() - 1), DebugInfoImpl.this.dexFile.getTypeSection().getOptional(dexReader2.readSmallUleb128() - 1), null);
                                if (smallUleb128 >= 0) {
                                    LocalInfo[] localInfoArr2 = this.val$locals;
                                    if (smallUleb128 < localInfoArr2.length) {
                                        localInfoArr2[smallUleb128] = immutableStartLocal;
                                    }
                                }
                                return immutableStartLocal;
                            case 4:
                                int smallUleb1282 = dexReader2.readSmallUleb128();
                                ImmutableStartLocal immutableStartLocal2 = new ImmutableStartLocal(this.codeAddress, smallUleb1282, DebugInfoImpl.this.dexFile.getStringSection().getOptional(dexReader2.readSmallUleb128() - 1), DebugInfoImpl.this.dexFile.getTypeSection().getOptional(dexReader2.readSmallUleb128() - 1), DebugInfoImpl.this.dexFile.getStringSection().getOptional(dexReader2.readSmallUleb128() - 1));
                                if (smallUleb1282 >= 0) {
                                    LocalInfo[] localInfoArr3 = this.val$locals;
                                    if (smallUleb1282 < localInfoArr3.length) {
                                        localInfoArr3[smallUleb1282] = immutableStartLocal2;
                                    }
                                }
                                return immutableStartLocal2;
                            case 5:
                                int smallUleb1283 = dexReader2.readSmallUleb128();
                                boolean z2 = false;
                                if (smallUleb1283 >= 0) {
                                    LocalInfo[] localInfoArr4 = this.val$locals;
                                    if (smallUleb1283 < localInfoArr4.length) {
                                        localInfo2 = localInfoArr4[smallUleb1283];
                                    } else {
                                        localInfo2 = DebugInfoImpl.EMPTY_LOCAL_INFO;
                                        z = false;
                                    }
                                }
                                if (localInfo2 instanceof EndLocal) {
                                    localInfo2 = DebugInfoImpl.EMPTY_LOCAL_INFO;
                                } else {
                                    z2 = z;
                                }
                                ImmutableEndLocal immutableEndLocal = new ImmutableEndLocal(this.codeAddress, smallUleb1283, localInfo2.getName(), localInfo2.getType(), localInfo2.getSignature());
                                if (z2) {
                                    this.val$locals[smallUleb1283] = immutableEndLocal;
                                }
                                return immutableEndLocal;
                            case 6:
                                int smallUleb1284 = dexReader2.readSmallUleb128();
                                if (smallUleb1284 >= 0) {
                                    LocalInfo[] localInfoArr5 = this.val$locals;
                                    localInfo3 = smallUleb1284 < localInfoArr5.length ? localInfoArr5[smallUleb1284] : DebugInfoImpl.EMPTY_LOCAL_INFO;
                                }
                                ImmutableRestartLocal immutableRestartLocal = new ImmutableRestartLocal(this.codeAddress, smallUleb1284, localInfo3.getName(), localInfo3.getType(), localInfo3.getSignature());
                                if (smallUleb1284 >= 0) {
                                    LocalInfo[] localInfoArr6 = this.val$locals;
                                    if (smallUleb1284 < localInfoArr6.length) {
                                        localInfoArr6[smallUleb1284] = immutableRestartLocal;
                                    }
                                }
                                return immutableRestartLocal;
                            case 7:
                                return new ImmutablePrologueEnd(this.codeAddress);
                            case 8:
                                return new ImmutableEpilogueBegin(this.codeAddress);
                            case 9:
                                return new ImmutableSetSourceFile(this.codeAddress, DebugInfoImpl.this.dexFile.getStringSection().getOptional(dexReader2.readSmallUleb128() - 1));
                            default:
                                this.codeAddress += (ubyte - 10) / 15;
                                this.lineNumber += (r0 % 15) - 4;
                                return new ImmutableLineNumber(this.codeAddress, this.lineNumber);
                        }
                    }
                }
            };
        }
    }

    public static class EmptyDebugInfo extends DebugInfo {
        public static final EmptyDebugInfo INSTANCE = new EmptyDebugInfo();

        @Override // org.p120jf.dexlib2.dexbacked.util.DebugInfo
        public Iterator<String> getParameterNames(DexReader dexReader) {
            return ImmutableSet.m4044of().iterator();
        }

        @Override // java.lang.Iterable
        public Iterator<DebugItem> iterator() {
            return ImmutableSet.m4044of().iterator();
        }
    }

    public static DebugInfo newOrEmpty(DexBackedDexFile dexBackedDexFile, int i, DexBackedMethodImplementation dexBackedMethodImplementation) {
        return i == 0 ? EmptyDebugInfo.INSTANCE : new DebugInfoImpl(dexBackedDexFile, i, dexBackedMethodImplementation);
    }

    public abstract Iterator<String> getParameterNames(DexReader dexReader);
}
