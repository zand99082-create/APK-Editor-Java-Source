package com.masrull.p104a;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class ThreadUtils implements Runnable {
    private static AtomicInteger sCounter;
    private static Runnable sStopper;

    public static class ObjAsRunnableCallback implements Handler.Callback {
        public static final ObjAsRunnableCallback INSTANCE = new ObjAsRunnableCallback();

        ObjAsRunnableCallback() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (!(message.obj instanceof Runnable)) {
                return false;
            }
            ((Runnable) message.obj).run();
            return true;
        }
    }

    ThreadUtils() {
    }

    public static Handler newHandler(Handler handler, Handler.Callback callback) {
        return new Handler(handler.getLooper(), callback);
    }

    private static String newName() {
        AtomicInteger atomicInteger = sCounter;
        if (atomicInteger == null) {
            atomicInteger = new AtomicInteger();
            sCounter = atomicInteger;
        }
        try {
            return new StringBuffer().append(new StringBuffer().append(Class.forName("com.mod.bomfab.application.ThreadUtils").getSimpleName()).append('-').toString()).append(atomicInteger.incrementAndGet()).toString();
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    public static Handler newThread(Handler.Callback callback) {
        return newThread((String) null, 19, callback);
    }

    public static Handler newThread(String str, int i, Handler.Callback callback) {
        if (str == null) {
            str = newName();
        }
        HandlerThread handlerThread = new HandlerThread(str, i);
        handlerThread.start();
        return new Handler(handlerThread.getLooper(), callback);
    }

    public static Handler newThread(String str, Handler.Callback callback) {
        return newThread(str, 19, callback);
    }

    public static void stopThread(Handler handler) {
        stopThread(handler, true);
    }

    public static void stopThread(Handler handler, boolean z) {
        Runnable threadUtils = sStopper;
        if (threadUtils == null) {
            threadUtils = new ThreadUtils();
            sStopper = threadUtils;
        }
        if (z) {
            handler.postAtFrontOfQueue(threadUtils);
        } else {
            handler.post(threadUtils);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null) {
            looperMyLooper.quit();
        }
    }
}
