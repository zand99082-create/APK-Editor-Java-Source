package org.p120jf.baksmali.Adaptors;

import org.p120jf.baksmali.formatter.BaksmaliWriter;

/* JADX INFO: loaded from: classes.dex */
public class BlankMethodItem extends MethodItem {
    public BlankMethodItem(int i) {
        super(i);
    }

    @Override // org.p120jf.baksmali.Adaptors.MethodItem
    public double getSortOrder() {
        return 2.147483647E9d;
    }

    @Override // org.p120jf.baksmali.Adaptors.MethodItem
    public boolean writeTo(BaksmaliWriter baksmaliWriter) {
        return true;
    }
}
