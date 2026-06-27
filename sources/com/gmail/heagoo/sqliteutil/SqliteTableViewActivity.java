package com.gmail.heagoo.sqliteutil;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.Button;
import android.widget.TableLayout;
import com.gmail.heagoo.apkeditor.pro.R;
import com.gmail.heagoo.p084a.p089c.C1068ax;
import com.gmail.heagoo.sqliteutil.p102a.InterfaceC1630c;
import com.gmail.heagoo.sqliteutil.p102a.ViewOnClickListenerC1629b;
import java.util.ArrayList;
import java.util.List;
import p000a.p001a.p003b.p004a.C0037k;

/* JADX INFO: loaded from: classes.dex */
public class SqliteTableViewActivity extends Activity implements InterfaceC1630c {

    /* JADX INFO: renamed from: a */
    private String f4945a;

    /* JADX INFO: renamed from: b */
    private String f4946b;

    /* JADX INFO: renamed from: c */
    private String f4947c;

    /* JADX INFO: renamed from: d */
    private ArrayList f4948d;

    /* JADX INFO: renamed from: e */
    private ArrayList f4949e;

    /* JADX INFO: renamed from: f */
    private ArrayList f4950f;

    /* JADX INFO: renamed from: g */
    private List f4951g;

    /* JADX INFO: renamed from: h */
    private TableLayout f4952h;

    /* JADX INFO: renamed from: i */
    private ViewOnClickListenerC1629b f4953i;

    /* JADX INFO: renamed from: j */
    private int f4954j = 0;

    /* JADX INFO: renamed from: k */
    private int f4955k;

    /* JADX INFO: renamed from: l */
    private Button f4956l;

    /* JADX INFO: renamed from: m */
    private Button f4957m;

    /* JADX INFO: renamed from: n */
    private int f4958n;

    /* JADX INFO: renamed from: a */
    private String m3988a(Cursor cursor, int i) {
        try {
            String str = (String) this.f4949e.get(i);
            if (m3999f(str)) {
                return cursor.getString(i);
            }
            if (m3996c(str)) {
                return new StringBuilder().append(cursor.getLong(i)).toString();
            }
            if (str.equalsIgnoreCase("DATE") || str.equalsIgnoreCase("DATETIME")) {
                return cursor.getString(i);
            }
            if (m3995b(str)) {
                return new StringBuilder().append(cursor.getFloat(i)).toString();
            }
            if (m3992a(str)) {
                return new StringBuilder().append(cursor.getDouble(i)).toString();
            }
            if (str.startsWith("BLOB")) {
                byte[] blob = cursor.getBlob(i);
                return blob.length > 64 ? "(Too big, first 64 byte): \n" + C1068ax.a_014(blob, 0, 64) : C1068ax.a_014(blob, 0, blob.length);
            }
            try {
                return cursor.getString(i);
            } catch (Exception e) {
                return "(un-supported type)";
            }
        } catch (Exception e2) {
            return "(error to parse)";
        }
    }

