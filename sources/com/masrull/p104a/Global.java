package com.masrull.p104a;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class Global {
    private static Application act;
    private static Context sContext;

    static class BackgroundHandlerHolder {
        static final Handler INSTANCE;

        static {
            try {
                INSTANCE = ThreadUtils.newThread(Class.forName("com.mod.bomfab.application.Global").getSimpleName(), (Handler.Callback) null);
            } catch (ClassNotFoundException e) {
                throw new NoClassDefFoundError(e.getMessage());
            }
        }
    }

    static class CurrentApplicationHolder {
        static final Application INSTANCE;

        static {
            try {
                INSTANCE = (Application) ObjectUtils.cast(ReflectUtils.invokeStaticMethod(ReflectUtils.getMethod(Class.forName("android.app.ActivityThread"), "currentApplication", new Class[0]), new Object[0]));
            } catch (Throwable th) {
                throw new AssertionError(th);
            }
        }
    }

    static class UiHandlerHolder {
        static final Handler INSTANCE = new Handler(Looper.getMainLooper());
    }

    Global() {
    }

    public static Handler getBackgroundHandler() {
        return BackgroundHandlerHolder.INSTANCE;
    }

    public static Context getContext() {
        if (sContext == null) {
            sContext = CurrentApplicationHolder.INSTANCE;
        }
        return (Context) ObjectUtils.notNull(sContext);
    }

    public static Resources getResources() {
        return (Resources) ObjectUtils.notNull(getContext().getResources());
    }

    public static Handler getUiHandler() {
        return UiHandlerHolder.INSTANCE;
    }

    public static void setContext(Context context) {
        sContext = context;
    }
}
