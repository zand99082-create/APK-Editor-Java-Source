package com.gmail.heagoo.sqliteutil;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ContentValues;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.gmail.heagoo.apkeditor.pro.R;
import com.gmail.heagoo.p084a.p089c.C1068ax;
import com.gmail.heagoo.sqliteutil.p102a.C1628a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p000a.p001a.p003b.p004a.C0037k;

/* JADX INFO: loaded from: classes.dex */
public class SqliteRowViewActivity extends Activity implements View.OnClickListener, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a */
    private String f4929a;

    /* JADX INFO: renamed from: b */
    private String f4930b;

    /* JADX INFO: renamed from: c */
    private String f4931c;

    /* JADX INFO: renamed from: d */
    private ArrayList f4932d;

    /* JADX INFO: renamed from: e */
    private ArrayList f4933e;

    /* JADX INFO: renamed from: f */
    private ArrayList f4934f;

    /* JADX INFO: renamed from: g */
    private ArrayList f4935g;

    /* JADX INFO: renamed from: h */
    private ListView f4936h;

    /* JADX INFO: renamed from: i */
    private boolean f4937i = true;

    /* JADX INFO: renamed from: j */
    private int f4938j;

    /* JADX INFO: renamed from: a */
    private String m3977a(List list) {
        String str = "";
        for (int i = 0; i < this.f4934f.size(); i++) {
            if ("1".equals(this.f4934f.get(i))) {
                list.add(this.f4935g.get(i));
                str = "".equals(str) ? ((String) this.f4932d.get(i)) + "=?" : str + " AND " + ((String) this.f4932d.get(i)) + "=?";
            }
        }
        if ("".equals(str)) {
            for (int i2 = 0; i2 < this.f4932d.size(); i2++) {
                list.add(this.f4935g.get(i2));
                str = "".equals(str) ? ((String) this.f4932d.get(i2)) + "=?" : str + " AND " + ((String) this.f4932d.get(i2)) + "=?";
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: a */
    private void m3978a() throws Exception {
        if (this.f4930b.equals(this.f4929a)) {
            return;
        }
        String path = Environment.getExternalStorageDirectory().getPath();
        if (!path.endsWith("/")) {
            path = path + "/";
        }
        this.f4930b = (path + "HackAppData/tmp/") + "tmp.db";
        if (!new C1632c().m4029b(String.format("cat %s > %s", this.f4930b, this.f4929a), null, 2000)) {
            throw new Exception("Can not write to DB file.");
        }
    }

    /* JADX INFO: renamed from: a */
    static /* synthetic */ void m3979a(SqliteRowViewActivity sqliteRowViewActivity) throws Exception {
        SQLiteDatabase sQLiteDatabaseOpenDatabase = SQLiteDatabase.openDatabase(sqliteRowViewActivity.f4930b, null, 0);
        try {
            if (sQLiteDatabaseOpenDatabase == null) {
                throw new Exception("Can not open database.");
            }
            try {
                ArrayList arrayList = new ArrayList();
                sQLiteDatabaseOpenDatabase.delete(sqliteRowViewActivity.f4931c, sqliteRowViewActivity.m3977a(arrayList), (String[]) arrayList.toArray(new String[arrayList.size()]));
                sQLiteDatabaseOpenDatabase.close();
                sqliteRowViewActivity.m3978a();
                sqliteRowViewActivity.setResult(1);
            } catch (Exception e) {
                throw e;
            }
        } catch (Throwable th) {
            sQLiteDatabaseOpenDatabase.close();
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    private C1628a m3980b() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f4932d.size(); i++) {
            HashMap map = new HashMap();
            map.put("NAME", this.f4932d.get(i));
            map.put("VALUE", this.f4935g.get(i));
            arrayList.add(map);
        }
        return new C1628a(this, arrayList, R.layout.item_sql_raw, new String[]{"NAME", "VALUE"}, new int[]{android.R.id.text1, android.R.id.text2}, this.f4938j != 0);
    }

    /* JADX INFO: renamed from: a */
    public final void m3981a(int i, Object obj) {
        String str = (String) this.f4932d.get(i);
        SQLiteDatabase sQLiteDatabaseOpenDatabase = SQLiteDatabase.openDatabase(this.f4930b, null, 0);
        try {
            if (sQLiteDatabaseOpenDatabase == null) {
                throw new Exception("Can not open database.");
            }
            try {
                ContentValues contentValues = new ContentValues();
                if (obj instanceof String) {
                    contentValues.put(str, (String) obj);
                } else if (obj instanceof Boolean) {
                    contentValues.put(str, (Boolean) obj);
                } else if (obj instanceof Integer) {
                    contentValues.put(str, (Integer) obj);
                } else if (obj instanceof Long) {
                    contentValues.put(str, (Long) obj);
                } else if (obj instanceof Short) {
                    contentValues.put(str, (Short) obj);
                } else if (obj instanceof Double) {
                    contentValues.put(str, (Double) obj);
                } else if (obj instanceof Float) {
                    contentValues.put(str, (Float) obj);
                } else {
                    if (!(obj instanceof Byte)) {
                        throw new Exception("Unrecognized value type!");
                    }
                    contentValues.put(str, (Byte) obj);
                }
                ArrayList arrayList = new ArrayList();
                if (sQLiteDatabaseOpenDatabase.update(this.f4931c, contentValues, m3977a(arrayList), (String[]) arrayList.toArray(new String[arrayList.size()])) <= 0) {
                    throw new Exception("Failed or no change detected!");
                }
                sQLiteDatabaseOpenDatabase.close();
                m3978a();
                this.f4935g.set(i, obj.toString());
                this.f4936h.setAdapter((ListAdapter) m3980b());
                setResult(1);
            } catch (Exception e) {
                throw e;
            }
        } catch (Throwable th) {
            sQLiteDatabaseOpenDatabase.close();
            throw th;
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id != R.id.btn_delete) {
            if (id == R.id.btn_close) {
                finish();
                return;
            }
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(R.string.confirm_title);
        builder.setMessage(R.string.msg_delete_record);
        builder.setNegativeButton(R.string.no, (DialogInterface.OnClickListener) null);
        builder.setPositiveButton(R.string.yes, new DialogInterfaceOnClickListenerC1635f(this));
        builder.create();
        builder.show();
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        setTheme(C0037k.mdNoActionBar(C0037k.m89a(this)));
        super.onCreate(bundle);
        requestWindowFeature(1);
        Intent intent = getIntent();
        this.f4938j = C1068ax.c_006(intent, "themeId");
        setContentView(R.layout.sql_activity_rowview);
        this.f4929a = C1068ax.a_008(intent, "originDbFilePath");
        this.f4930b = C1068ax.a_008(intent, "dbFilePath");
        this.f4931c = C1068ax.a_008(intent, "tableName");
        this.f4932d = C1068ax.d_013(intent, "columnNames");
        this.f4933e = C1068ax.d_013(intent, "columnTypes");
        this.f4934f = C1068ax.d_013(intent, "columnIsPKs");
        this.f4935g = C1068ax.d_013(intent, "rowData");
        this.f4936h = (ListView) findViewById(R.id.tableRowList);
        this.f4936h.setAdapter((ListAdapter) m3980b());
        this.f4936h.setCacheColorHint(0);
        this.f4936h.setOnItemClickListener(this);
        View viewFindViewById = findViewById(R.id.btn_delete);
        if (this.f4937i) {
            viewFindViewById.setOnClickListener(this);
        } else {
            viewFindViewById.setVisibility(8);
        }
        findViewById(R.id.btn_close).setOnClickListener(this);
        setResult(0);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        new DialogC1640k(this, this.f4933e, this.f4932d, this.f4934f, this.f4935g, i, this.f4937i, this.f4938j).show();
    }
}