    /* JADX INFO: renamed from: a */
    private List m3989a(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT * FROM " + this.f4947c + " limit 30 offset " + i, null);
        while (cursorRawQuery.moveToNext()) {
            ArrayList arrayList2 = new ArrayList();
            for (int i3 = 0; i3 < this.f4948d.size(); i3++) {
                arrayList2.add(m3988a(cursorRawQuery, i3));
            }
            arrayList.add(arrayList2);
        }
        cursorRawQuery.close();
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    private void m3990a() {
        this.f4953i.m4021a(this.f4951g);
        this.f4953i.m4019a();
        this.f4953i.m4022b();
    }

    /* JADX INFO: renamed from: a */
    static /* synthetic */ void m3991a(SqliteTableViewActivity sqliteTableViewActivity) {
        sqliteTableViewActivity.f4954j -= 30;
        if (sqliteTableViewActivity.f4954j < 0) {
            sqliteTableViewActivity.f4954j = 0;
        }
        sqliteTableViewActivity.m3993b();
        if (sqliteTableViewActivity.f4954j > 0) {
            sqliteTableViewActivity.f4956l.setVisibility(0);
        } else {
            sqliteTableViewActivity.f4956l.setVisibility(8);
        }
        if (sqliteTableViewActivity.f4954j + sqliteTableViewActivity.f4951g.size() < sqliteTableViewActivity.f4955k) {
            sqliteTableViewActivity.f4957m.setVisibility(0);
        } else {
            sqliteTableViewActivity.f4957m.setVisibility(8);
        }
        sqliteTableViewActivity.m3990a();
    }

    /* JADX INFO: renamed from: a */
    protected static boolean m3992a(String str) {
        return str.equalsIgnoreCase("DOUBLE") || str.equalsIgnoreCase("DOUBLE PRECISION");
    }

    /* JADX INFO: renamed from: b */
    private void m3993b() {
        SQLiteDatabase sQLiteDatabaseOpenDatabase = SQLiteDatabase.openDatabase(this.f4946b, null, 1);
        this.f4951g = m3989a(sQLiteDatabaseOpenDatabase, this.f4954j, 30);
        sQLiteDatabaseOpenDatabase.close();
    }

    /* JADX INFO: renamed from: b */
    static /* synthetic */ void m3994b(SqliteTableViewActivity sqliteTableViewActivity) {
        sqliteTableViewActivity.f4954j += 30;
        sqliteTableViewActivity.m3993b();
        if (sqliteTableViewActivity.f4954j > 0) {
            sqliteTableViewActivity.f4956l.setVisibility(0);
        } else {
            sqliteTableViewActivity.f4956l.setVisibility(8);
        }
        if (sqliteTableViewActivity.f4954j + sqliteTableViewActivity.f4951g.size() < sqliteTableViewActivity.f4955k) {
            sqliteTableViewActivity.f4957m.setVisibility(0);
        } else {
            sqliteTableViewActivity.f4957m.setVisibility(8);
        }
        sqliteTableViewActivity.m3990a();
    }

    /* JADX INFO: renamed from: b */
    protected static boolean m3995b(String str) {
        return str.equalsIgnoreCase("REAL") || str.equalsIgnoreCase("FLOAT");
    }

    /* JADX INFO: renamed from: c */
    protected static boolean m3996c(String str) {
        return str.equalsIgnoreCase("INTEGER") || str.equalsIgnoreCase("LONG") || str.equalsIgnoreCase("TINYINT") || str.equalsIgnoreCase("SMALLINT") || str.equalsIgnoreCase("MEDIUMINT") || str.equalsIgnoreCase("BIGINT") || str.equalsIgnoreCase("UNSIGNED BIG INT") || str.startsWith("INT") || str.startsWith("BOOL");
    }

    /* JADX INFO: renamed from: d */
    protected static boolean m3997d(String str) {
        return str.startsWith("BOOL");
    }

    /* JADX INFO: renamed from: e */
    protected static boolean m3998e(String str) {
        return str.startsWith("BLOB");
    }

    /* JADX INFO: renamed from: f */
    protected static boolean m3999f(String str) {
        return str.equalsIgnoreCase("TEXT") || str.equalsIgnoreCase("NCHAR") || str.equalsIgnoreCase("CLOB") || str.endsWith("VARCHAR") || str.endsWith("CHARACTER") || str.startsWith("NUMERIC") || str.startsWith("DECIMAL");
    }

    @Override // com.gmail.heagoo.sqliteutil.p102a.InterfaceC1630c
    /* JADX INFO: renamed from: a */
    public final void mo3650a(int i, boolean z) {
        Intent intent = new Intent(this, (Class<?>) SqliteRowViewActivity.class);
        C1068ax.a_001(intent, "originDbFilePath", this.f4945a);
        C1068ax.a_001(intent, "dbFilePath", this.f4946b);
        C1068ax.a_001(intent, "tableName", this.f4947c);
        C1068ax.a_015(intent, "columnNames", this.f4948d);
        C1068ax.a_015(intent, "columnTypes", this.f4949e);
        C1068ax.a_015(intent, "columnIsPKs", this.f4950f);
        C1068ax.a_015(intent, "rowData", (ArrayList) this.f4951g.get(i));
        C1068ax.a_002(intent, "themeId", this.f4958n);
        startActivityForResult(intent, 0);
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        if (i == 0 && i2 == 1) {
            m3993b();
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        setTheme(C0037k.mdNoActionBar(C0037k.m89a(this)));
        super.onCreate(bundle);
        requestWindowFeature(1);
        this.f4958n = C1068ax.c_006(getIntent(), "themeId");
        setContentView(R.layout.sql_activity_tableview);
        this.f4945a = C1068ax.a_008(getIntent(), "originDbFilePath");
        this.f4946b = C1068ax.a_008(getIntent(), "dbFilePath");
        this.f4947c = C1068ax.a_008(getIntent(), "tableName");
        this.f4954j = 0;
        SQLiteDatabase sQLiteDatabaseOpenDatabase = SQLiteDatabase.openDatabase(this.f4946b, null, 1);
        if (this.f4948d == null) {
            this.f4948d = new ArrayList();
            this.f4949e = new ArrayList();
            this.f4950f = new ArrayList();
            Cursor cursorRawQuery = sQLiteDatabaseOpenDatabase.rawQuery("PRAGMA table_info(" + this.f4947c + ")", null);
            if (cursorRawQuery.moveToFirst()) {
                int columnIndex = cursorRawQuery.getColumnIndex("pk");
                do {
                    String string = cursorRawQuery.getString(1);
                    String string2 = cursorRawQuery.getString(2);
                    int i = cursorRawQuery.getInt(columnIndex);
                    this.f4948d.add(string);
                    if (string2 != null) {
                        string2 = string2.toUpperCase();
                    }
                    this.f4949e.add(string2);
                    this.f4950f.add(new StringBuilder().append(i).toString());
                } while (cursorRawQuery.moveToNext());
            }
            cursorRawQuery.close();
        }
        Cursor cursorRawQuery2 = sQLiteDatabaseOpenDatabase.rawQuery("SELECT COUNT(*) FROM " + this.f4947c, null);
        if (cursorRawQuery2.moveToFirst()) {
            this.f4955k = cursorRawQuery2.getInt(0);
        }
        cursorRawQuery2.close();
        this.f4951g = m3989a(sQLiteDatabaseOpenDatabase, this.f4954j, 30);
        sQLiteDatabaseOpenDatabase.close();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        this.f4952h = (TableLayout) findViewById(R.id.valueTable);
        this.f4953i = new ViewOnClickListenerC1629b(this, null, this.f4952h, this, this.f4958n != 0);
        this.f4953i.m4020a(this.f4948d);
        this.f4953i.m4021a(this.f4951g);
        this.f4953i.m4019a();
        this.f4953i.m4022b();
        this.f4956l = (Button) findViewById(R.id.button_prepage);
        this.f4957m = (Button) findViewById(R.id.button_nextpage);
        if (this.f4955k < 30) {
            this.f4957m.setVisibility(8);
        } else {
            this.f4956l.setOnClickListener(new ViewOnClickListenerC1638i(this));
            this.f4957m.setOnClickListener(new ViewOnClickListenerC1639j(this));
        }
    }
}
