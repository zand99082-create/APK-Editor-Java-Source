package p019b.p022fn.p034b.p035a.p036a.p037a;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Environment;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.gmail.heagoo.apkeditor.pro.R;
import jadx.core.deobf.Deobfuscator;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import p019b.p022fn.p034b.p035a.p036a.p037a.p038b.C0450a;
import p019b.p022fn.p034b.p035a.p036a.p037a.p039c.C0454a;

/* JADX INFO: renamed from: b.fn.b.a.a.a.a */
/* JADX INFO: loaded from: classes.dex */
public class DialogInterfaceOnClickListenerC0449a implements AdapterView.OnItemClickListener, DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: u */
    private static final FileFilter f549u = new d();

    /* JADX INFO: renamed from: v */
    private static final FileFilter f550v = new e();

    /* JADX INFO: renamed from: w */
    private static final j f551w = new f();

    /* JADX INFO: renamed from: x */
    private static final i f552x = new g();

    /* JADX INFO: renamed from: b */
    private File f554b;

    /* JADX INFO: renamed from: c */
    private Context f555c;

    /* JADX INFO: renamed from: d */
    private AlertDialog f556d;

    /* JADX INFO: renamed from: e */
    private ListView f557e;

    /* JADX INFO: renamed from: g */
    private boolean f559g;

    /* JADX INFO: renamed from: h */
    private FileFilter f560h;

    /* JADX INFO: renamed from: o */
    private String f567o;

    /* JADX INFO: renamed from: p */
    private DialogInterface.OnClickListener f568p;

    /* JADX INFO: renamed from: q */
    private DialogInterface.OnCancelListener f569q;

    /* JADX INFO: renamed from: s */
    private j f571s;

    /* JADX INFO: renamed from: t */
    private i f572t;

    /* JADX INFO: renamed from: a */
    private List<File> f553a = new ArrayList();

    /* JADX INFO: renamed from: f */
    private k f558f = null;

    /* JADX INFO: renamed from: i */
    private int f561i = R.string.dup_0x7f060002;

    /* JADX INFO: renamed from: j */
    private int f562j = R.string.dup_0x7f060023;

    /* JADX INFO: renamed from: k */
    private int f563k = R.string.dup_0x7f060003;

    /* JADX INFO: renamed from: l */
    private int f564l = -1;

    /* JADX INFO: renamed from: m */
    private int f565m = -1;

    /* JADX INFO: renamed from: n */
    private int f566n = -1;

    /* JADX INFO: renamed from: r */
    private h f570r = null;

    /* JADX INFO: renamed from: b.fn.b.a.a.a.a$a */
    class a implements DialogInterface.OnClickListener {
        a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            if (DialogInterfaceOnClickListenerC0449a.this.f558f != null && DialogInterfaceOnClickListenerC0449a.this.f559g) {
                DialogInterfaceOnClickListenerC0449a.this.f558f.mo501a(DialogInterfaceOnClickListenerC0449a.this.f554b.getAbsolutePath(), DialogInterfaceOnClickListenerC0449a.this.f554b);
            }
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: renamed from: b.fn.b.a.a.a.a$b */
    class b implements DialogInterface.OnClickListener {
        b(DialogInterfaceOnClickListenerC0449a dialogInterfaceOnClickListenerC0449a) {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.cancel();
        }
    }

    /* JADX INFO: renamed from: b.fn.b.a.a.a.a$c */
    class c implements Comparator<File> {
        c(DialogInterfaceOnClickListenerC0449a dialogInterfaceOnClickListenerC0449a) {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(File file, File file2) {
            return file.getName().toLowerCase().compareTo(file2.getName().toLowerCase());
        }
    }

    /* JADX INFO: renamed from: b.fn.b.a.a.a.a$d */
    static class d implements FileFilter {
        d() {
        }

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return file.isDirectory();
        }
    }

    /* JADX INFO: renamed from: b.fn.b.a.a.a.a$e */
    static class e implements FileFilter {
        e() {
        }

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return !file.isHidden();
        }
    }

    /* JADX INFO: renamed from: b.fn.b.a.a.a.a$f */
    static class f implements j {
        f() {
        }

        @Override // p019b.p022fn.p034b.p035a.p036a.p037a.DialogInterfaceOnClickListenerC0449a.j
        /* JADX INFO: renamed from: a */
        public boolean mo498a(File file) {
            return file != null && file.canRead();
        }
    }

    /* JADX INFO: renamed from: b.fn.b.a.a.a.a$g */
    static class g implements i {
        g() {
        }

        @Override // p019b.p022fn.p034b.p035a.p036a.p037a.DialogInterfaceOnClickListenerC0449a.i
        /* JADX INFO: renamed from: a */
        public boolean mo499a(File file) {
            return true;
        }
    }

    /* JADX INFO: renamed from: b.fn.b.a.a.a.a$h */
    public interface h {
        /* JADX INFO: renamed from: a */
        void m500a(C0454a c0454a);
    }

    /* JADX INFO: renamed from: b.fn.b.a.a.a.a$i */
    public interface i {
        /* JADX INFO: renamed from: a */
        boolean mo499a(File file);
    }

    /* JADX INFO: renamed from: b.fn.b.a.a.a.a$j */
    public interface j {
        /* JADX INFO: renamed from: a */
        boolean mo498a(File file);
    }

    /* JADX INFO: renamed from: b.fn.b.a.a.a.a$k */
    public interface k {
        /* JADX INFO: renamed from: a */
        void mo501a(String str, File file);
    }

    /* JADX INFO: renamed from: c */
    private void m488c() {
        this.f553a.clear();
        File[] fileArrListFiles = this.f554b.listFiles(this.f560h);
        if (this.f554b.getParent() != null) {
            this.f553a.add(new File(".."));
        }
        if (fileArrListFiles != null) {
            LinkedList linkedList = new LinkedList();
            for (File file : fileArrListFiles) {
                if (file.isDirectory() && !file.getName().startsWith(Deobfuscator.CLASS_NAME_SEPARATOR)) {
                    linkedList.add(file);
                }
            }
            m495a(linkedList);
            this.f553a.addAll(linkedList);
            LinkedList linkedList2 = new LinkedList();
            for (File file2 : fileArrListFiles) {
                if (!file2.isDirectory() && !file2.getName().startsWith(Deobfuscator.CLASS_NAME_SEPARATOR)) {
                    linkedList2.add(file2);
                }
            }
            m495a(linkedList2);
            this.f553a.addAll(linkedList2);
        }
    }

    /* JADX INFO: renamed from: d */
    private C0454a m489d() {
        m488c();
        Context context = this.f555c;
        List<File> list = this.f553a;
        int i2 = this.f566n;
        if (i2 == -1) {
            i2 = R.layout.dup_0x7f040001;
        }
        C0454a c0454a = new C0454a(context, list, i2, this.f567o);
        h hVar = this.f570r;
        if (hVar != null) {
            hVar.m500a(c0454a);
        }
        ListView listView = this.f557e;
        if (listView != null) {
            listView.setAdapter((ListAdapter) c0454a);
        }
        return c0454a;
    }

    /* JADX INFO: renamed from: a */
    public DialogInterfaceOnClickListenerC0449a m490a() {
        if (this.f561i == 0 || this.f562j == 0 || this.f563k == 0) {
            throw new RuntimeException("withResources() should be called at first.");
        }
        C0454a c0454aM489d = m489d();
        h hVar = this.f570r;
        if (hVar != null) {
            hVar.m500a(c0454aM489d);
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f555c);
        builder.setTitle(this.f561i);
        builder.setAdapter(c0454aM489d, this);
        int i2 = this.f564l;
        if (i2 != -1) {
            builder.setIcon(i2);
        }
        int i3 = this.f565m;
        if (-1 != i3 && Build.VERSION.SDK_INT >= 21) {
            builder.setView(i3);
        }
        if (this.f559g) {
            builder.setPositiveButton(this.f562j, new a());
        }
        if (this.f568p == null) {
            this.f568p = new b(this);
        }
        builder.setNegativeButton(this.f563k, this.f568p);
        DialogInterface.OnCancelListener onCancelListener = this.f569q;
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        AlertDialog alertDialogCreate = builder.create();
        this.f556d = alertDialogCreate;
        ListView listView = alertDialogCreate.getListView();
        this.f557e = listView;
        listView.setOnItemClickListener(this);
        return this;
    }

    /* JADX INFO: renamed from: a */
    public DialogInterfaceOnClickListenerC0449a m491a(Context context) {
        this.f555c = context;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public DialogInterfaceOnClickListenerC0449a m492a(k kVar) {
        this.f558f = kVar;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public DialogInterfaceOnClickListenerC0449a m493a(String str) {
        if (str != null) {
            this.f554b = new File(str);
        } else {
            this.f554b = Environment.getExternalStorageDirectory();
        }
        if (!this.f554b.isDirectory()) {
            this.f554b = this.f554b.getParentFile();
        }
        if (this.f554b == null) {
            this.f554b = Environment.getExternalStorageDirectory();
        }
        return this;
    }

    /* JADX INFO: renamed from: a */
    public DialogInterfaceOnClickListenerC0449a m494a(boolean z, boolean z2, String... strArr) {
        this.f559g = z;
        if (strArr == null) {
            this.f560h = z ? f549u : f550v;
        } else {
            this.f560h = new C0450a(z, z2, strArr);
        }
        return this;
    }

    /* JADX INFO: renamed from: a */
    void m495a(List<File> list) {
        Collections.sort(list, new c(this));
    }

    /* JADX INFO: renamed from: b */
    public DialogInterfaceOnClickListenerC0449a m496b() {
        AlertDialog alertDialog = this.f556d;
        if (alertDialog == null || this.f557e == null) {
            throw new RuntimeException("call build() before show().");
        }
        alertDialog.show();
        return this;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i2) {
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004c A[PHI: r1
      0x004c: PHI (r1v7 java.io.File) = (r1v5 java.io.File), (r1v9 java.io.File) binds: [B:20:0x004a, B:12:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.widget.AdapterView.OnItemClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
        k kVar;
        if (i2 < 0 || i2 >= this.f553a.size()) {
            return;
        }
        File parentFile = this.f553a.get(i2);
        if (parentFile.getName().equals("..")) {
            parentFile = this.f554b.getParentFile();
            if (this.f571s == null) {
                this.f571s = f551w;
            }
            if (this.f571s.mo498a(parentFile)) {
                this.f554b = parentFile;
            }
        } else if (parentFile.isDirectory()) {
            if (this.f572t == null) {
                this.f572t = f552x;
            }
            if (this.f572t.mo499a(parentFile)) {
            }
        } else if (!this.f559g && (kVar = this.f558f) != null) {
            kVar.mo501a(parentFile.getAbsolutePath(), parentFile);
            this.f556d.dismiss();
            return;
        }
        m489d();
    }
}
