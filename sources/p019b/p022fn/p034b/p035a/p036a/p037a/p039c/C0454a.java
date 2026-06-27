package p019b.p022fn.p034b.p035a.p036a.p037a.p039c;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.gmail.heagoo.apkeditor.pro.R;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import p019b.p022fn.p034b.p035a.p036a.p037a.p038b.C0451b;
import p019b.p022fn.p034b.p035a.p036a.p037a.p038b.C0452c;
import p019b.p022fn.p034b.p035a.p036a.p037a.p038b.C0453d;

/* JADX INFO: renamed from: b.fn.b.a.a.a.c.a */
/* JADX INFO: loaded from: classes.dex */
public class C0454a extends ArrayAdapter<File> {

    /* JADX INFO: renamed from: e */
    private static SimpleDateFormat f578e;

    /* JADX INFO: renamed from: a */
    private List<File> f579a;

    /* JADX INFO: renamed from: b */
    private Drawable f580b;

    /* JADX INFO: renamed from: c */
    private Drawable f581c;

    /* JADX INFO: renamed from: d */
    private Context f582d;

    public C0454a(Context context, List<File> list, int i, String str) {
        super(context, i, R.id.dup_0x7f030009, list);
        this.f580b = null;
        this.f581c = null;
        m508a(list, str);
        this.f582d = context;
    }

    /* JADX INFO: renamed from: a */
    private void m508a(List<File> list, String str) {
        f578e = new SimpleDateFormat((str == null || "".equals(str.trim())) ? "yyyy/MM/dd HH:mm:ss" : str.trim());
        this.f579a = list;
        this.f580b = Build.VERSION.SDK_INT >= 21 ? getContext().getDrawable(R.drawable.dup_0x7f020001) : getContext().getResources().getDrawable(R.drawable.dup_0x7f020001);
        this.f581c = Build.VERSION.SDK_INT >= 21 ? getContext().getDrawable(R.drawable.fnAntiSplit) : getContext().getResources().getDrawable(R.drawable.fnAntiSplit);
        this.f580b = new C0453d(this.f580b, 24.0f, 24.0f);
        this.f581c = new C0453d(this.f581c, 24.0f, 24.0f);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        Drawable drawableM506a;
        SimpleDateFormat simpleDateFormat;
        Date date;
        ViewGroup viewGroup2 = (ViewGroup) super.getView(i, view, viewGroup);
        TextView textView = (TextView) viewGroup2.findViewById(R.id.dup_0x7f030009);
        TextView textView2 = (TextView) viewGroup2.findViewById(R.id.dup_0x7f03000c);
        TextView textView3 = (TextView) viewGroup2.findViewById(R.id.dup_0x7f03000b);
        textView3.setVisibility(0);
        File file = this.f579a.get(i);
        textView.setText(file.getName());
        if (file.isDirectory()) {
            textView.setCompoundDrawablesWithIntrinsicBounds(this.f580b, (Drawable) null, (Drawable) null, (Drawable) null);
            textView2.setText("");
            if (this.f579a.get(i).getName().trim().equals("..")) {
                textView3.setVisibility(8);
                return viewGroup2;
            }
            simpleDateFormat = f578e;
            date = new Date(file.lastModified());
        } else {
            if (file.getPath().endsWith(".apk")) {
                drawableM506a = C0452c.m506a(this.f582d, file.getPath());
                if (drawableM506a != null) {
                    drawableM506a = new C0453d(drawableM506a, 24.0f, 24.0f);
                }
            } else {
                drawableM506a = null;
            }
            if (drawableM506a == null) {
                drawableM506a = this.f581c;
            }
            textView.setCompoundDrawablesWithIntrinsicBounds(drawableM506a, (Drawable) null, (Drawable) null, (Drawable) null);
            textView2.setText(C0451b.m502a(file.length()));
            simpleDateFormat = f578e;
            date = new Date(file.lastModified());
        }
        textView3.setText(simpleDateFormat.format(date));
        return viewGroup2;
    }
}
