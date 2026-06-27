package com.gmail.heagoo.apkeditor;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.gmail.heagoo.apkeditor.pro.R;
import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.dt */
/* JADX INFO: loaded from: classes.dex */
final class C1224dt extends BaseAdapter implements AdapterView.OnItemClickListener, AdapterView.OnItemLongClickListener, InterfaceC1208cz, InterfaceC1396iz {

    /* JADX INFO: renamed from: a */
    private String f3561a;

    /* JADX INFO: renamed from: d */
    private WeakReference f3564d;

    /* JADX INFO: renamed from: e */
    private InterfaceC1208cz f3565e;

    /* JADX INFO: renamed from: b */
    private List f3562b = new ArrayList();

    /* JADX INFO: renamed from: c */
    private final List f3563c = new ArrayList();

    /* JADX INFO: renamed from: f */
    private int f3566f = R.layout.item_manifestline;

    C1224dt(Activity activity, String str, InterfaceC1208cz interfaceC1208cz) {
        this.f3564d = new WeakReference(activity);
        this.f3565e = interfaceC1208cz;
        this.f3561a = str;
        m3134b();
    }

    /* JADX INFO: renamed from: a */
    public static void m3132a(Context context) {
        new AlertDialog.Builder(context).setTitle(R.string.not_available).setMessage(R.string.promote_msg).setPositiveButton(R.string.view_pro_version, new DialogInterfaceOnClickListenerC1226dv(context)).setNegativeButton(android.R.string.cancel, (DialogInterface.OnClickListener) null).show();
    }

    /* JADX INFO: renamed from: a */
    static /* synthetic */ void m3133a(C1224dt c1224dt, C1217dj c1217dj) {
        synchronized (c1224dt.f3563c) {
            c1217dj.f3549f = !c1217dj.f3549f;
            c1224dt.m3137d();
        }
        c1224dt.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: b */
    private void m3134b() {
        BufferedReader bufferedReader;
        int i;
        try {
            bufferedReader = new BufferedReader(new FileReader(this.f3561a));
            i = 0;
        } catch (Exception e) {
        }
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            C1217dj c1217dj = new C1217dj(i, line, "\t");
            this.f3562b.add(c1217dj);
            this.f3563c.add(c1217dj);
            i++;
            m3136c();
        }
        bufferedReader.close();
        m3136c();
    }

