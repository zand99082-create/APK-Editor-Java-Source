package com.gmail.heagoo.apkeditor;

import android.R;
import android.app.Activity;
import android.app.Application;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.TranslateAnimation;
import android.widget.TextView;
import android.widget.Toast;
import com.masrull.listview.JazzyHelper;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes.dex */
public class Saya {
    private static boolean internet;
    private static Context mContext;
    private static DisplayMetrics mDisplayMetrics = (DisplayMetrics) null;

    Saya() {
    }

    public static void setContext(Context context) {
        mContext = context;
    }

    public static Context getContext() {
        if (mContext == null) {
            mContext = CurrentApplicationHolder.INSTANCE;
        }
        return (Context) notNull(mContext);
    }

    public static class CurrentApplicationHolder {
        static final Application INSTANCE;

        static {
            try {
                INSTANCE = (Application) Saya.cast(Saya.invokeStaticMethod(Saya.getMethod(Class.forName("android.app.ActivityThread"), "currentApplication", new Class[0]), new Object[0]));
            } catch (Throwable th) {
                throw new AssertionError(th);
            }
        }
    }

    @SuppressWarnings("unchecked")
    public static <T> T cast(Object obj) {
        return (T) obj;
    }

    public static <T> T notNull(T t) {
        if (t == null) {
            throw new NullPointerException();
        }
        return t;
    }

    public static Method getMethod(Class<?> cls, String str, Class<?>... clsArr) {
        for (Class<?> superclass = cls; superclass != null; superclass = superclass.getSuperclass()) {
            try {
                return superclass.getDeclaredMethod(str, clsArr);
            } catch (NoSuchMethodException e) {
            }
        }
        return (Method) null;
    }

    public static Object invokeStaticMethod(Method method, Object... objArr) {
        return invokeMethod(method, (Object) null, objArr);
    }

    public static Object invokeMethod(Method method, Object obj, Object... objArr) {
        try {
            method.setAccessible(true);
            return method.invoke(obj, objArr);
        } catch (Throwable th) {
            return (Object) null;
        }
    }

    public static int dpToPx(Context context, float f) {
        return Math.round(context.getResources().getDisplayMetrics().density * f);
    }

