package com.gmail.heagoo.apkeditor;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.support.v4.content.ContextCompat;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.CheckBox;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.github.megatronking.stringfog.xor.StringFogImpl;
import com.gmail.heagoo.apkeditor.p092ac.C1119a;
import com.gmail.heagoo.apkeditor.p092ac.EditTextWithTip;
import com.gmail.heagoo.apkeditor.pro.R;
import com.gmail.heagoo.p084a.p089c.C1067a;
import java.io.Closeable;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p000a.p001a.p003b.p004a.C0037k;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.ei */
/* JADX INFO: loaded from: classes.dex */
final class ViewOnClickListenerC1270ei extends BaseExpandableListAdapter implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    private String f3678a;

    /* JADX INFO: renamed from: b */
    private String f3679b;

    /* JADX INFO: renamed from: d */
    private WeakReference f3681d;

    /* JADX INFO: renamed from: e */
    private WeakReference f3682e;

    /* JADX INFO: renamed from: f */
    private boolean[] f3683f;

    /* JADX INFO: renamed from: g */
    private boolean[] f3684g;

    /* JADX INFO: renamed from: l */
    private int f3687l;

    /* JADX INFO: renamed from: k */
    private int f3686k = 0;

    /* JADX INFO: renamed from: m */
    private boolean f3688m = false;

    /* JADX INFO: renamed from: n */
    private String f3689n = null;

    /* JADX INFO: renamed from: c */
    private ArrayList f3680c = new ArrayList();

    /* JADX INFO: renamed from: h */
    private final Map f3685h = new HashMap();

    ViewOnClickListenerC1270ei(WeakReference weakReference, ExpandableListView expandableListView, String str, List list, String str2) {
        this.f3681d = weakReference;
        this.f3682e = new WeakReference(expandableListView);
        this.f3678a = str + "/";
        this.f3679b = str2;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.f3680c.add((String) it.next());
        }
        this.f3683f = new boolean[list.size()];
        this.f3684g = new boolean[list.size()];
    }

    /* JADX INFO: renamed from: a */
    private static void m3232a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    static /* synthetic */ boolean m3233a(ViewOnClickListenerC1270ei viewOnClickListenerC1270ei, boolean z) {
        viewOnClickListenerC1270ei.f3688m = true;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public void m3234d(int i) throws Throwable {
        String str = (String) this.f3680c.get(i);
        try {
            m3236a(str, this.f3689n);
            ((ApkInfoActivity) this.f3681d.get()).m2695a(str, (String) null);
            ((ExpandableListView) this.f3682e.get()).collapseGroup(i);
            m3240b(i);
            Toast.makeText((Context) this.f3681d.get(), String.format(((ApkInfoActivity) this.f3681d.get()).getString(R.string.str_replaced), this.f3679b), 0).show();
        } catch (IOException e) {
            Toast.makeText((Context) this.f3681d.get(), e.getMessage(), 1).show();
        }
    }

    /* JADX INFO: renamed from: a */
    public final ArrayList m3235a() {
        return this.f3680c;
    }

    /* JADX INFO: renamed from: a */
    public final void m3236a(String str, String str2) throws Throwable {
        RandomAccessFile randomAccessFile;
        try {
            randomAccessFile = new RandomAccessFile(str, "rw");
        } catch (Throwable th) {
            th = th;
            randomAccessFile = null;
        }
        try {
            byte[] bArr = new byte[(int) randomAccessFile.length()];
            int i = 0;
            while (true) {
                int i2 = randomAccessFile.read(bArr, i, bArr.length - i);
                if (i2 <= 0) {
                    String strReplace = new String(bArr, StringFogImpl.CHARSET_NAME_UTF_8).replace(this.f3679b, str2);
                    randomAccessFile.setLength(0L);
                    randomAccessFile.write(strReplace.getBytes());
                    m3232a(randomAccessFile);
                    return;
                }
                i += i2;
            }
        } catch (Throwable th2) {
            th = th2;
            m3232a(randomAccessFile);
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    final void m3237a(String str, List list) {
        synchronized (this.f3685h) {
            this.f3685h.put(str, list);
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m3238a(int i) {
        boolean zContainsKey;
        String str = (String) this.f3680c.get(i);
        if (str == null) {
            return false;
        }
        synchronized (this.f3685h) {
            zContainsKey = this.f3685h.containsKey(str);
        }
        return zContainsKey;
    }

    /* JADX INFO: renamed from: b */
    public final String m3239b() {
        return this.f3679b;
    }

    /* JADX INFO: renamed from: b */
    public final void m3240b(int i) {
        String str = (String) this.f3680c.get(i);
        if (str != null) {
            synchronized (this.f3685h) {
                this.f3685h.remove(str);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m3241c(int i) {
        if (i < this.f3680c.size()) {
            this.f3685h.remove((String) this.f3680c.remove(i));
            notifyDataSetChanged();
        }
    }

    @Override // android.widget.ExpandableListAdapter
    public final Object getChild(int i, int i2) {
        List list = (List) this.f3685h.get((String) this.f3680c.get(i));
        if (list == null || i2 >= list.size()) {
            return null;
        }
        return list.get(i2);
    }

    @Override // android.widget.ExpandableListAdapter
    public final long getChildId(int i, int i2) {
        return (i << 16) + i2;
    }

    @Override // android.widget.ExpandableListAdapter
    @SuppressLint({"InflateParams"})
    public final View getChildView(int i, int i2, boolean z, View view, ViewGroup viewGroup) {
        C1274em c1274em;
        String str;
        int i3;
        int i4 = 0;
        C1269eh c1269eh = (C1269eh) getChild(i, i2);
        if (view == null) {
            view = ((LayoutInflater) ((ApkInfoActivity) this.f3681d.get()).getSystemService("layout_inflater")).inflate(R.layout.item_matchedline, (ViewGroup) null);
            C1274em c1274em2 = new C1274em((byte) 0);
            c1274em2.f3700a = (TextView) view.findViewById(R.id.tv_line);
            view.setTag(c1274em2);
            c1274em = c1274em2;
        } else {
            c1274em = (C1274em) view.getTag();
        }
        if (c1269eh != null) {
            Paint paint = new Paint();
            paint.setTextSize(c1274em.f3700a.getTextSize());
            if (this.f3686k == 0) {
                this.f3686k = c1274em.f3700a.getWidth();
                this.f3687l = (int) paint.measureText(this.f3679b);
            }
            String str2 = c1269eh.f3675a + ": ";
            int iMeasureText = (int) paint.measureText(str2);
            if (this.f3686k < ((int) paint.measureText(str2 + c1269eh.f3677c)) && c1269eh.f3676b > 0) {
                int i5 = ((int) paint.measureText(c1269eh.f3677c.substring(0, c1269eh.f3676b))) > ((this.f3686k - iMeasureText) - this.f3687l) / 2 ? c1269eh.f3676b - (((r5 * c1269eh.f3676b) / r1) - 2) : 0;
                i4 = i5 > c1269eh.f3676b ? c1269eh.f3676b : i5;
            }
            int length = str2.length() + c1269eh.f3676b;
            if (i4 > 0) {
                String str3 = str2 + "..." + c1269eh.f3677c.substring(i4);
                i3 = length - (i4 - 3);
                str = str3;
            } else {
                str = str2 + c1269eh.f3677c;
                i3 = length;
            }
            SpannableString spannableString = new SpannableString(str);
            spannableString.setSpan(new ForegroundColorSpan(-16746497), i3, this.f3679b.length() + i3, 34);
            c1274em.f3700a.setText(spannableString);
        }
        return view;
    }

    @Override // android.widget.ExpandableListAdapter
    public final int getChildrenCount(int i) {
        List list = (List) this.f3685h.get((String) this.f3680c.get(i));
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // android.widget.ExpandableListAdapter
    public final Object getGroup(int i) {
        return this.f3680c.get(i);
    }

    @Override // android.widget.ExpandableListAdapter
    public final int getGroupCount() {
        return this.f3680c.size();
    }

    @Override // android.widget.ExpandableListAdapter
    public final long getGroupId(int i) {
        return i;
    }

    @Override // android.widget.ExpandableListAdapter
    @SuppressLint({"InflateParams"})
    public final View getGroupView(int i, boolean z, View view, ViewGroup viewGroup) {
        C1273el c1273el;
        String strSubstring = ((String) this.f3680c.get(i)).substring(this.f3678a.length());
        if (view == null) {
            view = ((LayoutInflater) ((ApkInfoActivity) this.f3681d.get()).getSystemService("layout_inflater")).inflate(R.layout.item_matchedfile, (ViewGroup) null);
            C1273el c1273el2 = new C1273el((byte) 0);
            c1273el2.f3695a = (TextView) view.findViewById(R.id.tv_filepath);
            c1273el2.f3697c = view.findViewById(R.id.menu_edit);
            c1273el2.f3696b = view.findViewById(R.id.menu_replace);
            c1273el2.f3699e = (ImageView) view.findViewById(R.id.image_edit);
            c1273el2.f3698d = (ImageView) view.findViewById(R.id.image_replace);
            view.setTag(c1273el2);
            c1273el = c1273el2;
        } else {
            c1273el = (C1273el) view.getTag();
        }
        c1273el.f3699e.setImageResource(this.f3684g[i] ? R.drawable.ic_eye_accent : R.drawable.ic_eye);
        c1273el.f3698d.setImageResource(this.f3683f[i] ? R.drawable.ic_replace_accent : R.drawable.ic_replace);
        TextView textView = c1273el.f3695a;
        textView.setTypeface(null, 0);
        textView.setText(strSubstring);
        c1273el.f3697c.setTag(Integer.valueOf(i));
        c1273el.f3697c.setOnClickListener(this);
        c1273el.f3696b.setTag(Integer.valueOf(i));
        c1273el.f3696b.setOnClickListener(this);
        return view;
    }

    @Override // android.widget.ExpandableListAdapter
    public final boolean hasStableIds() {
        return true;
    }

    @Override // android.widget.ExpandableListAdapter
    public final boolean isChildSelectable(int i, int i2) {
        return true;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        Intent intentM2439a;
        int id = view.getId();
        if (id == R.id.menu_edit) {
            Integer num = (Integer) view.getTag();
            if (num.intValue() < this.f3680c.size()) {
                if (!this.f3684g[num.intValue()]) {
                    this.f3684g[num.intValue()] = true;
                    notifyDataSetChanged();
                }
                if (this.f3680c.size() <= 100) {
                    intentM2439a = C1067a.m2440a((Context) this.f3681d.get(), this.f3680c, num.intValue(), ((ApkInfoActivity) this.f3681d.get()).m2726l());
                } else {
                    ApkInfoActivity apkInfoActivity = (ApkInfoActivity) this.f3681d.get();
                    intentM2439a = C1067a.m2439a(apkInfoActivity, (String) this.f3680c.get(num.intValue()), apkInfoActivity.m2726l());
                }
                C1067a.m2442a(intentM2439a, "searchString", this.f3679b);
                ((ApkInfoActivity) this.f3681d.get()).startActivityForResult(intentM2439a, 0);
                return;
            }
            return;
        }
        if (id == R.id.menu_replace) {
            Integer num2 = (Integer) view.getTag();
            if (!this.f3683f[num2.intValue()]) {
                this.f3683f[num2.intValue()] = true;
                notifyDataSetChanged();
            }
            if (num2.intValue() < this.f3680c.size()) {
                if (this.f3688m) {
                    m3234d(num2.intValue());
                    return;
                }
                int iIntValue = num2.intValue();
                float f = ((ApkInfoActivity) this.f3681d.get()).getResources().getDisplayMetrics().density;
                int i = (int) ((18.0f * f) + 0.5f);
                int i2 = (int) ((20.0f * f) + 0.5f);
                int i3 = (int) ((f * 24.0f) + 0.5f);
                AlertDialog.Builder builder = new AlertDialog.Builder((Context) this.f3681d.get());
                builder.setTitle(R.string.replace);
                LinearLayout linearLayout = new LinearLayout((Context) this.f3681d.get());
                linearLayout.setOrientation(1);
                linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                layoutParams.setMargins(i3, (int) ((12.0f * f) + 0.5f), i3, 0);
                TextView textView = new TextView((ApkInfoActivity) this.f3681d.get());
                textView.setText(String.format(((ApkInfoActivity) this.f3681d.get()).getString(R.string.str_replace_with), this.f3679b));
                textView.setTextColor(ContextCompat.getColor((ApkInfoActivity) this.f3681d.get(), C0037k.mdTextSmall(C0037k.m89a((ApkInfoActivity) this.f3681d.get()))));
                textView.setTextSize(1, 12);
                textView.setLayoutParams(layoutParams);
                linearLayout.addView(textView);
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                layoutParams2.setMargins(i2, 0, i2, 0);
                C1119a c1119a = new C1119a((ApkInfoActivity) this.f3681d.get(), "search_replace_with");
                EditTextWithTip editTextWithTip = new EditTextWithTip((ApkInfoActivity) this.f3681d.get());
                editTextWithTip.setTextColor(ContextCompat.getColor((ApkInfoActivity) this.f3681d.get(), C0037k.mdTextMedium(C0037k.m89a((ApkInfoActivity) this.f3681d.get()))));
                editTextWithTip.setTextSize(1, 14);
                editTextWithTip.setAdapter(c1119a);
                editTextWithTip.setLayoutParams(layoutParams2);
                linearLayout.addView(editTextWithTip);
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
                layoutParams3.setMargins(i, 0, i, 0);
                CheckBox checkBox = new CheckBox((Context) this.f3681d.get());
                checkBox.setText(R.string.label_replace_with_same_setting);
                checkBox.setLayoutParams(layoutParams3);
                linearLayout.addView(checkBox);
                builder.setView(linearLayout);
                builder.setPositiveButton(android.R.string.ok, new DialogInterfaceOnClickListenerC1271ej(this, editTextWithTip, checkBox, c1119a, iIntValue));
                builder.setNegativeButton(android.R.string.cancel, new DialogInterfaceOnClickListenerC1272ek(this));
                builder.show();
            }
        }
    }
}
