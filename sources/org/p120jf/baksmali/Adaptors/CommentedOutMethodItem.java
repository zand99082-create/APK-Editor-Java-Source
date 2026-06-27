package org.p120jf.baksmali.Adaptors;

import java.io.IOException;
import org.p120jf.baksmali.formatter.BaksmaliWriter;

/* JADX INFO: loaded from: classes.dex */
public class CommentedOutMethodItem extends MethodItem {
    public final MethodItem commentedOutMethodItem;

    public CommentedOutMethodItem(MethodItem methodItem) {
        super(methodItem.getCodeAddress());
        this.commentedOutMethodItem = methodItem;
    }

    @Override // org.p120jf.baksmali.Adaptors.MethodItem
    public double getSortOrder() {
        return this.commentedOutMethodItem.getSortOrder() + 0.001d;
    }

    @Override // org.p120jf.baksmali.Adaptors.MethodItem
    public boolean writeTo(BaksmaliWriter baksmaliWriter) throws IOException {
        baksmaliWriter.write(35);
        this.commentedOutMethodItem.writeTo(baksmaliWriter);
        return true;
    }
}
