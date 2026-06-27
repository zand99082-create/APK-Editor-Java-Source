package com.gmail.heagoo.apkeditor;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;
import com.gmail.heagoo.common.C1557f;
import java.util.List;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.ep */
/* JADX INFO: loaded from: classes.dex */
final class C1275ep extends BaseExpandableListAdapter {

    /* JADX INFO: renamed from: a */
    private Context f3701a;

    /* JADX INFO: renamed from: b */
    private List f3702b;

    public C1275ep(Context context, List list) {
        this.f3701a = context;
        this.f3702b = list;
    }

    @Override // android.widget.ExpandableListAdapter
    public final Object getChild(int i, int i2) {
        return ((C1276eq) this.f3702b.get(i)).m3242a(this.f3701a, i2);
    }

    @Override // android.widget.ExpandableListAdapter
    public final long getChildId(int i, int i2) {
        return (i << 16) | i2;
    }

    @Override // android.widget.ExpandableListAdapter
    public final View getChildView(int i, int i2, boolean z, View view, ViewGroup viewGroup) {
        String strM3242a = ((C1276eq) this.f3702b.get(i)).m3242a(this.f3701a, i2);
        View textView = view == null ? new TextView(this.f3701a) : view;
        ((TextView) textView).setPadding(C1557f.m3764a(this.f3701a, 48.0f), 0, 0, 0);
        ((TextView) textView).setText(strM3242a);
        return textView;
    }

    @Override // android.widget.ExpandableListAdapter
    public final int getChildrenCount(int i) {
        C1276eq c1276eq = (C1276eq) this.f3702b.get(i);
        if (c1276eq.f3704b < 0 && c1276eq.f3705c < 0 && c1276eq.f3706d < 0) {
            return 1;
        }
        if (c1276eq.f3704b == 0 && c1276eq.f3705c == 0 && c1276eq.f3706d == 0) {
            return 1;
        }
        int i2 = c1276eq.f3704b <= 0 ? 0 : 1;
        if (c1276eq.f3705c > 0) {
            i2++;
        }
        return c1276eq.f3706d > 0 ? i2 + 1 : i2;
    }

    @Override // android.widget.ExpandableListAdapter
    public final Object getGroup(int i) {
        return this.f3702b.get(i);
    }

    @Override // android.widget.ExpandableListAdapter
    public final int getGroupCount() {
        return this.f3702b.size();
    }

    @Override // android.widget.ExpandableListAdapter
    public final long getGroupId(int i) {
        return i;
    }

    @Override // android.widget.ExpandableListAdapter
    public final View getGroupView(int i, boolean z, View view, ViewGroup viewGroup) {
        String str = ((C1276eq) this.f3702b.get(i)).f3703a;
        View textView = view == null ? new TextView(this.f3701a) : view;
        int iM3764a = C1557f.m3764a(this.f3701a, 32.0f);
        ((TextView) textView).setPadding(iM3764a, iM3764a / 8, 0, 0);
        ((TextView) textView).setTypeface(null, 1);
        ((TextView) textView).setText(str);
        return textView;
    }

    @Override // android.widget.ExpandableListAdapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.ExpandableListAdapter
    public final boolean isChildSelectable(int i, int i2) {
        return false;
    }
}
