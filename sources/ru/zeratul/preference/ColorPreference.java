package ru.zeratul.preference;

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

/* JADX INFO: loaded from: classes.dex */
public class ColorPreference extends DialogPreference {

    /* JADX INFO: renamed from: a */
    private ViewOnClickListenerC1979a f5373a;

    /* JADX INFO: renamed from: b */
    private Integer f5374b;

    public ColorPreference(Context context) {
        this(context, (AttributeSet) null);
    }

    public ColorPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: renamed from: a */
    private Integer m4389a() {
        return getSharedPreferences().contains(getKey()) ? Integer.valueOf(getPersistedInt(-7829368)) : this.f5374b;
    }

    /* JADX INFO: renamed from: b */
    private void m4390b(Integer num) {
        if (num == null) {
            m4391c();
        } else {
            persistInt(num.intValue());
        }
        notifyChanged();
    }

    /* JADX INFO: renamed from: c */
    private void m4391c() {
        if (shouldPersist()) {
            getSharedPreferences().edit().remove(getKey()).commit();
        }
    }

    /* JADX INFO: renamed from: d */
    private static String m4392d(String str) {
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
        Integer numM4389a = m4389a();
        setSummary("#" + String.format("%02X%02X%02X%02X", new Integer(Color.alpha(numM4389a.intValue())), new Integer(Color.red(numM4389a.intValue())), new Integer(Color.green(numM4389a.intValue())), new Integer(Color.blue(numM4389a.intValue()))));
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.widget_frame);
        viewGroup.setVisibility(0);
        viewGroup.removeAllViews();
        LayoutInflater.from(getContext()).inflate(isEnabled() ? com.gmail.heagoo.apkeditor.pro.R.layout.cpv_thumb : com.gmail.heagoo.apkeditor.pro.R.layout.cpv_thumb_disabled, viewGroup);
        View viewFindViewById = viewGroup.findViewById(com.gmail.heagoo.apkeditor.pro.R.id.image);
        if (numM4389a == null) {
            numM4389a = this.f5374b;
        }
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(numM4389a == null ? 8 : 0);
            View viewFindViewById2 = viewFindViewById.findViewById(com.gmail.heagoo.apkeditor.pro.R.id.result_image);
            Drawable drawableMutate = viewFindViewById2.getBackground().mutate();
            drawableMutate.setTint(numM4389a != null ? numM4389a.intValue() : 0);
            viewFindViewById2.setBackground(drawableMutate);
        }
        super.onBindView(view);
    }

    @Override // android.preference.DialogPreference, android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        switch (i) {
            case FontsContractCompat.FontRequestCallback.FAIL_REASON_FONT_LOAD_ERROR /* -3 */:
                if (callChangeListener((Object) null)) {
                    m4390b((Integer) null);
                }
                break;
            case -2:
                dialogInterface.dismiss();
                break;
            case -1:
                int iM4401i = this.f5373a.m4401i();
                if (callChangeListener(new Integer(iM4401i))) {
                    m4390b(new Integer(iM4401i));
                }
                break;
        }
    }

    @Override // android.preference.Preference
    protected Object onGetDefaultValue(TypedArray typedArray, int i) {
        if (typedArray.peekValue(i) == null || typedArray.peekValue(i).type != 3) {
            this.f5374b = Integer.valueOf(typedArray.getColor(i, -7829368));
        } else {
            this.f5374b = Integer.valueOf(Color.parseColor(m4392d(typedArray.getString(i))));
        }
        return this.f5374b;
    }

    @Override // android.preference.DialogPreference
    protected void onPrepareDialogBuilder(AlertDialog.Builder builder) {
        super.onPrepareDialogBuilder(builder);
        this.f5373a = new ViewOnClickListenerC1979a(getContext());
        this.f5373a.m4400h(getPersistedInt(this.f5374b == null ? -7829368 : this.f5374b.intValue()));
        builder.setTitle((CharSequence) null);
        builder.setView(this.f5373a);
        builder.setPositiveButton(com.gmail.heagoo.apkeditor.pro.R.string.set, this);
        builder.setNegativeButton(R.string.cancel, this);
        builder.setNeutralButton(com.gmail.heagoo.apkeditor.pro.R.string.reset, this);
    }

    @Override // android.preference.Preference
    protected void onSetInitialValue(boolean z, Object obj) {
        m4390b(z ? m4389a() : this.f5374b);
    }

    @Override // android.preference.DialogPreference
    protected void showDialog(Bundle bundle) {
        super.showDialog(bundle);
        getDialog().getWindow().setSoftInputMode(2);
    }
}
