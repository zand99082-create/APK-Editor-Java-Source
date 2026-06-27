package com.rull.mod.color;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.preference.Preference;
import android.support.v4.view.InputDeviceCompat;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.rull.mod.color.ColorPickerDialogNoSliderTransparent;

/* JADX INFO: loaded from: classes.dex */
public class ColorPickerPreferenceNoTransparent extends Preference implements Preference.OnPreferenceClickListener, ColorPickerDialogNoSliderTransparent.OnColorChangedListener {
    private boolean mAlphaSliderEnabled;
    private float mDensity;
    ColorPickerDialogNoSliderTransparent mDialog;
    private boolean mHexValueEnabled;
    private int mValue;
    View mView;

    private static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: com.rull.mod.color.ColorPickerPreferenceNoTransparent.SavedState.100000000
            @Override // android.os.Parcelable.Creator
            public /* bridge */ SavedState createFromParcel(Parcel parcel) {
                return createFromParcel(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ SavedState[] newArray(int i) {
                return newArray(i);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };
        Bundle dialogBundle;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.dialogBundle = parcel.readBundle();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.dialogBundle);
        }
    }

    public ColorPickerPreferenceNoTransparent(Context context) {
        super(context);
        this.mAlphaSliderEnabled = false;
        this.mDensity = 0.0f;
        this.mHexValueEnabled = false;
        this.mValue = InputDeviceCompat.SOURCE_ANY;
        init(context, (AttributeSet) null);
    }

    public ColorPickerPreferenceNoTransparent(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mAlphaSliderEnabled = false;
        this.mDensity = 0.0f;
        this.mHexValueEnabled = false;
        this.mValue = InputDeviceCompat.SOURCE_ANY;
        init(context, attributeSet);
    }

    public ColorPickerPreferenceNoTransparent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mAlphaSliderEnabled = false;
        this.mDensity = 0.0f;
        this.mHexValueEnabled = false;
        this.mValue = InputDeviceCompat.SOURCE_ANY;
        init(context, attributeSet);
    }

    public static String convertToARGB(int i) {
        String hexString = Integer.toHexString(Color.alpha(i));
        String hexString2 = Integer.toHexString(Color.red(i));
        String hexString3 = Integer.toHexString(Color.green(i));
        String hexString4 = Integer.toHexString(Color.blue(i));
        if (hexString.length() == 1) {
            hexString = new StringBuffer().append("0").append(hexString).toString();
        }
        if (hexString2.length() == 1) {
            hexString2 = new StringBuffer().append("0").append(hexString2).toString();
        }
        if (hexString3.length() == 1) {
            hexString3 = new StringBuffer().append("0").append(hexString3).toString();
        }
        if (hexString4.length() == 1) {
            hexString4 = new StringBuffer().append("0").append(hexString4).toString();
        }
        return new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("#").append(hexString).toString()).append(hexString2).toString()).append(hexString3).toString()).append(hexString4).toString();
    }

    public static int convertToColorInt(String str) {
        String string = str;
        if (!string.startsWith("#")) {
            string = new StringBuffer().append("#").append(string).toString();
        }
        return Color.parseColor(string);
    }

    public static String convertToRGB(int i) {
        String hexString = Integer.toHexString(Color.red(i));
        String hexString2 = Integer.toHexString(Color.green(i));
        String hexString3 = Integer.toHexString(Color.blue(i));
        if (hexString.length() == 1) {
            hexString = new StringBuffer().append("0").append(hexString).toString();
        }
        if (hexString2.length() == 1) {
            hexString2 = new StringBuffer().append("0").append(hexString2).toString();
        }
        if (hexString3.length() == 1) {
            hexString3 = new StringBuffer().append("0").append(hexString3).toString();
        }
        return new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("#").append(hexString).toString()).append(hexString2).toString()).append(hexString3).toString();
    }

    private Bitmap getPreviewBitmap() {
        int i = (int) (this.mDensity * 31.0f);
        int i2 = this.mValue;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        int width = bitmapCreateBitmap.getWidth();
        int height = bitmapCreateBitmap.getHeight();
        int i3 = 0;
        while (i3 < width) {
            int i4 = i3;
            while (i4 < height) {
                int i5 = (i3 <= 1 || i4 <= 1 || i3 >= width + (-2) || i4 >= height + (-2)) ? -7829368 : i2;
                bitmapCreateBitmap.setPixel(i3, i4, i5);
                if (i3 != i4) {
                    bitmapCreateBitmap.setPixel(i4, i3, i5);
                }
                i4++;
            }
            i3++;
        }
        return bitmapCreateBitmap;
    }

    private void init(Context context, AttributeSet attributeSet) {
        this.mDensity = getContext().getResources().getDisplayMetrics().density;
        setOnPreferenceClickListener(this);
        if (attributeSet != null) {
            this.mAlphaSliderEnabled = attributeSet.getAttributeBooleanValue((String) null, "alphaSlider", false);
            this.mHexValueEnabled = attributeSet.getAttributeBooleanValue((String) null, "hexValue", false);
        }
    }

    private void setPreviewColor() {
        if (this.mView != null) {
            ImageView imageView = new ImageView(getContext());
            LinearLayout linearLayout = (LinearLayout) this.mView.findViewById(R.id.widget_frame);
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
                linearLayout.setPadding(linearLayout.getPaddingLeft(), linearLayout.getPaddingTop(), (int) (this.mDensity * 8.0f), linearLayout.getPaddingBottom());
                int childCount = linearLayout.getChildCount();
                if (childCount > 0) {
                    linearLayout.removeViews(0, childCount);
                }
                linearLayout.addView(imageView);
                linearLayout.setMinimumWidth(0);
                imageView.setBackgroundDrawable(new AlphaPatternDrawable((int) (5.0f * this.mDensity)));
                imageView.setImageBitmap(getPreviewBitmap());
            }
        }
    }

    @Override // android.preference.Preference
    protected void onBindView(View view) {
        super.onBindView(view);
        this.mView = view;
        setPreviewColor();
    }

    @Override // com.rull.mod.color.ColorPickerDialogNoSliderTransparent.OnColorChangedListener
    public void onColorChanged(int i) {
        if (isPersistent()) {
            persistInt(i);
        }
        this.mValue = i;
        setPreviewColor();
        try {
            getOnPreferenceChangeListener().onPreferenceChange(this, Integer.valueOf(i));
        } catch (NullPointerException e) {
        }
    }

    @Override // android.preference.Preference
    protected Object onGetDefaultValue(TypedArray typedArray, int i) {
        return Integer.valueOf(typedArray.getColor(i, ViewCompat.MEASURED_STATE_MASK));
    }

    @Override // android.preference.Preference.OnPreferenceClickListener
    public boolean onPreferenceClick(Preference preference) {
        showDialog((Bundle) null);
        return false;
    }

    @Override // android.preference.Preference
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable == null || !(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        showDialog(savedState.dialogBundle);
    }

    @Override // android.preference.Preference
    protected Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (this.mDialog == null || !this.mDialog.isShowing()) {
            return parcelableOnSaveInstanceState;
        }
        SavedState savedState = new SavedState(parcelableOnSaveInstanceState);
        savedState.dialogBundle = this.mDialog.onSaveInstanceState();
        return savedState;
    }

    @Override // android.preference.Preference
    protected void onSetInitialValue(boolean z, Object obj) {
        onColorChanged(z ? getPersistedInt(this.mValue) : ((Integer) obj).intValue());
    }

    public void setAlphaSliderEnabled(boolean z) {
        this.mAlphaSliderEnabled = z;
    }

    public void setHexValueEnabled(boolean z) {
        this.mHexValueEnabled = z;
    }

    protected void showDialog(Bundle bundle) {
        this.mDialog = new ColorPickerDialogNoSliderTransparent(getContext(), this.mValue, getTitle().toString());
        this.mDialog.setOnColorChangedListener(this);
        if (this.mAlphaSliderEnabled) {
            this.mDialog.setAlphaSliderVisible(false);
        }
        if (this.mHexValueEnabled) {
            this.mDialog.setHexValueEnabled(true);
        }
        if (bundle != null) {
            this.mDialog.onRestoreInstanceState(bundle);
        }
        this.mDialog.show();
    }
}