    public static int px2dp(Context context, float f) {
        return (int) ((f / context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int spToPx(Context context, float f) {
        return (int) TypedValue.applyDimension(2, f, getDisplayMetrics(context));
    }

    public static Point getScreenSize(Context context) {
        Point point = new Point();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getSize(point);
        return point;
    }

    private static DisplayMetrics getDisplayMetrics(Context context) {
        if (mDisplayMetrics == null) {
            mDisplayMetrics = context.getResources().getDisplayMetrics();
        }
        return mDisplayMetrics;
    }

    public static Bitmap resizeBitmap(Bitmap bitmap, int i, int i2) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        float width = i / bitmap.getWidth();
        float height = i2 / bitmap.getHeight();
        float f = i / 2.0f;
        float f2 = i2 / 2.0f;
        Matrix matrix = new Matrix();
        matrix.setScale(width, height, f, f2);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.setMatrix(matrix);
        canvas.drawBitmap(bitmap, f - (bitmap.getWidth() / 2), f2 - (bitmap.getHeight() / 2), new Paint(2));
        return bitmapCreateBitmap;
    }

    public static void showToast(String str) {
        Toast.makeText(getContext(), str, 0).show();
    }

    public static int getResource(String str, String str2) {
        return getContext().getResources().getIdentifier(str, str2, getContext().getPackageName());
    }

    public static int intAttr(String str) {
        return getResource(str, "attr");
    }

    public static int intDimen(String str) {
        return getResource(str, "dimen");
    }

    public static int intAnim(String str) {
        return getResource(str, "anim");
    }

    public static int intStyleable(String str) {
        return getResource(str, "styleable");
    }

    public static int intLayout(String str) {
        return getResource(str, "layout");
    }

    public static int intId(String str) {
        return getResource(str, gzd.COLUMN_ID);
    }

    public static int intXml(String str) {
        return getResource(str, "xml");
    }

    public static int intStyle(String str) {
        return getResource(str, "style");
    }

    public static int intColor(String str) {
        return getResource(str, "color");
    }

    public static int intDrawable(String str) {
        return getResource(str, "drawable");
    }

    public static int intString(String str) {
        return getResource(str, "string");
    }

    public static int intMenu(String str) {
        return getResource(str, "menu");
    }

    public static String getString(String str) {
        return getContext().getString(intString(str));
    }

    public static Drawable getDrawable(String str) {
        return getContext().getResources().getDrawable(intDrawable(str));
    }

    public static Drawable colorDrawable(String str, int i, PorterDuff.Mode mode) {
        Drawable drawable = getDrawable(str);
        drawable.setColorFilter(i, mode);
        return drawable;
    }

    public static void startActivity(Activity activity, Class cls) {
        try {
            activity.startActivity(new Intent(activity, (Class<?>) cls));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void startActivity(Context context, Class cls) {
        try {
            context.startActivity(new Intent(context, (Class<?>) cls));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Drawable colorDrawable(int i, int i2, PorterDuff.Mode mode) {
        Drawable drawable = getContext().getResources().getDrawable(i);
        drawable.setColorFilter(i2, mode);
        return drawable;
    }

    public static int getColor(String str) {
        return getContext().getResources().getColor(intColor(str));
    }

    public static Bitmap drawableToBitmap(Drawable drawable) {
        Bitmap bitmapCreateBitmap;
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() != null) {
                return bitmapDrawable.getBitmap();
            }
        }
        if (drawable.getIntrinsicWidth() > 0 && drawable.getIntrinsicHeight() > 0) {
            bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        } else {
            bitmapCreateBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        }
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    public static Drawable getSelectableItemBackgroundBorderless(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.selectableItemBackgroundBorderless});
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        typedArrayObtainStyledAttributes.recycle();
        return drawable;
    }

    public static Drawable getSelectableItemBackground(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.selectableItemBackground});
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        typedArrayObtainStyledAttributes.recycle();
        return drawable;
    }

    public static boolean hasJellyBean() {
        return Build.VERSION.SDK_INT >= 16;
    }

    public static boolean hasLollipop() {
        return Build.VERSION.SDK_INT >= 21;
    }

    public static String encryptionMD5(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.reset();
            messageDigest.update(bArr);
            byte[] bArrDigest = messageDigest.digest();
            for (int i = 0; i < bArrDigest.length; i++) {
                if (Integer.toHexString(bArrDigest[i] & 255).length() == 1) {
                    stringBuffer.append("0").append(Integer.toHexString(bArrDigest[i] & 255));
                } else {
                    stringBuffer.append(Integer.toHexString(bArrDigest[i] & 255));
                }
            }
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return stringBuffer.toString();
    }

    public static String getMd5OfFile(String str) {
        String str2;
        try {
            FileInputStream fileInputStream = new FileInputStream(str);
            byte[] bArr = new byte[1024];
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            int i = 0;
            while (i != -1) {
                i = fileInputStream.read(bArr);
                if (i > 0) {
                    messageDigest.update(bArr, 0, i);
                }
            }
            fileInputStream.close();
            byte[] bArrDigest = messageDigest.digest();
            str2 = "";
            int i2 = 0;
            while (i2 < bArrDigest.length) {
                try {
                    String string = new StringBuffer().append(str2).append(Integer.toString((bArrDigest[i2] & 255) + 256, 16).substring(1)).toString();
                    i2++;
                    str2 = string;
                } catch (Throwable th) {
                    th.printStackTrace();
                    return str2.toUpperCase();
                }
            }
        } catch (Throwable th2) {
            str2 = "";
        }
        return str2.toUpperCase();
    }

    public static boolean checkInternetNow() {
        checkInternet();
        return isInternetActive();
    }

    public static void checkInternet() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) getContext().getSystemService("connectivity")).getActiveNetworkInfo();
        internet = activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public static boolean isInternetActive() {
        return internet;
    }

    public static void slideUp(View view) {
        view.setVisibility(0);
        TranslateAnimation translateAnimation = new TranslateAnimation(0, 0, -view.getHeight(), 0);
        translateAnimation.setDuration(JazzyHelper.DURATION);
        translateAnimation.setFillAfter(true);
        view.startAnimation(translateAnimation);
    }

    public static void slideDown(View view) {
        TranslateAnimation translateAnimation = new TranslateAnimation(0, 0, 0, -view.getHeight());
        translateAnimation.setDuration(100);
        translateAnimation.setFillAfter(true);
        view.startAnimation(translateAnimation);
    }

    public static String CHECK(String str) {
        return str.replace("_picker", "_check");
    }

    public static Bitmap getResizedBitmap(Bitmap bitmap, int i, int i2) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.postScale(i2 / width, i / height);
        return Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, false);
    }

    public static Uri getImageContentUri(Context context, File file) {
        String absolutePath = file.getAbsolutePath();
        Cursor cursorQuery = context.getContentResolver().query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, new String[]{"_id"}, new StringBuffer().append("_data").append("=? ").toString(), new String[]{absolutePath}, (String) null);
        if (cursorQuery != null && cursorQuery.moveToFirst()) {
            int i = cursorQuery.getInt(cursorQuery.getColumnIndex("_id"));
            cursorQuery.close();
            return Uri.withAppendedPath(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, new StringBuffer().append("").append(i).toString());
        }
        if (file.exists()) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("_data", absolutePath);
            return context.getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
        }
        return (Uri) null;
    }

    public static void runningText(TextView textView) {
        textView.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        textView.setSelected(true);
        textView.setSingleLine(true);
        textView.setMarqueeRepeatLimit(-1);
    }

    public static boolean isTestMode() {
        return getContext().getPackageName().equals("id.delta.gb");
    }

    public static String getStringZipFile(File file) {
        throw new UnsupportedOperationException("Method not decompiled: dofb.lite.edition.dodihidayat.aAbc.dodi.getStringZipFile(java.io.File):java.lang.String");
    }

    public static String getStringImage(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
    }

    public static int dpToPx(float f) {
        return Math.round(getContext().getResources().getDisplayMetrics().density * f);
    }

    public static Bitmap getResizedBitmap(Bitmap bitmap, int i) {
        int i2;
        int i3 = i;
        float width = bitmap.getWidth() / bitmap.getHeight();
        if (width > 1) {
            i2 = i3;
            i3 = (int) (i3 / width);
        } else {
            i2 = (int) (width * i3);
        }
        return Bitmap.createScaledBitmap(bitmap, i2, i3, true);
    }
}
