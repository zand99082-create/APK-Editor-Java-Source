package org.p120jf.dexlib2.iface;

import java.util.List;
import java.util.Set;
import org.p120jf.dexlib2.HiddenApiRestriction;
import org.p120jf.dexlib2.iface.reference.MethodReference;

/* JADX INFO: loaded from: classes.dex */
public interface Method extends MethodReference {
    int getAccessFlags();

    Set<? extends Annotation> getAnnotations();

    String getDefiningClass();

    Set<HiddenApiRestriction> getHiddenApiRestrictions();

    MethodImplementation getImplementation();

    String getName();

    List<? extends MethodParameter> getParameters();

    String getReturnType();
}
