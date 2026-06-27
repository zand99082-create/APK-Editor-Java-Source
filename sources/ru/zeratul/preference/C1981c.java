package ru.zeratul.preference;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: ru.zeratul.preference.c */
/* JADX INFO: loaded from: classes.dex */
public class C1981c {

    /* JADX INFO: renamed from: b */
    private int f5389b;

    /* JADX INFO: renamed from: a */
    private float[] f5388a = {0.0f, 0.0f, 0.0f};

    /* JADX INFO: renamed from: c */
    private List f5390c = new ArrayList();

    C1981c(int i) {
        Color.colorToHSV(i, this.f5388a);
        this.f5389b = Color.alpha(i);
    }

    /* JADX INFO: renamed from: a */
    public void m4402a(InterfaceC1980b interfaceC1980b) {
        this.f5390c.add(interfaceC1980b);
    }

    /* JADX INFO: renamed from: b */
    public void m4403b(int i, InterfaceC1980b interfaceC1980b) {
        Color.colorToHSV(i, this.f5388a);
        this.f5389b = Color.alpha(i);
        for (InterfaceC1980b interfaceC1980b2 : this.f5390c) {
            if (interfaceC1980b2 != interfaceC1980b) {
                interfaceC1980b2.mo4398a(this);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public int m4404c() {
        return Color.HSVToColor(this.f5389b, this.f5388a);
    }
}
