package com.willme.topactivity;

import android.accessibilityservice.AccessibilityService;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: renamed from: com.willme.topactivity.c */
/* JADX INFO: loaded from: classes2.dex */
public class C1721c extends AccessibilityService {

    /* JADX INFO: renamed from: a */
    private static C1721c f5158a;

    /* JADX INFO: renamed from: a */
    public static C1721c m4163a() {
        return f5158a;
    }

    @Override // android.accessibilityservice.AccessibilityService
    @SuppressLint({"NewApi"})
    public void onAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32 && C1719a.m4155a(this)) {
            C1720b.m4161a(this, ((Object) accessibilityEvent.getPackageName()) + "\n" + ((Object) accessibilityEvent.getClassName()));
        }
    }

    @Override // android.accessibilityservice.AccessibilityService
    public void onInterrupt() {
    }

    @Override // android.accessibilityservice.AccessibilityService
    protected void onServiceConnected() {
        f5158a = this;
        if (C1719a.m4155a(this)) {
            NotificationActionReceiver.m4142a((Context) this, false);
        }
        sendBroadcast(new Intent("com.willme.topactivity.ACTION.UPDATE_TITLE"));
        super.onServiceConnected();
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        f5158a = null;
        C1720b.m4162b(this);
        NotificationActionReceiver.m4141a(this);
        sendBroadcast(new Intent("com.willme.topactivity.ACTION.UPDATE_TITLE"));
        return super.onUnbind(intent);
    }
}
