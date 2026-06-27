package org.p120jf.util;

import com.google.common.collect.ImmutableList;

/* JADX INFO: loaded from: classes.dex */
public class ImmutableUtils {
    public static <T> ImmutableList<T> nullToEmptyList(ImmutableList<T> immutableList) {
        return immutableList == null ? ImmutableList.m4040of() : immutableList;
    }
}
