package ru.maximoff.apkeditor.translate;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;

/* JADX INFO: renamed from: ru.maximoff.apkeditor.translate.k */
/* JADX INFO: loaded from: classes.dex */
class DialogInterfaceOnClickListenerC1970k implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    private final TranslateActivity f5353a;

    DialogInterfaceOnClickListenerC1970k(TranslateActivity translateActivity) {
        this.f5353a = translateActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        Uri uri;
        switch (i) {
            case 0:
                uri = Uri.parse("https://qiwi.com/n/MAXIM0FF");
                break;
            case 1:
                uri = Uri.parse("https://yoomoney.ru/to/410013008761175");
                break;
            case 2:
                uri = Uri.parse("https://paypal.me/maxim0ff");
                break;
            case 3:
                uri = Uri.parse("https://4pda.ru/forum/index.php?act=rep&view=win_add&mid=4424665");
                break;
            default:
                uri = Uri.parse("https://4pda.ru/forum/index.php?act=rep&view=win_add&mid=4424665");
                break;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        this.f5353a.startActivity(intent);
    }
}
