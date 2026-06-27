package org.p120jf.baksmali.formatter;

import java.io.Writer;
import org.p120jf.dexlib2.formatter.DexFormatter;

/* JADX INFO: loaded from: classes.dex */
public class BaksmaliFormatter extends DexFormatter {
    public final String classContext;

    public BaksmaliFormatter(String str) {
        this.classContext = str;
    }

    @Override // org.p120jf.dexlib2.formatter.DexFormatter
    public BaksmaliWriter getWriter(Writer writer) {
        return new BaksmaliWriter(writer, this.classContext);
    }
}
