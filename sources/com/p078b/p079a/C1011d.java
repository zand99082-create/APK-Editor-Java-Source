package com.p078b.p079a;

import android.widget.SeekBar;

/* JADX INFO: renamed from: com.b.a.d */
/* JADX INFO: loaded from: classes.dex */
final class C1011d implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ C1008a f2627a;

    C1011d(C1008a c1008a) {
        this.f2627a = c1008a;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        this.f2627a.f2615a.removeMessages(0);
        this.f2627a.f2615a.sendEmptyMessageDelayed(0, 100L);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
    }
}
