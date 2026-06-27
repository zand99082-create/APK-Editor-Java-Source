package com.rull.colorpicker;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.rull.colorpicker.c */
/* JADX INFO: loaded from: classes.dex */
public class C1693c {
    private int f1624b;
    private float[] f1623a = {0.0f, 0.0f, 0.0f};

    /* JADX INFO: renamed from: c */
    private List f5052c = new ArrayList();

    public C1693c(int i) {
        Color.colorToHSV(i, this.f1623a);
        this.f1624b = Color.alpha(i);
    }

    /* JADX INFO: renamed from: a */
    public void m4077a(InterfaceC1692b interfaceC1692b) {
        this.f5052c.add(interfaceC1692b);
    }

    /* JADX INFO: renamed from: b */
    public void m4078b(int i, InterfaceC1692b interfaceC1692b) {
        Color.colorToHSV(i, this.f1623a);
        this.f1624b = Color.alpha(i);
        for (InterfaceC1692b interfaceC1692b2 : this.f5052c) {
            if (interfaceC1692b2 != interfaceC1692b) {
                interfaceC1692b2.mo4073a(this);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public int m4079c() {
        return Color.HSVToColor(this.f1624b, this.f1623a);
    }
}
