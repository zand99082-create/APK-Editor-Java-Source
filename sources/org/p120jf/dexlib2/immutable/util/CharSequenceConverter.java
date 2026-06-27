package org.p120jf.dexlib2.immutable.util;

import com.google.common.collect.ImmutableList;
import org.p120jf.util.ImmutableConverter;

/* JADX INFO: loaded from: classes.dex */
public final class CharSequenceConverter {
    public static final ImmutableConverter<String, CharSequence> CONVERTER = new ImmutableConverter<String, CharSequence>() { // from class: org.jf.dexlib2.immutable.util.CharSequenceConverter.1
        @Override // org.p120jf.util.ImmutableConverter
        public boolean isImmutable(CharSequence charSequence) {
            return charSequence instanceof String;
        }

        @Override // org.p120jf.util.ImmutableConverter
        public String makeImmutable(CharSequence charSequence) {
            return charSequence.toString();
        }
    };

    public static ImmutableList<String> immutableStringList(Iterable<? extends CharSequence> iterable) {
        return CONVERTER.toList(iterable);
    }
}
