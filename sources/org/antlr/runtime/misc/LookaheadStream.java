package org.antlr.runtime.misc;

/* JADX INFO: loaded from: classes.dex */
public abstract class LookaheadStream<T> extends FastQueue<T> {
    public int lastMarker;
    public T prevElement;
    public int currentElementIndex = 0;
    public T eof = null;
    public int markDepth = 0;

    /* JADX INFO: renamed from: LB */
    public T m4168LB(int i) {
        int i2 = this.f5183p - i;
        if (i2 == -1) {
            return this.prevElement;
        }
        if (i2 >= 0) {
            return this.data.get(i2);
        }
        if (i2 < -1) {
            throw new UnsupportedOperationException("can't look more than one token before the beginning of this stream's buffer");
        }
        throw new UnsupportedOperationException("can't look past the end of this stream's buffer using LB(int)");
    }

    /* JADX INFO: renamed from: LT */
    public T m4169LT(int i) {
        if (i == 0) {
            return null;
        }
        if (i < 0) {
            return m4168LB(-i);
        }
        syncAhead(i);
        return (this.f5183p + i) + (-1) > this.data.size() ? this.eof : elementAt(i - 1);
    }

    public void consume() {
        syncAhead(1);
        remove();
        this.currentElementIndex++;
    }

    public void fill(int i) {
        for (int i2 = 1; i2 <= i; i2++) {
            T tNextElement = nextElement();
            if (isEOF(tNextElement)) {
                this.eof = tNextElement;
            }
            this.data.add(tNextElement);
        }
    }

    public int index() {
        return this.currentElementIndex;
    }

    public abstract boolean isEOF(T t);

    public int mark() {
        this.markDepth++;
        int i = this.f5183p;
        this.lastMarker = i;
        return i;
    }

    public abstract T nextElement();

    @Override // org.antlr.runtime.misc.FastQueue
    public T remove() {
        T tElementAt = elementAt(0);
        int i = this.f5183p + 1;
        this.f5183p = i;
        if (i == this.data.size() && this.markDepth == 0) {
            this.prevElement = tElementAt;
            clear();
        }
        return tElementAt;
    }

    public void rewind(int i) {
        this.markDepth--;
        this.currentElementIndex -= this.f5183p - i;
        this.f5183p = i;
    }

    @Override // org.antlr.runtime.misc.FastQueue
    public int size() {
        throw new UnsupportedOperationException("streams are of unknown size");
    }

    public void syncAhead(int i) {
        int size = (((this.f5183p + i) - 1) - this.data.size()) + 1;
        if (size > 0) {
            fill(size);
        }
    }
}
