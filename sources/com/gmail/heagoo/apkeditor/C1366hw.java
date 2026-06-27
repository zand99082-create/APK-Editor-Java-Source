package com.gmail.heagoo.apkeditor;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ListAdapter;
import com.gmail.heagoo.InterfaceC1050a;
import com.gmail.heagoo.apkeditor.p099ui.LayoutObListView;
import com.gmail.heagoo.apkeditor.pro.R;
import com.gmail.heagoo.neweditor.C1594e;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.hw */
/* JADX INFO: loaded from: classes.dex */
public final class C1366hw {

    /* JADX INFO: renamed from: a */
    private LayoutObListView f3991a;

    /* JADX INFO: renamed from: b */
    private C1362hs f3992b;

    /* JADX INFO: renamed from: c */
    private HandlerC1367hx f3993c = new HandlerC1367hx(this);

    public C1366hw(Context context, LayoutObListView layoutObListView) {
        this.f3991a = layoutObListView;
        this.f3992b = new C1362hs(context, layoutObListView);
        layoutObListView.setAdapter((ListAdapter) this.f3992b);
        layoutObListView.setDivider(null);
        layoutObListView.setItemsCanFocus(true);
    }

    /* JADX INFO: renamed from: a */
    public final int m3420a() {
        int selectedItemPosition = this.f3991a.getSelectedItemPosition();
        return selectedItemPosition == -1 ? this.f3991a.m3569d() : selectedItemPosition;
    }

    /* JADX INFO: renamed from: a */
    public final void m3421a(int i) {
        this.f3991a.setBackgroundColor(i);
    }

    /* JADX INFO: renamed from: a */
    public final void m3422a(int i, float f) {
        this.f3992b.m3413a(2, f);
        this.f3992b.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: a */
    public final void m3423a(int i, int i2, int i3) {
        int firstVisiblePosition = this.f3991a.getFirstVisiblePosition();
        int lastVisiblePosition = this.f3991a.getLastVisiblePosition();
        if (i < firstVisiblePosition || i > lastVisiblePosition) {
            m3433c(i);
            this.f3991a.requestFocus();
            this.f3993c.m3441a(i, i2, i3);
        } else {
            EditText editTextM3434d = m3434d(i);
            if (editTextM3434d != null) {
                editTextM3434d.requestFocus();
                editTextM3434d.setSelection(i2, i3);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m3424a(TextWatcher textWatcher) {
        this.f3992b.m3414a(textWatcher);
    }

    /* JADX INFO: renamed from: a */
    public final void m3425a(InterfaceC1050a interfaceC1050a) {
        this.f3992b.m3415a(interfaceC1050a);
    }

    /* JADX INFO: renamed from: a */
    public final void m3426a(C1594e c1594e) {
        this.f3992b.m3416a(c1594e);
    }

    /* JADX INFO: renamed from: a */
    public final void m3427a(String str) {
        this.f3992b.m3417a(Arrays.asList(str.split("\\r?\\n")));
        this.f3992b.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: a */
    public final void m3428a(List list) {
        this.f3992b.m3417a(list);
        this.f3992b.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: a */
    public final void m3429a(boolean z) {
        this.f3992b.m3418a(z);
        this.f3992b.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: b */
    public final int m3430b() {
        EditText editTextM3434d = m3434d(m3420a());
        if (editTextM3434d != null) {
            return editTextM3434d.getSelectionStart();
        }
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public final void m3431b(int i) {
        this.f3992b.m3412a(i);
    }

    /* JADX INFO: renamed from: c */
    public final int m3432c() {
        EditText editTextM3434d = m3434d(m3420a());
        if (editTextM3434d != null) {
            return editTextM3434d.getSelectionEnd();
        }
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public final void m3433c(int i) {
        this.f3991a.setSelection(i);
    }

    /* JADX INFO: renamed from: d */
    public final EditText m3434d(int i) {
        View view;
        if (i < 0) {
            return null;
        }
        int firstVisiblePosition = this.f3991a.getFirstVisiblePosition();
        int childCount = (this.f3991a.getChildCount() + firstVisiblePosition) - 1;
        if (i < firstVisiblePosition || i > childCount) {
            view = this.f3991a.getAdapter().getView(i, null, this.f3991a);
        } else {
            view = this.f3991a.getChildAt(i - firstVisiblePosition);
        }
        if (view != null) {
            return (EditText) view.findViewById(R.id.text);
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final CharSequence m3435d() {
        return this.f3992b.m3411a();
    }

    /* JADX INFO: renamed from: e */
    public final List m3436e() {
        return this.f3992b.m3419b();
    }

    /* JADX INFO: renamed from: f */
    public final Editable m3437f() {
        EditText editTextM3434d = m3434d(m3420a());
        if (editTextM3434d != null) {
            return editTextM3434d.getEditableText();
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final void m3438g() {
        this.f3991a.requestLayout();
    }

    /* JADX INFO: renamed from: h */
    public final ViewGroup.LayoutParams m3439h() {
        return this.f3991a.getLayoutParams();
    }

    /* JADX INFO: renamed from: i */
    public final void m3440i() {
        this.f3992b.notifyDataSetChanged();
    }
}
