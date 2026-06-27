package com.gmail.heagoo.apkeditor;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.content.ComponentName;
import android.content.ContentUris;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.preference.PreferenceManager;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.PointerIconCompat;
import android.support.v7.widget.ActivityChooserView;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import com.android.apksig.apk.ApkUtils;
import com.gmail.heagoo.apkeditor.p092ac.C1119a;
import com.gmail.heagoo.apkeditor.p097f.AsyncTaskC1287a;
import com.gmail.heagoo.apkeditor.p097f.InterfaceC1288b;
import com.gmail.heagoo.apkeditor.p099ui.DialogC1456a;
import com.gmail.heagoo.apkeditor.p099ui.InterfaceC1457b;
import com.gmail.heagoo.apkeditor.pro.R;
import com.gmail.heagoo.apkeditor.translate.PossibleLanguages;
import com.gmail.heagoo.apkeditor.translate.TranslateItem;
import com.gmail.heagoo.common.C1552a;
import com.gmail.heagoo.common.C1553b;
import com.gmail.heagoo.common.C1559h;
import com.gmail.heagoo.common.C1570s;
import com.gmail.heagoo.common.C1574w;
import com.gmail.heagoo.httpserver.C1579e;
import com.gmail.heagoo.p084a.p089c.C1067a;
import com.gmail.heagoo.p100b.C1533a;
import com.gmail.heagoo.pngeditor.PngEditActivity;
import common.types.ActivityState_V1;
import common.types.ProjectInfo_V1;
import common.types.StringItem;
import jadx.core.deobf.Deobfuscator;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import p000a.p001a.p003b.p004a.C0029c;
import p000a.p001a.p003b.p004a.C0031e;
import p000a.p001a.p003b.p004a.C0032f;
import p000a.p001a.p003b.p004a.C0033g;
import p000a.p001a.p003b.p004a.C0037k;
import p000a.p001a.p003b.p004a.p005a.AbstractC0023t;
import p000a.p001a.p003b.p004a.p005a.C0022s;
import p000a.p001a.p003b.p004a.p005a.C0026w;
import p000a.p001a.p003b.p004a.p005a.C0027x;
import p000a.p014d.C0085e;
import p000a.p014d.C0088h;
import p000a.p014d.C0089i;

/* JADX INFO: loaded from: classes.dex */
public class ApkInfoActivity extends Activity implements View.OnClickListener, View.OnLongClickListener, AdapterView.OnItemClickListener, AdapterView.OnItemLongClickListener, InterfaceC1161bf, InterfaceC1208cz, InterfaceC1288b, InterfaceC1304fn, InterfaceC1457b {

    /* JADX INFO: renamed from: A */
    private ListView f2889A;

    /* JADX INFO: renamed from: B */
    private C1338gv f2890B;

    /* JADX INFO: renamed from: C */
    private Map f2891C;

    /* JADX INFO: renamed from: E */
    private ArrayList f2893E;

    /* JADX INFO: renamed from: F */
    private LinearLayout f2894F;

    /* JADX INFO: renamed from: G */
    private ListView f2895G;

    /* JADX INFO: renamed from: I */
    private View f2897I;

    /* JADX INFO: renamed from: J */
    private View f2898J;

    /* JADX INFO: renamed from: K */
    private HorizontalScrollView f2899K;

    /* JADX INFO: renamed from: L */
    private LinearLayout f2900L;

    /* JADX INFO: renamed from: M */
    private View f2901M;

    /* JADX INFO: renamed from: N */
    private TextView f2902N;

    /* JADX INFO: renamed from: O */
    private LinearLayout f2903O;

    /* JADX INFO: renamed from: P */
    private ListView f2904P;

    /* JADX INFO: renamed from: Q */
    private C1224dt f2905Q;

    /* JADX INFO: renamed from: R */
    private LinearLayout f2906R;

    /* JADX INFO: renamed from: S */
    private View f2907S;

    /* JADX INFO: renamed from: U */
    private View f2908U;

    /* JADX INFO: renamed from: V */
    private View f2909V;

    /* JADX INFO: renamed from: W */
    private C1162bg f2910W;

    /* JADX INFO: renamed from: a */
    protected String f2914a;

    /* JADX INFO: renamed from: aA */
    private String f2915aA;

    /* JADX INFO: renamed from: aB */
    private InterfaceC1337gu f2916aB;

    /* JADX INFO: renamed from: aC */
    private String f2917aC;

    /* JADX INFO: renamed from: aD */
    private String f2918aD;

    /* JADX INFO: renamed from: aE */
    private String f2919aE;

    /* JADX INFO: renamed from: aF */
    private long f2920aF;

    /* JADX INFO: renamed from: ad */
    private View f2923ad;

    /* JADX INFO: renamed from: ae */
    private Button f2924ae;

    /* JADX INFO: renamed from: af */
    private ProgressBar f2925af;

    /* JADX INFO: renamed from: ag */
    private View f2926ag;

    /* JADX INFO: renamed from: ah */
    private TextView f2927ah;

    /* JADX INFO: renamed from: ai */
    private TextView f2928ai;

    /* JADX INFO: renamed from: ak */
    private HashMap f2930ak;

    /* JADX INFO: renamed from: al */
    private HashMap f2931al;

    /* JADX INFO: renamed from: am */
    private ArrayList f2932am;

    /* JADX INFO: renamed from: an */
    private ArrayList f2933an;

    /* JADX INFO: renamed from: ao */
    private boolean f2934ao;

    /* JADX INFO: renamed from: ar */
    private String f2937ar;

    /* JADX INFO: renamed from: as */
    private Map f2938as;

    /* JADX INFO: renamed from: at */
    private Map f2939at;

    /* JADX INFO: renamed from: au */
    private Set f2940au;

    /* JADX INFO: renamed from: av */
    private C1119a f2941av;

    /* JADX INFO: renamed from: aw */
    private C1119a f2942aw;

    /* JADX INFO: renamed from: ax */
    private C1119a f2943ax;

    /* JADX INFO: renamed from: ay */
    private InterfaceC1207cy f2944ay;

    /* JADX INFO: renamed from: az */
    private String f2945az;

    /* JADX INFO: renamed from: b */
    protected String f2946b;

    /* JADX INFO: renamed from: c */
    C1553b f2947c;

    /* JADX INFO: renamed from: d */
    HashMap f2948d;

    /* JADX INFO: renamed from: e */
    C1296ff f2949e;

    /* JADX INFO: renamed from: f */
    protected ViewOnClickListenerC1302fl f2950f;

    /* JADX INFO: renamed from: g */
    protected ImageView f2951g;

    /* JADX INFO: renamed from: h */
    protected ImageView f2952h;

    /* JADX INFO: renamed from: k */
    protected Map f2955k;

    /* JADX INFO: renamed from: l */
    protected int f2956l;

    /* JADX INFO: renamed from: m */
    protected boolean f2957m;

    /* JADX INFO: renamed from: n */
    private ImageView f2958n;

    /* JADX INFO: renamed from: o */
    private TextView f2959o;

    /* JADX INFO: renamed from: p */
    private TextView f2960p;

    /* JADX INFO: renamed from: q */
    private RadioButton f2961q;

    /* JADX INFO: renamed from: r */
    private RadioButton f2962r;

    /* JADX INFO: renamed from: s */
    private RadioButton f2963s;

    /* JADX INFO: renamed from: z */
    private LinearLayout f2964z;

    /* JADX INFO: renamed from: D */
    private String f2892D = null;

    /* JADX INFO: renamed from: H */
    private Stack f2896H = new Stack();

    /* JADX INFO: renamed from: X */
    private boolean f2911X = false;

    /* JADX INFO: renamed from: Y */
    private boolean f2912Y = false;

    /* JADX INFO: renamed from: i */
    protected boolean f2953i = true;

    /* JADX INFO: renamed from: j */
    protected boolean f2954j = true;

    /* JADX INFO: renamed from: Z */
    private boolean f2913Z = false;

    /* JADX INFO: renamed from: aa */
    private boolean f2921aa = false;

    /* JADX INFO: renamed from: ab */
    private int f2922ab = 0;

    /* JADX INFO: renamed from: aj */
    private boolean f2929aj = false;

    /* JADX INFO: renamed from: ap */
    private boolean f2935ap = false;

    /* JADX INFO: renamed from: aq */
    private int f2936aq = 0;

