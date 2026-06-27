package com.gmail.heagoo.apkeditor;

import android.content.Context;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.gmail.heagoo.InterfaceC1050a;
import com.gmail.heagoo.apkeditor.p099ui.EditTextRememberCursor;
import com.gmail.heagoo.apkeditor.p099ui.LayoutObListView;
import com.gmail.heagoo.apkeditor.pro.R;
import com.gmail.heagoo.neweditor.C1594e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.hs */
/* JADX INFO: loaded from: classes.dex */
public final class C1362hs extends BaseAdapter {

    /* JADX INFO: renamed from: a */
    private Context f3974a;

    /* JADX INFO: renamed from: c */
    private WeakReference f3976c;

    /* JADX INFO: renamed from: d */
    private int f3977d;

    /* JADX INFO: renamed from: e */
    private float f3978e;

    /* JADX INFO: renamed from: h */
    private C1594e f3981h;

    /* JADX INFO: renamed from: i */
    private TextWatcher f3982i;

    /* JADX INFO: renamed from: j */
    private WeakReference f3983j;

    /* JADX INFO: renamed from: f */
    private int f3979f = -1;

    /* JADX INFO: renamed from: g */
    private boolean f3980g = true;

    /* JADX INFO: renamed from: k */
    private HandlerC1364hu f3984k = new HandlerC1364hu(this);

    /* JADX INFO: renamed from: b */
    private List f3975b = new ArrayList();

    public C1362hs(Context context, LayoutObListView layoutObListView) {
        this.f3974a = context;
        this.f3976c = new WeakReference(layoutObListView);
    }

    /* JADX INFO: renamed from: b */
    private static int m3409b(int i) {
        int i2 = 1;
        while (i >= 10) {
            i /= 10;
            i2++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: a */
    public final CharSequence m3411a() {
        StringBuilder sb = new StringBuilder();
        if (this.f3975b.size() > 0) {
            sb.append((String) this.f3975b.get(0));
            int i = 1;
            while (true) {
                int i2 = i;
                if (i2 >= this.f3975b.size()) {
                    break;
                }
                sb.append("\n");
                sb.append((String) this.f3975b.get(i2));
                i = i2 + 1;
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public final void m3412a(int i) {
        this.f3979f = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m3413a(int i, float f) {
        this.f3977d = i;
        this.f3978e = f;
    }

    /* JADX INFO: renamed from: a */
    public final void m3414a(TextWatcher textWatcher) {
        this.f3982i = textWatcher;
    }

    /* JADX INFO: renamed from: a */
    public final void m3415a(InterfaceC1050a interfaceC1050a) {
        this.f3983j = new WeakReference(interfaceC1050a);
    }

    /* JADX INFO: renamed from: a */
    public final void m3416a(C1594e c1594e) {
        this.f3981h = c1594e;
    }

    /* JADX INFO: renamed from: a */
    public final void m3417a(List list) {
        this.f3975b.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.f3975b.add((String) it.next());
        }
        ((LayoutObListView) this.f3976c.get()).m3568c();
    }

    /* JADX INFO: renamed from: a */
    public final void m3418a(boolean z) {
        this.f3980g = z;
    }

    /* JADX INFO: renamed from: b */
    public final List m3419b() {
        return this.f3975b;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f3975b.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.f3975b.get(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C1365hv c1365hv;
        String string;
        String str;
        if (view == null) {
            view = LayoutInflater.from(this.f3974a).inflate(R.layout.item_lined_text, (ViewGroup) null);
            c1365hv = new C1365hv();
            c1365hv.f3989a = (TextView) view.findViewById(R.id.line_num);
            c1365hv.f3990b = (EditTextRememberCursor) view.findViewById(R.id.text);
            view.setTag(c1365hv);
        } else {
            c1365hv = (C1365hv) view.getTag();
        }
        Object tag = c1365hv.f3990b.getTag();
        if (tag != null) {
            c1365hv.f3990b.removeTextChangedListener((C1363ht) tag);
        }
        C1363ht c1363ht = new C1363ht(this, i);
        c1365hv.f3990b.addTextChangedListener(c1363ht);
        c1365hv.f3990b.setTag(c1363ht);
        c1365hv.f3990b.m3563a(this.f3983j);
        int i2 = i + 1;
        int iM3409b = m3409b(this.f3975b.size());
        int iM3409b2 = m3409b(i2);
        if (iM3409b2 < iM3409b) {
            StringBuilder sb = new StringBuilder();
            switch (iM3409b - iM3409b2) {
                case 1:
                    str = "0";
                    break;
                case 2:
                    str = "00";
                    break;
                case 3:
                    str = "000";
                    break;
                case 4:
                    str = "0000";
                    break;
                case 5:
                    str = "00000";
                    break;
                case 6:
                    str = "000000";
                    break;
                default:
                    str = "0000000";
                    break;
            }
            string = sb.append(str).append(i2).toString();
        } else {
            string = new StringBuilder().append(i2).toString();
        }
        if (this.f3980g) {
            c1365hv.f3989a.setVisibility(0);
            c1365hv.f3989a.setText(string);
            c1365hv.f3989a.setTextColor(this.f3979f);
        } else {
            c1365hv.f3989a.setVisibility(8);
        }
        c1365hv.f3990b.setTextColor(this.f3979f);
        c1365hv.f3990b.setText((CharSequence) this.f3975b.get(i));
        if (this.f3978e > 0.0f) {
            c1365hv.f3989a.setTextSize(this.f3977d, this.f3978e);
            c1365hv.f3990b.setTextSize(this.f3977d, this.f3978e);
        }
        if (this.f3981h != null) {
            this.f3981h.m3907a(c1365hv.f3990b);
        }
        c1365hv.f3990b.setTag(R.id.text, Integer.valueOf(i));
        c1365hv.f3990b.m3562a(this.f3974a, this.f3976c);
        c1365hv.f3990b.m3561a();
        LayoutObListView layoutObListView = (LayoutObListView) this.f3976c.get();
        if (layoutObListView != null && layoutObListView.m3569d() == i) {
            c1365hv.f3990b.setSelection(layoutObListView.m3570e(), layoutObListView.m3571f());
            c1365hv.f3990b.requestFocus();
            this.f3984k.f3988a = c1365hv.f3990b;
            this.f3984k.removeMessages(0);
            this.f3984k.sendEmptyMessageDelayed(0, 100L);
        }
        return view;
    }
}
