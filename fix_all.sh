#!/bin/bash

echo "🔧 شروع اصلاحات..."

# 1. پیدا کردن فایل MainActivity.java اصلی
MAIN_ACTIVITY=$(find ./sources -name "MainActivity.java" -path "*/com/gmail/heagoo/apkeditor/*" | head -1)
echo "📁 فایل MainActivity: $MAIN_ACTIVITY"

# 2. اضافه کردن Frida Gadget به MainActivity.java (با sed)
if [ -f "$MAIN_ACTIVITY" ]; then
    echo "💉 اضافه کردن Frida Gadget به MainActivity..."
    
    # اضافه کردن importها اگر نیستند
    sed -i '1i\
import android.os.Bundle;\
import android.widget.Toast;\
import android.content.Context;\
import android.widget.Button;\
import android.widget.EditText;\
import android.widget.TextView;\
import android.view.View;\
' "$MAIN_ACTIVITY"

    # اضافه کردن static block برای بارگذاری Frida قبل از public class
    sed -i '/^public class/i\
static {\
    try {\
        System.loadLibrary("frida-gadget");\
    } catch (Throwable e) {\
        e.printStackTrace();\
    }\
}\
' "$MAIN_ACTIVITY"

    echo "✅ Frida Gadget به MainActivity اضافه شد."
else
    echo "❌ فایل MainActivity پیدا نشد!"
fi

# 3. پیدا کردن AndroidManifest.xml
MANIFEST=$(find ./resources -name "AndroidManifest.xml" 2>/dev/null | head -1)
if [ -z "$MANIFEST" ]; then
    MANIFEST=$(find . -name "AndroidManifest.xml" -not -path "./jadx-tool/*" | head -1)
fi
echo "📁 فایل AndroidManifest: $MANIFEST"

# 4. اصلاح AndroidManifest.xml
if [ -f "$MANIFEST" ]; then
    echo "📝 اصلاح AndroidManifest.xml..."
    
    # اضافه کردن دسترسی‌های foreground اگر نیستند
    if ! grep -q "FOREGROUND_SERVICE" "$MANIFEST"; then
        sed -i '/<uses-permission android:name="android.permission.PACKAGE_USAGE_STATS" \/>/a\
    <uses-permission android:name="android.permission.FOREGROUND_SERVICE" />\
    <uses-permission android:name="android.permission.FOREGROUND_SERVICE_DATA_SYNC" />\
    <uses-permission android:name="android.permission.POST_NOTIFICATIONS" />' "$MANIFEST"
    fi
    
    # اضافه کردن foregroundServiceType به سرویس ApkComposeService
    sed -i 's/<service android:name="com.gmail.heagoo.apkeditor.ApkComposeService" \/>/<service android:name="com.gmail.heagoo.apkeditor.ApkComposeService" android:foregroundServiceType="dataSync" \/>/g' "$MANIFEST"
    sed -i 's/<service android:name="com.gmail.heagoo.httpserver.HttpService" \/>/<service android:name="com.gmail.heagoo.httpserver.HttpService" android:foregroundServiceType="dataSync" \/>/g' "$MANIFEST"
    
    echo "✅ AndroidManifest.xml اصلاح شد."
else
    echo "❌ AndroidManifest.xml پیدا نشد!"
fi

# 5. دانلود Frida Gadget و اضافه به پروژه
echo "📥 دانلود Frida Gadget..."
mkdir -p app/src/main/jniLibs/armeabi-v7a
mkdir -p app/src/main/jniLibs/arm64-v8a

# دانلود برای ARMv7
curl -L -o app/src/main/jniLibs/armeabi-v7a/libfrida-gadget.so \
  "https://github.com/frida/frida/releases/download/16.2.1/frida-gadget-16.2.1-android-arm.so" \
  -s --progress-bar

# دانلود برای ARM64
curl -L -o app/src/main/jniLibs/arm64-v8a/libfrida-gadget.so \
  "https://github.com/frida/frida/releases/download/16.2.1/frida-gadget-16.2.1-android-arm64.so" \
  -s --progress-bar

echo "✅ Frida Gadget دانلود شد."

# 6. commit و push نهایی
echo "📤 commit و push به گیت‌هاب..."
git add .
git commit -m "Fix foreground service, add Frida Gadget, update manifest"
git push origin main

echo "🎉 همه تغییرات اعمال شد! حالا برو به GitHub Actions و Run workflow رو بزن."
