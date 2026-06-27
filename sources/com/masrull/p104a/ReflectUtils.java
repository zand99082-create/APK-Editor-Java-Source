package com.masrull.p104a;

import android.content.Context;
import jadx.core.Consts;
import java.lang.ref.SoftReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class ReflectUtils {
    private static final Map<String, SoftReference<Class>> sCache;
    private static final Set<Class<?>> sImmutable;
    private static final Set<Class<?>> sWrapper = new HashSet();

    static {
        try {
            sWrapper.add(Class.forName("java.lang.Boolean"));
            try {
                sWrapper.add(Class.forName("java.lang.Character"));
                try {
                    sWrapper.add(Class.forName("java.lang.Byte"));
                    try {
                        sWrapper.add(Class.forName("java.lang.Short"));
                        try {
                            sWrapper.add(Class.forName("java.lang.Integer"));
                            try {
                                sWrapper.add(Class.forName("java.lang.Long"));
                                try {
                                    sWrapper.add(Class.forName("java.lang.Float"));
                                    try {
                                        sWrapper.add(Class.forName("java.lang.Double"));
                                        try {
                                            sWrapper.add(Class.forName("java.lang.Void"));
                                            sImmutable = new HashSet(sWrapper);
                                            try {
                                                sImmutable.add(Class.forName(Consts.CLASS_STRING));
                                                try {
                                                    sImmutable.add(Class.forName("java.math.BigInteger"));
                                                    try {
                                                        sImmutable.add(Class.forName("java.math.BigDecimal"));
                                                        sCache = new HashMap();
                                                    } catch (ClassNotFoundException e) {
                                                        throw new NoClassDefFoundError(e.getMessage());
                                                    }
                                                } catch (ClassNotFoundException e2) {
                                                    throw new NoClassDefFoundError(e2.getMessage());
                                                }
                                            } catch (ClassNotFoundException e3) {
                                                throw new NoClassDefFoundError(e3.getMessage());
                                            }
                                        } catch (ClassNotFoundException e4) {
                                            throw new NoClassDefFoundError(e4.getMessage());
                                        }
                                    } catch (ClassNotFoundException e5) {
                                        throw new NoClassDefFoundError(e5.getMessage());
                                    }
                                } catch (ClassNotFoundException e6) {
                                    throw new NoClassDefFoundError(e6.getMessage());
                                }
                            } catch (ClassNotFoundException e7) {
                                throw new NoClassDefFoundError(e7.getMessage());
                            }
                        } catch (ClassNotFoundException e8) {
                            throw new NoClassDefFoundError(e8.getMessage());
                        }
                    } catch (ClassNotFoundException e9) {
                        throw new NoClassDefFoundError(e9.getMessage());
                    }
                } catch (ClassNotFoundException e10) {
                    throw new NoClassDefFoundError(e10.getMessage());
                }
            } catch (ClassNotFoundException e11) {
                throw new NoClassDefFoundError(e11.getMessage());
            }
        } catch (ClassNotFoundException e12) {
            throw new NoClassDefFoundError(e12.getMessage());
        }
    }

    ReflectUtils() {
    }

    public static String fullClassName(Context context, String str) {
        return str.charAt(0) == '.' ? new StringBuffer().append(context.getPackageName()).append(str).toString() : str;
    }

    public static Object getEnclosingInstance(Object obj) {
        try {
            int i = -1;
            Object obj2 = obj;
            for (Class<?> enclosingClass = obj.getClass().getEnclosingClass(); enclosingClass != null; enclosingClass = enclosingClass.getEnclosingClass()) {
                i++;
                Field field = getField(obj2.getClass(), new StringBuffer().append("this$").append(i).toString());
                field.setAccessible(true);
                obj2 = field.get(obj2);
            }
            return obj2;
        } catch (Throwable th) {
            return (Object) null;
        }
    }

    public static String getEnclosingInstanceName(Object obj) {
        int i = -1;
        for (Class<?> enclosingClass = obj.getClass().getEnclosingClass(); enclosingClass != null; enclosingClass = enclosingClass.getEnclosingClass()) {
            i++;
        }
        return i == -1 ? (String) null : new StringBuffer().append("this$").append(i).toString();
    }

    public static Field getField(Class<?> cls, String str) {
        while (cls != null) {
            try {
                return cls.getDeclaredField(str);
            } catch (NoSuchFieldException e) {
                cls = cls.getSuperclass();
            }
        }
        return (Field) null;
    }

    public static Object getFieldValue(Class<?> cls, String str) {
        try {
            Field field = getField(cls, str);
            field.setAccessible(true);
            return field.get((Object) null);
        } catch (Throwable th) {
            return (Object) null;
        }
    }

    public static Object getFieldValue(Object obj, String str) {
        if (obj != null && str != null) {
            try {
                Field field = getField(obj.getClass(), str);
                if (field == null) {
                    return (Object) null;
                }
                field.setAccessible(true);
                return field.get(obj);
            } catch (Throwable th) {
                return (Object) null;
            }
        }
        return (Object) null;
    }

    public static Object getFieldValue(Object obj, String... strArr) {
        if (strArr == null) {
            return (Object) null;
        }
        Object fieldValue = obj;
        for (String str : strArr) {
            fieldValue = getFieldValue(fieldValue, str);
        }
        return fieldValue;
    }

    public static Method getMethod(Class<?> cls, String str, Class<?>... clsArr) {
        while (cls != null) {
            try {
                return cls.getDeclaredMethod(str, clsArr);
            } catch (NoSuchMethodException e) {
                cls = cls.getSuperclass();
            }
        }
        return (Method) null;
    }

    public static <T> T invokeConstructor(Class<T> cls) {
        return (T) invokeConstructor(cls, new Class[0], new Object[0]);
    }

    public static <T> T invokeConstructor(Class<T> cls, Class<?>[] clsArr, Object[] objArr) {
        if (cls != null && clsArr != null && objArr != null) {
            try {
                Constructor<T> declaredConstructor = cls.getDeclaredConstructor(clsArr);
                if (declaredConstructor == null) {
                    return (T) ((Object) null);
                }
                declaredConstructor.setAccessible(true);
                return declaredConstructor.newInstance(objArr);
            } catch (Throwable th) {
                return (T) ((Object) null);
            }
        }
        return (T) ((Object) null);
    }

    public static Object invokeMethod(Object obj, String str) {
        return invokeMethod(obj, str, new Class[0], new Object[0]);
    }

    public static Object invokeMethod(Object obj, String str, Class<?>[] clsArr, Object[] objArr) {
        if (obj != null && str != null && clsArr != null && objArr != null) {
            try {
                Method method = getMethod(obj.getClass(), str, clsArr);
                return method != null ? invokeMethod(method, obj, objArr) : (Object) null;
            } catch (Throwable th) {
                return (Object) null;
            }
        }
        return (Object) null;
    }

    public static Object invokeMethod(Method method, Object obj, Object... objArr) {
        try {
            method.setAccessible(true);
            return method.invoke(obj, objArr);
        } catch (Throwable th) {
            return (Object) null;
        }
    }

    public static Object invokeStaticMethod(Method method, Object... objArr) {
        return invokeMethod(method, (Object) null, objArr);
    }

    public static boolean isImmutable(Class<?> cls) {
        return sImmutable.contains(cls);
    }

    public static boolean isWrapper(Class<?> cls) {
        return sWrapper.contains(cls);
    }

    public static <T> T newInstance(Class<T> cls) {
        try {
            Constructor<T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            declaredConstructor.setAccessible(true);
            return declaredConstructor.newInstance(new Object[0]);
        } catch (Throwable th) {
            throw new IllegalStateException(th);
        }
    }

    public static <T> T newInstance(Class<T> cls, Class<?>[] clsArr, Object[] objArr) {
        try {
            Constructor<T> declaredConstructor = cls.getDeclaredConstructor(clsArr);
            declaredConstructor.setAccessible(true);
            return declaredConstructor.newInstance(objArr);
        } catch (Throwable th) {
            throw new IllegalStateException(th);
        }
    }

    @SuppressWarnings("unchecked")
    public static <T> T newInstanceByClassName(String str) {
        IllegalStateException illegalStateException;
        IllegalStateException illegalStateException2;
        Class cls = (Class) null;
        SoftReference<Class> softReference = sCache.get(str);
        if (softReference != null) {
            cls = softReference.get();
        }
        if (cls == null) {
            try {
                cls = Class.forName(str);
                sCache.put(str, new SoftReference<>(cls));
            } finally {
            }
        }
        try {
            return (T) cls.newInstance();
        } finally {
        }
    }

    @SuppressWarnings("UnnecessaryBoxing")
    public static Object newReturnInstance(Method method) throws IllegalAccessException, InstantiationException {
        Class<?> returnType = method.getReturnType();
        if (returnType == Boolean.TYPE) {
            return false;
        }
        if (returnType == Byte.TYPE) {
            return (byte) 0;
        }
        if (returnType == Character.TYPE) {
            return (char) 0;
        }
        if (returnType == Short.TYPE) {
            return (short) 0;
        }
        if (returnType == Integer.TYPE) {
            return 0;
        }
        if (returnType == Long.TYPE) {
            return 0L;
        }
        if (returnType == Float.TYPE) {
            return Float.valueOf(0.0f);
        }
        if (returnType == Double.TYPE) {
            return Double.valueOf(0.0d);
        }
        if (returnType != Void.TYPE) {
            try {
                if (returnType != Class.forName("java.lang.Void")) {
                    return returnType.newInstance();
                }
            } catch (ClassNotFoundException e) {
                throw new NoClassDefFoundError(e.getMessage());
            }
        }
        return (Object) null;
    }

    public static boolean setFieldValue(Object obj, String str, Object obj2) {
        if (obj == null || str == null) {
            return false;
        }
        try {
            Field field = getField(obj.getClass(), str);
            if (field == null) {
                return false;
            }
            field.setAccessible(true);
            field.set(obj, obj2);
            return true;
        } catch (Throwable th) {
            return false;
        }
    }
}
