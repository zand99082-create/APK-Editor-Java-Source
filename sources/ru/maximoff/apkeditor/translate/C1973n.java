package ru.maximoff.apkeditor.translate;

import com.gmail.heagoo.apkeditor.translate.TranslateItem;
import java.util.Map;

/* JADX INFO: renamed from: ru.maximoff.apkeditor.translate.n */
/* JADX INFO: loaded from: classes.dex */
class C1973n implements InterfaceC1977r {

    /* JADX INFO: renamed from: a */
    private final TranslateActivity f5356a;

    C1973n(TranslateActivity translateActivity) {
        this.f5356a = translateActivity;
    }

    /* JADX INFO: renamed from: a */
    static TranslateActivity m4379a(C1973n c1973n) {
        return c1973n.f5356a;
    }

    @Override // ru.maximoff.apkeditor.translate.InterfaceC1977r
    /* JADX INFO: renamed from: a */
    public void mo4380a(String str) {
        this.f5356a.m4326a(this.f5356a.getString(2131099668));
    }

    @Override // ru.maximoff.apkeditor.translate.InterfaceC1977r
    /* JADX INFO: renamed from: a */
    public void mo4381a(Map map) {
        if (this.f5356a.f5295d.isEmpty() && !map.isEmpty()) {
            this.f5356a.f5295d.putAll(map);
        }
        for (TranslateItem translateItem : this.f5356a.f5312u) {
            if (TranslateActivity.f5292a) {
                this.f5356a.m4350e();
                return;
            }
            if (this.f5356a.m4343c(translateItem.originValue)) {
                translateItem.translatedValue = translateItem.originValue;
                this.f5356a.m4337b(translateItem);
            } else {
                C1962c c1962c = new C1962c(this.f5356a, this.f5356a.f5299h, this.f5356a.f5298g, translateItem.originValue);
                c1962c.m4372a(this.f5356a.f5296e);
                c1962c.m4373a(map);
                c1962c.m4375a(this.f5356a.f5293b);
                c1962c.m4374a(new C1974o(this, translateItem));
                c1962c.m4371a();
            }
        }
    }
}
