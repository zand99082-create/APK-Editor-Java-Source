package com.rull.colorpicker;

import android.R;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.preference.DialogPreference;
import android.support.v4.provider.FontsContractCompat;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.gmail.heagoo.apkeditor.gzd;

/* JADX INFO: loaded from: classes.dex */
public class ColorPreference extends DialogPreference {
    private ViewOnClickListenerC1691a f1619a;
    private Integer f1620b;

    public ColorPreference(Context context) {
        this(context, (AttributeSet) null);
    }

    public ColorPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public int MasrullID(String str, String str2) {
        return getContext().getResources().getIdentifier(str, str2, getContext().getPackageName());
    }

    /* JADX INFO: renamed from: a */
    private Integer m4064a() {
        return getSharedPreferences().contains(getKey()) ? Integer.valueOf(getPersistedInt(-7829368)) : this.f1620b;
    }

    /* JADX INFO: renamed from: b */
    private void m4065b(Integer num) {
        if (num == null) {
            m4066c();
        } else {
            persistInt(num.intValue());
        }
        notifyChanged();
    }

    /* JADX INFO: renamed from: c */
    private void m4066c() {
        if (shouldPersist()) {
            getSharedPreferences().edit().remove(getKey()).commit();
        }
    }

    /* JADX INFO: renamed from: d */
    private static String m4067d(String str) {
        if (str.charAt(0) != '#' || str.length() > "#argb".length()) {
            return str;
        }
        String string = "#";
        for (int i = 1; i < str.length(); i++) {
            string = new StringBuffer().append(new StringBuffer().append(string).append(str.charAt(i)).toString()).append(str.charAt(i)).toString();
        }
        return string;
    }

    @Override // android.preference.Preference
    protected void onBindView(View view) {
        int iMasrullID;
        int iIntValue = 0;
        Integer numM4064a = m4064a();
        setSummary(new StringBuffer().append("#").append(String.format("%02X%02X%02X%02X", new Integer(Color.alpha(numM4064a.intValue())), new Integer(Color.red(numM4064a.intValue())), new Integer(Color.green(numM4064a.intValue())), new Integer(Color.blue(numM4064a.intValue())))).toString());
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.widget_frame);
        viewGroup.setVisibility(0);
        viewGroup.removeAllViews();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        if (isEnabled()) {
            iMasrullID = MasrullID("cpv_thumb", "layout");
        } else {
            iMasrullID = MasrullID("cpv_thumb_disabled", "layout");
        }
        layoutInflaterFrom.inflate(iMasrullID, viewGroup);
        View viewFindViewById = viewGroup.findViewById(MasrullID("image", gzd.COLUMN_ID));
        if (numM4064a == null) {
            numM4064a = this.f1620b;
        }
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(numM4064a == null ? 8 : 0);
            View viewFindViewById2 = viewFindViewById.findViewById(MasrullID("result_image", gzd.COLUMN_ID));
            Drawable drawableMutate = viewFindViewById2.getBackground().mutate();
            if (numM4064a != null) {
                iIntValue = numM4064a.intValue();
            }
            drawableMutate.setTint(iIntValue);
            viewFindViewById2.setBackground(drawableMutate);
        }
        super.onBindView(view);
    }

    @Override // android.preference.DialogPreference, android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        switch (i) {
            case FontsContractCompat.FontRequestCallback.FAIL_REASON_FONT_LOAD_ERROR /* -3 */:
                if (callChangeListener((Object) null)) {
                    m4065b((Integer) null);
                    break;
                }
                break;
            case -2:
                dialogInterface.dismiss();
                break;
            case -1:
                int iM4076i = this.f1619a.m4076i();
                if (callChangeListener(new Integer(iM4076i))) {
                    m4065b(new Integer(iM4076i));
                    break;
                }
                break;
        }
    }

    @Override // android.preference.Preference
    protected Object onGetDefaultValue(TypedArray typedArray, int i) {
        if (typedArray.peekValue(i) == null || typedArray.peekValue(i).type != 3) {
            this.f1620b = Integer.valueOf(typedArray.getColor(i, -7829368));
        } else {
            this.f1620b = Integer.valueOf(Color.parseColor(m4067d(typedArray.getString(i))));
        }
        return this.f1620b;
    }

    @Override // android.preference.DialogPreference
    protected void onPrepareDialogBuilder(AlertDialog.Builder builder) {
        super.onPrepareDialogBuilder(builder);
        this.f1619a = new ViewOnClickListenerC1691a(getContext());
        this.f1619a.m4075h(getPersistedInt(this.f1620b == null ? -7829368 : this.f1620b.intValue()));
        builder.setTitle((CharSequence) null);
        builder.setView(this.f1619a);
        builder.setPositiveButton(R.string.ok, this);
        builder.setNegativeButton(R.string.cancel, this);
        builder.setNeutralButton(com.gmail.heagoo.apkeditor.pro.R.dimen.abc_action_bar_content_inset_material, this);
    }

    @Override // android.preference.Preference
    protected void onSetInitialValue(boolean z, Object obj) {
        m4065b(z ? m4064a() : this.f1620b);
    }

    @Override // android.preference.DialogPreference
    protected void showDialog(Bundle bundle) {
        super.showDialog(bundle);
        getDialog().getWindow().setSoftInputMode(2);
    }
}
