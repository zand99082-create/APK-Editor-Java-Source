package com.rull.mod.color;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.support.v4.internal.view.SupportMenu;
import android.text.InputFilter;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.gmail.heagoo.apkeditor.gzd;
import com.rull.mod.color.ColorPickerView;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class ColorPickerDialog extends Dialog implements View.OnClickListener, ColorPickerView.OnColorChangedListener {
    private AlertDialog alert;
    private ColorPickerView mColorPicker;
    private ColorStateList mHexDefaultTextColor;
    private EditText mHexVal;
    private boolean mHexValueEnabled;
    private OnColorChangedListener mListener;
    private ColorPickerPanelView mNewColor;
    private ColorPickerPanelView mOldColor;
    private String mTitle;

    public interface ColorPickerDialogListener {
        void onCancel(ColorPickerDialog colorPickerDialog);

        void onOk(ColorPickerDialog colorPickerDialog, int i);
    }

    public interface OnColorChangedListener {
        void onColorChanged(int i);
    }

    public ColorPickerDialog(Context context, int i, String str) {
        super(context);
        this.mHexValueEnabled = false;
        init(i);
        this.mTitle = str;
        setTitle(str);
    }

    private void init(int i) {
        getWindow().setFormat(1);
        setUp(i);
    }

    private void setUp(int i) {
        View viewInflate = ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(getID("masrull_dlg_colorpicker", "layout"), (ViewGroup) null);
        setContentView(viewInflate);
        setCancelable(true);
        this.mColorPicker = (ColorPickerView) viewInflate.findViewById(getID("color_picker_view", gzd.COLUMN_ID));
        this.mOldColor = (ColorPickerPanelView) viewInflate.findViewById(getID("id_lama", gzd.COLUMN_ID));
        this.mNewColor = (ColorPickerPanelView) viewInflate.findViewById(getID("id_baru", gzd.COLUMN_ID));
        this.mHexVal = (EditText) viewInflate.findViewById(getID("hex_val", gzd.COLUMN_ID));
        this.mHexVal.setInputType(524288);
        this.mHexDefaultTextColor = this.mHexVal.getTextColors();
        this.mHexVal.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: com.rull.mod.color.ColorPickerDialog.100000000
            private final ColorPickerDialog this$0;

            {
                this.this$0 = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
                if (i2 != 6) {
                    return false;
                }
                ((InputMethodManager) textView.getContext().getSystemService("input_method")).hideSoftInputFromWindow(textView.getWindowToken(), 0);
                String string = this.this$0.mHexVal.getText().toString();
                if (string.length() > 5 || string.length() < 10) {
                    try {
                        this.this$0.mColorPicker.setColor(ColorPickerPreference.convertToColorInt(string.toString()), true);
                        this.this$0.mHexVal.setTextColor(this.this$0.mHexDefaultTextColor);
                        return true;
                    } catch (IllegalArgumentException e) {
                        this.this$0.mHexVal.setTextColor(SupportMenu.CATEGORY_MASK);
                        return true;
                    }
                }
                this.this$0.mHexVal.setTextColor(SupportMenu.CATEGORY_MASK);
                return true;
            }
        });
        ((LinearLayout) this.mOldColor.getParent()).setPadding(Math.round(this.mColorPicker.getDrawingOffset()), 0, Math.round(this.mColorPicker.getDrawingOffset()), 0);
        this.mOldColor.setOnClickListener(this);
        this.mNewColor.setOnClickListener(this);
        this.mColorPicker.setOnColorChangedListener(this);
        this.mOldColor.setColor(i);
        this.mColorPicker.setColor(i, true);
    }

    private void updateHexLengthFilter() {
        if (!getAlphaSliderVisible()) {
            this.mHexVal.setFilters(new InputFilter[]{new InputFilter.LengthFilter(7)});
        } else {
            this.mHexVal.setFilters(new InputFilter[]{new InputFilter.LengthFilter(9)});
        }
    }

    private void updateHexValue(int i) {
        if (getAlphaSliderVisible()) {
            this.mHexVal.setText(ColorPickerPreference.convertToARGB(i).toUpperCase(Locale.getDefault()));
        } else {
            this.mHexVal.setText(ColorPickerPreference.convertToRGB(i).toUpperCase(Locale.getDefault()));
        }
        this.mHexVal.setTextColor(this.mHexDefaultTextColor);
    }

    public boolean getAlphaSliderVisible() {
        return this.mColorPicker.getAlphaSliderVisible();
    }

    public int getColor() {
        return this.mColorPicker.getColor();
    }

    public boolean getHexValueEnabled() {
        return this.mHexValueEnabled;
    }

    public int getID(String str, String str2) {
        return getContext().getResources().getIdentifier(str, str2, getContext().getPackageName());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == getID("id_baru", gzd.COLUMN_ID) && this.mListener != null) {
            this.mListener.onColorChanged(this.mNewColor.getColor());
        }
        dismiss();
    }

    @Override // com.rull.mod.color.ColorPickerView.OnColorChangedListener
    public void onColorChanged(int i) {
        this.mNewColor.setColor(i);
        if (this.mHexValueEnabled) {
            updateHexValue(i);
        }
    }

    @Override // android.app.Dialog
    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.mOldColor.setColor(bundle.getInt("lama_color"));
        this.mColorPicker.setColor(bundle.getInt("baru_color"), true);
    }

    @Override // android.app.Dialog
    public Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        bundleOnSaveInstanceState.putInt("lama_color", this.mOldColor.getColor());
        bundleOnSaveInstanceState.putInt("baru_color", this.mNewColor.getColor());
        return bundleOnSaveInstanceState;
    }

    public void setAlphaSliderVisible(boolean z) {
        this.mColorPicker.setAlphaSliderVisible(z);
        if (this.mHexValueEnabled) {
            updateHexLengthFilter();
            updateHexValue(getColor());
        }
    }

    public void setHexValueEnabled(boolean z) {
        this.mHexValueEnabled = z;
        if (!z) {
            this.mHexVal.setVisibility(8);
            return;
        }
        this.mHexVal.setVisibility(0);
        updateHexLengthFilter();
        updateHexValue(getColor());
    }

    public void setOnColorChangedListener(OnColorChangedListener onColorChangedListener) {
        this.mListener = onColorChangedListener;
    }
}
