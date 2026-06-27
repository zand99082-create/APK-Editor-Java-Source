package com.gmail.heagoo.sqliteutil.p102a;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewCompat;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import com.gmail.heagoo.sqliteutil.C1627a;
import java.util.ArrayList;
import java.util.List;
import p000a.p001a.p003b.p004a.C0037k;

/* JADX INFO: renamed from: com.gmail.heagoo.sqliteutil.a.b */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC1629b implements View.OnClickListener, View.OnTouchListener {

    /* JADX INFO: renamed from: a */
    private Context f4973a;

    /* JADX INFO: renamed from: b */
    private TableLayout f4974b;

    /* JADX INFO: renamed from: c */
    private ArrayList f4975c;

    /* JADX INFO: renamed from: d */
    private List f4976d;

    /* JADX INFO: renamed from: e */
    private TableRow f4977e;

    /* JADX INFO: renamed from: f */
    private C1627a f4978f = null;

    /* JADX INFO: renamed from: g */
    private InterfaceC1630c f4979g;

    /* JADX INFO: renamed from: h */
    private TableLayout.LayoutParams f4980h;

    /* JADX INFO: renamed from: i */
    private TableRow.LayoutParams f4981i;

    /* JADX INFO: renamed from: j */
    private TableRow[] f4982j;

    /* JADX INFO: renamed from: k */
    private View[] f4983k;

    /* JADX INFO: renamed from: l */
    private boolean f4984l;

    /* JADX INFO: renamed from: m */
    private int f4985m;

    /* JADX INFO: renamed from: n */
    private int f4986n;

    /* JADX INFO: renamed from: o */
    private int f4987o;

    /* JADX INFO: renamed from: p */
    private int f4988p;

    /* JADX INFO: renamed from: q */
    private int f4989q;

    /* JADX INFO: renamed from: r */
    private int f4990r;

    public ViewOnClickListenerC1629b(Context context, C1627a c1627a, TableLayout tableLayout, InterfaceC1630c interfaceC1630c, boolean z) {
        this.f4985m = -1;
        this.f4986n = -13421773;
        this.f4987o = -1445124;
        this.f4988p = -3355444;
        this.f4989q = -1;
        this.f4990r = -8409217;
        this.f4973a = context;
        this.f4974b = tableLayout;
        this.f4979g = interfaceC1630c;
        if (z) {
            this.f4985m = -13421773;
            this.f4986n = -3355444;
            this.f4987o = ViewCompat.MEASURED_STATE_MASK;
            this.f4988p = -8355712;
            this.f4989q = -1;
            this.f4990r = -8409217;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m4019a() {
        this.f4980h = new TableLayout.LayoutParams(-2, -2);
        this.f4981i = new TableRow.LayoutParams(-2, -2);
        this.f4981i.setMargins(8, 0, 8, 0);
        int size = this.f4976d.size();
        int size2 = this.f4975c.size();
        this.f4982j = new TableRow[size];
        TextView[] textViewArr = new TextView[size2];
        this.f4983k = new View[size];
        for (int i = 0; i < size; i++) {
            List list = (List) this.f4976d.get(i);
            this.f4982j[i] = new TableRow(this.f4973a);
            this.f4982j[i].setId(i);
            for (int i2 = 0; i2 < size2; i2++) {
                textViewArr[i2] = new TextView(this.f4973a);
                textViewArr[i2].setTextSize(1, 12.0f);
                textViewArr[i2].setTextColor(ContextCompat.getColor(this.f4973a, C0037k.mdTextMedium(C0037k.m89a(this.f4973a))));
                textViewArr[i2].setText((CharSequence) list.get(i2));
            }
            for (int i3 = 0; i3 < size2; i3++) {
                this.f4982j[i].addView(textViewArr[i3], i3, this.f4981i);
            }
            this.f4983k[i] = new View(this.f4973a);
            this.f4983k[i].setBackgroundColor(ContextCompat.getColor(this.f4973a, C0037k.mdTextSmall(C0037k.m89a(this.f4973a))));
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m4020a(ArrayList arrayList) {
        this.f4975c = arrayList;
    }

    /* JADX INFO: renamed from: a */
    public final void m4021a(List list) {
        this.f4976d = list;
    }

    /* JADX INFO: renamed from: b */
    public final void m4022b() {
        this.f4974b.removeAllViews();
        this.f4984l = true;
        this.f4977e = new TableRow(this.f4973a);
        for (int i = 0; i < this.f4975c.size(); i++) {
            TextView textView = new TextView(this.f4973a);
            textView.setTextSize(1, 12.0f);
            textView.setTextColor(ContextCompat.getColor(this.f4973a, C0037k.mdTextMedium(C0037k.m89a(this.f4973a))));
            textView.setText((CharSequence) this.f4975c.get(i));
            this.f4977e.addView(textView, this.f4981i);
        }
        this.f4977e.setBackgroundColor(ContextCompat.getColor(this.f4973a, C0037k.mdAccent(C0037k.m89a(this.f4973a))));
        this.f4974b.addView(this.f4977e, this.f4980h);
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-1, -2);
        TableRow.LayoutParams layoutParams2 = new TableRow.LayoutParams(-1, 1);
        for (int i2 = 0; i2 < this.f4976d.size(); i2++) {
            this.f4974b.addView(this.f4982j[i2], (i2 * 2) + 1, layoutParams);
            this.f4982j[i2].setOnClickListener(this);
            this.f4982j[i2].setOnTouchListener(this);
            this.f4974b.addView(this.f4983k[i2], (i2 * 2) + 2, layoutParams2);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m4023b(List list) {
        int size = list.size();
        int size2 = this.f4975c.size();
        for (int i = 0; i < size; i++) {
            ArrayList arrayList = (ArrayList) list.get(i);
            for (int i2 = 0; i2 < size2; i2++) {
                ((TextView) this.f4982j[i].getChildAt(i2)).setText((CharSequence) arrayList.get(i2));
            }
            this.f4982j[i].setVisibility(0);
            this.f4983k[i].setVisibility(0);
        }
        for (int i3 = size; i3 < this.f4976d.size(); i3++) {
            this.f4982j[i3].setVisibility(8);
            this.f4983k[i3].setVisibility(8);
        }
        this.f4984l = false;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id = view.getId();
        if (this.f4979g != null) {
            this.f4979g.mo3650a(id, this.f4984l);
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            view.setBackgroundColor(ContextCompat.getColor(this.f4973a, C0037k.mdRipple(C0037k.m89a(this.f4973a))));
        } else if (action == 1) {
            view.setBackgroundColor(0);
            view.performClick();
        } else if ((action & 1) != 0 || (action & 4) != 0) {
            view.setBackgroundColor(0);
        }
        return true;
    }
}
