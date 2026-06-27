package com.masrull.p105ch;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.gmail.heagoo.apkeditor.gzd;
import p000a.p001a.p003b.p004a.C0037k;

/* JADX INFO: loaded from: classes.dex */
public class MasrullSetting extends Activity {
    ImageView cover;
    RelativeLayout done;
    String imageUri;
    String imageUri1;
    ImageView imageView;
    private View kss;
    EditText name;
    TextView owner;
    TextView ownerquote;
    String profName;
    String profQuotes;
    RelativeLayout quote;
    EditText quotes;
    Uri uri;
    private View yeye;

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        switch (i) {
            case 0:
                if (i2 == -1) {
                    this.uri = Uri.parse(intent.getDataString());
                    this.imageView.setImageURI(this.uri);
                    SharedPreferences.Editor editorEdit = getSharedPreferences("EvoPrefsFile", 0).edit();
                    editorEdit.putString("profilePic", this.uri.toString());
                    editorEdit.commit();
                    Intent intent2 = new Intent();
                    intent2.setAction("com.masrull.ch.CHANGE_PROFILE_PICTURE");
                    intent2.putExtra("URI", this.uri.toString());
                    sendBroadcast(intent2);
                }
                break;
            case 1:
                if (i2 == -1) {
                    this.uri = Uri.parse(intent.getDataString());
                    this.cover.setImageURI(this.uri);
                    SharedPreferences.Editor editorEdit2 = getSharedPreferences("EvoPrefsFile", 0).edit();
                    editorEdit2.putString("profileCover", this.uri.toString());
                    editorEdit2.commit();
                    Intent intent3 = new Intent();
                    intent3.setAction("com.masrull.ch.CHANGE_PROFILE_COVER");
                    intent3.putExtra("URI", this.uri.toString());
                    sendBroadcast(intent3);
                }
                break;
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTheme(C0037k.mdNoActionBar(C0037k.m89a(this)));
        setContentView(setResource("setting_nama", "layout"));
        ImageView imageView = (ImageView) findViewById(setResource("M", gzd.COLUMN_ID));
        ImageView imageView2 = (ImageView) findViewById(setResource("M", gzd.COLUMN_ID));
        this.owner = (TextView) findViewById(setResource("Masrulltxt", gzd.COLUMN_ID));
        this.owner.setTypeface(Typeface.DEFAULT);
        this.ownerquote = (TextView) findViewById(setResource("Mstatus", gzd.COLUMN_ID));
        this.ownerquote.setTypeface(Typeface.DEFAULT);
        this.name = (EditText) findViewById(setResource("namakamu", gzd.COLUMN_ID));
        this.quotes = (EditText) findViewById(setResource("status_kamu", gzd.COLUMN_ID));
        this.kss = findViewById(setResource("masrullmain", gzd.COLUMN_ID));
        this.kss.setVisibility(0);
        this.yeye = findViewById(setResource("mm", gzd.COLUMN_ID));
        this.yeye.setVisibility(0);
        this.name.setEnabled(true);
        this.quotes.setEnabled(true);
        this.cover = (ImageView) findViewById(setResource("coverpic", gzd.COLUMN_ID));
        this.done = (RelativeLayout) findViewById(setResource("masrullmain", gzd.COLUMN_ID));
        this.quote = (RelativeLayout) findViewById(setResource("mm", gzd.COLUMN_ID));
        this.imageView = (ImageView) findViewById(setResource("image", gzd.COLUMN_ID));
        SharedPreferences sharedPreferences = getSharedPreferences("EvoPrefsFile", 0);
        this.profName = sharedPreferences.getString("profileName", (String) null);
        if (this.profName == null) {
            this.owner.setText(setResource("app_name", "string"));
        } else {
            this.owner.setText(this.profName);
            this.name.setText(this.profName);
        }
        this.profQuotes = sharedPreferences.getString("profileQuotes", (String) null);
        if (this.profQuotes == null) {
            this.ownerquote.setText(setResource("apk_credit", "string"));
        } else {
            this.ownerquote.setText(this.profQuotes);
            this.quotes.setText(this.profQuotes);
        }
        this.imageUri = sharedPreferences.getString("profilePic", (String) null);
        if (this.imageUri == null) {
            this.imageView.setImageResource(setResource("Mfoto", "drawable"));
        } else {
            this.imageView.setImageURI(Uri.parse(this.imageUri));
        }
        this.imageUri1 = sharedPreferences.getString("profileCover", (String) null);
        if (this.imageUri1 == null) {
            this.cover.setImageResource(setResource("background", "drawable"));
        } else {
            this.cover.setImageURI(Uri.parse(this.imageUri1));
        }
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: com.masrull.ch.MasrullSetting.100000000
            private final MasrullSetting this$0;

            {
                this.this$0 = this;
                block$11179();
            }

            private void block$11179() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setType("image/*");
                intent.setAction("android.intent.action.GET_CONTENT");
                this.this$0.startActivityForResult(Intent.createChooser(intent, "Select Picture"), 0);
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: com.masrull.ch.MasrullSetting.100000001
            private final MasrullSetting this$0;

            {
                this.this$0 = this;
                block$12102();
            }

            private void block$12102() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setType("image/*");
                intent.setAction("android.intent.action.GET_CONTENT");
                this.this$0.startActivityForResult(Intent.createChooser(intent, "Select Picture"), 1);
            }
        });
        this.done.setOnClickListener(new View.OnClickListener(this) { // from class: com.masrull.ch.MasrullSetting.100000002
            private final MasrullSetting this$0;

            {
                this.this$0 = this;
                block$13047();
            }

            private void block$13047() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Editable text = this.this$0.name.getText();
                this.this$0.owner.setText(text.toString());
                Intent intent = new Intent();
                intent.setAction("com.masrull.ch.CHANGE_PROFILE_NAME");
                intent.putExtra("NAME", text.toString());
                this.this$0.sendBroadcast(intent);
                SharedPreferences.Editor editorEdit = this.this$0.getSharedPreferences("EvoPrefsFile", 0).edit();
                editorEdit.putString("profileName", text.toString());
                editorEdit.commit();
            }
        });
        this.quote.setOnClickListener(new View.OnClickListener(this) { // from class: com.masrull.ch.MasrullSetting.100000003
            private final MasrullSetting this$0;

            {
                this.this$0 = this;
                block$14729();
            }

            private void block$14729() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Editable text = this.this$0.quotes.getText();
                this.this$0.ownerquote.setText(text.toString());
                Intent intent = new Intent();
                intent.setAction("com.masrull.ch.CHANGE_PROFILE_STATUS");
                intent.putExtra("QUOTES", text.toString());
                this.this$0.sendBroadcast(intent);
                SharedPreferences.Editor editorEdit = this.this$0.getSharedPreferences("EvoPrefsFile", 0).edit();
                editorEdit.putString("profileQuotes", text.toString());
                editorEdit.commit();
            }
        });
    }

    public int setResource(String str, String str2) {
        return getBaseContext().getResources().getIdentifier(str, str2, getBaseContext().getPackageName());
    }
}
