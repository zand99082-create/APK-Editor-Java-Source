package org.p120jf.dexlib2.immutable.reference;

import com.google.common.collect.ImmutableList;
import java.util.List;
import org.p120jf.dexlib2.base.reference.BaseCallSiteReference;
import org.p120jf.dexlib2.iface.reference.CallSiteReference;
import org.p120jf.dexlib2.iface.reference.MethodHandleReference;
import org.p120jf.dexlib2.iface.reference.MethodProtoReference;
import org.p120jf.dexlib2.iface.value.EncodedValue;
import org.p120jf.dexlib2.immutable.value.ImmutableEncodedValue;
import org.p120jf.dexlib2.immutable.value.ImmutableEncodedValueFactory;
import org.p120jf.util.ImmutableUtils;

/* JADX INFO: loaded from: classes.dex */
public class ImmutableCallSiteReference extends BaseCallSiteReference implements ImmutableReference {
    public final ImmutableList<? extends ImmutableEncodedValue> extraArguments;
    public final ImmutableMethodHandleReference methodHandle;
    public final String methodName;
    public final ImmutableMethodProtoReference methodProto;
    public final String name;

    public ImmutableCallSiteReference(String str, MethodHandleReference methodHandleReference, String str2, MethodProtoReference methodProtoReference, Iterable<? extends EncodedValue> iterable) {
        this.name = str;
        this.methodHandle = ImmutableMethodHandleReference.m4291of(methodHandleReference);
        this.methodName = str2;
        this.methodProto = ImmutableMethodProtoReference.m4292of(methodProtoReference);
        this.extraArguments = ImmutableEncodedValueFactory.immutableListOf(iterable);
    }

    public ImmutableCallSiteReference(String str, ImmutableMethodHandleReference immutableMethodHandleReference, String str2, ImmutableMethodProtoReference immutableMethodProtoReference, ImmutableList<? extends ImmutableEncodedValue> immutableList) {
        this.name = str;
        this.methodHandle = immutableMethodHandleReference;
        this.methodName = str2;
        this.methodProto = immutableMethodProtoReference;
        this.extraArguments = ImmutableUtils.nullToEmptyList(immutableList);
    }

    /* JADX INFO: renamed from: of */
    public static ImmutableCallSiteReference m4289of(CallSiteReference callSiteReference) {
        return callSiteReference instanceof ImmutableCallSiteReference ? (ImmutableCallSiteReference) callSiteReference : new ImmutableCallSiteReference(callSiteReference.getName(), ImmutableMethodHandleReference.m4291of(callSiteReference.getMethodHandle()), callSiteReference.getMethodName(), ImmutableMethodProtoReference.m4292of(callSiteReference.getMethodProto()), (ImmutableList<? extends ImmutableEncodedValue>) ImmutableEncodedValueFactory.immutableListOf(callSiteReference.getExtraArguments()));
    }

    @Override // org.p120jf.dexlib2.iface.reference.CallSiteReference
    public List<? extends EncodedValue> getExtraArguments() {
        return this.extraArguments;
    }

    @Override // org.p120jf.dexlib2.iface.reference.CallSiteReference
    public MethodHandleReference getMethodHandle() {
        return this.methodHandle;
    }

    @Override // org.p120jf.dexlib2.iface.reference.CallSiteReference
    public String getMethodName() {
        return this.methodName;
    }

    @Override // org.p120jf.dexlib2.iface.reference.CallSiteReference
    public MethodProtoReference getMethodProto() {
        return this.methodProto;
    }

    @Override // org.p120jf.dexlib2.iface.reference.CallSiteReference
    public String getName() {
        return this.name;
    }
}
