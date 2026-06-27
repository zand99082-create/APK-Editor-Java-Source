package org.p120jf.baksmali.Adaptors.Debug;

import java.io.IOException;
import org.p120jf.baksmali.formatter.BaksmaliWriter;

/* JADX INFO: loaded from: classes.dex */
public class EndPrologueMethodItem extends DebugMethodItem {
    public EndPrologueMethodItem(int i, int i2) {
        super(i, i2);
    }

    @Override // org.p120jf.baksmali.Adaptors.MethodItem
    public boolean writeTo(BaksmaliWriter baksmaliWriter) throws IOException {
        baksmaliWriter.write(".prologue");
        return true;
    }
}
