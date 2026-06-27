package com.gmail.heagoo.apkeditor;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.os.Environment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.gmail.heagoo.apkeditor.pro.R;
import com.gmail.heagoo.common.C1559h;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p000a.p001a.p003b.p004a.p005a.C0027x;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.ce */
/* JADX INFO: loaded from: classes.dex */
public final class DialogC1190ce extends Dialog implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    private List f3479a;

    /* JADX INFO: renamed from: b */
    private String f3480b;

    /* JADX INFO: renamed from: c */
    private String f3481c;

    /* JADX INFO: renamed from: d */
    private String f3482d;

    /* JADX INFO: renamed from: e */
    private Map f3483e;

    /* JADX INFO: renamed from: f */
    private HandlerC1193ch f3484f;

    /* JADX INFO: renamed from: g */
    private View f3485g;

    /* JADX INFO: renamed from: h */
    private String f3486h;

    /* JADX INFO: renamed from: i */
    private String f3487i;

    /* JADX INFO: renamed from: j */
    private int f3488j;

    /* JADX INFO: renamed from: k */
    private String f3489k;

    public DialogC1190ce(Context context, String str, String str2, String str3, String str4, Map map) {
        super(context);
        this.f3484f = new HandlerC1193ch(this);
        requestWindowFeature(1);
        C1192cg c1192cg = new C1192cg();
        c1192cg.f3491a = str;
        c1192cg.f3493c = false;
        c1192cg.f3492b = new File(str).isDirectory();
        this.f3479a = new ArrayList();
        this.f3479a.add(c1192cg);
        this.f3480b = null;
        this.f3482d = null;
        this.f3483e = null;
        if (str2 != null) {
            this.f3481c = str2;
        } else {
            this.f3481c = Environment.getExternalStorageDirectory().getPath() + "/ApkEditor";
        }
        m3099a(context);
    }

    public DialogC1190ce(Context context, String str, String str2, Map map, List list, String str3) {
        super(context);
        this.f3484f = new HandlerC1193ch(this);
        requestWindowFeature(1);
        this.f3480b = str;
        this.f3482d = str2;
        this.f3483e = map;
        this.f3479a = list;
        this.f3481c = str3;
        m3099a(context);
    }

    /* JADX INFO: renamed from: a */
    public static File m3097a(String str, boolean z) {
        String str2;
        String strSubstring;
        String strSubstring2;
        int i = 1;
        if (z) {
            str2 = null;
            strSubstring = null;
            strSubstring2 = null;
        } else {
            int iLastIndexOf = str.lastIndexOf(47);
            strSubstring2 = str.substring(0, iLastIndexOf + 1);
            strSubstring = str.substring(iLastIndexOf + 1);
            int iLastIndexOf2 = strSubstring.lastIndexOf(46);
            if (iLastIndexOf2 != -1) {
                String strSubstring3 = strSubstring.substring(0, iLastIndexOf2);
                String strSubstring4 = strSubstring.substring(iLastIndexOf2);
                strSubstring = strSubstring3;
                str2 = strSubstring4;
            } else {
                str2 = "";
            }
        }
        while (true) {
            File file = new File(z ? str + "(" + i + ")" : strSubstring2 + strSubstring + "(" + i + ")" + str2);
            if (!file.exists()) {
                return file;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m3099a(Context context) {
        this.f3488j = SettingActivity.m2812g(context);
        Resources resources = context.getResources();
        this.f3486h = resources.getString(R.string.save_succeed_1);
        this.f3487i = resources.getString(R.string.failed_1);
        this.f3485g = LayoutInflater.from(context).inflate(R.layout.dlg_extractres, (ViewGroup) null);
        setContentView(this.f3485g);
        ((Button) this.f3485g.findViewById(R.id.close_button)).setOnClickListener(this);
    }

    /* JADX INFO: renamed from: a */
    private void m3100a(File file, File file2) throws Throwable {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file3 : fileArrListFiles) {
                if (file3.isFile()) {
                    m3103b(file3, new File(file2, file3.getName()));
                } else {
                    File file4 = new File(file2, file3.getName());
                    file4.mkdir();
                    m3100a(file3, file4);
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private static String m3102b(String str) {
        return str.substring(str.lastIndexOf(47) + 1);
    }

    /* JADX INFO: renamed from: b */
    private void m3103b(File file, File file2) throws Throwable {
        String name = file.getName();
        if (this.f3480b == null || (!name.endsWith(".jpg") && (!name.endsWith(".png") || name.endsWith(".9.png")))) {
            C1559h.m3771a(file, file2);
            return;
        }
        String strSubstring = file.getPath().substring(this.f3482d.length() + 1);
        String str = (String) this.f3483e.get(strSubstring);
        if (str == null) {
            str = strSubstring;
        }
        C0027x.m34b(this.f3480b, str, file2.getPath());
    }

    /* JADX INFO: renamed from: a */
    public final void m3104a() {
        TextView textView = (TextView) this.f3485g.findViewById(R.id.result_tv);
        if (this.f3479a.size() == 1) {
            textView.setText(String.format(this.f3486h, this.f3489k));
        } else {
            textView.setText(String.format(this.f3486h, this.f3481c));
        }
        this.f3485g.findViewById(R.id.layout_done).setVisibility(0);
    }

    /* JADX INFO: renamed from: a */
    protected final void m3105a(C1192cg c1192cg) throws Throwable {
        String path = this.f3481c + "/" + m3102b(c1192cg.f3491a);
        if (new File(path).exists() && this.f3488j == 0) {
            path = m3097a(path, c1192cg.f3492b).getPath();
        }
        if (c1192cg.f3492b) {
            C0027x.m30a(this.f3480b, c1192cg.f3491a, path);
        } else {
            C0027x.m34b(this.f3480b, c1192cg.f3491a, path);
        }
        this.f3489k = path;
    }

    /* JADX INFO: renamed from: a */
    public final void m3106a(String str) {
        ((TextView) this.f3485g.findViewById(R.id.result_tv)).setText(String.format(this.f3487i, str));
        this.f3485g.findViewById(R.id.layout_done).setVisibility(0);
    }

    /* JADX INFO: renamed from: b */
    protected final void m3107b(C1192cg c1192cg) throws Throwable {
        String str = this.f3481c + "/" + m3102b(c1192cg.f3491a);
        File file = new File(c1192cg.f3491a);
        if (!file.isDirectory()) {
            File file2 = new File(str);
            if (file2.exists() && this.f3488j == 0) {
                file2 = m3097a(str, false);
            }
            m3103b(new File(c1192cg.f3491a), file2);
            this.f3489k = file2.getPath();
            return;
        }
        File file3 = new File(str);
        if (!file3.exists()) {
            file3.mkdirs();
        } else if (this.f3488j == 0) {
            file3 = m3097a(str, true);
            file3.mkdirs();
        }
        m3100a(file, file3);
        this.f3489k = file3.getPath();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view.getId() == R.id.close_button) {
            dismiss();
        }
    }

    @Override // android.app.Dialog
    public final void show() {
        new C1191cf(this).start();
        super.show();
    }
}
