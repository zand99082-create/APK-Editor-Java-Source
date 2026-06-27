package com.gmail.heagoo.pngeditor;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.PopupWindow;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import com.gmail.heagoo.apkeditor.AboutModActivity;
import com.gmail.heagoo.apkeditor.pro.R;
import com.gmail.heagoo.common.C1557f;
import com.gmail.heagoo.common.C1563l;
import com.gmail.heagoo.pngeditor.p101a.C1617a;
import com.gmail.heagoo.pngeditor.p101a.C1618b;
import com.gmail.heagoo.pngeditor.p101a.C1619c;
import com.p080c.p081a.C1022f;
import com.p080c.p081a.InterfaceC1025i;
import p000a.p001a.p003b.p004a.C0037k;

/* JADX INFO: loaded from: classes.dex */
public class PngEditActivity extends AppCompatActivity implements View.OnClickListener, SeekBar.OnSeekBarChangeListener, InterfaceC1025i {

    /* JADX INFO: renamed from: b */
    private String f4889b;

    /* JADX INFO: renamed from: c */
    private String f4890c;

    /* JADX INFO: renamed from: d */
    private TextView f4891d;

    /* JADX INFO: renamed from: e */
    private View f4892e;

    /* JADX INFO: renamed from: f */
    private View f4893f;

    /* JADX INFO: renamed from: g */
    private C1022f f4894g;

    /* JADX INFO: renamed from: h */
    private View f4895h;

    /* JADX INFO: renamed from: i */
    private View f4896i;

    /* JADX INFO: renamed from: j */
    private View f4897j;

    /* JADX INFO: renamed from: k */
    private View f4898k;

    /* JADX INFO: renamed from: l */
    private TextView f4899l;

    /* JADX INFO: renamed from: m */
    private SeekBar f4900m;

    /* JADX INFO: renamed from: n */
    private TextView f4901n;

    /* JADX INFO: renamed from: o */
    private SeekBar f4902o;

    /* JADX INFO: renamed from: p */
    private TextView f4903p;

    /* JADX INFO: renamed from: q */
    private TextView f4904q;

    /* JADX INFO: renamed from: r */
    private Bitmap f4905r;

    /* JADX INFO: renamed from: s */
    private Bitmap f4906s;

    /* JADX INFO: renamed from: u */
    private InterfaceC1616a f4908u;

    /* JADX INFO: renamed from: v */
    private PopupWindow f4909v;

    /* JADX INFO: renamed from: w */
    private PopupWindow f4910w;

    /* JADX INFO: renamed from: a */
    private int f4888a = 1;

    /* JADX INFO: renamed from: t */
    private boolean f4907t = false;

    /* JADX INFO: renamed from: a */
    private void m3959a() {
        if (this.f4908u == null) {
            return;
        }
        if (this.f4908u.mo3976a()) {
            new AlertDialog.Builder(this).setMessage(R.string.image_modified_tip).setPositiveButton(android.R.string.yes, new DialogInterfaceOnClickListenerC1622d(this)).setNegativeButton(android.R.string.no, (DialogInterface.OnClickListener) null).show();
        } else {
            m3967c();
        }
    }

    /* JADX INFO: renamed from: a */
    private void m3960a(int i) {
        View viewInflate = View.inflate(this, R.layout.pngeditor_dlg_size_input, null);
        EditText editText = (EditText) viewInflate.findViewById(R.id.et_width);
        EditText editText2 = (EditText) viewInflate.findViewById(R.id.et_height);
        editText.setText(this.f4903p.getText());
        editText2.setText(this.f4904q.getText());
        switch (i) {
            case 0:
                editText.requestFocus();
                break;
            case 1:
                editText2.requestFocus();
                break;
        }
        new AlertDialog.Builder(this).setTitle(R.string.input_new_size).setView(viewInflate).setPositiveButton(android.R.string.ok, new DialogInterfaceOnClickListenerC1625g(this, editText, editText2)).setNegativeButton(android.R.string.cancel, (DialogInterface.OnClickListener) null).show();
    }

