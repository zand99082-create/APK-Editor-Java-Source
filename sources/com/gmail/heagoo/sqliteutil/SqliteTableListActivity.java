package com.gmail.heagoo.sqliteutil;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.gmail.heagoo.apkeditor.pro.R;
import com.gmail.heagoo.p084a.p089c.C1068ax;
import java.io.File;
import java.util.ArrayList;
import p000a.p001a.p003b.p004a.C0037k;

/* JADX INFO: loaded from: classes.dex */
public class SqliteTableListActivity extends Activity implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    private String f4939a;

    /* JADX INFO: renamed from: b */
    private String f4940b;

    /* JADX INFO: renamed from: c */
    private ArrayList f4941c;

    /* JADX INFO: renamed from: d */
    private boolean f4942d;

    /* JADX INFO: renamed from: e */
    private int f4943e = 0;

    /* JADX INFO: renamed from: f */
    private int f4944f = -13421773;

    /* JADX INFO: renamed from: a */
    private void m3983a() {
        SQLiteDatabase sQLiteDatabaseOpenDatabase = SQLiteDatabase.openDatabase(this.f4940b, null, 1);
        this.f4941c = new ArrayList();
        Cursor cursorRawQuery = sQLiteDatabaseOpenDatabase.rawQuery("SELECT name FROM sqlite_master WHERE type='table'", null);
        if (cursorRawQuery.moveToFirst()) {
            while (!cursorRawQuery.isAfterLast()) {
                this.f4941c.add(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("name")));
                cursorRawQuery.moveToNext();
            }
        }
        sQLiteDatabaseOpenDatabase.close();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_close /* 2131558539 */:
                finish();
                break;
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        setTheme(C0037k.mdNoActionBar(C0037k.m89a(this)));
        super.onCreate(bundle);
        requestWindowFeature(1);
        setContentView(R.layout.sql_activity_tablelist);
        findViewById(R.id.btn_close).setOnClickListener(this);
        Intent intent = getIntent();
        this.f4939a = C1068ax.a_008(intent, "dbFilePath");
        if ("false".equalsIgnoreCase(C1068ax.a_008(intent, "isRootMode"))) {
            this.f4942d = false;
        } else {
            this.f4942d = true;
        }
        try {
            if (this.f4942d) {
                if (!(Environment.getExternalStorageState().equals("mounted"))) {
                    throw new Exception("Can not find SD Card!");
                }
                String path = Environment.getExternalStorageDirectory().getPath();
                if (!path.endsWith("/")) {
                    new StringBuilder().append(path).append("/");
                }
                this.f4940b = new File(getFilesDir(), "work.db").getPath();
                C1632c c1632c = new C1632c();
                File file = new File(getFilesDir(), "mycp");
                if (!c1632c.m4029b(String.format((file.exists() ? file.getPath() : "cp") + " \"%s\" %s", this.f4939a, this.f4940b), null, 5000)) {
                    this.f4940b = this.f4939a;
                }
            } else {
                this.f4940b = this.f4939a;
            }
            m3983a();
            TextView textView = (TextView) findViewById(R.id.title);
            StringBuilder sbAppend = new StringBuilder().append(getResources().getString(R.string.tables_of)).append(" ");
            String str = this.f4939a;
            textView.setText(sbAppend.append(str.substring(str.lastIndexOf(47) + 1)).toString());
            ListView listView = (ListView) findViewById(R.id.tableList);
            listView.setAdapter((ListAdapter) new C1636g(this, this, R.layout.item_sql_table, this.f4941c));
            listView.setOnItemClickListener(new C1637h(this));
        } catch (Exception e) {
            Toast.makeText(this, e.getLocalizedMessage(), 0).show();
            finish();
        }
    }
}
