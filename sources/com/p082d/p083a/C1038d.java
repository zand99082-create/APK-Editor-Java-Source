package com.p082d.p083a;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: renamed from: com.d.a.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1038d implements InterfaceC1045k {
    @Override // com.p082d.p083a.InterfaceC1045k
    /* JADX INFO: renamed from: a */
    public final Object mo2373a(Object obj, InterfaceC1044j interfaceC1044j, Map map) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        Calendar calendar = (Calendar) obj;
        gregorianCalendar.setTimeInMillis(calendar.getTimeInMillis());
        gregorianCalendar.setTimeZone((TimeZone) calendar.getTimeZone().clone());
        return gregorianCalendar;
    }
}
