package org.p120jf.dexlib2.writer.pool;

import java.util.Collection;
import java.util.Map;
import org.p120jf.dexlib2.writer.OffsetSection;
import org.p120jf.util.ExceptionWithContext;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseOffsetPool<Key> extends BasePool<Key, Integer> implements OffsetSection<Key> {
    public BaseOffsetPool(DexPool dexPool) {
        super(dexPool);
    }

    @Override // org.p120jf.dexlib2.writer.OffsetSection
    public int getItemOffset(Key key) {
        Integer num = (Integer) this.internedItems.get(key);
        if (num != null) {
            return num.intValue();
        }
        throw new ExceptionWithContext("Item not found.: %s", getItemString(key));
    }

    public String getItemString(Key key) {
        return key.toString();
    }

    @Override // org.p120jf.dexlib2.writer.OffsetSection
    public Collection<? extends Map.Entry<? extends Key, Integer>> getItems() {
        return this.internedItems.entrySet();
    }
}
