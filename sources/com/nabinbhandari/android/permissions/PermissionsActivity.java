package com.nabinbhandari.android.permissions;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.nabinbhandari.android.permissions.C1690b;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class PermissionsActivity extends Activity {

    /* JADX INFO: renamed from: e */
    static AbstractC1689a f5024e;

    /* JADX INFO: renamed from: a */
    private ArrayList<String> f5025a;

    /* JADX INFO: renamed from: b */
    private ArrayList<String> f5026b;

    /* JADX INFO: renamed from: c */
    private ArrayList<String> f5027c;

    /* JADX INFO: renamed from: d */
    private C1690b.a f5028d;

    /* JADX INFO: renamed from: com.nabinbhandari.android.permissions.PermissionsActivity$a */
    class DialogInterfaceOnClickListenerC1684a implements DialogInterface.OnClickListener {
        DialogInterfaceOnClickListenerC1684a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            if (i != -1) {
                PermissionsActivity.this.m4049a();
            } else {
                PermissionsActivity permissionsActivity = PermissionsActivity.this;
                permissionsActivity.requestPermissions(permissionsActivity.m4052a((ArrayList<String>) permissionsActivity.f5026b), 6937);
            }
        }
    }

    /* JADX INFO: renamed from: com.nabinbhandari.android.permissions.PermissionsActivity$b */
    class DialogInterfaceOnCancelListenerC1685b implements DialogInterface.OnCancelListener {
        DialogInterfaceOnCancelListenerC1685b() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            PermissionsActivity.this.m4049a();
        }
    }

    /* JADX INFO: renamed from: com.nabinbhandari.android.permissions.PermissionsActivity$c */
    class DialogInterfaceOnCancelListenerC1686c implements DialogInterface.OnCancelListener {
        DialogInterfaceOnCancelListenerC1686c() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            PermissionsActivity.this.m4049a();
        }
    }

    /* JADX INFO: renamed from: com.nabinbhandari.android.permissions.PermissionsActivity$d */
    class DialogInterfaceOnClickListenerC1687d implements DialogInterface.OnClickListener {
        DialogInterfaceOnClickListenerC1687d() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            PermissionsActivity.this.m4049a();
        }
    }

    /* JADX INFO: renamed from: com.nabinbhandari.android.permissions.PermissionsActivity$e */
    class DialogInterfaceOnClickListenerC1688e implements DialogInterface.OnClickListener {
        DialogInterfaceOnClickListenerC1688e() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            PermissionsActivity.this.startActivityForResult(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.fromParts("package", PermissionsActivity.this.getPackageName(), null)), 6739);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m4049a() {
        AbstractC1689a abstractC1689a = f5024e;
        finish();
        if (abstractC1689a != null) {
            abstractC1689a.mo4059b(getApplicationContext(), this.f5026b);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m4050a(String str) {
        DialogInterfaceOnClickListenerC1684a dialogInterfaceOnClickListenerC1684a = new DialogInterfaceOnClickListenerC1684a();
        new AlertDialog.Builder(this).setTitle(this.f5028d.f5036b).setMessage(str).setPositiveButton(R.string.ok, dialogInterfaceOnClickListenerC1684a).setNegativeButton(R.string.cancel, dialogInterfaceOnClickListenerC1684a).setOnCancelListener(new DialogInterfaceOnCancelListenerC1685b()).create().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public String[] m4052a(ArrayList<String> arrayList) {
        int size = arrayList.size();
        String[] strArr = new String[size];
        for (int i = 0; i < size; i++) {
            strArr[i] = arrayList.get(i);
        }
        return strArr;
    }

    /* JADX INFO: renamed from: b */
    private void m4053b() {
        AbstractC1689a abstractC1689a = f5024e;
        finish();
        if (abstractC1689a != null) {
            abstractC1689a.mo4056a();
        }
    }

    /* JADX INFO: renamed from: c */
    private void m4055c() {
        if (!this.f5028d.f5039e) {
            m4049a();
        } else {
            C1690b.m4061a("Ask to go to settings.");
            new AlertDialog.Builder(this).setTitle(this.f5028d.f5037c).setMessage(this.f5028d.f5038d).setPositiveButton(this.f5028d.f5035a, new DialogInterfaceOnClickListenerC1688e()).setNegativeButton(R.string.cancel, new DialogInterfaceOnClickListenerC1687d()).setOnCancelListener(new DialogInterfaceOnCancelListenerC1686c()).create().show();
        }
    }

    @Override // android.app.Activity
    public void finish() {
        f5024e = null;
        super.finish();
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        if (i == 6739 && f5024e != null) {
            C1690b.m4060a(this, m4052a(this.f5025a), null, this.f5028d, f5024e);
        }
        super.finish();
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setFinishOnTouchOutside(false);
        Intent intent = getIntent();
        if (intent == null || !intent.hasExtra("permissions")) {
            finish();
            return;
        }
        getWindow().setStatusBarColor(0);
        this.f5025a = (ArrayList) intent.getSerializableExtra("permissions");
        C1690b.a aVar = (C1690b.a) intent.getSerializableExtra("options");
        this.f5028d = aVar;
        if (aVar == null) {
            this.f5028d = new C1690b.a();
        }
        this.f5026b = new ArrayList<>();
        this.f5027c = new ArrayList<>();
        boolean z = true;
        for (String str : this.f5025a) {
            if (checkSelfPermission(str) != 0) {
                this.f5026b.add(str);
                if (shouldShowRequestPermissionRationale(str)) {
                    z = false;
                } else {
                    this.f5027c.add(str);
                }
            }
        }
        if (this.f5026b.isEmpty()) {
            m4053b();
            return;
        }
        String stringExtra = intent.getStringExtra("rationale");
        if (z || TextUtils.isEmpty(stringExtra)) {
            C1690b.m4061a("No rationale.");
            requestPermissions(m4052a(this.f5026b), 6937);
        } else {
            C1690b.m4061a("Show rationale.");
            m4050a(stringExtra);
        }
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (iArr.length != 0) {
            this.f5026b.clear();
            for (int i2 = 0; i2 < iArr.length; i2++) {
                if (iArr[i2] != 0) {
                    this.f5026b.add(strArr[i2]);
                }
            }
            if (this.f5026b.size() == 0) {
                C1690b.m4061a("Just allowed.");
                m4053b();
                return;
            }
            ArrayList<String> arrayList = new ArrayList<>();
            ArrayList<String> arrayList2 = new ArrayList<>();
            ArrayList arrayList3 = new ArrayList();
            for (String str : this.f5026b) {
                if (shouldShowRequestPermissionRationale(str)) {
                    arrayList3.add(str);
                } else {
                    arrayList.add(str);
                    if (!this.f5027c.contains(str)) {
                        arrayList2.add(str);
                    }
                }
            }
            if (arrayList2.size() > 0) {
                AbstractC1689a abstractC1689a = f5024e;
                finish();
                if (abstractC1689a != null) {
                    abstractC1689a.m4057a(getApplicationContext(), arrayList2, this.f5026b);
                    return;
                }
                return;
            }
            if (arrayList3.size() <= 0) {
                AbstractC1689a abstractC1689a2 = f5024e;
                if (abstractC1689a2 == null || abstractC1689a2.m4058a(getApplicationContext(), arrayList)) {
                    finish();
                    return;
                } else {
                    m4055c();
                    return;
                }
            }
        }
        m4049a();
    }
}