    /* JADX INFO: renamed from: a */
    public static C0029c m2636a(Set set) {
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(((C0029c) it.next()).m42a());
        }
        String strM2662c = m2662c(hashSet);
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            C0029c c0029c = (C0029c) it2.next();
            if (c0029c.m42a().equals(strM2662c)) {
                return c0029c;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    static /* synthetic */ C1162bg m2637a(ApkInfoActivity apkInfoActivity, C1162bg c1162bg) {
        apkInfoActivity.f2910W = null;
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public ActivityState_V1 m2639a(String str, boolean z, File file) {
        ActivityState_V1 activityState_V1 = new ActivityState_V1();
        Map mapM3377a = this.f2890B.m3377a();
        if (mapM3377a != null && !mapM3377a.isEmpty()) {
            this.f2911X = true;
            String str2 = str + "changedStringValues";
            C1067a.m2487a(str2, mapM3377a);
            activityState_V1.putString("changedStringValues_file", str2);
        }
        if (!this.f2957m && this.f2949e != null) {
            activityState_V1.putString("res_current_dir", this.f2949e.m3300a((List) null));
            Map mapM3308b = this.f2949e.m3308b();
            Map mapM3312c = this.f2949e.m3312c();
            Set setM3317d = this.f2949e.m3317d();
            if (file != null) {
                m2652a(mapM3308b, mapM3312c, file);
            }
            if (mapM3308b != null && !mapM3308b.isEmpty()) {
                String str3 = str + "res_added";
                C1067a.m2487a(str3, mapM3308b);
                activityState_V1.putString("res_added_file", str3);
            }
            if (mapM3312c != null && !mapM3312c.isEmpty()) {
                String str4 = str + "res_replaced";
                C1067a.m2487a(str4, mapM3312c);
                activityState_V1.putString("res_replaced_file", str4);
            }
            if (setM3317d != null && !setM3317d.isEmpty()) {
                String str5 = str + "res_deleted";
                C1067a.m2487a(str5, setM3317d);
                activityState_V1.putString("res_deleted_file", str5);
            }
        }
        String str6 = str + "allStringValues";
        if (z) {
            C1067a.m2487a(str6, this.f2948d);
        }
        activityState_V1.putString("allStringValues_file", str6);
        String str7 = str + "fileEntry2ZipEntry";
        if (z && !this.f2957m) {
            C1067a.m2487a(str7, this.f2955k);
        }
        activityState_V1.putString("fileEntry2ZipEntry_file", str7);
        activityState_V1.putString("curConfig", this.f2892D.toString());
        activityState_V1.putSerializable("langConfigList", this.f2893E);
        activityState_V1.putBoolean("stringModified", this.f2911X);
        activityState_V1.putBoolean("manifestModified", this.f2912Y);
        activityState_V1.putBoolean("stringParsed", this.f2913Z);
        activityState_V1.putBoolean("resourceParsed", this.f2921aa);
        activityState_V1.putBoolean("bStringPrepared", this.f2935ap);
        activityState_V1.putBoolean("searchTextContent", this.f2953i);
        activityState_V1.putBoolean("searchResSensitive", this.f2954j);
        activityState_V1.putInt("curSelectedRadio", this.f2922ab);
        activityState_V1.putInt("rotateClickedTimes", this.f2936aq);
        activityState_V1.putBoolean("dex2smaliClicked", this.f2929aj);
        activityState_V1.putString("savedParam_extraStr", this.f2915aA);
        activityState_V1.putString("savedParam_filePath", this.f2945az);
        activityState_V1.putBoolean("isFullDecoding", this.f2957m);
        return activityState_V1;
    }

    /* JADX INFO: renamed from: a */
    public static ProjectInfo_V1 m2640a(String str) {
        String str2 = str + "/.prj_version";
        String str3 = str + "/ae.prj";
        File file = new File(str2);
        File file2 = new File(str3);
        if (file.exists() && file2.exists()) {
            try {
                switch (Integer.valueOf(new C1574w(str2).m3799b()).intValue()) {
                    case 1:
                        return (ProjectInfo_V1) C1067a.m2542j(str3);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            e.printStackTrace();
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static String m2642a(String str, String str2, String str3) {
        if (str2.endsWith("/")) {
            str2 = str2.substring(0, str2.length() - 1);
        }
        String str4 = str2 + "/" + str3 + ".apk";
        int iLastIndexOf = str.lastIndexOf(47);
        String strSubstring = str.substring(0, iLastIndexOf);
        String strSubstring2 = str.substring(iLastIndexOf + 1);
        if (!strSubstring.equals(str2) || !strSubstring2.startsWith(str3)) {
            return str4;
        }
        String strSubstring3 = strSubstring2.substring(str3.length());
        if (".apk".equals(strSubstring3)) {
            return str2 + "/" + str3 + "2.apk";
        }
        if (!strSubstring3.matches("[1-9][0-9]*\\.apk")) {
            return str4;
        }
        try {
            return str2 + "/" + str3 + (Integer.valueOf(strSubstring3.substring(0, strSubstring3.length() - 4)).intValue() + 1) + ".apk";
        } catch (Exception e) {
            return str4;
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m2643a(String str, Set set) {
        if ((str.startsWith("smali/") || str.startsWith("smali_")) && str.endsWith(".smali")) {
            int iIndexOf = str.indexOf(47);
            strSubstring = iIndexOf != -1 ? str.substring(0, iIndexOf) : null;
            set.add(strSubstring);
        }
        return strSubstring;
    }

    /* JADX INFO: renamed from: a */
    private void m2644a(Bundle bundle) {
        new DialogC1284ey(this, new C1424q(this, bundle), -1).show();
    }

    /* JADX INFO: renamed from: a */
    static /* synthetic */ void m2645a(ApkInfoActivity apkInfoActivity) {
        apkInfoActivity.m2683s();
        apkInfoActivity.m2690a();
        apkInfoActivity.m2688x();
        if (apkInfoActivity.f2929aj) {
            apkInfoActivity.f2923ad.setVisibility(8);
        }
        apkInfoActivity.m2677n();
        apkInfoActivity.f2907S.setVisibility(0);
        apkInfoActivity.f2908U.setVisibility(0);
        apkInfoActivity.f2909V.setVisibility(0);
    }

    /* JADX INFO: renamed from: a */
    static /* synthetic */ void m2646a(ApkInfoActivity apkInfoActivity, Bundle bundle) {
        apkInfoActivity.f2948d = (HashMap) C1067a.m2542j(bundle.getString("allStringValues_file"));
        String string = bundle.getString("changedStringValues_file");
        if (string != null) {
            apkInfoActivity.f2891C = (HashMap) C1067a.m2542j(string);
            HashMap map = apkInfoActivity.f2948d;
            for (Map.Entry entry : apkInfoActivity.f2891C.entrySet()) {
                String str = (String) entry.getKey();
                for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                    Iterator it = ((ArrayList) map.get(str)).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            StringItem stringItem = (StringItem) it.next();
                            if (((String) entry2.getKey()).equals(stringItem.name)) {
                                stringItem.value = (String) entry2.getValue();
                                break;
                            }
                        }
                    }
                }
            }
        }
        apkInfoActivity.f2955k = (HashMap) C1067a.m2542j(bundle.getString("fileEntry2ZipEntry_file"));
        apkInfoActivity.f2892D = bundle.getString("curConfig");
        apkInfoActivity.f2893E = (ArrayList) bundle.getSerializable("langConfigList");
        apkInfoActivity.f2911X = bundle.getBoolean("stringModified");
        apkInfoActivity.f2912Y = bundle.getBoolean("manifestModified");
        apkInfoActivity.f2913Z = bundle.getBoolean("stringParsed");
        apkInfoActivity.f2921aa = bundle.getBoolean("resourceParsed");
        apkInfoActivity.f2935ap = bundle.getBoolean("bStringPrepared");
        apkInfoActivity.f2953i = bundle.getBoolean("searchTextContent");
        apkInfoActivity.f2954j = bundle.getBoolean("searchResSensitive");
        apkInfoActivity.f2922ab = bundle.getInt("curSelectedRadio");
        apkInfoActivity.f2936aq = bundle.getInt("rotateClickedTimes");
        apkInfoActivity.f2937ar = bundle.getString("res_current_dir");
        String string2 = bundle.getString("res_added_file");
        if (string2 != null) {
            apkInfoActivity.f2938as = (Map) C1067a.m2542j(string2);
        }
        String string3 = bundle.getString("res_replaced_file");
        if (string3 != null) {
            apkInfoActivity.f2939at = (Map) C1067a.m2542j(string3);
        }
        String string4 = bundle.getString("res_deleted_file");
        if (string4 != null) {
            apkInfoActivity.f2940au = (Set) C1067a.m2542j(string4);
        }
        apkInfoActivity.f2929aj = bundle.getBoolean("dex2smaliClicked");
        apkInfoActivity.f2915aA = bundle.getString("savedParam_extraStr");
        apkInfoActivity.f2945az = bundle.getString("savedParam_filePath");
        apkInfoActivity.f2957m = bundle.getBoolean("isFullDecoding");
    }

    /* JADX INFO: renamed from: a */
    private static void m2648a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m2649a(String str, List list) throws IOException {
        m2658b(str, list);
        this.f2911X = true;
        String str2 = null;
        for (Map.Entry entry : this.f2948d.entrySet()) {
            String str3 = (String) entry.getKey();
            if (str3.equals(str)) {
                ArrayList arrayList = (ArrayList) entry.getValue();
                arrayList.clear();
                arrayList.addAll(list);
            } else {
                str3 = str2;
            }
            str2 = str3;
        }
        if (str2 == null) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(list);
            this.f2948d.put(str, arrayList2);
        }
        m2687w();
    }

    /* JADX INFO: renamed from: a */
    private void m2650a(String str, List list, List list2) {
        try {
            FileInputStream fileInputStream = new FileInputStream(this.f2946b + "/AndroidManifest.xml");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
            String line = bufferedReader.readLine();
            int i = 1;
            while (line != null) {
                if (line.contains(str)) {
                    list.add(Integer.valueOf(i));
                    list2.add(line);
                }
                line = bufferedReader.readLine();
                i++;
            }
            bufferedReader.close();
            fileInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    private void m2651a(ArrayList arrayList) {
        this.f2890B.m3379a(this.f2892D, arrayList);
    }

    /* JADX INFO: renamed from: a */
    private void m2652a(Map map, Map map2, File file) {
        try {
            String strM2525d = C1067a.m2525d(this, "tmp");
            if (map != null && !map.isEmpty()) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getValue();
                    if (str != null && str.startsWith(strM2525d)) {
                        File file2 = new File(str);
                        File file3 = new File(file, file2.getName());
                        if (file2.renameTo(file3)) {
                            entry.setValue(file3.getPath());
                        }
                    }
                }
            }
            if (map2 == null || map2.isEmpty()) {
                return;
            }
            for (Map.Entry entry2 : map2.entrySet()) {
                String str2 = (String) entry2.getValue();
                if (str2 != null && str2.startsWith(strM2525d)) {
                    File file4 = new File(str2);
                    File file5 = new File(file, file4.getName());
                    if (file4.renameTo(file5)) {
                        entry2.setValue(file5.getPath());
                    }
                }
            }
        } catch (Exception e) {
        }
    }

    /* JADX INFO: renamed from: a */
    private static boolean m2653a(Context context) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.setDataAndType(null, "application/com.gmail.heagoo.apkeditor-translate");
        return context.getPackageManager().queryIntentActivities(intent, 0).size() > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static boolean m2655a(String str, ProjectInfo_V1 projectInfo_V1) {
        String str2 = str + "/ae.prj";
        try {
            C1067a.m2507b(str + "/.prj_version", "1");
            return C1067a.m2487a(str2, projectInfo_V1);
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    private String m2657b(Map map) {
        try {
            String str = C1067a.m2525d(this, "tmp") + C1570s.m3787a(8);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(str));
            for (Map.Entry entry : map.entrySet()) {
                bufferedOutputStream.write(((String) entry.getKey()).getBytes());
                bufferedOutputStream.write(10);
                bufferedOutputStream.write(((String) entry.getValue()).getBytes());
                bufferedOutputStream.write(10);
            }
            bufferedOutputStream.close();
            return str;
        } catch (Exception e) {
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    private void m2658b(String str, List list) throws IOException {
        C0088h c0088h = new C0088h();
        String str2 = this.f2946b + "/res/values" + str;
        File file = new File(str2);
        if (!file.exists()) {
            file.mkdirs();
        }
        FileOutputStream fileOutputStream = new FileOutputStream(new File(str2 + "/strings.xml"));
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
        c0088h.setOutput(outputStreamWriter);
        outputStreamWriter.write("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n");
        outputStreamWriter.write("<resources>\n");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            StringItem stringItem = (StringItem) it.next();
            c0088h.startTag(null, "string");
            c0088h.attribute(null, "name", stringItem.name);
            if (C1067a.m2528d(stringItem.value)) {
                c0088h.attribute(null, "formatted", "false");
            }
            c0088h.ignorableWhitespace((stringItem.value.startsWith("@string/") || stringItem.value.startsWith("@android:string/")) ? stringItem.value : stringItem.styledValue == null ? C1067a.m2516c(C1067a.m2460a(stringItem.value)) : C1067a.m2516c(stringItem.styledValue));
            c0088h.endTag(null, "string");
            c0088h.flush();
            outputStreamWriter.write("\n");
        }
        outputStreamWriter.write("</resources>\n");
        outputStreamWriter.close();
        fileOutputStream.close();
    }

    /* JADX INFO: renamed from: b */
    private void m2659b(String str, List list, List list2) {
        ArrayList<StringItem> arrayList = null;
        ArrayList<StringItem> arrayList2 = null;
        for (Map.Entry entry : this.f2948d.entrySet()) {
            String str2 = (String) entry.getKey();
            if (str2.equals(str)) {
                arrayList = (ArrayList) entry.getValue();
            } else {
                arrayList2 = "".equals(str2) ? (ArrayList) entry.getValue() : arrayList2;
            }
        }
        if (arrayList2 == null) {
            if (arrayList != null) {
                for (StringItem stringItem : arrayList) {
                    list.add(new TranslateItem(stringItem.name, "", stringItem.value));
                }
                return;
            }
            return;
        }
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        if (arrayList != null) {
            for (StringItem stringItem2 : arrayList) {
                map.put(stringItem2.name, stringItem2.value);
            }
        }
        for (StringItem stringItem3 : arrayList2) {
            map2.put(stringItem3.name, stringItem3.value);
        }
        if (arrayList != null) {
            for (StringItem stringItem4 : arrayList) {
                String str3 = stringItem4.name;
                list.add(new TranslateItem(str3, (String) map2.get(str3), stringItem4.value));
            }
        }
        for (StringItem stringItem5 : arrayList2) {
            String str4 = stringItem5.name;
            if (((String) map.get(str4)) == null) {
                list2.add(new TranslateItem(str4, stringItem5.value, null));
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private void m2660b(List list) {
        new DialogC1197cn(this, new C1129ak(this, list), null, null, getString(R.string.select_folder), true, false, false, null).show();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m2661b(String str) {
        return str.endsWith(".jpg") || (str.endsWith(".png") && !str.endsWith(".9.png"));
    }

    /* JADX INFO: renamed from: c */
    private static String m2662c(Set set) {
        String str = null;
        Locale locale = Locale.getDefault();
        String str2 = "-" + locale.getLanguage();
        String str3 = str2 + "-r" + locale.getCountry();
        new StringBuilder("*****realQualifier=").append(str3);
        Iterator it = set.iterator();
        while (true) {
            String str4 = str;
            if (!it.hasNext()) {
                return str4;
            }
            str = (String) it.next();
            if (str3.equals(str)) {
                return str;
            }
            if (!str2.equals(str)) {
                if (!str.equals("") || str4 != null) {
                    str = str4;
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private void m2664c(String str, String str2) {
        String strSubstring;
        String[] strArrSplit = str.split("/");
        int iLastIndexOf = strArrSplit[strArrSplit.length - 1].lastIndexOf(46);
        if (iLastIndexOf != -1) {
            strSubstring = str.substring(0, str.length() - (strArrSplit[strArrSplit.length - 1].length() - iLastIndexOf));
        } else {
            strSubstring = str;
        }
        if (strSubstring != null && strSubstring.endsWith("/APKEDITOR.xcrhfvke")) {
            File file = new File(str);
            String str3 = strSubstring.substring(0, strSubstring.length() - 18) + C1570s.m3787a(8);
            if (file.renameTo(new File(str3))) {
                str = str3;
            } else {
                Log.w("DEBUG", "file rename error.");
            }
        }
        m2695a(str, str2);
    }

    /* JADX INFO: renamed from: d */
    private void m2666d(boolean z) {
        boolean z2;
        Iterator<ActivityManager.RunningServiceInfo> it = ((ActivityManager) getSystemService("activity")).getRunningServices(ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED).iterator();
        while (true) {
            if (!it.hasNext()) {
                z2 = false;
                break;
            }
            if (ApkComposeService.class.getName().equals(it.next().service.getClassName())) {
                z2 = true;
                break;
            }
        }
        if (z2) {
            bindService(new Intent(this, (Class<?>) ApkComposeService.class), new ServiceConnectionC1138au(this, z), 1);
        } else {
            m2668e(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public void m2668e(boolean z) {
        String str;
        String str2 = Environment.getExternalStorageDirectory().getPath() + "/ApkEditor";
        File file = new File(str2);
        if (!file.exists()) {
            file.mkdir();
        }
        switch (SettingActivity.m2809d(this)) {
            case 0:
                str = !z ? this.f2947c.f4630b + "_unsigned" : this.f2947c.f4630b + "_signed";
                break;
            case 1:
            default:
                str = !z ? "gen_unsigned" : "gen_signed";
                break;
            case 2:
                str = !z ? this.f2947c.f4629a + "_unsigned" : this.f2947c.f4629a + "_signed";
                break;
        }
        String strM2642a = m2642a(this.f2914a, str2, C1559h.m3769a(str));
        if (new File(strM2642a).exists() && SettingActivity.m2812g(this) == 0) {
            strM2642a = DialogC1190ce.m3097a(strM2642a, false).getPath();
        }
        Intent intent = new Intent(this, (Class<?>) ApkComposeService.class);
        C1067a.m2442a(intent, "decodeRootPath", this.f2946b);
        if (!this.f2957m) {
            C1067a.m2442a(intent, "srcApkPath", this.f2914a);
        }
        C1067a.m2442a(intent, "targetApkPath", strM2642a);
        C1067a.m2442a(intent, "stringModified", this.f2911X ? "true" : "false");
        C1067a.m2442a(intent, "manifestModified", this.f2912Y ? "true" : "false");
        C1067a.m2442a(intent, "resFileModified", this.f2934ao ? "true" : "false");
        C1067a.m2443a(intent, "modifiedSmaliFolders", this.f2933an);
        C1067a.m2468a(intent, "addedFiles", this.f2930ak);
        C1067a.m2443a(intent, "deletedFiles", this.f2932am);
        C1067a.m2468a(intent, "replacedFiles", this.f2931al);
        C1067a.m2498b(intent, "signAPK", z);
        C1067a.m2442a(intent, "fileEntry2ZipEntry", m2657b(this.f2955k));
        startService(intent);
        startActivityForResult(new Intent(this, (Class<?>) ApkComposeActivity.class), 1);
    }

    private void extEditor(String str, String str2, boolean z) {
        String str3;
        String strM2672j;
        if (!str2.endsWith(".xml") && !str2.endsWith(".smali") && !str2.endsWith(".html") && !str2.endsWith(".htm") && !str2.endsWith(".css") && !str2.endsWith(".java") && !str2.endsWith(".json") && !str2.endsWith(".txt") && !str2.endsWith(".js")) {
            m2698a(str, str2, z);
            return;
        }
        if (str.equals(this.f2946b)) {
            str3 = str2;
        } else {
            str3 = str.substring(this.f2946b.length() + 1) + "/" + str2;
        }
        String strM3316d = this.f2949e.m3316d(str3);
        if (strM3316d == null) {
            if (z || C1296ff.m3287b(str2)) {
                strM2672j = m2672j(str3);
            } else {
                strM2672j = str + "/" + str2;
            }
            strM3316d = strM2672j;
        }
        if (strM3316d != null) {
            this.f2918aD = strM3316d;
            this.f2919aE = str3;
            this.f2920aF = new File(strM3316d).lastModified();
            C1067a.m2465a(this, strM3316d, PointerIconCompat.TYPE_HAND);
        }
    }

    /* JADX INFO: renamed from: j */
    private String m2672j(String str) {
        int iLastIndexOf = str.lastIndexOf("/");
        String strSubstring = iLastIndexOf != -1 ? str.substring(iLastIndexOf + 1) : str;
        int iLastIndexOf2 = strSubstring.lastIndexOf(Deobfuscator.CLASS_NAME_SEPARATOR);
        String strSubstring2 = iLastIndexOf2 != -1 ? strSubstring.substring(iLastIndexOf2) : "";
        try {
            String str2 = (String) this.f2955k.get(str);
            String str3 = C1067a.m2525d(this, "tmp") + "APKEDITOR.xcrhfvke" + strSubstring2;
            if (str2 == null) {
                str2 = str;
            }
            C0027x.m34b(this.f2914a, str2, str3);
            return str3;
        } catch (Exception e) {
            return null;
        }
    }

    /* JADX INFO: renamed from: j */
    static /* synthetic */ boolean m2673j(ApkInfoActivity apkInfoActivity) {
        return true;
    }

    /* JADX INFO: renamed from: n */
    private void m2677n() {
        int i = this.f2953i ? R.drawable.searchtxt_checked : R.drawable.searchtxt_unchecked;
        int i2 = this.f2954j ? R.drawable.ic_case_sensitive : R.drawable.ic_case_insensitive;
        this.f2951g.setImageResource(i);
        this.f2952h.setImageResource(i2);
    }

    /* JADX INFO: renamed from: o */
    private boolean m2679o() {
        try {
            return "amazon".equals(getPackageManager().getApplicationInfo(getPackageName(), 128).metaData.getString("com.gmail.heagoo.publish_channel"));
        } catch (Exception e) {
            return false;
        }
    }

    /* JADX INFO: renamed from: p */
    private void m2680p() {
        int i;
        Map mapM3377a = this.f2890B.m3377a();
        if (mapM3377a == null || mapM3377a.isEmpty()) {
            return;
        }
        this.f2911X = true;
        try {
            for (Map.Entry entry : mapM3377a.entrySet()) {
                String str = (String) entry.getKey();
                Map map = (Map) entry.getValue();
                String str2 = this.f2946b + "/res/values" + str;
                File file = new File(str2);
                if (!file.exists()) {
                    file.mkdirs();
                }
                String str3 = str2 + "/strings.xml";
                List listM3798a = new C1574w(str3).m3798a();
                ArrayList arrayList = new ArrayList();
                HashSet hashSet = new HashSet();
                int i2 = 0;
                int size = -1;
                while (i2 < listM3798a.size()) {
                    String str4 = (String) listM3798a.get(i2);
                    int iIndexOf = str4.indexOf("<string name=\"");
                    if (iIndexOf == -1) {
                        arrayList.add(str4);
                        i = i2;
                    } else {
                        int i3 = iIndexOf + 14;
                        int iIndexOf2 = str4.indexOf(34, i3);
                        if (iIndexOf2 == -1) {
                            arrayList.add(str4);
                            i = i2;
                        } else {
                            String strSubstring = str4.substring(i3, iIndexOf2);
                            String str5 = (String) map.get(strSubstring);
                            if (str5 != null) {
                                arrayList.add(StringItem.toString(strSubstring, str5, null));
                                hashSet.add(strSubstring);
                                if (!str4.contains("</string>")) {
                                    do {
                                        i2++;
                                        if (i2 < listM3798a.size()) {
                                        }
                                    } while (!((String) listM3798a.get(i2)).contains("</string>"));
                                    i = i2;
                                    size = arrayList.size() - 1;
                                }
                            } else {
                                arrayList.add(str4);
                            }
                            i = i2;
                            size = arrayList.size() - 1;
                        }
                    }
                    i2 = i + 1;
                }
                for (Map.Entry entry2 : map.entrySet()) {
                    String str6 = (String) entry2.getKey();
                    if (!hashSet.contains(str6)) {
                        size++;
                        listM3798a.add(size, StringItem.toString(str6, (String) entry2.getValue(), null));
                    }
                    size = size;
                }
                C1559h.m3773a(str3, arrayList);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: q */
    private void m2681q() {
        this.f2906R.setVisibility(4);
        this.f2903O.setVisibility(4);
        this.f2964z.setVisibility(4);
        this.f2894F.setVisibility(4);
        switch (this.f2922ab) {
            case 0:
                if (!this.f2913Z) {
                    this.f2906R.setVisibility(0);
                } else {
                    this.f2964z.setVisibility(0);
                }
                break;
            case 1:
                if (!this.f2921aa) {
                    this.f2906R.setVisibility(0);
                } else {
                    this.f2894F.setVisibility(0);
                }
                break;
            case 2:
                if (!this.f2921aa) {
                    this.f2906R.setVisibility(0);
                } else {
                    this.f2903O.setVisibility(0);
                }
                break;
        }
    }

    /* JADX INFO: renamed from: r */
    private boolean m2682r() {
        String string;
        this.f2948d = new HashMap();
        C0031e c0031eM3074a = this.f2910W.m3074a();
        if (c0031eM3074a == null) {
            return false;
        }
        for (C0032f c0032f : c0031eM3074a.m44a()) {
            if ("string".equals(c0032f.m69h().m80a())) {
                String strM67f = c0032f.m67f();
                for (Map.Entry entry : c0032f.m63b().entrySet()) {
                    C0029c c0029c = (C0029c) entry.getKey();
                    C0026w c0026wM75d = ((C0033g) entry.getValue()).m75d();
                    if ((c0026wM75d instanceof C0022s) || !(c0026wM75d instanceof AbstractC0023t)) {
                        string = c0026wM75d.toString();
                    } else {
                        AbstractC0023t abstractC0023t = (AbstractC0023t) c0026wM75d;
                        strM21l = abstractC0023t.m23n() ? abstractC0023t.m21l() : null;
                        string = abstractC0023t.m22m();
                        if (string == null) {
                            string = c0026wM75d.toString();
                        }
                    }
                    StringItem stringItem = new StringItem(strM67f, string, strM21l);
                    String strM42a = c0029c.m42a();
                    ArrayList arrayList = (ArrayList) this.f2948d.get(strM42a);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        this.f2948d.put(strM42a, arrayList);
                    }
                    arrayList.add(stringItem);
                }
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public void m2683s() {
        if (this.f2890B != null && this.f2891C != null) {
            this.f2890B.m3380a(this.f2891C);
        }
        findViewById(R.id.add_language).setOnClickListener(new ViewOnClickListenerC1489y(this));
        View viewFindViewById = findViewById(R.id.translate);
        if (m2653a((Context) this) || m2684t()) {
            viewFindViewById.setOnClickListener(this);
        } else {
            viewFindViewById.setOnClickListener(new ViewOnClickListenerC1490z(this));
        }
        m2686v();
        findViewById(R.id.search_button).setOnClickListener(this);
        this.f2913Z = true;
        m2681q();
    }

    /* JADX INFO: renamed from: t */
    private boolean m2684t() {
        try {
            getPackageManager().getApplicationInfo("apkeditor.translate", 0);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public void m2685u() {
        if (this.f2892D == null) {
            this.f2892D = m2662c(this.f2948d.keySet());
        }
        new StringBuilder("********BEST*********").append(this.f2892D);
        m2651a((ArrayList) this.f2948d.get(this.f2892D));
    }

    /* JADX INFO: renamed from: v */
    private void m2686v() {
        int i = 0;
        if (this.f2948d == null) {
            return;
        }
        if (this.f2892D == null) {
            this.f2892D = m2662c(this.f2948d.keySet());
        }
        this.f2893E = new ArrayList();
        String[] strArr = new String[this.f2948d.size()];
        ArrayList<String> arrayList = new ArrayList();
        HashMap map = new HashMap();
        for (String str : this.f2948d.keySet()) {
            String strM229a = C0089i.m229a(str);
            arrayList.add(strM229a);
            map.put(strM229a, str);
        }
        Collections.sort(arrayList);
        int i2 = 0;
        for (String str2 : arrayList) {
            String str3 = (String) map.get(str2);
            strArr[i] = str2;
            this.f2893E.add(str3);
            int i3 = str3.equals(this.f2892D) ? i : i2;
            i++;
            i2 = i3;
        }
        Spinner spinner = (Spinner) findViewById(R.id.language_spinner);
        if (spinner != null) {
            ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, strArr);
            arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter((SpinnerAdapter) arrayAdapter);
            spinner.setOnItemSelectedListener(new C1117ab(this));
            spinner.setSelection(i2);
        }
    }

    /* JADX INFO: renamed from: w */
    private void m2687w() {
        m2686v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public void m2688x() {
        this.f2949e = new C1296ff(this, this.f2957m ? null : this.f2914a, (this.f2937ar == null || !this.f2937ar.startsWith(this.f2946b)) ? this.f2946b : this.f2937ar, this.f2946b, this.f2955k, new C1118ac(this), this);
        this.f2949e.m3306a(this.f2938as, this.f2940au, this.f2939at);
        this.f2895G.setAdapter((ListAdapter) this.f2949e);
        this.f2895G.setOnItemClickListener(this);
        this.f2895G.setOnItemLongClickListener(this);
        this.f2905Q = new C1224dt(this, this.f2946b + "/AndroidManifest.xml", this);
        this.f2904P.setAdapter((ListAdapter) this.f2905Q);
        this.f2904P.setOnItemClickListener(this.f2905Q);
        this.f2904P.setOnItemLongClickListener(this.f2905Q);
        if (this.f2950f != null && this.f2937ar != null) {
            this.f2950f.m3334a(this.f2937ar);
        }
        this.f2921aa = true;
        m2681q();
    }

    @Override // com.gmail.heagoo.apkeditor.InterfaceC1208cz
    /* JADX INFO: renamed from: a */
    public final String mo2689a(C1217dj c1217dj) {
        return null;
    }

    /* JADX INFO: renamed from: a */
    protected final void m2690a() {
        this.f2961q.setOnClickListener(new ViewOnClickListenerC1136as(this));
        this.f2962r.setOnClickListener(new ViewOnClickListenerC1137at(this));
        this.f2963s.setOnClickListener(new ViewOnClickListenerC1425r(this));
        this.f2909V = findViewById(R.id.save_button);
        this.f2909V.setOnClickListener(new ViewOnClickListenerC1426s(this));
        this.f2908U = findViewById(R.id.menu_apply_patch);
        this.f2908U.setOnClickListener(this);
        this.f2907S = findViewById(R.id.menu_webserver);
        this.f2907S.setOnClickListener(this);
    }

    /* JADX INFO: renamed from: a */
    protected final void m2691a(int i) {
        ArrayList arrayList = new ArrayList();
        m2694a(this.f2949e.m3300a(arrayList) + "/" + ((C1533a) arrayList.get(i)).f4594a, (InterfaceC1337gu) null);
    }

    /* JADX INFO: renamed from: a */
    public final void m2692a(InterfaceC1207cy interfaceC1207cy) {
        this.f2944ay = interfaceC1207cy;
        new AsyncTaskC1287a(this, this.f2914a, this.f2946b, this).execute(new Void[0]);
        this.f2929aj = true;
    }

    /* JADX INFO: renamed from: a */
    public final void m2693a(String str, int i) {
        this.f2949e.m3313c(str);
        if (i > 0) {
            C0085e c0085e = null;
            int i2 = 0;
            while (i2 < i) {
                try {
                    i2++;
                    c0085e = (C0085e) this.f2896H.pop();
                } catch (Exception e) {
                    return;
                }
            }
            if (c0085e != null) {
                this.f2895G.setSelectionFromTop(((Integer) c0085e.f229a).intValue(), ((Integer) c0085e.f230b).intValue());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    protected final void m2694a(String str, InterfaceC1337gu interfaceC1337gu) {
        String strSubstring = str.substring(str.lastIndexOf(47) + 1);
        int iLastIndexOf = strSubstring.lastIndexOf(46);
        String strSubstring2 = iLastIndexOf != -1 ? strSubstring.substring(iLastIndexOf) : null;
        new DialogC1197cn(this, new C1130al(this, interfaceC1337gu, strSubstring2), strSubstring2, str, null, false, false, true, null).show();
    }

    /* JADX INFO: renamed from: a */
    protected final void m2695a(String str, String str2) {
        if (str2 == null) {
            str2 = str.substring(this.f2946b.length() + 1);
        }
        this.f2949e.m3314c(str2, str);
    }

    /* JADX INFO: renamed from: a */
    public final void m2696a(String str, String str2, InterfaceC1337gu interfaceC1337gu) {
        this.f2945az = str;
        this.f2915aA = str2;
        this.f2916aB = interfaceC1337gu;
    }

    /* JADX INFO: renamed from: a */
    protected final void m2697a(String str, String str2, ArrayList arrayList, boolean z, boolean z2) {
        if (this.f2942aw != null) {
            this.f2942aw.m3026a(str);
        }
        if (z) {
            new DialogC1305fo(this, str2, arrayList, str, z2).show();
        } else {
            new DialogC1312fv(this, str2, arrayList, str, z2).show();
        }
    }

    /* JADX INFO: renamed from: a */
    protected final void m2698a(String str, String str2, boolean z) {
        String str3 = str.equals(this.f2946b) ? str2 : str.substring(this.f2946b.length() + 1) + "/" + str2;
        String str4 = str2.endsWith(".xml") ? "xml.xml" : str2.endsWith(".smali") ? "smali.xml" : (str2.endsWith(".html") || str2.endsWith(".htm")) ? "html.xml" : str2.endsWith(".css") ? "css.xml" : str2.endsWith(".java") ? "java.xml" : str2.endsWith(".json") ? "json.xml" : str2.endsWith(".txt") ? "txt.xml" : str2.endsWith(".js") ? "js.xml" : null;
        if (str4 == null) {
            String strM3316d = this.f2949e.m3316d(str3);
            if (strM3316d == null) {
                strM3316d = (z || C1296ff.m3287b(str2)) ? m2672j(str3) : str + "/" + str2;
            }
            if (strM3316d != null) {
                this.f2918aD = strM3316d;
                this.f2919aE = str3;
                this.f2920aF = new File(strM3316d).lastModified();
                if (!str2.endsWith(".png")) {
                    C1067a.m2465a(this, strM3316d, PointerIconCompat.TYPE_HAND);
                    return;
                }
                Intent intent = new Intent(this, (Class<?>) PngEditActivity.class);
                C1067a.m2442a(intent, "filePath", strM3316d);
                startActivityForResult(intent, PointerIconCompat.TYPE_HAND);
                return;
            }
            return;
        }
        String strM3316d2 = this.f2949e.m3316d(str3);
        if (strM3316d2 == null) {
            if (z) {
                strM3316d2 = m2672j(str3);
                if (strM3316d2 == null) {
                    Toast.makeText(this, String.format(getString(R.string.cannot_open_xxx), str3), 0).show();
                    return;
                }
            } else {
                strM3316d2 = str + "/" + str2;
            }
        }
        if ("res/values/colors.xml".equals(str3)) {
            Intent intent2 = new Intent(this, (Class<?>) ColorXmlActivity.class);
            C1067a.m2442a(intent2, "xmlPath", strM3316d2);
            startActivityForResult(intent2, 3);
        } else {
            Intent intentM2439a = C1067a.m2439a(this, strM3316d2, this.f2914a);
            C1067a.m2442a(intentM2439a, "syntaxFileName", str4);
            if (str2 != null) {
                C1067a.m2442a(intentM2439a, "displayFileName", str2);
            }
            C1067a.m2442a(intentM2439a, "extraString", str3);
            startActivityForResult(intentM2439a, 0);
        }
    }

    /* JADX INFO: renamed from: a */
    protected final void m2699a(List list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String strM3300a = this.f2949e.m3300a(arrayList2);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            if (iIntValue < arrayList2.size()) {
                C1533a c1533a = (C1533a) arrayList2.get(iIntValue);
                C1192cg c1192cg = new C1192cg();
                if (c1533a.f4596c) {
                    c1192cg.f3491a = (strM3300a + "/" + c1533a.f4594a).substring(this.f2946b.length() + 1);
                } else {
                    c1192cg.f3491a = strM3300a + "/" + c1533a.f4594a;
                }
                c1192cg.f3493c = c1533a.f4596c;
                c1192cg.f3492b = c1533a.f4595b;
                arrayList.add(c1192cg);
            }
        }
        m2660b(arrayList);
    }

    @Override // com.gmail.heagoo.apkeditor.InterfaceC1161bf
    /* JADX INFO: renamed from: a */
    public final void mo2700a(Map map) {
        this.f2955k = map;
        new C1486v(this, map).start();
        boolean z = !this.f2935ap;
        if (!this.f2935ap) {
            this.f2935ap = m2682r();
        }
        runOnUiThread(new RunnableC1487w(this, z));
    }

    /* JADX INFO: renamed from: a */
    public final void m2701a(boolean z) {
        this.f2912Y = true;
        if (z) {
            this.f2905Q.m3138a();
        } else {
            runOnUiThread(new RunnableC1135aq(this));
        }
    }

    @Override // com.gmail.heagoo.apkeditor.p097f.InterfaceC1288b
    /* JADX INFO: renamed from: a */
    public final void mo2702a(boolean z, String str, String str2) {
        boolean z2;
        if (this.f2944ay != null) {
            this.f2944ay.mo3122a();
            this.f2944ay = null;
        }
        if (!z) {
            this.f2927ah.setText(R.string.failed);
            this.f2928ai.setVisibility(0);
            if (str != null) {
                this.f2928ai.setText(str);
                z2 = true;
            } else {
                this.f2928ai.setText(R.string.unknown_error);
                z2 = true;
            }
        } else if (str2 != null) {
            this.f2927ah.setText(R.string.succeed_with_warning);
            this.f2928ai.setText(getString(R.string.warning) + ": " + str2);
            this.f2928ai.setVisibility(0);
            z2 = true;
        } else {
            this.f2927ah.setText(R.string.succeed);
            this.f2928ai.setVisibility(8);
            z2 = false;
        }
        this.f2924ae.setVisibility(4);
        this.f2925af.setVisibility(4);
        if (z2) {
            this.f2926ag.setVisibility(0);
        } else {
            this.f2923ad.setVisibility(8);
            Toast.makeText(this, R.string.dex_decode_succeed, 1).show();
        }
        String strM3300a = this.f2949e.m3300a((List) null);
        if (strM3300a.endsWith("/decoded")) {
            this.f2949e.m3313c(strM3300a);
        }
    }

    /* JADX INFO: renamed from: aa */
    protected final void m2703aa(int i) {
        ArrayList arrayList = new ArrayList();
        String strM3300a = this.f2949e.m3300a(arrayList);
        C1533a c1533a = (C1533a) arrayList.get(i);
        if (c1533a != null) {
            extEditor(strM3300a, c1533a.f4594a, false);
        }
    }

    /* JADX INFO: renamed from: b */
    protected final void m2704b() {
        if (!MainActivity.m2784a(this)) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle(R.string.please_note);
            builder.setMessage(R.string.build_not_support_tip);
            builder.show();
            return;
        }
        m2680p();
        if (!SettingActivity.m2811f(this)) {
            m2708b(true);
            return;
        }
        new C1293fc(this, this.f2911X, this.f2912Y, this.f2949e.m3308b(), this.f2949e.m3312c(), this.f2949e.m3317d()).m3276a();
    }

    /* JADX INFO: renamed from: b */
    protected final void m2705b(int i) {
        String string = getString(R.string.select_folder_replace);
        ArrayList arrayList = new ArrayList();
        new DialogC1197cn(this, new C1131am(this), null, this.f2949e.m3300a(arrayList) + "/" + ((C1533a) arrayList.get(i)).f4594a, string, true, true, false, null).show();
    }

    /* JADX INFO: renamed from: b */
    protected final void m2706b(String str, String str2) throws Throwable {
        FileInputStream fileInputStream;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        fileOutputStream2 = null;
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(str2);
            try {
                fileOutputStream = new FileOutputStream(str);
                try {
                    C1067a.m2506b(fileInputStream, fileOutputStream);
                    m2648a(fileInputStream);
                    m2648a(fileOutputStream);
                } catch (IOException e) {
                    e = e;
                    fileInputStream2 = fileInputStream;
                    try {
                        e.printStackTrace();
                        m2648a(fileInputStream2);
                        m2648a(fileOutputStream);
                    } catch (Throwable th) {
                        th = th;
                        fileInputStream = fileInputStream2;
                        fileOutputStream2 = fileOutputStream;
                        m2648a(fileInputStream);
                        m2648a(fileOutputStream2);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream2 = fileOutputStream;
                    m2648a(fileInputStream);
                    m2648a(fileOutputStream2);
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
                fileOutputStream = null;
                fileInputStream2 = fileInputStream;
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e3) {
            e = e3;
            fileOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            fileInputStream = null;
        }
    }

    @Override // com.gmail.heagoo.apkeditor.InterfaceC1304fn
    /* JADX INFO: renamed from: b */
    public void mo2707b(Set set) {
        if (!(!set.isEmpty())) {
            this.f2898J.setVisibility(8);
            this.f2901M.setVisibility(8);
            this.f2897I.setVisibility(0);
            this.f2900L.setVisibility(0);
            return;
        }
        this.f2897I.setVisibility(8);
        this.f2900L.setVisibility(8);
        this.f2898J.setVisibility(0);
        this.f2901M.setVisibility(0);
        this.f2902N.setText(String.format(getString(R.string.num_items_selected), Integer.valueOf(set.size())));
    }

    /* JADX INFO: renamed from: b */
    protected final void m2708b(boolean z) {
        this.f2934ao = false;
        HashSet hashSet = new HashSet();
        Log.d("DEBUG", "resModifyTime=" + C1559h.m3775b(new File(this.f2946b + "/res")));
        Log.d("DEBUG", "manifestTime=" + C1559h.m3775b(new File(this.f2946b + "/AndroidManifest.xml")));
        Map mapM3308b = this.f2949e.m3308b();
        Map mapM3312c = this.f2949e.m3312c();
        Set<String> setM3317d = this.f2949e.m3317d();
        this.f2930ak = new HashMap();
        this.f2931al = new HashMap();
        this.f2932am = new ArrayList();
        for (Map.Entry entry : mapM3308b.entrySet()) {
            String str = (String) entry.getKey();
            if (str.startsWith("res/")) {
                if (!this.f2934ao && !m2661b(str)) {
                    this.f2934ao = true;
                }
                this.f2930ak.put(entry.getKey(), entry.getValue());
            } else if (m2643a(str, hashSet) == null) {
                this.f2930ak.put(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry entry2 : mapM3312c.entrySet()) {
            String str2 = (String) entry2.getKey();
            if (str2.equals(ApkUtils.ANDROID_MANIFEST_ZIP_ENTRY_NAME) || str2.startsWith("res/")) {
                if (!this.f2934ao && !m2661b(str2)) {
                    this.f2934ao = true;
                }
                this.f2931al.put(entry2.getKey(), entry2.getValue());
            } else if (m2643a(str2, hashSet) == null) {
                this.f2931al.put(entry2.getKey(), entry2.getValue());
            }
        }
        for (String str3 : setM3317d) {
            if (str3.startsWith("res/")) {
                if (!this.f2934ao && !m2661b(str3)) {
                    this.f2934ao = true;
                }
                this.f2932am.add(str3);
            } else if (m2643a(str3, hashSet) == null) {
                this.f2932am.add(str3);
            }
        }
        this.f2933an = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            this.f2933an.add((String) it.next());
        }
        m2666d(z);
    }

    /* JADX INFO: renamed from: c */
    protected final void m2709c() {
        if (this.f2922ab != 2) {
            this.f2922ab = 2;
            m2681q();
        }
    }

    @Override // com.gmail.heagoo.apkeditor.p099ui.InterfaceC1457b
    /* JADX INFO: renamed from: c */
    public final void mo2710c(String str) {
        this.f2949e.m3309b(this.f2949e.m3300a((List) null), str);
    }

    @Override // com.gmail.heagoo.apkeditor.InterfaceC1161bf
    /* JADX INFO: renamed from: c */
    public final void mo2711c(boolean z) {
        this.f2935ap = m2682r();
        if (this.f2935ap) {
            runOnUiThread(new RunnableC1455u(this));
        }
    }

    /* JADX INFO: renamed from: d */
    protected final void m2712d() {
        SharedPreferences defaultSharedPreferences;
        int i;
        if (this.f2922ab == 1) {
            return;
        }
        this.f2922ab = 1;
        m2681q();
        if (this.f2929aj || (i = (defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this)).getInt("HideSmaliMsgShown", 0)) > 0 || !SettingActivity.m2810e(this)) {
            return;
        }
        Toast.makeText(this, R.string.hide_smali_tip, 1).show();
        SharedPreferences.Editor editorEdit = defaultSharedPreferences.edit();
        editorEdit.putInt("HideSmaliMsgShown", i + 1);
        editorEdit.apply();
    }

    @Override // com.gmail.heagoo.apkeditor.p099ui.InterfaceC1457b
    /* JADX INFO: renamed from: d */
    public final void mo2713d(String str) {
        new DialogC1284ey(this, new C1454t(this, str, this.f2949e.m3300a((List) null)), -1).show();
    }

    /* JADX INFO: renamed from: e */
    protected final void m2714e() {
        if (this.f2922ab != 0) {
            this.f2922ab = 0;
            m2681q();
        }
    }

    @Override // com.gmail.heagoo.apkeditor.InterfaceC1161bf
    /* JADX INFO: renamed from: e */
    public final void mo2715e(String str) {
        runOnUiThread(new RunnableC1488x(this, str));
    }

    protected final void editorSwitch(String str, String str2, boolean z) {
        if (!SettingActivity.extEditor(this) || str2.equals("colors.xml")) {
            m2698a(str, str2, z);
        } else {
            extEditor(str, str2, z);
        }
    }

    /* JADX INFO: renamed from: f */
    protected final void m2716f() {
        new DialogC1197cn(this, new C1132an(this), null, this.f2949e.m3300a((List) null), getString(R.string.add_a_file)).show();
    }

    /* JADX INFO: renamed from: f */
    public final void m2717f(String str) {
        Intent intent;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        m2659b(str, arrayList, arrayList2);
        try {
            if (m2653a((Context) this)) {
                intent = new Intent("android.intent.action.VIEW");
                intent.addCategory("android.intent.category.DEFAULT");
                intent.setDataAndType(null, "application/com.gmail.heagoo.apkeditor-translate");
            } else {
                ComponentName componentName = new ComponentName("apkeditor.translate", "apkeditor.translate.TranslateActivity");
                intent = new Intent();
                intent.setComponent(componentName);
            }
            Bundle bundle = new Bundle();
            String str2 = C1067a.m2525d(this, "tmp") + "translated";
            C1067a.m2487a(str2, arrayList);
            bundle.putString("translatedList_file", str2);
            String str3 = C1067a.m2525d(this, "tmp") + "untranslatedList";
            C1067a.m2487a(str3, arrayList2);
            bundle.putString("untranslatedList_file", str3);
            bundle.putString("targetLanguageCode", str);
            intent.putExtras(bundle);
            startActivityForResult(intent, 1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: g */
    public final String m2718g(String str) {
        String str2;
        String str3;
        boolean z = true;
        Resources resources = getResources();
        if (str.length() < 3) {
            return resources.getString(R.string.invalid_lang_code);
        }
        if (!this.f2921aa) {
            return resources.getString(R.string.wait_for_decoding);
        }
        List<TranslateItem> arrayList = new ArrayList();
        List<TranslateItem> arrayList2 = new ArrayList();
        m2659b(str, arrayList, arrayList2);
        if (arrayList2.isEmpty()) {
            return resources.getString(R.string.lang_exist);
        }
        ArrayList arrayList3 = new ArrayList();
        for (TranslateItem translateItem : arrayList2) {
            arrayList3.add(new StringItem(translateItem.name, translateItem.originValue));
        }
        Iterator it = this.f2948d.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                str2 = null;
                z = false;
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str4 = (String) entry.getKey();
            if (str4.equals(str)) {
                ((ArrayList) entry.getValue()).addAll(arrayList3);
                str2 = str4;
                break;
            }
        }
        if (str2 == null) {
            this.f2948d.put(str, arrayList3);
            str3 = str;
        } else {
            str3 = str2;
        }
        try {
            if (z) {
                List arrayList4 = new ArrayList();
                for (TranslateItem translateItem2 : arrayList) {
                    arrayList4.add(new StringItem(translateItem2.name, translateItem2.translatedValue));
                }
                arrayList4.addAll(arrayList3);
                m2658b(str, arrayList4);
            } else {
                m2658b(str, arrayList3);
            }
            this.f2911X = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.f2892D = str3;
        m2687w();
        return null;
    }

    /* JADX INFO: renamed from: g */
    protected final void m2719g() {
        new DialogC1456a(this, this, this.f2957m).show();
    }

    @Override // com.gmail.heagoo.apkeditor.p097f.InterfaceC1288b
    /* JADX INFO: renamed from: h */
    public final void mo2720h() {
        this.f2924ae.setVisibility(4);
        this.f2926ag.setVisibility(4);
        this.f2925af.setVisibility(0);
    }

    /* JADX INFO: renamed from: h */
    protected final void m2721h(String str) {
        ArrayList arrayList = new ArrayList();
        C1192cg c1192cg = new C1192cg();
        c1192cg.f3493c = false;
        c1192cg.f3492b = false;
        c1192cg.f3491a = str;
        arrayList.add(c1192cg);
        m2660b(arrayList);
    }

    /* JADX INFO: renamed from: i */
    public final String m2722i() {
        return this.f2946b;
    }

    @Override // com.gmail.heagoo.apkeditor.InterfaceC1208cz
    /* JADX INFO: renamed from: i */
    public final void mo2723i(String str) throws Throwable {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            fileOutputStream = new FileOutputStream(this.f2946b + "/AndroidManifest.xml");
        } catch (IOException e) {
            fileOutputStream = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            fileOutputStream.write(str.getBytes());
            this.f2912Y = true;
            try {
                fileOutputStream.close();
            } catch (IOException e2) {
            }
        } catch (IOException e3) {
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e4) {
                }
            }
        } catch (Throwable th2) {
            fileOutputStream2 = fileOutputStream;
            th = th2;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException e5) {
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: j */
    public final C1296ff m2724j() {
        return this.f2949e;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m2725k() {
        return this.f2929aj;
    }

    /* JADX INFO: renamed from: l */
    public final String m2726l() {
        return this.f2914a;
    }

    /* JADX INFO: renamed from: m */
    public final C1553b m2727m() {
        return this.f2947c;
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        switch (i) {
            case 0:
            case 3:
                if (i2 != 0) {
                    ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("modifiedFiles");
                    if (stringArrayListExtra != null) {
                        Iterator<String> it = stringArrayListExtra.iterator();
                        while (it.hasNext()) {
                            m2695a(it.next(), (String) null);
                        }
                    } else {
                        m2664c(intent.getStringExtra("xmlPath"), intent.getStringExtra("extraString"));
                    }
                }
                break;
            case 1:
                if (i2 == 10005) {
                    finish();
                }
                break;
            case 2:
                if (i2 != 0) {
                    m2701a(true);
                }
                break;
            case 1000:
                if (i2 == -1) {
                    Bundle extras = intent.getExtras();
                    String string = extras.getString("targetLanguageCode");
                    List<TranslateItem> list = (List) C1067a.m2542j(extras.getString("translatedList_file"));
                    if (list != null && !list.isEmpty()) {
                        ArrayList arrayList = new ArrayList();
                        for (TranslateItem translateItem : list) {
                            arrayList.add(new StringItem(translateItem.name, translateItem.translatedValue));
                        }
                        try {
                            m2649a(string, arrayList);
                            Toast.makeText(this, String.format(getString(R.string.save_succeed_tip), Integer.valueOf(arrayList.size())), 0).show();
                        } catch (Exception e) {
                            Toast.makeText(this, e.getMessage(), 1).show();
                            return;
                        }
                        break;
                    }
                }
                break;
            case PointerIconCompat.TYPE_CONTEXT_MENU /* 1001 */:
                this.f2949e.m3318d(this.f2915aA, this.f2945az);
                if ((this.f2946b + "/AnfroidManifest.xml").equals(this.f2915aA)) {
                    m2701a(true);
                }
                if (this.f2916aB != null) {
                    this.f2916aB.mo3344a();
                }
                break;
            case PointerIconCompat.TYPE_HAND /* 1002 */:
                if (new File(this.f2918aD).lastModified() > this.f2920aF) {
                    m2664c(this.f2918aD, this.f2919aE);
                }
                break;
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        boolean z = false;
        if (this.f2922ab == 1 && this.f2949e != null) {
            if (!this.f2949e.m3319e().isEmpty()) {
                this.f2949e.m3307a(false);
                z = true;
            } else if (!this.f2949e.m3323f()) {
                String strM3300a = this.f2949e.m3300a((List) null);
                String strSubstring = strM3300a.substring(0, strM3300a.lastIndexOf(47));
                this.f2949e.m3313c(strSubstring);
                this.f2950f.m3334a(strSubstring);
                try {
                    C0085e c0085e = (C0085e) this.f2896H.pop();
                    this.f2895G.setSelectionFromTop(((Integer) c0085e.f229a).intValue(), ((Integer) c0085e.f230b).intValue());
                } catch (Exception e) {
                }
                z = true;
            }
        }
        if (z) {
            return;
        }
        AlertDialog.Builder negativeButton = new AlertDialog.Builder(this).setMessage(R.string.sure_to_exit_editing).setPositiveButton(R.string.yes, new DialogInterfaceOnClickListenerC1116aa(this)).setNegativeButton(R.string.no, (DialogInterface.OnClickListener) null);
        if (this.f2917aC == null && (this.f2910W == null || !this.f2910W.isAlive())) {
            negativeButton.setMessage(R.string.sure_to_exit);
            negativeButton.setNeutralButton(R.string.save_as_project, new DialogInterfaceOnClickListenerC1133ao(this));
        }
        negativeButton.show();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.search_button) {
            String strTrim = ((EditText) findViewById(R.id.keyword_edit)).getText().toString().trim();
            if (strTrim.equals("")) {
                m2685u();
            } else {
                String lowerCase = strTrim.toLowerCase();
                ArrayList<StringItem> arrayList = (ArrayList) this.f2948d.get(this.f2892D);
                if (arrayList != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (StringItem stringItem : arrayList) {
                        if (stringItem.value.toLowerCase().contains(lowerCase)) {
                            arrayList2.add(stringItem);
                        }
                    }
                    m2651a(arrayList2);
                }
                this.f2941av.m3026a(strTrim);
            }
            ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 2);
            return;
        }
        if (id == R.id.btn_search_mf) {
            String strTrim2 = ((EditText) findViewById(R.id.mf_keyword)).getText().toString().trim();
            if (strTrim2.equals("")) {
                Toast.makeText(this, R.string.empty_input_tip, 0).show();
                return;
            }
            this.f2943ax.m3026a(strTrim2);
            ArrayList<Integer> arrayList3 = new ArrayList<>();
            ArrayList<String> arrayList4 = new ArrayList<>();
            m2650a(strTrim2, arrayList3, arrayList4);
            if (arrayList3.isEmpty()) {
                Toast.makeText(this, R.string.notfound_in_manifest, 0).show();
                return;
            }
            Intent intent = new Intent(this, (Class<?>) MfSearchRetActivity.class);
            Bundle bundle = new Bundle();
            bundle.putString("xmlPath", this.f2946b + "/AndroidManifest.xml");
            bundle.putIntegerArrayList("lineIndexs", arrayList3);
            bundle.putStringArrayList("lineContents", arrayList4);
            intent.putExtras(bundle);
            startActivityForResult(intent, 2);
            return;
        }
        if (id == R.id.menu_search_res) {
            String strTrim3 = ((EditText) findViewById(R.id.et_res_keyword)).getText().toString().trim();
            if (strTrim3.equals("")) {
                Toast.makeText(this, R.string.empty_input_tip, 0).show();
                return;
            }
            if (this.f2949e != null) {
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                String strM3300a = this.f2949e.m3300a(arrayList6);
                if (!"..".equals(((C1533a) arrayList6.get(0)).f4594a)) {
                    arrayList5.add(((C1533a) arrayList6.get(0)).f4594a);
                }
                for (int i = 1; i < arrayList6.size(); i++) {
                    arrayList5.add(((C1533a) arrayList6.get(i)).f4594a);
                }
                m2697a(strTrim3, strM3300a, arrayList5, !this.f2953i, this.f2954j);
                return;
            }
            return;
        }
        if (id == R.id.imageview_dex2smali) {
            if (!C1067a.m2486a((Context) this, "smali_license_showed", false)) {
                new DialogC1336gt(this).show();
            }
            m2692a((InterfaceC1207cy) null);
        } else {
            if (id == R.id.down_arrow_container) {
                this.f2923ad.setVisibility(8);
                return;
            }
            if (id == R.id.menu_webserver) {
                C1579e.m3816a().m3823a(this, this.f2946b);
                return;
            }
            if (id == R.id.menu_apply_patch) {
                new DialogC1280eu(this).show();
            } else if (id == R.id.translate) {
                DialogC1215dh dialogC1215dh = new DialogC1215dh(this, PossibleLanguages.languages, PossibleLanguages.codes);
                dialogC1215dh.setTitle(R.string.select_target_lang);
                dialogC1215dh.show();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x03c0  */
    @Override // android.app.Activity
    @SuppressLint({"NewApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onCreate(Bundle bundle) {
        String lastPathSegment;
        setTheme(C0037k.mdNoActionBar(C0037k.m89a(this)));
        ProjectInfo_V1 projectInfo_V1M2640a = null;
        super.onCreate(bundle);
        setContentView(R.layout.activity_apkinfo);
        this.f2917aC = C1067a.m2457a(getIntent(), "projectName");
        if (this.f2917aC != null) {
            try {
                projectInfo_V1M2640a = m2640a(C1067a.m2525d(this, ".projects") + this.f2917aC);
                this.f2914a = projectInfo_V1M2640a.apkPath;
                this.f2946b = projectInfo_V1M2640a.decodeRootPath;
            } catch (Exception e) {
                Toast.makeText(this, R.string.cannot_load_project_info, 1).show();
                finish();
                return;
            }
        } else {
            Uri data = getIntent().getData();
            if (data != null) {
                if (ContextCompat.checkSelfPermission(this, "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                    ActivityCompat.requestPermissions(this, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, PointerIconCompat.TYPE_HELP);
                }
                if (this == null || data == null) {
                    lastPathSegment = null;
                } else if (Build.VERSION.SDK_INT < 19 || !DocumentsContract.isDocumentUri(this, data)) {
                    lastPathSegment = gzd.COLUMN_CONTENT.equalsIgnoreCase(data.getScheme()) ? "com.google.android.apps.photos.content".equals(data.getAuthority()) ? data.getLastPathSegment() : C1067a.m2456a(this, data, (String) null, (String[]) null) : "file".equalsIgnoreCase(data.getScheme()) ? data.getPath() : null;
                } else if ("com.android.externalstorage.documents".equals(data.getAuthority())) {
                    lastPathSegment = Environment.getExternalStorageDirectory() + "/" + DocumentsContract.getDocumentId(data).split(":")[1];
                } else if ("com.android.providers.downloads.documents".equals(data.getAuthority())) {
                    lastPathSegment = C1067a.m2456a(this, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.valueOf(DocumentsContract.getDocumentId(data)).longValue()), (String) null, (String[]) null);
                } else if ("com.android.providers.media.documents".equals(data.getAuthority())) {
                    String[] strArrSplit = DocumentsContract.getDocumentId(data).split(":");
                    String str = strArrSplit[0];
                    lastPathSegment = C1067a.m2456a(this, "image".equals(str) ? MediaStore.Images.Media.EXTERNAL_CONTENT_URI : "video".equals(str) ? MediaStore.Video.Media.EXTERNAL_CONTENT_URI : "audio".equals(str) ? MediaStore.Audio.Media.EXTERNAL_CONTENT_URI : null, "_id=?", new String[]{strArrSplit[1]});
                }
                this.f2914a = lastPathSegment;
            }
            if (this.f2914a == null) {
                this.f2914a = C1067a.m2457a(getIntent(), "apkPath");
            }
            this.f2946b = C1067a.m2457a(getIntent(), "decodeRootPath");
            if (this.f2946b == null) {
                String strM2813h = SettingActivity.m2813h(this);
                if (strM2813h != null) {
                    this.f2946b = strM2813h + "/decoded";
                } else {
                    this.f2946b = getFilesDir().getAbsolutePath() + "/decoded";
                }
            }
        }
        try {
            if (this.f2914a != null && !"".equals(this.f2914a)) {
                new C1552a();
                this.f2947c = C1552a.m3750a(this, this.f2914a);
            }
        } catch (Exception e2) {
        }
        this.f2890B = new C1338gv(this);
        this.f2958n = (ImageView) findViewById(R.id.app_icon);
        this.f2959o = (TextView) findViewById(R.id.app_name);
        this.f2960p = (TextView) findViewById(R.id.app_pkgpath);
        this.f2961q = (RadioButton) findViewById(R.id.tab_string);
        this.f2962r = (RadioButton) findViewById(R.id.tab_resource);
        this.f2963s = (RadioButton) findViewById(R.id.tab_manifest);
        if (m2679o()) {
            this.f2963s.setVisibility(8);
        }
        findViewById(R.id.tv_not_support).setVisibility(8);
        findViewById(R.id.layout_search_mf).setVisibility(0);
        findViewById(R.id.btn_search_mf).setOnClickListener(this);
        this.f2964z = (LinearLayout) findViewById(R.id.string_layout);
        this.f2889A = (ListView) findViewById(R.id.string_list);
        this.f2894F = (LinearLayout) findViewById(R.id.resource_layout);
        this.f2895G = (ListView) findViewById(R.id.resource_list);
        findViewById(R.id.menu_search_res).setOnClickListener(this);
        this.f2897I = findViewById(R.id.res_search_layout);
        this.f2898J = findViewById(R.id.res_menu_layout);
        this.f2899K = (HorizontalScrollView) findViewById(R.id.res_navi_scrollView);
        this.f2900L = (LinearLayout) findViewById(R.id.res_header_navigation);
        this.f2901M = findViewById(R.id.res_header_selection);
        this.f2950f = new ViewOnClickListenerC1302fl(this, this.f2946b, this.f2900L, this.f2899K);
        this.f2902N = (TextView) findViewById(R.id.selection_tip);
        this.f2903O = (LinearLayout) findViewById(R.id.manifest_layout);
        this.f2904P = (ListView) findViewById(R.id.manifest_list);
        this.f2906R = (LinearLayout) findViewById(R.id.layout_loading);
        if (this.f2947c != null) {
            this.f2958n.setImageDrawable(this.f2947c.f4631c);
            this.f2959o.setText(this.f2947c.f4629a);
            this.f2960p.setText(this.f2947c.f4630b);
        } else {
            if (this.f2917aC != null) {
                this.f2958n.setImageResource(R.drawable.apk_icon);
                this.f2959o.setText(this.f2917aC);
            } else {
                this.f2958n.setImageResource(R.drawable.parse_error);
                this.f2959o.setText("UNKNOWN");
            }
            this.f2960p.setVisibility(8);
        }
        this.f2889A.setAdapter((ListAdapter) this.f2890B);
        this.f2889A.setOnItemClickListener(this.f2890B);
        this.f2889A.setOnItemLongClickListener(this.f2890B);
        this.f2923ad = findViewById(R.id.dex_decode_layout);
        if (SettingActivity.m2810e(this)) {
            this.f2924ae = (Button) findViewById(R.id.imageview_dex2smali);
            this.f2924ae.setOnClickListener(this);
            this.f2924ae.setOnLongClickListener(this);
            this.f2925af = (ProgressBar) findViewById(R.id.progressbar_dex2smali);
            this.f2926ag = findViewById(R.id.decode_result_layout);
            this.f2927ah = (TextView) findViewById(R.id.decode_result_title);
            this.f2928ai = (TextView) findViewById(R.id.decode_result_detail);
            findViewById(R.id.down_arrow_container).setOnClickListener(this);
        } else {
            this.f2923ad.setVisibility(8);
        }
        this.f2951g = (ImageView) findViewById(R.id.imageview_text_check);
        this.f2952h = (ImageView) findViewById(R.id.imageview_insensitive_check);
        m2677n();
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) findViewById(R.id.keyword_edit);
        this.f2941av = new C1119a(this, "string_keywords");
        autoCompleteTextView.setAdapter(this.f2941av);
        AutoCompleteTextView autoCompleteTextView2 = (AutoCompleteTextView) findViewById(R.id.et_res_keyword);
        this.f2942aw = new C1119a(this, "res_keywords");
        autoCompleteTextView2.setAdapter(this.f2942aw);
        AutoCompleteTextView autoCompleteTextView3 = (AutoCompleteTextView) findViewById(R.id.mf_keyword);
        this.f2943ax = new C1119a(this, "mf_keywords");
        autoCompleteTextView3.setAdapter(this.f2943ax);
        if (bundle != null) {
            m2644a(bundle);
            return;
        }
        if (this.f2917aC == null) {
            this.f2957m = C1067a.m2509b(getIntent(), "isFullDecoding");
            this.f2910W = new C1162bg(this, this, this.f2914a, this.f2946b, this.f2957m);
            this.f2910W.start();
        } else if (projectInfo_V1M2640a == null || projectInfo_V1M2640a.state == null) {
            Toast.makeText(this, R.string.cannot_load_project_info, 1).show();
            finish();
        } else {
            Bundle bundle2 = new Bundle();
            projectInfo_V1M2640a.state.toBundle(bundle2);
            m2644a(bundle2);
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        C1579e.m3816a().m3822a(this);
        super.onDestroy();
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        String strSubstring;
        boolean z = false;
        ArrayList arrayList = new ArrayList();
        String strM3300a = this.f2949e.m3300a(arrayList);
        C1533a c1533a = (C1533a) arrayList.get(i);
        if (c1533a == null) {
            return;
        }
        if (!this.f2949e.m3319e().isEmpty()) {
            this.f2949e.m3302a(i);
            return;
        }
        if (!c1533a.f4595b) {
            editorSwitch(strM3300a, c1533a.f4594a, c1533a.f4596c);
            return;
        }
        if (c1533a.f4594a.equals("..")) {
            z = true;
            strSubstring = strM3300a.substring(0, strM3300a.lastIndexOf(47));
        } else {
            int firstVisiblePosition = this.f2895G.getFirstVisiblePosition();
            View childAt = this.f2895G.getChildAt(0);
            this.f2896H.push(new C0085e(Integer.valueOf(firstVisiblePosition), Integer.valueOf(childAt == null ? 0 : childAt.getTop() - this.f2895G.getPaddingTop())));
            strSubstring = strM3300a + "/" + c1533a.f4594a;
        }
        this.f2949e.m3313c(strSubstring);
        this.f2950f.m3334a(strSubstring);
        if (!z) {
            this.f2895G.setSelectionAfterHeaderView();
            return;
        }
        try {
            C0085e c0085e = (C0085e) this.f2896H.pop();
            this.f2895G.setSelectionFromTop(((Integer) c0085e.f229a).intValue(), ((Integer) c0085e.f230b).intValue());
        } catch (Exception e) {
        }
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(AdapterView adapterView, View view, int i, long j) {
        adapterView.setOnCreateContextMenuListener(new ViewOnCreateContextMenuListenerC1122ad(this, i, i == 0));
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        if (view.getId() != R.id.imageview_dex2smali) {
            return false;
        }
        this.f2923ad.setVisibility(8);
        return true;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        String strM2525d;
        try {
            if (this.f2917aC != null) {
                strM2525d = C1067a.m2525d(this, ".projects") + this.f2917aC + "/";
            } else {
                strM2525d = C1067a.m2525d(this, "tmp");
            }
            m2639a(strM2525d, false, (File) null).toBundle(bundle);
        } catch (Exception e) {
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
    }
}