    /* JADX INFO: renamed from: a */
    private static void m3961a(View view, int i, int i2, int i3, int i4) {
        if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).setMargins(i, 0, 0, 0);
            view.requestLayout();
        }
    }

    /* JADX INFO: renamed from: a */
    private void m3963a(InterfaceC1616a interfaceC1616a, View view) {
        this.f4908u = interfaceC1616a;
        view.setVisibility(0);
        this.f4895h.setVisibility(4);
        this.f4893f.setVisibility(0);
        this.f4892e.setVisibility(4);
        this.f4903p.setText(String.valueOf(this.f4905r.getWidth()));
        this.f4904q.setText(String.valueOf(this.f4905r.getHeight()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m3965b() {
        if (C1563l.m3777a(this.f4905r, this.f4889b)) {
            Toast.makeText(this, R.string.image_saved, 0).show();
        } else {
            Toast.makeText(this, R.string.image_save_failed, 1).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public void m3967c() {
        this.f4908u = null;
        this.f4896i.setVisibility(4);
        this.f4897j.setVisibility(4);
        this.f4898k.setVisibility(4);
        this.f4895h.setVisibility(0);
        this.f4893f.setVisibility(4);
        this.f4892e.setVisibility(0);
    }

    @Override // com.p080c.p081a.InterfaceC1025i
    @SuppressLint({"DefaultLocale"})
    /* JADX INFO: renamed from: a */
    public final void mo2341a(float f) {
        this.f4891d.setText(String.format("%d%%", Integer.valueOf((int) (100.0f * f))));
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.f4895h.getVisibility() != 0) {
            m3959a();
        } else if (this.f4907t) {
            new AlertDialog.Builder(this).setMessage(R.string.image_save_tip).setPositiveButton(R.string.save, new DialogInterfaceOnClickListenerC1621c(this)).setNegativeButton(R.string.discard, new DialogInterfaceOnClickListenerC1620b(this)).setNeutralButton(android.R.string.cancel, (DialogInterface.OnClickListener) null).show();
        } else {
            finish();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.btn_remove_bg) {
            m3963a(new C1617a(), this.f4896i);
            return;
        }
        if (id == R.id.btn_remove_it) {
            this.f4908u.mo3975a("tolerance", Integer.valueOf(this.f4900m.getProgress()));
            this.f4906s = this.f4908u.mo3974a(this.f4905r);
            if (this.f4894g == null || this.f4906s == null) {
                return;
            }
            this.f4894g.setImageBitmap(this.f4906s);
            return;
        }
        if (id == R.id.btn_confirm) {
            if (!this.f4908u.mo3976a()) {
                Toast.makeText(this, R.string.no_change, 0).show();
                return;
            }
            this.f4905r = this.f4906s;
            this.f4907t = true;
            m3967c();
            return;
        }
        if (id == R.id.btn_save) {
            if (this.f4907t) {
                m3965b();
                return;
            } else {
                Toast.makeText(this, R.string.no_change, 0).show();
                return;
            }
        }
        if (id == R.id.btn_cancel) {
            m3959a();
            return;
        }
        if (id == R.id.btn_resize) {
            m3963a(new C1618b(), this.f4897j);
            return;
        }
        if (id == R.id.btn_do_resize) {
            String string = this.f4903p.getText().toString();
            String string2 = this.f4904q.getText().toString();
            boolean zIsChecked = ((CheckBox) findViewById(R.id.cb_without_zoom)).isChecked();
            try {
                int iIntValue = Integer.valueOf(string).intValue();
                try {
                    int iIntValue2 = Integer.valueOf(string2).intValue();
                    this.f4908u.mo3975a("width", Integer.valueOf(iIntValue));
                    this.f4908u.mo3975a("height", Integer.valueOf(iIntValue2));
                    this.f4908u.mo3975a("zooming", Boolean.valueOf(!zIsChecked));
                    this.f4906s = this.f4908u.mo3974a(this.f4905r);
                    if (this.f4894g == null || this.f4906s == null) {
                        return;
                    }
                    this.f4894g.setImageBitmap(this.f4906s);
                    return;
                } catch (Exception e) {
                    return;
                }
            } catch (Exception e2) {
                return;
            }
        }
        if (id == R.id.btn_transparency) {
            m3963a(new C1619c(), this.f4898k);
            return;
        }
        if (id == R.id.btn_transparency_preview) {
            this.f4908u.mo3975a("transparency", Integer.valueOf((this.f4902o.getProgress() * 255) / this.f4902o.getMax()));
            this.f4906s = this.f4908u.mo3974a(this.f4905r);
            if (this.f4894g == null || this.f4906s == null) {
                return;
            }
            this.f4894g.setImageBitmap(this.f4906s);
            return;
        }
        if (id == R.id.width_labelvalue) {
            m3960a(0);
            return;
        }
        if (id == R.id.height_labelvalue) {
            m3960a(1);
            return;
        }
        if (id == R.id.tv_scale) {
            if (this.f4909v == null) {
                View viewInflate = View.inflate(this, R.layout.pngeditor_scale_options, null);
                ViewOnClickListenerC1623e viewOnClickListenerC1623e = new ViewOnClickListenerC1623e(this);
                viewInflate.findViewById(R.id.btn_scale_fit).setOnClickListener(viewOnClickListenerC1623e);
                viewInflate.findViewById(R.id.btn_scale_100).setOnClickListener(viewOnClickListenerC1623e);
                viewInflate.findViewById(R.id.btn_scale_200).setOnClickListener(viewOnClickListenerC1623e);
                viewInflate.findViewById(R.id.btn_scale_400).setOnClickListener(viewOnClickListenerC1623e);
                this.f4909v = new PopupWindow(viewInflate, C1557f.m3763a(this), findViewById(R.id.btn_remove_bg).getHeight());
            }
            this.f4909v.setFocusable(true);
            this.f4909v.setOutsideTouchable(true);
            this.f4909v.showAsDropDown(view);
        }
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        setTheme(C0037k.m91md(C0037k.m89a(this)));
        super.onCreate(bundle);
        setContentView(R.layout.pngeditor_activity);
        this.f4889b = getIntent().getStringExtra("filePath");
        this.f4890c = this.f4889b.substring(this.f4889b.lastIndexOf(47) + 1);
        getActionBar().hide();
        ViewGroup viewGroup = (ViewGroup) getLayoutInflater().inflate(R.layout.pngeditor_actionbar, (ViewGroup) null);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(true);
            supportActionBar.setDisplayShowTitleEnabled(false);
            supportActionBar.setDisplayShowCustomEnabled(true);
            supportActionBar.setCustomView(viewGroup);
        }
        this.f4891d = (TextView) findViewById(R.id.tv_scale);
        this.f4891d.setPaintFlags(this.f4891d.getPaintFlags() | 8);
        this.f4891d.setOnClickListener(this);
        findViewById(R.id.btn_save);
        this.f4892e = findViewById(R.id.normal_action_layout);
        this.f4893f = findViewById(R.id.edit_action_layout);
        findViewById(R.id.btn_save).setOnClickListener(this);
        findViewById(R.id.btn_confirm).setOnClickListener(this);
        findViewById(R.id.btn_cancel).setOnClickListener(this);
        this.f4895h = findViewById(R.id.tools_layout);
        this.f4896i = findViewById(R.id.remove_bg_layout);
        this.f4897j = findViewById(R.id.resize_layout);
        this.f4898k = findViewById(R.id.transparency_layout);
        this.f4899l = (TextView) findViewById(R.id.tv_tolerance);
        this.f4900m = (SeekBar) findViewById(R.id.seekbar_tolerance);
        this.f4900m.setOnSeekBarChangeListener(this);
        this.f4901n = (TextView) findViewById(R.id.tv_transparency);
        this.f4902o = (SeekBar) findViewById(R.id.seekbar_transparency);
        this.f4902o.setOnSeekBarChangeListener(this);
        this.f4903p = (TextView) findViewById(R.id.tv_width_value);
        this.f4904q = (TextView) findViewById(R.id.tv_height_value);
        this.f4903p.setPaintFlags(this.f4903p.getPaintFlags() | 8);
        this.f4904q.setPaintFlags(this.f4904q.getPaintFlags() | 8);
        findViewById(R.id.width_labelvalue).setOnClickListener(this);
        findViewById(R.id.height_labelvalue).setOnClickListener(this);
        findViewById(R.id.btn_remove_bg).setOnClickListener(this);
        findViewById(R.id.btn_remove_it).setOnClickListener(this);
        findViewById(R.id.btn_resize).setOnClickListener(this);
        findViewById(R.id.btn_do_resize).setOnClickListener(this);
        findViewById(R.id.btn_transparency).setOnClickListener(this);
        findViewById(R.id.btn_transparency_preview).setOnClickListener(this);
        if (ContextCompat.checkSelfPermission(this, "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            ActivityCompat.requestPermissions(this, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, this.f4888a);
        }
        new AsyncTaskC1626h(this).execute(new Void[0]);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.pngeditor_main, menu);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            onBackPressed();
            return true;
        }
        if (itemId != R.id.action_background) {
            if (itemId != R.id.action_help) {
                return super.onOptionsItemSelected(menuItem);
            }
            startActivity(new Intent(this, (Class<?>) AboutModActivity.class));
            return true;
        }
        if (this.f4910w == null) {
            View viewInflate = View.inflate(this, R.layout.pngeditor_bgcolor, null);
            viewInflate.findViewById(R.id.btn_close).setOnClickListener(new ViewOnClickListenerC1624f(this));
            ((SeekBar) viewInflate.findViewById(R.id.seekbar_bgcolor)).setOnSeekBarChangeListener(this);
            viewInflate.measure(0, 0);
            this.f4910w = new PopupWindow(viewInflate, C1557f.m3763a(this), viewInflate.getMeasuredHeight());
        }
        this.f4910w.setFocusable(true);
        this.f4910w.setOutsideTouchable(true);
        this.f4910w.showAsDropDown(this.f4891d);
        return true;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        int id = seekBar.getId();
        int paddingLeft = seekBar.getPaddingLeft();
        int width = paddingLeft + ((((seekBar.getWidth() - paddingLeft) - seekBar.getPaddingRight()) * seekBar.getProgress()) / seekBar.getMax());
        if (id == R.id.seekbar_tolerance) {
            this.f4899l.setText(String.valueOf(i));
            this.f4899l.measure(0, 0);
            m3961a(this.f4899l, width - (this.f4899l.getMeasuredWidth() / 2), 0, 0, 0);
        } else if (id == R.id.seekbar_transparency) {
            this.f4901n.setText(String.valueOf(i));
            this.f4901n.measure(0, 0);
            m3961a(this.f4901n, width - (this.f4901n.getMeasuredWidth() / 2), 0, 0, 0);
        } else if (id == R.id.seekbar_bgcolor) {
            int i2 = i >= 0 ? i : 0;
            int i3 = 255 - (i2 <= 255 ? i2 : 255);
            findViewById(R.id.overall_layout).setBackgroundColor(i3 | (-16777216) | (i3 << 16) | (i3 << 8));
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity, android.support.v4.app.ActivityCompat.OnRequestPermissionsResultCallback
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(SeekBar seekBar) {
    }
}