    /* JADX INFO: renamed from: b */
    static /* synthetic */ void m3135b(Context context) {
        String str = context.getPackageName() + ".pro";
        try {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + str)));
        } catch (ActivityNotFoundException e) {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://play.google.com/store/apps/details?id=" + str)));
        }
    }

    /* JADX INFO: renamed from: c */
    private void m3136c() {
        try {
            Stack stack = new Stack();
            for (int i = 0; i < this.f3563c.size(); i++) {
                C1217dj c1217dj = (C1217dj) this.f3563c.get(i);
                if (c1217dj.f3546c >= 0) {
                    if (c1217dj.f3545b.endsWith("/>")) {
                        c1217dj.f3547d = c1217dj.f3544a;
                        c1217dj.f3548e = c1217dj.f3544a;
                    } else if (c1217dj.f3545b.startsWith("</")) {
                        C1217dj c1217dj2 = (C1217dj) stack.pop();
                        c1217dj2.f3548e = c1217dj.f3544a;
                        c1217dj.f3547d = c1217dj2.f3544a;
                        c1217dj.f3548e = c1217dj.f3544a;
                    } else {
                        c1217dj.f3547d = c1217dj.f3544a;
                        stack.push(c1217dj);
                    }
                }
            }
        } catch (EmptyStackException e) {
            for (int i2 = 0; i2 < this.f3563c.size(); i2++) {
                ((C1217dj) this.f3563c.get(i2)).f3546c = 0;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    private void m3137d() {
        this.f3563c.clear();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.f3562b.size()) {
                return;
            }
            C1217dj c1217dj = (C1217dj) this.f3562b.get(i2);
            if (!c1217dj.f3550g) {
                this.f3563c.add(c1217dj);
                if (c1217dj.f3549f && c1217dj.f3548e > i2) {
                    i2 = c1217dj.f3548e;
                }
            }
            i = i2 + 1;
        }
    }

    @Override // com.gmail.heagoo.apkeditor.InterfaceC1208cz
    /* JADX INFO: renamed from: a */
    public final String mo2689a(C1217dj c1217dj) {
        boolean z;
        boolean z2;
        String strM3127a = c1217dj.m3127a();
        if ("manifest".equals(strM3127a) || "application".equals(strM3127a)) {
            z = false;
        } else if ("activity".equals(strM3127a) || "intent-filter".equals(strM3127a)) {
            int i = c1217dj.f3547d;
            while (true) {
                int i2 = i;
                if (i2 >= c1217dj.f3548e) {
                    z2 = false;
                    break;
                }
                C1217dj c1217dj2 = (C1217dj) this.f3562b.get(i2);
                if ("action".equals(c1217dj2.m3127a()) && c1217dj2.f3545b.contains("android.intent.action.MAIN")) {
                    z2 = true;
                    break;
                }
                i = i2 + 1;
            }
            z = !z2;
        } else {
            z = "action".equals(strM3127a) ? !c1217dj.f3545b.contains("android.intent.action.MAIN") : ("category".equals(strM3127a) && c1217dj.f3545b.contains("android.intent.category.LAUNCHER")) ? false : true;
        }
        if (!z) {
            return ((Activity) this.f3564d.get()).getResources().getString(R.string.section_undeletable);
        }
        int i3 = c1217dj.f3547d;
        int i4 = c1217dj.f3548e;
        StringBuilder sb = new StringBuilder();
        synchronized (this.f3563c) {
            for (int i5 = 0; i5 < this.f3562b.size(); i5++) {
                C1217dj c1217dj3 = (C1217dj) this.f3562b.get(i5);
                if (c1217dj3.f3544a >= i3 && c1217dj3.f3544a <= i4) {
                    c1217dj3.f3550g = true;
                }
                if (!c1217dj3.f3550g) {
                    sb.append(c1217dj3.f3545b);
                    sb.append('\n');
                }
            }
            m3137d();
        }
        notifyDataSetChanged();
        if (this.f3565e != null) {
            this.f3565e.mo2723i(sb.toString());
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    final void m3138a() {
        synchronized (this.f3563c) {
            this.f3562b.clear();
            this.f3563c.clear();
            m3134b();
        }
        notifyDataSetChanged();
    }

    @Override // com.gmail.heagoo.apkeditor.InterfaceC1396iz
    /* JADX INFO: renamed from: a */
    public final void mo3139a(int i, String str) {
        StringBuilder sb = new StringBuilder();
        synchronized (this) {
            for (C1217dj c1217dj : this.f3562b) {
                if (c1217dj.f3544a == i) {
                    c1217dj.f3545b = str;
                }
                if (!c1217dj.f3550g) {
                    sb.append(c1217dj.f3545b);
                    sb.append('\n');
                }
            }
            Iterator it = this.f3563c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C1217dj c1217dj2 = (C1217dj) it.next();
                if (c1217dj2.f3544a == i) {
                    c1217dj2.f3545b = str;
                    break;
                }
            }
        }
        notifyDataSetChanged();
        if (this.f3565e != null) {
            this.f3565e.mo2723i(sb.toString());
        }
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f3563c.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.f3563c.get(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    @SuppressLint({"InflateParams"})
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C1217dj c1217dj;
        C1227dw c1227dw;
        synchronized (this.f3563c) {
            c1217dj = (C1217dj) this.f3563c.get(i);
        }
        if (view == null) {
            view = LayoutInflater.from((Context) this.f3564d.get()).inflate(this.f3566f, (ViewGroup) null);
            c1227dw = new C1227dw((byte) 0);
            c1227dw.f3571b = (ImageView) view.findViewById(R.id.collapse_icon);
            c1227dw.f3570a = (TextView) view.findViewById(R.id.line_data);
            view.setTag(c1227dw);
        } else {
            c1227dw = (C1227dw) view.getTag();
        }
        c1227dw.f3570a.setText(c1217dj.f3545b);
        if (c1217dj.f3546c > 0) {
            c1227dw.f3571b.setVisibility(0);
            ImageView imageView = c1227dw.f3571b;
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(c1217dj.f3546c * 48, 48, Bitmap.Config.ALPHA_8);
            if (c1217dj.f3548e != c1217dj.f3544a) {
                new Canvas(bitmapCreateBitmap).drawBitmap(!c1217dj.f3549f ? BitmapFactory.decodeResource(((Activity) this.f3564d.get()).getResources(), R.drawable.arrow_down) : BitmapFactory.decodeResource(((Activity) this.f3564d.get()).getResources(), R.drawable.arrow_right), r4 - 40, 8.0f, new Paint());
            }
            imageView.setImageBitmap(bitmapCreateBitmap);
            c1227dw.f3571b.setOnClickListener(new ViewOnClickListenerC1225du(this, c1217dj));
        } else {
            c1227dw.f3571b.setVisibility(8);
        }
        return view;
    }

    @Override // com.gmail.heagoo.apkeditor.InterfaceC1208cz
    /* JADX INFO: renamed from: i */
    public final void mo2723i(String str) {
        if (this.f3565e != null) {
            this.f3565e.mo2723i(str);
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        C1217dj c1217dj = null;
        try {
            c1217dj = (C1217dj) this.f3563c.get(i);
        } catch (Exception e) {
        }
        if (c1217dj != null) {
            new DialogC1395iy((Context) this.f3564d.get(), this, c1217dj.f3544a, c1217dj.f3545b).show();
        }
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public final boolean onItemLongClick(AdapterView adapterView, View view, int i, long j) {
        C1217dj c1217dj = null;
        try {
            c1217dj = (C1217dj) this.f3563c.get(i);
        } catch (Exception e) {
        }
        new DialogC1228dx((Activity) this.f3564d.get(), this.f3561a, c1217dj, this).show();
        return true;
    }
}
