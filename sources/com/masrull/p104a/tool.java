package com.masrull.p104a;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.preference.PreferenceManager;
import android.support.v4.internal.view.SupportMenu;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.gmail.heagoo.apkeditor.gzd;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class tool {
    private static boolean internet;
    private static DisplayMetrics mDisplayMetrics = null;

    /* JADX INFO: renamed from: vv */
    static Context f5023vv;

    tool(Context context) {
        f5023vv = context;
    }

    public static void SetBoldToolBarText(Context context, TextView textView) {
        if (getBooleanFromkey("back_normal", context)) {
            textView.setTypeface(textView.getTypeface(), 1);
        } else {
            textView.setTypeface(textView.getTypeface(), 0);
        }
    }

    public static void SetToolBarText(Context context, TextView textView) {
        textView.setTextSize(setToolBarTextSize(context));
    }

    public static void checkInternet() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) Global.getContext().getSystemService("connectivity")).getActiveNetworkInfo();
        internet = activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public static boolean checkInternetNow() {
        checkInternet();
        return isInternetActive();
    }

    public static Drawable colorDrawable(int i, int i2, PorterDuff.Mode mode) {
        Drawable drawable = Global.getContext().getResources().getDrawable(i);
        drawable.setColorFilter(i2, mode);
        return drawable;
    }

    public static Drawable colorDrawable(String str, int i, PorterDuff.Mode mode) {
        Drawable drawable = getDrawable(str);
        drawable.setColorFilter(i, mode);
        return drawable;
    }

    public static int dpToPx(Context context, float f) {
        return Math.round(context.getResources().getDisplayMetrics().density * f);
    }

    public static Bitmap drawableToBitmap(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() != null) {
                return bitmapDrawable.getBitmap();
            }
        }
        Bitmap bitmapCreateBitmap = (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) ? Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888) : Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    public static boolean getBooleanFromkey(String str, Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean(str, true);
    }

    public static boolean getBooleanFromkeyy(String str) {
        return PreferenceManager.getDefaultSharedPreferences(f5023vv).getBoolean(str, true);
    }

    public static Bitmap getCircleBitmap(Bitmap bitmap) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        RectF rectF = new RectF(rect);
        paint.setAntiAlias(true);
        canvas.drawARGB(0, 0, 0, 0);
        paint.setColor(SupportMenu.CATEGORY_MASK);
        canvas.drawOval(rectF, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
        bitmap.recycle();
        return bitmapCreateBitmap;
    }

    public static int getColor(String str) {
        return Global.getContext().getResources().getColor(intColor(str));
    }

    private static DisplayMetrics getDisplayMetrics(Context context) {
        if (mDisplayMetrics == null) {
            mDisplayMetrics = context.getResources().getDisplayMetrics();
        }
        return mDisplayMetrics;
    }

    public static Drawable getDrawable(String str) {
        return Global.getResources().getDrawable(intDrawable(str));
    }

    public static int getID(Context context, String str, String str2) {
        return context.getResources().getIdentifier(str, str2, context.getPackageName());
    }

    public static int getID(String str, String str2) {
        return Global.getContext().getResources().getIdentifier(str, str2, Global.getContext().getPackageName());
    }

    public static int getIntFromkey(Context context, String str) {
        return PreferenceManager.getDefaultSharedPreferences(context).getInt(str, 0);
    }

    public static Point getScreenSize(Context context) {
        Point point = new Point();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getSize(point);
        return point;
    }

    public static Drawable getSelectableItemBackground(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.selectableItemBackground});
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        typedArrayObtainStyledAttributes.recycle();
        return drawable;
    }

    public static Drawable getSelectableItemBackgroundBorderless(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.selectableItemBackgroundBorderless});
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        typedArrayObtainStyledAttributes.recycle();
        return drawable;
    }

    public static String getString(String str) {
        return Global.getContext().getString(Global.getResources().getIdentifier(str, "string", Global.getContext().getPackageName()));
    }

    public static boolean hasJellyBean() {
        return Build.VERSION.SDK_INT >= 16;
    }

    public static boolean hasLollipop() {
        return Build.VERSION.SDK_INT >= 21;
    }

    public static int intAnim(String str) {
        return Global.getContext().getResources().getIdentifier(str, "anim", Global.getContext().getPackageName());
    }

    public static int intArrays(String str) {
        return Global.getContext().getResources().getIdentifier(str, "array", Global.getContext().getPackageName());
    }

    public static int intAttr(String str) {
        return Global.getContext().getResources().getIdentifier(str, "attr", Global.getContext().getPackageName());
    }

    public static int intColor(String str) {
        return Global.getContext().getResources().getIdentifier(str, "color", Global.getContext().getPackageName());
    }

    public static int intDimen(String str) {
        return Global.getContext().getResources().getIdentifier(str, "dimen", Global.getContext().getPackageName());
    }

    public static int intDrawable(String str) {
        return Global.getContext().getResources().getIdentifier(str, "drawable", Global.getContext().getPackageName());
    }

    public static int intId(String str) {
        return Global.getContext().getResources().getIdentifier(str, gzd.COLUMN_ID, Global.getContext().getPackageName());
    }

    public static int intLayout(String str) {
        return Global.getContext().getResources().getIdentifier(str, "layout", Global.getContext().getPackageName());
    }

    public static int intString(String str) {
        return Global.getContext().getResources().getIdentifier(str, "string", Global.getContext().getPackageName());
    }

    public static int intStyle(String str) {
        return Global.getContext().getResources().getIdentifier(str, "style", Global.getContext().getPackageName());
    }

    public static int intStyleable(String str) {
        return Global.getContext().getResources().getIdentifier(str, "styleable", Global.getContext().getPackageName());
    }

    public static int intXml(String str) {
        return Global.getContext().getResources().getIdentifier(str, "xml", Global.getContext().getPackageName());
    }

    public static boolean isInternetActive() {
        return internet;
    }

    public static int px2dp(Context context, float f) {
        return (int) ((f / context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static Bitmap resizeBitmap(Bitmap bitmap, int i, int i2) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        float f = i / 2.0f;
        float f2 = i2 / 2.0f;
        Matrix matrix = new Matrix();
        matrix.setScale(i / bitmap.getWidth(), i2 / bitmap.getHeight(), f, f2);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.setMatrix(matrix);
        canvas.drawBitmap(bitmap, f - (bitmap.getWidth() / 2), f2 - (bitmap.getHeight() / 2), new Paint(2));
        return bitmapCreateBitmap;
    }

    public static int setBorderColor(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getInt("warna_border", -1);
    }

    public static int setColorIndicator(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getInt("warna_indikator", -1);
    }

    public static int setColorNormal(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getInt("warna_normal", -9079435);
    }

    public static int setColorSelected(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getInt("warna_ditekan", SupportMenu.CATEGORY_MASK);
    }

    public static int setColorTab(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getInt("warna_tab", -16359850);
    }

    public static void setProfileImage(Context context, ImageView imageView) {
        try {
            File file = new File(context.getFilesDir().getAbsolutePath() + "/Avatars", "me.j");
            if (file.exists()) {
                imageView.setImageBitmap(getCircleBitmap(BitmapFactory.decodeFile(file.getAbsolutePath())));
            } else {
                imageView.setImageResource(getID(context, "avatar_contact", "drawable"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int setTabIconColor(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getInt("warna_icon_tab", -16359850);
    }

    public static int setTabSpaceButton(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getInt("warna_button_space", -1);
    }

    public static int setTabSpaceColor(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getInt("warna_tab_space", -16359850);
    }

    public static int setTabSpaceTextColor(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getInt("warna_text_space", -1);
    }

    public static int setTabTextSize(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getInt("tab_text_size", 16);
    }

    public static int setToolBarTextSize(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getInt("toolbar_text_size", 35);
    }

    public static int setWarnaBg(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getInt("warna_bg", -1);
    }

    public static int setWarnaHeader(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getInt("warna_header", -16359850);
    }

    public static void showToast(String str) {
        Toast.makeText(Global.getContext(), str, 0).show();
    }

    public static int spToPx(Context context, float f) {
        return (int) TypedValue.applyDimension(2, f, getDisplayMetrics(context));
    }

    public static void startActivity(Activity activity, Class cls) {
        activity.startActivity(new Intent(activity, (Class<?>) cls));
    }

    public static void startService(Activity activity, Class cls) {
        activity.startService(new Intent(activity, (Class<?>) cls));
    }

    public static int tabCorner(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getInt("tab_text_size", 16);
    }
}
