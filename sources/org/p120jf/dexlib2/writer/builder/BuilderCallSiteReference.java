package org.p120jf.dexlib2.writer.builder;

import com.google.common.collect.ImmutableList;
import java.util.List;
import org.p120jf.dexlib2.base.reference.BaseCallSiteReference;
import org.p120jf.dexlib2.iface.value.StringEncodedValue;
import org.p120jf.dexlib2.writer.builder.BuilderEncodedValues;

/* JADX INFO: loaded from: classes.dex */
public class BuilderCallSiteReference extends BaseCallSiteReference implements BuilderReference {
    public final BuilderEncodedValues.BuilderArrayEncodedValue encodedCallSite;
    public int index = -1;
    public final String name;

    public BuilderCallSiteReference(String str, BuilderEncodedValues.BuilderArrayEncodedValue builderArrayEncodedValue) {
        this.name = str;
        this.encodedCallSite = builderArrayEncodedValue;
    }

    @Override // org.p120jf.dexlib2.iface.reference.CallSiteReference
    public List<? extends BuilderEncodedValues.BuilderEncodedValue> getExtraArguments() {
        if (this.encodedCallSite.elements.size() <= 3) {
            return ImmutableList.m4040of();
        }
        List<? extends BuilderEncodedValues.BuilderEncodedValue> list = this.encodedCallSite.elements;
        return list.subList(3, list.size());
    }

    @Override // org.p120jf.dexlib2.iface.reference.CallSiteReference
    public BuilderMethodHandleReference getMethodHandle() {
        return ((BuilderEncodedValues.BuilderMethodHandleEncodedValue) this.encodedCallSite.elements.get(0)).getValue();
    }

    @Override // org.p120jf.dexlib2.iface.reference.CallSiteReference
    public String getMethodName() {
        return ((StringEncodedValue) this.encodedCallSite.elements.get(1)).getValue();
    }

    @Override // org.p120jf.dexlib2.iface.reference.CallSiteReference
    public BuilderMethodProtoReference getMethodProto() {
        return ((BuilderEncodedValues.BuilderMethodTypeEncodedValue) this.encodedCallSite.elements.get(2)).getValue();
    }

    @Override // org.p120jf.dexlib2.iface.reference.CallSiteReference
    public String getName() {
        return this.name;
    }
}
