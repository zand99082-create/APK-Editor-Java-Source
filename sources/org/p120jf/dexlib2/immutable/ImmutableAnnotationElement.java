package org.p120jf.dexlib2.immutable;

import com.google.common.collect.ImmutableSet;
import org.p120jf.dexlib2.base.BaseAnnotationElement;
import org.p120jf.dexlib2.iface.AnnotationElement;
import org.p120jf.dexlib2.iface.value.EncodedValue;
import org.p120jf.dexlib2.immutable.value.ImmutableEncodedValue;
import org.p120jf.dexlib2.immutable.value.ImmutableEncodedValueFactory;
import org.p120jf.util.ImmutableConverter;

/* JADX INFO: loaded from: classes.dex */
public class ImmutableAnnotationElement extends BaseAnnotationElement {
    public static final ImmutableConverter<ImmutableAnnotationElement, AnnotationElement> CONVERTER = new ImmutableConverter<ImmutableAnnotationElement, AnnotationElement>() { // from class: org.jf.dexlib2.immutable.ImmutableAnnotationElement.1
        @Override // org.p120jf.util.ImmutableConverter
        public boolean isImmutable(AnnotationElement annotationElement) {
            return annotationElement instanceof ImmutableAnnotationElement;
        }

        @Override // org.p120jf.util.ImmutableConverter
        public ImmutableAnnotationElement makeImmutable(AnnotationElement annotationElement) {
            return ImmutableAnnotationElement.m4234of(annotationElement);
        }
    };
    public final String name;
    public final ImmutableEncodedValue value;

    public ImmutableAnnotationElement(String str, EncodedValue encodedValue) {
        this.name = str;
        this.value = ImmutableEncodedValueFactory.m4304of(encodedValue);
    }

    public ImmutableAnnotationElement(String str, ImmutableEncodedValue immutableEncodedValue) {
        this.name = str;
        this.value = immutableEncodedValue;
    }

    public static ImmutableSet<ImmutableAnnotationElement> immutableSetOf(Iterable<? extends AnnotationElement> iterable) {
        return CONVERTER.toSet(iterable);
    }

    /* JADX INFO: renamed from: of */
    public static ImmutableAnnotationElement m4234of(AnnotationElement annotationElement) {
        return annotationElement instanceof ImmutableAnnotationElement ? (ImmutableAnnotationElement) annotationElement : new ImmutableAnnotationElement(annotationElement.getName(), annotationElement.getValue());
    }

    @Override // org.p120jf.dexlib2.iface.AnnotationElement
    public String getName() {
        return this.name;
    }

    @Override // org.p120jf.dexlib2.iface.AnnotationElement
    public EncodedValue getValue() {
        return this.value;
    }
}
