package com.p082d.p083a;

import com.p046a.p049b.p050a.p055e.InterfaceC0597j;
import com.p046a.p049b.p056b.C0614b;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.d.a.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1035a {

    /* JADX INFO: renamed from: b */
    private final Set f2746b = new HashSet();

    /* JADX INFO: renamed from: c */
    private final Set f2747c = new HashSet();

    /* JADX INFO: renamed from: d */
    private final Set f2748d = new HashSet();

    /* JADX INFO: renamed from: e */
    private final Map f2749e = new HashMap();

    /* JADX INFO: renamed from: f */
    private final Map f2750f = new IdentityHashMap();

    /* JADX INFO: renamed from: g */
    private final ConcurrentHashMap f2751g = new ConcurrentHashMap();

    /* JADX INFO: renamed from: h */
    private InterfaceC0597j f2752h = null;

    /* JADX INFO: renamed from: i */
    private boolean f2753i = true;

    /* JADX INFO: renamed from: j */
    private boolean f2754j = false;

    /* JADX INFO: renamed from: k */
    private boolean f2755k = true;

    /* JADX INFO: renamed from: l */
    private InterfaceC1044j f2756l = new C1036b(this);

    /* JADX INFO: renamed from: m */
    private final ConcurrentHashMap f2757m = new ConcurrentHashMap();

    /* JADX INFO: renamed from: n */
    private boolean f2758n = true;

    /* JADX INFO: renamed from: a */
    private final InterfaceC1047m f2745a = C1049o.m2377a();

    public C1035a() {
        m2367d(String.class);
        m2367d(Integer.class);
        m2367d(Long.class);
        m2367d(Boolean.class);
        m2367d(Class.class);
        m2367d(Float.class);
        m2367d(Double.class);
        m2367d(Character.class);
        m2367d(Byte.class);
        m2367d(Short.class);
        m2367d(Void.class);
        m2367d(BigDecimal.class);
        m2367d(BigInteger.class);
        m2367d(URI.class);
        m2367d(URL.class);
        m2367d(UUID.class);
        m2367d(Pattern.class);
        m2366c(TreeSet.class, HashSet.class, HashMap.class, TreeMap.class);
        this.f2749e.put(GregorianCalendar.class, new C1038d());
        this.f2749e.put(ArrayList.class, new C1037c());
        this.f2749e.put(LinkedList.class, new C1042h());
        this.f2749e.put(HashSet.class, new C1041g());
        this.f2749e.put(HashMap.class, new C1040f());
        this.f2749e.put(TreeMap.class, new C1043i());
        this.f2749e.put(ConcurrentHashMap.class, new C1039e());
    }

    /* JADX INFO: renamed from: a */
    private List m2364a(Class cls) {
        List list = (List) this.f2751g.get(cls);
        if (list != null) {
            return list;
        }
        LinkedList linkedList = new LinkedList();
        m2365a(linkedList, cls.getDeclaredFields());
        Class superclass = cls;
        while (true) {
            superclass = superclass.getSuperclass();
            if (superclass == Object.class || superclass == null) {
                break;
            }
            m2365a(linkedList, superclass.getDeclaredFields());
        }
        this.f2751g.putIfAbsent(cls, linkedList);
        return linkedList;
    }

    /* JADX INFO: renamed from: a */
    private static void m2365a(List list, Field[] fieldArr) {
        for (Field field : fieldArr) {
            if (!field.isAccessible()) {
                field.setAccessible(true);
            }
            list.add(field);
        }
    }

    /* JADX INFO: renamed from: c */
    private void m2366c(Class... clsArr) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= 4) {
                return;
            }
            Class cls = clsArr[i2];
            for (Field field : m2364a(cls)) {
                if (Modifier.isStatic(field.getModifiers()) && !field.getType().isPrimitive()) {
                    try {
                        Field declaredField = cls.getDeclaredField(field.getName());
                        declaredField.setAccessible(true);
                        this.f2750f.put(declaredField.get(null), true);
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                    } catch (IllegalArgumentException e2) {
                        throw new RuntimeException(e2);
                    } catch (NoSuchFieldException e3) {
                        throw new RuntimeException(e3);
                    } catch (SecurityException e4) {
                        throw new RuntimeException(e4);
                    }
                }
            }
            i = i2 + 1;
        }
    }

    /* JADX INFO: renamed from: d */
    private void m2367d(Class... clsArr) {
        for (int i = 0; i <= 0; i++) {
            this.f2746b.add(clsArr[0]);
        }
    }

    /* JADX INFO: renamed from: a */
    public final Object m2368a(Object obj) {
        if (obj == null) {
            return null;
        }
        if (!this.f2753i) {
            return obj;
        }
        try {
            return m2369a(obj, new IdentityHashMap(16));
        } catch (IllegalAccessException e) {
            throw new C0614b("error during cloning of " + obj, e);
        }
    }

    /* JADX INFO: renamed from: a */
    protected final Object m2369a(Object obj, Map map) throws IllegalAccessException {
        boolean zBooleanValue;
        if (obj != null && obj != this) {
            if (this.f2750f.containsKey(obj) || (obj instanceof Enum)) {
                return obj;
            }
            Class<?> cls = obj.getClass();
            if (this.f2748d.contains(cls)) {
                return null;
            }
            if (this.f2746b.contains(cls)) {
                return obj;
            }
            Iterator it = this.f2747c.iterator();
            while (it.hasNext()) {
                if (((Class) it.next()).isAssignableFrom(cls)) {
                    return obj;
                }
            }
            Boolean bool = (Boolean) this.f2757m.get(cls);
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                Annotation[] declaredAnnotations = cls.getDeclaredAnnotations();
                int length = declaredAnnotations.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        loop4: for (Class<? super Object> superclass = cls.getSuperclass(); superclass != null && superclass != Object.class; superclass = superclass.getSuperclass()) {
                            for (Annotation annotation : superclass.getDeclaredAnnotations()) {
                                if (annotation.annotationType() == InterfaceC1048n.class && ((InterfaceC1048n) annotation).m2376a()) {
                                    this.f2757m.put(cls, Boolean.TRUE);
                                    zBooleanValue = true;
                                    break loop4;
                                }
                            }
                        }
                        this.f2757m.put(cls, Boolean.FALSE);
                        zBooleanValue = false;
                    } else {
                        if (declaredAnnotations[i].annotationType() == InterfaceC1048n.class) {
                            this.f2757m.put(cls, Boolean.TRUE);
                            zBooleanValue = true;
                            break;
                        }
                        i++;
                    }
                }
            }
            if (zBooleanValue) {
                return obj;
            }
            if ((obj instanceof InterfaceC1046l) && ((InterfaceC1046l) obj).m2374a()) {
                return obj;
            }
            Object obj2 = map != null ? map.get(obj) : null;
            if (obj2 != null) {
                return obj2;
            }
            InterfaceC1045k interfaceC1045k = (InterfaceC1045k) this.f2749e.get(obj.getClass());
            Object objMo2373a = interfaceC1045k != null ? interfaceC1045k.mo2373a(obj, this.f2756l, map) : null;
            if (objMo2373a != null) {
                if (map != null) {
                    map.put(obj, objMo2373a);
                }
                return objMo2373a;
            }
            if (cls.isArray()) {
                Class<?> cls2 = obj.getClass();
                int length2 = Array.getLength(obj);
                Object objNewInstance = Array.newInstance(cls2.getComponentType(), length2);
                if (map != null) {
                    map.put(obj, objNewInstance);
                }
                for (int i2 = 0; i2 < length2; i2++) {
                    Object objM2369a = Array.get(obj, i2);
                    if (map != null) {
                        objM2369a = m2369a(objM2369a, map);
                    }
                    Array.set(objNewInstance, i2, objM2369a);
                }
                return objNewInstance;
            }
            Object objMo2375a = this.f2745a.mo2375a(cls);
            if (map != null) {
                map.put(obj, objMo2375a);
            }
            for (Field field : m2364a((Class) cls)) {
                if (!Modifier.isStatic(field.getModifiers())) {
                    Object objM2369a2 = field.get(obj);
                    boolean z = (this.f2755k || !(this.f2755k || field.isSynthetic())) && (this.f2758n || !(this.f2758n || "this$0".equals(field.getName())));
                    if (map != null && z) {
                        objM2369a2 = m2369a(objM2369a2, map);
                    }
                    field.set(objMo2375a, objM2369a2);
                }
            }
            return objMo2375a;
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final void m2370a(Class... clsArr) {
        for (int i = 0; i < 4; i++) {
            this.f2746b.add(clsArr[i]);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m2371b(Class... clsArr) {
        for (int i = 0; i <= 0; i++) {
            this.f2747c.add(clsArr[0]);
        }
    }
}
