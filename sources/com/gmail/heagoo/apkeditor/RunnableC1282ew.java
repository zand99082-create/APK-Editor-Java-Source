package com.gmail.heagoo.apkeditor;

import android.support.v4.internal.view.SupportMenu;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.ew */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1282ew implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ boolean f3729a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ String f3730b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ boolean f3731c;

    /* JADX INFO: renamed from: d */
    private /* synthetic */ DialogC1280eu f3732d;

    RunnableC1282ew(DialogC1280eu dialogC1280eu, boolean z, String str, boolean z2) {
        this.f3732d = dialogC1280eu;
        this.f3729a = z;
        this.f3730b = str;
        this.f3731c = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f3729a) {
            SpannableString spannableString = new SpannableString(this.f3730b);
            spannableString.setSpan(new ForegroundColorSpan(SupportMenu.CATEGORY_MASK), 0, this.f3730b.length(), 33);
            this.f3732d.f3723j.append(spannableString);
        } else {
            if (!this.f3731c) {
                this.f3732d.f3723j.append(this.f3730b);
                return;
            }
            SpannableString spannableString2 = new SpannableString(this.f3730b);
            spannableString2.setSpan(new StyleSpan(1), 0, this.f3730b.length(), 33);
            this.f3732d.f3723j.append(spannableString2);
        }
    }
}
