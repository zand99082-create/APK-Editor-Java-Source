package ru.maximoff.apkeditor.translate;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.NotificationCompat;
import android.support.v4.view.PointerIconCompat;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import com.gmail.heagoo.apkeditor.pro.R;
import com.gmail.heagoo.apkeditor.translate.TranslateItem;
import jadx.core.deobf.Deobfuscator;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class TranslateActivity extends Activity implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public static boolean f5292a;

    /* JADX INFO: renamed from: b */
    private boolean f5293b;

    /* JADX INFO: renamed from: c */
    private SharedPreferences f5294c;

    /* JADX INFO: renamed from: d */
    private Map f5295d;

    /* JADX INFO: renamed from: e */
    private String f5296e;

    /* JADX INFO: renamed from: f */
    private String f5297f;

    /* JADX INFO: renamed from: g */
    private String f5298g;

    /* JADX INFO: renamed from: h */
    private String f5299h;

    /* JADX INFO: renamed from: i */
    private String f5300i;

    /* JADX INFO: renamed from: j */
    private String f5301j;

    /* JADX INFO: renamed from: k */
    private LinearLayout f5302k;

    /* JADX INFO: renamed from: m */
    private LinearLayout f5304m;

    /* JADX INFO: renamed from: n */
    private LinearLayout f5305n;

    /* JADX INFO: renamed from: o */
    private TextView f5306o;

    /* JADX INFO: renamed from: p */
    private TextView f5307p;

    /* JADX INFO: renamed from: q */
    private Button f5308q;

    /* JADX INFO: renamed from: t */
    private List f5311t;

    /* JADX INFO: renamed from: u */
    private List f5312u;

    /* JADX INFO: renamed from: y */
    private boolean f5316y;

    /* JADX INFO: renamed from: z */
    private boolean f5317z;

    /* JADX INFO: renamed from: l */
    private Map f5303l = new HashMap();

    /* JADX INFO: renamed from: r */
    private boolean f5309r = false;

    /* JADX INFO: renamed from: s */
    private boolean f5310s = false;

    /* JADX INFO: renamed from: v */
    private int f5313v = 0;

    /* JADX INFO: renamed from: w */
    private int f5314w = 0;

    /* JADX INFO: renamed from: x */
    private int f5315x = 0;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public int m4320a(String[] strArr, String str) {
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = i;
            if (i2 >= strArr.length) {
                return 1;
            }
            String str2 = strArr[i2];
            if ((str.startsWith("zh-") && str2.equals("zh")) || str2.equals(str)) {
                return i3;
            }
            i = i3 + 1;
            i2++;
        }
    }

    /* JADX INFO: renamed from: a */
    private View m4321a(TranslateItem translateItem) {
        View viewInflate = getLayoutInflater().inflate(this.f5317z ? R.layout.abc_action_menu_item_layout : R.layout.abc_action_bar_up_container, (ViewGroup) null, false);
        ((TextView) viewInflate.findViewById(R.array.fileTypeAudio)).setText(translateItem.name);
        ((TextView) viewInflate.findViewById(R.array.fileTypePPT)).setText(translateItem.originValue);
        EditText editText = (EditText) viewInflate.findViewById(R.array.fileTypePackage);
        editText.setTag(translateItem.originValue);
        this.f5303l.put(translateItem.name, editText);
        if (translateItem.translatedValue != null) {
            editText.setText(translateItem.translatedValue);
        }
        ImageView imageView = (ImageView) viewInflate.findViewById(R.array.fileTypeImage);
        imageView.setClickable(true);
        imageView.setTag(editText);
        imageView.setOnClickListener(new ViewOnClickListenerC1971l(this));
        ImageView imageView2 = (ImageView) viewInflate.findViewById(R.array.fileTypeExcel);
        imageView2.setClickable(true);
        imageView2.setTag(editText);
        imageView2.setOnClickListener(new ViewOnClickListenerC1972m(this));
        return viewInflate;
    }

    /* JADX INFO: renamed from: a */
    private void m4322a() {
        m4346d();
        m4328a(this.f5311t);
        if (this.f5294c.getBoolean("skip_dialog", false)) {
            m4356h();
        } else {
            m4336b();
        }
    }

    /* JADX INFO: renamed from: a */
    private void m4323a(Activity activity, String[] strArr) {
        if (Build.VERSION.SDK_INT < 23) {
            m4322a();
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            String string = new StringBuffer().append("android.permission.").append(str).toString();
            if (activity.checkSelfPermission(string) != 0) {
                arrayList.add(string);
            }
        }
        if (arrayList.size() == 0) {
            m4322a();
        } else {
            activity.requestPermissions((String[]) arrayList.toArray(new String[arrayList.size()]), PointerIconCompat.TYPE_ALIAS);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m4324a(ImageView imageView) {
        if (imageView.getTag() instanceof EditText) {
            EditText editText = (EditText) imageView.getTag();
            if (editText.getTag() instanceof String) {
                String str = (String) editText.getTag();
                if (m4343c(str)) {
                    editText.setText(str);
                    editText.requestFocus();
                    return;
                }
                imageView.setImageResource(R.drawable.abc_cab_background_top_material);
                imageView.setClickable(false);
                imageView.setEnabled(false);
                m4326a(getString(2131099655));
                C1962c c1962c = new C1962c(this, this.f5299h, this.f5298g, str);
                c1962c.m4372a(this.f5296e);
                c1962c.m4373a(this.f5295d);
                c1962c.m4375a(this.f5293b);
                c1962c.m4374a(new C1975p(this, editText, imageView));
                c1962c.m4371a();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m4325a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m4326a(String str) {
        Toast.makeText(this, str, 0).show();
    }

    /* JADX INFO: renamed from: a */
    private void m4327a(String str, Object obj) throws Throwable {
        Throwable th;
        Closeable closeable;
        IOException e;
        Closeable closeable2 = (ObjectOutputStream) null;
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(new File(str)));
            try {
                objectOutputStream.writeObject(obj);
                objectOutputStream.flush();
                closeable2 = objectOutputStream;
            } catch (IOException e2) {
                e = e2;
                closeable2 = objectOutputStream;
                try {
                    e.printStackTrace();
                } catch (Throwable th2) {
                    th = th2;
                    closeable = closeable2;
                    m4325a(closeable);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                closeable = objectOutputStream;
                m4325a(closeable);
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
        } catch (Throwable th4) {
            th = th4;
            closeable = closeable2;
        }
        m4325a(closeable2);
    }

    /* JADX INFO: renamed from: a */
    private void m4328a(List list) {
        this.f5302k = (LinearLayout) findViewById(R.array.sign_values);
        this.f5304m = (LinearLayout) findViewById(R.array.file_extract_rename_key);
        this.f5305n = (LinearLayout) findViewById(R.array.order_value);
        this.f5306o = (TextView) this.f5304m.findViewById(R.array.order_key);
        this.f5307p = (TextView) this.f5305n.findViewById(R.array.signer_key);
        if (list != null) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= list.size()) {
                    break;
                }
                this.f5302k.addView(m4321a((TranslateItem) list.get(i2)));
                i = i2 + 1;
            }
        }
        this.f5308q = (Button) findViewById(R.array.signer_value_dont_translate);
        this.f5308q.setOnClickListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public String m4335b(String str) {
        if (str == null) {
            return (String) null;
        }
        String strReplaceAll = str.replaceAll("\\\\\\s{1,2}\"", "\\\\\"").replaceAll("\\\\\\s{1,2}'", "\\\\'");
        return (strReplaceAll.contains("%") || strReplaceAll.contains(Deobfuscator.INNER_CLASS_SEPARATOR)) ? strReplaceAll.replaceAll("%\\s{0,2}(\\d)\\s{0,2}\\$\\s{0,2}([dDsSдДсС])", "%$1\\$$2").replaceAll("%\\s{0,2}(\\d)\\s{0,2}\\$\\s{0,2}(\\d+)([dDsSдДсС])", "%$1\\$$2$3").replaceAll("%\\s{0,2}(\\d|\\w)", "%$1").replaceAll("%\\s{0,2}([dDдД])", "%d").replaceAll("%\\s{0,2}([sSсС])", "%s").replaceAll("\\$\\s{0,2}([dDдД])", "\\$d").replaceAll("\\$\\s{0,2}(\\d+)([dDдД])", "\\$$1d").replaceAll("\\$\\s{0,2}([sSсС])", "\\$s").replaceAll("%\\s{0,2}(\\d)\\$(ов|ы)", "%$1\\$s").replaceAll("%(\\d)\\$s\\sв$", "%$1\\$s").replaceAll("([a-zA-Zа-яА-Я:/.,])%(\\d|\\w)", "$1 %$2").replaceAll("%d\\s{1,2}%%", "%d%% ") : strReplaceAll.contains("...") ? strReplaceAll.replaceAll("\\s\\.{3}$", "...") : strReplaceAll;
    }

    /* JADX INFO: renamed from: b */
    private void m4336b() {
        String[] stringArray = getResources().getStringArray(R.anim.abc_popup_exit);
        String[] stringArray2 = getResources().getStringArray(R.anim.abc_popup_enter);
        String[] stringArray3 = getResources().getStringArray(R.anim.abc_grow_fade_in_from_bottom);
        String[] stringArray4 = getResources().getStringArray(R.anim.abc_fade_out);
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, getResources().getStringArray(R.anim.abc_fade_in));
        ArrayAdapter arrayAdapter2 = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, stringArray);
        ArrayAdapter arrayAdapter3 = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, (String[]) Arrays.copyOfRange(stringArray, 1, stringArray.length));
        ArrayAdapter arrayAdapter4 = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, stringArray3);
        ArrayAdapter arrayAdapter5 = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, (String[]) Arrays.copyOfRange(stringArray3, 1, stringArray3.length));
        View viewInflate = getLayoutInflater().inflate(R.layout.abc_action_menu_layout, (ViewGroup) null, false);
        Spinner spinner = (Spinner) viewInflate.findViewById(R.array.fileTypePdf);
        Spinner spinner2 = (Spinner) viewInflate.findViewById(R.array.fileTypeText);
        Spinner spinner3 = (Spinner) viewInflate.findViewById(R.array.fileTypeVideo);
        CheckBox checkBox = (CheckBox) viewInflate.findViewById(R.array.fileTypeWebText);
        CheckBox checkBox2 = (CheckBox) viewInflate.findViewById(R.array.fileTypeWord);
        CheckBox checkBox3 = (CheckBox) viewInflate.findViewById(R.array.appicon_value);
        spinner.setAdapter((SpinnerAdapter) arrayAdapter);
        spinner2.setAdapter((SpinnerAdapter) (this.f5293b ? arrayAdapter2 : arrayAdapter4));
        spinner3.setAdapter((SpinnerAdapter) (this.f5293b ? arrayAdapter3 : arrayAdapter5));
        spinner.setSelection(this.f5293b ? 0 : 1);
        spinner3.setSelection(m4320a(this.f5293b ? stringArray2 : stringArray4, m4358i()) - 1);
        spinner.setOnItemSelectedListener(new C1964e(this, spinner2, arrayAdapter2, arrayAdapter4, spinner3, arrayAdapter3, arrayAdapter5, stringArray2, stringArray4));
        ViewOnClickListenerC1965f viewOnClickListenerC1965f = new ViewOnClickListenerC1965f(this);
        checkBox.setChecked(this.f5317z);
        checkBox2.setChecked(this.f5316y);
        checkBox.setOnClickListener(viewOnClickListenerC1965f);
        checkBox2.setOnClickListener(viewOnClickListenerC1965f);
        checkBox3.setOnClickListener(viewOnClickListenerC1965f);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(false);
        builder.setView(viewInflate);
        builder.setPositiveButton(2131099669, new DialogInterfaceOnClickListenerC1966g(this, stringArray2, spinner2, stringArray4, spinner3));
        builder.setNegativeButton(2131099670, new DialogInterfaceOnClickListenerC1967h(this));
        builder.setNeutralButton(2131099671, (DialogInterface.OnClickListener) null);
        AlertDialog alertDialogCreate = builder.create();
        alertDialogCreate.setOnShowListener(new DialogInterfaceOnShowListenerC1968i(this, alertDialogCreate));
        alertDialogCreate.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m4337b(TranslateItem translateItem) {
        this.f5302k.addView(m4321a(translateItem));
        if (translateItem.translatedValue != null) {
            this.f5314w++;
        } else {
            this.f5315x++;
        }
        String string = getString(2131099656);
        int i = this.f5313v - this.f5315x;
        this.f5306o.setText(String.format(new StringBuffer().append("%d / %d ").append(string).toString(), new Integer(this.f5314w), new Integer(i)));
        if (this.f5314w >= i) {
            m4350e();
        }
    }

    /* JADX INFO: renamed from: b */
    private void m4338b(List list) throws Throwable {
        m4327a(this.f5300i, list);
        Intent intent = new Intent();
        intent.putExtra("targetLanguageCode", this.f5297f);
        intent.putExtra("translatedList_file", this.f5300i);
        setResult(-1, intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public void m4341c() {
        new AlertDialog.Builder(this).setCancelable(true).setTitle(2131099671).setItems(new String[]{"QIWI", "YooMoney", "PayPal", "4PDA"}, new DialogInterfaceOnClickListenerC1970k(this)).create().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public boolean m4343c(String str) {
        for (String str2 : new String[]{"string", "color", "dimen", "attr", "style", "drawable", "anim", "layout", "raw", "xml"}) {
            if (str.startsWith(new StringBuffer().append(new StringBuffer().append("@android:").append(str2).toString()).append("/").toString()) || str.startsWith(new StringBuffer().append(new StringBuffer().append("@").append(str2).toString()).append("/").toString())) {
                return true;
            }
        }
        for (String str3 : new String[]{"", "true", "false", "null", "%b %-e, %Y, %-l:%M:%S %p", "%1$d P", "MMMM d", "ccc, dd MMM yyyy", "MM/dd HH:mm:ss", "yy/MM/dd HH:mm:ss", "sans-serif", "sans-serif-light", "sans-serif-condensed", "sans-serif-black", "sans-serif-thin", "sans-serif-medium"}) {
            if (str.equals(str3)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    private Object m4344d(String str) throws Throwable {
        ClassNotFoundException e;
        IOException e2;
        ObjectInputStream objectInputStream;
        Object object = (Object) null;
        Closeable closeable = (ObjectInputStream) null;
        try {
            try {
                objectInputStream = new ObjectInputStream(new FileInputStream(new File(str)));
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e3) {
            e2 = e3;
        } catch (ClassNotFoundException e4) {
            e = e4;
        }
        try {
            object = objectInputStream.readObject();
            closeable = objectInputStream;
        } catch (IOException e5) {
            e2 = e5;
            closeable = objectInputStream;
            e2.printStackTrace();
        } catch (ClassNotFoundException e6) {
            e = e6;
            closeable = objectInputStream;
            e.printStackTrace();
        } catch (Throwable th2) {
            th = th2;
            closeable = objectInputStream;
            m4325a(closeable);
            throw th;
        }
        m4325a(closeable);
        return object;
    }

    /* JADX INFO: renamed from: d */
    private void m4346d() {
        this.f5311t = (List) m4344d(this.f5300i);
        this.f5312u = (List) m4344d(this.f5301j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public void m4350e() {
        f5292a = true;
        m4355g();
    }

    /* JADX INFO: renamed from: f */
    private void m4352f() throws Throwable {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f5303l.entrySet()) {
            String str = (String) entry.getKey();
            String string = ((EditText) entry.getValue()).getText().toString();
            if (!"".equals(string)) {
                arrayList.add(new TranslateItem(str, (String) null, string));
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        m4338b(arrayList);
    }

    /* JADX INFO: renamed from: g */
    private void m4355g() {
        this.f5309r = true;
        this.f5304m.setVisibility(8);
        this.f5305n.setVisibility(0);
        String string = this.f5313v == 0 ? getString(2131099660) : String.format(getString(2131099657), new Integer(this.f5314w));
        if (this.f5315x > 0) {
            string = new StringBuffer().append(string).append(String.format(new StringBuffer().append(", ").append(getString(2131099658)).toString(), new Integer(this.f5315x))).toString();
        }
        int i = (this.f5313v - this.f5314w) - this.f5315x;
        if (i > 0) {
            string = new StringBuffer().append(string).append(String.format(new StringBuffer().append(", ").append(getString(2131099659)).toString(), new Integer(i))).toString();
        }
        this.f5307p.setText(string);
        if (this.f5314w > 0) {
            this.f5308q.setText(2131099654);
        } else {
            this.f5308q.setText(2131099653);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public void m4356h() {
        this.f5306o.setText(2131099655);
        this.f5304m.setVisibility(0);
        this.f5305n.setVisibility(8);
        this.f5308q.setText(2131099651);
        this.f5310s = false;
        this.f5309r = false;
        this.f5313v = this.f5312u != null ? this.f5312u.size() : 0;
        this.f5314w = 0;
        this.f5315x = 0;
        if (this.f5313v > 0) {
            m4360j();
        } else {
            m4355g();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public String m4358i() {
        String strSubstring = this.f5297f.substring(1);
        int iIndexOf = strSubstring.indexOf(45);
        if (iIndexOf != -1) {
            strSubstring = new StringBuffer().append(strSubstring.substring(0, iIndexOf + 1)).append(strSubstring.substring(iIndexOf + 2)).toString();
        }
        return strSubstring.toLowerCase();
    }

    /* JADX INFO: renamed from: j */
    private void m4360j() {
        f5292a = false;
        AsyncTaskC1976q asyncTaskC1976q = new AsyncTaskC1976q(this, this.f5296e);
        asyncTaskC1976q.m4386a(this.f5293b);
        asyncTaskC1976q.m4385a(new C1973n(this));
        asyncTaskC1976q.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) throws Throwable {
        switch (view.getId()) {
            case R.array.signer_value_dont_translate /* 2131230728 */:
                if (!this.f5309r) {
                    m4350e();
                } else {
                    m4352f();
                    this.f5310s = true;
                    finish();
                }
                break;
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        Bundle extras;
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent != null && (extras = intent.getExtras()) != null) {
            this.f5297f = extras.getString("targetLanguageCode");
            this.f5298g = m4358i();
            this.f5300i = extras.getString("translatedList_file");
            this.f5301j = extras.getString("untranslatedList_file");
        }
        f5292a = false;
        this.f5295d = new HashMap();
        this.f5296e = new WebView(this).getSettings().getUserAgentString();
        this.f5299h = "auto";
        this.f5294c = PreferenceManager.getDefaultSharedPreferences(this);
        this.f5293b = this.f5294c.getInt(NotificationCompat.CATEGORY_SERVICE, 0) == 0;
        this.f5316y = this.f5294c.getBoolean("isFullScreen", false);
        this.f5317z = this.f5294c.getBoolean("isDark", true);
        if (this.f5316y) {
            getWindow().setFlags(1024, 1024);
        }
        if (this.f5317z) {
            setContentView(R.layout.abc_action_bar_title_item);
        } else {
            setTheme(R.string.abc_action_bar_up_description);
            setContentView(R.layout.mtrl_toolbar);
        }
        m4323a(this, new String[]{"READ_EXTERNAL_STORAGE", "WRITE_EXTERNAL_STORAGE"});
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        switch (i) {
            case PointerIconCompat.TYPE_ALIAS /* 1010 */:
                if (iArr.length > 0 && iArr[0] == 0) {
                    m4322a();
                } else if (!shouldShowRequestPermissionRationale(strArr[0])) {
                    m4326a(getString(2131099667));
                } else {
                    m4323a(this, new String[]{"READ_EXTERNAL_STORAGE", "WRITE_EXTERNAL_STORAGE"});
                }
                break;
            default:
                super.onRequestPermissionsResult(i, strArr, iArr);
                break;
        }
    }

    @Override // android.app.Activity
    protected void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.f5297f = bundle.getString("targetLanguageCode");
        this.f5298g = m4358i();
        this.f5300i = bundle.getString("translatedList_file");
        this.f5301j = bundle.getString("untranslatedList_file");
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        bundle.putString("targetLanguageCode", this.f5297f);
        bundle.putString("translatedList_file", this.f5300i);
        bundle.putString("untranslatedList_file", this.f5301j);
        super.onSaveInstanceState(bundle);
    }
}
