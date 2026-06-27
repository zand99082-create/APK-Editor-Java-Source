package org.p120jf.dexlib2.dexbacked;

/* JADX INFO: loaded from: classes.dex */
public class DexBackedCatchAllExceptionHandler extends DexBackedExceptionHandler {
    public final int handlerCodeAddress;

    public DexBackedCatchAllExceptionHandler(DexReader dexReader) {
        this.handlerCodeAddress = dexReader.readSmallUleb128();
    }

    @Override // org.p120jf.dexlib2.iface.ExceptionHandler
    public String getExceptionType() {
        return null;
    }

    @Override // org.p120jf.dexlib2.iface.ExceptionHandler
    public int getHandlerCodeAddress() {
        return this.handlerCodeAddress;
    }
}
