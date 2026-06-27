package com.gmail.heagoo.apkeditor.util;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import com.gmail.heagoo.apkeditor.pro.R;
import java.util.List;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.util.t */
/* JADX INFO: loaded from: classes.dex */
final class C1479t extends ArrayAdapter {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ IconPickerPreference f4391a;

    /* JADX INFO: renamed from: b */
    private Context f4392b;

    /* JADX INFO: renamed from: c */
    private List f4393c;

    /* JADX INFO: renamed from: d */
    private int f4394d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1479t(IconPickerPreference iconPickerPreference, Context context, int i, List list) {
        super(context, i, list);
        this.f4391a = iconPickerPreference;
        this.f4392b = context;
        this.f4394d = i;
        this.f4393c = list;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C1482w c1482w;
        if (view == null) {
            view = ((LayoutInflater) this.f4392b.getSystemService("layout_inflater")).inflate(this.f4394d, viewGroup, false);
            c1482w = new C1482w((byte) 0);
            c1482w.f4402b = (TextView) view.findViewById(R.id.iconName);
            c1482w.f4401a = (ImageView) view.findViewById(R.id.iconImage);
            c1482w.f4403c = (RadioButton) view.findViewById(R.id.iconRadio);
            view.setTag(c1482w);
        } else {
            c1482w = (C1482w) view.getTag();
        }
        C1481v c1481v = (C1481v) this.f4393c.get(i);
        c1482w.f4402b.setText(c1481v.f4399c);
        c1482w.f4401a.setImageResource(c1481v.f4397a);
        c1482w.f4403c.setChecked(c1481v.f4398b);
        view.setOnClickListener(new ViewOnClickListenerC1480u(this, i));
        return view;
    }
}
